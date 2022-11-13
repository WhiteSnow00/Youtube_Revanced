// 
// Decompiled by Procyon v0.6.0
// 

public class auhz extends auia
{
    private final int b;
    private final aufv c;
    
    public auhz(final aufp aufp, final aufv aufv, final aufv c) {
        super(aufp, aufv);
        if (!c.g()) {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        if ((this.b = (int)(c.e() / super.a)) >= 2) {
            this.c = c;
            return;
        }
        throw new IllegalArgumentException("The effective range must be at least 2");
    }
    
    public final int a(final long n) {
        if (n >= 0L) {
            return (int)(n / super.a % this.b);
        }
        final int b = this.b;
        return b - 1 + (int)((n + 1L) / super.a % b);
    }
    
    public final int c() {
        return this.b - 1;
    }
    
    public final long h(final long n, final int n2) {
        atoc.k((aufn)this, n2, 0, this.c());
        return n + (n2 - this.a(n)) * this.a;
    }
    
    public final aufv s() {
        return this.c;
    }
}
