import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class atcs extends AtomicInteger implements ashy, asir
{
    static final atcr a;
    private static final long serialVersionUID = -3491074160481096299L;
    final ashy b;
    final asjr c;
    final int d;
    final atid e;
    volatile boolean f;
    volatile boolean g;
    asir h;
    final AtomicReference i;
    volatile long j;
    
    static {
        asjv.b(a = new atcr(null, -1L, 1));
    }
    
    public atcs(final ashy b, final asjr c, final int d) {
        this.i = new AtomicReference();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new atid();
    }
    
    @Override
    public final void b(final Throwable t) {
        if (!this.f && atih.e((AtomicReference)this.e, t)) {
            this.f();
            this.f = true;
            this.g();
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir h) {
        if (asjv.g(this.h, h)) {
            this.h = h;
            this.b.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        if (!this.g) {
            this.g = true;
            this.h.dispose();
            this.f();
        }
    }
    
    final void f() {
        final atcr atcr = this.i.get();
        final atcr a = atcs.a;
        if (atcr != a) {
            final atcr atcr2 = this.i.getAndSet(a);
            if (atcr2 != a && atcr2 != null) {
                asjv.b(atcr2);
            }
        }
    }
    
    final void g() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final ashy b = this.b;
        final AtomicReference i = this.i;
        int addAndGet = 1;
    Label_0022:
        while (!this.g) {
            if (this.f) {
                final Object value = i.get();
                if (this.e.get() != null) {
                    b.b(atih.d((AtomicReference)this.e));
                    return;
                }
                if (value == null) {
                    b.tx();
                    return;
                }
            }
            final atcr atcr = i.get();
            Label_0347: {
                if (atcr != null) {
                    final askt d = atcr.d;
                    if (d != null) {
                        if (atcr.e) {
                            final boolean j = d.i();
                            if (this.e.get() != null) {
                                b.b(atih.d((AtomicReference)this.e));
                                return;
                            }
                            if (j) {
                                atwx.f(i, atcr, null);
                                continue;
                            }
                        }
                        while (!this.g) {
                            if (atcr != i.get()) {
                                continue Label_0022;
                            }
                            if (this.e.get() != null) {
                                b.b(atih.d((AtomicReference)this.e));
                                return;
                            }
                            final boolean e = atcr.e;
                            Object o = null;
                            boolean b2 = false;
                            try {
                                d.tw();
                            }
                            finally {
                                final Throwable t;
                                asgz.c(t);
                                atih.e((AtomicReference)this.e, t);
                                atwx.f(i, atcr, null);
                                this.f();
                                this.h.dispose();
                                this.f = true;
                                o = null;
                                b2 = true;
                            }
                            if (e) {
                                if (o == null) {
                                    atwx.f(i, atcr, null);
                                    continue Label_0022;
                                }
                            }
                            else if (o == null) {
                                if (!b2) {
                                    break Label_0347;
                                }
                                continue Label_0022;
                            }
                            b.tu(o);
                        }
                        return;
                    }
                }
            }
            if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                return;
            }
        }
    }
    
    @Override
    public final boolean tA() {
        return this.g;
    }
    
    @Override
    public final void tu(final Object o) {
        final long j = this.j + 1L;
        this.j = j;
        final atcr atcr = this.i.get();
        if (atcr != null) {
            asjv.b(atcr);
        }
        try {
            final ashw ashw = (ashw)this.c.a(o);
            askk.b((Object)ashw, "The ObservableSource returned is null");
            final atcr atcr2 = new atcr(this, j, this.d);
            atcr atcr3;
            do {
                atcr3 = this.i.get();
                if (atcr3 == atcs.a) {
                    return;
                }
            } while (!atwx.f(this.i, atcr3, atcr2));
            ashw.aP(atcr2);
        }
        finally {
            final Throwable t;
            asgz.c(t);
            this.h.dispose();
            this.b(t);
        }
    }
    
    @Override
    public final void tx() {
        if (!this.f) {
            this.f = true;
            this.g();
        }
    }
}
