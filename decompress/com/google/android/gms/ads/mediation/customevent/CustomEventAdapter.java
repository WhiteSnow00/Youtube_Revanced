// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.ads.mediation.customevent;

import android.os.Bundle;
import android.content.Context;
import android.view.View;

public final class CustomEventAdapter implements mfl, mfn, mfp
{
    static final lzf a;
    mfx b;
    mfy c;
    mfz d;
    
    static {
        a = new lzf(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");
    }
    
    private static Object a(final Class clazz, final String s) {
        try {
            s.getClass();
            return clazz.cast(Class.forName(s).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]));
        }
        finally {
            final Throwable t;
            final String message = t.getMessage();
            final StringBuilder sb = new StringBuilder("Could not instantiate custom event adapter: ");
            sb.append(s);
            sb.append(". ");
            sb.append(message);
            mfe.e(sb.toString());
            return null;
        }
    }
    
    public final View getBannerView() {
        return null;
    }
    
    public final void onDestroy() {
        final mfx b = this.b;
        if (b != null) {
            b.a();
        }
        final mfy c = this.c;
        if (c != null) {
            c.a();
        }
        final mfz d = this.d;
        if (d != null) {
            d.a();
        }
    }
    
    public final void onPause() {
        final mfx b = this.b;
        if (b != null) {
            b.b();
        }
        final mfy c = this.c;
        if (c != null) {
            c.b();
        }
        final mfz d = this.d;
        if (d != null) {
            d.b();
        }
    }
    
    public final void onResume() {
        final mfx b = this.b;
        if (b != null) {
            b.c();
        }
        final mfy c = this.c;
        if (c != null) {
            c.c();
        }
        final mfz d = this.d;
        if (d != null) {
            d.c();
        }
    }
    
    public final void requestBannerAd(final Context context, final mfm mfm, final Bundle bundle, final lzj lzj, final mfj mfj, final Bundle bundle2) {
        final mfx b = (mfx)a(mfx.class, bundle.getString("class_name"));
        this.b = b;
        if (b == null) {
            mfm.g(CustomEventAdapter.a);
            return;
        }
        if (bundle2 != null) {
            bundle2.getBundle(bundle.getString("class_name"));
        }
        final mfx b2 = this.b;
        b2.getClass();
        bundle.getString("parameter");
        b2.d();
    }
    
    public final void requestInterstitialAd(final Context context, final mfo mfo, final Bundle bundle, final mfj mfj, final Bundle bundle2) {
        final mfy c = (mfy)a(mfy.class, bundle.getString("class_name"));
        this.c = c;
        if (c == null) {
            mfo.h(CustomEventAdapter.a);
            return;
        }
        if (bundle2 != null) {
            bundle2.getBundle(bundle.getString("class_name"));
        }
        final mfy c2 = this.c;
        c2.getClass();
        bundle.getString("parameter");
        c2.e();
    }
    
    public final void requestNativeAd(final Context context, final mfq mfq, final Bundle bundle, final mfr mfr, final Bundle bundle2) {
        final mfz d = (mfz)a(mfz.class, bundle.getString("class_name"));
        this.d = d;
        if (d == null) {
            mfq.i(CustomEventAdapter.a);
            return;
        }
        if (bundle2 != null) {
            bundle2.getBundle(bundle.getString("class_name"));
        }
        final mfz d2 = this.d;
        d2.getClass();
        bundle.getString("parameter");
        d2.d();
    }
    
    public final void showInterstitial() {
        final mfy c = this.c;
        if (c != null) {
            c.d();
        }
    }
}
