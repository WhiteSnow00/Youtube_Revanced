import java.security.GeneralSecurityException;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afzp extends agcc
{
    public afzp() {
        super((Class)agdw.class, new agci[] { new afzn(afyf.class) });
    }
    
    static /* bridge */ arjd g(final int c, final int n) {
        final ahcr builder = ((ahcz)agdx.a).createBuilder();
        builder.copyOnWrite();
        ((agdx)builder.instance).c = c;
        final ahcr builder2 = ((ahcz)agdy.a).createBuilder();
        builder2.copyOnWrite();
        ((agdy)builder2.instance).b = 16;
        final agdy b = (agdy)builder2.build();
        builder.copyOnWrite();
        final agdx agdx = (agdx)builder.instance;
        b.getClass();
        agdx.b = b;
        return new arjd(builder.build(), n);
    }
    
    public final agcb a() {
        return new afzo(agdx.class);
    }
    
    public final agfb b() {
        return agfb.b;
    }
    
    public final /* bridge */ MessageLite c(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agdw.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        final agdw agdw = (agdw)messageLite;
        agii.d(agdw.b);
        agii.a(agdw.d.d());
        agdy agdy;
        if ((agdy = agdw.c) == null) {
            agdy = agdy.a;
        }
        if (agdy.b != 12) {
            agdy agdy2;
            if ((agdy2 = agdw.c) == null) {
                agdy2 = agdy.a;
            }
            if (agdy2.b != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }
}
