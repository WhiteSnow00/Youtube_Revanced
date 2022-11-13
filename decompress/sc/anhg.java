import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anhg extends vfv
{
    public static final anhf d(final String d) {
        d.getClass();
        adkp.R(d.isEmpty() ^ true, (Object)"key cannot be empty");
        final ahaz builder = anhi.a.createBuilder();
        builder.copyOnWrite();
        final anhi anhi = (anhi)builder.instance;
        anhi.c |= 0x1;
        anhi.d = d;
        return new anhf(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vfk b(final byte[] array) {
        try {
            final anhi anhi = (anhi)ahbh.parseFrom((ahbh)anhi.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((anhi.c & 0x1) != 0x0) {
                return new anhf(anhi.toBuilder());
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
        return anhh.class;
    }
}
