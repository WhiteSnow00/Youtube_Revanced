import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqbz extends vhd
{
    public static final aqby d(final String d) {
        d.getClass();
        adme.U(d.isEmpty() ^ true, "key cannot be empty");
        final ahcr builder = aqcb.a.createBuilder();
        builder.copyOnWrite();
        final aqcb aqcb = (aqcb)builder.instance;
        aqcb.c |= 0x1;
        aqcb.d = d;
        return new aqby(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vgs b(final byte[] array) {
        try {
            final aqcb aqcb = (aqcb)ahcz.parseFrom(aqcb.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((aqcb.c & 0x1) != 0x0) {
                return new aqby(aqcb.toBuilder());
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
        return aqca.class;
    }
}
