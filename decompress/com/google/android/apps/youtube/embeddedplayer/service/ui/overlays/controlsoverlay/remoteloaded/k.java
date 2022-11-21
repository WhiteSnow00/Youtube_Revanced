// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import java.util.Map;
import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.model.ShareButtonData;
import java.util.List;
import android.view.KeyEvent;
import android.widget.RelativeLayout$LayoutParams;
import java.util.ArrayDeque;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
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

public final class k extends abcq implements abcy, abvm, abeo, abfm, abee, h, b, a, e, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b, d, com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b
{
    public static final afgh a;
    private static final jzq aL;
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
    private final ttb W;
    private final abii X;
    private View Y;
    private ViewGroup Z;
    private boolean aA;
    private boolean aB;
    private boolean aC;
    private boolean aD;
    private boolean aE;
    private boolean aF;
    private boolean aG;
    private final aslm aH;
    private final asln aI;
    private final jcs aJ;
    private final acoe aK;
    private jzq aM;
    private Drawable aa;
    private Drawable ab;
    private View ac;
    private Drawable ad;
    private View ae;
    private LinearLayout af;
    private FrameLayout ag;
    private abfi ah;
    private Animation ai;
    private int aj;
    private int ak;
    private Animation al;
    private Animation am;
    private Animation an;
    private Handler ao;
    private abdi ap;
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
    public final ttc c;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.c d;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d e;
    public final ttf f;
    public FrameLayout g;
    public TimeBar h;
    public final abey i;
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
    public abij w;
    public boolean x;
    public TouchImageView y;
    public TouchImageView z;
    
    static {
        aL = new jzq();
        a = afgh.s(2131431138, 2131427613);
    }
    
    private k(final Context f, final i i, final acoe ak, final byte[] array, final byte[] array2) {
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
        this.i = new abey();
        this.b = new p(new slt(i), null);
        this.aJ = new jcs(this, 4);
        this.T = (View$OnClickListener)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.e(this);
        final j j = new j(this);
        this.f = (ttf)j;
        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.i k = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.i(this);
        this.W = (ttb)k;
        final ttc c = new ttc(ViewConfiguration.get(this.F));
        this.c = c;
        c.b = (ttb)k;
        ((ttg)c).c = (ttf)j;
        this.X = (abii)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.h(this);
        this.aI = com.google.android.apps.youtube.embeddedplayer.service.jar.b.a.c((asmi)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.d(this, 3), (asmn)lnj.l);
        this.aH = new aslm();
    }
    
