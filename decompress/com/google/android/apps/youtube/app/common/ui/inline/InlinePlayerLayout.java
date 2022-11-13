// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.inline;

import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

public class InlinePlayerLayout extends gen implements fju, foj
{
    public InlinePlayerOverlayLayout g;
    private View h;
    
    public InlinePlayerLayout(final Context context) {
        super(context);
        this.c();
    }
    
    public InlinePlayerLayout(final Context context, final float n, final trh trh) {
        super(context, n, trh);
        this.m();
    }
    
    public InlinePlayerLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.c();
    }
    
    public InlinePlayerLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c();
    }
    
    private final boolean p() {
        return this.h != null;
    }
    
    public final void a(final View h, final View view) {
        adkp.Q(this.p() ^ true);
        h.getClass();
        this.h = h;
        if (h.getParent() == null) {
            this.addView(this.h, 0);
        }
        final InlinePlayerOverlayLayout g = this.g;
        if (g == null) {
            this.addView(view, 1);
            return;
        }
        g.addView(view);
    }
    
    public final void b(final View view, final View view2) {
        if (view != this.h) {
            return;
        }
        adkp.Q(this.p());
        final InlinePlayerOverlayLayout g = this.g;
        if (g == null) {
            this.removeView(view2);
        }
        else {
            g.removeView(view2);
        }
        this.removeView(view);
        this.h = null;
        this.d();
    }
    
    final void c() {
        this.c = new trh((View)this);
        this.m();
    }
    
    protected final void m() {
        final trh c = this.c;
        c.getClass();
        c.c = (trg)new gfb(this);
    }
    
    public final void setAlpha(final float n) {
    }
}
