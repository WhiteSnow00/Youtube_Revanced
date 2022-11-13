// 
// Decompiled by Procyon v0.6.0
// 

public final class bos
{
    public long a;
    public long b;
    public bos c;
    public argj d;
    
    public bos(final long n, final int n2) {
        this.c(n, n2);
    }
    
    public final int a(final long n) {
        final long a = this.a;
        final int a2 = this.d.a;
        return (int)(n - a);
    }
    
    public final bos b() {
        this.d = null;
        final bos c = this.c;
        this.c = null;
        return c;
    }
    
    public final void c(final long a, final int n) {
        dk.h(this.d == null);
        this.a = a;
        this.b = a + n;
    }
}
