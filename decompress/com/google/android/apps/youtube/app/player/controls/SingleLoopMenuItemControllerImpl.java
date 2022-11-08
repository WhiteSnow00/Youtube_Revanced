// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.controls;

import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import android.content.Context;

public class SingleLoopMenuItemControllerImpl implements isf, tfh, fns
{
    public final abns a;
    public final wwv b;
    public final ftc c;
    public irv d;
    public boolean e;
    public boolean f;
    public boolean g;
    public abim h;
    private final Context i;
    private final PlaybackLoopShuffleMonitor j;
    private final asib k;
    private final int l;
    private ValueAnimator m;
    
    public SingleLoopMenuItemControllerImpl(final Context i, final PlaybackLoopShuffleMonitor j, final abns a, final wwv b, final ftc c) {
        this.h = abim.a;
        this.i = i;
        this.j = j;
        this.a = a;
        this.b = b;
        this.c = c;
        this.k = new asib();
        this.l = tmy.ct(i, 2130970911).orElse(0);
        c.a("menu_item_single_video_playback_loop", false);
    }
    
    private final String m(final boolean b) {
        final Context i = this.i;
        int n;
        if (!b) {
            n = 2132019825;
        }
        else {
            n = 2132019826;
        }
        return i.getString(n);
    }
    
    private final void n() {
        final irv d = this.d;
        if (d == null) {
            return;
        }
        d.f(this.m(this.e));
        final irv d2 = this.d;
        final Context i = this.i;
        int n;
        if (!this.e) {
            n = 2131233638;
        }
        else {
            n = 2131233491;
        }
        ((qjg)d2).e = tmy.k(i, n, 2130970924);
    }
    
    public final irv a() {
        if (this.d == null) {
            (this.d = new irv(this.i.getString(2132019824), (irt)new irq(this, 9))).g(this.f);
            this.n();
        }
        final irv d = this.d;
        if (d != null && d.g) {
            this.b.D((wxz)new wws(wya.c(123601)));
        }
        final irv d2 = this.d;
        d2.getClass();
        return d2;
    }
    
    public final void j(final int n, final boolean b) {
        final boolean e = this.e;
        int e2;
        if (n == 2) {
            e2 = 1;
        }
        else {
            e2 = 0;
        }
        this.e = (e2 != 0);
        if ((e ? 1 : 0) != e2) {
            this.n();
            if (this.h == abim.j && this.e) {
                this.a.n().a(abmp.c);
            }
            this.c.f(this.m(this.e), Boolean.valueOf(this.e));
        }
    }
    
    public final void k() {
        this.g = false;
        final irv d = this.d;
        if (d != null && d.g) {
            this.b.o((wxz)new wws(wya.c(123601)), (alff)null);
        }
        final ValueAnimator m = this.m;
        if (m != null) {
            m.cancel();
            this.m = null;
        }
        this.c.b("menu_item_single_video_playback_loop", Boolean.valueOf(false));
    }
    
    public final void l(final boolean b) {
        this.g = true;
        final irv d = this.d;
        if (d != null && d.g) {
            this.b.t((wxz)new wws(wya.c(123601)), (alff)null);
            if (!b) {
                return;
            }
            final ValueAnimator m = this.m;
            if (m != null) {
                m.cancel();
            }
            (this.m = ValueAnimator.ofArgb(new int[] { this.l, 0 }).setDuration(3000L)).setStartDelay(1000L);
            this.m.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new qh(this, 12));
            this.m.start();
        }
        else if (!b) {
            return;
        }
        this.c.b("menu_item_single_video_playback_loop", Boolean.valueOf(true));
    }
    
    public final void oO() {
        this.d = null;
    }
    
    public final String oQ() {
        return "menu_item_single_video_playback_loop";
    }
    
    public final void oS(final aum aum) {
        final boolean e = this.j.b == 2;
        this.e = e;
        this.c.f(this.m(e), Boolean.valueOf(this.e));
        this.j.j((fns)this);
        final asib k = this.k;
        asic asic;
        if (((uyi)this.a.cd().h).bx()) {
            asic = this.a.R().am((asix)new isg(this, 0), (asix)irb.k);
        }
        else {
            asic = this.a.Q().R().P(ashw.a()).am((asix)new isg(this, 0), (asix)irb.k);
        }
        k.c(asic);
        this.k.c(((asgt)this.a.q().b).am((asix)new isg(this, 2), (asix)irb.k));
    }
    
    public final void oW(final aum aum) {
        this.j.k((fns)this);
        this.k.b();
    }
}
