// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupdesign.view;

import android.view.WindowInsets;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

public class StickyHeaderScrollView extends BottomScrollView
{
    private View a;
    private View b;
    private int c;
    
    public StickyHeaderScrollView(final Context context) {
        super(context);
        this.c = 0;
    }
    
    public StickyHeaderScrollView(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = 0;
    }
    
    public StickyHeaderScrollView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = 0;
    }
    
    private final void a() {
        final View a = this.a;
        if (a != null) {
            final View b = this.b;
            View view;
            if (b != null) {
                view = b;
            }
            else {
                view = a;
            }
            int top;
            if (b != null) {
                top = a.getTop();
            }
            else {
                top = 0;
            }
            if (view.getTop() - this.getScrollY() + top >= this.c && view.isShown()) {
                view.setTranslationY(0.0f);
                return;
            }
            view.setTranslationY((float)(this.getScrollY() - top));
        }
    }
    
    public final WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        WindowInsets replaceSystemWindowInsets = windowInsets;
        if (this.getFitsSystemWindows()) {
            this.c = windowInsets.getSystemWindowInsetTop();
            replaceSystemWindowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return replaceSystemWindowInsets;
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.a == null) {
            this.a = this.findViewWithTag((Object)"sticky");
            this.b = this.findViewWithTag((Object)"stickyContainer");
        }
        this.a();
    }
    
    protected final void onScrollChanged(final int n, final int n2, final int n3, final int n4) {
        super.onScrollChanged(n, n2, n3, n4);
        this.a();
    }
}
