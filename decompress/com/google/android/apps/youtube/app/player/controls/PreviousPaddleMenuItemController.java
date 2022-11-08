// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.controls;

import java.util.concurrent.atomic.AtomicReference;

public class PreviousPaddleMenuItemController implements tfh, abbe
{
    public final ftc a;
    public boolean b;
    public boolean c;
    private asic d;
    private final aazk e;
    
    public PreviousPaddleMenuItemController(final ftc a, final aazk e) {
        (this.a = a).a("menu_item_previous_paddle", false);
        this.e = e;
    }
    
    public final void b(final boolean b) {
        if (this.b == b) {
            return;
        }
        this.b = b;
        final ftc a = this.a;
        boolean b2 = false;
        if (b) {
            b2 = b2;
            if (!this.c) {
                b2 = true;
            }
        }
        a.a("menu_item_previous_paddle", b2);
    }
    
    public final void oD(final boolean b) {
    }
    
    public final void oS(final aum aum) {
        this.d = this.e.a().am((asix)new iqv(this, 20), (asix)irb.i);
    }
    
    public final void oW(final aum aum) {
        final asic d = this.d;
        if (d != null) {
            athh.f((AtomicReference)d);
            this.d = null;
        }
    }
    
    public final void qY(final abbd abbd) {
    }
}
