import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajiu extends vhd
{
    public static final ajit d(final String f) {
        f.getClass();
        adme.U(f.isEmpty() ^ true, "key cannot be empty");
        final ahcr builder = ajix.a.createBuilder();
        builder.copyOnWrite();
        final ajix ajix = (ajix)builder.instance;
        ajix.c |= 0x1;
        ajix.f = f;
        return new ajit(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vgs b(final byte[] array) {
        try {
            final ajix ajix = (ajix)ahcz.parseFrom(ajix.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((ajix.c & 0x1) != 0x0) {
                return new ajit(ajix.toBuilder());
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
        return ajiv.class;
    }
}
