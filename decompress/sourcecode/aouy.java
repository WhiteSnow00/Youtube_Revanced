import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aouy extends vdu
{
    public static final aoux d(final String d) {
        d.getClass();
        agot.E(d.isEmpty() ^ true, (Object)"key cannot be empty");
        final agzc agzc = (agzc)((agzi)aova.a).createBuilder();
        ((agza)agzc).copyOnWrite();
        final aova aova = (aova)agzc.instance;
        aova.c |= 0x1;
        aova.d = d;
        return new aoux(agzc);
    }
    
    public final int a() {
        return 1;
    }
    
    public final Class c() {
        return aouz.class;
    }
}
