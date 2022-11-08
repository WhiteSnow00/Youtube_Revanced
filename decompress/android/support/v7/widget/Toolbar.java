// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.text.TextUtils$TruncateAt;
import android.view.ContextThemeWrapper;
import android.view.View$OnClickListener;
import android.view.MenuItem;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.MenuInflater;
import android.view.Menu;
import android.os.Build$VERSION;
import android.view.View$MeasureSpec;
import java.util.List;
import android.view.Gravity;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.text.TextUtils;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.window.OnBackInvokedDispatcher;
import android.window.OnBackInvokedCallback;
import java.util.ArrayList;
import android.content.res.ColorStateList;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.ViewGroup;

public class Toolbar extends ViewGroup implements all
{
    private TextView A;
    private ImageButton B;
    private int C;
    private int D;
    private int E;
    private ot F;
    private int G;
    private int H;
    private ColorStateList I;
    private ColorStateList J;
    private boolean K;
    private boolean L;
    private final ArrayList M;
    private final int[] N;
    private px O;
    private OnBackInvokedCallback P;
    private OnBackInvokedDispatcher Q;
    private final Runnable R;
    private final qpt S;
    public ActionMenuView a;
    public ImageView b;
    public Drawable c;
    public CharSequence d;
    public ImageButton e;
    public View f;
    public Context g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public CharSequence o;
    public CharSequence p;
    public final ArrayList q;
    public final alm r;
    public ArrayList s;
    public pu t;
    public jt u;
    public ps v;
    public iy w;
    public ik x;
    public boolean y;
    private TextView z;
    
    public Toolbar(final Context context) {
        this(context, null);
    }
    
    public Toolbar(final Context context, final AttributeSet set) {
        this(context, set, 2130970692);
    }
    
    public Toolbar(final Context context, final AttributeSet set, int n) {
        super(context, set, n);
        this.H = 8388627;
        this.M = new ArrayList();
        this.q = new ArrayList();
        this.N = new int[2];
        this.r = new alm((Runnable)new pp(this, 0));
        this.s = new ArrayList();
        this.S = new qpt(this);
        this.R = new pp(this, 3, null);
        final cdn w = cdn.w(this.getContext(), set, gl.y, n, 0);
        ana.M((View)this, context, gl.y, set, (TypedArray)w.a, n, 0);
        this.C = w.i(28, 0);
        this.D = w.i(19, 0);
        this.H = w.g(0, this.H);
        this.i = w.g(2, 48);
        final int n2 = n = w.d(22, 0);
        if (w.q(27)) {
            n = w.d(27, n2);
        }
        this.m = n;
        this.l = n;
        this.k = n;
        this.j = n;
        n = w.d(25, -1);
        if (n >= 0) {
            this.j = n;
        }
        n = w.d(24, -1);
        if (n >= 0) {
            this.k = n;
        }
        n = w.d(26, -1);
        if (n >= 0) {
            this.l = n;
        }
        n = w.d(23, -1);
        if (n >= 0) {
            this.m = n;
        }
        this.E = w.e(13, -1);
        final int d = w.d(9, Integer.MIN_VALUE);
        final int d2 = w.d(5, Integer.MIN_VALUE);
        n = w.e(7, 0);
        final int e = w.e(8, 0);
        this.R();
        final ot f = this.F;
        f.h = false;
        if (n != Integer.MIN_VALUE) {
            f.e = n;
            f.a = n;
        }
        if (e != Integer.MIN_VALUE) {
            f.f = e;
            f.b = e;
        }
        if (d != Integer.MIN_VALUE || d2 != Integer.MIN_VALUE) {
            f.a(d, d2);
        }
        this.n = w.d(10, Integer.MIN_VALUE);
        this.G = w.d(6, Integer.MIN_VALUE);
        this.c = w.k(4);
        this.d = w.m(3);
        final CharSequence m = w.m(21);
        if (!TextUtils.isEmpty(m)) {
            this.z(m);
        }
        final CharSequence i = w.m(18);
        if (!TextUtils.isEmpty(i)) {
            this.v(i);
        }
        this.g = this.getContext();
        this.u(w.i(17, 0));
        final Drawable k = w.k(16);
        if (k != null) {
            this.s(k);
        }
        final CharSequence j = w.m(15);
        if (!TextUtils.isEmpty(j)) {
            this.r(j);
        }
        final Drawable l = w.k(11);
        if (l != null) {
            this.p(l);
        }
        final CharSequence m2 = w.m(12);
        if (!TextUtils.isEmpty(m2)) {
            if (!TextUtils.isEmpty(m2)) {
                this.S();
            }
            final ImageView b = this.b;
            if (b != null) {
                b.setContentDescription(m2);
            }
        }
        if (w.q(29)) {
            this.C(w.j(29));
        }
        if (w.q(20)) {
            this.x(w.j(20));
        }
        if (w.q(14)) {
            this.n(w.i(14, 0));
        }
        w.o();
    }
    
