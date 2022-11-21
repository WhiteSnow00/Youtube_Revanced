// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.controls;

import java.util.concurrent.atomic.AtomicReference;

public class PreviousPaddleMenuItemController implements tio, abee
{
    public final ftq a;
    public boolean b;
    public boolean c;
    private asln d;
    private final abcl e;
    
    public PreviousPaddleMenuItemController(final ftq a, final abcl e) {
        (this.a = a).a("menu_item_previous_paddle", false);
        this.e = e;
    }
    
    public final void b(final boolean b) {
        if (this.b == b) {
            return;
        }
        this.b = b;
        final ftq a = this.a;
        boolean b2 = false;
        if (b) {
            b2 = b2;
            if (!this.c) {
                b2 = true;
            }
        }
        a.a("menu_item_previous_paddle", b2);
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
    
    public final void oB(final boolean b) {
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        this.d = this.e.a().an((asmi)new itn(this, 1), (asmi)isj.i);
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
            this.d = null;
        }
    }
    
    public final void rd(final abed abed) {
    }
}
