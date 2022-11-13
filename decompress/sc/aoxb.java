import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxb extends vfv
{
    public static final aoxa d(final String d) {
        d.getClass();
        adkp.R(d.isEmpty() ^ true, "key cannot be empty");
        final ahbb ahbb = (ahbb)((ahbh)aoxd.a).createBuilder();
        ((ahaz)ahbb).copyOnWrite();
        final aoxd aoxd = (aoxd)ahbb.instance;
        aoxd.c |= 0x1;
        aoxd.d = d;
        return new aoxa(ahbb);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vfk b(final byte[] array) {
        try {
            final aoxd aoxd = (aoxd)ahbh.parseFrom((ahbh)aoxd.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((aoxd.c & 0x1) != 0x0) {
                return new aoxa((ahbb)((ahbh)aoxd).toBuilder());
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
        return aoxc.class;
    }
}
