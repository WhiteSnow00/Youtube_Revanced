import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class amab extends vfv
{
    public amab() {
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vfk b(final byte[] array) {
        try {
            final amae amae = (amae)ahbh.parseFrom((ahbh)amae.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((amae.c & 0x1) != 0x0) {
                return new amaa(((ahbh)amae).toBuilder());
            }
            final String encodeToString = Base64.encodeToString(array, 10);
            final StringBuilder sb = new StringBuilder("Attempted to parse and wrap an entity protobuf without a valid key (field: id, bytes: ");
            sb.append(encodeToString);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        catch (final ahca ahca) {
            throw new IllegalArgumentException((Throwable)ahca);
        }
    }
    
    public final Class c() {
        return amac.class;
    }
}