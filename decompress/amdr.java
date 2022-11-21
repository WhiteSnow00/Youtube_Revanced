import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amdr extends vhd
{
    public static final amdq d(final String d) {
        adme.U(d.isEmpty() ^ true, "key cannot be empty");
        final ahcr builder = ((ahcz)amdu.a).createBuilder();
        builder.copyOnWrite();
        final amdu amdu = (amdu)builder.instance;
        amdu.c |= 0x1;
        amdu.d = d;
        return new amdq(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vgs b(final byte[] array) {
        try {
            final amdu amdu = (amdu)ahcz.parseFrom((ahcz)amdu.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((amdu.c & 0x1) != 0x0) {
                return new amdq(((ahcz)amdu).toBuilder());
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
        return amds.class;
    }
}
