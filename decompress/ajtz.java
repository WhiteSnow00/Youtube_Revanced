import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajtz extends vhd
{
    public static final ajty d(final String d) {
        d.getClass();
        adme.U(d.isEmpty() ^ true, "key cannot be empty");
        final ahcr builder = ((ahcz)ajub.a).createBuilder();
        builder.copyOnWrite();
        final ajub ajub = (ajub)builder.instance;
        ajub.c |= 0x1;
        ajub.d = d;
        return new ajty(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vgs b(final byte[] array) {
        try {
            final ajub ajub = (ajub)ahcz.parseFrom((ahcz)ajub.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((ajub.c & 0x1) != 0x0) {
                return new ajty(((ahcz)ajub).toBuilder());
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
        return ajua.class;
    }
}
