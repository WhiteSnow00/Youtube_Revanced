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

public final class biz implements bil
{
    protected final bix[] a;
    private final bro b;
    private final int[] c;
    private final int d;
    private final bbk e;
    private final long f;
    private final bjc g;
    private bqv h;
    private bjg i;
    private int j;
    private IOException k;
    private boolean l;
    private final der m;
    
    public biz(final bro b, final bjg i, final der m, int j, final int[] c, final bqv h, final int d, final bbk e, long c2, final boolean b2, final List list, final bjc g, final byte[] array, final byte[] array2) {
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
        this.a = new bix[h.g()];
        bjo bjo;
        bjf b3;
        bix[] a;
        bjf bjf;
        ayf d2;
        String l;
        bpk bpk;
        Object o;
        int n;
        for (j = 0; j < this.a.length; ++j) {
            bjo = (bjo)k.get(h.b(j));
            b3 = m.b((List)bjo.e);
            a = this.a;
            if ((bjf = b3) == null) {
                bjf = (bjf)bjo.e.get(0);
            }
            d2 = bjo.d;
            l = d2.m;
            if (ayy.l(l)) {
                bpk = null;
            }
            else {
                if (ayy.k(l)) {
                    o = new bvq(1);
                }
                else {
                    if (!b2) {
                        n = 0;
                    }
                    else {
                        n = 4;
                    }
                    o = new bwl(n, list, (buc)g);
                }
                bpk = new bpk((bti)o, d, d2);
            }
            a[j] = new bix(c2, bjo, bjf, bpk, 0L, bjo.k());
        }
    }
    
