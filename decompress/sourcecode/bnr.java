import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bnr extends bpf
{
    public bnp b;
    private final boolean d;
    private final azk e;
    private final azj f;
    private bno g;
    private boolean h;
    private boolean i;
    private boolean j;
    
    public bnr(final bnx bnx, final boolean b) {
        super(bnx);
        boolean d;
        if (b) {
            bnx.E();
            d = true;
        }
        else {
            d = false;
        }
        this.d = d;
        this.e = new azk();
        this.f = new azj();
        final azl p2 = bnx.p();
        if (p2 != null) {
            this.b = bnp.s(p2, (Object)null, (Object)null);
            this.j = true;
            return;
        }
        this.b = new bnp((azl)new bnq(bnx.sJ()), azk.a, bnp.c);
    }
    
    private final Object I(final Object o) {
        Object d = o;
        if (this.b.d != null) {
            d = o;
            if (o.equals(bnp.c)) {
                d = this.b.d;
            }
        }
        return d;
    }
    
    private final void J(final long n) {
        final bno g = this.g;
        final int a = ((bnk)this.b).a(g.e.a);
        if (a == -1) {
            return;
        }
        final long d = ((azl)this.b).m(a, this.f).d;
        long max = n;
        if (d != -9223372036854775807L) {
            max = n;
            if (n >= d) {
                max = Math.max(0L, d - 1L);
            }
        }
        g.d = max;
    }
    
    public final bno G(final ayx ayx, final bre bre, final long n) {
        final bno g = new bno(ayx, bre, n);
        final bnx c = this.c;
        dk.h(g.b == null);
        g.b = c;
        if (this.i) {
            g.k(ayx.b(this.I(ayx.a)));
        }
        else {
            this.g = g;
            if (!this.h) {
                this.h = true;
                this.H();
            }
        }
        return g;
    }
    
    protected final void b(final azl azl) {
        final boolean i = this.i;
        final ayx ayx = null;
        ayx b;
        if (i) {
            this.b = this.b.r(azl);
            final bno g = this.g;
            b = ayx;
            if (g != null) {
                this.J(g.d);
                b = ayx;
            }
        }
        else if (azl.p()) {
            bnp b2;
            if (this.j) {
                b2 = this.b.r(azl);
            }
            else {
                b2 = bnp.s(azl, azk.a, bnp.c);
            }
            this.b = b2;
            b = ayx;
        }
        else {
            azl.o(0, this.e);
            final azk e = this.e;
            long m = e.m;
            final Object b3 = e.b;
            final bno g2 = this.g;
            if (g2 != null) {
                final long a = g2.a;
                ((azl)this.b).n(g2.e.a, this.f);
                final long n = this.f.e + a;
                if (n != ((azl)this.b).o(0, this.e).m) {
                    m = n;
                }
            }
            final Pair k = azl.k(this.e, this.f, 0, m);
            final Object first = k.first;
            final long longValue = (long)k.second;
            bnp b4;
            if (this.j) {
                b4 = this.b.r(azl);
            }
            else {
                b4 = bnp.s(azl, b3, first);
            }
            this.b = b4;
            final bno g3 = this.g;
            b = ayx;
            if (g3 != null) {
                this.J(longValue);
                final ayx e2 = g3.e;
                b = e2.b(this.I(e2.a));
            }
        }
        this.j = true;
        this.i = true;
        ((bmr)this).y((azl)this.b);
        if (b != null) {
            final bno g4 = this.g;
            dk.d((Object)g4);
            g4.k(b);
        }
    }
    
    public final void n() {
        if (!this.d) {
            this.h = true;
            this.H();
        }
    }
    
    protected final ayx o(final ayx ayx) {
        final Object a = ayx.a;
        final Object d = this.b.d;
        Object c = a;
        if (d != null) {
            c = a;
            if (d.equals(a)) {
                c = bnp.c;
            }
        }
        return ayx.b(c);
    }
    
    public final void sK() {
    }
    
    public final void sM(final bnu bnu) {
        final bno bno = (bno)bnu;
        if (bno.c != null) {
            final bnx b = bno.b;
            dk.d((Object)b);
            b.sM(bno.c);
        }
        if (bnu == this.g) {
            this.g = null;
        }
    }
    
    public final void sN() {
        this.i = false;
        this.h = false;
        super.sN();
    }
}
