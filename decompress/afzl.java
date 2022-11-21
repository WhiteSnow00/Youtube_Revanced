import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class afzl extends agcb
{
    public afzl(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        final agdu agdu = (agdu)messageLite;
        final ahcr builder = ((ahcz)agdt.a).createBuilder();
        agdv c;
        if ((c = agdu.b) == null) {
            c = agdv.a;
        }
        builder.copyOnWrite();
        final agdt agdt = (agdt)builder.instance;
        c.getClass();
        agdt.c = c;
        final ahbt x = ahbt.x(agic.a(agdu.c));
        builder.copyOnWrite();
        ((agdt)builder.instance).d = x;
        builder.copyOnWrite();
        ((agdt)builder.instance).b = 0;
        return (MessageLite)builder.build();
    }
    
    public final /* bridge */ MessageLite b(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agdu.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        final agdu agdu = (agdu)messageLite;
        agii.a(agdu.c);
        agdv agdv;
        if ((agdv = agdu.b) == null) {
            agdv = agdv.a;
        }
        afzm.g(agdv);
    }
}
