import java.util.HashSet;
import android.os.SystemClock;
import java.util.Map;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bja implements bim
{
    protected final biy[] a;
    private final brp b;
    private final int[] c;
    private final int d;
    private final bbl e;
    private final long f;
    private final bjd g;
    private bqw h;
    private bjh i;
    private int j;
    private IOException k;
    private boolean l;
    private final des m;
    
    public bja(final brp b, final bjh i, final des m, int j, final int[] c, final bqw h, final int d, final bbl e, long c2, final boolean b2, final List list, final bjd g, final byte[] array, final byte[] array2) {
        this.b = b;
        this.i = i;
        this.m = m;
        this.c = c;
        this.h = h;
        this.d = d;
        this.e = e;
        this.j = j;
        this.f = c2;
        this.g = g;
        c2 = i.c(j);
        final ArrayList k = this.m();
        this.a = new biy[h.g()];
        bjp bjp;
        bjg b3;
        biy[] a;
        bjg bjg;
        ayg d2;
        String l;
        bpl bpl;
        Object o;
        int n;
        for (j = 0; j < this.a.length; ++j) {
            bjp = (bjp)k.get(h.b(j));
            b3 = m.b((List)bjp.e);
            a = this.a;
            if ((bjg = b3) == null) {
                bjg = (bjg)bjp.e.get(0);
            }
            d2 = bjp.d;
            l = d2.m;
            if (ayz.l(l)) {
                bpl = null;
            }
            else {
                if (ayz.k(l)) {
                    o = new bvr(1);
                }
                else {
                    if (!b2) {
                        n = 0;
                    }
                    else {
                        n = 4;
                    }
                    o = new bwm(n, list, (bud)g);
                }
                bpl = new bpl((btj)o, d, d2);
            }
            a[j] = new biy(c2, bjp, bjg, bpl, 0L, bjp.k());
        }
    }
    
    private final long k(final long n) {
        final bjh i = this.i;
        final long a = i.a;
        if (a == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return n - bax.w(a + i.d(this.j).a);
    }
    
    private final biy l(final int n) {
        final biy biy = this.a[n];
        final bjg b = this.m.b((List)biy.a.e);
        if (b != null && !b.equals(biy.b)) {
            return this.a[n] = new biy(biy.d, biy.a, b, biy.f, biy.e, biy.c);
        }
        return biy;
    }
    
    private final ArrayList m() {
        final Object d = this.i.d(this.j).d;
        final ArrayList list = new ArrayList();
        final int[] c = this.c;
        for (int length = c.length, i = 0; i < length; ++i) {
            list.addAll(((List<bjf>)d).get(c[i]).c);
        }
        return list;
    }
    
    private static final long n(final biy biy, final bpu bpu, long n, final long n2, final long n3) {
        if (bpu != null) {
            n = bpu.f();
        }
        else {
            n = bax.r(biy.f(n), n2, n3);
        }
        return n;
    }
    
    public final void a(bjh k, int i) {
        Label_0418: {
            try {
                this.i = (bjh)k;
                this.j = i;
                final long c = ((bjh)k).c(i);
                final ArrayList m = this.m();
                bjp bjp;
                biy[] a;
                biy biy;
                biw j;
                long f;
                long d;
                long h;
                long n;
                long n2;
                long d2;
                long h2;
                long e;
                long n3;
                for (i = 0; i < this.a.length; ++i) {
                    bjp = (bjp)m.get(this.h.b(i));
                    a = this.a;
                    biy = a[i];
                    k = (bmt)biy.a.k();
                    j = bjp.k();
                    Label_0395: {
                        while (true) {
                            Label_0123: {
                                if (k != null) {
                                    break Label_0123;
                                }
                                try {
                                    k = (bmt)new biy(c, bjp, biy.b, biy.f, biy.e, null);
                                    break Label_0395;
                                }
                                catch (final bmt k) {
                                    break Label_0418;
                                }
                            }
                            if (!((biw)k).j()) {
                                k = (bmt)new biy(c, bjp, biy.b, biy.f, biy.e, j);
                                continue;
                            }
                            f = ((biw)k).f(c);
                            if (f == 0L) {
                                k = (bmt)new biy(c, bjp, biy.b, biy.f, biy.e, j);
                                continue;
                            }
                            break;
                        }
                        d = ((biw)k).d();
                        h = ((biw)k).h(d);
                        n = f + d - 1L;
                        n2 = ((biw)k).h(n) + ((biw)k).b(n, c);
                        d2 = j.d();
                        h2 = j.h(d2);
                        e = biy.e;
                        if (n2 == h2) {
                            n3 = e + (n + 1L - d2);
                        }
                        else {
                            if (n2 < h2) {
                                k = new bmt();
                                throw k;
                            }
                            if (h2 < h) {
                                n3 = e - (j.g(h, c) - d);
                            }
                            else {
                                n3 = e + (((biw)k).g(h2, c) - d2);
                            }
                        }
                        k = (bmt)new biy(c, bjp, biy.b, biy.f, n3, j);
                    }
                    a[i] = (biy)k;
                }
                return;
            }
            catch (final bmt bmt) {}
        }
        this.k = k;
    }
    
    public final void b(final bqw h) {
        this.h = h;
    }
    
    public final int c(final long n, final List list) {
        if (this.k == null && this.h.g() >= 2) {
            return this.h.a(n, list);
        }
        return list.size();
    }
    
    public final long d(final long n, final bfv bfv) {
        for (final biy biy : this.a) {
            if (biy.c != null) {
                final long f = biy.f(n);
                final long g = biy.g(f);
                final long d = biy.d();
                long g2;
                if (g < n && (d == -1L || f < biy.b() + d - 1L)) {
                    g2 = biy.g(f + 1L);
                }
                else {
                    g2 = g;
                }
                return bfv.a(n, g, g2);
            }
        }
        return n;
    }
    
    public final void e() {
        final IOException k = this.k;
        if (k == null) {
            this.b.a();
            return;
        }
        throw k;
    }
    
    public final void f(final bpm bpm) {
        if (bpm instanceof bpt) {
            final int f = this.h.f(((bpt)bpm).h);
            final biy biy = this.a[f];
            if (biy.c == null) {
                final btb a = biy.f.a();
                if (a != null) {
                    final biy[] a2 = this.a;
                    final bjp a3 = biy.a;
                    a2[f] = new biy(biy.d, a3, biy.b, biy.f, biy.e, (biw)new bix(a, a3.f));
                }
            }
        }
        final bjd g = this.g;
        if (g != null) {
            final long b = g.b;
            if (b == -9223372036854775807L || bpm.l > b) {
                g.b = bpm.l;
            }
            g.c.e = true;
        }
    }
    
    public final void g() {
        final biy[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            final bpl f = a[i].f;
            if (f != null) {
                f.c();
            }
        }
    }
    
    public final void h() {
        if (this.k != null) {
            return;
        }
        this.h.r();
    }
    
    public final void i(long n, long n2, final List list, final tqv tqv) {
        if (this.k != null) {
            return;
        }
        final long w = bax.w(this.i.a);
        final long w2 = bax.w(this.i.d(this.j).a);
        final bjd g = this.g;
        if (g != null) {
            final bje c = g.c;
            final bjh d = c.d;
            if (d.d) {
                if (c.f) {
                    return;
                }
                final Map.Entry<Long, Object> ceilingEntry = c.c.ceilingEntry(d.h);
                if (ceilingEntry != null && ceilingEntry.getValue() < w + w2 + n2) {
                    n2 = ceilingEntry.getKey();
                    final biv biv = (biv)c.i.a;
                    n = biv.n;
                    if (n == -9223372036854775807L || n < n2) {
                        biv.n = n2;
                    }
                    c.a();
                    return;
                }
            }
        }
        final long w3 = bax.w(bax.t(this.f));
        final long k = this.k(w3);
        bpu bpu;
        if (list.isEmpty()) {
            bpu = null;
        }
        else {
            bpu = list.get(list.size() - 1);
        }
        final int g2 = this.h.g();
        final bpw[] array = new bpw[g2];
        for (int i = 0; i < g2; ++i) {
            final biy biy = this.a[i];
            if (biy.c == null) {
                array[i] = bpw.b;
            }
            else {
                final long a = biy.a(w3);
                final long c2 = biy.c(w3);
                final long n3 = n(biy, bpu, n2, a, c2);
                if (n3 < a) {
                    array[i] = bpw.b;
                }
                else {
                    array[i] = (bpw)new biz(this.l(i), n3, c2);
                }
            }
        }
        long max;
        if (!this.i.d) {
            max = -9223372036854775807L;
        }
        else {
            max = Math.max(0L, Math.min(this.k(w3), this.a[0].e(this.a[0].c(w3))) - n);
        }
        this.h.o(n, n2 - n, max, list, array);
        final biy l = this.l(this.h.c());
        final bpl f = l.f;
        if (f != null) {
            final bjp a2 = l.a;
            bjm h;
            if (f.a == null) {
                h = a2.h;
            }
            else {
                h = null;
            }
            bjm j;
            if (l.c == null) {
                j = a2.l();
            }
            else {
                j = null;
            }
            if (h != null || j != null) {
                final bbl e = this.e;
                final ayg m = this.h.i();
                final int d2 = this.h.d();
                final Object k2 = this.h.k();
                final bjp a3 = l.a;
                bjm b = j;
                Label_0639: {
                    if (h != null) {
                        b = h.b(j, l.b.a);
                        if (b == null) {
                            break Label_0639;
                        }
                    }
                    h = b;
                }
                tqv.b = new bpt(e, bhq.b(a3, l.b.a, h, 0), m, d2, k2, l.f);
                return;
            }
        }
        n = l.d;
        final boolean b2 = n != -9223372036854775807L;
        if (l.d() == 0L) {
            tqv.a = b2;
            return;
        }
        final long a4 = l.a(w3);
        final long c3 = l.c(w3);
        final long n4 = n(l, bpu, n2, a4, c3);
        if (n4 < a4) {
            this.k = new bmt();
            return;
        }
        if (n4 > c3 || (this.l && n4 >= c3)) {
            tqv.a = b2;
            return;
        }
        if (b2 && l.g(n4) >= n) {
            tqv.a = true;
            return;
        }
        int n6;
        int n5 = n6 = (int)Math.min(1L, c3 - n4 + 1L);
        if (n != -9223372036854775807L) {
            while ((n5 = n6) > 1) {
                n5 = n6;
                if (l.g(n6 + n4 - 1L) < n) {
                    break;
                }
                --n6;
            }
        }
        if (!list.isEmpty()) {
            n = -9223372036854775807L;
        }
        else {
            n = n2;
        }
        final bbl e2 = this.e;
        final int d3 = this.d;
        final ayg i2 = this.h.i();
        final int d4 = this.h.d();
        final Object k3 = this.h.k();
        final bjp a5 = l.a;
        final long g3 = l.g(n4);
        bjm h2 = l.h(n4);
        bph b3;
        if (l.f == null) {
            n = l.e(n4);
            int n7;
            if (!l.i(n4, k)) {
                n7 = 8;
            }
            else {
                n7 = 0;
            }
            b3 = new bpx(e2, bhq.b(a5, l.b.a, h2, n7), i2, d4, k3, g3, n, n4, d3, i2);
        }
        else {
            int n8 = 1;
            int n9 = 1;
            while (n8 < n5) {
                final bjm b4 = h2.b(l.h(n8 + n4), l.b.a);
                if (b4 == null) {
                    break;
                }
                ++n9;
                ++n8;
                h2 = b4;
            }
            final long n10 = n9 + n4 - 1L;
            final long e3 = l.e(n10);
            n2 = l.d;
            if (n2 == -9223372036854775807L || n2 > e3) {
                n2 = -9223372036854775807L;
            }
            int n11;
            if (!l.i(n10, k)) {
                n11 = 8;
            }
            else {
                n11 = 0;
            }
            b3 = new bps(e2, bhq.b(a5, l.b.a, h2, n11), i2, d4, k3, g3, e3, n, n2, n4, n9, -a5.f, l.f);
        }
        tqv.b = b3;
    }
    
    public final boolean j(final bpm bpm, final boolean b, final ttl ttl, final bri bri) {
        if (!b) {
            return false;
        }
        final bjd g = this.g;
        Label_0096: {
            if (g != null) {
                final long b2 = g.b;
                final boolean b3 = b2 != -9223372036854775807L && b2 < bpm.k;
                final bje c = g.c;
                if (c.d.d) {
                    if (!c.f) {
                        if (!b3) {
                            break Label_0096;
                        }
                        c.a();
                    }
                    return true;
                }
            }
        }
        if (!this.i.d && bpm instanceof bpu) {
            final Object b4 = ttl.b;
            if (b4 instanceof bce && ((bce)b4).d == 404) {
                final biy biy = this.a[this.h.f(bpm.h)];
                final long d = biy.d();
                if (d != -1L && d != 0L) {
                    if (((bpu)bpm).f() > biy.b() + d - 1L) {
                        return this.l = true;
                    }
                }
            }
        }
        final biy biy2 = this.a[this.h.f(bpm.h)];
        final bjg b5 = this.m.b((List)biy2.a.e);
        if (b5 != null && !biy2.b.equals(b5)) {
            return true;
        }
        final bqw h = this.h;
        final afeq e = biy2.a.e;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final int g2 = h.g();
        int i = 0;
        int n = 0;
        while (i < g2) {
            int n2 = n;
            if (h.q(i, elapsedRealtime)) {
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        final HashSet set = new HashSet();
        for (int j = 0; j < ((List)e).size(); ++j) {
            set.add(((bjg)((List)e).get(j)).c);
        }
        final int size = set.size();
        final des m = this.m;
        final HashSet set2 = new HashSet();
        final List c2 = m.c((List)e);
        for (int k = 0; k < c2.size(); ++k) {
            set2.add(((bjg)c2.get(k)).c);
        }
        final bwj bwj = new bwj(size, size - set2.size(), g2, n);
        if (!bwj.a(2) && !bwj.a(1)) {
            return false;
        }
        final ypi d2 = bri.d(bwj, ttl);
        if (d2 != null) {
            final int b6 = d2.b;
            if (bwj.a(b6)) {
                if (b6 == 2) {
                    final bqw h2 = this.h;
                    return h2.p(h2.f(bpm.h), d2.a);
                }
                final des l = this.m;
                final bjg b7 = biy2.b;
                final long n3 = SystemClock.elapsedRealtime() + d2.a;
                des.d(b7.b, n3, (Map)l.c);
                final int c3 = b7.c;
                if (c3 != Integer.MIN_VALUE) {
                    des.d(c3, n3, (Map)l.b);
                }
                return true;
            }
        }
        return false;
    }
}
