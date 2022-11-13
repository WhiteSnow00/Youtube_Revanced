import android.view.View;
import android.os.Handler;
import android.net.Uri;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abdm implements abps, tgg
{
    public final abdl a;
    public Bitmap b;
    private final acgs c;
    private final tcc d;
    private tce e;
    private Uri f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    
    public abdm(final abdl a, final acgs c) {
        this.a = a;
        c.getClass();
        this.c = c;
        this.d = (tcc)tck.c(new Handler(), (tcc)new hxl(this, 12));
    }
    
    private final void d() {
        this.f = null;
        this.b = null;
        final tce e = this.e;
        if (e != null) {
            e.d();
            this.e = null;
        }
        this.a.n();
    }
    
    private final void f() {
        if ((this.g && (this.i || this.j)) || !this.h) {
            if (this.b == null && this.f != null && this.e == null) {
                final tce c = tce.c(this.d);
                this.e = c;
                this.c.k(this.f, (tcc)c);
            }
            this.a.mm();
            return;
        }
        this.a.mk();
    }
    
    public final void a(final aamh aamh) {
        this.j = (aamh.d() == abjv.h);
        this.f();
    }
    
    public final void b(final aanq aanq) {
        this.i = aanq.b();
        this.f();
    }
    
    public final void c(final aans aans) {
        if (aans.c() == abke.a) {
            this.d();
        }
        else if (aans.c().c(abke.c)) {
            final abdl a = this.a;
            final boolean b = a instanceof abuc;
            final Uri uri = null;
            View md;
            if (b) {
                md = ((abuc)a).md();
            }
            else {
                md = null;
            }
            int width;
            if (md != null) {
                width = md.getWidth();
            }
            else {
                width = 480;
            }
            int height;
            if (md != null) {
                height = md.getHeight();
            }
            else {
                height = 320;
            }
            if (aans.b() != null) {
                final vgy l = aans.b().l();
                Uri a2 = uri;
                if (l.f()) {
                    a2 = l.b(width, height).a();
                }
                if (a2 == null || !a2.equals((Object)this.f)) {
                    this.d();
                }
                this.f = a2;
            }
        }
        this.g = aans.c().c(abke.c);
        this.h = (aans.c().a(new abke[] { abke.c, abke.d, abke.g, abke.j }) ^ true);
        this.f();
    }
    
    public final asir[] lX(final abpu abpu) {
        final asir an = ((ashi)abpu.p().a).j(aale.s(abpu.bM(), 2097152L)).j(aale.q(1)).an((asjm)new abdd(this, 4), abba.o);
        final asir an2 = ((ashi)abpu.cc().j).j(aale.s(abpu.bM(), 2097152L)).j(aale.q(1)).an((asjm)new abdd(this, 5), abba.o);
        asir asir;
        if (((vai)abpu.ci().g).bw()) {
            asir = ((ashi)abpu.cc().a).an((asjm)new abdd(this, 6), abba.o);
        }
        else {
            asir = abpu.cc().c().j(aale.s(abpu.bM(), 2097152L)).j(aale.q(0)).an((asjm)new abdd(this, 6), abba.o);
        }
        return new asir[] { an, an2, asir };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        final StringBuilder sb = new StringBuilder("unsupported op code: ");
                        sb.append(n);
                        throw new IllegalStateException(sb.toString());
                    }
                    this.c((aans)o);
                }
                else {
                    this.b((aanq)o);
                }
            }
            else {
                this.a((aamh)o);
            }
        }
        else {
            array = new Class[] { aamh.class, aanq.class, aans.class };
        }
        return array;
    }
}
