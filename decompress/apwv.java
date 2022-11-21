import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwv extends vhd
{
    public static final apwu d(final String c) {
        c.getClass();
        adme.U(c.isEmpty() ^ true, "key cannot be empty");
        final ahcr builder = apwx.a.createBuilder();
        builder.copyOnWrite();
        final apwx apwx = (apwx)builder.instance;
        apwx.b |= 0x1;
        apwx.c = c;
        return new apwu(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vgs b(final byte[] array) {
        try {
            final apwx apwx = (apwx)ahcz.parseFrom(apwx.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((apwx.b & 0x1) != 0x0) {
                return new apwu(apwx.toBuilder());
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
        return apww.class;
    }
}
