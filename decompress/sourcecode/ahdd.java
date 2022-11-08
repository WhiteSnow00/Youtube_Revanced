import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahdd
{
    public static final ahca a;
    
    static {
        final agza builder = ((agzi)ahca.a).createBuilder();
        builder.copyOnWrite();
        ((ahca)builder.instance).b = -62135596800L;
        builder.copyOnWrite();
        ((ahca)builder.instance).c = 0;
        final ahca ahca = (ahca)builder.build();
        final agza builder2 = ((agzi)ahca.a).createBuilder();
        builder2.copyOnWrite();
        ((ahca)builder2.instance).b = 253402300799L;
        builder2.copyOnWrite();
        ((ahca)builder2.instance).c = 999999999;
        final ahca ahca2 = (ahca)builder2.build();
        final agza builder3 = ((agzi)ahca.a).createBuilder();
        builder3.copyOnWrite();
        ((ahca)builder3.instance).b = 0L;
        builder3.copyOnWrite();
        ((ahca)builder3.instance).c = 0;
        a = (ahca)builder3.build();
        new ahdb();
    }
    
    public static int a(final ahca ahca, final ahca ahca2) {
        return ahdc.a.a(ahca, ahca2);
    }
    
    public static long b(final ahca ahca) {
        g(ahca);
        return aesy.Q(aesy.R(ahca.b, 1000L), (long)(ahca.c / 1000000));
    }
    
    public static ahca c(final long n) {
        return e(n / 1000L, (int)(n % 1000L * 1000000L));
    }
    
    public static ahca d(final long n) {
        return e(n / 1000000000L, (int)(n % 1000000000L));
    }
    
    public static ahca e(long s, int c) {
        long q = 0L;
        int n = 0;
        Label_0033: {
            if (c > -1000000000) {
                q = s;
                if ((n = c) < 1000000000) {
                    break Label_0033;
                }
            }
            q = aesy.Q(s, (long)(c / 1000000000));
            n = c % 1000000000;
        }
        s = q;
        if ((c = n) < 0) {
            c = n + 1000000000;
            s = aesy.S(q, 1L);
        }
        final agza builder = ((agzi)ahca.a).createBuilder();
        builder.copyOnWrite();
        ((ahca)builder.instance).b = s;
        builder.copyOnWrite();
        ((ahca)builder.instance).c = c;
        final ahca ahca = (ahca)builder.build();
        g(ahca);
        return ahca;
    }
    
    public static Comparator f() {
        return ahdc.a;
    }
    
    public static void g(final ahca ahca) {
        final long b = ahca.b;
        final int c = ahca.c;
        if (b >= -62135596800L && b <= 253402300799L && c >= 0 && c < 1000000000) {
            return;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", b, c));
    }
}
