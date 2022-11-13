// 
// Decompiled by Procyon v0.6.0
// 

public final class adsd implements adse
{
    public static final aguh a(final adqm adqm) {
        final ahaz builder = ((ahbh)aguh.a).createBuilder();
        final String a = adqm.a;
        builder.copyOnWrite();
        final aguh aguh = (aguh)builder.instance;
        a.getClass();
        aguh.b = a;
        final ahan ao = adyf.ao(adqm.b);
        builder.copyOnWrite();
        final aguh aguh2 = (aguh)builder.instance;
        ao.getClass();
        aguh2.c = ao;
        final int d = adqm.d;
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
            ((aguh)builder.instance).e = agpi.b(n2);
            final double c = adqm.c;
            builder.copyOnWrite();
            ((aguh)builder.instance).f = c;
            return (aguh)builder.build();
        }
        throw null;
    }
    
    public static final adqt b(final ocg ocg) {
        final adqs a = adqt.a();
        a.b(ocg.b);
        a.c(ocg.c);
        ocn ocn;
        if ((ocn = ocn.a(ocg.d)) == null) {
            ocn = ocn.i;
        }
        final int ordinal = ocn.ordinal();
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
