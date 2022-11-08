import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.math.BigInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agcv extends afyq
{
    public agcv() {
        super((Class)agby.class, new afyp[] { (afyp)new agct((Class)afvj.class) });
    }
    
    public static agbw g(final int n, final int c, final BigInteger bigInteger) {
        final agza builder = agbx.a.createBuilder();
        builder.copyOnWrite();
        ((agbx)builder.instance).b = aesy.Y(n);
        final agbx b = (agbx)builder.build();
        final agza builder2 = agbw.a.createBuilder();
        builder2.copyOnWrite();
        final agbw agbw = (agbw)builder2.instance;
        b.getClass();
        agbw.b = b;
        builder2.copyOnWrite();
        ((agbw)builder2.instance).c = c;
        final agyc x = agyc.x(bigInteger.toByteArray());
        builder2.copyOnWrite();
        ((agbw)builder2.instance).d = x;
        return (agbw)builder2.build();
    }
    
    public final afyi a() {
        return (afyi)new agcu((Class)agbw.class);
    }
    
    public final agbi b() {
        return agbi.c;
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    }
    
    public final int f() {
        return 2;
    }
}
