import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwf extends vfv
{
    public static final anwe d(final String c) {
        c.getClass();
        adkp.R(c.isEmpty() ^ true, (Object)"key cannot be empty");
        final ahaz builder = anwh.a.createBuilder();
        builder.copyOnWrite();
        final anwh anwh = (anwh)builder.instance;
        anwh.b |= 0x1;
        anwh.c = c;
        return new anwe(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vfk b(final byte[] array) {
        try {
            final anwh anwh = (anwh)ahbh.parseFrom((ahbh)anwh.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((anwh.b & 0x1) != 0x0) {
                return new anwe(anwh.toBuilder());
            }
            final String encodeToString = Base64.encodeToString(array, 10);
            final StringBuilder sb = new StringBuilder("Attempted to parse and wrap an entity protobuf without a valid key (field: id, bytes: ");
            sb.append(encodeToString);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        catch (final ahca ahca) {
            throw new IllegalArgumentException((Throwable)ahca);
        }
    }
    
    public final Class c() {
        return anwg.class;
    }
}
