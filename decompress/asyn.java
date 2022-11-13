import java.util.concurrent.atomic.AtomicReference;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asyn extends AtomicInteger implements ashy, asir, aslg
{
    private static final long serialVersionUID = 8080567949447303262L;
    final ashy a;
    final asjr b;
    final int c;
    final int d;
    public final atid e;
    final ArrayDeque f;
    askt g;
    public asir h;
    volatile boolean i;
    int j;
    volatile boolean k;
    aslf l;
    int m;
    public final int n;
    
    public asyn(final ashy a, final asjr b, final int c, final int d, final int n) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.n = n;
        this.e = new atid();
        this.f = new ArrayDeque();
    }
    
    @Override
    public final void b(final Throwable t) {
        if (atih.e((AtomicReference)this.e, t)) {
            this.i = true;
            this.f();
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir h) {
        if (asjv.g(this.h, h)) {
            this.h = h;
            if (h instanceof asko) {
                final asko asko = (asko)h;
                final int tv = asko.tv(3);
                if (tv == 1) {
                    this.j = 1;
                    this.g = (askt)asko;
                    this.i = true;
                    this.a.d(this);
                    this.f();
                    return;
                }
                if (tv == 2) {
                    this.j = 2;
                    this.g = (askt)asko;
                    this.a.d(this);
                    return;
                }
            }
            this.g = (askt)new atgh(this.d);
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.h.dispose();
        if (this.getAndIncrement() == 0) {
            do {
                this.g.c();
                this.h();
            } while (this.decrementAndGet() != 0);
        }
    }
    
    public final void f() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final askt g = this.g;
        final ArrayDeque f = this.f;
        final ashy a = this.a;
        final int n = this.n;
        int addAndGet = 1;
    Label_0246_Outer:
        while (true) {
            int i = this.m;
        Label_0246:
            while (true) {
                while (i != this.c) {
                    if (this.k) {
                        g.c();
                        this.h();
                        return;
                    }
                    if (n == 1) {
                        if (this.e.get() != null) {
                            g.c();
                            this.h();
                            a.b(atih.d((AtomicReference)this.e));
                            return;
                        }
                        final int n2 = 1;
                    }
                    else {
                        final int n2 = n;
                    }
                    try {
                        final Object tw = g.tw();
                        if (tw != null) {
                            final ashw ashw = (ashw)this.b.a(tw);
                            askk.b((Object)ashw, "The mapper returned a null ObservableSource");
                            final aslf aslf = new aslf((aslg)this, this.d);
                            f.offer(aslf);
                            ashw.aP(aslf);
                            ++i;
                            continue Label_0246_Outer;
                        }
                        break Label_0246;
                    }
                    finally {
                        final Throwable t;
                        asgz.c(t);
                        this.h.dispose();
                        g.c();
                        this.h();
                        atih.e((AtomicReference)this.e, t);
                        a.b(atih.d((AtomicReference)this.e));
                        return;
                    }
                    break;
                    this.m = i;
                    if (this.k) {
                        g.c();
                        this.h();
                        return;
                    }
                    int n2 = 0;
                    int n3;
                    if ((n3 = n2) == 1) {
                        if (this.e.get() != null) {
                            g.c();
                            this.h();
                            a.b(atih.d((AtomicReference)this.e));
                            return;
                        }
                        n3 = 1;
                    }
                    aslf l = null;
                    Label_0471: {
                        if ((l = this.l) == null) {
                            if (n3 == 2 && this.e.get() != null) {
                                g.c();
                                this.h();
                                a.b(atih.d((AtomicReference)this.e));
                                return;
                            }
                            final boolean j = this.i;
                            l = f.poll();
                            if (j) {
                                if (l == null) {
                                    if (this.e.get() != null) {
                                        g.c();
                                        this.h();
                                        a.b(atih.d((AtomicReference)this.e));
                                        return;
                                    }
                                    a.tx();
                                    return;
                                }
                            }
                            else if (l == null) {
                                break Label_0471;
                            }
                            this.l = l;
                        }
                    }
                    Label_0649: {
                        if (l != null) {
                            final askt c = l.c;
                            while (!this.k) {
                                final boolean d = l.d;
                                if (n3 == 1) {
                                    if (this.e.get() != null) {
                                        g.c();
                                        this.h();
                                        a.b(atih.d((AtomicReference)this.e));
                                        return;
                                    }
                                }
                                try {
                                    final Object tw2 = c.tw();
                                    if (d) {
                                        if (tw2 == null) {
                                            this.l = null;
                                            --this.m;
                                            continue Label_0246_Outer;
                                        }
                                    }
                                    else if (tw2 == null) {
                                        break Label_0649;
                                    }
                                    a.tu(tw2);
                                    continue Label_0246_Outer;
                                }
                                finally {
                                    asgz.c((Throwable)l);
                                    atih.e((AtomicReference)this.e, (Throwable)l);
                                    this.l = null;
                                    --this.m;
                                    continue Label_0246_Outer;
                                }
                                break;
                            }
                            break Label_0246_Outer;
                        }
                    }
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue Label_0246_Outer;
                }
                final int n2 = n;
                continue Label_0246;
            }
        }
        g.c();
        this.h();
    }
    
    public final void g(final aslf aslf) {
        aslf.f();
        this.f();
    }
    
    final void h() {
        final aslf l = this.l;
        if (l != null) {
            asjv.b((AtomicReference)l);
        }
        while (true) {
            final aslf aslf = this.f.poll();
            if (aslf == null) {
                break;
            }
            asjv.b((AtomicReference)aslf);
        }
    }
    
    @Override
    public final boolean tA() {
        return this.k;
    }
    
    @Override
    public final void tu(final Object o) {
        if (this.j == 0) {
            this.g.j(o);
        }
        this.f();
    }
    
    @Override
    public final void tx() {
        this.i = true;
        this.f();
    }
}
