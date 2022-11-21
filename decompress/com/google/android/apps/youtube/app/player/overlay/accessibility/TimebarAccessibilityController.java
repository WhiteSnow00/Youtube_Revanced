// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay.accessibility;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

public final class TimebarAccessibilityController implements tio, ive
{
    public boolean a;
    private final aslm b;
    private final fpq c;
    private final abcj d;
    private boolean e;
    
    public TimebarAccessibilityController(final fpq c, final abcj d, final ivf ivf) {
        this.c = c;
        this.d = d;
        this.b = new aslm();
        ivf.a((ive)this);
    }
    
    public final void A() {
        final fpq c = this.c;
        final boolean e = this.e;
        boolean clickable = false;
        if (e) {
            clickable = clickable;
            if (this.a) {
                clickable = true;
            }
        }
        c.setClickable(clickable);
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final void i(final boolean b) {
    }
    
    public final void j(final ControlsOverlayStyle controlsOverlayStyle) {
        final boolean e = this.e;
        final boolean s = controlsOverlayStyle.s;
        if (e != s) {
            this.e = s;
            this.A();
        }
    }
    
    public final void l(final ivh ivh) {
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void m(final boolean b) {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void n(final boolean b) {
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        this.b.c(this.d.a().p().am((asmi)new jaa(this, 9)));
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        this.b.b();
    }
    
    public final void oZ(final boolean b) {
    }
    
    public final void pa(final ControlsState controlsState) {
    }
    
    public final void pb(final tst tst) {
    }
    
    public final void pc(final boolean b) {
    }
    
    public final void pd(final boolean b) {
    }
    
    public final void r(final boolean b) {
    }
    
    public final void s(final fku fku) {
    }
    
    public final void t(final boolean b) {
    }
    
    public final void u(final boolean b) {
    }
    
    public final void v(final boolean b) {
    }
    
    public final void w(final boolean b) {
    }
    
    public final void x(final boolean b) {
    }
    
    public final void y(final int n) {
    }
    
    public final void z(final boolean b) {
    }
}
