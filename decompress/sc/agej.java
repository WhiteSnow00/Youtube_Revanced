import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agej extends agar
{
    public agej() {
        super((Class)agcr.class, new agaq[] { new ageh(afxk.class) });
    }
    
    public static argj g(final int n, final int n2, final int n3, final int n4) {
        final ahaz builder = ((ahbh)agcq.a).createBuilder();
        builder.copyOnWrite();
        ((agcq)builder.instance).b = aeuz.D(n);
        builder.copyOnWrite();
        ((agcq)builder.instance).c = aeuz.F(n2);
        builder.copyOnWrite();
        ((agcq)builder.instance).d = n3 - 2;
        final agcq b = (agcq)builder.build();
        final ahaz builder2 = ((ahbh)agcp.a).createBuilder();
        builder2.copyOnWrite();
        final agcp agcp = (agcp)builder2.instance;
        b.getClass();
        agcp.b = b;
        return new argj((Object)builder2.build(), n4);
    }
    
    public final agaj a() {
        return new agei(agcp.class);
    }
    
    public final agdj b() {
        return agdj.c;
    }
    
    public final /* bridge */ MessageLite c(final ahab ahab) {
        return (MessageLite)ahbh.parseFrom((ahbh)agcr.a, ahab, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        final agcr agcr = (agcr)messageLite;
        aggq.d(agcr.b);
        agcs agcs;
        if ((agcs = agcr.c) == null) {
            agcs = agcs.a;
        }
        agcq agcq;
        if ((agcq = agcs.c) == null) {
            agcq = agcq.a;
        }
        aevy.W(agcq);
    }
    
    public final int f() {
        return 2;
    }
}
