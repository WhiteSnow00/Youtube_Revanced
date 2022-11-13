import android.graphics.Typeface;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ahs
{
    public static Handler e() {
        return new Handler(Looper.getMainLooper());
    }
    
    public abstract void a(final Typeface p0);
    
    public abstract void b();
    
    public final void c(final int n) {
        e().post((Runnable)new uy(this, 10));
    }
    
    public final void d(final Typeface typeface) {
        e().post((Runnable)new vs(this, typeface, 11));
    }
}
