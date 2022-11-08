// 
// Decompiled by Procyon v0.6.0
// 

public final class cyc
{
    private static final eaa a;
    private static final eaa b;
    
    static {
        a = eaa.y("a");
        b = eaa.y("fc", "sc", "sw", "t");
    }
    
    public static der a(final czf czf, final ctu ctu) {
        czf.i();
        der der = null;
        while (czf.o()) {
            if (czf.r(cyc.a) != 0) {
                czf.m();
                czf.n();
            }
            else {
                czf.i();
                Object e2;
                Object e = e2 = null;
                Object f2;
                Object f = f2 = e2;
                while (czf.o()) {
                    final int r = czf.r(cyc.b);
                    if (r != 0) {
                        if (r != 1) {
                            if (r != 2) {
                                if (r != 3) {
                                    czf.m();
                                    czf.n();
                                }
                                else {
                                    f2 = ciw.f(czf, ctu);
                                }
                            }
                            else {
                                f = ciw.f(czf, ctu);
                            }
                        }
                        else {
                            e2 = ciw.e(czf, ctu);
                        }
                    }
                    else {
                        e = ciw.e(czf, ctu);
                    }
                }
                czf.k();
                der = new der((cwm)e, (cwm)e2, (cwn)f, (cwn)f2);
            }
        }
        czf.k();
        if (der == null) {
            return new der((cwm)null, (cwm)null, (cwn)null, (cwn)null);
        }
        return der;
    }
}
