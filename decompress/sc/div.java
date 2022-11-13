import android.net.Uri;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class div implements dij
{
    private static final Set a;
    private final diu b;
    
    static {
        a = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList("file", "android.resource", "content")));
    }
    
    public div(final diu b) {
        this.b = b;
    }
    
    @Override
    public final /* bridge */ boolean a(final Object o) {
        return div.a.contains(((Uri)o).getScheme());
    }
    
    @Override
    public final /* bridge */ aln b(final Object o, final int n, final int n2, final ddp ddp) {
        final Uri uri = (Uri)o;
        return new aln((ddk)new dos((Object)uri), this.b.a(uri));
    }
}
