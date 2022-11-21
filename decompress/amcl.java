import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amcl extends vhd
{
    public static final amck d(final String d) {
        d.getClass();
        adme.U(d.isEmpty() ^ true, "key cannot be empty");
        final ahct ahct = (ahct)((ahcz)amcn.a).createBuilder();
        ((ahcr)ahct).copyOnWrite();
        final amcn amcn = (amcn)ahct.instance;
        amcn.c |= 0x1;
        amcn.d = d;
        return new amck(ahct);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vgs b(final byte[] array) {
        try {
            final amcn amcn = (amcn)ahcz.parseFrom((ahcz)amcn.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((amcn.c & 0x1) != 0x0) {
                return new amck((ahct)((ahcz)amcn).toBuilder());
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
        return amcm.class;
    }
}
