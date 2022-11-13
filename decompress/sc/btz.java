// 
// Decompiled by Procyon v0.6.0
// 

public final class btz implements bua, bvw
{
    private final long a;
    private final bty b;
    
    public btz() {
        this(-9223372036854775807L);
    }
    
    public btz(final long n) {
        this(n, 0L);
    }
    
    public btz(final long a, final long n) {
        this.a = a;
        bub a2;
        if (n == 0L) {
            a2 = bub.a;
        }
        else {
            a2 = new bub(0L, n);
        }
        this.b = new bty(a2, a2);
    }
    
    public final long a() {
        return this.a;
    }
    
    public final bty b(final long n) {
        return this.b;
    }
    
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
