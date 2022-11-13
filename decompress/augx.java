// 
// Decompiled by Procyon v0.6.0
// 

final class augx extends auia
{
    private final augv b;
    
    public augx(final augv b, final aufv aufv) {
        super(aufp.g, aufv);
        this.b = b;
    }
    
    public final int a(final long n) {
        final augv b = this.b;
        return b.Q(n, b.Z(n));
    }
    
    public final int c() {
        return 366;
    }
    
    public final int d() {
        return 1;
    }
    
    public final aufv s() {
        return this.b.g;
    }
    
    public final boolean t(final long n) {
        return this.b.ai(n);
    }
    
    public final int v(final long n) {
        if (this.b.aj(this.b.Z(n))) {
            return 366;
        }
        return 365;
    }
    
    protected final int w(final long n, final int n2) {
        if (n2 <= 365 && n2 > 0) {
            return 365;
        }
        return ((auhq)this).v(n);
    }
}
