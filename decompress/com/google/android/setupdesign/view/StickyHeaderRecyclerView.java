// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupdesign.view;

import android.view.WindowInsets;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;

public class StickyHeaderRecyclerView extends HeaderRecyclerView
{
    private View ab;
    private int ac;
    private final RectF ad;
    
    public StickyHeaderRecyclerView(final Context context) {
        super(context);
        this.ac = 0;
        this.ad = new RectF();
    }
    
    public StickyHeaderRecyclerView(final Context context, final AttributeSet set) {
        super(context, set);
        this.ac = 0;
        this.ad = new RectF();
    }
    
    public StickyHeaderRecyclerView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.ac = 0;
        this.ad = new RectF();
    }
    
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        if (this.ad.contains(motionEvent.getX(), motionEvent.getY())) {
            motionEvent.offsetLocation(-this.ad.left, -this.ad.top);
            return super.aa.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.ab != null) {
            final View aa = super.aa;
            final int save = canvas.save();
            View ab;
            if (aa != null) {
                ab = aa;
            }
            else {
                ab = this.ab;
            }
            int top;
            if (aa != null) {
                top = this.ab.getTop();
            }
            else {
                top = 0;
            }
            if (ab.getTop() + top >= this.ac && ab.isShown()) {
                this.ad.setEmpty();
            }
            else {
                this.ad.set(0.0f, (float)(-top + this.ac), (float)ab.getWidth(), (float)(ab.getHeight() - top + this.ac));
                canvas.translate(0.0f, this.ad.top);
                canvas.clipRect(0, 0, ab.getWidth(), ab.getHeight());
                ab.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }
    
    public final WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        if (this.getFitsSystemWindows()) {
            this.ac = windowInsets.getSystemWindowInsetTop();
            windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.ab == null) {
            final View aa = super.aa;
            if (aa != null) {
                this.ab = aa.findViewWithTag((Object)"sticky");
            }
        }
        if (this.ab != null) {
            final View aa2 = super.aa;
            if (aa2 != null && aa2.getHeight() == 0) {
                aa2.layout(0, -aa2.getMeasuredHeight(), aa2.getMeasuredWidth(), 0);
            }
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (this.ab != null) {
            this.measureChild(super.aa, n, n2);
        }
    }
}
