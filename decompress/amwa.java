import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwa extends vfv
{
    public static final amvz d(final String d) {
        d.getClass();
        adkp.R(d.isEmpty() ^ true, "key cannot be empty");
        final ahaz builder = ((ahbh)amwc.a).createBuilder();
        builder.copyOnWrite();
        final amwc amwc = (amwc)builder.instance;
        amwc.c |= 0x1;
        amwc.d = d;
        return new amvz(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vfk b(final byte[] array) {
        try {
            final amwc amwc = (amwc)ahbh.parseFrom((ahbh)amwc.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((amwc.c & 0x1) != 0x0) {
                return new amvz(((ahbh)amwc).toBuilder());
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
        return amwb.class;
    }
}
