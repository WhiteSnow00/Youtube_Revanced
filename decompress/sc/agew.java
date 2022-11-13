import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.math.BigInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agew extends agar
{
    public agew() {
        super((Class)agdz.class, new agaq[] { new ageu(afxk.class) });
    }
    
    public static agdx g(final int n, final int c, final BigInteger bigInteger) {
        final ahaz builder = ((ahbh)agdy.a).createBuilder();
        builder.copyOnWrite();
        ((agdy)builder.instance).b = aeuz.D(n);
        final agdy b = (agdy)builder.build();
        final ahaz builder2 = ((ahbh)agdx.a).createBuilder();
        builder2.copyOnWrite();
        final agdx agdx = (agdx)builder2.instance;
        b.getClass();
        agdx.b = b;
        builder2.copyOnWrite();
        ((agdx)builder2.instance).c = c;
        final ahab x = ahab.x(bigInteger.toByteArray());
        builder2.copyOnWrite();
        ((agdx)builder2.instance).d = x;
        return (agdx)builder2.build();
    }
    
    public final agaj a() {
        return new agev(agdx.class);
    }
    
    public final agdj b() {
        return agdj.c;
    }
    
    public final /* bridge */ MessageLite c(final ahab ahab) {
        return (MessageLite)ahbh.parseFrom((ahbh)agdz.a, ahab, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        final agdz agdz = (agdz)messageLite;
        aggq.d(agdz.b);
        agea agea;
        if ((agea = agdz.c) == null) {
            agea = agea.a;
        }
        aggq.b(new BigInteger(1, agea.d.I()).bitLength());
        agea agea2;
        if ((agea2 = agdz.c) == null) {
            agea2 = agea.a;
        }
        aggq.c(new BigInteger(1, agea2.e.I()));
        agea agea3;
        if ((agea3 = agdz.c) == null) {
            agea3 = agea.a;
        }
        agdy agdy;
        if ((agdy = agea3.c) == null) {
            agdy = agdy.a;
        }
        aevy.X(agdy);
    }
    
    public final int f() {
        return 2;
    }
}
