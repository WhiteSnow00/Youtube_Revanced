// 
// Decompiled by Procyon v0.6.0
// 

public final class adtu implements adtv
{
    public static final agvz a(final adsd adsd) {
        final ahcr builder = ((ahcz)agvz.a).createBuilder();
        final String a = adsd.a;
        builder.copyOnWrite();
        final agvz agvz = (agvz)builder.instance;
        a.getClass();
        agvz.b = a;
        final ahcf as = adzw.as(adsd.b);
        builder.copyOnWrite();
        final agvz agvz2 = (agvz)builder.instance;
        as.getClass();
        agvz2.c = as;
        final int d = adsd.d;
        final int n = d - 1;
        if (d != 0) {
            int n2 = 3;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            throw new AssertionError();
                        }
                        n2 = 6;
                    }
                    else {
                        n2 = 5;
                    }
                }
                else {
                    n2 = 4;
                }
            }
            builder.copyOnWrite();
            ((agvz)builder.instance).e = agsk.b(n2);
            final double c = adsd.c;
            builder.copyOnWrite();
            ((agvz)builder.instance).f = c;
            return (agvz)builder.build();
        }
        throw null;
    }
    
    public static final adsk b(final ocw ocw) {
        final adsj a = adsk.a();
        a.b(ocw.b);
        a.c(ocw.c);
        odd odd;
        if ((odd = odd.a(ocw.d)) == null) {
            odd = odd.i;
        }
        final int ordinal = odd.ordinal();
        int a2 = 1;
        while (true) {
            switch (ordinal) {
                default: {
                    throw new AssertionError();
                }
                case 0:
                case 1:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8: {
                    a.a = a2;
                    return a.a();
                }
                case 3: {
                    a2 = 3;
                    continue;
                }
                case 2: {
                    a2 = 2;
                    continue;
                }
            }
            break;
        }
    }
}
