import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxj extends AtomicInteger implements ashy, asir
{
    private static final long serialVersionUID = -9140123220065488293L;
    final ashy a;
    final asjr b;
    final atid c;
    final asxi d;
    final asks e;
    asir f;
    volatile boolean g;
    volatile boolean h;
    Object i;
    volatile int j;
    final int k;
    
    public asxj(final ashy a, final asjr b) {
        this.a = a;
        this.b = b;
        this.k = 1;
        this.c = new atid();
        this.d = new asxi(this);
        this.e = new atgh(2);
    }
    
    @Override
    public final void b(final Throwable t) {
        if (atih.e((AtomicReference)this.c, t)) {
            if (this.k == 1) {
                asjv.b((AtomicReference)this.d);
            }
            this.g = true;
            this.f();
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir f) {
        if (asjv.g(this.f, f)) {
            this.f = f;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.h = true;
        this.f.dispose();
        asjv.b((AtomicReference)this.d);
        if (this.getAndIncrement() == 0) {
            this.e.c();
            this.i = null;
        }
    }
    
    final void f() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final ashy a = this.a;
        final int k = this.k;
        final asks e = this.e;
        final atid c = this.c;
        int addAndGet = 1;
        while (true) {
            Label_0274: {
                if (this.h) {
                    e.c();
                    this.i = null;
                }
                else {
                    final int j = this.j;
                    if (c.get() != null && k == 1) {
                        e.c();
                        this.i = null;
                        a.b(atih.d((AtomicReference)c));
                        return;
                    }
                    if (j == 0) {
                        final boolean g = this.g;
                        final Object tw = e.tw();
                        if (g) {
                            if (tw == null) {
                                final Throwable d = atih.d((AtomicReference)c);
                                if (d == null) {
                                    a.tx();
                                    return;
                                }
                                a.b(d);
                                return;
                            }
                        }
                        else if (tw == null) {
                            break Label_0274;
                        }
                        try {
                            final Object a2 = this.b.a(tw);
                            this.j = 1;
                            ((asih)a2).ae(this.d);
                            break Label_0274;
                        }
                        finally {
                            final Throwable t;
                            asgz.c(t);
                            this.f.dispose();
                            e.c();
                            atih.e((AtomicReference)c, t);
                            a.b(atih.d((AtomicReference)c));
                            return;
                        }
                    }
                    if (j == 2) {
                        final Object i = this.i;
                        this.i = null;
                        a.tu(i);
                        this.j = 0;
                        continue;
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
        return this.h;
    }
    
    @Override
    public final void tu(final Object o) {
        this.e.j(o);
        this.f();
    }
    
    @Override
    public final void tx() {
        this.g = true;
        this.f();
    }
}
