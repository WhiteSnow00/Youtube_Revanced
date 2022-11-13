// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.ads.ui.webview;

import android.view.MotionEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewParent;
import android.util.AttributeSet;
import android.content.Context;
import android.webkit.WebViewClient;
import android.webkit.WebView;

public class AdsWebView extends WebView
{
    public sna a;
    private WebViewClient b;
    
    public AdsWebView(final Context context) {
        super(context);
        this.b();
    }
    
    public AdsWebView(final Context context, final AttributeSet set) {
        super(context, set);
        this.b();
    }
    
    public AdsWebView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b();
    }
    
    public AdsWebView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.b();
    }
    
    public AdsWebView(final Context context, final AttributeSet set, final int n, final boolean b) {
        super(context, set, n, b);
        this.b();
    }
    
    private final View a(final ViewParent viewParent) {
        String resourceName = null;
        if (viewParent == null) {
            return null;
        }
        if (viewParent instanceof View) {
            final View view = (View)viewParent;
            if (view.getId() != -1) {
                resourceName = view.getResources().getResourceName(view.getId());
            }
            if (resourceName != null && resourceName.endsWith(":id/panel_content")) {
                return view;
            }
        }
        return this.a(viewParent.getParent());
    }
    
    private final void b() {
        this.setWebViewClient(this.b = (WebViewClient)new smz(this));
        this.setScrollBarStyle(33554432);
        this.setScrollbarFadingEnabled(false);
        this.getSettings().setJavaScriptEnabled(true);
        this.getSettings().setDomStorageEnabled(true);
    }
    
    public final void destroy() {
        super.destroy();
        this.a = null;
    }
    
    public final WebViewClient getWebViewClient() {
        return this.b;
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final View a = this.a(this.getParent());
        if (a != null) {
            final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
            layoutParams.height = a.getHeight();
            this.setLayoutParams(layoutParams);
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        this.requestDisallowInterceptTouchEvent(true);
        this.performClick();
        return super.onTouchEvent(motionEvent);
    }
    
    public final boolean performClick() {
        final sna a = this.a;
        if (a != null) {
            ((kmz)a).h = true;
        }
        return super.performClick();
    }
}
