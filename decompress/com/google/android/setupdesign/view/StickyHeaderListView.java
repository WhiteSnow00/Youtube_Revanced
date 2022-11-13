// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupdesign.view;

import android.view.accessibility.AccessibilityEvent;
import android.view.WindowInsets;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.ListView;

public class StickyHeaderListView extends ListView
{
    private View a;
    private View b;
    private int c;
    private final RectF d;
    
    public StickyHeaderListView(final Context context) {
        super(context);
        this.c = 0;
        this.d = new RectF();
        this.a(null, 16842868);
    }
    
    public StickyHeaderListView(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = 0;
        this.d = new RectF();
        this.a(set, 16842868);
    }
    
    public StickyHeaderListView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = 0;
        this.d = new RectF();
        this.a(set, n);
    }
    
    private final void a(final AttributeSet set, int resourceId) {
        if (this.isInEditMode()) {
            return;
        }
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, aefr.o, resourceId, 0);
        resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.addHeaderView(LayoutInflater.from(this.getContext()).inflate(resourceId, (ViewGroup)this, false), (Object)null, false);
        }
        obtainStyledAttributes.recycle();
    }
    
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        if (this.d.contains(motionEvent.getX(), motionEvent.getY())) {
            motionEvent.offsetLocation(-this.d.left, -this.d.top);
            return this.b.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.a != null) {
            final int save = canvas.save();
            final View b = this.b;
            View a;
            if (b != null) {
                a = b;
            }
            else {
                a = this.a;
            }
            int top;
            if (b != null) {
                top = this.a.getTop();
            }
            else {
                top = 0;
            }
            if (a.getTop() + top >= this.c && a.isShown()) {
                this.d.setEmpty();
            }
            else {
                this.d.set(0.0f, (float)(-top + this.c), (float)a.getWidth(), (float)(a.getHeight() - top + this.c));
                canvas.translate(0.0f, this.d.top);
                canvas.clipRect(0, 0, a.getWidth(), a.getHeight());
                a.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }
    
    public final WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        if (this.getFitsSystemWindows()) {
            this.c = windowInsets.getSystemWindowInsetTop();
            windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }
    
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        int n;
        if (this.a != null) {
            n = 1;
        }
        else {
            n = 0;
        }
        accessibilityEvent.setItemCount(accessibilityEvent.getItemCount() - n);
        accessibilityEvent.setFromIndex(Math.max(accessibilityEvent.getFromIndex() - n, 0));
        accessibilityEvent.setToIndex(Math.max(accessibilityEvent.getToIndex() - n, 0));
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.a == null) {
            this.a = this.findViewWithTag((Object)"sticky");
            this.b = this.findViewWithTag((Object)"stickyContainer");
        }
    }
}
