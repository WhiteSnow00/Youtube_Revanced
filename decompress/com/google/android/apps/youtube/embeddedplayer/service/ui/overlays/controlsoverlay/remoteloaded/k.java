// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import java.util.Map;
import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.model.ShareButtonData;
import java.util.List;
import android.view.KeyEvent;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import android.widget.RelativeLayout$LayoutParams;
import java.util.ArrayDeque;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import android.content.res.Resources;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewStub;
import android.widget.ImageView;
import android.view.View$OnLayoutChangeListener;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.view.MotionEvent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import j$.util.Optional;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnShowListener;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.m;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.os.Handler$Callback;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.n;
import android.view.ViewConfiguration;
import com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.i;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.WatchLaterButton;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import android.graphics.Bitmap;
import android.os.Handler;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.View;
import android.view.View$OnClickListener;
import com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.c;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import android.content.Context;
import android.view.animation.Animation;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.d;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.a;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h;

public final class k extends aazp implements aazx, absb, abbm, abcm, abbe, h, b, a, e, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b, d, com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b
{
    public static final afcr a;
    private static final jyg aL;
    public Animation A;
    public Animation B;
    public com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b C;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.b D;
    public o E;
    public Context F;
    public ControlsState G;
    public ControlsOverlayStyle H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public c R;
    private final View$OnClickListener T;
    private com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c U;
    private com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.c V;
    private final tpu W;
    private final abfh X;
    private View Y;
    private ViewGroup Z;
    private boolean aA;
    private boolean aB;
    private boolean aC;
    private boolean aD;
    private boolean aE;
    private boolean aF;
    private boolean aG;
    private final asib aH;
    private final asic aI;
    private final jbk aJ;
    private final acko aK;
    private jyg aM;
    private Drawable aa;
    private Drawable ab;
    private View ac;
    private Drawable ad;
    private View ae;
    private LinearLayout af;
    private FrameLayout ag;
    private abci ah;
    private Animation ai;
    private int aj;
    private int ak;
    private Animation al;
    private Animation am;
    private Animation an;
    private Handler ao;
    private abag ap;
    private int aq;
    private String ar;
    private Bitmap as;
    private VideoDetails at;
    private SubscribeButtonData au;
    private SubscriptionNotificationButtonData av;
    private SubscriptionNotificationMenuData aw;
    private WatchLaterButtonData ax;
    private CharSequence ay;
    private boolean az;
    public final p b;
    public final tpv c;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.c d;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d e;
    public final tpy f;
    public FrameLayout g;
    public TimeBar h;
    public final abby i;
    public TouchImageView j;
    public TouchImageView k;
    TextView l;
    public WatchLaterButton m;
    public YouTubeButton n;
    public TouchImageView o;
    public TouchImageView p;
    public TouchImageView q;
    public TouchImageView r;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.e s;
    public RelativeLayout t;
    public ProgressBar u;
    public TextView v;
    public abfi w;
    public boolean x;
    public TouchImageView y;
    public TouchImageView z;
    
    static {
        aL = new jyg();
        a = afcr.s((Object)2131431135, (Object)2131427613);
    }
    
    private k(final Context f, final i i, final acko ak, final byte[] array, final byte[] array2) {
        super(f);
        this.e = com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d.d;
        this.C = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
        this.au = SubscribeButtonData.a;
        this.av = SubscriptionNotificationButtonData.a;
        this.aw = SubscriptionNotificationMenuData.a;
        this.ax = WatchLaterButtonData.a;
        this.aB = true;
        this.M = true;
        this.P = 0;
        this.Q = true;
        this.F = f;
        this.aK = ak;
        this.H = ControlsOverlayStyle.a;
        this.G = ControlsState.b();
        this.i = new abby();
        this.b = new p(new sin(i), null);
        this.aJ = new jbk(this, 4);
        this.T = (View$OnClickListener)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.e(this);
        final j j = new j(this);
        this.f = (tpy)j;
        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.i k = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.i(this);
        this.W = (tpu)k;
        final tpv c = new tpv(ViewConfiguration.get(this.F));
        this.c = c;
        c.b = (tpu)k;
        ((tpz)c).c = (tpy)j;
        this.X = (abfh)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.h(this);
        this.aI = com.google.android.apps.youtube.embeddedplayer.service.jar.b.a.c((asix)new n(this, 16), (asjc)llz.i);
        this.aH = new asib();
    }
    
