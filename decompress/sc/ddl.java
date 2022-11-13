import android.content.Context;
import java.util.Iterator;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddl implements ddt
{
    private final Collection b;
    
    @SafeVarargs
    public ddl(final ddt... array) {
        if (array.length != 0) {
            this.b = Arrays.asList(array);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
    
    public final void a(final MessageDigest messageDigest) {
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((ddt)iterator.next()).a(messageDigest);
        }
    }
    
    public final dfy b(final Context context, final dfy dfy, final int n, final int n2) {
        final Iterator iterator = this.b.iterator();
        dfy dfy2 = dfy;
        while (iterator.hasNext()) {
            final dfy b = ((ddt)iterator.next()).b(context, dfy2, n, n2);
            if (dfy2 != null && !dfy2.equals(dfy) && !dfy2.equals(b)) {
                dfy2.e();
            }
            dfy2 = b;
        }
        return dfy2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ddl && this.b.equals(((ddl)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
}
