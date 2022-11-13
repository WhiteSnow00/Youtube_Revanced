// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.orientation;

public class OrientationInfoLoggingController implements tpy, thl
{
    public final atke a;
    private final tpz b;
    private final asiq c;
    private final ativ d;
    private final ashi e;
    
    public OrientationInfoLoggingController(final asht asht, final tpz b, final atke a) {
        this.b = b;
        this.a = a;
        this.c = new asiq();
        final ativ ae = ativ.aE();
        this.d = ae;
        this.e = ashi.e((auke)asht.i(ashb.e).L((asjr)gcz.n).p(), (auke)((ashi)ae).p(), (asji)exl.g);
    }
    
    private static ajel j(final int n) {
        if (n != 0) {
            if (n != 1) {
                if (n == 2) {
                    return ajel.b;
                }
                if (n != 3) {
                    return ajel.a;
                }
            }
            return ajel.f;
        }
        return ajel.b;
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mW(final boolean b, final int n) {
        this.d.tu((Object)j(n));
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void mx(final boolean b, final int n) {
        this.d.tu((Object)j(n));
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
        this.b.a((tpy)this);
        this.c.f(new asir[] { this.e.am((asjm)new gao(this, 16)) });
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        this.b.a.b.remove(this);
        this.c.b();
    }
}
