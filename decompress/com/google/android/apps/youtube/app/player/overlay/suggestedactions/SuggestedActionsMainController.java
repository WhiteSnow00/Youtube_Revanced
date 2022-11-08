// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay.suggestedactions;

import android.view.TouchDelegate;
import android.content.Context;
import java.util.HashSet;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.view.ViewGroup;
import java.util.Set;

public class SuggestedActionsMainController implements tfh, aamq
{
    public final acij a;
    public final asib b;
    public final Set c;
    public final Set d;
    public final atir e;
    public final jcb f;
    public boolean g;
    public ViewGroup h;
    public aolv i;
    public WatchNextResponseModel j;
    public boolean k;
    public int l;
    public atjj m;
    public String n;
    public asgt o;
    public tmt p;
    public final jjg q;
    public final aja r;
    public final lht s;
    public final e t;
    private final acoh u;
    private final abns v;
    private final asib w;
    private final Handler x;
    private final uug y;
    private boolean z;
    
    public SuggestedActionsMainController(final lht s, final jjg q, final aja r, final e t, final qbo qbo, final wwv wwv, final abcd abcd, final acoh u, final abns v, final Handler x, final uug y, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        ((wwx)(this.a = new acij())).a(wwv);
        this.b = new asib();
        this.c = new HashSet();
        this.d = new HashSet();
        this.s = s;
        this.q = q;
        this.r = r;
        this.t = t;
        this.u = u;
        this.v = v;
        this.x = x;
        this.w = new asib();
        this.g = false;
        this.e = atir.e();
        this.i = null;
        this.j = null;
        this.o = null;
        final jcd jcd = new jcd(this, 2, (byte[])null);
        final Context context = (Context)((atjj)qbo.a).a();
        context.getClass();
        final vax vax = (vax)((atjj)qbo.g).a();
        vax.getClass();
        final acng acng = (acng)((atjj)qbo.b).a();
        acng.getClass();
        final aceo aceo = (aceo)((atjj)qbo.f).a();
        aceo.getClass();
        final uyf uyf = (uyf)((atjj)qbo.e).a();
        uyf.getClass();
        final tku tku = (tku)((atjj)qbo.c).a();
        tku.getClass();
        final ixc ixc = (ixc)((atjj)qbo.d).a();
        ixc.getClass();
        this.f = new jcb(context, vax, acng, aceo, uyf, tku, ixc, (Runnable)jcd);
        this.y = y;
        abcd.q((abcc)new jbk(this, 2));
    }
    
    public final ViewGroup j() {
        final ViewGroup h = this.h;
        h.getClass();
        return h;
    }
    
    public final void k() {
        if (!this.c.isEmpty()) {
            final aols aols = this.c.iterator().next();
            this.m(aols);
            this.c.remove(aols);
        }
    }
    
    public final void l(final Runnable runnable) {
        final ViewGroup h = this.h;
        if (h != null && h.getChildCount() != 0) {
            this.p(false, true);
            this.x.postDelayed((Runnable)new idt(this, runnable, 20), (long)this.l);
            this.j().setTouchDelegate((TouchDelegate)null);
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
    }
    
    public final void m(final aols aols) {
        this.l(new jku(this, aols, 1));
    }
    
    public final void mM(final aum aum) {
        this.c.clear();
        this.d.clear();
    }
    
    public final void n() {
        final atir e = this.e;
        final ViewGroup h = this.h;
        boolean b = false;
        if (h != null) {
            b = b;
            if (h.getChildCount() > 0) {
                b = true;
            }
        }
        e.tr((Object)b);
    }
    
    public final void o() {
        this.b.b();
        this.c.clear();
        this.d.clear();
        this.l(null);
    }
    
    public final void oS(final aum aum) {
        final asib w = this.w;
        final abns v = this.v;
        asic asic;
        if (((uyi)v.cd().h).bx()) {
            asic = v.R().am((asix)new jcc(this), (asix)iwn.s);
        }
        else {
            asic = v.Q().R().P(ashw.a()).am((asix)new jcc(this), (asix)iwn.s);
        }
        w.f(new asic[] { asic, v.E().am((asix)new jbf(this, 12), (asix)iwn.s), this.y.A().al((asix)new jbf(this, 13)) });
    }
    
    public final void oW(final aum aum) {
        this.w.b();
        this.b.b();
    }
    
    public final void p(boolean b, final boolean b2) {
        final tmt p2 = this.p;
        if (p2 != null) {
            if (this.h != null) {
                if (this.g || this.u.isInMultiWindowMode() || this.k || this.z || this.y.F()) {
                    b = false;
                }
                p2.l(b, b2);
                if (this.j().getChildCount() != 0) {
                    if (b) {
                        final jcb f = this.f;
                        final wwv f2 = f.f;
                        if (f2 != null) {
                            final agyc b3 = f.b();
                            if (b3 != null) {
                                f2.t((wxz)new wws(b3), (alff)null);
                                f2.t((wxz)new wws(wya.c(87958)), (alff)null);
                            }
                        }
                    }
                    else {
                        final jcb f3 = this.f;
                        final wwv f4 = f3.f;
                        if (f4 != null) {
                            final agyc b4 = f3.b();
                            if (b4 != null) {
                                f4.o((wxz)new wws(b4), (alff)null);
                                f4.o((wxz)new wws(wya.c(87958)), (alff)null);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void pd(final boolean z) {
        if (this.z == z) {
            return;
        }
        this.p((this.z = z) ^ true, false);
    }
}
