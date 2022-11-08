import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apef extends vdu
{
    public static final apee d(final String c) {
        c.getClass();
        agot.E(c.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = apeh.a.createBuilder();
        builder.copyOnWrite();
        final apeh apeh = (apeh)builder.instance;
        apeh.b |= 0x1;
        apeh.c = c;
        return new apee(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final Class c() {
        return apeg.class;
    }
}
