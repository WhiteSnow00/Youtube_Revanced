// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui.inline;

import java.util.Map;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import android.view.View;
import android.support.v7.widget.RecyclerView;
import java.util.HashSet;
import android.os.Handler;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import java.util.Set;
import android.view.View$OnClickListener;

public class InlinePlaybackController extends iw implements View$OnClickListener, geo, ger, fjo, abnq, tff, ivp
{
    private final Set A;
    private boolean B;
    private final asib C;
    private final arud D;
    private cdn E;
    public final atjj a;
    public final atjj b;
    public final atjj c;
    public final atjj d;
    public final atjj e;
    public final atjj f;
    public final kar g;
    public final atjj h;
    public final atjj i;
    public final atjj j;
    public final atjj k;
    public gee l;
    public kan m;
    public aalz n;
    public long o;
    atjj p;
    public whg q;
    private final atjj r;
    private final arhr s;
    private final atjj t;
    private final InlinePlaybackLifecycleController u;
    private final atjj v;
    private final atjj w;
    private final atjj x;
    private final atjj y;
    private final atjj z;
    
    public InlinePlaybackController(final atjj a, final arhr arhr, final atjj b, final atjj r, final atjj c, final atjj d, final atjj atjj, final InlinePlaybackLifecycleController u, final atjj f, final atjj atjj2, final atjj v, final atjj w, final atjj e, final arhr s, final atjj atjj3, final arud d2, final atjj t, final atjj atjj4, final atjj x, final atjj p32, final atjj h, final atjj y, final atjj i, final atjj z, final atjj j, final atjj k, final uyi uyi, final atjj atjj5, final tme tme, final atjj atjj6, final byte[] array, final byte[] array2) {
        this.a = a;
        this.s = s;
        this.b = b;
        this.r = r;
        this.c = c;
        this.d = d;
        this.u = u;
        this.f = f;
        this.v = v;
        this.w = w;
        this.e = e;
        this.D = d2;
        this.t = t;
        this.x = x;
        final kar g = new kar(this);
        this.g = g;
        this.E = new cdn((Handler)g);
        this.p = p32;
        this.h = h;
        this.y = y;
        this.i = i;
        this.z = z;
        this.j = j;
        this.k = k;
        final asib c2 = new asib();
        this.C = c2;
        this.A = new HashSet();
        if (uyi.aI() < 3L) {
            a.a();
            s.a();
            b.a();
            r.a();
            c.a();
            d.a();
            f.a();
            v.a();
            w.a();
            e.a();
            t.a();
            x.a();
            this.p.a();
            h.a();
            y.a();
            i.a();
            z.a();
            j.a();
            u.o((geo)this);
            u.p(atjj);
            u.p(f);
            if (uyi.aI() >= 1L) {
                u.q((ger)atjj5.a());
            }
            u.q((ger)this);
            u.r(e);
            u.r(atjj2);
            u.r(v);
            u.r(atjj3);
            u.r(atjj4);
            u.r(atjj);
            u.r(w);
            ((fjp)d.a()).l((fjo)this);
            ((fjp)d.a()).m(atjj2);
            ((gem)arhr.a()).h(v);
            return;
        }
        u.r(atjj6);
        c2.c(tme.e((asjd)iuc.u).e().V((asir)new kao(this, u, atjj, f, e, atjj2, v, atjj3, atjj4, w, atjj6, d, arhr)));
    }
    
    private final boolean A(final int n, final boolean b, final whg q) {
        this.y();
        if ((n == 0 || n == 1) && !b && this.B) {
            this.q = q;
            this.E.z((Runnable)new ccl(this, n, 13), 1000L);
            return false;
        }
        this.m.c(n, b);
        return true;
    }
    
    private final void y() {
        this.E.x();
        final whg q = this.q;
        if (q != null) {
            q.b();
            this.q = null;
        }
    }
    
