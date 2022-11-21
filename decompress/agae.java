import java.security.GeneralSecurityException;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agae extends agcb
{
    public agae(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        final agfm c = (agfm)messageLite;
        final ahcr builder = ((ahcz)agfl.a).createBuilder();
        builder.copyOnWrite();
        final agfl agfl = (agfl)builder.instance;
        c.getClass();
        agfl.c = c;
        builder.copyOnWrite();
        ((agfl)builder.instance).b = 0;
        return (MessageLite)builder.build();
    }
    
    public final /* bridge */ MessageLite b(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agfm.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        final agfm agfm = (agfm)messageLite;
        if (!agfm.b.isEmpty() && agfm.c != null) {
            return;
        }
        throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
    }
}
