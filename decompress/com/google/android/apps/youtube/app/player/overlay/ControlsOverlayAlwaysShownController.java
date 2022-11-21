// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

public class ControlsOverlayAlwaysShownController implements tim
{
    public final atnb a;
    public boolean b;
    private ivb c;
    private final xni d;
    private final oqz e;
    
    public ControlsOverlayAlwaysShownController(final xni d, final atnb a, final ivb c) {
        this.d = d;
        this.a = a;
        this.c = c;
        final oqz e = new oqz(this);
        this.e = e;
        d.h.add(e);
        final xnh g = d.g;
        if (g != null) {
            g.b(e);
        }
    }
    
    public final tik g() {
        return tik.a;
    }
    
    public final void j() {
        tcl.l();
        final boolean b = this.b;
        final ivb c = this.c;
        if (c != null) {
            c.j(b);
        }
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
        final xni d = this.d;
        final oqz e = this.e;
        d.h.remove(e);
        final xnh g = d.g;
        if (g != null) {
            g.h.remove(e);
        }
        this.c = null;
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
}
