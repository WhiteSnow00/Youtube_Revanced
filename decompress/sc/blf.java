import android.graphics.drawable.Drawable;
import android.media.MediaRouter$RouteInfo;
import android.media.MediaDrm$PlaybackComponent;
import android.media.metrics.LogSessionId;
import android.media.MediaDrm;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blf
{
    public blf() {
        throw new UnsupportedOperationException();
    }
    
    public blf(final List list) {
        Collections.unmodifiableList((List<?>)list);
    }
    
    public static void a(final MediaDrm mediaDrm, final byte[] array, final bha bha) {
        final LogSessionId a = bha.a();
        if (!a.equals((Object)LogSessionId.LOG_SESSION_ID_NONE)) {
            final MediaDrm$PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(array);
            dk.d((Object)playbackComponent);
            playbackComponent.setLogSessionId(a);
        }
    }
    
    public static boolean b(final MediaDrm mediaDrm, final String s) {
        return mediaDrm.requiresSecureDecoder(s);
    }
    
    public static void c(final long n, final bas bas, final bud[] array) {
        while (true) {
            final int a = bas.a();
            final boolean b = true;
            if (a <= 1) {
                break;
            }
            final int h = h(bas);
            final int h2 = h(bas);
            final int n2 = bas.b + h2;
            int c;
            if (h2 != -1 && h2 <= bas.a()) {
                c = n2;
                if (h == 4) {
                    c = n2;
                    if (h2 >= 8) {
                        final int i = bas.i();
                        int m = bas.m();
                        int d;
                        if (m == 49) {
                            d = bas.d();
                            m = 49;
                        }
                        else {
                            d = 0;
                        }
                        final int j = bas.i();
                        int n3 = m;
                        if (m == 47) {
                            bas.H(1);
                            n3 = 47;
                        }
                        boolean b2 = i == 181 && (n3 == 49 || n3 == 47) && j == 3;
                        if (n3 == 49) {
                            b2 &= (d == 1195456820 && b);
                        }
                        c = n2;
                        if (b2) {
                            d(n, bas, array);
                            c = n2;
                        }
                    }
                }
            }
            else {
                bap.c("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                c = bas.c;
            }
            bas.G(c);
        }
    }
    
    public static void d(final long n, final bas bas, final bud[] array) {
        final int i = bas.i();
        if ((i & 0x40) != 0x0) {
            bas.H(1);
            final int b = bas.b;
            for (int length = array.length, j = 0; j < length; ++j) {
                final int n2 = (i & 0x1F) * 3;
                final bud bud = array[j];
                bas.G(b);
                bud.c(bas, n2);
                if (n != -9223372036854775807L) {
                    bud.e(n, 1, n2, 0, (buc)null);
                }
            }
        }
    }
    
    public static int e(final Object o) {
        return ((MediaRouter$RouteInfo)o).getVolume();
    }
    
    public static boolean f(final Drawable drawable, final Drawable drawable2) {
        if (drawable == null) {
            return drawable2 == null;
        }
        if (drawable2 == null) {
            return false;
        }
        if (drawable instanceof dzk && drawable2 instanceof dzk) {
            return ((dzk)drawable).a((dzk)drawable2);
        }
        return drawable.equals(drawable2);
    }
    
    public static final void g(final dzs dzs, final cya cya) {
        ((List<dzt>)cya.a).add(dzs.a());
    }
    
    private static int h(final bas bas) {
        int n = 0;
        while (bas.a() != 0) {
            final int i = bas.i();
            n += i;
            if (i != 255) {
                return n;
            }
        }
        return -1;
    }
}
