// 
// Decompiled by Procyon v0.6.0
// 

public final class ahda
{
    static {
        final agza builder = ((agzi)agyo.a).createBuilder();
        builder.copyOnWrite();
        ((agyo)builder.instance).b = -315576000000L;
        builder.copyOnWrite();
        ((agyo)builder.instance).c = -999999999;
        final agyo agyo = (agyo)builder.build();
        final agza builder2 = ((agzi)agyo.a).createBuilder();
        builder2.copyOnWrite();
        ((agyo)builder2.instance).b = 315576000000L;
        builder2.copyOnWrite();
        ((agyo)builder2.instance).c = 999999999;
        final agyo agyo2 = (agyo)builder2.build();
        final agza builder3 = ((agzi)agyo.a).createBuilder();
        builder3.copyOnWrite();
        ((agyo)builder3.instance).b = 0L;
        builder3.copyOnWrite();
        ((agyo)builder3.instance).c = 0;
        final agyo agyo3 = (agyo)builder3.build();
    }
    
    public static long a(final agyo agyo) {
        f(agyo);
        return aesy.Q(aesy.R(agyo.b, 1000L), (long)(agyo.c / 1000000));
    }
    
    public static agyo b(final long n) {
        return e(n / 1000L, (int)(n % 1000L * 1000000L));
    }
    
    public static agyo c(final long n) {
        return e(n / 1000000000L, (int)(n % 1000000000L));
    }
    
    public static agyo d(final long n) {
        return e(n, 0);
    }
    
    public static agyo e(long n, int n2) {
        long q = 0L;
        int n3 = 0;
        Label_0033: {
            if (n2 > -1000000000) {
                q = n;
                if ((n3 = n2) < 1000000000) {
                    break Label_0033;
                }
            }
            q = aesy.Q(n, (long)(n2 / 1000000000));
            n3 = n2 % 1000000000;
        }
        n = q;
        n2 = n3;
        if (q > 0L) {
            n = q;
            if ((n2 = n3) < 0) {
                n2 = n3 + 1000000000;
                n = q - 1L;
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
        final agza builder = ((agzi)agyo.a).createBuilder();
        builder.copyOnWrite();
        ((agyo)builder.instance).b = b;
        builder.copyOnWrite();
        ((agyo)builder.instance).c = c;
        final agyo agyo = (agyo)builder.build();
        f(agyo);
        return agyo;
    }
    
    public static void f(final agyo agyo) {
        final long b = agyo.b;
        final int c = agyo.c;
        if (b >= -315576000000L && b <= 315576000000L && c >= -999999999L && c < 1000000000 && ((b >= 0L && c >= 0) || (b <= 0L && c <= 0))) {
            return;
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", b, c));
    }
}
