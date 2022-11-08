// 
// Decompiled by Procyon v0.6.0
// 

public final class afgh extends afcr
{
    static final afcr a;
    final transient Object[] b;
    public final transient int c;
    
    static {
        a = new afgh(new Object[0], 0);
    }
    
    public afgh(final Object[] b, final int c) {
        this.b = b;
        this.c = c;
    }
    
    public final int c(final Object[] array, final int n) {
        System.arraycopy(this.b, 0, array, n, this.c);
        return n + this.c;
    }
    
    public final int e() {
        return this.c;
    }
    
    public final int f() {
        return 0;
    }
    
    public final Object get(final int n) {
        agot.L(n, this.c);
        final Object o = this.b[n];
        o.getClass();
        return o;
    }
    
    public final boolean l() {
        return false;
    }
    
    public final Object[] m() {
        return this.b;
    }
    
    public final int size() {
        return this.c;
    }
}
