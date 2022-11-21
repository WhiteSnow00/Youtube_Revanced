import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bpt implements boz, bpb, brm, brp
{
    public final int a;
    public final int[] b;
    public final ayh[] c;
    public final boolean[] d;
    public final bpu e;
    public final boc f;
    public final boy[] g;
    public long h;
    boolean i;
    private final bpa j;
    private final brl k;
    private final brr l;
    private final ArrayList m;
    private final List n;
    private final boy o;
    private final bpm p;
    private bpp q;
    private ayh r;
    private bps s;
    private long t;
    private int u;
    private final trw v;
    
    public bpt(int i, int[] b, ayh[] c, final bpu e, final bpa j, final bri bri, final long n, final bkv bkv, final tun tun, final brl k, final boc f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = i;
        final int n2 = 0;
        if (b == null) {
            b = new int[0];
        }
        this.b = b;
        if (c == null) {
            c = new ayh[0];
        }
        this.c = c;
        this.e = e;
        this.j = j;
        this.f = f;
        this.k = k;
        this.l = new brr("ChunkSampleStream");
        this.v = new trw((byte[])null, (byte[])null, (byte[])null);
        final ArrayList m = new ArrayList();
        this.m = m;
        this.n = Collections.unmodifiableList((List<?>)m);
        final int length = b.length;
        this.g = new boy[length];
        this.d = new boolean[length];
        final int n3 = length + 1;
        final int[] array5 = new int[n3];
        final boy[] array6 = new boy[n3];
        final boy f2 = boy.F(bri, bkv, tun);
        this.o = f2;
        array5[0] = i;
        array6[0] = f2;
        boy d;
        int n4;
        for (i = n2; i < length; i = n4) {
            d = boy.D(bri);
            this.g[i] = d;
            n4 = i + 1;
            array6[n4] = d;
            array5[n4] = this.b[i];
        }
        this.p = new bpm(array5, array6);
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
        } while (((bpk)this.m.get(n3)).c(0) <= n);
        return n3 - 1;
    }
    
    private final bpk p(int n) {
        final bpk bpk = this.m.get(n);
        final ArrayList m = this.m;
        baz.Y(m, n, m.size());
        this.u = Math.max(this.u, this.m.size());
        final boy o = this.o;
        n = 0;
        o.s(bpk.c(0));
        while (true) {
            final boy[] g = this.g;
            if (n >= g.length) {
                break;
            }
            final boy boy = g[n];
            ++n;
            boy.s(bpk.c(n));
        }
        return bpk;
    }
    
    private final bpk q() {
        final ArrayList m = this.m;
        return (bpk)m.get(m.size() - 1);
    }
    
    private final void r() {
        final int l = this.l(this.o.g(), this.u - 1);
        while (true) {
            final int u = this.u;
            if (u > l) {
                break;
            }
            this.u = u + 1;
            final bpk bpk = this.m.get(u);
            final ayh h = bpk.h;
            if (!h.equals((Object)this.r)) {
                this.f.d(this.a, h, bpk.i, bpk.j, bpk.k);
            }
            this.r = h;
        }
    }
    
    private final void s() {
        this.o.w();
        final boy[] g = this.g;
        for (int length = g.length, i = 0; i < length; ++i) {
            g[i].w();
        }
    }
    
    private final boolean t(int n) {
        final bpk bpk = this.m.get(n);
        if (this.o.g() <= bpk.c(0)) {
            n = 0;
            boy[] g;
            do {
                g = this.g;
                if (n < g.length) {
                    continue;
                }
                return false;
            } while (g[n].g() <= bpk.c(++n));
            return true;
        }
        return true;
    }
    
    @Override
    public final int a(final long n) {
        if (this.k()) {
            return 0;
        }
        final int h = this.o.h(n, this.i);
        this.o.y(h);
        this.r();
        return h;
    }
    
    @Override
    public final void b() {
        this.l.a();
        this.o.t();
        if (!this.l.g()) {
            this.e.e();
        }
    }
    
    @Override
    public final long c() {
        if (this.i) {
            return Long.MIN_VALUE;
        }
        if (this.k()) {
            return this.t;
        }
        final long h = this.h;
        bpk q;
        if (!(q = this.q()).h()) {
            if (this.m.size() > 1) {
                final ArrayList m = this.m;
                q = (bpk)m.get(m.size() - 2);
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
    
    @Override
    public final long d() {
        if (this.k()) {
            return this.t;
        }
        if (this.i) {
            return Long.MIN_VALUE;
        }
        return this.q().l;
    }
    
    @Override
    public final int e(final bxf bxf, final bde bde, final int n) {
        if (this.k()) {
            return -3;
        }
        this.r();
        return this.o.E(bxf, bde, n, this.i);
    }
    
    public final long f(final long n, final bfx bfx) {
        return this.e.d(n, bfx);
    }
    
    public final void g(long l, final boolean b) {
        if (this.k()) {
            return;
        }
        final boy o = this.o;
        final int c = o.c;
        o.p(l, b, true);
        final boy o2 = this.o;
        final int c2 = o2.c;
        if (c2 > c) {
            l = o2.l();
            int n = 0;
            while (true) {
                final boy[] g = this.g;
                if (n >= g.length) {
                    break;
                }
                g[n].p(l, b, this.d[n]);
                ++n;
            }
        }
        final int min = Math.min(this.l(c2, 0), this.u);
        if (min > 0) {
            baz.Y(this.m, 0, min);
            this.u -= min;
        }
    }
    
    public final void h() {
        this.i(null);
    }
    
    public final void i(final bps s) {
        this.s = s;
        this.o.u();
        final boy[] g = this.g;
        for (int length = g.length, i = 0; i < length; ++i) {
            g[i].u();
        }
        this.l.e(this);
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
        bpk bpk2;
        while (true) {
            final int size = this.m.size();
            final bpk bpk = bpk2 = null;
            if (n3 >= size) {
                break;
            }
            bpk2 = this.m.get(n3);
            final long k = bpk2.k;
            if (k == t && bpk2.a == -9223372036854775807L) {
                break;
            }
            if (k > t) {
                bpk2 = bpk;
                break;
            }
            ++n3;
        }
        boolean b;
        if (bpk2 != null) {
            b = this.o.B(bpk2.c(0));
        }
        else {
            b = this.o.C(t, t < this.d());
        }
        if (b) {
            this.u = this.l(this.o.g(), 0);
            final boy[] g = this.g;
            for (int length = g.length, i = n2; i < length; ++i) {
                g[i].C(t, true);
            }
            return;
        }
        this.t = t;
        this.i = false;
        this.m.clear();
        this.u = 0;
        final brr l = this.l;
        if (l.g()) {
            this.o.q();
            final boy[] g2 = this.g;
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
    
    @Override
    public final void kY(final bro bro, final long n, final long n2) {
        final bpp bpp = (bpp)bro;
        this.q = null;
        this.e.f(bpp);
        final bnr bnr = new bnr(bpp.e, bpp.f, bpp.e());
        this.k.b(bpp.e);
        this.f.i(bnr, bpp.g, this.a, bpp.h, bpp.i, bpp.j, bpp.k, bpp.l);
        this.j.b(this);
    }
    
    @Override
    public final yrd kZ(final bro bro, final IOException ex, final int n) {
        final bpp bpp = (bpp)bro;
        final long e = bpp.e();
        final boolean b = bpp instanceof bpk;
        final int n2 = this.m.size() - 1;
        final boolean b2 = e == 0L || !b || !this.t(n2);
        final bnr bnr = new bnr(bpp.e, bpp.f, e);
        final int g = bpp.g;
        final ayh h = bpp.h;
        final int i = bpp.i;
        final Object j = bpp.j;
        final long k = bpp.k;
        final int a = baz.a;
        final long l = bpp.l;
        final tun tun = new tun(bnr, ex, n);
        yrd d = null;
        Label_0245: {
            if (this.e.j(bpp, b2, tun, this.k)) {
                if (b2) {
                    final yrd yrd = d = brr.d;
                    if (!b) {
                        break Label_0245;
                    }
                    bad.f(this.p(n2) == bpp);
                    d = yrd;
                    if (this.m.isEmpty()) {
                        this.t = this.h;
                        d = yrd;
                    }
                    break Label_0245;
                }
                else {
                    baq.c("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                }
            }
            d = null;
        }
        yrd yrd2;
        if ((yrd2 = d) == null) {
            final long c = this.k.c(tun);
            if (c != -9223372036854775807L) {
                yrd2 = brr.i(false, c);
            }
            else {
                yrd2 = brr.e;
            }
        }
        final boolean b3 = yrd2.c() ^ true;
        this.f.l(bnr, bpp.g, this.a, bpp.h, bpp.i, bpp.j, bpp.k, bpp.l, ex, b3);
        if (b3) {
            this.q = null;
            this.k.b(bpp.e);
            this.j.b(this);
        }
        return yrd2;
    }
    
    @Override
    public final boolean la() {
        return !this.k() && this.o.A(this.i);
    }
    
    @Override
    public final void lb(final bro bro, final boolean b) {
        final bpp bpp = (bpp)bro;
        this.q = null;
        final bnr bnr = new bnr(bpp.e, bpp.f, bpp.e());
        this.k.b(bpp.e);
        this.f.f(bnr, bpp.g, this.a, bpp.h, bpp.i, bpp.j, bpp.k, bpp.l);
        if (!b) {
            if (this.k()) {
                this.s();
            }
            else if (bpp instanceof bpk) {
                this.p(this.m.size() - 1);
                if (this.m.isEmpty()) {
                    this.t = this.h;
                }
            }
            this.j.b(this);
        }
    }
    
    @Override
    public final void m(long l) {
        final brr i = this.l;
        if (!i.f()) {
            if (!this.k()) {
                if (i.g()) {
                    final bpp q = this.q;
                    bad.b(q);
                    if (q instanceof bpk && this.t(this.m.size() - 1)) {
                        return;
                    }
                    this.e.h();
                }
                else {
                    int j = this.e.c(l, this.n);
                    if (j < this.m.size()) {
                        bad.f(this.l.g() ^ true);
                        while (true) {
                            while (j < this.m.size()) {
                                if (!this.t(j)) {
                                    if (j == -1) {
                                        return;
                                    }
                                    l = this.q().l;
                                    final bpk p = this.p(j);
                                    if (this.m.isEmpty()) {
                                        this.t = this.h;
                                    }
                                    this.i = false;
                                    final boc f = this.f;
                                    f.o(new bnw(1, this.a, null, 3, null, f.a(p.k), f.a(l)));
                                    return;
                                }
                                else {
                                    ++j;
                                }
                            }
                            j = -1;
                            continue;
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public final boolean n(long t) {
        final boolean i = this.i;
        final int n = 0;
        if (!i) {
            final brr l = this.l;
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
                    this.e.i(t, n2, list, this.v);
                    final trw v = this.v;
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
                    final bpp q = (bpp)b;
                    this.q = q;
                    if (b instanceof bpk) {
                        final bpk bpk = (bpk)b;
                        if (k) {
                            final long j = bpk.k;
                            t = this.t;
                            if (j != t) {
                                this.o.d = t;
                                final boy[] g = this.g;
                                for (int length = g.length, n3 = 0; n3 < length; ++n3) {
                                    g[n3].d = this.t;
                                }
                            }
                            this.t = -9223372036854775807L;
                        }
                        final bpm p = this.p;
                        bpk.c = p;
                        final int[] d = new int[p.a.length];
                        int n4 = n;
                        while (true) {
                            final boy[] a2 = p.a;
                            if (n4 >= a2.length) {
                                break;
                            }
                            d[n4] = a2[n4].i();
                            ++n4;
                        }
                        bpk.d = d;
                        this.m.add(bpk);
                    }
                    else if (b instanceof bpw) {
                        ((bpw)b).a = this.p;
                    }
                    this.l.h((bro)b, this, this.k.a(q.g));
                    this.f.n(new bnr(q.e, q.f), q.g, this.a, q.h, q.i, q.j, q.k, q.l);
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final boolean o() {
        return this.l.g();
    }
    
    @Override
    public final void w() {
        this.o.v();
        final boy[] g = this.g;
        for (int length = g.length, i = 0; i < length; ++i) {
            g[i].v();
        }
        this.e.g();
        final bps s = this.s;
        if (s != null) {
            s.k(this);
        }
    }
}
