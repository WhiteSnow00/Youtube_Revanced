import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auen implements auer
{
    private final Choreographer a;
    
    public auen(final Choreographer a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Runnable runnable) {
        this.a.postFrameCallbackDelayed((Choreographer$FrameCallback)new dyo(runnable, 4, (byte[])null), 0L);
    }
}
