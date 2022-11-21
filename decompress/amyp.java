import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amyp extends vhd
{
    public static final amyo d(final String d) {
        d.getClass();
        adme.U(d.isEmpty() ^ true, "key cannot be empty");
        final ahcr builder = ((ahcz)amyr.a).createBuilder();
        builder.copyOnWrite();
        final amyr amyr = (amyr)builder.instance;
        amyr.c |= 0x1;
        amyr.d = d;
        return new amyo(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vgs b(final byte[] array) {
        try {
            final amyr amyr = (amyr)ahcz.parseFrom((ahcz)amyr.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((amyr.c & 0x1) != 0x0) {
                return new amyo(((ahcz)amyr).toBuilder());
            }
            final String encodeToString = Base64.encodeToString(array, 10);
            final StringBuilder sb = new StringBuilder("Attempted to parse and wrap an entity protobuf without a valid key (field: key, bytes: ");
            sb.append(encodeToString);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        catch (final ahds ahds) {
            throw new IllegalArgumentException((Throwable)ahds);
        }
    }
    
    public final Class c() {
        return amyq.class;
    }
}
