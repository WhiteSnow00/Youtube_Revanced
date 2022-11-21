import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajio extends vhd
{
    public static final ajin d(final String d) {
        d.getClass();
        adme.U(d.isEmpty() ^ true, "key cannot be empty");
        final ahcr builder = ajiq.a.createBuilder();
        builder.copyOnWrite();
        final ajiq ajiq = (ajiq)builder.instance;
        ajiq.c |= 0x1;
        ajiq.d = d;
        return new ajin(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vgs b(final byte[] array) {
        try {
            final ajiq ajiq = (ajiq)ahcz.parseFrom(ajiq.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((ajiq.c & 0x1) != 0x0) {
                return new ajin(ajiq.toBuilder());
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
        return ajip.class;
    }
}
