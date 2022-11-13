import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubq implements aubu
{
    private final Choreographer a;
    
    public aubq(final Choreographer a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Runnable runnable) {
        this.a.postFrameCallbackDelayed((Choreographer$FrameCallback)new dyl(runnable, 4, null), 0L);
    }
}
