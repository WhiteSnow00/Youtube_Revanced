// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.playervideoviewlayoutdelegate;

import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;

public class PlayerVideoViewLayoutDelegateController implements thl, fju
{
    private final fjv a;
    private final gfc b;
    private final lif c;
    private final iri d;
    
    public PlayerVideoViewLayoutDelegateController(final iri d, final fjv a, final gfc b, final lif c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void n(final fkr fkr) {
        final YouTubePlayerViewNotForReflection r = ((iru)this.d.b()).R;
        if (r == null) {
            return;
        }
        if (fkr.i()) {
            ((foi)r).lU((foh)this.c);
            return;
        }
        if (fkr.e()) {
            ((foi)r).lU((foh)this.b);
            return;
        }
        ((foi)r).lU((foh)null);
    }
    
    public final void oK(final fkr fkr, final fkr fkr2) {
        fal.b((fju)this, fkr2);
    }
    
    public final void oS(final aun aun) {
        this.a.l((fju)this);
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        this.a.n((fju)this);
    }
}
