import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import java.util.Locale;
import android.view.MenuItem;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.engagementpanel.size.EngagementPanelSizeBehavior;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.m;
import com.google.android.libraries.youtube.creation.common.ui.TouchListeningFrameLayout;
import android.graphics.Point;
import android.view.View$AccessibilityDelegate;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.DurationButtonView;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.CameraToolbarLayout;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsZoomSlider;
import com.google.android.libraries.youtube.edit.ui.SegmentedControl;
import android.view.ContextThemeWrapper;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ShortsRecordButtonView;
import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsCameraToolbarMicButton;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.EffectsFeatureDescriptionView;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import android.view.View$OnTouchListener;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.libraries.youtube.edit.camera.CameraFocusOverlay;
import android.app.Activity;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvs extends gwy implements aemu, arix, aenp, aerp
{
    public final aun a;
    private gwg b;
    private Context c;
    private boolean d;
    private final athj e;
    
    @Deprecated
    public gvs() {
        this.a = new aun((aum)this);
        this.e = new athj((br)this);
        qcj.s();
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.e.p();
        try {
            super.K(layoutInflater, viewGroup, bundle);
            final gwg a = this.a();
            a.bd = (boolean)((uyi)a.bU.b).l(45359680L).aG();
            aocv aocv;
            if ((aocv = ((arud)a.bU.a).f().z) == null) {
                aocv = aocv.a;
            }
            a.aZ = aocv.d;
            aocv aocv2;
            if ((aocv2 = ((arud)a.bU.a).f().z) == null) {
                aocv2 = aocv.a;
            }
            a.bc = aocv2.l;
            a.ba = a.bU.bJ();
            aocv aocv3;
            if ((aocv3 = ((arud)a.bU.a).f().z) == null) {
                aocv3 = aocv.a;
            }
            a.aX = aocv3.b;
            a.be = (boolean)((uyi)a.bU.c).l(45353729L).aG();
            a.bb = (boolean)((uyi)a.bU.b).l(45361220L).aG();
            a.bf = a.bU.bF();
            a.bg = a.bU.bB();
            a.bh = a.bU.bz();
            a.bi = a.bU.bA();
            a.bj = a.bU.bC();
            a.bk = (boolean)((uyi)a.bU.b).l(45380761L).aG();
            if (bundle != null) {
                a.bG = bundle.getString("CURRENT_MUSIC_ID_KEY");
                a.bu = bundle.getBoolean("SHOW_GREEN_SCREEN_EDU_KEY");
            }
            final ViewGroup viewGroup2 = (ViewGroup)layoutInflater.inflate(2131625381, viewGroup, false);
            final acup a2 = a.A;
            final Object a3 = a.bT.a;
            if (!a2.e) {
                a2.g((View)viewGroup2);
                a2.a.d = (wwv)a3;
            }
            a.aQ = uji.d((Activity)a.h);
            a.aJ = (CameraFocusOverlay)viewGroup2.findViewById(2131430827);
            if (a.bk) {
                a.M.g(new xpb(a.N), (aelx)new gwb());
            }
            (a.L = (CameraView)viewGroup2.findViewById(2131430838)).h(a.f());
            a.L.setOnTouchListener((View$OnTouchListener)a.c());
            final CameraView l = a.L;
            l.v = true;
            l.u = a.b;
            l.x(a.bQ.e());
            a.L.n = a.bQ.f();
            a.L.s(a.aQ);
            final CameraView i = a.L;
            i.x = true;
            if (a.bZ == null) {
                a.bZ = new qpt(a);
            }
            i.E = a.bZ;
            i.p = (uib)a;
            if (a.bV == null) {
                a.bV = new qpt(a);
            }
            i.D = a.bV;
            i.y = a.be;
            a.bC = (FrameLayout)viewGroup2.findViewById(2131427983);
            (a.aC = a.bC.findViewById(2131431437)).setOnClickListener((View$OnClickListener)a);
            tmy.cg(a.bD = a.bS.g((TextView)a.bC.findViewById(2131427966)), a.F.getString(2132018094), true, 36);
            a.ao = (EffectsFeatureDescriptionView)viewGroup2.findViewById(2131431427);
            a.ao.f = new qpt(a, (char[])null);
            a.ai = (CreationButtonView)viewGroup2.findViewById(2131431429);
            a.aj = (ShortsCameraToolbarMicButton)viewGroup2.findViewById(2131431430);
            a.K = viewGroup2.findViewById(2131428982);
            (a.P = (MultiSegmentCameraProgressIndicator)viewGroup2.findViewById(2131430658)).c(a.t.c);
            a.O = (ShortsRecordButtonView)viewGroup2.findViewById(2131430791);
            final YouTubeTextView ae = (YouTubeTextView)viewGroup2.findViewById(2131427987);
            ae.getClass();
            a.aE = ae;
            a.aF = viewGroup2.findViewById(2131431432);
            a.aK = viewGroup2.findViewById(2131427988);
            a.aM = viewGroup2.findViewById(2131431448);
            a.aN = viewGroup2.findViewById(2131431424);
            a.aL = (ImageView)viewGroup2.findViewById(2131427965);
            a.ah = (CreationButtonView)viewGroup2.findViewById(2131431418);
            a.al = (CreationButtonView)viewGroup2.findViewById(2131431456);
            if (a.bb) {
                a.al.setOnClickListener((View$OnClickListener)a);
            }
            (a.aG = viewGroup2.findViewById(2131429678)).setOnTouchListener((View$OnTouchListener)gmg.b);
            a.aH = new gxm(a.aG);
            a.az = viewGroup2.findViewById(2131431444);
            a.ag = (CreationButtonView)viewGroup2.findViewById(2131431514);
            final View viewById = viewGroup2.findViewById(2131431464);
            Object f;
            if (a.bi) {
                f = new ContextThemeWrapper(a.F, 2132083490);
            }
            else {
                f = a.F;
            }
            final bu h = a.h;
            final CreationButtonView ag = a.ag;
            final avt bt = a.bT;
            if (a.bY == null) {
                a.bY = new qpt(a);
            }
            final gwu gwu = new gwu((Context)f, h, (View)ag, viewById, bt, a.bY, a.t, a.l, a.p, a.bU, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            gwu.i.g = (usi)gwu;
            gwu.o.f = (urz)gwu;
            gwu.b.setOnClickListener((View$OnClickListener)gwu);
            gwu.g.setOnClickListener((View$OnClickListener)gwu);
            gwu.j.setOnClickListener((View$OnClickListener)gwu);
            aocv aocv4;
            if ((aocv4 = ((arud)gwu.s.a).f().z) == null) {
                aocv4 = aocv.a;
            }
            if (aocv4.i) {
                gwu.e = gwu.d.b().aB((asix)new grs(gwu, 20));
            }
            else {
                gwu.e = null;
            }
            a.am = gwu;
            if (a.bd) {
                a.av = (CreationButtonView)viewGroup2.findViewById(2131431428);
                a.af = new gvr(a.F, (uin)a.L, a.av, a.bT, (byte[])null, (byte[])null, (byte[])null);
            }
            a.aa = (CreationButtonView)viewGroup2.findViewById(2131431509);
            a.ab = (SegmentedControl)viewGroup2.findViewById(2131430837);
            a.ad = (YouTubeTextView)viewGroup2.findViewById(2131431442);
            final gwn ac = new gwn((Context)a.h, a.aa, a.ab, a.bT, (byte[])null, (byte[])null, (byte[])null);
            ac.b.setOnClickListener((View$OnClickListener)ac);
            ac.a.g = (usi)ac;
            a.ac = ac;
            final gwn ac2 = a.ac;
            ac2.d = (gwk)a;
            a.t.f = ac2.c;
            if (a.aX) {
                a.ae = new gvh((Context)a.h, a.ah, a.aL, a.w, a.v, a.bT, (byte[])null, (byte[])null, (byte[])null);
                if (bundle != null) {
                    a.ae.a(bundle.getBoolean("ALIGN_MODE_ACTIVED_KEY"));
                }
            }
            else {
                trn.b("Can't create cameraAlignOverlayController");
            }
            if (a.aZ) {
                a.ap = (ShortsZoomSlider)viewGroup2.findViewById(2131431526);
                final ShortsZoomSlider ap = a.ap;
                if (a.bW == null) {
                    a.bW = new qpt(a);
                }
                ap.g = a.bW;
                ap.f = a.bT;
            }
            Object f2;
            if (a.bi) {
                f2 = new ContextThemeWrapper(a.F, 2132083491);
            }
            else {
                f2 = a.F;
            }
            a.bx = new gwv((Context)f2, ((br)a.i).og(), a.bT, a.bw, a.B, null, null, null);
            final gwv bx = a.bx;
            if (a.ca == null) {
                a.ca = new qpt(a);
            }
            bx.c = a.ca;
            (a.aq = viewGroup2.findViewById(2131431452)).setOnClickListener((View$OnClickListener)a);
            a.au = (CameraToolbarLayout)viewGroup2.findViewById(2131431445);
            final CameraToolbarLayout au = a.au;
            au.a = new qpt(a, (byte[])null);
            a.n.b((CreationButtonView)au.findViewById(2131428807));
            final typ n = a.n;
            final gvq c = a.C;
            if (c.e == null) {
                c.e = new qpt(c);
            }
            n.e = c.e;
            a.o.b((CreationButtonView)a.au.findViewById(2131429498));
            final tyw o = a.o;
            final gvq c2 = a.C;
            if (c2.f == null) {
                c2.f = new qpt(c2);
            }
            o.c = c2.f;
            final View viewById2 = viewGroup2.findViewById(2131427617);
            final RelativeLayout relativeLayout = (RelativeLayout)viewGroup2.findViewById(2131427616);
            c2.c = viewById2;
            c2.a.i(relativeLayout, (RelativeLayout)null);
            final tmt d = c2.a.D();
            d.g((tpf)c2);
            final EngagementPanelSizeBehavior b = c2.a.g().b;
            if (b != null) {
                b.w(c2.a.g(), (View)relativeLayout);
                tmy.aF((View)relativeLayout, tmy.ar((aeh)b), (Class)aej.class);
            }
            c2.b.c(c2.a.g().o.al((asix)new grs(relativeLayout, 16)));
            c2.b.c(((asgt)c2.a.E().a).al((asix)new gna(c2, viewById2, d, 3)));
            a.aw = (FrameLayout)viewGroup2.findViewById(2131431493);
            final FrameLayout aw = a.aw;
            final CreationButtonView creationButtonView = (CreationButtonView)aw;
            a.ax = creationButtonView.c;
            creationButtonView.d = true;
            a.ay = new gww(a.F, (uin)a.L, (View)aw, a.j, a.H);
            a.aA = viewGroup2.findViewById(2131430829);
            a.as = viewGroup2.findViewById(2131431436);
            a.ar = viewGroup2.findViewById(2131431439);
            a.I(false);
            a.aA.setOnClickListener((View$OnClickListener)a);
            a.as.setOnClickListener((View$OnClickListener)a);
            a.ar.setOnClickListener((View$OnClickListener)a);
            a.J = new gvp(a.I, a.t, a.bT, a.az, a.aq, a.as, a.aA, (byte[])null, (byte[])null, (byte[])null);
            (a.aB = viewGroup2.findViewById(2131431425)).setOnClickListener((View$OnClickListener)a);
            if (!(boolean)((uyi)a.bU.b).l(45381270L).aG()) {
                new gwc().execute((Object[])new gwg[] { a });
            }
            a.aV = (FrameLayout)viewGroup2.findViewById(2131430839);
            if (a.ba || a.bc) {
                a.L.T();
                a.L.u(a.G);
            }
            if (a.ba) {
                a.W = (CreationButtonView)viewGroup2.findViewById(2131431441);
                a.X = (CreationButtonView)viewGroup2.findViewById(2131431440);
                a.Q = (CreationButtonView)viewGroup2.findViewById(2131431502);
                a.bo = (unz)((unu)a.G).p(apje.a);
                a.bL.add(a.bo.b((uny)new hjt(a, 1)));
            }
            a.bL.add(a.G.f((ung)new ulr(a, 1)));
            a.br = new gwj(a.v, a.P);
            a.r.g();
            final tuw s = a.bT.S(wya.c(99211));
            s.k(true);
            s.c();
            if (a.aq != null) {
                final tuw s2 = a.bT.S(wya.c(96642));
                s2.m(a.aq);
                s2.c();
            }
            if (a.ar != null) {
                final tuw s3 = a.bT.S(wya.c(96650));
                s3.m(a.ar);
                s3.c();
            }
            final tuw s4 = a.bT.S(wya.c(96644));
            final View as = a.as;
            s4.k(as != null && as.getVisibility() == 0 && a.as.isEnabled());
            s4.c();
            final tuw s5 = a.bT.S(wya.c(98531));
            final View as2 = a.as;
            s5.k(as2 != null && as2.getVisibility() == 0 && !a.as.isEnabled());
            s5.c();
            final tuw s6 = a.bT.S(wya.c(96643));
            s6.k(true);
            s6.c();
            a.bT.S(wya.c(96640)).c();
            final tuw s7 = a.bT.S(wya.c(96638));
            s7.k(true);
            s7.c();
            a.bT.S(wya.c(22156)).c();
            a.bT.S(wya.c(98571)).c();
            a.bT.S(wya.c(96651)).c();
            if (a.bh) {
                a.bT.S(wya.c(107611)).c();
            }
            a.bT.S(wya.c(115550)).c();
            a.bT.S(wya.c(115549)).c();
            a.bT.S(wya.c(115552)).c();
            a.bT.S(wya.c(115551)).c();
            if (a.aZ) {
                a.bT.S(ShortsZoomSlider.a()).c();
            }
            a.bT.S(wya.c(159418)).c();
            a.bT.S(wya.c(120988)).c();
            a.bT.S(wya.c(115119)).c();
            final tuw s8 = a.bT.S(wya.c(121257));
            final View aa = a.aA;
            s8.k(aa != null && aa.getVisibility() == 0);
            s8.c();
            if (a.bb) {
                final tuw s9 = a.bT.S(wya.c(129088));
                final CreationButtonView al = a.al;
                s9.k(al != null && al.getVisibility() == 0);
                s9.c();
            }
            a.aT = true;
            final gvp j = a.J;
            if (j != null) {
                j.c = true;
            }
            final DurationButtonView y = (DurationButtonView)viewGroup2.findViewById(2131431471);
            y.getClass();
            a.Y = y;
            a.Z = (YouTubeTextView)viewGroup2.findViewById(2131431426);
            if (a.bi && viewGroup2 != null) {
                gwg.O(viewGroup2.findViewById(2131428262));
                gwg.P((View)a.au, 0, 0, 2131169600, 0);
                gwg.P(a.aA, 2131169589, 0, 0, 2131169578);
                gwg.P(a.aB, 2131169589, 2131169591, 0, 0);
                gwg.P(viewGroup2.findViewById(2131431431), 0, 2131169630, 0, 0);
                gwg.P((View)a.Y, 0, 2131169630, 2131169681, 0);
                gwg.O((View)a.Y);
                gwg.P((View)a.P, 2131169681, 2131169681, 2131169681, 2131169681);
            }
            a.aD = viewGroup2.findViewById(2131431431);
            final CreationButtonView ak = (CreationButtonView)viewGroup2.findViewById(2131431450);
            if (a.bh) {
                a.ak = null;
                ak.f = null;
            }
            else {
                a.ak = ak;
            }
            final wyb wyb = null;
            final CreationButtonView ak2 = a.ak;
            Object o2;
            if (a.bU.bs()) {
                o2 = a.x;
            }
            else {
                o2 = a.l;
            }
            final hcu q = a.q;
            if (a.bH == null) {
                a.bH = (hcs)new gxx(a, 1);
            }
            q.s((View)ak2, a.bH, wya.c(107611), false, (tzh)o2, a.aY);
            a.p.e();
            a.p.t(new qpt(a));
            final hnc bo = a.bO;
            final View ad = a.aD;
            ad.getClass();
            final wyb c3 = wya.c(96651);
            wyb c4 = wyb;
            if (a.bh) {
                c4 = wya.c(107611);
            }
            a.bB = bo.a(ad, hxd.g(c3, c4), true);
            a.bA.c(a.p.b().aC((asix)new grs(a, 19), (asix)gpa.q));
            a.bB.c();
            a.bB.g(true);
            final Context f3 = a.F;
            final YouTubeTextView ae2 = a.aE;
            final acup a4 = a.A;
            final View ad2 = a.aD;
            ad2.getClass();
            a.bE = new gxh(f3, ae2, a4, ad2, a.Z, a.Y, a.bT, a.bU, a.I, a.t, a.p, a.d, a.e, a.f, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            a.Y.setOnClickListener((View$OnClickListener)a.bE);
            a.A(a.t.c);
            a.aO = (ViewGroup)viewGroup2.findViewById(2131431461);
            a.aP = viewGroup2.findViewById(2131431462);
            a.bA.c(a.k.c().J((asjd)flu.j).aB((asix)new grs(a, 18)));
            uji.f(a.aV);
            a.q();
            a.t();
            final gwn ac3 = a.ac;
            if (ac3 != null) {
                ac3.i(a.L(), a.I);
            }
            final hcn bb = a.bB;
            bb.getClass();
            bb.i(a.I);
            final acuj z = a.z;
            final View ad3 = a.aD;
            ad3.getClass();
            z.d("shorts-camera-audio-picker-entry-button", ad3);
            final CreationButtonView ag2 = a.ag;
            ag2.getClass();
            ag2.setVisibility(0);
            final qpt cb = a.cb;
            final cl og = ((br)a.i).og();
            if (a.bK == null) {
                a.bK = (tvb)new gvw(a);
            }
            final tvb bk = a.bK;
            final tuz a5 = tva.a();
            a5.e(2131233907);
            a5.f(2132019728);
            a5.b(2131233635);
            a5.c(2132019727);
            a.by = cb.P(og, bk, a5.a());
            final acqu bd = a.bD;
            if (bd != null) {
                ((acqt)bd).c = (acqs)new ezi(a, 7);
            }
            a.aB.sendAccessibilityEvent(8);
            a.o();
            final gwf accessibilityDelegate = new gwf(a, (View)viewGroup2);
            accessibilityDelegate.a.setAccessibilityDelegate((View$AccessibilityDelegate)accessibilityDelegate);
            if (a.az != null) {
                final MultiSegmentCameraProgressIndicator p3 = a.P;
                final View ab = a.aB;
                final View as3 = a.as;
                final View aq = a.aq;
                final View ar = a.ar;
                final DurationButtonView y2 = a.Y;
                final int n2 = 5;
                final gvj as4 = new gvj((aum)a.i, a.bT, a.bR, a.az, new View[] { (View)p3, ab, as3, aq, ar, (View)y2, a.aF, (View)a.ab, (View)a.O, a.aA }, a.ao, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                as4.d.setOnClickListener((View$OnClickListener)new fuh(as4, 19));
                as4.e.setOnClickListener((View$OnClickListener)new fuh(as4, 20));
                as4.f.setOnClickListener((View$OnClickListener)new gxu(as4, 1));
                final LinearLayout c5 = as4.c;
                c5.getClass();
                final Resources resources = c5.getResources();
                final int n3 = resources.getDisplayMetrics().heightPixels / 2 - (int)resources.getDimension(2131169578) - (int)resources.getDimension(2131169585) - (int)resources.getDimension(2131169621) - (int)resources.getDimension(2131169617) - (int)resources.getDimension(2131169620);
                final int n4 = (int)resources.getDimension(2131169594);
                final int n5 = (int)resources.getDimension(2131169595);
                final int max = Math.max((n3 + n3 + n5) / (n4 + n5) - 1, 2);
                final bu od = ((br)as4.b).od();
                int round;
                if (od != null) {
                    final Point point = new Point();
                    od.getWindowManager().getDefaultDisplay().getRealSize(point);
                    round = Math.round(point.y / od.getResources().getDisplayMetrics().density);
                }
                else {
                    round = 0;
                }
                int n6;
                if (round <= 624) {
                    n6 = 2;
                }
                else if (round <= 679) {
                    n6 = 3;
                }
                else if (round <= 719) {
                    n6 = 4;
                }
                else if (round <= 767) {
                    n6 = n2;
                }
                else {
                    n6 = 6;
                }
                as4.o = Math.min(max, n6);
                as4.n();
                as4.q.S(gvj.a).c();
                as4.f((ViewGroup)as4.c);
                as4.k();
                tcp.n(as4.b, as4.p.b(), (trb)etd.n, (trb)new gnx(as4, 8));
                a.aS = as4;
            }
            else {
                trn.b("Can't create cameraExpandyToolbarController");
            }
            if (a.aR) {
                a.g();
            }
            a.bJ = a.a();
            if (!(viewGroup2 instanceof TouchListeningFrameLayout)) {
                zjp.b(zjo.b, zjn.f, "[ShortsCreation][Android][Camera]Root layout is not a touch listening layout, cannot initialize suggestion controller.");
            }
            else {
                final uba e = a.E;
                final ViewGroup f4 = (ViewGroup)((View)viewGroup2).findViewById(2131431443);
                final qpt h2 = new qpt(a);
                final tze m = a.m;
                e.f = f4;
                e.h = h2;
                e.d.c(((asgt)m.f.c).ai().J((asjd)sru.i).W((asjc)tug.c).aa(e.e).aC((asix)new uqp(e, (uaz)m, 1), (asix)com.google.android.apps.youtube.embeddedplayer.service.jar.client.m.m));
                ((TouchListeningFrameLayout)viewGroup2).a = (trb)new gnx(a, 11);
            }
            aesw.k();
            return (View)viewGroup2;
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                hjp.h((Throwable)layoutInflater, t);
            }
        }
    }
    
    public final void T(final Bundle bundle) {
        this.e.p();
        try {
            super.T(bundle);
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                hjp.h((Throwable)bundle, t);
            }
        }
    }
    
    public final void U(final int n, final int n2, final Intent intent) {
        final aers k = this.e.k();
        try {
            super.U(n, n2, intent);
            k.close();
        }
        finally {
            try {
                k.close();
            }
            finally {
                final Throwable t;
                hjp.h((Throwable)intent, t);
            }
        }
    }
    
    public final void V(final Activity activity) {
        this.e.p();
        try {
            super.V(activity);
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hjp.h(t, t2);
            }
        }
    }
    
    public final void W() {
        final aers e = this.e.e();
        try {
            super.W();
            e.close();
        }
        finally {
            try {
                e.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hjp.h(t, t2);
            }
        }
    }
    
    public final void Y() {
        this.e.p();
        try {
            super.Y();
            final gwg a = this.a();
            final gxm ah = a.aH;
            if (ah != null) {
                ah.a();
            }
            final gwj br = a.br;
            if (br != null) {
                br.a();
            }
            final CameraView l = a.L;
            l.getClass();
            if (l.L()) {
                a.F(1);
                final gwd g = a.g;
                if (g != null) {
                    ((hbl)g).od().getWindow().clearFlags(128);
                }
                a.G();
            }
            final gwu am = a.am;
            if (am != null) {
                am.g(false);
            }
            final ShortsZoomSlider ap = a.ap;
            if (ap != null) {
                ap.d();
            }
            final CameraView i = a.L;
            i.getClass();
            i.D();
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hjp.h(t, t2);
            }
        }
    }
    
    public final gwg a() {
        final gwg b = this.b;
        if (b == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.d) {
            return b;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public final void aE(final MenuItem menuItem) {
        this.e.o().close();
    }
    
    public final void aI(final int n, final int n2) {
        this.e.m(n, n2);
        aesw.k();
    }
    
    public final aeso aM() {
        return (aeso)this.e.c;
    }
    
    public final Locale aO() {
        return aesy.a((br)this);
    }
    
    public final void aa() {
        final aers h = this.e.h();
        try {
            super.aa();
            final gwg a = this.a();
            if (!a.aI.isEmpty()) {
                final gxm ah = a.aH;
                if (ah != null) {
                    ah.b();
                }
            }
            if (!a.J()) {
                a.C(true);
            }
            else {
                a.C(false);
            }
            if (uqs.e((Context)a.h, 1)) {
                final CameraView l = a.L;
                l.getClass();
                final int c = a.c;
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            throw new AssertionError(c);
                        }
                        l.A(0);
                    }
                    else {
                        l.A(1);
                    }
                }
                else {
                    l.z();
                }
                a.c = 0;
                final Bundle m = ((br)a.i).m;
                if (m != null) {
                    m.putInt("START_CAMERA_SELECTION", 0);
                }
                a.h();
                final hdv bp = a.bP;
                a.aW = afld.k((Callable)new guf(bp, 6, null, null), (Executor)bp.c);
                tcp.o((aum)a.i, a.aW, (trb)new gnx(a, 9), (trb)new gnx(a, 10));
            }
            final ShortsRecordButtonView o = a.O;
            if (o != null) {
                o.c();
                if (a.bX == null) {
                    a.bX = new qpt(a);
                }
                final qpt bx = a.bX;
                final avt bt = a.bT;
                final ShortsRecordButtonView o2 = a.O;
                aocv aocv;
                if ((aocv = ((arud)a.bU.a).f().z) == null) {
                    aocv = aocv.a;
                }
                a.at = new gwr(bx, bt, (View)o2, aocv.c, null, null, null, null, null);
                a.O.setOnTouchListener((View$OnTouchListener)a.at.a);
            }
            final gwr at = a.at;
            if (at != null) {
                at.d = true;
            }
            final ShortsZoomSlider ap = a.ap;
            if (ap != null) {
                ap.f(tqt.e(((br)a.i).nT()));
            }
            final gxa bn = a.bN;
            final wyn c2 = bn.c;
            if (c2 != null) {
                c2.c("aft");
                bn.c = null;
                bn.f = null;
            }
            final CameraView i = a.L;
            i.getClass();
            i.postDelayed((Runnable)new grt(a, 10), 1000L);
            if (a.bw != -1) {
                final gwv bx2 = a.bx;
                if (bx2 != null) {
                    bx2.K();
                }
            }
            h.close();
        }
        finally {
            try {
                h.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hjp.h(t, t2);
            }
        }
    }
    
    public final void ab(final View view, final Bundle bundle) {
        this.e.p();
        aesw.k();
    }
    
    public final auh getLifecycle() {
        return (auh)this.a;
    }
    
    public final void lP(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gvs.e:Lathj;
        //     4: invokevirtual   athj.p:()V
        //     7: aload_0        
        //     8: getfield        gvs.d:Z
        //    11: ifne            1385
        //    14: aload_0        
        //    15: aload_1        
        //    16: invokespecial   gwy.lP:(Landroid/content/Context;)V
        //    19: aload_0        
        //    20: getfield        gvs.b:Lgwg;
        //    23: astore_1       
        //    24: aload_1        
        //    25: ifnonnull       1341
        //    28: aload_0        
        //    29: invokevirtual   gwy.aR:()Ljava/lang/Object;
        //    32: astore_2       
        //    33: aload_2        
        //    34: checkcast       Leso;
        //    37: getfield        eso.aO:Lesk;
        //    40: getfield        esk.i:Latjj;
        //    43: invokeinterface atjj.a:()Ljava/lang/Object;
        //    48: checkcast       Lbu;
        //    51: astore_1       
        //    52: aload_2        
        //    53: checkcast       Leso;
        //    56: getfield        eso.b:Latjj;
        //    59: checkcast       Larje;
        //    62: getfield        arje.a:Ljava/lang/Object;
        //    65: checkcast       Lbr;
        //    68: astore_3       
        //    69: aload_3        
        //    70: instanceof      Lgvs;
        //    73: ifeq            1250
        //    76: aload_3        
        //    77: checkcast       Lgvs;
        //    80: astore          4
        //    82: aload           4
        //    84: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    87: pop            
        //    88: aload_2        
        //    89: checkcast       Leso;
        //    92: getfield        eso.h:Latjj;
        //    95: invokeinterface atjj.a:()Ljava/lang/Object;
        //   100: checkcast       Lwwv;
        //   103: astore          5
        //   105: aload_2        
        //   106: checkcast       Leso;
        //   109: getfield        eso.i:Latjj;
        //   112: invokeinterface atjj.a:()Ljava/lang/Object;
        //   117: checkcast       Lavt;
        //   120: astore          6
        //   122: aload_2        
        //   123: checkcast       Leso;
        //   126: getfield        eso.j:Latjj;
        //   129: invokestatic    arjc.b:(Latjj;)Larhr;
        //   132: astore          7
        //   134: aload_2        
        //   135: checkcast       Leso;
        //   138: getfield        eso.a:Leqv;
        //   141: getfield        eqv.a:Leqx;
        //   144: getfield        eqx.aq:Latjj;
        //   147: invokeinterface atjj.a:()Ljava/lang/Object;
        //   152: checkcast       Lauip;
        //   155: astore          8
        //   157: aload_2        
        //   158: checkcast       Leso;
        //   161: getfield        eso.aO:Lesk;
        //   164: invokevirtual   esk.af:()Lgxa;
        //   167: astore          9
        //   169: aload_2        
        //   170: checkcast       Leso;
        //   173: getfield        eso.aO:Lesk;
        //   176: invokevirtual   esk.K:()Ltzs;
        //   179: astore          10
        //   181: aload_2        
        //   182: checkcast       Leso;
        //   185: getfield        eso.aO:Lesk;
        //   188: invokevirtual   esk.m:()Lhbr;
        //   191: astore          11
        //   193: aload_2        
        //   194: checkcast       Leso;
        //   197: getfield        eso.aO:Lesk;
        //   200: invokevirtual   esk.J:()Ltze;
        //   203: astore          12
        //   205: aload_2        
        //   206: checkcast       Leso;
        //   209: getfield        eso.aO:Lesk;
        //   212: invokevirtual   esk.I:()Ltyp;
        //   215: astore          13
        //   217: aload_2        
        //   218: checkcast       Leso;
        //   221: getfield        eso.aO:Lesk;
        //   224: getfield        esk.g:Latjj;
        //   227: invokeinterface atjj.a:()Ljava/lang/Object;
        //   232: checkcast       Laeoe;
        //   235: invokevirtual   aeoe.a:()Landroid/content/Context;
        //   238: checkcast       Larix;
        //   241: invokeinterface arix.aR:()Ljava/lang/Object;
        //   246: checkcast       Ltyy;
        //   249: invokeinterface tyy.ah:()Ltyw;
        //   254: astore          14
        //   256: aload           14
        //   258: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   261: pop            
        //   262: aload_2        
        //   263: checkcast       Leso;
        //   266: getfield        eso.aO:Lesk;
        //   269: getfield        esk.J:Latjj;
        //   272: invokeinterface atjj.a:()Ljava/lang/Object;
        //   277: checkcast       Ltzg;
        //   280: astore          15
        //   282: aload_2        
        //   283: checkcast       Leso;
        //   286: getfield        eso.n:Latjj;
        //   289: invokeinterface atjj.a:()Ljava/lang/Object;
        //   294: checkcast       Lhcu;
        //   297: astore          16
        //   299: aload_2        
        //   300: checkcast       Leso;
        //   303: invokevirtual   eso.ax:()Lhnc;
        //   306: astore          17
        //   308: aload_2        
        //   309: checkcast       Leso;
        //   312: getfield        eso.aO:Lesk;
        //   315: getfield        esk.O:Latjj;
        //   318: invokeinterface atjj.a:()Ljava/lang/Object;
        //   323: checkcast       Lucs;
        //   326: astore          18
        //   328: aload_2        
        //   329: checkcast       Leso;
        //   332: getfield        eso.aO:Lesk;
        //   335: getfield        esk.k:Latjj;
        //   338: invokeinterface atjj.a:()Ljava/lang/Object;
        //   343: checkcast       Lvax;
        //   346: astore          19
        //   348: aload_2        
        //   349: checkcast       Leso;
        //   352: getfield        eso.a:Leqv;
        //   355: getfield        eqv.a:Leqx;
        //   358: getfield        eqx.ar:Latjj;
        //   361: invokeinterface atjj.a:()Ljava/lang/Object;
        //   366: checkcast       Laagm;
        //   369: astore_3       
        //   370: aload_2        
        //   371: checkcast       Leso;
        //   374: getfield        eso.aO:Lesk;
        //   377: getfield        esk.N:Latjj;
        //   380: invokeinterface atjj.a:()Ljava/lang/Object;
        //   385: checkcast       Ltzz;
        //   388: astore          20
        //   390: aload_2        
        //   391: checkcast       Leso;
        //   394: getfield        eso.aO:Lesk;
        //   397: getfield        esk.i:Latjj;
        //   400: invokeinterface atjj.a:()Ljava/lang/Object;
        //   405: checkcast       Lbu;
        //   408: astore          21
        //   410: aload_2        
        //   411: checkcast       Leso;
        //   414: getfield        eso.a:Leqv;
        //   417: getfield        eqv.g:Latjj;
        //   420: invokeinterface atjj.a:()Ljava/lang/Object;
        //   425: checkcast       Ljava/util/concurrent/Executor;
        //   428: astore          22
        //   430: new             Lhav;
        //   433: astore          23
        //   435: aload           23
        //   437: aload           21
        //   439: aload           22
        //   441: invokespecial   hav.<init>:(Lbu;Ljava/util/concurrent/Executor;)V
        //   444: aload_2        
        //   445: checkcast       Leso;
        //   448: getfield        eso.a:Leqv;
        //   451: getfield        eqv.g:Latjj;
        //   454: invokeinterface atjj.a:()Ljava/lang/Object;
        //   459: checkcast       Ljava/util/concurrent/Executor;
        //   462: astore          24
        //   464: aload_2        
        //   465: checkcast       Leso;
        //   468: getfield        eso.a:Leqv;
        //   471: getfield        eqv.r:Latjj;
        //   474: invokeinterface atjj.a:()Ljava/lang/Object;
        //   479: checkcast       Ljava/util/concurrent/Executor;
        //   482: astore          25
        //   484: aload_2        
        //   485: checkcast       Leso;
        //   488: getfield        eso.m:Latjj;
        //   491: invokeinterface atjj.a:()Ljava/lang/Object;
        //   496: checkcast       Lhcd;
        //   499: astore          26
        //   501: aload_2        
        //   502: checkcast       Leso;
        //   505: getfield        eso.aO:Lesk;
        //   508: invokevirtual   esk.l:()Lhax;
        //   511: astore          27
        //   513: aload_2        
        //   514: checkcast       Leso;
        //   517: getfield        eso.aO:Lesk;
        //   520: getfield        esk.P:Latjj;
        //   523: invokeinterface atjj.a:()Ljava/lang/Object;
        //   528: checkcast       Lacuj;
        //   531: astore          28
        //   533: aload_2        
        //   534: checkcast       Leso;
        //   537: getfield        eso.o:Latjj;
        //   540: invokeinterface atjj.a:()Ljava/lang/Object;
        //   545: checkcast       Lacup;
        //   548: astore          21
        //   550: aload_2        
        //   551: checkcast       Leso;
        //   554: getfield        eso.aM:Lesr;
        //   557: getfield        esr.c:Latjj;
        //   560: invokeinterface atjj.a:()Ljava/lang/Object;
        //   565: checkcast       Lcom/google/apps/tiktok/account/AccountId;
        //   568: astore          22
        //   570: aload_2        
        //   571: checkcast       Leso;
        //   574: getfield        eso.aO:Lesk;
        //   577: getfield        esk.L:Latjj;
        //   580: invokeinterface atjj.a:()Ljava/lang/Object;
        //   585: checkcast       Landroid/content/Context;
        //   588: astore          29
        //   590: aload_2        
        //   591: checkcast       Leso;
        //   594: getfield        eso.a:Leqv;
        //   597: getfield        eqv.r:Latjj;
        //   600: invokeinterface atjj.a:()Ljava/lang/Object;
        //   605: checkcast       Lafts;
        //   608: astore          30
        //   610: aload_2        
        //   611: checkcast       Leso;
        //   614: getfield        eso.a:Leqv;
        //   617: getfield        eqv.g:Latjj;
        //   620: invokeinterface atjj.a:()Ljava/lang/Object;
        //   625: checkcast       Ljava/util/concurrent/Executor;
        //   628: astore          31
        //   630: aload_2        
        //   631: checkcast       Leso;
        //   634: getfield        eso.p:Latjj;
        //   637: invokeinterface atjj.a:()Ljava/lang/Object;
        //   642: checkcast       Ltvt;
        //   645: astore          32
        //   647: aload_2        
        //   648: checkcast       Leso;
        //   651: getfield        eso.aO:Lesk;
        //   654: invokevirtual   esk.be:()Lfzo;
        //   657: astore          33
        //   659: aload_2        
        //   660: checkcast       Leso;
        //   663: getfield        eso.aO:Lesk;
        //   666: invokevirtual   esk.af:()Lgxa;
        //   669: astore          34
        //   671: aload_2        
        //   672: checkcast       Leso;
        //   675: getfield        eso.q:Latjj;
        //   678: invokeinterface atjj.a:()Ljava/lang/Object;
        //   683: checkcast       Ltyh;
        //   686: astore          35
        //   688: aload_2        
        //   689: checkcast       Leso;
        //   692: getfield        eso.r:Latjj;
        //   695: invokeinterface atjj.a:()Ljava/lang/Object;
        //   700: checkcast       Lhjp;
        //   703: astore          32
        //   705: new             Lgxq;
        //   708: astore          32
        //   710: aload           32
        //   712: aload           29
        //   714: aload           30
        //   716: aload           31
        //   718: aload           33
        //   720: aload           34
        //   722: aload           35
        //   724: aconst_null    
        //   725: aconst_null    
        //   726: aconst_null    
        //   727: invokespecial   gxq.<init>:(Landroid/content/Context;Lafts;Ljava/util/concurrent/Executor;Lfzo;Lgxa;Ltyh;[B[B[B)V
        //   730: aload_2        
        //   731: checkcast       Leso;
        //   734: getfield        eso.aO:Lesk;
        //   737: getfield        esk.g:Latjj;
        //   740: invokeinterface atjj.a:()Ljava/lang/Object;
        //   745: checkcast       Laeoe;
        //   748: invokevirtual   aeoe.a:()Landroid/content/Context;
        //   751: checkcast       Larix;
        //   754: invokeinterface arix.aR:()Ljava/lang/Object;
        //   759: checkcast       Lgvl;
        //   762: invokeinterface gvl.E:()Lgvq;
        //   767: astore          29
        //   769: aload           29
        //   771: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   774: pop            
        //   775: aload_2        
        //   776: checkcast       Leso;
        //   779: getfield        eso.s:Latjj;
        //   782: invokeinterface atjj.a:()Ljava/lang/Object;
        //   787: checkcast       Lzhb;
        //   790: astore          33
        //   792: aload_2        
        //   793: checkcast       Leso;
        //   796: getfield        eso.t:Latjj;
        //   799: invokeinterface atjj.a:()Ljava/lang/Object;
        //   804: checkcast       Lqpt;
        //   807: astore          31
        //   809: aload_2        
        //   810: checkcast       Leso;
        //   813: invokevirtual   eso.f:()Luje;
        //   816: astore          30
        //   818: aload_2        
        //   819: checkcast       Leso;
        //   822: getfield        eso.a:Leqv;
        //   825: getfield        eqv.jW:Latjj;
        //   828: invokeinterface atjj.a:()Ljava/lang/Object;
        //   833: checkcast       Laeby;
        //   836: astore          35
        //   838: aload_2        
        //   839: checkcast       Leso;
        //   842: getfield        eso.a:Leqv;
        //   845: astore          34
        //   847: aload           34
        //   849: getfield        eqv.qg:Laeby;
        //   852: getfield        aeby.a:Ljava/lang/Object;
        //   855: astore          36
        //   857: aload           34
        //   859: getfield        eqv.r:Latjj;
        //   862: invokeinterface atjj.a:()Ljava/lang/Object;
        //   867: checkcast       Ljava/util/concurrent/Executor;
        //   870: astore          37
        //   872: aload_2        
        //   873: checkcast       Leso;
        //   876: astore          34
        //   878: aload           34
        //   880: invokevirtual   eso.f:()Luje;
        //   883: astore          38
        //   885: new             Lhdv;
        //   888: astore          34
        //   890: aload           34
        //   892: aload           36
        //   894: checkcast       Landroid/content/Context;
        //   897: aload           37
        //   899: aload           38
        //   901: invokespecial   hdv.<init>:(Landroid/content/Context;Ljava/util/concurrent/Executor;Luje;)V
        //   904: aload_2        
        //   905: checkcast       Leso;
        //   908: getfield        eso.aO:Lesk;
        //   911: getfield        esk.L:Latjj;
        //   914: invokeinterface atjj.a:()Ljava/lang/Object;
        //   919: checkcast       Landroid/content/Context;
        //   922: astore          39
        //   924: aload_2        
        //   925: checkcast       Leso;
        //   928: getfield        eso.u:Latjj;
        //   931: invokeinterface atjj.a:()Ljava/lang/Object;
        //   936: checkcast       Lqpt;
        //   939: astore          36
        //   941: aload_2        
        //   942: checkcast       Leso;
        //   945: getfield        eso.v:Latjj;
        //   948: invokeinterface atjj.a:()Ljava/lang/Object;
        //   953: checkcast       Lujg;
        //   956: astore          40
        //   958: aload_2        
        //   959: checkcast       Leso;
        //   962: getfield        eso.aO:Lesk;
        //   965: invokevirtual   esk.aQ:()Lhyq;
        //   968: astore          38
        //   970: aload_2        
        //   971: checkcast       Leso;
        //   974: getfield        eso.aO:Lesk;
        //   977: getfield        esk.o:Latjj;
        //   980: invokeinterface atjj.a:()Ljava/lang/Object;
        //   985: checkcast       Lacae;
        //   988: astore          41
        //   990: aload_2        
        //   991: checkcast       Leso;
        //   994: getfield        eso.c:Latjj;
        //   997: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1002: checkcast       Labzk;
        //  1005: astore          42
        //  1007: aload_2        
        //  1008: checkcast       Leso;
        //  1011: getfield        eso.a:Leqv;
        //  1014: getfield        eqv.dO:Latjj;
        //  1017: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1022: checkcast       Lasho;
        //  1025: astore          43
        //  1027: new             Luba;
        //  1030: astore          37
        //  1032: aload           37
        //  1034: aload           41
        //  1036: aload           42
        //  1038: aload           43
        //  1040: invokespecial   uba.<init>:(Lacae;Labzk;Lasho;)V
        //  1043: aload_2        
        //  1044: checkcast       Leso;
        //  1047: getfield        eso.w:Latjj;
        //  1050: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1055: checkcast       Laely;
        //  1058: astore          43
        //  1060: aload_2        
        //  1061: checkcast       Leso;
        //  1064: getfield        eso.aO:Lesk;
        //  1067: getfield        esk.g:Latjj;
        //  1070: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1075: checkcast       Laeoe;
        //  1078: invokevirtual   aeoe.a:()Landroid/content/Context;
        //  1081: checkcast       Larix;
        //  1084: invokeinterface arix.aR:()Ljava/lang/Object;
        //  1089: checkcast       Luis;
        //  1092: invokeinterface uis.an:()Luhz;
        //  1097: astore          42
        //  1099: aload           42
        //  1101: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1104: pop            
        //  1105: new             Lgwg;
        //  1108: astore_2       
        //  1109: aload_2        
        //  1110: aload_1        
        //  1111: aload           4
        //  1113: aload           5
        //  1115: aload           6
        //  1117: aload           7
        //  1119: aload           8
        //  1121: aload           9
        //  1123: aload           10
        //  1125: aload           11
        //  1127: aload           12
        //  1129: aload           13
        //  1131: aload           14
        //  1133: aload           15
        //  1135: aload           16
        //  1137: aload           17
        //  1139: aload           18
        //  1141: aload           19
        //  1143: aload_3        
        //  1144: aload           20
        //  1146: aload           23
        //  1148: aload           24
        //  1150: aload           25
        //  1152: aload           26
        //  1154: aload           27
        //  1156: aload           28
        //  1158: aload           21
        //  1160: aload           22
        //  1162: aload           32
        //  1164: aload           29
        //  1166: aload           33
        //  1168: aload           31
        //  1170: aload           30
        //  1172: aload           35
        //  1174: aload           34
        //  1176: aload           39
        //  1178: aload           36
        //  1180: aload           40
        //  1182: aload           38
        //  1184: aload           37
        //  1186: aload           43
        //  1188: aload           42
        //  1190: aconst_null    
        //  1191: aconst_null    
        //  1192: aconst_null    
        //  1193: aconst_null    
        //  1194: aconst_null    
        //  1195: aconst_null    
        //  1196: aconst_null    
        //  1197: aconst_null    
        //  1198: invokespecial   gwg.<init>:(Lbu;Lgvs;Lwwv;Lavt;Larhr;Lauip;Lgxa;Ltzs;Lhbr;Ltze;Ltyp;Ltyw;Ltzg;Lhcu;Lhnc;Lucs;Lvax;Laagm;Ltzz;Lhav;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lhcd;Lgzw;Lacuj;Lacup;Lcom/google/apps/tiktok/account/AccountId;Lgxq;Lgvq;Lzhb;Lqpt;Luje;Laeby;Lhdv;Landroid/content/Context;Lqpt;Lujg;Lhyq;Luba;Laely;Luhz;[B[B[B[B[B[B[B[B)V
        //  1201: aload_0        
        //  1202: astore_1       
        //  1203: aload_1        
        //  1204: aload_2        
        //  1205: putfield        gvs.b:Lgwg;
        //  1208: aload_2        
        //  1209: aload_1        
        //  1210: putfield        gwg.cc:Lgvs;
        //  1213: aload_1        
        //  1214: getfield        br.X:Laun;
        //  1217: astore_3       
        //  1218: new             Lcom/google/apps/tiktok/inject/baseclasses/TracedFragmentLifecycle;
        //  1221: astore          17
        //  1223: aload           17
        //  1225: aload_1        
        //  1226: getfield        gvs.e:Lathj;
        //  1229: aload_1        
        //  1230: getfield        gvs.a:Laun;
        //  1233: aconst_null    
        //  1234: invokespecial   com/google/apps/tiktok/inject/baseclasses/TracedFragmentLifecycle.<init>:(Lathj;Laun;[B)V
        //  1237: aload_3        
        //  1238: aload           17
        //  1240: invokevirtual   auh.b:(Laul;)V
        //  1243: goto            1341
        //  1246: astore_1       
        //  1247: goto            1403
        //  1250: new             Ljava/lang/IllegalStateException;
        //  1253: astore_1       
        //  1254: ldc             Lgwg;.class
        //  1256: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  1259: astore          17
        //  1261: aload_3        
        //  1262: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1265: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1268: astore_3       
        //  1269: new             Ljava/lang/StringBuilder;
        //  1272: astore          8
        //  1274: aload           8
        //  1276: ldc_w           "Attempt to inject a Fragment wrapper of type "
        //  1279: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1282: aload           8
        //  1284: aload           17
        //  1286: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1289: pop            
        //  1290: aload           8
        //  1292: ldc_w           ", but the wrapper available is of type: "
        //  1295: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1298: pop            
        //  1299: aload           8
        //  1301: aload_3        
        //  1302: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1305: pop            
        //  1306: aload           8
        //  1308: ldc_w           ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //  1311: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1314: pop            
        //  1315: aload_1        
        //  1316: aload           8
        //  1318: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1321: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1324: aload_1        
        //  1325: athrow         
        //  1326: astore_1       
        //  1327: new             Ljava/lang/IllegalStateException;
        //  1330: astore_3       
        //  1331: aload_3        
        //  1332: ldc_w           "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //  1335: aload_1        
        //  1336: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1339: aload_3        
        //  1340: athrow         
        //  1341: aload_0        
        //  1342: astore_1       
        //  1343: aload_1        
        //  1344: getfield        br.C:Lbr;
        //  1347: astore_3       
        //  1348: aload_3        
        //  1349: instanceof      Laerp;
        //  1352: ifeq            1381
        //  1355: aload_1        
        //  1356: getfield        gvs.e:Lathj;
        //  1359: astore_1       
        //  1360: aload_1        
        //  1361: getfield        athj.c:Ljava/lang/Object;
        //  1364: ifnonnull       1381
        //  1367: aload_1        
        //  1368: aload_3        
        //  1369: checkcast       Laerp;
        //  1372: invokeinterface aerp.aM:()Laeso;
        //  1377: iconst_1       
        //  1378: invokevirtual   athj.j:(Laeso;Z)V
        //  1381: invokestatic    aesw.k:()V
        //  1384: return         
        //  1385: new             Ljava/lang/IllegalStateException;
        //  1388: astore_1       
        //  1389: aload_1        
        //  1390: ldc_w           "A Fragment cannot be attached more than once. Instead, create a new Fragment instance."
        //  1393: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1396: aload_1        
        //  1397: athrow         
        //  1398: astore_1       
        //  1399: goto            1403
        //  1402: astore_1       
        //  1403: invokestatic    aesw.k:()V
        //  1406: goto            1415
        //  1409: astore_3       
        //  1410: aload_1        
        //  1411: aload_3        
        //  1412: invokestatic    hjp.h:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //  1415: aload_1        
        //  1416: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  7      24     1402   1403   Any
        //  28     33     1326   1341   Ljava/lang/ClassCastException;
        //  28     33     1402   1403   Any
        //  33     878    1402   1403   Any
        //  878    1201   1246   1250   Any
        //  1203   1243   1398   1402   Any
        //  1250   1326   1398   1402   Any
        //  1327   1341   1398   1402   Any
        //  1343   1381   1398   1402   Any
        //  1385   1398   1398   1402   Any
        //  1403   1406   1409   1415   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1250:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    protected final wwv n() {
        return this.a().j;
    }
    
    public final Context nT() {
        if (super.nT() != null) {
            if (this.c == null) {
                this.c = (Context)new aenq((br)this, super.nT());
            }
            return this.c;
        }
        return null;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        this.e.p();
        try {
            final LayoutInflater aa = ((br)this).aA();
            final LayoutInflater cloneInContext = aa.cloneInContext((Context)aenz.d(aa, (br)this));
            final LayoutInflater cloneInContext2 = cloneInContext.cloneInContext((Context)new aenq((br)this, cloneInContext));
            aesw.k();
            return cloneInContext2;
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hjp.h(t, t2);
            }
        }
    }
    
    public final void nm() {
        final aers f = this.e.f();
        try {
            super.nm();
            final gwg a = this.a();
            final ArrayList bl = a.bL;
            for (int size = bl.size(), i = 0; i < size; ++i) {
                ((unh)bl.get(i)).a();
            }
            a.bL.clear();
            a.G.j();
            final hcn bb = a.bB;
            if (bb != null) {
                bb.f();
            }
            a.p.k();
            a.q.u();
            final hbr l = a.l;
            l.j.w(l.b);
            final bei j = l.j;
            final bgb c = l.c;
            final bfz h = ((bew)j).h;
            dk.d((Object)c);
            h.W(c);
            l.j.v();
            l.e = false;
            l.d = false;
            final gwu am = a.am;
            if (am != null) {
                final asic e = am.e;
                if (e != null && !e.tx()) {
                    asjg.b((AtomicReference)am.e);
                }
            }
            final had bt = a.bt;
            if (bt != null) {
                bt.i.clear();
                bt.j();
                final agrp b = bt.b;
                if (b != null) {
                    b.d();
                }
                bt.j = null;
            }
            final EffectsFeatureDescriptionView ao = a.ao;
            if (ao != null) {
                ao.f = null;
            }
            final typ n = a.n;
            n.c = null;
            n.b((CreationButtonView)null);
            a.o.b((CreationButtonView)null);
            a.bY = null;
            a.bA.dispose();
            a.z.g("shorts-camera-audio-picker-entry-button");
            a.z.g("shorts-camera-toolbelt-filters-button");
            a.z.g("shorts-camera-toolbelt-green-screen-button");
            a.S = false;
            final uba e2 = a.E;
            e2.f = null;
            e2.h = null;
            e2.d.dispose();
            if (a.bj) {
                a.A.f();
                final acup a2 = a.A;
                a2.h();
                a2.e = false;
            }
            f.close();
        }
        finally {
            Label_0425: {
                try {
                    f.close();
                    break Label_0425;
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    hjp.h(t, t2);
                }
            }
            while (true) {}
        }
    }
    
    public final void nn() {
        final aers g = this.e.g();
        try {
            super.nn();
            this.d = true;
            g.close();
        }
        finally {
            try {
                g.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hjp.h(t, t2);
            }
        }
    }
    
    public final void no() {
        this.e.p();
        try {
            super.no();
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hjp.h(t, t2);
            }
        }
    }
    
    public final void np() {
        this.e.p();
        try {
            super.np();
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hjp.h(t, t2);
            }
        }
    }
    
    protected final wyb o() {
        this.a();
        return wya.b(96639);
    }
    
    public final void oq(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gvs.e:Lathj;
        //     4: invokevirtual   athj.p:()V
        //     7: aload_0        
        //     8: aload_1        
        //     9: invokespecial   gwy.oq:(Landroid/os/Bundle;)V
        //    12: aload_0        
        //    13: invokevirtual   gvs.a:()Lgwg;
        //    16: astore_1       
        //    17: aload_1        
        //    18: getfield        gwg.i:Lgvs;
        //    21: getfield        br.m:Landroid/os/Bundle;
        //    24: astore_2       
        //    25: aload_2        
        //    26: ifnull          105
        //    29: aload_1        
        //    30: aload_2        
        //    31: ldc_w           "MIRROR_FRONT_CAMERA"
        //    34: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
        //    37: putfield        gwg.b:Z
        //    40: aload_1        
        //    41: aload_2        
        //    42: ldc_w           "START_CAMERA_SELECTION"
        //    45: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;)I
        //    48: putfield        gwg.c:I
        //    51: aload_1        
        //    52: aload_2        
        //    53: ldc_w           "SHOULD_ANIMATE_TOOLBAR_LABELS_KEY"
        //    56: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
        //    59: putfield        gwg.aR:Z
        //    62: aload_1        
        //    63: aload_2        
        //    64: ldc_w           "SEGMENT_IMPORT_RESTORE_POS"
        //    67: iconst_m1      
        //    68: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;I)I
        //    71: putfield        gwg.bw:I
        //    74: aload_2        
        //    75: ldc_w           "NAVIGATION_ENDPOINT"
        //    78: invokevirtual   android/os/Bundle.getByteArray:(Ljava/lang/String;)[B
        //    81: astore_3       
        //    82: aload_3        
        //    83: ifnull          105
        //    86: invokestatic    com/google/protobuf/ExtensionRegistryLite.getGeneratedRegistry:()Lcom/google/protobuf/ExtensionRegistryLite;
        //    89: astore_2       
        //    90: aload_1        
        //    91: getstatic       aioe.a:Laioe;
        //    94: aload_3        
        //    95: aload_2        
        //    96: invokestatic    agzi.parseFrom:(Lagzi;[BLcom/google/protobuf/ExtensionRegistryLite;)Lagzi;
        //    99: checkcast       Laioe;
        //   102: putfield        gwg.aY:Laioe;
        //   105: aload_1        
        //   106: getfield        gwg.m:Ltze;
        //   109: astore_2       
        //   110: aload_1        
        //   111: getfield        gwg.G:Lunp;
        //   114: astore_3       
        //   115: aload_3        
        //   116: checkcast       Lunu;
        //   119: getfield        unu.a:Luoe;
        //   122: ifnonnull       145
        //   125: aload_3        
        //   126: checkcast       Lunu;
        //   129: getfield        unu.b:Luos;
        //   132: ifnonnull       145
        //   135: aload_3        
        //   136: aload_2        
        //   137: getfield        tze.a:Luos;
        //   140: invokeinterface unp.m:(Luos;)V
        //   145: aload_1        
        //   146: getfield        gwg.m:Ltze;
        //   149: astore_2       
        //   150: aload_1        
        //   151: getfield        gwg.C:Lgvq;
        //   154: astore          4
        //   156: aload           4
        //   158: getfield        gvq.d:Lqpt;
        //   161: ifnonnull       180
        //   164: new             Lqpt;
        //   167: astore_3       
        //   168: aload_3        
        //   169: aload           4
        //   171: invokespecial   qpt.<init>:(Lgvq;)V
        //   174: aload           4
        //   176: aload_3        
        //   177: putfield        gvq.d:Lqpt;
        //   180: aload_2        
        //   181: aload           4
        //   183: getfield        gvq.d:Lqpt;
        //   186: putfield        tze.j:Lqpt;
        //   189: aload_2        
        //   190: invokevirtual   tze.a:()V
        //   193: aload_1        
        //   194: getfield        gwg.bU:Lauip;
        //   197: invokevirtual   auip.bp:()I
        //   200: istore          5
        //   202: aload_1        
        //   203: iload           5
        //   205: putfield        gwg.d:I
        //   208: aload_1        
        //   209: iload           5
        //   211: sipush          500
        //   214: iadd           
        //   215: putfield        gwg.e:I
        //   218: aload_1        
        //   219: aload_1        
        //   220: getfield        gwg.bU:Lauip;
        //   223: invokevirtual   auip.bo:()I
        //   226: putfield        gwg.f:I
        //   229: aload_1        
        //   230: getfield        gwg.h:Lbu;
        //   233: aload_1        
        //   234: getfield        gwg.i:Lgvs;
        //   237: invokevirtual   br.nZ:()Landroid/content/res/Resources;
        //   240: ldc_w           2131102338
        //   243: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   246: invokestatic    hjp.f:(Lbu;I)V
        //   249: invokestatic    aesw.k:()V
        //   252: return         
        //   253: astore_1       
        //   254: invokestatic    aesw.k:()V
        //   257: goto            266
        //   260: astore_2       
        //   261: aload_1        
        //   262: aload_2        
        //   263: invokestatic    hjp.h:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   266: aload_1        
        //   267: athrow         
        //   268: astore_2       
        //   269: goto            105
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type  
        //  -----  -----  -----  -----  ------
        //  7      25     253    268    Any
        //  29     82     253    268    Any
        //  86     105    268    272    Lahab;
        //  86     105    253    268    Any
        //  105    145    253    268    Any
        //  145    180    253    268    Any
        //  180    249    253    268    Any
        //  254    257    260    266    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0105:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    protected final aioe p() {
        return this.a().aY;
    }
    
    public final void pK(final Bundle bundle) {
        this.e.p();
        try {
            final gwg a = this.a();
            bundle.putString("CURRENT_MUSIC_ID_KEY", a.bG);
            bundle.putBoolean("SHOW_GREEN_SCREEN_EDU_KEY", a.bu);
            final gvh ae = a.ae;
            if (ae != null) {
                bundle.putBoolean("ALIGN_MODE_ACTIVED_KEY", ae.e);
            }
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                hjp.h((Throwable)bundle, t);
            }
        }
    }
    
    public final void sb(final aeso aeso, final boolean b) {
        this.e.j(aeso, b);
    }
    
    protected final alff sz() {
        final gwg a = this.a();
        alff alff;
        if (a.r.a() == null) {
            zjp.b(zjo.a, zjn.l, "[ShortsCreation][Android][Camera]Frontend id not available for logging");
            alff = a.H;
        }
        else {
            final agza builder = ((agzi)alff.a).createBuilder();
            final agza builder2 = ((agzi)algf.a).createBuilder();
            final agza builder3 = ((agzi)algb.a).createBuilder();
            final String a2 = a.r.a();
            a2.getClass();
            builder3.copyOnWrite();
            final algb algb = (algb)builder3.instance;
            algb.b |= 0x1;
            algb.c = a2;
            final algb g = (algb)builder3.build();
            builder2.copyOnWrite();
            final algf algf = (algf)builder2.instance;
            g.getClass();
            algf.g = g;
            algf.b |= 0x20;
            final algf d = (algf)builder2.build();
            builder.copyOnWrite();
            final alff alff2 = (alff)builder.instance;
            d.getClass();
            alff2.D = d;
            alff2.c |= 0x40000;
            a.H = (alff)builder.build();
            alff = a.H;
        }
        return alff;
    }
}
