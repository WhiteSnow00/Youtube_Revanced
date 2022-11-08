// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.os.SystemClock;
import android.animation.LayoutTransition;
import android.view.View$MeasureSpec;
import java.util.Iterator;
import android.view.Display;
import android.view.FocusFinder;
import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityEvent;
import android.widget.OverScroller;
import android.util.Log;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import android.view.ViewGroup$LayoutParams;
import android.view.MotionEvent;
import android.os.Parcelable;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.view.VelocityTracker;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import android.graphics.Rect;
import java.util.List;
import android.widget.EdgeEffect;
import android.view.animation.Interpolator;
import android.view.ViewGroup;

public class RecyclerView extends ViewGroup implements alp
{
    public static final boolean a;
    private static final int[] aa;
    private static final float ab;
    private static final Class[] ac;
    public static final boolean b;
    public static final boolean c;
    public static final Interpolator d;
    static final ol e;
    public EdgeEffect A;
    public EdgeEffect B;
    public EdgeEffect C;
    public EdgeEffect D;
    public nt E;
    public int F;
    public int G;
    public nz H;
    public final int I;
    public final om J;
    public mn K;
    public final ok L;
    public boolean M;
    public boolean N;
    public boolean O;
    public op P;
    public final int[] Q;
    final List R;
    public abey S;
    public final kg T;
    public hx U;
    public iw V;
    public athu W;
    private final int[] aA;
    private alq aB;
    private final int[] aC;
    private final int[] aD;
    private Runnable aE;
    private boolean aF;
    private int aG;
    private int aH;
    private qpt aI;
    private final qpt aJ;
    private final float ad;
    private final oe ae;
    private final Rect af;
    private final ArrayList ag;
    private oa ah;
    private int ai;
    private boolean aj;
    private int ak;
    private final AccessibilityManager al;
    private int am;
    private int an;
    private int ao;
    private VelocityTracker ap;
    private int aq;
    private int ar;
    private int as;
    private int at;
    private final int au;
    private float av;
    private float aw;
    private boolean ax;
    private List ay;
    private ns az;
    public final oc f;
    RecyclerView$SavedState g;
    public lo h;
    public boolean i;
    public final Runnable j;
    public final Rect k;
    public final RectF l;
    public nq m;
    public nw n;
    public od o;
    public final List p;
    public final ArrayList q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public List x;
    public boolean y;
    boolean z;
    
    static {
        aa = new int[] { 16843830 };
        ab = (float)(Math.log(0.78) / Math.log(0.9));
        a = true;
        b = true;
        c = true;
        ac = new Class[] { Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE };
        d = (Interpolator)new qe(1);
        e = new ol();
    }
    
    public RecyclerView(final Context context) {
        this(context, null);
    }
    
    public RecyclerView(final Context context, final AttributeSet set) {
        this(context, set, 2130970162);
    }
    
