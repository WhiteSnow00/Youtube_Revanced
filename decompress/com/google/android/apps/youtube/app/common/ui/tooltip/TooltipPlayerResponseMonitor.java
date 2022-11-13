// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.tooltip;

public class TooltipPlayerResponseMonitor implements thl, fju
{
    public final acwn a;
    public String b;
    public String c;
    private final abpu d;
    private final asiq e;
    
    public TooltipPlayerResponseMonitor(final acwn a, final abpu d) {
        this.a = a;
        this.d = d;
        this.e = new asiq();
        this.b = null;
        this.c = null;
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final void j() {
        final String c = this.c;
        if (c != null) {
            this.a.g(c);
        }
        this.c = null;
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
        if (fkr == fkr.a && this.c != null) {
            this.j();
        }
    }
    
    public final void oK(final fkr fkr, final fkr fkr2) {
        fal.b((fju)this, fkr2);
    }
    
    public final void oS(final aun aun) {
        this.e.b();
        this.e.f(new asir[] { ((ashi)this.d.p().b).an((asjm)new ghy(this, 18), (asjm)fua.r) });
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        this.e.b();
    }
}
