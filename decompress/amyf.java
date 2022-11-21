import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amyf extends vhd
{
    public static final amye d(final String d) {
        d.getClass();
        adme.U(d.isEmpty() ^ true, "key cannot be empty");
        final ahcr builder = ((ahcz)amyh.a).createBuilder();
        builder.copyOnWrite();
        final amyh amyh = (amyh)builder.instance;
        amyh.c |= 0x1;
        amyh.d = d;
        return new amye(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vgs b(final byte[] array) {
        try {
            final amyh amyh = (amyh)ahcz.parseFrom((ahcz)amyh.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((amyh.c & 0x1) != 0x0) {
                return new amye(((ahcz)amyh).toBuilder());
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
        return amyg.class;
    }
}
