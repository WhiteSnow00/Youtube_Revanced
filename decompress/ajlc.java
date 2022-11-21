import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlc extends vhd
{
    public static final ajlb d(final String d) {
        d.getClass();
        adme.U(d.isEmpty() ^ true, "key cannot be empty");
        final ahcr builder = ajle.a.createBuilder();
        builder.copyOnWrite();
        final ajle ajle = (ajle)builder.instance;
        ajle.c |= 0x1;
        ajle.d = d;
        return new ajlb(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vgs b(final byte[] array) {
        try {
            final ajle ajle = (ajle)ahcz.parseFrom(ajle.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((ajle.c & 0x1) != 0x0) {
                return new ajlb(ajle.toBuilder());
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
        return ajld.class;
    }
}
