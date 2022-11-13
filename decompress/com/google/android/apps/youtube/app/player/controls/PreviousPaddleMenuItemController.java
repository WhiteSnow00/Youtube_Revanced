// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.controls;

import java.util.concurrent.atomic.AtomicReference;

public class PreviousPaddleMenuItemController implements thl, abcy
{
    public final ftk a;
    public boolean b;
    public boolean c;
    private asir d;
    private final abbf e;
    
    public PreviousPaddleMenuItemController(final ftk a, final abbf e) {
        (this.a = a).a("menu_item_previous_paddle", false);
        this.e = e;
    }
    
    public final void b(final boolean b) {
        if (this.b == b) {
            return;
        }
        this.b = b;
        final ftk a = this.a;
        boolean b2 = false;
        if (b) {
            b2 = b2;
            if (!this.c) {
                b2 = true;
            }
        }
        a.a("menu_item_previous_paddle", b2);
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
    
    public final void oD(final boolean b) {
    }
    
    public final void oS(final aun aun) {
        this.d = this.e.a().an((asjm)new irw(this, 19), (asjm)ise.h);
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
            this.d = null;
        }
    }
    
    public final void re(final abcx abcx) {
    }
}
