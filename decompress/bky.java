import android.os.Bundle;
import android.graphics.drawable.Drawable;
import java.util.Map;
import android.util.Pair;
import android.media.MediaDrm$MediaDrmStateException;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class bky
{
    public static volatile dxu a;
    
    public bky() {
    }
    
    public bky(final List list) {
        Collections.unmodifiableList((List<?>)list);
    }
    
    public static int a(final Throwable t) {
        return baz.i(baz.j(((MediaDrm$MediaDrmStateException)t).getDiagnosticInfo()));
    }
    
    public static boolean b(final Throwable t) {
        return t instanceof MediaDrm$MediaDrmStateException;
    }
    
    public static Pair c(final bkp bkp) {
        final Map d = bkp.d();
        if (d == null) {
            return null;
        }
        return new Pair((Object)g(d, "LicenseDurationRemaining"), (Object)g(d, "PlaybackDurationRemaining"));
    }
    
    public static boolean f(final Drawable drawable, final Drawable drawable2) {
        if (drawable == null) {
            return drawable2 == null;
        }
        if (drawable2 == null) {
            return false;
        }
        if (drawable instanceof dzn && drawable2 instanceof dzn) {
            return ((dzn)drawable).a((dzn)drawable2);
        }
        return drawable.equals(drawable2);
    }
    
    private static long g(final Map map, final String s) {
        try {
            final String s2 = map.get(s);
            if (s2 != null) {
                return Long.parseLong(s2);
            }
            return -9223372036854775807L;
        }
        catch (final NumberFormatException ex) {
            return -9223372036854775807L;
        }
    }
    
    public void d(final String s, final Bundle bundle) {
        throw null;
    }
    
    public void e(final Bundle bundle) {
        throw null;
    }
}
