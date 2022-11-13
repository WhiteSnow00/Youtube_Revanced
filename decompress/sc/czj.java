import android.util.Log;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czj implements cul
{
    private static final Set a;
    
    static {
        a = new HashSet();
    }
    
    public final void a(final String s, final Throwable t) {
        final Set a = czj.a;
        if (a.contains(s)) {
            return;
        }
        Log.w("LOTTIE", s, t);
        a.add(s);
    }
}
