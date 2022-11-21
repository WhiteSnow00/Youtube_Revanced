import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afzm extends agcc
{
    public afzm() {
        super((Class)agdt.class, new agci[] { new afzk(aghw.class) });
    }
    
    public static final void g(final agdv agdv) {
        final int b = agdv.b;
        if (b >= 12 && b <= 16) {
            return;
        }
        throw new GeneralSecurityException("invalid IV size");
    }
    
    public static final void h(final agdt agdt) {
        agii.d(agdt.b);
        agii.a(agdt.d.d());
        agdv agdv;
        if ((agdv = agdt.c) == null) {
            agdv = agdv.a;
        }
        g(agdv);
    }
    
    public final agcb a() {
        return new afzl(agdu.class);
    }
    
    public final agfb b() {
        return agfb.b;
    }
    
    public final /* bridge */ MessageLite c(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agdt.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        h((agdt)messageLite);
    }
}
