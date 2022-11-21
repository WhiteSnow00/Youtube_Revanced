import java.util.List;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import android.view.ViewGroup;
import android.view.View;
import com.google.apps.tiktok.account.api.controller.ValidationResult;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aafv implements afbk
{
    public static final aafv a;
    public static final aafv b;
    public static final aafv c;
    public static final aafv d;
    public static final aafv e;
    public static final aafv f;
    public static final aafv g;
    public static final aafv h;
    public static final aafv i;
    public static final aafv j;
    public static final aafv k;
    public static final aafv l;
    public static final aafv m;
    public static final aafv n;
    public static final aafv o;
    public static final aafv p;
    public static final aafv q;
    public static final aafv r;
    public static final aafv s;
    public static final aafv t;
    private final int u;
    
    static {
        t = new aafv(19);
        s = new aafv(18);
        r = new aafv(17);
        q = new aafv(16);
        p = new aafv(15);
        o = new aafv(14);
        n = new aafv(13);
        m = new aafv(12);
        l = new aafv(11);
        k = new aafv(10);
        j = new aafv(9);
        i = new aafv(8);
        h = new aafv(7);
        g = new aafv(6);
        f = new aafv(5);
        e = new aafv(4);
        d = new aafv(3);
        c = new aafv(2);
        b = new aafv(1);
        a = new aafv(0);
    }
    
    private aafv(final int u) {
        this.u = u;
    }
    
    @Override
    public final boolean a(Object tag) {
        final int u = this.u;
        boolean b = false;
        final boolean b2 = false;
        switch (u) {
            default: {
                return ((Pair)tag).second != null;
            }
            case 18: {
                return !((ValidationResult)tag).c();
            }
            case 17: {
                final adro adro = (adro)tag;
                final int g = adrm.g;
                return !adro.a();
            }
            case 16: {
                final adoj adoj = (adoj)tag;
                if (!adoj.aj && !adoj.ai) {
                    adog adog;
                    if ((adog = adoj.E) == null) {
                        adog = adog.a;
                    }
                    if (!adgg.t(adog)) {
                        adog adog2;
                        if ((adog2 = adoj.N) == null) {
                            adog2 = adog.a;
                        }
                        if (!adgg.t(adog2)) {
                            return true;
                        }
                    }
                }
                return false;
            }
            case 15: {
                return ((adoj)tag).w;
            }
            case 14: {
                final adoj adoj2 = (adoj)tag;
                return !adoj2.w && !adme.B(adoj2);
            }
            case 13: {
                final adoj adoj3 = (adoj)tag;
                final int t = adlk.t;
                return adoj3.w && !adoj3.x;
            }
            case 12: {
                return ((adoj)tag).w;
            }
            case 11: {
                return ((aocl)tag).b == 64166933;
            }
            case 10: {
                final aoxu aoxu = (aoxu)tag;
                final int d = hlu.d;
                return true;
            }
            case 9: {
                final View view = (View)tag;
                if (view instanceof ViewGroup) {
                    tag = view.getTag(2131432390);
                    if (tag instanceof wzx) {
                        return ((wzx)tag).b;
                    }
                }
                return false;
            }
            case 8: {
                final adhr adhr = (adhr)tag;
                boolean b3 = b2;
                if (adhr != null) {
                    if (((List)adhr.c).isEmpty()) {
                        if (!((List)adhr.b).isEmpty()) {
                            return true;
                        }
                        b3 = b2;
                    }
                    else {
                        b3 = true;
                    }
                }
                return b3;
            }
            case 7: {
                final Float n = (Float)tag;
                final afgh p = acfo.p;
                return n >= 0.0f && n <= 1.0f;
            }
            case 6: {
                final aisc aisc = (aisc)tag;
                return ((ahcu)aisc).ry((ahci)WatchEndpointOuterClass.watchEndpoint) || ((ahcu)aisc).ry((ahci)WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint);
            }
            case 5: {
                final String s = (String)tag;
                if (!TextUtils.isEmpty((CharSequence)s) && s.startsWith("playability_adult_confirmation_time_stamp:")) {
                    b = true;
                }
                else if (aefs.am(s)) {
                    return true;
                }
                return b;
            }
            case 4: {
                return !((abhv)tag).c();
            }
            case 3: {
                return ((abhv)tag).d();
            }
            case 2: {
                final PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor)tag;
                final int h = aafw.h;
                return true;
            }
            case 1: {
                final WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel)tag;
                if (watchNextResponseModel != null) {
                    final aisc c = watchNextResponseModel.c;
                    if (c != null && ((ahcu)c).ry((ahci)OfflineWatchEndpointOuterClass.offlineWatchEndpoint)) {
                        return true;
                    }
                }
                return false;
            }
            case 0: {
                final PlaybackStartDescriptor playbackStartDescriptor2 = (PlaybackStartDescriptor)tag;
                final int h2 = aafw.h;
                return true;
            }
        }
    }
}
