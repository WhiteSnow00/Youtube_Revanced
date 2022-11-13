import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.math.BigInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfb extends agar
{
    public agfb() {
        super((Class)aged.class, new agaq[] { new agez(afxk.class) });
    }
    
    public static ageb g(final int n, final int n2, final int d, final int c, final BigInteger bigInteger) {
        final ahaz builder = ((ahbh)agec.a).createBuilder();
        builder.copyOnWrite();
        ((agec)builder.instance).b = aeuz.D(n);
        builder.copyOnWrite();
        ((agec)builder.instance).c = aeuz.D(n2);
        builder.copyOnWrite();
        ((agec)builder.instance).d = d;
        final agec b = (agec)builder.build();
        final ahaz builder2 = ((ahbh)ageb.a).createBuilder();
        builder2.copyOnWrite();
        final ageb ageb = (ageb)builder2.instance;
        b.getClass();
        ageb.b = b;
        builder2.copyOnWrite();
        ((ageb)builder2.instance).c = c;
        final ahab x = ahab.x(bigInteger.toByteArray());
        builder2.copyOnWrite();
        ((ageb)builder2.instance).d = x;
        return (ageb)builder2.build();
    }
    
    public final agaj a() {
        return new agfa(ageb.class);
    }
    
    public final agdj b() {
        return agdj.c;
    }
    
    public final /* bridge */ MessageLite c(final ahab ahab) {
        return (MessageLite)ahbh.parseFrom((ahbh)aged.a, ahab, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        final aged aged = (aged)messageLite;
        aggq.d(aged.b);
        agee agee;
        if ((agee = aged.c) == null) {
            agee = agee.a;
        }
        aggq.b(new BigInteger(1, agee.d.I()).bitLength());
        agee agee2;
        if ((agee2 = aged.c) == null) {
            agee2 = agee.a;
        }
        aggq.c(new BigInteger(1, agee2.e.I()));
        agee agee3;
        if ((agee3 = aged.c) == null) {
            agee3 = agee.a;
        }
        agec agec;
        if ((agec = agee3.c) == null) {
            agec = agec.a;
        }
        aevy.Y(agec);
    }
}
