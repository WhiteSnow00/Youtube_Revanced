import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anho extends vfv
{
    public static final anhn d(final String d) {
        d.getClass();
        adkp.R(d.isEmpty() ^ true, "key cannot be empty");
        final ahaz builder = anhq.a.createBuilder();
        builder.copyOnWrite();
        final anhq anhq = (anhq)builder.instance;
        anhq.c |= 0x1;
        anhq.d = d;
        return new anhn(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vfk b(final byte[] array) {
        try {
            final anhq anhq = (anhq)ahbh.parseFrom((ahbh)anhq.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((anhq.c & 0x1) != 0x0) {
                return new anhn(anhq.toBuilder());
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
        return anhp.class;
    }
}
