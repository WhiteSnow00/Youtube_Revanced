import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aene implements cmz
{
    final Handler a;
    private final int b;
    
    public aene(final int b) {
        this.b = b;
        this.a = aeq.d(Looper.getMainLooper());
    }
    
    public aene(final Handler a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final Runnable runnable) {
        if (this.b != 0) {
            this.a.removeCallbacks(runnable);
            return;
        }
        this.a.removeCallbacks(runnable);
    }
    
    public final void b(final long n, final Runnable runnable) {
        if (this.b != 0) {
            this.a.postDelayed(runnable, n);
            return;
        }
        this.a.postDelayed(runnable, n);
    }
}
