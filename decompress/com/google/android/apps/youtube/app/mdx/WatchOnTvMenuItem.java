// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import android.view.MenuItem;
import android.app.Activity;
import j$.util.Optional;

public class WatchOnTvMenuItem implements fzi, tfh
{
    public boolean a;
    public Optional b;
    private final Activity c;
    private final gko d;
    private final wzt e;
    private asic f;
    private final uyi g;
    
    public WatchOnTvMenuItem(final Activity c, final gko d, final wzt e, final uyi g) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.b = Optional.empty();
        this.f = this.s();
        this.g = g;
    }
    
    private final asic s() {
        return this.e.o().aa(ashw.a()).aB((asix)new hzh(this, 5));
    }
    
    public final int j() {
        return 2131429840;
    }
    
    public final int k() {
        return 0;
    }
    
    public final fyz l() {
        return null;
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
    
    public final void oS(final aum aum) {
        if (this.f.tx()) {
            this.f = this.s();
        }
    }
    
    public final void oW(final aum aum) {
        asjg.b((AtomicReference)this.f);
    }
    
    public final boolean p() {
        final boolean at = this.g.aT();
        boolean b = false;
        final boolean b2 = at && this.g.aU();
        final Activity c = this.c;
        if (this.d.a() == gkm.b) {
            b = true;
        }
        c.startActivity(xkm.al((Context)c, b, b2));
        return true;
    }
    
    @Override
    public final int q() {
        return 103;
    }
    
    @Override
    public final CharSequence r() {
        return this.c.getString(2132018662);
    }
}
