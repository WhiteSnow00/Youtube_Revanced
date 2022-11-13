// 
// Decompiled by Procyon v0.6.0
// 

final class bui implements bua
{
    final buj a;
    private final long b;
    
    public bui(final buj a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public final long a() {
        return this.b;
    }
    
    public final bty b(final long n) {
        bty c = this.a.a[0].c(n);
        int n2 = 1;
        while (true) {
            final bum[] a = this.a.a;
            if (n2 >= a.length) {
                break;
            }
            final bty c2 = a[n2].c(n);
            bty bty = c;
            if (c2.a.c < c.a.c) {
                bty = c2;
            }
            ++n2;
            c = bty;
        }
        return c;
    }
    
    public final boolean c() {
        return true;
    }
}