    public static final pt I() {
        return new pt();
    }
    
    protected static final pt J(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof pt) {
            return new pt((pt)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof en) {
            return new pt((en)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new pt((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new pt(viewGroup$LayoutParams);
    }
    
    private final int K(int n) {
        final int f = ana.f((View)this);
        n = (Gravity.getAbsoluteGravity(n, f) & 0x7);
        if (n == 1 || n == 3 || n == 5) {
            return n;
        }
        if (f == 1) {
            return 5;
        }
        return 3;
    }
    
    private final int L(final View view, int n) {
        final pt pt = (pt)view.getLayoutParams();
        final int measuredHeight = view.getMeasuredHeight();
        if (n > 0) {
            n = (measuredHeight - n) / 2;
        }
        else {
            n = 0;
        }
        int n3;
        final int n2 = n3 = (pt.a & 0x70);
        if (n2 != 16 && (n3 = n2) != 48 && (n3 = n2) != 80) {
            n3 = (this.H & 0x70);
        }
        if (n3 == 48) {
            return this.getPaddingTop() - n;
        }
        if (n3 != 80) {
            final int paddingTop = this.getPaddingTop();
            n = this.getPaddingBottom();
            final int height = this.getHeight();
            final int n4 = (height - paddingTop - n - measuredHeight) / 2;
            if (n4 < pt.topMargin) {
                n = pt.topMargin;
            }
            else {
                final int n5 = height - n - measuredHeight - n4 - paddingTop;
                n = n4;
                if (n5 < pt.bottomMargin) {
                    n = Math.max(0, n4 - (pt.bottomMargin - n5));
                }
            }
            return paddingTop + n;
        }
        return this.getHeight() - this.getPaddingBottom() - measuredHeight - pt.bottomMargin - n;
    }
    
    private final int M(final View view, int n, final int[] array, int measuredWidth) {
        final pt pt = (pt)view.getLayoutParams();
        final int n2 = pt.leftMargin - array[0];
        n += Math.max(0, n2);
        array[0] = Math.max(0, -n2);
        final int l = this.L(view, measuredWidth);
        measuredWidth = view.getMeasuredWidth();
        view.layout(n, l, n + measuredWidth, view.getMeasuredHeight() + l);
        return n + (measuredWidth + pt.rightMargin);
    }
    
    private final int N(final View view, int n, final int[] array, int l) {
        final pt pt = (pt)view.getLayoutParams();
        final int n2 = pt.rightMargin - array[1];
        n -= Math.max(0, n2);
        array[1] = Math.max(0, -n2);
        l = this.L(view, l);
        final int measuredWidth = view.getMeasuredWidth();
        view.layout(n - measuredWidth, l, n, view.getMeasuredHeight() + l);
        return n - (measuredWidth + pt.leftMargin);
    }
    
    private final int O(final View view, final int n, final int n2, final int n3, final int n4, final int[] array) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final int n5 = viewGroup$MarginLayoutParams.leftMargin - array[0];
        final int n6 = viewGroup$MarginLayoutParams.rightMargin - array[1];
        final int n7 = Math.max(0, n5) + Math.max(0, n6);
        array[0] = Math.max(0, -n5);
        array[1] = Math.max(0, -n6);
        view.measure(getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight() + n7 + n2, viewGroup$MarginLayoutParams.width), getChildMeasureSpec(n3, this.getPaddingTop() + this.getPaddingBottom() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin + n4, viewGroup$MarginLayoutParams.height));
        return view.getMeasuredWidth() + n7;
    }
    
    private final void P(final List list, int i) {
        final int f = ana.f((View)this);
        final int childCount = this.getChildCount();
        final int absoluteGravity = Gravity.getAbsoluteGravity(i, ana.f((View)this));
        list.clear();
        if (f == 1) {
            i = childCount;
            while (true) {
                final int n = i - 1;
                if (n < 0) {
                    break;
                }
                final View child = this.getChildAt(n);
                final pt pt = (pt)child.getLayoutParams();
                i = n;
                if (pt.b != 0) {
                    continue;
                }
                i = n;
                if (!this.V(child)) {
                    continue;
                }
                i = n;
                if (this.K(pt.a) != absoluteGravity) {
                    continue;
                }
                list.add(child);
                i = n;
            }
        }
        else {
            View child2;
            pt pt2;
            for (i = 0; i < childCount; ++i) {
                child2 = this.getChildAt(i);
                pt2 = (pt)child2.getLayoutParams();
                if (pt2.b == 0 && this.V(child2) && this.K(pt2.a) == absoluteGravity) {
                    list.add(child2);
                }
            }
        }
    }
    
    private final void Q(final View view, final boolean b) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        pt layoutParams2;
        if (layoutParams == null) {
            layoutParams2 = I();
        }
        else if (!this.checkLayoutParams(layoutParams)) {
            layoutParams2 = J(layoutParams);
        }
        else {
            layoutParams2 = (pt)layoutParams;
        }
        layoutParams2.b = 1;
        if (b && this.f != null) {
            view.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
            this.q.add(view);
            return;
        }
        this.addView(view, (ViewGroup$LayoutParams)layoutParams2);
    }
    
    private final void R() {
        if (this.F == null) {
            this.F = new ot();
        }
    }
    
    private final void S() {
        if (this.b == null) {
            this.b = (ImageView)new AppCompatImageView(this.getContext());
        }
    }
    
    private final void T() {
        if (this.B == null) {
            this.B = (ImageButton)new AppCompatImageButton(this.getContext(), (AttributeSet)null, 2130970691);
            final pt i = I();
            i.a = ((this.i & 0x70) | 0x800003);
            this.B.setLayoutParams((ViewGroup$LayoutParams)i);
        }
    }
    
    private final boolean U(final View view) {
        return view.getParent() == this || this.q.contains(view);
    }
    
    private final boolean V(final View view) {
        return view != null && view.getParent() == this && view.getVisibility() != 8;
    }
    
    private static final int W(final View view) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        return alk.c(viewGroup$MarginLayoutParams) + alk.b(viewGroup$MarginLayoutParams);
    }
    
