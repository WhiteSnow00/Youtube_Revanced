import java.util.List;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

final class afvm
{
    static {
        Charset.forName("UTF-8");
    }
    
    public static agbp a(final agbn agbn) {
        final agza builder = agbp.a.createBuilder();
        final int b = agbn.b;
        builder.copyOnWrite();
        ((agbp)builder.instance).b = b;
        for (final agbm agbm : agbn.c) {
            final agza builder2 = agbo.a.createBuilder();
            agbj agbj;
            if ((agbj = agbm.b) == null) {
                agbj = agbj.a;
            }
            final String b2 = agbj.b;
            builder2.copyOnWrite();
            final agbo agbo = (agbo)builder2.instance;
            b2.getClass();
            agbo.b = b2;
            int ab;
            if ((ab = aety.ab(agbm.c)) == 0) {
                ab = 1;
            }
            builder2.copyOnWrite();
            final agbo agbo2 = (agbo)builder2.instance;
            if (ab == 1) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            agbo2.c = ab - 2;
            agbu agbu;
            if ((agbu = agbu.a(agbm.e)) == null) {
                agbu = agbu.f;
            }
            builder2.copyOnWrite();
            ((agbo)builder2.instance).e = agbu.getNumber();
            final int d = agbm.d;
            builder2.copyOnWrite();
            ((agbo)builder2.instance).d = d;
            final agbo agbo3 = (agbo)builder2.build();
            builder.copyOnWrite();
            final agbp agbp = (agbp)builder.instance;
            agbo3.getClass();
            final agzy c = agbp.c;
            if (!c.c()) {
                agbp.c = agzi.mutableCopy(c);
            }
            agbp.c.add((Object)agbo3);
        }
        return (agbp)builder.build();
    }
    
    public static void b(final agbn agbn) {
        final int b = agbn.b;
        final Iterator<Object> iterator = ((List<Object>)agbn.c).iterator();
        int n = 0;
        int n2 = 0;
        boolean b2 = true;
        while (iterator.hasNext()) {
            final agbm agbm = iterator.next();
            final int ab = aety.ab(agbm.c);
            if (ab != 0 && ab == 3) {
                if (agbm.b == null) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", agbm.d));
                }
                agbu agbu;
                if ((agbu = agbu.a(agbm.e)) == null) {
                    agbu = agbu.f;
                }
                if (agbu == agbu.a) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", agbm.d));
                }
                final int ab2 = aety.ab(agbm.c);
                if (ab2 != 0) {
                    if (ab2 == 2) {
                        throw new GeneralSecurityException(String.format("key %d has unknown status", agbm.d));
                    }
                }
                int n3 = n2;
                if (agbm.d == b) {
                    if (n2 != 0) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    n3 = 1;
                }
                agbj agbj;
                if ((agbj = agbm.b) == null) {
                    agbj = agbj.a;
                }
                agbi agbi;
                if ((agbi = agbi.a(agbj.d)) == null) {
                    agbi = agbi.f;
                }
                b2 &= (agbi == agbi.d);
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
