import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import android.os.Handler$Callback;
import android.os.Looper;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bgt implements bga
{
    public final SparseArray a;
    public adhu b;
    private final bad c;
    private final azk d;
    private final azl e;
    private final bgs f;
    private azh g;
    private bak h;
    private boolean i;
    
    public bgt(final bad c) {
        dk.d((Object)c);
        this.c = c;
        this.b = new adhu(bax.H(), c, (ban)bgg.a);
        final azk d = new azk();
        this.d = d;
        this.e = new azl();
        this.f = new bgs(d);
        this.a = new SparseArray();
    }
    
    private final bgb ai() {
        return this.al(this.f.d);
    }
    
    private final bgb aj() {
        return this.al(this.f.e);
    }
    
    private final bgb ak(final azb azb) {
        if (azb instanceof bef) {
            final ayy h = ((bef)azb).h;
            if (h != null) {
                return this.al(new ayy(h));
            }
        }
        return this.ae();
    }
    
    private final bgb al(final ayy ayy) {
        dk.d((Object)this.g);
        azm b;
        if (ayy == null) {
            b = null;
        }
        else {
            b = this.f.b(ayy);
        }
        if (ayy != null && b != null) {
            return this.ah(b, b.n(ayy.a, this.d).c, ayy);
        }
        final int j = this.g.j();
        azm azm;
        if (j >= (azm = this.g.q()).c()) {
            azm = azm.a;
        }
        return this.ah(azm, j, null);
    }
    
    private final bgb am(final int n, final ayy ayy) {
        dk.d((Object)this.g);
        if (ayy != null) {
            bgb bgb;
            if (this.f.b(ayy) != null) {
                bgb = this.al(ayy);
            }
            else {
                bgb = this.ah(azm.a, n, ayy);
            }
            return bgb;
        }
        azm azm;
        if (n >= (azm = this.g.q()).c()) {
            azm = azm.a;
        }
        return this.ah(azm, n, null);
    }
    
    public final void A() {
        this.ag(this.ae(), 5, (bam)new bgn(3));
    }
    
    public final void B() {
        this.ag(this.ae(), 6, (bam)new bgn(12));
    }
    
    public final void C() {
        this.ag(this.ae(), 8, (bam)new ben(12));
    }
    
    public final void D() {
        this.ag(this.aj(), 24, (bam)new bgn(11));
    }
    
    public final void E() {
        this.ag(this.ae(), 19, (bam)new ben(10));
    }
    
    public final void F() {
        this.ag(this.aj(), 22, (bam)new ben(7));
    }
    
    public final void G(final bgc bgc) {
        dk.d((Object)bgc);
        this.b.h((Object)bgc);
    }
    
    public final void H() {
        if (!this.i) {
            final bgb ae = this.ae();
            this.i = true;
            this.ag(ae, -1, (bam)new bem(ae, 20));
        }
    }
    
    public final void I(final String s, final long n, final long n2) {
        final bgb aj = this.aj();
        this.ag(aj, 1008, (bam)new bgm(aj, s, n2, n, 0));
    }
    
    public final void J(final bdy bdy) {
        final bgb ai = this.ai();
        this.ag(ai, 1013, (bam)new bgh(ai, bdy, 8));
    }
    
    public final void K(final bdy bdy) {
        final bgb aj = this.aj();
        this.ag(aj, 1007, (bam)new bgh(aj, bdy, 6));
    }
    
    public final void L(final long n) {
        final bgb aj = this.aj();
        this.ag(aj, 1010, (bam)new bgp(aj, n));
    }
    
    public final void M(final Exception ex) {
        final bgb aj = this.aj();
        this.ag(aj, 1014, (bam)new bgh(aj, ex, 3));
    }
    
    public final void N(final int n, final long n2, final long n3) {
        final bgb aj = this.aj();
        this.ag(aj, 1011, (bam)new bgf(aj, n, n2, n3));
    }
    
    public final void O(final int n, final long n2) {
        final bgb ai = this.ai();
        this.ag(ai, 1018, (bam)new bgl(ai, n, n2, 0));
    }
    
    public final void P(final Object o, final long n) {
        final bgb aj = this.aj();
        this.ag(aj, 26, (bam)new bgq(aj, o, n));
    }
    
    public final void Q(final Exception ex) {
        final bgb aj = this.aj();
        this.ag(aj, 1030, (bam)new bgh(aj, ex, 2));
    }
    
    public final void R(final String s, final long n, final long n2) {
        final bgb aj = this.aj();
        this.ag(aj, 1016, (bam)new bgm(aj, s, n2, n, 1));
    }
    
    public final void S(final bdy bdy) {
        final bgb ai = this.ai();
        this.ag(ai, 1020, (bam)new bgh(ai, bdy, 10));
    }
    
    public final void T(final bdy bdy) {
        final bgb aj = this.aj();
        this.ag(aj, 1015, (bam)new bgh(aj, bdy, 4));
    }
    
    public final void U(final ayg ayg, final bdz bdz) {
        final bgb aj = this.aj();
        this.ag(aj, 1017, (bam)new bge(aj, ayg, bdz));
    }
    
    public final void V() {
        final bak h = this.h;
        dk.e((Object)h);
        h.b((Runnable)new aus(this, 6));
    }
    
    public final void W(final bgc bgc) {
        this.b.l((Object)bgc);
    }
    
    public final void X(final azh g, final Looper looper) {
        final azh g2 = this.g;
        boolean b = true;
        if (g2 != null) {
            b = (this.f.b.isEmpty() && b);
        }
        dk.h(b);
        dk.d((Object)g);
        this.g = g;
        this.h = this.c.b(looper, (Handler$Callback)null);
        final adhu b2 = this.b;
        this.b = new adhu((CopyOnWriteArraySet)b2.e, looper, (bad)b2.f, (ban)new bgj(this, g));
    }
    
    public final void Y(final List list, final ayy e) {
        final bgs f = this.f;
        final azh g = this.g;
        dk.d((Object)g);
        f.b = afeq.o((Collection)list);
        if (!list.isEmpty()) {
            f.d = list.get(0);
            dk.d((Object)e);
            f.e = e;
        }
        if (f.c == null) {
            f.c = bgs.c(g, f.b, f.d, f.a);
        }
        f.a(g.q());
    }
    
    public final void Z() {
        this.ag(this.aj(), 1029, (bam)new ben(16));
    }
    
    public final void a(final azh azh, final aze aze) {
    }
    
    public final void aa() {
        this.ag(this.aj(), 1012, (bam)new bgn(13));
    }
    
    public final void ab(final ayg ayg) {
        final bgb aj = this.aj();
        this.ag(aj, 1009, (bam)new bgh(aj, ayg, 7));
    }
    
    public final void ac() {
        this.ag(this.aj(), 1019, (bam)new ben(5));
    }
    
    public final void ad() {
        this.ag(this.ai(), 1021, (bam)new ben(13));
    }
    
    public final bgb ae() {
        return this.al(this.f.c);
    }
    
    public final void af(final int n, final long n2, final long n3) {
        final bgs f = this.f;
        ayy ayy;
        if (f.b.isEmpty()) {
            ayy = null;
        }
        else {
            ayy = (ayy)agpc.V((Iterable)f.b);
        }
        final bgb al = this.al(ayy);
        this.ag(al, 1006, (bam)new bgl(al, n, n2, 1));
    }
    
    public final void ag(final bgb bgb, final int n, final bam bam) {
        this.a.put(n, (Object)bgb);
        this.b.m(n, bam);
    }
    
    protected final bgb ah(final azm azm, final int n, ayy ayy) {
        final boolean p2 = azm.p();
        boolean b = true;
        if (p2) {
            ayy = null;
        }
        final long a = this.c.a();
        if (!azm.equals((Object)this.g.q()) || n != this.g.j()) {
            b = false;
        }
        final long n2 = 0L;
        long n3;
        if (ayy != null && ayy.a()) {
            n3 = n2;
            if (b) {
                n3 = n2;
                if (this.g.h() == ayy.b) {
                    n3 = n2;
                    if (this.g.i() == ayy.c) {
                        n3 = this.g.o();
                    }
                }
            }
        }
        else if (b) {
            n3 = this.g.n();
        }
        else if (azm.p()) {
            n3 = n2;
        }
        else {
            n3 = azm.o(n, this.e).a();
        }
        final ayy c = this.f.c;
        final azm q = this.g.q();
        final int j = this.g.j();
        final long o = this.g.o();
        final bex bex = (bex)this.g;
        bex.ad();
        return new bgb(a, azm, n, ayy, n3, q, j, c, o, bax.A(bex.G.n));
    }
    
    public final void b(final boolean b) {
        final bgb ae = this.ae();
        this.ag(ae, 3, (bam)new bgr(ae, b, 0));
    }
    
    public final void c(final boolean b) {
        this.ag(this.ae(), 7, (bam)new bgn(4));
    }
    
    public final void d(final azc azc) {
        final bgb ae = this.ae();
        this.ag(ae, 12, (bam)new bgh(ae, azc, 1));
    }
    
    public final void e(final int n) {
        this.ag(this.ae(), 4, (bam)new bgo(n, 0));
    }
    
    public final void f(final azb azb) {
        final bgb ak = this.ak(azb);
        this.ag(ak, 10, (bam)new bgh(ak, azb, 5));
    }
    
    public final void g(final azb azb) {
        this.ag(this.ak(azb), 10, (bam)new bgn(7));
    }
    
    public final void h(final boolean b, final int n) {
        final bgb ae = this.ae();
        this.ag(ae, -1, (bam)new bgd(ae, b, n));
    }
    
    public final void i(final azg azg, final azg azg2, final int n) {
        int n2 = n;
        if (n == 1) {
            this.i = false;
            n2 = 1;
        }
        final bgs f = this.f;
        final azh g = this.g;
        dk.d((Object)g);
        f.c = bgs.c(g, f.b, f.d, f.a);
        final bgb ae = this.ae();
        this.ag(ae, 11, (bam)new bgi(ae, n2, azg, azg2));
    }
    
    public final void j() {
    }
    
    public final void k() {
        this.ag(this.ae(), -1, (bam)new ben(9));
    }
    
    public final void kK(final int n, final ayy ayy, final bnt bnt) {
        final bgb am = this.am(n, ayy);
        this.ag(am, 1004, (bam)new bgh(am, bnt, 0));
    }
    
    public final void kL(final int n, final ayy ayy, final bno bno, final bnt bnt) {
        this.ag(this.am(n, ayy), 1002, (bam)new ben(20));
    }
    
    public final void kM(final int n, final ayy ayy, final bno bno, final bnt bnt) {
        this.ag(this.am(n, ayy), 1001, (bam)new bgn(6));
    }
    
    public final void kN(final int n, final ayy ayy, final bno bno, final bnt bnt, final IOException ex, final boolean b) {
        final bgb am = this.am(n, ayy);
        this.ag(am, 1003, (bam)new bgk(am, bno, bnt, ex, b));
    }
    
    public final void kO(final int n, final ayy ayy, final bno bno, final bnt bnt) {
        this.ag(this.am(n, ayy), 1000, (bam)new bgn(2));
    }
    
    public final void kP(final int n, final ayy ayy, final bnt bnt) {
        this.ag(this.am(n, ayy), 1005, (bam)new ben(4));
    }
    
    public final void kQ(final int n, final ayy ayy) {
        this.ag(this.am(n, ayy), 1023, (bam)new ben(8));
    }
    
    public final void kR(final int n, final ayy ayy) {
        this.ag(this.am(n, ayy), 1026, (bam)new bgn(9));
    }
    
    public final void kS(final int n, final ayy ayy) {
        this.ag(this.am(n, ayy), 1025, (bam)new ben(3));
    }
    
    public final void kT(final int n, final ayy ayy, final int n2) {
        this.ag(this.am(n, ayy), 1022, (bam)new ben(11));
    }
    
    public final void kU(final int n, final ayy ayy, final Exception ex) {
        final bgb am = this.am(n, ayy);
        this.ag(am, 1024, (bam)new bgh(am, ex, 11));
    }
    
    public final void kV(final int n, final ayy ayy) {
        this.ag(this.am(n, ayy), 1027, (bam)new ben(6));
    }
    
    public final void kW() {
    }
    
    public final void l(final boolean b) {
        final bgb aj = this.aj();
        this.ag(aj, 23, (bam)new bgr(aj, b, 1));
    }
    
    public final void m(final azr azr) {
        this.ag(this.ae(), 2, (bam)new bem(azr, 19));
    }
    
    public final void n(final azs azs) {
        final bgb aj = this.aj();
        this.ag(aj, 25, (bam)new bgh(aj, azs, 9));
    }
    
    public final void o() {
    }
    
    public final void p() {
    }
    
    public final void q(final int n) {
        final bgs f = this.f;
        final azh g = this.g;
        dk.d((Object)g);
        f.c = bgs.c(g, f.b, f.d, f.a);
        f.a(g.q());
        final bgb ae = this.ae();
        this.ag(ae, 0, (bam)new bel(ae, n, 3));
    }
    
    public final void r() {
        this.ag(this.aj(), 20, (bam)new bgn(10));
    }
    
    public final void s() {
        this.ag(this.ae(), 13, (bam)new ben(14));
    }
    
    public final void t() {
        this.ag(this.ae(), 27, (bam)new bgn(0));
    }
    
    public final void u() {
        this.ag(this.ae(), 27, (bam)new ben(18));
    }
    
    public final void v() {
        this.ag(this.ae(), 29, (bam)new ben(15));
    }
    
    public final void w() {
        this.ag(this.ae(), 30, (bam)new ben(17));
    }
    
    public final void x() {
        this.ag(this.ae(), 1, (bam)new bgn(5));
    }
    
    public final void y() {
        this.ag(this.ae(), 14, (bam)new bgn(8));
    }
    
    public final void z() {
        this.ag(this.ae(), 28, (bam)new bgn(1));
    }
}
