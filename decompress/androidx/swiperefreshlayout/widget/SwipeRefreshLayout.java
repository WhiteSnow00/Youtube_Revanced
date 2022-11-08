// 
// Decompiled by Procyon v0.6.0
// 

package androidx.swiperefreshlayout.widget;

import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.util.Log;
import android.widget.ListView;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.ViewGroup;

public class SwipeRefreshLayout extends ViewGroup implements als, alr, alp, alt
{
    private static final String k = "SwipeRefreshLayout";
    private static final int[] l;
    private int A;
    private final DecelerateInterpolator B;
    private int C;
    private Animation D;
    private Animation E;
    private Animation F;
    private Animation G;
    private int H;
    private Animation$AnimationListener I;
    private final Animation J;
    private final Animation K;
    public chq a;
    public boolean b;
    public int c;
    public chi d;
    public int e;
    public int f;
    public int g;
    public chk h;
    public boolean i;
    public boolean j;
    private View m;
    private int n;
    private float o;
    private float p;
    private final alu q;
    private final alq r;
    private final int[] s;
    private final int[] t;
    private final int[] u;
    private boolean v;
    private int w;
    private float x;
    private float y;
    private boolean z;
    
    static {
        l = new int[] { 16842766 };
    }
    
    public SwipeRefreshLayout(final Context context) {
        this(context, null);
    }
    
