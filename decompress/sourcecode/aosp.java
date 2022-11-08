import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aosp extends vdu
{
    public static final aoso d(final String c) {
        c.getClass();
        agot.E(c.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = aosr.a.createBuilder();
        builder.copyOnWrite();
        final aosr aosr = (aosr)builder.instance;
        aosr.b |= 0x1;
        aosr.c = c;
        return new aoso(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final Class c() {
        return aosq.class;
    }
}
