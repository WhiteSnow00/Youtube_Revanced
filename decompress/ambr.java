import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ambr extends vfv
{
    public static final ambq d(final String d) {
        adkp.R(d.isEmpty() ^ true, "key cannot be empty");
        final ahaz builder = ((ahbh)ambu.a).createBuilder();
        builder.copyOnWrite();
        final ambu ambu = (ambu)builder.instance;
        ambu.c |= 0x1;
        ambu.d = d;
        return new ambq(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vfk b(final byte[] array) {
        try {
            final ambu ambu = (ambu)ahbh.parseFrom((ahbh)ambu.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((ambu.c & 0x1) != 0x0) {
                return new ambq(((ahbh)ambu).toBuilder());
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
        return ambs.class;
    }
}
