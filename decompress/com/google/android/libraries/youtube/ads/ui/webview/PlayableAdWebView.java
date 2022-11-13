// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.ads.ui.webview;

import android.view.View;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnTouchListener;
import android.webkit.WebView;

public class PlayableAdWebView extends WebView
{
    public View$OnTouchListener a;
    
    public PlayableAdWebView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final void destroy() {
        this.a = null;
        super.destroy();
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final View$OnTouchListener a = this.a;
        if (a != null) {
            a.onTouch((View)this, motionEvent);
        }
        if (this.getParent() != null) {
            this.requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }
}
