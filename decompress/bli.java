import android.view.View$MeasureSpec;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import android.util.DisplayMetrics;
import android.media.MediaRouter$RouteInfo;
import android.media.MediaDrm$PlaybackComponent;
import android.media.metrics.LogSessionId;
import android.media.MediaDrm;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bli
{
    public bli() {
    }
    
    public bli(final byte[] array) {
        throw new UnsupportedOperationException();
    }
    
    public static void a(final MediaDrm mediaDrm, final byte[] array, final bhd bhd) {
        final LogSessionId a = bhd.a();
        if (!a.equals((Object)LogSessionId.LOG_SESSION_ID_NONE)) {
            final MediaDrm$PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(array);
            bad.b(playbackComponent);
            playbackComponent.setLogSessionId(a);
        }
    }
    
    public static boolean b(final MediaDrm mediaDrm, final String s) {
        return mediaDrm.requiresSecureDecoder(s);
    }
    
    public static final bpb c(final bpb... array) {
        return new bng(array);
    }
    
    public static int d(final Object o) {
        return ((MediaRouter$RouteInfo)o).getVolume();
    }
    
    public static float e(final DisplayMetrics displayMetrics, final int n) {
        return n / displayMetrics.density + 0.5f;
    }
    
    public static int f(final DisplayMetrics displayMetrics, final float n) {
        final double n2 = n * displayMetrics.density;
        Double.isNaN(n2);
        return (int)(n2 + 0.5);
    }
    
    public static dsv g(final dta dta, final List list, final int n, final int n2, final float n3, final int n4, final egy egy, final int n5, final int n6, final egy egy2) {
        final DisplayMetrics displayMetrics = dta.b().getDisplayMetrics();
        final afgh o = afgh.o(list);
        if (n > n2) {
            final eeq b = eer.b(dta);
            b.f();
            b.e(0.0f);
            ((dsu)b).R(e(displayMetrics, n - n2));
            list.add(b.c());
        }
        else {
            final eeq b2 = eer.b(dta);
            b2.f();
            b2.e(0.0f);
            float n7 = n3;
            if (n3 < 0.0f) {
                n7 = 0.0f;
            }
            ((dsu)b2).R(n7);
            list.add(b2.c());
        }
        list.addAll(o);
        if (n > n2) {
            final eeq b3 = eer.b(dta);
            b3.f();
            b3.e(0.0f);
            ((dsu)b3).R(e(displayMetrics, n - n2));
            list.add(b3.c());
        }
        final dwq b4 = dwr.b(dta);
        b4.f(egy);
        b4.ab(n5);
        b4.l(n6);
        b4.c(egy2);
        if (n4 == 4) {
            b4.aa();
        }
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            b4.h(((dsw)iterator.next()).j());
        }
        return (dsv)b4;
    }
    
    public static int h(final int n, final int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(View$MeasureSpec.getSize(n), n2);
        }
        if (mode == 0) {
            return n2;
        }
        if (mode == 1073741824) {
            return View$MeasureSpec.getSize(n);
        }
        throw new IllegalStateException("Unexpected size spec mode");
    }
    
    public static int i(final int n) {
        final int mode = View$MeasureSpec.getMode(n);
        if (mode == Integer.MIN_VALUE) {
            return View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n), Integer.MIN_VALUE);
        }
        if (mode == 0) {
            return View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n), 0);
        }
        if (mode == 1073741824) {
            return View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n), 1073741824);
        }
        throw new IllegalStateException("Unexpected size spec mode");
    }
    
    public static void j(int n, int b, final float n2, final dwt dwt) {
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(n);
        final double n3 = size / n2;
        final int mode2 = View$MeasureSpec.getMode(b);
        final int size2 = View$MeasureSpec.getSize(b);
        b = (int)Math.ceil(n3);
        final int a = (int)Math.ceil(size2 * n2);
        n = mode;
        if (mode == 0) {
            n = 0;
            if (mode2 == 0) {
                dwt.a = 0;
                dwt.b = 0;
                return;
            }
        }
        if (n == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            if (b > size2) {
                dwt.a = a;
                dwt.b = size2;
                return;
            }
            dwt.a = size;
            dwt.b = b;
        }
        else if (n == 1073741824) {
            dwt.a = size;
            if (mode2 != 0 && b > size2) {
                dwt.b = size2;
                return;
            }
            dwt.b = b;
        }
        else if (mode2 == 1073741824) {
            dwt.b = size2;
            if (n != 0 && a > size) {
                dwt.a = size;
                return;
            }
            dwt.a = a;
        }
        else {
            if (n == Integer.MIN_VALUE) {
                dwt.a = size;
                dwt.b = b;
                return;
            }
            if (mode2 == Integer.MIN_VALUE) {
                dwt.a = a;
                dwt.b = size2;
            }
        }
    }
}
