import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aous extends vfv
{
    public static final aour d(final String c) {
        c.getClass();
        adkp.R(c.isEmpty() ^ true, "key cannot be empty");
        final ahaz builder = aouu.a.createBuilder();
        builder.copyOnWrite();
        final aouu aouu = (aouu)builder.instance;
        aouu.b |= 0x1;
        aouu.c = c;
        return new aour(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vfk b(final byte[] array) {
        try {
            final aouu aouu = (aouu)ahbh.parseFrom((ahbh)aouu.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((aouu.b & 0x1) != 0x0) {
                return new aour(aouu.toBuilder());
            }
            final String encodeToString = Base64.encodeToString(array, 10);
            final StringBuilder sb = new StringBuilder("Attempted to parse and wrap an entity protobuf without a valid key (field: key, bytes: ");
            sb.append(encodeToString);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        catch (final ahca ahca) {
            throw new IllegalArgumentException((Throwable)ahca);
        }
    }
    
    public final Class c() {
        return aout.class;
    }
}
