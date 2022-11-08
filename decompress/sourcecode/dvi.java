import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dvi extends Handler implements dvj
{
    public dvi(final Looper looper) {
        super(looper);
    }
    
    public final void a(final Runnable runnable) {
        this.removeCallbacks(runnable);
    }
    
    public final void b() {
    }
    
    public final void c(final Runnable runnable) {
        this.post(runnable);
    }
}
