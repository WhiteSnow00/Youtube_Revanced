// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.common.ui.swipelayout;

import android.widget.FrameLayout$LayoutParams;
import android.view.MotionEvent;
import android.graphics.drawable.RippleDrawable;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.GestureDetector$OnGestureListener;
import android.util.AttributeSet;
import android.content.Context;
import android.view.GestureDetector$SimpleOnGestureListener;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.graphics.drawable.Drawable;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;

public class SwipeLayout extends FrameLayout
{
    private static final int[] i;
    private static final int[] j;
    public int a;
    public int b;
    public View c;
    public VelocityTracker d;
    public int e;
    public boolean f;
    public View g;
    public boolean h;
    private int k;
    private aqj l;
    private View m;
    private Drawable n;
    private Drawable o;
    private arl p;
    private GestureDetector q;
    private final PointF r;
    private final aqi s;
    private final GestureDetector$SimpleOnGestureListener t;
    
    static {
        i = new int[] { 16842910, 16842919 };
        j = new int[0];
    }
    
    public SwipeLayout(final Context context) {
        super(context);
        this.f = true;
        this.h = true;
        this.r = new PointF();
        this.s = (aqi)new ttr(this);
        this.t = (GestureDetector$SimpleOnGestureListener)new tts(this);
        this.t(context, null, 0, 0);
    }
    
