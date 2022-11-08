// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livechat.ui.view;

import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.ValueAnimator;
import android.widget.OverScroller;
import android.widget.FrameLayout;

public class LiveChatSwipeableContainerLayout extends FrameLayout
{
    public final OverScroller a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public wdu g;
    private final int h;
    private final tnz i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private ValueAnimator o;
    private final Runnable p;
    
    public LiveChatSwipeableContainerLayout(final Context context) {
        this(context, null);
    }
    
    public LiveChatSwipeableContainerLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public LiveChatSwipeableContainerLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.p = (Runnable)new vkg(this, 17);
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        this.i = new tnz(context);
        this.a = new OverScroller(context);
    }
    
    private final int g(final MotionEvent motionEvent) {
        float n;
        if (this.b) {
            n = motionEvent.getY();
        }
        else {
            n = motionEvent.getX();
        }
        return (int)n;
    }
    
    private final int h(final MotionEvent motionEvent) {
        float n;
        if (this.b) {
            n = motionEvent.getRawY();
        }
        else {
            n = motionEvent.getRawX();
        }
        return (int)n;
    }
    
    private final boolean i(final float n) {
        return this.getChildCount() > 0 && (this.e || (n >= -this.c() && n <= this.a() - this.c()));
    }
    
    public final int a() {
        if (this.getChildCount() == 0) {
            return 0;
        }
        int n;
        if (this.b) {
            n = this.getChildAt(0).getHeight();
        }
        else {
            n = this.getChildAt(0).getWidth();
        }
        return n;
    }
    
    public final int b() {
        int n;
        if (this.b) {
            n = this.getHeight();
        }
        else {
            n = this.getWidth();
        }
        return n;
    }
    
    public final int c() {
        if (this.e) {
            float n;
            if (this.b) {
                n = this.getTranslationY();
            }
            else {
                n = this.getTranslationX();
            }
            return (int)n;
        }
        int n2;
        if (this.b) {
            n2 = this.getScrollY();
        }
        else {
            n2 = this.getScrollX();
        }
        return n2;
    }
    
    public final void d(final int j) {
        this.e(this.j = j);
    }
    
    public final void e(final int n) {
        if (this.e) {
            final boolean b = this.b;
            final float n2 = (float)n;
            if (b) {
                this.setTranslationY(n2);
                return;
            }
            this.setTranslationX(n2);
        }
        else {
            if (this.b) {
                this.setScrollY(n);
                return;
            }
            this.setScrollX(n);
        }
    }
    
    public final void f(final boolean b, final boolean c, final boolean d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    protected final void measureChild(final View view, final int n, final int n2) {
        if (this.b) {
            view.measure(n, 0);
            return;
        }
        view.measure(0, n2);
    }
    
    protected final void measureChildWithMargins(final View view, final int n, final int n2, final int n3, final int n4) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        view.measure(getChildMeasureSpec(n, viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin + n2, viewGroup$MarginLayoutParams.width), View$MeasureSpec.makeMeasureSpec(viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin, 0));
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2 && this.n) {
            return true;
        }
        if (!this.i((float)this.g(motionEvent))) {
            final int c = this.c();
            final int j = this.j;
            if (c < j) {
                this.e(j);
            }
            return false;
        }
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return this.n;
                    }
                }
                else {
                    this.i.e(motionEvent);
                    final int g = this.g(motionEvent);
                    if (Math.abs(g - this.l) > this.h) {
                        this.n = true;
                        this.l = g;
                        return this.n;
                    }
                    return this.n;
                }
            }
            this.i.e(motionEvent);
            this.n = false;
        }
        else {
            this.k = this.h(motionEvent);
            this.i.h(motionEvent);
            this.i.e(motionEvent);
            this.l = this.g(motionEvent);
        }
        return this.n;
    }
    
    protected final void onMeasure(int measuredWidth, int measuredHeight) {
        super.onMeasure(measuredWidth, measuredHeight);
        if (this.b) {
            if (View$MeasureSpec.getMode(measuredHeight) == 0) {
                return;
            }
            if (this.getChildCount() > 0) {
                final View child = this.getChildAt(0);
                measuredHeight = this.getMeasuredHeight();
                if (child.getMeasuredHeight() < measuredHeight) {
                    child.measure(getChildMeasureSpec(measuredWidth, 0, child.getLayoutParams().width), View$MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                }
            }
        }
        else {
            if (View$MeasureSpec.getMode(measuredWidth) == 0) {
                return;
            }
            if (this.getChildCount() > 0) {
                final View child2 = this.getChildAt(0);
                measuredWidth = this.getMeasuredWidth();
                if (child2.getMeasuredWidth() < measuredWidth) {
                    child2.measure(View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), getChildMeasureSpec(measuredHeight, 0, child2.getLayoutParams().height));
                }
            }
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.i((float)this.g(motionEvent))) {
            final int c = this.c();
            final int j = this.j;
            if (c < j) {
                this.e(j);
            }
            return false;
        }
        this.i.e(motionEvent);
        final int n = motionEvent.getAction() & 0xFF;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        this.i.g();
                        if (this.n) {
                            this.n = false;
                        }
                    }
                }
                else {
                    final int g = this.g(motionEvent);
                    this.f = g;
                    int m;
                    final int n2 = m = this.l - g;
                    if (!this.n) {
                        final int abs = Math.abs(n2);
                        final int h = this.h;
                        m = n2;
                        if (abs > h) {
                            this.n = true;
                            if (n2 > 0) {
                                m = n2 - h;
                            }
                            else {
                                m = n2 + h;
                            }
                        }
                    }
                    if (this.n) {
                        this.l = g;
                        if (this.e) {
                            this.e(this.h(motionEvent) - this.k);
                        }
                        else {
                            if (this.b) {
                                this.a.startScroll(0, g, 0, m, 0);
                            }
                            else {
                                this.a.startScroll(g, 0, m, 0, 0);
                            }
                            this.removeCallbacks(this.p);
                            this.post(this.p);
                        }
                    }
                    this.m = m;
                }
            }
            else {
                Label_0505: {
                    Label_0415: {
                        if (this.g != null) {
                            if (this.n) {
                                if (Math.abs((float)(this.c() - this.j)) < this.b() * 0.5f) {
                                    final int i = this.i.j(motionEvent, 1);
                                    final boolean b = i == 2 && this.m > 0;
                                    final boolean b2 = i == 1 && this.m < 0;
                                    if (Math.abs(this.m) <= this.h || (!b && !b2)) {
                                        break Label_0415;
                                    }
                                }
                                final Context context = this.getContext();
                                tqt.c(context, (View)this, (CharSequence)context.getString(2132018359));
                                this.g.a();
                                break Label_0505;
                            }
                        }
                    }
                    final ValueAnimator o = this.o;
                    if (o != null) {
                        o.cancel();
                    }
                    this.o = null;
                    (this.o = ValueAnimator.ofInt(new int[] { this.c(), this.j })).setDuration(100L);
                    this.o.setInterpolator((TimeInterpolator)new AccelerateInterpolator());
                    this.o.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new usg(this, 6));
                    this.o.start();
                }
                this.i.g();
                this.m = 0;
                if (!this.n) {
                    return false;
                }
                this.n = false;
            }
        }
        else {
            this.l = this.g(motionEvent);
        }
        return true;
    }
}
