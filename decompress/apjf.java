import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjf extends vhd
{
    public static final apje d(final String c) {
        c.getClass();
        adme.U(c.isEmpty() ^ true, "key cannot be empty");
        final ahcr builder = apjh.a.createBuilder();
        builder.copyOnWrite();
        final apjh apjh = (apjh)builder.instance;
        apjh.b |= 0x1;
        apjh.c = c;
        return new apje(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vgs b(final byte[] array) {
        try {
            final apjh apjh = (apjh)ahcz.parseFrom(apjh.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((apjh.b & 0x1) != 0x0) {
                return new apje(apjh.toBuilder());
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
        return apjg.class;
    }
}
