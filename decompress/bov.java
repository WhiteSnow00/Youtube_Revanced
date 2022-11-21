// 
// Decompiled by Procyon v0.6.0
// 

public final class bov
{
    public long a;
    public long b;
    public bov c;
    public arjd d;
    
    public bov(final long n, final int n2) {
        this.c(n, n2);
    }
    
    public final int a(final long n) {
        final long a = this.a;
        final int a2 = this.d.a;
        return (int)(n - a);
    }
    
    public final bov b() {
        this.d = null;
        final bov c = this.c;
        this.c = null;
        return c;
    }
    
    public final void c(final long a, final int n) {
        bad.f(this.d == null);
        this.a = a;
        this.b = a + n;
    }
}
