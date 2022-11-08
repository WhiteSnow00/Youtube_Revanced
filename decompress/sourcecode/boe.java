// 
// Decompiled by Procyon v0.6.0
// 

final class boe implements bov
{
    public final bov a;
    private final long b;
    
    public boe(final bov a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a(final long n) {
        return this.a.a(n - this.b);
    }
    
    public final void b() {
        this.a.b();
    }
    
    public final int e(final bxb bxb, final bdb bdb, int e) {
        e = this.a.e(bxb, bdb, e);
        if (e == -4) {
            bdb.e = Math.max(0L, bdb.e + this.b);
            return -4;
        }
        return e;
    }
    
    public final boolean la() {
        return this.a.la();
    }
}
