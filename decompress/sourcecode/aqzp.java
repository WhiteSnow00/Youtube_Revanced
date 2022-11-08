import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzp implements aqzs
{
    private final Runnable a;
    private final Runnable b;
    private final Handler c;
    
    public aqzp(final Runnable a, final Runnable b, final Handler c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        this.c.removeCallbacks(this.a);
        final Runnable b = this.b;
        if (b != null) {
            this.c.removeCallbacks(b);
        }
    }
    
    public final void b() {
        final Runnable b = this.b;
        if (b != null) {
            this.c.post(b);
        }
    }
    
    public final void c() {
        this.c.post(this.a);
    }
}
