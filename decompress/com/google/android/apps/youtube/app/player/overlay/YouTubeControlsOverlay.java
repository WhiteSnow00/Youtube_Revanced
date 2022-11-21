// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

import android.text.Spanned;
import java.util.Map;
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
import android.view.ScaleGestureDetector;
import android.view.MotionEvent;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import android.util.Pair;
import android.view.animation.AnimationUtils;
import app.revanced.integrations.sponsorblock.ShieldButton;
import app.revanced.integrations.sponsorblock.VotingButton;
import app.revanced.integrations.videoplayer.Download;
import app.revanced.integrations.videoplayer.AutoRepeat;
import app.revanced.integrations.videoplayer.Copy;
import app.revanced.integrations.videoplayer.CopyWithTimeStamp;
import java.util.Iterator;
import android.view.View$OnClickListener;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
import android.view.View$OnTouchListener;
import app.revanced.integrations.patches.PlayerOverlayBackgroundPatch;
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

public class YouTubeControlsOverlay implements abcy, tio, foh, abcs, fqm, ttf, ttb, aaqg, aaqf, abiy, abdq, ivb, abii, jen, jet, jcb
{
    public static final Rect a;
    public xbe A;
    public xbe B;
    public final ixl C;
    public final ixb D;
    public final jbq E;
    public final jeu F;
    public gsm G;
    public int H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public long M;
    public ControlsState N;
    public ControlsOverlayStyle O;
    public abci P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public Rect T;
    public boolean U;
    public final vbo V;
    public final arzb W;
    final oqz X;
    private final izb Z;
    private final abqq aA;
    private final ttd aB;
    private final jel aC;
    private final jeo aD;
    private final jek aE;
    private final izl aF;
    private final aslm aG;
    private final ivq aH;
    private final ivt aI;
    private final iyq aJ;
    private final arna aK;
    private final jcx aL;
    private final jch aM;
    private final atmj aN;
    private final boolean aO;
    private xbe aP;
    private xbe aQ;
    private final Set aR;
    private final jbn aS;
    private final jbk aT;
    private final aske aU;
    private boolean aV;
    private boolean aW;
    private fku aX;
    private boolean aY;
    private boolean aZ;
    private final izc aa;
    private final ixs ab;
    private final iwf ac;
    private final iwa ad;
    private final abcl ae;
    private final acbp af;
    private final iuz ag;
    private final SuggestedActionsMainController ah;
    private final iwm ai;
    private final lck aj;
    private ivx ak;
    private abcr al;
    private final uxg am;
    private final iyk an;
    private final iyo ao;
    private final jdx ap;
    private FrameLayout aq;
    private final izq ar;
    private final int as;
    private final int at;
    private final Handler au;
    private Animation av;
    private Animation aw;
    private final Context ax;
    private final abqz ay;
    private final askz az;
    public final ivf b;
    private boolean ba;
    private boolean bb;
    private boolean bc;
    private boolean bd;
    private boolean be;
    private asln bf;
    private final abls bg;
    private final vbs bh;
    private final vbs bi;
    private final vbs bj;
    private final ked bk;
    private final a bl;
    private final ema bm;
    private final oqz bn;
    private final oqz bo;
    public final abid c;
    public final ivj d;
    public iya e;
    public abcx f;
    public final abiv g;
    public final abit h;
    public final iuc i;
    public final jcc j;
    public View k;
    public FrameLayout l;
    public View m;
    public final izz n;
    public final jab o;
    public TextView p;
    public String q;
    public final ixe r;
    public final fpx s;
    public aazp t;
    public final Runnable u;
    public abiw v;
    public final xab w;
    public final iyr x;
    public final atmj y;
    public final atmj z;
    
    static {
        a = new Rect();
    }
    