    private static final int X(final View view) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        return viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin;
    }
    
    private final void Y(final View view, int n, int childMeasureSpec, int mode, final int n2) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final int childMeasureSpec2 = getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight() + viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin + childMeasureSpec, viewGroup$MarginLayoutParams.width);
        childMeasureSpec = getChildMeasureSpec(mode, this.getPaddingTop() + this.getPaddingBottom() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin, viewGroup$MarginLayoutParams.height);
        mode = View$MeasureSpec.getMode(childMeasureSpec);
        n = childMeasureSpec;
        if (mode != 1073741824) {
            n = childMeasureSpec;
            if (n2 >= 0) {
                n = n2;
                if (mode != 0) {
                    n = Math.min(View$MeasureSpec.getSize(childMeasureSpec), n2);
                }
                n = View$MeasureSpec.makeMeasureSpec(n, 1073741824);
            }
        }
        view.measure(childMeasureSpec2, n);
    }
    
    public final void A(final Context context, final int c) {
        this.C = c;
        final TextView z = this.z;
        if (z != null) {
            z.setTextAppearance(context, c);
        }
    }
    
    public final void B(final int n) {
        this.C(ColorStateList.valueOf(n));
    }
    
    public final void C(final ColorStateList list) {
        this.I = list;
        final TextView z = this.z;
        if (z != null) {
            z.setTextColor(list);
        }
    }
    
    public final void D() {
        if (Build$VERSION.SDK_INT >= 33) {
            final OnBackInvokedDispatcher b = pr.b((View)this);
            if (this.E() && b != null && ana.am((View)this) && this.y) {
                if (this.Q == null) {
                    if (this.P == null) {
                        this.P = pr.a((Runnable)new pp(this, 2));
                    }
                    pr.c((Object)b, (Object)this.P);
                    this.Q = b;
                }
            }
            else {
                final OnBackInvokedDispatcher q = this.Q;
                if (q != null) {
                    pr.d((Object)q, (Object)this.P);
                    this.Q = null;
                }
            }
        }
    }
    
    public final boolean E() {
        final ps v = this.v;
        return v != null && v.b != null;
    }
    
    public final boolean F() {
        final ActionMenuView a = this.a;
        if (a != null) {
            final jt c = a.c;
            if (c != null && c.l()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean G() {
        final ActionMenuView a = this.a;
        return a != null && a.j();
    }
    
    public final boolean H() {
        final ActionMenuView a = this.a;
        if (a != null) {
            final jt c = a.c;
            if (c != null && c.o()) {
                return true;
            }
        }
        return false;
    }
    
    public final int a() {
        final ot f = this.F;
        if (f != null) {
            int n;
            if (f.g) {
                n = f.a;
            }
            else {
                n = f.b;
            }
            return n;
        }
        return 0;
    }
    
    public final int b() {
        final ot f = this.F;
        if (f != null) {
            int n;
            if (f.g) {
                n = f.b;
            }
            else {
                n = f.a;
            }
            return n;
        }
        return 0;
    }
    
    public final int c() {
        final ActionMenuView a = this.a;
        if (a != null) {
            final im a2 = a.a;
            if (a2 != null && a2.hasVisibleItems()) {
                return Math.max(this.a(), Math.max(this.G, 0));
            }
        }
        return this.a();
    }
    
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return super.checkLayoutParams(viewGroup$LayoutParams) && viewGroup$LayoutParams instanceof pt;
    }
    
    public final int d() {
        int n;
        if (this.e() != null) {
            n = Math.max(this.b(), Math.max(this.n, 0));
        }
        else {
            n = this.b();
        }
        return n;
    }
    
    public final Drawable e() {
        final ImageButton b = this.B;
        if (b != null) {
            return b.getDrawable();
        }
        return null;
    }
    
    public final lq f() {
        if (this.O == null) {
            this.O = new px(this, true);
        }
        return (lq)this.O;
    }
    
    public final Menu g() {
        this.l();
        return this.a.d();
    }
    
    public final MenuInflater h() {
        return (MenuInflater)new ht(this.getContext());
    }
    
    public final CharSequence i() {
        final ImageButton b = this.B;
        if (b != null) {
            return b.getContentDescription();
        }
        return null;
    }
    
    public final ArrayList j() {
        final ArrayList list = new ArrayList();
        final Menu g = this.g();
        for (int i = 0; i < g.size(); ++i) {
            list.add(g.getItem(i));
        }
        return list;
    }
    
    public final void k() {
        final ps v = this.v;
        io b;
        if (v == null) {
            b = null;
        }
        else {
            b = v.b;
        }
        if (b != null) {
            b.collapseActionView();
        }
    }
    
    public final void l() {
        this.m();
        final ActionMenuView a = this.a;
        if (a.a == null) {
            final Menu d = a.d();
            if (this.v == null) {
                this.v = new ps(this);
            }
            this.a.c.q();
            ((im)d).h((iz)this.v, this.g);
            this.D();
        }
    }
    
    public final void m() {
        if (this.a == null) {
            (this.a = new ActionMenuView(this.getContext())).g(this.h);
            final ActionMenuView a = this.a;
            a.e = this.S;
            a.f(this.w, (ik)new jx(this, 3));
            final pt i = I();
            i.a = ((this.i & 0x70) | 0x800005);
            this.a.setLayoutParams((ViewGroup$LayoutParams)i);
            this.Q((View)this.a, false);
        }
    }
    
    public final void n(final int n) {
        this.h().inflate(n, this.g());
    }
    
    public final void o(final int n, final int n2) {
        this.R();
        this.F.a(n, n2);
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D();
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks(this.R);
        this.D();
    }
    
    public final boolean onHoverEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final int n = 9;
        int n2 = actionMasked;
        if (actionMasked == 9) {
            this.L = false;
            n2 = 9;
        }
        if (!this.L) {
            final boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (n2 == 9) {
                n2 = n;
                if (!onHoverEvent) {
                    this.L = true;
                    n2 = n;
                }
            }
        }
        if (n2 == 10 || n2 == 3) {
            this.L = false;
        }
        return true;
    }
    
    protected void onLayout(final boolean b, int n, int i, int j, int k) {
        final boolean b2 = ana.f((View)this) == 1;
        final int width = this.getWidth();
        final int height = this.getHeight();
        j = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        final int paddingTop = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        final int n2 = width - paddingRight;
        final int[] n3 = this.N;
        n3[n3[1] = 0] = 0;
        n = ana.g((View)this);
        if (n >= 0) {
            k = Math.min(n, k - i);
        }
        else {
            k = 0;
        }
        int n4 = 0;
        int m = 0;
        Label_0167: {
            if (this.V((View)this.B)) {
                if (b2) {
                    n4 = this.N((View)this.B, n2, n3, k);
                    m = j;
                    break Label_0167;
                }
                m = this.M((View)this.B, j, n3, k);
            }
            else {
                m = j;
            }
            n4 = n2;
        }
        i = m;
        n = n4;
        if (this.V((View)this.e)) {
            if (b2) {
                n = this.N((View)this.e, n4, n3, k);
                i = m;
            }
            else {
                i = this.M((View)this.e, m, n3, k);
                n = n4;
            }
        }
        int l = i;
        int n5 = n;
        if (this.V((View)this.a)) {
            if (b2) {
                l = this.M((View)this.a, i, n3, k);
                n5 = n;
            }
            else {
                n5 = this.N((View)this.a, n, n3, k);
                l = i;
            }
        }
        if (ana.f((View)this) == 1) {
            n = this.c();
        }
        else {
            n = this.d();
        }
        if (ana.f((View)this) == 1) {
            i = this.d();
        }
        else {
            i = this.c();
        }
        n3[0] = Math.max(0, n - l);
        n3[1] = Math.max(0, i - (n2 - n5));
        final int max = Math.max(l, n);
        i = (n = Math.min(n5, n2 - i));
        int m2 = max;
        if (this.V(this.f)) {
            if (b2) {
                n = this.N(this.f, i, n3, k);
                m2 = max;
            }
            else {
                m2 = this.M(this.f, max, n3, k);
                n = i;
            }
        }
        int n6 = n;
        i = m2;
        if (this.V((View)this.b)) {
            if (b2) {
                n6 = this.N((View)this.b, n, n3, k);
                i = m2;
            }
            else {
                i = this.M((View)this.b, m2, n3, k);
                n6 = n;
            }
        }
        final boolean v = this.V((View)this.z);
        final boolean v2 = this.V((View)this.A);
        if (v) {
            final pt pt = (pt)this.z.getLayoutParams();
            n = pt.topMargin;
            n = pt.bottomMargin + (n + this.z.getMeasuredHeight());
        }
        else {
            n = 0;
        }
        if (v2) {
            final pt pt2 = (pt)this.A.getLayoutParams();
            n += pt2.topMargin + this.A.getMeasuredHeight() + pt2.bottomMargin;
        }
        if (!v && !v2) {
            n = i;
        }
        else {
            TextView textView;
            if (v) {
                textView = this.z;
            }
            else {
                textView = this.A;
            }
            TextView textView2;
            if (v2) {
                textView2 = this.A;
            }
            else {
                textView2 = this.z;
            }
            final pt pt3 = (pt)((View)textView).getLayoutParams();
            final pt pt4 = (pt)((View)textView2).getLayoutParams();
            final boolean b3 = (v && this.z.getMeasuredWidth() > 0) || (v2 && this.A.getMeasuredWidth() > 0);
            final int n7 = this.H & 0x70;
            if (n7 != 48) {
                if (n7 != 80) {
                    final int n8 = (height - paddingTop - paddingBottom - n) / 2;
                    if (n8 < pt3.topMargin + this.l) {
                        n = pt3.topMargin + this.l;
                    }
                    else {
                        final int n9 = height - paddingBottom - n - n8 - paddingTop;
                        n = n8;
                        if (n9 < pt3.bottomMargin + this.m) {
                            n = Math.max(0, n8 - (pt4.bottomMargin + this.m - n9));
                        }
                    }
                    n += paddingTop;
                }
                else {
                    n = height - paddingBottom - pt4.bottomMargin - this.m - n;
                }
            }
            else {
                n = this.getPaddingTop() + pt3.topMargin + this.l;
            }
            final int n10 = i;
            if (b2) {
                if (b3) {
                    i = this.j;
                }
                else {
                    i = 0;
                }
                final int n11 = i - n3[1];
                i = n6 - Math.max(0, n11);
                n3[1] = Math.max(0, -n11);
                int n14;
                if (v) {
                    final pt pt5 = (pt)this.z.getLayoutParams();
                    final int n12 = i - this.z.getMeasuredWidth();
                    final int n13 = this.z.getMeasuredHeight() + n;
                    this.z.layout(n12, n, i, n13);
                    n = n12 - this.k;
                    n14 = n13 + pt5.bottomMargin;
                }
                else {
                    final int n15 = i;
                    n14 = n;
                    n = n15;
                }
                int n17;
                if (v2) {
                    final pt pt6 = (pt)this.A.getLayoutParams();
                    final int n16 = n14 + pt6.topMargin;
                    this.A.layout(i - this.A.getMeasuredWidth(), n16, i, this.A.getMeasuredHeight() + n16);
                    n17 = i - this.k;
                    final int bottomMargin = pt6.bottomMargin;
                }
                else {
                    n17 = i;
                }
                if (b3) {
                    i = Math.min(n, n17);
                }
                n = n10;
                n6 = i;
            }
            else {
                if (b3) {
                    i = this.j;
                }
                else {
                    i = 0;
                }
                final int n18 = i - n3[0];
                i = n10 + Math.max(0, n18);
                n3[0] = Math.max(0, -n18);
                int n21;
                if (v) {
                    final pt pt7 = (pt)this.z.getLayoutParams();
                    final int n19 = this.z.getMeasuredWidth() + i;
                    final int n20 = this.z.getMeasuredHeight() + n;
                    this.z.layout(i, n, n19, n20);
                    n = n19 + this.k;
                    n21 = n20 + pt7.bottomMargin;
                }
                else {
                    final int n22 = i;
                    n21 = n;
                    n = n22;
                }
                int n25;
                if (v2) {
                    final pt pt8 = (pt)this.A.getLayoutParams();
                    final int n23 = n21 + pt8.topMargin;
                    final int n24 = this.A.getMeasuredWidth() + i;
                    this.A.layout(i, n23, n24, this.A.getMeasuredHeight() + n23);
                    n25 = n24 + this.k;
                    final int bottomMargin2 = pt8.bottomMargin;
                }
                else {
                    n25 = i;
                }
                if (b3) {
                    n = Math.max(n, n25);
                }
                else {
                    n = i;
                }
            }
        }
        final int n26 = k;
        final int n27 = j;
        this.P(this.M, 3);
        for (j = this.M.size(), i = 0; i < j; ++i) {
            n = this.M(this.M.get(i), n, n3, n26);
        }
        this.P(this.M, 5);
        k = this.M.size();
        i = n6;
        for (j = 0; j < k; ++j) {
            i = this.N(this.M.get(j), i, n3, n26);
        }
        this.P(this.M, 1);
        final ArrayList m3 = this.M;
        int max2 = n3[0];
        int max3 = n3[1];
        final int size = m3.size();
        k = 0;
        j = 0;
        while (k < size) {
            final View view = (View)m3.get(k);
            final pt pt9 = (pt)view.getLayoutParams();
            final int n28 = pt9.leftMargin - max2;
            final int n29 = pt9.rightMargin - max3;
            final int max4 = Math.max(0, n28);
            final int max5 = Math.max(0, n29);
            max2 = Math.max(0, -n28);
            max3 = Math.max(0, -n29);
            j += max4 + view.getMeasuredWidth() + max5;
            ++k;
        }
        k = 0;
        final int n30 = n27 + (width - n27 - paddingRight) / 2 - j / 2;
        j += n30;
        if (n30 >= n) {
            if (j > i) {
                n = n30 - (j - i);
            }
            else {
                n = n30;
            }
        }
        for (j = this.M.size(), i = k; i < j; ++i) {
            n = this.M(this.M.get(i), n, n3, n26);
        }
        this.M.clear();
    }
    
    protected final void onMeasure(final int n, final int n2) {
        final int[] n3 = this.N;
        final int b = qb.b((View)this) ? 1 : 0;
        final boolean v = this.V((View)this.B);
        final int n4 = 0;
        int n5;
        int max;
        int combineMeasuredStates;
        if (v) {
            this.Y((View)this.B, n, 0, n2, this.E);
            n5 = this.B.getMeasuredWidth() + W((View)this.B);
            max = Math.max(0, this.B.getMeasuredHeight() + X((View)this.B));
            combineMeasuredStates = View.combineMeasuredStates(0, this.B.getMeasuredState());
        }
        else {
            n5 = 0;
            max = 0;
            combineMeasuredStates = 0;
        }
        int n6 = n5;
        int n7 = max;
        int n8 = combineMeasuredStates;
        if (this.V((View)this.e)) {
            this.Y((View)this.e, n, 0, n2, this.E);
            n6 = this.e.getMeasuredWidth() + W((View)this.e);
            n7 = Math.max(max, this.e.getMeasuredHeight() + X((View)this.e));
            n8 = View.combineMeasuredStates(combineMeasuredStates, this.e.getMeasuredState());
        }
        final int d = this.d();
        final int max2 = Math.max(d, n6);
        n3[b] = Math.max(0, d - n6);
        int n9;
        if (this.V((View)this.a)) {
            this.Y((View)this.a, n, max2, n2, this.E);
            n9 = this.a.getMeasuredWidth() + W((View)this.a);
            n7 = Math.max(n7, this.a.getMeasuredHeight() + X((View)this.a));
            n8 = View.combineMeasuredStates(n8, this.a.getMeasuredState());
        }
        else {
            n9 = 0;
        }
        final int c = this.c();
        final int n10 = max2 + Math.max(c, n9);
        n3[b ^ 0x1] = Math.max(0, c - n9);
        int max3 = n7;
        int combineMeasuredStates2 = n8;
        int n11 = n10;
        if (this.V(this.f)) {
            n11 = n10 + this.O(this.f, n, n10, n2, 0, n3);
            max3 = Math.max(n7, this.f.getMeasuredHeight() + X(this.f));
            combineMeasuredStates2 = View.combineMeasuredStates(n8, this.f.getMeasuredState());
        }
        int max4 = max3;
        int combineMeasuredStates3 = combineMeasuredStates2;
        int n12 = n11;
        if (this.V((View)this.b)) {
            n12 = n11 + this.O((View)this.b, n, n11, n2, 0, n3);
            max4 = Math.max(max3, this.b.getMeasuredHeight() + X((View)this.b));
            combineMeasuredStates3 = View.combineMeasuredStates(combineMeasuredStates2, this.b.getMeasuredState());
        }
        final int childCount = this.getChildCount();
        int i = 0;
        int n13 = n12;
        int combineMeasuredStates4 = combineMeasuredStates3;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            int max5 = max4;
            int combineMeasuredStates5 = combineMeasuredStates4;
            int n14 = n13;
            if (((pt)child.getLayoutParams()).b == 0) {
                if (!this.V(child)) {
                    max5 = max4;
                    combineMeasuredStates5 = combineMeasuredStates4;
                    n14 = n13;
                }
                else {
                    n14 = n13 + this.O(child, n, n13, n2, 0, n3);
                    max5 = Math.max(max4, child.getMeasuredHeight() + X(child));
                    combineMeasuredStates5 = View.combineMeasuredStates(combineMeasuredStates4, child.getMeasuredState());
                }
            }
            ++i;
            max4 = max5;
            combineMeasuredStates4 = combineMeasuredStates5;
            n13 = n14;
        }
        final int n15 = this.l + this.m;
        final int n16 = this.j + this.k;
        int n17;
        int n18;
        if (this.V((View)this.z)) {
            this.O((View)this.z, n, n13 + n16, n2, n15, n3);
            n17 = this.z.getMeasuredWidth() + W((View)this.z);
            final int measuredHeight = this.z.getMeasuredHeight();
            final int x = X((View)this.z);
            combineMeasuredStates4 = View.combineMeasuredStates(combineMeasuredStates4, this.z.getMeasuredState());
            n18 = measuredHeight + x;
        }
        else {
            n18 = 0;
            n17 = n4;
        }
        int max6 = n17;
        int n19 = n18;
        int combineMeasuredStates6 = combineMeasuredStates4;
        if (this.V((View)this.A)) {
            max6 = Math.max(n17, this.O((View)this.A, n, n13 + n16, n2, n18 + n15, n3));
            n19 = n18 + (this.A.getMeasuredHeight() + X((View)this.A));
            combineMeasuredStates6 = View.combineMeasuredStates(combineMeasuredStates4, this.A.getMeasuredState());
        }
        this.setMeasuredDimension(View.resolveSizeAndState(Math.max(n13 + max6 + (this.getPaddingLeft() + this.getPaddingRight()), this.getSuggestedMinimumWidth()), n, 0xFF000000 & combineMeasuredStates6), View.resolveSizeAndState(Math.max(Math.max(max4, n19) + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight()), n2, combineMeasuredStates6 << 16));
    }
    
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof Toolbar$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final Toolbar$SavedState toolbar$SavedState = (Toolbar$SavedState)parcelable;
        super.onRestoreInstanceState(toolbar$SavedState.d);
        final ActionMenuView a = this.a;
        Object a2;
        if (a != null) {
            a2 = a.a;
        }
        else {
            a2 = null;
        }
        final int a3 = toolbar$SavedState.a;
        if (a3 != 0 && this.v != null && a2 != null) {
            final MenuItem item = ((Menu)a2).findItem(a3);
            if (item != null) {
                item.expandActionView();
            }
        }
        if (toolbar$SavedState.b) {
            this.removeCallbacks(this.R);
            this.post(this.R);
        }
    }
    
    public final void onRtlPropertiesChanged(int n) {
        super.onRtlPropertiesChanged(n);
        this.R();
        final ot f = this.F;
        boolean g = true;
        if (n != 1) {
            g = false;
        }
        if (g == f.g) {
            return;
        }
        f.g = g;
        if (!f.h) {
            f.a = f.e;
            f.b = f.f;
            return;
        }
        if (g) {
            if ((n = f.d) == Integer.MIN_VALUE) {
                n = f.e;
            }
            f.a = n;
            if ((n = f.c) == Integer.MIN_VALUE) {
                n = f.f;
            }
            f.b = n;
            return;
        }
        if ((n = f.c) == Integer.MIN_VALUE) {
            n = f.e;
        }
        f.a = n;
        if ((n = f.d) == Integer.MIN_VALUE) {
            n = f.f;
        }
        f.b = n;
    }
    
    protected final Parcelable onSaveInstanceState() {
        final Toolbar$SavedState toolbar$SavedState = new Toolbar$SavedState(super.onSaveInstanceState());
        final ps v = this.v;
        if (v != null) {
            final io b = v.b;
            if (b != null) {
                toolbar$SavedState.a = b.a;
            }
        }
        toolbar$SavedState.b = this.G();
        return (Parcelable)toolbar$SavedState;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        int actionMasked;
        if ((actionMasked = motionEvent.getActionMasked()) == 0) {
            this.K = false;
            actionMasked = 0;
        }
        int n = actionMasked;
        if (!this.K) {
            final boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if ((n = actionMasked) == 0) {
                if (!onTouchEvent) {
                    this.K = true;
                }
                n = 0;
            }
        }
        if (n == 1 || n == 3) {
            this.K = false;
        }
        return true;
    }
    
    public final void p(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            this.S();
            if (!this.U((View)this.b)) {
                this.Q((View)this.b, true);
            }
        }
        else {
            final ImageView b = this.b;
            if (b != null && this.U((View)b)) {
                this.removeView((View)this.b);
                this.q.remove(this.b);
            }
        }
        final ImageView b2 = this.b;
        if (b2 != null) {
            b2.setImageDrawable(imageDrawable);
        }
    }
    
    public final void q(final int n) {
        CharSequence text;
        if (n != 0) {
            text = this.getContext().getText(n);
        }
        else {
            text = null;
        }
        this.r(text);
    }
    
    public final void r(final CharSequence contentDescription) {
        if (!TextUtils.isEmpty(contentDescription)) {
            this.T();
        }
        final ImageButton b = this.B;
        if (b != null) {
            b.setContentDescription(contentDescription);
            py.a((View)this.B, contentDescription);
        }
    }
    
    public void s(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            this.T();
            if (!this.U((View)this.B)) {
                this.Q((View)this.B, true);
            }
        }
        else {
            final ImageButton b = this.B;
            if (b != null && this.U((View)b)) {
                this.removeView((View)this.B);
                this.q.remove(this.B);
            }
        }
        final ImageButton b2 = this.B;
        if (b2 != null) {
            b2.setImageDrawable(imageDrawable);
        }
    }
    
    public final void t(final View$OnClickListener onClickListener) {
        this.T();
        this.B.setOnClickListener(onClickListener);
    }
    
    public final void u(final int h) {
        if (this.h != h) {
            if ((this.h = h) == 0) {
                this.g = this.getContext();
                return;
            }
            this.g = (Context)new ContextThemeWrapper(this.getContext(), h);
        }
    }
    
    public final void v(final CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.A == null) {
                final Context context = this.getContext();
                (this.A = (TextView)new AppCompatTextView(context)).setSingleLine();
                this.A.setEllipsize(TextUtils$TruncateAt.END);
                final int d = this.D;
                if (d != 0) {
                    this.A.setTextAppearance(context, d);
                }
                final ColorStateList j = this.J;
                if (j != null) {
                    this.A.setTextColor(j);
                }
            }
            if (!this.U((View)this.A)) {
                this.Q((View)this.A, true);
            }
        }
        else {
            final TextView a = this.A;
            if (a != null && this.U((View)a)) {
                this.removeView((View)this.A);
                this.q.remove(this.A);
            }
        }
        final TextView a2 = this.A;
        if (a2 != null) {
            a2.setText(charSequence);
        }
        this.p = charSequence;
    }
    
    public final void w(final Context context, final int d) {
        this.D = d;
        final TextView a = this.A;
        if (a != null) {
            a.setTextAppearance(context, d);
        }
    }
    
    public final void x(final ColorStateList list) {
        this.J = list;
        final TextView a = this.A;
        if (a != null) {
            a.setTextColor(list);
        }
    }
    
    public final void y(final int n) {
        this.z(this.getContext().getText(n));
    }
    
    public final void z(final CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.z == null) {
                final Context context = this.getContext();
                (this.z = (TextView)new AppCompatTextView(context)).setSingleLine();
                this.z.setEllipsize(TextUtils$TruncateAt.END);
                final int c = this.C;
                if (c != 0) {
                    this.z.setTextAppearance(context, c);
                }
                final ColorStateList i = this.I;
                if (i != null) {
                    this.z.setTextColor(i);
                }
            }
            if (!this.U((View)this.z)) {
                this.Q((View)this.z, true);
            }
        }
        else {
            final TextView z = this.z;
            if (z != null && this.U((View)z)) {
                this.removeView((View)this.z);
                this.q.remove(this.z);
            }
        }
        final TextView z2 = this.z;
        if (z2 != null) {
            z2.setText(charSequence);
        }
        this.o = charSequence;
    }
}
