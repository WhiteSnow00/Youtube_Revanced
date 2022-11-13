import android.net.Uri;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dix implements dij
{
    private static final Set a;
    private final dij b;
    
    static {
        a = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList("http", "https")));
    }
    
    public dix(final dij b) {
        this.b = b;
    }
    
    @Override
    public final /* bridge */ boolean a(final Object o) {
        return dix.a.contains(((Uri)o).getScheme());
    }
    
    @Override
    public final /* bridge */ aln b(final Object o, final int n, final int n2, final ddp ddp) {
        return this.b.b(new dhz(((Uri)o).toString()), n, n2, ddp);
    }
}
