import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import android.net.Uri;
import java.util.Collection;
import android.os.Bundle;
import android.media.MediaRoute2Info;
import java.util.concurrent.atomic.AtomicReference;
import android.media.MediaDrmResetException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkz
{
    public static boolean a(final Throwable t) {
        return t instanceof MediaDrmResetException;
    }
    
    public static void b(final AtomicReference atomicReference, final Object o) {
        while (!atomicReference.compareAndSet(null, o)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
    }
    
    public static ccf c(final MediaRoute2Info mediaRoute2Info) {
        if (mediaRoute2Info == null) {
            return null;
        }
        final cce cce = new cce(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
        cce.d(mediaRoute2Info.getConnectionState());
        cce.l(mediaRoute2Info.getVolumeHandling());
        cce.m(mediaRoute2Info.getVolumeMax());
        cce.k(mediaRoute2Info.getVolume());
        cce.h(mediaRoute2Info.getExtras());
        cce.g(true);
        ((Bundle)cce.a).putBoolean("canDisconnect", false);
        final CharSequence description = mediaRoute2Info.getDescription();
        if (description != null) {
            cce.e(description.toString());
        }
        final Uri iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            ((Bundle)cce.a).putString("iconUri", iconUri.toString());
        }
        final Bundle extras = mediaRoute2Info.getExtras();
        if (extras != null && extras.containsKey("androidx.mediarouter.media.KEY_EXTRAS") && extras.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") && extras.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            cce.h(extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
            cce.f(extras.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
            cce.i(extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
            final ArrayList parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
            if (parcelableArrayList != null) {
                cce.c(parcelableArrayList);
            }
            return cce.a();
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
    
    public static void e(final ebs ebs, final Map map, final due due) {
        final boolean a = dys.a;
        if (map == null) {
            return;
        }
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            ((ebl)ebs).a((String)entry.getKey(), (Object)entry.getValue());
        }
        ebs.c = (med)due.b;
    }
    
    public static dwn f(final dta dta, final int n, final dzw dzw, final dzw dzw2) {
        final med p4 = dta.p();
        if (p4 == null) {
            return null;
        }
        final dwn v = bkx.v(dta, p4, p4.u(dta, n));
        if (v != null) {
            final String s = "null";
            String f;
            if (dzw == null) {
                f = "null";
            }
            else {
                f = dzw.f;
            }
            v.a("section_current", f);
            String f2;
            if (dzw2 == null) {
                f2 = s;
            }
            else {
                f2 = dzw2.f;
            }
            v.a("section_next", f2);
        }
        return v;
    }
    
    public static final void g(final dzv dzv, final cyd cyd) {
        ((List<dzw>)cyd.a).add(dzv.a());
    }
}
