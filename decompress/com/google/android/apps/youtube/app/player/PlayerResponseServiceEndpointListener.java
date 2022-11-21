// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player;

import java.util.concurrent.atomic.AtomicReference;

public class PlayerResponseServiceEndpointListener implements tio
{
    public final veh a;
    private final abqz b;
    private final askz c;
    private asln d;
    
    public PlayerResponseServiceEndpointListener(final abqz b, final veh a, final askz c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        final asln d = this.d;
        if (d != null) {
            atkw.f((AtomicReference)d);
        }
        asln d2;
        if (((vbs)this.b.cg().g).bA()) {
            d2 = this.b.Q().an((asmi)new isd(this, 3), (asmi)isj.b);
        }
        else {
            d2 = this.b.P().R().P(this.c).an((asmi)new isd(this, 3), (asmi)isj.b);
        }
        this.d = d2;
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        final asln d = this.d;
        if (d != null) {
            atkw.f((AtomicReference)d);
        }
        this.d = null;
    }
}
