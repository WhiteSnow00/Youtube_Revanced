// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import android.view.View;
import android.view.ViewGroup;

public class InlineMutedScrimOverlayRedirectController implements abfc, abqx, tio
{
    public aapq a;
    public fku b;
    public long c;
    public final ViewGroup d;
    public final View e;
    public final abqz f;
    public final InlinePlaybackController g;
    public final Context h;
    public final tqa i;
    public final vbs j;
    private final fjy k;
    private final askz l;
    private final aslm m;
    
    public InlineMutedScrimOverlayRedirectController(final Context h, final ViewGroup d, final abqz f, final vbs j, final InlinePlaybackController g, final fjy k, final askz l) {
        this.b = fku.a;
        this.h = h;
        (this.d = d).getClass();
        this.i = new tqa((View)d);
        this.e = d.findViewById(2131428456);
        this.f = f;
        this.j = j;
        this.g = g;
        this.k = k;
        l.getClass();
        this.l = l;
        this.m = new aslm();
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final void h(final int n, final long n2) {
        if (n == 1 || n == 2) {
            this.d.setVisibility(0);
            this.i.b(true);
            return;
        }
        if (n != 3 && n != 4) {
            return;
        }
        this.i.a(true);
    }
    
    public final void j() {
        this.d.setVisibility(8);
        this.e.setVisibility(8);
    }
    
    public final void lW(final aup aup) {
    }
    
    public final asln[] lX(final abqz abqz) {
        return new asln[] { ((aske)abqz.p().e).P(this.l).R().an((asmi)new iwh(this, 4), (asmi)isj.q), this.k.k().A().aI((asmi)new iwh(this, 5), (asmi)isj.q) };
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        this.m.f(this.lX(this.f));
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        this.m.dispose();
    }
}
