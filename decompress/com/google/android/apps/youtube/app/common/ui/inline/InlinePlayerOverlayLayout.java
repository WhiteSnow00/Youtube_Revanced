// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.inline;

import android.view.ViewParent;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

public class InlinePlayerOverlayLayout extends gep implements fju
{
    public ViewGroup g;
    
    public InlinePlayerOverlayLayout(final Context context) {
        super(context);
    }
    
    public InlinePlayerOverlayLayout(final Context context, final float n, final trh trh) {
        super(context, n, trh);
    }
    
    public InlinePlayerOverlayLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public InlinePlayerOverlayLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    private static final void m(final View view) {
        final ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)parent;
            final int childCount = viewGroup.getChildCount();
            if (childCount > 1 && view != viewGroup.getChildAt(childCount - 1)) {
                parent.bringChildToFront(view);
            }
        }
    }
    
    protected final void g(final View view, final int n, final int n2, final int n3, final int n4) {
        if (view == this.g) {
            view.layout(0, 0, Math.max(0, n3 - n), Math.max(0, n4 - n2));
            return;
        }
        super.g(view, n, n2, n3, n4);
    }
    
    protected final void i() {
        if (this.getVisibility() == 8) {
            this.setVisibility(0);
        }
        m((View)this.g);
        m((View)this);
    }
}
