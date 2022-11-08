// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bdw implements bfq, bfr
{
    public final int a;
    public int b;
    public boolean c;
    private bfs d;
    private int e;
    private bgz f;
    private bov g;
    private ayf[] h;
    private long i;
    private long j;
    private boolean k;
    private final bxb l;
    
    public bdw(final int a) {
        this.a = a;
        this.l = new bxb();
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
    
    protected void C(final ayf[] array, final long n, final long n2) {
    }
    
    public final void D(final ayf[] h, final bov g, final long j, final long i) {
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
            final bov g = this.g;
            dk.d((Object)g);
            b = g.la();
        }
        return b;
    }
    
    protected final ayf[] N() {
        return (ayf[])dk.d((Object)this.h);
    }
    
    protected final void O() {
        dk.d((Object)this.d);
    }
    
    protected final int P(final bxb bxb, final bdb bdb, int n) {
        final bov g = this.g;
        dk.d((Object)g);
        final int e = g.e(bxb, bdb, n);
        if (e == -4) {
            if (((bcv)bdb).isEndOfStream()) {
                this.j = Long.MIN_VALUE;
                if (this.c) {
                    return -4;
                }
                return -3;
            }
            else {
                final long e2 = bdb.e + this.i;
                bdb.e = e2;
                this.j = Math.max(this.j, e2);
                n = e;
            }
        }
        else if ((n = e) == -5) {
            final ayf a = bxb.a;
            dk.d((Object)a);
            final long r = a.r;
            if (r != Long.MAX_VALUE) {
                final aye b = a.b();
                b.o = r + this.i;
                bxb.a = b.a();
                return -5;
            }
            n = -5;
        }
        return n;
    }
    
    protected final bxb Q() {
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
        final bov g = this.g;
        dk.d((Object)g);
        return g.a(n - this.i);
    }
    
    public int j() {
        return 0;
    }
    
    public final long k() {
        return this.j;
    }
    
    protected final bee l(final Throwable t, final ayf ayf, final int n) {
        return this.m(t, ayf, false, n);
    }
    
    protected final bee m(final Throwable t, final ayf ayf, final boolean b, final int n) {
        int f = 0;
        Label_0052: {
            if (ayf != null && !this.k) {
                this.k = true;
                try {
                    f = beq.f(this.a(ayf));
                    break Label_0052;
                }
                catch (final bee bee) {
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
        if (ayf == null) {
            f = 4;
        }
        return new bee(1, t, null, n, d, e, ayf, f, b);
    }
    
    public bfc n() {
        return null;
    }
    
    public final bfr o() {
        return (bfr)this;
    }
    
    protected final bgz p() {
        final bgz f = this.f;
        dk.d((Object)f);
        return f;
    }
    
    public final bov q() {
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
    
    public final void s(final bfs d, final ayf[] array, final bov bov, final long n, final boolean b, final boolean b2, final long n2, final long n3) {
        dk.h(this.b == 0);
        this.d = d;
        this.b = 1;
        this.x(b, b2);
        this.D(array, bov, n2, n3);
        this.b(n, b);
    }
    
    public void t(final int n, final Object o) {
    }
    
    public final void u(final int e, final bgz f) {
        this.e = e;
        this.f = f;
    }
    
    public final void v() {
        final bov g = this.g;
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
