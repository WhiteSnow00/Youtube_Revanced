import java.util.function.Function;
import com.google.android.apps.youtube.app.common.ui.pip.DefaultPipController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ghz implements ttg
{
    public final DefaultPipController a;
    
    public ghz(final DefaultPipController a) {
        this.a = a;
    }
    
    public final void a(Object b) {
        final DefaultPipController a = this.a;
        final gih gih = (gih)b;
        final gih c = gih.c;
        final boolean b2 = false;
        final boolean p = gih == c;
        a.p = p;
        if (p) {
            a.k((Function)new fnr(a, 13));
            if (a.l != null) {
                a.j.c(((ashi)a.C.c).an((asjm)new ghy(a, 3), (asjm)fua.n));
            }
            a.j.c(((ashi)a.C.b).w((asjm)new ghy(a, 5)).ai().aq((asjr)gcz.p).aI((asjm)new ghy(a, 6), (asjm)fua.n));
            if (a.l()) {
                a.j.c(((ashi)a.B.b).Y((asjr)gcz.q).an((asjm)new ghy(a, 7), (asjm)fua.n));
            }
            else {
                final asiq j = a.j;
                asir asir;
                if (((vai)((abpu)a.c.a()).ci().g).bx()) {
                    asir = ((abpu)a.c.a()).Q().an((asjm)new ghy(a, 7), (asjm)fua.n);
                }
                else {
                    asir = ((abpu)a.c.a()).P().R().an((asjm)new ghy(a, 7), (asjm)fua.n);
                }
                j.c(asir);
            }
            a.j.c(((twn)a.i.a()).e().L((asjr)gcz.r).p().an((asjm)new ghy(a, 0), (asjm)fua.n));
            if (a.k) {
                boolean s = b2;
                if (((xnt)a.f.a()).f() != 2) {
                    s = true;
                }
                a.s = s;
                a.n = (xnr)new icj(a, 1);
                final xnr n = a.n;
                if (n != null) {
                    ((xnt)a.f.a()).i(n);
                }
                if (a.l()) {
                    final asiq i = a.j;
                    b = a.B.b;
                    i.c(((ashi)b).Y((asjr)gcz.o).an((asjm)new ghy(a, 2), (asjm)fua.n));
                }
                else {
                    a.j.c(((ashi)((abpu)a.c.a()).p().k).R().an((asjm)new ghy(a, 2), (asjm)fua.n));
                }
            }
            if (((cyb)a.h.a()).q()) {
                a.j.c(((ashi)((cyb)a.g.a()).a).am((asjm)new ghy(a, 4)));
            }
            if (a.D != null) {
                ((gif)a.e.a()).D = a.D;
            }
            final gif gif = (gif)a.e.a();
            gif.c.b(gif.p);
            final aaol t = gif.t;
            if (t != null) {
                gif.b.w(t);
            }
            gif.d.b();
            gif.d.c(((ashi)gif.C.b).Y((asjr)gcz.s).an((asjm)new ghy(gif, 9), (asjm)fua.o));
            gif.d.c(((ashi)gif.C.b).Y((asjr)gcz.t).an((asjm)new ghy(gif, 10), (asjm)fua.o));
            gif.d.c(((ashi)gif.a.d).R().an((asjm)new ghy(gif, 8), (asjm)fua.o));
            gif.d();
        }
    }
}
