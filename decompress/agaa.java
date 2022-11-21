import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agaa extends agcb
{
    public agaa(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        final agfk c = (agfk)messageLite;
        final ahcr builder = ((ahcz)agfj.a).createBuilder();
        builder.copyOnWrite();
        final agfj agfj = (agfj)builder.instance;
        c.getClass();
        agfj.c = c;
        builder.copyOnWrite();
        ((agfj)builder.instance).b = 0;
        return (MessageLite)builder.build();
    }
    
    public final /* bridge */ MessageLite b(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agfk.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        final agfk agfk = (agfk)messageLite;
    }
}
