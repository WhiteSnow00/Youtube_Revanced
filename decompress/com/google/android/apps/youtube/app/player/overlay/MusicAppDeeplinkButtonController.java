// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

import android.view.View;
import android.view.View$OnClickListener;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import android.content.Context;

public class MusicAppDeeplinkButtonController extends fyc implements tio
{
    public final veh d;
    public final xab e;
    private final Context f;
    private final abqz g;
    private final acqv h;
    private final aslm i;
    private final arna j;
    
    public MusicAppDeeplinkButtonController(final Context f, final abqz g, final acqv h, final veh d, final xab e, final arna j) {
        this.f = f;
        g.getClass();
        this.g = g;
        h.getClass();
        this.h = h;
        d.getClass();
        this.d = d;
        this.i = new aslm();
        this.e = e;
        this.j = j;
    }
    
    public final tik g() {
        return tik.b;
    }
    
    protected final void l() {
        final aies aies = (aies)super.b;
        final View j = this.j();
        if (aies != null) {
            if (j != null) {
                final TouchImageView touchImageView = (TouchImageView)j.findViewById(2131429984);
                if (touchImageView == null) {
                    return;
                }
                if ((aies.b & 0x10000) != 0x0) {
                    touchImageView.setOnClickListener((View$OnClickListener)new ixp(this, 3));
                    return;
                }
                touchImageView.setOnClickListener((View$OnClickListener)null);
                touchImageView.setClickable(false);
            }
        }
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void o(final boolean b, final boolean b2) {
        final aies aies = (aies)super.b;
        if (aies == null && b) {
            return;
        }
        final boolean r = this.r();
        super.o(b, b2);
        if (!r && this.r() && aies != null) {
            this.e.t((xbe)new wzy(aies.w), (alji)null);
            final View j = this.j();
            if ((aies.b & 0x1000) != 0x0 && j != null) {
                ((acya)this.j.a()).d(aies.k, j.findViewById(2131429984));
            }
        }
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        this.i.c(this.g.P().R().P(aslh.a()).an((asmi)new iwh(this, 20), (asmi)isj.u));
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        this.i.b();
    }
    
    protected final void q() {
        final aies aies = (aies)super.b;
        final View j = this.j();
        if (aies != null) {
            if (j != null) {
                final TouchImageView touchImageView = (TouchImageView)j.findViewById(2131429984);
                akfj akfj;
                if ((akfj = aies.g) == null) {
                    akfj = akfj.a;
                }
                akfi akfi;
                if ((akfi = akfi.b(akfj.c)) == null) {
                    akfi = akfi.a;
                }
                final int a = this.h.a(akfi);
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
