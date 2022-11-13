// 
// Decompiled by Procyon v0.6.0
// 

final class augw extends auia
{
    private final augv b;
    
    public augw(final augv b, final aufv aufv) {
        super(aufp.i, aufv);
        this.b = b;
    }
    
    public final int a(final long n) {
        final augv b = this.b;
        final int z = b.Z(n);
        return b.O(n, z, b.U(n, z));
    }
    
    public final int c() {
        return 31;
    }
    
    public final int d() {
        return 1;
    }
    
    public final aufv s() {
        return this.b.f;
    }
    
    public final boolean t(final long n) {
        return this.b.ai(n);
    }
    
    public final int v(final long n) {
        return this.b.R(n);
    }
    
    protected final int w(final long n, final int n2) {
        final augv b = this.b;
        if (n2 <= 28 && n2 > 0) {
            return 28;
        }
        return b.R(n);
    }
}
