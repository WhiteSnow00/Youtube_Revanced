import java.util.concurrent.Executor;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dfp implements dfb, dpl
{
    final dfo a;
    public ddj b;
    public boolean c;
    public dfx d;
    public boolean e;
    dft f;
    public boolean g;
    dfr h;
    public volatile boolean i;
    int j;
    public final adnp k;
    public final qbo l;
    public final qbo m;
    private final akq n;
    private final dhj o;
    private final dhj p;
    private final dhj q;
    private final AtomicInteger r;
    private boolean s;
    private dfc t;
    
    public dfp(final dhj o, final dhj p11, final dhj q, final qbo m, final qbo l, final akq n, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = new dfo((List)new ArrayList(2));
        this.k = adnp.c();
        this.r = new AtomicInteger();
        this.o = o;
        this.p = p11;
        this.q = q;
        this.m = m;
        this.l = l;
        this.n = n;
    }
    
    private final boolean j() {
        return this.g || this.e || this.i;
    }
    
    public final dhj a() {
        dhj dhj;
        if (this.s) {
            dhj = this.q;
        }
        else {
            dhj = this.p;
        }
        return dhj;
    }
    
    public final void b(final dnq dnq, final Executor executor) {
        synchronized (this) {
            this.k.b();
            this.a.a.add(new dfn(dnq, executor));
            if (this.e) {
                this.d(1);
                executor.execute((Runnable)new dfm(this, dnq, 0));
                return;
            }
            if (this.g) {
                this.d(1);
                executor.execute((Runnable)new dfm(this, dnq, 1));
                return;
            }
            cll.i(this.i ^ true, "Cannot add callbacks to a cancelled EngineJob");
        }
    }
    
    final void c() {
        synchronized (this) {
            this.k.b();
            cll.i(this.j(), "Not yet complete!");
            final int decrementAndGet = this.r.decrementAndGet();
            cll.i(decrementAndGet >= 0, "Can't decrement below 0");
            dfr h;
            if (decrementAndGet == 0) {
                h = this.h;
                this.e();
            }
            else {
                h = null;
            }
            monitorexit(this);
            if (h != null) {
                h.f();
            }
        }
    }
    
    final void d(final int n) {
        synchronized (this) {
            cll.i(this.j(), "Not yet complete!");
            if (this.r.getAndAdd(n) == 0) {
                final dfr h = this.h;
                if (h != null) {
                    h.d();
                }
            }
        }
    }
    
    public final void e() {
        synchronized (this) {
            if (this.b != null) {
                this.a.a.clear();
                this.b = null;
                this.h = null;
                this.d = null;
                this.g = false;
                this.i = false;
                this.e = false;
                final dfc t = this.t;
                if (t.q.i()) {
                    t.a();
                }
                this.t = null;
                this.f = null;
                this.j = 0;
                this.n.b((Object)this);
                return;
            }
            throw new IllegalArgumentException();
        }
    }
    
    public final adnp f() {
        return this.k;
    }
    
    public final void g(final dnq dnq) {
        synchronized (this) {
            this.k.b();
            this.a.a.remove(dfo.b(dnq));
            if (this.a.e()) {
                if (!this.j()) {
                    this.i = true;
                    final dfc t = this.t;
                    t.m = true;
                    final dez l = t.l;
                    if (l != null) {
                        l.a();
                    }
                    this.m.Z(this, this.b);
                }
                if ((this.e || this.g) && this.r.get() == 0) {
                    this.e();
                }
            }
        }
    }
    
    public final void h(final dfc t) {
        synchronized (this) {
            this.t = t;
            final int c = t.c(1);
            dhj dhj;
            if (c != 2 && c != 3) {
                dhj = this.a();
            }
            else {
                dhj = this.o;
            }
            dhj.execute((Runnable)t);
        }
    }
    
    public final void i(final ddj b, final boolean c, final boolean s) {
        synchronized (this) {
            this.b = b;
            this.c = c;
            this.s = s;
        }
    }
}
