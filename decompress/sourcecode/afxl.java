import java.security.GeneralSecurityException;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afxl extends afyq
{
    public static final byte[] a;
    
    static {
        a = new byte[0];
    }
    
    public afxl() {
        super((Class)agav.class, new afyp[] { new afxj(afuq.class) });
    }
    
    public static ardu g(final int n, final agli agli, final byte[] array, final int n2) {
        final agza builder = agat.a.createBuilder();
        final agza builder2 = agax.a.createBuilder();
        builder2.copyOnWrite();
        final agax agax = (agax)builder2.instance;
        int n3 = 4;
        agax.b = aesy.aa(4);
        builder2.copyOnWrite();
        ((agax)builder2.instance).c = aesy.Y(5);
        final agyc x = agyc.x(array);
        builder2.copyOnWrite();
        ((agax)builder2.instance).d = x;
        final agax b = (agax)builder2.build();
        final agza builder3 = agbk.a.createBuilder();
        final String b2 = ((agbk)agli.a).b;
        builder3.copyOnWrite();
        final agbk agbk = (agbk)builder3.instance;
        b2.getClass();
        agbk.b = b2;
        final agyc x2 = agyc.x(((agbk)agli.a).c.I());
        builder3.copyOnWrite();
        ((agbk)builder3.instance).c = x2;
        agbu agbu;
        if ((agbu = agbu.a(((agbk)agli.a).d)) == null) {
            agbu = agbu.f;
        }
        final int ordinal = agbu.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new IllegalArgumentException("Unknown output prefix type");
                    }
                }
                else {
                    n3 = 3;
                }
            }
            else {
                n3 = 2;
            }
        }
        else {
            n3 = 1;
        }
        agbu agbu2;
        if (--n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    agbu2 = agbu.e;
                }
                else {
                    agbu2 = agbu.d;
                }
            }
            else {
                agbu2 = agbu.c;
            }
        }
        else {
            agbu2 = agbu.b;
        }
        builder3.copyOnWrite();
        ((agbk)builder3.instance).d = agbu2.getNumber();
        final agbk b3 = (agbk)builder3.build();
        final agza builder4 = agas.a.createBuilder();
        builder4.copyOnWrite();
        final agas agas = (agas)builder4.instance;
        b3.getClass();
        agas.b = b3;
        final agas c = (agas)builder4.build();
        final agza builder5 = agau.a.createBuilder();
        builder5.copyOnWrite();
        final agau agau = (agau)builder5.instance;
        b.getClass();
        agau.b = b;
        builder5.copyOnWrite();
        final agau agau2 = (agau)builder5.instance;
        c.getClass();
        agau2.c = c;
        builder5.copyOnWrite();
        ((agau)builder5.instance).d = aesy.ad(n);
        final agau b4 = (agau)builder5.build();
        builder.copyOnWrite();
        final agat agat = (agat)builder.instance;
        b4.getClass();
        agat.b = b4;
        return new ardu((Object)builder.build(), n2);
    }
    
    public final afyi a() {
        return new afxk(agat.class);
    }
    
    public final agbi b() {
        return agbi.c;
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }
}
