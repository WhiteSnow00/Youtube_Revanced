import android.net.Uri;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class diw implements dii
{
    private static final Set a;
    private final dii b;
    
    static {
        a = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList("http", "https")));
    }
    
    public diw(final dii b) {
        this.b = b;
    }
}
