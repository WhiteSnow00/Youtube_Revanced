// 
// Decompiled by Procyon v0.6.0
// 

final class bul implements bud
{
    final bum a;
    private final long b;
    
    public bul(final bum a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public final long a() {
        return this.b;
    }
    
    public final bub b(final long n) {
        bub c = this.a.a[0].c(n);
        int n2 = 1;
        while (true) {
            final bup[] a = this.a.a;
            if (n2 >= a.length) {
                break;
            }
            final bub c2 = a[n2].c(n);
            bub bub = c;
            if (c2.a.c < c.a.c) {
                bub = c2;
            }
            ++n2;
            c = bub;
        }
        return c;
    }
    
    public final boolean c() {
        return true;
    }
}
