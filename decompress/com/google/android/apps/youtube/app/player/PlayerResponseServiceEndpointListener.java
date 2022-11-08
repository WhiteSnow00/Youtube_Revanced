// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player;

import java.util.concurrent.atomic.AtomicReference;

public class PlayerResponseServiceEndpointListener implements tfh
{
    public final vax a;
    private final abns b;
    private final asho c;
    private asic d;
    
    public PlayerResponseServiceEndpointListener(final abns b, final vax a, final asho c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public final void oS(final aum aum) {
        final asic d = this.d;
        if (d != null) {
            athh.f((AtomicReference)d);
        }
        asic d2;
        if (((uyi)this.b.cd().h).bx()) {
            d2 = this.b.R().am((asix)new iqv(this, 2), (asix)irb.b);
        }
        else {
            d2 = this.b.Q().R().P(this.c).am((asix)new iqv(this, 2), (asix)irb.b);
        }
        this.d = d2;
    }
    
    public final void oW(final aum aum) {
        final asic d = this.d;
        if (d != null) {
            athh.f((AtomicReference)d);
        }
        this.d = null;
    }
}