    private final long k(final long n) {
        final bjg i = this.i;
        final long a = i.a;
        if (a == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return n - baw.w(a + i.d(this.j).a);
    }
    
    private final bix l(final int n) {
        final bix bix = this.a[n];
        final bjf b = this.m.b((List)bix.a.e);
        if (b != null && !b.equals((Object)bix.b)) {
            return this.a[n] = new bix(bix.d, bix.a, b, bix.f, bix.e, bix.c);
        }
        return bix;
    }
    
    private final ArrayList m() {
        final Object d = this.i.d(this.j).d;
        final ArrayList list = new ArrayList();
        final int[] c = this.c;
        for (int length = c.length, i = 0; i < length; ++i) {
            list.addAll(((List<bje>)d).get(c[i]).c);
        }
        return list;
    }
    
    private static final long n(final bix bix, final bpt bpt, long n, final long n2, final long n3) {
        if (bpt != null) {
            n = bpt.f();
        }
        else {
            n = baw.r(bix.f(n), n2, n3);
        }
        return n;
    }
    
    public final void a(bjg k, int j) {
        try {
            this.i = (bjg)k;
            this.j = j;
            final long c = ((bjg)k).c(j);
            final ArrayList m = this.m();
            j = 0;
            while (true) {
                k = (bms)this;
                if (j >= ((biz)k).a.length) {
                    return;
                }
                final bjo bjo = (bjo)m.get(((biz)k).h.b(j));
                final bix[] a = ((biz)k).a;
                final bix bix = a[j];
                final biv i = bix.a.k();
                k = (bms)bjo.k();
                Label_0401: {
                    long f = 0L;
                    while (true) {
                        Label_0126: {
                            if (i != null) {
                                break Label_0126;
                            }
                            try {
                                k = (bms)new bix(c, bjo, bix.b, bix.f, bix.e, (biv)null);
                                break Label_0401;
                            }
                            catch (final bms k) {
                                break;
                            }
                        }
                        if (!i.j()) {
                            k = (bms)new bix(c, bjo, bix.b, bix.f, bix.e, (biv)k);
                            continue;
                        }
                        f = i.f(c);
                        if (f == 0L) {
                            k = (bms)new bix(c, bjo, bix.b, bix.f, bix.e, (biv)k);
                            continue;
                        }
                        break;
                    }
                    final long d = i.d();
                    final long h = i.h(d);
                    final long n = f + d - 1L;
                    final long n2 = i.h(n) + i.b(n, c);
                    final long d2 = ((biv)k).d();
                    final long h2 = ((biv)k).h(d2);
                    final long e = bix.e;
                    long n3;
                    if (n2 == h2) {
                        n3 = e + (n + 1L - d2);
                    }
                    else {
                        if (n2 < h2) {
                            k = new bms();
                            throw k;
                        }
                        if (h2 < h) {
                            n3 = e - (((biv)k).g(h, c) - d);
                        }
                        else {
                            n3 = e + (i.g(h2, c) - d2);
                        }
                    }
                    k = (bms)new bix(c, bjo, bix.b, bix.f, n3, (biv)k);
                }
                a[j] = (bix)k;
                ++j;
            }
        }
        catch (final bms bms) {}
        this.k = (IOException)k;
    }
    
    public final void b(final bqv h) {
        this.h = h;
    }
    
    public final int c(final long n, final List list) {
        if (this.k == null && this.h.g() >= 2) {
            return this.h.a(n, list);
        }
        return list.size();
    }
    
    public final long d(final long n, final bfu bfu) {
        for (final bix bix : this.a) {
            if (bix.c != null) {
                final long f = bix.f(n);
                final long g = bix.g(f);
                final long d = bix.d();
                long g2;
                if (g < n && (d == -1L || f < bix.b() + d - 1L)) {
                    g2 = bix.g(f + 1L);
                }
                else {
                    g2 = g;
                }
                return bfu.a(n, g, g2);
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
    
    public final void f(final bpl bpl) {
        if (bpl instanceof bps) {
            final int f = this.h.f(((bps)bpl).h);
            final bix bix = this.a[f];
            if (bix.c == null) {
                final bta a = bix.f.a();
                if (a != null) {
                    final bix[] a2 = this.a;
                    final bjo a3 = bix.a;
                    a2[f] = new bix(bix.d, a3, bix.b, bix.f, bix.e, (biv)new biw(a, a3.f));
                }
            }
        }
        final bjc g = this.g;
        if (g != null) {
            final long b = g.b;
            if (b == -9223372036854775807L || bpl.l > b) {
                g.b = bpl.l;
            }
            g.c.e = true;
        }
    }
    
    public final void g() {
        final bix[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            final bpk f = a[i].f;
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
    
    public final void i(long n, long n2, final List list, final toq toq) {
        if (this.k != null) {
            return;
        }
        final long w = baw.w(this.i.a);
        final long w2 = baw.w(this.i.d(this.j).a);
        final bjc g = this.g;
        if (g != null) {
            final bjd c = g.c;
            final bjg d = c.d;
            if (d.d) {
                if (c.f) {
                    return;
                }
                final Map.Entry<Long, Object> ceilingEntry = c.c.ceilingEntry(d.h);
                if (ceilingEntry != null && ceilingEntry.getValue() < w + w2 + n2) {
                    n2 = ceilingEntry.getKey();
                    final biu biu = (biu)c.i.a;
                    n = biu.n;
                    if (n == -9223372036854775807L || n < n2) {
                        biu.n = n2;
                    }
                    c.a();
                    return;
                }
            }
        }
        final long w3 = baw.w(baw.t(this.f));
        final long k = this.k(w3);
        bpt bpt;
        if (list.isEmpty()) {
            bpt = null;
        }
        else {
            bpt = list.get(list.size() - 1);
        }
        final int g2 = this.h.g();
        final bpv[] array = new bpv[g2];
        for (int i = 0; i < g2; ++i) {
            final bix bix = this.a[i];
            if (bix.c == null) {
                array[i] = bpv.b;
            }
            else {
                final long a = bix.a(w3);
                final long c2 = bix.c(w3);
                final int n3 = i;
                final bpv[] array2 = array;
                final long n4 = n(bix, bpt, n2, a, c2);
                if (n4 < a) {
                    array2[n3] = bpv.b;
                }
                else {
                    array2[n3] = (bpv)new biy(this.l(n3), n4, c2);
                }
            }
        }
        long max;
        if (!this.i.d) {
            max = -9223372036854775807L;
        }
        else {
            final bix bix2 = this.a[0];
            final long n5 = w3;
            max = Math.max(0L, Math.min(this.k(n5), this.a[0].e(bix2.c(n5))) - n);
        }
        this.h.o(n, n2 - n, max, list, array);
        final bix l = this.l(this.h.c());
        final bpk f = l.f;
        if (f != null) {
            final bjo a2 = l.a;
            bjl h;
            if (f.a == null) {
                h = a2.h;
            }
            else {
                h = null;
            }
            bjl j;
            if (l.c == null) {
                j = a2.l();
            }
            else {
                j = null;
            }
            if (h != null || j != null) {
                final bbk e = this.e;
                final ayf m = this.h.i();
                final int d2 = this.h.d();
                final Object k2 = this.h.k();
                final bjo a3 = l.a;
                bjl b = j;
                if (h == null || (b = h.b(j, l.b.a)) != null) {
                    h = b;
                }
                toq.b = new bps(e, bhp.b(a3, l.b.a, h, 0), m, d2, k2, l.f);
                return;
            }
        }
        n = l.d;
        final boolean b2 = n != -9223372036854775807L;
        if (l.d() == 0L) {
            toq.a = b2;
            return;
        }
        final long a4 = l.a(w3);
        final long c3 = l.c(w3);
        final long n6 = n(l, bpt, n2, a4, c3);
        if (n6 < a4) {
            this.k = (IOException)new bms();
            return;
        }
        if (n6 > c3 || (this.l && n6 >= c3)) {
            toq.a = b2;
            return;
        }
        if (b2 && l.g(n6) >= n) {
            toq.a = true;
            return;
        }
        int n8;
        int n7 = n8 = (int)Math.min(1L, c3 - n6 + 1L);
        if (n != -9223372036854775807L) {
            while ((n8 = n7) > 1) {
                n8 = n7;
                if (l.g(n7 + n6 - 1L) < n) {
                    break;
                }
                --n7;
            }
        }
        if (!list.isEmpty()) {
            n = -9223372036854775807L;
        }
        else {
            n = n2;
        }
        final bbk e2 = this.e;
        final int d3 = this.d;
        final ayf i2 = this.h.i();
        final int d4 = this.h.d();
        final Object k3 = this.h.k();
        final bjo a5 = l.a;
        final long g3 = l.g(n6);
        bjl h2 = l.h(n6);
        Object b3;
        if (l.f == null) {
            n = l.e(n6);
            int n9;
            if (!l.i(n6, k)) {
                n9 = 8;
            }
            else {
                n9 = 0;
            }
            b3 = new bpw(e2, bhp.b(a5, l.b.a, h2, n9), i2, d4, k3, g3, n, n6, d3, i2);
        }
        else {
            int n10 = 1;
            int n11 = 1;
            while (n10 < n8) {
                final bjl b4 = h2.b(l.h(n10 + n6), l.b.a);
                if (b4 == null) {
                    break;
                }
                ++n11;
                ++n10;
                h2 = b4;
            }
            final long n12 = n11 + n6 - 1L;
            final long e3 = l.e(n12);
            n2 = l.d;
            if (n2 == -9223372036854775807L || n2 > e3) {
                n2 = -9223372036854775807L;
            }
            int n13;
            if (!l.i(n12, k)) {
                n13 = 8;
            }
            else {
                n13 = 0;
            }
            b3 = new bpr(e2, bhp.b(a5, l.b.a, h2, n13), i2, d4, k3, g3, e3, n, n2, n6, n11, -a5.f, l.f);
        }
        toq.b = b3;
    }
    
    public final boolean j(final bpl bpl, final boolean b, final trg trg, final brh brh) {
        if (!b) {
            return false;
        }
        final bjc g = this.g;
        Label_0096: {
            if (g != null) {
                final long b2 = g.b;
                final boolean b3 = b2 != -9223372036854775807L && b2 < bpl.k;
                final bjd c = g.c;
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
        if (!this.i.d && bpl instanceof bpt) {
            final Object b4 = trg.b;
            if (b4 instanceof bcd && ((bcd)b4).d == 404) {
                final bix bix = this.a[this.h.f(bpl.h)];
                final long d = bix.d();
                if (d != -1L && d != 0L) {
                    if (((bpt)bpl).f() > bix.b() + d - 1L) {
                        return this.l = true;
                    }
                }
            }
        }
        final bix bix2 = this.a[this.h.f(bpl.h)];
        final bjf b5 = this.m.b((List)bix2.a.e);
        if (b5 != null && !bix2.b.equals((Object)b5)) {
            return true;
        }
        final bqv h = this.h;
        final afcr e = bix2.a.e;
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
            set.add(((bjf)((List)e).get(j)).c);
        }
        final int size = set.size();
        final der m = this.m;
        final HashSet set2 = new HashSet();
        final List c2 = m.c((List)e);
        for (int k = 0; k < c2.size(); ++k) {
            set2.add(((bjf)c2.get(k)).c);
        }
        final bwi bwi = new bwi(size, size - set2.size(), g2, n);
        if (!bwi.a(2) && !bwi.a(1)) {
            return false;
        }
        final ynj d2 = brh.d(bwi, trg);
        if (d2 != null) {
            final int b6 = d2.b;
            if (bwi.a(b6)) {
                if (b6 == 2) {
                    final bqv h2 = this.h;
                    return h2.p(h2.f(bpl.h), d2.a);
                }
                final der l = this.m;
                final bjf b7 = bix2.b;
                final long n3 = SystemClock.elapsedRealtime() + d2.a;
                der.d((Object)b7.b, n3, (Map)l.c);
                final int c3 = b7.c;
                if (c3 != Integer.MIN_VALUE) {
                    der.d((Object)c3, n3, (Map)l.b);
                }
                return true;
            }
        }
        return false;
    }
}
