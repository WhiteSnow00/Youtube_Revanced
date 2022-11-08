// 
// Decompiled by Procyon v0.6.0
// 

final class cys
{
    private static final eaa a;
    
    static {
        a = eaa.y("nm", "mm", "hd");
    }
    
    static cxd a(final czf czf) {
        int n = 0;
        boolean p = false;
        while (czf.o()) {
            final int r = czf.r(cys.a);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        czf.m();
                        czf.n();
                    }
                    else {
                        p = czf.p();
                    }
                }
                else {
                    final int b = czf.b();
                    if (b != 1) {
                        if (b == 2) {
                            n = 2;
                            continue;
                        }
                        if (b == 3) {
                            n = 3;
                            continue;
                        }
                        if (b == 4) {
                            n = 4;
                            continue;
                        }
                        if (b == 5) {
                            n = 5;
                            continue;
                        }
                    }
                    n = 1;
                }
            }
            else {
                czf.g();
            }
        }
        return new cxd(n, p);
    }
}