    private final void z() {
        final abtt p = ((DefaultInlinePlayerControls)this.e.a()).d.p();
        if (p != null && this.m != null && p.c() - this.m.a().c() > gkt.ah(this.D)) {
            ((iqy)this.s.a()).b();
        }
    }
    
    public final void b(final RecyclerView recyclerView, final int n) {
        if (!(this.B = (n == 2))) {
            this.E.y();
        }
    }
    
    public final void j(final ged ged) {
        this.l();
    }
    
    public final void k(final boolean b) {
        if (((fjp)this.d.a()).j().e()) {
            final kan m = this.m;
            if (m != null && m.f() && ((DefaultInlinePlayerControls)this.e.a()).t()) {
                if (b) {
                    this.m.b();
                    return;
                }
                final kan i = this.m;
                if (i.c) {
                    i.b.s();
                    i.d = false;
                }
            }
        }
    }
    
    final void l() {
        if (this.m == null) {
            return;
        }
        if (this.v()) {
            ((ivr)this.k.a()).a = this.m.d;
        }
        if (this.m.c) {
            this.z();
            this.g.post((Runnable)new jku(this, this.m.a(), 14));
        }
        this.y();
        this.m = null;
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { ((asgt)abns.q().b).am((asix)new jyo(this, 9), (asix)jky.o), ((asgt)abns.f().e).am((asix)new jyo(this, 10), (asix)jky.o), abns.I((aexg)jth.g, (aexg)jth.h).j(aajj.r(1)).am((asix)new jyo(this, 11), (asix)jky.o), ((asgt)abns.q().e).j(aajj.r(1)).R().am((asix)new jyo(this, 12), (asix)jky.o) };
    }
    
    public final boolean m(final ged ged, int n, final whg whg) {
        boolean b = true;
        if (n == 0) {
            this.l();
        }
        else if (n == 3 && this.l != null && this.x()) {
            if (this.u.j(ged.b) == 1) {
                n = 1;
            }
            else {
                n = 0;
            }
            final boolean e = ((gel)this.b.a()).e();
            this.l.i();
            final boolean b2 = n != 0 || e;
            if (((fjp)this.d.a()).j().e() && b2) {
                if (1 != n) {
                    n = 0;
                }
                else {
                    n = 2;
                }
                if (this.u.j(ged.b) != 2) {
                    b = false;
                }
                return this.A(n, b, whg);
            }
        }
        return true;
    }
    
    public final void mM(final aum aum) {
        this.A.clear();
        if (!this.C.b) {
            this.C.dispose();
        }
    }
    
    public final void n() {
        final kan m = this.m;
        if (m != null) {
            this.k(m.d ^ true);
        }
    }
    
    public final void oL(final fkk fkk, final fkk fkk2) {
        ((hzr)this.t.a()).a = fkk2.e();
        if (this.l == null) {
            return;
        }
        if (fkk2.c() && this.l.g()) {
            this.l.d();
        }
        else {
            this.l.f();
        }
        if (this.m != null && fkk.e() && !fkk2.e()) {
            this.y();
            this.z();
            this.m.d();
        }
    }
    
    public final void onClick(final View view) {
        this.t(((DefaultInlinePlayerControls)this.e.a()).t() ^ true);
    }
    
