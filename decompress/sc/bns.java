import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bns extends bpg
{
    public bnq b;
    private final boolean d;
    private final azl e;
    private final azk f;
    private bnp g;
    private boolean h;
    private boolean i;
    private boolean j;
    
    public bns(final bny bny, final boolean b) {
        super(bny);
        boolean d;
        if (b) {
            bny.E();
            d = true;
        }
        else {
            d = false;
        }
        this.d = d;
        this.e = new azl();
        this.f = new azk();
        final azm p2 = bny.p();
        if (p2 != null) {
            this.b = bnq.s(p2, (Object)null, (Object)null);
            this.j = true;
            return;
        }
        this.b = new bnq((azm)new bnr(bny.sP()), azl.a, bnq.c);
    }
    
    private final Object I(final Object o) {
        Object d = o;
        if (this.b.d != null) {
            d = o;
            if (o.equals(bnq.c)) {
                d = this.b.d;
            }
        }
        return d;
    }
    
    private final void J(final long n) {
        final bnp g = this.g;
        final int a = ((bnl)this.b).a(g.e.a);
        if (a == -1) {
            return;
        }
        final long d = ((azm)this.b).m(a, this.f).d;
        long max = n;
        if (d != -9223372036854775807L) {
            max = n;
            if (n >= d) {
                max = Math.max(0L, d - 1L);
            }
        }
        g.d = max;
    }
    
    public final bnp G(final ayy ayy, final brf brf, final long n) {
        final bnp g = new bnp(ayy, brf, n);
        final bny c = this.c;
        dk.h(g.b == null);
        g.b = c;
        if (this.i) {
            g.k(ayy.b(this.I(ayy.a)));
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
    
    protected final void b(final azm azm) {
        final boolean i = this.i;
        final ayy ayy = null;
        ayy b;
        if (i) {
            this.b = this.b.r(azm);
            final bnp g = this.g;
            b = ayy;
            if (g != null) {
                this.J(g.d);
                b = ayy;
            }
        }
        else if (azm.p()) {
            bnq b2;
            if (this.j) {
                b2 = this.b.r(azm);
            }
            else {
                b2 = bnq.s(azm, azl.a, bnq.c);
            }
            this.b = b2;
            b = ayy;
        }
        else {
            azm.o(0, this.e);
            final azl e = this.e;
            long m = e.m;
            final Object b3 = e.b;
            final bnp g2 = this.g;
            if (g2 != null) {
                final long a = g2.a;
                ((azm)this.b).n(g2.e.a, this.f);
                final long n = this.f.e + a;
                if (n != ((azm)this.b).o(0, this.e).m) {
                    m = n;
                }
            }
            final Pair k = azm.k(this.e, this.f, 0, m);
            final Object first = k.first;
            final long longValue = (long)k.second;
            bnq b4;
            if (this.j) {
                b4 = this.b.r(azm);
            }
            else {
                b4 = bnq.s(azm, b3, first);
            }
            this.b = b4;
            final bnp g3 = this.g;
            b = ayy;
            if (g3 != null) {
                this.J(longValue);
                final ayy e2 = g3.e;
                b = e2.b(this.I(e2.a));
            }
        }
        this.j = true;
        this.i = true;
        ((bms)this).y((azm)this.b);
        if (b != null) {
            final bnp g4 = this.g;
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
    
    protected final ayy o(final ayy ayy) {
        final Object a = ayy.a;
        final Object d = this.b.d;
        Object c = a;
        if (d != null) {
            c = a;
            if (d.equals(a)) {
                c = bnq.c;
            }
        }
        return ayy.b(c);
    }
    
    public final void sQ() {
    }
    
    public final void sS(final bnv bnv) {
        final bnp bnp = (bnp)bnv;
        if (bnp.c != null) {
            final bny b = bnp.b;
            dk.d((Object)b);
            b.sS(bnp.c);
        }
        if (bnv == this.g) {
            this.g = null;
        }
    }
    
    public final void sT() {
        this.i = false;
        this.h = false;
        super.sT();
    }
    
    public final /* bridge */ bnv sU(final ayy ayy, final brf brf, final long n) {
        return (bnv)this.G(ayy, brf, n);
    }
}
