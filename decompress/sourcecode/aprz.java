import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprz extends vdu
{
    public static final apry d(final String c) {
        c.getClass();
        agot.E(c.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = apsb.a.createBuilder();
        builder.copyOnWrite();
        final apsb apsb = (apsb)builder.instance;
        apsb.b |= 0x1;
        apsb.c = c;
        return new apry(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final Class c() {
        return apsa.class;
    }
}