    public SwipeLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.f = true;
        this.h = true;
        this.r = new PointF();
        this.s = (aqi)new ttr(this);
        this.t = (GestureDetector$SimpleOnGestureListener)new tts(this);
        this.t(context, set, 0, 0);
    }
    
    public SwipeLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.f = true;
        this.h = true;
        this.r = new PointF();
        this.s = (aqi)new ttr(this);
        this.t = (GestureDetector$SimpleOnGestureListener)new tts(this);
        this.t(context, set, n, 0);
    }
    
    public SwipeLayout(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.f = true;
        this.h = true;
        this.r = new PointF();
        this.s = (aqi)new ttr(this);
        this.t = (GestureDetector$SimpleOnGestureListener)new tts(this);
        this.t(context, set, n, n2);
    }
    
    private final void t(final Context context, final AttributeSet set, int n, final int n2) {
        this.q = new GestureDetector(this.getContext(), (GestureDetector$OnGestureListener)this.t);
        final ViewConfiguration value = ViewConfiguration.get(this.getContext());
        this.a = tqf.aZ(this.getResources().getDisplayMetrics(), 40);
        this.b = value.getScaledMinimumFlingVelocity();
        this.k = tqf.aZ(this.getResources().getDisplayMetrics(), 5);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ttn.a, n, n2);
        n = obtainStyledAttributes.getResourceId(3, 0);
        if (n != 0) {
            this.m = LayoutInflater.from(this.getContext()).inflate(n, (ViewGroup)this, false);
        }
        this.n = obtainStyledAttributes.getDrawable(2);
        n = obtainStyledAttributes.getResourceId(1, 0);
        if (n != 0) {
            this.k(this.g = LayoutInflater.from(this.getContext()).inflate(n, (ViewGroup)this, false));
        }
        this.o = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }
    
    private final void u(final View view, final ttt ttt, final float n) {
        if (view == null) {
            return;
        }
        if (view.getWidth() == 0) {
            view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new ttq(this, view, ttt, n));
            return;
        }
        this.m((int)ttt.a(), n);
    }
    
    private final void v(int e) {
        final View c = this.c;
        if (c != null) {
            anc.E(c, e - c.getLeft());
            if (!((ari)this.e()).l) {
                ((ari)this.e()).g((float)e);
            }
            e = this.e;
            final int n = 0;
            final boolean b = e > 0;
            Drawable background;
            if (b) {
                background = this.n;
            }
            else {
                background = null;
            }
            if (e < 0) {
                e = 1;
            }
            else {
                e = 0;
            }
            if (e != 0) {
                background = this.o;
            }
            this.setBackground(background);
            final View m = this.m;
            if (m != null) {
                int visibility;
                if (!b) {
                    visibility = 8;
                }
                else {
                    visibility = 0;
                }
                m.setVisibility(visibility);
            }
            final View g = this.g;
            if (g != null) {
                int visibility2 = n;
                if (1 != e) {
                    visibility2 = 8;
                }
                g.setVisibility(visibility2);
            }
        }
    }
    
    public final int a() {
        final View c = this.c();
        if (c != null) {
            return c.getWidth();
        }
        return 0;
    }
    
    public final int b() {
        final View d = this.d();
        if (d != null) {
            return d.getWidth();
        }
        return 0;
    }
    
    public final View c() {
        View view;
        if (this.q()) {
            view = this.g;
        }
        else {
            view = this.m;
        }
        return view;
    }
    
    public final View d() {
        View view;
        if (this.q()) {
            view = this.m;
        }
        else {
            view = this.g;
        }
        return view;
    }
    
    public final arl e() {
        if (this.p == null) {
            final arl p = new arl(new ark());
            final arm n = new arm(0.0f);
            n.c();
            n.e(1500.0f);
            p.n = n;
            ((ari)p).f((arg)new tto(this));
            ((ari)p).g(0.0f);
            this.p = p;
        }
        return this.p;
    }
    
    public final void f() {
        this.g(0.0f);
    }
    
    public final void g(final float n) {
        this.m(0, n);
    }
    
    public final void h() {
        this.e().i();
        this.l(0);
    }
    
    public final void i(final float n) {
        this.u(this.c(), (ttt)new ttp(this, 0), n);
    }
    
    public final void j(final float n) {
        this.u(this.d(), (ttt)new ttp(this, 1), n);
    }
    
    public final void k(final View g) {
        final View g2 = this.g;
        if (g == g2) {
            return;
        }
        if (g2 != null) {
            this.removeView(g2);
        }
        if ((this.g = g) == null) {
            if (this.e < 0) {
                this.l(0);
            }
            return;
        }
        this.addView(g, 0);
    }
    
    public final void l(int e) {
        int e2 = 0;
        Label_0037: {
            if (e <= 0 || this.s()) {
                if ((e2 = e) >= 0) {
                    break Label_0037;
                }
                e2 = e;
                if (this.p()) {
                    break Label_0037;
                }
            }
            e2 = 0;
        }
        this.e = e2;
        if (this.q()) {
            e = -this.e;
        }
        else {
            e = this.e;
        }
        this.v(e);
    }
    
    public final void m(final int n, final float g) {
        final int left = this.c.getLeft();
        if (left == n && !((ari)this.e()).l) {
            return;
        }
        if (!((ari)this.e()).l) {
            final arl e = this.e();
            ((ari)e).g((float)left);
            ((ari)e).g = g;
        }
        this.e().h((float)n);
    }
    
    public final void n(final float n, final float n2) {
        final Drawable background = this.c.getBackground();
        if (!(background instanceof RippleDrawable)) {
            return;
        }
        final RippleDrawable rippleDrawable = (RippleDrawable)background;
        this.c.drawableHotspotChanged(n, n2);
        rippleDrawable.setState(SwipeLayout.i);
    }
    
    public final void o() {
        final Drawable background = this.c.getBackground();
        if (!(background instanceof RippleDrawable)) {
            return;
        }
        ((RippleDrawable)background).setState(SwipeLayout.j);
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = this.getChildAt(this.getChildCount() - 1);
        this.l = aqj.c((ViewGroup)this, 1.0f, this.s);
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (!this.s() && !this.p()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return this.l.k(motionEvent);
    }
    
    protected final void onLayout(final boolean b, int e, int n, final int n2, final int n3) {
        final View m = this.m;
        if (m != null) {
            ((FrameLayout$LayoutParams)m.getLayoutParams()).gravity = 8388611;
            this.m.setVisibility(4);
        }
        final View g = this.g;
        if (g != null) {
            ((FrameLayout$LayoutParams)g.getLayoutParams()).gravity = 8388613;
            this.g.setVisibility(4);
        }
        super.onLayout(b, e, n, n2, n3);
        n = (e = this.e);
        if (this.q()) {
            e = -n;
        }
        this.v(e);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        this.q.onTouchEvent(motionEvent);
        final int actionMasked = motionEvent.getActionMasked();
        final int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        int n = actionMasked;
        boolean b = false;
        Label_0059: {
            if (actionMasked != 0) {
                if (actionMasked != 5) {
                    b = false;
                    n = actionMasked;
                    break Label_0059;
                }
                n = 5;
            }
            b = true;
        }
        final boolean b2 = n == 1 || n == 6 || n == 3;
        final boolean b3 = pointerId == 0 && this.l.h(0);
        final boolean b4 = (this.s() || this.p()) && (b || b2 || b3);
        if (b2) {
            this.o();
        }
        if (!b4) {
            return b;
        }
        this.l.f(motionEvent);
        if (this.d == null) {
            this.d = VelocityTracker.obtain();
        }
        this.d.addMovement(motionEvent);
        this.d.computeCurrentVelocity(1000);
        final int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    final float abs = Math.abs(motionEvent.getX() - this.r.x);
                    final float abs2 = Math.abs(motionEvent.getY() - this.r.y);
                    if ((float)Math.sqrt(abs * abs + abs2 * abs2) >= this.k) {
                        final double n2 = (float)Math.atan2(abs2, abs);
                        Double.isNaN(n2);
                        if ((float)(n2 * 57.29577951308232) < 30.0f) {
                            this.getParent().requestDisallowInterceptTouchEvent(true);
                            return true;
                        }
                    }
                    return false;
                }
                if (action != 3) {
                    return true;
                }
            }
            final VelocityTracker d = this.d;
            if (d != null) {
                d.recycle();
                this.d = null;
            }
            this.o();
            return false;
        }
        this.r.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }
    
    public final boolean p() {
        return this.h && this.g != null;
    }
    
    public final boolean q() {
        return anc.f((View)this) == 1;
    }
    
    public final boolean r() {
        return this.e != 0;
    }
    
    public final boolean s() {
        return this.f && this.m != null;
    }
}
