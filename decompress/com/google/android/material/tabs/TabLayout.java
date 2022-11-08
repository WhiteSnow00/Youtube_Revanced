// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.tabs;

import android.content.res.Resources;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.graphics.Canvas;
import android.view.ViewParent;
import java.util.Iterator;
import android.util.Log;
import java.util.List;
import android.widget.LinearLayout$LayoutParams;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.text.TextUtils;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.TimeInterpolator;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import androidx.viewpager.widget.ViewPager;
import android.widget.HorizontalScrollView;

@ckq
public class TabLayout extends HorizontalScrollView
{
    private static final akq C;
    public ViewPager A;
    public adwd B;
    private final ArrayList D;
    private adxt E;
    private int F;
    private final int G;
    private final int H;
    private final int I;
    private int J;
    private final ArrayList K;
    private adxp L;
    private ValueAnimator M;
    private cko N;
    private DataSetObserver O;
    private adxu P;
    private adxo Q;
    private boolean R;
    private final akq S;
    final adxs a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final int f;
    public final int g;
    public int h;
    public ColorStateList i;
    public ColorStateList j;
    public ColorStateList k;
    public Drawable l;
    public PorterDuff$Mode m;
    public float n;
    public float o;
    public final int p;
    public int q;
    public int r;
    int s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    int x;
    public boolean y;
    public final TimeInterpolator z;
    
    static {
        C = (akq)new aks(16);
    }
    
    public TabLayout(final Context context) {
        this(context, null);
    }
    
    public TabLayout(final Context context, final AttributeSet set) {
        this(context, set, 2130970539);
    }
    
