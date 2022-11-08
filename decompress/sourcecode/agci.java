import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agci extends afyq
{
    public agci() {
        super((Class)agaq.class, new afyp[] { (afyp)new agcg((Class)afvj.class) });
    }
    
    public static ardu g(final int n, final int n2, final int n3, final int n4) {
        final agza builder = agap.a.createBuilder();
        builder.copyOnWrite();
        ((agap)builder.instance).b = aesy.Y(n);
        builder.copyOnWrite();
        ((agap)builder.instance).c = aesy.aa(n2);
        builder.copyOnWrite();
        ((agap)builder.instance).d = n3 - 2;
        final agap b = (agap)builder.build();
        final agza builder2 = agao.a.createBuilder();
        builder2.copyOnWrite();
        final agao agao = (agao)builder2.instance;
        b.getClass();
        agao.b = b;
        return new ardu((Object)builder2.build(), n4);
    }
    
    public final afyi a() {
        return (afyi)new agch((Class)agao.class);
    }
    
    public final agbi b() {
        return agbi.c;
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    }
    
    public final int f() {
        return 2;
    }
}
