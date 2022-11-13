import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class atdz extends AtomicInteger implements ashl
{
    private static final long serialVersionUID = -4470634016609963609L;
    final aukf[] a;
    final AtomicLongArray b;
    final long[] c;
    final int d;
    final int e;
    aukg f;
    askt g;
    Throwable h;
    volatile boolean i;
    int j;
    volatile boolean k;
    final AtomicInteger l;
    int m;
    int n;
    
    public atdz(final aukf[] a, int d) {
        this.l = new AtomicInteger();
        this.a = a;
        this.d = d;
        this.e = d - (d >> 2);
        final int length = a.length;
        d = length + length;
        (this.b = new AtomicLongArray(d + 1)).lazySet(d, length);
        this.c = new long[length];
    }
    
    public final void b(final Throwable h) {
        this.h = h;
        this.i = true;
        this.d();
    }
    
    final void d() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        Label_0716: {
            if (this.n == 1) {
                final askt g = this.g;
                final aukf[] a = this.a;
                final AtomicLongArray b = this.b;
                final long[] c = this.c;
                final int length = c.length;
                int j = this.j;
                int length2 = 1;
            Label_0052:
                while (true) {
                    int n = 0;
                    int n2 = j;
                    while (!this.k) {
                        if (g.i()) {
                            for (int length3 = a.length, i = 0; i < length3; ++i) {
                                a[i].tx();
                            }
                            break Label_0716;
                        }
                        final long value = b.get(n2);
                        final long n3 = c[n2];
                        int n4 = 0;
                        Label_0263: {
                            if (value != n3 && b.get(length + n2) == 0L) {
                                try {
                                    final Object tw = g.tw();
                                    if (tw == null) {
                                        for (int length4 = a.length, k = 0; k < length4; ++k) {
                                            a[k].tx();
                                        }
                                        break Label_0716;
                                    }
                                    a[n2].tu(tw);
                                    c[n2] = n3 + 1L;
                                    n4 = 0;
                                    break Label_0263;
                                }
                                finally {
                                    asgz.c((Throwable)g);
                                    this.f.tt();
                                    length2 = a.length;
                                    for (int l = 0; l < length2; ++l) {
                                        a[l].b((Throwable)g);
                                    }
                                    break Label_0716;
                                }
                            }
                            n4 = n + 1;
                        }
                        j = ++n2;
                        if (n2 == length) {
                            j = 0;
                        }
                        n2 = j;
                        if ((n = n4) != length) {
                            continue;
                        }
                        n4 = this.get();
                        if (n4 != length2) {
                            length2 = n4;
                            continue Label_0052;
                        }
                        this.j = j;
                        n4 = this.addAndGet(-length2);
                        if ((length2 = n4) == 0) {
                            break Label_0716;
                        }
                        continue Label_0052;
                    }
                    g.c();
                    return;
                }
            }
            else {
                final askt g2 = this.g;
                final aukf[] a2 = this.a;
                final AtomicLongArray b2 = this.b;
                final long[] c2 = this.c;
                final int length5 = c2.length;
                int m = this.j;
                int m2 = this.m;
                int n5 = 1;
            Label_0368:
                while (true) {
                    int n6 = 0;
                    int n7 = m2;
                    while (!this.k) {
                        final boolean i2 = this.i;
                        if (i2) {
                            final Throwable h = this.h;
                            if (h != null) {
                                g2.c();
                                for (int length6 = a2.length, n8 = 0; n8 < length6; ++n8) {
                                    a2[n8].b(h);
                                }
                                break Label_0716;
                            }
                        }
                        final boolean i3 = g2.i();
                        Label_0678: {
                            Label_0653: {
                                Label_0599: {
                                    if (i2) {
                                        if (i3) {
                                            for (int length7 = a2.length, n9 = 0; n9 < length7; ++n9) {
                                                a2[n9].tx();
                                            }
                                            break Label_0716;
                                        }
                                    }
                                    else if (i3) {
                                        break Label_0599;
                                    }
                                    final long value2 = b2.get(m);
                                    final long n10 = c2[m];
                                    if (value2 == n10 || b2.get(length5 + m) != 0L) {
                                        break Label_0599;
                                    }
                                    try {
                                        final Object tw2 = g2.tw();
                                        if (tw2 != null) {
                                            a2[m].tu(tw2);
                                            c2[m] = n10 + 1L;
                                            final int n11 = n7 + 1;
                                            if ((n7 = n11) == this.e) {
                                                this.f.e((long)n11);
                                                n7 = 0;
                                            }
                                            break Label_0653;
                                        }
                                        break Label_0678;
                                    }
                                    finally {
                                        asgz.c((Throwable)g2);
                                        this.f.tt();
                                        for (m2 = a2.length, m = 0; m < m2; ++m) {
                                            a2[m].b((Throwable)g2);
                                        }
                                        break Label_0716;
                                    }
                                }
                                m2 = n6 + 1;
                            }
                            if (++m == length5) {
                                m = 0;
                            }
                            if (m2 != length5) {
                                n6 = m2;
                                continue;
                            }
                            m2 = n7;
                        }
                        int n12 = this.get();
                        if (n12 == n5) {
                            this.j = m;
                            this.m = m2;
                            if ((n12 = this.addAndGet(-n5)) == 0) {
                                break Label_0716;
                            }
                        }
                        n5 = n12;
                        continue Label_0368;
                    }
                    g2.c();
                    return;
                }
            }
        }
    }
    
    final void e() {
        final aukf[] a = this.a;
        int n;
        for (int length = a.length, i = 0; i < length; i = n) {
            if (this.k) {
                return;
            }
            final AtomicInteger l = this.l;
            n = i + 1;
            l.lazySet(n);
            a[i].f((aukg)new atdy(this, i, length));
        }
    }
    
    public final void f(final aukg f) {
        if (athz.i(this.f, f)) {
            this.f = f;
            if (f instanceof askq) {
                final askq askq = (askq)f;
                final int tv = askq.tv(7);
                if (tv == 1) {
                    this.n = 1;
                    this.g = (askt)askq;
                    this.i = true;
                    this.e();
                    this.d();
                    return;
                }
                if (tv == 2) {
                    this.n = 2;
                    this.g = (askt)askq;
                    this.e();
                    f.e((long)this.d);
                    return;
                }
            }
            this.g = (askt)new atgg(this.d);
            this.e();
            f.e((long)this.d);
        }
    }
    
    public final void tu(final Object o) {
        if (this.n == 0 && !this.g.j(o)) {
            this.f.tt();
            this.b(new asja("Queue is full?"));
            return;
        }
        this.d();
    }
    
    public final void tx() {
        this.i = true;
        this.d();
    }
}
