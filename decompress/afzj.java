import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afzj extends agcc
{
    public afzj() {
        super((Class)agdr.class, new agci[] { new afzh(afyf.class) });
    }
    
    static /* bridge */ arjd g(final int c, final int c2, final int n) {
        final ahcr builder = ((ahcz)agdu.a).createBuilder();
        final ahcr builder2 = ((ahcz)agdv.a).createBuilder();
        builder2.copyOnWrite();
        ((agdv)builder2.instance).b = 16;
        final agdv b = (agdv)builder2.build();
        builder.copyOnWrite();
        final agdu agdu = (agdu)builder.instance;
        b.getClass();
        agdu.b = b;
        builder.copyOnWrite();
        ((agdu)builder.instance).c = c;
        final agdu b2 = (agdu)builder.build();
        final ahcr builder3 = ((ahcz)agev.a).createBuilder();
        final ahcr builder4 = ((ahcz)agew.a).createBuilder();
        builder4.copyOnWrite();
        ((agew)builder4.instance).b = aexq.Y(5);
        builder4.copyOnWrite();
        ((agew)builder4.instance).c = c2;
        final agew b3 = (agew)builder4.build();
        builder3.copyOnWrite();
        final agev agev = (agev)builder3.instance;
        b3.getClass();
        agev.b = b3;
        builder3.copyOnWrite();
        ((agev)builder3.instance).c = 32;
        final agev c3 = (agev)builder3.build();
        final ahcr builder5 = ((ahcz)agds.a).createBuilder();
        builder5.copyOnWrite();
        final agds agds = (agds)builder5.instance;
        b2.getClass();
        agds.b = b2;
        builder5.copyOnWrite();
        final agds agds2 = (agds)builder5.instance;
        c3.getClass();
        agds2.c = c3;
        return new arjd(builder5.build(), n);
    }
    
    public final agcb a() {
        return new afzi(agds.class);
    }
    
    public final agfb b() {
        return agfb.b;
    }
    
    public final /* bridge */ MessageLite c(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agdr.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        final agdr agdr = (agdr)messageLite;
        agii.d(agdr.b);
        new afzm();
        agdt agdt;
        if ((agdt = agdr.c) == null) {
            agdt = agdt.a;
        }
        afzm.h(agdt);
        new agdb();
        ageu ageu;
        if ((ageu = agdr.d) == null) {
            ageu = ageu.a;
        }
        agdb.h(ageu);
    }
    
    public final int f() {
        return 2;
    }
}
