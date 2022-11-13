// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.bottomsheet;

import android.view.View$BaseSavedState;
import android.os.Parcelable;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.MotionEvent;
import android.graphics.drawable.Drawable;
import android.view.View$OnAttachStateChangeListener;
import android.os.Build$VERSION;
import android.util.Log;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import android.text.TextUtils;
import android.view.View;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.util.TypedValue;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Map;
import android.view.VelocityTracker;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior extends aei
{
    public aqi A;
    int B;
    public int C;
    public WeakReference D;
    public WeakReference E;
    public final ArrayList F;
    public int G;
    public boolean H;
    final SparseIntArray I;
    private int J;
    private float K;
    private boolean L;
    private int M;
    private int N;
    private ColorStateList O;
    private boolean P;
    private boolean Q;
    private adym R;
    private boolean S;
    private final adto T;
    private ValueAnimator U;
    private boolean V;
    private int W;
    private boolean X;
    private float Y;
    private int Z;
    public boolean a;
    private VelocityTracker aa;
    private int ab;
    private Map ac;
    private final aqh ad;
    public int b;
    public int c;
    public adyh d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    int q;
    public int r;
    public int s;
    float t;
    public int u;
    float v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;
    
    public BottomSheetBehavior() {
        this.J = 0;
        this.a = true;
        this.e = -1;
        this.f = -1;
        this.T = new adto(this);
        this.t = 0.5f;
        this.v = -1.0f;
        this.y = true;
        this.z = 4;
        this.Y = 0.1f;
        this.F = new ArrayList();
        this.I = new SparseIntArray();
        this.ad = (aqh)new adtk(this);
    }
    
    public BottomSheetBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        this.J = 0;
        this.a = true;
        this.e = -1;
        this.f = -1;
        this.T = new adto(this);
        this.t = 0.5f;
        this.v = -1.0f;
        this.y = true;
        this.z = 4;
        this.Y = 0.1f;
        this.F = new ArrayList();
        this.I = new SparseIntArray();
        this.ad = (aqh)new adtk(this);
        this.N = context.getResources().getDimensionPixelSize(2131168148);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, adtu.a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.O = adds.z(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.R = adym.c(context, set, 2130968832, 2132084672).a();
        }
        if (this.R != null) {
            (this.d = new adyh(this.R)).m(context);
            final ColorStateList o = this.O;
            if (o != null) {
                this.d.o(o);
            }
            else {
                final TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.d.setTint(typedValue.data);
            }
        }
        (this.U = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f })).setDuration(500L);
        this.U.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new adti(this, 0));
        this.v = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.e = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        final TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && peekValue.data == -1) {
            this.G(peekValue.data);
        }
        else {
            this.G(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        this.F(obtainStyledAttributes.getBoolean(8, false));
        this.h = obtainStyledAttributes.getBoolean(13, false);
        this.D(obtainStyledAttributes.getBoolean(6, true));
        this.x = obtainStyledAttributes.getBoolean(12, false);
        this.y = obtainStyledAttributes.getBoolean(4, true);
        this.J = obtainStyledAttributes.getInt(10, 0);
        this.E(obtainStyledAttributes.getFloat(7, 0.5f));
        final TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 != null && peekValue2.type == 16) {
            this.C(peekValue2.data);
        }
        else {
            this.C(obtainStyledAttributes.getDimensionPixelOffset(5, 0));
        }
        this.b = obtainStyledAttributes.getInt(11, 500);
        this.i = obtainStyledAttributes.getBoolean(17, false);
        this.j = obtainStyledAttributes.getBoolean(18, false);
        this.k = obtainStyledAttributes.getBoolean(19, false);
        this.P = obtainStyledAttributes.getBoolean(20, true);
        this.l = obtainStyledAttributes.getBoolean(14, false);
        this.m = obtainStyledAttributes.getBoolean(15, false);
        this.n = obtainStyledAttributes.getBoolean(16, false);
        this.Q = obtainStyledAttributes.getBoolean(23, true);
        obtainStyledAttributes.recycle();
        this.K = (float)ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
    
    private final int N() {
        if (this.L) {
            return Math.min(Math.max(this.M, this.C - this.B * 9 / 16), this.Z) + this.o;
        }
        if (!this.h && !this.i) {
            final int g = this.g;
            if (g > 0) {
                return Math.max(this.c, g + this.N);
            }
        }
        return this.c + this.o;
    }
    
    private final int O(final int n) {
        if (n == 3) {
            return this.w();
        }
        if (n == 4) {
            return this.u;
        }
        if (n != 5) {
            return this.s;
        }
        return this.C;
    }
    
    private final apb P(final int n) {
        return (apb)new adtl(this, n);
    }
    
    private final void Q() {
        final int n = this.N();
        if (this.a) {
            this.u = Math.max(this.C - n, this.r);
            return;
        }
        this.u = this.C - n;
    }
    
    private final void R() {
        this.s = (int)(this.C * (1.0f - this.t));
    }
    
    private final void S(final View view, final aol aol, final int n) {
        anb.av(view, aol, this.P(n));
    }
    
    private final void T() {
        this.G = -1;
        final VelocityTracker aa = this.aa;
        if (aa != null) {
            aa.recycle();
            this.aa = null;
        }
    }
    
    private final void U() {
        final WeakReference d = this.D;
        if (d != null) {
            final View view = (View)d.get();
            if (view != null) {
                anb.K(view, 524288);
                anb.K(view, 262144);
                anb.K(view, 1048576);
                final int value = this.I.get(0, -1);
                if (value != -1) {
                    anb.K(view, value);
                    this.I.delete(0);
                }
                final boolean a = this.a;
                int n = 6;
                Label_0334: {
                    if (!a && this.z != 6) {
                        final SparseIntArray i = this.I;
                        final String string = view.getResources().getString(2132017566);
                        final apb p = this.P(6);
                        final List a2 = anb.A(view);
                    Label_0303:
                        while (true) {
                            for (int j = 0; j < a2.size(); ++j) {
                                if (TextUtils.equals((CharSequence)string, ((aol)a2.get(j)).b())) {
                                    final int a3 = a2.get(j).a();
                                    if (a3 != -1) {
                                        anb.B(view, new aol((Object)null, a3, (CharSequence)string, p, (Class)null));
                                    }
                                    i.put(0, a3);
                                    break Label_0334;
                                }
                            }
                            int a3 = -1;
                            int n2 = 0;
                            while (true) {
                                final int[] a4 = anb.a;
                                final int length = a4.length;
                                if (n2 >= 32 || a3 != -1) {
                                    continue Label_0303;
                                }
                                final int n3 = a4[n2];
                                int k = 0;
                                boolean b = true;
                                while (k < a2.size()) {
                                    b &= (a2.get(k).a() != n3);
                                    ++k;
                                }
                                a3 = n3;
                                if (!b) {
                                    a3 = -1;
                                }
                                ++n2;
                            }
                            break;
                        }
                    }
                }
                if (this.w && this.z != 5) {
                    this.S(view, aol.h, 5);
                }
                final int z = this.z;
                if (z != 3) {
                    if (z == 4) {
                        if (this.a) {
                            n = 3;
                        }
                        this.S(view, aol.f, n);
                        return;
                    }
                    if (z == 6) {
                        this.S(view, aol.g, 4);
                        this.S(view, aol.f, 3);
                    }
                }
                else {
                    if (this.a) {
                        n = 4;
                    }
                    this.S(view, aol.g, n);
                }
            }
        }
    }
    
    private final void V(final int n, final boolean b) {
        if (n != 2) {
            final boolean s = this.z == 3 && (this.Q || this.w() == 0);
            if (this.S != s) {
                if (this.d != null) {
                    this.S = s;
                    final float n2 = 0.0f;
                    float n3 = 0.0f;
                    if (b) {
                        final ValueAnimator u = this.U;
                        if (u != null) {
                            if (!u.isRunning()) {
                                if (!s) {
                                    n3 = 1.0f;
                                }
                                this.U.setFloatValues(new float[] { 1.0f - n3, n3 });
                                this.U.start();
                                return;
                            }
                            this.U.reverse();
                            return;
                        }
                    }
                    final ValueAnimator u2 = this.U;
                    if (u2 != null && u2.isRunning()) {
                        this.U.cancel();
                    }
                    final adyh d = this.d;
                    float n4 = n2;
                    if (!this.S) {
                        n4 = 1.0f;
                    }
                    d.p(n4);
                }
            }
        }
    }
    
    private final void W(final boolean b) {
        final WeakReference d = this.D;
        if (d == null) {
            return;
        }
        final ViewParent parent = ((View)d.get()).getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)parent;
        final int childCount = coordinatorLayout.getChildCount();
        int i;
        final int n = i = 0;
        if (b) {
            if (this.ac != null) {
                return;
            }
            this.ac = new HashMap(childCount);
            i = n;
        }
        while (i < childCount) {
            final View child = coordinatorLayout.getChildAt(i);
            if (child != this.D.get()) {
                if (b) {
                    this.ac.put(child, child.getImportantForAccessibility());
                }
            }
            ++i;
        }
        if (!b) {
            this.ac = null;
        }
    }
    
    private final boolean X() {
        final aqi a = this.A;
        boolean b = false;
        if (a != null) {
            if (!this.y) {
                if (this.z == 1) {
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
    
    private static final int Y(int n, int n2, final int n3, final int n4) {
        n2 = ViewGroup.getChildMeasureSpec(n, n2, n4);
        if (n3 == -1) {
            return n2;
        }
        n = View$MeasureSpec.getMode(n2);
        n2 = View$MeasureSpec.getSize(n2);
        if (n != 1073741824) {
            n = n3;
            if (n2 != 0) {
                n = Math.min(n2, n3);
            }
            return View$MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE);
        }
        return View$MeasureSpec.makeMeasureSpec(Math.min(n2, n3), 1073741824);
    }
    
    public static BottomSheetBehavior y(final View view) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof aek)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        final aei a = ((aek)layoutParams).a;
        if (a instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior)a;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }
    
    public final void A(int i) {
        final View view = (View)this.D.get();
        if (view != null && !this.F.isEmpty()) {
            final int u = this.u;
            float n;
            float n2;
            if (i <= u && u != this.w()) {
                final int u2 = this.u;
                final int w = this.w();
                n = (float)(u2 - i);
                n2 = (float)(u2 - w);
            }
            else {
                final int u3 = this.u;
                final int c = this.C;
                n = (float)(u3 - i);
                n2 = (float)(c - u3);
            }
            final float n3 = n / n2;
            for (i = 0; i < this.F.size(); ++i) {
                this.F.get(i).a(view, n3);
            }
        }
    }
    
    public final void B(final adtm adtm) {
        this.F.remove(adtm);
    }
    
    public final void C(final int q) {
        if (q >= 0) {
            this.q = q;
            this.V(this.z, true);
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }
    
    public final void D(final boolean a) {
        if (this.a == a) {
            return;
        }
        this.a = a;
        if (this.D != null) {
            this.Q();
        }
        int z;
        if (this.a && this.z == 6) {
            z = 3;
        }
        else {
            z = this.z;
        }
        this.I(z);
        this.V(this.z, true);
        this.U();
    }
    
    public final void E(final float t) {
        if (t > 0.0f && t < 1.0f) {
            this.t = t;
            if (this.D != null) {
                this.R();
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
    
    public final void F(final boolean w) {
        if (this.w != w) {
            this.w = w;
            if (!w && this.z == 5) {
                this.H(4);
            }
            this.U();
        }
    }
    
    public final void G(final int n) {
        Label_0053: {
            if (n == -1) {
                if (!this.L) {
                    this.L = true;
                    break Label_0053;
                }
            }
            else if (this.L || this.c != n) {
                this.L = false;
                this.c = Math.max(0, n);
                break Label_0053;
            }
            return;
        }
        this.M();
    }
    
    public final void H(final int n) {
        if (!this.w && n == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: 5");
            return;
        }
        int n2;
        if (n == 6 && this.a && this.O(6) <= this.r) {
            n2 = 3;
        }
        else {
            n2 = n;
        }
        final WeakReference d = this.D;
        if (d == null || d.get() == null) {
            this.I(n);
            return;
        }
        final View view = (View)this.D.get();
        final wsx wsx = new wsx(this, view, n2, 8);
        final ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && anb.am(view)) {
            view.post((Runnable)wsx);
            return;
        }
        ((Runnable)wsx).run();
    }
    
    public final void I(int z) {
        if (this.z == z) {
            return;
        }
        this.z = z;
        final int n = 4;
        int n2 = z;
        if (z != 4 && (n2 = z) != 3 && (n2 = z) != 6) {
            n2 = z;
            if (this.w && (n2 = z) == 5) {
                n2 = 5;
            }
        }
        final WeakReference d = this.D;
        if (d == null) {
            return;
        }
        final View view = (View)d.get();
        if (view == null) {
            return;
        }
        final int n3 = 0;
        Label_0133: {
            if (n2 == 3) {
                this.W(true);
                z = n2;
            }
            else {
                if (n2 != 6 && n2 != 5) {
                    if ((z = n2) != 4) {
                        break Label_0133;
                    }
                    z = n;
                }
                else {
                    z = n2;
                }
                this.W(false);
            }
        }
        this.V(z, true);
        for (int i = n3; i < this.F.size(); ++i) {
            ((adtm)this.F.get(i)).b(view, z);
        }
        this.U();
    }
    
    public final void J(final View view, final int n, final boolean b) {
        final int o = this.O(n);
        final aqi a = this.A;
        Label_0077: {
            if (a != null) {
                if (b) {
                    if (!a.j(view.getLeft(), o)) {
                        break Label_0077;
                    }
                }
                else if (!a.l(view, view.getLeft(), o)) {
                    break Label_0077;
                }
                this.I(2);
                this.V(n, true);
                this.T.a(n);
                return;
            }
        }
        this.I(n);
    }
    
    public final boolean K() {
        return this.w;
    }
    
    public final boolean L(final View view, final float n) {
        return this.x || (view.getTop() >= this.u && Math.abs(view.getTop() + n * this.Y - this.u) / this.N() > 0.5f);
    }
    
    public final void M() {
        if (this.D != null) {
            this.Q();
            if (this.z == 4) {
                final View view = (View)this.D.get();
                if (view != null) {
                    view.requestLayout();
                }
            }
        }
    }
    
    public final boolean h(final CoordinatorLayout coordinatorLayout, final View view, int i) {
        if (anb.ai((View)coordinatorLayout) && !anb.ai(view)) {
            view.setFitsSystemWindows(true);
        }
        final WeakReference d = this.D;
        final int n = 0;
        if (d == null) {
            this.M = coordinatorLayout.getResources().getDimensionPixelSize(2131166257);
            boolean b2;
            final boolean b = b2 = (Build$VERSION.SDK_INT >= 29 && !this.h && !this.L);
            Label_0225: {
                if (!this.i) {
                    b2 = b;
                    if (!this.j) {
                        b2 = b;
                        if (!this.k) {
                            b2 = b;
                            if (!this.l) {
                                b2 = b;
                                if (!this.m) {
                                    b2 = b;
                                    if (!this.n) {
                                        if (!b) {
                                            break Label_0225;
                                        }
                                        b2 = true;
                                    }
                                }
                            }
                        }
                    }
                }
                anb.Z(view, (alw)new adwj(new adtj(this, b2), new adwl(anb.j(view), view.getPaddingTop(), anb.i(view), view.getPaddingBottom()), 0));
                if (anb.am(view)) {
                    anb.L(view);
                }
                else {
                    view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new adwk());
                }
            }
            this.D = new WeakReference((T)view);
            final adyh d2 = this.d;
            if (d2 != null) {
                anb.Q(view, (Drawable)d2);
                final adyh d3 = this.d;
                float n2;
                if ((n2 = this.v) == -1.0f) {
                    n2 = anb.a(view);
                }
                d3.n(n2);
            }
            else {
                final ColorStateList o = this.O;
                if (o != null) {
                    anb.R(view, o);
                }
            }
            this.U();
            if (anb.d(view) == 0) {
                anb.X(view, 1);
            }
        }
        if (this.A == null) {
            this.A = aqi.b((ViewGroup)coordinatorLayout, this.ad);
        }
        final int top = view.getTop();
        coordinatorLayout.k(view, i);
        this.B = coordinatorLayout.getWidth();
        this.C = coordinatorLayout.getHeight();
        final int height = view.getHeight();
        this.Z = height;
        final int c = this.C;
        final int p3 = this.p;
        i = height;
        if (c - height < p3) {
            if (this.P) {
                this.Z = c;
                i = c;
            }
            else {
                i = c - p3;
                this.Z = i;
            }
        }
        this.r = Math.max(0, c - i);
        this.R();
        this.Q();
        i = this.z;
        if (i == 3) {
            anb.F(view, this.w());
        }
        else if (i == 6) {
            anb.F(view, this.s);
        }
        else if (this.w && i == 5) {
            anb.F(view, this.C);
        }
        else if (i == 4) {
            anb.F(view, this.u);
        }
        else if (i == 1 || i == 2) {
            anb.F(view, top - view.getTop());
        }
        this.V(this.z, false);
        this.E = new WeakReference((T)this.x(view));
        for (i = n; i < this.F.size(); ++i) {
            this.F.get(i).p(view);
        }
        return true;
    }
    
    public boolean j(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final float n, final float n2) {
        final WeakReference e = this.E;
        boolean b2;
        final boolean b = b2 = false;
        if (e != null) {
            b2 = b;
            if (view2 == e.get()) {
                b2 = b;
                if (this.z != 3) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public boolean l(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final View view3, final int n, final int n2) {
        boolean b = false;
        this.W = 0;
        this.X = false;
        if ((n & 0x2) != 0x0) {
            b = true;
        }
        return b;
    }
    
    public boolean m(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        final int actionMasked = motionEvent.getActionMasked();
        if (this.z == 1 && actionMasked == 0) {
            return true;
        }
        if (this.X()) {
            this.A.f(motionEvent);
        }
        if (actionMasked == 0) {
            this.T();
        }
        if (this.aa == null) {
            this.aa = VelocityTracker.obtain();
        }
        this.aa.addMovement(motionEvent);
        if (this.X() && actionMasked == 2 && !this.V) {
            final float abs = Math.abs(this.ab - motionEvent.getY());
            final aqi a = this.A;
            if (abs > a.b) {
                a.e(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.V;
    }
    
    public final boolean p(final CoordinatorLayout coordinatorLayout, final View view, final int n, final int n2, final int n3) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        view.measure(Y(n, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin + n2, this.e, viewGroup$MarginLayoutParams.width), Y(n3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin, this.f, viewGroup$MarginLayoutParams.height));
        return true;
    }
    
    public final void q(final View view, final Parcelable parcelable) {
        final BottomSheetBehavior$SavedState bottomSheetBehavior$SavedState = (BottomSheetBehavior$SavedState)parcelable;
        final int j = this.J;
        if (j != 0) {
            if (j == -1 || (j & 0x1) == 0x1) {
                this.c = bottomSheetBehavior$SavedState.b;
            }
            if (j == -1 || (j & 0x2) == 0x2) {
                this.a = bottomSheetBehavior$SavedState.e;
            }
            if (j == -1 || (j & 0x4) == 0x4) {
                this.w = bottomSheetBehavior$SavedState.f;
            }
            if (j == -1 || (j & 0x8) == 0x8) {
                this.x = bottomSheetBehavior$SavedState.g;
            }
        }
        final int a = bottomSheetBehavior$SavedState.a;
        if (a != 1 && a != 2) {
            this.z = a;
            return;
        }
        this.z = 4;
    }
    
    public void qH(final CoordinatorLayout coordinatorLayout, final View view, final View view2, int top) {
        final int top2 = view.getTop();
        final int w = this.w();
        top = 3;
        if (top2 == w) {
            this.I(3);
            return;
        }
        final WeakReference e = this.E;
        if (e != null && view2 == e.get()) {
            if (this.X) {
                Label_0298: {
                    Label_0083: {
                        if (this.W <= 0) {
                            if (this.w) {
                                final VelocityTracker aa = this.aa;
                                float yVelocity;
                                if (aa == null) {
                                    yVelocity = 0.0f;
                                }
                                else {
                                    aa.computeCurrentVelocity(1000, this.K);
                                    yVelocity = this.aa.getYVelocity(this.G);
                                }
                                if (this.L(view, yVelocity)) {
                                    top = 5;
                                    break Label_0298;
                                }
                            }
                            if (this.W == 0) {
                                final int top3 = view.getTop();
                                if (this.a) {
                                    if (Math.abs(top3 - this.r) < Math.abs(top3 - this.u)) {
                                        break Label_0298;
                                    }
                                }
                                else {
                                    final int s = this.s;
                                    if (top3 < s) {
                                        if (top3 < Math.abs(top3 - this.u)) {
                                            break Label_0298;
                                        }
                                        break Label_0083;
                                    }
                                    else if (Math.abs(top3 - s) < Math.abs(top3 - this.u)) {
                                        break Label_0083;
                                    }
                                }
                            }
                            else if (!this.a) {
                                top = view.getTop();
                                if (Math.abs(top - this.s) < Math.abs(top - this.u)) {
                                    break Label_0083;
                                }
                            }
                            top = 4;
                            break Label_0298;
                        }
                        if (this.a) {
                            break Label_0298;
                        }
                        if (view.getTop() <= this.s) {
                            break Label_0298;
                        }
                    }
                    top = 6;
                }
                this.J(view, top, false);
                this.X = false;
            }
        }
    }
    
    public final void qI() {
        this.D = null;
        this.A = null;
    }
    
    public boolean qK(final CoordinatorLayout coordinatorLayout, View view, final MotionEvent motionEvent) {
        if (view.isShown() && this.y) {
            int actionMasked;
            if ((actionMasked = motionEvent.getActionMasked()) == 0) {
                this.T();
                actionMasked = 0;
            }
            if (this.aa == null) {
                this.aa = VelocityTracker.obtain();
            }
            this.aa.addMovement(motionEvent);
            final View view2 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.H = false;
                    this.G = -1;
                    if (this.V) {
                        return this.V = false;
                    }
                }
            }
            else {
                final int n = (int)motionEvent.getX();
                this.ab = (int)motionEvent.getY();
                if (this.z != 2) {
                    final WeakReference e = this.E;
                    View view3;
                    if (e != null) {
                        view3 = (View)e.get();
                    }
                    else {
                        view3 = null;
                    }
                    if (view3 != null && coordinatorLayout.l(view3, n, this.ab)) {
                        this.G = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.H = true;
                    }
                }
                this.V = (this.G == -1 && !coordinatorLayout.l(view, n, this.ab));
            }
            if (!this.V) {
                final aqi a = this.A;
                if (a != null) {
                    if (a.k(motionEvent)) {
                        return true;
                    }
                }
            }
            final WeakReference e2 = this.E;
            view = view2;
            if (e2 != null) {
                view = (View)e2.get();
            }
            return actionMasked == 2 && view != null && !this.V && this.z != 1 && !coordinatorLayout.l(view, (int)motionEvent.getX(), (int)motionEvent.getY()) && this.A != null && Math.abs(this.ab - motionEvent.getY()) > this.A.b;
        }
        this.V = true;
        return false;
    }
    
    public final Parcelable r(final View view) {
        return (Parcelable)new BottomSheetBehavior$SavedState((Parcelable)View$BaseSavedState.EMPTY_STATE, this);
    }
    
    public void ss(final CoordinatorLayout coordinatorLayout, final View view, final View view2, int n, final int w, final int[] array, int u) {
        if (u == 1) {
            return;
        }
        final WeakReference e = this.E;
        View view3;
        if (e != null) {
            view3 = (View)e.get();
        }
        else {
            view3 = null;
        }
        if (view2 == view3) {
            final int top = view.getTop();
            n = top - w;
            if (w > 0) {
                if (n < this.w()) {
                    n = top - this.w();
                    anb.F(view, -(array[1] = n));
                    this.I(3);
                }
                else {
                    if (!this.y) {
                        return;
                    }
                    anb.F(view, -(array[1] = w));
                    this.I(1);
                }
            }
            else if (w < 0 && !view2.canScrollVertically(-1)) {
                u = this.u;
                if (n > u && !this.K()) {
                    n = top - u;
                    anb.F(view, -(array[1] = n));
                    this.I(4);
                }
                else {
                    if (!this.y) {
                        return;
                    }
                    anb.F(view, -(array[1] = w));
                    this.I(1);
                }
            }
            this.A(view.getTop());
            this.W = w;
            this.X = true;
        }
    }
    
    public final void st(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
    }
    
    public final void su(final aek aek) {
        this.D = null;
        this.A = null;
    }
    
    public final int w() {
        int n;
        if (this.a) {
            n = this.r;
        }
        else {
            final int q = this.q;
            int p;
            if (this.P) {
                p = 0;
            }
            else {
                p = this.p;
            }
            n = Math.max(q, p);
        }
        return n;
    }
    
    final View x(final View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (anb.aq(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                final View x = this.x(viewGroup.getChildAt(i));
                if (x != null) {
                    return x;
                }
            }
        }
        return null;
    }
    
    public final void z(final adtm adtm) {
        if (!this.F.contains(adtm)) {
            this.F.add(adtm);
        }
    }
}
