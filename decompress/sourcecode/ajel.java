import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajel extends vdu
{
    public static final ajek d(final String d) {
        d.getClass();
        agot.E(d.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = ajen.a.createBuilder();
        builder.copyOnWrite();
        final ajen ajen = (ajen)builder.instance;
        ajen.c |= 0x1;
        ajen.d = d;
        return new ajek(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final Class c() {
        return ajem.class;
    }
}
