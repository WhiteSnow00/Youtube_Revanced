import java.io.Serializable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class atbh extends AtomicInteger implements asku, asln
{
    private static final long serialVersionUID = -6951100001833242599L;
    final asku a;
    final int b;
    final atla c;
    final atbg d;
    final boolean e;
    asnp f;
    asln g;
    volatile boolean h;
    volatile boolean i;
    volatile boolean j;
    int k;
    
    public atbh(final asku a, final int b) {
        this.a = a;
        this.b = b;
        this.e = false;
        this.c = new atla();
        this.d = new atbg(a, this);
    }
    
    @Override
    public final void b(final Throwable t) {
        if (atle.e(this.c, t)) {
            this.i = true;
            this.f();
            return;
        }
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln g) {
        if (asmr.g(this.g, g)) {
            this.g = g;
            if (g instanceof asnk) {
                final asnk asnk = (asnk)g;
                final int tu = asnk.tu(3);
                if (tu == 1) {
                    this.k = 1;
                    this.f = (asnp)asnk;
                    this.i = true;
                    this.a.d(this);
                    this.f();
                    return;
                }
                if (tu == 2) {
                    this.k = 2;
                    this.f = (asnp)asnk;
                    this.a.d(this);
                    return;
                }
            }
            this.f = (asnp)new atje(this.b);
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.j = true;
        this.g.dispose();
        asmr.b(this.d);
    }
    
    final void f() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final asku a = this.a;
        final asnp f = this.f;
        Serializable s = this.c;
        while (true) {
            Label_0307: {
                if (!this.h) {
                    if (this.j) {
                        f.c();
                        return;
                    }
                    if (((AtomicReference)s).get() == null) {
                        final boolean i = this.i;
                        try {
                            final Object tv = f.tv();
                            if (i) {
                                if (tv == null) {
                                    this.j = true;
                                    s = atle.d((AtomicReference)s);
                                    if (s != null) {
                                        a.b((Throwable)s);
                                        return;
                                    }
                                    a.tw();
                                    return;
                                }
                            }
                            else if (tv == null) {
                                break Label_0307;
                            }
                            try {
                                final asks asks = (asks)tv;
                                if (asks instanceof Callable) {
                                    try {
                                        final Object call = ((Callable<Object>)asks).call();
                                        if (call == null || this.j) {
                                            continue;
                                        }
                                        a.tt(call);
                                    }
                                    finally {
                                        final Throwable t;
                                        asjv.a(t);
                                        atle.e((AtomicReference)s, t);
                                    }
                                    continue;
                                }
                                this.h = true;
                                asks.aP(this.d);
                                break Label_0307;
                            }
                            finally {
                                final Throwable t2;
                                asjv.a(t2);
                                this.j = true;
                                this.g.dispose();
                                f.c();
                                atle.e((AtomicReference)s, t2);
                                a.b(atle.d((AtomicReference)s));
                                return;
                            }
                        }
                        finally {
                            asjv.a((Throwable)f);
                            this.j = true;
                            this.g.dispose();
                            atle.e((AtomicReference)s, (Throwable)f);
                            a.b(atle.d((AtomicReference)s));
                            return;
                        }
                        break;
                    }
                    break;
                }
            }
            if (this.decrementAndGet() == 0) {
                return;
            }
        }
        f.c();
        this.j = true;
        a.b(atle.d((AtomicReference)s));
    }
    
    @Override
    public final void tt(final Object o) {
        if (this.k == 0) {
            this.f.j(o);
        }
        this.f();
    }
    
    @Override
    public final void tw() {
        this.i = true;
        this.f();
    }
    
    @Override
    public final boolean tz() {
        return this.j;
    }
}
