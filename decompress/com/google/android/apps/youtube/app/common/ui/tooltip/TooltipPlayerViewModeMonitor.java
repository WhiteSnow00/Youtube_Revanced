// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.tooltip;

public class TooltipPlayerViewModeMonitor implements tfh, fjo
{
    private final acup a;
    private final fjp b;
    
    public TooltipPlayerViewModeMonitor(final acup a, final fjp b) {
        this.a = a;
        this.b = b;
    }
    
    public final void oK(final fkk fkk) {
        if (fkk.g() && !fkk.e() && !fkk.m()) {
            this.a.f();
        }
    }
    
    public final void oS(final aum aum) {
        this.b.l(this);
    }
    
    public final void oW(final aum aum) {
        this.b.n(this);
    }
}
