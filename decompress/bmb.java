import android.media.MediaRouter$Callback;
import android.media.MediaRouter;
import java.util.List;
import android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint;
import android.media.MediaCodecInfo$VideoCapabilities;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bmb
{
    public bmb() {
        throw new UnsupportedOperationException();
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
    
    public static void b(final long n, final bat bat, final bug[] array) {
        while (true) {
            final int a = bat.a();
            final boolean b = true;
            if (a <= 1) {
                break;
            }
            final int f = f(bat);
            final int f2 = f(bat);
            final int n2 = bat.b + f2;
            int c;
            if (f2 != -1 && f2 <= bat.a()) {
                c = n2;
                if (f == 4) {
                    c = n2;
                    if (f2 >= 8) {
                        final int i = bat.i();
                        int m = bat.m();
                        int d;
                        if (m == 49) {
                            d = bat.d();
                            m = 49;
                        }
                        else {
                            d = 0;
                        }
                        final int j = bat.i();
                        int n3 = m;
                        if (m == 47) {
                            bat.H(1);
                            n3 = 47;
                        }
                        boolean b2 = i == 181 && (n3 == 49 || n3 == 47) && j == 3;
                        if (n3 == 49) {
                            b2 &= (d == 1195456820 && b);
                        }
                        c = n2;
                        if (b2) {
                            c(n, bat, array);
                            c = n2;
                        }
                    }
                }
            }
            else {
                baq.c("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                c = bat.c;
            }
            bat.G(c);
        }
    }
    
    public static void c(final long n, final bat bat, final bug[] array) {
        final int i = bat.i();
        if ((i & 0x40) != 0x0) {
            bat.H(1);
            final int b = bat.b;
            for (int length = array.length, j = 0; j < length; ++j) {
                final int n2 = (i & 0x1F) * 3;
                final bug bug = array[j];
                bat.G(b);
                bug.c(bat, n2);
                if (n != -9223372036854775807L) {
                    bug.e(n, 1, n2, 0, (buf)null);
                }
            }
        }
    }
    
    public static void d(final Object o, final Object o2) {
        ((MediaRouter)o).removeCallback((MediaRouter$Callback)o2);
    }
    
    public static Object e(final Object o) {
        return ((MediaRouter)o).getSelectedRoute(8388611);
    }
    
    private static int f(final bat bat) {
        int n = 0;
        while (bat.a() != 0) {
            final int i = bat.i();
            n += i;
            if (i != 255) {
                return n;
            }
        }
        return -1;
    }
}
