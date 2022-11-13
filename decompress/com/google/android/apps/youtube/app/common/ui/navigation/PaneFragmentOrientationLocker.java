// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.navigation;

import java.util.concurrent.atomic.AtomicReference;

public final class PaneFragmentOrientationLocker implements thl
{
    public Object a;
    public final zfw b;
    private final ghe c;
    private asir d;
    
    public PaneFragmentOrientationLocker(final ghe c, final zfw b, final byte[] array) {
        this.c = c;
        this.b = b;
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final void j() {
        final Object a = this.a;
        if (a != null) {
            this.b.f(a);
            this.a = null;
        }
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
            asjv.b((AtomicReference)d);
        }
        this.d = this.c.b().aq((asjr)gcz.m).A().C((asjg)new esa(this, 11)).aH((asjm)new gao(this, 14));
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
            asjv.b((AtomicReference)d);
            this.d = null;
        }
    }
}
