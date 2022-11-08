import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.math.BigInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agda extends afyq
{
    public agda() {
        super((Class)agcc.class, new afyp[] { (afyp)new agcy((Class)afvj.class) });
    }
    
    public static agca g(final int n, final int n2, final int d, final int c, final BigInteger bigInteger) {
        final agza builder = agcb.a.createBuilder();
        builder.copyOnWrite();
        ((agcb)builder.instance).b = aesy.Y(n);
        builder.copyOnWrite();
        ((agcb)builder.instance).c = aesy.Y(n2);
        builder.copyOnWrite();
        ((agcb)builder.instance).d = d;
        final agcb b = (agcb)builder.build();
        final agza builder2 = agca.a.createBuilder();
        builder2.copyOnWrite();
        final agca agca = (agca)builder2.instance;
        b.getClass();
        agca.b = b;
        builder2.copyOnWrite();
        ((agca)builder2.instance).c = c;
        final agyc x = agyc.x(bigInteger.toByteArray());
        builder2.copyOnWrite();
        ((agca)builder2.instance).d = x;
        return (agca)builder2.build();
    }
    
    public final afyi a() {
        return (afyi)new agcz((Class)agca.class);
    }
    
    public final agbi b() {
        return agbi.c;
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }
}
