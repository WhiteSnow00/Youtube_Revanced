// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

import android.text.Spanned;
import java.util.Map;
import android.view.ScaleGestureDetector;
import android.view.KeyEvent;
import android.animation.ValueAnimator;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import android.view.ViewGroup$LayoutParams;
import android.text.TextUtils;
import android.text.SpannableStringBuilder;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import app.revanced.integrations.patches.HideAutoplayButtonPatch;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import android.view.animation.Interpolator;
import android.view.MotionEvent;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import android.util.Pair;
import android.view.animation.AnimationUtils;
import app.revanced.integrations.videoplayer.Download;
import app.revanced.integrations.videoplayer.AutoRepeat;
import app.revanced.integrations.videoplayer.Copy;
import app.revanced.integrations.videoplayer.CopyWithTimeStamp;
import app.revanced.integrations.sponsorblock.ShieldButton;
import app.revanced.integrations.sponsorblock.VotingButton;
import java.util.Iterator;
import android.view.View$OnClickListener;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
import android.view.View$OnTouchListener;
import android.widget.ImageView;
import android.view.ViewConfiguration;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewStub;
import android.view.View$OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import j$.util.Optional;
import java.util.HashSet;
import android.os.Handler$Callback;
import android.widget.TextView;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
import android.content.Context;
import android.view.animation.Animation;
import android.os.Handler;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;
import java.util.Set;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import android.graphics.Rect;

public class YouTubeControlsOverlay implements aazx, tfh, fnz, aazr, fqb, tpy, tpu, aamq, aamp, abfw, abap, itt, abfh, jdc, jdi, jat
{
    public static final Rect a;
    public wxz A;
    public wxz B;
    public final iwd C;
    public final ivt D;
    public final jai E;
    public final jdj F;
    public grx G;
    public int H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public long M;
    public ControlsState N;
    public ControlsOverlayStyle O;
    public aazg P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public Rect T;
    public boolean U;
    public final uyf V;
    public final arud W;
    final qpt X;
    private final ixu Z;
    private final abni aA;
    private final tpw aB;
    private final jda aC;
    private final jdd aD;
    private final jcz aE;
    private final iye aF;
    private final asib aG;
    private final iuj aH;
    private final iul aI;
    private final ixj aJ;
    private final arhr aK;
    private final jbp aL;
    private final jaz aM;
    private final atir aN;
    private final boolean aO;
    private wxz aP;
    private wxz aQ;
    private final Set aR;
    private final jaf aS;
    private final jad aT;
    private final asgt aU;
    private boolean aV;
    private boolean aW;
    private fkk aX;
    private boolean aY;
    private boolean aZ;
    private final ixv aa;
    private final iwk ab;
    private final iux ac;
    private final ius ad;
    private final aazk ae;
    private final abyc af;
    private final itr ag;
    private final SuggestedActionsMainController ah;
    private final ive ai;
    private final lbc aj;
    private iup ak;
    private aazq al;
    private final uug am;
    private final ixd an;
    private final ixh ao;
    private final jcm ap;
    private FrameLayout aq;
    private final iyi ar;
    private final int as;
    private final int at;
    private final Handler au;
    private Animation av;
    private Animation aw;
    private final Context ax;
    private final abns ay;
    private final asho az;
    public final itx b;
    private boolean ba;
    private boolean bb;
    private boolean bc;
    private boolean bd;
    private boolean be;
    private asic bf;
    private final abit bg;
    private final uyi bh;
    private final uyi bi;
    private final kct bj;
    private final a bk;
    private final elw bl;
    private final qpt bm;
    private final qpt bn;
    public final abfc c;
    public final iub d;
    public iwt e;
    public aazw f;
    public final abft g;
    public final abfr h;
    public final isu i;
    public final jau j;
    public View k;
    public FrameLayout l;
    public View m;
    public final iyr n;
    public final iyt o;
    public TextView p;
    public String q;
    public final ivw r;
    public final fpo s;
    public aawm t;
    public final Runnable u;
    public abfu v;
    public final wwv w;
    public final ixk x;
    public final atir y;
    public final atir z;
    
    static {
        a = new Rect();
    }
    
