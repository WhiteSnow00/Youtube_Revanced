import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aihy extends vhd
{
    public static final aihx d(final String d) {
        d.getClass();
        adme.U(d.isEmpty() ^ true, "key cannot be empty");
        final ahcr builder = ((ahcz)aiia.a).createBuilder();
        builder.copyOnWrite();
        final aiia aiia = (aiia)builder.instance;
        aiia.c |= 0x1;
        aiia.d = d;
        return new aihx(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vgs b(final byte[] array) {
        try {
            final aiia aiia = (aiia)ahcz.parseFrom((ahcz)aiia.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((aiia.c & 0x1) != 0x0) {
                return new aihx(((ahcz)aiia).toBuilder());
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
        return aihz.class;
    }
}