    public RecyclerView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.ae = new oe(this);
        this.f = new oc(this);
        this.T = new kg();
        this.j = new be(this, 16);
        this.k = new Rect();
        this.af = new Rect();
        this.l = new RectF();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.ag = new ArrayList();
        this.ai = 0;
        this.y = false;
        this.z = false;
        this.am = 0;
        this.an = 0;
        this.U = (hx)RecyclerView.e;
        this.E = (nt)new lx();
        this.F = 0;
        this.ao = -1;
        this.av = Float.MIN_VALUE;
        this.aw = Float.MIN_VALUE;
        this.ax = true;
        this.J = new om(this);
        final boolean c = RecyclerView.c;
        athu w = null;
        if (c) {
            w = new athu((char[])null);
        }
        this.W = w;
        this.L = new ok();
        this.M = false;
        this.N = false;
        this.aI = new qpt(this);
        this.O = false;
        this.aA = new int[2];
        this.aC = new int[2];
        this.aD = new int[2];
        this.Q = new int[2];
        this.R = new ArrayList();
        this.aE = new be(this, 17);
        this.aG = 0;
        this.aH = 0;
        this.aJ = new qpt(this);
        this.setScrollContainer(true);
        this.setFocusableInTouchMode(true);
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.G = value.getScaledTouchSlop();
        this.av = anb.a(value);
        this.aw = anb.b(value);
        this.I = value.getScaledMinimumFlingVelocity();
        this.au = value.getScaledMaximumFlingVelocity();
        this.ad = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.setWillNotDraw(this.getOverScrollMode() == 2);
        this.E.j = this.aI;
        this.S = new abey(new qpt(this), null, null, null, null, null, null);
        this.h = new lo(new qpt(this), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        if (ana.e((View)this) == 0) {
            ana.Y((View)this, 8);
        }
        if (ana.d((View)this) == 0) {
            ana.X((View)this, 1);
        }
        this.al = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.ab(new op(this));
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, gn.a, n, 0);
        ana.M((View)this, context, gn.a, set, obtainStyledAttributes, n, 0);
        final String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            this.setDescendantFocusability(262144);
        }
        this.i = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            final StateListDrawable stateListDrawable = (StateListDrawable)obtainStyledAttributes.getDrawable(6);
            final Drawable drawable = obtainStyledAttributes.getDrawable(7);
            final StateListDrawable stateListDrawable2 = (StateListDrawable)obtainStyledAttributes.getDrawable(4);
            final Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables.".concat(this.o()));
            }
            final Resources resources = this.getContext().getResources();
            new mk(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(2131166468), resources.getDimensionPixelSize(2131166470), resources.getDimensionPixelOffset(2131166469));
        }
        obtainStyledAttributes.recycle();
        this.aZ(context, string, set, n);
        final int[] aa = RecyclerView.aa;
        final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, aa, n, 0);
        ana.M((View)this, context, aa, set, obtainStyledAttributes2, n, 0);
        final boolean boolean1 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        this.setNestedScrollingEnabled(boolean1);
        ((View)this).setTag(2131429462, (Object)true);
    }
    
    public static void K(final View view, final Rect rect) {
        final nx nx = (nx)view.getLayoutParams();
        final Rect d = nx.d;
        rect.set(view.getLeft() - d.left - nx.leftMargin, view.getTop() - d.top - nx.topMargin, view.getRight() + d.right + nx.rightMargin, view.getBottom() + d.bottom + nx.bottomMargin);
    }
    
    private final int a(final int n, float c) {
        final float n2 = c / this.getHeight();
        final float n3 = n / (float)this.getWidth();
        final EdgeEffect a = this.A;
        final float n4 = 0.0f;
        final float n5 = 0.0f;
        c = 0.0f;
        if (a != null && aph.b(a) != 0.0f) {
            if (this.canScrollHorizontally(-1)) {
                this.A.onRelease();
            }
            else {
                c = -aph.c(this.A, -n3, 1.0f - n2);
                if (aph.b(this.A) == 0.0f) {
                    this.A.onRelease();
                }
            }
            this.invalidate();
        }
        else {
            final EdgeEffect c2 = this.C;
            c = n5;
            if (c2 != null) {
                c = n5;
                if (aph.b(c2) != 0.0f) {
                    if (this.canScrollHorizontally(1)) {
                        this.C.onRelease();
                        c = n4;
                    }
                    else {
                        c = aph.c(this.C, n3, n2);
                        if (aph.b(this.C) == 0.0f) {
                            this.C.onRelease();
                        }
                    }
                    this.invalidate();
                }
            }
        }
        return Math.round(c * this.getWidth());
    }
    
    private final int aK(final int n, float c) {
        final float n2 = c / this.getWidth();
        final float n3 = n / (float)this.getHeight();
        final EdgeEffect b = this.B;
        final float n4 = 0.0f;
        final float n5 = 0.0f;
        c = 0.0f;
        if (b != null && aph.b(b) != 0.0f) {
            if (this.canScrollVertically(-1)) {
                this.B.onRelease();
            }
            else {
                c = -aph.c(this.B, -n3, n2);
                if (aph.b(this.B) == 0.0f) {
                    this.B.onRelease();
                }
            }
            this.invalidate();
        }
        else {
            final EdgeEffect d = this.D;
            c = n5;
            if (d != null) {
                c = n5;
                if (aph.b(d) != 0.0f) {
                    if (this.canScrollVertically(1)) {
                        this.D.onRelease();
                        c = n4;
                    }
                    else {
                        c = aph.c(this.D, n3, 1.0f - n2);
                        if (aph.b(this.D) == 0.0f) {
                            this.D.onRelease();
                        }
                    }
                    this.invalidate();
                }
            }
        }
        return Math.round(c * this.getHeight());
    }
    
    private final alq aL() {
        if (this.aB == null) {
            this.aB = new alq((View)this);
        }
        return this.aB;
    }
    
    private final void aM() {
        this.aU();
        this.ag(0);
    }
    
    private final void aN() {
        final ok l = this.L;
        boolean h = true;
        l.b(1);
        this.J(this.L);
        this.L.i = false;
        this.ak();
        this.T.f();
        this.Q();
        this.aR();
        final boolean ax = this.ax;
        final on on = null;
        View focusedChild;
        if (ax && this.hasFocus() && this.m != null) {
            focusedChild = this.getFocusedChild();
        }
        else {
            focusedChild = null;
        }
        on g;
        if (focusedChild == null) {
            g = on;
        }
        else {
            g = this.g(focusedChild);
        }
        if (g == null) {
            this.aT();
        }
        else {
            final ok i = this.L;
            long e;
            if (this.m.c) {
                e = g.e;
            }
            else {
                e = -1L;
            }
            i.m = e;
            int j;
            if (this.y) {
                j = -1;
            }
            else if (g.v()) {
                j = g.d;
            }
            else {
                j = g.a();
            }
            i.l = j;
            final ok k = this.L;
            View view = g.a;
            int n = view.getId();
            while (!view.isFocused() && view instanceof ViewGroup && view.hasFocus()) {
                final View view2 = view = ((ViewGroup)view).getFocusedChild();
                if (view2.getId() != -1) {
                    n = view2.getId();
                    view = view2;
                }
            }
            k.n = n;
        }
        final ok m = this.L;
        if (!m.j || !this.N) {
            h = false;
        }
        m.h = h;
        this.N = false;
        this.M = false;
        m.g = m.k;
        m.e = this.m.a();
        this.aP(this.aA);
        if (this.L.j) {
            for (int a = this.h.a(), n2 = 0; n2 < a; ++n2) {
                final on k2 = k(this.h.d(n2));
                if (!k2.A()) {
                    if (!k2.t() || this.m.c) {
                        nt.p(k2);
                        k2.d();
                        this.T.l(k2, nt.v(k2));
                        if (this.L.h && k2.y() && !k2.v() && !k2.A() && !k2.t()) {
                            this.T.e(this.e(k2), k2);
                        }
                    }
                }
            }
        }
        if (this.L.k) {
            for (int b = this.h.b(), n3 = 0; n3 < b; ++n3) {
                final on k3 = k(this.h.e(n3));
                if (!k3.A() && k3.d == -1) {
                    k3.d = k3.c;
                }
            }
            final ok l2 = this.L;
            final boolean f = l2.f;
            l2.f = false;
            this.n.o(this.f, l2);
            this.L.f = f;
            for (int n4 = 0; n4 < this.h.a(); ++n4) {
                final on k4 = k(this.h.d(n4));
                if (!k4.A()) {
                    final qa qa = (qa)((abn)this.T.b).get((Object)k4);
                    if (qa == null || (qa.b & 0x4) == 0x0) {
                        nt.p(k4);
                        final boolean q = k4.q(8192);
                        k4.d();
                        final alu v = nt.v(k4);
                        if (q) {
                            this.aF(k4, v);
                        }
                        else {
                            final kg t = this.T;
                            qa a2;
                            if ((a2 = (qa)((abn)t.b).get((Object)k4)) == null) {
                                a2 = qa.a();
                                ((abn)t.b).put((Object)k4, (Object)a2);
                            }
                            a2.b |= 0x2;
                            a2.c = v;
                        }
                    }
                }
            }
            this.x();
        }
        else {
            this.x();
        }
        this.R();
        this.al(false);
        this.L.d = 2;
    }
    
    private final void aO() {
        this.ak();
        this.Q();
        this.L.b(6);
        this.S.j();
        this.L.e = this.m.a();
        this.L.c = 0;
        final RecyclerView$SavedState g = this.g;
        if (g != null) {
            final int d = this.m.d;
            final Parcelable a = g.a;
            if (a != null) {
                this.n.Z(a);
            }
            this.g = null;
        }
        final ok l = this.L;
        l.g = false;
        this.n.o(this.f, l);
        final ok i = this.L;
        i.f = false;
        i.j = (i.j && this.E != null);
        i.d = 4;
        this.R();
        this.al(false);
    }
    
    private final void aP(final int[] array) {
        final int a = this.h.a();
        if (a != 0) {
            int n = Integer.MAX_VALUE;
            int n2 = Integer.MIN_VALUE;
            int n3;
            for (int i = 0; i < a; ++i, n = n3) {
                final on k = k(this.h.d(i));
                if (k.A()) {
                    n3 = n;
                }
                else {
                    final int c = k.c();
                    if (c < (n3 = n)) {
                        n3 = c;
                    }
                    if (c > n2) {
                        n2 = c;
                    }
                }
            }
            array[0] = n;
            array[1] = n2;
            return;
        }
        array[1] = (array[0] = -1);
    }
    
    private final void aQ(final MotionEvent motionEvent) {
        final int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.ao) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.ao = motionEvent.getPointerId(n);
            final int n2 = (int)(motionEvent.getX(n) + 0.5f);
            this.as = n2;
            this.aq = n2;
            final int n3 = (int)(motionEvent.getY(n) + 0.5f);
            this.at = n3;
            this.ar = n3;
        }
    }
    
    private final void aR() {
        if (this.y) {
            this.S.o();
            if (this.z) {
                this.n.rm();
            }
        }
        if (this.aX()) {
            this.S.l();
        }
        else {
            this.S.j();
        }
        final boolean m = this.M;
        final boolean b = true;
        final boolean b2 = m || this.N;
        final ok l = this.L;
        boolean j = false;
        Label_0144: {
            if (this.t && this.E != null) {
                final boolean y = this.y;
                if ((y || b2 || this.n.v) && (!y || this.m.c)) {
                    j = true;
                    break Label_0144;
                }
            }
            j = false;
        }
        l.j = j;
        l.k = (j && b2 && !this.y && this.aX() && b);
    }
    
    private final void aS(final View view, View view2) {
        View view3;
        if (view2 != null) {
            view3 = view2;
        }
        else {
            view3 = view;
        }
        this.k.set(0, 0, view3.getWidth(), view3.getHeight());
        final ViewGroup$LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof nx) {
            final nx nx = (nx)layoutParams;
            if (!nx.e) {
                final Rect d = nx.d;
                final Rect k = this.k;
                k.left -= d.left;
                final Rect i = this.k;
                i.right += d.right;
                final Rect j = this.k;
                j.top -= d.top;
                final Rect l = this.k;
                l.bottom += d.bottom;
            }
        }
        if (view2 != null) {
            this.offsetDescendantRectToMyCoords(view2, this.k);
            this.offsetRectIntoDescendantCoords(view, this.k);
        }
        else {
            view2 = null;
        }
        this.n.bi(this, view, this.k, this.t ^ true, view2 == null);
    }
    
    private final void aT() {
        final ok l = this.L;
        l.m = -1L;
        l.l = -1;
        l.n = -1;
    }
    
    private final void aU() {
        final VelocityTracker ap = this.ap;
        if (ap != null) {
            ap.clear();
        }
        int finished = 0;
        this.am(0);
        final EdgeEffect a = this.A;
        if (a != null) {
            a.onRelease();
            finished = (this.A.isFinished() ? 1 : 0);
        }
        final EdgeEffect b = this.B;
        int n = finished;
        if (b != null) {
            b.onRelease();
            n = (finished | (this.B.isFinished() ? 1 : 0));
        }
        final EdgeEffect c = this.C;
        int n2 = n;
        if (c != null) {
            c.onRelease();
            n2 = (n | (this.C.isFinished() ? 1 : 0));
        }
        final EdgeEffect d = this.D;
        int n3 = n2;
        if (d != null) {
            d.onRelease();
            n3 = (n2 | (this.D.isFinished() ? 1 : 0));
        }
        if (n3 != 0) {
            ana.H((View)this);
        }
    }
    
    private final void aV() {
        this.J.d();
        final nw n = this.n;
        if (n != null) {
            final oj u = n.u;
            if (u != null) {
                u.f();
            }
        }
    }
    
    private final boolean aW(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        for (int size = this.ag.size(), i = 0; i < size; ++i) {
            final oa ah = this.ag.get(i);
            if (ah.k(this, motionEvent) && action != 3) {
                this.ah = ah;
                return true;
            }
        }
        return false;
    }
    
    private final boolean aX() {
        return this.E != null && this.n.rl();
    }
    
    private final boolean aY(final EdgeEffect edgeEffect, int abs, final int n) {
        if (abs > 0) {
            return true;
        }
        final float b = aph.b(edgeEffect);
        abs = Math.abs(-abs);
        final double log = Math.log(abs * 0.35f / (this.ad * 0.015f));
        final double n2 = RecyclerView.ab;
        final double n3 = this.ad * 0.015f;
        Double.isNaN(n2);
        Double.isNaN(n2);
        final double exp = Math.exp(n2 / (-1.0 + n2) * log);
        Double.isNaN(n3);
        return (float)(n3 * exp) < b * n;
    }
    
    private final void aZ(final Context context, String s, final AttributeSet set, final int n) {
        if (s != null) {
            final String trim = s.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    s = String.valueOf(context.getPackageName()).concat(String.valueOf(trim));
                }
                else {
                    s = trim;
                    if (!trim.contains(".")) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(RecyclerView.class.getPackage().getName());
                        sb.append('.');
                        sb.append(trim);
                        s = sb.toString();
                    }
                }
                try {
                    ClassLoader classLoader;
                    if (this.isInEditMode()) {
                        classLoader = this.getClass().getClassLoader();
                    }
                    else {
                        classLoader = context.getClassLoader();
                    }
                    final Class<? extends nw> subclass = Class.forName(s, false, classLoader).asSubclass(nw.class);
                    try {
                        final Constructor<? extends nw> constructor = subclass.getConstructor((Class<?>[])RecyclerView.ac);
                        final Object o = { context, set, n, 0 };
                        final Constructor<? extends nw> constructor2 = constructor;
                    }
                    catch (final NoSuchMethodException o) {
                        try {
                            final Constructor<? extends nw> constructor2 = subclass.getConstructor((Class<?>[])new Class[0]);
                            o = null;
                            constructor2.setAccessible(true);
                            this.af((nw)constructor2.newInstance((Object[])o));
                        }
                        catch (final NoSuchMethodException ex) {
                            ex.initCause((Throwable)o);
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(set.getPositionDescription());
                            sb2.append(": Error creating LayoutManager ");
                            sb2.append(s);
                            throw new IllegalStateException(sb2.toString(), ex);
                        }
                    }
                }
                catch (final ClassCastException ex2) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(set.getPositionDescription());
                    sb3.append(": Class is not a LayoutManager ");
                    sb3.append(s);
                    throw new IllegalStateException(sb3.toString(), ex2);
                }
                catch (final IllegalAccessException ex3) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append(set.getPositionDescription());
                    sb4.append(": Cannot access non-public constructor ");
                    sb4.append(s);
                    throw new IllegalStateException(sb4.toString(), ex3);
                }
                catch (final InstantiationException ex4) {
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append(set.getPositionDescription());
                    sb5.append(": Could not instantiate the LayoutManager: ");
                    sb5.append(s);
                    throw new IllegalStateException(sb5.toString(), ex4);
                }
                catch (final InvocationTargetException ex5) {
                    final StringBuilder sb6 = new StringBuilder();
                    sb6.append(set.getPositionDescription());
                    sb6.append(": Could not instantiate the LayoutManager: ");
                    sb6.append(s);
                    throw new IllegalStateException(sb6.toString(), ex5);
                }
                catch (final ClassNotFoundException ex6) {
                    final StringBuilder sb7 = new StringBuilder();
                    sb7.append(set.getPositionDescription());
                    sb7.append(": Unable to find LayoutManager ");
                    sb7.append(s);
                    throw new IllegalStateException(sb7.toString(), ex6);
                }
            }
        }
    }
    
    public static final int av(final int n, final EdgeEffect edgeEffect, final EdgeEffect edgeEffect2, int n2) {
        if (n > 0 && edgeEffect != null && aph.b(edgeEffect) != 0.0f) {
            n2 = Math.round(-n2 / 4.0f * aph.c(edgeEffect, -n * 4.0f / n2, 0.5f));
            if (n2 != n) {
                edgeEffect.finish();
            }
            return n - n2;
        }
        int n3;
        if ((n3 = n) < 0) {
            n3 = n;
            if (edgeEffect2 != null) {
                n3 = n;
                if (aph.b(edgeEffect2) != 0.0f) {
                    final float n4 = (float)n2;
                    n2 = Math.round(n4 / 4.0f * aph.c(edgeEffect2, n * 4.0f / n4, 0.5f));
                    if (n2 != n) {
                        edgeEffect2.finish();
                    }
                    n3 = n - n2;
                }
            }
        }
        return n3;
    }
    
    public static final long aw() {
        if (RecyclerView.c) {
            return System.nanoTime();
        }
        return 0L;
    }
    
    public static on k(final View view) {
        if (view == null) {
            return null;
        }
        return ((nx)view.getLayoutParams()).c;
    }
    
    public static RecyclerView l(final View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView)view;
        }
        final ViewGroup viewGroup = (ViewGroup)view;
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            final RecyclerView l = l(viewGroup.getChildAt(i));
            if (l != null) {
                return l;
            }
        }
        return null;
    }
    
    public static void w(final on on) {
        final WeakReference b = on.b;
        if (b != null) {
            View view = (View)b.get();
            while (view != null) {
                if (view == on.a) {
                    return;
                }
                final ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View)parent;
                }
                else {
                    view = null;
                }
            }
            on.b = null;
        }
    }
    
    public final void A(final int n, final int n2) {
        this.setMeasuredDimension(nw.ar(n, this.getPaddingLeft() + this.getPaddingRight(), ana.h((View)this)), nw.ar(n2, this.getPaddingTop() + this.getPaddingBottom(), ana.g((View)this)));
    }
    
    public final void B(final View view) {
        k(view);
        final List x = this.x;
        if (x != null) {
            int size = x.size();
            while (--size >= 0) {
                ((ny)this.x.get(size)).e(view);
            }
        }
    }
    
    final void C() {
        if (this.m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        final ok l = this.L;
        final int n = 0;
        l.i = false;
        final boolean b = this.aF && (this.aG != this.getWidth() || this.aH != this.getHeight());
        this.aG = 0;
        this.aH = 0;
        this.aF = false;
        Label_0212: {
            if (this.L.d == 1) {
                this.aN();
                this.n.aZ(this);
                this.aO();
            }
            else {
                final abey s = this.S;
                if (s.a.isEmpty() || s.b.isEmpty()) {
                    if (!b && this.n.E == this.getWidth() && this.n.F == this.getHeight()) {
                        this.n.aZ(this);
                        break Label_0212;
                    }
                }
                this.n.aZ(this);
                this.aO();
            }
        }
        this.L.b(4);
        this.ak();
        this.Q();
        final ok i = this.L;
        i.d = 1;
        final boolean j = i.j;
        final View view = null;
        if (j) {
            for (int k = this.h.a() - 1; k >= 0; --k) {
                final on m = k(this.h.d(k));
                if (!m.A()) {
                    final long e = this.e(m);
                    final alu u = nt.u();
                    u.e(m);
                    final on i2 = (on)((abk)this.T.a).e(e);
                    if (i2 != null && !i2.A()) {
                        final boolean i3 = this.T.i(i2);
                        final boolean i4 = this.T.i(m);
                        if (i3 && i2 == m) {
                            this.T.k(m, u);
                        }
                        else {
                            final alu j2 = this.T.j(i2, 4);
                            this.T.k(m, u);
                            final alu j3 = this.T.j(m, 8);
                            if (j2 == null) {
                                for (int a = this.h.a(), n2 = 0; n2 < a; ++n2) {
                                    final on k2 = k(this.h.d(n2));
                                    if (k2 != m) {
                                        if (this.e(k2) == e) {
                                            final nq m2 = this.m;
                                            if (m2 != null && m2.c) {
                                                final StringBuilder sb = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                                sb.append(k2);
                                                sb.append(" \n View Holder 2:");
                                                sb.append(m);
                                                sb.append(this.o());
                                                throw new IllegalStateException(sb.toString());
                                            }
                                            final StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb2.append(k2);
                                            sb2.append(" \n View Holder 2:");
                                            sb2.append(m);
                                            sb2.append(this.o());
                                            throw new IllegalStateException(sb2.toString());
                                        }
                                    }
                                }
                                final StringBuilder sb3 = new StringBuilder("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
                                sb3.append(i2);
                                sb3.append(" cannot be found but it is necessary for ");
                                sb3.append(m);
                                sb3.append(this.o());
                                Log.e("RecyclerView", sb3.toString());
                            }
                            else {
                                i2.n(false);
                                if (i3) {
                                    this.s(i2);
                                }
                                if (i2 != m) {
                                    if (i4) {
                                        this.s(m);
                                    }
                                    i2.h = m;
                                    this.s(i2);
                                    this.f.n(i2);
                                    m.n(false);
                                    m.i = i2;
                                }
                                if (this.E.r(i2, m, j2, j3)) {
                                    this.U();
                                }
                            }
                        }
                    }
                    else {
                        this.T.k(m, u);
                    }
                }
            }
            final kg t = this.T;
            final qpt aj = this.aJ;
            for (int n3 = ((abn)t.b).d - 1; n3 >= 0; --n3) {
                final on on = (on)((abn)t.b).c(n3);
                final qa qa = (qa)((abn)t.b).d(n3);
                final int b2 = qa.b;
                if ((b2 & 0x3) == 0x3) {
                    aj.am(on);
                }
                else if ((b2 & 0x1) != 0x0) {
                    final alu c = qa.c;
                    if (c == null) {
                        aj.am(on);
                    }
                    else {
                        aj.ao(on, c, qa.d);
                    }
                }
                else if ((b2 & 0xE) == 0xE) {
                    aj.an(on, qa.c, qa.d);
                }
                else if ((b2 & 0xC) == 0xC) {
                    final alu c2 = qa.c;
                    final alu d = qa.d;
                    on.n(false);
                    final RecyclerView recyclerView = (RecyclerView)aj.a;
                    if (recyclerView.y) {
                        if (recyclerView.E.r(on, on, c2, d)) {
                            ((RecyclerView)aj.a).U();
                        }
                    }
                    else if (recyclerView.E.t(on, c2, d)) {
                        ((RecyclerView)aj.a).U();
                    }
                }
                else if ((b2 & 0x4) != 0x0) {
                    aj.ao(on, qa.c, (alu)null);
                }
                else if ((b2 & 0x8) != 0x0) {
                    aj.an(on, qa.c, qa.d);
                }
                qa.b(qa);
            }
        }
        this.n.aT(this.f);
        final ok l2 = this.L;
        l2.b = l2.e;
        this.y = false;
        this.z = false;
        l2.j = false;
        l2.k = false;
        this.n.v = false;
        final ArrayList b3 = this.f.b;
        if (b3 != null) {
            b3.clear();
        }
        final nw n4 = this.n;
        if (n4.B) {
            n4.A = 0;
            n4.B = false;
            this.f.o();
        }
        this.n.p(this.L);
        this.R();
        this.al(false);
        this.T.f();
        final int[] aa = this.aA;
        final int n5 = aa[0];
        final int n6 = aa[1];
        this.aP(aa);
        final int[] aa2 = this.aA;
        if (aa2[0] != n5 || aa2[1] != n6) {
            this.E(0, 0);
        }
        if (this.ax && this.m != null && this.hasFocus() && this.getDescendantFocusability() != 393216 && (this.getDescendantFocusability() != 131072 || !this.isFocused()) && (this.isFocused() || this.h.k(this.getFocusedChild()))) {
            final long m3 = this.L.m;
            on on3 = null;
            Label_1495: {
                if (m3 != -1L) {
                    final nq m4 = this.m;
                    if (m4.c && m4 != null) {
                        final int b4 = this.h.b();
                        on on2 = null;
                        int n7 = 0;
                        while (true) {
                            on3 = on2;
                            if (n7 >= b4) {
                                break Label_1495;
                            }
                            final on k3 = k(this.h.e(n7));
                            on on4 = on2;
                            if (k3 != null) {
                                on4 = on2;
                                if (!k3.v()) {
                                    on4 = on2;
                                    if (k3.e == m3) {
                                        if (!this.h.k(k3.a)) {
                                            on3 = k3;
                                            break Label_1495;
                                        }
                                        on4 = k3;
                                    }
                                }
                            }
                            ++n7;
                            on2 = on4;
                        }
                    }
                }
                on3 = null;
            }
            View view2 = null;
            Label_1678: {
                if (on3 != null && !this.h.k(on3.a) && on3.a.hasFocusable()) {
                    view2 = on3.a;
                }
                else {
                    view2 = view;
                    if (this.h.a() > 0) {
                        final ok l3 = this.L;
                        int l4 = l3.l;
                        if (l4 == -1) {
                            l4 = n;
                        }
                        final int a2 = l3.a();
                        for (int n8 = l4; n8 < a2; ++n8) {
                            final on h = this.h(n8);
                            if (h == null) {
                                break;
                            }
                            if (h.a.hasFocusable()) {
                                view2 = h.a;
                                break Label_1678;
                            }
                        }
                        int n9 = Math.min(a2, l4) - 1;
                        while (true) {
                            view2 = view;
                            if (n9 < 0) {
                                break;
                            }
                            final on h2 = this.h(n9);
                            if (h2 == null) {
                                view2 = view;
                                break;
                            }
                            if (h2.a.hasFocusable()) {
                                view2 = h2.a;
                                break;
                            }
                            --n9;
                        }
                    }
                }
            }
            if (view2 != null) {
                final int n10 = this.L.n;
                View view3 = view2;
                if (n10 != -1L) {
                    final View viewById = view2.findViewById(n10);
                    view3 = view2;
                    if (viewById != null) {
                        view3 = view2;
                        if (viewById.isFocusable()) {
                            view3 = viewById;
                        }
                    }
                }
                view3.requestFocus();
            }
        }
        this.aT();
    }
    
    public final void D(final int n, final int n2, final int n3, final int n4, final int[] array, final int n5, final int[] array2) {
        this.aL().i(n, n2, n3, n4, array, n5, array2);
    }
    
    public final void E(final int n, final int n2) {
        ++this.an;
        final int scrollX = this.getScrollX();
        final int scrollY = this.getScrollY();
        this.onScrollChanged(scrollX, scrollY, scrollX - n, scrollY - n2);
        final iw v = this.V;
        if (v != null) {
            ((lcu)v).e();
        }
        final List ay = this.ay;
        if (ay != null) {
            int size = ay.size();
            while (--size >= 0) {
                ((iw)this.ay.get(size)).pu(this, n, n2);
            }
        }
        --this.an;
    }
    
    public final void F() {
        if (this.D != null) {
            return;
        }
        final EdgeEffect b = this.U.b(this, 3);
        this.D = b;
        if (this.i) {
            b.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
            return;
        }
        b.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
    }
    
    public final void G() {
        if (this.A != null) {
            return;
        }
        final EdgeEffect b = this.U.b(this, 0);
        this.A = b;
        if (this.i) {
            b.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
            return;
        }
        b.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
    }
    
    public final void H() {
        if (this.C != null) {
            return;
        }
        final EdgeEffect b = this.U.b(this, 2);
        this.C = b;
        if (this.i) {
            b.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
            return;
        }
        b.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
    }
    
    public final void I() {
        if (this.B != null) {
            return;
        }
        final EdgeEffect b = this.U.b(this, 1);
        this.B = b;
        if (this.i) {
            b.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
            return;
        }
        b.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
    }
    
    final void J(final ok ok) {
        if (this.F == 2) {
            final OverScroller a = this.J.a;
            ok.o = a.getFinalX() - a.getCurrX();
            ok.p = a.getFinalY() - a.getCurrY();
            return;
        }
        ok.o = 0;
        ok.p = 0;
    }
    
    public final void L() {
        this.D = null;
        this.B = null;
        this.C = null;
        this.A = null;
    }
    
    public final void M() {
        if (this.q.size() == 0) {
            return;
        }
        final nw n = this.n;
        if (n != null) {
            n.U("Cannot invalidate item decorations during a scroll or layout");
        }
        this.O();
        this.requestLayout();
    }
    
    public final void N(final int n) {
        if (this.n == null) {
            return;
        }
        this.ag(2);
        this.n.aa(n);
        this.awakenScrollBars();
    }
    
    final void O() {
        final int b = this.h.b();
        final int n = 0;
        for (int i = 0; i < b; ++i) {
            ((nx)this.h.e(i).getLayoutParams()).e = true;
        }
        final oc f = this.f;
        for (int size = f.c.size(), j = n; j < size; ++j) {
            final nx nx = (nx)f.c.get(j).a.getLayoutParams();
            if (nx != null) {
                nx.e = true;
            }
        }
    }
    
    public final void P(final int n, final int n2, final boolean b) {
        final int n3 = n + n2;
        for (int b2 = this.h.b(), i = 0; i < b2; ++i) {
            final on k = k(this.h.e(i));
            if (k != null && !k.A()) {
                final int c = k.c;
                if (c >= n3) {
                    k.k(-n2, b);
                    this.L.f = true;
                }
                else if (c >= n) {
                    k.f(8);
                    k.k(-n2, b);
                    k.c = n - 1;
                    this.L.f = true;
                }
            }
        }
        final oc f = this.f;
        int size = f.c.size();
        while (true) {
            final int n4 = size - 1;
            if (n4 < 0) {
                break;
            }
            final on on = f.c.get(n4);
            size = n4;
            if (on == null) {
                continue;
            }
            final int c2 = on.c;
            if (c2 >= n3) {
                on.k(-n2, b);
                size = n4;
            }
            else {
                size = n4;
                if (c2 < n) {
                    continue;
                }
                on.f(8);
                f.j(n4);
                size = n4;
            }
        }
        this.requestLayout();
    }
    
    public final void Q() {
        ++this.am;
    }
    
    final void R() {
        this.S(true);
    }
    
    public final void S(final boolean b) {
        final int am = this.am - 1;
        this.am = am;
        if (am <= 0) {
            this.am = 0;
            if (b) {
                final int ak = this.ak;
                this.ak = 0;
                if (ak != 0 && this.as()) {
                    final AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    aof.b(obtain, ak);
                    this.sendAccessibilityEventUnchecked(obtain);
                }
                for (int i = this.R.size() - 1; i >= 0; --i) {
                    final on on = this.R.get(i);
                    if (on.a.getParent() == this) {
                        if (!on.A()) {
                            final int p = on.p;
                            if (p != -1) {
                                ana.X(on.a, p);
                                on.p = -1;
                            }
                        }
                    }
                }
                this.R.clear();
            }
        }
    }
    
    public void T(final int n) {
    }
    
    public final void U() {
        if (!this.O && this.r) {
            ana.I((View)this, this.aE);
            this.O = true;
        }
    }
    
    public final void V(final boolean b) {
        this.z |= b;
        this.y = true;
        final int b2 = this.h.b();
        final int n = 0;
        for (int i = 0; i < b2; ++i) {
            final on k = k(this.h.e(i));
            if (k != null && !k.A()) {
                k.f(6);
            }
        }
        this.O();
        final oc f = this.f;
        for (int size = f.c.size(), j = n; j < size; ++j) {
            final on on = f.c.get(j);
            if (on != null) {
                on.f(6);
                on.e((Object)null);
            }
        }
        final nq m = f.g.m;
        if (m != null && m.c) {
            return;
        }
        f.i();
    }
    
    public final void W() {
        final nt e = this.E;
        if (e != null) {
            e.c();
        }
        final nw n = this.n;
        if (n != null) {
            n.aS(this.f);
            this.n.aT(this.f);
        }
        this.f.d();
    }
    
    public final void X(final ny ny) {
        final List x = this.x;
        if (x == null) {
            return;
        }
        x.remove(ny);
    }
    
    public final void Y(final oa oa) {
        this.ag.remove(oa);
        if (this.ah == oa) {
            this.ah = null;
        }
    }
    
    public final void Z(int d, int e, final int[] array) {
        this.ak();
        this.Q();
        this.J(this.L);
        if (d != 0) {
            d = this.n.d(d, this.f, this.L);
        }
        else {
            d = 0;
        }
        if (e != 0) {
            e = this.n.e(e, this.f, this.L);
        }
        else {
            e = 0;
        }
        for (int a = this.h.a(), i = 0; i < a; ++i) {
            final View d2 = this.h.d(i);
            final on j = this.j(d2);
            if (j != null) {
                final on k = j.i;
                if (k != null) {
                    final View a2 = k.a;
                    final int left = d2.getLeft();
                    final int top = d2.getTop();
                    if (left != a2.getLeft() || top != a2.getTop()) {
                        a2.layout(left, top, a2.getWidth() + left, a2.getHeight() + top);
                    }
                }
            }
        }
        this.R();
        this.al(false);
        if (array != null) {
            array[0] = d;
            array[1] = e;
        }
    }
    
    public final void aA(int n, int n2, final Interpolator interpolator, final boolean b) {
        final nw n3 = this.n;
        if (n3 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        final boolean ae = n3.ae();
        final int n4 = 0;
        if (!ae) {
            n = 0;
        }
        if (!this.n.af()) {
            n2 = 0;
        }
        int n5;
        if ((n5 = n) == 0) {
            if (n2 == 0) {
                return;
            }
            n5 = 0;
        }
        if (b) {
            n = n4;
            if (n5 != 0) {
                n = 1;
            }
            int n6 = n;
            if (n2 != 0) {
                n6 = (n | 0x2);
            }
            this.aB(n6, 1);
        }
        this.J.c(n5, n2, Integer.MIN_VALUE, interpolator);
    }
    
    public final void aB(final int n, final int n2) {
        this.aL().m(n, n2);
    }
    
    public final void aC(final hy hy) {
        this.aD(hy, -1);
    }
    
    public final void aD(final hy hy, final int n) {
        final nw n2 = this.n;
        if (n2 != null) {
            n2.U("Cannot add item decoration during a scroll  or layout");
        }
        if (this.q.isEmpty()) {
            this.setWillNotDraw(false);
        }
        if (n < 0) {
            this.q.add(hy);
        }
        else {
            this.q.add(0, hy);
        }
        this.O();
        this.requestLayout();
    }
    
    public final void aE(final iw iw) {
        if (this.ay == null) {
            this.ay = new ArrayList();
        }
        this.ay.add(iw);
    }
    
    public final void aF(final on on, final alu alu) {
        on.m(0, 8192);
        if (this.L.h && on.y() && !on.v() && !on.A()) {
            this.T.e(this.e(on), on);
        }
        this.T.l(on, alu);
    }
    
    public final void aG(final hy hy) {
        final nw n = this.n;
        if (n != null) {
            n.U("Cannot remove item decoration during a scroll  or layout");
        }
        this.q.remove(hy);
        if (this.q.isEmpty()) {
            this.setWillNotDraw(this.getOverScrollMode() == 2);
        }
        this.O();
        this.requestLayout();
    }
    
    public final void aH(final iw iw) {
        final List ay = this.ay;
        if (ay != null) {
            ay.remove(iw);
        }
    }
    
    public final agmd aI() {
        return this.f.q();
    }
    
    public final void aJ(agmd h) {
        final oc f = this.f;
        f.f(f.g.m);
        final agmd h2 = f.h;
        if (h2 != null) {
            h2.N();
        }
        f.h = h;
        h = f.h;
        if (h != null && f.g.m != null) {
            h.L();
        }
        f.e();
    }
    
    public final void aa(final int n) {
        if (this.v) {
            return;
        }
        this.an();
        final nw n2 = this.n;
        if (n2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        n2.aa(n);
        this.awakenScrollBars();
    }
    
    public final void ab(final op p) {
        ana.N((View)this, (akv)(this.P = p));
    }
    
    public void ac(final nq m) {
        this.suppressLayout(false);
        final nq i = this.m;
        if (i != null) {
            i.w((hw)this.ae);
            this.m.u();
        }
        this.W();
        this.S.o();
        final nq j = this.m;
        if ((this.m = m) != null) {
            m.v((hw)this.ae);
            m.p(this);
        }
        final nw n = this.n;
        if (n != null) {
            n.bu();
        }
        final oc f = this.f;
        final nq k = this.m;
        f.d();
        f.g(j, true);
        final agmd q = f.q();
        if (j != null) {
            q.N();
        }
        if (q.b == 0) {
            q.M();
        }
        if (k != null) {
            q.L();
        }
        f.e();
        this.L.f = true;
        this.V(false);
        this.requestLayout();
    }
    
    public final void ad(final ns az) {
        if (az == this.az) {
            return;
        }
        this.az = az;
        this.setChildrenDrawingOrderEnabled(az != null);
    }
    
    public final void ae(final nt e) {
        final nt e2 = this.E;
        if (e2 != null) {
            e2.c();
            this.E.j = null;
        }
        if ((this.E = e) != null) {
            e.j = this.aI;
        }
    }
    
    public void af(final nw n) {
        if (n == this.n) {
            return;
        }
        this.an();
        if (this.n != null) {
            final nt e = this.E;
            if (e != null) {
                e.c();
            }
            this.n.aS(this.f);
            this.n.aT(this.f);
            this.f.d();
            if (this.r) {
                this.n.aL(this, this.f);
            }
            this.n.be((RecyclerView)null);
            this.n = null;
        }
        else {
            this.f.d();
        }
        final lo h = this.h;
        h.a.d();
        int size = h.b.size();
        while (--size >= 0) {
            h.c.ak((View)h.b.get(size));
            h.b.remove(size);
        }
        final qpt c = h.c;
        for (int ah = c.ah(), i = 0; i < ah; ++i) {
            final View aj = c.aj(i);
            ((RecyclerView)c.a).B(aj);
            aj.clearAnimation();
        }
        ((RecyclerView)c.a).removeAllViews();
        if ((this.n = n) != null) {
            if (n.t != null) {
                final StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(n);
                sb.append(" is already attached to a RecyclerView:");
                sb.append(n.t.o());
                throw new IllegalArgumentException(sb.toString());
            }
            this.n.be(this);
            if (this.r) {
                this.n.aK(this);
            }
        }
        this.f.o();
        this.requestLayout();
    }
    
    public final void ag(final int f) {
        if (f == this.F) {
            return;
        }
        if ((this.F = f) != 2) {
            this.aV();
        }
        final nw n = this.n;
        if (n != null) {
            n.aQ(f);
        }
        this.T(f);
        final List ay = this.ay;
        if (ay != null) {
            int size = ay.size();
            while (--size >= 0) {
                ((iw)this.ay.get(size)).b(this, f);
            }
        }
    }
    
    public final void ah(final int n, final int n2) {
        this.ai(n, n2, null);
    }
    
    public final void ai(final int n, final int n2, final Interpolator interpolator) {
        this.aA(n, n2, interpolator, false);
    }
    
    public final void aj(final int n) {
        if (this.v) {
            return;
        }
        final nw n2 = this.n;
        if (n2 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        n2.ao(this, n);
    }
    
    public final void ak() {
        final int ai = this.ai + 1;
        this.ai = ai;
        if (ai == 1 && !this.v) {
            this.u = false;
        }
    }
    
    public final void al(final boolean b) {
        int ai;
        if ((ai = this.ai) <= 0) {
            this.ai = 1;
            ai = 1;
        }
        if (!b && !this.v) {
            this.u = false;
        }
        if (ai == 1) {
            if (b && this.u && !this.v && this.n != null && this.m != null) {
                this.C();
            }
            if (!this.v) {
                this.u = false;
            }
        }
        --this.ai;
    }
    
    public final void am(final int n) {
        this.aL().c(n);
    }
    
    public final void an() {
        this.ag(0);
        this.aV();
    }
    
    public final boolean ap(final int n, final int n2, final int[] array, final int[] array2, final int n3) {
        return this.aL().g(n, n2, array, array2, n3);
    }
    
    public boolean aq(int n, int b) {
        final nw n2 = this.n;
        if (n2 == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.v) {
            return false;
        }
        final int ae = n2.ae() ? 1 : 0;
        final boolean af = this.n.af();
        int n3 = 0;
        Label_0067: {
            if (ae != 0) {
                n3 = n;
                if (Math.abs(n) >= this.I) {
                    break Label_0067;
                }
            }
            n3 = 0;
        }
        Label_0087: {
            if (af) {
                n = b;
                if (Math.abs(b) >= this.I) {
                    break Label_0087;
                }
            }
            n = 0;
        }
        if ((b = n3) == 0) {
            if (n == 0) {
                return false;
            }
            b = 0;
        }
        int n5 = 0;
        Label_0220: {
            Label_0217: {
                if (b != 0) {
                    final EdgeEffect a = this.A;
                    Label_0164: {
                        if (a != null && aph.b(a) != 0.0f) {
                            final int n4 = -b;
                            n5 = b;
                            if (!this.aY(this.A, n4, this.getWidth())) {
                                break Label_0164;
                            }
                            this.A.onAbsorb(n4);
                        }
                        else {
                            final EdgeEffect c = this.C;
                            if (c == null || aph.b(c) == 0.0f) {
                                break Label_0217;
                            }
                            n5 = b;
                            if (!this.aY(this.C, b, this.getWidth())) {
                                break Label_0164;
                            }
                            this.C.onAbsorb(b);
                        }
                        n5 = 0;
                    }
                    b = 0;
                    break Label_0220;
                }
            }
            n5 = 0;
        }
        int n7 = 0;
        Label_0334: {
            Label_0331: {
                if (n != 0) {
                    final EdgeEffect b2 = this.B;
                    Label_0278: {
                        if (b2 != null && aph.b(b2) != 0.0f) {
                            final int n6 = -n;
                            n7 = n;
                            if (!this.aY(this.B, n6, this.getHeight())) {
                                break Label_0278;
                            }
                            this.B.onAbsorb(n6);
                        }
                        else {
                            final EdgeEffect d = this.D;
                            if (d == null || aph.b(d) == 0.0f) {
                                break Label_0331;
                            }
                            n7 = n;
                            if (!this.aY(this.D, n, this.getHeight())) {
                                break Label_0278;
                            }
                            this.D.onAbsorb(n);
                        }
                        n7 = 0;
                    }
                    n = 0;
                    break Label_0334;
                }
            }
            n7 = 0;
        }
        int n8 = n5;
        int max = 0;
        int max2 = 0;
        Label_0416: {
            if (n5 == 0) {
                if (n7 == 0) {
                    max = 0;
                    max2 = 0;
                    break Label_0416;
                }
                n8 = 0;
            }
            final int au = this.au;
            max2 = Math.max(-au, Math.min(n8, au));
            final int au2 = this.au;
            max = Math.max(-au2, Math.min(n7, au2));
            this.J.a(max2, max);
        }
        int n9 = b;
        if (b == 0) {
            if (n == 0) {
                return max2 != 0 || max != 0;
            }
            n9 = 0;
        }
        final float n10 = (float)n9;
        final float n11 = (float)n;
        if (!this.dispatchNestedPreFling(n10, n11)) {
            final boolean b3 = ae != 0 || af;
            this.dispatchNestedFling(n10, n11, b3);
            final nz h = this.H;
            if (h != null) {
                final RecyclerView a2 = h.a;
                final nw n12 = a2.n;
                if (n12 != null) {
                    if (a2.m != null) {
                        b = a2.I;
                        if ((Math.abs(n) > b || Math.abs(n9) > b) && n12 instanceof oi) {
                            final oj d2 = h.d(n12);
                            if (d2 != null) {
                                b = h.a(n12, n9, n);
                                if (b != -1) {
                                    d2.b = b;
                                    n12.bf(d2);
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            if (b3) {
                b = ae;
                if (af) {
                    b = (ae | 0x2);
                }
                this.aB(b, 1);
                b = this.au;
                b = Math.max(-b, Math.min(n9, b));
                final int au3 = this.au;
                n = Math.min(n, au3);
                n = Math.max(-au3, n);
                this.J.a(b, n);
                return true;
            }
        }
        return false;
    }
    
    public final boolean ar() {
        return !this.t || this.y || this.S.q();
    }
    
    public final boolean as() {
        final AccessibilityManager al = this.al;
        return al != null && al.isEnabled();
    }
    
    public final boolean at() {
        return this.am > 0;
    }
    
    final boolean au(int n, final int n2, final MotionEvent motionEvent, int n3) {
        this.z();
        int n6;
        int n7;
        int n8;
        int n9;
        if (this.m != null) {
            final int[] q = this.Q;
            q[1] = (q[0] = 0);
            this.Z(n, n2, q);
            final int[] q2 = this.Q;
            final int n4 = q2[0];
            final int n5 = n6 = q2[1];
            n7 = n4;
            n8 = n - n4;
            n9 = n2 - n5;
        }
        else {
            n6 = 0;
            n7 = 0;
            n8 = 0;
            n9 = 0;
        }
        if (!this.q.isEmpty()) {
            this.invalidate();
        }
        final int[] q3 = this.Q;
        q3[1] = (q3[0] = 0);
        this.D(n7, n6, n8, n9, this.aC, n3, q3);
        final int[] q4 = this.Q;
        final int n10 = q4[0];
        final int n11 = q4[1];
        if (n10 == 0 && n11 == 0) {
            n3 = 0;
        }
        else {
            n3 = 1;
        }
        final int as = this.as;
        final int[] ac = this.aC;
        final int n12 = ac[0];
        this.as = as - n12;
        final int at = this.at;
        final int n13 = ac[1];
        this.at = at - n13;
        final int[] ad = this.aD;
        ad[0] += n12;
        ad[1] += n13;
        if (this.getOverScrollMode() != 2) {
            Label_0491: {
                if (motionEvent != null && !afk.d(motionEvent, 8194)) {
                    final float x = motionEvent.getX();
                    final float n14 = (float)(n8 - n10);
                    final float y = motionEvent.getY();
                    final float n15 = (float)(n9 - n11);
                    boolean b = false;
                    Label_0389: {
                        if (n14 < 0.0f) {
                            this.G();
                            aph.c(this.A, -n14 / this.getWidth(), 1.0f - y / this.getHeight());
                        }
                        else {
                            if (n14 <= 0.0f) {
                                b = false;
                                break Label_0389;
                            }
                            this.H();
                            aph.c(this.C, n14 / this.getWidth(), y / this.getHeight());
                        }
                        b = true;
                    }
                    if (n15 < 0.0f) {
                        this.I();
                        aph.c(this.B, -n15 / this.getHeight(), x / this.getWidth());
                    }
                    else if (n15 > 0.0f) {
                        this.F();
                        aph.c(this.D, n15 / this.getHeight(), 1.0f - x / this.getWidth());
                    }
                    else if (!b && n14 == 0.0f && n15 == 0.0f) {
                        break Label_0491;
                    }
                    ana.H((View)this);
                }
            }
            this.y(n, n2);
        }
        Label_0530: {
            if ((n = n7) == 0) {
                if (n6 == 0) {
                    n6 = 0;
                    n = 0;
                    break Label_0530;
                }
                n = 0;
            }
            this.E(n, n6);
        }
        if (!this.awakenScrollBars()) {
            this.invalidate();
        }
        return n3 != 0 || n != 0 || n6 != 0;
    }
    
    public final void ax() {
        final int d = this.d();
        if (d <= 0) {
            final StringBuilder sb = new StringBuilder("0 is an invalid index for size ");
            sb.append(d);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        final int d2 = this.d();
        if (d2 > 0) {
            this.aG(this.q.get(0));
            return;
        }
        final StringBuilder sb2 = new StringBuilder("0 is an invalid index for size ");
        sb2.append(d2);
        throw new IndexOutOfBoundsException(sb2.toString());
    }
    
    public final void ay(final on on, final int p2) {
        if (this.at()) {
            on.p = p2;
            this.R.add(on);
            return;
        }
        ana.X(on.a, p2);
    }
    
    public final void az() {
        final oc f = this.f;
        f.e = 0;
        f.o();
    }
    
    public final int b(final on on) {
        final boolean q = on.q(524);
        int n2;
        final int n = n2 = -1;
        if (!q) {
            if (!on.s()) {
                n2 = n;
            }
            else {
                final abey s = this.S;
                int c = on.c;
                int d;
                for (int size = s.b.size(), i = 0; i < size; ++i, c = d) {
                    final jy jy = s.b.get(i);
                    final int a = jy.a;
                    if (a != 1) {
                        if (a != 2) {
                            if (a != 8) {
                                d = c;
                            }
                            else {
                                final int b = jy.b;
                                if (b == c) {
                                    d = jy.d;
                                }
                                else {
                                    int n3;
                                    if (b < (n3 = c)) {
                                        n3 = c - 1;
                                    }
                                    if (jy.d <= (d = n3)) {
                                        d = n3 + 1;
                                    }
                                }
                            }
                        }
                        else {
                            final int b2 = jy.b;
                            if (b2 <= (d = c)) {
                                final int d2 = jy.d;
                                if (b2 + d2 > c) {
                                    n2 = n;
                                    return n2;
                                }
                                d = c - d2;
                            }
                        }
                    }
                    else if (jy.b <= (d = c)) {
                        d = c + jy.d;
                    }
                }
                n2 = c;
            }
        }
        return n2;
    }
    
    public final int c(final View view) {
        final on k = k(view);
        if (k != null) {
            return k.a();
        }
        return -1;
    }
    
    public final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof nx && this.n.t((nx)viewGroup$LayoutParams);
    }
    
    public final int computeHorizontalScrollExtent() {
        final nw n = this.n;
        if (n == null) {
            return 0;
        }
        if (n.ae()) {
            return this.n.B(this.L);
        }
        return 0;
    }
    
    public int computeHorizontalScrollOffset() {
        final nw n = this.n;
        if (n == null) {
            return 0;
        }
        if (n.ae()) {
            return this.n.C(this.L);
        }
        return 0;
    }
    
    public final int computeHorizontalScrollRange() {
        final nw n = this.n;
        if (n == null) {
            return 0;
        }
        if (n.ae()) {
            return this.n.D(this.L);
        }
        return 0;
    }
    
    public final int computeVerticalScrollExtent() {
        final nw n = this.n;
        if (n == null) {
            return 0;
        }
        if (n.af()) {
            return this.n.E(this.L);
        }
        return 0;
    }
    
    public final int computeVerticalScrollOffset() {
        final nw n = this.n;
        if (n == null) {
            return 0;
        }
        if (n.af()) {
            return this.n.F(this.L);
        }
        return 0;
    }
    
    public final int computeVerticalScrollRange() {
        final nw n = this.n;
        if (n == null) {
            return 0;
        }
        if (n.af()) {
            return this.n.G(this.L);
        }
        return 0;
    }
    
    public final int d() {
        return this.q.size();
    }
    
    public final boolean dispatchNestedFling(final float n, final float n2, final boolean b) {
        return this.aL().d(n, n2, b);
    }
    
    public final boolean dispatchNestedPreFling(final float n, final float n2) {
        return this.aL().e(n, n2);
    }
    
    public final boolean dispatchNestedPreScroll(final int n, final int n2, final int[] array, final int[] array2) {
        return this.aL().f(n, n2, array, array2);
    }
    
    public final boolean dispatchNestedScroll(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.aL().h(n, n2, n3, n4, array);
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        this.onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }
    
    protected final void dispatchRestoreInstanceState(final SparseArray sparseArray) {
        this.dispatchThawSelfOnly(sparseArray);
    }
    
    protected final void dispatchSaveInstanceState(final SparseArray sparseArray) {
        this.dispatchFreezeSelfOnly(sparseArray);
    }
    
    public void draw(final Canvas canvas) {
        super.draw(canvas);
        final int size = this.q.size();
        final boolean b = false;
        for (int i = 0; i < size; ++i) {
            ((hy)this.q.get(i)).d(canvas, this);
        }
        final EdgeEffect a = this.A;
        int n;
        if (a != null && !a.isFinished()) {
            final int save = canvas.save();
            int paddingBottom;
            if (this.i) {
                paddingBottom = this.getPaddingBottom();
            }
            else {
                paddingBottom = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float)(-this.getHeight() + paddingBottom), 0.0f);
            final EdgeEffect a2 = this.A;
            n = ((a2 != null && a2.draw(canvas)) ? 1 : 0);
            canvas.restoreToCount(save);
        }
        else {
            n = 0;
        }
        final EdgeEffect b2 = this.B;
        int n2 = n;
        if (b2 != null) {
            n2 = n;
            if (!b2.isFinished()) {
                final int save2 = canvas.save();
                if (this.i) {
                    canvas.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
                }
                final EdgeEffect b3 = this.B;
                n2 = (n | ((b3 != null && b3.draw(canvas)) ? 1 : 0));
                canvas.restoreToCount(save2);
            }
        }
        final EdgeEffect c = this.C;
        int n3 = n2;
        if (c != null) {
            n3 = n2;
            if (!c.isFinished()) {
                final int save3 = canvas.save();
                final int width = this.getWidth();
                int paddingTop;
                if (this.i) {
                    paddingTop = this.getPaddingTop();
                }
                else {
                    paddingTop = 0;
                }
                canvas.rotate(90.0f);
                canvas.translate((float)paddingTop, (float)(-width));
                final EdgeEffect c2 = this.C;
                n3 = (n2 | ((c2 != null && c2.draw(canvas)) ? 1 : 0));
                canvas.restoreToCount(save3);
            }
        }
        final EdgeEffect d = this.D;
        int n4 = n3;
        if (d != null) {
            n4 = n3;
            if (!d.isFinished()) {
                final int save4 = canvas.save();
                canvas.rotate(180.0f);
                if (this.i) {
                    canvas.translate((float)(-this.getWidth() + this.getPaddingRight()), (float)(-this.getHeight() + this.getPaddingBottom()));
                }
                else {
                    canvas.translate((float)(-this.getWidth()), (float)(-this.getHeight()));
                }
                final EdgeEffect d2 = this.D;
                int n5 = b ? 1 : 0;
                if (d2 != null) {
                    n5 = (b ? 1 : 0);
                    if (d2.draw(canvas)) {
                        n5 = 1;
                    }
                }
                n4 = (n3 | n5);
                canvas.restoreToCount(save4);
            }
        }
        if (n4 == 0 && (this.E == null || this.q.size() <= 0 || !this.E.j())) {
            return;
        }
        ana.H((View)this);
    }
    
    public final boolean drawChild(final Canvas canvas, final View view, final long n) {
        return super.drawChild(canvas, view, n);
    }
    
    final long e(final on on) {
        long e;
        if (this.m.c) {
            e = on.e;
        }
        else {
            e = on.c;
        }
        return e;
    }
    
    public final Rect f(final View view) {
        final nx nx = (nx)view.getLayoutParams();
        if (!nx.e) {
            return nx.d;
        }
        if (this.L.g && (nx.lu() || nx.c.t())) {
            return nx.d;
        }
        final Rect d = nx.d;
        d.set(0, 0, 0, 0);
        for (int size = this.q.size(), i = 0; i < size; ++i) {
            this.k.set(0, 0, 0, 0);
            ((hy)this.q.get(i)).b(this.k, view, this, this.L);
            d.left += this.k.left;
            d.top += this.k.top;
            d.right += this.k.right;
            d.bottom += this.k.bottom;
        }
        nx.e = false;
        return d;
    }
    
    public final View focusSearch(final View view, int aw) {
        final nq m = this.m;
        final boolean b = true;
        final boolean b2 = m != null && this.n != null && !this.at() && !this.v;
        final FocusFinder instance = FocusFinder.getInstance();
        View view2 = null;
        int n2 = 0;
        Label_0298: {
            Label_0231: {
                if (b2) {
                    int n;
                    if ((n = aw) != 2) {
                        if (aw != 1) {
                            break Label_0231;
                        }
                        n = 1;
                    }
                    Label_0215: {
                        Label_0173: {
                            if (this.n.af()) {
                                if (n == 2) {
                                    aw = 130;
                                }
                                else {
                                    aw = 33;
                                }
                                if (instance.findNextFocus((ViewGroup)this, view, aw) == null) {
                                    break Label_0173;
                                }
                            }
                            if (!this.n.ae()) {
                                break Label_0215;
                            }
                            if (this.n.aw() == 1) {
                                aw = 1;
                            }
                            else {
                                aw = 0;
                            }
                            if (0x1 != (aw ^ ((n == 2) ? 1 : 0))) {
                                aw = 17;
                            }
                            else {
                                aw = 66;
                            }
                            if (instance.findNextFocus((ViewGroup)this, view, aw) != null) {
                                break Label_0215;
                            }
                        }
                        this.z();
                        if (this.n(view) == null) {
                            return null;
                        }
                        this.ak();
                        this.n.rh(view, n, this.f, this.L);
                        this.al(false);
                    }
                    view2 = instance.findNextFocus((ViewGroup)this, view, n);
                    n2 = n;
                    break Label_0298;
                }
            }
            view2 = instance.findNextFocus((ViewGroup)this, view, aw);
            if (view2 == null && b2) {
                this.z();
                if (this.n(view) == null) {
                    return null;
                }
                this.ak();
                view2 = this.n.rh(view, aw, this.f, this.L);
                this.al(false);
                n2 = aw;
            }
            else {
                n2 = aw;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            if (view2 != null && view2 != this) {
                if (view2 != view) {
                    if (this.n(view2) != null) {
                        if (view != null) {
                            if (this.n(view) != null) {
                                this.k.set(0, 0, view.getWidth(), view.getHeight());
                                this.af.set(0, 0, view2.getWidth(), view2.getHeight());
                                this.offsetDescendantRectToMyCoords(view, this.k);
                                this.offsetDescendantRectToMyCoords(view2, this.af);
                                aw = this.n.aw();
                                int n3 = -1;
                                int n4;
                                if (aw == 1) {
                                    n4 = -1;
                                }
                                else {
                                    n4 = 1;
                                }
                                if ((this.k.left < this.af.left || this.k.right <= this.af.left) && this.k.right < this.af.right) {
                                    aw = 1;
                                }
                                else if ((this.k.right > this.af.right || this.k.left >= this.af.right) && this.k.left > this.af.left) {
                                    aw = -1;
                                }
                                else {
                                    aw = 0;
                                }
                                if ((this.k.top < this.af.top || this.k.bottom <= this.af.top) && this.k.bottom < this.af.bottom) {
                                    n3 = 1;
                                }
                                else if ((this.k.bottom <= this.af.bottom && this.k.top < this.af.bottom) || this.k.top <= this.af.top) {
                                    n3 = 0;
                                }
                                int n5 = 0;
                                Label_0846: {
                                    if (n2 != 1) {
                                        if (n2 != 2) {
                                            if (n2 != 17) {
                                                if (n2 != 33) {
                                                    if (n2 != 66) {
                                                        if (n2 != 130) {
                                                            final StringBuilder sb = new StringBuilder("Invalid direction: ");
                                                            sb.append(n2);
                                                            sb.append(this.o());
                                                            throw new IllegalArgumentException(sb.toString());
                                                        }
                                                        if (n3 > 0) {
                                                            return view2;
                                                        }
                                                        return super.focusSearch(view, n2);
                                                    }
                                                    else {
                                                        if (aw > 0) {
                                                            return view2;
                                                        }
                                                        return super.focusSearch(view, n2);
                                                    }
                                                }
                                                else {
                                                    if (n3 < 0) {
                                                        return view2;
                                                    }
                                                    return super.focusSearch(view, n2);
                                                }
                                            }
                                            else {
                                                if (aw < 0) {
                                                    return view2;
                                                }
                                                return super.focusSearch(view, n2);
                                            }
                                        }
                                        else {
                                            n5 = (b ? 1 : 0);
                                            if (n3 > 0) {
                                                break Label_0846;
                                            }
                                            if (n3 == 0) {
                                                if (aw * n4 > 0) {
                                                    n5 = (b ? 1 : 0);
                                                    break Label_0846;
                                                }
                                                return super.focusSearch(view, n2);
                                            }
                                        }
                                    }
                                    else {
                                        n5 = (b ? 1 : 0);
                                        if (n3 < 0) {
                                            break Label_0846;
                                        }
                                        if (n3 == 0) {
                                            if (aw * n4 < 0) {
                                                n5 = (b ? 1 : 0);
                                                break Label_0846;
                                            }
                                            return super.focusSearch(view, n2);
                                        }
                                    }
                                    n5 = 0;
                                }
                                if (n5 == 0) {
                                    return super.focusSearch(view, n2);
                                }
                            }
                        }
                        return view2;
                    }
                }
            }
            return super.focusSearch(view, n2);
        }
        if (this.getFocusedChild() == null) {
            return super.focusSearch(view, n2);
        }
        this.aS(view2, null);
        return view;
    }
    
    public final on g(View n) {
        n = this.n(n);
        if (n == null) {
            return null;
        }
        return this.j(n);
    }
    
    public final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        final nw n = this.n;
        if (n != null) {
            return (ViewGroup$LayoutParams)n.f();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(this.o()));
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        final nw n = this.n;
        if (n != null) {
            return (ViewGroup$LayoutParams)n.h(this.getContext(), set);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(this.o()));
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        final nw n = this.n;
        if (n != null) {
            return (ViewGroup$LayoutParams)n.rg(viewGroup$LayoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(this.o()));
    }
    
    public final CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }
    
    public final int getBaseline() {
        if (this.n != null) {
            return -1;
        }
        return super.getBaseline();
    }
    
    protected final int getChildDrawingOrder(final int n, final int n2) {
        final ns az = this.az;
        if (az == null) {
            return super.getChildDrawingOrder(n, n2);
        }
        return az.a(n, n2);
    }
    
    public final boolean getClipToPadding() {
        return this.i;
    }
    
    public final on h(final int n) {
        final boolean y = this.y;
        on on = null;
        if (y) {
            return null;
        }
        on on2;
        for (int b = this.h.b(), i = 0; i < b; ++i, on = on2) {
            final on k = k(this.h.e(i));
            on2 = on;
            if (k != null) {
                on2 = on;
                if (!k.v()) {
                    on2 = on;
                    if (this.b(k) == n) {
                        if (!this.h.k(k.a)) {
                            return k;
                        }
                        on2 = k;
                    }
                }
            }
        }
        return on;
    }
    
    public final boolean hasNestedScrollingParent() {
        return this.aL().j();
    }
    
    public final on i(final int n, final boolean b) {
        final int b2 = this.h.b();
        on on = null;
        on on2;
        for (int i = 0; i < b2; ++i, on = on2) {
            final on k = k(this.h.e(i));
            on2 = on;
            if (k != null) {
                on2 = on;
                if (!k.v()) {
                    if (b) {
                        if (k.c != n) {
                            on2 = on;
                            continue;
                        }
                    }
                    else if (k.c() != n) {
                        on2 = on;
                        continue;
                    }
                    if (!this.h.k(k.a)) {
                        return k;
                    }
                    on2 = k;
                }
            }
        }
        return on;
    }
    
    public final boolean isAttachedToWindow() {
        return this.r;
    }
    
    public final boolean isLayoutSuppressed() {
        return this.v;
    }
    
    public final boolean isNestedScrollingEnabled() {
        return this.aL().a;
    }
    
    public final on j(final View view) {
        final ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            final StringBuilder sb = new StringBuilder("View ");
            sb.append(view);
            sb.append(" is not a direct child of ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        return k(view);
    }
    
    public final View m(final float n, final float n2) {
        int a = this.h.a();
        while (true) {
            final int n3 = a - 1;
            if (n3 < 0) {
                return null;
            }
            final View d = this.h.d(n3);
            final float translationX = d.getTranslationX();
            final float translationY = d.getTranslationY();
            a = n3;
            if (n < d.getLeft() + translationX) {
                continue;
            }
            a = n3;
            if (n > d.getRight() + translationX) {
                continue;
            }
            a = n3;
            if (n2 < d.getTop() + translationY) {
                continue;
            }
            if (n2 <= d.getBottom() + translationY) {
                return d;
            }
            a = n3;
        }
    }
    
    public final View n(View view) {
        ViewParent viewParent;
        for (viewParent = view.getParent(); viewParent != null && viewParent != this && viewParent instanceof View; viewParent = view.getParent()) {
            view = (View)viewParent;
        }
        if (viewParent == this) {
            return view;
        }
        return null;
    }
    
    public final String o() {
        final StringBuilder sb = new StringBuilder(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.m);
        sb.append(", layout:");
        sb.append(this.n);
        sb.append(", context:");
        sb.append(this.getContext());
        return sb.toString();
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.am = 0;
        boolean t = true;
        this.r = true;
        if (!this.t || this.isLayoutRequested()) {
            t = false;
        }
        this.t = t;
        this.f.e();
        final nw n = this.n;
        if (n != null) {
            n.aK(this);
        }
        this.O = false;
        if (RecyclerView.c) {
            if ((this.K = mn.a.get()) == null) {
                this.K = new mn();
                final Display o = ana.o((View)this);
                final boolean inEditMode = this.isInEditMode();
                float refreshRate;
                final float n2 = refreshRate = 60.0f;
                if (!inEditMode) {
                    refreshRate = n2;
                    if (o != null) {
                        refreshRate = o.getRefreshRate();
                        if (refreshRate < 30.0f) {
                            refreshRate = n2;
                        }
                    }
                }
                final mn k = this.K;
                k.e = (long)(1.0E9f / refreshRate);
                mn.a.set(k);
            }
            this.K.c.add(this);
        }
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final nt e = this.E;
        if (e != null) {
            e.c();
        }
        this.an();
        int i = 0;
        this.r = false;
        final nw n = this.n;
        if (n != null) {
            n.aL(this, this.f);
        }
        this.R.clear();
        this.removeCallbacks(this.aE);
        while (qa.a.a() != null) {}
        oc f;
        for (f = this.f; i < f.c.size(); ++i) {
            apj.e(((on)f.c.get(i)).a);
        }
        f.f(f.g.m);
        final Iterator a = new atol(this, 1).a();
        while (a.hasNext()) {
            apj.f((View)a.next()).f();
        }
        if (RecyclerView.c) {
            final mn k = this.K;
            if (k != null) {
                k.c.remove(this);
                this.K = null;
            }
        }
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        for (int size = this.q.size(), i = 0; i < size; ++i) {
            ((hy)this.q.get(i)).c(canvas, this);
        }
    }
    
    public final boolean onGenericMotionEvent(final MotionEvent motionEvent) {
        if (this.n == null) {
            return false;
        }
        if (this.v) {
            return false;
        }
        if (motionEvent.getAction() == 8) {
            float n2 = 0.0f;
            float axisValue2 = 0.0f;
            Label_0140: {
                Label_0138: {
                    if ((motionEvent.getSource() & 0x2) != 0x0) {
                        float n;
                        if (this.n.af()) {
                            n = -motionEvent.getAxisValue(9);
                        }
                        else {
                            n = 0.0f;
                        }
                        n2 = n;
                        if (this.n.ae()) {
                            final float axisValue = motionEvent.getAxisValue(10);
                            n2 = n;
                            axisValue2 = axisValue;
                            break Label_0140;
                        }
                    }
                    else {
                        if ((motionEvent.getSource() & 0x400000) != 0x0) {
                            axisValue2 = motionEvent.getAxisValue(26);
                            if (this.n.af()) {
                                n2 = -axisValue2;
                                break Label_0138;
                            }
                            if (this.n.ae()) {
                                n2 = 0.0f;
                                break Label_0140;
                            }
                        }
                        n2 = 0.0f;
                    }
                }
                axisValue2 = 0.0f;
            }
            if (n2 != 0.0f || axisValue2 != 0.0f) {
                final int n3 = (int)(axisValue2 * this.av);
                final int n4 = (int)(n2 * this.aw);
                final nw n5 = this.n;
                if (n5 == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                }
                else if (!this.v) {
                    final int[] q = this.Q;
                    q[1] = (q[0] = 0);
                    final int ae = n5.ae() ? 1 : 0;
                    final boolean af = this.n.af();
                    int n6;
                    if (af) {
                        n6 = (ae | 0x2);
                    }
                    else {
                        n6 = ae;
                    }
                    float y;
                    if (motionEvent == null) {
                        y = this.getHeight() / 2.0f;
                    }
                    else {
                        y = motionEvent.getY();
                    }
                    float x;
                    if (motionEvent == null) {
                        x = this.getWidth() / 2.0f;
                    }
                    else {
                        x = motionEvent.getX();
                    }
                    final int n7 = n3 - this.a(n3, y);
                    final int n8 = n4 - this.aK(n4, x);
                    this.aB(n6, 1);
                    int n9;
                    if (ae == 0) {
                        n9 = 0;
                    }
                    else {
                        n9 = n7;
                    }
                    int n10;
                    if (!af) {
                        n10 = 0;
                    }
                    else {
                        n10 = n8;
                    }
                    int n11 = n8;
                    int n12 = n7;
                    if (this.ap(n9, n10, this.Q, this.aC, 1)) {
                        final int[] q2 = this.Q;
                        n12 = n7 - q2[0];
                        n11 = n8 - q2[1];
                    }
                    int n13;
                    if (ae == 0) {
                        n13 = 0;
                    }
                    else {
                        n13 = n12;
                    }
                    int n14;
                    if (!af) {
                        n14 = 0;
                    }
                    else {
                        n14 = n11;
                    }
                    this.au(n13, n14, motionEvent, 1);
                    final mn k = this.K;
                    Label_0484: {
                        if (k != null) {
                            int n15;
                            if ((n15 = n12) == 0) {
                                if (n11 == 0) {
                                    break Label_0484;
                                }
                                n15 = 0;
                            }
                            k.a(this, n15, n11);
                        }
                    }
                    this.am(1);
                }
            }
        }
        return false;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (this.v) {
            return false;
        }
        this.ah = null;
        if (this.aW(motionEvent)) {
            this.aM();
            return true;
        }
        final nw n = this.n;
        if (n == null) {
            return false;
        }
        final int ae = n.ae() ? 1 : 0;
        final boolean af = this.n.af();
        if (this.ap == null) {
            this.ap = VelocityTracker.obtain();
        }
        this.ap.addMovement(motionEvent);
        final int actionMasked = motionEvent.getActionMasked();
        final int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                this.aQ(motionEvent);
                            }
                        }
                        else {
                            this.ao = motionEvent.getPointerId(actionIndex);
                            final int n2 = (int)(motionEvent.getX(actionIndex) + 0.5f);
                            this.as = n2;
                            this.aq = n2;
                            final int n3 = (int)(motionEvent.getY(actionIndex) + 0.5f);
                            this.at = n3;
                            this.ar = n3;
                        }
                    }
                    else {
                        this.aM();
                    }
                }
                else {
                    final int pointerIndex = motionEvent.findPointerIndex(this.ao);
                    if (pointerIndex < 0) {
                        final StringBuilder sb = new StringBuilder("Error processing scroll; pointer index for id ");
                        sb.append(this.ao);
                        sb.append(" not found. Did any MotionEvents get skipped?");
                        Log.e("RecyclerView", sb.toString());
                        return false;
                    }
                    final int as = (int)(motionEvent.getX(pointerIndex) + 0.5f);
                    final int at = (int)(motionEvent.getY(pointerIndex) + 0.5f);
                    if (this.F != 1) {
                        final int aq = this.aq;
                        final int ar = this.ar;
                        boolean b;
                        if (ae != 0 && Math.abs(as - aq) > this.G) {
                            this.as = as;
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        if (af && Math.abs(at - ar) > this.G) {
                            this.at = at;
                        }
                        else if (!b) {
                            return this.F == 1;
                        }
                        this.ag(1);
                    }
                }
            }
            else {
                this.ap.clear();
                this.am(0);
            }
        }
        else {
            if (this.aj) {
                this.aj = false;
            }
            this.ao = motionEvent.getPointerId(0);
            final int n4 = (int)(motionEvent.getX() + 0.5f);
            this.as = n4;
            this.aq = n4;
            final int n5 = (int)(motionEvent.getY() + 0.5f);
            this.at = n5;
            this.ar = n5;
            final EdgeEffect a = this.A;
            boolean b2;
            if (a != null && aph.b(a) != 0.0f && !this.canScrollHorizontally(-1)) {
                aph.c(this.A, 0.0f, 1.0f - motionEvent.getY() / this.getHeight());
                b2 = true;
            }
            else {
                b2 = false;
            }
            final EdgeEffect c = this.C;
            boolean b3 = b2;
            if (c != null) {
                b3 = b2;
                if (aph.b(c) != 0.0f) {
                    b3 = b2;
                    if (!this.canScrollHorizontally(1)) {
                        aph.c(this.C, 0.0f, motionEvent.getY() / this.getHeight());
                        b3 = true;
                    }
                }
            }
            final EdgeEffect b4 = this.B;
            boolean b5 = b3;
            if (b4 != null) {
                b5 = b3;
                if (aph.b(b4) != 0.0f) {
                    b5 = b3;
                    if (!this.canScrollVertically(-1)) {
                        aph.c(this.B, 0.0f, motionEvent.getX() / this.getWidth());
                        b5 = true;
                    }
                }
            }
            final EdgeEffect d = this.D;
            Label_0723: {
                if (d != null && aph.b(d) != 0.0f && !this.canScrollVertically(1)) {
                    aph.c(this.D, 0.0f, 1.0f - motionEvent.getX() / this.getWidth());
                }
                else if (!b5 && this.F != 2) {
                    break Label_0723;
                }
                this.getParent().requestDisallowInterceptTouchEvent(true);
                this.ag(1);
                this.am(1);
            }
            final int[] ad = this.aD;
            ad[ad[1] = 0] = 0;
            int n6 = ae;
            if (af) {
                n6 = (ae | 0x2);
            }
            this.aB(n6, 0);
        }
        return this.F == 1;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.C();
        this.t = true;
    }
    
    protected void onMeasure(final int n, final int n2) {
        final nw n3 = this.n;
        if (n3 == null) {
            this.A(n, n2);
            return;
        }
        final boolean ag = n3.ag();
        final boolean b = false;
        if (ag) {
            final int mode = View$MeasureSpec.getMode(n);
            final int mode2 = View$MeasureSpec.getMode(n2);
            this.n.bw(n, n2);
            boolean af = b;
            if (mode == 1073741824) {
                af = b;
                if (mode2 == 1073741824) {
                    af = true;
                }
            }
            if (!(this.aF = af)) {
                if (this.m != null) {
                    if (this.L.d == 1) {
                        this.aN();
                    }
                    this.n.bb(n, n2);
                    this.L.i = true;
                    this.aO();
                    this.n.bd(n, n2);
                    if (this.n.aj()) {
                        this.n.bb(View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 1073741824));
                        this.L.i = true;
                        this.aO();
                        this.n.bd(n, n2);
                    }
                    this.aG = this.getMeasuredWidth();
                    this.aH = this.getMeasuredHeight();
                }
            }
            return;
        }
        if (this.s) {
            n3.bw(n, n2);
            return;
        }
        if (this.w) {
            this.ak();
            this.Q();
            this.aR();
            this.R();
            final ok l = this.L;
            if (l.k) {
                l.g = true;
            }
            else {
                this.S.j();
                this.L.g = false;
            }
            this.al(this.w = false);
        }
        else if (this.L.k) {
            this.setMeasuredDimension(this.getMeasuredWidth(), this.getMeasuredHeight());
            return;
        }
        final nq m = this.m;
        if (m != null) {
            this.L.e = m.a();
        }
        else {
            this.L.e = 0;
        }
        this.ak();
        this.n.bw(n, n2);
        this.al(false);
        this.L.g = false;
    }
    
    protected final boolean onRequestFocusInDescendants(final int n, final Rect rect) {
        return !this.at() && super.onRequestFocusInDescendants(n, rect);
    }
    
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof RecyclerView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final RecyclerView$SavedState g = (RecyclerView$SavedState)parcelable;
        this.g = g;
        super.onRestoreInstanceState(g.d);
        this.requestLayout();
    }
    
    protected final Parcelable onSaveInstanceState() {
        final RecyclerView$SavedState recyclerView$SavedState = new RecyclerView$SavedState(super.onSaveInstanceState());
        final RecyclerView$SavedState g = this.g;
        if (g != null) {
            recyclerView$SavedState.a = g.a;
        }
        else {
            final nw n = this.n;
            Parcelable q;
            if (n != null) {
                q = n.Q();
            }
            else {
                q = null;
            }
            recyclerView$SavedState.a = q;
        }
        return (Parcelable)recyclerView$SavedState;
    }
    
    protected final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (n == n3 && n2 == n4) {
            return;
        }
        this.L();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final boolean v = this.v;
        final int n = 0;
        if (!v && !this.aj) {
            final oa ah = this.ah;
            Label_1095: {
                if (ah == null) {
                    if (motionEvent.getAction() != 0) {
                        if (this.aW(motionEvent)) {
                            break Label_1095;
                        }
                    }
                    final nw n2 = this.n;
                    if (n2 == null) {
                        return false;
                    }
                    final int ae = n2.ae() ? 1 : 0;
                    final boolean af = this.n.af();
                    if (this.ap == null) {
                        this.ap = VelocityTracker.obtain();
                    }
                    final int actionMasked = motionEvent.getActionMasked();
                    final int actionIndex = motionEvent.getActionIndex();
                    int n3;
                    if ((n3 = actionMasked) == 0) {
                        final int[] ad = this.aD;
                        ad[ad[1] = 0] = 0;
                        n3 = 0;
                    }
                    final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    final int[] ad2 = this.aD;
                    obtain.offsetLocation((float)ad2[0], (float)ad2[1]);
                    Label_1057: {
                        Label_1048: {
                            if (n3 != 0) {
                                if (n3 == 1) {
                                    this.ap.addMovement(obtain);
                                    this.ap.computeCurrentVelocity(1000, (float)this.au);
                                    float n4;
                                    if (ae != 0) {
                                        n4 = -this.ap.getXVelocity(this.ao);
                                    }
                                    else {
                                        n4 = 0.0f;
                                    }
                                    float n5;
                                    if (af) {
                                        n5 = -this.ap.getYVelocity(this.ao);
                                    }
                                    else {
                                        n5 = 0.0f;
                                    }
                                    if ((n4 == 0.0f && n5 == 0.0f) || !this.aq((int)n4, (int)n5)) {
                                        this.ag(0);
                                    }
                                    this.aU();
                                    break Label_1057;
                                }
                                if (n3 != 2) {
                                    if (n3 != 3) {
                                        if (n3 != 5) {
                                            if (n3 == 6) {
                                                this.aQ(motionEvent);
                                            }
                                        }
                                        else {
                                            this.ao = motionEvent.getPointerId(actionIndex);
                                            final int n6 = (int)(motionEvent.getX(actionIndex) + 0.5f);
                                            this.as = n6;
                                            this.aq = n6;
                                            final int n7 = (int)(motionEvent.getY(actionIndex) + 0.5f);
                                            this.at = n7;
                                            this.ar = n7;
                                        }
                                    }
                                    else {
                                        this.aM();
                                    }
                                }
                                else {
                                    final int pointerIndex = motionEvent.findPointerIndex(this.ao);
                                    if (pointerIndex < 0) {
                                        final StringBuilder sb = new StringBuilder("Error processing scroll; pointer index for id ");
                                        sb.append(this.ao);
                                        sb.append(" not found. Did any MotionEvents get skipped?");
                                        Log.e("RecyclerView", sb.toString());
                                        return false;
                                    }
                                    final int n8 = (int)(motionEvent.getX(pointerIndex) + 0.5f);
                                    final int n9 = (int)(motionEvent.getY(pointerIndex) + 0.5f);
                                    final int n10 = this.as - n8;
                                    final int n11 = this.at - n9;
                                    int n12 = n10;
                                    int n13 = n11;
                                    if (this.F != 1) {
                                        int n14 = n10;
                                        int n15 = 0;
                                        boolean b = false;
                                        Label_0460: {
                                            if (ae != 0) {
                                                if (n10 > 0) {
                                                    n15 = Math.max(0, n10 - this.G);
                                                }
                                                else {
                                                    n15 = Math.min(0, n10 + this.G);
                                                }
                                                n14 = n15;
                                                if (n15 != 0) {
                                                    b = true;
                                                    break Label_0460;
                                                }
                                            }
                                            b = false;
                                            n15 = n14;
                                        }
                                        int n16 = n11;
                                        boolean b2 = b;
                                        if (af) {
                                            int n17;
                                            if (n11 > 0) {
                                                n17 = Math.max(0, n11 - this.G);
                                            }
                                            else {
                                                n17 = Math.min(0, n11 + this.G);
                                            }
                                            n16 = n17;
                                            b2 = b;
                                            if (n17 != 0) {
                                                b2 = true;
                                                n16 = n17;
                                            }
                                        }
                                        n12 = n15;
                                        n13 = n16;
                                        if (b2) {
                                            this.ag(1);
                                            n13 = n16;
                                            n12 = n15;
                                        }
                                    }
                                    if (this.F == 1) {
                                        final int[] q = this.Q;
                                        q[1] = (q[0] = 0);
                                        final int n18 = n12 - this.a(n12, motionEvent.getY());
                                        final int n19 = n13 - this.aK(n13, motionEvent.getX());
                                        int n20;
                                        if (ae == 0) {
                                            n20 = 0;
                                        }
                                        else {
                                            n20 = n18;
                                        }
                                        int n21;
                                        if (!af) {
                                            n21 = 0;
                                        }
                                        else {
                                            n21 = n19;
                                        }
                                        int n22 = n18;
                                        int n23 = n19;
                                        if (this.ap(n20, n21, this.Q, this.aC, 0)) {
                                            final int[] q2 = this.Q;
                                            n22 = n18 - q2[0];
                                            n23 = n19 - q2[1];
                                            final int[] ad3 = this.aD;
                                            final int n24 = ad3[0];
                                            final int[] ac = this.aC;
                                            ad3[0] = n24 + ac[0];
                                            ad3[1] += ac[1];
                                            this.getParent().requestDisallowInterceptTouchEvent(true);
                                        }
                                        final int[] ac2 = this.aC;
                                        this.as = n8 - ac2[0];
                                        this.at = n9 - ac2[1];
                                        int n25;
                                        if (ae == 0) {
                                            n25 = 0;
                                        }
                                        else {
                                            n25 = n22;
                                        }
                                        int n26;
                                        if (!af) {
                                            n26 = 0;
                                        }
                                        else {
                                            n26 = n23;
                                        }
                                        if (this.au(n25, n26, motionEvent, 0)) {
                                            this.getParent().requestDisallowInterceptTouchEvent(true);
                                        }
                                        final mn k = this.K;
                                        if (k != null) {
                                            if (n22 == 0) {
                                                if (n23 == 0) {
                                                    break Label_1048;
                                                }
                                                n22 = n;
                                            }
                                            k.a(this, n22, n23);
                                        }
                                    }
                                }
                            }
                            else {
                                this.ao = motionEvent.getPointerId(0);
                                final int n27 = (int)(motionEvent.getX() + 0.5f);
                                this.as = n27;
                                this.aq = n27;
                                final int n28 = (int)(motionEvent.getY() + 0.5f);
                                this.at = n28;
                                this.ar = n28;
                                int n29 = ae;
                                if (af) {
                                    n29 = (ae | 0x2);
                                }
                                this.aB(n29, 0);
                            }
                        }
                        this.ap.addMovement(obtain);
                    }
                    obtain.recycle();
                    return true;
                }
                else {
                    ah.l(motionEvent);
                    final int action = motionEvent.getAction();
                    if (action == 3 || action == 1) {
                        this.ah = null;
                    }
                }
            }
            this.aM();
            return true;
        }
        return false;
    }
    
    public final void removeDetachedView(final View view, final boolean b) {
        final on k = k(view);
        if (k != null) {
            if (k.x()) {
                k.j();
            }
            else if (!k.A()) {
                final StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(k);
                sb.append(this.o());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        this.B(view);
        super.removeDetachedView(view, b);
    }
    
    public final void requestChildFocus(final View view, final View view2) {
        if (!this.n.bh()) {
            if (!this.at()) {
                if (view2 != null) {
                    this.aS(view, view2);
                }
            }
        }
        super.requestChildFocus(view, view2);
    }
    
    public final boolean requestChildRectangleOnScreen(final View view, final Rect rect, final boolean b) {
        return this.n.bi(this, view, rect, b, false);
    }
    
    public final void requestDisallowInterceptTouchEvent(final boolean b) {
        for (int size = this.ag.size(), i = 0; i < size; ++i) {
            ((oa)this.ag.get(i)).e(b);
        }
        super.requestDisallowInterceptTouchEvent(b);
    }
    
    public final void requestLayout() {
        if (this.ai == 0 && !this.v) {
            super.requestLayout();
            return;
        }
        this.u = true;
    }
    
    public final void s(final on on) {
        final View a = on.a;
        final ViewParent parent = a.getParent();
        this.f.n(this.j(a));
        if (on.x()) {
            this.h.g(a, -1, a.getLayoutParams(), true);
            return;
        }
        if (parent != this) {
            this.h.f(a, -1, true);
            return;
        }
        final lo h = this.h;
        final int ai = h.c.ai(a);
        if (ai >= 0) {
            h.a.e(ai);
            h.i(a);
            return;
        }
        new StringBuilder("view is not a child, cannot hide ").append(a);
        throw new IllegalArgumentException("view is not a child, cannot hide ".concat(a.toString()));
    }
    
    public final void scrollBy(int n, int n2) {
        final nw n3 = this.n;
        if (n3 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        final boolean ae = n3.ae();
        boolean af = this.n.af();
        if (!ae) {
            if (!af) {
                return;
            }
            af = true;
        }
        if (!ae) {
            n = 0;
        }
        if (!af) {
            n2 = 0;
        }
        this.au(n, n2, null, 0);
    }
    
    public final void scrollTo(final int n, final int n2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }
    
    public final void sendAccessibilityEventUnchecked(final AccessibilityEvent accessibilityEvent) {
        if (this.at()) {
            final int n = 0;
            int a;
            if (accessibilityEvent != null) {
                a = aof.a(accessibilityEvent);
            }
            else {
                a = 0;
            }
            if (a == 0) {
                a = n;
            }
            this.ak |= a;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }
    
    public final void setClipToPadding(final boolean i) {
        if (i != this.i) {
            this.L();
        }
        super.setClipToPadding(this.i = i);
        if (this.t) {
            this.requestLayout();
        }
    }
    
    @Deprecated
    public final void setLayoutTransition(final LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition)null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }
    
    public final void setNestedScrollingEnabled(final boolean b) {
        this.aL().a(b);
    }
    
    public final boolean startNestedScroll(final int n) {
        return this.aL().l(n);
    }
    
    public final void stopNestedScroll() {
        this.aL().b();
    }
    
    public final void suppressLayout(final boolean b) {
        if (b != this.v) {
            this.v("Do not suppressLayout in layout or scroll");
            if (!b) {
                this.v = false;
                if (this.u && this.n != null && this.m != null) {
                    this.requestLayout();
                }
                this.u = false;
                return;
            }
            final long uptimeMillis = SystemClock.uptimeMillis();
            this.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.v = true;
            this.aj = true;
            this.an();
        }
    }
    
    public final void t(final ny ny) {
        if (this.x == null) {
            this.x = new ArrayList();
        }
        this.x.add(ny);
    }
    
    public final void u(final oa oa) {
        this.ag.add(oa);
    }
    
    public final void v(final String s) {
        if (!this.at()) {
            if (this.an > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", (Throwable)new IllegalStateException("".concat(this.o())));
            }
            return;
        }
        if (s == null) {
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(this.o()));
        }
        throw new IllegalStateException(s);
    }
    
    final void x() {
        final int b = this.h.b();
        final int n = 0;
        for (int i = 0; i < b; ++i) {
            final on k = k(this.h.e(i));
            if (!k.A()) {
                k.g();
            }
        }
        final oc f = this.f;
        for (int size = f.c.size(), j = 0; j < size; ++j) {
            ((on)f.c.get(j)).g();
        }
        for (int size2 = f.a.size(), l = 0; l < size2; ++l) {
            ((on)f.a.get(l)).g();
        }
        final ArrayList b2 = f.b;
        if (b2 != null) {
            for (int size3 = b2.size(), n2 = n; n2 < size3; ++n2) {
                ((on)f.b.get(n2)).g();
            }
        }
    }
    
    public final void y(final int n, final int n2) {
        final EdgeEffect a = this.A;
        boolean finished;
        final boolean b = finished = false;
        if (a != null) {
            finished = b;
            if (!a.isFinished()) {
                finished = b;
                if (n > 0) {
                    this.A.onRelease();
                    finished = this.A.isFinished();
                }
            }
        }
        final EdgeEffect c = this.C;
        boolean b2 = finished;
        if (c != null) {
            b2 = finished;
            if (!c.isFinished()) {
                b2 = finished;
                if (n < 0) {
                    this.C.onRelease();
                    b2 = (finished | this.C.isFinished());
                }
            }
        }
        final EdgeEffect b3 = this.B;
        boolean b4 = b2;
        if (b3 != null) {
            b4 = b2;
            if (!b3.isFinished()) {
                b4 = b2;
                if (n2 > 0) {
                    this.B.onRelease();
                    b4 = (b2 | this.B.isFinished());
                }
            }
        }
        final EdgeEffect d = this.D;
        int n3 = b4 ? 1 : 0;
        if (d != null) {
            n3 = (b4 ? 1 : 0);
            if (!d.isFinished()) {
                n3 = (b4 ? 1 : 0);
                if (n2 < 0) {
                    this.D.onRelease();
                    n3 = ((b4 | this.D.isFinished()) ? 1 : 0);
                }
            }
        }
        if (n3 != 0) {
            ana.H((View)this);
        }
    }
    
    public final void z() {
        if (!this.t || this.y) {
            this.C();
            return;
        }
        if (!this.S.q()) {
            return;
        }
        if (this.S.p(4) && !this.S.p(11)) {
            this.ak();
            this.Q();
            this.S.l();
            Label_0141: {
                if (!this.u) {
                    for (int a = this.h.a(), i = 0; i < a; ++i) {
                        final on k = k(this.h.d(i));
                        if (k != null) {
                            if (!k.A()) {
                                if (k.y()) {
                                    this.C();
                                    break Label_0141;
                                }
                            }
                        }
                    }
                    this.S.i();
                }
            }
            this.al(true);
            this.R();
            return;
        }
        if (this.S.q()) {
            this.C();
        }
    }
}
