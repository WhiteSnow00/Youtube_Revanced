import com.google.android.libraries.youtube.creation.common.media.ShortsVideoMetadata;
import java.util.concurrent.Callable;
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
import android.graphics.Bitmap;
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

public final class gww extends gwx implements View$OnClickListener, gwz, rdq, rdp, hch, hdc, ude
{
    public static final long a;
    public final AccountId A;
    public final gwf B;
    public final ulc C;
    public final udd D;
    public final uas E;
    public final Context F;
    public final upm G;
    public alhi H;
    public uby I;
    public gwe J;
    public View K;
    public CameraView L;
    public final aeny M;
    public final uka N;
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
    gya aH;
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
    public gvy aS;
    public boolean aT;
    public int aU;
    public FrameLayout aV;
    public ListenableFuture aW;
    public boolean aX;
    public aiqj aY;
    public boolean aZ;
    public CreationButtonView aa;
    SegmentedControl ab;
    public gxc ac;
    public YouTubeTextView ad;
    public gvw ae;
    public gwg af;
    public CreationButtonView ag;
    public CreationButtonView ah;
    public CreationButtonView ai;
    ShortsCameraToolbarMicButton aj;
    public CreationButtonView ak;
    CreationButtonView al;
    public gxj am;
    public int an;
    public EffectsFeatureDescriptionView ao;
    public ShortsZoomSlider ap;
    View aq;
    public View ar;
    View as;
    public gxg at;
    CameraToolbarLayout au;
    public CreationButtonView av;
    public FrameLayout aw;
    public ImageView ax;
    public gxl ay;
    View az;
    public boolean b;
    public final ativ bA;
    public final asiq bB;
    public hdf bC;
    public FrameLayout bD;
    public acsy bE;
    public gxu bF;
    public boolean bG;
    public String bH;
    public hdk bI;
    public ubx bJ;
    public gwu bK;
    public txg bL;
    public final ArrayList bM;
    public int bN;
    public final gxp bO;
    public final qqr bP;
    public final hnx bQ;
    public final hzm bR;
    public final eg bS;
    public final ziy bT;
    public final aujg bU;
    public pvh bV;
    public pvh bW;
    public pvh bX;
    public pvh bY;
    public pvh bZ;
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
    public boolean bl;
    public int bm;
    public int bn;
    public boolean bo;
    public upw bp;
    public hap bq;
    public Runnable br;
    public gwy bs;
    hao bt;
    public hau bu;
    boolean bv;
    hbn bw;
    public int bx;
    gxk by;
    public txh bz;
    public int c;
    public pvh ca;
    public final pvh cb;
    public final aeea cc;
    private final arkg ce;
    private final ula cf;
    private ChooseFilterView cg;
    private boolean ch;
    private boolean ci;
    private boolean cj;
    private boolean ck;
    private hbg cl;
    private hbp cm;
    private ukh cn;
    private gxf co;
    private gxd cp;
    private final gyf cq;
    private final aeea cr;
    private pvh cs;
    private pvh ct;
    private final pvh cu;
    public int d;
    public int e;
    public int f;
    public gwt g;
    public final bu h;
    public final gwh i;
    public final wyw j;
    public final ubu k;
    public final hci l;
    public final ubg m;
    public final uaz n;
    public final ubi o;
    public final hdm p;
    public final ueu q;
    public final vcy r;
    public final ucb s;
    public final hbk t;
    public final Executor u;
    public final Executor v;
    public final hcv w;
    public final han x;
    public final acwn y;
    public final acwt z;
    
    static {
        a = Duration.ofDays(7L).getSeconds();
    }
    
    public gww(final bu h, final gwh i, final wyw j, final aeea cc, final arkg ce, final aujg bu, final gxp bo, final ubu k, final hci l, final ubg m, final uas e, final uaz n, final ubi o, final hdm p49, final hnx bq, final ueu q, final vcy r, final qqr bp, final ucb s, final hbk t, final Executor u, final Executor v, final hcv w, final han x, final acwn y, final acwt z, final AccountId a, final gyf cq, final gwf b, final ziy bt, final pvh cu, final ula cf, final aeea cr, final eg bs, final Context f, final pvh cb, final ulc c, final hzm br, final udd d, final aeny m2, final uka n2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        this.G = upr.n();
        this.H = alhi.a;
        this.aI = new HashSet();
        this.aT = false;
        this.aU = -1;
        this.aW = afwm.m((Object)null);
        this.aY = aiqj.a;
        this.bn = 8;
        this.br = null;
        this.bv = true;
        this.bx = -1;
        this.bA = ativ.aE();
        this.bB = new asiq();
        this.bM = new ArrayList();
        this.bN = 0;
        this.h = h;
        this.i = i;
        this.j = j;
        this.ce = ce;
        this.bU = bu;
        this.bO = bo;
        this.k = k;
        this.l = l;
        this.m = m;
        this.E = e;
        this.n = n;
        this.o = o;
        this.p = p49;
        this.bQ = bq;
        this.q = q;
        this.r = r;
        this.bP = bp;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.bT = bt;
        this.cq = cq;
        this.cr = cr;
        this.cc = cc;
        this.cu = cu;
        this.cf = cf;
        this.bS = bs;
        this.F = f;
        this.cb = cb;
        this.C = c;
        this.bR = br;
        this.D = d;
        this.M = m2;
        this.N = n2;
    }
    
