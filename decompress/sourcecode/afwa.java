import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afwa extends afyj
{
    public afwa() {
        super(agag.class, new afyp[] { new afvy(afum.class) });
    }
    
    public static ardu g(final int b, final int n) {
        final agza builder = agah.a.createBuilder();
        builder.copyOnWrite();
        ((agah)builder.instance).b = b;
        return new ardu((Object)builder.build(), n);
    }
    
    @Override
    public final afyi a() {
        return new afvz(agah.class);
    }
    
    @Override
    public final agbi b() {
        return agbi.b;
    }
    
    @Override
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }
    
    @Override
    public final int f() {
        return 2;
    }
}
