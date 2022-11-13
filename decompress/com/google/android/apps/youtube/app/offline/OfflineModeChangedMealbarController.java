// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.offline;

import java.util.concurrent.atomic.AtomicReference;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import android.view.View$OnClickListener;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import android.os.Looper;
import android.content.Context;
import android.os.Handler;

public class OfflineModeChangedMealbarController implements thl, feu, tgg
{
    public final gpo a;
    public final tjm b;
    public final fjv c;
    public final lhs d;
    public final Handler e;
    public int f;
    public boolean g;
    private final Context h;
    private final abpq i;
    private final ghb j;
    private final acvy k;
    private final wyv l;
    private final fmr m;
    private final tgd n;
    private final abpu o;
    private asir p;
    private acwa q;
    private appm r;
    private int s;
    private final skt t;
    private final ajb u;
    private final elx v;
    
    public OfflineModeChangedMealbarController(final Context h, final abpq i, final ghb j, final gpo a, final skt t, final acvy k, final wyv l, final tjm b, final fjv c, final fmr m, final elx v, final lhs d, final tgd n, final abpu o, final ajb u, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.h = h;
        this.i = i;
        this.j = j;
        this.a = a;
        this.k = k;
        this.l = l;
        this.b = b;
        this.c = c;
        this.m = m;
        this.v = v;
        this.d = d;
        this.n = n;
        this.o = o;
        this.u = u;
        this.t = t;
        this.e = new Handler(Looper.getMainLooper());
    }
    
    private final acvz n() {
        final acvz d = this.k.j().d(2131231836);
        d.b = this.h.getString(2132018878);
        d.k = xaa.c(38869);
        d.k(false);
        return d;
    }
    
    private final appm o(final xab xab) {
        ++this.s;
        return this.l.pF().h((Object)this.s, xab, this.s);
    }
    
    public final void b(final boolean b) {
        if (!b) {
            this.k();
            return;
        }
        if (this.c.j().i() && this.i.f()) {
            return;
        }
        this.m(this.j());
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final acwa j() {
        final PaneDescriptor d = this.j.d();
        if (this.m.i() && d != null) {
            if (!this.g) {
                if (this.c.j().i()) {
                    final Object a = this.v.a;
                    if (a != null) {
                        if (((lhq)a).i() == 3) {
                            return null;
                        }
                        final lds j = ((lhq)a).j();
                        if (j != null) {
                            final String c = j.h.c();
                            if (!aezr.f(c)) {
                                if (this.m.m(c)) {
                                    return null;
                                }
                            }
                        }
                    }
                }
                else {
                    final ggq f = this.j.f();
                    if ((f instanceof fek && ((fek)f).a()) || this.u.u(d)) {
                        return null;
                    }
                    final aiqj f2 = d.f();
                    if (f2 == null) {
                        return null;
                    }
                    if (((aicj)((ahbc)f2).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint)).c.equals("FElibrary")) {
                        return null;
                    }
                }
                if (this.m.g()) {
                    final boolean o = this.m.o();
                    int n;
                    if (!o) {
                        n = 2132018868;
                    }
                    else {
                        n = 2132018869;
                    }
                    int n2;
                    if (!o) {
                        n2 = 2132018877;
                    }
                    else {
                        n2 = 2132018875;
                    }
                    final acvz d2 = this.n().d(2131231495);
                    d2.b = this.h.getString(n2);
                    d2.c = this.h.getString(n);
                    final acvz c2 = d2.a((CharSequence)this.h.getString(2132018873), (View$OnClickListener)new ibb(this, 11)).c((CharSequence)this.h.getString(2132018866), (View$OnClickListener)new ibb(this, 12));
                    c2.k = xaa.c(51768);
                    return c2.j();
                }
                final acvz n3 = this.n();
                n3.c = this.h.getString(2132018865);
                return n3.a((CharSequence)this.h.getString(2132018864), (View$OnClickListener)new ibb(this, 9)).c((CharSequence)this.h.getString(2132018866), (View$OnClickListener)new ibb(this, 10)).j();
            }
        }
        return null;
    }
    
    public final void k() {
        final acwa q = this.q;
        if (q != null) {
            this.k.k(q);
            this.q = null;
        }
    }
    
    public final void l(final int n) {
        if (this.r == null) {
            ttr.l("Missing offline mealbar visual element");
        }
        this.l.pF().J(3, (wzz)new wyt(xaa.c(n)), (alhi)null);
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void m(final acwa q) {
        if (q != null) {
            this.k.l(q);
            this.g = true;
            this.q = q;
            final xab m = q.m;
            if (m != null) {
                this.r = this.o(m);
                this.l.pF().l(xmm.ac(this.r));
                final appm r = this.r;
                if (r == null) {
                    ttr.l("Missing offline mealbar visual element");
                    return;
                }
                xab xab;
                if (this.m.g()) {
                    xab = xaa.c(51770);
                }
                else {
                    xab = xaa.c(38871);
                }
                final appm o = this.o(xab);
                xab xab2;
                if (this.m.g()) {
                    xab2 = xaa.c(51769);
                }
                else {
                    xab2 = xaa.c(38870);
                }
                final appm o2 = this.o(xab2);
                final wyw pf = this.l.pF();
                pf.m(xmm.ac(o), xmm.ac(r));
                pf.m(xmm.ac(o2), xmm.ac(r));
            }
        }
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final boolean a = ((aame)o).a();
            array = null;
            if (!a) {
                this.g = false;
                return null;
            }
        }
        else {
            array = new Class[] { aame.class };
        }
        return array;
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
        this.p = ((ashi)this.o.p().k).an((asjm)new iad(this, 11), (asjm)hot.h);
        this.n.g((Object)this);
        this.t.j((feu)this);
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        final asir p = this.p;
        if (p != null) {
            athz.f((AtomicReference)p);
            this.p = null;
        }
        this.n.m((Object)this);
        this.t.k((feu)this);
    }
}
