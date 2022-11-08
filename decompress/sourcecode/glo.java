// 
// Decompiled by Procyon v0.6.0
// 

public final class glo extends gln
{
    public final boolean e;
    public final int f;
    public final boolean g;
    
    private glo(final boolean e, final int f, final boolean g, final int n, final int n2, final int n3, final int n4) {
        super(n, n2, n3, n4);
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static glo a(final cdz cdz, int t, int a, int a2, int b) {
        final boolean b2 = cdz != null && cdz.b > 0 && cdz.a != 0;
        int b3;
        if (b2) {
            b3 = cdz.b;
        }
        else {
            b3 = 0;
        }
        final boolean b4 = b2 && b3 >= t;
        if (b2) {
            a = cdz.a;
        }
        t = gow.t(a);
        if (b2) {
            b = cdz.b();
        }
        if (b2) {
            a2 = cdz.a();
        }
        return new glo(b2, b3, b4, t, a, b, a2);
    }
}
