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

public class OfflineModeChangedMealbarController implements tfh, fen, tec
{
    public final gpj a;
    public final thh b;
    public final fjp c;
    public final lgs d;
    public final Handler e;
    public int f;
    public boolean g;
    private final Context h;
    private final abno i;
    private final ggs j;
    private final actu k;
    private final wwu l;
    private final fml m;
    private final tdz n;
    private final abns o;
    private asic p;
    private actw q;
    private apni r;
    private int s;
    private final sin t;
    private final elw u;
    private final aja v;
    
    public OfflineModeChangedMealbarController(final Context h, final abno i, final ggs j, final gpj a, final sin t, final actu k, final wwu l, final thh b, final fjp c, final fml m, final elw u, final lgs d, final tdz n, final abns o, final aja v, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
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
    
    private final actv n() {
        final actv d = this.k.j().d(2131231836);
        d.b = this.h.getString(2132018877);
        d.k = wya.c(38869);
        d.k(false);
        return d;
    }
    
    private final apni o(final wyb wyb) {
        ++this.s;
        return this.l.n().h((Object)this.s, wyb, this.s);
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
    
    public final actw j() {
        final PaneDescriptor d = this.j.d();
        if (this.m.i() && d != null) {
            if (!this.g) {
                if (this.c.j().i()) {
                    final Object a = this.u.a;
                    if (a != null) {
                        if (((lgq)a).i() == 3) {
                            return null;
                        }
                        final lcq j = ((lgq)a).j();
                        if (j != null) {
                            final String c = j.h.c();
                            if (!aexs.f(c)) {
                                if (this.m.m(c)) {
                                    return null;
                                }
                            }
                        }
                    }
                }
                else {
                    final ggh f = this.j.f();
                    if ((f instanceof fed && ((fed)f).a()) || this.v.u(d)) {
                        return null;
                    }
                    final aioe f2 = d.f();
                    if (f2 == null) {
                        return null;
                    }
                    if (((aial)((agzd)f2).rr((agyr)BrowseEndpointOuterClass.browseEndpoint)).c.equals("FElibrary")) {
                        return null;
                    }
                }
                if (this.m.g()) {
                    final boolean o = this.m.o();
                    int n;
                    if (!o) {
                        n = 2132018867;
                    }
                    else {
                        n = 2132018868;
                    }
                    int n2;
                    if (!o) {
                        n2 = 2132018876;
                    }
                    else {
                        n2 = 2132018874;
                    }
                    final actv d2 = this.n().d(2131231495);
                    d2.b = this.h.getString(n2);
                    d2.c = this.h.getString(n);
                    final actv c2 = d2.a((CharSequence)this.h.getString(2132018872), (View$OnClickListener)new iaf(this, 11)).c((CharSequence)this.h.getString(2132018865), (View$OnClickListener)new iaf(this, 12));
                    c2.k = wya.c(51768);
                    return c2.j();
                }
                final actv n3 = this.n();
                n3.c = this.h.getString(2132018864);
                return n3.a((CharSequence)this.h.getString(2132018863), (View$OnClickListener)new iaf(this, 9)).c((CharSequence)this.h.getString(2132018865), (View$OnClickListener)new iaf(this, 10)).j();
            }
        }
        return null;
    }
    
    public final void k() {
        final actw q = this.q;
        if (q != null) {
            this.k.k(q);
            this.q = null;
        }
    }
    
    public final void l(final int n) {
        if (this.r == null) {
            trn.l("Missing offline mealbar visual element");
        }
        this.l.n().J(3, (wxz)new wws(wya.c(n)), (alff)null);
    }
    
    public final void m(final actw q) {
        if (q != null) {
            this.k.l(q);
            this.g = true;
            this.q = q;
            final wyb m = q.m;
            if (m != null) {
                this.r = this.o(m);
                this.l.n().l(xkm.aq(this.r));
                final apni r = this.r;
                if (r == null) {
                    trn.l("Missing offline mealbar visual element");
                    return;
                }
                wyb wyb;
                if (this.m.g()) {
                    wyb = wya.c(51770);
                }
                else {
                    wyb = wya.c(38871);
                }
                final apni o = this.o(wyb);
                wyb wyb2;
                if (this.m.g()) {
                    wyb2 = wya.c(51769);
                }
                else {
                    wyb2 = wya.c(38870);
                }
                final apni o2 = this.o(wyb2);
                final wwv n = this.l.n();
                n.m(xkm.aq(o), xkm.aq(r));
                n.m(xkm.aq(o2), xkm.aq(r));
            }
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final boolean a = ((aakk)o).a();
            array = null;
            if (!a) {
                this.g = false;
                return null;
            }
        }
        else {
            array = new Class[] { aakk.class };
        }
        return array;
    }
    
    public final void oS(final aum aum) {
        this.p = ((asgt)this.o.q().k).am((asix)new hzh(this, 12), (asix)hnn.i);
        this.n.g((Object)this);
        this.t.j((fen)this);
    }
    
    public final void oW(final aum aum) {
        final asic p = this.p;
        if (p != null) {
            athh.f((AtomicReference)p);
            this.p = null;
        }
        this.n.m((Object)this);
        this.t.k((fen)this);
    }
}
