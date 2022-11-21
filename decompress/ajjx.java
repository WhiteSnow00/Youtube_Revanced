import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjx extends vhd
{
    public static final ajjw d(final String f) {
        f.getClass();
        adme.U(f.isEmpty() ^ true, "key cannot be empty");
        final ahcr builder = ajka.a.createBuilder();
        builder.copyOnWrite();
        final ajka ajka = (ajka)builder.instance;
        ajka.c |= 0x1;
        ajka.f = f;
        return new ajjw(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vgs b(final byte[] array) {
        try {
            final ajka ajka = (ajka)ahcz.parseFrom(ajka.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((ajka.c & 0x1) != 0x0) {
                return new ajjw(ajka.toBuilder());
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
        return ajjy.class;
    }
}
