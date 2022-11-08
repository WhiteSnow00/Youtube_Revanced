import java.util.List;
import com.facebook.litho.ComponentTree;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ebs
{
    private static final AtomicInteger c;
    public final int a;
    public eeh b;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private boolean j;
    private final dvj k;
    private boolean l;
    private boolean m;
    private int n;
    private ComponentTree o;
    private dwr p;
    private int q;
    private int r;
    private qpt s;
    private final qpt t;
    
    static {
        c = new AtomicInteger(1);
    }
    
    public ebs(final ebr ebr) {
        new AtomicInteger(0);
        this.l = true;
        this.m = false;
        this.q = -1;
        this.r = -1;
        this.b = ebr.a;
        this.k = ebr.b;
        this.t = ebr.i;
        this.d = ebr.d;
        this.a = ebs.c.getAndIncrement();
        this.g = ebr.c;
        this.h = ebr.h;
        this.i = ebr.e;
        this.e = ebr.f;
        this.f = ebr.g;
    }
    
    public static ebr c() {
        return new ebr();
    }
    
    private final void u(final dsw dsw) {
        if (this.o == null) {
            final dtf b = ComponentTree.b(dsw, this.b.c());
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
            final qpt t = this.t;
            Object j;
            if (t == null) {
                j = null;
            }
            else {
                j = new edj((eea)t.a, this);
            }
            b.j = (dti)j;
            b.i = this.m;
            b.d = this.g;
            b.b = this.h;
            b.e = this.i;
            b.m = this.d;
            final mck q = this.b.q();
            this.b.m();
            b.o = q;
            b.n = null;
            final ComponentTree a = b.a();
            this.o = a;
            final qpt s = this.s;
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
    
    public final eeh d() {
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
    
    public final void f(final dti dti) {
        synchronized (this) {
            final ComponentTree o = this.o;
            if (o != null) {
                synchronized (o) {
                    final List d = o.d;
                    if (d != null) {
                        d.remove(dti);
                    }
                }
            }
        }
    }
    
    public final void g(final dsw dsw, final int n, final int n2) {
        this.h(dsw, n, n2, null);
    }
    
    public final void h(final dsw dsw, final int q, final int r, final dti dti) {
        synchronized (this) {
            if (this.b.l()) {
                return;
            }
            this.q = q;
            this.r = r;
            this.u(dsw);
            final ComponentTree o = this.o;
            final dss c = this.b.c();
            final eeh b = this.b;
            cxz a;
            if (b instanceof efj) {
                a = ((efj)b).a;
            }
            else {
                a = null;
            }
            monitorexit(this);
            if (dti != null) {
                o.g(dti);
            }
            if (c != null) {
                o.y(c, q, r, true, (dwp)null, 1, a);
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
    
    public final void i(final dsw dsw, final int q, final int r, final dwp dwp) {
        synchronized (this) {
            if (this.b.l()) {
                return;
            }
            this.q = q;
            this.r = r;
            this.u(dsw);
            final ComponentTree o = this.o;
            final dss c = this.b.c();
            final eeh b = this.b;
            cxz a;
            if (b instanceof efj) {
                a = ((efj)b).a;
            }
            else {
                a = null;
            }
            monitorexit(this);
            if (c != null) {
                o.y(c, q, r, false, dwp, 0, a);
                synchronized (this) {
                    if (o == this.o && c == this.b.c()) {
                        this.j = true;
                        if (dwp != null) {
                            this.n = dwp.b;
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
    
    public final void n(final eeh b) {
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
    
    final void t(final qpt qpt) {
        synchronized (this) {
            final ComponentTree o = this.o;
            if (o != null) {
                o.G = qpt;
                return;
            }
            this.s = qpt;
        }
    }
}
