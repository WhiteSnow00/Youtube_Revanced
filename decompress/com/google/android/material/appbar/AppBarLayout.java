// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.appbar;

import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.animation.AnimatorInflater;
import android.view.ViewOutlineProvider;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import java.lang.ref.WeakReference;
import android.graphics.drawable.Drawable;
import java.util.List;
import android.widget.LinearLayout;

public class AppBarLayout extends LinearLayout implements aeh
{
    public boolean a;
    public int b;
    public aob c;
    public boolean d;
    public final List e;
    public Drawable f;
    private int g;
    private int h;
    private int i;
    private int j;
    private List k;
    private boolean l;
    private boolean m;
    private int n;
    private WeakReference o;
    private final ColorStateList p;
    private ValueAnimator q;
    private ValueAnimator$AnimatorUpdateListener r;
    private final long s;
    private final TimeInterpolator t;
    private int[] u;
    private final float v;
    private AppBarLayout$Behavior w;
    
    public AppBarLayout(final Context context) {
        this(context, null);
    }
    
    public AppBarLayout(final Context context, final AttributeSet set) {
        this(context, set, 2130968728);
    }
    
    public AppBarLayout(Context context, final AttributeSet set, int alpha) {
        super(aeba.a(context, set, alpha, 2132084670), set, alpha);
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.b = 0;
        this.e = new ArrayList();
        context = this.getContext();
        boolean b = true;
        this.setOrientation(1);
        if (this.getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            final int[] a = adtc.a;
            ((View)this).setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        final int[] a2 = adtc.a;
        final Context context2 = ((View)this).getContext();
        Object p3 = adwh.a(context2, set, adtc.a, alpha, 2132084670, new int[0]);
        try {
            if (((TypedArray)p3).hasValue(0)) {
                ((View)this).setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, ((TypedArray)p3).getResourceId(0, 0)));
            }
            ((TypedArray)p3).recycle();
            final TypedArray a3 = adwh.a(context, set, adsz.a, alpha, 2132084670, new int[0]);
            anb.Q((View)this, a3.getDrawable(0));
            p3 = adds.z(context, a3, 6);
            this.p = (ColorStateList)p3;
            if (this.getBackground() instanceof ColorDrawable) {
                final ColorDrawable colorDrawable = (ColorDrawable)this.getBackground();
                final adyh adyh = new adyh();
                adyh.o(ColorStateList.valueOf(colorDrawable.getColor()));
                if (p3 != null) {
                    if (!this.m) {
                        alpha = 0;
                    }
                    else {
                        alpha = 255;
                    }
                    adyh.setAlpha(alpha);
                    adyh.o((ColorStateList)p3);
                    this.r = (ValueAnimator$AnimatorUpdateListener)new leq(this, adyh, 7);
                }
                else {
                    adyh.m(context);
                    this.r = (ValueAnimator$AnimatorUpdateListener)new leq(this, adyh, 8);
                }
                anb.Q((View)this, (Drawable)adyh);
            }
            this.s = adds.D(context, 2130969944, this.getResources().getInteger(2131492870));
            this.t = adds.I(context, 2130969962, adsf.a);
            if (a3.hasValue(4)) {
                this.s(a3.getBoolean(4, false), false, false);
            }
            if (a3.hasValue(3)) {
                adtc.a((View)this, (float)a3.getDimensionPixelSize(3, 0));
            }
            if (a3.hasValue(2)) {
                this.setKeyboardNavigationCluster(a3.getBoolean(2, false));
            }
            if (a3.hasValue(1)) {
                this.setTouchscreenBlocksFocus(a3.getBoolean(1, false));
            }
            this.v = this.getResources().getDimension(2131166242);
            this.d = a3.getBoolean(5, false);
            this.n = a3.getResourceId(7, -1);
            p3 = a3.getDrawable(8);
            final Drawable f = this.f;
            if (f != p3) {
                Drawable mutate = null;
                if (f != null) {
                    f.setCallback((Drawable$Callback)null);
                }
                if (p3 != null) {
                    mutate = ((Drawable)p3).mutate();
                }
                if ((this.f = mutate) != null) {
                    if (mutate.isStateful()) {
                        this.f.setState(this.getDrawableState());
                    }
                    air.b(this.f, anb.f((View)this));
                    final Drawable f2 = this.f;
                    if (this.getVisibility() != 0) {
                        b = false;
                    }
                    f2.setVisible(b, false);
                    this.f.setCallback((Drawable$Callback)this);
                }
                this.n();
                anb.H((View)this);
            }
            a3.recycle();
            anb.Z((View)this, (alw)new tpu(this, 2));
        }
        finally {
            ((TypedArray)p3).recycle();
        }
    }
    
    private final void b() {
        final AppBarLayout$Behavior w = this.w;
        AppBarLayout$BaseBehavior$SavedState a;
        final AppBarLayout$BaseBehavior$SavedState appBarLayout$BaseBehavior$SavedState = a = null;
        if (w != null) {
            a = appBarLayout$BaseBehavior$SavedState;
            if (this.h != -1) {
                if (this.b != 0) {
                    a = appBarLayout$BaseBehavior$SavedState;
                }
                else {
                    a = ((AppBarLayout$BaseBehavior)w).A((Parcelable)AbsSavedState.c, this);
                }
            }
        }
        this.h = -1;
        this.i = -1;
        this.j = -1;
        if (a != null) {
            ((AppBarLayout$BaseBehavior)this.w).C(a, false);
        }
    }
    
    protected static final adsq q() {
        return new adsq();
    }
    
    protected static final adsq r(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof LinearLayout$LayoutParams) {
            return new adsq((LinearLayout$LayoutParams)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new adsq((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new adsq(viewGroup$LayoutParams);
    }
    
    private final void s(final boolean b, final boolean b2, final boolean b3) {
        int n;
        if (!b) {
            n = 2;
        }
        else {
            n = 1;
        }
        int n2 = 0;
        int n3;
        if (!b2) {
            n3 = 0;
        }
        else {
            n3 = 4;
        }
        if (b3) {
            n2 = 8;
        }
        this.b = (n | n3 | n2);
        this.requestLayout();
    }
    
    private final void t(final float n, final float n2) {
        final ValueAnimator q = this.q;
        if (q != null) {
            q.cancel();
        }
        (this.q = ValueAnimator.ofFloat(new float[] { n, n2 })).setDuration(this.s);
        this.q.setInterpolator(this.t);
        final ValueAnimator$AnimatorUpdateListener r = this.r;
        if (r != null) {
            this.q.addUpdateListener(r);
        }
        this.q.start();
    }
    
    private final boolean u() {
        return this.f != null && this.f() > 0;
    }
    
    private final boolean v() {
        if (this.getChildCount() > 0) {
            final View child = this.getChildAt(0);
            if (child.getVisibility() != 8 && !anb.ai(child)) {
                return true;
            }
        }
        return false;
    }
    
    public final aei a() {
        return (aei)(this.w = new AppBarLayout$Behavior());
    }
    
    final int c() {
        final int i = this.i;
        if (i != -1) {
            return i;
        }
        int j = this.getChildCount() - 1;
        int n = 0;
        while (j >= 0) {
            final View child = this.getChildAt(j);
            int n2 = n;
            if (child.getVisibility() != 8) {
                final adsq adsq = (adsq)child.getLayoutParams();
                final int measuredHeight = child.getMeasuredHeight();
                final int a = adsq.a;
                if ((a & 0x5) == 0x5) {
                    final int n3 = adsq.topMargin + adsq.bottomMargin;
                    int n4 = 0;
                    Label_0132: {
                        int g;
                        if ((a & 0x8) != 0x0) {
                            g = anb.g(child);
                        }
                        else {
                            if ((a & 0x2) == 0x0) {
                                n4 = n3 + measuredHeight;
                                break Label_0132;
                            }
                            g = measuredHeight - anb.g(child);
                        }
                        n4 = n3 + g;
                    }
                    int min = n4;
                    if (j == 0) {
                        min = n4;
                        if (anb.ai(child)) {
                            min = Math.min(n4, measuredHeight - this.f());
                        }
                    }
                    n2 = n + min;
                }
                else if ((n2 = n) > 0) {
                    break;
                }
            }
            --j;
            n = n2;
        }
        return this.i = Math.max(0, n);
    }
    
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof adsq;
    }
    
    final int d() {
        final int j = this.j;
        if (j != -1) {
            return j;
        }
        final int childCount = this.getChildCount();
        int n = 0;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n2;
            if (n >= childCount) {
                break;
            }
            final View child = this.getChildAt(n);
            int n4 = n2;
            if (child.getVisibility() != 8) {
                final adsq adsq = (adsq)child.getLayoutParams();
                final int measuredHeight = child.getMeasuredHeight();
                final int topMargin = adsq.topMargin;
                final int bottomMargin = adsq.bottomMargin;
                final int a = adsq.a;
                n3 = n2;
                if ((a & 0x1) == 0x0) {
                    break;
                }
                n4 = n2 + (measuredHeight + (topMargin + bottomMargin));
                if ((a & 0x2) != 0x0) {
                    n3 = n4 - anb.g(child);
                    break;
                }
            }
            ++n;
            n2 = n4;
        }
        return this.j = Math.max(0, n3);
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.u()) {
            final int save = canvas.save();
            canvas.translate(0.0f, (float)(-this.g));
            this.f.draw(canvas);
            canvas.restoreToCount(save);
        }
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        final Drawable f = this.f;
        if (f != null && f.isStateful() && f.setState(drawableState)) {
            this.invalidateDrawable(f);
        }
    }
    
    public final int e() {
        final int f = this.f();
        int n = anb.g((View)this);
        if (n == 0) {
            final int childCount = this.getChildCount();
            if (childCount > 0) {
                n = anb.g(this.getChildAt(childCount - 1));
            }
            else {
                n = 0;
            }
            if (n == 0) {
                return this.getHeight() / 3;
            }
        }
        return n + n + f;
    }
    
    final int f() {
        final aob c = this.c;
        if (c != null) {
            return c.d();
        }
        return 0;
    }
    
    public final int g() {
        final int h = this.h;
        if (h != -1) {
            return h;
        }
        final int childCount = this.getChildCount();
        int n = 0;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n2;
            if (n >= childCount) {
                break;
            }
            final View child = this.getChildAt(n);
            int n4 = n;
            int n5 = n2;
            if (child.getVisibility() != 8) {
                final adsq adsq = (adsq)child.getLayoutParams();
                final int measuredHeight = child.getMeasuredHeight();
                final int a = adsq.a;
                n3 = n2;
                if ((a & 0x1) == 0x0) {
                    break;
                }
                final int n6 = n2 + (measuredHeight + adsq.topMargin + adsq.bottomMargin);
                int n7 = n;
                int n8 = n6;
                if (n == 0) {
                    n8 = n6;
                    if (anb.ai(child)) {
                        n8 = n6 - this.f();
                    }
                    n7 = 0;
                }
                n4 = n7;
                n5 = n8;
                if ((a & 0x2) != 0x0) {
                    n3 = n8 - anb.g(child);
                    break;
                }
            }
            n = n4 + 1;
            n2 = n5;
        }
        return this.h = Math.max(0, n3);
    }
    
    protected final /* bridge */ ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)q();
    }
    
    protected final /* bridge */ LinearLayout$LayoutParams generateDefaultLayoutParams() {
        return (LinearLayout$LayoutParams)q();
    }
    
    public final /* bridge */ ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)this.h(set);
    }
    
    protected final /* bridge */ ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)r(viewGroup$LayoutParams);
    }
    
    public final /* bridge */ LinearLayout$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (LinearLayout$LayoutParams)this.h(set);
    }
    
    protected final /* bridge */ LinearLayout$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (LinearLayout$LayoutParams)r(viewGroup$LayoutParams);
    }
    
    public final adsq h(final AttributeSet set) {
        return new adsq(this.getContext(), set);
    }
    
    public final void i(final adsp adsp) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        if (adsp != null && !this.k.contains(adsp)) {
            this.k.add(adsp);
        }
    }
    
    final void j(final int g) {
        this.g = g;
        if (!this.willNotDraw()) {
            anb.H((View)this);
        }
        final List k = this.k;
        if (k != null) {
            for (int size = k.size(), i = 0; i < size; ++i) {
                final adsp adsp = this.k.get(i);
                if (adsp != null) {
                    adsp.a(this, g);
                }
            }
        }
    }
    
    public final void k(final adsp adsp) {
        final List k = this.k;
        if (k != null && adsp != null) {
            k.remove(adsp);
        }
    }
    
    public final void l(final boolean b) {
        this.m(b, anb.ao((View)this));
    }
    
    public final void m(final boolean b, final boolean b2) {
        this.s(b, b2, true);
    }
    
    public final void n() {
        this.setWillNotDraw(this.u() ^ true);
    }
    
    final boolean o(final boolean m) {
        boolean b2;
        if (this.m != m) {
            this.m = m;
            this.refreshDrawableState();
            final boolean d = this.d;
            final boolean b = b2 = true;
            if (d) {
                b2 = b;
                if (this.getBackground() instanceof adyh) {
                    final ColorStateList p = this.p;
                    final float n = 0.0f;
                    float n2 = 0.0f;
                    if (p != null) {
                        float n3;
                        if (!m) {
                            n3 = 255.0f;
                        }
                        else {
                            n3 = 0.0f;
                        }
                        if (m) {
                            n2 = 255.0f;
                        }
                        this.t(n3, n2);
                        b2 = b;
                    }
                    else {
                        float v;
                        if (m) {
                            v = 0.0f;
                        }
                        else {
                            v = this.v;
                        }
                        float v2 = n;
                        if (m) {
                            v2 = this.v;
                        }
                        this.t(v, v2);
                        b2 = b;
                    }
                }
            }
        }
        else {
            b2 = false;
        }
        return b2;
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        adyf.f((View)this);
    }
    
    protected final int[] onCreateDrawableState(int n) {
        if (this.u == null) {
            this.u = new int[4];
        }
        final int[] u = this.u;
        final int length = u.length;
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 4);
        final boolean l = this.l;
        if (!l) {
            n = -2130970341;
        }
        else {
            n = 2130970341;
        }
        final int n2 = 0;
        u[0] = n;
        int n3 = -2130970342;
        boolean b;
        if (l) {
            n = n3;
            if (this.m) {
                n = 2130970342;
            }
            b = true;
            n3 = n;
            n = n2;
        }
        else {
            b = false;
            n = 1;
        }
        u[1] = n3;
        if (1 != n) {
            n = 2130970337;
        }
        else {
            n = -2130970337;
        }
        u[2] = n;
        final int n4 = n = -2130970336;
        if (b) {
            n = n4;
            if (this.m) {
                n = 2130970336;
            }
        }
        u[3] = n;
        return mergeDrawableStates(onCreateDrawableState, u);
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final WeakReference o = this.o;
        if (o != null) {
            o.clear();
        }
        this.o = null;
    }
    
    protected final void onLayout(final boolean b, int i, int n, int a, final int n2) {
        super.onLayout(b, i, n, a, n2);
        if (anb.ai((View)this) && this.v()) {
            n = this.f();
            i = this.getChildCount();
            while (--i >= 0) {
                anb.F(this.getChildAt(i), n);
            }
        }
        this.b();
        final boolean b2 = false;
        this.a = false;
        for (n = this.getChildCount(), i = 0; i < n; ++i) {
            if (((adsq)this.getChildAt(i).getLayoutParams()).b != null) {
                this.a = true;
                break;
            }
        }
        final Drawable f = this.f;
        if (f != null) {
            f.setBounds(0, 0, this.getWidth(), this.f());
        }
        boolean l = false;
        Label_0200: {
            if (!this.d) {
                n = this.getChildCount();
                i = 0;
                while (true) {
                    l = b2;
                    if (i >= n) {
                        break Label_0200;
                    }
                    a = ((adsq)this.getChildAt(i).getLayoutParams()).a;
                    if ((a & 0x1) == 0x1 && (a & 0xA) != 0x0) {
                        break;
                    }
                    ++i;
                }
            }
            l = true;
        }
        if (this.l != l) {
            this.l = l;
            this.refreshDrawableState();
        }
    }
    
    protected final void onMeasure(int n, final int n2) {
        super.onMeasure(n, n2);
        final int mode = View$MeasureSpec.getMode(n2);
        if (mode != 1073741824 && anb.ai((View)this) && this.v()) {
            n = this.getMeasuredHeight();
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    n += this.f();
                }
            }
            else {
                n = aei.t(this.getMeasuredHeight() + this.f(), 0, View$MeasureSpec.getSize(n2));
            }
            this.setMeasuredDimension(this.getMeasuredWidth(), n);
        }
        this.b();
    }
    
    final boolean p(View view) {
        final WeakReference o = this.o;
        final View view2 = null;
        if (o == null) {
            final int n = this.n;
            if (n != -1) {
                View viewById;
                if (view != null) {
                    viewById = view.findViewById(n);
                }
                else {
                    viewById = null;
                }
                View viewById2 = viewById;
                if (viewById == null) {
                    viewById2 = viewById;
                    if (this.getParent() instanceof ViewGroup) {
                        viewById2 = ((ViewGroup)this.getParent()).findViewById(this.n);
                    }
                }
                if (viewById2 != null) {
                    this.o = new WeakReference(viewById2);
                }
            }
        }
        final WeakReference o2 = this.o;
        View view3 = view2;
        if (o2 != null) {
            view3 = (View)o2.get();
        }
        if (view3 != null) {
            view = view3;
        }
        boolean b = false;
        if (view != null) {
            if (!view.canScrollVertically(-1)) {
                if (view.getScrollY() > 0) {
                    return true;
                }
                b = b;
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    public void setElevation(final float elevation) {
        super.setElevation(elevation);
        adyf.e((View)this, elevation);
    }
    
    public final void setOrientation(final int n) {
        if (n == 1) {
            super.setOrientation(1);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }
    
    public final void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        final Drawable f = this.f;
        if (f != null) {
            f.setVisible(visibility == 0, false);
        }
    }
    
    protected final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f;
    }
}
