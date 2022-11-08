// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay.accessibility;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

public final class TimebarAccessibilityController implements tfh, itw
{
    public boolean a;
    private final asib b;
    private final fpg c;
    private final aazh d;
    private boolean e;
    
    public TimebarAccessibilityController(final fpg c, final aazh d, final itx itx) {
        this.c = c;
        this.d = d;
        this.b = new asib();
        itx.a((itw)this);
    }
    
    public final void i(final ControlsOverlayStyle controlsOverlayStyle) {
        final boolean e = this.e;
        final boolean s = controlsOverlayStyle.s;
        if (e != s) {
            this.e = s;
            this.z();
        }
    }
    
    public final void oS(final aum aum) {
        this.b.c(this.d.a().p().al((asix)new iys(this, 7)));
    }
    
    public final void oW(final aum aum) {
        this.b.b();
    }
    
    public final void z() {
        final fpg c = this.c;
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
}
