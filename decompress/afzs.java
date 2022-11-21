import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afzs extends agcc
{
    public afzs() {
        super((Class)agdz.class, new agci[] { new afzq(afyf.class) });
    }
    
    public static arjd g(final int b, final int n) {
        final ahcr builder = ((ahcz)agea.a).createBuilder();
        builder.copyOnWrite();
        ((agea)builder.instance).b = b;
        return new arjd(builder.build(), n);
    }
    
    public final agcb a() {
        return new afzr(agea.class);
    }
    
    public final agfb b() {
        return agfb.b;
    }
    
    public final /* bridge */ MessageLite c(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agdz.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        final agdz agdz = (agdz)messageLite;
        agii.d(agdz.b);
        agii.a(agdz.c.d());
    }
    
    public final int f() {
        return 2;
    }
}
