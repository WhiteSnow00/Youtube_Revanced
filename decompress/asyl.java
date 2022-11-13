import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class asyl extends AtomicInteger implements ashy, asir
{
    private static final long serialVersionUID = -6951100001833242599L;
    final ashy a;
    final int b;
    final atid c;
    final asyk d;
    final boolean e;
    askt f;
    asir g;
    volatile boolean h;
    volatile boolean i;
    volatile boolean j;
    int k;
    
    public asyl(final ashy a, final int b) {
        this.a = a;
        this.b = b;
        this.e = false;
        this.c = new atid();
        this.d = new asyk(a, this);
    }
    
    @Override
    public final void b(final Throwable t) {
        if (atih.e((AtomicReference)this.c, t)) {
            this.i = true;
            this.f();
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir g) {
        if (asjv.g(this.g, g)) {
            this.g = g;
            if (g instanceof asko) {
                final asko asko = (asko)g;
                final int tv = asko.tv(3);
                if (tv == 1) {
                    this.k = 1;
                    this.f = (askt)asko;
                    this.i = true;
                    this.a.d(this);
                    this.f();
                    return;
                }
                if (tv == 2) {
                    this.k = 2;
                    this.f = (askt)asko;
                    this.a.d(this);
                    return;
                }
            }
            this.f = (askt)new atgh(this.b);
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.j = true;
        this.g.dispose();
        asjv.b((AtomicReference)this.d);
    }
    
    final void f() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final ashy a = this.a;
        final askt f = this.f;
        Object o = this.c;
        while (true) {
            Label_0307: {
                if (!this.h) {
                    if (this.j) {
                        f.c();
                        return;
                    }
                    if (((atid)o).get() == null) {
                        final boolean i = this.i;
                        try {
                            final Object tw = f.tw();
                            if (i) {
                                if (tw == null) {
                                    this.j = true;
                                    o = atih.d((AtomicReference)o);
                                    if (o != null) {
                                        a.b((Throwable)o);
                                        return;
                                    }
                                    a.tx();
                                    return;
                                }
                            }
                            else if (tw == null) {
                                break Label_0307;
                            }
                            try {
                                final ashw ashw = (ashw)tw;
                                if (ashw instanceof Callable) {
                                    try {
                                        final Object call = ((Callable<Object>)ashw).call();
                                        if (call == null || this.j) {
                                            continue;
                                        }
                                        a.tu(call);
                                    }
                                    finally {
                                        final Throwable t;
                                        asgz.c(t);
                                        atih.e((AtomicReference)o, t);
                                    }
                                    continue;
                                }
                                this.h = true;
                                ashw.aP(this.d);
                                break Label_0307;
                            }
                            finally {
                                final Throwable t2;
                                asgz.c(t2);
                                this.j = true;
                                this.g.dispose();
                                f.c();
                                atih.e((AtomicReference)o, t2);
                                a.b(atih.d((AtomicReference)o));
                                return;
                            }
                        }
                        finally {
                            asgz.c((Throwable)f);
                            this.j = true;
                            this.g.dispose();
                            atih.e((AtomicReference)o, (Throwable)f);
                            a.b(atih.d((AtomicReference)o));
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
        a.b(atih.d((AtomicReference)o));
    }
    
    @Override
    public final boolean tA() {
        return this.j;
    }
    
    @Override
    public final void tu(final Object o) {
        if (this.k == 0) {
            this.f.j(o);
        }
        this.f();
    }
    
    @Override
    public final void tx() {
        this.i = true;
        this.f();
    }
}
