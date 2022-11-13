// 
// Decompiled by Procyon v0.6.0
// 

public final class cyh implements czd
{
    public static final cyh a;
    private static final eab b;
    
    static {
        a = new cyh();
        b = eab.y("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");
    }
    
    private cyh() {
    }
    
    @Override
    public final /* bridge */ Object a(final czg czg, float n) {
        czg.i();
        String g = null;
        String g2 = null;
        float n2 = 0.0f;
        int n3 = 3;
        int b = 0;
        float n4 = 0.0f;
        float n5 = 0.0f;
        int b2 = 0;
        int b3 = 0;
        n = 0.0f;
        boolean p2 = true;
        while (czg.o()) {
            switch (czg.r(cyh.b)) {
                default: {
                    czg.m();
                    czg.n();
                    continue;
                }
                case 10: {
                    p2 = czg.p();
                    continue;
                }
                case 9: {
                    n = (float)czg.a();
                    continue;
                }
                case 8: {
                    b3 = cyo.b(czg);
                    continue;
                }
                case 7: {
                    b2 = cyo.b(czg);
                    continue;
                }
                case 6: {
                    n5 = (float)czg.a();
                    continue;
                }
                case 5: {
                    n4 = (float)czg.a();
                    continue;
                }
                case 4: {
                    b = czg.b();
                    continue;
                }
                case 3: {
                    final int b4 = czg.b();
                    if (b4 <= 2 && b4 >= 0) {
                        n3 = (new int[] { 1, 2, 3 })[b4];
                        continue;
                    }
                    n3 = 3;
                    continue;
                }
                case 2: {
                    n2 = (float)czg.a();
                    continue;
                }
                case 1: {
                    g2 = czg.g();
                    continue;
                }
                case 0: {
                    g = czg.g();
                    continue;
                }
            }
        }
        czg.k();
        return new cwh(g, g2, n2, n3, b, n4, n5, b2, b3, n, p2);
    }
}
