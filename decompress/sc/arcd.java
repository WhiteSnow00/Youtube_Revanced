import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcd implements arcg
{
    private final Runnable a;
    private final Runnable b;
    private final Handler c;
    
    public arcd(final Runnable a, final Runnable b, final Handler c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a() {
        this.c.removeCallbacks(this.a);
        final Runnable b = this.b;
        if (b != null) {
            this.c.removeCallbacks(b);
        }
    }
    
    @Override
    public final void b() {
        final Runnable b = this.b;
        if (b != null) {
            this.c.post(b);
        }
    }
    
    @Override
    public final void c() {
        this.c.post(this.a);
    }
}
