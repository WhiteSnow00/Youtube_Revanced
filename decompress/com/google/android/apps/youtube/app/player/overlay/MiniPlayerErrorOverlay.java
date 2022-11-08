// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

import android.view.ViewGroup$LayoutParams;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Context;

public class MiniPlayerErrorOverlay implements fqb, aazr, tfh
{
    public boolean a;
    public boolean b;
    private final Context c;
    private final abns d;
    private final asib e;
    private final asho f;
    private View g;
    private aazq h;
    private fkk i;
    
    public MiniPlayerErrorOverlay(final Context c, final abns d, final asho f) {
        this.i = fkk.a;
        this.c = c;
        this.d = d;
        this.e = new asib();
        this.f = f;
    }
    
    private final void l() {
        if (this.mn()) {
            return;
        }
        final View inflate = LayoutInflater.from(this.c).inflate(2131624833, (ViewGroup)null);
        this.g = inflate;
        final aazq h = this.h;
        if (h != null) {
            h.d((aazr)this, inflate);
        }
        this.a = (inflate.getParent() != null);
        inflate.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new ie(this, 5));
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    @Override
    public final void j(final fkk i) {
        if (this.i == i) {
            return;
        }
        this.i = i;
        if (!this.mn()) {
            this.k();
        }
    }
    
    public final void k() {
        if (!this.mn() && this.ow(this.i) && this.b) {
            this.l();
        }
        if (!this.mn()) {
            return;
        }
        final View g = this.g;
        final boolean b = this.b;
        boolean b2 = false;
        if (b) {
            b2 = b2;
            if (this.a) {
                b2 = true;
            }
        }
        tmy.v(g, b2);
    }
    
    public final View md() {
        this.l();
        final View g = this.g;
        g.getClass();
        return g;
    }
    
    public final void ml(final aazq h) {
        this.h = h;
    }
    
    public final boolean mn() {
        return this.g != null;
    }
    
    public final String mr() {
        return "player_overlay_mini_player_error";
    }
    
    public final void oS(final aum aum) {
        this.e.c(((asgt)this.d.q().h).R().P(this.f).am((asix)new ivc(this, 16), (asix)irb.t));
        this.e.c(((asgt)this.d.q().k).R().P(this.f).am((asix)new ivc(this, 17), (asix)irb.t));
    }
    
    public final void oW(final aum aum) {
        this.e.b();
    }
    
    @Override
    public final boolean ow(final fkk fkk) {
        return fkk.m() || fkk == fkk.g;
    }
}
