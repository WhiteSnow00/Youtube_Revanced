// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.RelativeLayout;
import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import android.graphics.Rect;

public class FullscreenEngagementPanelOverlay extends aazp implements fqb, kwg, kvj, kwh, tpf, uug, xlt, itw, tff, kvg
{
    public final boolean a;
    public final boolean b;
    public final xlv c;
    public final arhr d;
    public final atid e;
    public final atid f;
    public final Rect g;
    public boolean h;
    public boolean i;
    public boolean j;
    public kws k;
    private final fjp l;
    private final iwq m;
    private final asib n;
    private final asib o;
    private final atid p;
    private final atid q;
    private final asgt r;
    private final asgt s;
    private final arhr t;
    private WeakReference u;
    private CoordinatorLayout v;
    private tmt w;
    
    public FullscreenEngagementPanelOverlay(final Context context, final fjp l, final xlv c, final arhr d, final iwq m, final abns abns, final arhr t, final uyf uyf, final uyi uyi, final bhu bhu, final mrm mrm, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(context);
        this.d = d;
        this.a = gkt.B(uyf);
        this.b = uyi.cP();
        this.l = l;
        this.m = m;
        this.t = t;
        this.c = c;
        this.f = atid.aD();
        final atid ad = atid.aD();
        this.p = ad;
        final atid ad2 = atid.aD();
        this.q = ad2;
        final atid ad3 = atid.aD();
        this.e = ad3;
        this.n = new asib();
        final asib o = new asib();
        this.o = o;
        this.g = new Rect();
        this.i = false;
        final asgt j = asgt.e((aujo)asgt.K((Object)false).l((aujo)((asgt)abns.q().b).j(tmy.ck(mrm.u())).L((asjc)iqc.m)), (aujo)ad3, (asit)iun.d).p().j((asgx)kwc.b);
        final asgt i = asgt.g((aujo)l.k().i(asgm.e), (aujo)j, (aujo)ad, (aujo)ad2, (asiz)new lkh(this, 1)).p().w((asix)new itv(this, 19)).j((asgx)kwc.b);
        this.r = i;
        this.s = i.Y((asjc)new iir((arhr)new gva(this, 4), 17)).j((asgx)kwc.b);
        o.c(j.am((asix)new iva(this, 0), (asix)irb.o));
        o.c(((asgt)bhu.a).p().al((asix)new iva(this, 2)));
    }
    
    public static boolean H(final fkk fkk) {
        return fkk == fkk.e || fkk == fkk.f;
    }
    
    private final void J() {
        this.Z(4);
    }
    
    public final asgt A() {
        return this.r;
    }
    
    public final void B(final RelativeLayout relativeLayout, final RelativeLayout relativeLayout2) {
        this.u = new WeakReference((T)relativeLayout);
        this.Z(8);
    }
    
    public final void C(final RelativeLayout relativeLayout, final RelativeLayout relativeLayout2) {
        this.n.b();
        this.u = null;
        this.j = false;
        this.p.tr((Object)false);
        if (this.mn()) {
            final CoordinatorLayout v = this.v;
            if (v != null) {
                v.removeView((View)relativeLayout);
            }
        }
    }
    
    public final void D(final utd utd, final boolean b) {
        final tmt w = this.w;
        if (w == null) {
            return;
        }
        w.k(((kct)this.t.a()).e(utd, b));
        this.w.l(false, true);
    }
    
    public final void E(final utd utd, final boolean b) {
        final tmt w = this.w;
        if (w == null) {
            return;
        }
        boolean b2 = false;
        if (b) {
            b2 = b2;
            if (!this.j) {
                b2 = true;
            }
        }
        w.k(((kct)this.t.a()).e(utd, b2));
        this.w.l(true, true);
    }
    
    public final boolean F() {
        return this.i;
    }
    
    public final boolean G() {
        return this.md() != null && ana.f(this.md()) == 1;
    }
    
    public final void I(final kws k) {
        this.k = k;
    }
    
    public final ViewGroup$LayoutParams a() {
        return (ViewGroup$LayoutParams)new absc(-1, -1, false);
    }
    
    public final void b(final int n, tmt w) {
        w = this.w;
        if (w == null) {
            return;
        }
        if (w.d()) {
            this.q.tr((Object)true);
            return;
        }
        if (n == 0) {
            this.q.tr((Object)false);
        }
    }
    
    public final void j(final fkk fkk) {
        if (this.ow(fkk)) {
            this.aa();
            return;
        }
        this.X();
    }
    
    public final void mM(final aum aum) {
        this.o.b();
    }
    
    public final aazs mj(final Context context) {
        final aazs mj = super.mj(context);
        mj.e = false;
        mj.b();
        return mj;
    }
    
    public final String mr() {
        return "player_overlay_fullscreen_engagement";
    }
    
    public final void o(final xlo xlo) {
    }
    
    public final boolean oU() {
        return this.ow(this.l.j());
    }
    
    public final void oX(final boolean b) {
        this.J();
    }
    
    public final boolean ow(final fkk fkk) {
        return this.a && H(fkk);
    }
    
    public final void p(final xlo xlo) {
        this.e.tr((Object)false);
    }
    
    public final void q(final xlo xlo) {
        this.e.tr((Object)true);
    }
    
    public final void y(final boolean b) {
        this.J();
    }
    
    public final asgt z() {
        return this.s;
    }
}
