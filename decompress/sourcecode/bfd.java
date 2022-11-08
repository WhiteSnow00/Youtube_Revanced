// 
// Decompiled by Procyon v0.6.0
// 

final class bfd
{
    public final bnu a;
    public final Object b;
    public final bov[] c;
    public boolean d;
    public boolean e;
    public bfe f;
    public boolean g;
    public bfd h;
    public bpd i;
    public long j;
    public aetc k;
    private final boolean[] l;
    private final bfr[] m;
    private final bra n;
    private final bfl o;
    
    public bfd(final bfr[] m, long a, final bra n, final bre bre, final bfl o, final bfe f, final aetc k, final byte[] array, final byte[] array2, final byte[] array3) {
        this.m = m;
        this.j = a;
        this.n = n;
        this.o = o;
        this.b = f.i.a;
        this.f = f;
        this.i = bpd.a;
        this.k = k;
        final int length = m.length;
        this.c = new bov[length];
        this.l = new boolean[length];
        final ayx i = f.i;
        a = f.a;
        final long c = f.c;
        final Object s = bdr.s(i.a);
        final ayx b = i.b(bdr.r(i.a));
        final bfj bfj = o.c.get(s);
        dk.d((Object)bfj);
        o.g.add(bfj);
        final alm alm = o.f.get(bfj);
        if (alm != null) {
            ((bnx)alm.c).v((bnw)alm.b);
        }
        bfj.c.add(b);
        final bno g = bfj.a.G(b, bre, a);
        o.b.put(g, bfj);
        o.c();
        Object a2 = g;
        if (c != -9223372036854775807L) {
            a2 = new bmv((bnu)g, true, 0L, c);
        }
        this.a = (bnu)a2;
    }
    
    private final void n() {
        if (this.j()) {
            int n = 0;
            while (true) {
                final aetc k = this.k;
                if (n >= k.a) {
                    break;
                }
                final boolean i = k.i(n);
                final bqv bqv = ((bqv[])this.k.c)[n];
                if (i && bqv != null) {
                    bqv.l();
                }
                ++n;
            }
        }
    }
    
    private final void o() {
        if (this.j()) {
            int n = 0;
            while (true) {
                final aetc k = this.k;
                if (n >= k.a) {
                    break;
                }
                final boolean i = k.i(n);
                final bqv bqv = ((bqv[])this.k.c)[n];
                if (i && bqv != null) {
                    bqv.m();
                }
                ++n;
            }
        }
    }
    
    public final long a() {
        if (!this.d) {
            return this.f.a;
        }
        long c;
        if (this.e) {
            c = this.a.c();
        }
        else {
            c = Long.MIN_VALUE;
        }
        if (c == Long.MIN_VALUE) {
            return this.f.d;
        }
        return c;
    }
    
    public final long b() {
        if (!this.d) {
            return 0L;
        }
        return this.a.d();
    }
    
    public final long c() {
        return this.f.a + this.j;
    }
    
    public final long d(final long n) {
        return n - this.j;
    }
    
    public final long e(final long n) {
        return n + this.j;
    }
    
    public final void f() {
        this.n();
        final bfl o = this.o;
        final bnu a = this.a;
        try {
            if (a instanceof bmv) {
                o.e(((bmv)a).a);
                return;
            }
            o.e(a);
        }
        catch (final RuntimeException ex) {
            bao.b("MediaPeriodHolder", "Period release failed.", (Throwable)ex);
        }
    }
    
    public final void g(final bfd h) {
        if (h == this.h) {
            return;
        }
        this.n();
        this.h = h;
        this.o();
    }
    
    public final void h() {
        final bnu a = this.a;
        if (a instanceof bmv) {
            long c;
            if ((c = this.f.c) == -9223372036854775807L) {
                c = Long.MIN_VALUE;
            }
            ((bmv)a).k(0L, c);
        }
    }
    
    public final boolean i() {
        final boolean d = this.d;
        boolean b = false;
        if (d) {
            if (this.e) {
                if (this.a.c() == Long.MIN_VALUE) {
                    return true;
                }
                b = b;
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    public final boolean j() {
        return this.h == null;
    }
    
    public final long k(final aetc k, long g, final boolean b, final boolean[] array) {
        int n = 0;
        while (true) {
            final int a = k.a;
            boolean b2 = true;
            if (n >= a) {
                break;
            }
            final boolean[] l = this.l;
            if (b || !k.j(this.k, n)) {
                b2 = false;
            }
            l[n] = b2;
            ++n;
        }
        int n2 = 0;
        while (true) {
            final bfr[] m = this.m;
            if (n2 >= m.length) {
                break;
            }
            m[n2].h();
            ++n2;
        }
        this.n();
        this.k = k;
        this.o();
        g = this.a.g((bqv[])k.c, this.l, this.c, array, g);
        int n3 = 0;
        while (true) {
            final bfr[] i = this.m;
            if (n3 >= i.length) {
                break;
            }
            i[n3].h();
            ++n3;
        }
        this.e = false;
        int n4 = 0;
        while (true) {
            final bov[] c = this.c;
            if (n4 >= c.length) {
                break;
            }
            if (c[n4] != null) {
                dk.h(k.i(n4));
                this.m[n4].h();
                this.e = true;
            }
            else {
                dk.h(((bqv[])k.c)[n4] == null);
            }
            ++n4;
        }
        return g;
    }
    
    public final aetc l(final float n, final azl azl) {
        final aetc n2 = this.n.n(this.m, this.i, this.f.i, azl);
        for (final bqv bqv : (bqv[])n2.c) {
            if (bqv != null) {
                bqv.n(n);
            }
        }
        return n2;
    }
    
    public final long m(final aetc aetc, final long n) {
        return this.k(aetc, n, false, new boolean[this.m.length]);
    }
}
