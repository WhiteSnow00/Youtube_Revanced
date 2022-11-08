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

public final class bgs implements bfz
{
    public final SparseArray a;
    public adfr b;
    private final bac c;
    private final azj d;
    private final azk e;
    private final bgr f;
    private azg g;
    private baj h;
    private boolean i;
    
    public bgs(final bac c) {
        dk.d((Object)c);
        this.c = c;
        this.b = new adfr(baw.H(), c, (bam)bgf.a);
        final azj d = new azj();
        this.d = d;
        this.e = new azk();
        this.f = new bgr(d);
        this.a = new SparseArray();
    }
    
    private final bga ai() {
        return this.al(this.f.d);
    }
    
    private final bga aj() {
        return this.al(this.f.e);
    }
    
    private final bga ak(final aza aza) {
        if (aza instanceof bee) {
            final ayx h = ((bee)aza).h;
            if (h != null) {
                return this.al(new ayx(h));
            }
        }
        return this.ae();
    }
    
    private final bga al(final ayx ayx) {
        dk.d((Object)this.g);
        azl b;
        if (ayx == null) {
            b = null;
        }
        else {
            b = this.f.b(ayx);
        }
        if (ayx != null && b != null) {
            return this.ah(b, b.n(ayx.a, this.d).c, ayx);
        }
        final int j = this.g.j();
        azl azl;
        if (j >= (azl = this.g.q()).c()) {
            azl = azl.a;
        }
        return this.ah(azl, j, null);
    }
    
    private final bga am(final int n, final ayx ayx) {
        dk.d((Object)this.g);
        if (ayx != null) {
            bga bga;
            if (this.f.b(ayx) != null) {
                bga = this.al(ayx);
            }
            else {
                bga = this.ah(azl.a, n, ayx);
            }
            return bga;
        }
        azl azl;
        if (n >= (azl = this.g.q()).c()) {
            azl = azl.a;
        }
        return this.ah(azl, n, null);
    }
    
    public final void A() {
        this.ag(this.ae(), 5, (bal)new bgm(3));
    }
    
    public final void B() {
        this.ag(this.ae(), 6, (bal)new bgm(12));
    }
    
    public final void C() {
        this.ag(this.ae(), 8, (bal)new bem(12));
    }
    
    public final void D() {
        this.ag(this.aj(), 24, (bal)new bgm(11));
    }
    
    public final void E() {
        this.ag(this.ae(), 19, (bal)new bem(10));
    }
    
    public final void F() {
        this.ag(this.aj(), 22, (bal)new bem(7));
    }
    
    public final void G(final bgb bgb) {
        dk.d((Object)bgb);
        this.b.h((Object)bgb);
    }
    
    public final void H() {
        if (!this.i) {
            final bga ae = this.ae();
            this.i = true;
            this.ag(ae, -1, (bal)new bel(ae, 20));
        }
    }
    
    public final void I(final String s, final long n, final long n2) {
        final bga aj = this.aj();
        this.ag(aj, 1008, (bal)new bgl(aj, s, n2, n, 0));
    }
    
    public final void J(final bdx bdx) {
        final bga ai = this.ai();
        this.ag(ai, 1013, (bal)new bgg(ai, bdx, 8));
    }
    
    public final void K(final bdx bdx) {
        final bga aj = this.aj();
        this.ag(aj, 1007, (bal)new bgg(aj, bdx, 6));
    }
    
    public final void L(final long n) {
        final bga aj = this.aj();
        this.ag(aj, 1010, (bal)new bgo(aj, n));
    }
    
    public final void M(final Exception ex) {
        final bga aj = this.aj();
        this.ag(aj, 1014, (bal)new bgg(aj, ex, 3));
    }
    
    public final void N(final int n, final long n2, final long n3) {
        final bga aj = this.aj();
        this.ag(aj, 1011, (bal)new bge(aj, n, n2, n3));
    }
    
    public final void O(final int n, final long n2) {
        final bga ai = this.ai();
        this.ag(ai, 1018, (bal)new bgk(ai, n, n2, 0));
    }
    
    public final void P(final Object o, final long n) {
        final bga aj = this.aj();
        this.ag(aj, 26, (bal)new bgp(aj, o, n));
    }
    
    public final void Q(final Exception ex) {
        final bga aj = this.aj();
        this.ag(aj, 1030, (bal)new bgg(aj, ex, 2));
    }
    
    public final void R(final String s, final long n, final long n2) {
        final bga aj = this.aj();
        this.ag(aj, 1016, (bal)new bgl(aj, s, n2, n, 1));
    }
    
    public final void S(final bdx bdx) {
        final bga ai = this.ai();
        this.ag(ai, 1020, (bal)new bgg(ai, bdx, 10));
    }
    
