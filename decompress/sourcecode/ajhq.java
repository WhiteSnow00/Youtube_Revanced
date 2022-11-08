import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajhq extends vdu
{
    public static final ajhp d(final String d) {
        d.getClass();
        agot.E(d.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = ((agzi)ajhu.a).createBuilder();
        builder.copyOnWrite();
        final ajhu ajhu = (ajhu)builder.instance;
        ajhu.c |= 0x1;
        ajhu.d = d;
        return new ajhp(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final Class c() {
        return ajhr.class;
    }
}