    public static k W(final Context context, final i i, final acko acko, final ashe ashe, final ashp ashp, final ashe ashe2) {
        final k k = new k(context, i, acko, null, null);
        k.ao = new Handler((Handler$Callback)new bnd(k, 6));
        final Context f = k.F;
        final cbh cbh = new cbh(k, 11);
        (k.A = AnimationUtils.loadAnimation(f, 2130772040)).setAnimationListener((Animation$AnimationListener)cbh);
        k.ai = AnimationUtils.loadAnimation(f, 2130772037);
        k.am = AnimationUtils.loadAnimation(f, 2130772001);
        k.an = AnimationUtils.loadAnimation(f, 2130772123);
        k.aj = f.getResources().getInteger(2131492903);
        k.ak = f.getResources().getInteger(2131492905);
        k.ai.setDuration((long)k.aj);
        k.al = AnimationUtils.loadAnimation(f, 2130772037);
        k.B = AnimationUtils.loadAnimation(f, 2130772040);
        final long n = f.getResources().getInteger(2131492906);
        k.al.setDuration(n);
        k.B.setDuration(n);
        k.B.setAnimationListener((Animation$AnimationListener)cbh);
        k.aH.c(ashe.z().aB((asix)new n(k, 17)));
        k.aH.c(ashp.aa((asix)new m(6), (asix)m.g));
        k.aH.c(ashe2.aB((asix)new n(k, 18)));
        final eyh eyh = new eyh(i, 15);
        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.d d = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.d(k, i);
        k.D = new com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.b(k.F, (DialogInterface$OnShowListener)eyh, (DialogInterface$OnDismissListener)d, new com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.c(k.F, (DialogInterface$OnShowListener)eyh, (DialogInterface$OnDismissListener)d), new qmr(k.F, (DialogInterface$OnShowListener)eyh, (DialogInterface$OnDismissListener)d), new jyg(), null, null, null);
        final g g = new g(k);
        k.D.l((abbl)g);
        k.D.re((abcl)g);
        return k;
    }
    
    private final void ac() {
        this.ao.removeMessages(3);
        this.ao.sendEmptyMessage(4);
    }
    
    private final void ad() {
        final o e = this.E;
        if (e != null) {
            e.b();
        }
    }
    
    private final void ae(final akuv akuv, final boolean b) {
        Optional optional;
        if (b) {
            optional = Optional.of((Object)new qpt(this.b));
        }
        else {
            optional = Optional.empty();
        }
        final c r = this.R;
        r.getClass();
        r.b(akuv, b, optional);
    }
    
    private static final void af() {
        afqg.r("Error screen presenter should be present");
    }
    
    public final void A(final SubscriptionNotificationMenuData aw) {
        this.aw = aw;
        if (this.mn()) {
            this.s.A(aw);
        }
    }
    
    public final int B() {
        if (this.mn()) {
            return this.h.a;
        }
        return 0;
    }
    
    public final void C(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.d e) {
        this.b.e = e;
    }
    
    public final void D(final VideoDetails at) {
        this.at = at;
        if (this.mn()) {
            this.s.l(at);
        }
    }
    
    public final void E(final com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.c c) {
        this.d = c;
        this.D.o = c;
    }
    
    public final void F(final WatchLaterButtonData watchLaterButtonData) {
        this.ax = watchLaterButtonData;
        if (this.mn()) {
            this.m.a(watchLaterButtonData);
        }
        this.D.p = watchLaterButtonData;
    }
    
    public final abci G() {
        if (this.mn() && this.ah == null) {
            this.ah = new abci((TextView)this.g.findViewById(2131430448));
        }
        return this.ah;
    }
    
    public final void H() {
        if (!this.mn()) {
            return;
        }
        this.ao.removeMessages(1);
        this.aK.h((Consumer)lka.f);
        this.h.clearAnimation();
        this.Z.clearAnimation();
        this.l.clearAnimation();
        this.ae.clearAnimation();
        this.ac.clearAnimation();
        ((ViewGroup)this.s.c).clearAnimation();
        this.m.clearAnimation();
        this.n.clearAnimation();
        this.q.clearAnimation();
        this.r.clearAnimation();
        this.z.clearAnimation();
        this.y.clearAnimation();
        this.p.clearAnimation();
        this.o.clearAnimation();
    }
    