    public YouTubeControlsOverlay(final Context ax, final ttd ab, final iyo ao, final jdx ap, final abiv g, final abit h, final ixs ab2, final xab w, final ema bm, final abid c, final arna ak, final izb z, final jku jku, final lje lje, final SuggestedActionsMainController ah, final iuc iuc, final jel ac, final abls bg, final jeo ad, final jek ae, final izc aa, final jcc j, final uxg am, final iyk an, final abqz ay, final askz az, final vbo v, final arzb w2, final izl af, final abcl ae2, final acbp af2, final ixl c2, final ked bk, final View[] array, final lck aj, final ivj d, final ivf b, final abqq aa2, final ivq ah2, final ivt ai, final iyq aj2, final iyr x, final lna lna, final blx blx, final iwl iwl, final ixb d2, final jbq e, final jbn as, final jbk at, final arwm arwm, final vbs bh, final aske au, final jcx al, final oqz bo, final jeu f, final oqz bn, final vbs bi, final vbs bj, final jch am2, final a bl, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        this.G = gsm.a();
        this.H = 0;
        this.N = ControlsState.b();
        this.O = ControlsOverlayStyle.a;
        this.aX = fku.a;
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
        this.bm = bm;
        this.au = new Handler((Handler$Callback)new bnh(this, 3));
        this.bg = bg;
        this.aR = new HashSet();
        this.y = atmj.e();
        this.aN = atmj.e();
        this.z = atmj.e();
        this.ae = ae2;
        this.af = af2;
        this.C = c2;
        this.bk = bk;
        this.aj = aj;
        this.d = d;
        this.aG = new aslm();
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
        this.bo = bo;
        this.bn = bn;
        x.a = Optional.of((Object)c);
        final int integer = ax.getResources().getInteger(2131492903);
        this.as = integer;
        this.at = ax.getResources().getInteger(2131492904);
        this.Z = z;
        this.c = c;
        this.j = j;
        this.i = iuc;
        ((tta)(g.g = iuc)).a(afbj.f(arwm.cX()) ^ true);
        iuc.b((abiy)g);
        this.r = new ixe();
        this.s = fpx.a((CharSequence)ax.getResources().getString(2132019089));
        final abch a = abci.a();
        a.d(false);
        a.e(false);
        a.b(true);
        a.c(2000L);
        this.P = a.a();
        final qw l = new qw((atnb)new lbv(this, 1));
        if (iwl.d) {
            l.a((izd)new iwc(iwl, 2));
            iwl.l = l;
        }
        final abvi abvi = (abvi)((atnb)lje.e).a();
        abvi.getClass();
        final vbo vbo = (vbo)((atnb)lje.a).a();
        vbo.getClass();
        final xab xab = (xab)((atnb)lje.b).a();
        xab.getClass();
        final Object f2 = lje.f;
        final ght ght = (ght)((atnb)lje.d).a();
        ght.getClass();
        final vbs vbs = (vbs)((atnb)lje.c).a();
        vbs.getClass();
        final iwa ad2 = new iwa(abvi, vbo, xab, (atnb)f2, ght, vbs);
        this.ad = ad2;
        final abiv abiv = (abiv)((atnb)jku.b).a();
        abiv.getClass();
        final abvi abvi2 = (abvi)((atnb)jku.a).a();
        abvi2.getClass();
        final iwf ac2 = new iwf(abiv, abvi2, ad2, l, (byte[])null);
        b.a((ive)ac2);
        this.ac = ac2;
        final iuz iuz = new iuz((Context)((esr)((epu)bn.a).b).d.a(), (SuggestedActionsMainController)((esr)((epu)bn.a).b).bP.a(), (abiv)((esr)((epu)bn.a).b).at.a(), (arwm)((esr)((epu)bn.a).b).ac.a(), (gab)((esr)((epu)bn.a).b).aC.a(), (vbs)((epu)bn.a).a.fw.a(), l, ac2, (byte[])null, (byte[])null);
        iuz.k.c(((aske)an.j).p().V().am((asmi)new itn(iuz, 10)));
        iuz.c.c = (iwd)iuz;
        iuz.e.b.a((abiw)iuz);
        iuz.q.a((izd)new iwc(iuz, 1));
        final SuggestedActionsMainController d3 = iuz.d;
        final esa m = new esa(iuz, 16);
        final int i = iuz.l;
        final atls f3 = iuz.f;
        d3.m = (atnb)m;
        d3.o = (aske)f3;
        d3.l = i;
        d3.p = null;
        d3.h = null;
        iuz.k.c(((askp)d3.e).aH((asmi)new itn(iuz, 11)));
        b.a((ive)iuz);
        ((askp)ah.e).aH((asmi)new izo(this, 2));
        ah.f.j = this.X;
        this.ag = iuz;
        final iwm ai2 = new iwm(g, w, aa, l, new oqz(this, (char[])null), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        b.a((ive)ai2);
        this.ai = ai2;
        final oqz x2 = new oqz(this);
        this.X = x2;
        final oqz oqz = new oqz(this);
        final long n = integer;
        final xab xab2 = (xab)((atnb)blx.a).a();
        xab2.getClass();
        final veh veh = (veh)((atnb)blx.c).a();
        veh.getClass();
        final abbo abbo = (abbo)((atnb)blx.b).a();
        abbo.getClass();
        final aske aske = (aske)((atnb)blx.e).a();
        aske.getClass();
        final mtf mtf = (mtf)((atnb)blx.d).a();
        mtf.getClass();
        final jab o = new jab(xab2, veh, abbo, aske, mtf, l, oqz, n, x2, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.o = o;
        final Context context = (Context)((atnb)lna.c).a();
        context.getClass();
        final abbx abbx = (abbx)((atnb)lna.h).a();
        abbx.getClass();
        final abiv abiv2 = (abiv)((atnb)lna.e).a();
        abiv2.getClass();
        final fpq fpq = (fpq)((atnb)lna.b).a();
        fpq.getClass();
        final fpo fpo = (fpo)((atnb)lna.d).a();
        fpo.getClass();
        final abcf abcf = (abcf)((atnb)lna.g).a();
        abcf.getClass();
        final aske aske2 = (aske)((atnb)lna.f).a();
        aske2.getClass();
        final jbq jbq = (jbq)((atnb)lna.a).a();
        jbq.getClass();
        final izz n2 = new izz(context, abbx, abiv2, fpq, fpo, abcf, aske2, jbq, (fqb)o, integer);
        this.n = n2;
        af.e = afhk.s(new izr(this, 0));
        ((fov)n2).g((abfc)(this.ar = new izq(this)));
        b.a((ive)n2);
        this.u = (Runnable)new ipi(this, 17);
        final long k = integer;
        if (an.d) {
            l.a((izd)new iwc(an, 4));
            an.i = k;
            an.b.a((fjt)an);
        }
        b.a((ive)an);
        b.c(this.N);
        b.i(this.O);
        b.f(this.aX);
        for (int length = array.length, n3 = 0; n3 < length; ++n3) {
            z.d(array[n3]);
        }
        this.aO = bh.cJ();
        this.U = bh.f(45378635L);
        this.aU = au;
        this.T = new Rect();
        this.F = f;
        this.bi = bi;
        this.bj = bj;
        this.aM = am2;
        this.bl = bl;
    }
    
    private static void ac(final ttd ttd, final tte... array) {
        for (int i = 0; i < 5; ++i) {
            ttd.a(array[i]);
        }
    }
    
    private final void ad() {
        if (this.l != null) {
            return;
        }
        final FrameLayout aq = (FrameLayout)LayoutInflater.from(this.ax).inflate(2131625438, (ViewGroup)null);
        this.aq = aq;
        this.l = (FrameLayout)aq.findViewById(2131432509);
        if (fao.bl(this.W)) {
            final FrameLayout l = this.l;
            l.getClass();
            l.addOnLayoutChangeListener((View$OnLayoutChangeListener)new fto(this, 19));
        }
        this.l.setClipToPadding(false);
        this.l.setFocusableInTouchMode(true);
        final FrameLayout i = this.l;
        i.getClass();
        final abij h = new abij((View)this.l, (ViewStub)i.findViewById(2131430766), (abii)this, this.c.b);
        final abid c = this.c;
        (c.h = h).d((View$OnAttachStateChangeListener)new if(c, 12));
        ajpe ajpe;
        if ((ajpe = this.W.f().v) == null) {
            ajpe = ajpe.a;
        }
        h.c(ajpe.f);
        final FrameLayout j = this.l;
        j.getClass();
        this.aC.q(new jes(this.ax, (ViewStub)j.findViewById(2131432356), this.bi, this.bj), this.aD, this.aE);
        this.aD.b((jen)this);
        this.l.setTag(2131430458, (Object)this);
        final iyq aj = this.aJ;
        final FrameLayout k = this.l;
        if (!aj.g.isPresent()) {
            aj.g = Optional.of((Object)new tqa(((ViewStub)((View)k).findViewById(2131428781)).inflate()));
            ((tqa)aj.g.get()).c = ((View)k).getResources().getInteger(2131492903);
            ((tqa)aj.g.get()).g(aj.f);
            if (!aj.e) {
                aj.d.D((xbe)new wzy(xbf.c(119372)));
            }
        }
        final ivq ah = this.aH;
        final FrameLayout m = this.l;
        if (!ah.j.h()) {
            final View viewById = ((View)m).findViewById(2131428780);
            if (viewById == null) {
                ah.j = afbh.k(new tqa(((ViewStub)((View)m).findViewById(2131428781)).inflate()));
            }
            else {
                ah.j = afbh.k(new tqa(viewById));
            }
            ((tqa)ah.j.c()).c = ((View)m).getResources().getInteger(2131492903);
            ((tqa)ah.j.c()).g((tsl)new iwb(ah, 1));
            ah.g.D((xbe)new wzy(xbf.c(119372)));
            ah.g.l((xbe)new wzy(xbf.c(124587)));
        }
        ac(this.aB, (tte)this.aD, (tte)this.aE, (tte)this.i, (tte)this.aj, (tte)this.aM);
        this.aB.b((tte)this.aI);
        this.l.getClass();
        final ttc ttc = new ttc(ViewConfiguration.get(this.ax));
        ((ttg)ttc).c = (ttf)this;
        ttc.b = (ttb)this;
        final ImageView imageView = (ImageView)this.l.findViewById(2131431267);
        if (PlayerOverlayBackgroundPatch.getPlayerOverlaybackground()) {
            imageView.setImageResource(2131100891);
        }
        if (this.bl.m()) {
            final jce onTouchListener = new jce();
            for (int n = 0; n <= 0; ++n) {
                onTouchListener.a.add((new tte[] { (tte)ttc })[n]);
            }
            final Optional of = Optional.of((Object)imageView);
            if (onTouchListener.b.isPresent()) {
                ((View)onTouchListener.b.get()).setOnTouchListener((View$OnTouchListener)null);
            }
            final Iterator iterator = onTouchListener.a.iterator();
            while (iterator.hasNext()) {
                ((tte)iterator.next()).c();
            }
            onTouchListener.b = of;
            if (onTouchListener.b.isPresent()) {
                ((View)onTouchListener.b.get()).setOnTouchListener((View$OnTouchListener)onTouchListener);
            }
        }
        else {
            final ttd ttd = new ttd();
            ac(ttd, (tte)this.aI, (tte)ttc, (tte)this.aD, (tte)this.i, (tte)this.aj);
            ttd.c((View)imageView);
        }
        final iyo ao = this.ao;
        ((View)imageView).getClass();
        final tqa f = new tqa((View)imageView, (tsk)new trk());
        ao.f = f;
        ao.d = f.d;
        ao.f.a(false);
        this.b.a((ive)this.ao);
        final FrameLayout l2 = this.l;
        l2.getClass();
        this.aF.m((ViewStub)l2.findViewById(2131432460), (Predicate)igp.l);
        this.l.bringChildToFront((View)this.g);
        if (this.E.f) {
            final FrameLayout l3 = this.l;
            l3.getClass();
            final ViewStub l4 = (ViewStub)l3.findViewById(2131429026);
            final jbn as = this.aS;
            if (as.e.f) {
                if (l4 != null) {
                    as.l = l4;
                    as.u.w((Callable)new ikv(as, 15));
                    if (!as.k) {
                        as.b();
                    }
                }
            }
            final jbk at = this.aT;
            final FrameLayout l5 = this.l;
            if (at.b.f) {
                if (at.f == null && l5 != null) {
                    final View viewById2 = ((View)l5).findViewById(2131429021);
                    if (viewById2 == null) {
                        at.f = new tqa(((ViewStub)((View)l5).findViewById(2131429022)).inflate());
                    }
                    else {
                        at.f = new tqa(viewById2);
                    }
                    at.f.c = ((View)l5).getResources().getInteger(2131492903);
                    at.f.g((tsl)new iwb(at, 4));
                    at.g.w((Callable)new ikv(at, 14));
                    at.f.a.setOnClickListener((View$OnClickListener)new jaw(at, 10));
                    at.e.a((jet)at);
                }
            }
        }
        this.b.a((ive)new ixf((View)this.l, this.V));
        this.l.getClass();
        final Iterator iterator2 = this.aR.iterator();
        while (iterator2.hasNext()) {
            this.l.addView((View)iterator2.next());
        }
        this.aR.clear();
        this.g.bringToFront();
        this.ap.j().am((asmi)new izo(this, 6));
        this.bc = true;
        final abcr al = this.al;
        if (al != null) {
            al.d((abcs)this, (View)this.l);
        }
    }
    
    private final void ae(final float n) {
        if (n < 0.0f && this.g.b.g() && this.H != 1 && !this.O.o) {
            this.S();
        }
    }
    
    private final void af(final boolean b, final boolean b2) {
        CopyWithTimeStamp.changeVisibility(b);
        Copy.changeVisibility(b);
        AutoRepeat.changeVisibility(b);
        Download.changeVisibility(b);
        VotingButton.changeVisibility(b);
        ShieldButton.changeVisibility(b);
        if (this.g.getParent() == null) {
            return;
        }
        if (!this.R && !b && this.g.b.d()) {
            this.g.e(0);
        }
        if (!b2) {
            tqf.v((View)this.g, b);
            return;
        }
        if (b) {
            if (this.aw == null) {
                (this.aw = AnimationUtils.loadAnimation(this.ax, 2130772037)).setDuration((long)this.as);
            }
            final abiv g = this.g;
            final Animation aw = this.aw;
            aw.getClass();
            g.startAnimation(aw);
            return;
        }
        if (this.g.getVisibility() == 0) {
            if (this.av == null) {
                (this.av = AnimationUtils.loadAnimation(this.ax, 2130772040)).setDuration((long)this.as);
            }
            final abiv g2 = this.g;
            final Animation av = this.av;
            av.getClass();
            g2.startAnimation(av);
        }
    }
    
    private final void ag(final boolean b, final int n) {
        this.b.a.tt((Object)Pair.create((Object)false, (Object)b));
        if (b) {
            this.b.d(ivh.c);
            this.ah((asmc)new esd(this, 20), n);
            return;
        }
        this.b.d(ivh.a);
    }
    
    private final void ah(final asmc asmc, final int n) {
        final asln bf = this.bf;
        if (bf != null) {
            asmr.b((AtomicReference)bf);
        }
        this.bf = asjy.f().l(n, TimeUnit.MILLISECONDS).C(this.az).V(asmc);
    }
    
    private final void ai() {
        this.W(false);
    }
    
    private final void aj(final boolean b) {
        if (b) {
            this.G();
        }
        final View k = this.k;
        if (k == null) {
            return;
        }
        tqf.v(k, b);
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
                if (this.N.a == abde.f) {
                    return false;
                }
                final int n = (int)motionEvent.getX();
                final FrameLayout l = this.l;
                l.getClass();
                if (aehz.b(n, l.getWidth(), false) == 2 && this.L <= this.K) {
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
        if (!this.am()) {
            return false;
        }
        if (this.H != 1) {
            this.S();
        }
        else {
            this.D();
        }
        return true;
    }
    
    private final boolean am() {
        boolean b;
        if (fao.aG(this.V)) {
            b = this.P.a;
        }
        else {
            b = this.aV;
        }
        return this.aW || b;
    }
    
    public final void A(final ScaleGestureDetector scaleGestureDetector) {
    }
    
    public final ViewGroup B() {
        this.ad();
        final FrameLayout aq = this.aq;
        aq.getClass();
        return (ViewGroup)aq;
    }
    
    public final void C(final View view) {
        this.ag.a(view);
    }
    
    public final void D() {
        this.au.removeMessages(1);
        this.au.removeMessages(2);
        this.g.clearAnimation();
    }
    
    public final void E() {
        this.D();
        if (this.H == 0) {
            return;
        }
        this.H = 0;
        this.Y();
        final abcx f = this.f;
        if (f != null) {
            f.d();
        }
    }
    
    final void F(final xbe xbe) {
        if (!this.aO) {
            return;
        }
        this.w.J(3, xbe, (alji)null);
    }
    
    public final void G() {
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
        final ixe r = this.r;
        final TextView textView = (TextView)inflate.findViewById(2131430449);
        textView.getClass();
        ((askp)r.a).aH((asmi)new iwh(textView, 13));
        ((askp)r.b).aH((asmi)new iwh(textView, 14));
        ((askp)r.c).aH((asmi)new iwh(textView, 15));
        ViewStub viewStub;
        if (this.bh.cH()) {
            viewStub = (ViewStub)this.k.findViewById(2131432508);
        }
        else {
            viewStub = (ViewStub)this.k.findViewById(2131432507);
        }
        viewStub.inflate();
        final View k = this.k;
        k.getClass();
        final ivj d = this.d;
        final TextView textView2 = (TextView)k.findViewById(2131431951);
        final TextView textView3 = (TextView)this.k.findViewById(2131430293);
        final oqz f = new oqz(this, (byte[])null);
        final uyl uyl = new uyl((Interpolator)apd.c(0.05f, 0.0f, 0.0f, 1.0f), 1);
        final tqa d2 = new tqa((View)textView2, 500L, (tsk)uyl, 8);
        d.d = d2;
        final tqa e = new tqa((View)textView3, 500L, (tsk)uyl, 8);
        d.e = e;
        d.f = f;
        d2.g((tsl)new ivi(d, d2, 1));
        e.g((tsl)new ivi(d, e, 0));
        ((TextView)d2.a).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new if(d, 3));
        final fpx a = d.a;
        if (a != null) {
            ((TextView)d2.a).setText(a.a);
        }
        final fpx b = d.b;
        if (b != null) {
            ((TextView)e.a).setText(b.a);
        }
        f.s(d.a != null);
        d.c(false);
        this.b.a((ive)this.d);
        final FrameLayout i = this.l;
        i.getClass();
        final ImageView imageView = (ImageView)i.findViewById(2131430438);
        final oqz bo = this.bo;
        final iya e2 = new iya((vbo)((epu)bo.a).a.w.a(), arol.b(((epu)bo.a).a.fw), arol.b(((epu)bo.a).a.a.cP), arol.b(((esr)((epu)bo.a).b).bM), arol.b(((esr)((epu)bo.a).b).aT), (abcx)((esr)((epu)bo.a).b).cd.a(), (xab)((esr)((epu)bo.a).b).ag.a(), imageView);
        this.e = e2;
        final abcx f2 = this.f;
        if (f2 != null) {
            e2.i = f2;
        }
        this.b.a((ive)this.e);
        final izb z = this.Z;
        final FrameLayout j = this.l;
        j.getClass();
        final int as = this.as;
        z.r = new lhh((View)j, as);
        ((askp)z.k).aH((asmi)new ixu(z, 20));
        final ajc s = z.s;
        final ImageView imageView2 = (ImageView)((tqa)z.r.b).a;
        final fjy fjy = (fjy)((atnb)s.a).a();
        fjy.getClass();
        final asku asku = (asku)((atnb)s.c).a();
        asku.getClass();
        final xab xab = (xab)((atnb)s.b).a();
        xab.getClass();
        z.o = new iva(fjy, asku, xab, imageView2);
        final izc a2 = z.a;
        a2.n = z.r;
        a2.d.B().am((asmi)new izo(a2, 1));
        a2.e.set(0, 0, 0, ((TouchImageView)((tqa)a2.n.e).a).getResources().getDimensionPixelSize(2131168460) - ((TouchImageView)((tqa)a2.n.e).a).getResources().getDimensionPixelSize(2131166179));
        final iye h = z.h;
        final FrameLayout frameLayout = (FrameLayout)LayoutInflater.from(h.a).inflate(2131625030, (ViewGroup)((View)j).findViewById(2131430466));
        h.g = (TextView)frameLayout.findViewById(2131430467);
        (h.f = h.b.a()).setVisibility(8);
        frameLayout.addView(h.f);
        ((askp)h.e).aH((asmi)new ixu(h, 5));
        final isn e3 = z.e;
        if (HideAutoplayButtonPatch.isButtonShown()) {
            e3.k((ViewStub)((View)j).findViewById(2131427715), as);
            ((fyc)z.f).k((ViewStub)((View)j).findViewById(2131427719), as);
            ((View)j).addOnLayoutChangeListener((View$OnLayoutChangeListener)z);
        }
        final mcp t = z.t;
        final FrameLayout frameLayout2 = (FrameLayout)((View)j).findViewById(2131432354);
        ((TextView)(t.c = ((View)j).findViewById(2131432353))).setText((CharSequence)"1.0x");
        ((xab)t.b).D((xbe)new wzy(xbf.c(159962)));
        frameLayout2.setOnClickListener((View$OnClickListener)new ixp(t, 18, (byte[])null, (byte[])null));
        final Iterator iterator = z.l.iterator();
        while (iterator.hasNext()) {
            z.d((View)iterator.next());
        }
        final ahsn u = qey.u(z.q);
        if (u != null && u.K) {
            z.j.setVisibility(0);
            final Resources resources = z.j.getResources();
            final int dimensionPixelSize = resources.getDimensionPixelSize(2131166171);
            tqf.aG((View)z.j, (atnb)new iza(dimensionPixelSize, 0), tqf.an(new tvv[] { tqf.aE(dimensionPixelSize, dimensionPixelSize), tqf.ax(resources.getDimensionPixelSize(2131166169)) }), (Class)ViewGroup$MarginLayoutParams.class);
            final lhh r2 = z.r;
            r2.getClass();
            ((LinearLayout)((tqa)r2.g).a).addView((View)z.j);
        }
        else {
            z.d((View)z.j);
        }
        z.l.clear();
        z.g.A(z.i, Optional.of((Object)xbf.c(107061)));
        z.m.k((ViewStub)((View)j).findViewById(2131429983), as);
        final iva o = z.o;
        o.getClass();
        o.a(o.a.j().c());
        o.a.l((fjx)o);
        o.d.setOnClickListener((View$OnClickListener)new ioj(o, 14));
        final lhh r3 = z.r;
        r3.getClass();
        final TouchImageView touchImageView = (TouchImageView)((tqa)r3.e).a;
        final kuu d3 = z.d;
        d3.getClass();
        touchImageView.setOnClickListener((View$OnClickListener)new ixp(d3, 7));
        final lhh r4 = z.r;
        r4.getClass();
        ((TouchImageView)((tqa)r4.h).a).setOnClickListener((View$OnClickListener)new ixp(z, 8));
        z.g.B((Runnable)th.f);
        this.b.a((ive)this.aa);
        final ixs ab = this.ab;
        final FrameLayout m = this.l;
        m.getClass();
        ab.g = this;
        ab.A = ixs.f((View)m, 2131430440);
        ab.z = ixs.f((View)m, 2131430436);
        ab.B = ixs.f((View)m, 2131430442);
        ab.C = ixs.f((View)m, 2131430434);
        ab.D = ixs.e((View)((View)m).findViewById(2131430438));
        final Resources resources2 = ((View)m).getResources();
        ab.o = resources2.getDimensionPixelSize(2131168444);
        ab.p = resources2.getDimensionPixelSize(2131168445);
        ab.q = resources2.getDimensionPixelSize(2131168443);
        ab.r = resources2.getDimensionPixelSize(2131168442);
        ab.s = resources2.getDimensionPixelSize(2131168455);
        ab.t = resources2.getDimensionPixelSize(2131168454);
        ab.u = resources2.getDimensionPixelSize(2131168453);
        ab.v = resources2.getDimensionPixelSize(2131168447);
        ab.w = resources2.getDimensionPixelSize(2131168446);
        if (ab.J.cH()) {
            ab.E = ixs.f((View)m, 2131430443);
            ab.F = ixs.f((View)m, 2131430435);
            ab.G = ixs.f((View)m, 2131430441);
            ab.H = ixs.f((View)m, 2131430437);
            ab.I = ixs.f((View)m, 2131430439);
            ab.m = resources2.getDimensionPixelSize(2131168452);
            ab.n = resources2.getDimensionPixelSize(2131168459);
            ab.a();
            ab.h = (View$OnAttachStateChangeListener)new if(ab, 4);
            this.B().addOnAttachStateChangeListener(ab.h);
        }
        final tqa z2 = ab.z;
        z2.getClass();
        anc.N(z2.a, (akx)new ixr(ab));
        final tqa z3 = ab.z;
        z3.getClass();
        z3.a.setOnClickListener((View$OnClickListener)new ioj(ab, 20));
        final tqa a3 = ab.A;
        a3.getClass();
        a3.a.setOnClickListener((View$OnClickListener)new ixp(ab, 1));
        final tqa c = ab.C;
        c.getClass();
        c.a.setOnClickListener((View$OnClickListener)new ixp(ab, 0));
        final tqa b2 = ab.B;
        b2.getClass();
        b2.a.setOnClickListener((View$OnClickListener)new ixp(ab, 2));
        ab.e.b();
        ab.e.c(((askp)ab.a.c).aH((asmi)new ixq(ab)));
        ab.e.c(ab.c.B().am((asmi)new iwh(ab, 17)));
        this.b.a((ive)this.C);
        final jcx al = this.aL;
        final izl af = this.aF;
        final FrameLayout l2 = this.l;
        l2.getClass();
        final ViewStub viewStub2 = (ViewStub)l2.findViewById(2131431281);
        final View k2 = this.k;
        k2.getClass();
        final jcw a4 = al.a((fpq)af, viewStub2, k2);
        a4.e = this.G;
        ((fov)this.n).d = (abjl)a4;
        final FrameLayout l3 = this.l;
        l3.getClass();
        final ivx ak = new ivx((View)l3);
        this.ak = ak;
        this.b.a((ive)ak);
        ((askp)this.aN).A().aH((asmi)new izo(this, 7));
        ((askp)this.y).A().aH((asmi)new izo(this, 8));
        aske.e(((uwk)this.aK.a()).g().c, this.am.B(), (asme)ivv.g).am((asmi)new izo(this, 9));
        this.A = (xbe)new wzy(xbf.c(93221));
        this.B = (xbe)new wzy(xbf.c(93220));
        this.w.D(this.A);
        this.w.D(this.B);
        this.aP = (xbe)new wzy(xbf.c(6193));
        this.aQ = (xbe)new wzy(xbf.c(6194));
    }
    
    public final void H() {
        if (this.H != 0) {
            final ControlsState n = this.N;
            if ((n.a == abde.b || n.b) && this.aa() && !this.au.hasMessages(1) && !this.j.i() && !this.S && !this.aJ.j) {
                final Handler au = this.au;
                final abci p = this.P;
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
    
    public final void I(final boolean ba) {
        this.ba = ba;
    }
    
    public final void J(final boolean b) {
        this.b.e.tt((Object)b);
    }
    
    public final void K(final boolean bd) {
        this.bd = bd;
        this.b.f.tt((Object)bd);
    }
    
    public final void L() {
        if (this.bb) {
            return;
        }
        this.bb = true;
        this.b.g(true);
        final aazp t = this.t;
        if (t != null) {
            t.j(true);
        }
    }
    
    public final void M() {
        if (!this.bb) {
            return;
        }
        this.bb = false;
        this.b.g(false);
        final aazp t = this.t;
        if (t != null) {
            t.j(false);
        }
    }
    
    protected final void N(final CharSequence charSequence, final CharSequence charSequence2, final boolean b) {
        ControlsState n;
        if (b) {
            n = ControlsState.g();
        }
        else {
            n = ControlsState.h();
        }
        this.N = n;
        this.b.c(n);
        this.Y();
        final ivx ak = this.ak;
        if (ak != null) {
            final Context ax = this.ax;
            final SpannableStringBuilder text = new SpannableStringBuilder();
            text.append(charSequence);
            if (!TextUtils.isEmpty(charSequence2)) {
                text.append((CharSequence)"\n\n").append(charSequence2);
            }
            if (b) {
                text.append((CharSequence)"\n\n");
                if (tqf.bm(ax)) {
                    text.append((CharSequence)ax.getString(2132019936));
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
    
    public final void O(final boolean b) {
        this.aN.tt((Object)b);
    }
    
    public final void P(final int n) {
        this.b.j.tt((Object)n);
    }
    
    public final void Q(final boolean b) {
        if (!this.N.i() && (this.ot(this.aX) || this.am()) && !this.aZ) {
            if (!this.E.j()) {
                this.D();
                if (this.H == 1) {
                    return;
                }
                this.H = 1;
                this.Z(b);
                final abde a = this.N.a;
                if (a == abde.b || a == abde.c) {
                    ((fpj)this.n).pq();
                }
                final abcx f = this.f;
                if (f != null) {
                    f.v();
                }
                this.H();
            }
        }
    }
    
    public final void R() {
        this.v();
        this.D();
    }
    
    public final void S() {
        if (this.N.i()) {
            return;
        }
        if (this.H == 1) {
            return;
        }
        this.Q(true);
        if (this.aY) {
            this.af(true, true);
        }
    }
    
    public final void T() {
        this.U(true);
    }
    
    public final void U(final boolean b) {
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
        final izc aa = this.aa;
        final lhh n2 = aa.n;
        n2.getClass();
        izc.d((tqa)n2.i, n);
        izc.d((tqa)aa.n.e, n);
        izc.d((tqa)aa.n.b, n);
        izc.d((tqa)aa.n.f, n);
        izc.d((tqa)aa.n.h, n);
        izc.d((tqa)aa.n.c, n);
        izc.d((tqa)aa.n.d, n);
        izc.c((fyo)aa.a, n);
        izc.c((fyo)aa.b, n);
        izc.c((fyo)aa.c, n);
        final iya e = this.e;
        if (e != null) {
            e.l.c = n;
        }
        final ixs ab = this.ab;
        ixs.g(ab.A, n);
        ixs.g(ab.z, n);
        ixs.g(ab.B, n);
        ixs.g(ab.C, n);
        ixs.g(ab.D, n);
        final iuz ag = this.ag;
        final tqa o = ag.o;
        if (o != null) {
            ag.l = n;
            final long n3 = n;
            o.c = n3;
            final SuggestedActionsMainController d = ag.d;
            final tqa p = d.p;
            if (p != null) {
                d.l = n;
                p.c = n3;
            }
        }
        final tqa d2 = this.ac.d;
        if (d2 != null) {
            d2.c = n;
        }
        ((fpj)this.n).f.A(n);
        final ivo l = this.o.l;
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
        final iyo ao = this.ao;
        if (ao != null) {
            ao.b = n;
        }
        final ivj d3 = this.d;
        final long c2 = n;
        d3.c = c2;
        this.ag(true, n);
        this.af(false, true);
        this.au.removeMessages(2);
        this.au.sendEmptyMessageDelayed(2, c2);
    }
    
    public final void V() {
        if (this.j.i()) {
            return;
        }
        if (this.H != 1) {
            if (!this.O.o) {
                this.S();
                final xbe b = this.B;
                if (b != null) {
                    this.F(b);
                }
                if (this.bg.n()) {
                    final xbe ap = this.aP;
                    if (ap != null && this.aQ != null) {
                        this.w.l(ap);
                        this.w.l(this.aQ);
                    }
                }
            }
        }
        else if (this.aa()) {
            this.D();
            this.T();
            final xbe a = this.A;
            if (a != null) {
                this.F(a);
            }
            if (this.bg.n()) {
                final xbe ap2 = this.aP;
                if (ap2 != null && this.aQ != null) {
                    this.w.o(ap2, (alji)null);
                    this.w.o(this.aQ, (alji)null);
                }
            }
        }
    }
    
    public final void W(final boolean b) {
        final izz n = this.n;
        final boolean i = this.I;
        boolean h;
        final boolean b2 = h = false;
        Label_0039: {
            if (!i) {
                if (!this.aV) {
                    h = b2;
                    if (!this.aW) {
                        break Label_0039;
                    }
                }
                h = true;
            }
        }
        if (((fpj)n).h != h) {
            ((fpj)n).h = h;
            ((fpj)n).pq();
        }
        if (!this.al()) {
            this.Z(b);
            this.H();
        }
    }
    
    public final void X(final Rect t) {
        this.T = t;
        if (this.am.G()) {
            return;
        }
        final View k = this.k;
        k.getClass();
        k.setPadding(t.left, t.top, t.right, t.bottom);
        this.g.j(t);
        this.j.d(t);
    }
    
    public final void Y() {
        this.Z(false);
    }
    
    public final void Z(final boolean b) {
        final boolean i = this.I;
        final boolean b2 = true;
        if ((!i || !this.am()) && (!this.O.o || !this.aa()) && this.H != 0 && !this.N.i() && this.ot(this.aX)) {
            final int as = this.as;
            this.b.a.tt((Object)Pair.create((Object)true, (Object)b));
            if (b) {
                this.b.d(ivh.d);
                this.ah((asmc)new jcm(this, 1), as);
            }
            else {
                this.b.d(ivh.b);
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
    
    public final ViewGroup$LayoutParams a() {
        return new abvn(-1, -1, false);
    }
    
    public final boolean aa() {
        if (fao.aG(this.V)) {
            final abci p = this.P;
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
    
    public final boolean ab(final boolean b) {
        if (b) {
            this.ad();
        }
        return !this.bc;
    }
    
    public final void b(final MotionEvent motionEvent) {
        if (!this.aZ) {
            if (!this.aH.m) {
                if (this.N.a == abde.d) {
                    final abcx f = this.f;
                    if (f != null) {
                        f.o();
                        return;
                    }
                }
                if (this.c.d && this.ak(motionEvent)) {
                    final abid c = this.c;
                    final FrameLayout l = this.l;
                    l.getClass();
                    c.a(motionEvent, (View)l, false);
                    return;
                }
                if (!this.aa()) {
                    this.ap.k();
                }
                this.V();
                final Object a = this.bm.a;
                if (a != null) {
                    final DefaultWatchPanelViewController defaultWatchPanelViewController = (DefaultWatchPanelViewController)a;
                    final kyz g = defaultWatchPanelViewController.g;
                    if (g != null) {
                        g.h(0, true);
                        final lfa r = defaultWatchPanelViewController.r;
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
        alzp alzp;
        if ((alzp = this.V.b().e) == null) {
            alzp = alzp.a;
        }
        final boolean aj = alzp.aJ;
        final int n = (int)motionEvent.getX();
        final FrameLayout l = this.l;
        l.getClass();
        return aehz.b(n, l.getWidth(), b && aj) != 0;
    }
    
    public final void d() {
        this.J = 0L;
        this.K = 0L;
        this.L = 0L;
        this.M = 0L;
        ((fov)this.n).f();
    }
    
    public final void f(final ControlsState n) {
        final fpx s = this.s;
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
                if (n.a == abde.b) {
                    this.d.a(s);
                }
            }
        }
        final ControlsState n5 = this.N;
        this.N = n;
        final boolean k = this.bg.k();
        this.b.c(n);
        this.Y();
        if (n.a == abde.a) {
            this.al();
            ((fov)this.n).p();
            if (k) {
                this.oD();
                ((fov)this.n).f();
            }
        }
        if (n.a == abde.f) {
            ((fov)this.n).d();
        }
        if ((n.a.equals((Object)abde.f) && !this.aA.l(abpx.c) && !this.bd) || (n.a.equals((Object)abde.c) && !k && !n5.a.equals((Object)this.N.a))) {
            this.v();
        }
        if (n.a != abde.b && !n.b) {
            this.D();
        }
        this.H();
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final void h(final float n) {
        this.ae(n);
    }
    
    public final void i(final float n) {
        this.ae(n);
    }
    
    public final void j(final boolean b) {
        if (this.aW == b) {
            return;
        }
        this.aW = b;
        final iwm ai = this.ai;
        ai.c = b;
        ((ivc)ai).f();
        this.ai();
    }
    
    public final void k(final fku ax) {
        if (this.aX == ax) {
            return;
        }
        this.aX = ax;
        if (this.ot(ax)) {
            this.ad();
        }
        this.Q = ax.c();
        this.b.f(ax);
        this.ae.b();
        if (ax == fku.a) {
            final ivo l = this.o.l;
            if (l != null) {
                l.f = false;
            }
            this.E();
        }
    }
    
    public final void lW(final aup aup) {
    }
    
    public final /* bridge */ View md() {
        return (View)this.B();
    }
    
    public final void ml(final abcr al) {
        this.al = al;
    }
    
    public final boolean mm() {
        return this.bc;
    }
    
    public final void mp(final aup aup) {
    }
    
    public final String mq() {
        return "player_overlay_playback_controls";
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void n(final long l, final long k, final long j, final long m) {
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        final gsm g = this.G;
        if (g.a) {
            ((fov)this.n).k(l, g.c, g.d, m);
        }
        else {
            ((fov)this.n).k(l, k, j, m);
        }
        final jbq e = this.E;
        if (e.f) {
            e.f(l);
        }
    }
    
    public final void oC() {
        if (this.aa()) {
            this.E();
        }
    }
    
    public final void oD() {
        this.d();
        this.oV(ControlsOverlayStyle.a);
        this.O(false);
    }
    
    public final void oE(final String s, final boolean b) {
        this.N(s, null, b);
    }
    
    public final void oF(final boolean b) {
        this.ad.a.tt((Object)b);
        if (this.N.a == abde.b && this.H != 0 && this.aa()) {
            this.D();
            this.T();
        }
    }
    
    public final void oO(final aup aup) {
        final iuz ag = this.ag;
        if (ag != null) {
            ag.k.b();
        }
    }
    
    public final void oT(final aup aup) {
        final aslm ag = this.aG;
        asln asln;
        if (((vbs)this.ay.cg().g).bA()) {
            asln = this.ay.Q().an((asmi)new izn(this), (asmi)ixz.h);
        }
        else {
            asln = this.ay.P().R().P(this.az).an((asmi)new izn(this), (asmi)ixz.h);
        }
        ag.c(asln);
        if (fao.aG(this.V)) {
            this.aG.c(this.ae.a().P(this.az).an((asmi)new izo(this, 15), (asmi)ixz.h));
        }
        final aslm ag2 = this.aG;
        final Object a = this.bk.a;
        final ivf b = this.b;
        b.getClass();
        ag2.c(((aske)a).am((asmi)new izo(b, 16)));
        this.aG.c(((aske)this.ay.p().d).R().P(this.az).an((asmi)new izo(this, 17), (asmi)ixz.h));
        this.aG.c(((aske)this.ay.p().h).R().P(this.az).an((asmi)new izo(this, 0), (asmi)ixz.h));
        this.aG.c(this.ay.D().P(this.az).an((asmi)new izo(this, 11), (asmi)ixz.h));
        this.aG.c(this.E.b().am((asmi)new izo(this, 12)));
        this.aG.c(this.aU.am((asmi)new izo(this, 13)));
        this.aG.c(((uwk)this.aK.a()).h().l.B((asmo)iuv.g).am((asmi)new izo(this, 14)));
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oV(final ControlsOverlayStyle o) {
        if (aexq.c(this.O, o)) {
            return;
        }
        this.O = o;
        this.b.i(o);
        this.Y();
        this.H();
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        this.aG.b();
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        final boolean b = n != 0 && (!keyEvent.isSystem() || aamp.j(n));
        if (b) {
            this.v();
        }
        final abcx f = this.f;
        if (f != null && this.N.a == abde.d && b && n != 20 && n != 21 && n != 22 && n != 19) {
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
    
    public final boolean ot(final fku fku) {
        return ezw.c(fku) && !fku.n();
    }
    
    public final void pg(final boolean az) {
        if (this.aZ == az) {
            return;
        }
        this.aZ = az;
        if (az) {
            this.E();
        }
        else if (this.ba || this.am()) {
            this.v();
        }
        this.b.b.tt((Object)az);
    }
    
    public final void ph(final MotionEvent motionEvent, final boolean b) {
        if (this.ak(motionEvent)) {
            final abid c = this.c;
            final FrameLayout l = this.l;
            l.getClass();
            c.a(motionEvent, (View)l, b);
        }
    }
    
    public final void pi(final int n, final boolean b) {
        if (this.ab(this.j.i())) {
            return;
        }
        this.b.c.tt((Object)this.j.i());
        if (this.j.i()) {
            if (this.j.a().getParent() == null) {
                final FrameLayout l = this.l;
                l.getClass();
                l.addView(this.j.a());
                this.g.bringToFront();
            }
        }
        else if (!b && this.be != this.j.i()) {
            this.H();
        }
        this.be = this.j.i();
    }
    
    public final void pj(final float n) {
        this.ae(n);
    }
    
    public final void pk(final ScaleGestureDetector scaleGestureDetector) {
        this.D();
        this.T();
        final aazp t = this.t;
        if (t != null) {
            t.k(true);
        }
        final FrameLayout l = this.l;
        l.getClass();
        l.getParent().requestDisallowInterceptTouchEvent(true);
    }
    
    public final void pl(final boolean b) {
        final aazp t = this.t;
        if (t != null) {
            t.k(false);
        }
    }
    
    public final void pm(final abcx abcx) {
        this.f = abcx;
        final iya e = this.e;
        if (e != null) {
            e.i = abcx;
        }
    }
    
    public final void pn(final boolean b) {
        ((fov)this.n).h(b);
    }
    
    public final int q() {
        return this.ax.getResources().getDimensionPixelSize(2131166172);
    }
    
    public final void r(final boolean b) {
    }
    
    public final void rg(final boolean av) {
        if (this.aV == av) {
            return;
        }
        this.aV = av;
        this.b.d.tt((Object)av);
        this.ai();
    }
    
    public final void rj(final long l, final long n, final long k, final long j, final long m) {
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        final gsm g = this.G;
        if (g.a) {
            ((fov)this.n).k(l, g.c, g.d, m);
        }
        else {
            ((fov)this.n).pp(l, n, k, j, m);
        }
        final jbq e = this.E;
        if (e.f) {
            e.f(l);
        }
    }
    
    public final void rl() {
        tqf.x(this.ax, 2132018807, 0);
    }
    
    public final void s(final CharSequence charSequence) {
        this.z.tt((Object)charSequence);
    }
    
    public final void u(final Map x) {
        final izz n = this.n;
        final fku k = n.k;
        if (k != null && k.g()) {
            if (!k.e()) {
                final abey b = ((fov)n).b;
                b.x = x;
                ((fov)n).a.mg((abfb)b);
            }
        }
    }
    
    public final void v() {
        this.Q(false);
    }
    
    public final void x() {
        if (this.aV) {
            return;
        }
        this.E();
    }
    
    public final void y(final anhd anhd, final boolean b) {
        ajws ajws;
        if ((ajws = anhd.c) == null) {
            ajws = ajws.a;
        }
        final Spanned c = acbu.c(ajws, this.af);
        ajws ajws2;
        if ((ajws2 = anhd.d) == null) {
            ajws2 = ajws.a;
        }
        this.N((CharSequence)c, (CharSequence)acbu.c(ajws2, this.af), b);
    }
}
