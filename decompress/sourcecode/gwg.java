import android.graphics.Bitmap;
import com.google.android.libraries.youtube.creation.common.media.ShortsVideoMetadata;
import javax.microedition.khronos.egl.EGLContext;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.ShortsIntensitySliderView;
import com.google.android.libraries.youtube.creation.effects.ShortsPresetTracker;
import android.view.LayoutInflater;
import android.view.ContextThemeWrapper;
import android.view.animation.PathInterpolator;
import android.view.animation.Interpolator;
import android.animation.TimeInterpolator;
import java.io.File;
import com.airbnb.lottie.LottieAnimationView;
import android.content.res.Resources;
import java.util.Locale;
import android.net.Uri;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.os.Bundle;
import j$.time.Duration;
import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import java.util.ArrayList;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.CameraToolbarLayout;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsZoomSlider;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.EffectsFeatureDescriptionView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsCameraToolbarMicButton;
import com.google.android.libraries.youtube.edit.ui.SegmentedControl;
import com.google.common.util.concurrent.ListenableFuture;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.edit.camera.CameraFocusOverlay;
import java.util.HashSet;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.DurationButtonView;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ShortsRecordButtonView;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import android.view.View;
import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gwg extends gwh implements View$OnClickListener, gwk, uic, uib, hbq, hck, ubb
{
    public static final long a;
    public final acup A;
    public final AccountId B;
    public final gvq C;
    public final ujg D;
    public final uba E;
    public final Context F;
    public final unp G;
    public alff H;
    public tzw I;
    public gvp J;
    public View K;
    public CameraView L;
    public final aely M;
    public final uhz N;
    ShortsRecordButtonView O;
    MultiSegmentCameraProgressIndicator P;
    public CreationButtonView Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public CreationButtonView W;
    public CreationButtonView X;
    public DurationButtonView Y;
    public YouTubeTextView Z;
    View aA;
    View aB;
    View aC;
    View aD;
    public YouTubeTextView aE;
    View aF;
    public View aG;
    gxm aH;
    public final HashSet aI;
    public CameraFocusOverlay aJ;
    public View aK;
    public ImageView aL;
    View aM;
    View aN;
    public ViewGroup aO;
    public View aP;
    public int aQ;
    public boolean aR;
    public gvj aS;
    public boolean aT;
    public int aU;
    public FrameLayout aV;
    public ListenableFuture aW;
    public boolean aX;
    public aioe aY;
    public boolean aZ;
    public CreationButtonView aa;
    SegmentedControl ab;
    public gwn ac;
    public YouTubeTextView ad;
    public gvh ae;
    public gvr af;
    public CreationButtonView ag;
    public CreationButtonView ah;
    public CreationButtonView ai;
    ShortsCameraToolbarMicButton aj;
    public CreationButtonView ak;
    CreationButtonView al;
    public gwu am;
    public int an;
    public EffectsFeatureDescriptionView ao;
    public ShortsZoomSlider ap;
    View aq;
    public View ar;
    View as;
    public gwr at;
    CameraToolbarLayout au;
    public CreationButtonView av;
    public FrameLayout aw;
    public ImageView ax;
    public gww ay;
    View az;
    public boolean b;
    public final asib bA;
    public hcn bB;
    public FrameLayout bC;
    public acqu bD;
    public gxh bE;
    public boolean bF;
    public String bG;
    public hcs bH;
    public tzv bI;
    public gwe bJ;
    public tvb bK;
    public final ArrayList bL;
    public int bM;
    public final gxa bN;
    public final hnc bO;
    public final hdv bP;
    public final hyq bQ;
    public final aagm bR;
    public final zhb bS;
    public final avt bT;
    public final auip bU;
    public qpt bV;
    public qpt bW;
    public qpt bX;
    public qpt bY;
    public qpt bZ;
    public boolean ba;
    public boolean bb;
    public boolean bc;
    public boolean bd;
    public boolean be;
    public boolean bf;
    public boolean bg;
    public boolean bh;
    public boolean bi;
    public boolean bj;
    public boolean bk;
    public int bl;
    public int bm;
    public boolean bn;
    public unz bo;
    public gzy bp;
    public Runnable bq;
    public gwj br;
    gzx bs;
    public had bt;
    boolean bu;
    hay bv;
    public int bw;
    gwv bx;
    public tvc by;
    public final atid bz;
    public int c;
    public qpt ca;
    public final qpt cb;
    private final arhr cd;
    private final uje ce;
    private ChooseFilterView cf;
    private boolean cg;
    private boolean ch;
    private boolean ci;
    private boolean cj;
    private hap ck;
    private has cl;
    private uil cm;
    private gwq cn;
    private gwo co;
    private final gxq cp;
    private final aeby cq;
    private qpt cr;
    private qpt cs;
    private final qpt ct;
    public int d;
    public int e;
    public int f;
    public gwd g;
    public final bu h;
    public final gvs i;
    public final wwv j;
    public final tzs k;
    public final hbr l;
    public final tze m;
    public final typ n;
    public final tyw o;
    public final tzg p;
    public final hcu q;
    public final ucs r;
    public final vax s;
    public final tzz t;
    public final hav u;
    public final Executor v;
    public final Executor w;
    public final hcd x;
    public final gzw y;
    public final acuj z;
    
    static {
        a = Duration.ofDays(7L).getSeconds();
    }
    
    public gwg(final bu h, final gvs i, final wwv j, final avt bt, final arhr cd, final auip bu, final gxa bn, final tzs k, final hbr l, final tze m, final typ n, final tyw o, final tzg p49, final hcu q, final hnc bo, final ucs r, final vax s, final aagm br, final tzz t, final hav u, final Executor v, final Executor w, final hcd x, final gzw y, final acuj z, final acup a, final AccountId b, final gxq cp, final gvq c, final zhb bs, final qpt ct, final uje ce, final aeby cq, final hdv bp, final Context f, final qpt cb, final ujg d, final hyq bq, final uba e, final aely m2, final uhz n2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        this.G = unu.o();
        this.H = alff.a;
        this.aI = new HashSet();
        this.aT = false;
        this.aU = -1;
        this.aW = afva.m((Object)null);
        this.aY = aioe.a;
        this.bm = 8;
        this.bq = null;
        this.bu = true;
        this.bw = -1;
        this.bz = atid.aD();
        this.bA = new asib();
        this.bL = new ArrayList();
        this.bM = 0;
        this.h = h;
        this.i = i;
        this.j = j;
        this.cd = cd;
        this.bU = bu;
        this.bN = bn;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p49;
        this.q = q;
        this.bO = bo;
        this.r = r;
        this.s = s;
        this.bR = br;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.bS = bs;
        this.cp = cp;
        this.cq = cq;
        this.bT = bt;
        this.ct = ct;
        this.ce = ce;
        this.bP = bp;
        this.F = f;
        this.cb = cb;
        this.D = d;
        this.bQ = bq;
        this.E = e;
        this.M = m2;
        this.N = n2;
    }
    
    public static gvs N(final boolean b, final aioe aioe, final int n, final AccountId accountId) {
        agot.v(true, (Object)"startCameraSelection must be one of @StartCameraSelection values");
        final gvs gvs = new gvs();
        arin.g((br)gvs);
        aenz.e((br)gvs, accountId);
        final Bundle bundle = new Bundle();
        bundle.putBoolean("MIRROR_FRONT_CAMERA", true);
        bundle.putInt("START_CAMERA_SELECTION", 0);
        bundle.putByteArray("NAVIGATION_ENDPOINT", ((agxl)aioe).toByteArray());
        bundle.putBoolean("SHOULD_ANIMATE_TOOLBAR_LABELS_KEY", b);
        bundle.putInt("SEGMENT_IMPORT_RESTORE_POS", n);
        gvs.ag(bundle);
        aenz.e((br)gvs, accountId);
        return gvs;
    }
    
    public static final void O(final View view) {
        if (view != null) {
            final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                ((ViewGroup$MarginLayoutParams)layoutParams).setMarginEnd(view.getResources().getDimensionPixelSize(2131169681));
            }
        }
    }
    
    public static final void P(final View view, int dimensionPixelSize, int dimensionPixelSize2, int dimensionPixelSize3, final int n) {
        if (view == null) {
            return;
        }
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
            int dimensionPixelSize4 = 0;
            if (dimensionPixelSize != 0) {
                dimensionPixelSize = view.getResources().getDimensionPixelSize(dimensionPixelSize);
            }
            else {
                dimensionPixelSize = 0;
            }
            if (dimensionPixelSize2 != 0) {
                dimensionPixelSize2 = view.getResources().getDimensionPixelSize(dimensionPixelSize2);
            }
            else {
                dimensionPixelSize2 = 0;
            }
            if (dimensionPixelSize3 != 0) {
                dimensionPixelSize3 = view.getResources().getDimensionPixelSize(dimensionPixelSize3);
            }
            else {
                dimensionPixelSize3 = 0;
            }
            if (n != 0) {
                dimensionPixelSize4 = view.getResources().getDimensionPixelSize(n);
            }
            viewGroup$MarginLayoutParams.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        }
    }
    
    private final Uri Q() {
        final tzw i = this.I;
        String l = null;
        Label_0056: {
            if (i != null) {
                final aqyy m = i.m;
                if (m != null) {
                    aqyx aqyx;
                    if ((aqyx = aqyx.b(m.h)) == null) {
                        aqyx = aqyx.a;
                    }
                    if (aqyx == aqyx.d) {
                        l = this.I.l;
                        break Label_0056;
                    }
                }
            }
            l = null;
        }
        if (l != null) {
            return Uri.parse(l);
        }
        return null;
    }
    
    private final Uri R() {
        final tzw i = this.I;
        String l;
        if (i != null && i.U()) {
            l = this.I.l;
        }
        else {
            l = null;
        }
        if (l != null) {
            return Uri.parse(l);
        }
        return null;
    }
    
    private final void S() {
        final View aa = this.aA;
        aa.getClass();
        aa.setVisibility(4);
        final View as = this.as;
        if (as != null) {
            as.setVisibility(4);
        }
        final View aq = this.aq;
        if (aq != null) {
            aq.setVisibility(4);
        }
        final ShortsRecordButtonView o = this.O;
        if (o != null) {
            o.setVisibility(4);
            this.O.setContentDescription(null);
        }
        final FrameLayout aw = this.aw;
        if (aw != null) {
            aw.setVisibility(4);
        }
        final View af = this.aF;
        if (af != null) {
            af.setVisibility(8);
        }
        final gwn ac = this.ac;
        if (ac != null) {
            ac.c();
        }
        final ShortsZoomSlider ap = this.ap;
        if (ap != null) {
            ap.f(false);
            this.ap.d();
        }
        final View az = this.az;
        if (az != null) {
            az.setVisibility(4);
        }
        final View ar = this.ar;
        if (ar != null) {
            ar.setVisibility(4);
        }
    }
    
    private final void T() {
        final ShortsRecordButtonView o = this.O;
        if (o != null) {
            o.setVisibility(0);
            this.O.d();
        }
        final FrameLayout aw = this.aw;
        if (aw != null) {
            aw.setVisibility(0);
        }
        final gvj as = this.aS;
        if (as != null && as.m == 1) {
            hor.g(this.az, true);
        }
        else {
            final gvp j = this.J;
            if (j != null) {
                j.a(true);
            }
        }
        if (!this.L()) {
            final View af = this.aF;
            if (af != null) {
                af.setVisibility(0);
            }
        }
        final ShortsZoomSlider ap = this.ap;
        if (ap != null) {
            ap.f(tqt.e(((br)this.i).nT()));
        }
        if (this.ar != null) {
            final tzw i = this.I;
            if (i != null && i.R()) {
                this.ar.setVisibility(0);
            }
        }
    }
    
    public final void A(final int h) {
        final gwj br = this.br;
        if (br != null) {
            final MultiSegmentCameraProgressIndicator a = br.a;
            if (a != null) {
                a.c(h);
            }
        }
        final gwu am = this.am;
        if (am != null) {
            am.o.setMax(h);
        }
        this.t.c = h;
        final gvj as = this.aS;
        if (as != null) {
            as.e();
        }
        final gxh be = this.bE;
        boolean b = false;
        if (be != null) {
            final int n = (int)Duration.ofMillis((long)h).getSeconds();
            final int n2 = (int)Duration.ofMillis((long)be.d).getSeconds();
            final int n3 = (int)Duration.ofMillis((long)be.f).getSeconds();
            final DurationButtonView b2 = be.b;
            int n4;
            if (!Locale.getDefault().getLanguage().equals("en")) {
                n4 = 2132017580;
            }
            else {
                n4 = 2132017581;
            }
            final YouTubeTextView b3 = b2.b;
            b3.getClass();
            final Resources resources = b2.a.getResources();
            final Integer value = n;
            b3.setText((CharSequence)resources.getString(n4, new Object[] { value }));
            final boolean a2 = be.a();
            String s = "";
            if (a2) {
                final DurationButtonView b4 = be.b;
                int n5;
                if (n == (n5 = n2)) {
                    n5 = n3;
                }
                final Context a3 = b4.a;
                if (a3 != null) {
                    s = a3.getResources().getQuantityString(2131886148, n, new Object[] { value, n5 });
                }
                b4.setContentDescription((CharSequence)s);
            }
            else {
                final DurationButtonView b5 = be.b;
                final Context a4 = b5.a;
                if (a4 != null) {
                    s = a4.getResources().getQuantityString(2131886147, n, new Object[] { value });
                }
                b5.setContentDescription((CharSequence)s);
            }
            be.b.b(h);
            final int h2 = be.h;
            if (h2 > 0) {
                final DurationButtonView b6 = be.b;
                if (h < h2) {
                    final LottieAnimationView c = b6.c;
                    c.getClass();
                    c.p(-b6.d);
                }
                else {
                    final LottieAnimationView c2 = b6.c;
                    c2.getClass();
                    c2.p(b6.d);
                }
                final LottieAnimationView c3 = b6.c;
                c3.getClass();
                c3.e();
            }
            be.h = h;
        }
        this.H();
        final gvp j = this.J;
        if (j != null) {
            if (this.t.d > 0) {
                b = true;
            }
            j.c(b);
        }
    }
    
    public final void B(final Object o) {
        this.aI.add(o);
        final gxm ah = this.aH;
        if (ah != null) {
            ah.b();
        }
    }
    
    public final void C(final boolean b) {
        if (!this.i.au()) {
            return;
        }
        if (b) {
            final FrameLayout bc = this.bC;
            if (bc != null) {
                bc.setVisibility(0);
            }
            final tuw s = this.bT.S(wya.c(107535));
            s.k(true);
            s.c();
            this.S();
            return;
        }
        final FrameLayout bc2 = this.bC;
        if (bc2 != null) {
            bc2.setVisibility(8);
        }
        this.T();
    }
    
    public final void D(final int n, final boolean b) {
        final CameraView l = this.L;
        l.getClass();
        if (l.K() && this.bM == 0) {
            if (this.aU == -1) {
                if (!this.t.d()) {
                    this.u(2);
                    return;
                }
                if (!uji.h()) {
                    uji.au((Context)this.h, 2132019374, this.cq);
                    return;
                }
                if (uji.e() < 5242880L) {
                    uji.au((Context)this.h, 2132019375, this.cq);
                    return;
                }
                final EffectsFeatureDescriptionView ao = this.ao;
                if (ao != null) {
                    ao.d();
                }
                final ShortsRecordButtonView o = this.O;
                if (o != null) {
                    o.g();
                }
                if (b) {
                    final gwr at = this.at;
                    if (at != null) {
                        at.c = true;
                    }
                    final ShortsRecordButtonView o2 = this.O;
                    if (o2 != null) {
                        o2.f();
                    }
                }
                else {
                    this.an = -1;
                }
                final gvh ae = this.ae;
                boolean cg;
                final boolean b2 = cg = false;
                if (ae != null) {
                    cg = b2;
                    if (ae.b.getVisibility() == 0) {
                        cg = b2;
                        if (ae.b.getDrawable() != null) {
                            cg = true;
                        }
                    }
                }
                this.cg = cg;
                final CameraView i = this.L;
                i.getClass();
                if (i.P()) {
                    final long a = ((ujf)this.cd.a()).a();
                    final CameraView j = this.L;
                    j.getClass();
                    j.postDelayed((Runnable)new ccl(this, n, 6), a);
                }
                else {
                    this.E(n);
                }
                this.bM = 1;
            }
        }
    }
    
    public final void E(final int n) {
        if (!tmy.bP((br)this.i)) {
            return;
        }
        final tzw i = this.I;
        File t;
        if (i != null) {
            t = i.t();
        }
        else {
            t = null;
        }
        if (t == null) {
            uji.au((Context)this.h, 2132019374, this.cq);
            return;
        }
        final gwd g = this.g;
        if (g != null) {
            ((hbl)g).od().getWindow().addFlags(128);
        }
        this.L.getClass();
        final gwn ac = this.ac;
        if (ac != null) {
            final gwm a = ac.a();
            if (a != null) {
                final CameraView l = this.L;
                final float a2 = a.a;
                final uid h = l.h;
                if (h == null) {
                    trn.b("Recorder not setup yet.");
                }
                else {
                    h.q = a2;
                }
                this.l.f(1.0f / a.a);
            }
        }
        final CameraView j = this.L;
        final uhr uhr = new uhr(t);
        final int aq = this.aQ;
        final long n2 = this.t.b();
        final long n3 = n;
        boolean b = false;
        Label_0235: {
            if (!this.bg || !this.bF) {
                final gzy bp = this.bp;
                if (bp == null || !bp.h()) {
                    b = false;
                    break Label_0235;
                }
            }
            b = true;
        }
        j.C((raw)uhr, (360 - aq) % 360, n2, n3, (uic)this, b);
        final gzy bp2 = this.bp;
        if (bp2 != null) {
            bp2.d();
        }
    }
    
    public final void F(final int au) {
        final CameraView l = this.L;
        l.getClass();
        if (l.L()) {
            this.L.F(au);
            return;
        }
        this.aU = au;
    }
    
    public final void G() {
        final View ab = this.aB;
        if (ab != null) {
            ab.setEnabled(true);
        }
        hor.h(this.K);
        final gvh ae = this.ae;
        if (ae != null) {
            ae.f = false;
            ae.d();
        }
        final gvp j = this.J;
        if (j != null) {
            j.a(true);
        }
        this.t();
        final hcn bb = this.bB;
        if (bb != null) {
            bb.i(this.I);
        }
        final View am = this.aM;
        if (am != null) {
            am.setVisibility(0);
        }
        final View an = this.aN;
        if (an != null) {
            an.setVisibility(0);
        }
        this.bM = 0;
        this.I(true);
        this.f().nL();
    }
    
    public final void H() {
        this.v.execute(aesm.h((Runnable)new dmu(this, this.t.d(), 7)));
        final hcn bb = this.bB;
        alff a = null;
        final boolean b = true;
        if (bb != null) {
            bb.i(this.I);
            if (bb.c.d > 0) {
                if (bb.n.bB()) {
                    bb.g(true);
                    final agza builder = ((agzi)alff.a).createBuilder();
                    final agza builder2 = ((agzi)algf.a).createBuilder();
                    final agza builder3 = ((agzi)alfw.a).createBuilder();
                    builder3.copyOnWrite();
                    alfw.a((alfw)builder3.instance);
                    builder2.copyOnWrite();
                    final algf algf = (algf)builder2.instance;
                    final alfw h = (alfw)builder3.build();
                    h.getClass();
                    algf.h = h;
                    algf.b |= 0x40;
                    builder.copyOnWrite();
                    final alff alff = (alff)builder.instance;
                    final algf d = (algf)builder2.build();
                    d.getClass();
                    alff.D = d;
                    alff.c |= 0x40000;
                    bb.i = (alff)builder.build();
                }
                else {
                    bb.g(false);
                }
            }
            else {
                bb.g(true);
                bb.i = null;
            }
        }
        final hcu q = this.q;
        final boolean b2 = tzz.c(q.e.b()) > 0L;
        boolean b3 = false;
        Label_0324: {
            if (!b2 || q.D.bB()) {
                final tzz d2 = q.d;
                if (d2.c > d2.d) {
                    b3 = true;
                    break Label_0324;
                }
            }
            b3 = false;
        }
        q.b.execute(aesm.h((Runnable)new dmu(q, b3, 10)));
        if (b2) {
            final agza builder4 = ((agzi)alff.a).createBuilder();
            final agza builder5 = ((agzi)algf.a).createBuilder();
            final agza builder6 = ((agzi)alfw.a).createBuilder();
            builder6.copyOnWrite();
            alfw.a((alfw)builder6.instance);
            builder5.copyOnWrite();
            final algf algf2 = (algf)builder5.instance;
            final alfw h2 = (alfw)builder6.build();
            h2.getClass();
            algf2.h = h2;
            algf2.b |= 0x40;
            builder4.copyOnWrite();
            final alff alff2 = (alff)builder4.instance;
            final algf d3 = (algf)builder5.build();
            d3.getClass();
            alff2.D = d3;
            alff2.c |= 0x40000;
            a = (alff)builder4.build();
        }
        q.A = a;
        final gxh be = this.bE;
        if (be != null) {
            final boolean bf = this.bF;
            final long c = tzz.c((uab)be.g);
            final long n = be.e;
            int n2 = b ? 1 : 0;
            if (!be.c) {
                if (!bf && c <= n) {
                    n2 = (b ? 1 : 0);
                }
                else {
                    n2 = 0;
                }
            }
            final int n3 = 120988;
            if (bf) {
                be.i.S(wya.c(120988)).f();
            }
            int n4 = n3;
            if (bf) {
                n4 = n3;
                if (be.c) {
                    n4 = 159418;
                }
            }
            final tuw s = be.i.S(wya.c(n4));
            if (n2 != 0) {
                be.b.setVisibility(0);
                s.h();
                return;
            }
            be.b.setVisibility(8);
            s.f();
        }
    }
    
    public final void I(final boolean b) {
        final CameraView l = this.L;
        l.getClass();
        final boolean m = l.M();
        final FrameLayout aw = this.aw;
        int n = 0;
        if (aw != null) {
            n = n;
            if (avt.R((View)aw, m)) {
                n = 1;
            }
        }
        final FrameLayout aw2 = this.aw;
        if (aw2 != null) {
            hor.g((View)aw2, m);
        }
        if (n != 0 && b) {
            final tuw s = this.bT.S(wya.c(96641));
            s.k(m);
            s.j();
        }
    }
    
    public final boolean J() {
        return uqs.e((Context)this.h, 1) && uqs.e((Context)this.h, 2);
    }
    
    public final boolean K() {
        return this.J();
    }
    
    public final boolean L() {
        return this.R() != null;
    }
    
    public final void M() {
        final gzy bp = this.bp;
        if (bp != null) {
            bp.b(false);
        }
    }
    
    public final gwe a() {
        return (gwe)new gvv(this, 1);
    }
    
    public final gwo b() {
        if (this.co == null) {
            this.co = (gwo)new gvz(this);
        }
        return this.co;
    }
    
    public final gwq c() {
        if (this.cn == null) {
            final Context f = this.F;
            final gwo b = this.b();
            final CameraView l = this.L;
            l.getClass();
            this.cn = new gwq(f, b, (uin)l);
        }
        return this.cn;
    }
    
    public final hcu d() {
        return this.q;
    }
    
    public final uba e() {
        return this.E;
    }
    
    final uil f() {
        if (this.cm == null) {
            this.cm = (uil)new gwa(this);
        }
        return this.cm;
    }
    
    public final void g() {
        final gvj as = this.aS;
        if (as != null) {
            as.c.post((Runnable)new grt(as, 8));
        }
    }
    
    public final void h() {
        this.aW.cancel(false);
    }
    
    public final void i(final Object o) {
        this.aI.remove(o);
        if (this.aI.isEmpty()) {
            final gxm ah = this.aH;
            if (ah != null) {
                if (!ah.e) {
                    ah.b.removeCallbacks(ah.c);
                    ah.f = false;
                    return;
                }
                if (!ah.g) {
                    ah.g = true;
                    final long n = System.currentTimeMillis() - ah.h;
                    if (n >= 300L) {
                        ah.b.post(ah.d);
                        return;
                    }
                    ah.b.postDelayed(ah.d, 300L - n);
                }
            }
        }
    }
    
    public final void j(final boolean b) {
        final gwd g = this.g;
        if (g != null) {
            ((hbl)g).an.g(b);
            this.h();
        }
    }
    
    final void k() {
        final tzw i = this.I;
        if (i != null) {
            i.H();
        }
        final hbr l = this.l;
        l.c();
        if (l.d) {
            l.e();
        }
        final gwj br = this.br;
        if (br != null) {
            br.b(0L);
            br.a();
        }
    }
    
    public final void l() {
        final tvc by = this.by;
        if (by != null && !((usa)by).M()) {
            final tzw i = this.I;
            if (i != null && i.S()) {
                final tvc by2 = this.by;
                if (by2 != null) {
                    ((usa)by2).K();
                }
            }
            else {
                this.k.d();
                this.j(false);
            }
        }
    }
    
    public final void m() {
        this.S();
        final View ab = this.aB;
        if (ab != null) {
            ab.setVisibility(4);
        }
    }
    
    public final void n() {
        final View ab = this.aB;
        if (ab != null) {
            ab.setEnabled(false);
        }
        hor.i(this.K);
        final gvp j = this.J;
        if (j != null) {
            j.a(false);
        }
        final View am = this.aM;
        if (am != null) {
            am.setVisibility(8);
        }
        final View an = this.aN;
        if (an != null) {
            an.setVisibility(8);
        }
    }
    
    public final void o() {
        final View ad = this.aD;
        int i = 0;
        final View az = this.az;
        final ShortsZoomSlider ap = this.ap;
        final View aq = this.aq;
        final ShortsRecordButtonView o = this.O;
        final View aa = this.aA;
        final View as = this.as;
        View view = null;
        while (i < 7) {
            final View view2 = (new View[] { ad, az, (View)ap, aq, (View)o, aa, as })[i];
            if (view2 != null) {
                if (view != null) {
                    final int id = view.getId();
                    if (id == -1) {
                        throw new IllegalStateException("Cannot specify traversal order for views without ids");
                    }
                    view2.setAccessibilityTraversalAfter(id);
                }
                view = view2;
            }
            ++i;
        }
    }
    
    public final void onClick(View aq) {
        if (aq != this.aC) {
            final FrameLayout bc = this.bC;
            if (bc != null) {
                if (bc.getVisibility() == 0) {
                    return;
                }
            }
        }
        if (aq != this.aB && aq != this.aC) {
            if (aq == this.aA) {
                final gwv bx = this.bx;
                if (bx != null) {
                    bx.K();
                    this.bT.S(wya.c(121257)).d();
                }
            }
            else if (aq == this.aq) {
                this.bT.S(wya.c(96642)).d();
                aq = this.aq;
                if (aq != null) {
                    final PathInterpolator c = apb.c(0.2f, 0.0f, 0.6f, 1.0f);
                    ((View)aq).animate().cancel();
                    ((View)aq).animate().scaleX(0.9f).scaleY(0.9f).setDuration(100L).setInterpolator((TimeInterpolator)c).withEndAction((Runnable)new upt((View)aq, (Interpolator)c, 7)).start();
                }
                final tzw i = this.I;
                if (i != null) {
                    i.P();
                }
            }
            else {
                if (aq == this.ar) {
                    this.bT.S(wya.c(96650)).d();
                    final tzw j = this.I;
                    if (j == null) {
                        return;
                    }
                    synchronized (j.c) {
                        if (!j.R()) {
                            return;
                        }
                        j.d.add(j.e.pop());
                        j.M();
                        j.Q();
                        return;
                    }
                }
                if (aq == this.as) {
                    this.u(1);
                    return;
                }
                if (aq == this.al) {
                    this.bT.S(wya.c(129088)).d();
                    this.u(6);
                }
            }
            return;
        }
        this.bT.S(wya.c(96638)).d();
        this.l();
    }
    
    public final void p(final String bg) {
        final tzw i = this.I;
        if (i != null) {
            ((uab)i).x();
            this.bG = bg;
        }
    }
    
    public final void q() {
        if (this.bo == null) {
            return;
        }
        this.P.getClass();
        this.L.getClass();
        this.K.getClass();
        this.O.getClass();
        if (!this.ch && this.R) {
            Object f;
            if (this.bi) {
                f = new ContextThemeWrapper(this.F, 2132083490);
            }
            else {
                f = this.F;
            }
            (this.cf = (ChooseFilterView)LayoutInflater.from((Context)f).inflate(2131624181, (ViewGroup)null)).e(this.bo, (aum)this.i, this.v);
            final ChooseFilterView cf = this.cf;
            final wwv j = this.j;
            cf.o(j, new vwb(j));
            final gvs i = this.i;
            final unz bo = this.bo;
            final ShortsPresetTracker shortsPresetTracker = new ShortsPresetTracker((aum)i, bo, this.bR, null);
            ((auh)i.a).b((aul)shortsPresetTracker);
            bo.b((uny)new hjt(shortsPresetTracker, 2));
            bo.a((unl)new hat(shortsPresetTracker, 7));
            final hav u = this.u;
            shortsPresetTracker.a = (tzf)u;
            final CreationButtonView q = this.Q;
            if (q != null) {
                final CameraView l = this.L;
                final ChooseFilterView cf2 = this.cf;
                final EffectsFeatureDescriptionView ao = this.ao;
                final avt bt = this.bT;
                final unz bo2 = this.bo;
                final View k = this.K;
                final MultiSegmentCameraProgressIndicator p = this.P;
                final ShortsRecordButtonView o = this.O;
                u.h = (ShortsIntensitySliderView)LayoutInflater.from((Context)f).inflate(2131625404, (ViewGroup)null);
                u.f = (View)l;
                u.c = cf2;
                u.g = ao;
                u.o = bt;
                if (cf2 != null) {
                    ((FrameLayout)l).addView((View)cf2, 0);
                }
                final cl a = u.a;
                final avt o2 = u.o;
                Object a2;
                if (o2 == null) {
                    a2 = null;
                }
                else {
                    a2 = o2.a;
                }
                (u.i = (usa)new hau(u, (Context)f, a, (wwv)a2, (Context)f, new View[] { k, (View)p, (View)o })).J(((Context)f).getString(2132017583));
                if (cf2 != null) {
                    cf2.j((uph)u);
                }
                u.d = q;
                u.e = wya.c(96645);
                final CreationButtonView d = u.d;
                if (d != null) {
                    d.setOnClickListener((View$OnClickListener)new gxu(u, 8));
                }
                bo2.a((unl)new hat(u, 0));
                u.l = bo2;
                u.j = wya.c(122656);
                bo2.a((unl)new hat(u, 2));
            }
            else {
                trn.b("Can't create chooseFilterController");
            }
            this.ch = true;
        }
        this.r();
        if (!this.cj && this.V) {
            final CreationButtonView w = this.W;
            Label_0679: {
                if (w != null) {
                    final CreationButtonView x = this.X;
                    if (x != null) {
                        final EffectsFeatureDescriptionView ao2 = this.ao;
                        if (ao2 != null) {
                            final Context f2 = this.F;
                            final gzx bs = this.bs;
                            bs.getClass();
                            final hay hay = new hay(w, x, ao2, f2, bs, this.bT, (byte[])null, (byte[])null, (byte[])null);
                            this.bv = hay;
                            hay.a.setOnClickListener((View$OnClickListener)hay);
                            hay.b.setOnClickListener((View$OnClickListener)hay);
                            final gzx c = hay.c;
                            szc.f();
                            c.l = hay;
                            c.k();
                            if (c.j) {
                                hay.a(c.b, c.c);
                            }
                            hay.b();
                            break Label_0679;
                        }
                    }
                }
                trn.b("Can't create shortsCameraEnhanceController");
            }
            this.cj = true;
        }
        if (!this.ci) {
            final tze m = this.m;
            final unp g = this.G;
            ((unu)g).k = m.g;
            this.n.c = g;
            this.ci = true;
        }
        this.bn = true;
    }
    
    public final void r() {
        if (this.T || this.V || this.U) {
            if (this.bs == null) {
                this.bs = new gzx(this.bR, this.v, (byte[])null);
            }
            if (this.bt == null) {
                final Context nt = ((br)this.i).nT();
                final Executor v = this.v;
                if (this.cs == null) {
                    this.cs = new qpt(this);
                }
                this.bt = new had(nt, v, this.cs, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                final gzx bs = this.bs;
                final unz bo = this.bo;
                bo.getClass();
                final bu h = this.h;
                final had bt = this.bt;
                szc.f();
                bs.d = "";
                bs.i();
                bs.a = false;
                bs.k = 1;
                bo.a((unl)new hat(bs, 1));
                bs.i = bt;
                tcp.n((aum)h, bs.m.b(), (trb)new gzr(bs, 4), (trb)new gzr(bs, 5));
                final CameraView l = this.L;
                l.getClass();
                l.h((uil)this.bt);
                final CameraView i = this.L;
                final gzx bs2 = this.bs;
                i.q = (uii)bs2;
                if (i.a) {
                    final uiv j = i.l;
                    if (j != null) {
                        final EGLContext a = j.a();
                        if (a != null && !i.k.getAndSet(true)) {
                            ((uii)bs2).c(a);
                        }
                    }
                }
                else if (i.j != null) {
                    i.o((Runnable)new tur(i, (uii)bs2, 17));
                }
                final tzw k = this.I;
                if (k != null) {
                    final had bt2 = this.bt;
                    bt2.m((Runnable)new gvu(bt2, k, 8));
                }
            }
            final gwj br = this.br;
            if (br != null) {
                br.b = this.bt;
            }
            final gzx bs3 = this.bs;
            final had bt3 = this.bt;
            this.ao.getClass();
            this.ai.getClass();
            this.aj.getClass();
            if (!this.L() && this.Q() == null) {
                final View m = this.K;
                m.getClass();
                final MultiSegmentCameraProgressIndicator p = this.P;
                p.getClass();
                final ShortsRecordButtonView o = this.O;
                o.getClass();
                final CameraView l2 = this.L;
                l2.getClass();
                if (this.ck == null) {
                    final qpt ct = this.ct;
                    this.ck = new hap((Executor)((eqa)ct.a).a.r.a(), (Executor)((eqa)ct.a).a.g.a(), (AccountId)((eqa)ct.a).b.c.a(), (bu)((eqa)ct.a).c.i.a(), this.ce, new View[] { m, (View)p, (View)o }, this.ai, l2, (View)this.aj, this.ao, this.F, this.bT, bs3, null, null, null);
                }
                this.bp = (gzy)this.ck;
            }
            else {
                Uri e;
                if (this.R() != null) {
                    e = this.R();
                }
                else {
                    e = this.Q();
                }
                e.getClass();
                final has cl = this.cl;
                if (cl == null) {
                    this.cl = new has(this.F, bs3, this.ao, e, this.aj, this.cp, bt3, this.bT, (View)this.ai, this.bQ.d(), this.bQ.c(), null, null, null);
                }
                else {
                    cl.e = e;
                }
                this.bp = (gzy)this.cl;
            }
            final gzy bp = this.bp;
            if (this.cr == null) {
                this.cr = new qpt(this);
            }
            bp.l(this.cr);
            final tzw i2 = this.I;
            if (i2 != null) {
                this.bp.f(i2);
            }
            final Runnable bq = this.bq;
            if (bq != null) {
                bq.run();
                this.bq = null;
            }
        }
        final hcn bb = this.bB;
        if (bb != null) {
            bb.i(this.I);
        }
        final gvp j2 = this.J;
        if (j2 != null) {
            j2.b(hor.c(j2.a));
        }
        final gwn ac = this.ac;
        if (ac != null) {
            ac.i(this.L(), this.I);
        }
        final gzy bp2 = this.bp;
        if (bp2 != null) {
            bp2.g();
        }
    }
    
    public final void s(final int n) {
        final tzw i = this.I;
        if (i != null) {
            i.O(n);
        }
    }
    
    public final void t() {
        final CreationButtonView q = this.Q;
        if (q == null) {
            return;
        }
        if (this.ba && this.R) {
            q.setVisibility(0);
            this.z.d("shorts-camera-toolbelt-filters-button", (View)this.Q);
            return;
        }
        q.setVisibility(8);
    }
    
    public final void u(final int bm) {
        if (this.bl > 0) {
            final gzy bp = this.bp;
            bp.getClass();
            this.B(bp);
            this.bm = bm;
            return;
        }
        final gxa bn = this.bN;
        bn.e = bn.a.b(alku.aU);
        final tzw i = this.I;
        if (i == null) {
            trn.b("Null project state when transitioning to editor - cannot create composed video");
            return;
        }
        if (this.g == null) {
            trn.b("Null listener can't receive composed video");
            return;
        }
        final aexq c = i.c();
        if (!c.h()) {
            return;
        }
        final gwd g = this.g;
        if (g != null) {
            final ShortsVideoMetadata shortsVideoMetadata = (ShortsVideoMetadata)c.c();
            final hbl hbl = (hbl)g;
            hbl.od().getWindow().clearFlags(128);
            hbl.aL(bm);
        }
        this.bT.P(wya.b(96639)).a();
        this.aT = false;
        final gvp j = this.J;
        if (j != null) {
            j.c = false;
        }
    }
    
    public final void v() {
        this.bp.c(this.L.getWidth(), this.L.getHeight(), this.bu);
        this.bu = false;
    }
    
    public final void w(final qwu qwu, int size) {
        final ShortsZoomSlider ap = this.ap;
        if (ap != null) {
            ap.g(false);
        }
        if (size != 0) {
            this.k();
            return;
        }
        this.l.c();
        final ShortsRecordButtonView o = this.O;
        if (o != null) {
            uji.g((View)o, 2132019713);
        }
        if (qwu != null) {
            Label_0770: {
                Label_0753: {
                    try {
                        final tzw i = this.I;
                        if (i == null) {
                            throw new IllegalStateException("Capture completed with null Project State");
                        }
                        if (i.w() != null) {
                            final tzw j = this.I;
                            final agza builder = ((agzi)apio.a).createBuilder();
                            final agza builder2 = ((agzi)apis.a).createBuilder();
                            final float d = qwu.d;
                            builder2.copyOnWrite();
                            final apis apis = (apis)builder2.instance;
                            apis.b |= 0x1;
                            apis.c = d;
                            builder.copyOnWrite();
                            final apio apio = (apio)builder.instance;
                            final apis c = (apis)builder2.build();
                            c.getClass();
                            apio.c = c;
                            apio.b |= 0x1;
                            if (this.an != -1) {
                                final agza builder3 = ((agzi)apiq.a).createBuilder();
                                final agyo b = ahda.b(this.an);
                                builder3.copyOnWrite();
                                final apiq apiq = (apiq)builder3.instance;
                                b.getClass();
                                apiq.c = b;
                                apiq.b |= 0x1;
                                builder.copyOnWrite();
                                final apio apio2 = (apio)builder.instance;
                                final apiq d2 = (apiq)builder3.build();
                                d2.getClass();
                                apio2.d = d2;
                                apio2.b |= 0x2;
                            }
                            final boolean cg = this.cg;
                            builder.copyOnWrite();
                            final apio apio3 = (apio)builder.instance;
                            apio3.b |= 0x4;
                            apio3.e = cg;
                            final gvr af = this.af;
                            if (af != null && af.b) {
                                builder.copyOnWrite();
                                final apio apio4 = (apio)builder.instance;
                                apio4.f = 1;
                                apio4.b |= 0x8;
                            }
                            size = qwu.e - 1;
                            if (size != 1) {
                                if (size != 2) {
                                    size = 1;
                                }
                                else {
                                    size = 3;
                                }
                            }
                            else {
                                size = 2;
                            }
                            builder.copyOnWrite();
                            final apio apio5 = (apio)builder.instance;
                            apio5.g = size - 1;
                            apio5.b |= 0x10;
                            final apio apio6 = (apio)builder.build();
                            final ajkd s = uji.s(this.G.i(), this.bs);
                            final had bt = this.bt;
                            aqyt aqyt4;
                            if (bt != null) {
                                final agza builder4 = ((agzi)aqyt.a).createBuilder();
                                final hae c2 = bt.c;
                                Label_0655: {
                                    if (c2 != null) {
                                        final Uri b2 = c2.b;
                                        if (b2 != null) {
                                            final long c3 = c2.c;
                                            final long d3 = c2.d;
                                            final String string = b2.toString();
                                            builder4.copyOnWrite();
                                            final aqyt aqyt = (aqyt)builder4.instance;
                                            string.getClass();
                                            aqyt.b |= 0x1;
                                            aqyt.c = string;
                                            builder4.copyOnWrite();
                                            final aqyt aqyt2 = (aqyt)builder4.instance;
                                            aqyt2.b |= 0x4;
                                            aqyt2.e = c3;
                                            builder4.copyOnWrite();
                                            final aqyt aqyt3 = (aqyt)builder4.instance;
                                            aqyt3.b |= 0x2;
                                            aqyt3.d = d3;
                                            aqyt4 = (aqyt)builder4.build();
                                            break Label_0655;
                                        }
                                    }
                                    aqyt4 = (aqyt)builder4.build();
                                }
                            }
                            else {
                                aqyt4 = null;
                            }
                            size = j.d.size();
                            aqyy m;
                            if (apio6 != null) {
                                m = j.m;
                            }
                            else {
                                m = null;
                            }
                            j.V(qwu, apio6, (apit)null, s, 2, (aqyq)null, aqyt4, size, (apip)null, m);
                            break Label_0770;
                        }
                        throw new IllegalStateException("Capture completed with no pending segment");
                    }
                    catch (final IllegalStateException ex) {
                        break Label_0753;
                    }
                    throw new IllegalStateException("Capture completed with null VideoMetadata");
                }
                final IllegalStateException ex;
                zjp.c(zjo.b, zjn.f, "[ShortsCreation][Android][Camera]Could not commit segment", (Throwable)ex);
                this.k();
            }
            final ShortsRecordButtonView o2 = this.O;
            if (o2 != null) {
                o2.h();
            }
            final gwr at = this.at;
            if (at != null) {
                at.c = false;
            }
            if (this.t.d()) {
                this.G();
                return;
            }
            this.u(2);
            return;
        }
        throw new IllegalStateException("Capture completed with null VideoMetadata");
    }
    
    public final void x(final Runnable runnable) {
        this.h.runOnUiThread(aesm.h(runnable));
    }
    
    public final void y() {
        this.T();
        final View ab = this.aB;
        if (ab != null) {
            ab.setVisibility(0);
        }
    }
    
    public final void z(final Bitmap imageBitmap) {
        final View o = ((br)this.i).O;
        if (o == null) {
            return;
        }
        final ImageView imageView = (ImageView)o.findViewById(2131430828);
        if (imageView == null) {
            return;
        }
        if (imageBitmap != null) {
            imageView.setImageBitmap(imageBitmap);
            return;
        }
        imageView.setImageDrawable(fc.b((Context)this.h, 2131233264));
    }
}
