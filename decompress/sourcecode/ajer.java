import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajer extends vdu
{
    public static final ajeq d(final String f) {
        f.getClass();
        agot.E(f.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = ajeu.a.createBuilder();
        builder.copyOnWrite();
        final ajeu ajeu = (ajeu)builder.instance;
        ajeu.c |= 0x1;
        ajeu.f = f;
        return new ajeq(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final Class c() {
        return ajes.class;
    }
}
