// 
// Decompiled by Procyon v0.6.0
// 

public final class ahey
{
    static {
        final ahaz builder = ((ahbh)ahan.a).createBuilder();
        builder.copyOnWrite();
        ((ahan)builder.instance).b = -315576000000L;
        builder.copyOnWrite();
        ((ahan)builder.instance).c = -999999999;
        final ahan ahan = (ahan)builder.build();
        final ahaz builder2 = ((ahbh)ahan.a).createBuilder();
        builder2.copyOnWrite();
        ((ahan)builder2.instance).b = 315576000000L;
        builder2.copyOnWrite();
        ((ahan)builder2.instance).c = 999999999;
        final ahan ahan2 = (ahan)builder2.build();
        final ahaz builder3 = ((ahbh)ahan.a).createBuilder();
        builder3.copyOnWrite();
        ((ahan)builder3.instance).b = 0L;
        builder3.copyOnWrite();
        ((ahan)builder3.instance).c = 0;
        final ahan ahan3 = (ahan)builder3.build();
    }
    
    public static long a(final ahan ahan) {
        f(ahan);
        return aeuz.v(aeuz.w(ahan.b, 1000L), (long)(ahan.c / 1000000));
    }
    
    public static ahan b(final long n) {
        return e(n / 1000L, (int)(n % 1000L * 1000000L));
    }
    
    public static ahan c(final long n) {
        return e(n / 1000000000L, (int)(n % 1000000000L));
    }
    
    public static ahan d(final long n) {
        return e(n, 0);
    }
    
    public static ahan e(long n, int n2) {
        long v = 0L;
        int n3 = 0;
        Label_0033: {
            if (n2 > -1000000000) {
                v = n;
                if ((n3 = n2) < 1000000000) {
                    break Label_0033;
                }
            }
            v = aeuz.v(n, (long)(n2 / 1000000000));
            n3 = n2 % 1000000000;
        }
        n = v;
        n2 = n3;
        if (v > 0L) {
            n = v;
            if ((n2 = n3) < 0) {
                n2 = n3 + 1000000000;
                n = v - 1L;
            }
        }
        long b = n;
        int c = n2;
        if (n < 0L) {
            b = n;
            if ((c = n2) > 0) {
                c = n2 - 1000000000;
                b = n + 1L;
            }
        }
        final ahaz builder = ((ahbh)ahan.a).createBuilder();
        builder.copyOnWrite();
        ((ahan)builder.instance).b = b;
        builder.copyOnWrite();
        ((ahan)builder.instance).c = c;
        final ahan ahan = (ahan)builder.build();
        f(ahan);
        return ahan;
    }
    
    public static void f(final ahan ahan) {
        final long b = ahan.b;
        final int c = ahan.c;
        if (b >= -315576000000L && b <= 315576000000L && c >= -999999999L && c < 1000000000 && ((b >= 0L && c >= 0) || (b <= 0L && c <= 0))) {
            return;
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", b, c));
    }
}
