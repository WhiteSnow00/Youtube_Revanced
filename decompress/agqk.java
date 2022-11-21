// 
// Decompiled by Procyon v0.6.0
// 

public final class agqk
{
    static {
        new agqm(1.0, 1.0, 1.0);
        new agqm(0.0, 0.0, 0.0);
        aqwb.a("^#[0-9a-fA-F]{6}$", "^#[0-9a-fA-F]{6}$");
        aqwb.a("^rgb\\(([0-9]{1,3}),\\s*([0-9]{1,3}),\\s*([0-9]{1,3})\\)$", "^rgb\\(([0-9]{1,3}),\\s*([0-9]{1,3}),\\s*([0-9]{1,3})\\)$");
    }
    
    public static agqm a(final agql agql) {
        final double a = agql.a;
        final double b = agql.b;
        double c = agql.c;
        double n;
        double n3;
        if (b < 1.0E-10) {
            final double n2;
            n = (n2 = c);
            n3 = c;
            c = n2;
        }
        else {
            final double n4 = a / 60.0;
            final int n5 = (int)Math.floor(n4);
            n = (1.0 - b) * c;
            final double n6 = n5;
            Double.isNaN(n6);
            final double n7 = n4 - n6;
            n3 = (1.0 - b * n7) * c;
            final double n8 = (1.0 - b * (1.0 - n7)) * c;
            if (n5 != 1) {
                if (n5 != 2) {
                    if (n5 != 3) {
                        if (n5 != 4) {
                            if (n5 != 5) {
                                final double n9 = n;
                                n3 = c;
                                n = n8;
                                c = n9;
                            }
                            else {
                                final double n10 = n3;
                                n3 = c;
                                c = n10;
                            }
                        }
                        else {
                            n3 = n8;
                        }
                    }
                    else {
                        final double n11 = n;
                        n = n3;
                        n3 = n11;
                    }
                }
                else {
                    n3 = n;
                    n = c;
                    c = n8;
                }
            }
            else {
                final double n12 = c;
                c = n;
                n = n12;
            }
        }
        return new agqm(n3, n, c);
    }
    
    public static double b(final double n) {
        return Math.max(0.0, Math.min(1.0, n));
    }
}
