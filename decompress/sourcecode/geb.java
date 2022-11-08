import android.view.Choreographer;
import android.view.Choreographer$FrameCallback;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class geb
{
    public static final AtomicBoolean a;
    public static final Choreographer$FrameCallback b;
    static final ozg c;
    
    static {
        c = new ozg((char[])null);
        a = new AtomicBoolean();
        b = (Choreographer$FrameCallback)gea.a;
    }
    
    public static void a() {
        szc.f();
        if (geb.a.compareAndSet(true, false)) {
            Choreographer.getInstance().removeFrameCallback(geb.b);
        }
    }
}