    public static gwh O(final boolean b, final aiqj aiqj, final int n, final AccountId accountId) {
        adkp.I(true, "startCameraSelection must be one of @StartCameraSelection values");
        final gwh gwh = new gwh();
        arlc.g((br)gwh);
        aepz.e((br)gwh, accountId);
        final Bundle bundle = new Bundle();
        bundle.putBoolean("MIRROR_FRONT_CAMERA", true);
        bundle.putInt("START_CAMERA_SELECTION", 0);
        bundle.putByteArray("NAVIGATION_ENDPOINT", ((agzk)aiqj).toByteArray());
        bundle.putBoolean("SHOULD_ANIMATE_TOOLBAR_LABELS_KEY", b);
        bundle.putInt("SEGMENT_IMPORT_RESTORE_POS", n);
        gwh.ag(bundle);
        aepz.e((br)gwh, accountId);
        return gwh;
    }
    
    public static final void P(final View view) {
        if (view != null) {
            final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                ((ViewGroup$MarginLayoutParams)layoutParams).setMarginEnd(view.getResources().getDimensionPixelSize(2131169682));
            }
        }
    }
    
    public static final void Q(final View view, int dimensionPixelSize, int dimensionPixelSize2, int dimensionPixelSize3, final int n) {
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
    
    private final Uri R() {
        final uby i = this.I;
        String l = null;
        Label_0056: {
            if (i != null) {
                final arbm m = i.m;
                if (m != null) {
                    arbl arbl;
                    if ((arbl = arbl.b(m.h)) == null) {
                        arbl = arbl.a;
                    }
                    if (arbl == arbl.d) {
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
    
    private final Uri S() {
        final uby i = this.I;
        String l;
        if (i != null && i.W()) {
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
    
    private final void T() {
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
        final gxc ac = this.ac;
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
    
    private final void U() {
        final ShortsRecordButtonView o = this.O;
        if (o != null) {
            o.setVisibility(0);
            this.O.d();
        }
        final FrameLayout aw = this.aw;
        if (aw != null) {
            aw.setVisibility(0);
        }
        final gvy as = this.aS;
        if (as != null && as.m == 1) {
            gxv.b(this.az, true);
        }
        else {
            final gwe j = this.J;
            if (j != null) {
                j.a(true);
            }
        }
        if (!this.M()) {
            final View af = this.aF;
            if (af != null) {
                af.setVisibility(0);
            }
        }
        final ShortsZoomSlider ap = this.ap;
        if (ap != null) {
            ap.f(tsy.e(((br)this.i).nT()));
        }
        if (this.ar != null) {
            final uby i = this.I;
            if (i != null && i.T()) {
                this.ar.setVisibility(0);
            }
        }
    }
    
    public final void A(final Bitmap imageBitmap) {
        final View o = ((br)this.i).O;
        if (o == null) {
            return;
        }
        final ImageView imageView = (ImageView)o.findViewById(2131430831);
        if (imageView == null) {
            return;
        }
        if (imageBitmap != null) {
            imageView.setImageBitmap(imageBitmap);
            return;
        }
        imageView.setImageDrawable(fc.b((Context)this.h, 2131233264));
    }
    
    public final void B(final int i) {
        final gwy bs = this.bs;
        if (bs != null) {
            final MultiSegmentCameraProgressIndicator a = bs.a;
            if (a != null) {
                a.c(i);
            }
        }
        final gxj am = this.am;
        if (am != null) {
            am.o.setMax(i);
        }
        this.s.c = i;
        final gvy as = this.aS;
        if (as != null) {
            as.e();
        }
        final gxu bf = this.bF;
        boolean b = false;
        if (bf != null) {
            final int n = (int)Duration.ofMillis((long)i).getSeconds();
            final int n2 = (int)Duration.ofMillis((long)bf.e).getSeconds();
            final int n3 = (int)Duration.ofMillis((long)bf.g).getSeconds();
            final DurationButtonView c = bf.c;
            int n4;
            if (!Locale.getDefault().getLanguage().equals("en")) {
                n4 = 2132017580;
            }
            else {
                n4 = 2132017581;
            }
            final YouTubeTextView b2 = c.b;
            b2.getClass();
            final Resources resources = c.a.getResources();
            final Integer value = n;
            b2.setText((CharSequence)resources.getString(n4, new Object[] { value }));
            final boolean a2 = bf.a();
            String s = "";
            if (a2) {
                final DurationButtonView c2 = bf.c;
                int n5;
                if (n == (n5 = n2)) {
                    n5 = n3;
                }
                final Context a3 = c2.a;
                if (a3 != null) {
                    s = a3.getResources().getQuantityString(2131886148, n, new Object[] { value, n5 });
                }
                c2.setContentDescription((CharSequence)s);
            }
            else {
                final DurationButtonView c3 = bf.c;
                final Context a4 = c3.a;
                if (a4 != null) {
                    s = a4.getResources().getQuantityString(2131886147, n, new Object[] { value });
                }
                c3.setContentDescription((CharSequence)s);
            }
            bf.c.b(i);
            final int j = bf.i;
            if (j > 0) {
                final DurationButtonView c4 = bf.c;
                if (i < j) {
                    final LottieAnimationView c5 = c4.c;
                    c5.getClass();
                    c5.p(-c4.d);
                }
                else {
                    final LottieAnimationView c6 = c4.c;
                    c6.getClass();
                    c6.p(c4.d);
                }
                final LottieAnimationView c7 = c4.c;
                c7.getClass();
                c7.e();
            }
            bf.i = i;
        }
        this.I();
        final gwe k = this.J;
        if (k != null) {
            if (this.s.d > 0) {
                b = true;
            }
            k.c(b);
        }
    }
    
    public final void C(final Object o) {
        this.aI.add(o);
        final gya ah = this.aH;
        if (ah != null) {
            ah.b();
        }
    }
    
    public final void D(final boolean b) {
        if (!this.i.au()) {
            return;
        }
        if (b) {
            final FrameLayout bd = this.bD;
            if (bd != null) {
                bd.setVisibility(0);
            }
            final twx cg = this.cc.cG(xaa.c(107535));
            cg.k(true);
            cg.c();
            this.T();
            return;
        }
        final FrameLayout bd2 = this.bD;
        if (bd2 != null) {
            bd2.setVisibility(8);
        }
        this.U();
    }
    
    public final void E(final int n, final boolean b) {
        final CameraView l = this.L;
        l.getClass();
        if (l.K() && this.bN == 0) {
            if (this.aU == -1) {
                if (!this.s.e()) {
                    this.u(2);
                    return;
                }
                if (!vdh.as()) {
                    vdh.bB((Context)this.h, 2132019375, this.cr);
                    return;
                }
                if (vdh.ap() < 5242880L) {
                    vdh.bB((Context)this.h, 2132019376, this.cr);
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
                    final gxg at = this.at;
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
                final gvw ae = this.ae;
                boolean ch;
                final boolean b2 = ch = false;
                if (ae != null) {
                    ch = b2;
                    if (ae.b.getVisibility() == 0) {
                        ch = b2;
                        if (ae.b.getDrawable() != null) {
                            ch = true;
                        }
                    }
                }
                this.ch = ch;
                final CameraView i = this.L;
                i.getClass();
                if (i.P()) {
                    final long a = ((ulb)this.ce.a()).a();
                    final CameraView j = this.L;
                    j.getClass();
                    j.postDelayed((Runnable)new ccm(this, n, 6), a);
                }
                else {
                    this.F(n);
                }
                this.bN = 1;
            }
        }
    }
    
    public final void F(final int n) {
        if (!tpe.bQ((br)this.i)) {
            return;
        }
        final uby i = this.I;
        File t;
        if (i != null) {
            t = i.t();
        }
        else {
            t = null;
        }
        if (t == null) {
            vdh.bB((Context)this.h, 2132019375, this.cr);
            return;
        }
        final gwt g = this.g;
        if (g != null) {
            ((hcd)g).od().getWindow().addFlags(128);
        }
        this.L.getClass();
        final gxc ac = this.ac;
        if (ac != null) {
            final gxb a = ac.a();
            if (a != null) {
                final CameraView l = this.L;
                final float a2 = a.a;
                final rdr h = l.h;
                if (h == null) {
                    ttr.b("Recorder not setup yet.");
                }
                else {
                    h.q = a2;
                }
                this.l.f(1.0f / a.a);
            }
        }
        final CameraView j = this.L;
        final uju uju = new uju(t);
        final int aq = this.aQ;
        final long n2 = this.s.c();
        final long n3 = n;
        boolean b = false;
        Label_0253: {
            if (!this.bg || !this.bG) {
                final hap bq = this.bq;
                if (bq == null || !bq.h()) {
                    b = false;
                    break Label_0253;
                }
            }
            b = true;
        }
        j.C((rcf)uju, (360 - aq) % 360, n2, n3, (rdq)this, b);
        final hap bq2 = this.bq;
        if (bq2 != null) {
            bq2.d();
        }
    }
    
    public final void G(final int au) {
        final CameraView l = this.L;
        l.getClass();
        if (l.L()) {
            this.L.F(au);
            return;
        }
        this.aU = au;
    }
    
    public final void H() {
        final View ab = this.aB;
        if (ab != null) {
            ab.setEnabled(true);
        }
        gxv.c(new View[] { this.K });
        final gvw ae = this.ae;
        if (ae != null) {
            ae.f = false;
            ae.d();
        }
        final gwe j = this.J;
        if (j != null) {
            j.a(true);
        }
        this.t();
        final hdf bc = this.bC;
        if (bc != null) {
            bc.i(this.I);
        }
        final View am = this.aM;
        if (am != null) {
            am.setVisibility(0);
        }
        final View an = this.aN;
        if (an != null) {
            an.setVisibility(0);
        }
        this.bN = 0;
        this.J(true);
        this.f().nL();
    }
    
    public final void I() {
        this.u.execute(aeun.h((Runnable)new dmv(this, this.s.e(), 7)));
        final hdf bc = this.bC;
        alhi a = null;
        final boolean b = true;
        if (bc != null) {
            bc.i(this.I);
            if (bc.c.d > 0) {
                if (bc.m.bA()) {
                    bc.g(true);
                    final ahaz builder = ((ahbh)alhi.a).createBuilder();
                    final ahaz builder2 = ((ahbh)alij.a).createBuilder();
                    final ahaz builder3 = ((ahbh)alhz.a).createBuilder();
                    builder3.copyOnWrite();
                    alhz.a((alhz)builder3.instance);
                    builder2.copyOnWrite();
                    final alij alij = (alij)builder2.instance;
                    final alhz h = (alhz)builder3.build();
                    h.getClass();
                    alij.h = h;
                    alij.b |= 0x40;
                    builder.copyOnWrite();
                    final alhi alhi = (alhi)builder.instance;
                    final alij d = (alij)builder2.build();
                    d.getClass();
                    alhi.D = d;
                    alhi.c |= 0x40000;
                    bc.i = (alhi)builder.build();
                }
                else {
                    bc.g(false);
                }
            }
            else {
                bc.g(true);
                bc.i = null;
            }
        }
        final hdm p = this.p;
        final boolean b2 = ucb.d(p.e.b()) > 0L;
        boolean b3 = false;
        Label_0339: {
            if (!b2 || p.C.bA()) {
                final ucb d2 = p.d;
                if (d2.c > d2.d) {
                    b3 = true;
                    break Label_0339;
                }
            }
            b3 = false;
        }
        p.b.execute(aeun.h((Runnable)new dmv(p, b3, 10)));
        if (b2) {
            final ahaz builder4 = ((ahbh)alhi.a).createBuilder();
            final ahaz builder5 = ((ahbh)alij.a).createBuilder();
            final ahaz builder6 = ((ahbh)alhz.a).createBuilder();
            builder6.copyOnWrite();
            alhz.a((alhz)builder6.instance);
            builder5.copyOnWrite();
            final alij alij2 = (alij)builder5.instance;
            final alhz h2 = (alhz)builder6.build();
            h2.getClass();
            alij2.h = h2;
            alij2.b |= 0x40;
            builder4.copyOnWrite();
            final alhi alhi2 = (alhi)builder4.instance;
            final alij d3 = (alij)builder5.build();
            d3.getClass();
            alhi2.D = d3;
            alhi2.c |= 0x40000;
            a = (alhi)builder4.build();
        }
        p.A = a;
        final gxu bf = this.bF;
        if (bf != null) {
            final boolean bg = this.bG;
            final long d4 = ucb.d((ucd)bf.h);
            final long n = bf.f;
            int n2 = b ? 1 : 0;
            if (!bf.d) {
                if (!bg && d4 <= n) {
                    n2 = (b ? 1 : 0);
                }
                else {
                    n2 = 0;
                }
            }
            final int n3 = 120988;
            if (bg) {
                bf.j.cG(xaa.c(120988)).f();
            }
            int n4 = n3;
            if (bg) {
                n4 = n3;
                if (bf.d) {
                    n4 = 159418;
                }
            }
            final twx cg = bf.j.cG(xaa.c(n4));
            if (n2 != 0) {
                bf.c.setVisibility(0);
                cg.h();
                return;
            }
            bf.c.setVisibility(8);
            cg.f();
        }
    }
    
    public final void J(final boolean b) {
        final CameraView l = this.L;
        l.getClass();
        final boolean m = l.M();
        final FrameLayout aw = this.aw;
        int n = 0;
        if (aw != null) {
            n = n;
            if (aeea.cF((View)aw, m)) {
                n = 1;
            }
        }
        final FrameLayout aw2 = this.aw;
        if (aw2 != null) {
            gxv.b((View)aw2, m);
        }
        if (n != 0 && b) {
            final twx cg = this.cc.cG(xaa.c(96641));
            cg.k(m);
            cg.j();
        }
    }
    
    public final boolean K() {
        return usn.e((Context)this.h, 1) && usn.e((Context)this.h, 2);
    }
    
    public final boolean L() {
        return this.K();
    }
    
    public final boolean M() {
        return this.S() != null;
    }
    
    public final void N() {
        final hap bq = this.bq;
        if (bq != null) {
            bq.b(false);
        }
    }
    
    public final gwu a() {
        return (gwu)new gwl(this, 1);
    }
    
    public final gxd b() {
        if (this.cp == null) {
            this.cp = (gxd)new gwp(this);
        }
        return this.cp;
    }
    
    public final gxf c() {
        if (this.co == null) {
            final Context f = this.F;
            final gxd b = this.b();
            final CameraView l = this.L;
            l.getClass();
            this.co = new gxf(f, b, (ukj)l);
        }
        return this.co;
    }
    
    public final hdm d() {
        return this.p;
    }
    
    public final udd e() {
        return this.D;
    }
    
    final ukh f() {
        if (this.cn == null) {
            this.cn = (ukh)new gwq(this);
        }
        return this.cn;
    }
    
    public final void g() {
        final gvy as = this.aS;
        if (as != null) {
            as.c.post((Runnable)new gsb(as, 7));
        }
    }
    
    public final void h() {
        this.aW.cancel(false);
    }
    
    public final void i(final Object o) {
        this.aI.remove(o);
        if (this.aI.isEmpty()) {
            final gya ah = this.aH;
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
        final gwt g = this.g;
        if (g != null) {
            ((hcd)g).an.g(b);
            this.h();
        }
    }
    
    final void k() {
        final uby i = this.I;
        if (i != null) {
            i.H();
        }
        final hci l = this.l;
        l.c();
        if (l.d) {
            l.e();
        }
        final gwy bs = this.bs;
        if (bs != null) {
            bs.b(0L);
            bs.a();
        }
    }
    
    public final void l() {
        if (this.bU.bJ() && !this.aI.isEmpty()) {
            return;
        }
        final txh bz = this.bz;
        if (bz != null && !((utv)bz).M()) {
            final uby i = this.I;
            if (i != null && i.U()) {
                final txh bz2 = this.bz;
                if (bz2 != null) {
                    ((utv)bz2).K();
                }
            }
            else {
                this.k.d();
                this.j(false);
            }
        }
    }
    
    public final void m() {
        this.T();
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
        gxv.d(new View[] { this.K });
        final gwe j = this.J;
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
    
    public final void onClick(final View view) {
        if (view != this.aC) {
            final FrameLayout bd = this.bD;
            if (bd != null) {
                if (bd.getVisibility() == 0) {
                    return;
                }
            }
        }
        if (view != this.aB && view != this.aC) {
            if (view == this.aA) {
                final gxk by = this.by;
                if (by != null) {
                    if (this.bk && this.i.av()) {
                        ttr.b("Attempted fragment transaction (ShortsGalleryFragment) after ShortsCameraFragment onSaveInstanceState.");
                        zlm.b(zll.a, zlk.f, "[ShortsCreation][Android][Navigation]Attempted fragment transaction (ShortsGalleryFragment) after ShortsCameraFragment onSaveInstanceState.");
                        return;
                    }
                    by.K();
                    this.cc.cG(xaa.c(121257)).d();
                }
            }
            else if (view == this.aq) {
                this.cc.cG(xaa.c(96642)).d();
                final View aq = this.aq;
                if (aq != null) {
                    final PathInterpolator c = apc.c(0.2f, 0.0f, 0.6f, 1.0f);
                    aq.animate().cancel();
                    aq.animate().scaleX(0.9f).scaleY(0.9f).setDuration(100L).setInterpolator((TimeInterpolator)c).withEndAction((Runnable)new ulz(aq, (Interpolator)c, 10)).start();
                }
                final uby i = this.I;
                if (i != null) {
                    i.R();
                }
            }
            else {
                if (view == this.ar) {
                    this.cc.cG(xaa.c(96650)).d();
                    final uby j = this.I;
                    if (j == null) {
                        return;
                    }
                    synchronized (j.c) {
                        if (!j.T()) {
                            return;
                        }
                        j.d.add(j.e.pop());
                        j.M();
                        j.S();
                        return;
                    }
                }
                if (view == this.as) {
                    this.u(1);
                    return;
                }
                if (view == this.al) {
                    this.cc.cG(xaa.c(129088)).d();
                    this.u(6);
                }
            }
            return;
        }
        this.cc.cG(xaa.c(96638)).d();
        this.l();
    }
    
    public final void p(final String bh) {
        final uby i = this.I;
        if (i != null) {
            ((ucd)i).x();
            this.bH = bh;
        }
    }
    
    public final void q() {
        if (this.bp == null) {
            return;
        }
        this.P.getClass();
        this.L.getClass();
        this.K.getClass();
        this.O.getClass();
        if (!this.ci && this.R) {
            Object f;
            if (this.bi) {
                f = new ContextThemeWrapper(this.F, 2132083490);
            }
            else {
                f = this.F;
            }
            (this.cg = (ChooseFilterView)LayoutInflater.from((Context)f).inflate(2131624180, (ViewGroup)null)).e(this.bp, (aun)this.i, this.u);
            final ChooseFilterView cg = this.cg;
            final wyw j = this.j;
            cg.o(j, new zis(j));
            final gwh i = this.i;
            final upw bp = this.bp;
            final ShortsPresetTracker shortsPresetTracker = new ShortsPresetTracker((aun)i, bp, this.bP);
            i.a.b((aum)shortsPresetTracker);
            bp.b((upv)new hkn(shortsPresetTracker, 2));
            bp.a((upi)new hbi(shortsPresetTracker, 8));
            final hbk t = this.t;
            shortsPresetTracker.a = (ubh)t;
            final CreationButtonView q = this.Q;
            if (q != null) {
                final CameraView l = this.L;
                final ChooseFilterView cg2 = this.cg;
                final EffectsFeatureDescriptionView ao = this.ao;
                final aeea cc = this.cc;
                final upw bp2 = this.bp;
                final View k = this.K;
                final MultiSegmentCameraProgressIndicator p = this.P;
                final ShortsRecordButtonView o = this.O;
                t.h = (ShortsIntensitySliderView)LayoutInflater.from((Context)f).inflate(2131625409, (ViewGroup)null);
                t.f = (View)l;
                t.c = cg2;
                t.g = ao;
                t.o = cc;
                if (cg2 != null) {
                    ((FrameLayout)l).addView((View)cg2, 0);
                }
                final cl a = t.a;
                final aeea o2 = t.o;
                Object a2;
                if (o2 == null) {
                    a2 = null;
                }
                else {
                    a2 = o2.a;
                }
                (t.i = new hbj(t, (Context)f, a, (wyw)a2, (Context)f, new View[] { k, (View)p, (View)o })).J(((Context)f).getString(2132017583));
                if (cg2 != null) {
                    cg2.j((urd)t);
                }
                t.d = q;
                t.e = xaa.c(96645);
                final CreationButtonView d = t.d;
                if (d != null) {
                    d.setOnClickListener((View$OnClickListener)new gyj(t, 7));
                }
                bp2.a((upi)new hbi(t, 0));
                t.l = bp2;
                t.j = xaa.c(122656);
                bp2.a((upi)new hbi(t, 2));
            }
            else {
                ttr.b("Can't create chooseFilterController");
            }
            this.ci = true;
        }
        this.r();
        if (!this.ck && this.V) {
            final CreationButtonView w = this.W;
            Label_0680: {
                if (w != null) {
                    final CreationButtonView x = this.X;
                    if (x != null) {
                        final EffectsFeatureDescriptionView ao2 = this.ao;
                        if (ao2 != null) {
                            final Context f2 = this.F;
                            final hao bt = this.bt;
                            bt.getClass();
                            final hbn hbn = new hbn(w, x, ao2, f2, bt, this.cc, null, null, null, null, null, null);
                            this.bw = hbn;
                            hbn.a.setOnClickListener((View$OnClickListener)hbn);
                            hbn.b.setOnClickListener((View$OnClickListener)hbn);
                            final hao c = hbn.c;
                            tbi.f();
                            c.m = hbn;
                            c.l();
                            if (c.k) {
                                hbn.a(c.b, c.c);
                            }
                            hbn.b();
                            break Label_0680;
                        }
                    }
                }
                ttr.b("Can't create shortsCameraEnhanceController");
            }
            this.ck = true;
        }
        if (!this.cj) {
            final ubg m = this.m;
            final upm g = this.G;
            ((upr)g).m = m.g;
            this.E.c(g);
            this.cj = true;
        }
        this.bo = true;
    }
    
    public final void r() {
        if (this.T || this.V || this.U) {
            if (this.bt == null) {
                this.bt = new hao(this.bP, this.u);
            }
            if (this.bu == null) {
                final Context nt = ((br)this.i).nT();
                final Executor u = this.u;
                if (this.ct == null) {
                    this.ct = new pvh(this);
                }
                this.bu = new hau(nt, u, this.ct, null, null, null, null);
                final hao bt = this.bt;
                final upw bp = this.bp;
                bp.getClass();
                final bu h = this.h;
                final hau bu = this.bu;
                tbi.f();
                bt.d = "";
                bt.j();
                bt.a = false;
                bt.l = 1;
                (bt.j = bp).a((upi)new hbi(bt, 1));
                bt.i = bu;
                teu.n((aun)h, bt.n.a(), (ttg)new hai(bt, 4), (ttg)new hai(bt, 5));
                final CameraView l = this.L;
                l.getClass();
                l.h((ukh)this.bu);
                final CameraView i = this.L;
                final hao bt2 = this.bt;
                i.q = (uke)bt2;
                if (i.a) {
                    final ukr j = i.l;
                    if (j != null) {
                        final EGLContext a = j.a();
                        if (a != null && !i.k.getAndSet(true)) {
                            ((uke)bt2).d(a);
                        }
                    }
                }
                else if (i.j != null) {
                    i.o((Runnable)new tei(i, (uke)bt2, 20));
                }
                final uby k = this.I;
                if (k != null) {
                    final hau bu2 = this.bu;
                    bu2.m((Runnable)new gwk(bu2, k, 8));
                }
            }
            final gwy bs = this.bs;
            if (bs != null) {
                bs.b = this.bu;
            }
            final hao bt3 = this.bt;
            final hau bu3 = this.bu;
            this.ao.getClass();
            this.ai.getClass();
            this.aj.getClass();
            if (!this.M() && this.R() == null) {
                final View m = this.K;
                m.getClass();
                final MultiSegmentCameraProgressIndicator p = this.P;
                p.getClass();
                final ShortsRecordButtonView o = this.O;
                o.getClass();
                final CameraView l2 = this.L;
                l2.getClass();
                if (this.cl == null) {
                    final pvh cu = this.cu;
                    this.cl = new hbg((Executor)((eqd)cu.a).a.r.a(), (Executor)((eqd)cu.a).a.g.a(), (AccountId)((eqd)cu.a).b.c.a(), (bu)((eqd)cu.a).c.i.a(), this.cf, new View[] { m, (View)p, (View)o }, this.ai, l2, (View)this.aj, this.ao, this.F, this.cc, bt3, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                }
                this.bq = (hap)this.cl;
            }
            else {
                Uri e;
                if (this.S() != null) {
                    e = this.S();
                }
                else {
                    e = this.R();
                }
                e.getClass();
                final hbp cm = this.cm;
                if (cm == null) {
                    this.cm = new hbp(this.F, bt3, this.ao, e, this.aj, this.cq, bu3, this.cc, (View)this.ai, this.bR.d(), this.bR.c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                }
                else {
                    cm.e = e;
                }
                this.bq = (hap)this.cm;
            }
            final hap bq = this.bq;
            if (this.cs == null) {
                this.cs = new pvh(this);
            }
            bq.l(this.cs);
            final uby i2 = this.I;
            if (i2 != null) {
                this.bq.f(i2);
            }
            final Runnable br = this.br;
            if (br != null) {
                br.run();
                this.br = null;
            }
        }
        final hdf bc = this.bC;
        if (bc != null) {
            bc.i(this.I);
        }
        final gwe j2 = this.J;
        if (j2 != null) {
            j2.b(gyc.a(j2.a));
        }
        final gxc ac = this.ac;
        if (ac != null) {
            ac.i(this.M(), this.I);
        }
        final hap bq2 = this.bq;
        if (bq2 != null) {
            bq2.g();
        }
    }
    
    public final void s(final int n) {
        final uby i = this.I;
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
            this.y.d("shorts-camera-toolbelt-filters-button", (View)this.Q);
            return;
        }
        q.setVisibility(8);
    }
    
    public final void u(final int bn) {
        if (this.bm > 0) {
            final hap bq = this.bq;
            bq.getClass();
            this.C(bq);
            this.bn = bn;
            return;
        }
        final gxp bo = this.bO;
        bo.e = bo.a.b(almx.aU);
        if (this.I == null) {
            ttr.b("Null project state when transitioning to editor - cannot create composed video");
            return;
        }
        if (this.g == null) {
            ttr.b("Null listener can't receive composed video");
            return;
        }
        if (this.bU.bJ()) {
            final uby i = this.I;
            this.C(i);
            i.getClass();
            teu.k(afwm.q(aeun.i((Callable)new gqw(i, 8)), this.v), this.u, (tes)new etf(this, i, 6), (tet)new gwi(this, i, bn));
            return;
        }
        this.x(this.I.c(), bn);
    }
    
    public final void v() {
        this.bq.c(this.L.getWidth(), this.L.getHeight(), this.bv);
        this.bv = false;
    }
    
    public final void w(final qyf qyf, int size) {
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
            vdh.ar((View)o, 2132019714);
        }
        if (qyf != null) {
            Label_0802: {
                Label_0785: {
                    try {
                        final uby i = this.I;
                        if (i == null) {
                            throw new IllegalStateException("Capture completed with null Project State");
                        }
                        if (i.w() != null) {
                            final uby j = this.I;
                            final ahaz builder = ((ahbh)apks.a).createBuilder();
                            final ahaz builder2 = ((ahbh)apkw.a).createBuilder();
                            final float d = qyf.d;
                            builder2.copyOnWrite();
                            final apkw apkw = (apkw)builder2.instance;
                            apkw.b |= 0x1;
                            apkw.c = d;
                            builder.copyOnWrite();
                            final apks apks = (apks)builder.instance;
                            final apkw c = (apkw)builder2.build();
                            c.getClass();
                            apks.c = c;
                            apks.b |= 0x1;
                            if (this.an != -1) {
                                final ahaz builder3 = ((ahbh)apku.a).createBuilder();
                                final ahan b = ahey.b(this.an);
                                builder3.copyOnWrite();
                                final apku apku = (apku)builder3.instance;
                                b.getClass();
                                apku.c = b;
                                apku.b |= 0x1;
                                builder.copyOnWrite();
                                final apks apks2 = (apks)builder.instance;
                                final apku d2 = (apku)builder3.build();
                                d2.getClass();
                                apks2.d = d2;
                                apks2.b |= 0x2;
                            }
                            final boolean ch = this.ch;
                            builder.copyOnWrite();
                            final apks apks3 = (apks)builder.instance;
                            apks3.b |= 0x4;
                            apks3.e = ch;
                            final gwg af = this.af;
                            if (af != null && af.b) {
                                builder.copyOnWrite();
                                final apks apks4 = (apks)builder.instance;
                                apks4.f = 1;
                                apks4.b |= 0x8;
                            }
                            size = qyf.e - 1;
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
                            final apks apks5 = (apks)builder.instance;
                            apks5.g = size - 1;
                            apks5.b |= 0x10;
                            final apks apks6 = (apks)builder.build();
                            final ajmi bg = tpe.bG(this.G.i(), this.bt);
                            final hau bu = this.bu;
                            arbh arbh4;
                            if (bu != null) {
                                final ahaz builder4 = ((ahbh)arbh.a).createBuilder();
                                final hav c2 = bu.c;
                                Label_0685: {
                                    if (c2 != null) {
                                        final Uri b2 = c2.b;
                                        if (b2 != null) {
                                            final long c3 = c2.c;
                                            final long d3 = c2.d;
                                            final String string = b2.toString();
                                            builder4.copyOnWrite();
                                            final arbh arbh = (arbh)builder4.instance;
                                            string.getClass();
                                            arbh.b |= 0x1;
                                            arbh.c = string;
                                            builder4.copyOnWrite();
                                            final arbh arbh2 = (arbh)builder4.instance;
                                            arbh2.b |= 0x4;
                                            arbh2.e = c3;
                                            builder4.copyOnWrite();
                                            final arbh arbh3 = (arbh)builder4.instance;
                                            arbh3.b |= 0x2;
                                            arbh3.d = d3;
                                            arbh4 = (arbh)builder4.build();
                                            break Label_0685;
                                        }
                                    }
                                    arbh4 = (arbh)builder4.build();
                                }
                            }
                            else {
                                arbh4 = null;
                            }
                            size = j.d.size();
                            arbm m;
                            if (apks6 != null) {
                                m = j.m;
                            }
                            else {
                                m = null;
                            }
                            j.X(qyf, apks6, (apkx)null, bg, 2, (arbe)null, arbh4, size, (apkt)null, m);
                            break Label_0802;
                        }
                        throw new IllegalStateException("Capture completed with no pending segment");
                    }
                    catch (final IllegalStateException ex) {
                        break Label_0785;
                    }
                    throw new IllegalStateException("Capture completed with null VideoMetadata");
                }
                final IllegalStateException ex;
                zlm.c(zll.b, zlk.f, "[ShortsCreation][Android][Camera]Could not commit segment", (Throwable)ex);
                this.k();
            }
            final ShortsRecordButtonView o2 = this.O;
            if (o2 != null) {
                o2.h();
            }
            final gxg at = this.at;
            if (at != null) {
                at.c = false;
            }
            if (this.s.e()) {
                this.H();
                return;
            }
            this.u(2);
            return;
        }
        throw new IllegalStateException("Capture completed with null VideoMetadata");
    }
    
    public final void x(final aezp aezp, final int n) {
        if (!aezp.h()) {
            return;
        }
        final gwt g = this.g;
        if (g != null) {
            final ShortsVideoMetadata shortsVideoMetadata = (ShortsVideoMetadata)aezp.c();
            final hcd hcd = (hcd)g;
            hcd.od().getWindow().clearFlags(128);
            hcd.aL(n);
        }
        this.cc.cD(xaa.b(96639)).a();
        this.aT = false;
        final gwe j = this.J;
        if (j != null) {
            j.c = false;
        }
    }
    
    public final void y(final Runnable runnable) {
        this.h.runOnUiThread(aeun.h(runnable));
    }
    
    public final void z() {
        this.U();
        final View ab = this.aB;
        if (ab != null) {
            ab.setVisibility(0);
        }
    }
}
