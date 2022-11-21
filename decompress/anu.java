// 
// Decompiled by Procyon v0.6.0
// 

public class anu
{
    private final aoc a;
    aic[] b;
    
    public anu() {
        this(new aoc());
    }
    
    public anu(final aoc a) {
        this.a = a;
    }
    
    public aoc a() {
        this.h();
        return this.a;
    }
    
    public void b(final aic aic) {
    }
    
    public void c(final aic aic) {
    }
    
    public void d(final aic aic) {
    }
    
    public void e(final aic aic) {
    }
    
    public void f(final aic aic) {
    }
    
    public void g(int i, final aic aic) {
        final aic[] b = this.b;
        final int n = i = 1;
        if (b == null) {
            this.b = new aic[9];
            i = n;
        }
        while (i <= 256) {
            if ((i & 0x7) != 0x0) {
                this.b[afq.f(i)] = aic;
            }
            i += i;
        }
    }
    
    protected final void h() {
        final aic[] b = this.b;
        if (b != null) {
            final aic aic = b[afq.f(1)];
            aic f;
            if ((f = this.b[afq.f(2)]) == null) {
                f = this.a.f(2);
            }
            aic f2;
            if ((f2 = aic) == null) {
                f2 = this.a.f(1);
            }
            this.c(aic.b(f2, f));
            final aic aic2 = this.b[afq.f(16)];
            if (aic2 != null) {
                this.e(aic2);
            }
            final aic aic3 = this.b[afq.f(32)];
            if (aic3 != null) {
                this.d(aic3);
            }
            final aic aic4 = this.b[afq.f(64)];
            if (aic4 != null) {
                this.f(aic4);
            }
        }
    }
}
