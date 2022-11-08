import java.util.Observer;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abgx implements abnq
{
    public final asib a;
    public final abns b;
    public final abno c;
    public final tox d;
    public final vax e;
    public aptk f;
    public Runnable g;
    public boolean h;
    public boolean i;
    public String j;
    public int k;
    public final oia l;
    private final wvu m;
    private final wwv n;
    private final Handler o;
    
    public abgx(final Handler o, final abns b, final abno c, final tox d, final wvu m, final wwv n, final vax e, final oia l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.o = o;
        this.a = new asib();
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
    
    public final void b(final apth apth, final aptj aptj) {
        final aptf a = aptg.a();
        ((agza)a).copyOnWrite();
        aptg.c((aptg)a.instance, apth);
        final String i = this.n.i();
        ((agza)a).copyOnWrite();
        aptg.j((aptg)a.instance, i);
        final int d = aptj.d;
        ((agza)a).copyOnWrite();
        aptg.d((aptg)a.instance, d);
        final long c = aptj.c;
        ((agza)a).copyOnWrite();
        aptg.i((aptg)a.instance, c);
        apti apti;
        if ((apti = apti.b(aptj.g)) == null) {
            apti = apti.a;
        }
        ((agza)a).copyOnWrite();
        aptg.g((aptg)a.instance, apti);
        final long h = aptj.h;
        ((agza)a).copyOnWrite();
        aptg.f((aptg)a.instance, h);
        final String j = this.j;
        if (j != null && !"".equals(j)) {
            final String k = this.j;
            ((agza)a).copyOnWrite();
            aptg.h((aptg)a.instance, k);
        }
        if (this.k != -1 && (apth == apth.c || apth == apth.d)) {
            final int l = this.k;
            ((agza)a).copyOnWrite();
            aptg.e((aptg)a.instance, l);
        }
        final aklo d2 = aklq.d();
        final aptg aptg = (aptg)((agza)a).build();
        ((agza)d2).copyOnWrite();
        aklq.af((aklq)d2.instance, aptg);
        this.m.d((aklq)((agza)d2).build());
    }
    
    public final void c(final aptj aptj, final boolean b) {
        final int b2 = aptj.b;
        if ((0x8000 & b2) != 0x0) {
            long n;
            if ((b2 & 0x4) != 0x0) {
                n = aptj.e;
            }
            else {
                n = 0L;
            }
            final hrw g = new hrw(this, b, aptj, 17);
            this.g = (Runnable)g;
            this.o.postDelayed((Runnable)g, n);
            return;
        }
        this.h(aptj);
    }
    
    public final void d(final aptj aptj) {
        this.g();
        this.a();
        final Object a = this.l.a;
        final gbo d = gbq.d();
        d.j();
        d.c(-1);
        ajsq ajsq;
        if ((aptj.b & 0x4000) != 0x0) {
            if ((ajsq = aptj.m) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        d.k((CharSequence)abyh.b(ajsq));
        ((actx)a).n((actz)d.a());
        this.b(apth.g, aptj);
    }
    
    public final void f(final aptj aptj) {
        this.c.a();
        this.b(apth.f, aptj);
    }
    
    public final void g() {
        this.o.postDelayed((Runnable)new abdq(this, 7), 300L);
    }
    
    public final void h(final aptj aptj) {
        final aban g = new aban(this, aptj, 5);
        this.g = (Runnable)g;
        this.o.postDelayed((Runnable)g, (long)aptj.f);
    }
    
    public final void i(final aptj aptj) {
        this.d.addObserver((Observer)new abgw(this, aptj, 0));
    }
    
    public final asic[] lX(final abns abns) {
        final asic am = ((asgt)abns.q().a).j(aajj.t(abns.bN(), 536870912L)).j(aajj.r(1)).am((asix)new abgn(this, 5), (asix)abdi.g);
        final asic am2 = ((asgt)abns.q().e).j(aajj.t(abns.bN(), 536870912L)).j(aajj.r(1)).am((asix)new abgn(this, 6), (asix)abdi.g);
        asic asic;
        if (((uyi)abns.cd().h).bw()) {
            asic = ((asgt)abns.f().f).am((asix)new abgn(this, 7), (asix)abdi.g);
        }
        else {
            asic = abns.f().b().j(aajj.t(abns.bN(), 536870912L)).j(aajj.r(0)).am((asix)new abgn(this, 7), (asix)abdi.g);
        }
        return new asic[] { am, am2, asic };
    }
}
