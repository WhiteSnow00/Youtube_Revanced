// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement.internal;

import android.app.Application$ActivityLifecycleCallbacks;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.ui.player.remoteloaded.a;
import j$.util.Objects;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Bundle;
import java.util.Map;

public class AppMeasurementDynamiteService extends nbq
{
    public nfo a;
    private final Map b;
    
    public AppMeasurementDynamiteService() {
        this.a = null;
        this.b = (Map)new abg();
    }
    
    private final void a() {
        if (this.a != null) {
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }
    
    private final void b(final nbu nbu, final String s) {
        this.a();
        this.a.p().Y(nbu, s);
    }
    
    public void beginAdUnitExposure(final String s, final long n) {
        this.a();
        this.a.b().a(s, n);
    }
    
    public void clearConditionalUserProperty(final String s, final String s2, final Bundle bundle) {
        this.a();
        this.a.k().r(s, s2, bundle);
    }
    
    public void clearMeasurementEnabled(final long n) {
        this.a();
        this.a.k().H((Boolean)null);
    }
    
    public void endAdUnitExposure(final String s, final long n) {
        this.a();
        this.a.b().b(s, n);
    }
    
    public void generateEventId(final nbu nbu) {
        this.a();
        final long q = this.a.p().q();
        this.a();
        this.a.p().X(nbu, q);
    }
    
    public void getAppInstanceId(final nbu nbu) {
        this.a();
        this.a.aB().g((Runnable)new moe(this, nbu, 10));
    }
    
    public void getCachedAppInstanceId(final nbu nbu) {
        this.a();
        this.b(nbu, this.a.k().e());
    }
    
    public void getConditionalUserProperties(final String s, final String s2, final nbu nbu) {
        this.a();
        this.a.aB().g((Runnable)new joq(this, nbu, s, s2, 12));
    }
    
    public void getCurrentScreenClass(final nbu nbu) {
        this.a();
        this.b(nbu, this.a.k().o());
    }
    
    public void getCurrentScreenName(final nbu nbu) {
        this.a();
        this.b(nbu, this.a.k().p());
    }
    
    public void getGmpAppId(final nbu nbu) {
        this.a();
        final ngf k = this.a.k();
        String s = k.x.b;
        if (s == null) {
            try {
                s = nmr.x(((nft)k).K(), k.x.m);
            }
            catch (final IllegalStateException ex) {
                k.x.aA().c.b("getGoogleAppId failed with exception", (Object)ex);
                s = null;
            }
        }
        this.b(nbu, s);
    }
    
    public void getMaxUserProperties(final String s, final nbu nbu) {
        this.a();
        this.a.k().W(s);
        this.a();
        this.a.p().W(nbu, 25);
    }
    
    public void getSessionId(final nbu nbu) {
        this.a();
        final ngf k = this.a.k();
        ((nft)k).aB().g((Runnable)new ngb(k, nbu, 3));
    }
    
    public void getTestFlag(final nbu nbu, final int n) {
        this.a();
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        final nhm p2 = this.a.p();
                        final ngf k = this.a.k();
                        final AtomicReference atomicReference = new AtomicReference();
                        p2.W(nbu, (int)((nft)k).aB().a(atomicReference, 15000L, "int test flag value", (Runnable)new ngb(k, atomicReference, 6)));
                        return;
                    }
                    if (n != 4) {
                        return;
                    }
                    final nhm p3 = this.a.p();
                    final ngf i = this.a.k();
                    final AtomicReference atomicReference2 = new AtomicReference();
                    p3.J(nbu, (boolean)((nft)i).aB().a(atomicReference2, 15000L, "boolean test flag value", (Runnable)new ngb(i, atomicReference2, 2)));
                    return;
                }
                else {
                    final nhm p4 = this.a.p();
                    final ngf j = this.a.k();
                    final AtomicReference atomicReference3 = new AtomicReference();
                    final double doubleValue = (double)((nft)j).aB().a(atomicReference3, 15000L, "double test flag value", (Runnable)new ngb(j, atomicReference3, 7));
                    final Bundle bundle = new Bundle();
                    bundle.putDouble("r", doubleValue);
                    try {
                        nbu.a(bundle);
                        return;
                    }
                    catch (final RemoteException ex) {
                        p4.x.aA().f.b("Error returning double value to wrapper", (Object)ex);
                        return;
                    }
                }
            }
            final nhm p5 = this.a.p();
            final ngf l = this.a.k();
            final AtomicReference atomicReference4 = new AtomicReference();
            p5.X(nbu, (long)((nft)l).aB().a(atomicReference4, 15000L, "long test flag value", (Runnable)new ngb(l, atomicReference4, 5)));
            return;
        }
        final nhm p6 = this.a.p();
        final ngf m = this.a.k();
        final AtomicReference atomicReference5 = new AtomicReference();
        p6.Y(nbu, (String)((nft)m).aB().a(atomicReference5, 15000L, "String test flag value", (Runnable)new ngb(m, atomicReference5, 4)));
    }
    
    public void getUserProperties(final String s, final String s2, final boolean b, final nbu nbu) {
        this.a();
        this.a.aB().g((Runnable)new ndg(this, nbu, s, s2, b, 0));
    }
    
    public void initForTests(final Map map) {
        this.a();
    }
    
    public void initialize(final mvn mvn, final InitializationParams initializationParams, final long n) {
        final nfo a = this.a;
        if (a == null) {
            final Context context = (Context)mvm.b(mvn);
            kgk.aL((Object)context);
            this.a = nfo.j(context, initializationParams, Long.valueOf(n));
            return;
        }
        a.aA().f.a("Attempting to initialize multiple times");
    }
    
    public void isDataCollectionEnabled(final nbu nbu) {
        this.a();
        this.a.aB().g((Runnable)new moe(this, nbu, 12));
    }
    
    public void logEvent(final String s, final String s2, final Bundle bundle, final boolean b, final boolean b2, final long n) {
        this.a();
        this.a.k().u(s, s2, bundle, b, b2, n);
    }
    
    public void logEventAndBundle(final String s, final String s2, final Bundle bundle, final nbu nbu, final long n) {
        this.a();
        kgk.aV(s2);
        Bundle bundle2;
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        }
        else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.a.aB().g((Runnable)new joq(this, nbu, new EventParcel(s2, new EventParams(bundle), "app", n), s, 11));
    }
    
    public void logHealthData(final int n, final String s, final mvn mvn, final mvn mvn2, final mvn mvn3) {
        this.a();
        final Object o = null;
        Object b;
        if (mvn == null) {
            b = null;
        }
        else {
            b = mvm.b(mvn);
        }
        Object b2;
        if (mvn2 == null) {
            b2 = null;
        }
        else {
            b2 = mvm.b(mvn2);
        }
        Object b3;
        if (mvn3 == null) {
            b3 = o;
        }
        else {
            b3 = mvm.b(mvn3);
        }
        this.a.aA().e(n, true, false, s, b, b2, b3);
    }
    
    public void onActivityCreated(final mvn mvn, final Bundle bundle, final long n) {
        this.a();
        final nge b = this.a.k().b;
        if (b != null) {
            this.a.k().s();
            ((Application$ActivityLifecycleCallbacks)b).onActivityCreated((Activity)mvm.b(mvn), bundle);
        }
    }
    
    public void onActivityDestroyed(final mvn mvn, final long n) {
        this.a();
        final nge b = this.a.k().b;
        if (b != null) {
            this.a.k().s();
            ((Application$ActivityLifecycleCallbacks)b).onActivityDestroyed((Activity)mvm.b(mvn));
        }
    }
    
    public void onActivityPaused(final mvn mvn, final long n) {
        this.a();
        final nge b = this.a.k().b;
        if (b != null) {
            this.a.k().s();
            ((Application$ActivityLifecycleCallbacks)b).onActivityPaused((Activity)mvm.b(mvn));
        }
    }
    
    public void onActivityResumed(final mvn mvn, final long n) {
        this.a();
        final nge b = this.a.k().b;
        if (b != null) {
            this.a.k().s();
            ((Application$ActivityLifecycleCallbacks)b).onActivityResumed((Activity)mvm.b(mvn));
        }
    }
    
    public void onActivitySaveInstanceState(final mvn mvn, final nbu nbu, final long n) {
        this.a();
        final nge b = this.a.k().b;
        final Bundle bundle = new Bundle();
        if (b != null) {
            this.a.k().s();
            ((Application$ActivityLifecycleCallbacks)b).onActivitySaveInstanceState((Activity)mvm.b(mvn), bundle);
        }
        try {
            nbu.a(bundle);
        }
        catch (final RemoteException ex) {
            this.a.aA().f.b("Error returning bundle value to wrapper", (Object)ex);
        }
    }
    
    public void onActivityStarted(final mvn mvn, final long n) {
        this.a();
        if (this.a.k().b != null) {
            this.a.k().s();
            final Activity activity = (Activity)mvm.b(mvn);
        }
    }
    
    public void onActivityStopped(final mvn mvn, final long n) {
        this.a();
        if (this.a.k().b != null) {
            this.a.k().s();
            final Activity activity = (Activity)mvm.b(mvn);
        }
    }
    
    public void performAction(final Bundle bundle, final nbu nbu, final long n) {
        this.a();
        nbu.a((Bundle)null);
    }
    
    public void registerOnMeasurementEventListener(final nbw nbw) {
        this.a();
        synchronized (this.b) {
            ndh ndh;
            if ((ndh = this.b.get(nbw.a())) == null) {
                ndh = new ndh(this, nbw);
                this.b.put(nbw.a(), ndh);
            }
            monitorexit(this.b);
            final ngf k = this.a.k();
            ((nde)k).a();
            if (!k.c.add(ndh)) {
                ((nft)k).aA().f.a("OnEventListener already registered");
            }
        }
    }
    
    public void resetAnalyticsData(final long n) {
        this.a();
        final ngf k = this.a.k();
        k.C((String)null);
        ((nft)k).aB().g((Runnable)new gtg(k, n, 11));
    }
    
    public void setConditionalUserProperty(final Bundle bundle, final long n) {
        this.a();
        if (bundle == null) {
            this.a.aA().c.a("Conditional user property must not be null");
            return;
        }
        this.a.k().D(bundle, n);
    }
    
    public void setConsent(final Bundle bundle, final long n) {
        this.a();
        final ngf k = this.a.k();
        ((nft)k).aB().h((Runnable)new hbw(k, bundle, n, 7));
    }
    
    public void setConsentThirdParty(final Bundle bundle, final long n) {
        this.a();
        this.a.k().E(bundle, -20, n);
    }
    
    public void setCurrentScreen(final mvn mvn, final String s, String s2, final long n) {
        this.a();
        final ngm m = this.a.m();
        final Activity activity = (Activity)mvm.b(mvn);
        if (!((nft)m).L().r()) {
            ((nft)m).aA().h.a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        final ngk b = m.b;
        if (b == null) {
            ((nft)m).aA().h.a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (m.e.get(activity) == null) {
            ((nft)m).aA().h.a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        String u;
        if ((u = s2) == null) {
            u = m.u((Class)activity.getClass());
        }
        final boolean equals = Objects.equals((Object)b.b, (Object)u);
        final boolean equals2 = Objects.equals((Object)b.a, (Object)s);
        if (equals && equals2) {
            ((nft)m).aA().h.a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        Label_0223: {
            if (s != null) {
                if (s.length() > 0) {
                    ((nft)m).L();
                    if (s.length() <= 100) {
                        break Label_0223;
                    }
                }
                ((nft)m).aA().h.b("Invalid screen name length in setCurrentScreen. Length", (Object)s.length());
                return;
            }
        }
        Label_0274: {
            if (u != null) {
                if (u.length() > 0) {
                    ((nft)m).L();
                    if (u.length() <= 100) {
                        break Label_0274;
                    }
                }
                ((nft)m).aA().h.b("Invalid class name length in setCurrentScreen. Length", (Object)u.length());
                return;
            }
        }
        final neq k = ((nft)m).aA().k;
        if (s == null) {
            s2 = "null";
        }
        else {
            s2 = s;
        }
        k.c("Setting current screen to name, class", (Object)s2, (Object)u);
        final ngk ngk = new ngk(s, u, ((nft)m).P().q());
        m.e.put(activity, ngk);
        m.q(activity, ngk, true);
    }
    
    public void setDataCollectionEnabled(final boolean b) {
        this.a();
        final ngf k = this.a.k();
        ((nde)k).a();
        ((nft)k).aB().g((Runnable)new a(k, b, 2));
    }
    
    public void setDefaultEventParameters(Bundle bundle) {
        this.a();
        final ngf k = this.a.k();
        if (bundle == null) {
            bundle = null;
        }
        else {
            bundle = new Bundle(bundle);
        }
        ((nft)k).aB().g((Runnable)new moe(k, bundle, 19));
    }
    
    public void setEventInterceptor(final nbw nbw) {
        this.a();
        final ndh ndh = new ndh(this, nbw);
        if (this.a.aB().i()) {
            this.a.k().Z(ndh);
            return;
        }
        this.a.aB().g((Runnable)new moe(this, ndh, 11, null));
    }
    
    public void setInstanceIdProvider(final nby nby) {
        this.a();
    }
    
    public void setMeasurementEnabled(final boolean b, final long n) {
        this.a();
        this.a.k().H(Boolean.valueOf(b));
    }
    
    public void setMinimumSessionDuration(final long n) {
        this.a();
    }
    
    public void setSessionTimeoutDuration(final long n) {
        this.a();
        final ngf k = this.a.k();
        ((nft)k).aB().g((Runnable)new gtg(k, n, 10));
    }
    
    public void setUserId(final String s, final long n) {
        this.a();
        final ngf k = this.a.k();
        if (s != null && TextUtils.isEmpty((CharSequence)s)) {
            k.x.aA().f.a("User ID must be non-empty or null");
            return;
        }
        ((nft)k).aB().g((Runnable)new moe(k, s, 20));
        k.T((String)null, "_id", (Object)s, true, n);
    }
    
    public void setUserProperty(final String s, final String s2, final mvn mvn, final boolean b, final long n) {
        this.a();
        this.a.k().T(s, s2, mvm.b(mvn), b, n);
    }
    
    public void unregisterOnMeasurementEventListener(final nbw nbw) {
        this.a();
        Object b = this.b;
        synchronized (b) {
            final ndh ndh = this.b.remove(nbw.a());
            monitorexit(b);
            b = ndh;
            if (ndh == null) {
                b = new ndh(this, nbw);
            }
            final ngf k = this.a.k();
            ((nde)k).a();
            if (!k.c.remove(b)) {
                ((nft)k).aA().f.a("OnEventListener had not been registered");
            }
        }
    }
}