    public final void I() {
        final ControlsState g = this.G;
        if ((g.a == abac.b || g.b) && this.T() && !this.ao.hasMessages(1)) {
            this.ao.sendEmptyMessageDelayed(1, 2500L);
        }
    }
    
    public final void J(final int n) {
        this.aE = (n == 3);
        this.V();
        this.I();
    }
    
    public final void K(final int n) {
        if (n != 0 && n != 1) {
            this.aD = true;
            return;
        }
        this.aD = false;
    }
    
    public final void L() {
        this.aH.dispose();
        asjg.b((AtomicReference)this.aI);
    }
    
    public final void M(final int n) {
        this.aq = n;
        if (!this.mn()) {
            return;
        }
        this.s.k(n);
        if (n == 0) {
            this.aM = null;
            this.ac.setBackground(this.ad);
            return;
        }
        this.aM = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.k.aL;
        this.ac.setBackgroundColor(n);
    }
    
    public final void N(final String ar) {
        this.ar = ar;
        if (this.mn()) {
            this.s.h(ar);
            this.s.n(2);
        }
    }
    
    public final void O() {
        this.v();
        this.aK.h((Consumer)new lke(this, 7));
        if (!this.H.v) {
            this.R((View)this.h);
        }
        this.R(this.ae);
        this.R(this.ac);
        this.R((View)this.Z);
        this.R((View)this.l);
        this.R((View)this.s.c);
        if (!this.aE) {
            if (this.aD) {
                this.R((View)this.m);
            }
            this.R((View)this.n);
            this.R((View)this.o);
        }
        this.R((View)this.p);
        this.R((View)this.q);
        this.R((View)this.r);
        this.R((View)this.z);
        this.R((View)this.y);
    }
    
