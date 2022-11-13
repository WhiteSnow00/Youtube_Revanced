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

public final class cca extends cci
{
    final MediaRouter2 a;
    final Map b;
    public List c;
    final pvh d;
    private final MediaRouter2$RouteCallback m;
    private final MediaRouter2$TransferCallback n;
    private final MediaRouter2$ControllerCallback o;
    private final Handler p;
    private final Executor q;
    private final Map r;
    
    public cca(final Context context, final pvh d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(context);
        this.b = (Map)new ArrayMap();
        this.n = (MediaRouter2$TransferCallback)new cbz(this);
        this.o = (MediaRouter2$ControllerCallback)new cbt(this);
        this.c = new ArrayList();
        this.r = (Map)new ArrayMap();
        this.a = MediaRouter2.getInstance(context);
        this.d = d;
        final Handler p6 = new Handler(Looper.getMainLooper());
        this.p = p6;
        this.q = (Executor)new bqo(p6, 2);
        if (Build$VERSION.SDK_INT >= 33 && aeo.d("UpsideDownCake", Build$VERSION.CODENAME)) {
            this.m = (MediaRouter2$RouteCallback)new cby(this);
            return;
        }
        this.m = (MediaRouter2$RouteCallback)new cbx(this);
    }
    
    public final cch b(final String s) {
        return new cbw(this.r.get(s), null);
    }
    
    public final void d(final ccd ccd) {
        if (dml.c != null) {
            if (dml.q().v > 0) {
                final boolean u = dml.u();
                ccd ccd2;
                if ((ccd2 = ccd) == null) {
                    ccd2 = new ccd(cck.a, false);
                }
                final List b = ccd2.a().b();
                if (u) {
                    if (!b.contains("android.media.intent.category.LIVE_AUDIO")) {
                        b.add("android.media.intent.category.LIVE_AUDIO");
                    }
                }
                else {
                    b.remove("android.media.intent.category.LIVE_AUDIO");
                }
                final elx elx = new elx();
                elx.n((Collection)b);
                final ccd ccd3 = new ccd(elx.m(), ccd2.b());
                final MediaRouter2 a = this.a;
                final Executor q = this.q;
                final MediaRouter2$RouteCallback m = this.m;
                RouteDiscoveryPreference routeDiscoveryPreference;
                if (!ccd3.c()) {
                    routeDiscoveryPreference = new RouteDiscoveryPreference$Builder((List)new ArrayList(), false).build();
                }
                else {
                    final boolean b2 = ccd3.b();
                    final ArrayList list = new ArrayList();
                    for (String s : ccd3.a().b()) {
                        final int hashCode = s.hashCode();
                        int n = 0;
                        Label_0288: {
                            if (hashCode != -2065577523) {
                                if (hashCode != 956939050) {
                                    if (hashCode == 975975375) {
                                        if (s.equals("android.media.intent.category.LIVE_VIDEO")) {
                                            n = 1;
                                            break Label_0288;
                                        }
                                    }
                                }
                                else if (s.equals("android.media.intent.category.LIVE_AUDIO")) {
                                    n = 0;
                                    break Label_0288;
                                }
                            }
                            else if (s.equals("android.media.intent.category.REMOTE_PLAYBACK")) {
                                n = 2;
                                break Label_0288;
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
            final ccc c2 = bkw.c(mediaRoute2Info3);
            if (mediaRoute2Info3 != null) {
                list.add(c2);
            }
        }
        final tqv tqv = new tqv((byte[])null, (byte[])null);
        tqv.a = true;
        if (!list.isEmpty()) {
            final Iterator iterator4 = list.iterator();
            while (iterator4.hasNext()) {
                tqv.c((ccc)iterator4.next());
            }
        }
        this.le(tqv.b());
    }
    
    final void f(final MediaRouter2$RoutingController mediaRouter2$RoutingController) {
        final cbv cbv = this.b.get(mediaRouter2$RoutingController);
        if (cbv == null) {
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
        final List d = bkw.d(selectedRoutes);
        final ccc c = bkw.c(selectedRoutes.get(0));
        final Bundle controlHints = mediaRouter2$RoutingController.getControlHints();
        final String string = super.e.getString(2132018691);
        final ccc ccc = null;
        String s = string;
        ccc l = ccc;
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
                l = ccc;
                if (bundle != null) {
                    s = s2;
                    l = ccc.l(bundle);
                    s = s2;
                }
            }
            catch (final Exception ex) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", (Throwable)ex);
                l = ccc;
            }
        }
        ccb ccb;
        if (l == null) {
            ccb = new ccb(mediaRouter2$RoutingController.getId(), s);
            ccb.d(2);
            ccb.i(1);
        }
        else {
            ccb = new ccb(l);
        }
        ccb.k(mediaRouter2$RoutingController.getVolume());
        ccb.m(mediaRouter2$RoutingController.getVolumeMax());
        ccb.l(mediaRouter2$RoutingController.getVolumeHandling());
        final Object c2 = ccb.c;
        if (c2 != null) {
            ((ArrayList)c2).clear();
        }
        ccb.c((Collection)c.p());
        final Object b = ccb.b;
        if (b != null) {
            ((ArrayList)b).clear();
        }
        if (!d.isEmpty()) {
            for (final String s3 : d) {
                if (TextUtils.isEmpty((CharSequence)s3)) {
                    throw new IllegalArgumentException("groupMemberId must not be empty");
                }
                if (ccb.b == null) {
                    ccb.b = new ArrayList();
                }
                if (((ArrayList)ccb.b).contains(s3)) {
                    continue;
                }
                ((ArrayList)ccb.b).add(s3);
            }
        }
        final ccc a = ccb.a();
        final List d2 = bkw.d(mediaRouter2$RoutingController.getSelectableRoutes());
        final List d3 = bkw.d(mediaRouter2$RoutingController.getDeselectableRoutes());
        final ccj j = super.j;
        if (j == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        final ArrayList list = new ArrayList();
        final List a2 = j.a;
        if (!a2.isEmpty()) {
            for (final ccc ccc2 : a2) {
                final String n = ccc2.n();
                if (ccc2 == null) {
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
                list.add(new argj(ccc2, n2));
            }
        }
        cbv.k(cbv.i = a, list);
    }
    
    public final cce lc(final String s) {
        final Iterator iterator = this.b.entrySet().iterator();
        while (iterator.hasNext()) {
            final cbv cbv = ((Map.Entry<K, cbv>)iterator.next()).getValue();
            if (TextUtils.equals((CharSequence)s, (CharSequence)cbv.a)) {
                return cbv;
            }
        }
        return null;
    }
    
    public final cch ld(final String s, final String s2) {
        final String s3 = this.r.get(s);
        for (final cbv cbv : this.b.values()) {
            final ccc i = cbv.i;
            String s4;
            if (i != null) {
                s4 = i.n();
            }
            else {
                s4 = cbv.b.getId();
            }
            if (TextUtils.equals((CharSequence)s2, (CharSequence)s4)) {
                return new cbw(s3, cbv);
            }
        }
        final StringBuilder sb = new StringBuilder("Could not find the matching GroupRouteController. routeId=");
        sb.append(s);
        sb.append(", routeGroupId=");
        sb.append(s2);
        Log.w("MR2Provider", sb.toString());
        return new cbw(s3, null);
    }
}
