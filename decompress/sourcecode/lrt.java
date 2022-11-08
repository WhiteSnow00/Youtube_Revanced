import android.os.Message;
import android.view.Choreographer;
import android.os.HandlerThread;
import android.os.Handler;
import android.os.Handler$Callback;
import android.view.Choreographer$FrameCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class lrt implements Choreographer$FrameCallback, Handler$Callback
{
    public static final lrt a;
    public volatile long b;
    public final Handler c;
    private final HandlerThread d;
    private Choreographer e;
    private int f;
    
    static {
        a = new lrt();
    }
    
    private lrt() {
        this.b = -9223372036854775807L;
        final HandlerThread d = new HandlerThread("ChoreographerOwner:Handler");
        (this.d = d).start();
        (this.c = new Handler(d.getLooper(), (Handler$Callback)this)).sendEmptyMessage(0);
    }
    
    public final void doFrame(final long b) {
        this.b = b;
        this.e.postFrameCallbackDelayed((Choreographer$FrameCallback)this, 500L);
    }
    
    public final boolean handleMessage(final Message message) {
        final int what = message.what;
        if (what == 0) {
            this.e = Choreographer.getInstance();
            return true;
        }
        if (what == 1) {
            if (++this.f == 1) {
                this.e.postFrameCallback((Choreographer$FrameCallback)this);
            }
            return true;
        }
        if (what != 2) {
            return false;
        }
        if (--this.f == 0) {
            this.e.removeFrameCallback((Choreographer$FrameCallback)this);
            this.b = -9223372036854775807L;
        }
        return true;
    }
}
