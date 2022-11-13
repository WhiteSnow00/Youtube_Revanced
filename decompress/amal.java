import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amal extends vfv
{
    public static final amak d(final String d) {
        d.getClass();
        adkp.R(d.isEmpty() ^ true, "key cannot be empty");
        final ahbb ahbb = (ahbb)((ahbh)aman.a).createBuilder();
        ((ahaz)ahbb).copyOnWrite();
        final aman aman = (aman)ahbb.instance;
        aman.c |= 0x1;
        aman.d = d;
        return new amak(ahbb);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vfk b(final byte[] array) {
        try {
            final aman aman = (aman)ahbh.parseFrom((ahbh)aman.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((aman.c & 0x1) != 0x0) {
                return new amak((ahbb)((ahbh)aman).toBuilder());
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
        return amam.class;
    }
}
