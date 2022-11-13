import java.util.List;
import com.facebook.litho.ComponentTree;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ebt
{
    private static final AtomicInteger c;
    public final int a;
    public eei b;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private boolean j;
    private final dvk k;
    private boolean l;
    private boolean m;
    private int n;
    private ComponentTree o;
    private dws p;
    private int q;
    private int r;
    private pvh s;
    private final pvh t;
    
    static {
        c = new AtomicInteger(1);
    }
    
    public ebt(final ebs ebs) {
        new AtomicInteger(0);
        this.l = true;
        this.m = false;
        this.q = -1;
        this.r = -1;
        this.b = ebs.a;
        this.k = ebs.b;
        this.t = ebs.i;
        this.d = ebs.d;
        this.a = ebt.c.getAndIncrement();
        this.g = ebs.c;
        this.h = ebs.h;
        this.i = ebs.e;
        this.e = ebs.f;
        this.f = ebs.g;
    }
    
    public static ebs c() {
        return new ebs();
    }
    
    private final void u(final dsx dsx) {
        if (this.o == null) {
            final dtg b = ComponentTree.b(dsx, this.b.c());
            final Object f = this.b.f("is_reconciliation_enabled");
            final Object f2 = this.b.f("layout_diffing_enabled");
            if (f != null) {
                b.k = (boolean)f;
            }
            else {
                b.k = this.e;
            }
            if (f2 != null) {
                b.f = (boolean)f2;
            }
            else {
                b.f = this.f;
            }
            b.g = this.k;
            b.h = this.p;
            final pvh t = this.t;
            dtj j;
            if (t == null) {
                j = null;
            }
            else {
                j = new edk((eeb)t.a, this);
            }
            b.j = j;
            b.i = this.m;
            b.d = this.g;
            b.b = this.h;
            b.e = this.i;
            b.m = this.d;
            final msr q = this.b.q();
            this.b.m();
            b.o = q;
            b.n = null;
            final ComponentTree a = b.a();
            this.o = a;
            final pvh s = this.s;
            if (s != null) {
                a.G = s;
            }
        }
    }
    
    final int a() {
        synchronized (this) {
            return this.n;
        }
    }
    
    public final ComponentTree b() {
        synchronized (this) {
            return this.o;
        }
    }
    
    public final eei d() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final void e(final boolean b) {
        monitorenter(this);
        Label_0035: {
            if (b) {
                break Label_0035;
            }
            try {
                final Object f = this.b.f("acquire_state_handler");
                if (f instanceof Boolean && (boolean)f) {
                    final ComponentTree o = this.o;
                    if (o != null) {
                        this.p = o.c();
                    }
                }
                final ComponentTree o2 = this.o;
                if (o2 != null) {
                    this.m = o2.q;
                }
                this.k();
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    public final void f(final dtj dtj) {
        synchronized (this) {
            final ComponentTree o = this.o;
            if (o != null) {
                synchronized (o) {
                    final List d = o.d;
                    if (d != null) {
                        d.remove(dtj);
                    }
                }
            }
        }
    }
    
    public final void g(final dsx dsx, final int n, final int n2) {
        this.h(dsx, n, n2, null);
    }
    
    public final void h(final dsx dsx, final int q, final int r, final dtj dtj) {
        synchronized (this) {
            if (this.b.l()) {
                return;
            }
            this.q = q;
            this.r = r;
            this.u(dsx);
            final ComponentTree o = this.o;
            final dst c = this.b.c();
            final eei b = this.b;
            cya a;
            if (b instanceof efk) {
                a = ((efk)b).a;
            }
            else {
                a = null;
            }
            monitorexit(this);
            if (dtj != null) {
                o.g(dtj);
            }
            if (c != null) {
                o.y(c, q, r, true, (dwq)null, 1, a);
                synchronized (this) {
                    if (this.o == o && c == this.b.c()) {
                        this.j = true;
                    }
                    return;
                }
            }
            throw new IllegalArgumentException("Root component can't be null");
        }
    }
    
    public final void i(final dsx dsx, final int q, final int r, final dwq dwq) {
        synchronized (this) {
            if (this.b.l()) {
                return;
            }
            this.q = q;
            this.r = r;
            this.u(dsx);
            final ComponentTree o = this.o;
            final dst c = this.b.c();
            final eei b = this.b;
            cya a;
            if (b instanceof efk) {
                a = ((efk)b).a;
            }
            else {
                a = null;
            }
            monitorexit(this);
            if (c != null) {
                o.y(c, q, r, false, dwq, 0, a);
                synchronized (this) {
                    if (o == this.o && c == this.b.c()) {
                        this.j = true;
                        if (dwq != null) {
                            this.n = dwq.b;
                        }
                    }
                    return;
                }
            }
            throw new IllegalArgumentException("Root component can't be null");
        }
    }
    
    final void j() {
        synchronized (this) {
            this.j = false;
        }
    }
    
    public final void k() {
        synchronized (this) {
            final ComponentTree o = this.o;
            if (o != null) {
                o.n();
                this.o = null;
                this.b.g();
            }
            this.j = false;
        }
    }
    
    public final void l(final boolean l) {
        synchronized (this) {
            this.l = l;
        }
    }
    
    final void m(final int n) {
        synchronized (this) {
            this.n = n;
        }
    }
    
    public final void n(final eei b) {
        synchronized (this) {
            this.j();
            this.b = b;
        }
    }
    
    public final boolean o() {
        synchronized (this) {
            final boolean l = this.b.l();
            boolean b = true;
            if (!l) {
                final ComponentTree o = this.o;
                if (o != null) {
                    if (!o.q(this.q, this.r)) {
                        return false;
                    }
                    b = b;
                }
                else {
                    b = false;
                }
            }
            return b;
        }
    }
    
    public final boolean p() {
        synchronized (this) {
            return this.l;
        }
    }
    
    public final boolean q() {
        synchronized (this) {
            return this.j;
        }
    }
    
    public final boolean r(int r, final int n) {
        synchronized (this) {
            if (this.q() && this.q == r) {
                r = this.r;
                if (r == n) {
                    return true;
                }
            }
            return false;
        }
    }
    
    final void s(final int n, final int n2, final int n3) {
        synchronized (this) {
            final ComponentTree o = this.o;
            if (o != null) {
                o.u(n, n2, n3);
            }
        }
    }
    
    final void t(final pvh pvh) {
        synchronized (this) {
            final ComponentTree o = this.o;
            if (o != null) {
                o.G = pvh;
                return;
            }
            this.s = pvh;
        }
    }
}
