import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfu extends vdu
{
    public static final ajft d(final String f) {
        f.getClass();
        agot.E(f.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = ajfx.a.createBuilder();
        builder.copyOnWrite();
        final ajfx ajfx = (ajfx)builder.instance;
        ajfx.c |= 0x1;
        ajfx.f = f;
        return new ajft(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final Class c() {
        return ajfv.class;
    }
}
