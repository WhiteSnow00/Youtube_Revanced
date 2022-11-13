// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.systemui;

import android.os.Build$VERSION;

public class PipWindowInsetsHelper implements fju, thl
{
    public boolean a;
    private final atke b;
    
    public PipWindowInsetsHelper(final atke b) {
        this.b = b;
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final boolean j() {
        return Build$VERSION.SDK_INT == 28;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    @Override
    public final void n(final fkr fkr) {
        if (fkr.f()) {
            this.a = true;
        }
    }
    
    @Override
    public final void oK(final fkr fkr, final fkr fkr2) {
        fal.b((fju)this, fkr2);
    }
    
    public final void oS(final aun aun) {
        if (this.j()) {
            ((fjv)this.b.a()).l(this);
        }
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        if (this.j()) {
            ((fjv)this.b.a()).n(this);
        }
    }
}
