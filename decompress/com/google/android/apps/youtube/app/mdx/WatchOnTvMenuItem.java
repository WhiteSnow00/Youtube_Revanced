// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import android.view.MenuItem;
import android.app.Activity;
import j$.util.Optional;

public class WatchOnTvMenuItem implements fzq, thl
{
    public boolean a;
    public Optional b;
    private final Activity c;
    private final gkx d;
    private final xbt e;
    private asir f;
    private final vai g;
    
    public WatchOnTvMenuItem(final Activity c, final gkx d, final xbt e, final vai g) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.b = Optional.empty();
        this.f = this.s();
        this.g = g;
    }
    
    private final asir s() {
        return this.e.o().af(asil.a()).aH((asjm)new iad(this, 4));
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final int j() {
        return 2131429840;
    }
    
    public final int k() {
        return 0;
    }
    
    public final fzh l() {
        return null;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void m() {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final boolean n() {
        return true;
    }
    
    public final void o(final MenuItem menuItem) {
        if (this.b.isPresent() && this.b.get() == menuItem) {
            return;
        }
        this.b = Optional.of((Object)menuItem);
        menuItem.setVisible(this.a);
        menuItem.setShowAsAction(0);
    }
    
    public final void oS(final aun aun) {
        if (this.f.tA()) {
            this.f = this.s();
        }
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        asjv.b((AtomicReference)this.f);
    }
    
    public final boolean p() {
        final boolean au = this.g.aU();
        boolean b = false;
        final boolean b2 = au && this.g.aV();
        final Activity c = this.c;
        if (this.d.a() == gkv.b) {
            b = true;
        }
        c.startActivity(xmm.X((Context)c, b, b2));
        return true;
    }
    
    public final int q() {
        return 103;
    }
    
    public final CharSequence r() {
        return this.c.getString(2132018663);
    }
}
