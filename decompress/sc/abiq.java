import java.util.Observer;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abiq implements abps
{
    public final asiq a;
    public final abpu b;
    public final abpq c;
    public final trc d;
    public final vcy e;
    public apvu f;
    public Runnable g;
    public boolean h;
    public boolean i;
    public String j;
    public int k;
    public final ojg l;
    private final wxx m;
    private final wyw n;
    private final Handler o;
    
    public abiq(final Handler o, final abpu b, final abpq c, final trc d, final wxx m, final wyw n, final vcy e, final ojg l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.o = o;
        this.a = new asiq();
        this.b = b;
        this.c = c;
        this.d = d;
        this.m = m;
        this.n = n;
        this.e = e;
        this.l = l;
        this.j = "";
        this.k = -1;
    }
    
    public final void a() {
        final Runnable g = this.g;
        if (g != null) {
            this.o.removeCallbacks(g);
            this.g = null;
        }
    }
    
    public final void b(final apvr apvr, final apvt apvt) {
        final apvp a = apvq.a();
        ((ahaz)a).copyOnWrite();
        apvq.c((apvq)a.instance, apvr);
        final String i = this.n.i();
        ((ahaz)a).copyOnWrite();
        apvq.j((apvq)a.instance, i);
        final int d = apvt.d;
        ((ahaz)a).copyOnWrite();
        apvq.d((apvq)a.instance, d);
        final long c = apvt.c;
        ((ahaz)a).copyOnWrite();
        apvq.i((apvq)a.instance, c);
        apvs apvs;
        if ((apvs = apvs.b(apvt.g)) == null) {
            apvs = apvs.a;
        }
        ((ahaz)a).copyOnWrite();
        apvq.g((apvq)a.instance, apvs);
        final long h = apvt.h;
        ((ahaz)a).copyOnWrite();
        apvq.f((apvq)a.instance, h);
        final String j = this.j;
        if (j != null && !"".equals(j)) {
            final String k = this.j;
            ((ahaz)a).copyOnWrite();
            apvq.h((apvq)a.instance, k);
        }
        if (this.k != -1 && (apvr == apvr.c || apvr == apvr.d)) {
            final int l = this.k;
            ((ahaz)a).copyOnWrite();
            apvq.e((apvq)a.instance, l);
        }
        final aknr d2 = aknt.d();
        final apvq apvq = (apvq)((ahaz)a).build();
        ((ahaz)d2).copyOnWrite();
        aknt.ag((aknt)d2.instance, apvq);
        this.m.d((aknt)((ahaz)d2).build());
    }
    
    public final void c(final apvt apvt, final boolean b) {
        final int b2 = apvt.b;
        if ((0x8000 & b2) != 0x0) {
            long n;
            if ((b2 & 0x4) != 0x0) {
                n = apvt.e;
            }
            else {
                n = 0L;
            }
            final hss g = new hss(this, b, apvt, 17);
            this.g = g;
            this.o.postDelayed((Runnable)g, n);
            return;
        }
        this.h(apvt);
    }
    
    public final void d(final apvt apvt) {
        this.g();
        this.a();
        final Object a = this.l.a;
        final gbv d = gbx.d();
        d.j();
        d.c(-1);
        ajut ajut;
        if ((apvt.b & 0x4000) != 0x0) {
            if ((ajut = apvt.m) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        d.k((CharSequence)acak.b(ajut));
        ((acwb)a).n((acwd)d.a());
        this.b(apvr.g, apvt);
    }
    
    public final void f(final apvt apvt) {
        this.c.a();
        this.b(apvr.f, apvt);
    }
    
    public final void g() {
        this.o.postDelayed((Runnable)new abei(this, 9), 300L);
    }
    
    public final void h(final apvt apvt) {
        final aaxb g = new aaxb(this, apvt, 7);
        this.g = g;
        this.o.postDelayed((Runnable)g, (long)apvt.f);
    }
    
    public final void i(final apvt apvt) {
        this.d.addObserver((Observer)new abip(this, apvt, 0));
    }
    
    public final asir[] lX(final abpu abpu) {
        final asir an = ((ashi)abpu.p().a).j(aale.s(abpu.bM(), 536870912L)).j(aale.q(1)).an((asjm)new abhx(this, 10), (asjm)abfd.g);
        final asir an2 = ((ashi)abpu.p().e).j(aale.s(abpu.bM(), 536870912L)).j(aale.q(1)).an((asjm)new abhx(this, 11), (asjm)abfd.g);
        asir asir;
        if (((vai)abpu.ci().g).bw()) {
            asir = ((ashi)abpu.cc().a).an((asjm)new abhx(this, 12), (asjm)abfd.g);
        }
        else {
            asir = abpu.cc().c().j(aale.s(abpu.bM(), 536870912L)).j(aale.q(0)).an((asjm)new abhx(this, 12), (asjm)abfd.g);
        }
        return new asir[] { an, an2, asir };
    }
}
