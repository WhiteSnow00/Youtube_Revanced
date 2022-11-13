// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx.watch;

import android.view.View$OnClickListener;
import android.content.Context;
import j$.util.Optional;

public class MdxConnectingSnackbarController implements xnr, thj
{
    public final wyv a;
    Optional b;
    private final Context c;
    private final acwb d;
    private final lag e;
    private final xnt f;
    
    public MdxConnectingSnackbarController(final Context c, final acwb d, final lag e, final xnt f, final wyv a) {
        this.c = c;
        d.getClass();
        this.d = d;
        this.e = e;
        this.f = f;
        this.a = a;
        this.b = Optional.empty();
    }
    
    private final void j() {
        if (this.b.isPresent()) {
            this.d.l((acwd)this.b.get());
            this.b = Optional.empty();
        }
    }
    
    public final thh g() {
        return thh.a;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        this.f.k((xnr)this);
    }
    
    public final void mq(final aun aun) {
        this.f.i((xnr)this);
    }
    
    public final void my(final aun aun) {
    }
    
    public final void o(final xnm xnm) {
        this.j();
        if (!this.e.e()) {
            final acwb d = this.d;
            final gbv d2 = gbx.d();
            d2.c(-1);
            d2.k((CharSequence)this.c.getString(2132018516, new Object[] { xnm.j().e() }));
            d.n((acwd)d2.a());
        }
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oT() {
        tfg.g((thj)this);
    }
    
    public final void oW() {
        tfg.f((thj)this);
    }
    
    public final void oX(final aun aun) {
    }
    
    public final void p(final xnm xnm) {
        this.j();
    }
    
    public final void q(final xnm xnm) {
        if (!this.e.e() && xnm.j() != null && !xnm.j().e().isEmpty()) {
            final wyt wyt = new wyt(xaa.c(75407));
            this.a.pF().D((wzz)wyt);
            final gbv d = gbx.d();
            d.j();
            d.c(-2);
            d.k((CharSequence)this.c.getString(2132018518, new Object[] { xnm.j().e() }));
            ((acwc)d).m((CharSequence)this.c.getString(2132018517), (View$OnClickListener)new gbw(this, (wzz)wyt, xnm, 10));
            d.a = null;
            final Optional of = Optional.of((Object)d.a());
            this.b = of;
            this.d.n((acwd)of.get());
        }
    }
}
