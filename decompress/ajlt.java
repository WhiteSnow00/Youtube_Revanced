import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlt extends vhd
{
    public static final ajls d(final String d) {
        d.getClass();
        adme.U(d.isEmpty() ^ true, "key cannot be empty");
        final ahcr builder = ajlx.a.createBuilder();
        builder.copyOnWrite();
        final ajlx ajlx = (ajlx)builder.instance;
        ajlx.c |= 0x1;
        ajlx.d = d;
        return new ajls(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vgs b(final byte[] array) {
        try {
            final ajlx ajlx = (ajlx)ahcz.parseFrom(ajlx.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((ajlx.c & 0x1) != 0x0) {
                return new ajls(ajlx.toBuilder());
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
        return ajlu.class;
    }
}
