import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigf extends vfv
{
    public static final aige d(final String d) {
        d.getClass();
        adkp.R(d.isEmpty() ^ true, "key cannot be empty");
        final ahaz builder = aigh.a.createBuilder();
        builder.copyOnWrite();
        final aigh aigh = (aigh)builder.instance;
        aigh.c |= 0x1;
        aigh.d = d;
        return new aige(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vfk b(final byte[] array) {
        try {
            final aigh aigh = (aigh)ahbh.parseFrom((ahbh)aigh.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((aigh.c & 0x1) != 0x0) {
                return new aige(aigh.toBuilder());
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
        return aigg.class;
    }
}
