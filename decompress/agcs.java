import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agcs extends agcb
{
    public agcs(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        final agdp agdp = (agdp)messageLite;
        final ahcr builder = ((ahcz)agdo.a).createBuilder();
        builder.copyOnWrite();
        ((agdo)builder.instance).b = 0;
        final ahbt x = ahbt.x(agic.a(agdp.b));
        builder.copyOnWrite();
        ((agdo)builder.instance).c = x;
        agdq d;
        if ((d = agdp.c) == null) {
            d = agdq.a;
        }
        builder.copyOnWrite();
        final agdo agdo = (agdo)builder.instance;
        d.getClass();
        agdo.d = d;
        return (MessageLite)builder.build();
    }
    
    public final /* bridge */ MessageLite b(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agdp.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        final ahcr builder = ((ahcz)agdp.a).createBuilder();
        builder.copyOnWrite();
        agdp.a((agdp)builder.instance);
        final ahcr builder2 = ((ahcz)agdq.a).createBuilder();
        builder2.copyOnWrite();
        agdq.a((agdq)builder2.instance);
        final agdq c = (agdq)builder2.build();
        builder.copyOnWrite();
        final agdp agdp = (agdp)builder.instance;
        c.getClass();
        agdp.c = c;
        hashMap.put("AES_CMAC", new arjd(builder.build(), 1));
        final ahcr builder3 = ((ahcz)agdp.a).createBuilder();
        builder3.copyOnWrite();
        agdp.a((agdp)builder3.instance);
        final ahcr builder4 = ((ahcz)agdq.a).createBuilder();
        builder4.copyOnWrite();
        agdq.a((agdq)builder4.instance);
        final agdq c2 = (agdq)builder4.build();
        builder3.copyOnWrite();
        final agdp agdp2 = (agdp)builder3.instance;
        c2.getClass();
        agdp2.c = c2;
        hashMap.put("AES256_CMAC", new arjd(builder3.build(), 1));
        final ahcr builder5 = ((ahcz)agdp.a).createBuilder();
        builder5.copyOnWrite();
        agdp.a((agdp)builder5.instance);
        final ahcr builder6 = ((ahcz)agdq.a).createBuilder();
        builder6.copyOnWrite();
        agdq.a((agdq)builder6.instance);
        final agdq c3 = (agdq)builder6.build();
        builder5.copyOnWrite();
        final agdp agdp3 = (agdp)builder5.instance;
        c3.getClass();
        agdp3.c = c3;
        hashMap.put("AES256_CMAC_RAW", new arjd(builder5.build(), 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        final agdp agdp = (agdp)messageLite;
        agdq agdq;
        if ((agdq = agdp.c) == null) {
            agdq = agdq.a;
        }
        agct.g(agdq);
        agct.h(agdp.b);
    }
}
