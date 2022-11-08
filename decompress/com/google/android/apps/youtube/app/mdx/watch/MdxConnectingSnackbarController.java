// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx.watch;

import android.view.View$OnClickListener;
import android.content.Context;
import j$.util.Optional;

public class MdxConnectingSnackbarController implements xlt, tff
{
    public final wwu a;
    Optional b;
    private final Context c;
    private final actx d;
    private final kzd e;
    private final xlv f;
    
    public MdxConnectingSnackbarController(final Context c, final actx d, final kzd e, final xlv f, final wwu a) {
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
            this.d.l((actz)this.b.get());
            this.b = Optional.empty();
        }
    }
    
    public final void mM(final aum aum) {
        this.f.k((xlt)this);
    }
    
    public final void mq(final aum aum) {
        this.f.i((xlt)this);
    }
    
    public final void o(final xlo xlo) {
        this.j();
        if (!this.e.e()) {
            final actx d = this.d;
            final gbo d2 = gbq.d();
            d2.c(-1);
            d2.k((CharSequence)this.c.getString(2132018515, new Object[] { xlo.j().e() }));
            d.n((actz)d2.a());
        }
    }
    
    public final void p(final xlo xlo) {
        this.j();
    }
    
    public final void q(final xlo xlo) {
        if (!this.e.e() && xlo.j() != null && !xlo.j().e().isEmpty()) {
            final wws wws = new wws(wya.c(75407));
            this.a.n().D((wxz)wws);
            final gbo d = gbq.d();
            d.j();
            d.c(-2);
            d.k((CharSequence)this.c.getString(2132018517, new Object[] { xlo.j().e() }));
            d.m((CharSequence)this.c.getString(2132018516), (View$OnClickListener)new gbp(this, (wxz)wws, xlo, 10));
            d.a = null;
            final Optional of = Optional.of((Object)d.a());
            this.b = of;
            this.d.n((actz)of.get());
        }
    }
}