    public final void T(final bdx bdx) {
        final bga aj = this.aj();
        this.ag(aj, 1015, (bal)new bgg(aj, bdx, 4));
    }
    
    public final void U(final ayf ayf, final bdy bdy) {
        final bga aj = this.aj();
        this.ag(aj, 1017, (bal)new bgd(aj, ayf, bdy));
    }
    
    public final void V() {
        final baj h = this.h;
        dk.e((Object)h);
        h.b((Runnable)new aur(this, 6));
    }
    
    public final void W(final bgb bgb) {
        this.b.l((Object)bgb);
    }
    
    public final void X(final azg g, final Looper looper) {
        final azg g2 = this.g;
        boolean b = true;
        if (g2 != null) {
            b = (this.f.b.isEmpty() && b);
        }
        dk.h(b);
        dk.d((Object)g);
        this.g = g;
        this.h = this.c.b(looper, (Handler$Callback)null);
        final adfr b2 = this.b;
        this.b = new adfr((CopyOnWriteArraySet)b2.e, looper, (bac)b2.f, (bam)new bgi(this, g));
    }
    
    public final void Y(final List list, final ayx e) {
        final bgr f = this.f;
        final azg g = this.g;
        dk.d((Object)g);
        f.b = afcr.o((Collection)list);
        if (!list.isEmpty()) {
            f.d = list.get(0);
            dk.d((Object)e);
            f.e = e;
        }
        if (f.c == null) {
            f.c = bgr.c(g, f.b, f.d, f.a);
        }
        f.a(g.q());
    }
    
    public final void Z() {
        this.ag(this.aj(), 1029, (bal)new bem(16));
    }
    
    public final void a(final azg azg, final azd azd) {
    }
    
    public final void aa() {
        this.ag(this.aj(), 1012, (bal)new bgm(13));
    }
    
    public final void ab(final ayf ayf) {
        final bga aj = this.aj();
        this.ag(aj, 1009, (bal)new bgg(aj, ayf, 7));
    }
    
    public final void ac() {
        this.ag(this.aj(), 1019, (bal)new bem(5));
    }
    
    public final void ad() {
        this.ag(this.ai(), 1021, (bal)new bem(13));
    }
    
    public final bga ae() {
        return this.al(this.f.c);
    }
    
    public final void af(final int n, final long n2, final long n3) {
        final bgr f = this.f;
        ayx ayx;
        if (f.b.isEmpty()) {
            ayx = null;
        }
        else {
            ayx = (ayx)adwd.aK((Iterable)f.b);
        }
        final bga al = this.al(ayx);
        this.ag(al, 1006, (bal)new bgk(al, n, n2, 1));
    }
    
    public final void ag(final bga bga, final int n, final bal bal) {
        this.a.put(n, (Object)bga);
        this.b.m(n, bal);
    }
    
    protected final bga ah(final azl azl, final int n, ayx ayx) {
        final boolean p2 = azl.p();
        boolean b = true;
        if (p2) {
            ayx = null;
        }
        final long a = this.c.a();
        if (!azl.equals((Object)this.g.q()) || n != this.g.j()) {
            b = false;
        }
        final long n2 = 0L;
        long n3;
        if (ayx != null && ayx.a()) {
            n3 = n2;
            if (b) {
                n3 = n2;
                if (this.g.h() == ayx.b) {
                    n3 = n2;
                    if (this.g.i() == ayx.c) {
                        n3 = this.g.o();
                    }
                }
            }
        }
        else if (b) {
            n3 = this.g.n();
        }
        else if (azl.p()) {
            n3 = n2;
        }
        else {
            n3 = azl.o(n, this.e).a();
        }
        final ayx c = this.f.c;
        final azl q = this.g.q();
        final int j = this.g.j();
        final long o = this.g.o();
        final bew bew = (bew)this.g;
        bew.ad();
        return new bga(a, azl, n, ayx, n3, q, j, c, o, baw.A(bew.G.n));
    }
    
    public final void b(final boolean b) {
        final bga ae = this.ae();
        this.ag(ae, 3, (bal)new bgq(ae, b, 0));
    }
    
    public final void c(final boolean b) {
        this.ag(this.ae(), 7, (bal)new bgm(4));
    }
    
    public final void d(final azb azb) {
        final bga ae = this.ae();
        this.ag(ae, 12, (bal)new bgg(ae, azb, 1));
    }
    
    public final void e(final int n) {
        this.ag(this.ae(), 4, (bal)new bgn(n, 0));
    }
    
    public final void f(final aza aza) {
        final bga ak = this.ak(aza);
        this.ag(ak, 10, (bal)new bgg(ak, aza, 5));
    }
    
