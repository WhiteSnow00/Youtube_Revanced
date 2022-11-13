import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ancx extends vfv
{
    public static final ancw d(final String d) {
        d.getClass();
        adkp.R(d.isEmpty() ^ true, (Object)"key cannot be empty");
        final ahbb ahbb = (ahbb)((ahbh)ancz.a).createBuilder();
        ((ahaz)ahbb).copyOnWrite();
        final ancz ancz = (ancz)ahbb.instance;
        ancz.c |= 0x1;
        ancz.d = d;
        return new ancw(ahbb);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vfk b(final byte[] array) {
        try {
            final ancz ancz = (ancz)ahbh.parseFrom((ahbh)ancz.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((ancz.c & 0x1) != 0x0) {
                return new ancw((ahbb)((ahbh)ancz).toBuilder());
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
        return ancy.class;
    }
}