    public YouTubeControlsOverlay(final Context ax, final tpw ab, final ixh ao, final jcm ap, final abft g, final abfr h, final iwk ab2, final wwv w, final elw bl, final abfc c, final arhr ak, final ixu z, final jjg jjg, final lht lht, final SuggestedActionsMainController ah, final isu isu, final jda ac, final abit bg, final jdd ad, final jcz ae, final ixv aa, final jau j, final uug am, final ixd an, final abns ay, final asho az, final uyf v, final arud w2, final iye af, final aazk ae2, final abyc af2, final iwd c2, final kct bj, final View[] array, final lbc aj, final iub d, final itx b, final abni aa2, final iuj ah2, final iul ai, final ixj aj2, final ixk x, final lll lll, final blt blt, final ivd ivd, final ivt d2, final jai e, final jaf as, final jad at, final uyi uyi, final uyi bh, final asgt au, final jbp al, final qpt bn, final jdj f, final qpt bm, final uyi bi, final jaz am2, final a bk, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        this.G = grx.a();
        this.H = 0;
        this.N = ControlsState.b();
        this.O = ControlsOverlayStyle.a;
        this.aX = fkk.a;
        this.aY = true;
        this.ax = ax;
        this.aB = ab;
        this.ao = ao;
        this.ap = ap;
        this.aC = ac;
        this.aD = ad;
        this.aE = ae;
        this.ah = ah;
        this.aF = af;
        this.b = b;
        this.aa = aa;
        this.ay = ay;
        this.az = az;
        this.V = v;
        this.aK = ak;
        this.ab = ab2;
        this.W = w2;
        this.g = g;
        this.h = h;
        this.an = an;
        this.am = am;
        this.w = w;
        this.bl = bl;
        this.au = new Handler((Handler$Callback)new bnd(this, 3));
        this.bg = bg;
        this.aR = new HashSet();
        this.y = atir.e();
        this.aN = atir.e();
        this.z = atir.e();
        this.ae = ae2;
        this.af = af2;
        this.C = c2;
        this.bj = bj;
        this.aj = aj;
        this.d = d;
        this.aG = new asib();
        this.aA = aa2;
        this.aH = ah2;
        this.aI = ai;
        this.aJ = aj2;
        this.x = x;
        this.D = d2;
        this.E = e;
        this.aS = as;
        this.aT = at;
        this.bh = bh;
        this.aL = al;
        this.bn = bn;
        this.bm = bm;
        x.a = Optional.of((Object)c);
        final int integer = ax.getResources().getInteger(2131492903);
        this.as = integer;
        this.at = ax.getResources().getInteger(2131492904);
        this.Z = z;
        this.c = c;
        this.j = j;
        this.i = isu;
        (g.g = isu).a(aexs.f(uyi.cO()) ^ true);
        isu.b((abfw)g);
        this.r = new ivw();
        this.s = fpo.a(ax.getResources().getString(2132019086));
        final aazf a = aazg.a();
        a.d(false);
        a.e(false);
        a.b(true);
        a.c(2000L);
        this.P = a.a();
        final qv l = new qv((atjj)new lam(this, 1));
        if (ivd.d) {
            l.a((ixw)new iuu(ivd, 2));
            ivd.l = l;
        }
        final abrx abrx = (abrx)((atjj)lht.e).a();
        abrx.getClass();
        final uyf uyf = (uyf)((atjj)lht.a).a();
        uyf.getClass();
        final wwv wwv = (wwv)((atjj)lht.b).a();
        wwv.getClass();
        final Object f2 = lht.f;
        final ghg ghg = (ghg)((atjj)lht.d).a();
        ghg.getClass();
        final uyi uyi2 = (uyi)((atjj)lht.c).a();
        uyi2.getClass();
        final ius ad2 = new ius(abrx, uyf, wwv, (atjj)f2, ghg, uyi2);
        this.ad = ad2;
        final abft abft = (abft)((atjj)jjg.b).a();
        abft.getClass();
        final abrx abrx2 = (abrx)((atjj)jjg.a).a();
        abrx2.getClass();
        final iux ac2 = new iux(abft, abrx2, ad2, l, (byte[])null);
        b.a((itw)ac2);
        this.ac = ac2;
        final itr itr = new itr((Context)((epq)bm.a).b.d.a(), (SuggestedActionsMainController)((epq)bm.a).b.bG.a(), (abft)((epq)bm.a).b.ar.a(), (uyi)((epq)bm.a).b.ab.a(), (fzo)((epq)bm.a).b.aA.a(), l, ac2, (byte[])null, (byte[])null);
        itr.k.c(((asgt)an.i).p().V().al((asix)new isg(itr, 9)));
        itr.c.c = (iuv)itr;
        itr.e.b.a((abfu)itr);
        itr.q.a((ixw)new iuu(itr, 1));
        final SuggestedActionsMainController d3 = itr.d;
        final esb m = new esb(itr, 16);
        final int i = itr.l;
        final atid f3 = itr.f;
        d3.m = m;
        d3.o = (asgt)f3;
        d3.l = i;
        d3.p = null;
        d3.h = null;
        itr.k.c(((ashe)d3.e).aB((asix)new isg(itr, 10)));
        b.a((itw)itr);
        ((ashe)ah.e).aB((asix)new iyg(this, 1));
        ah.f.j = this.X;
        this.ag = itr;
        final ive ai2 = new ive(g, w, aa, l, new qpt(this, (byte[])null), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        b.a((itw)ai2);
        this.ai = ai2;
        final qpt x2 = new qpt(this);
        this.X = x2;
        final qpt qpt = new qpt(this);
        final wwv wwv2 = (wwv)((atjj)blt.a).a();
        wwv2.getClass();
        final vax vax = (vax)((atjj)blt.c).a();
        vax.getClass();
        final aayj aayj = (aayj)((atjj)blt.b).a();
        aayj.getClass();
        final asgt asgt = (asgt)((atjj)blt.e).a();
        asgt.getClass();
        final mrm mrm = (mrm)((atjj)blt.d).a();
        mrm.getClass();
        final iyt o = new iyt(wwv2, vax, aayj, asgt, mrm, l, qpt, integer, x2, null, null, null, null, null, null, null);
        this.o = o;
        final Context context = (Context)((atjj)lll.b).a();
        context.getClass();
        final aays aays = (aays)((atjj)lll.h).a();
        aays.getClass();
        final abft abft2 = (abft)((atjj)lll.e).a();
        abft2.getClass();
        final fpg fpg = (fpg)((atjj)lll.c).a();
        fpg.getClass();
        final fpe fpe = (fpe)((atjj)lll.f).a();
        fpe.getClass();
        final aazc aazc = (aazc)((atjj)lll.g).a();
        aazc.getClass();
        final asgt asgt2 = (asgt)((atjj)lll.d).a();
        asgt2.getClass();
        final jai jai = (jai)((atjj)lll.a).a();
        jai.getClass();
        final iyr n = new iyr(context, aays, abft2, fpg, fpe, aazc, asgt2, jai, (fps)o, integer);
        this.n = n;
        af.e = (Set)afdu.s((Object)new iyj(this, 0));
        ((fon)n).g((abcc)(this.ar = new iyi(this)));
        b.a((itw)n);
        this.u = (Runnable)new ihc(this, 20);
        final long h2 = integer;
        if (an.d) {
            l.a((ixw)new iuu(an, 4));
            an.h = h2;
            an.b.a((fjk)an);
        }
        b.a((itw)an);
        b.c(this.N);
        b.i(this.O);
        b.f(this.aX);
        for (int length = array.length, k = 0; k < length; ++k) {
            z.d(array[k]);
        }
        this.aO = bh.cC();
        this.U = bh.f(45378635L);
        this.aU = au;
        this.T = new Rect();
        this.F = f;
        this.bi = bi;
        this.aM = am2;
        this.bk = bk;
    }
    
    private static void ac(final tpw tpw, final tpx... array) {
        for (int i = 0; i < 5; ++i) {
            tpw.a(array[i]);
        }
    }
    
    private final void ad() {
        if (this.l != null) {
            return;
        }
        final FrameLayout aq = (FrameLayout)LayoutInflater.from(this.ax).inflate(2131625431, (ViewGroup)null);
        this.aq = aq;
        this.l = (FrameLayout)aq.findViewById(2131432505);
        if (gkt.at(this.W)) {
            final FrameLayout l = this.l;
            l.getClass();
            l.addOnLayoutChangeListener((View$OnLayoutChangeListener)new fta(this, 19));
        }
        this.l.setClipToPadding(false);
        this.l.setFocusableInTouchMode(true);
        final FrameLayout i = this.l;
        i.getClass();
        final abfi h = new abfi((View)this.l, (ViewStub)i.findViewById(2131430763), this, this.c.b);
        final abfc c = this.c;
        (c.h = h).d((View$OnAttachStateChangeListener)new ie(c, 12));
        ajla ajla;
        if ((ajla = this.W.f().v) == null) {
            ajla = ajla.a;
        }
        h.c(ajla.f);
        final FrameLayout j = this.l;
        j.getClass();
        this.aC.q(new jdh(this.ax, (ViewStub)j.findViewById(2131432352), this.bi), this.aD, this.aE);
        this.aD.b((jdc)this);
        this.l.setTag(2131430457, (Object)this);
        final ixj aj = this.aJ;
        final FrameLayout k = this.l;
        if (!aj.g.isPresent()) {
            aj.g = Optional.of((Object)new tmt(((ViewStub)((View)k).findViewById(2131428781)).inflate()));
            ((tmt)aj.g.get()).c = ((View)k).getResources().getInteger(2131492903);
            ((tmt)aj.g.get()).g(aj.f);
            if (!aj.e) {
                aj.d.D((wxz)new wws(wya.c(119372)));
            }
        }
        final iuj ah = this.aH;
        final FrameLayout m = this.l;
        if (!ah.j.h()) {
            final View viewById = ((View)m).findViewById(2131428780);
            if (viewById == null) {
                ah.j = aexq.k(new tmt(((ViewStub)((View)m).findViewById(2131428781)).inflate()));
            }
            else {
                ah.j = aexq.k(new tmt(viewById));
            }
            ((tmt)ah.j.c()).c = ((View)m).getResources().getInteger(2131492903);
            ((tmt)ah.j.c()).g((tpf)new iut(ah, 1));
            ah.g.D((wxz)new wws(wya.c(119372)));
            ah.g.l((wxz)new wws(wya.c(124587)));
        }
        ac(this.aB, (tpx)this.aD, (tpx)this.aE, (tpx)this.i, (tpx)this.aj, (tpx)this.aM);
        this.aB.b((tpx)this.aI);
        this.l.getClass();
        final tpv tpv = new tpv(ViewConfiguration.get(this.ax));
        ((tpz)tpv).c = (tpy)this;
        tpv.b = (tpu)this;
        final ImageView imageView = (ImageView)this.l.findViewById(2131431263);
        if (this.bk.m()) {
            final jaw onTouchListener = new jaw();
            for (int n = 0; n <= 0; ++n) {
                onTouchListener.a.add((new tpx[] { (tpx)tpv })[n]);
            }
            final Optional of = Optional.of((Object)imageView);
            if (onTouchListener.b.isPresent()) {
                ((View)onTouchListener.b.get()).setOnTouchListener((View$OnTouchListener)null);
            }
            final Iterator iterator = onTouchListener.a.iterator();
            while (iterator.hasNext()) {
                ((tpx)iterator.next()).c();
            }
            onTouchListener.b = of;
            if (onTouchListener.b.isPresent()) {
                ((View)onTouchListener.b.get()).setOnTouchListener((View$OnTouchListener)onTouchListener);
            }
        }
        else {
            final tpw tpw = new tpw();
            ac(tpw, (tpx)this.aI, (tpx)tpv, (tpx)this.aD, (tpx)this.i, (tpx)this.aj);
            tpw.c((View)imageView);
        }
        final ixh ao = this.ao;
        ((View)imageView).getClass();
        final tmt f = new tmt((View)imageView, (tpe)new toe());
        ao.f = f;
        ao.d = f.d;
        ao.f.a(false);
        this.b.a((itw)this.ao);
        final FrameLayout l2 = this.l;
        l2.getClass();
        this.aF.m((ViewStub)l2.findViewById(2131432456), (Predicate)ifl.l);
        this.l.bringChildToFront((View)this.g);
        if (this.E.f) {
            final FrameLayout l3 = this.l;
            l3.getClass();
            final ViewStub l4 = (ViewStub)l3.findViewById(2131429026);
            final jaf as = this.aS;
            if (as.e.f) {
                if (l4 != null) {
                    as.l = l4;
                    as.u.A((Callable)new inm(as, 12));
                    if (!as.k) {
                        as.b();
                    }
                }
            }
            final jad at = this.aT;
            final FrameLayout l5 = this.l;
            if (at.b.f) {
                if (at.f == null && l5 != null) {
                    final View viewById2 = ((View)l5).findViewById(2131429021);
                    if (viewById2 == null) {
                        at.f = new tmt(((ViewStub)((View)l5).findViewById(2131429022)).inflate());
                    }
                    else {
                        at.f = new tmt(viewById2);
                    }
                    at.f.c = ((View)l5).getResources().getInteger(2131492903);
                    at.f.g((tpf)new iut(at, 4));
                    at.g.A((Callable)new inm(at, 11));
                    at.f.a.setOnClickListener((View$OnClickListener)new izp(at, 10));
                    at.e.a((jdi)at);
                }
            }
        }
        this.b.a((itw)new ivx((View)this.l, this.V));
        this.l.getClass();
        final Iterator iterator2 = this.aR.iterator();
        while (iterator2.hasNext()) {
            this.l.addView((View)iterator2.next());
        }
        this.aR.clear();
        this.g.bringToFront();
        this.ap.j().al((asix)new iyg(this, 4));
        this.bc = true;
        final aazq al = this.al;
        if (al != null) {
            al.d((aazr)this, (View)this.l);
        }
    }
    
    private final void ae(final float n) {
        if (n < 0.0f && this.g.b.g() && this.H != 1 && !this.O.o) {
            this.R();
        }
    }
    
    private final void af(final boolean b, final boolean b2) {
        VotingButton.changeVisibility(b);
        ShieldButton.changeVisibility(b);
        CopyWithTimeStamp.changeVisibility(b);
        Copy.changeVisibility(b);
        AutoRepeat.changeVisibility(b);
        Download.changeVisibility(b);
        if (this.g.getParent() == null) {
            return;
        }
        if (!this.R && !b && this.g.b.d()) {
            this.g.e(0);
        }
        if (!b2) {
            tmy.v((View)this.g, b);
            return;
        }
        if (b) {
            if (this.aw == null) {
                (this.aw = AnimationUtils.loadAnimation(this.ax, 2130772037)).setDuration((long)this.as);
            }
            final abft g = this.g;
            final Animation aw = this.aw;
            aw.getClass();
            g.startAnimation(aw);
            return;
        }
        if (this.g.getVisibility() == 0) {
            if (this.av == null) {
                (this.av = AnimationUtils.loadAnimation(this.ax, 2130772040)).setDuration((long)this.as);
            }
            final abft g2 = this.g;
            final Animation av = this.av;
            av.getClass();
            g2.startAnimation(av);
        }
    }
    
    private final void ag(final boolean b, final int n) {
        this.b.a.tr((Object)Pair.create((Object)false, (Object)b));
        if (b) {
            this.b.d(itz.c);
            this.ah((asir)new erx(this, 20), n);
            return;
        }
        this.b.d(itz.a);
    }
    
    private final void ah(final asir asir, final int n) {
        final asic bf = this.bf;
        if (bf != null) {
            asjg.b((AtomicReference)bf);
        }
        this.bf = asgn.f().l((long)n, TimeUnit.MILLISECONDS).C(this.az).V(asir);
    }
    
    private final void ai() {
        this.V(false);
    }
    
    private final void aj(final boolean b) {
        if (b) {
            this.F();
        }
        final View k = this.k;
        if (k == null) {
            return;
        }
        tmy.v(k, b);
    }
    
    private final boolean ak(final MotionEvent motionEvent) {
        if (this.aZ) {
            return false;
        }
        if (!ControlsOverlayStyle.a(this.O)) {
            if (!ControlsOverlayStyle.c(this.O)) {
                if (this.N.i()) {
                    return false;
                }
                if (this.N.a == abac.f) {
                    return false;
                }
                final float x = motionEvent.getX();
                final FrameLayout l = this.l;
                l.getClass();
                if (aeef.b((int)x, l.getWidth(), false) == 2 && this.L <= this.K) {
                    return false;
                }
                if (!this.j.i()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private final boolean al() {
        if (!this.ab()) {
            return false;
        }
        if (this.H != 1) {
            this.R();
        }
        else {
            this.C();
        }
        return true;
    }
    
    public final ViewGroup A() {
        this.ad();
        final FrameLayout aq = this.aq;
        aq.getClass();
        return (ViewGroup)aq;
    }
    
    public final void B(final View view) {
        this.ag.a(view);
    }
    
    public final void C() {
        this.au.removeMessages(1);
        this.au.removeMessages(2);
        this.g.clearAnimation();
    }
    
    public final void D() {
        gej.a();
        this.C();
        if (this.H == 0) {
            return;
        }
        this.H = 0;
        this.X();
        final aazw f = this.f;
        if (f != null) {
            f.d();
        }
    }
    
    final void E(final wxz wxz) {
        if (!this.aO) {
            return;
        }
        this.w.J(3, wxz, (alff)null);
    }
    
    public final void F() {
        this.ad();
        if (this.k != null) {
            return;
        }
        final FrameLayout l = this.l;
        l.getClass();
        final View inflate = ((ViewStub)l.findViewById(2131428466)).inflate();
        ShieldButton.initialize((Object)inflate);
        VotingButton.initialize((Object)inflate);
        this.k = inflate;
        final ivw r = this.r;
        final TextView textView = (TextView)inflate.findViewById(2131430448);
        textView.getClass();
        ((ashe)r.a).aB((asix)new ivc(textView, 11));
        ((ashe)r.b).aB((asix)new ivc(textView, 12));
        ((ashe)r.c).aB((asix)new ivc(textView, 13));
        ViewStub viewStub;
        if (this.bh.cB()) {
            viewStub = (ViewStub)this.k.findViewById(2131432504);
        }
        else {
            viewStub = (ViewStub)this.k.findViewById(2131432503);
        }
        viewStub.inflate();
        final View k = this.k;
        k.getClass();
        final iub d = this.d;
        final TextView textView2 = (TextView)k.findViewById(2131431947);
        final TextView textView3 = (TextView)this.k.findViewById(2131430292);
        final qpt f = new qpt(this, (byte[])null);
        final uvj uvj = new uvj((Interpolator)apb.c(0.05f, 0.0f, 0.0f, 1.0f), 1);
        final tmt d2 = new tmt((View)textView2, 500L, (tpe)uvj, 8);
        d.d = d2;
        final tmt e = new tmt((View)textView3, 500L, (tpe)uvj, 8);
        d.e = e;
        d.f = f;
        d2.g((tpf)new iua(d, d2, 1));
        e.g((tpf)new iua(d, e, 0));
        ((TextView)d2.a).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new ie(d, 3));
        final fpo a = d.a;
        if (a != null) {
            ((TextView)d2.a).setText(a.a);
        }
        final fpo b = d.b;
        if (b != null) {
            ((TextView)e.a).setText(b.a);
        }
        f.t(d.a != null);
        d.c(false);
        this.b.a((itw)this.d);
        final FrameLayout i = this.l;
        i.getClass();
        final ImageView imageView = (ImageView)i.findViewById(2131430437);
        final qpt bn = this.bn;
        final iwt e2 = new iwt((uyf)((epq)bn.a).a.w.a(), arjc.b(((epq)bn.a).a.fQ), arjc.b(((epq)bn.a).a.a.cN), arjc.b(((epq)bn.a).b.bD), arjc.b(((epq)bn.a).b.aR), (aazw)((epq)bn.a).b.bU.a(), (wwv)((epq)bn.a).b.af.a(), imageView);
        this.e = e2;
        final aazw f2 = this.f;
        if (f2 != null) {
            e2.i = f2;
        }
        this.b.a((itw)this.e);
        final ixu z = this.Z;
        final FrameLayout j = this.l;
        j.getClass();
        final int as = this.as;
        z.r = new lfy((View)j, as);
        ((ashe)z.k).aB((asix)new iws(z, 18));
        final aja s = z.s;
        final ImageView imageView2 = (ImageView)((tmt)z.r.b).a;
        final fjp fjp = (fjp)((atjj)s.a).a();
        fjp.getClass();
        final ashj ashj = (ashj)((atjj)s.b).a();
        ashj.getClass();
        final wwv wwv = (wwv)((atjj)s.c).a();
        wwv.getClass();
        z.o = new its(fjp, ashj, wwv, imageView2);
        final ixv a2 = z.a;
        a2.n = z.r;
        a2.d.A().al((asix)new iws(a2, 19));
        a2.e.set(0, 0, 0, ((TouchImageView)((tmt)a2.n.e).a).getResources().getDimensionPixelSize(2131168422) - ((TouchImageView)((tmt)a2.n.e).a).getResources().getDimensionPixelSize(2131166177));
        final iwx h = z.h;
        final FrameLayout frameLayout = (FrameLayout)LayoutInflater.from(h.a).inflate(2131625027, (ViewGroup)((View)j).findViewById(2131430465));
        h.g = (TextView)frameLayout.findViewById(2131430466);
        (h.f = h.b.a()).setVisibility(8);
        frameLayout.addView(h.f);
        ((ashe)h.e).aB((asix)new iws(h, 3));
        final irf e3 = z.e;
        if (HideAutoplayButtonPatch.isButtonShown()) {
            e3.k((ViewStub)((View)j).findViewById(2131427715), as);
            ((fxp)z.f).k((ViewStub)((View)j).findViewById(2131427719), as);
            ((View)j).addOnLayoutChangeListener((View$OnLayoutChangeListener)z);
        }
        final maw t = z.t;
        final FrameLayout frameLayout2 = (FrameLayout)((View)j).findViewById(2131432350);
        ((TextView)(t.c = ((View)j).findViewById(2131432349))).setText((CharSequence)"1.0x");
        ((wwv)t.b).D((wxz)new wws(wya.c(159962)));
        frameLayout2.setOnClickListener((View$OnClickListener)new iwh(t, 18, null, null));
        final Iterator iterator = z.l.iterator();
        while (iterator.hasNext()) {
            z.d((View)iterator.next());
        }
        final ahox c = qcv.C(z.q);
        if (c != null && c.L) {
            z.j.setVisibility(0);
            final Resources resources = z.j.getResources();
            final int dimensionPixelSize = resources.getDimensionPixelSize(2131166169);
            tmy.aG((View)z.j, (atjj)new ixt(dimensionPixelSize, 0), tmy.an(new tsp[] { tmy.aE(dimensionPixelSize, dimensionPixelSize), tmy.ax(resources.getDimensionPixelSize(2131166167)) }), (Class)ViewGroup$MarginLayoutParams.class);
            final lfy r2 = z.r;
            r2.getClass();
            ((LinearLayout)((tmt)r2.g).a).addView((View)z.j);
        }
        else {
            z.d((View)z.j);
        }
        z.l.clear();
        z.g.z(z.i, Optional.of((Object)wya.c(107061)));
        z.m.k((ViewStub)((View)j).findViewById(2131429983), as);
        final its o = z.o;
        o.getClass();
        o.a(o.a.j().c());
        o.a.l((fjo)o);
        o.d.setOnClickListener((View$OnClickListener)new ina(o, 14));
        final lfy r3 = z.r;
        r3.getClass();
        final TouchImageView touchImageView = (TouchImageView)((tmt)r3.e).a;
        final kti d3 = z.d;
        d3.getClass();
        touchImageView.setOnClickListener((View$OnClickListener)new iwh(d3, 7));
        final lfy r4 = z.r;
        r4.getClass();
        ((TouchImageView)((tmt)r4.h).a).setOnClickListener((View$OnClickListener)new iwh(z, 8));
        z.g.A((Runnable)tg.f);
        this.b.a((itw)this.aa);
        final iwk ab = this.ab;
        final FrameLayout m = this.l;
        m.getClass();
        ab.g = this;
        ab.A = iwk.f((View)m, 2131430439);
        ab.z = iwk.f((View)m, 2131430435);
        ab.B = iwk.f((View)m, 2131430441);
        ab.C = iwk.f((View)m, 2131430433);
        ab.D = iwk.e(((View)m).findViewById(2131430437));
        final Resources resources2 = ((View)m).getResources();
        ab.o = resources2.getDimensionPixelSize(2131168406);
        ab.p = resources2.getDimensionPixelSize(2131168407);
        ab.q = resources2.getDimensionPixelSize(2131168405);
        ab.r = resources2.getDimensionPixelSize(2131168404);
        ab.s = resources2.getDimensionPixelSize(2131168417);
        ab.t = resources2.getDimensionPixelSize(2131168416);
        ab.u = resources2.getDimensionPixelSize(2131168415);
        ab.v = resources2.getDimensionPixelSize(2131168409);
        ab.w = resources2.getDimensionPixelSize(2131168408);
        if (ab.J.cB()) {
            ab.E = iwk.f((View)m, 2131430442);
            ab.F = iwk.f((View)m, 2131430434);
            ab.G = iwk.f((View)m, 2131430440);
            ab.H = iwk.f((View)m, 2131430436);
            ab.I = iwk.f((View)m, 2131430438);
            ab.m = resources2.getDimensionPixelSize(2131168414);
            ab.n = resources2.getDimensionPixelSize(2131168421);
            ab.a();
            ab.h = (View$OnAttachStateChangeListener)new ie(ab, 4);
            this.A().addOnAttachStateChangeListener(ab.h);
        }
        final tmt z2 = ab.z;
        z2.getClass();
        ana.N(z2.a, (akv)new iwj(ab));
        final tmt z3 = ab.z;
        z3.getClass();
        z3.a.setOnClickListener((View$OnClickListener)new ina(ab, 20));
        final tmt a3 = ab.A;
        a3.getClass();
        a3.a.setOnClickListener((View$OnClickListener)new iwh(ab, 1));
        final tmt c2 = ab.C;
        c2.getClass();
        c2.a.setOnClickListener((View$OnClickListener)new iwh(ab, 0));
        final tmt b2 = ab.B;
        b2.getClass();
        b2.a.setOnClickListener((View$OnClickListener)new iwh(ab, 2));
        ab.e.b();
        ab.e.c(((ashe)ab.a.c).aB((asix)new iwi(ab)));
        ab.e.c(ab.c.A().al((asix)new ivc(ab, 15)));
        this.b.a((itw)this.C);
        final jbp al = this.aL;
        final iye af = this.aF;
        final FrameLayout l2 = this.l;
        l2.getClass();
        final ViewStub viewStub2 = (ViewStub)l2.findViewById(2131431277);
        final View k2 = this.k;
        k2.getClass();
        final jbo a4 = al.a((fpg)af, viewStub2, k2);
        a4.e = this.G;
        ((fon)this.n).d = (abgj)a4;
        final FrameLayout l3 = this.l;
        l3.getClass();
        final iup ak = new iup((View)l3);
        this.ak = ak;
        this.b.a((itw)ak);
        ((ashe)this.aN).z().aB((asix)new iyg(this, 5));
        ((ashe)this.y).z().aB((asix)new iyg(this, 6));
        asgt.e((aujo)((utk)this.aK.a()).E().a, (aujo)this.am.A(), (asit)iun.g).al((asix)new iyg(this, 7));
        this.A = (wxz)new wws(wya.c(93221));
        this.B = (wxz)new wws(wya.c(93220));
        this.w.D(this.A);
        this.w.D(this.B);
        this.aP = (wxz)new wws(wya.c(6193));
        this.aQ = (wxz)new wws(wya.c(6194));
    }
    
    public final void G() {
        if (this.H != 0) {
            final ControlsState n = this.N;
            if ((n.a == abac.b || n.b) && this.Z() && !this.au.hasMessages(1) && !this.j.i() && !this.S && !this.aJ.j) {
                final Handler au = this.au;
                final aazg p = this.P;
                long d;
                if (p.a) {
                    d = p.d;
                }
                else {
                    d = 2000L;
                }
                au.sendEmptyMessageDelayed(1, d);
            }
        }
    }
    
    public final void H(final boolean ba) {
        this.ba = ba;
    }
    
    public final void I(final boolean b) {
        this.b.e.tr((Object)b);
    }
    
    public final void J(final boolean bd) {
        this.bd = bd;
        this.b.f.tr((Object)bd);
    }
    
    public final void K() {
        if (this.bb) {
            return;
        }
        this.bb = true;
        this.b.g(true);
        final aawm t = this.t;
        if (t != null) {
            t.j(true);
        }
    }
    
    public final void L() {
        if (!this.bb) {
            return;
        }
        this.bb = false;
        this.b.g(false);
        final aawm t = this.t;
        if (t != null) {
            t.j(false);
        }
    }
    
    protected final void M(final CharSequence charSequence, final CharSequence charSequence2, final boolean b) {
        ControlsState n;
        if (b) {
            n = ControlsState.g();
        }
        else {
            n = ControlsState.h();
        }
        this.N = n;
        this.b.c(n);
        this.X();
        final iup ak = this.ak;
        if (ak != null) {
            final Context ax = this.ax;
            final SpannableStringBuilder text = new SpannableStringBuilder();
            text.append(charSequence);
            if (!TextUtils.isEmpty(charSequence2)) {
                text.append((CharSequence)"\n\n").append(charSequence2);
            }
            if (b) {
                text.append((CharSequence)"\n\n");
                if (tmy.bm(ax)) {
                    text.append((CharSequence)ax.getString(2132019932));
                }
                else {
                    text.append((CharSequence)ax.getString(2132017710));
                }
            }
            ak.a.setText((CharSequence)text);
        }
        this.J = 0L;
        this.K = 0L;
        this.L = 0L;
    }
    
    public final void N(final boolean b) {
        this.aN.tr((Object)b);
    }
    
    public final void O(final int n) {
        this.b.j.tr((Object)n);
    }
    
    public final void P(final boolean b) {
        gej.a();
        if (!this.N.i() && (this.ow(this.aX) || this.ab()) && !this.aZ) {
            if (!this.E.j()) {
                this.C();
                if (this.H == 1) {
                    return;
                }
                this.H = 1;
                this.Y(b);
                final abac a = this.N.a;
                if (a == abac.b || a == abac.c) {
                    ((fpb)this.n).p();
                }
                final aazw f = this.f;
                if (f != null) {
                    f.v();
                }
                this.G();
            }
        }
    }
    
    public final void Q() {
        this.v();
        this.C();
    }
    
    public final void R() {
        if (this.N.i()) {
            return;
        }
        if (this.H == 1) {
            return;
        }
        this.P(true);
        if (this.aY) {
            this.af(true, true);
        }
    }
    
    public final void S() {
        this.T(true);
    }
    
    public final void T(final boolean b) {
        if (this.H == 0) {
            return;
        }
        this.H = 2;
        int n;
        if (b) {
            n = this.as;
        }
        else {
            n = this.at;
        }
        final ixv aa = this.aa;
        final lfy n2 = aa.n;
        n2.getClass();
        ixv.d((tmt)n2.i, n);
        ixv.d((tmt)aa.n.e, n);
        ixv.d((tmt)aa.n.b, n);
        ixv.d((tmt)aa.n.f, n);
        ixv.d((tmt)aa.n.h, n);
        ixv.d((tmt)aa.n.c, n);
        ixv.d((tmt)aa.n.d, n);
        ixv.c((fyb)aa.a, n);
        ixv.c((fyb)aa.b, n);
        ixv.c((fyb)aa.c, n);
        final iwt e = this.e;
        if (e != null) {
            e.l.c = n;
        }
        final iwk ab = this.ab;
        iwk.g(ab.A, n);
        iwk.g(ab.z, n);
        iwk.g(ab.B, n);
        iwk.g(ab.C, n);
        iwk.g(ab.D, n);
        final itr ag = this.ag;
        final tmt o = ag.o;
        if (o != null) {
            ag.l = n;
            final long n3 = n;
            o.c = n3;
            final SuggestedActionsMainController d = ag.d;
            final tmt p = d.p;
            if (p != null) {
                d.l = n;
                p.c = n3;
            }
        }
        final tmt d2 = this.ac.d;
        if (d2 != null) {
            d2.c = n;
        }
        ((fpb)this.n).f.A(n);
        final iuh l = this.o.l;
        if (l != null) {
            final long c = n;
            l.l.c = c;
            l.m.c = c;
            l.n.c = c;
            l.o.c = c;
            l.p.c = c;
        }
        final Animation av = this.av;
        if (av != null) {
            av.setDuration((long)n);
        }
        final ixh ao = this.ao;
        if (ao != null) {
            ao.b = n;
        }
        final long c2 = n;
        this.d.c = c2;
        this.ag(true, n);
        this.af(false, true);
        this.au.removeMessages(2);
        this.au.sendEmptyMessageDelayed(2, c2);
    }
    
    public final void U() {
        if (this.j.i()) {
            return;
        }
        if (this.H != 1) {
            if (!this.O.o) {
                this.R();
                final wxz b = this.B;
                if (b != null) {
                    this.E(b);
                }
                if (this.bg.n()) {
                    final wxz ap = this.aP;
                    if (ap != null && this.aQ != null) {
                        this.w.l(ap);
                        this.w.l(this.aQ);
                    }
                }
            }
        }
        else if (this.Z()) {
            this.C();
            this.S();
            final wxz a = this.A;
            if (a != null) {
                this.E(a);
            }
            if (this.bg.n()) {
                final wxz ap2 = this.aP;
                if (ap2 != null && this.aQ != null) {
                    this.w.o(ap2, (alff)null);
                    this.w.o(this.aQ, (alff)null);
                }
            }
        }
    }
    
    public final void V(final boolean b) {
        final iyr n = this.n;
        final boolean i = this.I;
        boolean h;
        final boolean b2 = h = false;
        Label_0042: {
            if (!i) {
                if (!this.aV) {
                    h = b2;
                    if (!this.aW) {
                        break Label_0042;
                    }
                }
                h = true;
            }
        }
        if (((fpb)n).h != h) {
            ((fpb)n).h = h;
            ((fpb)n).p();
        }
        if (!this.al()) {
            this.Y(b);
            this.G();
        }
    }
    
    public final void W(final Rect t) {
        this.T = t;
        if (this.am.F()) {
            return;
        }
        final View k = this.k;
        k.getClass();
        k.setPadding(t.left, t.top, t.right, t.bottom);
        this.g.j(t);
        this.j.d(t);
    }
    
    public final void X() {
        this.Y(false);
    }
    
    public final void Y(final boolean b) {
        final boolean i = this.I;
        final boolean b2 = true;
        if ((!i || !this.ab()) && (!this.O.o || !this.Z()) && this.H != 0 && !this.N.i() && this.ow(this.aX)) {
            final int as = this.as;
            this.b.a.tr((Object)Pair.create((Object)true, (Object)b));
            if (b) {
                this.b.d(itz.d);
                this.ah((asir)new jbd(this, 1), as);
            }
            else {
                this.b.d(itz.b);
            }
            this.af(true, false);
            this.aj(true);
            this.H = 1;
            return;
        }
        this.ag(b, this.as);
        this.af(false, false);
        final ViewGroup h = this.ah.h;
        boolean b3 = false;
        Label_0245: {
            if (h != null && h.getChildCount() > 0) {
                b3 = b2;
            }
            else {
                b3 = b2;
                if (!this.ac.b()) {
                    if (this.O.v) {
                        b3 = b2;
                        if (this.N.j()) {
                            break Label_0245;
                        }
                    }
                    b3 = (this.N.i() && b2);
                }
            }
        }
        this.aj(b3);
        this.H = 0;
    }
    
    public final boolean Z() {
        if (gkt.G(this.V)) {
            final aazg p = this.P;
            if (p.a) {
                if (!p.c) {
                    return false;
                }
            }
        }
        else if (this.aV) {
            return false;
        }
        if (!this.aW) {
            return true;
        }
        return false;
    }
    
    public final ViewGroup$LayoutParams a() {
        return (ViewGroup$LayoutParams)new absc(-1, -1, false);
    }
    
    public final boolean aa(final boolean b) {
        if (b) {
            this.ad();
        }
        return !this.bc;
    }
    
    public final boolean ab() {
        boolean b;
        if (gkt.G(this.V)) {
            b = this.P.a;
        }
        else {
            b = this.aV;
        }
        return this.aW || b;
    }
    
    public final void b(final MotionEvent motionEvent) {
        if (!this.aZ) {
            if (!this.aH.m) {
                if (this.N.a == abac.d) {
                    final aazw f = this.f;
                    if (f != null) {
                        f.o();
                        return;
                    }
                }
                if (this.c.d && this.ak(motionEvent)) {
                    final abfc c = this.c;
                    final FrameLayout l = this.l;
                    l.getClass();
                    c.a(motionEvent, (View)l, false);
                    return;
                }
                if (!this.Z()) {
                    this.ap.k();
                }
                this.U();
                final Object a = this.bl.a;
                if (a != null) {
                    final DefaultWatchPanelViewController defaultWatchPanelViewController = (DefaultWatchPanelViewController)a;
                    final kxm g = defaultWatchPanelViewController.g;
                    if (g != null) {
                        g.h(0, true);
                        final ldp r = defaultWatchPanelViewController.r;
                        if (r != null) {
                            final ValueAnimator f2 = r.f;
                            if (f2 != null) {
                                f2.cancel();
                                r.f = null;
                            }
                            r.e = 0;
                            r.b.setTranslationY(0.0f);
                        }
                    }
                }
            }
        }
    }
    
    public final boolean c(final MotionEvent motionEvent, final boolean b) {
        if (this.c.d) {
            return false;
        }
        alvl alvl;
        if ((alvl = this.V.b().e) == null) {
            alvl = alvl.a;
        }
        final boolean aj = alvl.aJ;
        final int n = (int)motionEvent.getX();
        final FrameLayout l = this.l;
        l.getClass();
        return aeef.b(n, l.getWidth(), b && aj) != 0;
    }
    
    public final void d() {
        this.J = 0L;
        this.K = 0L;
        this.L = 0L;
        this.M = 0L;
        ((fon)this.n).f();
    }
    
    public final void f(final ControlsState n) {
        final fpo s = this.s;
        s.getClass();
        final ControlsState n2 = this.N;
        int n4;
        final int n3 = n4 = 0;
        if (n2 != null) {
            n4 = n3;
            if (n != null) {
                n4 = n3;
                if (n.a == n2.a) {
                    n4 = 1;
                }
            }
        }
        if (n != null) {
            if (n4 == 0) {
                if (n.a == abac.b) {
                    this.d.a(s);
                }
            }
        }
        final ControlsState n5 = this.N;
        this.N = n;
        final boolean k = this.bg.k();
        gej.c();
        this.b.c(n);
        this.X();
        if (n.a == abac.a) {
            this.al();
            ((fon)this.n).pt();
            if (k) {
                this.oF();
                ((fon)this.n).f();
            }
        }
        if (n.a == abac.f) {
            ((fon)this.n).d();
        }
        if ((n.a.equals((Object)abac.f) && !this.aA.l(abmp.c) && !this.bd) || (n.a.equals((Object)abac.c) && !k && !n5.a.equals((Object)this.N.a))) {
            this.v();
        }
        if (n.a != abac.b && !n.b) {
            this.C();
        }
        this.G();
    }
    
    public final void h(final float n) {
        this.ae(n);
    }
    
    public final void i(final float n) {
        this.ae(n);
    }
    
    public final void j(final fkk ax) {
        if (this.aX == ax) {
            return;
        }
        this.aX = ax;
        if (this.ow(ax)) {
            this.ad();
        }
        this.Q = ax.c();
        this.b.f(ax);
        this.ae.b();
        if (ax == fkk.a) {
            final iuh l = this.o.l;
            if (l != null) {
                l.f = false;
            }
            this.D();
        }
    }
    
    public final void k(final ControlsOverlayStyle o) {
        if (aeda.v((Object)this.O, (Object)o)) {
            return;
        }
        this.O = o;
        this.b.i(o);
        this.X();
        this.G();
    }
    
    public final void l(final boolean b) {
        if (this.aW == b) {
            return;
        }
        this.aW = b;
        final ive ai = this.ai;
        ai.c = b;
        ((itu)ai).f();
        this.ai();
    }
    
    public final void mM(final aum aum) {
        final itr ag = this.ag;
        if (ag != null) {
            ag.k.b();
        }
    }
    
    public final void ml(final aazq al) {
        this.al = al;
    }
    
    public final boolean mn() {
        return this.bc;
    }
    
    public final String mr() {
        return "player_overlay_playback_controls";
    }
    
    public final void n(final long l, final long k, final long j, final long m) {
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        final grx g = this.G;
        if (g.a) {
            ((fon)this.n).j(l, g.c, g.d, m);
        }
        else {
            ((fon)this.n).j(l, k, j, m);
        }
        final jai e = this.E;
        if (e.f) {
            e.f(l);
        }
    }
    
    public final void oE() {
        if (this.Z()) {
            this.D();
        }
    }
    
    public final void oF() {
        this.d();
        this.k(ControlsOverlayStyle.a);
        this.N(false);
    }
    
    public final void oG(final String s, final boolean b) {
        this.M(s, null, b);
    }
    
    public final void oH(final boolean b) {
        this.ad.a.tr((Object)b);
        if (this.N.a == abac.b && this.H != 0 && this.Z()) {
            this.C();
            this.S();
        }
    }
    
    public final void oS(final aum aum) {
        final asib ag = this.aG;
        asic asic;
        if (((uyi)this.ay.cd().h).bx()) {
            asic = this.ay.R().am((asix)new iyf(this), (asix)iwn.i);
        }
        else {
            asic = this.ay.Q().R().P(this.az).am((asix)new iyf(this), (asix)iwn.i);
        }
        ag.c(asic);
        if (gkt.G(this.V)) {
            this.aG.c(this.ae.a().P(this.az).am((asix)new iyg(this, 13), (asix)iwn.i));
        }
        final asib ag2 = this.aG;
        final Object a = this.bj.a;
        final itx b = this.b;
        b.getClass();
        ag2.c(((asgt)a).al((asix)new iyg(b, 14)));
        this.aG.c(((asgt)this.ay.q().d).R().P(this.az).am((asix)new iyg(this, 15), (asix)iwn.i));
        this.aG.c(((asgt)this.ay.q().h).R().P(this.az).am((asix)new iws(this, 20), (asix)iwn.i));
        this.aG.c(this.ay.E().P(this.az).am((asix)new iyg(this, 9), (asix)iwn.i));
        this.aG.c(this.E.b().al((asix)new iyg(this, 10)));
        this.aG.c(this.aU.al((asix)new iyg(this, 11)));
        this.aG.c(((utk)this.aK.a()).g().l.B((asjd)iuc.e).al((asix)new iyg(this, 12)));
    }
    
    public final void oW(final aum aum) {
        this.aG.b();
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        final boolean b = n != 0 && (!keyEvent.isSystem() || aaiy.i(n));
        if (b) {
            this.v();
        }
        final aazw f = this.f;
        if (f != null && this.N.a == abac.d && b && n != 20 && n != 21 && n != 22 && n != 19) {
            f.o();
            return true;
        }
        if (this.bc) {
            final FrameLayout l = this.l;
            l.getClass();
            if (l.onKeyDown(n, keyEvent)) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        if (this.bc) {
            final FrameLayout l = this.l;
            l.getClass();
            if (l.onKeyUp(n, keyEvent)) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean ow(final fkk fkk) {
        return ezp.d(fkk) && !fkk.n();
    }
    
    public final void pd(final boolean az) {
        if (this.aZ == az) {
            return;
        }
        this.aZ = az;
        if (az) {
            this.D();
        }
        else if (this.ba || this.ab()) {
            this.v();
        }
        this.b.b.tr((Object)az);
    }
    
    public final void pe(final MotionEvent motionEvent, final boolean b) {
        if (this.ak(motionEvent)) {
            final abfc c = this.c;
            final FrameLayout l = this.l;
            l.getClass();
            c.a(motionEvent, (View)l, b);
        }
    }
    
    public final void pf(final int n, final boolean b) {
        if (this.aa(this.j.i())) {
            return;
        }
        this.b.c.tr((Object)this.j.i());
        if (this.j.i()) {
            if (this.j.a().getParent() == null) {
                final FrameLayout l = this.l;
                l.getClass();
                l.addView(this.j.a());
                this.g.bringToFront();
            }
        }
        else if (!b && this.be != this.j.i()) {
            this.G();
        }
        this.be = this.j.i();
    }
    
    public final void pg(final float n) {
        this.ae(n);
    }
    
    public final void ph(final ScaleGestureDetector scaleGestureDetector) {
        this.C();
        this.S();
        final aawm t = this.t;
        if (t != null) {
            t.k(true);
        }
        final FrameLayout l = this.l;
        l.getClass();
        l.getParent().requestDisallowInterceptTouchEvent(true);
    }
    
    public final void pi(final boolean b) {
        final aawm t = this.t;
        if (t != null) {
            t.k(false);
        }
    }
    
    public final void pj(final aazw aazw) {
        this.f = aazw;
        final iwt e = this.e;
        if (e != null) {
            e.i = aazw;
        }
    }
    
    public final void pk(final boolean p) {
        final iyr n = this.n;
        final abby b = ((fon)n).b;
        if (b.p == p) {
            return;
        }
        if (!(b.p = p)) {
            ((fon)n).pt();
        }
        ((fon)n).a.mg((abcb)((fon)n).b);
    }
    
    public final void pl(final long n, final long d, long n2, long n3, final long n4) {
        this.J = n3;
        this.K = n2;
        this.L = n;
        this.M = n4;
        final grx g = this.G;
        if (g.a) {
            ((fon)this.n).j(n, g.c, g.d, n4);
        }
        else {
            final iyr n5 = this.n;
            final abby b = ((fon)n5).b;
            if (b.c != n || b.e != n2 || b.a != n3 || b.b != n4) {
                Label_0218: {
                    if (b.q()) {
                        if (d < 0L) {
                            break Label_0218;
                        }
                        final long max = Math.max(0L, b.v - (d - (n - n2)));
                        n3 -= Math.max(0L, n3 - n + d - b.w);
                        n2 += max;
                    }
                    b.c = n;
                    b.d = d;
                    b.e = n2;
                    b.b = n4;
                    b.a = n3;
                }
                ((fon)n5).a.mg((abcb)((fon)n5).b);
                ((fon)n5).pp();
                ((fon)n5).pr();
            }
            n5.j.j(n);
        }
        final jai e = this.E;
        if (e.f) {
            e.f(n);
        }
    }
    
    public final int q() {
        return this.ax.getResources().getDimensionPixelSize(2131166170);
    }
    
    public final void r(final boolean b) {
    }
    
    public final void rb(final boolean av) {
        if (this.aV == av) {
            return;
        }
        this.aV = av;
        this.b.d.tr((Object)av);
        this.ai();
    }
    
    public final void rf() {
        tmy.x(this.ax, 2132018804, 0);
    }
    
    public final void s(final CharSequence charSequence) {
        this.z.tr((Object)charSequence);
    }
    
    public final void u(final Map x) {
        final iyr n = this.n;
        final fkk l = n.l;
        if (l != null && l.g()) {
            if (!l.e()) {
                final abby b = ((fon)n).b;
                b.x = x;
                ((fon)n).a.mg((abcb)b);
            }
        }
    }
    
    public final void v() {
        this.P(false);
    }
    
    public final void x() {
        if (this.aV) {
            return;
        }
        this.D();
    }
    
    public final void y(final ancs ancs, final boolean b) {
        ajsq ajsq;
        if ((ajsq = ancs.c) == null) {
            ajsq = ajsq.a;
        }
        final Spanned c = abyh.c(ajsq, this.af);
        ajsq ajsq2;
        if ((ajsq2 = ancs.d) == null) {
            ajsq2 = ajsq.a;
        }
        this.M((CharSequence)c, (CharSequence)abyh.c(ajsq2, this.af), b);
    }
    
    public final void z(final ScaleGestureDetector scaleGestureDetector) {
    }
}
