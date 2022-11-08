// 
// Decompiled by Procyon v0.6.0
// 

public final class bty implements btz, bvv
{
    private final long a;
    private final btx b;
    
    public bty() {
        this(-9223372036854775807L);
    }
    
    public bty(final long n) {
        this(n, 0L);
    }
    
    public bty(final long a, final long n) {
        this.a = a;
        bua a2;
        if (n == 0L) {
            a2 = bua.a;
        }
        else {
            a2 = new bua(0L, n);
        }
        this.b = new btx(a2, a2);
    }
    
    @Override
    public final long a() {
        return this.a;
    }
    
    @Override
    public final btx b(final long n) {
        return this.b;
    }
    
    @Override
    public final boolean c() {
        return false;
    }
    
    public final long e() {
        return -1L;
    }
    
    public final long f(final long n) {
        return 0L;
    }
}
