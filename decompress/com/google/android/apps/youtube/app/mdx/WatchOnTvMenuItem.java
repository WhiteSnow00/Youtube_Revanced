// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import android.view.MenuItem;
import android.app.Activity;
import j$.util.Optional;

public class WatchOnTvMenuItem implements fzv, tio
{
    public boolean a;
    public Optional b;
    private final Activity c;
    private final glc d;
    private final xda e;
    private asln f;
    private final vbs g;
    
    public WatchOnTvMenuItem(final Activity c, final glc d, final xda e, final vbs g) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.b = Optional.empty();
        this.f = this.s();
        this.g = g;
    }
    
    private final asln s() {
        return this.e.o().af(aslh.a()).aH((asmi)new iam(this, 6));
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final int j() {
        return 2131429840;
    }
    
    public final int k() {
        return 0;
    }
    
    public final fzm l() {
        return null;
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void m() {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
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
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        if (this.f.tz()) {
            this.f = this.s();
        }
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        asmr.b((AtomicReference)this.f);
    }
    
    public final boolean p() {
        final boolean ax = this.g.aX();
        boolean b = false;
        final boolean b2 = ax && this.g.aY();
        final Activity c = this.c;
        if (this.d.a() == gla.b) {
            b = true;
        }
        c.startActivity(xny.K((Context)c, b, b2));
        return true;
    }
    
    public final int q() {
        return 103;
    }
    
    public final CharSequence r() {
        return this.c.getString(2132018665);
    }
}
