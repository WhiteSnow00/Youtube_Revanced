import java.io.InputStream;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public class asbc implements asac
{
    private volatile boolean a;
    private asae b;
    private Status c;
    private List d;
    public asac e;
    private asbb f;
    private long g;
    private long h;
    private List i;
    
    public asbc() {
        this.d = new ArrayList();
        this.i = new ArrayList();
    }
    
    private final void s(final Runnable runnable) {
        adkp.R(this.b != null, (Object)"May only be called after start");
        synchronized (this) {
            if (!this.a) {
                this.d.add(runnable);
                return;
            }
            monitorexit(this);
            runnable.run();
        }
    }
    
    private final void t(final asae asae) {
        final Iterator iterator = this.i.iterator();
        while (iterator.hasNext()) {
            ((Runnable)iterator.next()).run();
        }
        this.i = null;
        this.e.m(asae);
    }
    
    private final void u(final asac e) {
        final asac e2 = this.e;
        adkp.T(e2 == null, "realStream already set to %s", (Object)e2);
        this.e = e;
        this.h = System.nanoTime();
    }
    
    @Override
    public final artu a() {
        throw null;
    }
    
    @Override
    public void b(final ascd ascd) {
        synchronized (this) {
            if (this.b == null) {
                return;
            }
            if (this.e != null) {
                ascd.b("buffered_nanos", (Object)(this.h - this.g));
                this.e.b(ascd);
            }
            else {
                ascd.b("buffered_nanos", (Object)(System.nanoTime() - this.g));
                ascd.a((Object)"waiting_for_connection");
            }
        }
    }
    
    @Override
    public void c(final Status c) {
        final asae b = this.b;
        boolean b2 = true;
        adkp.R(b != null, (Object)"May only be called after start");
        c.getClass();
        synchronized (this) {
            if (this.e == null) {
                this.u(asdz.a);
                this.c = c;
                b2 = false;
            }
            monitorexit(this);
            if (b2) {
                this.s((Runnable)new asat(this, c, 9));
                return;
            }
            this.r();
            this.p();
            this.b.a(c, asad.a, new arwk());
        }
    }
    
    @Override
    public final void d() {
        adkp.R(this.b != null, (Object)"May only be called after start");
        if (this.a) {
            this.e.d();
            return;
        }
        this.s((Runnable)new asba(this, 0));
    }
    
    @Override
    public final void e() {
        adkp.R(this.b != null, (Object)"May only be called after start");
        this.s((Runnable)new asba(this, 2));
    }
    
    @Override
    public final void f() {
        adkp.R(this.b == null, (Object)"May only be called before start");
        this.i.add(new arcu(this, 20));
    }
    
    @Override
    public final void g(final int n) {
        adkp.R(this.b != null, (Object)"May only be called after start");
        if (this.a) {
            this.e.g(n);
            return;
        }
        this.s(new aasq(this, n, 17));
    }
    
    @Override
    public final void h(final arui arui) {
        adkp.R(this.b == null, (Object)"May only be called before start");
        this.i.add(new asat(this, arui, 5));
    }
    
    @Override
    public final void i(final arup arup) {
        adkp.R(this.b == null, (Object)"May only be called before start");
        this.i.add(new asat(this, arup, 7));
    }
    
    @Override
    public final void j(final arur arur) {
        adkp.R(this.b == null, (Object)"May only be called before start");
        arur.getClass();
        this.i.add(new asat(this, arur, 6));
    }
    
    @Override
    public final void k(final int n) {
        adkp.R(this.b == null, (Object)"May only be called before start");
        this.i.add(new aasq(this, n, 18));
    }
    
    @Override
    public final void l(final int n) {
        adkp.R(this.b == null, (Object)"May only be called before start");
        this.i.add(new aasq(this, n, 19));
    }
    
    @Override
    public final void m(final asae asae) {
        adkp.R(this.b == null, (Object)"already started");
        synchronized (this) {
            final Status c = this.c;
            final boolean a = this.a;
            asae asae2 = asae;
            if (!a) {
                asae2 = new asbb(asae);
                this.f = (asbb)asae2;
            }
            this.b = asae2;
            this.g = System.nanoTime();
            monitorexit(this);
            if (c != null) {
                asae2.a(c, asad.a, new arwk());
                return;
            }
            if (a) {
                this.t(asae2);
            }
        }
    }
    
    @Override
    public final void n(final InputStream inputStream) {
        adkp.R(this.b != null, (Object)"May only be called after start");
        if (this.a) {
            this.e.n(inputStream);
            return;
        }
        this.s((Runnable)new asat(this, inputStream, 8));
    }
    
    @Override
    public final boolean o() {
        return this.a && this.e.o();
    }
    
    protected void p() {
    }
    
    public final Runnable q(final asac asac) {
        synchronized (this) {
            if (this.e != null) {
                return null;
            }
            asac.getClass();
            this.u(asac);
            final asae b = this.b;
            if (b == null) {
                this.d = null;
                this.a = true;
            }
            monitorexit(this);
            if (b == null) {
                return null;
            }
            this.t(b);
            return (Runnable)new asba(this, 1);
        }
    }
    
    public final void r() {
        final ArrayList d = new ArrayList();
        while (true) {
            monitorenter(this);
            try {
                if (this.d.isEmpty()) {
                    this.d = null;
                    this.a = true;
                    final asbb f = this.f;
                    monitorexit(this);
                    if (f != null) {
                        final ArrayList c = new ArrayList();
                        while (true) {
                            synchronized (f) {
                                if (f.c.isEmpty()) {
                                    f.c = null;
                                    f.b = true;
                                    return;
                                }
                                final List c2 = f.c;
                                f.c = c;
                                monitorexit(f);
                                final Iterator iterator = c2.iterator();
                                while (iterator.hasNext()) {
                                    ((Runnable)iterator.next()).run();
                                }
                                c2.clear();
                                continue;
                            }
                            break;
                        }
                    }
                    return;
                }
                final List d2 = this.d;
                this.d = d;
                monitorexit(this);
                final Iterator iterator2 = d2.iterator();
                while (iterator2.hasNext()) {
                    ((Runnable)iterator2.next()).run();
                }
                d2.clear();
            }
            finally {
                monitorexit(this);
                while (true) {}
            }
        }
    }
}
