// 
// Decompiled by Procyon v0.6.0
// 

public final class cyd
{
    private static final eab a;
    private static final eab b;
    
    static {
        a = eab.y("a");
        b = eab.y("fc", "sc", "sw", "t");
    }
    
    public static des a(final czg czg, final ctv ctv) {
        czg.i();
        des des = null;
        while (czg.o()) {
            if (czg.r(cyd.a) != 0) {
                czg.m();
                czg.n();
            }
            else {
                czg.i();
                cwn e = null;
                Object e2 = null;
                Object f2;
                Object f = f2 = e2;
                while (czg.o()) {
                    final int r = czg.r(cyd.b);
                    if (r != 0) {
                        if (r != 1) {
                            if (r != 2) {
                                if (r != 3) {
                                    czg.m();
                                    czg.n();
                                }
                                else {
                                    f2 = cix.f(czg, ctv);
                                }
                            }
                            else {
                                f = cix.f(czg, ctv);
                            }
                        }
                        else {
                            e2 = cix.e(czg, ctv);
                        }
                    }
                    else {
                        e = cix.e(czg, ctv);
                    }
                }
                czg.k();
                des = new des(e, (cwn)e2, (cwo)f, (cwo)f2);
            }
        }
        czg.k();
        if (des == null) {
            return new des((cwn)null, (cwn)null, (cwo)null, (cwo)null);
        }
        return des;
    }
}
