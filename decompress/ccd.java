import java.util.Set;
import android.text.TextUtils;
import android.media.MediaRouter2$RoutingController;
import android.os.Bundle;
import android.util.Log;
import android.media.MediaRoute2Info;
import android.util.ArraySet;
import java.util.Iterator;
import android.media.RouteDiscoveryPreference;
import android.media.RouteDiscoveryPreference$Builder;
import java.util.Collection;
import android.os.Build$VERSION;
import android.os.Looper;
import java.util.ArrayList;
import android.util.ArrayMap;
import android.content.Context;
import java.util.concurrent.Executor;
import android.os.Handler;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$TransferCallback;
import android.media.MediaRouter2$RouteCallback;
import java.util.List;
import java.util.Map;
import android.media.MediaRouter2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccd extends ccl
{
    final MediaRouter2 a;
    final Map b;
    public List c;
    final oqz d;
    private final MediaRouter2$RouteCallback m;
    private final MediaRouter2$TransferCallback n;
    private final MediaRouter2$ControllerCallback o;
    private final Handler p;
    private final Executor q;
    private final Map r;
    
    public ccd(final Context context, final oqz d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(context);
        this.b = (Map)new ArrayMap();
        this.n = new ccc(this);
        this.o = new cbw(this);
        this.c = new ArrayList();
        this.r = (Map)new ArrayMap();
        this.a = MediaRouter2.getInstance(context);
        this.d = d;
        final Handler p6 = new Handler(Looper.getMainLooper());
        this.p = p6;
        this.q = new bqr(p6, 2);
        if (Build$VERSION.SDK_INT >= 33 && aej.t("UpsideDownCake", Build$VERSION.CODENAME)) {
            this.m = new ccb(this);
            return;
        }
        this.m = new cca(this);
    }
    
    @Override
    public final cck b(final String s) {
        return new cbz(this.r.get(s), null);
    }
    
    @Override
    public final void d(final ccg ccg) {
        if (dmo.c != null) {
            if (dmo.q().v > 0) {
                final boolean u = dmo.u();
                ccg ccg2;
                if ((ccg2 = ccg) == null) {
                    ccg2 = new ccg(ccn.a, false);
                }
                final List b = ccg2.a().b();
                if (u) {
                    if (!b.contains("android.media.intent.category.LIVE_AUDIO")) {
                        b.add("android.media.intent.category.LIVE_AUDIO");
                    }
                }
                else {
                    b.remove("android.media.intent.category.LIVE_AUDIO");
                }
                final ema ema = new ema();
                ema.n((Collection)b);
                final ccg ccg3 = new ccg(ema.m(), ccg2.b());
                final MediaRouter2 a = this.a;
                final Executor q = this.q;
                final MediaRouter2$RouteCallback m = this.m;
                RouteDiscoveryPreference routeDiscoveryPreference;
                if (!ccg3.c()) {
                    routeDiscoveryPreference = new RouteDiscoveryPreference$Builder((List)new ArrayList(), false).build();
                }
                else {
                    final boolean b2 = ccg3.b();
                    final ArrayList list = new ArrayList();
                    for (String s : ccg3.a().b()) {
                        final int hashCode = s.hashCode();
                        int n = 0;
                        Label_0286: {
                            if (hashCode != -2065577523) {
                                if (hashCode != 956939050) {
                                    if (hashCode == 975975375) {
                                        if (s.equals("android.media.intent.category.LIVE_VIDEO")) {
                                            n = 1;
                                            break Label_0286;
                                        }
                                    }
                                }
                                else if (s.equals("android.media.intent.category.LIVE_AUDIO")) {
                                    n = 0;
                                    break Label_0286;
                                }
                            }
                            else if (s.equals("android.media.intent.category.REMOTE_PLAYBACK")) {
                                n = 2;
                                break Label_0286;
                            }
                            n = -1;
                        }
                        if (n != 0) {
                            if (n != 1) {
                                if (n == 2) {
                                    s = "android.media.route.feature.REMOTE_PLAYBACK";
                                }
                            }
                            else {
                                s = "android.media.route.feature.LIVE_VIDEO";
                            }
                        }
                        else {
                            s = "android.media.route.feature.LIVE_AUDIO";
                        }
                        list.add(s);
                    }
                    routeDiscoveryPreference = new RouteDiscoveryPreference$Builder((List)list, b2).build();
                }
                a.registerRouteCallback(q, m, routeDiscoveryPreference);
                this.a.registerTransferCallback(this.q, this.n);
                this.a.registerControllerCallback(this.q, this.o);
                return;
            }
        }
        this.a.unregisterRouteCallback(this.m);
        this.a.unregisterTransferCallback(this.n);
        this.a.unregisterControllerCallback(this.o);
    }
    
    protected final void e() {
        final ArrayList c = new ArrayList();
        final ArraySet set = new ArraySet();
        for (final MediaRoute2Info mediaRoute2Info : this.a.getRoutes()) {
            if (mediaRoute2Info != null && !((Set)set).contains(mediaRoute2Info) && !mediaRoute2Info.isSystemRoute()) {
                ((Set)set).add(mediaRoute2Info);
                c.add(mediaRoute2Info);
            }
        }
        if (c.equals(this.c)) {
            return;
        }
        this.c = c;
        this.r.clear();
        for (final MediaRoute2Info mediaRoute2Info2 : this.c) {
            final Bundle extras = mediaRoute2Info2.getExtras();
            if (extras != null && extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") != null) {
                this.r.put(mediaRoute2Info2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
            else {
                new StringBuilder("Cannot find the original route Id. route=").append(mediaRoute2Info2);
                Log.w("MR2Provider", "Cannot find the original route Id. route=".concat(String.valueOf(mediaRoute2Info2)));
            }
        }
        final ArrayList list = new ArrayList();
        for (final MediaRoute2Info mediaRoute2Info3 : this.c) {
            final ccf c2 = bkz.c(mediaRoute2Info3);
            if (mediaRoute2Info3 != null) {
                list.add(c2);
            }
        }
        final trw trw = new trw((byte[])null, (byte[])null);
        trw.a = true;
        if (!list.isEmpty()) {
            final Iterator iterator4 = list.iterator();
            while (iterator4.hasNext()) {
                trw.c((ccf)iterator4.next());
            }
        }
        this.le(trw.b());
    }
    
    final void f(final MediaRouter2$RoutingController mediaRouter2$RoutingController) {
        final cby cby = this.b.get(mediaRouter2$RoutingController);
        if (cby == null) {
            new StringBuilder("setDynamicRouteDescriptors: No matching routeController found. routingController=").append(mediaRouter2$RoutingController);
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=".concat(String.valueOf(mediaRouter2$RoutingController)));
            return;
        }
        final List selectedRoutes = mediaRouter2$RoutingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            new StringBuilder("setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=").append(mediaRouter2$RoutingController);
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=".concat(String.valueOf(mediaRouter2$RoutingController)));
            return;
        }
        final List d = bkz.d(selectedRoutes);
        final ccf c = bkz.c(selectedRoutes.get(0));
        final Bundle controlHints = mediaRouter2$RoutingController.getControlHints();
        final String string = super.e.getString(2132018693);
        final ccf ccf = null;
        String s = string;
        ccf l = ccf;
        if (controlHints != null) {
            s = string;
            try {
                final String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                String s2 = string;
                s = string;
                if (!TextUtils.isEmpty((CharSequence)string2)) {
                    s2 = string2;
                }
                s = s2;
                final Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                s = s2;
                l = ccf;
                if (bundle != null) {
                    s = s2;
                    l = ccf.l(bundle);
                    s = s2;
                }
            }
            catch (final Exception ex) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", (Throwable)ex);
                l = ccf;
            }
        }
        cce cce;
        if (l == null) {
            cce = new cce(mediaRouter2$RoutingController.getId(), s);
            cce.d(2);
            cce.i(1);
        }
        else {
            cce = new cce(l);
        }
        cce.k(mediaRouter2$RoutingController.getVolume());
        cce.m(mediaRouter2$RoutingController.getVolumeMax());
        cce.l(mediaRouter2$RoutingController.getVolumeHandling());
        final Object c2 = cce.c;
        if (c2 != null) {
            ((ArrayList)c2).clear();
        }
        cce.c(c.p());
        final Object b = cce.b;
        if (b != null) {
            ((ArrayList)b).clear();
        }
        if (!d.isEmpty()) {
            for (final String s3 : d) {
                if (TextUtils.isEmpty((CharSequence)s3)) {
                    throw new IllegalArgumentException("groupMemberId must not be empty");
                }
                if (cce.b == null) {
                    cce.b = new ArrayList();
                }
                if (((ArrayList)cce.b).contains(s3)) {
                    continue;
                }
                ((ArrayList)cce.b).add(s3);
            }
        }
        final ccf a = cce.a();
        final List d2 = bkz.d(mediaRouter2$RoutingController.getSelectableRoutes());
        final List d3 = bkz.d(mediaRouter2$RoutingController.getDeselectableRoutes());
        final ccm j = super.j;
        if (j == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        final ArrayList list = new ArrayList();
        final List a2 = j.a;
        if (!a2.isEmpty()) {
            for (final ccf ccf2 : a2) {
                final String n = ccf2.n();
                if (ccf2 == null) {
                    throw new NullPointerException("descriptor must not be null");
                }
                int n2;
                if (!d.contains(n)) {
                    n2 = 1;
                }
                else {
                    n2 = 3;
                }
                d2.contains(n);
                d3.contains(n);
                list.add(new arjd(ccf2, n2));
            }
        }
        ((cch)cby).k(cby.i = a, list);
    }
    
    @Override
    public final cch lc(final String s) {
        final Iterator iterator = this.b.entrySet().iterator();
        while (iterator.hasNext()) {
            final cby cby = ((Map.Entry<K, cby>)iterator.next()).getValue();
            if (TextUtils.equals((CharSequence)s, (CharSequence)cby.a)) {
                return (cch)cby;
            }
        }
        return null;
    }
    
    @Override
    public final cck ld(final String s, final String s2) {
        final String s3 = this.r.get(s);
        for (final cby cby : this.b.values()) {
            final ccf i = cby.i;
            String s4;
            if (i != null) {
                s4 = i.n();
            }
            else {
                s4 = cby.b.getId();
            }
            if (TextUtils.equals((CharSequence)s2, (CharSequence)s4)) {
                return new cbz(s3, cby);
            }
        }
        final StringBuilder sb = new StringBuilder("Could not find the matching GroupRouteController. routeId=");
        sb.append(s);
        sb.append(", routeGroupId=");
        sb.append(s2);
        Log.w("MR2Provider", sb.toString());
        return new cbz(s3, null);
    }
}
