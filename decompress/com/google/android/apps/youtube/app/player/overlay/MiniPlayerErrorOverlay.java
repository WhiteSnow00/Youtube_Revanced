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

public class MiniPlayerErrorOverlay implements fqm, abcs, tio
{
    public boolean a;
    public boolean b;
    private final Context c;
    private final abqz d;
    private final aslm e;
    private final askz f;
    private View g;
    private abcr h;
    private fku i;
    
    public MiniPlayerErrorOverlay(final Context c, final abqz d, final askz f) {
        this.i = fku.a;
        this.c = c;
        this.d = d;
        this.e = new aslm();
        this.f = f;
    }
    
    private final void l() {
        if (this.mm()) {
            return;
        }
        final View inflate = LayoutInflater.from(this.c).inflate(2131624836, (ViewGroup)null);
        this.g = inflate;
        final abcr h = this.h;
        if (h != null) {
            h.d((abcs)this, inflate);
        }
        this.a = (inflate.getParent() != null);
        inflate.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new if(this, 5));
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final void j() {
        if (!this.mm() && this.ot(this.i) && this.b) {
            this.l();
        }
        if (!this.mm()) {
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
        tqf.v(g, b2);
    }
    
    public final void k(final fku i) {
        if (this.i == i) {
            return;
        }
        this.i = i;
        if (!this.mm()) {
            this.j();
        }
    }
    
    public final void lW(final aup aup) {
    }
    
    public final View md() {
        this.l();
        final View g = this.g;
        g.getClass();
        return g;
    }
    
    public final void ml(final abcr h) {
        this.h = h;
    }
    
    public final boolean mm() {
        return this.g != null;
    }
    
    public final void mp(final aup aup) {
    }
    
    public final String mq() {
        return "player_overlay_mini_player_error";
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        this.e.c(((aske)this.d.p().h).R().P(this.f).an((asmi)new iwh(this, 18), (asmi)isj.t));
        this.e.c(((aske)this.d.p().k).R().P(this.f).an((asmi)new iwh(this, 19), (asmi)isj.t));
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        this.e.b();
    }
    
    public final boolean ot(final fku fku) {
        return fku.m() || fku == fku.g;
    }
}
