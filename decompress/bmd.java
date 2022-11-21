import android.util.Log;
import android.media.MediaRouter$RouteInfo;
import android.view.Display;
import java.io.EOFException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bmd
{
    public bmd() {
        throw new UnsupportedOperationException();
    }
    
    public static void a(final blx blx, final bhd bhd) {
        final LogSessionId a = bhd.a();
        if (!a.equals((Object)LogSessionId.LOG_SESSION_ID_NONE)) {
            ((MediaFormat)blx.b).setString("log-session-id", a.getStringId());
        }
    }
    
    public static int b(final btn btn, final byte[] array, final int n, final int n2) {
        int i;
        int n5 = 0;
        for (i = 0; i < n2; i += n5) {
            final int n3 = n2 - i;
            final btg btg = (btg)btn;
            btg.i(n3);
            final int f = btg.f;
            final int e = btg.e;
            final int n4 = f - e;
            Label_0142: {
                if (n4 == 0) {
                    n5 = btg.b(btg.d, e, n3, 0, true);
                    if (n5 == -1) {
                        n5 = -1;
                        break Label_0142;
                    }
                    btg.f += n5;
                }
                else {
                    n5 = Math.min(n3, n4);
                }
                System.arraycopy(btg.d, btg.e, array, n + i, n5);
                btg.e += n5;
            }
            if (n5 == -1) {
                break;
            }
        }
        return i;
    }
    
    public static void c(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw azb.a(s, null);
    }
    
    public static boolean d(final btn btn, final byte[] array, final int n, final int n2) {
        try {
            btn.k(array, n, n2);
            return true;
        }
        catch (final EOFException ex) {
            return false;
        }
    }
    
    public static boolean e(final btn btn, final int n) {
        try {
            btn.m(n);
            return true;
        }
        catch (final EOFException ex) {
            return false;
        }
    }
    
    public static boolean f(final btn btn, final byte[] array, final int n, final boolean b) {
        try {
            return btn.o(array, 0, n, b);
        }
        catch (final EOFException ex) {
            if (b) {
                return false;
            }
            throw ex;
        }
    }
    
    public static Display g(final Object o) {
        try {
            return ((MediaRouter$RouteInfo)o).getPresentationDisplay();
        }
        catch (final NoSuchMethodError noSuchMethodError) {
            Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", (Throwable)noSuchMethodError);
            return null;
        }
    }
}
