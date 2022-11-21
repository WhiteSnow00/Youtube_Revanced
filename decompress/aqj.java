import java.util.Arrays;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.OverScroller;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqj
{
    private static final Interpolator l;
    public int a;
    public int b;
    public float[] c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float g;
    public int h;
    public final int i;
    public int j;
    public View k;
    private int m;
    private int[] n;
    private int[] o;
    private int[] p;
    private int q;
    private VelocityTracker r;
    private final float s;
    private final OverScroller t;
    private final aqi u;
    private boolean v;
    private final ViewGroup w;
    private final Runnable x;
    
    static {
        l = (Interpolator)new qf(3);
    }
    
    private aqj(final Context context, final ViewGroup w, final aqi u) {
        this.m = -1;
        this.x = (Runnable)new uw(this, 18);
        if (u != null) {
            this.w = w;
            this.u = u;
            final ViewConfiguration value = ViewConfiguration.get(context);
            final int n = (int)(context.getResources().getDisplayMetrics().density * 20.0f + 0.5f);
            this.i = n;
            this.h = n;
            this.b = value.getScaledTouchSlop();
            this.s = (float)value.getScaledMaximumFlingVelocity();
            this.g = (float)value.getScaledMinimumFlingVelocity();
            this.t = new OverScroller(context, aqj.l);
            return;
        }
        throw new NullPointerException("Callback may not be null");
    }
    
    private static final int A(final int n, int n2, final int n3) {
        final int abs = Math.abs(n);
        if (abs < n2) {
            return 0;
        }
        n2 = n;
        if (abs > n3) {
            if (n > 0) {
                return n3;
            }
            n2 = -n3;
        }
        return n2;
    }
    
    public static aqj b(final ViewGroup viewGroup, final aqi aqi) {
        return new aqj(viewGroup.getContext(), viewGroup, aqi);
    }
    
    public static aqj c(final ViewGroup viewGroup, final float n, final aqi aqi) {
        final aqj b = b(viewGroup, aqi);
        b.b *= (int)(1.0f / n);
        return b;
    }
    
    private final int o(int n, int abs, final int n2) {
        if (n == 0) {
            return 0;
        }
        final int width = this.w.getWidth();
        final int n3 = width / 2;
        final float n4 = (float)Math.sin((Math.min(1.0f, Math.abs(n) / (float)width) - 0.5f) * 0.47123894f);
        abs = Math.abs(abs);
        if (abs > 0) {
            final float n5 = (float)n3;
            n = Math.round(Math.abs((n5 + n4 * n5) / abs) * 1000.0f) * 4;
        }
        else {
            n = (int)((Math.abs(n) / (float)n2 + 1.0f) * 256.0f);
        }
        return Math.min(n, 600);
    }
    
    private final void p(final int n) {
        final float[] c = this.c;
        if (c != null) {
            if (this.h(n)) {
                c[n] = 0.0f;
                this.d[n] = 0.0f;
                this.e[n] = 0.0f;
                this.f[n] = 0.0f;
                this.n[n] = 0;
                this.o[n] = 0;
                this.p[n] = 0;
                this.q &= ~(1 << n);
            }
        }
    }
    
    private final void q(final float n, final float n2) {
        this.v = true;
        this.u.f(this.k, n, n2);
        this.v = false;
        if (this.a == 1) {
            this.g(0);
        }
    }
    
    private final void r() {
        this.r.computeCurrentVelocity(1000, this.s);
        this.q(z(this.r.getXVelocity(this.m), this.g, this.s), z(this.r.getYVelocity(this.m), this.g, this.s));
    }
    
    private final void s(final float n, final float n2, final int n3) {
        int v;
        final boolean b = (v = (this.v(n, n2, n3, 1) ? 1 : 0)) != 0;
        if (this.v(n2, n, n3, 4)) {
            v = ((b ? 1 : 0) | 0x4);
        }
        int n4 = v;
        if (this.v(n, n2, n3, 2)) {
            n4 = (v | 0x2);
        }
        int n5 = n4;
        if (this.v(n2, n, n3, 8)) {
            n5 = (n4 | 0x8);
        }
        if (n5 != 0) {
            final int[] o = this.o;
            o[n3] |= n5;
            this.u.c(n5, n3);
        }
    }
    
    private final void t(final float n, final float n2, final int n3) {
        final float[] c = this.c;
        boolean b = false;
        if (c == null || c.length <= n3) {
            final int n4 = n3 + 1;
            final float[] c2 = new float[n4];
            final float[] d = new float[n4];
            final float[] e = new float[n4];
            final float[] f = new float[n4];
            final int[] n5 = new int[n4];
            final int[] o = new int[n4];
            final int[] p3 = new int[n4];
            if (c != null) {
                System.arraycopy(c, 0, c2, 0, c.length);
                final float[] d2 = this.d;
                System.arraycopy(d2, 0, d, 0, d2.length);
                final float[] e2 = this.e;
                System.arraycopy(e2, 0, e, 0, e2.length);
                final float[] f2 = this.f;
                System.arraycopy(f2, 0, f, 0, f2.length);
                final int[] n6 = this.n;
                System.arraycopy(n6, 0, n5, 0, n6.length);
                final int[] o2 = this.o;
                System.arraycopy(o2, 0, o, 0, o2.length);
                final int[] p4 = this.p;
                System.arraycopy(p4, 0, p3, 0, p4.length);
            }
            this.c = c2;
            this.d = d;
            this.e = e;
            this.f = f;
            this.n = n5;
            this.o = o;
            this.p = p3;
        }
        this.c[n3] = (this.e[n3] = n);
        this.d[n3] = (this.f[n3] = n2);
        final int[] n7 = this.n;
        final int n8 = (int)n;
        final int n9 = (int)n2;
        if (n8 < this.w.getLeft() + this.h) {
            b = true;
        }
        int n10 = b ? 1 : 0;
        if (n9 < this.w.getTop() + this.h) {
            n10 = ((b ? 1 : 0) | 0x4);
        }
        int n11 = n10;
        if (n8 > this.w.getRight() - this.h) {
            n11 = (n10 | 0x2);
        }
        int n12 = n11;
        if (n9 > this.w.getBottom() - this.h) {
            n12 = (n11 | 0x8);
        }
        n7[n3] = n12;
        this.q |= 1 << n3;
    }
    
    private final void u(final MotionEvent motionEvent) {
        for (int pointerCount = motionEvent.getPointerCount(), i = 0; i < pointerCount; ++i) {
            final int pointerId = motionEvent.getPointerId(i);
            if (this.y(pointerId)) {
                final float x = motionEvent.getX(i);
                final float y = motionEvent.getY(i);
                this.e[pointerId] = x;
                this.f[pointerId] = y;
            }
        }
    }
    
    private final boolean v(float abs, float abs2, final int n, final int n2) {
        abs = Math.abs(abs);
        abs2 = Math.abs(abs2);
        if ((this.n[n] & n2) == n2 && (this.j & n2) != 0x0 && (this.p[n] & n2) != n2 && (this.o[n] & n2) != n2) {
            final float n3 = (float)this.b;
            if (abs > n3 || abs2 > n3) {
                if (abs < abs2 * 0.5f) {
                    this.u.j();
                }
                if ((this.o[n] & n2) == 0x0 && abs > this.b) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private final boolean w(final View view, final float n, final float n2) {
        if (view == null) {
            return false;
        }
        final boolean b = this.u.a(view) > 0;
        final boolean b2 = this.u.b(view) > 0;
        if (b && b2) {
            final int b3 = this.b;
            return n * n + n2 * n2 > b3 * b3;
        }
        if (b) {
            return Math.abs(n) > this.b;
        }
        return b2 && Math.abs(n2) > this.b;
    }
    
    private final boolean x(int n, int n2, int n3, int n4) {
        final int left = this.k.getLeft();
        final int top = this.k.getTop();
        n -= left;
        n2 -= top;
        if (n == 0) {
            if (n2 == 0) {
                this.t.abortAnimation();
                this.g(0);
                return false;
            }
            n = 0;
        }
        final View k = this.k;
        final int a = A(n3, (int)this.g, (int)this.s);
        n3 = A(n4, (int)this.g, (int)this.s);
        final int abs = Math.abs(n);
        n4 = Math.abs(n2);
        final int abs2 = Math.abs(a);
        final int abs3 = Math.abs(n3);
        final int n5 = abs2 + abs3;
        final int n6 = abs + n4;
        float n7;
        float n8;
        if (a != 0) {
            n7 = (float)abs2;
            n8 = (float)n5;
        }
        else {
            n7 = (float)abs;
            n8 = (float)n6;
        }
        final float n9 = n7 / n8;
        float n10;
        float n11;
        if (n3 != 0) {
            n10 = (float)abs3;
            n11 = (float)n5;
        }
        else {
            n10 = (float)n4;
            n11 = (float)n6;
        }
        final float n12 = n10 / n11;
        n4 = this.o(n, a, this.u.a(k));
        n3 = this.o(n2, n3, this.u.b(k));
        this.t.startScroll(left, top, n, n2, (int)(n4 * n9 + n3 * n12));
        this.g(2);
        return true;
    }
    
    private final boolean y(final int n) {
        return this.h(n);
    }
    
    private static final float z(final float n, float n2, final float n3) {
        final float abs = Math.abs(n);
        if (abs < n2) {
            return 0.0f;
        }
        n2 = n;
        if (abs > n3) {
            if (n > 0.0f) {
                return n3;
            }
            n2 = -n3;
        }
        return n2;
    }
    
    public final View a(final int n, final int n2) {
        int childCount = this.w.getChildCount();
        while (true) {
            final int n3 = childCount - 1;
            if (n3 < 0) {
                return null;
            }
            final View child = this.w.getChildAt(n3);
            childCount = n3;
            if (n < child.getLeft()) {
                continue;
            }
            childCount = n3;
            if (n >= child.getRight()) {
                continue;
            }
            childCount = n3;
            if (n2 < child.getTop()) {
                continue;
            }
            if (n2 < child.getBottom()) {
                return child;
            }
            childCount = n3;
        }
    }
    
    public final void d() {
        this.m = -1;
        final float[] c = this.c;
        if (c != null) {
            Arrays.fill(c, 0.0f);
            Arrays.fill(this.d, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.n, 0);
            Arrays.fill(this.o, 0);
            Arrays.fill(this.p, 0);
            this.q = 0;
        }
        final VelocityTracker r = this.r;
        if (r != null) {
            r.recycle();
            this.r = null;
        }
    }
    
    public final void e(final View k, final int m) {
        if (k.getParent() == this.w) {
            this.k = k;
            this.m = m;
            this.u.d(k, m);
            this.g(1);
            return;
        }
        final StringBuilder sb = new StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(this.w);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void f(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final int actionIndex = motionEvent.getActionIndex();
        final int n = 0;
        final int n2 = 0;
        int n3 = actionMasked;
        if (actionMasked == 0) {
            this.d();
            n3 = 0;
        }
        if (this.r == null) {
            this.r = VelocityTracker.obtain();
        }
        this.r.addMovement(motionEvent);
        if (n3 != 0) {
            if (n3 == 1) {
                if (this.a == 1) {
                    this.r();
                }
                this.d();
                return;
            }
            if (n3 == 2) {
                if (this.a == 1) {
                    final int m = this.m;
                    if (!this.y(m)) {
                        return;
                    }
                    final int pointerIndex = motionEvent.findPointerIndex(m);
                    if (pointerIndex == -1) {
                        return;
                    }
                    final float x = motionEvent.getX(pointerIndex);
                    final float y = motionEvent.getY(pointerIndex);
                    final float[] e = this.e;
                    final int i = this.m;
                    final float n4 = e[i];
                    final float n5 = this.f[i];
                    final int left = this.k.getLeft();
                    final int n6 = (int)(x - n4);
                    final int n7 = left + n6;
                    final int top = this.k.getTop();
                    final int n8 = (int)(y - n5);
                    final int n9 = top + n8;
                    final int left2 = this.k.getLeft();
                    final int top2 = this.k.getTop();
                    int h = n7;
                    if (n6 != 0) {
                        h = this.u.h(this.k, n7);
                        anc.E(this.k, h - left2);
                    }
                    int j = n9;
                    if (n8 != 0) {
                        j = this.u.i(this.k, n9);
                        anc.F(this.k, j - top2);
                    }
                    if (n6 != 0 || n8 != 0) {
                        this.u.l(this.k, h, j, h - left2);
                    }
                }
                else {
                    for (int pointerCount = motionEvent.getPointerCount(), k = n; k < pointerCount; ++k) {
                        final int pointerId = motionEvent.getPointerId(k);
                        if (this.y(pointerId)) {
                            final float x2 = motionEvent.getX(k);
                            final float y2 = motionEvent.getY(k);
                            final float n10 = x2 - this.c[pointerId];
                            final float n11 = y2 - this.d[pointerId];
                            this.s(n10, n11, pointerId);
                            if (this.a == 1) {
                                break;
                            }
                            final View a = this.a((int)x2, (int)y2);
                            if (this.w(a, n10, n11) && this.m(a, pointerId)) {
                                break;
                            }
                        }
                    }
                }
                this.u(motionEvent);
                return;
            }
            if (n3 == 3) {
                if (this.a == 1) {
                    this.q(0.0f, 0.0f);
                }
                this.d();
                return;
            }
            if (n3 != 5) {
                if (n3 == 6) {
                    final int pointerId2 = motionEvent.getPointerId(actionIndex);
                    Label_0226: {
                        if (this.a == 1 && pointerId2 == this.m) {
                            for (int pointerCount2 = motionEvent.getPointerCount(), l = n2; l < pointerCount2; ++l) {
                                final int pointerId3 = motionEvent.getPointerId(l);
                                if (pointerId3 != this.m) {
                                    final View a2 = this.a((int)motionEvent.getX(l), (int)motionEvent.getY(l));
                                    final View k2 = this.k;
                                    if (a2 == k2 && this.m(k2, pointerId3)) {
                                        if (this.m == -1) {
                                            break;
                                        }
                                        break Label_0226;
                                    }
                                }
                            }
                            this.r();
                        }
                    }
                    this.p(pointerId2);
                }
            }
            else {
                final int pointerId4 = motionEvent.getPointerId(actionIndex);
                final float x3 = motionEvent.getX(actionIndex);
                final float y3 = motionEvent.getY(actionIndex);
                this.t(x3, y3, pointerId4);
                if (this.a == 0) {
                    this.m(this.a((int)x3, (int)y3), pointerId4);
                    if ((this.n[pointerId4] & this.j) != 0x0) {
                        this.u.k();
                    }
                }
                else if (this.i(this.k, (int)x3, (int)y3)) {
                    this.m(this.k, pointerId4);
                }
            }
        }
        else {
            final float x4 = motionEvent.getX();
            final float y4 = motionEvent.getY();
            final int pointerId5 = motionEvent.getPointerId(0);
            final View a3 = this.a((int)x4, (int)y4);
            this.t(x4, y4, pointerId5);
            this.m(a3, pointerId5);
            if ((this.n[pointerId5] & this.j) != 0x0) {
                this.u.k();
            }
        }
    }
    
    public final void g(final int a) {
        this.w.removeCallbacks(this.x);
        if (this.a != a) {
            this.a = a;
            this.u.e(a);
            if (this.a == 0) {
                this.k = null;
            }
        }
    }
    
    public final boolean h(final int n) {
        return (1 << n & this.q) != 0x0;
    }
    
    public final boolean i(final View view, final int n, final int n2) {
        return view != null && (n >= view.getLeft() && n < view.getRight() && n2 >= view.getTop() && n2 < view.getBottom());
    }
    
    public final boolean j(final int n, final int n2) {
        if (this.v) {
            return this.x(n, n2, (int)this.r.getXVelocity(this.m), (int)this.r.getYVelocity(this.m));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }
    
    public final boolean k(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final int actionIndex = motionEvent.getActionIndex();
        int n = actionMasked;
        if (actionMasked == 0) {
            this.d();
            n = 0;
        }
        if (this.r == null) {
            this.r = VelocityTracker.obtain();
        }
        this.r.addMovement(motionEvent);
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 5) {
                            if (n != 6) {
                                return this.a == 1;
                            }
                            this.p(motionEvent.getPointerId(actionIndex));
                            return this.a == 1;
                        }
                        else {
                            final int pointerId = motionEvent.getPointerId(actionIndex);
                            final float x = motionEvent.getX(actionIndex);
                            final float y = motionEvent.getY(actionIndex);
                            this.t(x, y, pointerId);
                            final int a = this.a;
                            if (a == 0) {
                                if ((this.n[pointerId] & this.j) != 0x0) {
                                    this.u.k();
                                    return this.a == 1;
                                }
                                return this.a == 1;
                            }
                            else {
                                if (a != 2) {
                                    return this.a == 1;
                                }
                                final View a2 = this.a((int)x, (int)y);
                                if (a2 == this.k) {
                                    this.m(a2, pointerId);
                                    return this.a == 1;
                                }
                                return this.a == 1;
                            }
                        }
                    }
                }
                else {
                    if (this.c != null && this.d != null) {
                        for (int pointerCount = motionEvent.getPointerCount(), i = 0; i < pointerCount; ++i) {
                            final int pointerId2 = motionEvent.getPointerId(i);
                            if (this.y(pointerId2)) {
                                final float x2 = motionEvent.getX(i);
                                final float y2 = motionEvent.getY(i);
                                final float n2 = x2 - this.c[pointerId2];
                                final float n3 = y2 - this.d[pointerId2];
                                final View a3 = this.a((int)x2, (int)y2);
                                final boolean w = this.w(a3, n2, n3);
                                if (w) {
                                    final int left = a3.getLeft();
                                    final int h = this.u.h(a3, (int)n2 + left);
                                    final int top = a3.getTop();
                                    final int j = this.u.i(a3, (int)n3 + top);
                                    final int a4 = this.u.a(a3);
                                    final int b = this.u.b(a3);
                                    if (a4 == 0 || (a4 > 0 && h == left)) {
                                        if (b == 0) {
                                            break;
                                        }
                                        if (b > 0 && j == top) {
                                            break;
                                        }
                                    }
                                }
                                this.s(n2, n3, pointerId2);
                                if (this.a == 1) {
                                    break;
                                }
                                if (w && this.m(a3, pointerId2)) {
                                    break;
                                }
                            }
                        }
                        this.u(motionEvent);
                        return this.a == 1;
                    }
                    return this.a == 1;
                }
            }
            this.d();
        }
        else {
            final float x3 = motionEvent.getX();
            final float y3 = motionEvent.getY();
            final int pointerId3 = motionEvent.getPointerId(0);
            this.t(x3, y3, pointerId3);
            final View a5 = this.a((int)x3, (int)y3);
            if (a5 == this.k && this.a == 2) {
                this.m(a5, pointerId3);
            }
            if ((this.n[pointerId3] & this.j) != 0x0) {
                this.u.k();
            }
        }
        return this.a == 1;
    }
    
    public final boolean l(final View k, final int n, final int n2) {
        this.k = k;
        this.m = -1;
        final boolean x = this.x(n, n2, 0, 0);
        if (!x && this.a == 0 && this.k != null) {
            this.k = null;
            return false;
        }
        return x;
    }
    
    final boolean m(final View view, final int m) {
        if (view == this.k && this.m == m) {
            return true;
        }
        if (view != null && this.u.g(view, m)) {
            this.e(view, this.m = m);
            return true;
        }
        return false;
    }
    
    public final boolean n() {
        if (this.a == 2) {
            final boolean computeScrollOffset = this.t.computeScrollOffset();
            final int currX = this.t.getCurrX();
            final int currY = this.t.getCurrY();
            final int n = currX - this.k.getLeft();
            final int n2 = currY - this.k.getTop();
            if (n != 0) {
                anc.E(this.k, n);
            }
            if (n2 != 0) {
                anc.F(this.k, n2);
            }
            if (n != 0 || n2 != 0) {
                this.u.l(this.k, currX, currY, n);
            }
            if (computeScrollOffset) {
                if (currX != this.t.getFinalX() || currY != this.t.getFinalY()) {
                    return this.a == 2;
                }
                this.t.abortAnimation();
            }
            this.w.post(this.x);
        }
        return this.a == 2;
    }
}
