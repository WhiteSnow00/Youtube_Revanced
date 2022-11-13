import java.util.Iterator;
import java.util.Map;
import android.media.MediaRouter$Callback;
import android.media.MediaRouter;
import java.io.EOFException;
import java.util.List;
import android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint;
import android.media.MediaCodecInfo$VideoCapabilities;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bly
{
    public bly() {
        throw new UnsupportedOperationException();
    }
    
    public bly(final byte[] array) {
    }
    
    public static int a(final MediaCodecInfo$VideoCapabilities mediaCodecInfo$VideoCapabilities, int i, final int n, final double n2) {
        final List supportedPerformancePoints = mediaCodecInfo$VideoCapabilities.getSupportedPerformancePoints();
        final int n3 = 0;
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            final MediaCodecInfo$VideoCapabilities$PerformancePoint mediaCodecInfo$VideoCapabilities$PerformancePoint = new MediaCodecInfo$VideoCapabilities$PerformancePoint(i, n, (int)n2);
            for (i = n3; i < supportedPerformancePoints.size(); ++i) {
                if (supportedPerformancePoints.get(i).covers(mediaCodecInfo$VideoCapabilities$PerformancePoint)) {
                    return 2;
                }
            }
            return 1;
        }
        return 0;
    }
    
    public static int b(final btk btk, final byte[] array, final int n, final int n2) {
        int i;
        int n5 = 0;
        for (i = 0; i < n2; i += n5) {
            final int n3 = n2 - i;
            final btd btd = (btd)btk;
            btd.i(n3);
            final int f = btd.f;
            final int e = btd.e;
            final int n4 = f - e;
            Label_0142: {
                if (n4 == 0) {
                    n5 = btd.b(btd.d, e, n3, 0, true);
                    if (n5 == -1) {
                        n5 = -1;
                        break Label_0142;
                    }
                    btd.f += n5;
                }
                else {
                    n5 = Math.min(n3, n4);
                }
                System.arraycopy(btd.d, btd.e, array, n + i, n5);
                btd.e += n5;
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
        throw aza.a(s, (Throwable)null);
    }
    
    public static boolean d(final btk btk, final byte[] array, final int n, final int n2) {
        try {
            btk.k(array, n, n2);
            return true;
        }
        catch (final EOFException ex) {
            return false;
        }
    }
    
    public static boolean e(final btk btk, final int n) {
        try {
            btk.m(n);
            return true;
        }
        catch (final EOFException ex) {
            return false;
        }
    }
    
    public static boolean f(final btk btk, final byte[] array, final int n, final boolean b) {
        try {
            return btk.o(array, 0, n, b);
        }
        catch (final EOFException ex) {
            if (b) {
                return false;
            }
            throw ex;
        }
    }
    
    public static void g(final Object o, final Object o2) {
        ((MediaRouter)o).removeCallback((MediaRouter$Callback)o2);
    }
    
    public static Object h(final Object o) {
        return ((MediaRouter)o).getSelectedRoute(8388611);
    }
    
    public static void i(final ebp ebp, final Map map, final dub dub) {
        final boolean a = dyp.a;
        if (map == null) {
            return;
        }
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            ((ebi)ebp).a(entry.getKey(), entry.getValue());
        }
        ebp.c = (msr)dub.b;
    }
    
    public static dwk j(final dsx dsx, final int n, final dzt dzt, final dzt dzt2) {
        final msr q = dsx.q();
        if (q == null) {
            return null;
        }
        final dwk e = bkv.e(dsx, q, q.r(dsx, n));
        if (e != null) {
            final String s = "null";
            String f;
            if (dzt == null) {
                f = "null";
            }
            else {
                f = dzt.f;
            }
            e.a("section_current", f);
            String f2;
            if (dzt2 == null) {
                f2 = s;
            }
            else {
                f2 = dzt2.f;
            }
            e.a("section_next", f2);
        }
        return e;
    }
}