    public final void P(final View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.A);
            return;
        }
        if (this.H.o && this.T()) {
            this.oE();
        }
    }
    
    public final void Q(final boolean b) {
        final Animation a = this.A;
        int n;
        if (b) {
            n = this.aj;
        }
        else {
            n = this.ak;
        }
        a.setDuration((long)n);
        final Animation an = this.an;
        int n2;
        if (b) {
            n2 = this.aj;
        }
        else {
            n2 = this.ak;
        }
        an.setDuration((long)n2);
        final Animation am = this.am;
        int n3;
        if (b) {
            n3 = this.aj;
        }
        else {
            n3 = this.ak;
        }
        am.setDuration((long)n3);
        this.aK.h((Consumer)new lke(this, 8));
        if (!this.H.v) {
            this.P((View)this.h);
        }
        this.P((View)this.o);
        this.P(this.ae);
        this.P(this.ac);
        this.P((View)this.Z);
        this.P((View)this.l);
        this.P((View)this.s.c);
        this.P((View)this.m);
        this.P((View)this.n);
        this.P((View)this.p);
        this.P((View)this.q);
        this.P((View)this.r);
        this.P((View)this.z);
        this.P((View)this.y);
    }
    
    public final void R(final View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.ai);
        }
    }
    
    public final void S(final boolean b) {
        Drawable drawable;
        if (b) {
            drawable = this.aa;
        }
        else {
            drawable = this.ab;
        }
        api.j(this.l, drawable, (Drawable)null, (Drawable)null);
    }
    
    public final boolean T() {
        return !this.I && !this.aC;
    }
    
    public final boolean U(final MotionEvent motionEvent) {
        if (!this.M) {
            return false;
        }
        if (ControlsOverlayStyle.a(this.H)) {
            return false;
        }
        if (this.G.i()) {
            return false;
        }
        if (this.G.a == abac.f) {
            return false;
        }
        if (aeef.b((int)motionEvent.getX(), this.g.getWidth(), false) == 2) {
            final abby i = this.i;
            if (i.c <= i.e) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean V() {
        this.ao.removeMessages(2);
        this.ap.a(this.G);
        tmy.v((View)this.v, this.G.i());
        Label_0095: {
            if (!ControlsOverlayStyle.d(this.H)) {
                final ControlsState g = this.G;
                if (g.b || g.a == abac.a) {
                    if (!this.ao.hasMessages(3)) {
                        this.ao.sendEmptyMessageDelayed(3, 500L);
                    }
                    break Label_0095;
                }
            }
            this.ac();
        }
        final boolean o = this.H.o;
        final boolean b = true;
        final boolean b2 = false;
        if ((!o || !this.T()) && !this.I && !this.G.i()) {
            this.aK.i(false);
            tmy.v(this.ae, true);
            tmy.v((View)this.s.c, ControlsOverlayStyle.a(this.H) ^ true);
            if (!ControlsOverlayStyle.a(this.H) && this.aD && this.O && !this.aE) {
                tmy.v((View)this.m, true);
                this.C.d(this.m.a.I());
            }
            else {
                tmy.v((View)this.m, false);
            }
            if (!ControlsOverlayStyle.a(this.H) && this.O && !this.aE) {
                tmy.v((View)this.n, true);
                this.e.u();
            }
            else {
                tmy.v((View)this.n, false);
            }
            Label_0375: {
                if (!ControlsOverlayStyle.a(this.H)) {
                    final com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.b d = this.D;
                    if (d.m || d.b()) {
                        if (this.G.j() && !this.aE) {
                            tmy.v((View)this.o, true);
                            this.C.c(16499);
                            break Label_0375;
                        }
                    }
                }
                tmy.v((View)this.o, false);
            }
            tmy.v((View)this.h, this.H.p);
            tmy.v((View)this.j, !ControlsOverlayStyle.d(this.H) && !this.aA);
            tmy.v((View)this.Z, true);
            tmy.v((View)this.k, this.aC);
            tmy.v((View)this.l, ControlsOverlayStyle.b(this.H));
            tmy.v(this.ac, this.G.j() && !this.H.v);
            final TouchImageView p = this.p;
            final boolean k = this.G.k();
            int visibility = 4;
            if (k) {
                visibility = visibility;
                if (this.H.t) {
                    visibility = 0;
                }
            }
            p.setVisibility(visibility);
            final boolean b3 = this.H.u && (this.J || this.K) && this.G.a != abac.a;
            tmy.v((View)this.q, b3);
            tmy.v((View)this.r, b3);
            this.q.setEnabled(this.J);
            this.r.setEnabled(this.K);
            final ControlsOverlayStyle h = this.H;
            boolean b4 = b2;
            if (h.s) {
                b4 = b2;
                if (this.aC) {
                    b4 = b2;
                    if (this.M) {
                        b4 = b2;
                        if (!this.L) {
                            b4 = b2;
                            if (!ControlsOverlayStyle.a(h)) {
                                b4 = b2;
                                if (this.G.a != abac.f) {
                                    b4 = true;
                                }
                            }
                        }
                    }
                }
            }
            tmy.v((View)this.z, b4);
            tmy.v((View)this.y, b4);
            tmy.v((View)this.t, true);
            return true;
        }
        this.aK.i(true);
        final boolean b5 = this.N || this.L;
        tmy.v((View)this.o, false);
        tmy.v((View)this.s.c, false);
        tmy.v((View)this.m, false);
        tmy.v((View)this.n, false);
        tmy.v(this.ae, false);
        tmy.v((View)this.h, b5 || (this.H.v && this.G.j()));
        tmy.v((View)this.l, false);
        tmy.v(this.ac, b5);
        tmy.v((View)this.Z, b5);
        tmy.v(this.Y, b5);
        tmy.v((View)this.p, false);
        tmy.v((View)this.q, false);
        tmy.v((View)this.r, false);
        tmy.v((View)this.z, false);
        tmy.v((View)this.y, false);
        final RelativeLayout t = this.t;
        boolean b6 = b;
        Label_0969: {
            if (!b5) {
                if (this.H.v) {
                    b6 = b;
                    if (this.G.j()) {
                        break Label_0969;
                    }
                }
                b6 = (!this.G.k() && b);
            }
        }
        tmy.v((View)t, b6);
        return false;
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final void b(final boolean k) {
        this.K = k;
        if (this.mn()) {
            this.V();
        }
    }
    
    public final void d() {
        this.i.l();
        if (this.mn()) {
            ((abbx)this.h).mg((abcb)this.i);
        }
    }
    
    public final void f(final ControlsState g) {
        if (!this.G.equals((Object)g)) {
            this.G = g;
        }
        if (!this.aF) {
            return;
        }
        if (this.mn()) {
            this.V();
            final abac a = g.a;
            if (a == abac.f) {
                this.v();
                if (((abbx)this.h).c() != 0L) {
                    final abby i = this.i;
                    i.b = 0L;
                    ((abbx)this.h).mg((abcb)i);
                }
            }
            else if (a == abac.c && !this.aB) {
                if (this.ao.hasMessages(5)) {
                    this.ao.removeMessages(5);
                }
                this.ao.sendEmptyMessageDelayed(5, 500L);
            }
            this.I();
        }
        else {
            this.Z(1);
        }
        if (g.i()) {
            this.ad();
        }
    }
    
    public final void g(final boolean m) {
        this.D.m = m;
    }
    
    public final void j(final SubtitleTrack subtitleTrack) {
        this.D.j(subtitleTrack);
    }
    
    public final void k(final ControlsOverlayStyle h) {
        this.H = h;
        if (this.aM != null && !aeda.v(h.n, ControlsOverlayStyle.i.n)) {
            final abby i = this.i;
            i.j = -1;
            i.g = -1996488705;
            i.f = -2013265920;
            i.m = -1;
        }
        else {
            final abby j = this.i;
            final int q = h.q;
            j.j = q;
            j.g = -855638017;
            j.f = 872415231;
            j.m = q;
            j.n = h.r;
        }
        final abby k = this.i;
        k.o = h.w;
        k.p = h.s;
        k.q = h.x;
        k.m(h.z);
        if (this.mn()) {
            ((abbx)this.h).mg((abcb)this.i);
            final ArrayDeque arrayDeque = new ArrayDeque();
            final boolean v = aeda.v(h.n, ControlsOverlayStyle.i.n);
            int max = -2;
            if (v) {
                arrayDeque.add(tmy.ao(11));
                arrayDeque.add(tmy.at(-2));
            }
            else {
                arrayDeque.add(tmy.az(11));
                arrayDeque.add(tmy.ap(0, this.Z.getId()));
                if (this.Z.getHeight() > 0) {
                    max = Math.max(this.af.getLayoutParams().height, this.Z.getHeight());
                }
                arrayDeque.add(tmy.at(max));
            }
            tmy.aF((View)this.af, tmy.aK(arrayDeque), (Class)RelativeLayout$LayoutParams.class);
            this.V();
            this.I();
        }
    }
    
    public final void l(final abbl b) {
        this.b.b = b;
    }
    
    public final void m(final boolean l) {
        this.D.l = l;
    }
    
    public final aazs mj(final Context context) {
        final aazs mj = super.mj(context);
        mj.e = false;
        mj.b();
        return mj;
    }
    
    public final boolean mn() {
        return this.aF && super.mn();
    }
    
    public final void n(final long n, final long n2, final long n3, final long n4) {
        this.i.n(n, n2, n3, n4);
        if (this.mn()) {
            ((abbx)this.h).mg((abcb)this.i);
        }
    }
    
    public final void o(final VideoQuality[] array, final int n, final boolean b) {
        this.D.o(array, n, b);
    }
    
    public final void oD(final boolean j) {
        this.J = j;
        if (this.mn()) {
            this.V();
        }
    }
    
    public final void oE() {
        if (!this.mn()) {
            return;
        }
        this.H();
        this.ao.removeMessages(5);
        this.I = true;
        this.V();
        this.b.d();
    }
    
    public final void oF() {
        if (this.mn()) {
            this.s.e();
        }
        final c r = this.R;
        if (r != null) {
            r.a();
        }
        this.k(ControlsOverlayStyle.a);
        this.ad();
        this.oE();
        this.aB = true;
    }
    
    public final void oG(final String d, final boolean b) {
        if (this.R == null) {
            af();
            return;
        }
        final agza builder = ((agzi)ancs.a).createBuilder();
        final agzc agzc = (agzc)((agzi)ajsq.a).createBuilder();
        ((agza)agzc).copyOnWrite();
        final ajsq ajsq = (ajsq)agzc.instance;
        d.getClass();
        ajsq.b |= 0x1;
        ajsq.d = d;
        builder.copyOnWrite();
        final ancs ancs = (ancs)builder.instance;
        final ajsq c = (ajsq)((agza)agzc).build();
        c.getClass();
        ancs.c = c;
        ancs.b |= 0x1;
        this.ae(jfi.ai((ancs)builder.build()), b);
    }
    
    public final void oH(final boolean b) {
        if (!this.mn()) {
            this.aG = b;
            this.Z(16);
            return;
        }
        this.j.setSelected(b);
        final TouchImageView j = this.j;
        final Context f = this.F;
        int n;
        if (!b) {
            n = 2132017255;
        }
        else {
            n = 2132017260;
        }
        j.setContentDescription(f.getText(n));
        if (this.G.a == abac.b) {
            this.H();
            this.Q(true);
        }
    }
    
    public final boolean oU() {
        if (!this.aC) {
            final int p = this.P;
            if (p != 1) {
                if (p != 3) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return !this.mn() || this.g.onKeyDown(n, keyEvent);
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        return !this.mn() || this.g.onKeyUp(n, keyEvent);
    }
    
    public final void p(final Bitmap as) {
        this.as = as;
        if (this.mn()) {
            this.s.f(as);
        }
    }
    
    public final void pj(final aazw a) {
        final p b = this.b;
        b.a = a;
        this.D.d = (aazw)b;
    }
    
    public final void pk(final boolean b) {
        this.az = b;
        if (this.mn()) {
            ((abbx)this.h).setEnabled(b);
        }
    }
    
    public final void q(final List list) {
        this.D.q(list);
    }
    
    public final void qW(final boolean b) {
    }
    
    public final void qX(final boolean ab) {
        this.aB = ab;
    }
    
    public final void qY(final abbd d) {
        this.b.d = d;
    }
    
    public final void qZ(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g f) {
        this.b.f = f;
    }
    
    public final void r(final boolean aa) {
        this.aA = aa;
        if (this.mn()) {
            this.V();
        }
    }
    
    public final void ra(final ShareButtonData shareButtonData) {
    }
    
    public final void rb(final boolean ac) {
        if (this.aC != ac) {
            this.aC = ac;
            if (this.mn()) {
                tmy.v((View)this.k, this.aC);
                if (this.aC) {
                    this.O();
                    return;
                }
                this.V();
            }
            else {
                this.Z(4);
            }
        }
    }
    
    public final void rc(final SubscribeButtonData au) {
        this.au = au;
        if (this.mn()) {
            this.s.rc(au);
        }
    }
    
    public final void rd(final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.c v) {
        this.V = v;
        if (this.mn()) {
            this.s.rd(v);
        }
    }
    
    public final void re(final abcl c) {
        this.b.c = c;
    }
    
    public final void rf() {
        tmy.x(this.F, 2132018804, 0);
    }
    
    public final void s(final CharSequence charSequence) {
        this.ay = charSequence;
        if (this.mn()) {
            this.l.setText(charSequence);
        }
    }
    
    public final void t(final com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d d) {
        this.e = d;
        this.D.r = d;
    }
    
    public final void u(final Map x) {
        this.i.x = x;
        if (this.mn()) {
            ((abbx)this.h).mg((abcb)this.i);
        }
    }
    
    public final void v() {
        if (this.mn()) {
            this.H();
            this.ao.removeMessages(5);
            this.I = false;
            if (this.V()) {
                this.b.v();
            }
            this.I();
            return;
        }
        this.Z(8);
    }
    
    public final void w(final com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c c) {
        this.U = c;
        if (this.mn()) {
            this.s.f = c;
        }
    }
    
    public final void y(final ancs ancs, final boolean b) {
        if (this.R == null) {
            af();
            return;
        }
        this.ae(jfi.ai(ancs), b);
    }
    
    public final void z(final SubscriptionNotificationButtonData av) {
        this.av = av;
        if (this.mn()) {
            this.s.z(av);
        }
    }
}
