import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahfb
{
    public static final ahdy a;
    
    static {
        final ahaz builder = ((ahbh)ahdy.a).createBuilder();
        builder.copyOnWrite();
        ((ahdy)builder.instance).b = -62135596800L;
        builder.copyOnWrite();
        ((ahdy)builder.instance).c = 0;
        final ahdy ahdy = (ahdy)builder.build();
        final ahaz builder2 = ((ahbh)ahdy.a).createBuilder();
        builder2.copyOnWrite();
        ((ahdy)builder2.instance).b = 253402300799L;
        builder2.copyOnWrite();
        ((ahdy)builder2.instance).c = 999999999;
        final ahdy ahdy2 = (ahdy)builder2.build();
        final ahaz builder3 = ((ahbh)ahdy.a).createBuilder();
        builder3.copyOnWrite();
        ((ahdy)builder3.instance).b = 0L;
        builder3.copyOnWrite();
        ((ahdy)builder3.instance).c = 0;
        a = (ahdy)builder3.build();
        new ahez();
    }
    
    public static int a(final ahdy ahdy, final ahdy ahdy2) {
        return ahfa.a.a(ahdy, ahdy2);
    }
    
    public static long b(final ahdy ahdy) {
        g(ahdy);
        return aeuz.v(aeuz.w(ahdy.b, 1000L), (long)(ahdy.c / 1000000));
    }
    
    public static ahdy c(final long n) {
        return e(n / 1000L, (int)(n % 1000L * 1000000L));
    }
    
    public static ahdy d(final long n) {
        return e(n / 1000000000L, (int)(n % 1000000000L));
    }
    
    public static ahdy e(long x, int c) {
        long v = 0L;
        int n = 0;
        Label_0033: {
            if (c > -1000000000) {
                v = x;
                if ((n = c) < 1000000000) {
                    break Label_0033;
                }
            }
            v = aeuz.v(x, (long)(c / 1000000000));
            n = c % 1000000000;
        }
        x = v;
        if ((c = n) < 0) {
            c = n + 1000000000;
            x = aeuz.x(v, 1L);
        }
        final ahaz builder = ((ahbh)ahdy.a).createBuilder();
        builder.copyOnWrite();
        ((ahdy)builder.instance).b = x;
        builder.copyOnWrite();
        ((ahdy)builder.instance).c = c;
        final ahdy ahdy = (ahdy)builder.build();
        g(ahdy);
        return ahdy;
    }
    
    public static Comparator f() {
        return ahfa.a;
    }
    
    public static void g(final ahdy ahdy) {
        final long b = ahdy.b;
        final int c = ahdy.c;
        if (b >= -62135596800L && b <= 253402300799L && c >= 0 && c < 1000000000) {
            return;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", b, c));
    }
}
