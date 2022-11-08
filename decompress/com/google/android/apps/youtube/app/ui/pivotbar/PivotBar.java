// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui.pivotbar;

import android.content.res.Configuration;
import java.util.Iterator;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewParent;
import android.graphics.Point;
import android.view.MotionEvent;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.View;
import j$.util.Optional;
import java.util.Map;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.content.Context;
import java.util.List;
import android.view.GestureDetector$OnGestureListener;
import android.content.res.Resources;

public final class PivotBar extends tms
{
    public Resources a;
    public tnw b;
    public boolean c;
    public int d;
    GestureDetector$OnGestureListener e;
    bx f;
    public bx g;
    private final List m;
    private int n;
    private boolean o;
    
    public PivotBar(final Context context) {
        super(context);
        this.m = new ArrayList();
        this.o(context);
    }
    
    public PivotBar(final Context context, final AttributeSet set) {
        super(context, set);
        this.m = new ArrayList();
        this.o(context);
    }
    
    public PivotBar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.m = new ArrayList();
        this.o(context);
    }
    
    private final void o(final Context context) {
        this.setLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
        this.b = new tnw(context);
        this.a = context.getResources();
        this.h(2132083405, true);
        this.setFillViewport(tmy.bq(context) ^ true);
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.e = (GestureDetector$OnGestureListener)new kbw(this);
        final bx f = new bx(context, this.e);
        this.f = f;
        ((GestureDetector)((bx)f.a).a).setIsLongpressEnabled(false);
    }
    
    public final ColorStateList a(final int n, final int n2) {
        return this.b.a(n, n2, n, n2, n2, n);
    }
    
    public final View b(final Drawable drawable, final CharSequence charSequence, final boolean b, final int n, final Map map, final amzm amzm, final Optional optional) {
        return this.c(new kby(this, 2131624544, (ViewGroup)this.h, drawable, charSequence, map, optional), b, n, amzm);
    }
    
    public final View c(final kby kby, final boolean b, int n, final amzm amzm) {
        kby.b(b, n);
        n = this.n;
        final Context context = kby.f.getContext();
        final int[] a = kck.a;
        boolean b2 = false;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet)null, a, 0, n);
        kby.d(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        this.m.add(kby);
        final View a2 = kby.a;
        if (amzm != amzm.c) {
            b2 = true;
        }
        this.n(a2, b2);
        return a2;
    }
    
    final kby d(final int n) {
        View a = null;
        kby kby;
        if (n >= 0 && n < this.m.size()) {
            kby = this.m.get(n);
        }
        else {
            kby = null;
        }
        if (kby != null) {
            a = kby.a;
        }
        if (a == this.k(n)) {
            return kby;
        }
        throw new IllegalStateException("Internal pivot bar tab state does not match view hierarchy");
    }
    
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        if (!tqt.e(this.getContext()) && this.c) {
            this.f.y(motionEvent);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
    
    public final void f(final MotionEvent motionEvent) {
        final bx g = this.g;
        if (g != null) {
            final int height = this.getHeight();
            final ggh f = ((ggs)g.a).f();
            if (f != null) {
                final View o = ((br)f).O;
                if (o != null) {
                    if (o.getParent() != null) {
                        final ViewParent parent = ((br)f).O.getParent();
                        if (parent instanceof View) {
                            final View view = (View)parent;
                            final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            final Point point = new Point();
                            point.set((int)motionEvent.getRawX(), (int)motionEvent.getRawY() - height);
                            gow.h(point, view);
                            obtain.setLocation((float)point.x, (float)point.y);
                            view.dispatchTouchEvent(obtain);
                            obtain.recycle();
                        }
                    }
                }
            }
        }
    }
    
    public final void g(final int n, final boolean b, final int n2) {
        final kby d = this.d(n);
        if (d != null) {
            d.b(b, n2);
        }
    }
    
    protected final FrameLayout$LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout$LayoutParams(-2, -1, 17);
    }
    
    public final void h(final int n, final boolean o) {
        if (this.n == n && this.o == o) {
            return;
        }
        this.n = n;
        this.o = o;
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes((AttributeSet)null, kck.a, 0, n);
        if (obtainStyledAttributes != null) {
            if (obtainStyledAttributes.hasValue(5)) {
                Object drawable2;
                final Drawable drawable = (Drawable)(drawable2 = obtainStyledAttributes.getDrawable(5));
                if (o) {
                    drawable2 = drawable;
                    if (obtainStyledAttributes.hasValue(0)) {
                        drawable2 = drawable;
                        if (obtainStyledAttributes.hasValue(6)) {
                            drawable2 = new fyl(drawable, obtainStyledAttributes.getColor(6, 0), obtainStyledAttributes.getDimensionPixelSize(0, 0));
                            ((fyl)drawable2).c(48);
                        }
                    }
                }
                this.setBackground((Drawable)drawable2);
            }
            final Iterator iterator = this.m.iterator();
            while (iterator.hasNext()) {
                ((kby)iterator.next()).d(obtainStyledAttributes);
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    protected final void i(final int n, final boolean b) {
        final kby d = this.d(n);
        if (d != null) {
            final View a = d.a;
            a.setSelected(b);
            a.setActivated(b);
            d.b(false, 0);
            if (d.d.isPresent()) {
                if (b) {
                    ((kbx)d.d.get()).e();
                }
                else {
                    ((kbx)d.d.get()).f();
                }
            }
            final kce c = d.c;
            if (c != null) {
                c.a(b);
            }
        }
    }
    
    public final void mu() {
        final Iterator iterator = this.m.iterator();
        while (iterator.hasNext()) {
            ((kby)iterator.next()).e.dispose();
        }
        this.m.clear();
        super.mu();
    }
    
    protected final void onConfigurationChanged(final Configuration configuration) {
        this.setFillViewport(tmy.bq(this.getContext()) ^ true);
    }
}
