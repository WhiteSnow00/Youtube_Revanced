// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.os.Build$VERSION;
import android.content.res.Configuration;
import android.view.WindowInsets;
import android.view.Window$Callback;
import android.view.Menu;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.OverScroller;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.view.ViewGroup;

public class ActionBarOverlayLayout extends ViewGroup implements lp, alt, alr, als
{
    static final int[] a;
    private final Runnable A;
    private final alu B;
    public int b;
    public ActionBarContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public jn h;
    public ViewPropertyAnimator i;
    public final AnimatorListenerAdapter j;
    private int k;
    private ContentFrameLayout l;
    private lq m;
    private Drawable n;
    private boolean o;
    private boolean p;
    private int q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private aoa u;
    private aoa v;
    private aoa w;
    private aoa x;
    private OverScroller y;
    private final Runnable z;
    
    static {
        a = new int[] { 2130968584, 16842841 };
    }
    
    public ActionBarOverlayLayout(final Context context) {
        this(context, null);
    }
    
    public ActionBarOverlayLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        this.u = aoa.a;
        final aoa a = aoa.a;
        this.v = a;
        this.w = a;
        this.x = a;
        this.j = new jm(this);
        this.z = new be(this, 8);
        this.A = new be(this, 9);
        this.v(context);
        this.B = new alu();
    }
    
    private final void v(final Context context) {
        final TypedArray obtainStyledAttributes = this.getContext().getTheme().obtainStyledAttributes(ActionBarOverlayLayout.a);
        final boolean b = false;
        this.k = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        final Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.n = drawable;
        this.setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        boolean o = b;
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            o = true;
        }
        this.o = o;
        this.y = new OverScroller(context);
    }
    
    private static final boolean w(final View view, final Rect rect, final boolean b) {
        final jo jo = (jo)view.getLayoutParams();
        boolean b2;
        if (jo.leftMargin != rect.left) {
            jo.leftMargin = rect.left;
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (jo.topMargin != rect.top) {
            jo.topMargin = rect.top;
            b2 = true;
        }
        if (jo.rightMargin != rect.right) {
            jo.rightMargin = rect.right;
            b2 = true;
        }
        if (b && jo.bottomMargin != rect.bottom) {
            jo.bottomMargin = rect.bottom;
            return true;
        }
        return b2;
    }
    
    public final void a() {
        this.i();
        this.m.e();
    }
    
    public final void b() {
        this.removeCallbacks(this.z);
        this.removeCallbacks(this.A);
        final ViewPropertyAnimator i = this.i;
        if (i != null) {
            i.cancel();
        }
    }
    
    public final void c(final int n) {
        this.i();
        if (n == 2) {
            this.m.g();
            return;
        }
        if (n == 5) {
            this.m.f();
            return;
        }
        if (n != 109) {
            return;
        }
        boolean o = true;
        this.d = true;
        if (this.getContext().getApplicationInfo().targetSdkVersion >= 19) {
            o = false;
        }
        this.o = o;
    }
    
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof jo;
    }
    
    public final void d(final View view, final int n, final int n2, final int[] array, final int n3) {
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.n != null && !this.o) {
            int n;
            if (this.c.getVisibility() == 0) {
                n = (int)(this.c.getBottom() + this.c.getTranslationY() + 0.5f);
            }
            else {
                n = 0;
            }
            this.n.setBounds(0, n, this.getWidth(), this.n.getIntrinsicHeight() + n);
            this.n.draw(canvas);
        }
    }
    
    public final void e(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n5 == 0) {
            this.onNestedScroll(view, n, n2, n3, n4);
        }
    }
    
    public final void f(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        this.e(view, n, n2, n3, n4, n5);
    }
    
    public final void g(final View view, final View view2, final int n, final int n2) {
        if (n2 == 0) {
            this.onNestedScrollAccepted(view, view2, n);
        }
    }
    
    protected final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new jo(viewGroup$LayoutParams);
    }
    
    public final int getNestedScrollAxes() {
        return this.B.a();
    }
    
    public final void h(final View view, final int n) {
        if (n == 0) {
            this.onStopNestedScroll(view);
        }
    }
    
    final void i() {
        if (this.l == null) {
            this.l = (ContentFrameLayout)this.findViewById(2131427445);
            this.c = (ActionBarContainer)this.findViewById(2131427447);
            final View viewById = this.findViewById(2131427444);
            lq f;
            if (viewById instanceof lq) {
                f = (lq)viewById;
            }
            else {
                if (!(viewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(String.valueOf(((Toolbar)viewById).getClass().getSimpleName())));
                }
                f = ((Toolbar)viewById).f();
            }
            this.m = f;
        }
    }
    
    public final void j(int max) {
        this.b();
        max = Math.max(0, Math.min(max, this.c.getHeight()));
        this.c.setTranslationY((float)(-max));
    }
    
    public final void k(final boolean p) {
        if (p != this.p && !(this.p = p)) {
            this.b();
            this.j(0);
        }
    }
    
    public final void l(final Menu menu, final iy iy) {
        this.i();
        this.m.k(menu, iy);
    }
    
    public final void m() {
        this.i();
        this.m.l();
    }
    
    public final void n(final Window$Callback window$Callback) {
        this.i();
        this.m.q(window$Callback);
    }
    
    public final void o(final CharSequence charSequence) {
        this.i();
        this.m.r(charSequence);
    }
    
    public final WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        this.i();
        final aoa p = aoa.p(windowInsets, (View)this);
        boolean w = w((View)this.c, new Rect(p.b(), p.d(), p.c(), p.a()), false);
        ana.au((View)this, p, this.r);
        final aoa m = p.m(this.r.left, this.r.top, this.r.right, this.r.bottom);
        this.u = m;
        if (!this.v.equals((Object)m)) {
            this.v = this.u;
            w = true;
        }
        if (!this.s.equals((Object)this.r)) {
            this.s.set(this.r);
        }
        else if (!w) {
            return p.j().l().k().e();
        }
        this.requestLayout();
        return p.j().l().k().e();
    }
    
    protected final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.v(this.getContext());
        ana.L((View)this);
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b();
    }
    
    protected final void onLayout(final boolean b, int i, int paddingLeft, int paddingTop, int childCount) {
        childCount = this.getChildCount();
        paddingLeft = this.getPaddingLeft();
        paddingTop = this.getPaddingTop();
        View child;
        jo jo;
        int measuredWidth;
        int measuredHeight;
        int n;
        int n2;
        for (i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                jo = (jo)child.getLayoutParams();
                measuredWidth = child.getMeasuredWidth();
                measuredHeight = child.getMeasuredHeight();
                n = jo.leftMargin + paddingLeft;
                n2 = jo.topMargin + paddingTop;
                child.layout(n, n2, measuredWidth + n, measuredHeight + n2);
            }
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        this.i();
        this.measureChildWithMargins((View)this.c, n, 0, n2, 0);
        final jo jo = (jo)this.c.getLayoutParams();
        final int max = Math.max(0, this.c.getMeasuredWidth() + jo.leftMargin + jo.rightMargin);
        final int max2 = Math.max(0, this.c.getMeasuredHeight() + jo.topMargin + jo.bottomMargin);
        final int combineMeasuredStates = View.combineMeasuredStates(0, this.c.getMeasuredState());
        final boolean b = (ana.k((View)this) & 0x100) != 0x0;
        int n3;
        if (b) {
            n3 = this.k;
        }
        else if (this.c.getVisibility() != 8) {
            n3 = this.c.getMeasuredHeight();
        }
        else {
            n3 = 0;
        }
        this.t.set(this.r);
        final aoa u = this.u;
        this.w = u;
        if (!this.d && !b) {
            final Rect t = this.t;
            t.top += n3;
            final Rect t2 = this.t;
            t2.bottom = t2.bottom;
            this.w = this.w.m(0, n3, 0, 0);
        }
        else {
            final aia d = aia.d(u.b(), this.w.d() + n3, this.w.c(), this.w.a());
            final aoa w = this.w;
            Object o;
            if (Build$VERSION.SDK_INT >= 30) {
                o = new anr(w);
            }
            else if (Build$VERSION.SDK_INT >= 29) {
                o = new anq(w);
            }
            else {
                o = new anp(w);
            }
            ((ans)o).c(d);
            this.w = ((ans)o).a();
        }
        w((View)this.l, this.t, true);
        if (!this.x.equals((Object)this.w)) {
            final aoa w2 = this.w;
            this.x = w2;
            ana.v((View)this.l, w2);
        }
        this.measureChildWithMargins((View)this.l, n, 0, n2, 0);
        final jo jo2 = (jo)this.l.getLayoutParams();
        final int max3 = Math.max(max, this.l.getMeasuredWidth() + jo2.leftMargin + jo2.rightMargin);
        final int max4 = Math.max(max2, this.l.getMeasuredHeight() + jo2.topMargin + jo2.bottomMargin);
        final int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.l.getMeasuredState());
        this.setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + (this.getPaddingLeft() + this.getPaddingRight()), this.getSuggestedMinimumWidth()), n, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight()), n2, combineMeasuredStates2 << 16));
    }
    
    public final boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        if (this.p && b) {
            this.y.fling(0, 0, 0, (int)n2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.y.getFinalY() > this.c.getHeight()) {
                this.b();
                this.A.run();
            }
            else {
                this.b();
                this.z.run();
            }
            return this.f = true;
        }
        return false;
    }
    
    public final boolean onNestedPreFling(final View view, final float n, final float n2) {
        return false;
    }
    
    public final void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
    }
    
    public final void onNestedScroll(final View view, int q, final int n, final int n2, final int n3) {
        q = this.q + n;
        this.j(this.q = q);
    }
    
    public final void onNestedScrollAccepted(final View view, final View view2, int q) {
        this.B.d(q);
        final ActionBarContainer c = this.c;
        if (c != null) {
            q = -(int)c.getTranslationY();
        }
        else {
            q = 0;
        }
        this.q = q;
        this.b();
        final jn h = this.h;
        if (h != null) {
            final gk gk = (gk)h;
            final hv n = gk.n;
            if (n != null) {
                n.a();
                gk.n = null;
            }
        }
    }
    
    public final boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return (n & 0x2) != 0x0 && this.c.getVisibility() == 0 && this.p;
    }
    
    public final void onStopNestedScroll(final View view) {
        if (this.p && !this.f) {
            if (this.q <= this.c.getHeight()) {
                this.b();
                this.postDelayed(this.z, 600L);
                return;
            }
            this.b();
            this.postDelayed(this.A, 600L);
        }
    }
    
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(final int g) {
        super.onWindowSystemUiVisibilityChanged(g);
        this.i();
        final int g2 = this.g;
        this.g = g;
        final int n = g & 0x100;
        final jn h = this.h;
        if (h != null) {
            final boolean k = n == 0;
            final gk gk = (gk)h;
            gk.k = k;
            if ((g & 0x4) != 0x0 && n != 0) {
                if (!gk.m) {
                    gk.E(gk.m = true);
                }
            }
            else if (gk.m) {
                gk.m = false;
                gk.E(true);
            }
        }
        if (((g2 ^ g) & 0x100) != 0x0 && this.h != null) {
            ana.L((View)this);
        }
    }
    
    protected final void onWindowVisibilityChanged(final int n) {
        super.onWindowVisibilityChanged(n);
        this.b = n;
        final jn h = this.h;
        if (h != null) {
            ((gk)h).j = n;
        }
    }
    
    public final boolean p() {
        this.i();
        return this.m.s();
    }
    
    public final boolean q() {
        this.i();
        return this.m.u();
    }
    
    public final boolean r() {
        this.i();
        return this.m.v();
    }
    
    public final boolean s() {
        this.i();
        return this.m.w();
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public final boolean t(final View view, final View view2, final int n, final int n2) {
        return n2 == 0 && this.onStartNestedScroll(view, view2, n);
    }
    
    public final boolean u() {
        this.i();
        return this.m.x();
    }
}