    public TabLayout(Context context, final AttributeSet set, int g) {
        super(adyy.a(context, set, g, 2132084677), set, g);
        this.D = new ArrayList();
        this.h = -1;
        this.F = 0;
        this.q = Integer.MAX_VALUE;
        this.x = -1;
        this.K = new ArrayList();
        this.S = (akq)new akr(12);
        final Context context2 = this.getContext();
        this.setHorizontalScrollBarEnabled(false);
        final adxs a = new adxs(this, context2);
        super.addView((View)(this.a = a), 0, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -1));
        final TypedArray a2 = aduf.a(context2, set, adxm.a, g, 2132084677, new int[] { 24 });
        if (this.getBackground() instanceof ColorDrawable) {
            final ColorDrawable colorDrawable = (ColorDrawable)this.getBackground();
            final adwf adwf = new adwf();
            adwf.o(ColorStateList.valueOf(colorDrawable.getColor()));
            adwf.m(context2);
            adwf.n(ana.a((View)this));
            ana.Q((View)this, (Drawable)adwf);
        }
        Object g2;
        if ((g2 = adwd.g(context2, a2, 5)) == null) {
            g2 = new GradientDrawable();
        }
        adwd.x(this.l = ((Drawable)g2).mutate(), this.F);
        if ((g = this.x) == -1) {
            g = this.l.getIntrinsicHeight();
        }
        a.b(g);
        g = a2.getColor(8, 0);
        this.F = g;
        adwd.x(this.l, g);
        this.n(false);
        a.b(a2.getDimensionPixelSize(11, -1));
        g = a2.getInt(10, 0);
        if (this.t != g) {
            this.t = g;
            ana.H((View)a);
        }
        g = a2.getInt(7, 0);
        if (g != 0) {
            Object b;
            if (g != 1) {
                if (g != 2) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(g);
                    sb.append(" is not a valid TabIndicatorAnimationMode");
                    throw new IllegalArgumentException(sb.toString());
                }
                b = new adxl();
            }
            else {
                b = new adxk();
            }
            this.B = (adwd)b;
        }
        else {
            this.B = new adwd();
        }
        this.w = a2.getBoolean(9, true);
        a.a();
        ana.H((View)a);
        g = a2.getDimensionPixelSize(16, 0);
        this.e = g;
        this.d = g;
        this.c = g;
        this.b = g;
        this.b = a2.getDimensionPixelSize(19, g);
        this.c = a2.getDimensionPixelSize(20, this.c);
        this.d = a2.getDimensionPixelSize(18, this.d);
        this.e = a2.getDimensionPixelSize(17, this.e);
        if (aduf.c(context2)) {
            this.f = 2130970584;
        }
        else {
            this.f = 2130970565;
        }
        g = a2.getResourceId(24, 2132083880);
        this.g = g;
        context = (Context)context2.obtainStyledAttributes(g, gl.x);
        try {
            this.n = (float)((TypedArray)context).getDimensionPixelSize(0, 0);
            this.i = adwd.f(context2, (TypedArray)context, 3);
            ((TypedArray)context).recycle();
            if (a2.hasValue(22)) {
                this.h = a2.getResourceId(22, g);
            }
            g = this.h;
            if (g != -1) {
                context = (Context)context2.obtainStyledAttributes(g, gl.x);
                try {
                    ((TypedArray)context).getDimensionPixelSize(0, (int)this.n);
                    final ColorStateList f = adwd.f(context2, (TypedArray)context, 3);
                    if (f != null) {
                        final int defaultColor = this.i.getDefaultColor();
                        g = f.getDefaultColor();
                        this.i = r(defaultColor, f.getColorForState(new int[] { 16842913 }, g));
                    }
                }
                finally {
                    ((TypedArray)context).recycle();
                }
            }
            if (a2.hasValue(25)) {
                this.i = adwd.f(context2, a2, 25);
            }
            if (a2.hasValue(23)) {
                g = a2.getColor(23, 0);
                this.i = r(this.i.getDefaultColor(), g);
            }
            this.j = adwd.f(context2, a2, 3);
            this.m = adwd.q(a2.getInt(4, -1), (PorterDuff$Mode)null);
            this.k = adwd.f(context2, a2, 21);
            this.s = a2.getInt(6, 300);
            this.z = adwd.o(context2, 2130969956, adqd.b);
            this.G = a2.getDimensionPixelSize(14, -1);
            this.H = a2.getDimensionPixelSize(13, -1);
            this.p = a2.getResourceId(0, 0);
            this.J = a2.getDimensionPixelSize(1, 0);
            this.u = a2.getInt(15, 1);
            this.r = a2.getInt(2, 0);
            this.v = a2.getBoolean(12, false);
            this.y = a2.getBoolean(26, false);
            a2.recycle();
            context = (Context)this.getResources();
            this.o = (float)((Resources)context).getDimensionPixelSize(2131166289);
            this.I = ((Resources)context).getDimensionPixelSize(2131166287);
            this.g();
        }
        finally {
            ((TypedArray)context).recycle();
        }
    }
    
    private final int p(int width, final float n) {
        final int u = this.u;
        final int n2 = 0;
        if (u != 0 && u != 2) {
            return 0;
        }
        final View child = this.a.getChildAt(width);
        if (child == null) {
            return 0;
        }
        View child2;
        if (++width < this.a.getChildCount()) {
            child2 = this.a.getChildAt(width);
        }
        else {
            child2 = null;
        }
        final int width2 = child.getWidth();
        width = n2;
        if (child2 != null) {
            width = child2.getWidth();
        }
        final int n3 = child.getLeft() + width2 / 2 - this.getWidth() / 2;
        width = (int)((width2 + width) * 0.5f * n);
        if (ana.f((View)this) == 0) {
            width += n3;
        }
        else {
            width = n3 - width;
        }
        return width;
    }
    
    private final int q() {
        final int g = this.G;
        if (g != -1) {
            return g;
        }
        final int u = this.u;
        if (u != 0 && u != 2) {
            return 0;
        }
        return this.I;
    }
    
    private static ColorStateList r(final int n, final int n2) {
        return new ColorStateList(new int[][] { TabLayout.SELECTED_STATE_SET, TabLayout.EMPTY_STATE_SET }, new int[] { n2, n });
    }
    
    private final void s(final View view) {
        if (view instanceof adxn) {
            final adxn adxn = (adxn)view;
            final adxt d = this.d();
            final CharSequence a = adxn.a;
            final Drawable b = adxn.b;
            final int c = adxn.c;
            if (!TextUtils.isEmpty(adxn.getContentDescription())) {
                d.c = adxn.getContentDescription();
                d.b();
            }
            this.f(d, this.D.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }
    
    private final void t(final int n) {
        if (n == -1) {
            return;
        }
        Label_0209: {
            if (this.getWindowToken() != null && ana.ao((View)this)) {
                final adxs a = this.a;
                for (int childCount = a.getChildCount(), i = 0; i < childCount; ++i) {
                    if (a.getChildAt(i).getWidth() <= 0) {
                        break Label_0209;
                    }
                }
                final int scrollX = this.getScrollX();
                final int p = this.p(n, 0.0f);
                if (scrollX != p) {
                    if (this.M == null) {
                        (this.M = new ValueAnimator()).setInterpolator(this.z);
                        this.M.setDuration((long)this.s);
                        this.M.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new adrg(this, 6));
                    }
                    this.M.setIntValues(new int[] { scrollX, p });
                    this.M.start();
                }
                final adxs a2 = this.a;
                final int s = this.s;
                final ValueAnimator a3 = a2.a;
                if (a3 != null && a3.isRunning()) {
                    a2.a.cancel();
                }
                a2.d(true, n, s);
                return;
            }
        }
        this.o(n);
    }
    
    private final void u(final int n) {
        final int childCount = this.a.getChildCount();
        if (n < childCount) {
            for (int i = 0; i < childCount; ++i) {
                final View child = this.a.getChildAt(i);
                final boolean b = i == n;
                child.setSelected(b);
                child.setActivated(b);
            }
        }
    }
    
    private final void v(final LinearLayout$LayoutParams linearLayout$LayoutParams) {
        if (this.u == 1 && this.r == 0) {
            linearLayout$LayoutParams.width = 0;
            linearLayout$LayoutParams.weight = 1.0f;
            return;
        }
        linearLayout$LayoutParams.width = -2;
        linearLayout$LayoutParams.weight = 0.0f;
    }
    
    private final boolean w() {
        final int u = this.u;
        return u == 0 || u == 2;
    }
    
    private final void x(final ViewPager a, final boolean r) {
        final ViewPager a2 = this.A;
        if (a2 != null) {
            final adxu p2 = this.P;
            if (p2 != null) {
                a2.j((cku)p2);
            }
            final adxo q = this.Q;
            if (q != null) {
                final List g = this.A.g;
                if (g != null) {
                    g.remove(q);
                }
            }
        }
        final adxp l = this.L;
        if (l != null) {
            this.K.remove(l);
            this.L = null;
        }
        if (a != null) {
            this.A = a;
            if (this.P == null) {
                this.P = new adxu(this);
            }
            final adxu p3 = this.P;
            p3.b = 0;
            p3.a = 0;
            a.e((cku)p3);
            this.e(this.L = (adxp)new adxw(a));
            final cko b = a.b;
            if (b != null) {
                this.k(b, true);
            }
            if (this.Q == null) {
                this.Q = new adxo(this);
            }
            final adxo q2 = this.Q;
            q2.a = true;
            if (a.g == null) {
                a.g = new ArrayList();
            }
            a.g.add(q2);
            this.o(a.a());
        }
        else {
            this.A = null;
            this.k(null, false);
        }
        this.R = r;
    }
    
    public final int a() {
        final adxt e = this.E;
        if (e != null) {
            return e.d;
        }
        return -1;
    }
    
    public final void addView(final View view) {
        this.s(view);
    }
    
    public final void addView(final View view, final int n) {
        this.s(view);
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.s(view);
    }
    
    public final void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.s(view);
    }
    
    public final int b() {
        return this.D.size();
    }
    
    public final adxt c(final int n) {
        if (n >= 0 && n < this.b()) {
            return this.D.get(n);
        }
        return null;
    }
    
    public final adxt d() {
        adxt adxt;
        if ((adxt = (adxt)TabLayout.C.a()) == null) {
            adxt = new adxt();
        }
        adxt.g = this;
        final akq s = this.S;
        adxv adxv;
        if (s != null) {
            adxv = (adxv)s.a();
        }
        else {
            adxv = null;
        }
        adxv h = adxv;
        if (adxv == null) {
            h = new adxv(this, this.getContext());
        }
        h.a(adxt);
        h.setFocusable(true);
        h.setMinimumWidth(this.q());
        if (TextUtils.isEmpty(adxt.c)) {
            h.setContentDescription(adxt.b);
        }
        else {
            h.setContentDescription(adxt.c);
        }
        adxt.h = h;
        if (adxt.i != -1) {
            adxt.h.setId(0);
        }
        return adxt;
    }
    
    @Deprecated
    public final void e(final adxp adxp) {
        if (!this.K.contains(adxp)) {
            this.K.add(adxp);
        }
    }
    
    public final void f(final adxt adxt, final boolean b) {
        int size = this.D.size();
        if (adxt.g == this) {
            adxt.d = size;
            this.D.add(size, adxt);
            while (++size < this.D.size()) {
                ((adxt)this.D.get(size)).d = size;
            }
            final adxv h = adxt.h;
            h.setSelected(false);
            h.setActivated(false);
            final adxs a = this.a;
            final int d = adxt.d;
            final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -1);
            this.v(linearLayout$LayoutParams);
            a.addView((View)h, d, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
            if (b) {
                adxt.a();
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }
    
    public final void g() {
        final int u = this.u;
        int max;
        if (u != 0 && u != 2) {
            max = 0;
        }
        else {
            max = Math.max(0, this.J - this.b);
        }
        ana.ab((View)this.a, max, 0, 0, 0);
        final int u2 = this.u;
        Label_0151: {
            if (u2 != 0) {
                if (u2 == 1 || u2 == 2) {
                    if (this.r == 2) {
                        Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                    }
                    this.a.setGravity(1);
                }
            }
            else {
                final int r = this.r;
                if (r != 0) {
                    if (r == 1) {
                        this.a.setGravity(1);
                        break Label_0151;
                    }
                    if (r != 2) {
                        break Label_0151;
                    }
                }
                else {
                    Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
                }
                this.a.setGravity(8388611);
            }
        }
        this.n(true);
    }
    
    public final FrameLayout$LayoutParams generateLayoutParams(final AttributeSet set) {
        return this.generateDefaultLayoutParams();
    }
    
    public final void h() {
        for (int i = this.a.getChildCount() - 1; i >= 0; --i) {
            final adxv adxv = (adxv)this.a.getChildAt(i);
            this.a.removeViewAt(i);
            if (adxv != null) {
                adxv.a((adxt)null);
                adxv.setSelected(false);
                this.S.b((Object)adxv);
            }
            this.requestLayout();
        }
        final Iterator iterator = this.D.iterator();
        while (iterator.hasNext()) {
            final adxt adxt = (adxt)iterator.next();
            iterator.remove();
            adxt.g = null;
            adxt.h = null;
            adxt.a = null;
            adxt.i = -1;
            adxt.b = null;
            adxt.c = null;
            adxt.d = -1;
            adxt.e = null;
            TabLayout.C.b((Object)adxt);
        }
        this.E = null;
        final cko n = this.N;
        if (n != null) {
            final int j = n.j();
            for (int k = 0; k < j; ++k) {
                final adxt d = this.d();
                final CharSequence l = this.N.l(k);
                if (TextUtils.isEmpty(d.c) && !TextUtils.isEmpty(l)) {
                    d.h.setContentDescription(l);
                }
                d.b = l;
                d.b();
                this.f(d, false);
            }
            final ViewPager a = this.A;
            if (a != null && j > 0) {
                final int a2 = a.a();
                if (a2 != this.a() && a2 < this.b()) {
                    this.i(this.c(a2));
                }
            }
        }
    }
    
    public final void i(final adxt adxt) {
        this.j(adxt, true);
    }
    
    public final void j(final adxt e, final boolean b) {
        final adxt e2 = this.E;
        if (e2 == e) {
            if (e2 != null) {
                for (int i = this.K.size() - 1; i >= 0; --i) {
                    ((adxp)this.K.get(i)).a(e);
                }
                this.t(e.d);
            }
        }
        else {
            int d;
            if (e != null) {
                d = e.d;
            }
            else {
                d = -1;
            }
            if (b) {
                if ((e2 == null || e2.d == -1) && d != -1) {
                    this.o(d);
                }
                else {
                    this.t(d);
                }
                if (d != -1) {
                    this.u(d);
                }
            }
            this.E = e;
            if (e2 != null && e2.g != null) {
                for (int j = this.K.size() - 1; j >= 0; --j) {
                    ((adxp)this.K.get(j)).c();
                }
                final adxv h = e2.h;
                if (h != null) {
                    h.b();
                }
            }
            if (e != null) {
                for (int k = this.K.size() - 1; k >= 0; --k) {
                    ((adxp)this.K.get(k)).b(e);
                }
                final adxv h2 = e.h;
                if (h2 != null) {
                    h2.b();
                }
            }
        }
    }
    
    public final void k(final cko n, final boolean b) {
        final cko n2 = this.N;
        if (n2 != null) {
            final DataSetObserver o = this.O;
            if (o != null) {
                n2.b.unregisterObserver((Object)o);
            }
        }
        this.N = n;
        if (b && n != null) {
            if (this.O == null) {
                this.O = (DataSetObserver)new adxq(this);
            }
            n.b.registerObserver((Object)this.O);
        }
        this.h();
    }
    
    public final void l(int p4, final float n, final boolean b, final boolean b2) {
        final int round = Math.round(p4 + n);
        if (round >= 0) {
            if (round < this.a.getChildCount()) {
                if (b2) {
                    final adxs a = this.a;
                    final ValueAnimator a2 = a.a;
                    if (a2 != null && a2.isRunning()) {
                        a.a.cancel();
                    }
                    a.c(a.getChildAt(p4), a.getChildAt(p4 + 1), n);
                }
                final ValueAnimator m = this.M;
                if (m != null && m.isRunning()) {
                    this.M.cancel();
                }
                if (p4 < 0) {
                    p4 = 0;
                }
                else {
                    p4 = this.p(p4, n);
                }
                this.scrollTo(p4, 0);
                if (b) {
                    this.u(round);
                }
            }
        }
    }
    
    public final void m(final ViewPager viewPager) {
        this.x(viewPager, false);
    }
    
    public final void n(final boolean b) {
        for (int i = 0; i < this.a.getChildCount(); ++i) {
            final View child = this.a.getChildAt(i);
            child.setMinimumWidth(this.q());
            this.v((LinearLayout$LayoutParams)child.getLayoutParams());
            if (b) {
                child.requestLayout();
            }
        }
    }
    
    public final void o(final int n) {
        this.l(n, 0.0f, true, true);
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        adwd.ae((View)this);
        if (this.A == null) {
            final ViewParent parent = this.getParent();
            if (parent instanceof ViewPager) {
                this.x((ViewPager)parent, true);
            }
        }
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.R) {
            this.m(null);
            this.R = false;
        }
    }
    
    protected final void onDraw(final Canvas canvas) {
        for (int i = 0; i < this.a.getChildCount(); ++i) {
            final View child = this.a.getChildAt(i);
            if (child instanceof adxv) {
                final adxv adxv = (adxv)child;
                final Drawable c = adxv.c;
                if (c != null) {
                    c.setBounds(adxv.getLeft(), adxv.getTop(), adxv.getRight(), adxv.getBottom());
                    adxv.c.draw(canvas);
                }
            }
        }
        super.onDraw(canvas);
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        aol.c(accessibilityNodeInfo).s((Object)bx.K(1, this.b(), 1));
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return this.w() && super.onInterceptTouchEvent(motionEvent);
    }
    
    protected final void onMeasure(int n, int h) {
        final Context context = this.getContext();
        final int size = this.D.size();
        final int n2 = 0;
        int n3 = 0;
        int n4;
        while (true) {
            n4 = 48;
            if (n3 >= size) {
                break;
            }
            final adxt adxt = this.D.get(n3);
            if (adxt != null && adxt.a != null && !TextUtils.isEmpty(adxt.b)) {
                n4 = n4;
                if (!this.v) {
                    n4 = 72;
                    break;
                }
                break;
            }
            else {
                ++n3;
            }
        }
        final int round = Math.round(adwd.p(context, n4));
        final int mode = View$MeasureSpec.getMode(h);
        int measureSpec;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                measureSpec = h;
            }
            else {
                measureSpec = View$MeasureSpec.makeMeasureSpec(round + this.getPaddingTop() + this.getPaddingBottom(), 1073741824);
            }
        }
        else {
            measureSpec = h;
            if (this.getChildCount() == 1) {
                measureSpec = h;
                if (View$MeasureSpec.getSize(h) >= round) {
                    this.getChildAt(0).setMinimumHeight(round);
                    measureSpec = h;
                }
            }
        }
        final int size2 = View$MeasureSpec.getSize(n);
        if (View$MeasureSpec.getMode(n) != 0) {
            h = this.H;
            if (h <= 0) {
                h = (int)(size2 - adwd.p(this.getContext(), 56));
            }
            this.q = h;
        }
        super.onMeasure(n, measureSpec);
        if (this.getChildCount() == 1) {
            final View child = this.getChildAt(0);
            n = this.u;
            Label_0316: {
                Label_0314: {
                    if (n != 0) {
                        if (n != 1) {
                            if (n != 2) {
                                return;
                            }
                        }
                        else {
                            n = n2;
                            if (child.getMeasuredWidth() != this.getMeasuredWidth()) {
                                break Label_0314;
                            }
                            break Label_0316;
                        }
                    }
                    n = n2;
                    if (child.getMeasuredWidth() >= this.getMeasuredWidth()) {
                        break Label_0316;
                    }
                }
                n = 1;
            }
            if (n != 0) {
                n = getChildMeasureSpec(measureSpec, this.getPaddingTop() + this.getPaddingBottom(), child.getLayoutParams().height);
                child.measure(View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824), n);
            }
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return (motionEvent.getActionMasked() != 8 || this.w()) && super.onTouchEvent(motionEvent);
    }
    
    public final void setElevation(final float elevation) {
        super.setElevation(elevation);
        adwd.ad((View)this, elevation);
    }
    
    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, this.a.getWidth() - this.getWidth() - this.getPaddingLeft() - this.getPaddingRight()) > 0;
    }
}
