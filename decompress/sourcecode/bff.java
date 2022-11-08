import android.util.Pair;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bff
{
    public final bfz a;
    public int b;
    public boolean c;
    public bfd d;
    public bfd e;
    public bfd f;
    public int g;
    public Object h;
    private final azj i;
    private final azk j;
    private final Handler k;
    private long l;
    private long m;
    
    public bff(final bfz a, final Handler k) {
        this.a = a;
        this.k = k;
        this.i = new azj();
        this.j = new azk();
    }
    
    private final long l(final azl azl, final Object o, final int n) {
        azl.n(o, this.i);
        this.i.i(n);
        final long f = this.i.g.a(n).f;
        return 0L;
    }
    
    private final bfe m(final azl azl, final Object o, final int n, final int n2, final long n3, long max) {
        final ayx ayx = new ayx(o, n, n2, max);
        final long e = azl.n(ayx.a, this.i).e(ayx.b, ayx.c);
        if (n2 == this.i.d(n)) {
            this.i.j();
        }
        this.i.k(ayx.b);
        final long n4 = max = 0L;
        if (e != -9223372036854775807L) {
            max = n4;
            if (e <= 0L) {
                max = Math.max(0L, -1L + e);
            }
        }
        return new bfe(ayx, max, n3, -9223372036854775807L, e, false, false, false, false);
    }
    
    private final bfe n(final azl azl, final Object o, long n, final long n2, long d) {
        final long n3 = n;
        azl.n(o, this.i);
        final int b = this.i.b(n3);
        if (b == -1) {
            this.i.h();
        }
        else {
            this.i.k(b);
        }
        final ayx ayx = new ayx(o, d, b);
        final boolean r = r(ayx);
        final boolean q = this.q(azl, ayx);
        final boolean p5 = this.p(azl, ayx, r);
        if (b != -1) {
            this.i.k(b);
        }
        if (b != -1) {
            this.i.i(b);
            n = 0L;
        }
        else {
            n = -9223372036854775807L;
        }
        if (n != -9223372036854775807L) {
            d = n;
        }
        else {
            d = this.i.d;
            n = -9223372036854775807L;
        }
        long max = n3;
        if (d != -9223372036854775807L) {
            max = n3;
            if (n3 >= d) {
                max = Math.max(0L, d - 1L);
            }
        }
        return new bfe(ayx, max, n2, n, d, false, r, q, p5);
    }
    
    private static ayx o(final azl azl, final Object o, final long n, final long n2, final azk azk, final azj azj) {
        azl.n(o, azj);
        azl.o(azj.c, azk);
        azl.a(o);
        if (azj.d == 0L) {
            azj.h();
        }
        azl.n(o, azj);
        final int c = azj.c(n);
        if (c == -1) {
            return new ayx(o, n2, azj.b(n));
        }
        return new ayx(o, c, azj.d(c), n2);
    }
    
    private final boolean p(final azl azl, final ayx ayx, final boolean b) {
        final int a = azl.a(ayx.a);
        return !azl.o(azl.m(a, this.i).c, this.j).i && azl.i(a, this.i, this.j, this.b, this.c) == -1 && b;
    }
    
    private final boolean q(final azl azl, final ayx ayx) {
        return r(ayx) && azl.o(azl.n(ayx.a, this.i).c, this.j).p == azl.a(ayx.a);
    }
    
    private static final boolean r(final ayx ayx) {
        return !ayx.a() && ayx.e == -1;
    }
    
    public final bfd a() {
        final bfd d = this.d;
        if (d == null) {
            return null;
        }
        if (d == this.e) {
            this.e = d.h;
        }
        d.f();
        if (--this.g == 0) {
            this.f = null;
            final bfd d2 = this.d;
            this.h = d2.b;
            this.m = d2.f.i.d;
        }
        this.d = this.d.h;
        this.e();
        return this.d;
    }
    
    public final bfe b(final azl azl, bfd h, long n) {
        final bfe f = h.f;
        final long n2 = h.j + f.d - n;
        if (f.f) {
            final int a = azl.a(f.i.a);
            final azj i = this.i;
            final azk j = this.j;
            final int b = this.b;
            final boolean c = this.c;
            long n3 = 0L;
            final int k = azl.i(a, i, j, b, c);
            if (k == -1) {
                return null;
            }
            final int c2 = azl.d(k, this.i, true).c;
            final Object b2 = this.i.b;
            dk.d(b2);
            n = f.i.d;
            long longValue;
            Object o;
            if (azl.o(c2, this.j).o == k) {
                final Pair l = azl.l(this.j, this.i, c2, -9223372036854775807L, Math.max(0L, n2));
                if (l == null) {
                    return null;
                }
                final Object first = l.first;
                longValue = (long)l.second;
                h = h.h;
                if (h != null && h.b.equals(first)) {
                    n = h.f.i.d;
                }
                else {
                    n = this.l;
                    this.l = 1L + n;
                }
                n3 = -9223372036854775807L;
                o = first;
            }
            else {
                longValue = 0L;
                o = b2;
            }
            final ayx o2 = o(azl, o, longValue, n, this.j, this.i);
            if (n3 != -9223372036854775807L && f.b != -9223372036854775807L) {
                azl.n(f.i.a, this.i).h();
            }
            return this.j(azl, o2, n3, longValue);
        }
        else {
            final ayx m = f.i;
            azl.n(m.a, this.i);
            if (m.a()) {
                final int b3 = m.b;
                if (this.i.a(b3) == -1) {
                    return null;
                }
                final int b4 = this.i.g.a(b3).b(m.c);
                if (b4 < 0) {
                    return this.m(azl, m.a, b3, b4, f.b, m.d);
                }
                if ((n = f.b) == -9223372036854775807L) {
                    final azk j2 = this.j;
                    final azj i2 = this.i;
                    final Pair l2 = azl.l(j2, i2, i2.c, -9223372036854775807L, Math.max(0L, n2));
                    if (l2 == null) {
                        return null;
                    }
                    n = (long)l2.second;
                }
                this.l(azl, m.a, m.b);
                return this.n(azl, m.a, Math.max(0L, n), f.b, m.d);
            }
            else {
                final int d = this.i.d(m.e);
                this.i.k(m.e);
                if (d != this.i.a(m.e)) {
                    return this.m(azl, m.a, m.e, d, f.d, m.d);
                }
                this.l(azl, m.a, m.e);
                return this.n(azl, m.a, 0L, f.d, m.d);
            }
        }
    }
    
    public final bfe c(final azl azl, final bfe bfe) {
        final ayx i = bfe.i;
        final boolean r = r(i);
        final boolean q = this.q(azl, i);
        final boolean p2 = this.p(azl, i, r);
        azl.n(bfe.i.a, this.i);
        long n = 0L;
        Label_0087: {
            if (!i.a()) {
                final int e = i.e;
                if (e != -1) {
                    this.i.i(e);
                    n = 0L;
                    break Label_0087;
                }
            }
            n = -9223372036854775807L;
        }
        long n2;
        if (i.a()) {
            n2 = this.i.e(i.b, i.c);
        }
        else if (n != -9223372036854775807L) {
            n = (n2 = 0L);
        }
        else {
            n2 = this.i.d;
        }
        if (i.a()) {
            this.i.k(i.b);
        }
        else {
            final int e2 = i.e;
            if (e2 != -1) {
                this.i.k(e2);
            }
        }
        return new bfe(i, bfe.a, bfe.b, n, n2, false, r, q, p2);
    }
    
    public final void d() {
        if (this.g == 0) {
            return;
        }
        bfd bfd = this.d;
        dk.e((Object)bfd);
        this.h = bfd.b;
        this.m = bfd.f.i.d;
        while (bfd != null) {
            bfd.f();
            bfd = bfd.h;
        }
        this.d = null;
        this.f = null;
        this.e = null;
        this.g = 0;
        this.e();
    }
    
    public final void e() {
        final afcm d = afcr.d();
        for (bfd bfd = this.d; bfd != null; bfd = bfd.h) {
            d.h((Object)bfd.f.i);
        }
        final bfd e = this.e;
        ayx i;
        if (e == null) {
            i = null;
        }
        else {
            i = e.f.i;
        }
        this.k.post((Runnable)new vo(this, d, i, 3));
    }
    
    public final void f(final long n) {
        final bfd f = this.f;
        if (f != null) {
            dk.h(f.j());
            if (f.d) {
                f.a.m(f.d(n));
            }
        }
    }
    
    public final boolean g(final bnu bnu) {
        final bfd f = this.f;
        return f != null && f.a == bnu;
    }
    
    public final boolean h(bfd h) {
        final boolean b = false;
        dk.h(h != null);
        if (h.equals(this.f)) {
            return false;
        }
        this.f = h;
        boolean b2 = b;
        while (true) {
            h = h.h;
            if (h == null) {
                break;
            }
            if (h == this.e) {
                this.e = this.d;
                b2 = true;
            }
            h.f();
            --this.g;
        }
        this.f.g(null);
        this.e();
        return b2;
    }
    
    public final boolean i(final azl azl) {
        bfd d = this.d;
        if (d == null) {
            return true;
        }
        int n = azl.a(d.b);
        while (true) {
            n = azl.i(n, this.i, this.j, this.b, this.c);
            bfd h;
            while (true) {
                h = d.h;
                if (h == null || d.f.f) {
                    break;
                }
                d = h;
            }
            if (n == -1) {
                break;
            }
            if (h == null) {
                break;
            }
            if (azl.a(h.b) != n) {
                break;
            }
            d = h;
        }
        final boolean h2 = this.h(d);
        d.f = this.c(azl, d.f);
        return !h2;
    }
    
    public final bfe j(final azl azl, final ayx ayx, final long n, final long n2) {
        azl.n(ayx.a, this.i);
        if (ayx.a()) {
            return this.m(azl, ayx.a, ayx.b, ayx.c, n, ayx.d);
        }
        return this.n(azl, ayx.a, n2, n, ayx.d);
    }
    
    public final ayx k(final azl azl, Object b, final long n) {
        final int c = azl.n(b, this.i).c;
        final Object h = this.h;
    Label_0063:
        while (true) {
            Label_0066: {
                if (h == null) {
                    break Label_0066;
                }
                final int a = azl.a(h);
                if (a == -1 || azl.m(a, this.i).c != c) {
                    break Label_0066;
                }
                final long n2 = this.m;
                azl.n(b, this.i);
                azl.o(this.i.c, this.j);
                int a2 = azl.a(b);
                azk j;
                while (true) {
                    j = this.j;
                    if (a2 < j.o) {
                        break;
                    }
                    azl.d(a2, this.i, true);
                    this.i.h();
                    final azj i = this.i;
                    if (i.c(i.d) != -1) {
                        b = this.i.b;
                        dk.d(b);
                    }
                    --a2;
                }
                return o(azl, b, n, n2, j, this.i);
            }
            for (bfd bfd = this.d; bfd != null; bfd = bfd.h) {
                if (bfd.b.equals(b)) {
                    final long n2 = bfd.f.i.d;
                    continue Label_0063;
                }
            }
            for (bfd bfd2 = this.d; bfd2 != null; bfd2 = bfd2.h) {
                final int a3 = azl.a(bfd2.b);
                if (a3 != -1 && azl.m(a3, this.i).c == c) {
                    final long n2 = bfd2.f.i.d;
                    continue Label_0063;
                }
            }
            final long l = this.l;
            this.l = 1L + l;
            long n2 = l;
            if (this.d == null) {
                this.h = b;
                this.m = l;
                n2 = l;
            }
            continue Label_0063;
        }
    }
}
