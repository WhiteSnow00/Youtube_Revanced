import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apiv extends vhd
{
    public static final apiu d(final String c) {
        c.getClass();
        adme.U(c.isEmpty() ^ true, "key cannot be empty");
        final ahcr builder = apix.a.createBuilder();
        builder.copyOnWrite();
        final apix apix = (apix)builder.instance;
        apix.b |= 0x1;
        apix.c = c;
        return new apiu(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vgs b(final byte[] array) {
        try {
            final apix apix = (apix)ahcz.parseFrom(apix.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((apix.b & 0x1) != 0x0) {
                return new apiu(apix.toBuilder());
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
        return apiw.class;
    }
}
