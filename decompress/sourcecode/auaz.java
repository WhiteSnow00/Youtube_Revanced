import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auaz implements aubd
{
    private final Choreographer a;
    
    public auaz(final Choreographer a) {
        this.a = a;
    }
    
    public final void a(final Runnable runnable) {
        this.a.postFrameCallbackDelayed((Choreographer$FrameCallback)new dyk(runnable, 4, null), 0L);
    }
}
