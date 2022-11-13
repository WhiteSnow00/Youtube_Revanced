import android.view.View$MeasureSpec;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import android.net.Uri;
import java.util.Collection;
import android.os.Bundle;
import android.media.MediaRoute2Info;
import android.media.MediaDrmResetException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkw
{
    public static volatile dxr a;
    
    public bkw() {
    }
    
    public bkw(final byte[] array) {
        throw new UnsupportedOperationException();
    }
    
    public static boolean a(final Throwable t) {
        return t instanceof MediaDrmResetException;
    }
    
    public static final boy b(final boy... array) {
        return (boy)new bnd(array);
    }
    
    public static ccc c(final MediaRoute2Info mediaRoute2Info) {
        if (mediaRoute2Info == null) {
            return null;
        }
        final ccb ccb = new ccb(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
        ccb.d(mediaRoute2Info.getConnectionState());
        ccb.l(mediaRoute2Info.getVolumeHandling());
        ccb.m(mediaRoute2Info.getVolumeMax());
        ccb.k(mediaRoute2Info.getVolume());
        ccb.h(mediaRoute2Info.getExtras());
        ccb.g(true);
        ((Bundle)ccb.a).putBoolean("canDisconnect", false);
        final CharSequence description = mediaRoute2Info.getDescription();
        if (description != null) {
            ccb.e(description.toString());
        }
        final Uri iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            ((Bundle)ccb.a).putString("iconUri", iconUri.toString());
        }
        final Bundle extras = mediaRoute2Info.getExtras();
        if (extras != null && extras.containsKey("androidx.mediarouter.media.KEY_EXTRAS") && extras.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") && extras.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            ccb.h(extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
            ccb.f(extras.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
            ccb.i(extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
            final ArrayList parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
            if (parcelableArrayList != null) {
                ccb.c((Collection)parcelableArrayList);
            }
            return ccb.a();
        }
        return null;
    }
    
    public static List d(final List list) {
        if (list == null) {
            return new ArrayList();
        }
        final ArrayList list2 = new ArrayList();
        for (final MediaRoute2Info mediaRoute2Info : list) {
            if (mediaRoute2Info != null) {
                list2.add(mediaRoute2Info.getId());
            }
        }
        return list2;
    }
    
    public static void e() {
        if (dyp.e) {
            return;
        }
        if (f()) {
            return;
        }
        throw new IllegalStateException("This must run on the main thread; but is running on ".concat(String.valueOf(Thread.currentThread().getName())));
    }
    
    public static boolean f() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
    
    public static int g(int mode, final int n) {
        final int mode2 = View$MeasureSpec.getMode(mode);
        if (mode2 == Integer.MIN_VALUE) {
            return Math.min(View$MeasureSpec.getSize(mode), n);
        }
        if (mode2 == 0) {
            return n;
        }
        if (mode2 == 1073741824) {
            return View$MeasureSpec.getSize(mode);
        }
        mode = View$MeasureSpec.getMode(mode);
        final StringBuilder sb = new StringBuilder("Unexpected size mode: ");
        sb.append(mode);
        throw new IllegalStateException(sb.toString());
    }
    
    public static int h(final float n, int n2) {
        if (--n2 == 0) {
            return View$MeasureSpec.makeMeasureSpec(0, 0);
        }
        if (n2 != 1) {
            return View$MeasureSpec.makeMeasureSpec(bku.r(n), Integer.MIN_VALUE);
        }
        return View$MeasureSpec.makeMeasureSpec(bku.r(n), 1073741824);
    }
    
    public static boolean i(int n, int n2, final int n3) {
        final int mode = View$MeasureSpec.getMode(n2);
        final int size = View$MeasureSpec.getSize(n2);
        final int mode2 = View$MeasureSpec.getMode(n);
        final int size2 = View$MeasureSpec.getSize(n);
        if (n != n2) {
            if ((n = mode2) == 0) {
                if (mode == 0) {
                    return true;
                }
                n = 0;
            }
            if (mode != 1073741824 || size != n3) {
                n2 = n;
                if (mode == Integer.MIN_VALUE && (n2 = n) == 0) {
                    if (size >= n3) {
                        return true;
                    }
                    n2 = 0;
                }
                if (n2 != Integer.MIN_VALUE || mode != Integer.MIN_VALUE || size2 <= size || n3 > size) {
                    return false;
                }
            }
        }
        return true;
    }
}
