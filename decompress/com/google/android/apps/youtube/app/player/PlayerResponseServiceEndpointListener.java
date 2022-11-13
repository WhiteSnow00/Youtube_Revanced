// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player;

import java.util.concurrent.atomic.AtomicReference;

public class PlayerResponseServiceEndpointListener implements thl
{
    public final vcy a;
    private final abpu b;
    private final asid c;
    private asir d;
    
    public PlayerResponseServiceEndpointListener(final abpu b, final vcy a, final asid c) {
        this.b = b;
        this.a = a;
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
    
    public final void oS(final aun aun) {
        final asir d = this.d;
        if (d != null) {
            athz.f((AtomicReference)d);
        }
        asir d2;
        if (((vai)this.b.ci().g).bx()) {
            d2 = this.b.Q().an((asjm)new irw(this, 0), (asjm)hot.t);
        }
        else {
            d2 = this.b.P().R().P(this.c).an((asjm)new irw(this, 0), (asjm)hot.t);
        }
        this.d = d2;
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        final asir d = this.d;
        if (d != null) {
            athz.f((AtomicReference)d);
        }
        this.d = null;
    }
}
