// 
// Decompiled by Procyon v0.6.0
// 

public final class glw extends glv
{
    public final boolean e;
    public final int f;
    public final boolean g;
    
    private glw(final boolean e, final int f, final boolean g, final int n, final int n2, final int n3, final int n4) {
        super(n, n2, n3, n4);
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static glw a(final cea cea, int d, int a, int a2, int b) {
        final boolean b2 = cea != null && cea.b > 0 && cea.a != 0;
        int b3;
        if (b2) {
            b3 = cea.b;
        }
        else {
            b3 = 0;
        }
        final boolean b4 = b2 && b3 >= d;
        if (b2) {
            a = cea.a;
        }
        d = fbu.D(a);
        if (b2) {
            b = cea.b();
        }
        if (b2) {
            a2 = cea.a();
        }
        return new glw(b2, b3, b4, d, a, b, a2);
    }
}
