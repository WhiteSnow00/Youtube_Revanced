// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.controls;

import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import android.content.Context;

public class SingleLoopMenuItemControllerImpl implements ito, tio, foa
{
    public final abqz a;
    public final xab b;
    public final ftq c;
    public itc d;
    public boolean e;
    public boolean f;
    public boolean g;
    public abll h;
    private final Context i;
    private final PlaybackLoopShuffleMonitor j;
    private final aslm k;
    private final int l;
    private ValueAnimator m;
    
    public SingleLoopMenuItemControllerImpl(final Context i, final PlaybackLoopShuffleMonitor j, final abqz a, final xab b, final ftq c) {
        this.h = abll.a;
        this.i = i;
        this.j = j;
        this.a = a;
        this.b = b;
        this.c = c;
        this.k = new aslm();
        this.l = tqf.cx(i, 2130970909).orElse(0);
        c.a("menu_item_single_video_playback_loop", false);
    }
    
    private final String m(final boolean b) {
        int n;
        if (!b) {
            n = 2132019829;
        }
        else {
            n = 2132019830;
        }
        return this.i.getString(n);
    }
    
    private final void n() {
        final itc d = this.d;
        if (d == null) {
            return;
        }
        ((actj)d).f(this.m(this.e));
        final itc d2 = this.d;
        final Context i = this.i;
        int n;
        if (!this.e) {
            n = 2131233641;
        }
        else {
            n = 2131233492;
        }
        ((qlk)d2).e = tqf.k(i, n, 2130970922);
    }
    
    public final itc a() {
        if (this.d == null) {
            ((actj)(this.d = new itc(this.i.getString(2132019828), (ita)new isx(this, 9)))).g(this.f);
            this.n();
        }
        final itc d = this.d;
        if (d != null && ((actj)d).g) {
            this.b.D((xbe)new wzy(xbf.c(123601)));
        }
        final itc d2 = this.d;
        d2.getClass();
        return d2;
    }
    
    public final tik g() {
        return tik.b;
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
            if (this.h == abll.j && this.e) {
                this.a.m().a(abpx.c);
            }
            this.c.f(this.m(this.e), Boolean.valueOf(this.e));
        }
    }
    
    public final void k() {
        this.g = false;
        final itc d = this.d;
        if (d != null && ((actj)d).g) {
            this.b.o((xbe)new wzy(xbf.c(123601)), (alji)null);
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
        final itc d = this.d;
        if (d != null && ((actj)d).g) {
            this.b.t((xbe)new wzy(xbf.c(123601)), (alji)null);
            if (!b) {
                return;
            }
            final ValueAnimator m = this.m;
            if (m != null) {
                m.cancel();
            }
            (this.m = ValueAnimator.ofArgb(new int[] { this.l, 0 }).setDuration(3000L)).setStartDelay(1000L);
            this.m.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new qi(this, 12));
            this.m.start();
        }
        else if (!b) {
            return;
        }
        this.c.b("menu_item_single_video_playback_loop", Boolean.valueOf(true));
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oP() {
        this.d = null;
    }
    
    public final boolean oQ() {
        return false;
    }
    
    public final String oR() {
        return "menu_item_single_video_playback_loop";
    }
    
    public final void oT(final aup aup) {
        final boolean e = this.j.b == 2;
        this.e = e;
        this.c.f(this.m(e), Boolean.valueOf(this.e));
        this.j.j((foa)this);
        final aslm k = this.k;
        asln asln;
        if (((vbs)this.a.cg().g).bA()) {
            asln = this.a.Q().an((asmi)new itn(this, 2), (asmi)isj.k);
        }
        else {
            asln = this.a.P().R().P(aslh.a()).an((asmi)new itn(this, 2), (asmi)isj.k);
        }
        k.c(asln);
        this.k.c(((aske)this.a.p().b).an((asmi)new itn(this, 3), (asmi)isj.k));
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        this.j.k((foa)this);
        this.k.b();
    }
}
