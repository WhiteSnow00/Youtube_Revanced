// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

public class ControlsOverlayAlwaysShownController implements tff
{
    public final atjj a;
    public boolean b;
    private itt c;
    private final xjx d;
    private final qpt e;
    
    public ControlsOverlayAlwaysShownController(final xjx d, final atjj a, final itt c) {
        this.d = d;
        this.a = a;
        this.c = c;
        final qpt e = new qpt(this);
        this.e = e;
        d.h.add(e);
        final xjw g = d.g;
        if (g != null) {
            g.b(e);
        }
    }
    
    public final void j() {
        szc.f();
        final boolean b = this.b;
        final itt c = this.c;
        if (c != null) {
            c.l(b);
        }
    }
    
    public final void mM(final aum aum) {
        final xjx d = this.d;
        final qpt e = this.e;
        d.h.remove(e);
        final xjw g = d.g;
        if (g != null) {
            g.h.remove(e);
        }
        this.c = null;
    }
}
