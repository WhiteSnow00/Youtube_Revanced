// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import android.view.View;
import android.view.ViewGroup;

public class InlineMutedScrimOverlayRedirectController implements abcc, abnq, tfh
{
    public aalz a;
    public fkk b;
    public long c;
    public final ViewGroup d;
    public final View e;
    public final abns f;
    public final InlinePlaybackController g;
    public final Context h;
    public final tmt i;
    public final uyi j;
    private final fjp k;
    private final asho l;
    private final asib m;
    
    public InlineMutedScrimOverlayRedirectController(final Context h, final ViewGroup d, final abns f, final uyi j, final InlinePlaybackController g, final fjp k, final asho l) {
        this.b = fkk.a;
        this.h = h;
        (this.d = d).getClass();
        this.i = new tmt((View)d);
        this.e = d.findViewById(2131428456);
        this.f = f;
        this.j = j;
        this.g = g;
        this.k = k;
        l.getClass();
        this.l = l;
        this.m = new asib();
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
    
    public final asic[] lX(final abns abns) {
        return new asic[] { ((asgt)abns.q().e).P(this.l).R().am((asix)new ivc(this, 2), (asix)irb.q), this.k.k().z().aC((asix)new ivc(this, 3), (asix)irb.q) };
    }
    
    public final void oS(final aum aum) {
        this.m.f(this.lX(this.f));
    }
    
    public final void oW(final aum aum) {
        this.m.dispose();
    }
}
