import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agdb extends agcc
{
    public agdb() {
        super((Class)ageu.class, new agci[] { new agcz(afyw.class) });
    }
    
    public static void g(final agew agew) {
        final int c = agew.c;
        if (c >= 10) {
            int z;
            if ((z = aexq.Z(agew.b)) == 0) {
                z = 1;
            }
            z -= 2;
            if (z != 1) {
                if (z != 2) {
                    if (z != 3) {
                        if (z != 4) {
                            if (z != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            }
                            if (c > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        }
                        else if (c > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    }
                    else if (c > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                }
                else if (c > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            }
            else if (c > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        throw new GeneralSecurityException("tag size too small");
    }
    
    public static final void h(final ageu ageu) {
        agii.d(ageu.b);
        if (ageu.d.d() >= 16) {
            agew agew;
            if ((agew = ageu.c) == null) {
                agew = agew.a;
            }
            g(agew);
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
    
    public static arjd k(final int c, final int c2, final int n, final int n2) {
        final ahcr builder = ((ahcz)agev.a).createBuilder();
        final ahcr builder2 = ((ahcz)agew.a).createBuilder();
        builder2.copyOnWrite();
        ((agew)builder2.instance).b = aexq.Y(n);
        builder2.copyOnWrite();
        ((agew)builder2.instance).c = c2;
        final agew b = (agew)builder2.build();
        builder.copyOnWrite();
        final agev agev = (agev)builder.instance;
        b.getClass();
        agev.b = b;
        builder.copyOnWrite();
        ((agev)builder.instance).c = c;
        return new arjd(builder.build(), n2);
    }
    
    public final agcb a() {
        return new agda(agev.class);
    }
    
    public final agfb b() {
        return agfb.b;
    }
    
    public final /* bridge */ MessageLite c(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)ageu.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        h((ageu)messageLite);
    }
    
    public final int f() {
        return 2;
    }
}
