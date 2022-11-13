import java.util.Map;
import java.util.Iterator;
import j$.util.stream.Stream;
import j$.util.stream.Collectors;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.List;
import j$.util.stream.Stream$_CC;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.concurrent.Callable;
import android.graphics.Point;
import android.view.ViewConfiguration;
import android.view.GestureDetector$OnGestureListener;
import android.content.Context;
import android.os.Handler;
import android.view.WindowManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hnk implements oa
{
    public int a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public final WindowManager k;
    final bx l;
    public pvh m;
    private final int n;
    private float o;
    private float p;
    private boolean q;
    private int r;
    private final Handler s;
    private final hqv t;
    private final hqy u;
    private final hpy v;
    private final arwh w;
    
    public hnk(final Context context, final Handler s, final hqv t, final hpy v, final hqy u, final arwh w, final vai vai, final msr msr, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = -1L;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = true;
        this.h = 0;
        this.i = 6;
        this.r = 0;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.l = new bx(context, (GestureDetector$OnGestureListener)new hnj(this, u, v), s);
        this.n = ViewConfiguration.get(context).getScaledTouchSlop();
        Math.max(199, ViewConfiguration.getTapTimeout());
        final WindowManager k = (WindowManager)context.getSystemService("window");
        this.k = k;
        if (k != null) {
            final Point point = new Point();
            k.getDefaultDisplay().getSize(point);
            final int y = point.y;
            this.a = y;
            this.j = (int)(y * 0.1f);
        }
        msr.Q((Callable)new hly(this, vai, 2));
        msr.Q((Callable)new hly(this, vai, 3));
    }
    
    static float a(float n, float n2, final float n3, final float n4) {
        n2 = (n = (float)Math.toDegrees(Math.abs(Math.atan2(n4 - n2, n3 - n))));
        if (n2 > 90.0f) {
            n = 180.0f - n2;
        }
        return 90.0f - n;
    }
    
    private final void g(final boolean b) {
        Label_0075: {
            if (this.c) {
                if (!b || this.q) {
                    break Label_0075;
                }
                this.t.c(this.r);
                this.r = 0;
                this.c = false;
            }
            final hqj b2 = this.b();
            if (b2 != null) {
                ((hrf)b2).v(this.c);
            }
            final psb f = this.f();
            if (f != null) {
                f.c(true);
            }
        }
        this.b = -1L;
        this.v.e();
    }
    
    private final boolean h(final float n) {
        final hqy u = this.u;
        hrf am;
        if (u == null) {
            am = null;
        }
        else {
            am = u.aM();
        }
        return am == null || (n >= am.u() && n <= this.a - am.n());
    }
    
    private final void i(final MotionEvent motionEvent) {
        final int n = motionEvent.getAction() & 0xFF;
        final boolean b = false;
        final boolean b2 = true;
        boolean b3 = true;
        if (n == 0) {
            this.b = motionEvent.getDownTime();
            this.o = motionEvent.getRawX();
            this.p = motionEvent.getRawY();
            this.h = 1;
            this.d = false;
            boolean q = false;
            Label_0623: {
                Label_0620: {
                    if ((this.w.f().b & 0x40000000) != 0x0 && this.u.aM() != null) {
                        ansk ansk;
                        if ((ansk = this.w.f().u) == null) {
                            ansk = ansk.a;
                        }
                        if (!ansk.h) {
                            break Label_0620;
                        }
                        if (!this.u.aM().m) {
                            if (!this.u.aM().n) {
                                break Label_0620;
                            }
                        }
                    }
                    else if (!(this.u.aN() instanceof hpu)) {
                        break Label_0620;
                    }
                    q = true;
                    break Label_0623;
                }
                q = false;
            }
            if (!(this.q = q)) {
                this.c = false;
            }
            final hri an = this.u.aN();
            boolean g = false;
            Label_0681: {
                if (an != null) {
                    g = b;
                    if (!an.p(this.o, this.p, 0)) {
                        break Label_0681;
                    }
                }
                g = true;
            }
            this.g = g;
            this.v.g(this.o, this.p);
            final long uptimeMillis = SystemClock.uptimeMillis();
            if (!this.q) {
                this.s.postDelayed((Runnable)new hcn(this, motionEvent, uptimeMillis, 2), 200L);
            }
            return;
        }
        if (n != 1) {
            if (n == 2) {
                this.c(motionEvent, motionEvent.getEventTime());
                return;
            }
            if (n != 3) {
                return;
            }
            this.v.d();
            this.g(true);
        }
        else {
            final long eventTime = motionEvent.getEventTime();
            final float rawX = motionEvent.getRawX();
            final float rawY = motionEvent.getRawY();
            this.v.f(rawX, rawY);
            final long b4 = this.b;
            if (b4 < -1L) {
                this.g(false);
                return;
            }
            final hqj b5 = this.b();
            final int h = this.h;
            if (h != 2 && h != 3) {
                if (h != 4) {
                    b3 = (true ^ this.q);
                }
                this.h = 0;
            }
            else {
                b3 = b2;
                if (Math.abs(rawY - this.p) > this.j) {
                    b3 = b2;
                    if (b5 != null) {
                        b3 = b2;
                        if (eventTime - b4 < 600L) {
                            this.v.d();
                            final int h2 = this.h;
                            if (h2 == 2) {
                                b5.d();
                                b3 = false;
                            }
                            else {
                                b3 = b2;
                                if (h2 == 3) {
                                    final hqh a = ((hrf)b5).a;
                                    final ante h3 = a.H;
                                    if (h3 == null) {
                                        b3 = b2;
                                    }
                                    else {
                                        final int b6 = h3.b;
                                        anuv anuv;
                                        if ((anuv = h3.v) == null) {
                                            anuv = anuv.a;
                                        }
                                        final aicz b7 = hko.b((b6 & 0x4000) != 0x0, anuv);
                                        aicz n2 = null;
                                        Label_0351: {
                                            if (b7 != null) {
                                                n2 = b7;
                                                if (!b7.h) {
                                                    break Label_0351;
                                                }
                                            }
                                            n2 = hqh.n(a.H);
                                        }
                                        b3 = b2;
                                        if (n2 != null) {
                                            b3 = b2;
                                            if (!n2.h) {
                                                final vcy f = a.f;
                                                aiqj aiqj;
                                                if ((aiqj = n2.p) == null) {
                                                    aiqj = aiqj.a;
                                                }
                                                f.a(aiqj);
                                                b3 = b2;
                                                if ((n2.b & 0x800000) != 0x0) {
                                                    a.h.pF().J(65, (wzz)new wyt(n2.w.I()), (alhi)null);
                                                    b3 = b2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.h = 0;
            }
            this.g(b3);
        }
    }
    
    public final hqj b() {
        final hqy u = this.u;
        Object am;
        if (u == null) {
            am = null;
        }
        else {
            am = u.aM();
        }
        if (am == null) {
            return null;
        }
        return (hqj)am;
    }
    
    public final void c(final MotionEvent motionEvent, final long n) {
        final float rawX = motionEvent.getRawX();
        final float rawY = motionEvent.getRawY();
        this.v.f(rawX, rawY);
        if (!this.g) {
            int n2;
            if (Math.abs(rawY - this.p) > 150.0f && a(this.o, this.p, rawX, rawY) <= 22.5f) {
                if (rawY > this.p) {
                    n2 = 2;
                }
                else {
                    n2 = 1;
                }
            }
            else {
                n2 = 0;
            }
            final hri an = this.u.aN();
            if (an != null) {
                this.g = an.p(this.o, this.p, n2);
            }
        }
        final int h = this.h;
        Label_0535: {
            if (h == 1) {
                if (this.d(4)) {
                    if (Math.abs(rawY - this.p) > 150.0f && a(this.o, this.p, rawX, rawY) <= 22.5f) {
                        Label_0390: {
                            if (rawY < this.p) {
                                final pvh m = this.m;
                                if (m != null) {
                                    final int b = ((hne)m.a).B;
                                    float n3 = 0.0f;
                                    if (b != -1) {
                                        final Rect rect = new Rect();
                                        final Rect rect2 = new Rect();
                                        ((hne)m.a).q.getGlobalVisibleRect(rect);
                                        final hne hne = (hne)m.a;
                                        final View t = ((nw)hne.r).T(hne.B);
                                        n3 = n3;
                                        if (t != null) {
                                            t.getGlobalVisibleRect(rect2);
                                            int n4;
                                            int n5;
                                            if (rect2.right <= rect.right) {
                                                n4 = rect2.right;
                                                n5 = rect.left;
                                            }
                                            else {
                                                n4 = rect.right;
                                                n5 = rect2.left;
                                            }
                                            n3 = (n4 - n5) / (float)rect.width();
                                        }
                                    }
                                    if (n3 < 0.75f) {
                                        break Label_0390;
                                    }
                                }
                                this.h = 3;
                            }
                            else {
                                this.h = 2;
                            }
                        }
                        this.p = rawY;
                    }
                    break Label_0535;
                }
            }
            else if (h != 1) {
                break Label_0535;
            }
            if (this.d(8) && !this.f && !this.h(this.p) && !this.h(rawY) && Math.hypot(rawX - this.o, rawY - this.p) > this.n) {
                this.h = 4;
                final hpy v = this.v;
                if (v.e && v.f && hpy.a(v.a, v.b) > v.d) {
                    v.e = false;
                    v.h(65, 93504);
                }
            }
        }
        if (!this.c && this.d(2) && !this.q) {
            final long b2 = this.b;
            if (!this.h(rawY) || n - b2 < 200L) {
                final int h2 = this.h;
                if (h2 == 1 || h2 == 4) {
                    return;
                }
            }
            this.c = true;
            this.r = this.t.a();
            final hqj b3 = this.b();
            if (b3 != null) {
                ((hrf)b3).v(this.c);
            }
            final psb f = this.f();
            if (f != null) {
                f.c(false);
            }
        }
    }
    
    public final boolean d(final int n) {
        return (n & this.i) != 0x0;
    }
    
    public final void e(final boolean b) {
    }
    
    public final psb f() {
        final hqy u = this.u;
        hrf am;
        if (u == null) {
            am = null;
        }
        else {
            am = u.aM();
        }
        if (am == null) {
            return null;
        }
        return am.v;
    }
    
    public final boolean k(final RecyclerView recyclerView, final MotionEvent motionEvent) {
        final hrf am = this.u.aM();
        Label_0445: {
            if (am != null) {
                if (this.e && am.m) {
                    final hrf am2 = this.u.aM();
                    if (am2 != null) {
                        if (am2.u == null) {
                            final Stream of = Stream$_CC.of((Object[])new View[] { am2.findViewById(2131431035), am2.e, am2.h });
                            ajrk ajrk;
                            if ((ajrk = am2.x.f().A) == null) {
                                ajrk = ajrk.a;
                            }
                            final ahaz builder = ((ahbh)ajrl.a).createBuilder();
                            builder.copyOnWrite();
                            ajrl.a((ajrl)builder.instance);
                            final ajrl ajrl = (ajrl)builder.build();
                            final ahcr b = ajrk.b;
                            final Long value = 45368692L;
                            ajrl ajrl2 = ajrl;
                            if (((Map)b).containsKey(value)) {
                                ajrl2 = (ajrl)((Map)b).get(value);
                            }
                            Stream concat = of;
                            if (ajrl2.b == 1) {
                                concat = of;
                                if (ajrl2.c) {
                                    final hqh a = am2.a;
                                    concat = Stream$_CC.concat(of, Stream$_CC.of((Object[])new View[] { a.e.findViewById(2131428818), a.e.findViewById(2131428825), a.e.findViewById(2131428817), a.e.findViewById(2131430989), a.e.findViewById(2131431003), a.e.findViewById(2131431002), a.e.findViewById(2131430988), a.e.findViewById(2131428824) }));
                                }
                            }
                            am2.u = (List)concat.filter((Predicate)hoi.l).map((Function)new hra(am2, 0)).collect(Collectors.toList());
                        }
                        final Iterator iterator = am2.u.iterator();
                        while (iterator.hasNext()) {
                            if (((Rect)iterator.next()).contains((int)motionEvent.getX(), (int)motionEvent.getY())) {
                                break Label_0445;
                            }
                        }
                        this.l.y(motionEvent);
                    }
                }
            }
        }
        this.i(motionEvent);
        final int h = this.h;
        return (h != 0 && h != 1) || this.d;
    }
    
    public final void l(final MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getAction() == 1) {
                final pvh m = this.m;
                if (m != null) {
                    final hne hne = (hne)m.a;
                    final int b = hne.B;
                    if (b != -1) {
                        hne.q.aj(b);
                    }
                }
            }
            this.i(motionEvent);
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.g = true;
            }
        }
    }
}