    public SwipeRefreshLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = false;
        this.o = -1.0f;
        this.s = new int[2];
        this.t = new int[2];
        this.u = new int[2];
        this.A = -1;
        this.C = -1;
        this.I = (Animation$AnimationListener)new cbh(this, 2);
        this.J = (Animation)new cho(this);
        this.K = (Animation)new chp(this);
        this.n = ViewConfiguration.get(context).getScaledTouchSlop();
        this.w = this.getResources().getInteger(17694721);
        this.setWillNotDraw(false);
        this.B = new DecelerateInterpolator(2.0f);
        final DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        this.H = (int)(displayMetrics.density * 40.0f);
        this.d = new chi(this.getContext());
        final chk h = new chk(this.getContext());
        this.h = h;
        final chj a = h.a;
        final float density = h.b.getDisplayMetrics().density;
        a.e(2.5f * density);
        a.p = 7.5f * density;
        a.h();
        a.q = (int)(10.0f * density);
        a.r = (int)(density * 5.0f);
        h.invalidateSelf();
        this.d.setImageDrawable((Drawable)this.h);
        this.d.setVisibility(8);
        this.addView((View)this.d);
        this.setChildrenDrawingOrderEnabled(true);
        final int g = (int)(displayMetrics.density * 64.0f);
        this.g = g;
        this.o = (float)g;
        this.q = new alu();
        this.r = new alq((View)this);
        this.setNestedScrollingEnabled(true);
        final int n = -this.H;
        this.c = n;
        this.f = n;
        this.lz(1.0f);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, SwipeRefreshLayout.l);
        this.setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
    
    private final Animation o(final int n, final int n2) {
        final chn chn = new chn(this, n, n2);
        ((Animation)chn).setDuration(300L);
        final chi d = this.d;
        d.a = null;
        d.clearAnimation();
        this.d.startAnimation((Animation)chn);
        return (Animation)chn;
    }
    
    private final void p() {
        if (this.m == null) {
            for (int i = 0; i < this.getChildCount(); ++i) {
                final View child = this.getChildAt(i);
                if (!child.equals(this.d)) {
                    this.m = child;
                    return;
                }
            }
        }
    }
    
    private final void q(final float n) {
        if (n > this.o) {
            this.u(true, true);
            return;
        }
        this.b = false;
        this.h.d(0.0f);
        final cbh a = new cbh(this, 3);
        this.e = this.c;
        this.K.reset();
        this.K.setDuration(200L);
        this.K.setInterpolator((Interpolator)this.B);
        final chi d = this.d;
        d.a = (Animation$AnimationListener)a;
        d.clearAnimation();
        this.d.startAnimation(this.K);
        this.h.b(false);
    }
    
    private final void r(final float n) {
        this.h.b(true);
        final float min = Math.min(1.0f, Math.abs(n / this.o));
        final double n2 = min;
        Double.isNaN(n2);
        final float n3 = (float)Math.max(n2 - 0.4, 0.0) * 5.0f / 3.0f;
        final float abs = Math.abs(n);
        final float o = this.o;
        final float n4 = (float)this.g;
        final double n5 = Math.max(0.0f, Math.min(abs - o, n4 + n4) / n4) / 4.0f;
        final double pow = Math.pow(n5, 2.0);
        Double.isNaN(n5);
        final float n6 = (float)(n5 - pow);
        final float n7 = n6 + n6;
        final float n8 = n4 * n7;
        final int f = this.f;
        final int n9 = (int)(n4 * min + (n8 + n8));
        if (this.d.getVisibility() != 0) {
            this.d.setVisibility(0);
        }
        this.d.setScaleX(1.0f);
        this.d.setScaleY(1.0f);
        if (n < this.o) {
            if (this.h.getAlpha() > 76 && !x(this.F)) {
                this.F = this.o(this.h.getAlpha(), 76);
            }
        }
        else if (this.h.getAlpha() < 255 && !x(this.G)) {
            this.G = this.o(this.h.getAlpha(), 255);
        }
        this.h.d(Math.min(0.8f, n3 * 0.8f));
        this.h.c(Math.min(1.0f, n3));
        final chk h = this.h;
        h.a.g = (n3 * 0.4f - 0.25f + (n7 + n7)) * 0.5f;
        h.invalidateSelf();
        this.l(f + n9 - this.c);
    }
    
    private final void s(final MotionEvent motionEvent) {
        final int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.A = motionEvent.getPointerId(n);
        }
    }
    
    private final void u(final boolean b, final boolean i) {
        if (this.b != b) {
            this.i = i;
            this.p();
            this.b = b;
            if (b) {
                final int c = this.c;
                final Animation$AnimationListener j = this.I;
                this.e = c;
                this.J.reset();
                this.J.setDuration(200L);
                this.J.setInterpolator((Interpolator)this.B);
                if (j != null) {
                    this.d.a = j;
                }
                this.d.clearAnimation();
                this.d.startAnimation(this.J);
                return;
            }
            this.m(this.I);
        }
    }
    
    private final void v(final boolean b, final boolean i) {
        boolean b2 = b;
        if (b) {
            if (!this.b) {
                this.b = true;
                this.l(this.g + this.f - this.c);
                this.i = i;
                final Animation$AnimationListener j = this.I;
                this.d.setVisibility(0);
                this.h.setAlpha(255);
                (this.D = (Animation)new chl(this)).setDuration((long)this.w);
                if (j != null) {
                    this.d.a = j;
                }
                this.d.clearAnimation();
                this.d.startAnimation(this.D);
                return;
            }
            b2 = true;
        }
        this.u(b2, false);
    }
    
    private final void w(final float n) {
        final float y = this.y;
        final float n2 = (float)this.n;
        if (n - y > n2 && !this.z) {
            this.x = y + n2;
            this.z = true;
            this.h.setAlpha(76);
        }
    }
    
    private static final boolean x(final Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }
    
    public final void b() {
        this.d.clearAnimation();
        this.h.stop();
        this.d.setVisibility(8);
        this.d.getBackground().setAlpha(255);
        this.h.setAlpha(255);
        this.l(this.f - this.c);
        this.c = this.d.getTop();
    }
    
    public final void c(final float n) {
        this.d.setScaleX(n);
        this.d.setScaleY(n);
    }
    
    public final void d(final View view, final int n, final int n2, final int[] array, final int n3) {
        if (n3 == 0) {
            this.onNestedPreScroll(view, n, n2, array);
        }
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 285) {
            this.v(true, true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }
    
    public final boolean dispatchNestedFling(final float n, final float n2, final boolean b) {
        return this.r.d(n, n2, b);
    }
    
    public final boolean dispatchNestedPreFling(final float n, final float n2) {
        return this.r.e(n, n2);
    }
    
    public final boolean dispatchNestedPreScroll(final int n, final int n2, final int[] array, final int[] array2) {
        return this.r.f(n, n2, array, array2);
    }
    
    public final boolean dispatchNestedScroll(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.r.h(n, n2, n3, n4, array);
    }
    
    public final void e(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        this.f(view, n, n2, n3, n4, n5, this.u);
    }
    
    public final void f(final View view, int n, int n2, final int n3, final int n4, int n5, final int[] array) {
        if (n5 != 0) {
            return;
        }
        n5 = array[1];
        this.r.i(n, n2, n3, n4, this.t, 0, array);
        n = n4 - (array[1] - n5);
        if (n == 0) {
            n = this.t[1] + n4;
            n2 = 0;
        }
        else {
            n2 = n;
        }
        if (n < 0 && !this.n()) {
            this.r(this.p += Math.abs(n));
            array[1] += n2;
        }
    }
    
    public final void g(final View view, final View view2, final int n, final int n2) {
        if (n2 == 0) {
            this.onNestedScrollAccepted(view, view2, n);
        }
    }
    
    protected final int getChildDrawingOrder(int n, final int n2) {
        final int c = this.C;
        if (c < 0) {
            return n2;
        }
        if (n2 == n - 1) {
            return c;
        }
        if ((n = n2) >= c) {
            n = n2 + 1;
        }
        return n;
    }
    
    public final int getNestedScrollAxes() {
        return this.q.a();
    }
    
    public final void h(final View view, final int n) {
        if (n == 0) {
            this.onStopNestedScroll(view);
        }
    }
    
    public final boolean hasNestedScrollingParent() {
        return this.r.j();
    }
    
    public final void i(final int... array) {
        this.p();
        final chk h = this.h;
        h.a.c(array);
        h.a.h();
        h.invalidateSelf();
    }
    
    public final boolean isNestedScrollingEnabled() {
        return this.r.a;
    }
    
    public final void j(final int backgroundColor) {
        this.d.setBackgroundColor(backgroundColor);
    }
    
    public final void k(final boolean b) {
        this.v(b, false);
    }
    
    public final void l(final int n) {
        this.d.bringToFront();
        ana.F((View)this.d, n);
        this.c = this.d.getTop();
    }
    
    public final void lz(final float n) {
        final int e = this.e;
        this.l(e + (int)((this.f - e) * n) - this.d.getTop());
    }
    
    public final void m(final Animation$AnimationListener a) {
        (this.E = (Animation)new chm(this)).setDuration(150L);
        final chi d = this.d;
        d.a = a;
        d.clearAnimation();
        this.d.startAnimation(this.E);
    }
    
    public final boolean n() {
        final View m = this.m;
        if (m instanceof ListView) {
            return apk.b((ListView)m, -1);
        }
        return m.canScrollVertically(-1);
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b();
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        this.p();
        final int actionMasked = motionEvent.getActionMasked();
        if (this.isEnabled() && !this.n() && !this.b && !this.v) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                return this.z;
                            }
                            this.s(motionEvent);
                            return this.z;
                        }
                    }
                    else {
                        final int a = this.A;
                        if (a == -1) {
                            Log.e(SwipeRefreshLayout.k, "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        final int pointerIndex = motionEvent.findPointerIndex(a);
                        if (pointerIndex < 0) {
                            return false;
                        }
                        this.w(motionEvent.getY(pointerIndex));
                        return this.z;
                    }
                }
                this.z = false;
                this.A = -1;
            }
            else {
                this.l(this.f - this.d.getTop());
                final int pointerId = motionEvent.getPointerId(0);
                this.A = pointerId;
                this.z = false;
                final int pointerIndex2 = motionEvent.findPointerIndex(pointerId);
                if (pointerIndex2 < 0) {
                    return false;
                }
                this.y = motionEvent.getY(pointerIndex2);
            }
            return this.z;
        }
        return false;
    }
    
    protected void onLayout(final boolean b, int n, int measuredWidth, int n2, int n3) {
        measuredWidth = this.getMeasuredWidth();
        n2 = this.getMeasuredHeight();
        if (this.getChildCount() == 0) {
            return;
        }
        if (this.m == null) {
            this.p();
        }
        final View m = this.m;
        if (m == null) {
            return;
        }
        n = this.getPaddingLeft();
        n3 = this.getPaddingTop();
        m.layout(n, n3, measuredWidth - this.getPaddingLeft() - this.getPaddingRight() + n, n2 - this.getPaddingTop() - this.getPaddingBottom() + n3);
        n2 = this.d.getMeasuredWidth();
        n = this.d.getMeasuredHeight();
        final chi d = this.d;
        measuredWidth /= 2;
        n2 /= 2;
        n3 = this.c;
        d.layout(measuredWidth - n2, n3, measuredWidth + n2, n + n3);
    }
    
    public void onMeasure(int i, final int n) {
        super.onMeasure(i, n);
        if (this.m == null) {
            this.p();
        }
        final View m = this.m;
        if (m == null) {
            return;
        }
        m.measure(View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), 1073741824), View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), 1073741824));
        this.d.measure(View$MeasureSpec.makeMeasureSpec(this.H, 1073741824), View$MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.C = -1;
        for (i = 0; i < this.getChildCount(); ++i) {
            if (this.getChildAt(i) == this.d) {
                this.C = i;
                return;
            }
        }
    }
    
    public final boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        return this.dispatchNestedFling(n, n2, b);
    }
    
    public final boolean onNestedPreFling(final View view, final float n, final float n2) {
        return this.dispatchNestedPreFling(n, n2);
    }
    
    public final void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
        if (n2 > 0) {
            final float p4 = this.p;
            float p5 = 0.0f;
            if (p4 > 0.0f) {
                final float n3 = (float)n2;
                if (n3 > p4) {
                    array[1] = (int)p4;
                    this.p = 0.0f;
                }
                else {
                    p5 = p4 - n3;
                    this.p = p5;
                    array[1] = n2;
                }
                this.r(p5);
            }
        }
        final int[] s = this.s;
        if (this.dispatchNestedPreScroll(n - array[0], n2 - array[1], s, null)) {
            array[0] += s[0];
            array[1] += s[1];
        }
    }
    
    public final void onNestedScroll(final View view, final int n, final int n2, final int n3, final int n4) {
        this.f(view, n, n2, n3, n4, 0, this.u);
    }
    
    public final void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.q.d(n);
        this.startNestedScroll(n & 0x2);
        this.p = 0.0f;
        this.v = true;
    }
    
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        final SwipeRefreshLayout$SavedState swipeRefreshLayout$SavedState = (SwipeRefreshLayout$SavedState)parcelable;
        super.onRestoreInstanceState(swipeRefreshLayout$SavedState.getSuperState());
        this.k(swipeRefreshLayout$SavedState.a);
    }
    
    protected final Parcelable onSaveInstanceState() {
        return (Parcelable)new SwipeRefreshLayout$SavedState(super.onSaveInstanceState(), this.b);
    }
    
    public final boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return this.isEnabled() && !this.b && (n & 0x2) != 0x0;
    }
    
    public final void onStopNestedScroll(final View view) {
        this.q.c(0);
        this.v = false;
        final float p = this.p;
        if (p > 0.0f) {
            this.q(p);
            this.p = 0.0f;
        }
        else {
            this.post((Runnable)new cdi(this, 7));
        }
        this.stopNestedScroll();
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (this.isEnabled() && !this.n() && !this.b && !this.v) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            return false;
                        }
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                this.s(motionEvent);
                            }
                        }
                        else {
                            final int actionIndex = motionEvent.getActionIndex();
                            if (actionIndex < 0) {
                                Log.e(SwipeRefreshLayout.k, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            this.A = motionEvent.getPointerId(actionIndex);
                        }
                    }
                    else {
                        final int pointerIndex = motionEvent.findPointerIndex(this.A);
                        if (pointerIndex < 0) {
                            Log.e(SwipeRefreshLayout.k, "Got ACTION_MOVE event but have an invalid active pointer id.");
                            return false;
                        }
                        final float y = motionEvent.getY(pointerIndex);
                        this.w(y);
                        if (this.z) {
                            final float n = (y - this.x) * 0.5f;
                            if (n <= 0.0f) {
                                return false;
                            }
                            this.getParent().requestDisallowInterceptTouchEvent(true);
                            this.r(n);
                        }
                    }
                }
                else {
                    final int pointerIndex2 = motionEvent.findPointerIndex(this.A);
                    if (pointerIndex2 < 0) {
                        Log.e(SwipeRefreshLayout.k, "Got ACTION_UP event but don't have an active pointer id.");
                        return false;
                    }
                    if (this.z) {
                        final float y2 = motionEvent.getY(pointerIndex2);
                        final float x = this.x;
                        this.z = false;
                        this.q((y2 - x) * 0.5f);
                    }
                    this.A = -1;
                    return false;
                }
            }
            else {
                this.A = motionEvent.getPointerId(0);
                this.z = false;
            }
            return true;
        }
        return false;
    }
    
    public final void setEnabled(final boolean enabled) {
        super.setEnabled(enabled);
        if (!enabled) {
            this.b();
        }
    }
    
    public final void setNestedScrollingEnabled(final boolean b) {
        this.r.a(b);
    }
    
    public final boolean startNestedScroll(final int n) {
        return this.r.l(n);
    }
    
    public final void stopNestedScroll() {
        this.r.b();
    }
    
    public final boolean t(final View view, final View view2, final int n, final int n2) {
        return n2 == 0 && this.onStartNestedScroll(view, view2, n);
    }
}
