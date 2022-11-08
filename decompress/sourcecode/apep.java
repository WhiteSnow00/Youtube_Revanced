import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apep extends vdu
{
    public static final apeo d(final String c) {
        c.getClass();
        agot.E(c.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = aper.a.createBuilder();
        builder.copyOnWrite();
        final aper aper = (aper)builder.instance;
        aper.b |= 0x1;
        aper.c = c;
        return new apeo(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final Class c() {
        return apeq.class;
    }
}
