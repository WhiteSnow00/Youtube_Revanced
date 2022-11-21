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

public class FullscreenEngagementPanelOverlay extends abcq implements fqm, kxr, kwu, kxs, tsl, uxg, xpd, ive, tim, kwr
{
    public final boolean a;
    public final boolean b;
    public final xpf c;
    public final arna d;
    public final atls e;
    public final atls f;
    public final Rect g;
    public boolean h;
    public boolean i;
    public boolean j;
    public kye k;
    private final fjy l;
    private final ixx m;
    private final aslm n;
    private final aslm o;
    private final atls p;
    private final atls q;
    private final aske r;
    private final aske s;
    private final arna t;
    private WeakReference u;
    private CoordinatorLayout v;
    private tqa w;
    
    public FullscreenEngagementPanelOverlay(final Context context, final fjy l, final xpf c, final arna d, final ixx m, final abqz abqz, final arna t, final vbo vbo, final arwm arwm, final bhy bhy, final mtf mtf, final byte[] array, final byte[] array2, final byte[] array3) {
        super(context);
        this.d = d;
        this.a = fao.aB(vbo);
        this.b = arwm.cY();
        this.l = l;
        this.m = m;
        this.t = t;
        this.c = c;
        this.f = atls.aE();
        final atls ae = atls.aE();
        this.p = ae;
        final atls ae2 = atls.aE();
        this.q = ae2;
        final atls ae3 = atls.aE();
        this.e = ae3;
        this.n = new aslm();
        final aslm o = new aslm();
        this.o = o;
        this.g = new Rect();
        this.i = false;
        final aske j = aske.e(aske.K(false).l(((aske)abqz.p().b).j(tqf.co(mtf.q())).L((asmn)iqv.p)), (aumz)ae3, (asme)ivv.d).p().j((aski)kxn.b);
        final aske i = aske.g(l.k().i(asjx.e), j, (aumz)ae, (aumz)ae2, (asmk)new llu(this, 1)).p().w((asmi)new iwh(this, 1)).j((aski)kxn.b);
        this.r = i;
        this.s = i.Y((asmn)new ijs((arna)new gse(this, 5), 19)).j((aski)kxn.b);
        o.c(j.an((asmi)new iwj(this, 0), (asmi)isj.o));
        o.c(((aske)bhy.a).p().am((asmi)new iwj(this, 2)));
    }
    
    public static boolean I(final fku fku) {
        return fku == fku.e || fku == fku.f;
    }
    
    private final void K() {
        this.Z(4);
    }
    
    public final aske A() {
        return this.s;
    }
    
    public final aske B() {
        return this.r;
    }
    
    public final void C(final RelativeLayout relativeLayout, final RelativeLayout relativeLayout2) {
        this.u = new WeakReference((T)relativeLayout);
        this.Z(8);
    }
    
    public final void D(final RelativeLayout relativeLayout, final RelativeLayout relativeLayout2) {
        this.n.b();
        this.u = null;
        this.j = false;
        this.p.tt((Object)false);
        if (this.mm()) {
            final CoordinatorLayout v = this.v;
            if (v != null) {
                v.removeView((View)relativeLayout);
            }
        }
    }
    
    public final void E(final uwd uwd, final boolean b) {
        final tqa w = this.w;
        if (w == null) {
            return;
        }
        w.k(((ked)this.t.a()).e(uwd, b));
        this.w.l(false, true);
    }
    
    public final void F(final uwd uwd, final boolean b) {
        final tqa w = this.w;
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
        w.k(((ked)this.t.a()).e(uwd, b2));
        this.w.l(true, true);
    }
    
    public final boolean G() {
        return this.i;
    }
    
    public final boolean H() {
        return this.md() != null && anc.f(this.md()) == 1;
    }
    
    public final void J(final kye k) {
        this.k = k;
    }
    
    public final ViewGroup$LayoutParams a() {
        return new abvn(-1, -1, false);
    }
    
    public final void b(final int n, tqa w) {
        w = this.w;
        if (w == null) {
            return;
        }
        if (w.d()) {
            this.q.tt((Object)true);
            return;
        }
        if (n == 0) {
            this.q.tt((Object)false);
        }
    }
    
