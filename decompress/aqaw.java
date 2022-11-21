import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqaw extends vhd
{
    public static final aqav d(final String d) {
        d.getClass();
        adme.U(d.isEmpty() ^ true, "key cannot be empty");
        final ahcr builder = aqay.a.createBuilder();
        builder.copyOnWrite();
        final aqay aqay = (aqay)builder.instance;
        aqay.c |= 0x1;
        aqay.d = d;
        return new aqav(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vgs b(final byte[] array) {
        try {
            final aqay aqay = (aqay)ahcz.parseFrom(aqay.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((aqay.c & 0x1) != 0x0) {
                return new aqav(aqay.toBuilder());
            }
            final String encodeToString = Base64.encodeToString(array, 10);
            final StringBuilder sb = new StringBuilder("Attempted to parse and wrap an entity protobuf without a valid key (field: id, bytes: ");
            sb.append(encodeToString);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        catch (final ahds ahds) {
            throw new IllegalArgumentException((Throwable)ahds);
        }
    }
    
    public final Class c() {
        return aqax.class;
    }
}
