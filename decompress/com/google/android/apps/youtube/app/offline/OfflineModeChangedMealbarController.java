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

public class OfflineModeChangedMealbarController implements tio, fex, thj
{
    public final veh a;
    public final tkq b;
    public final fjy c;
    public final lia d;
    public final Handler e;
    public int f;
    public boolean g;
    private final Context h;
    private final abqv i;
    private final ghf j;
    private final acxl k;
    private final xaa l;
    private final fmu m;
    private final thg n;
    private final abqz o;
    private asln p;
    private acxn q;
    private apry r;
    private int s;
    private final slt t;
    private final ema u;
    private final ajc v;
    
    public OfflineModeChangedMealbarController(final Context h, final abqv i, final ghf j, final veh a, final slt t, final acxl k, final xaa l, final tkq b, final fjy c, final fmu m, final ema u, final lia d, final thg n, final abqz o, final ajc v, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.h = h;
        this.i = i;
        this.j = j;
        this.a = a;
        this.k = k;
        this.l = l;
        this.b = b;
        this.c = c;
        this.m = m;
        this.u = u;
        this.d = d;
        this.n = n;
        this.o = o;
        this.v = v;
        this.t = t;
        this.e = new Handler(Looper.getMainLooper());
    }
    
    private final acxm n() {
        final acxm d = this.k.j().d(2131231834);
        d.b = this.h.getString(2132018880);
        d.k = xbf.c(38869);
        d.k(false);
        return d;
    }
    
    private final apry o(final xbg xbg) {
        ++this.s;
        return this.l.pE().h((Object)this.s, xbg, this.s);
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final acxn j() {
        final PaneDescriptor d = this.j.d();
        if (this.m.i() && d != null) {
            if (!this.g) {
                if (this.c.j().i()) {
                    final Object a = this.u.a;
                    if (a != null) {
                        if (((lhy)a).i() == 3) {
                            return null;
                        }
                        final lea j = ((lhy)a).j();
                        if (j != null) {
                            final String c = j.h.c();
                            if (!afbj.f(c)) {
                                if (this.m.m(c)) {
                                    return null;
                                }
                            }
                        }
                    }
                }
                else {
                    final ggv f = this.j.f();
                    if ((f instanceof fen && ((fen)f).a()) || this.v.u(d)) {
                        return null;
                    }
                    final aisc f2 = d.f();
                    if (f2 == null) {
                        return null;
                    }
                    if (((aiec)((ahcu)f2).rx((ahci)BrowseEndpointOuterClass.browseEndpoint)).c.equals("FElibrary")) {
                        return null;
                    }
                }
                if (this.m.g()) {
                    final boolean o = this.m.o();
                    int n;
                    if (!o) {
                        n = 2132018870;
                    }
                    else {
                        n = 2132018871;
                    }
                    int n2;
                    if (!o) {
                        n2 = 2132018879;
                    }
                    else {
                        n2 = 2132018877;
                    }
                    final acxm d2 = this.n().d(2131231493);
                    d2.b = this.h.getString(n2);
                    d2.c = this.h.getString(n);
                    final acxm c2 = d2.a(this.h.getString(2132018875), (View$OnClickListener)new ibj(this, 11)).c(this.h.getString(2132018868), (View$OnClickListener)new ibj(this, 12));
                    c2.k = xbf.c(51768);
                    return c2.j();
                }
                final acxm n3 = this.n();
                n3.c = this.h.getString(2132018867);
                return n3.a(this.h.getString(2132018866), (View$OnClickListener)new ibj(this, 9)).c(this.h.getString(2132018868), (View$OnClickListener)new ibj(this, 10)).j();
            }
        }
        return null;
    }
    
    public final void k() {
        final acxn q = this.q;
        if (q != null) {
            this.k.k(q);
            this.q = null;
        }
    }
    
    public final void l(final int n) {
        if (this.r == null) {
            tut.l("Missing offline mealbar visual element");
        }
        this.l.pE().J(3, (xbe)new wzy(xbf.c(n)), (alji)null);
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void m(final acxn q) {
        if (q != null) {
            this.k.l(q);
            this.g = true;
            this.q = q;
            final xbg m = q.m;
            if (m != null) {
                this.r = this.o(m);
                this.l.pE().l(xny.P(this.r));
                final apry r = this.r;
                if (r == null) {
                    tut.l("Missing offline mealbar visual element");
                    return;
                }
                xbg xbg;
                if (this.m.g()) {
                    xbg = xbf.c(51770);
                }
                else {
                    xbg = xbf.c(38871);
                }
                final apry o = this.o(xbg);
                xbg xbg2;
                if (this.m.g()) {
                    xbg2 = xbf.c(51769);
                }
                else {
                    xbg2 = xbf.c(38870);
                }
                final apry o2 = this.o(xbg2);
                final xab pe = this.l.pE();
                pe.m(xny.P(o), xny.P(r));
                pe.m(xny.P(o2), xny.P(r));
            }
        }
    }
    
    public final void mp(final aup aup) {
    }
    
    public final Class[] mr(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final boolean a = ((aaob)o).a();
            array = null;
            if (!a) {
                this.g = false;
                return null;
            }
        }
        else {
            array = new Class[] { aaob.class };
        }
        return array;
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oJ(final boolean b) {
        if (!b) {
            this.k();
            return;
        }
        if (this.c.j().i() && this.i.f()) {
            return;
        }
        this.m(this.j());
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        this.p = ((aske)this.o.p().k).an((asmi)new iam(this, 13), (asmi)hoq.i);
        this.n.g((Object)this);
        this.t.j((fex)this);
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        final asln p = this.p;
        if (p != null) {
            atkw.f((AtomicReference)p);
            this.p = null;
        }
        this.n.m((Object)this);
        this.t.k((fex)this);
    }
}