    public final void q(final ged ged, final int n, final int n2) {
        if (((fno)this.p.a()).b == fnl.a) {
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 == 3) {
                            final fzo fzo = (fzo)this.x.a();
                            if (gkt.aB((arud)fzo.a)) {
                                ((tdz)fzo.b).d((Object)new ffd());
                            }
                        }
                    }
                    else {
                        final fzo fzo2 = (fzo)this.x.a();
                        if (gkt.aB((arud)fzo2.a)) {
                            ((tdz)fzo2.b).d((Object)new ffe());
                        }
                    }
                }
                else {
                    final fzo fzo3 = (fzo)this.x.a();
                    if (gkt.aB((arud)fzo3.a)) {
                        ((tdz)fzo3.b).d((Object)new fff());
                    }
                }
            }
            else {
                final fzo fzo4 = (fzo)this.x.a();
                if (gkt.aB((arud)fzo4.a)) {
                    ((tdz)fzo4.b).d((Object)new ffb());
                }
            }
            if (n2 == 1) {
                final gle b = ged.b;
                final kan m = new kan((aucj)this.r.a(), (kas)this.e.a(), b, (byte[])null, (byte[])null);
                this.m = m;
                if (m.a.i() != null) {
                    final ivr ivr = (ivr)this.k.a();
                    final kan i = this.m;
                    i.getClass();
                    final String j = i.a.i();
                    j.getClass();
                    final asic g = ivr.g;
                    if (g != null) {
                        asjg.b((AtomicReference)g);
                        ivr.g = null;
                    }
                    final asic h = ivr.h;
                    if (h != null) {
                        asjg.b((AtomicReference)h);
                        ivr.h = null;
                    }
                    if (ivr.j.aY()) {
                        ivr.i = j;
                        ivr.g = ivr.d.a(ivr.e.c()).i(vek.h(akdj.b.a(), j)).J((asjd)iuc.d).W((asjc)iqc.n).k((Class)akdi.class).aa(ivr.f).aB((asix)new ivc(ivr, 5));
                        ivr.h = ivr.d.a(ivr.e.c()).i(vek.h(akdn.b.a(), j)).J((asjd)iuc.d).W((asjc)iqc.n).k((Class)akdm.class).aa(ivr.f).aB((asix)new ivc(ivr, 6));
                    }
                }
                if (this.v()) {
                    final boolean a = ((ivr)this.k.a()).a;
                    this.m.d = a;
                    ((kae)this.y.a()).b(a);
                }
                else {
                    ((kae)this.y.a()).b(true);
                }
                final Iterator iterator = this.A.iterator();
                while (iterator.hasNext()) {
                    ((kaq)iterator.next()).a();
                }
                if (this.u.j(b) != 1 && !((fjp)this.d.a()).j().d()) {
                    return;
                }
                if (this.m.a.q() || this.m.a.p()) {
                    ((lho)this.c.a()).j(false);
                }
            }
        }
    }
    
    public final void r(final Map map) {
        final kan m = this.m;
        if (m != null) {
            final gle a = m.a;
            final aioe d = a.d();
            if (!((kaw)this.f.a()).c(d, (vax)this.i.a(), ((wwu)this.z.a()).n(), map, (acif)new kap(this, a, 0))) {
                ((vax)this.i.a()).c(((wwu)this.z.a()).n().f(d), map);
            }
        }
    }
    
    public final void s(final gee gee) {
        final gee l = this.l;
        if (l != gee) {
            if (l != null) {
                ((RecyclerView)l.a()).aH((iw)this);
            }
            if (gee != null) {
                ((RecyclerView)gee.a()).aE((iw)this);
            }
            final gee i = this.l;
            if (i != null) {
                i.c(false);
            }
            this.u.u();
            this.l = gee;
            ((gjd)this.a.a()).l((gje)gee);
            if ((((kag)this.v.a()).g = gee) != null) {
                gee.c(true);
            }
        }
    }
    
    public final void t(final boolean b) {
        if (!this.x()) {
            return;
        }
        if (!b) {
            this.y();
            final kan m = this.m;
            if (m != null) {
                if (m.c) {
                    m.b.p();
                }
            }
            return;
        }
        ((gec)this.w.a()).k();
        this.A(2, false, null);
    }
    
    public final void u(final gee gee) {
        if (this.l == gee) {
            this.s(null);
        }
    }
    
    public final boolean v() {
        final kan m = this.m;
        if (m != null) {
            final akdd a = m.a.b().a;
            return a == akdd.c || a == akdd.e || a == akdd.f;
        }
        return false;
    }
    
    public final boolean w() {
        final kan m = this.m;
        return m != null && m.d;
    }
    
    public final boolean x() {
        return ((fjp)this.d.a()).j().e() && this.m != null;
    }
}
