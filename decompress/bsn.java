import android.os.Message;
import android.view.Choreographer;
import android.os.HandlerThread;
import android.os.Handler;
import android.os.Handler$Callback;
import android.view.Choreographer$FrameCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class bsn implements Choreographer$FrameCallback, Handler$Callback
{
    public static final bsn a;
    public volatile long b;
    public final Handler c;
    private final HandlerThread d;
    private Choreographer e;
    private int f;
    
    static {
        a = new bsn();
    }
    
    private bsn() {
        this.b = -9223372036854775807L;
        final HandlerThread d = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        (this.d = d).start();
        (this.c = baz.D(d.getLooper(), (Handler$Callback)this)).sendEmptyMessage(0);
    }
    
    public final void doFrame(final long b) {
        this.b = b;
        final Choreographer e = this.e;
        bad.b(e);
        e.postFrameCallbackDelayed((Choreographer$FrameCallback)this, 500L);
    }
    
    public final boolean handleMessage(final Message message) {
        final int what = message.what;
        if (what == 0) {
            try {
                this.e = Choreographer.getInstance();
            }
            catch (final RuntimeException ex) {
                baq.d("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", ex);
            }
            return true;
        }
        if (what == 1) {
            final Choreographer e = this.e;
            if (e != null && ++this.f == 1) {
                e.postFrameCallback((Choreographer$FrameCallback)this);
            }
            return true;
        }
        if (what != 2) {
            return false;
        }
        final Choreographer e2 = this.e;
        if (e2 != null && --this.f == 0) {
            e2.removeFrameCallback((Choreographer$FrameCallback)this);
            this.b = -9223372036854775807L;
        }
        return true;
    }
}
