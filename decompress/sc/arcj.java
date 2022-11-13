import android.os.Message;
import android.util.Log;
import android.view.Choreographer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Handler$Callback;
import android.view.Choreographer$FrameCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcj implements Choreographer$FrameCallback, Handler$Callback
{
    private static final String d = "arcj";
    public final HandlerThread a;
    public Handler b;
    public boolean c;
    private final Choreographer$FrameCallback e;
    private Choreographer f;
    
    public arcj(final Choreographer$FrameCallback e) {
        this.e = e;
        this.f = null;
        this.a = new HandlerThread("FrameMonitor");
    }
    
    public final void a() {
        if (!this.c) {
            return;
        }
        this.c = false;
        this.b.sendEmptyMessage(2);
    }
    
    public final void b() {
        this.a();
        this.a.quitSafely();
        try {
            this.a.join();
        }
        catch (final InterruptedException ex) {
            Log.e(arcj.d, "Interrupted when shutting down FrameMonitor: ".concat(ex.toString()));
        }
    }
    
    public final void doFrame(final long n) {
        this.e.doFrame(n);
        this.f.postFrameCallback((Choreographer$FrameCallback)this);
    }
    
    public final boolean handleMessage(final Message message) {
        final int what = message.what;
        if (what == 0) {
            if (this.f == null) {
                this.f = Choreographer.getInstance();
            }
            return true;
        }
        if (what == 1) {
            this.f.postFrameCallback((Choreographer$FrameCallback)this);
            return true;
        }
        if (what != 2) {
            return false;
        }
        this.f.removeFrameCallback((Choreographer$FrameCallback)this);
        return true;
    }
}
