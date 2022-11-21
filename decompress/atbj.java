import java.util.concurrent.atomic.AtomicReference;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atbj extends AtomicInteger implements asku, asln, asoc
{
    private static final long serialVersionUID = 8080567949447303262L;
    final asku a;
    final asmn b;
    final int c;
    final int d;
    public final atla e;
    final ArrayDeque f;
    asnp g;
    public asln h;
    volatile boolean i;
    int j;
    volatile boolean k;
    asob l;
    int m;
    public final int n;
    
    public atbj(final asku a, final asmn b, final int c, final int d, final int n) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.n = n;
        this.e = new atla();
        this.f = new ArrayDeque();
    }
    
    @Override
    public final void b(final Throwable t) {
        if (atle.e(this.e, t)) {
            this.i = true;
            this.f();
            return;
        }
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln h) {
        if (asmr.g(this.h, h)) {
            this.h = h;
            if (h instanceof asnk) {
                final asnk asnk = (asnk)h;
                final int tu = asnk.tu(3);
                if (tu == 1) {
                    this.j = 1;
                    this.g = (asnp)asnk;
                    this.i = true;
                    this.a.d(this);
                    this.f();
                    return;
                }
                if (tu == 2) {
                    this.j = 2;
                    this.g = (asnp)asnk;
                    this.a.d(this);
                    return;
                }
            }
            this.g = (asnp)new atje(this.d);
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
    
    @Override
    public final void f() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final asnp g = this.g;
        final ArrayDeque f = this.f;
        final asku a = this.a;
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
                            a.b(atle.d(this.e));
                            return;
                        }
                        final int n2 = 1;
                    }
                    else {
                        final int n2 = n;
                    }
                    try {
                        final Object tv = g.tv();
                        if (tv != null) {
                            final asks asks = (asks)this.b.a(tv);
                            asng.b(asks, "The mapper returned a null ObservableSource");
                            final asob asob = new asob(this, this.d);
                            f.offer(asob);
                            asks.aP(asob);
                            ++i;
                            continue Label_0246_Outer;
                        }
                        break Label_0246;
                    }
                    finally {
                        final Throwable t;
                        asjv.a(t);
                        this.h.dispose();
                        g.c();
                        this.h();
                        atle.e(this.e, t);
                        a.b(atle.d(this.e));
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
                            a.b(atle.d(this.e));
                            return;
                        }
                        n3 = 1;
                    }
                    asob l = null;
                    Label_0471: {
                        if ((l = this.l) == null) {
                            if (n3 == 2 && this.e.get() != null) {
                                g.c();
                                this.h();
                                a.b(atle.d(this.e));
                                return;
                            }
                            final boolean j = this.i;
                            l = f.poll();
                            if (j) {
                                if (l == null) {
                                    if (this.e.get() != null) {
                                        g.c();
                                        this.h();
                                        a.b(atle.d(this.e));
                                        return;
                                    }
                                    a.tw();
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
                            final asnp c = l.c;
                            while (!this.k) {
                                final boolean d = l.d;
                                if (n3 == 1) {
                                    if (this.e.get() != null) {
                                        g.c();
                                        this.h();
                                        a.b(atle.d(this.e));
                                        return;
                                    }
                                }
                                try {
                                    final Object tv2 = c.tv();
                                    if (d) {
                                        if (tv2 == null) {
                                            this.l = null;
                                            --this.m;
                                            continue Label_0246_Outer;
                                        }
                                    }
                                    else if (tv2 == null) {
                                        break Label_0649;
                                    }
                                    a.tt(tv2);
                                    continue Label_0246_Outer;
                                }
                                finally {
                                    asjv.a((Throwable)l);
                                    atle.e(this.e, (Throwable)l);
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
    
    @Override
    public final void g(final asob asob) {
        asob.f();
        this.f();
    }
    
    final void h() {
        final asob l = this.l;
        if (l != null) {
            asmr.b(l);
        }
        while (true) {
            final asob asob = this.f.poll();
            if (asob == null) {
                break;
            }
            asmr.b(asob);
        }
    }
    
    @Override
    public final void tt(final Object o) {
        if (this.j == 0) {
            this.g.j(o);
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
        return this.k;
    }
}
