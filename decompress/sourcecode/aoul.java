import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoul extends vdu
{
    public static final aouk d(final String c) {
        c.getClass();
        agot.E(c.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = aoun.a.createBuilder();
        builder.copyOnWrite();
        final aoun aoun = (aoun)builder.instance;
        aoun.b |= 0x1;
        aoun.c = c;
        return new aouk(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final Class c() {
        return aoum.class;
    }
}
