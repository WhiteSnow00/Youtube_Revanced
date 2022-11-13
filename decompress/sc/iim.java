import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iim implements aezs
{
    public static final iim a;
    public static final iim b;
    public static final iim c;
    public static final iim d;
    public static final iim e;
    public static final iim f;
    public static final iim g;
    public static final iim h;
    public static final iim i;
    public static final iim j;
    public static final iim k;
    public static final iim l;
    public static final iim m;
    public static final iim n;
    public static final iim o;
    public static final iim p;
    public static final iim q;
    public static final iim r;
    public static final iim s;
    public static final iim t;
    private final int u;
    
    static {
        t = new iim(20);
        s = new iim(19);
        r = new iim(18);
        q = new iim(17);
        p = new iim(16);
        o = new iim(15);
        n = new iim(14);
        m = new iim(13);
        l = new iim(12);
        k = new iim(11);
        j = new iim(10);
        i = new iim(9);
        h = new iim(8);
        g = new iim(7);
        f = new iim(6);
        e = new iim(4);
        d = new iim(3);
        c = new iim(2);
        b = new iim(1);
        a = new iim(0);
    }
    
    public iim(final int u) {
        this.u = u;
    }
    
    public final boolean a(final Object o) {
        switch (this.u) {
            default: {
                return (((anbp)o).b & 0x2) != 0x0;
            }
            case 19: {
                return (((anbm)o).b & 0x4) != 0x0;
            }
            case 18: {
                return ((View)o).isClickable();
            }
            case 17: {
                return ((View)o).isClickable();
            }
            case 16: {
                return kbi.p(o);
            }
            case 15: {
                final apkb apkb = (apkb)o;
                return apkb != null && (apkb.b & 0x1000000) != 0x0;
            }
            case 14: {
                final alkh alkh = (alkh)o;
                return alkh != null && (alkh.e & 0x10000000) != 0x0;
            }
            case 13: {
                final alkh alkh2 = (alkh)o;
                return alkh2 != null && (alkh2.c & 0x400000) != 0x0;
            }
            case 12: {
                final alkh alkh3 = (alkh)o;
                return alkh3 != null && (alkh3.d & 0x200000) != 0x0;
            }
            case 11: {
                final ajzr ajzr = (ajzr)o;
                return true;
            }
            case 10: {
                return o instanceof aprf || o instanceof aoki || o instanceof acbj || o instanceof jku || o instanceof jla;
            }
            case 9: {
                return o instanceof jku;
            }
            case 8: {
                final alkh alkh4 = (alkh)o;
                return alkh4 != null && (alkh4.d & 0x80) != 0x0;
            }
            case 7: {
                final aiqj aiqj = (aiqj)o;
                return ((ahbc)aiqj).ry((ahaq)WatchEndpointOuterClass.watchEndpoint) || ((ahbc)aiqj).ry((ahaq)WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint) || ((ahbc)aiqj).ry((ahaq)OfflineWatchEndpointOuterClass.offlineWatchEndpoint);
            }
            case 6: {
                final aiqj aiqj2 = (aiqj)o;
                return ((ahbc)aiqj2).ry((ahaq)WatchEndpointOuterClass.watchEndpoint) || ((ahbc)aiqj2).ry((ahaq)WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint) || ((ahbc)aiqj2).ry((ahaq)OfflineWatchEndpointOuterClass.offlineWatchEndpoint);
            }
            case 5: {
                if (o instanceof acbj) {
                    final aqfg i = fmy.i((acbj)o);
                    if (i != null) {
                        return i.ry((ahaq)ajhr.b);
                    }
                }
                return false;
            }
            case 4: {
                final PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor)o;
                final int b = ine.b;
                return playbackStartDescriptor != null && !TextUtils.isEmpty((CharSequence)playbackStartDescriptor.i());
            }
            case 3: {
                final amul amul = (amul)o;
                return true;
            }
            case 2: {
                final amul amul2 = (amul)o;
                return true;
            }
            case 1: {
                return (boolean)o;
            }
            case 0: {
                final amul amul3 = (amul)o;
                return true;
            }
        }
    }
}
