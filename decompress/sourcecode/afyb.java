import java.security.GeneralSecurityException;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afyb extends afyq
{
    public afyb() {
        super((Class)agbg.class, new afyp[] { new afxz(afuq.class) });
    }
    
    public static ardu g(final int n, final int n2, final int n3, final int n4) {
        final agza builder = agbf.a.createBuilder();
        builder.copyOnWrite();
        ((agbf)builder.instance).b = n - 2;
        builder.copyOnWrite();
        ((agbf)builder.instance).c = n2 - 2;
        builder.copyOnWrite();
        ((agbf)builder.instance).d = n3 - 2;
        final agbf b = (agbf)builder.build();
        final agza builder2 = agbe.a.createBuilder();
        builder2.copyOnWrite();
        final agbe agbe = (agbe)builder2.instance;
        b.getClass();
        agbe.b = b;
        return new ardu((Object)builder2.build(), n4);
    }
    
    public final afyi a() {
        return new afya(agbe.class);
    }
    
    public final agbi b() {
        return agbi.c;
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }
}
