import java.util.List;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

final class afze
{
    static {
        Charset.forName("UTF-8");
    }
    
    public static agfi a(final agfg agfg) {
        final ahcr builder = ((ahcz)agfi.a).createBuilder();
        final int b = agfg.b;
        builder.copyOnWrite();
        ((agfi)builder.instance).b = b;
        for (final agff agff : agfg.c) {
            final ahcr builder2 = ((ahcz)agfh.a).createBuilder();
            agfc agfc;
            if ((agfc = agff.b) == null) {
                agfc = agfc.a;
            }
            final String b2 = agfc.b;
            builder2.copyOnWrite();
            final agfh agfh = (agfh)builder2.instance;
            b2.getClass();
            agfh.b = b2;
            int t;
            if ((t = aexq.T(agff.c)) == 0) {
                t = 1;
            }
            builder2.copyOnWrite();
            final agfh agfh2 = (agfh)builder2.instance;
            if (t == 1) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            agfh2.c = t - 2;
            agfn agfn;
            if ((agfn = agfn.a(agff.e)) == null) {
                agfn = agfn.f;
            }
            builder2.copyOnWrite();
            ((agfh)builder2.instance).e = agfn.getNumber();
            final int d = agff.d;
            builder2.copyOnWrite();
            ((agfh)builder2.instance).d = d;
            final agfh agfh3 = (agfh)builder2.build();
            builder.copyOnWrite();
            final agfi agfi = (agfi)builder.instance;
            agfh3.getClass();
            final ahdp c = agfi.c;
            if (!c.c()) {
                agfi.c = ahcz.mutableCopy(c);
            }
            agfi.c.add((Object)agfh3);
        }
        return (agfi)builder.build();
    }
    
    public static void b(final agfg agfg) {
        final int b = agfg.b;
        final Iterator<Object> iterator = ((List<Object>)agfg.c).iterator();
        int n = 0;
        int n2 = 0;
        boolean b2 = true;
        while (iterator.hasNext()) {
            final agff agff = iterator.next();
            final int t = aexq.T(agff.c);
            if (t != 0 && t == 3) {
                if (agff.b == null) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", agff.d));
                }
                agfn agfn;
                if ((agfn = agfn.a(agff.e)) == null) {
                    agfn = agfn.f;
                }
                if (agfn == agfn.a) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", agff.d));
                }
                final int t2 = aexq.T(agff.c);
                if (t2 != 0) {
                    if (t2 == 2) {
                        throw new GeneralSecurityException(String.format("key %d has unknown status", agff.d));
                    }
                }
                int n3 = n2;
                if (agff.d == b) {
                    if (n2 != 0) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    n3 = 1;
                }
                agfc agfc;
                if ((agfc = agff.b) == null) {
                    agfc = agfc.a;
                }
                agfb agfb;
                if ((agfb = agfb.a(agfc.d)) == null) {
                    agfb = agfb.f;
                }
                b2 &= (agfb == agfb.d);
                ++n;
                n2 = n3;
            }
        }
        if (n == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (n2 == 0 && !b2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
