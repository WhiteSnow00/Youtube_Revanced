import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agct extends agcc
{
    public agct() {
        super((Class)agdo.class, new agci[] { new agcr(afyw.class) });
    }
    
    public static void g(final agdq agdq) {
        final int b = agdq.b;
        if (b < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (b <= 16) {
            return;
        }
        throw new GeneralSecurityException("tag size too long");
    }
    
    public static void h(final int n) {
        if (n == 32) {
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }
    
    public final agcb a() {
        return new agcs(agdp.class);
    }
    
    public final agfb b() {
        return agfb.b;
    }
    
    public final /* bridge */ MessageLite c(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agdo.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        final agdo agdo = (agdo)messageLite;
        agii.d(agdo.b);
        h(agdo.c.d());
        agdq agdq;
        if ((agdq = agdo.d) == null) {
            agdq = agdq.a;
        }
        g(agdq);
    }
}