    public static k W(final Context context, final i i, final acoe acoe, final askp askp, final asla asla, final askp askp2) {
        final k k = new k(context, i, acoe, null, null);
        k.ao = new Handler((Handler$Callback)new bnh(k, 6));
        final Context f = k.F;
        final cbl cbl = new cbl(k, 11);
        (k.A = AnimationUtils.loadAnimation(f, 2130772040)).setAnimationListener((Animation$AnimationListener)cbl);
        k.ai = AnimationUtils.loadAnimation(f, 2130772037);
        k.am = AnimationUtils.loadAnimation(f, 2130772001);
        k.an = AnimationUtils.loadAnimation(f, 2130772123);
        k.aj = f.getResources().getInteger(2131492903);
        k.ak = f.getResources().getInteger(2131492905);
        k.ai.setDuration((long)k.aj);
        k.al = AnimationUtils.loadAnimation(f, 2130772037);
        k.B = AnimationUtils.loadAnimation(f, 2130772040);
        final int integer = f.getResources().getInteger(2131492906);
        final Animation al = k.al;
        final long n = integer;
        al.setDuration(n);
        k.B.setDuration(n);
        k.B.setAnimationListener((Animation$AnimationListener)cbl);
        k.aH.c(askp.A().aH(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.d(k, 4)));
        k.aH.c(asla.ab((asmi)new m(5), (asmi)m.f));
        k.aH.c(askp2.aH(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.d(k, 5)));
        final eyn eyn = new eyn(i, 15);
        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.d d = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.d(k, i);
        k.D = new com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.b(k.F, (DialogInterface$OnShowListener)eyn, (DialogInterface$OnDismissListener)d, new com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.c(k.F, (DialogInterface$OnShowListener)eyn, (DialogInterface$OnDismissListener)d), new qou(k.F, (DialogInterface$OnShowListener)eyn, (DialogInterface$OnDismissListener)d), new jzq(), null, null, null);
        final g g = new g(k);
        k.D.l((aben)g);
        k.D.rk((abfl)g);
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
    
    private final void ae(final akyz akyz, final boolean b) {
        Optional optional;
        if (b) {
            optional = Optional.of((Object)new oqz(this.b));
        }
        else {
            optional = Optional.empty();
        }
        final c r = this.R;
        r.getClass();
        r.b(akyz, b, optional);
    }
    
    private static final void af() {
        aftr.k("Error screen presenter should be present");
    }
    
    public final void A(final SubscriptionNotificationMenuData aw) {
        this.aw = aw;
        if (this.mm()) {
            this.s.A(aw);
        }
    }
    
    public final int B() {
        if (this.mm()) {
            return this.h.a;
        }
        return 0;
    }
    
    public final void C(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.d e) {
        this.b.e = e;
    }
    
    public final void D(final VideoDetails at) {
        this.at = at;
        if (this.mm()) {
            this.s.l(at);
        }
    }
    
    public final void E(final com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.c c) {
        this.d = c;
        this.D.o = c;
    }
    
    public final void F(final WatchLaterButtonData watchLaterButtonData) {
        this.ax = watchLaterButtonData;
        if (this.mm()) {
            this.m.a(watchLaterButtonData);
        }
        this.D.p = watchLaterButtonData;
    }
    
    public final abfi G() {
        if (this.mm() && this.ah == null) {
            this.ah = new abfi((TextView)this.g.findViewById(2131430449));
        }
        return this.ah;
    }
    
    public final void H() {
        if (!this.mm()) {
            return;
        }
        this.ao.removeMessages(1);
        this.aK.h((Consumer)llt.e);
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
        if ((g.a == abde.b || g.b) && this.T() && !this.ao.hasMessages(1)) {
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
        asmr.b((AtomicReference)this.aI);
    }
    
    public final void M(final int n) {
        this.aq = n;
        if (!this.mm()) {
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
        if (this.mm()) {
            this.s.h(ar);
            this.s.n(2);
        }
    }
    
    public final void O() {
        this.v();
        this.aK.h((Consumer)new llr(this, 10));
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
            this.oC();
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
        this.aK.h((Consumer)new llr(this, 11));
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
        apj.h(this.l, drawable, null, null);
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
        if (this.G.a == abde.f) {
            return false;
        }
        if (aehz.b((int)motionEvent.getX(), this.g.getWidth(), false) == 2) {
            final abey i = this.i;
            if (i.c <= i.e) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean V() {
        this.ao.removeMessages(2);
        this.ap.a(this.G);
        tqf.v((View)this.v, this.G.i());
        Label_0098: {
            if (!ControlsOverlayStyle.d(this.H)) {
                final ControlsState g = this.G;
                if (g.b || g.a == abde.a) {
                    if (!this.ao.hasMessages(3)) {
                        this.ao.sendEmptyMessageDelayed(3, 500L);
                    }
                    break Label_0098;
                }
            }
            this.ac();
        }
        final boolean o = this.H.o;
        final boolean b = true;
        final boolean b2 = false;
        if ((!o || !this.T()) && !this.I && !this.G.i()) {
            this.aK.i(false);
            tqf.v(this.ae, true);
            tqf.v((View)this.s.c, ControlsOverlayStyle.a(this.H) ^ true);
            if (!ControlsOverlayStyle.a(this.H) && this.aD && this.O && !this.aE) {
                tqf.v((View)this.m, true);
                this.C.d(this.m.a.I());
            }
            else {
                tqf.v((View)this.m, false);
            }
            if (!ControlsOverlayStyle.a(this.H) && this.O && !this.aE) {
                tqf.v((View)this.n, true);
                this.e.u();
            }
            else {
                tqf.v((View)this.n, false);
            }
            Label_0382: {
                if (!ControlsOverlayStyle.a(this.H)) {
                    final com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.b d = this.D;
                    if (d.m || d.b()) {
                        if (this.G.j() && !this.aE) {
                            tqf.v((View)this.o, true);
                            this.C.c(16499);
                            break Label_0382;
                        }
                    }
                }
                tqf.v((View)this.o, false);
            }
            tqf.v((View)this.h, this.H.p);
            tqf.v((View)this.j, !ControlsOverlayStyle.d(this.H) && !this.aA);
            tqf.v((View)this.Z, true);
            tqf.v((View)this.k, this.aC);
            tqf.v((View)this.l, ControlsOverlayStyle.b(this.H));
            tqf.v(this.ac, this.G.j() && !this.H.v);
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
            final boolean b3 = this.H.u && (this.J || this.K) && this.G.a != abde.a;
            tqf.v((View)this.q, b3);
            tqf.v((View)this.r, b3);
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
                                if (this.G.a != abde.f) {
                                    b4 = true;
                                }
                            }
                        }
                    }
                }
            }
            tqf.v((View)this.z, b4);
            tqf.v((View)this.y, b4);
            tqf.v((View)this.t, true);
            return true;
        }
        this.aK.i(true);
        final boolean b5 = this.N || this.L;
        tqf.v((View)this.o, false);
        tqf.v((View)this.s.c, false);
        tqf.v((View)this.m, false);
        tqf.v((View)this.n, false);
        tqf.v(this.ae, false);
        tqf.v((View)this.h, b5 || (this.H.v && this.G.j()));
        tqf.v((View)this.l, false);
        tqf.v(this.ac, b5);
        tqf.v((View)this.Z, b5);
        tqf.v(this.Y, b5);
        tqf.v((View)this.p, false);
        tqf.v((View)this.q, false);
        tqf.v((View)this.r, false);
        tqf.v((View)this.z, false);
        tqf.v((View)this.y, false);
        final RelativeLayout t = this.t;
        boolean b6 = b;
        Label_0984: {
            if (!b5) {
                if (this.H.v) {
                    b6 = b;
                    if (this.G.j()) {
                        break Label_0984;
                    }
                }
                b6 = (!this.G.k() && b);
            }
        }
        tqf.v((View)t, b6);
        return false;
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final void b(final boolean k) {
        this.K = k;
        if (this.mm()) {
            this.V();
        }
    }
    
    public final View c(final Context context) {
        final Resources resources = context.getResources();
        final f g = new f(this, context);
        this.g = g;
        int i = 0;
        g.setClipToPadding(false);
        final LayoutInflater from = LayoutInflater.from(context);
        Label_0108: {
            if (this.Q) {
                try {
                    from.inflate(2131624390, (ViewGroup)this.g);
                    break Label_0108;
                }
                catch (final RuntimeException ex) {
                    com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.c.a().c(com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.b.b, "Unable to inflate LazyEmbedsControlsOverlay", (Throwable)ex);
                    aftr.k("Unable to inflate LazyEmbedsControlsOverlay: ".concat(ex.toString()));
                    final FrameLayout frameLayout = this.g;
                    return (View)frameLayout;
                }
            }
            from.inflate(2131624390, (ViewGroup)this.g);
        }
        asmr.b((AtomicReference)this.aI);
        this.aF = true;
        this.t = (RelativeLayout)this.g.findViewById(2131428465);
        ((abex)(this.h = (TimeBar)this.g.findViewById(2131432060))).q((abfc)this.aJ);
        ((abex)this.h).mg((abfb)this.i);
        ((abex)this.h).setEnabled(this.az);
        final ViewGroup z = (ViewGroup)this.g.findViewById(2131427842);
        this.Z = z;
        this.Y = z.findViewById(2131427613);
        (this.j = (TouchImageView)this.Z.findViewById(2131429097)).setOnClickListener(this.T);
        (this.k = (TouchImageView)this.Z.findViewById(2131429237)).setOnClickListener(this.T);
        (this.l = (TextView)this.g.findViewById(2131429641)).setTypeface(acbx.b.a(context));
        this.l.setOnClickListener(this.T);
        this.aa = agy.a(context, 2131232449);
        this.ab = agy.a(context, 2131232452);
        this.S(true);
        final View viewById = this.g.findViewById(2131427829);
        this.ac = viewById;
        this.ad = viewById.getBackground();
        this.ae = this.g.findViewById(2131432143);
        this.af = (LinearLayout)this.g.findViewById(2131432063);
        (this.u = (ProgressBar)this.g.findViewById(2131430450)).setIndeterminateDrawable((Drawable)new pev(-1.0f, resources.getDimensionPixelSize(2131168551), resources.getDimensionPixelSize(2131168550), new int[] { resources.getColor(2131101633) }));
        anc.aw((View)(this.v = (TextView)this.g.findViewById(2131430447)));
        this.g.addOnLayoutChangeListener((View$OnLayoutChangeListener)new jdi(this, 12));
        (this.p = (TouchImageView)this.g.findViewById(2131430438)).setOnClickListener(this.T);
        this.ap = new abdi((ImageView)this.p, context);
        (this.r = (TouchImageView)this.g.findViewById(2131430440)).setOnClickListener(this.T);
        (this.q = (TouchImageView)this.g.findViewById(2131430436)).setOnClickListener(this.T);
        (this.y = (TouchImageView)this.g.findViewById(2131430444)).setOnClickListener(this.T);
        (this.z = (TouchImageView)this.g.findViewById(2131430445)).setOnClickListener(this.T);
        final FrameLayout ag = (FrameLayout)this.g.findViewById(2131430465);
        this.ag = ag;
        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.e a = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.e.a(context, ag);
        this.s = a;
        a.g = this.C;
        a.e = this.b;
        a.d = this;
        a.f = this.U;
        a.ri(this.V);
        (this.m = (WatchLaterButton)this.g.findViewById(2131430470)).setOnClickListener(this.T);
        this.m.b = this;
        (this.n = (YouTubeButton)this.g.findViewById(2131430462)).setOnClickListener(this.T);
        (this.o = (TouchImageView)this.g.findViewById(2131430457)).setOnClickListener(this.T);
        this.s.l(this.at);
        this.s.h(this.ar);
        this.s.f(this.as);
        this.s.rh(this.au);
        this.s.z(this.av);
        this.s.A(this.aw);
        this.m.a(this.ax);
        ((TextView)this.g.findViewById(2131431138)).setMaxWidth((int)(resources.getDisplayMetrics().density * 200.0f + 0.5f - (resources.getDimension(2131169396) + resources.getDimension(2131169397))));
        final o e = new o(this.F, this.ao, (abcx)this.b);
        e.b = new com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.f(e, 10);
        this.E = e;
        (this.w = new abij((View)this.g, null, this.X, this.E.d)).c(this.x);
        final o e2 = this.E;
        (e2.f = this.w).d((View$OnAttachStateChangeListener)new if(e2, 9));
        for (afgh a2 = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.k.a; i < ((afjx)a2).c; ++i) {
            final View viewById2 = this.g.findViewById((int)a2.get(i));
            if (viewById2 != null) {
                final acoe ak = this.aK;
                final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.remoteloaded.a a3 = new com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.remoteloaded.a(ak, viewById2, (byte[])null, (byte[])null);
                ((Map<View, com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.j>)ak.d).put(viewById2, (com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.j)a3);
                ((mbb)ak.c).c(viewById2.getId(), (com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.j)a3);
                viewById2.setOnClickListener((View$OnClickListener)ak.b);
            }
        }
        this.M(this.aq);
        this.s(this.ay);
        this.oV(this.H);
        this.oC();
        this.ac();
        final FrameLayout frameLayout = this.g;
        return (View)frameLayout;
    }
    
    public final void d() {
        this.i.l();
        if (this.mm()) {
            ((abex)this.h).mg((abfb)this.i);
        }
    }
    
    public final /* bridge */ void e(final Context context, final View view) {
        final FrameLayout frameLayout = (FrameLayout)view;
        if (this.ab(1)) {
            this.f(this.G);
        }
        if (this.ab(4)) {
            this.rg(this.aC);
        }
        if (this.ab(8)) {
            this.v();
        }
        if (this.ab(16)) {
            this.oF(this.aG);
        }
    }
    
    public final void f(final ControlsState g) {
        if (!this.G.equals((Object)g)) {
            this.G = g;
        }
        if (!this.aF) {
            return;
        }
        if (this.mm()) {
            this.V();
            final abde a = g.a;
            if (a == abde.f) {
                this.v();
                if (((abex)this.h).c() != 0L) {
                    final abey i = this.i;
                    i.b = 0L;
                    ((abex)this.h).mg((abfb)i);
                }
            }
            else if (a == abde.c && !this.aB) {
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
    
    public final void l(final aben b) {
        this.b.b = b;
    }
    
    public final void m(final boolean l) {
        this.D.l = l;
    }
    
    public final abct mj(final Context context) {
        final abct mj = super.mj(context);
        mj.e = false;
        mj.b();
        return mj;
    }
    
    public final boolean mm() {
        return this.aF && super.mm();
    }
    
    public final void n(final long n, final long n2, final long n3, final long n4) {
        this.i.n(n, n2, n3, n4);
        if (this.mm()) {
            ((abex)this.h).mg((abfb)this.i);
        }
    }
    
    public final void o(final VideoQuality[] array, final int n, final boolean b) {
        this.D.o(array, n, b);
    }
    
    public final void oB(final boolean j) {
        this.J = j;
        if (this.mm()) {
            this.V();
        }
    }
    
    public final void oC() {
        if (!this.mm()) {
            return;
        }
        this.H();
        this.ao.removeMessages(5);
        this.I = true;
        this.V();
        this.b.d();
    }
    
    public final void oD() {
        if (this.mm()) {
            this.s.e();
        }
        final c r = this.R;
        if (r != null) {
            r.a();
        }
        this.oV(ControlsOverlayStyle.a);
        this.ad();
        this.oC();
        this.aB = true;
    }
    
    public final void oE(final String d, final boolean b) {
        if (this.R == null) {
            af();
            return;
        }
        final ahcr builder = ((ahcz)anhd.a).createBuilder();
        final ahct ahct = (ahct)((ahcz)ajws.a).createBuilder();
        ((ahcr)ahct).copyOnWrite();
        final ajws ajws = (ajws)ahct.instance;
        d.getClass();
        ajws.b |= 0x1;
        ajws.d = d;
        builder.copyOnWrite();
        final anhd anhd = (anhd)builder.instance;
        final ajws c = (ajws)((ahcr)ahct).build();
        c.getClass();
        anhd.c = c;
        anhd.b |= 0x1;
        this.ae(lma.w((anhd)builder.build()), b);
    }
    
    public final void oF(final boolean b) {
        if (!this.mm()) {
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
        if (this.G.a == abde.b) {
            this.H();
            this.Q(true);
        }
    }
    
    public final void oV(final ControlsOverlayStyle h) {
        this.H = h;
        if (this.aM != null && !aexq.c(h.n, ControlsOverlayStyle.i.n)) {
            final abey i = this.i;
            i.j = -1;
            i.g = -1996488705;
            i.f = -2013265920;
            i.m = -1;
        }
        else {
            final abey j = this.i;
            final int q = h.q;
            j.j = q;
            j.g = -855638017;
            j.f = 872415231;
            j.m = q;
            j.n = h.r;
        }
        final abey k = this.i;
        k.o = h.w;
        k.p = h.s;
        k.q = h.x;
        k.m(h.z);
        if (this.mm()) {
            ((abex)this.h).mg((abfb)this.i);
            final ArrayDeque arrayDeque = new ArrayDeque();
            final boolean c = aexq.c(h.n, ControlsOverlayStyle.i.n);
            int max = -2;
            if (c) {
                arrayDeque.add(tqf.ao(11));
                arrayDeque.add(tqf.at(-2));
            }
            else {
                arrayDeque.add(tqf.az(11));
                arrayDeque.add(tqf.ap(0, this.Z.getId()));
                if (this.Z.getHeight() > 0) {
                    max = Math.max(this.af.getLayoutParams().height, this.Z.getHeight());
                }
                arrayDeque.add(tqf.at(max));
            }
            tqf.aF((View)this.af, tqf.aK(arrayDeque), (Class)RelativeLayout$LayoutParams.class);
            this.V();
            this.I();
        }
    }
    
    public final boolean oW() {
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
        return !this.mm() || this.g.onKeyDown(n, keyEvent);
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        return !this.mm() || this.g.onKeyUp(n, keyEvent);
    }
    
    public final void p(final Bitmap as) {
        this.as = as;
        if (this.mm()) {
            this.s.f(as);
        }
    }
    
    public final void pm(final abcx a) {
        final p b = this.b;
        b.a = a;
        this.D.d = (abcx)b;
    }
    
    public final void pn(final boolean b) {
        this.az = b;
        if (this.mm()) {
            ((abex)this.h).setEnabled(b);
        }
    }
    
    public final void q(final List list) {
        this.D.q(list);
    }
    
    public final void r(final boolean aa) {
        this.aA = aa;
        if (this.mm()) {
            this.V();
        }
    }
    
    public final void rb(final boolean b) {
    }
    
    public final void rc(final boolean ab) {
        this.aB = ab;
    }
    
    public final void rd(final abed d) {
        this.b.d = d;
    }
    
    public final void re(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g f) {
        this.b.f = f;
    }
    
    public final void rf(final ShareButtonData shareButtonData) {
    }
    
    public final void rg(final boolean ac) {
        if (this.aC != ac) {
            this.aC = ac;
            if (this.mm()) {
                tqf.v((View)this.k, this.aC);
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
    
    public final void rh(final SubscribeButtonData au) {
        this.au = au;
        if (this.mm()) {
            this.s.rh(au);
        }
    }
    
    public final void ri(final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.c v) {
        this.V = v;
        if (this.mm()) {
            this.s.ri(v);
        }
    }
    
    public final void rj(final long n, final long n2, final long n3, final long n4, final long n5) {
        aana.e((abcy)this, n, n3, n4, n5);
    }
    
    public final void rk(final abfl c) {
        this.b.c = c;
    }
    
    public final void rl() {
        tqf.x(this.F, 2132018807, 0);
    }
    
    public final void s(final CharSequence charSequence) {
        this.ay = charSequence;
        if (this.mm()) {
            this.l.setText(charSequence);
        }
    }
    
    public final void t(final com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d d) {
        this.e = d;
        this.D.r = d;
    }
    
    public final void u(final Map x) {
        this.i.x = x;
        if (this.mm()) {
            ((abex)this.h).mg((abfb)this.i);
        }
    }
    
    public final void v() {
        if (this.mm()) {
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
        if (this.mm()) {
            this.s.f = c;
        }
    }
    
    public final void x() {
        aana.c((abcy)this);
    }
    
    public final void y(final anhd anhd, final boolean b) {
        if (this.R == null) {
            af();
            return;
        }
        this.ae(lma.w(anhd), b);
    }
    
    public final void z(final SubscriptionNotificationButtonData av) {
        this.av = av;
        if (this.mm()) {
            this.s.z(av);
        }
    }
}
