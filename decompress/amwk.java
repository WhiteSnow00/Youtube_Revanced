import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwk extends vfv
{
    public static final amwj d(final String d) {
        d.getClass();
        adkp.R(d.isEmpty() ^ true, "key cannot be empty");
        final ahaz builder = ((ahbh)amwm.a).createBuilder();
        builder.copyOnWrite();
        final amwm amwm = (amwm)builder.instance;
        amwm.c |= 0x1;
        amwm.d = d;
        return new amwj(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vfk b(final byte[] array) {
        try {
            final amwm amwm = (amwm)ahbh.parseFrom((ahbh)amwm.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((amwm.c & 0x1) != 0x0) {
                return new amwj(((ahbh)amwm).toBuilder());
            }
            final String encodeToString = Base64.encodeToString(array, 10);
            final StringBuilder sb = new StringBuilder("Attempted to parse and wrap an entity protobuf without a valid key (field: key, bytes: ");
            sb.append(encodeToString);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        catch (final ahca ahca) {
            throw new IllegalArgumentException((Throwable)ahca);
        }
    }
    
    public final Class c() {
        return amwl.class;
    }
}
