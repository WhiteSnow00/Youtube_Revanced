// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui.presenter.ads.webview;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.ads.ui.webview.AdsWebView;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AdsWebViewCacheController implements tfg, tec
{
    public final Map a;
    private final tdz b;
    private final kct c;
    
    public AdsWebViewCacheController(final tdz b, final kct c, final byte[] array, final byte[] array2) {
        this.a = new HashMap();
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public final void j() {
        final ArrayList list = new ArrayList(this.a.keySet());
        for (int size = list.size(), i = 0; i < size; ++i) {
            this.k((klx)list.get(i));
        }
    }
    
    public final void k(final klx klx) {
        if (!this.a.containsKey(klx)) {
            return;
        }
        final AdsWebView adsWebView = this.a.get(klx);
        if (adsWebView != null) {
            if (adsWebView.getParent() != null) {
                ((ViewGroup)adsWebView.getParent()).removeView((View)adsWebView);
            }
            adsWebView.destroy();
        }
        this.a.remove(klx);
    }
    
    public final void l(final Activity activity, final AdsWebView adsWebView, final String s, final boolean b) {
        if (b) {
            final kct c = this.c;
            try {
                asgn.w((Runnable)new zke(activity, ((lzi)c.a).o(((zki)c.b).c()), s, kct.b(adsWebView))).F(atio.c()).U();
                return;
            }
            catch (final Exception ex) {
                trn.d("Failed to execute GoogleSsoAuthTokenTask.", (Throwable)ex);
                return;
            }
        }
        activity.runOnUiThread((Runnable)new jku(adsWebView, s, 18));
    }
    
    public final void lW(final aum aum) {
        this.b.g((Object)this);
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final rjt rjt = (rjt)o;
            final rjs a = rjt.a();
            final rjs b = rjs.b;
            array = null;
            if (a == b) {
                if (rjt.b()) {
                    this.j();
                    return null;
                }
                array = array;
            }
        }
        else {
            array = new Class[] { rjt.class };
        }
        return array;
    }
    
    public final void my(final aum aum) {
        this.b.m((Object)this);
    }
}