    public final void g(final aza aza) {
        this.ag(this.ak(aza), 10, (bal)new bgm(7));
    }
    
    public final void h(final boolean b, final int n) {
        final bga ae = this.ae();
        this.ag(ae, -1, (bal)new bgc(ae, b, n));
    }
    
    public final void i(final azf azf, final azf azf2, final int n) {
        int n2 = n;
        if (n == 1) {
            this.i = false;
            n2 = 1;
        }
        final bgr f = this.f;
        final azg g = this.g;
        dk.d((Object)g);
        f.c = bgr.c(g, f.b, f.d, f.a);
        final bga ae = this.ae();
        this.ag(ae, 11, (bal)new bgh(ae, n2, azf, azf2));
    }
    
    public final void j() {
    }
    
    public final void k() {
        this.ag(this.ae(), -1, (bal)new bem(9));
    }
    
    public final void kK(final int n, final ayx ayx, final bns bns) {
        final bga am = this.am(n, ayx);
        this.ag(am, 1004, (bal)new bgg(am, bns, 0));
    }
    
    public final void kL(final int n, final ayx ayx, final bnn bnn, final bns bns) {
        this.ag(this.am(n, ayx), 1002, (bal)new bem(20));
    }
    
    public final void kM(final int n, final ayx ayx, final bnn bnn, final bns bns) {
        this.ag(this.am(n, ayx), 1001, (bal)new bgm(6));
    }
    
    public final void kN(final int n, final ayx ayx, final bnn bnn, final bns bns, final IOException ex, final boolean b) {
        final bga am = this.am(n, ayx);
        this.ag(am, 1003, (bal)new bgj(am, bnn, bns, ex, b));
    }
    
    public final void kO(final int n, final ayx ayx, final bnn bnn, final bns bns) {
        this.ag(this.am(n, ayx), 1000, (bal)new bgm(2));
    }
    
    public final void kP(final int n, final ayx ayx, final bns bns) {
        this.ag(this.am(n, ayx), 1005, (bal)new bem(4));
    }
    
    public final void kQ(final int n, final ayx ayx) {
        this.ag(this.am(n, ayx), 1023, (bal)new bem(8));
    }
    
    public final void kR(final int n, final ayx ayx) {
        this.ag(this.am(n, ayx), 1026, (bal)new bgm(9));
    }
    
    public final void kS(final int n, final ayx ayx) {
        this.ag(this.am(n, ayx), 1025, (bal)new bem(3));
    }
    
    public final void kT(final int n, final ayx ayx, final int n2) {
        this.ag(this.am(n, ayx), 1022, (bal)new bem(11));
    }
    
    public final void kU(final int n, final ayx ayx, final Exception ex) {
        final bga am = this.am(n, ayx);
        this.ag(am, 1024, (bal)new bgg(am, ex, 11));
    }
    
    public final void kV(final int n, final ayx ayx) {
        this.ag(this.am(n, ayx), 1027, (bal)new bem(6));
    }
    
    public final void l(final boolean b) {
        final bga aj = this.aj();
        this.ag(aj, 23, (bal)new bgq(aj, b, 1));
    }
    
    public final void m(final azq azq) {
        this.ag(this.ae(), 2, (bal)new bel(azq, 19));
    }
    
    public final void n(final azr azr) {
        final bga aj = this.aj();
        this.ag(aj, 25, (bal)new bgg(aj, azr, 9));
    }
    
    public final void o() {
    }
    
    public final void p() {
    }
    
    public final void q(final int n) {
        final bgr f = this.f;
        final azg g = this.g;
        dk.d((Object)g);
        f.c = bgr.c(g, f.b, f.d, f.a);
        f.a(g.q());
        final bga ae = this.ae();
        this.ag(ae, 0, (bal)new bek(ae, n, 3));
    }
    
    public final void r() {
        this.ag(this.aj(), 20, (bal)new bgm(10));
    }
    
    public final void s() {
        this.ag(this.ae(), 13, (bal)new bem(14));
    }
    
    public final void t() {
        this.ag(this.ae(), 27, (bal)new bgm(0));
    }
    
    public final void u() {
        this.ag(this.ae(), 27, (bal)new bem(18));
    }
    
    public final void v() {
        this.ag(this.ae(), 29, (bal)new bem(15));
    }
    
    public final void w() {
        this.ag(this.ae(), 30, (bal)new bem(17));
    }
    
    public final void x() {
        this.ag(this.ae(), 1, (bal)new bgm(5));
    }
    
    public final void y() {
        this.ag(this.ae(), 14, (bal)new bgm(8));
    }
    
    public final void z() {
        this.ag(this.ae(), 28, (bal)new bgm(1));
    }
}
