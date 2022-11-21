// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

import android.view.View$MeasureSpec;
import java.util.concurrent.atomic.AtomicReference;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.graphics.Rect;

public class SizeAdjustableOverlayWrapperLayout extends iwo implements abvm
{
    public jee a;
    public final Rect b;
    public abvm c;
    public View d;
    public boolean e;
    public boolean f;
    private asln g;
    
    public SizeAdjustableOverlayWrapperLayout(final Context context) {
        super(context);
        this.b = new Rect();
        this.e = false;
    }
    
    public SizeAdjustableOverlayWrapperLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = new Rect();
        this.e = false;
    }
    
    private final boolean i() {
        this.md();
        this.md();
        return anc.f((View)this) == 1;
    }
    
    public final ViewGroup$LayoutParams a() {
        final abvm c = this.c;
        c.getClass();
        return c.a();
    }
    
    public final void g(final Rect rect) {
        this.b.set(rect);
        if (this.f) {
            if (this.i()) {
                this.b.right = 0;
            }
            else {
                this.b.left = 0;
            }
        }
        this.requestLayout();
    }
    
    public final void h(final View d) {
        if (d.getParent() != null) {
            return;
        }
        (this.d = d).setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
        this.addView(d);
    }
    
    public final View md() {
        if (this.d == null) {
            final abvm c = this.c;
            if (c != null) {
                this.h(c.md());
            }
        }
        return (View)this;
    }
    
    public final String mq() {
        final abvm c = this.c;
        if (c == null) {
            return null;
        }
        return c.mq();
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g = this.a.b().R().am((asmi)new ixu(this, 16));
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final asln g = this.g;
        if (g != null && !g.tz()) {
            atkw.f((AtomicReference)this.g);
        }
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.d = this.getChildAt(0);
    }
    
    protected final void onLayout(final boolean b, int n, int n2, int min, int min2) {
        final View d = this.d;
        if (d == null) {
            return;
        }
        n = min - n;
        n2 = min2 - n2;
        min2 = Math.min(d.getMeasuredWidth(), n);
        min = Math.min(this.d.getMeasuredHeight(), n2);
        if (this.i()) {
            n = (this.b.right + (n - min2) - this.b.left) / 2;
        }
        else {
            n = (this.b.left + (n - min2) - this.b.right) / 2;
        }
        if (this.e) {
            n2 = this.b.top + (n2 - min) - this.b.bottom;
        }
        else {
            n2 -= min;
        }
        n2 /= 2;
        this.d.layout(n, n2, min2 + n, min + n2);
    }
    
    protected final void onMeasure(int childMeasureSpec, int size) {
        final int size2 = View$MeasureSpec.getSize(childMeasureSpec);
        size = View$MeasureSpec.getSize(size);
        final View d = this.d;
        if (d != null) {
            final ViewGroup$LayoutParams layoutParams = d.getLayoutParams();
            final int childMeasureSpec2 = getChildMeasureSpec(View$MeasureSpec.makeMeasureSpec(size2 - this.b.left - this.b.right, 1073741824), 0, layoutParams.width);
            if (this.e) {
                childMeasureSpec = size - this.b.top - this.b.bottom;
            }
            else {
                childMeasureSpec = size;
            }
            childMeasureSpec = getChildMeasureSpec(View$MeasureSpec.makeMeasureSpec(childMeasureSpec, 1073741824), 0, layoutParams.height);
            this.d.measure(childMeasureSpec2, childMeasureSpec);
        }
        this.setMeasuredDimension(size2, size);
    }
}
