import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amaz extends vhd
{
    public static final amay d(final String d) {
        d.getClass();
        adme.U(d.isEmpty() ^ true, "key cannot be empty");
        final ahcr builder = ambb.a.createBuilder();
        builder.copyOnWrite();
        final ambb ambb = (ambb)builder.instance;
        ambb.c |= 0x1;
        ambb.d = d;
        return new amay(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vgs b(final byte[] array) {
        try {
            final ambb ambb = (ambb)ahcz.parseFrom(ambb.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((ambb.c & 0x1) != 0x0) {
                return new amay(ambb.toBuilder());
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
        return amba.class;
    }
}
