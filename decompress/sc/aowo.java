import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowo extends vfv
{
    public static final aown d(final String c) {
        c.getClass();
        adkp.R(c.isEmpty() ^ true, "key cannot be empty");
        final ahaz builder = aowq.a.createBuilder();
        builder.copyOnWrite();
        final aowq aowq = (aowq)builder.instance;
        aowq.b |= 0x1;
        aowq.c = c;
        return new aown(builder);
    }
    
    public final int a() {
        return 1;
    }
    
    public final /* bridge */ vfk b(final byte[] array) {
        try {
            final aowq aowq = (aowq)ahbh.parseFrom((ahbh)aowq.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            if ((aowq.b & 0x1) != 0x0) {
                return new aown(aowq.toBuilder());
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
        return aowp.class;
    }
}
