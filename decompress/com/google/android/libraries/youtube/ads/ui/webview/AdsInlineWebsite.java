// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.ads.ui.webview;

import android.view.ViewParent;
import android.view.MotionEvent;
import android.webkit.WebViewClient;
import android.util.AttributeSet;
import android.content.Context;
import android.webkit.WebView;

public class AdsInlineWebsite extends WebView
{
    public smy a;
    
    public AdsInlineWebsite(final Context context, final AttributeSet set) {
        super(context, set);
        this.setWebViewClient((WebViewClient)new smx(this));
        this.getSettings().setJavaScriptEnabled(true);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final ViewParent parent = this.getParent();
        final smy a = this.a;
        if (a != null && motionEvent.getActionMasked() == 0) {
            final kmx kmx = (kmx)a;
            ((wyy)kmx.e).a.J(3, (wzz)kmx.g, (alhi)null);
        }
        if (parent != null) {
            this.requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }
}
