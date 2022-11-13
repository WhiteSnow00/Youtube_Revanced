// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.pip.observer;

import java.util.function.Function;
import j$.util.Optional;

public class PipPlayerObserver implements thj
{
    public final asht a;
    private final asiq b;
    
    public PipPlayerObserver(final Optional optional, final asht asht) {
        final asiq b = new asiq();
        this.b = b;
        this.a = asht.n((ashw)asht, (ashw)optional.map((Function)ggb.r).orElse((Object)asht.X((Object)false)), (asji)exl.h).A().al().aU().aW(0, (asjm)new ghy(b, 14));
    }
    
    public final thh g() {
        return thh.a;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        this.b.dispose();
    }
    
    public final void mq(final aun aun) {
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
