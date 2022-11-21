import java.util.Locale;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.Collections;
import android.util.Pair;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aap implements zk
{
    private static final Set a;
    
    static {
        a = new HashSet(Collections.singletonList(Pair.create((Object)"SAMSUNG", (Object)"SM-G981U1")));
    }
    
    static boolean a() {
        return aap.a.contains(Pair.create((Object)Build.BRAND.toUpperCase(Locale.US), (Object)Build.MODEL.toUpperCase(Locale.US)));
    }
}
