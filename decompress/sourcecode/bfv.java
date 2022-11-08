import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bfv implements bfc
{
    public azb a;
    private boolean b;
    private long c;
    private long d;
    
    public bfv() {
        this.a = azb.a;
    }
    
    public final void d(final long c) {
        this.c = c;
        if (this.b) {
            this.d = SystemClock.elapsedRealtime();
        }
    }
    
    public final void e() {
        if (!this.b) {
            this.d = SystemClock.elapsedRealtime();
            this.b = true;
        }
    }
    
    public final void f() {
        if (this.b) {
            this.d(this.kH());
            this.b = false;
        }
    }
    
    @Override
    public final long kH() {
        long c = this.c;
        if (this.b) {
            final long n = SystemClock.elapsedRealtime() - this.d;
            final azb a = this.a;
            long w;
            if (a.b == 1.0f) {
                w = baw.w(n);
            }
            else {
                w = n * a.d;
            }
            c += w;
        }
        return c;
    }
    
    @Override
    public final azb kI() {
        return this.a;
    }
    
    @Override
    public final void kJ(final azb a) {
        if (this.b) {
            this.d(this.kH());
        }
        this.a = a;
    }
}