    public final /* bridge */ View c(final Context context) {
        final FrameLayout frameLayout = (FrameLayout)LayoutInflater.from(context).inflate(2131624472, (ViewGroup)null);
        (this.v = (CoordinatorLayout)frameLayout.findViewById(2131429101)).addOnLayoutChangeListener((View$OnLayoutChangeListener)new fto(this, 17));
        (this.w = ((uwk)this.d.a()).E()).g((tsl)this);
        this.q.tt((Object)this.w.e());
        return (View)frameLayout;
    }
    
    public final /* bridge */ void e(final Context context, final View view) {
        final FrameLayout frameLayout = (FrameLayout)view;
        int visibility = 8;
        if (this.ab(8)) {
            final WeakReference u = this.u;
            if (u != null) {
                if (this.v != null) {
                    final RelativeLayout relativeLayout = (RelativeLayout)u.get();
                    if (relativeLayout != null && relativeLayout.getParent() == null) {
                        relativeLayout.setAlpha(1.0f);
                        this.v.addView((View)relativeLayout);
                        this.p.tt((Object)true);
                        if (this.b) {
                            relativeLayout.setTranslationY(0.0f);
                            this.n.c(((uwk)this.d.a()).h().n.am((asmi)new iwh(relativeLayout, 0)));
                        }
                        else {
                            this.n.c(((uwk)this.d.a()).h().o.am((asmi)new iwh(relativeLayout, 2)));
                        }
                        this.n.c(((aske)this.m.d).am((asmi)new ivd(this, 20)));
                    }
                }
            }
        }
        if (this.ab(1)) {
            final CoordinatorLayout v = this.v;
            if (v != null) {
                if (this.h) {
                    visibility = 0;
                }
                v.setVisibility(visibility);
            }
        }
        if (this.ab(2)) {
            final CoordinatorLayout v2 = this.v;
            if (v2 != null) {
                tqf.aF((View)v2, tqf.au(this.g.left), (Class)ViewGroup$MarginLayoutParams.class);
                tqf.aF((View)this.v, tqf.aA(this.g.right), (Class)ViewGroup$MarginLayoutParams.class);
            }
        }
    }
    
    public final tik g() {
        return tik.a;
    }
    
    public final void i(final boolean b) {
    }
    
    public final void j(final ControlsOverlayStyle controlsOverlayStyle) {
    }
    
    public final void k(final fku fku) {
        if (this.ot(fku)) {
            this.aa();
            return;
        }
        this.X();
    }
    
    public final void l(final ivh ivh) {
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void m(final boolean b) {
    }
    
    public final abct mj(final Context context) {
        final abct mj = super.mj(context);
        mj.e = false;
        mj.b();
        return mj;
    }
    
    public final void mp(final aup aup) {
    }
    
    public final String mq() {
        return "player_overlay_fullscreen_engagement";
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void n(final boolean b) {
    }
    
    public final void o(final xoy xoy) {
    }
    
    public final void oO(final aup aup) {
        this.o.b();
    }
    
    public final void oT(final aup aup) {
    }
    
    public final void oU() {
        tgj.h((tim)this);
    }
    
    public final boolean oW() {
        return this.ot(this.l.j());
    }
    
    public final void oX() {
        tgj.g((tim)this);
    }
    
    public final void oY(final aup aup) {
    }
    
    public final void oZ(final boolean b) {
        this.K();
    }
    
    public final boolean ot(final fku fku) {
        return this.a && I(fku);
    }
    
    public final void p(final xoy xoy) {
        this.e.tt((Object)false);
    }
    
    public final void pa(final ControlsState controlsState) {
    }
    
    public final void pb(final tst tst) {
    }
    
    public final void pc(final boolean b) {
    }
    
    public final void pd(final boolean b) {
    }
    
    public final void q(final xoy xoy) {
        this.e.tt((Object)true);
    }
    
    public final void r(final boolean b) {
    }
    
    public final void s(final fku fku) {
    }
    
    public final void t(final boolean b) {
    }
    
    public final void u(final boolean b) {
    }
    
    public final void v(final boolean b) {
    }
    
    public final void w(final boolean b) {
    }
    
    public final void x(final boolean b) {
    }
    
    public final void y(final int n) {
    }
    
    public final void z(final boolean b) {
        this.K();
    }
}
