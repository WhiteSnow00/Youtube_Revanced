import java.util.concurrent.Executor;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dfq implements dfc, dpm
{
    final dfp a;
    public ddk b;
    public boolean c;
    public dfy d;
    public boolean e;
    dfu f;
    public boolean g;
    dfs h;
    public volatile boolean i;
    int j;
    public final adpq k;
    public final qcy l;
    public final qcy m;
    private final akr n;
    private final dhk o;
    private final dhk p;
    private final dhk q;
    private final AtomicInteger r;
    private boolean s;
    private dfd t;
    
    public dfq(final dhk o, final dhk p11, final dhk q, final qcy m, final qcy l, final akr n, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = new dfp((List)new ArrayList(2));
        this.k = adpq.c();
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
    
    public final dhk a() {
        dhk dhk;
        if (this.s) {
            dhk = this.q;
        }
        else {
            dhk = this.p;
        }
        return dhk;
    }
    
    public final void b(final dnr dnr, final Executor executor) {
        synchronized (this) {
            this.k.b();
            this.a.a.add(new dfo(dnr, executor));
            if (this.e) {
                this.d(1);
                executor.execute((Runnable)new dfn(this, dnr, 0));
                return;
            }
            if (this.g) {
                this.d(1);
                executor.execute((Runnable)new dfn(this, dnr, 1));
                return;
            }
            clm.i(this.i ^ true, "Cannot add callbacks to a cancelled EngineJob");
        }
    }
    
    final void c() {
        synchronized (this) {
            this.k.b();
            clm.i(this.j(), "Not yet complete!");
            final int decrementAndGet = this.r.decrementAndGet();
            clm.i(decrementAndGet >= 0, "Can't decrement below 0");
            dfs h;
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
            clm.i(this.j(), "Not yet complete!");
            if (this.r.getAndAdd(n) == 0) {
                final dfs h = this.h;
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
                final dfd t = this.t;
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
    
    public final adpq f() {
        return this.k;
    }
    
    public final void g(final dnr dnr) {
        synchronized (this) {
            this.k.b();
            this.a.a.remove(dfp.b(dnr));
            if (this.a.e()) {
                if (!this.j()) {
                    this.i = true;
                    final dfd t = this.t;
                    t.m = true;
                    final dfa l = t.l;
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
    
    public final void h(final dfd t) {
        synchronized (this) {
            this.t = t;
            final int c = t.c(1);
            dhk dhk;
            if (c != 2 && c != 3) {
                dhk = this.a();
            }
            else {
                dhk = this.o;
            }
            dhk.execute((Runnable)t);
        }
    }
    
    public final void i(final ddk b, final boolean c, final boolean s) {
        synchronized (this) {
            this.b = b;
            this.c = c;
            this.s = s;
        }
    }
}
