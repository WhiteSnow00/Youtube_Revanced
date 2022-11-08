// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

import android.view.View;
import android.view.View$OnClickListener;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import android.content.Context;

public class MusicAppDeeplinkButtonController extends fxp implements tfh
{
    public final vax d;
    public final wwv e;
    private final Context f;
    private final abns g;
    private final acng h;
    private final asib i;
    private final arhr j;
    
    public MusicAppDeeplinkButtonController(final Context f, final abns g, final acng h, final vax d, final wwv e, final arhr j) {
        this.f = f;
        g.getClass();
        this.g = g;
        h.getClass();
        this.h = h;
        d.getClass();
        this.d = d;
        this.i = new asib();
        this.e = e;
        this.j = j;
    }
    
    protected final void l() {
        final aibb aibb = (aibb)super.b;
        final View j = this.j();
        if (aibb != null) {
            if (j != null) {
                final TouchImageView touchImageView = (TouchImageView)j.findViewById(2131429984);
                if (touchImageView == null) {
                    return;
                }
                if ((aibb.b & 0x10000) != 0x0) {
                    touchImageView.setOnClickListener((View$OnClickListener)new iwh(this, 3));
                    return;
                }
                touchImageView.setOnClickListener((View$OnClickListener)null);
                touchImageView.setClickable(false);
            }
        }
    }
    
    public final void o(final boolean b, final boolean b2) {
        final aibb aibb = (aibb)super.b;
        if (aibb == null && b) {
            return;
        }
        final boolean r = this.r();
        super.o(b, b2);
        if (!r && this.r() && aibb != null) {
            this.e.t((wxz)new wws(aibb.w), (alff)null);
            final View j = this.j();
            if ((aibb.b & 0x1000) != 0x0 && j != null) {
                ((acuj)this.j.a()).d(aibb.k, j.findViewById(2131429984));
            }
        }
    }
    
    public final void oS(final aum aum) {
        this.i.c(this.g.Q().R().P(ashw.a()).am((asix)new ivc(this, 18), (asix)iwn.b));
    }
    
    public final void oW(final aum aum) {
        this.i.b();
    }
    
    protected final void q() {
        final aibb aibb = (aibb)super.b;
        final View j = this.j();
        if (aibb != null) {
            if (j != null) {
                final TouchImageView touchImageView = (TouchImageView)j.findViewById(2131429984);
                akbf akbf;
                if ((akbf = aibb.g) == null) {
                    akbf = akbf.a;
                }
                akbe akbe;
                if ((akbe = akbe.b(akbf.c)) == null) {
                    akbe = akbe.a;
                }
                final int a = this.h.a(akbe);
                if (touchImageView != null) {
                    if (a != 0) {
                        touchImageView.setImageDrawable(this.f.getResources().getDrawable(a));
                    }
                }
            }
        }
    }
    
    protected final void s() {
    }
}
