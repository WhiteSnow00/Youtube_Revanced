import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgz extends vdu
{
    public static final ajgy d(final String d) {
        d.getClass();
        agot.E(d.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = ((agzi)ajhb.a).createBuilder();
        builder.copyOnWrite();
        final ajhb ajhb = (ajhb)builder.instance;
        ajhb.c |= 0x1;
        ajhb.d = d;
        return new ajgy(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final Class c() {
        return ajha.class;
    }
}
