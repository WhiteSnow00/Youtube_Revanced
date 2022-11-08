import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bpp implements bov, box, bri, brl
{
    public final int a;
    public final int[] b;
    public final ayf[] c;
    public final boolean[] d;
    public final bpq e;
    public final bny f;
    public final bou[] g;
    public long h;
    boolean i;
    private final bow j;
    private final brh k;
    private final brn l;
    private final ArrayList m;
    private final List n;
    private final bou o;
    private final bpi p;
    private bpl q;
    private ayf r;
    private bpo s;
    private long t;
    private int u;
    private final toq v;
    
    public bpp(int i, int[] b, ayf[] c, final bpq e, final bow j, final bre bre, final long n, final bkr bkr, final trg trg, final brh k, final bny f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = i;
        final int n2 = 0;
        if (b == null) {
            b = new int[0];
        }
        this.b = b;
        if (c == null) {
            c = new ayf[0];
        }
        this.c = c;
        this.e = e;
        this.j = j;
        this.f = f;
        this.k = k;
        this.l = new brn("ChunkSampleStream");
        this.v = new toq((byte[])null, (byte[])null, (byte[])null);
        final ArrayList m = new ArrayList();
        this.m = m;
        this.n = Collections.unmodifiableList((List<?>)m);
        final int length = b.length;
        this.g = new bou[length];
        this.d = new boolean[length];
        final int n3 = length + 1;
        b = new int[n3];
        final bou[] array5 = new bou[n3];
        final bou f2 = bou.F(bre, bkr, trg);
        this.o = f2;
        b[0] = i;
        array5[0] = f2;
        bou d;
        int n4;
        for (i = n2; i < length; i = n4) {
            d = bou.D(bre);
            this.g[i] = d;
            n4 = i + 1;
            array5[n4] = d;
            b[n4] = this.b[i];
        }
        this.p = new bpi(b, array5);
        this.t = n;
        this.h = n;
    }
    
    private final int l(final int n, int n2) {
        int n3;
        do {
            n3 = n2 + 1;
            if (n3 >= this.m.size()) {
                return this.m.size() - 1;
            }
            n2 = n3;
        } while (((bpg)this.m.get(n3)).c(0) <= n);
        return n3 - 1;
    }
    
    private final bpg p(int n) {
        final bpg bpg = this.m.get(n);
        final ArrayList m = this.m;
        baw.Y(m, n, m.size());
        this.u = Math.max(this.u, this.m.size());
        final bou o = this.o;
        n = 0;
        o.s(bpg.c(0));
        while (true) {
            final bou[] g = this.g;
            if (n >= g.length) {
                break;
            }
            final int n2 = n + 1;
            g[n].s(bpg.c(n2));
            n = n2;
        }
        return bpg;
    }
    
    private final bpg q() {
        final ArrayList m = this.m;
        return (bpg)m.get(m.size() - 1);
    }
    
    private final void r() {
        final int l = this.l(this.o.g(), this.u - 1);
        while (true) {
            final int u = this.u;
            if (u > l) {
                break;
            }
            this.u = u + 1;
            final bpg bpg = this.m.get(u);
            final ayf h = bpg.h;
            if (!h.equals((Object)this.r)) {
                this.f.d(this.a, h, bpg.i, bpg.j, bpg.k);
            }
            this.r = h;
        }
    }
    
    private final void s() {
        this.o.w();
        final bou[] g = this.g;
        for (int length = g.length, i = 0; i < length; ++i) {
            g[i].w();
        }
    }
    
    private final boolean t(int n) {
        final bpg bpg = this.m.get(n);
        if (this.o.g() > bpg.c(0)) {
            return true;
        }
        n = 0;
        while (true) {
            final bou[] g = this.g;
            if (n >= g.length) {
                return false;
            }
            final int n2 = n + 1;
            if (g[n].g() > bpg.c(n2)) {
                return true;
            }
            n = n2;
        }
    }
    
    public final int a(final long n) {
        if (this.k()) {
            return 0;
        }
        final int h = this.o.h(n, this.i);
        this.o.y(h);
        this.r();
        return h;
    }
    
    public final void b() {
        this.l.a();
        this.o.t();
        if (!this.l.g()) {
            this.e.e();
        }
    }
    
    public final long c() {
        if (this.i) {
            return Long.MIN_VALUE;
        }
        if (this.k()) {
            return this.t;
        }
        final long h = this.h;
        bpg q;
        if (!(q = this.q()).h()) {
            if (this.m.size() > 1) {
                final ArrayList m = this.m;
                q = (bpg)m.get(m.size() - 2);
            }
            else {
                q = null;
            }
        }
        long max = h;
        if (q != null) {
            max = Math.max(h, q.l);
        }
        return Math.max(max, this.o.m());
    }
    
    public final long d() {
        if (this.k()) {
            return this.t;
        }
        if (this.i) {
            return Long.MIN_VALUE;
        }
        return this.q().l;
    }
    
    public final int e(final bxb bxb, final bdb bdb, final int n) {
        if (this.k()) {
            return -3;
        }
        this.r();
        return this.o.E(bxb, bdb, n, this.i);
    }
    
    public final long f(final long n, final bfu bfu) {
        return this.e.d(n, bfu);
    }
    
    public final void g(long l, final boolean b) {
        if (this.k()) {
            return;
        }
        final bou o = this.o;
        final int c = o.c;
        o.p(l, b, true);
        final bou o2 = this.o;
        final int c2 = o2.c;
        if (c2 > c) {
            l = o2.l();
            int n = 0;
            while (true) {
                final bou[] g = this.g;
                if (n >= g.length) {
                    break;
                }
                g[n].p(l, b, this.d[n]);
                ++n;
            }
        }
        final int min = Math.min(this.l(c2, 0), this.u);
        if (min > 0) {
            baw.Y(this.m, 0, min);
            this.u -= min;
        }
    }
    
    public final void h() {
        this.i(null);
    }
    
    public final void i(final bpo s) {
        this.s = s;
        this.o.u();
        final bou[] g = this.g;
        for (int length = g.length, i = 0; i < length; ++i) {
            g[i].u();
        }
        this.l.e((brl)this);
    }
    
    public final void j(final long t) {
        this.h = t;
        if (this.k()) {
            this.t = t;
            return;
        }
        final int n = 0;
        final int n2 = 0;
        int n3 = 0;
        bpg bpg2;
        while (true) {
            final int size = this.m.size();
            final bpg bpg = bpg2 = null;
            if (n3 >= size) {
                break;
            }
            bpg2 = this.m.get(n3);
            final long k = bpg2.k;
            if (k == t && bpg2.a == -9223372036854775807L) {
                break;
            }
            if (k > t) {
                bpg2 = bpg;
                break;
            }
            ++n3;
        }
        boolean b;
        if (bpg2 != null) {
            b = this.o.B(bpg2.c(0));
        }
        else {
            b = this.o.C(t, t < this.d());
        }
        if (b) {
            this.u = this.l(this.o.g(), 0);
            final bou[] g = this.g;
            for (int length = g.length, i = n2; i < length; ++i) {
                g[i].C(t, true);
            }
            return;
        }
        this.t = t;
        this.i = false;
        this.m.clear();
        this.u = 0;
        final brn l = this.l;
        if (l.g()) {
            this.o.q();
            final bou[] g2 = this.g;
            for (int length2 = g2.length, j = n; j < length2; ++j) {
                g2[j].q();
            }
            this.l.b();
            return;
        }
        l.c();
        this.s();
    }
    
    final boolean k() {
        return this.t != -9223372036854775807L;
    }
    
    public final boolean la() {
        return !this.k() && this.o.A(this.i);
    }
    
    public final void m(long l) {
        final brn i = this.l;
        if (!i.f()) {
            if (!this.k()) {
                if (i.g()) {
                    final bpl q = this.q;
                    dk.d((Object)q);
                    if (q instanceof bpg && this.t(this.m.size() - 1)) {
                        return;
                    }
                    this.e.h();
                }
                else {
                    int j = this.e.c(l, this.n);
                    if (j < this.m.size()) {
                        dk.h(this.l.g() ^ true);
                        while (true) {
                            while (j < this.m.size()) {
                                final int n = j;
                                if (this.t(j)) {
                                    ++j;
                                }
                                else {
                                    if (n == -1) {
                                        return;
                                    }
                                    l = this.q().l;
                                    final bpg p = this.p(n);
                                    if (this.m.isEmpty()) {
                                        this.t = this.h;
                                    }
                                    this.i = false;
                                    final bny f = this.f;
                                    f.o(new bns(1, this.a, (ayf)null, 3, (Object)null, f.a(p.k), f.a(l)));
                                    return;
                                }
                            }
                            final int n = -1;
                            continue;
                        }
                    }
                }
            }
        }
    }
    
    public final boolean n(long t) {
        final boolean i = this.i;
        final int n = 0;
        if (!i) {
            final brn l = this.l;
            if (!l.g()) {
                if (!l.f()) {
                    final boolean k = this.k();
                    List<Object> list;
                    long n2;
                    if (k) {
                        list = Collections.emptyList();
                        n2 = this.t;
                    }
                    else {
                        list = this.n;
                        n2 = this.q().l;
                    }
                    this.e.i(t, n2, (List)list, this.v);
                    final toq v = this.v;
                    final boolean a = v.a;
                    final Object b = v.b;
                    v.b = null;
                    v.a = false;
                    if (a) {
                        this.t = -9223372036854775807L;
                        return this.i = true;
                    }
                    if (b == null) {
                        return false;
                    }
                    final bpl q = (bpl)b;
                    this.q = q;
                    if (b instanceof bpg) {
                        final bpg bpg = (bpg)b;
                        if (k) {
                            final long j = bpg.k;
                            t = this.t;
                            if (j != t) {
                                this.o.d = t;
                                final bou[] g = this.g;
                                for (int length = g.length, n3 = 0; n3 < length; ++n3) {
                                    g[n3].d = this.t;
                                }
                            }
                            this.t = -9223372036854775807L;
                        }
                        final bpi p = this.p;
                        bpg.c = p;
                        final int[] d = new int[p.a.length];
                        int n4 = n;
                        while (true) {
                            final bou[] a2 = p.a;
                            if (n4 >= a2.length) {
                                break;
                            }
                            d[n4] = a2[n4].i();
                            ++n4;
                        }
                        bpg.d = d;
                        this.m.add(bpg);
                    }
                    else if (b instanceof bps) {
                        ((bps)b).a = (bpm)this.p;
                    }
                    this.l.h((brk)b, (bri)this, this.k.a(q.g));
                    this.f.n(new bnn(q.e, q.f), q.g, this.a, q.h, q.i, q.j, q.k, q.l);
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean o() {
        return this.l.g();
    }
    
    public final void w() {
        this.o.v();
        final bou[] g = this.g;
        for (int length = g.length, i = 0; i < length; ++i) {
            g[i].v();
        }
        this.e.g();
        final bpo s = this.s;
        if (s != null) {
            s.k(this);
        }
    }
}
