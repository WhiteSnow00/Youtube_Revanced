import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class atdh extends AtomicInteger implements asgw
{
    private static final long serialVersionUID = -4470634016609963609L;
    final aujp[] a;
    final AtomicLongArray b;
    final long[] c;
    final int d;
    final int e;
    aujq f;
    aske g;
    Throwable h;
    volatile boolean i;
    int j;
    volatile boolean k;
    final AtomicInteger l;
    int m;
    int n;
    
    public atdh(final aujp[] a, int length) {
        this.l = new AtomicInteger();
        this.a = a;
        this.d = length;
        this.e = length - (length >> 2);
        length = a.length;
        final int n = length + length;
        (this.b = new AtomicLongArray(n + 1)).lazySet(n, length);
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
        Label_0766: {
            if (this.n == 1) {
                final aske g = this.g;
                final aujp[] a = this.a;
                final AtomicLongArray b = this.b;
                final long[] c = this.c;
                final int length = c.length;
                int j = this.j;
                int length2 = 1;
            Label_0051:
                while (true) {
                    int n = 0;
                    int n2 = j;
                    while (!this.k) {
                        if (g.i()) {
                            for (int length3 = a.length, i = 0; i < length3; ++i) {
                                a[i].tu();
                            }
                            break Label_0766;
                        }
                        final long value = b.get(n2);
                        final long n3 = c[n2];
                        int n4 = 0;
                        Label_0265: {
                            if (value != n3 && b.get(length + n2) == 0L) {
                                try {
                                    final Object tt = g.tt();
                                    if (tt == null) {
                                        for (int length4 = a.length, k = 0; k < length4; ++k) {
                                            a[k].tu();
                                        }
                                        break Label_0766;
                                    }
                                    a[n2].tr(tt);
                                    c[n2] = n3 + 1L;
                                    n4 = 0;
                                    break Label_0265;
                                }
                                finally {
                                    asey.d((Throwable)g);
                                    this.f.tq();
                                    length2 = a.length;
                                    for (int l = 0; l < length2; ++l) {
                                        a[l].b((Throwable)g);
                                    }
                                    break Label_0766;
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
                            continue Label_0051;
                        }
                        this.j = j;
                        n4 = this.addAndGet(-length2);
                        if ((length2 = n4) == 0) {
                            break Label_0766;
                        }
                        continue Label_0051;
                    }
                    g.c();
                    return;
                }
            }
            else {
                final aske g2 = this.g;
                final aujp[] a2 = this.a;
                final AtomicLongArray b2 = this.b;
                final long[] c2 = this.c;
                final int length5 = c2.length;
                int m = this.j;
                int m2 = this.m;
                int n5 = 1;
            Label_0385:
                while (true) {
                    int n6 = 0;
                    while (!this.k) {
                        final boolean i2 = this.i;
                        if (i2) {
                            final Throwable h = this.h;
                            if (h != null) {
                                g2.c();
                                for (int length6 = a2.length, n7 = 0; n7 < length6; ++n7) {
                                    a2[n7].b(h);
                                }
                                break Label_0766;
                            }
                        }
                        final boolean i3 = g2.i();
                        int j2 = 0;
                        Label_0723: {
                            int n10 = 0;
                            Label_0681: {
                                Label_0566: {
                                    if (i2) {
                                        if (i3) {
                                            for (int length7 = a2.length, n8 = 0; n8 < length7; ++n8) {
                                                a2[n8].tu();
                                            }
                                            break Label_0766;
                                        }
                                    }
                                    else if (i3) {
                                        break Label_0566;
                                    }
                                    final long value2 = b2.get(m);
                                    final long n9 = c2[m];
                                    if (value2 == n9 || b2.get(length5 + m) != 0L) {
                                        break Label_0566;
                                    }
                                    try {
                                        final Object tt2 = g2.tt();
                                        if (tt2 == null) {
                                            j2 = m;
                                            break Label_0723;
                                        }
                                        a2[m].tr(tt2);
                                        c2[m] = n9 + 1L;
                                        n10 = ++m2;
                                        if (m2 == this.e) {
                                            this.f.e((long)m2);
                                            n10 = 0;
                                        }
                                        n6 = 0;
                                        break Label_0681;
                                    }
                                    finally {
                                        asey.d((Throwable)b2);
                                        this.f.tq();
                                        for (m2 = a2.length, m = 0; m < m2; ++m) {
                                            a2[m].b((Throwable)b2);
                                        }
                                        break Label_0766;
                                    }
                                }
                                ++n6;
                                n10 = m2;
                            }
                            if (++m == length5) {
                                m = 0;
                            }
                            j2 = m;
                            m2 = n10;
                            if (n6 != length5) {
                                m2 = n10;
                                continue;
                            }
                        }
                        int n11 = this.get();
                        if (n11 == n5) {
                            this.j = j2;
                            this.m = m2;
                            if ((n11 = this.addAndGet(-n5)) == 0) {
                                break Label_0766;
                            }
                        }
                        m = j2;
                        n5 = n11;
                        continue Label_0385;
                    }
                    g2.c();
                    return;
                }
            }
        }
    }
    
    final void e() {
        final aujp[] a = this.a;
        int n;
        for (int length = a.length, i = 0; i < length; i = n) {
            if (this.k) {
                return;
            }
            n = i + 1;
            this.l.lazySet(n);
            a[i].f((aujq)new atdg(this, i, length));
        }
    }
    
    public final void f(final aujq f) {
        if (athh.i(this.f, f)) {
            this.f = f;
            if (f instanceof askb) {
                final askb askb = (askb)f;
                final int ts = askb.ts(7);
                if (ts == 1) {
                    this.n = 1;
                    this.g = (aske)askb;
                    this.i = true;
                    this.e();
                    this.d();
                    return;
                }
                if (ts == 2) {
                    this.n = 2;
                    this.g = (aske)askb;
                    this.e();
                    f.e((long)this.d);
                    return;
                }
            }
            this.g = (aske)new atfo(this.d);
            this.e();
            f.e((long)this.d);
        }
    }
    
    public final void tr(final Object o) {
        if (this.n == 0 && !this.g.j(o)) {
            this.f.tq();
            this.b((Throwable)new asil("Queue is full?"));
            return;
        }
        this.d();
    }
    
    public final void tu() {
        this.i = true;
        this.d();
    }
}
