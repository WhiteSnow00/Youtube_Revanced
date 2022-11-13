import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apuj extends vfv
{
    public static final apui d(final String c) {
        c.getClass();
        adkp.R(c.isEmpty() ^ true, (Object)"key cannot be empty");
        final ahaz builder = apul.a.createBuilder();
        builder.copyOnWrite();
        final apul apul = (apul)builder.instance;
        apul.b |= 0x1;
        apul.c = c;
        return new apui(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vfk b(final byte[] array) {
        try {
            final apul apul = (apul)ahbh.parseFrom((ahbh)apul.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((apul.b & 0x1) != 0x0) {
                return new apui(apul.toBuilder());
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
        return apuk.class;
    }
}
