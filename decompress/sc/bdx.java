// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bdx implements bfr, bfs
{
    public final int a;
    public int b;
    public boolean c;
    private bft d;
    private int e;
    private bha f;
    private bow g;
    private ayg[] h;
    private long i;
    private long j;
    private boolean k;
    private final bxc l;
    
    public bdx(final int a) {
        this.a = a;
        this.l = new bxc();
        this.j = Long.MIN_VALUE;
    }
    
    private final void b(final long j, final boolean b) {
        this.c = false;
        this.y(this.j = j, b);
    }
    
    protected void A() {
    }
    
    protected void B() {
    }
    
    protected void C(final ayg[] array, final long n, final long n2) {
    }
    
    public final void D(final ayg[] h, final bow g, final long j, final long i) {
        dk.h(this.c ^ true);
        this.g = g;
        if (this.j == Long.MIN_VALUE) {
            this.j = j;
        }
        this.C(this.h = h, j, this.i = i);
    }
    
    public final void E() {
        dk.h(this.b == 0);
        this.l.a();
        this.z();
    }
    
    public final void F(final long n) {
        this.b(n, false);
    }
    
    public final void G() {
        this.c = true;
    }
    
    public void H(final float n, final float n2) {
    }
    
    public final void I() {
        final int b = this.b;
        boolean b2 = true;
        if (b != 1) {
            b2 = false;
        }
        dk.h(b2);
        this.b = 2;
        this.A();
    }
    
    public final void J() {
        dk.h(this.b == 2);
        this.b = 1;
        this.B();
    }
    
    public final boolean K() {
        return this.j == Long.MIN_VALUE;
    }
    
    public final boolean L() {
        return this.c;
    }
    
    protected final boolean M() {
        boolean b;
        if (this.K()) {
            b = this.c;
        }
        else {
            final bow g = this.g;
            dk.d((Object)g);
            b = g.la();
        }
        return b;
    }
    
    protected final ayg[] N() {
        return (ayg[])dk.d((Object)this.h);
    }
    
    protected final void O() {
        dk.d((Object)this.d);
    }
    
    protected final int P(final bxc bxc, final bdc bdc, int n) {
        final bow g = this.g;
        dk.d((Object)g);
        final int e = g.e(bxc, bdc, n);
        if (e == -4) {
            if (((bcw)bdc).isEndOfStream()) {
                this.j = Long.MIN_VALUE;
                if (this.c) {
                    return -4;
                }
                return -3;
            }
            else {
                final long e2 = bdc.e + this.i;
                bdc.e = e2;
                this.j = Math.max(this.j, e2);
                n = e;
            }
        }
        else if ((n = e) == -5) {
            final ayg a = bxc.a;
            dk.d((Object)a);
            final long r = a.r;
            if (r != Long.MAX_VALUE) {
                final ayf b = a.b();
                b.o = r + this.i;
                bxc.a = b.a();
                return -5;
            }
            n = -5;
        }
        return n;
    }
    
    protected final bxc Q() {
        this.l.a();
        return this.l;
    }
    
    public final int g() {
        return this.b;
    }
    
    public final int h() {
        return this.a;
    }
    
    protected final int i(final long n) {
        final bow g = this.g;
        dk.d((Object)g);
        return g.a(n - this.i);
    }
    
    public int j() {
        return 0;
    }
    
    public final long k() {
        return this.j;
    }
    
    protected final bef l(final Throwable t, final ayg ayg, final int n) {
        return this.m(t, ayg, false, n);
    }
    
    protected final bef m(final Throwable t, final ayg ayg, final boolean b, final int n) {
        int f = 0;
        Label_0052: {
            if (ayg != null && !this.k) {
                this.k = true;
                try {
                    f = ber.f(this.a(ayg));
                    break Label_0052;
                }
                catch (final bef bef) {
                    this.k = false;
                }
                finally {
                    this.k = false;
                }
            }
            f = 4;
        }
        final String d = this.d();
        final int e = this.e;
        if (ayg == null) {
            f = 4;
        }
        return new bef(1, t, null, n, d, e, ayg, f, b);
    }
    
    public bfd n() {
        return null;
    }
    
    public final bfs o() {
        return (bfs)this;
    }
    
    protected final bha p() {
        final bha f = this.f;
        dk.d((Object)f);
        return f;
    }
    
    public final bow q() {
        return this.g;
    }
    
    public final void r() {
        final int b = this.b;
        boolean b2 = true;
        if (b != 1) {
            b2 = false;
        }
        dk.h(b2);
        this.l.a();
        this.b = 0;
        this.g = null;
        this.h = null;
        this.c = false;
        this.w();
    }
    
    public final void s(final bft d, final ayg[] array, final bow bow, final long n, final boolean b, final boolean b2, final long n2, final long n3) {
        dk.h(this.b == 0);
        this.d = d;
        this.b = 1;
        this.x(b, b2);
        this.D(array, bow, n2, n3);
        this.b(n, b);
    }
    
    public void t(final int n, final Object o) {
    }
    
    public final void u(final int e, final bha f) {
        this.e = e;
        this.f = f;
    }
    
    public final void v() {
        final bow g = this.g;
        dk.d((Object)g);
        g.b();
    }
    
    protected void w() {
        throw null;
    }
    
    protected void x(final boolean b, final boolean b2) {
    }
    
    protected void y(final long n, final boolean b) {
        throw null;
    }
    
    protected void z() {
    }
}
