// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx.watch;

import android.view.View$OnClickListener;
import android.content.Context;
import j$.util.Optional;

public class MdxConnectingSnackbarController implements xpd, tim
{
    public final xaa a;
    Optional b;
    private final Context c;
    private final acxo d;
    private final lap e;
    private final xpf f;
    
    public MdxConnectingSnackbarController(final Context c, final acxo d, final lap e, final xpf f, final xaa a) {
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
            this.d.l((acxq)this.b.get());
            this.b = Optional.empty();
        }
    }
    
    public final tik g() {
        return tik.a;
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void mp(final aup aup) {
        this.f.i((xpd)this);
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void o(final xoy xoy) {
        this.j();
        if (!this.e.e()) {
            final acxo d = this.d;
            final gcb d2 = gcd.d();
            d2.c(-1);
            d2.k((CharSequence)this.c.getString(2132018518, new Object[] { xoy.j().e() }));
            d.n((acxq)d2.a());
        }
    }
    
    public final void oO(final aup aup) {
        this.f.k((xpd)this);
    }
    
    public final void oT(final aup aup) {
    }
    
    public final void oU() {
        tgj.h((tim)this);
    }
    
    public final void oX() {
        tgj.g((tim)this);
    }
    
    public final void oY(final aup aup) {
    }
    
    public final void p(final xoy xoy) {
        this.j();
    }
    
    public final void q(final xoy xoy) {
        if (!this.e.e() && xoy.j() != null && !xoy.j().e().isEmpty()) {
            final wzy wzy = new wzy(xbf.c(75407));
            this.a.pE().D((xbe)wzy);
            final gcb d = gcd.d();
            d.j();
            d.c(-2);
            d.k((CharSequence)this.c.getString(2132018520, new Object[] { xoy.j().e() }));
            ((acxp)d).m(this.c.getString(2132018519), (View$OnClickListener)new gcc(this, (xbe)wzy, xoy, 10));
            d.a = null;
            final Optional of = Optional.of((Object)d.a());
            this.b = of;
            this.d.n((acxq)of.get());
        }
    }
}
