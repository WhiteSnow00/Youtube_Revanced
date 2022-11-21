// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.common.ui;

import android.widget.Scroller;
import android.view.VelocityTracker;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.graphics.Rect;

public class TopPeekingScrollView extends try
{
    private static final Rect n;
    public int k;
    public View l;
    public View m;
    private float o;
    private int p;
    private int q;
    
    static {
        n = new Rect();
    }
    
    public TopPeekingScrollView(final Context context) {
        this(context, null);
    }
    
    public TopPeekingScrollView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public TopPeekingScrollView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.i = context.obtainStyledAttributes(set, trt.h).getBoolean(0, false);
    }
    
    public final void addView(final View view) {
        if (this.getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("TopPeekingScrollView can host only one direct child");
    }
    
    public final void f(final int n) {
        this.g(n, n, false);
    }
    
    public final void g(int p3, final int p4, final boolean b) {
        this.k = p3;
        this.p = p4;
        if (b) {
            p3 = 0;
            this.b(0, p4);
            if (this.getScrollY() != 0) {
                p3 = this.p;
            }
            this.a(p3);
        }
        this.requestLayout();
    }
    
    public final void h(final int n) {
        this.g(n, n, true);
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (super.e(motionEvent)) {
            if (this.getScrollY() < this.p) {
                return true;
            }
            final View m = this.m;
            if (m != null && !m.canScrollVertically(-1) && motionEvent.getY() >= this.o) {
                return true;
            }
        }
        this.o = motionEvent.getY();
        return false;
    }
    
    protected void onLayout(final boolean b, int n, final int n2, int measuredWidth, final int n3) {
        TopPeekingScrollView.n.set(n, n2, measuredWidth, this.k);
        if (this.getChildCount() > 0) {
            final View child = this.getChildAt(0);
            n = measuredWidth - n;
            measuredWidth = child.getMeasuredWidth();
            child.layout((n - measuredWidth) / 2, n2 + this.k, (n - child.getMeasuredWidth()) / 2 + child.getMeasuredWidth(), n3);
        }
        this.b(0, this.p);
    }
    
    protected void onMeasure(final int n, int max) {
        final int size = View$MeasureSpec.getSize(max);
        final int childCount = this.getChildCount();
        max = 0;
        if (childCount > 0) {
            final View child = this.getChildAt(0);
            child.measure(n, View$MeasureSpec.makeMeasureSpec(size, 1073741824));
            max = Math.max(0, child.getMeasuredWidth());
        }
        this.setMeasuredDimension(max, size + this.k);
    }
    
    protected final void onScrollChanged(int q, final int n, final int n2, final int n3) {
        super.onScrollChanged(q, n, n2, n3);
        if (n - n3 > 0) {
            q = 1;
        }
        else {
            q = 2;
        }
        this.q = q;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.g) {
            final Rect n = TopPeekingScrollView.n;
            if (!n.isEmpty() && this.l != null && n.contains((int)motionEvent.getX(), (int)motionEvent.getY() + this.getScrollY())) {
                this.l.dispatchTouchEvent(motionEvent);
            }
        }
        final int action = motionEvent.getAction();
        if (super.f == null) {
            super.f = VelocityTracker.obtain();
        }
        super.f.addMovement(motionEvent);
        boolean performClick = false;
        Label_0357: {
            Label_0150: {
                if (!super.g) {
                    if (!super.e(motionEvent)) {
                        if (action == 1 && super.h) {
                            super.h = false;
                            performClick = this.performClick();
                            break Label_0357;
                        }
                    }
                }
                else {
                    if (action != 1) {
                        if (action == 2) {
                            final float n2 = super.a[1];
                            this.d(motionEvent);
                            this.a(this.getScrollY() + Math.round(n2 - super.a[1]));
                            super.h = false;
                            break Label_0150;
                        }
                        if (action != 3) {
                            break Label_0150;
                        }
                    }
                    super.g = false;
                    if (action != 3 && this.getChildCount() > 0) {
                        super.f.computeCurrentVelocity(1000, (float)super.c);
                        final float yVelocity = super.f.getYVelocity();
                        final int d = super.d;
                        if (yVelocity > d || yVelocity < -d) {
                            final float e = -yVelocity;
                            super.e = e;
                            final int scrollX = this.getScrollX();
                            final int scrollY = this.getScrollY();
                            final Scroller j = super.j;
                            final int[] b = super.b;
                            j.fling(scrollX, scrollY, 0, (int)e, 0, 0, b[0], b[1]);
                            this.invalidate();
                        }
                    }
                    final VelocityTracker f = super.f;
                    if (f != null) {
                        f.recycle();
                        super.f = null;
                    }
                    super.h = false;
                }
            }
            performClick = true;
        }
        if (performClick && motionEvent.getActionMasked() == 1) {
            final int q = this.q;
            if (q != 0) {
                if (q != 1 || this.getScrollY() >= this.p) {
                    final int q2 = this.q;
                    if (q2 == 0) {
                        throw null;
                    }
                    if (q2 != 2 || this.getScrollY() <= 0) {
                        return performClick;
                    }
                }
                if (!this.j.isFinished()) {
                    this.j.abortAnimation();
                }
                final int q3 = this.q;
                if (q3 == 0) {
                    throw null;
                }
                if (q3 == 1) {
                    this.c(this.p);
                }
                else {
                    this.c(0);
                }
            }
        }
        return performClick;
    }
}
