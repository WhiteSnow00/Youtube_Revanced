// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.bottomui;

import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Map;
import android.view.View$OnClickListener;
import android.text.TextUtils;
import android.content.Context;

public class MealbarPromoController implements thl, tgg
{
    public final wyw a;
    public amfo b;
    public acwa c;
    public amfo d;
    public fkr e;
    public final hhg f;
    public final hhg g;
    public final heo h;
    public final hyx i;
    private final Context j;
    private final acvy k;
    private asir l;
    private final tgd m;
    private final abpu n;
    private final asiq o;
    private final fjv p;
    private final actt q;
    private final eg r;
    private final hyx s;
    
    public MealbarPromoController(final Context j, final wyw a, final acvy k, final eg r, final hyx s, final tgd m, final abpu n, final ziy d, final fjv p18, final actt q, final heo h, final hyx i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.j = j;
        a.getClass();
        this.a = a;
        k.getClass();
        this.k = k;
        if (k instanceof gbp) {
            ((gbp)k).d = d;
        }
        this.r = r;
        this.s = s;
        this.m = m;
        this.n = n;
        this.o = new asiq();
        this.p = p18;
        this.q = q;
        this.h = h;
        this.i = i;
        this.g = new hhg((char[])null);
        this.f = new hhg((char[])null);
    }
    
    private final acwa m(final acvz acvz) {
        if ((acvz.m & 0x4) != 0x0) {
            if (acvz.a) {
                if (TextUtils.isEmpty(acvz.b)) {
                    acvz.b = this.j.getString(2132017750);
                }
                if (TextUtils.isEmpty(acvz.d)) {
                    acvz.b((CharSequence)this.j.getString(2132017892), (View$OnClickListener)null, (aicz)null);
                }
            }
            return acvz.j();
        }
        throw new IllegalStateException("Property \"counterfactual\" has not been set");
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final void j(final amfo amfo) {
        if (amfo != null && this.c != null) {
            if (((ahbh)amfo).equals((Object)this.b)) {
                this.k.k(this.c);
            }
        }
    }
    
    public final void k(final amfo d, final wyw wyw) {
        this.f.d((amfo)null);
        this.d = null;
        if (d == null) {
            if (this.c != null) {
                this.j(this.b);
            }
            return;
        }
        final int i = d.i;
        final int dr = aqsx.dr(i);
        if (dr != 0) {
            if (dr == 2) {
                this.l(d, wyw);
                return;
            }
        }
        final int dr2 = aqsx.dr(i);
        if (dr2 != 0) {
            if (dr2 == 6) {
                this.d = d;
                return;
            }
        }
        this.f.d(d);
    }
    
    public final void l(final amfo amfo, final wyw wyw) {
        if (amfo != null) {
            if (!((ahbh)amfo).equals((Object)this.b)) {
                final hlc hlc = new hlc(this, amfo, 1);
                final acvz j = this.s.j(amfo, (Map)null);
                if (amfo.p.size() == 0) {
                    j.l = (acvo)this.r.P(amfo, wyw, (acvo)hlc);
                    this.k.l(this.m(j));
                    return;
                }
                if (!this.q.c((List)amfo.p)) {
                    return;
                }
                j.l = (acvo)this.r.P(amfo, wyw, (acvo)hlc);
                this.k.l(this.m(j));
                this.q.a((List)amfo.p);
            }
        }
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final Class[] ms(final Class clazz, Object b, final int n) {
        Class[] array2;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final sax sax = (sax)b;
            final boolean d = this.h.D();
            final Class[] array = null;
            if (d) {
                array2 = array;
            }
            else {
                final hhg f = this.f;
                Object a = f.a;
                Label_0078: {
                    if (a != null) {
                        f.a = null;
                        if (hhg.e(sax.b(), sax.a())) {
                            break Label_0078;
                        }
                    }
                    a = null;
                }
                final hhg f2 = this.f;
                b = f2.b;
                Label_0121: {
                    if (b != null) {
                        f2.b = null;
                        if (hhg.e(sax.b(), sax.a())) {
                            break Label_0121;
                        }
                    }
                    b = null;
                }
                if (a != null) {
                    this.l((amfo)a, this.a);
                    array2 = array;
                }
                else {
                    if (b != null) {
                        this.i.g((aiqm)b);
                        return null;
                    }
                    array2 = array;
                }
            }
        }
        else {
            array2 = new Class[] { sax.class };
        }
        return array2;
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
        this.o.f(((ashi)this.n.p().b).an((asjm)new gao(this, 5), (asjm)fua.g));
        this.m.g((Object)this);
        this.e = this.p.j();
        this.l = this.p.k().A().aH((asjm)new gao(this, 6));
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        this.o.b();
        this.m.m((Object)this);
        final asir l = this.l;
        if (l != null) {
            asjv.b((AtomicReference)l);
            this.l = null;
        }
    }
}
