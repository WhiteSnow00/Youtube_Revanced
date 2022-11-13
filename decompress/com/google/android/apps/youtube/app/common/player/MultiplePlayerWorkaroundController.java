// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.player;

import java.util.function.Consumer;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public final class MultiplePlayerWorkaroundController implements thj
{
    public final atke a;
    public asir b;
    private final atke c;
    private final atke d;
    
    public MultiplePlayerWorkaroundController(final atke c, final atke d, final atke a) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public final thh g() {
        return thh.a;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        final asir b = this.b;
        if (b != null) {
            asjv.b((AtomicReference)b);
            this.b = null;
        }
    }
    
    public final void mq(final aun aun) {
        if (!((vai)this.d.a()).f(45368723L)) {
            return;
        }
        ((Optional)this.c.a()).ifPresent((Consumer)new eou(this, 18));
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oT() {
        tfg.g((thj)this);
    }
    
    public final void oW() {
        tfg.f((thj)this);
    }
    
    public final void oX(final aun aun) {
    }
}
