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

public final class hmq implements oa
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
    public qpt m;
    private final int n;
    private float o;
    private float p;
    private boolean q;
    private int r;
    private final Handler s;
    private final hqa t;
    private final hqd u;
    private final hpd v;
    private final arud w;
    
    public hmq(final Context context, final Handler s, final hqa t, final hpd v, final hqd u, final arud w, final uyi uyi, final mrm mrm, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
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
        this.l = new bx(context, (GestureDetector$OnGestureListener)new hmp(this, u, v), s);
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
        mrm.A((Callable)new hlc(this, uyi, 2));
        mrm.A((Callable)new hlc(this, uyi, 3));
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
            final hpo b2 = this.b();
            if (b2 != null) {
                ((hqk)b2).v(this.c);
            }
            final pqq f = this.f();
            if (f != null) {
                f.c(true);
            }
        }
        this.b = -1L;
        this.v.e();
    }
    
    private final boolean h(final float n) {
        final hqd u = this.u;
        hqk am;
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
            Label_0611: {
                Label_0608: {
                    if ((this.w.f().b & 0x40000000) != 0x0 && this.u.aM() != null) {
                        anqh anqh;
                        if ((anqh = this.w.f().u) == null) {
                            anqh = anqh.a;
                        }
                        if (!anqh.h) {
                            break Label_0608;
                        }
                        if (!this.u.aM().m) {
                            if (!this.u.aM().n) {
                                break Label_0608;
                            }
                        }
                    }
                    else if (!(this.u.aN() instanceof hoz)) {
                        break Label_0608;
                    }
                    q = true;
                    break Label_0611;
                }
                q = false;
            }
            if (!(this.q = q)) {
                this.c = false;
            }
            final hqo an = this.u.aN();
            boolean g = false;
            Label_0668: {
                if (an != null) {
                    g = b;
                    if (!an.p(this.o, this.p, 0)) {
                        break Label_0668;
                    }
                }
                g = true;
            }
            this.g = g;
            this.v.g(this.o, this.p);
            final long uptimeMillis = SystemClock.uptimeMillis();
            if (!this.q) {
                this.s.postDelayed((Runnable)new hbw(this, motionEvent, uptimeMillis, 2), 200L);
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
            final hpo b5 = this.b();
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
                                    final hpm a = ((hqk)b5).a;
                                    final anrb h3 = a.H;
                                    if (h3 == null) {
                                        b3 = b2;
                                    }
                                    else {
                                        final boolean b6 = (h3.b & 0x4000) != 0x0;
                                        anss anss;
                                        if ((anss = h3.v) == null) {
                                            anss = anss.a;
                                        }
                                        final aibb j = iba.j(b6, anss);
                                        aibb n2 = null;
                                        Label_0339: {
                                            if (j != null) {
                                                n2 = j;
                                                if (!j.h) {
                                                    break Label_0339;
                                                }
                                            }
                                            n2 = hpm.n(a.H);
                                        }
                                        b3 = b2;
                                        if (n2 != null) {
                                            b3 = b2;
                                            if (!n2.h) {
                                                final vax f = a.f;
                                                aioe aioe;
                                                if ((aioe = n2.p) == null) {
                                                    aioe = aioe.a;
                                                }
                                                f.a(aioe);
                                                b3 = b2;
                                                if ((n2.b & 0x800000) != 0x0) {
                                                    a.h.n().J(65, (wxz)new wws(n2.w.I()), (alff)null);
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
    
    public final hpo b() {
        final hqd u = this.u;
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
        return (hpo)am;
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
            final hqo an = this.u.aN();
            if (an != null) {
                this.g = an.p(this.o, this.p, n2);
            }
        }
        final int h = this.h;
        Label_0524: {
            if (h == 1) {
                if (this.d(4)) {
                    if (Math.abs(rawY - this.p) > 150.0f && a(this.o, this.p, rawX, rawY) <= 22.5f) {
                        Label_0387: {
                            if (rawY < this.p) {
                                final qpt m = this.m;
                                if (m != null) {
                                    final int b = ((hmk)m.a).B;
                                    float n3 = 0.0f;
                                    if (b != -1) {
                                        final Rect rect = new Rect();
                                        final Rect rect2 = new Rect();
                                        ((hmk)m.a).q.getGlobalVisibleRect(rect);
                                        final hmk hmk = (hmk)m.a;
                                        final View t = ((nw)hmk.r).T(hmk.B);
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
                                        break Label_0387;
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
                    break Label_0524;
                }
            }
            else if (h != 1) {
                break Label_0524;
            }
            if (this.d(8) && !this.f && !this.h(this.p) && !this.h(rawY) && Math.hypot(rawX - this.o, rawY - this.p) > this.n) {
                this.h = 4;
                final hpd v = this.v;
                if (v.e && v.f && hpd.a(v.a, v.b) > v.d) {
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
            final hpo b3 = this.b();
            if (b3 != null) {
                ((hqk)b3).v(this.c);
            }
            final pqq f = this.f();
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
    
    public final pqq f() {
        final hqd u = this.u;
        hqk am;
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
        final hqk am = this.u.aM();
        Label_0434: {
            if (am != null) {
                if (this.e && am.m) {
                    final hqk am2 = this.u.aM();
                    if (am2 != null) {
                        if (am2.u == null) {
                            final Stream of = Stream$_CC.of((Object[])new View[] { am2.findViewById(2131431032), am2.e, am2.h });
                            ajpg ajpg;
                            if ((ajpg = am2.w.f().A) == null) {
                                ajpg = ajpg.a;
                            }
                            final agza builder = ajph.a.createBuilder();
                            builder.copyOnWrite();
                            ajph.a((ajph)builder.instance);
                            final ajph ajph = (ajph)builder.build();
                            final ahas b = ajpg.b;
                            final Long value = 45368692L;
                            ajph ajph2 = ajph;
                            if (b.containsKey(value)) {
                                ajph2 = b.get(value);
                            }
                            Stream concat = of;
                            if (ajph2.b == 1) {
                                concat = of;
                                if (ajph2.c) {
                                    final hpm a = am2.a;
                                    concat = Stream$_CC.concat(of, Stream$_CC.of((Object[])new View[] { a.e.findViewById(2131428818), a.e.findViewById(2131428825), a.e.findViewById(2131428817), a.e.findViewById(2131430986), a.e.findViewById(2131431000), a.e.findViewById(2131430999), a.e.findViewById(2131430985), a.e.findViewById(2131428824) }));
                                }
                            }
                            am2.u = (List)concat.filter((Predicate)hnm.l).map((Function)new hqf(am2, 0)).collect(Collectors.toList());
                        }
                        final Iterator iterator = am2.u.iterator();
                        while (iterator.hasNext()) {
                            if (((Rect)iterator.next()).contains((int)motionEvent.getX(), (int)motionEvent.getY())) {
                                break Label_0434;
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
                final qpt m = this.m;
                if (m != null) {
                    final hmk hmk = (hmk)m.a;
                    final int b = hmk.B;
                    if (b != -1) {
                        hmk.q.aj(b);
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
