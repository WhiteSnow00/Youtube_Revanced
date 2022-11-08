import android.graphics.Canvas;
import android.view.View$AccessibilityDelegate;
import j$.util.Objects;
import android.view.MotionEvent;
import android.content.Context;
import android.graphics.Paint;
import android.view.accessibility.AccessibilityManager;
import android.graphics.RectF;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsy extends View
{
    private final RectF A;
    private final AccessibilityManager B;
    private gsw C;
    private RectF D;
    private float E;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Paint g;
    public Paint h;
    public Paint i;
    public float j;
    public float k;
    public float l;
    public String m;
    public String n;
    public String o;
    public gsx p;
    public float q;
    public float r;
    public final RectF s;
    public final RectF t;
    public final RectF u;
    private final RectF v;
    private final RectF w;
    private final RectF x;
    private final RectF y;
    private final RectF z;
    
    public gsy(final Context context) {
        super(context);
        this.j = 1.0f;
        this.k = 0.0f;
        this.l = 0.01f;
        this.m = "";
        this.n = "";
        this.o = "";
        this.s = new RectF();
        this.t = new RectF();
        this.x = new RectF();
        this.v = new RectF();
        this.y = new RectF();
        this.w = new RectF();
        this.u = new RectF();
        this.z = new RectF();
        this.A = new RectF();
        this.B = (AccessibilityManager)context.getSystemService("accessibility");
    }
    
    public static int a(final Context context) {
        return tmy.aZ(context.getResources().getDisplayMetrics(), 16);
    }
    
    public static void f(final float n, final String s) {
        if (n >= 0.0f && n <= 1.0f) {
            return;
        }
        throw new IllegalArgumentException("all params must be >= 0 and <= 1f. ".concat(s));
    }
    
    private final float g() {
        return Math.max(Math.min(this.r - this.q, this.j), this.k);
    }
    
    private final float h(final float n) {
        final int a = this.a;
        final int width = this.getWidth();
        final int a2 = this.a;
        return (n - a) / (width - (a2 + a2));
    }
    
    private final void i(final int n, int a) {
        final int a2 = this.a;
        final float n2 = (n - (a2 + a2)) * this.q;
        final float n3 = (float)a;
        this.s.set(n2, 0.0f, a2 + n2, n3);
        this.v.set(this.s);
        this.v.left = this.s.right - this.b;
        a = this.a;
        final float n4 = (float)a;
        final float n5 = (n - (a + a)) * this.r + n4;
        this.t.set(n5, 0.0f, n4 + n5, n3);
        this.w.set(this.t);
        this.w.right = this.t.left + this.b;
        this.x.set(0.0f, 0.0f, this.s.centerX(), n3);
        this.y.set(this.t.centerX(), 0.0f, (float)n, n3);
        this.u.set(this.v.right, 0.0f, this.w.left, n3);
        this.k(this.z, this.s);
        this.k(this.A, this.t);
    }
    
    private final void j(final float n, final float n2) {
        this.e(n, n2);
        this.invalidate();
        final gsx p2 = this.p;
        if (p2 != null) {
            ((gtb)p2).l();
            this.p.d(n, n2);
        }
    }
    
    private final void k(final RectF rectF, final RectF rectF2) {
        final float n = rectF2.centerX() - this.d / 2.0f;
        final float centerY = rectF2.centerY();
        final float n2 = (float)this.e;
        final float n3 = centerY - n2 / 2.0f;
        rectF.set(n, n3, this.d + n, n2 + n3);
    }
    
    private final void l(final RectF d, final MotionEvent motionEvent) {
        this.D = d;
        if (Objects.equals((Object)d, (Object)this.s)) {
            this.E = motionEvent.getX() - this.D.right;
        }
        else if (Objects.equals((Object)this.D, (Object)this.t)) {
            this.E = motionEvent.getX() - this.D.left;
        }
        else {
            this.E = motionEvent.getX() - this.D.centerX();
        }
        this.getParent().requestDisallowInterceptTouchEvent(true);
    }
    
    public final void b(float max) {
        max = Math.max(Math.min(Math.min(max, 1.0f), this.q + this.j), this.q + this.k);
        if (max != this.r) {
            this.e(this.q, max);
            this.invalidate();
            final gsx p = this.p;
            if (p != null) {
                ((gtb)p).l();
                final gtb gtb = (gtb)this.p;
                gtb.t = max;
                final gsz f = gtb.f();
                f.e();
                f.g(false);
                f.d();
                gtb.k();
            }
        }
    }
    
    public final void c(float r) {
        final float min = Math.min(Math.max(0.0f, r), 1.0f - this.k);
        if (min != this.q) {
            r = this.r;
            final float k = this.k;
            if (min > r - k) {
                this.j(min, k + min);
                return;
            }
            final float j = this.j;
            if (min < r - j) {
                this.j(min, j + min);
                return;
            }
            this.e(min, r);
            this.invalidate();
            final gsx p = this.p;
            if (p != null) {
                ((gtb)p).l();
                final gtb gtb = (gtb)this.p;
                gtb.i(min);
                gtb.k();
            }
        }
    }
    
    public final void d(final float n) {
        float n2 = this.q;
        float n3 = this.r;
        if (n < this.u.centerX()) {
            n2 = Math.max(0.0f, this.h(n - this.u.width() / 2.0f));
            n3 = n2 + this.g();
        }
        else if (n > this.u.centerX()) {
            n3 = Math.min(this.h(n + this.u.width() / 2.0f), 1.0f);
            n2 = n3 - this.g();
        }
        if (n2 != this.q && n3 != this.r) {
            this.e(n2, n3);
            this.invalidate();
            final gsx p = this.p;
            if (p != null) {
                ((gtb)p).l();
                this.p.d(n2, n3);
            }
        }
        else {
            final gsx p2 = this.p;
            if (p2 != null) {
                ((gtb)p2).l();
                this.p.d(n2, n3);
            }
        }
    }
    
    protected final boolean dispatchHoverEvent(final MotionEvent motionEvent) {
        final gsw c = this.C;
        return (c != null && c.s(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }
    
    public final void e(final float q, final float r) {
        this.q = q;
        this.r = r;
    }
    
    public final void invalidate() {
        super.invalidate();
        final gsw c = this.C;
        if (c != null) {
            c.n();
        }
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.B.isEnabled() && this.C == null && this.getContext() != null) {
            ana.N((View)this, (akv)(this.C = new gsw(this)));
        }
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.C != null) {
            this.setAccessibilityDelegate((View$AccessibilityDelegate)null);
            this.C = null;
        }
    }
    
    public final void onDraw(final Canvas canvas) {
        final int width = this.getWidth();
        final int height = this.getHeight();
        this.i(width, height);
        canvas.drawRect(this.x, this.h);
        canvas.drawRect(this.y, this.h);
        final RectF s = this.s;
        final float n = (float)this.c;
        canvas.drawRoundRect(s, n, n, this.g);
        final RectF t = this.t;
        final float n2 = (float)this.c;
        canvas.drawRoundRect(t, n2, n2, this.g);
        final float centerX = this.s.centerX();
        canvas.drawRect(centerX, 0.0f, this.t.centerX(), (float)this.c, this.g);
        canvas.drawRect(centerX, (float)(height - this.c), this.t.centerX(), (float)height, this.g);
        final RectF z = this.z;
        final float n3 = (float)this.f;
        canvas.drawRoundRect(z, n3, n3, this.i);
        final RectF a = this.A;
        final float n4 = (float)this.f;
        canvas.drawRoundRect(a, n4, n4, this.i);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!super.onTouchEvent(motionEvent)) {
            this.i(this.getWidth(), this.getHeight());
            if (motionEvent.getAction() == 0) {
                if (this.v.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.l(this.s, motionEvent);
                    return true;
                }
                if (this.w.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.l(this.t, motionEvent);
                    return true;
                }
                if (this.u.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.l(this.u, motionEvent);
                    return true;
                }
            }
            else if (motionEvent.getAction() == 2 && this.D != null) {
                final float h = this.h(motionEvent.getX() - this.E);
                if (this.s.equals((Object)this.D)) {
                    this.c(h);
                }
                else if (this.t.equals((Object)this.D)) {
                    this.b(h);
                }
                else {
                    if (!this.u.equals((Object)this.D)) {
                        throw new RuntimeException("Impossible path");
                    }
                    this.d(motionEvent.getX() - this.E);
                }
                final gsx p = this.p;
                if (p == null) {
                    return true;
                }
                int b = (int)this.s.left;
                final int n = (int)this.s.width();
                final gtn d = ((gtb)p).D;
                if (d != null) {
                    final int computeHorizontalScrollOffset = d.computeHorizontalScrollOffset();
                    if (computeHorizontalScrollOffset < n) {
                        if (b > 0) {
                            d.an();
                            if (b >= n) {
                                b = n - computeHorizontalScrollOffset;
                            }
                            final gsv af = d.af;
                            if (b != af.b) {
                                af.cancel();
                                final gsv af2 = d.af;
                                af2.setIntValues(new int[] { af2.b, b });
                                d.af.start();
                                d.af.b = b;
                            }
                        }
                    }
                }
                final gsx p2 = this.p;
                final int n2 = (int)this.t.right;
                final int n3 = (int)this.t.width();
                final gtn d2 = ((gtb)p2).D;
                if (d2 == null) {
                    return true;
                }
                final gtj gtj = (gtj)d2.m;
                if (gtj == null) {
                    return true;
                }
                final int computeHorizontalScrollOffset2 = d2.computeHorizontalScrollOffset();
                if (d2.getMeasuredWidth() + computeHorizontalScrollOffset2 <= gtj.c() - n3 || n2 >= d2.getMeasuredWidth()) {
                    return true;
                }
                d2.an();
                int b2;
                if (n2 > d2.getMeasuredWidth() - n3) {
                    b2 = n2 - d2.getMeasuredWidth();
                }
                else {
                    b2 = gtj.c() - n3 - (computeHorizontalScrollOffset2 + d2.getMeasuredWidth());
                }
                final gsv af3 = d2.af;
                if (b2 != af3.b) {
                    af3.cancel();
                    final gsv af4 = d2.af;
                    af4.setIntValues(new int[] { af4.b, b2 });
                    d2.af.start();
                    d2.af.b = b2;
                    return true;
                }
                return true;
            }
            else {
                if (motionEvent.getAction() == 1) {
                    if (this.D != null) {
                        final gsx p3 = this.p;
                        if (p3 != null) {
                            p3.a();
                        }
                    }
                    this.D = null;
                    this.getParent().requestDisallowInterceptTouchEvent(false);
                    return true;
                }
                this.getParent().requestDisallowInterceptTouchEvent(false);
            }
            return false;
        }
        return true;
    }
}
