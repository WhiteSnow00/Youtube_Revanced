// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.ads.mediation.customevent;

import android.os.Bundle;
import android.content.Context;
import android.view.View;

public final class CustomEventAdapter implements mhe, mhg, mhi
{
    static final may a;
    mhq b;
    mhr c;
    mhs d;
    
    static {
        a = new may(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");
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
            mgx.e(sb.toString());
            return null;
        }
    }
    
    public final View getBannerView() {
        return null;
    }
    
    public final void onDestroy() {
        final mhq b = this.b;
        if (b != null) {
            b.a();
        }
        final mhr c = this.c;
        if (c != null) {
            c.a();
        }
        final mhs d = this.d;
        if (d != null) {
            d.a();
        }
    }
    
    public final void onPause() {
        final mhq b = this.b;
        if (b != null) {
            b.b();
        }
        final mhr c = this.c;
        if (c != null) {
            c.b();
        }
        final mhs d = this.d;
        if (d != null) {
            d.b();
        }
    }
    
    public final void onResume() {
        final mhq b = this.b;
        if (b != null) {
            b.c();
        }
        final mhr c = this.c;
        if (c != null) {
            c.c();
        }
        final mhs d = this.d;
        if (d != null) {
            d.c();
        }
    }
    
    public final void requestBannerAd(final Context context, final mhf mhf, final Bundle bundle, final mbc mbc, final mhc mhc, final Bundle bundle2) {
        final mhq b = (mhq)a(mhq.class, bundle.getString("class_name"));
        this.b = b;
        if (b == null) {
            mhf.g(CustomEventAdapter.a);
            return;
        }
        if (bundle2 != null) {
            bundle2.getBundle(bundle.getString("class_name"));
        }
        final mhq b2 = this.b;
        b2.getClass();
        bundle.getString("parameter");
        b2.d();
    }
    
    public final void requestInterstitialAd(final Context context, final mhh mhh, final Bundle bundle, final mhc mhc, final Bundle bundle2) {
        final mhr c = (mhr)a(mhr.class, bundle.getString("class_name"));
        this.c = c;
        if (c == null) {
            mhh.h(CustomEventAdapter.a);
            return;
        }
        if (bundle2 != null) {
            bundle2.getBundle(bundle.getString("class_name"));
        }
        final mhr c2 = this.c;
        c2.getClass();
        bundle.getString("parameter");
        c2.e();
    }
    
    public final void requestNativeAd(final Context context, final mhj mhj, final Bundle bundle, final mhk mhk, final Bundle bundle2) {
        final mhs d = (mhs)a(mhs.class, bundle.getString("class_name"));
        this.d = d;
        if (d == null) {
            mhj.i(CustomEventAdapter.a);
            return;
        }
        if (bundle2 != null) {
            bundle2.getBundle(bundle.getString("class_name"));
        }
        final mhs d2 = this.d;
        d2.getClass();
        bundle.getString("parameter");
        d2.d();
    }
    
    public final void showInterstitial() {
        final mhr c = this.c;
        if (c != null) {
            c.d();
        }
    }
}
