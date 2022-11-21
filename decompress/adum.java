import android.view.View$MeasureSpec;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.Region$Op;
import android.graphics.Canvas;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.text.TextUtils;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewParent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import com.google.android.material.appbar.AppBarLayout;
import android.graphics.drawable.Drawable$Callback;
import android.view.animation.AnimationUtils;
import android.text.TextUtils$TruncateAt;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class adum extends FrameLayout
{
    private int A;
    private int B;
    private boolean C;
    private int D;
    private boolean E;
    private boolean a;
    private int b;
    private ViewGroup c;
    final adxd d;
    final adwd e;
    public Drawable f;
    public Drawable g;
    int h;
    public aoc i;
    private View j;
    private View k;
    private int l;
    private int m;
    private int n;
    private int o;
    private final Rect p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean t;
    private ValueAnimator u;
    private long v;
    private final TimeInterpolator w;
    private final TimeInterpolator x;
    private int y;
    private aduj z;
    
    public adum(final Context context) {
        this(context, null);
    }
    
    public adum(final Context context, final AttributeSet set) {
        this(context, set, 2130969035);
    }
    
    public adum(final Context context, final AttributeSet set, int q) {
        super(aecs.a(context, set, q, 2132084680), set, q);
        this.a = true;
        this.p = new Rect();
        this.y = -1;
        this.B = 0;
        this.D = 0;
        final Context context2 = this.getContext();
        final adxd d = new adxd((View)this);
        (this.d = d).u(adtw.e);
        d.m = false;
        final adwd e = new adwd(context2);
        this.e = e;
        final TypedArray a = adxy.a(context2, set, aduq.c, q, 2132084680, new int[0]);
        d.p(a.getInt(4, 8388691));
        d.m(a.getInt(0, 8388627));
        q = a.getDimensionPixelSize(5, 0);
        this.o = q;
        this.n = q;
        this.m = q;
        this.l = q;
        if (a.hasValue(8)) {
            this.l = a.getDimensionPixelSize(8, 0);
        }
        if (a.hasValue(7)) {
            this.n = a.getDimensionPixelSize(7, 0);
        }
        if (a.hasValue(9)) {
            this.m = a.getDimensionPixelSize(9, 0);
        }
        if (a.hasValue(6)) {
            this.o = a.getDimensionPixelSize(6, 0);
        }
        this.q = a.getBoolean(20, true);
        this.l(a.getText(18));
        d.o(2132083873);
        d.k(2132083839);
        if (a.hasValue(10)) {
            d.o(a.getResourceId(10, 0));
        }
        if (a.hasValue(1)) {
            d.k(a.getResourceId(1, 0));
        }
        if (a.hasValue(22)) {
            q = a.getInt(22, -1);
            TextUtils$TruncateAt j;
            if (q != 0) {
                if (q != 1) {
                    if (q != 3) {
                        j = TextUtils$TruncateAt.END;
                    }
                    else {
                        j = TextUtils$TruncateAt.MARQUEE;
                    }
                }
                else {
                    j = TextUtils$TruncateAt.MIDDLE;
                }
            }
            else {
                j = TextUtils$TruncateAt.START;
            }
            d.j = j;
            d.g();
        }
        if (a.hasValue(11)) {
            final ColorStateList f = adzw.f(context2, a, 11);
            if (d.g != f) {
                d.g = f;
                d.g();
            }
        }
        if (a.hasValue(2)) {
            d.l(adzw.f(context2, a, 2));
        }
        this.y = a.getDimensionPixelSize(16, -1);
        if (a.hasValue(14)) {
            q = a.getInt(14, 1);
            if (q != d.q) {
                d.q = q;
                d.g();
            }
        }
        if (a.hasValue(21)) {
            d.s((TimeInterpolator)AnimationUtils.loadInterpolator(context2, a.getResourceId(21, 0)));
        }
        this.v = a.getInt(15, 600);
        this.w = adfe.A(context2, 2130969960, adtw.c);
        this.x = adfe.A(context2, 2130969960, adtw.d);
        this.i(a.getDrawable(3));
        final Drawable drawable = a.getDrawable(17);
        final Drawable g = this.g;
        if (g != drawable) {
            Drawable mutate = null;
            if (g != null) {
                g.setCallback((Drawable$Callback)null);
            }
            if (drawable != null) {
                mutate = drawable.mutate();
            }
            if ((this.g = mutate) != null) {
                if (mutate.isStateful()) {
                    this.g.setState(this.getDrawableState());
                }
                ais.b(this.g, anc.f((View)this));
                this.g.setVisible(this.getVisibility() == 0, false);
                this.g.setCallback((Drawable$Callback)this);
                this.g.setAlpha(this.s);
            }
            anc.H((View)this);
        }
        this.A = a.getInt(19, 0);
        final boolean u = this.u();
        d.b = u;
        final ViewParent parent = this.getParent();
        if (parent instanceof AppBarLayout) {
            this.b((AppBarLayout)parent);
        }
        if (u && this.f == null) {
            this.j(e.a(e.b, this.getResources().getDimension(2131166244)));
        }
        this.b = a.getResourceId(23, -1);
        this.C = a.getBoolean(13, false);
        this.E = a.getBoolean(12, false);
        a.recycle();
        this.setWillNotDraw(false);
        anc.Z((View)this, (alx)new adxt(this, 1));
    }
    
    private static int a(final View view) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
            return view.getMeasuredHeight() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }
    
    private final void b(final AppBarLayout appBarLayout) {
        if (this.u()) {
            appBarLayout.d = false;
        }
    }
    
    private final void d() {
        if (!this.a) {
            return;
        }
        final ViewGroup viewGroup = null;
        this.c = null;
        this.j = null;
        final int b = this.b;
        if (b != -1) {
            Object o = this.findViewById(b);
            if ((this.c = (ViewGroup)o) != null) {
                for (ViewParent viewParent = ((View)o).getParent(); viewParent != this && viewParent != null; viewParent = viewParent.getParent()) {
                    if (viewParent instanceof View) {
                        o = viewParent;
                    }
                }
                this.j = (View)o;
            }
        }
        if (this.c == null) {
            final int childCount = this.getChildCount();
            int n = 0;
            ViewGroup c;
            while (true) {
                c = viewGroup;
                if (n >= childCount) {
                    break;
                }
                final View child = this.getChildAt(n);
                if (child instanceof Toolbar || child instanceof android.widget.Toolbar) {
                    c = (ViewGroup)child;
                    break;
                }
                ++n;
            }
            this.c = c;
        }
        this.r();
        this.a = false;
    }
    
    private final void e() {
        CharSequence k;
        if (this.q) {
            k = this.d.k;
        }
        else {
            k = null;
        }
        this.setContentDescription(k);
    }
    
    static adus h(final View view) {
        adus adus;
        if ((adus = (adus)view.getTag(2131432369)) == null) {
            adus = new adus(view);
            view.setTag(2131432369, (Object)adus);
        }
        return adus;
    }
    
    protected static final aduk o() {
        return new aduk();
    }
    
    private final void p(final Drawable drawable, final int n, final int n2) {
        this.q(drawable, (View)this.c, n, n2);
    }
    
    private final void q(final Drawable drawable, final View view, final int n, final int n2) {
        int bottom = n2;
        if (this.u()) {
            bottom = n2;
            if (view != null) {
                bottom = n2;
                if (this.q) {
                    bottom = view.getBottom();
                }
            }
        }
        drawable.setBounds(0, 0, n, bottom);
    }
    
    private final void r() {
        if (!this.q) {
            final View k = this.k;
            if (k != null) {
                final ViewParent parent = k.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup)parent).removeView(this.k);
                }
            }
        }
        if (this.q && this.c != null) {
            if (this.k == null) {
                this.k = new View(this.getContext());
            }
            if (this.k.getParent() == null) {
                this.c.addView(this.k, -1, -1);
            }
        }
    }
    
    private final void s(final int n, final int n2, final int n3, final int n4, boolean b) {
        if (this.q) {
            final View k = this.k;
            if (k != null) {
                final boolean am = anc.am(k);
                int n5 = 0;
                if (!(this.r = (am && this.k.getVisibility() == 0))) {
                    if (!b) {
                        return;
                    }
                    b = true;
                }
                final int f = anc.f((View)this);
                final boolean b2 = f == 1;
                Object o;
                if ((o = this.j) == null) {
                    o = this.c;
                }
                final int f2 = this.f((View)o);
                adxe.a((ViewGroup)this, this.k, this.p);
                final ViewGroup c = this.c;
                int n6;
                int n7;
                int n8;
                if (c instanceof Toolbar) {
                    final Toolbar toolbar = (Toolbar)c;
                    n5 = toolbar.j;
                    n6 = toolbar.k;
                    n7 = toolbar.l;
                    n8 = toolbar.m;
                }
                else if (c instanceof android.widget.Toolbar) {
                    final android.widget.Toolbar toolbar2 = (android.widget.Toolbar)c;
                    n5 = toolbar2.getTitleMarginStart();
                    n6 = toolbar2.getTitleMarginEnd();
                    n7 = toolbar2.getTitleMarginTop();
                    n8 = toolbar2.getTitleMarginBottom();
                }
                else {
                    n8 = 0;
                    n6 = 0;
                    n7 = 0;
                }
                final adxd d = this.d;
                final int left = this.p.left;
                int n9;
                if (f == 1) {
                    n9 = n6;
                }
                else {
                    n9 = n5;
                }
                final int top = this.p.top;
                final int right = this.p.right;
                if (f != 1) {
                    n5 = n6;
                }
                d.j(left + n9, top + f2 + n7, right - n5, this.p.bottom + f2 - n8);
                final adxd d2 = this.d;
                int n10;
                if (b2) {
                    n10 = this.n;
                }
                else {
                    n10 = this.l;
                }
                final int top2 = this.p.top;
                final int m = this.m;
                int n11;
                if (b2) {
                    n11 = this.l;
                }
                else {
                    n11 = this.n;
                }
                d2.n(n10, top2 + m, n3 - n - n11, n4 - n2 - this.o);
                this.d.h(b);
            }
        }
    }
    
    private final void t() {
        if (this.c != null && this.q && TextUtils.isEmpty(this.d.k)) {
            final ViewGroup c = this.c;
            CharSequence charSequence;
            if (c instanceof Toolbar) {
                charSequence = ((Toolbar)c).o;
            }
            else if (c instanceof android.widget.Toolbar) {
                charSequence = ((android.widget.Toolbar)c).getTitle();
            }
            else {
                charSequence = null;
            }
            this.l(charSequence);
        }
    }
    
    private final boolean u() {
        return this.A == 1;
    }
    
    public void c(final boolean t, final boolean b) {
        if (this.t != t) {
            int n = 255;
            if (b) {
                if (!t) {
                    n = 0;
                }
                this.d();
                final ValueAnimator u = this.u;
                if (u == null) {
                    final ValueAnimator u2 = new ValueAnimator();
                    this.u = u2;
                    TimeInterpolator interpolator;
                    if (n > this.s) {
                        interpolator = this.w;
                    }
                    else {
                        interpolator = this.x;
                    }
                    u2.setInterpolator(interpolator);
                    this.u.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new aduz(this, 1));
                }
                else if (u.isRunning()) {
                    this.u.cancel();
                }
                this.u.setDuration(this.v);
                this.u.setIntValues(new int[] { this.s, n });
                this.u.start();
            }
            else {
                if (!t) {
                    n = 0;
                }
                this.k(n);
            }
            this.t = t;
        }
    }
    
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof aduk;
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        this.d();
        if (this.c == null) {
            final Drawable f = this.f;
            if (f != null && this.s > 0) {
                f.mutate().setAlpha(this.s);
                this.f.draw(canvas);
            }
        }
        Label_0154: {
            if (this.q && this.r) {
                if (this.c != null && this.f != null && this.s > 0 && this.u()) {
                    final adxd d = this.d;
                    if (d.a < d.d) {
                        final int save = canvas.save();
                        canvas.clipRect(this.f.getBounds(), Region$Op.DIFFERENCE);
                        this.d.d(canvas);
                        canvas.restoreToCount(save);
                        break Label_0154;
                    }
                }
                this.d.d(canvas);
            }
        }
        if (this.g != null && this.s > 0) {
            final aoc i = this.i;
            int d2;
            if (i != null) {
                d2 = i.d();
            }
            else {
                d2 = 0;
            }
            if (d2 > 0) {
                this.g.setBounds(0, -this.h, this.getWidth(), d2 - this.h);
                this.g.mutate().setAlpha(this.s);
                this.g.draw(canvas);
            }
        }
    }
    
    protected final boolean drawChild(final Canvas canvas, final View view, final long n) {
        final Drawable f = this.f;
        Label_0098: {
            if (f != null && this.s > 0) {
                final View j = this.j;
                if (j != null && j != this) {
                    if (view != j) {
                        break Label_0098;
                    }
                }
                else if (view != this.c) {
                    break Label_0098;
                }
                this.q(f, view, this.getWidth(), this.getHeight());
                this.f.mutate().setAlpha(this.s);
                this.f.draw(canvas);
                final boolean b = true;
                return super.drawChild(canvas, view, n) || b;
            }
        }
        final boolean b = false;
        return super.drawChild(canvas, view, n) || b;
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        final Drawable g = this.g;
        int setState;
        final int n = setState = 0;
        if (g != null) {
            setState = n;
            if (g.isStateful()) {
                setState = (g.setState(drawableState) ? 1 : 0);
            }
        }
        final Drawable f = this.f;
        int n2 = setState;
        if (f != null) {
            n2 = setState;
            if (f.isStateful()) {
                n2 = (setState | (f.setState(drawableState) ? 1 : 0));
            }
        }
        final adxd d = this.d;
        int n3 = n2;
        if (d != null) {
            n3 = (n2 | (d.y(drawableState) ? 1 : 0));
        }
        if (n3 != 0) {
            this.invalidate();
        }
    }
    
    final int f(final View view) {
        return this.getHeight() - h(view).a - view.getHeight() - ((aduk)view.getLayoutParams()).bottomMargin;
    }
    
    public final int g() {
        final int y = this.y;
        if (y >= 0) {
            return y + this.B + this.D;
        }
        final aoc i = this.i;
        int d;
        if (i != null) {
            d = i.d();
        }
        else {
            d = 0;
        }
        final int g = anc.g((View)this);
        if (g > 0) {
            return Math.min(g + g + d, this.getHeight());
        }
        return this.getHeight() / 3;
    }
    
    protected final /* bridge */ ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)o();
    }
    
    protected final /* bridge */ FrameLayout$LayoutParams generateDefaultLayoutParams() {
        return o();
    }
    
    public final /* bridge */ ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)this.generateLayoutParams(set);
    }
    
    protected final /* bridge */ ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new aduk(viewGroup$LayoutParams);
    }
    
    public final FrameLayout$LayoutParams generateLayoutParams(final AttributeSet set) {
        return new aduk(this.getContext(), set);
    }
    
    public final void i(final Drawable drawable) {
        final Drawable f = this.f;
        if (f != drawable) {
            Drawable mutate = null;
            if (f != null) {
                f.setCallback((Drawable$Callback)null);
            }
            if (drawable != null) {
                mutate = drawable.mutate();
            }
            if ((this.f = mutate) != null) {
                this.p(mutate, this.getWidth(), this.getHeight());
                this.f.setCallback((Drawable$Callback)this);
                this.f.setAlpha(this.s);
            }
            anc.H((View)this);
        }
    }
    
    public final void j(final int n) {
        this.i((Drawable)new ColorDrawable(n));
    }
    
    public final void k(final int s) {
        if (s != this.s) {
            if (this.f != null) {
                final ViewGroup c = this.c;
                if (c != null) {
                    anc.H((View)c);
                }
            }
            this.s = s;
            anc.H((View)this);
        }
    }
    
    public final void l(final CharSequence charSequence) {
        this.d.t(charSequence);
        this.e();
    }
    
    public final void m(final boolean q) {
        if (q != this.q) {
            this.q = q;
            this.e();
            this.r();
            this.requestLayout();
        }
    }
    
    final void n() {
        if (this.f == null && this.g == null) {
            return;
        }
        final int height = this.getHeight();
        final int h = this.h;
        final int g = this.g();
        boolean b = true;
        final boolean b2 = height + h < g;
        if (!anc.ao((View)this) || this.isInEditMode()) {
            b = false;
        }
        this.c(b2, b);
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final ViewParent parent = this.getParent();
        if (parent instanceof AppBarLayout) {
            final AppBarLayout appBarLayout = (AppBarLayout)parent;
            this.b(appBarLayout);
            anc.V((View)this, anc.ai((View)appBarLayout));
            if (this.z == null) {
                this.z = new adul(this, 0);
            }
            appBarLayout.i((adug)this.z);
            anc.L((View)this);
        }
    }
    
    protected final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.d.f(configuration);
    }
    
    protected final void onDetachedFromWindow() {
        final ViewParent parent = this.getParent();
        final aduj z = this.z;
        if (z != null && parent instanceof AppBarLayout) {
            ((AppBarLayout)parent).k((adug)z);
        }
        super.onDetachedFromWindow();
    }
    
    protected final void onLayout(final boolean b, int i, int childCount, final int n, final int n2) {
        super.onLayout(b, i, childCount, n, n2);
        final aoc j = this.i;
        final int n3 = 0;
        if (j != null) {
            final int d = j.d();
            for (int childCount2 = this.getChildCount(), k = 0; k < childCount2; ++k) {
                final View child = this.getChildAt(k);
                if (!anc.ai(child) && child.getTop() < d) {
                    anc.F(child, d);
                }
            }
        }
        for (int childCount3 = this.getChildCount(), l = 0; l < childCount3; ++l) {
            h(this.getChildAt(l)).b();
        }
        this.s(i, childCount, n, n2, false);
        this.t();
        this.n();
        for (childCount = this.getChildCount(), i = n3; i < childCount; ++i) {
            h(this.getChildAt(i)).a();
        }
    }
    
    protected final void onMeasure(final int n, int b) {
        this.d();
        super.onMeasure(n, b);
        final int mode = View$MeasureSpec.getMode(b);
        final aoc i = this.i;
        if (i != null) {
            b = i.d();
        }
        else {
            b = 0;
        }
        if ((mode == 0 || this.C) && b > 0) {
            this.B = b;
            super.onMeasure(n, View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() + b, 1073741824));
        }
        if (this.E && this.d.q > 1) {
            this.t();
            this.s(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight(), true);
            final adxd d = this.d;
            b = d.i;
            if (b > 1) {
                d.e(d.n);
                this.D = Math.round(-d.n.ascent() + d.n.descent()) * (b - 1);
                super.onMeasure(n, View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() + this.D, 1073741824));
            }
        }
        final ViewGroup c = this.c;
        if (c != null) {
            final View j = this.j;
            if (j != null && j != this) {
                this.setMinimumHeight(a(j));
                return;
            }
            this.setMinimumHeight(a((View)c));
        }
    }
    
    protected final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        final Drawable f = this.f;
        if (f != null) {
            this.p(f, n, n2);
        }
    }
    
    public final void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        final Drawable g = this.g;
        final boolean b = visibility == 0;
        if (g != null && g.isVisible() != b) {
            this.g.setVisible(b, false);
        }
        final Drawable f = this.f;
        if (f != null && f.isVisible() != b) {
            this.f.setVisible(b, false);
        }
    }
    
    protected final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f || drawable == this.g;
    }
}
