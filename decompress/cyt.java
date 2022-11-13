// 
// Decompiled by Procyon v0.6.0
// 

final class cyt
{
    private static final eab a;
    
    static {
        a = eab.y("nm", "mm", "hd");
    }
    
    static cxe a(final czg czg) {
        int n = 0;
        boolean p = false;
        while (czg.o()) {
            final int r = czg.r(cyt.a);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        czg.m();
                        czg.n();
                    }
                    else {
                        p = czg.p();
                    }
                }
                else {
                    final int b = czg.b();
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
                czg.g();
            }
        }
        return new cxe(n, p);
    }
}
