import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.account.AccountId;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import java.util.Locale;
import android.view.MenuItem;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.engagementpanel.size.EngagementPanelSizeBehavior;
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

public final class gwh extends gxm implements aeou, arlm, aepp, aetq
{
    public final auo a;
    private gww b;
    private Context c;
    private boolean d;
    private final atib e;
    
    @Deprecated
    public gwh() {
        this.a = new auo((aun)this);
        this.e = new atib((br)this);
        qdt.h();
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.e.p();
        try {
            super.K(layoutInflater, viewGroup, bundle);
            final gww a = this.a();
            a.bd = (boolean)((vai)a.bU.b).l(45359680L).aM();
            aoex aoex;
            if ((aoex = ((arwh)a.bU.a).f().z) == null) {
                aoex = aoex.a;
            }
            a.aZ = aoex.d;
            aoex aoex2;
            if ((aoex2 = ((arwh)a.bU.a).f().z) == null) {
                aoex2 = aoex.a;
            }
            a.bc = aoex2.l;
            a.ba = a.bU.bI();
            aoex aoex3;
            if ((aoex3 = ((arwh)a.bU.a).f().z) == null) {
                aoex3 = aoex.a;
            }
            a.aX = aoex3.b;
            a.be = (boolean)((vai)a.bU.c).l(45353729L).aM();
            a.bb = (boolean)((vai)a.bU.b).l(45361220L).aM();
            a.bf = a.bU.bE();
            a.bg = a.bU.bA();
            a.bh = a.bU.by();
            a.bi = a.bU.bz();
            a.bj = a.bU.bB();
            a.bl = (boolean)((vai)a.bU.b).l(45380761L).aM();
            aoex aoex4;
            if ((aoex4 = ((arwh)a.bU.a).f().z) == null) {
                aoex4 = aoex.a;
            }
            a.bk = aoex4.s;
            if (bundle != null) {
                a.bH = bundle.getString("CURRENT_MUSIC_ID_KEY");
                a.bv = bundle.getBoolean("SHOW_GREEN_SCREEN_EDU_KEY");
            }
            final ViewGroup viewGroup2 = (ViewGroup)layoutInflater.inflate(2131625386, viewGroup, false);
            final acwt z = a.z;
            final Object a2 = a.cc.a;
            if (!z.e) {
                z.h((View)viewGroup2);
                z.a.d = (wyw)a2;
            }
            a.aQ = vdh.ao((Activity)a.h);
            a.aJ = (CameraFocusOverlay)viewGroup2.findViewById(2131430830);
            if (a.bl) {
                a.M.g(new xra(a.N), (aenx)new gwr());
            }
            (a.L = (CameraView)viewGroup2.findViewById(2131430841)).h(a.f());
            a.L.setOnTouchListener((View$OnTouchListener)a.c());
            final CameraView l = a.L;
            l.v = true;
            l.u = a.b;
            l.x(a.bR.e());
            a.L.n = a.bR.f();
            a.L.s(a.aQ);
            final CameraView i = a.L;
            i.x = true;
            if (a.bZ == null) {
                a.bZ = new pvh(a);
            }
            i.D = a.bZ;
            i.p = (rdp)a;
            if (a.bV == null) {
                a.bV = new pvh(a);
            }
            i.C = a.bV;
            i.y = a.be;
            a.bD = (FrameLayout)viewGroup2.findViewById(2131427983);
            (a.aC = a.bD.findViewById(2131431440)).setOnClickListener((View$OnClickListener)a);
            tpe.ch(a.bE = a.bT.ap((TextView)a.bD.findViewById(2131427966)), a.F.getString(2132018095), true, 36);
            a.ao = (EffectsFeatureDescriptionView)viewGroup2.findViewById(2131431430);
            a.ao.f = new pvh(a, (byte[])null);
            a.ai = (CreationButtonView)viewGroup2.findViewById(2131431432);
            a.aj = (ShortsCameraToolbarMicButton)viewGroup2.findViewById(2131431433);
            a.K = viewGroup2.findViewById(2131428982);
            (a.P = (MultiSegmentCameraProgressIndicator)viewGroup2.findViewById(2131430661)).c(a.s.c);
            a.O = (ShortsRecordButtonView)viewGroup2.findViewById(2131430794);
            final YouTubeTextView ae = (YouTubeTextView)viewGroup2.findViewById(2131427987);
            ae.getClass();
            a.aE = ae;
            a.aF = viewGroup2.findViewById(2131431435);
            a.aK = viewGroup2.findViewById(2131427988);
            a.aM = viewGroup2.findViewById(2131431451);
            a.aN = viewGroup2.findViewById(2131431427);
            a.aL = (ImageView)viewGroup2.findViewById(2131427965);
            a.ah = (CreationButtonView)viewGroup2.findViewById(2131431421);
            a.al = (CreationButtonView)viewGroup2.findViewById(2131431459);
            if (a.bb) {
                a.al.setOnClickListener((View$OnClickListener)a);
            }
            (a.aG = viewGroup2.findViewById(2131429678)).setOnTouchListener((View$OnTouchListener)gmn.b);
            a.aH = new gya(a.aG);
            a.az = viewGroup2.findViewById(2131431447);
            a.ag = (CreationButtonView)viewGroup2.findViewById(2131431517);
            final View viewById = viewGroup2.findViewById(2131431467);
            Object f;
            if (a.bi) {
                f = new ContextThemeWrapper(a.F, 2132083490);
            }
            else {
                f = a.F;
            }
            final bu h = a.h;
            final CreationButtonView ag = a.ag;
            final aeea cc = a.cc;
            if (a.bY == null) {
                a.bY = new pvh(a);
            }
            final gxj gxj = new gxj((Context)f, h, (View)ag, viewById, cc, a.bY, a.s, a.l, a.o, a.bU, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            gxj.i.g = (uud)gxj;
            gxj.o.f = (utu)gxj;
            gxj.b.setOnClickListener((View$OnClickListener)gxj);
            gxj.g.setOnClickListener((View$OnClickListener)gxj);
            gxj.j.setOnClickListener((View$OnClickListener)gxj);
            aoex aoex5;
            if ((aoex5 = ((arwh)gxj.r.a).f().z) == null) {
                aoex5 = aoex.a;
            }
            if (aoex5.i) {
                gxj.e = gxj.d.b().aH((asjm)new gsa(gxj, 20));
            }
            else {
                gxj.e = null;
            }
            a.am = gxj;
            if (a.bd) {
                a.av = (CreationButtonView)viewGroup2.findViewById(2131431431);
                a.af = new gwg(a.F, (ukj)a.L, a.av, a.cc, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            a.aa = (CreationButtonView)viewGroup2.findViewById(2131431512);
            a.ab = (SegmentedControl)viewGroup2.findViewById(2131430840);
            a.ad = (YouTubeTextView)viewGroup2.findViewById(2131431445);
            final gxc ac = new gxc((Context)a.h, a.aa, a.ab, a.cc, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            ac.b.setOnClickListener((View$OnClickListener)ac);
            ac.a.g = (uud)ac;
            a.ac = ac;
            final gxc ac2 = a.ac;
            ac2.d = (gwz)a;
            a.s.f = ac2.c;
            if (a.aX) {
                a.ae = new gvw((Context)a.h, a.ah, a.aL, a.v, a.u, a.cc, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                if (bundle != null) {
                    a.ae.a(bundle.getBoolean("ALIGN_MODE_ACTIVED_KEY"));
                }
            }
            else {
                ttr.b("Can't create cameraAlignOverlayController");
            }
            if (a.aZ) {
                a.ap = (ShortsZoomSlider)viewGroup2.findViewById(2131431529);
                final ShortsZoomSlider ap = a.ap;
                if (a.bW == null) {
                    a.bW = new pvh(a);
                }
                ap.f = a.bW;
                ap.g = a.cc;
            }
            Object f2;
            if (a.bi) {
                f2 = new ContextThemeWrapper(a.F, 2132083491);
            }
            else {
                f2 = a.F;
            }
            a.by = new gxk((Context)f2, ((br)a.i).og(), a.cc, a.bx, a.A, null, null, null, null, null, null);
            final gxk by = a.by;
            if (a.ca == null) {
                a.ca = new pvh(a);
            }
            by.c = a.ca;
            (a.aq = viewGroup2.findViewById(2131431455)).setOnClickListener((View$OnClickListener)a);
            a.au = (CameraToolbarLayout)viewGroup2.findViewById(2131431448);
            final CameraToolbarLayout au = a.au;
            au.a = new pvh(a, (byte[])null);
            a.E.b((CreationButtonView)au.findViewById(2131428807));
            final uas e = a.E;
            final gwf b = a.B;
            if (b.e == null) {
                b.e = new pvh(b);
            }
            e.f = b.e;
            a.n.b((CreationButtonView)a.au.findViewById(2131429498));
            final uaz n = a.n;
            final gwf b2 = a.B;
            if (b2.f == null) {
                b2.f = new pvh(b2);
            }
            n.c = b2.f;
            final View viewById2 = viewGroup2.findViewById(2131427617);
            final RelativeLayout relativeLayout = (RelativeLayout)viewGroup2.findViewById(2131427616);
            final View k = a.K;
            final MultiSegmentCameraProgressIndicator p3 = a.P;
            final ShortsRecordButtonView o = a.O;
            b2.c = viewById2;
            b2.a.i(relativeLayout, (RelativeLayout)null);
            final toz d = b2.a.D();
            d.g((trk)b2);
            final EngagementPanelSizeBehavior b3 = b2.a.g().b;
            if (b3 != null) {
                b3.w(b2.a.g(), (View)relativeLayout);
                tpe.aF((View)relativeLayout, tpe.ar((aei)b3), (Class)aek.class);
            }
            b2.b.c(b2.a.g().o.am((asjm)new gsa(relativeLayout, 16)));
            b2.b.c(((ashi)b2.a.E().a).am((asjm)new kvy(b2, viewById2, d, new View[] { k, (View)p3, (View)o }, 1)));
            a.aw = (FrameLayout)viewGroup2.findViewById(2131431496);
            final FrameLayout aw = a.aw;
            final CreationButtonView creationButtonView = (CreationButtonView)aw;
            a.ax = creationButtonView.c;
            creationButtonView.d = true;
            a.ay = new gxl(a.F, (ukj)a.L, (View)aw, a.j, a.H);
            a.aA = viewGroup2.findViewById(2131430832);
            a.as = viewGroup2.findViewById(2131431439);
            a.ar = viewGroup2.findViewById(2131431442);
            a.J(false);
            a.aA.setOnClickListener((View$OnClickListener)a);
            a.as.setOnClickListener((View$OnClickListener)a);
            a.ar.setOnClickListener((View$OnClickListener)a);
            a.J = new gwe(a.I, a.s, a.cc, a.az, a.aq, a.as, a.aA, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            (a.aB = viewGroup2.findViewById(2131431428)).setOnClickListener((View$OnClickListener)a);
            if (!(boolean)((vai)a.bU.b).l(45381270L).aM()) {
                new gws().execute((Object[])new gww[] { a });
            }
            a.aV = (FrameLayout)viewGroup2.findViewById(2131430842);
            if (a.ba || a.bc) {
                a.L.T();
                a.L.u(a.G);
            }
            if (a.ba) {
                a.W = (CreationButtonView)viewGroup2.findViewById(2131431444);
                a.X = (CreationButtonView)viewGroup2.findViewById(2131431443);
                a.Q = (CreationButtonView)viewGroup2.findViewById(2131431505);
                a.bp = (upw)((upr)a.G).o(apli.a);
                a.bM.add(a.bp.b((upv)new hkn(a, 1)));
            }
            a.bM.add(a.G.f((upd)new uno(a, 1)));
            a.bs = new gwy(a.u, a.P);
            a.q.h();
            final twx cg = a.cc.cG(xaa.c(99211));
            cg.k(true);
            cg.c();
            if (a.aq != null) {
                final twx cg2 = a.cc.cG(xaa.c(96642));
                cg2.m(a.aq);
                cg2.c();
            }
            if (a.ar != null) {
                final twx cg3 = a.cc.cG(xaa.c(96650));
                cg3.m(a.ar);
                cg3.c();
            }
            final twx cg4 = a.cc.cG(xaa.c(96644));
            final View as = a.as;
            cg4.k(as != null && as.getVisibility() == 0 && a.as.isEnabled());
            cg4.c();
            final twx cg5 = a.cc.cG(xaa.c(98531));
            final View as2 = a.as;
            cg5.k(as2 != null && as2.getVisibility() == 0 && !a.as.isEnabled());
            cg5.c();
            final twx cg6 = a.cc.cG(xaa.c(96643));
            cg6.k(true);
            cg6.c();
            a.cc.cG(xaa.c(96640)).c();
            final twx cg7 = a.cc.cG(xaa.c(96638));
            cg7.k(true);
            cg7.c();
            a.cc.cG(xaa.c(22156)).c();
            a.cc.cG(xaa.c(98571)).c();
            a.cc.cG(xaa.c(96651)).c();
            if (a.bh) {
                a.cc.cG(xaa.c(107611)).c();
            }
            a.cc.cG(xaa.c(115550)).c();
            a.cc.cG(xaa.c(115549)).c();
            a.cc.cG(xaa.c(115552)).c();
            a.cc.cG(xaa.c(115551)).c();
            if (a.aZ) {
                a.cc.cG(ShortsZoomSlider.a()).c();
            }
            a.cc.cG(xaa.c(159418)).c();
            a.cc.cG(xaa.c(120988)).c();
            a.cc.cG(xaa.c(115119)).c();
            final twx cg8 = a.cc.cG(xaa.c(121257));
            final View aa = a.aA;
            cg8.k(aa != null && aa.getVisibility() == 0);
            cg8.c();
            if (a.bb) {
                final twx cg9 = a.cc.cG(xaa.c(129088));
                final CreationButtonView al = a.al;
                cg9.k(al != null && al.getVisibility() == 0);
                cg9.c();
            }
            a.aT = true;
            final gwe j = a.J;
            if (j != null) {
                j.c = true;
            }
            final DurationButtonView y = (DurationButtonView)viewGroup2.findViewById(2131431474);
            y.getClass();
            a.Y = y;
            a.Z = (YouTubeTextView)viewGroup2.findViewById(2131431429);
            if (a.bi && viewGroup2 != null) {
                gww.P(viewGroup2.findViewById(2131428262));
                gww.Q((View)a.au, 0, 0, 2131169599, 0);
                gww.Q(a.aA, 2131169588, 0, 0, 2131169577);
                gww.Q(a.aB, 2131169588, 2131169590, 0, 0);
                gww.Q(viewGroup2.findViewById(2131431434), 0, 2131169631, 0, 0);
                gww.Q((View)a.Y, 0, 2131169631, 2131169682, 0);
                gww.P((View)a.Y);
                gww.Q((View)a.P, 2131169682, 2131169682, 2131169682, 2131169682);
            }
            a.aD = viewGroup2.findViewById(2131431434);
            final CreationButtonView ak = (CreationButtonView)viewGroup2.findViewById(2131431453);
            if (a.bh) {
                a.ak = null;
                ak.f = null;
            }
            else {
                a.ak = ak;
            }
            final CreationButtonView ak2 = a.ak;
            Object o2;
            if (a.bU.br()) {
                o2 = a.w;
            }
            else {
                o2 = a.l;
            }
            final hdm p4 = a.p;
            if (a.bI == null) {
                a.bI = (hdk)new gym(a, 1);
            }
            p4.s((View)ak2, a.bI, xaa.c(107611), false, (ubj)o2, a.aY);
            a.o.e();
            a.o.t(new pvh(a));
            final hnx bq = a.bQ;
            final View ad = a.aD;
            ad.getClass();
            final xab c = xaa.c(96651);
            xab c2;
            if (a.bh) {
                c2 = xaa.c(107611);
            }
            else {
                c2 = null;
            }
            a.bC = bq.a(ad, heb.c(c, c2), true);
            a.bB.c(a.o.b().aI((asjm)new gsa(a, 19), (asjm)gpg.p));
            a.bC.c();
            a.bC.g(true);
            final Context f3 = a.F;
            final YouTubeTextView ae2 = a.aE;
            final acwt z2 = a.z;
            final View viewById3 = viewGroup2.findViewById(2131432128);
            viewById3.getClass();
            a.bF = new gxu(f3, ae2, z2, viewById3, a.Z, a.Y, a.cc, a.bU, a.I, a.s, a.o, a.d, a.e, a.f, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            a.Y.setOnClickListener((View$OnClickListener)a.bF);
            a.B(a.s.c);
            a.aO = (ViewGroup)viewGroup2.findViewById(2131431464);
            a.aP = viewGroup2.findViewById(2131431465);
            a.bB.c(a.k.c().K((asjs)fma.j).aH((asjm)new gsa(a, 18)));
            vdh.aq(a.aV);
            a.q();
            a.t();
            final gxc ac3 = a.ac;
            if (ac3 != null) {
                ac3.i(a.M(), a.I);
            }
            final hdf bc = a.bC;
            bc.getClass();
            bc.i(a.I);
            final acwn y2 = a.y;
            final View ad2 = a.aD;
            ad2.getClass();
            y2.d("shorts-camera-audio-picker-entry-button", ad2);
            final CreationButtonView ag2 = a.ag;
            ag2.getClass();
            ag2.setVisibility(0);
            final pvh cb = a.cb;
            final cl og = ((br)a.i).og();
            if (a.bL == null) {
                a.bL = (txg)new gwm(a);
            }
            final txg bl = a.bL;
            final txe a3 = txf.a();
            a3.e(2131233909);
            a3.f(2132019729);
            a3.b(2131233637);
            a3.c(2132019728);
            a.bz = cb.P(og, bl, a3.a());
            final acsy be = a.bE;
            if (be != null) {
                ((acsx)be).c = (acsw)new ezm(a, 7);
            }
            a.aB.sendAccessibilityEvent(8);
            a.o();
            final gwv accessibilityDelegate = new gwv(a, (View)viewGroup2);
            accessibilityDelegate.a.setAccessibilityDelegate((View$AccessibilityDelegate)accessibilityDelegate);
            if (a.az != null) {
                final gvy as3 = new gvy((aun)a.i, a.cc, a.bP, a.az, new View[] { (View)a.P, a.aB, a.as, a.aq, a.ar, (View)a.Y, a.aF, (View)a.ab, (View)a.O, a.aA }, a.ao, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                as3.d.setOnClickListener((View$OnClickListener)new fup(as3, 19));
                as3.e.setOnClickListener((View$OnClickListener)new fup(as3, 20));
                as3.f.setOnClickListener((View$OnClickListener)new gyj(as3, 1));
                final LinearLayout c3 = as3.c;
                c3.getClass();
                final Resources resources = c3.getResources();
                final int heightPixels = resources.getDisplayMetrics().heightPixels;
                final int n2 = (int)resources.getDimension(2131169577);
                final int n3 = (int)resources.getDimension(2131169584);
                final int n4 = (int)resources.getDimension(2131169622);
                final int n5 = (int)resources.getDimension(2131169618);
                final int n6 = (int)resources.getDimension(2131169621);
                final int n7 = heightPixels / 2;
                final int n8 = (int)resources.getDimension(2131169593);
                final int n9 = (int)resources.getDimension(2131169594);
                final int n10 = n7 - n2 - n3 - n4 - n5 - n6;
                final int n11 = (n10 + n10 + n9) / (n8 + n9);
                final int n12 = 2;
                final int max = Math.max(n11 - 1, 2);
                final bu od = ((br)as3.b).od();
                int round;
                if (od != null) {
                    final Point point = new Point();
                    od.getWindowManager().getDefaultDisplay().getRealSize(point);
                    round = Math.round(point.y / od.getResources().getDisplayMetrics().density);
                }
                else {
                    round = 0;
                }
                int n13;
                if (round <= 624) {
                    n13 = n12;
                }
                else if (round <= 679) {
                    n13 = 3;
                }
                else if (round <= 719) {
                    n13 = 4;
                }
                else if (round <= 767) {
                    n13 = 5;
                }
                else {
                    n13 = 6;
                }
                as3.o = Math.min(max, n13);
                as3.n();
                as3.q.cG(gvy.a).c();
                as3.f((ViewGroup)as3.c);
                as3.k();
                teu.n(as3.b, as3.p.a(), (ttg)etg.o, (ttg)new goe(as3, 8));
                a.aS = as3;
            }
            else {
                ttr.b("Can't create cameraExpandyToolbarController");
            }
            if (a.aR) {
                a.g();
            }
            a.bK = a.a();
            if (!(viewGroup2 instanceof TouchListeningFrameLayout)) {
                zlm.b(zll.b, zlk.f, "[ShortsCreation][Android][Camera]Root layout is not a touch listening layout, cannot initialize suggestion controller.");
            }
            else {
                final udd d2 = a.D;
                final ViewGroup f4 = (ViewGroup)((View)viewGroup2).findViewById(2131431446);
                final pvh m = new pvh(a);
                final ubg m2 = a.m;
                d2.f = f4;
                d2.j = m;
                d2.g = (udc)m2;
                if (d2.i) {
                    d2.b();
                }
                ((TouchListeningFrameLayout)viewGroup2).a = (ttg)new goe(a, 11);
            }
            aeux.k();
            return (View)viewGroup2;
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                gxs.b((Throwable)layoutInflater, t);
            }
        }
    }
    
    public final void T(final Bundle bundle) {
        this.e.p();
        try {
            super.T(bundle);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                gxs.b(t, t2);
            }
        }
    }
    
    public final void U(final int n, final int n2, final Intent intent) {
        final aett k = this.e.k();
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
                gxs.b((Throwable)intent, t);
            }
        }
    }
    
    public final void V(final Activity activity) {
        this.e.p();
        try {
            super.V(activity);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                gxs.b((Throwable)activity, t);
            }
        }
    }
    
    public final void W() {
        final aett e = this.e.e();
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
                gxs.b(t, t2);
            }
        }
    }
    
    public final void Y() {
        this.e.p();
        try {
            super.Y();
            final gww a = this.a();
            final gya ah = a.aH;
            if (ah != null) {
                ah.a();
            }
            final gwy bs = a.bs;
            if (bs != null) {
                bs.a();
            }
            final CameraView l = a.L;
            l.getClass();
            if (l.L()) {
                a.G(1);
                final gwt g = a.g;
                if (g != null) {
                    ((hcd)g).od().getWindow().clearFlags(128);
                }
                a.H();
            }
            final gxj am = a.am;
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
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                gxs.b(t, t2);
            }
        }
    }
    
    public final gww a() {
        final gww b = this.b;
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
        aeux.k();
    }
    
    public final aeup aM() {
        return (aeup)this.e.c;
    }
    
    public final /* bridge */ Object aN() {
        return this.a();
    }
    
    public final Locale aO() {
        return agpi.Z((br)this);
    }
    
    public final void aa() {
        final aett h = this.e.h();
        try {
            super.aa();
            final gww a = this.a();
            if (!a.aI.isEmpty()) {
                final gya ah = a.aH;
                if (ah != null) {
                    ah.b();
                }
            }
            if (!a.K()) {
                a.D(true);
            }
            else {
                a.D(false);
            }
            if (usn.e((Context)a.h, 1)) {
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
                final eg bs = a.bS;
                a.aW = afnd.o((Callable)new gqw(bs, 7, (byte[])null, (byte[])null, (byte[])null), (Executor)bs.b);
                teu.o((aun)a.i, a.aW, (ttg)new goe(a, 9), (ttg)new goe(a, 10));
            }
            final ShortsRecordButtonView o = a.O;
            if (o != null) {
                o.c();
                if (a.bX == null) {
                    a.bX = new pvh(a);
                }
                final pvh bx = a.bX;
                final aeea cc = a.cc;
                final ShortsRecordButtonView o2 = a.O;
                aoex aoex;
                if ((aoex = ((arwh)a.bU.a).f().z) == null) {
                    aoex = aoex.a;
                }
                a.at = new gxg(bx, cc, (View)o2, aoex.c, null, null, null, null, null, null, null);
                a.O.setOnTouchListener((View$OnTouchListener)a.at.a);
            }
            final gxg at = a.at;
            if (at != null) {
                at.d = true;
            }
            final ShortsZoomSlider ap = a.ap;
            if (ap != null) {
                ap.f(tsy.e(((br)a.i).nT()));
            }
            final gxp bo = a.bO;
            final xan c2 = bo.c;
            if (c2 != null) {
                c2.c("aft");
                bo.c = null;
                bo.f = null;
            }
            final CameraView i = a.L;
            i.getClass();
            i.postDelayed((Runnable)new gsb(a, 10), 1000L);
            if (a.bx != -1) {
                final gxk by = a.by;
                if (by != null) {
                    by.K();
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
                gxs.b(t, t2);
            }
        }
    }
    
    public final void ab(final View view, final Bundle bundle) {
        this.e.p();
        aeux.k();
    }
    
    protected final /* bridge */ aepz d() {
        return (aepz)aept.b((br)this);
    }
    
    public final aui getLifecycle() {
        return this.a;
    }
    
    public final void lP(final Context context) {
        this.e.p();
        try {
            if (!this.d) {
                super.lP(context);
                Label_1389: {
                    if (this.b == null) {
                        try {
                            final Object ar = this.aR();
                            final bu bu = (bu)((esr)ar).aN.i.a();
                            final br br = (br)((arlt)((esr)ar).b).a;
                            if (br instanceof gwh) {
                                final gwh gwh = (gwh)br;
                                gwh.getClass();
                                final wyw wyw = (wyw)((esr)ar).h.a();
                                final aeea aeea = (aeea)((esr)ar).i.a();
                                final arkg b = arlr.b(((esr)ar).j);
                                final aujg aujg = (aujg)((esr)ar).a.a.ar.a();
                                final gxp ag = ((esr)ar).aN.ag();
                                final ubu k = ((esr)ar).aN.K();
                                final hci m = ((esr)ar).aN.m();
                                final ubg j = ((esr)ar).aN.J();
                                final uas i = ((esr)ar).aN.I();
                                final uaz ai = ((ubb)((arlm)((aeqe)((esr)ar).aN.g.a()).a()).aR()).ai();
                                ai.getClass();
                                final ubi ubi = (ubi)((esr)ar).aN.I.a();
                                final hdm hdm = (hdm)((esr)ar).n.a();
                                final hnx aa = ((esr)ar).aA();
                                final ueu ueu = (ueu)((esr)ar).aN.N.a();
                                final vcy vcy = (vcy)((esr)ar).aN.k.a();
                                final qqr qqr = (qqr)((esr)ar).a.a.as.a();
                                final ucb ucb = (ucb)((esr)ar).aN.M.a();
                                final hbk hbk = new hbk((bu)((esr)ar).aN.i.a(), (Executor)((esr)ar).a.g.a());
                                final Executor executor = (Executor)((esr)ar).a.g.a();
                                final Executor executor2 = (Executor)((esr)ar).a.r.a();
                                final hcv hcv = (hcv)((esr)ar).m.a();
                                final hbm l = ((esr)ar).aN.l();
                                final acwn acwn = (acwn)((esr)ar).aN.O.a();
                                final acwt acwt = (acwt)((esr)ar).o.a();
                                final AccountId accountId = (AccountId)((esr)ar).aL.c.a();
                                final Context context2 = (Context)((esr)ar).aN.K.a();
                                final afvt afvt = (afvt)((esr)ar).a.r.a();
                                final Executor executor3 = (Executor)((esr)ar).a.g.a();
                                final txz txz = (txz)((esr)ar).p.a();
                                final fzw bg = ((esr)ar).aN.bg();
                                final gxp ag2 = ((esr)ar).aN.ag();
                                final hko hko = (hko)((esr)ar).q.a();
                                final gyf gyf = new gyf(context2, afvt, executor3, bg, ag2, (byte[])null, (byte[])null, (byte[])null);
                                final gwf e = ((gwa)((arlm)((aeqe)((esr)ar).aN.g.a()).a()).aR()).E();
                                e.getClass();
                                final ziy ziy = (ziy)((esr)ar).r.a();
                                final pvh pvh = (pvh)((esr)ar).s.a();
                                final ula g = ((esr)ar).g();
                                final aeea aeea2 = (aeea)((esr)ar).a.kb.a();
                                final eqy a = ((esr)ar).a;
                                final Object a2 = a.qg.a;
                                final Executor executor4 = (Executor)a.r.a();
                                final esr esr = (esr)ar;
                                try {
                                    final eg eg = new eg((Context)a2, executor4, esr.g());
                                    final Context context3 = (Context)((esr)ar).aN.K.a();
                                    final pvh pvh2 = (pvh)((esr)ar).t.a();
                                    final ulc ulc = (ulc)((esr)ar).u.a();
                                    final hzm ar2 = ((esr)ar).aN.aR();
                                    final udd udd = new udd((accf)((esr)ar).aN.o.a(), (acbm)((esr)ar).c.a(), (asid)((esr)ar).a.dP.a(), (aeea)((esr)ar).i.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                                    final aeny aeny = (aeny)((esr)ar).v.a();
                                    final uka ao = ((uko)((arlm)((aeqe)((esr)ar).aN.g.a()).a()).aR()).ao();
                                    ao.getClass();
                                    final gww b2 = new gww(bu, gwh, wyw, aeea, b, aujg, ag, k, m, j, i, ai, ubi, hdm, aa, ueu, vcy, qqr, ucb, hbk, executor, executor2, hcv, (han)l, acwn, acwt, accountId, gyf, e, ziy, pvh, g, aeea2, eg, context3, pvh2, ulc, ar2, udd, aeny, ao, null, null, null, null, null, null, null, null);
                                    this.b = b2;
                                    b2.cd = this;
                                    ((br)this).X.b((aum)new TracedFragmentLifecycle(this.e, this.a, null));
                                    break Label_1389;
                                }
                                finally {}
                            }
                            final String string = gww.class.toString();
                            final String value = String.valueOf(((gwh)br).getClass());
                            final StringBuilder sb = new StringBuilder("Attempt to inject a Fragment wrapper of type ");
                            sb.append(string);
                            sb.append(", but the wrapper available is of type: ");
                            sb.append(value);
                            sb.append(". Does your peer's @Inject constructor reference the wrong wrapper class?");
                            throw new IllegalStateException(sb.toString());
                        }
                        catch (final ClassCastException ex) {
                            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", ex);
                        }
                    }
                }
                final br c = ((br)this).C;
                if (c instanceof aetq) {
                    final atib e2 = this.e;
                    if (e2.c == null) {
                        e2.j(((aetq)c).aM(), true);
                    }
                }
                aeux.k();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        }
        finally {}
        try {
            aeux.k();
        }
        finally {
            final Throwable t;
            gxs.b((Throwable)context, t);
        }
    }
    
    public final Context nT() {
        if (super.nT() != null) {
            if (this.c == null) {
                this.c = (Context)new aepq((br)this, super.nT());
            }
            return this.c;
        }
        return null;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        this.e.p();
        try {
            final LayoutInflater aa = ((br)this).aA();
            final LayoutInflater cloneInContext = aa.cloneInContext((Context)aepz.d(aa, (br)this));
            final LayoutInflater cloneInContext2 = cloneInContext.cloneInContext((Context)new aepq((br)this, cloneInContext));
            aeux.k();
            return cloneInContext2;
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                gxs.b((Throwable)bundle, t);
            }
        }
    }
    
    public final void nm() {
        final aett f = this.e.f();
        try {
            super.nm();
            final gww a = this.a();
            final ArrayList bm = a.bM;
            for (int size = bm.size(), i = 0; i < size; ++i) {
                ((upe)bm.get(i)).a();
            }
            a.bM.clear();
            a.G.j();
            final hdf bc = a.bC;
            if (bc != null) {
                bc.f();
            }
            a.o.k();
            a.p.u();
            final hci l = a.l;
            l.j.w(l.b);
            final bej j = l.j;
            final bgc c = l.c;
            final bga h = ((bex)j).h;
            dk.d((Object)c);
            h.W(c);
            l.j.v();
            l.e = false;
            l.d = false;
            final gxj am = a.am;
            if (am != null) {
                final asir e = am.e;
                if (e != null && !e.tA()) {
                    asjv.b((AtomicReference)am.e);
                }
            }
            final hau bu = a.bu;
            if (bu != null) {
                bu.i.clear();
                bu.j();
                final agto b = bu.b;
                if (b != null) {
                    b.d();
                }
                bu.j = null;
            }
            final EffectsFeatureDescriptionView ao = a.ao;
            if (ao != null) {
                ao.f = null;
            }
            a.E.c((upm)null);
            a.E.b((CreationButtonView)null);
            a.n.b((CreationButtonView)null);
            a.bY = null;
            a.bB.dispose();
            a.y.g("shorts-camera-audio-picker-entry-button");
            a.y.g("shorts-camera-toolbelt-filters-button");
            a.y.g("shorts-camera-toolbelt-green-screen-button");
            a.S = false;
            final udd d = a.D;
            d.f = null;
            d.j = null;
            d.d.dispose();
            if (a.bj) {
                a.z.g();
                final acwt z = a.z;
                z.i();
                z.e = false;
            }
            f.close();
        }
        finally {
            Label_0478: {
                try {
                    f.close();
                    break Label_0478;
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    gxs.b(t, t2);
                }
            }
            while (true) {}
        }
    }
    
    public final void nn() {
        final aett g = this.e.g();
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
                gxs.b(t, t2);
            }
        }
    }
    
    public final void no() {
        this.e.p();
        try {
            super.no();
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                gxs.b(t, t2);
            }
        }
    }
    
    public final void np() {
        this.e.p();
        try {
            super.np();
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                gxs.b(t, t2);
            }
        }
    }
    
    protected final xab o() {
        this.a();
        return xaa.b(96639);
    }
    
    public final void oq(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gwh.e:Latib;
        //     4: invokevirtual   atib.p:()V
        //     7: aload_0        
        //     8: aload_1        
        //     9: invokespecial   gxm.oq:(Landroid/os/Bundle;)V
        //    12: aload_0        
        //    13: invokevirtual   gwh.a:()Lgww;
        //    16: astore_1       
        //    17: aload_1        
        //    18: getfield        gww.i:Lgwh;
        //    21: getfield        br.m:Landroid/os/Bundle;
        //    24: astore_3       
        //    25: aload_3        
        //    26: ifnull          107
        //    29: aload_1        
        //    30: aload_3        
        //    31: ldc_w           "MIRROR_FRONT_CAMERA"
        //    34: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
        //    37: putfield        gww.b:Z
        //    40: aload_1        
        //    41: aload_3        
        //    42: ldc_w           "START_CAMERA_SELECTION"
        //    45: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;)I
        //    48: putfield        gww.c:I
        //    51: aload_1        
        //    52: aload_3        
        //    53: ldc_w           "SHOULD_ANIMATE_TOOLBAR_LABELS_KEY"
        //    56: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
        //    59: putfield        gww.aR:Z
        //    62: aload_1        
        //    63: aload_3        
        //    64: ldc_w           "SEGMENT_IMPORT_RESTORE_POS"
        //    67: iconst_m1      
        //    68: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;I)I
        //    71: putfield        gww.bx:I
        //    74: aload_3        
        //    75: ldc_w           "NAVIGATION_ENDPOINT"
        //    78: invokevirtual   android/os/Bundle.getByteArray:(Ljava/lang/String;)[B
        //    81: astore_3       
        //    82: aload_3        
        //    83: ifnull          107
        //    86: invokestatic    com/google/protobuf/ExtensionRegistryLite.getGeneratedRegistry:()Lcom/google/protobuf/ExtensionRegistryLite;
        //    89: astore          4
        //    91: aload_1        
        //    92: getstatic       aiqj.a:Laiqj;
        //    95: aload_3        
        //    96: aload           4
        //    98: invokestatic    ahbh.parseFrom:(Lahbh;[BLcom/google/protobuf/ExtensionRegistryLite;)Lahbh;
        //   101: checkcast       Laiqj;
        //   104: putfield        gww.aY:Laiqj;
        //   107: aload_1        
        //   108: getfield        gww.m:Lubg;
        //   111: astore          4
        //   113: aload_1        
        //   114: getfield        gww.G:Lupm;
        //   117: astore_3       
        //   118: aload_3        
        //   119: checkcast       Lupr;
        //   122: getfield        upr.a:Luqb;
        //   125: ifnonnull       149
        //   128: aload_3        
        //   129: checkcast       Lupr;
        //   132: getfield        upr.b:Luqp;
        //   135: ifnonnull       149
        //   138: aload_3        
        //   139: aload           4
        //   141: getfield        ubg.a:Luqp;
        //   144: invokeinterface upm.l:(Luqp;)V
        //   149: aload_1        
        //   150: getfield        gww.m:Lubg;
        //   153: astore_3       
        //   154: aload_1        
        //   155: getfield        gww.B:Lgwf;
        //   158: astore          4
        //   160: aload           4
        //   162: getfield        gwf.d:Lpvh;
        //   165: ifnonnull       187
        //   168: new             Lpvh;
        //   171: astore          5
        //   173: aload           5
        //   175: aload           4
        //   177: invokespecial   pvh.<init>:(Lgwf;)V
        //   180: aload           4
        //   182: aload           5
        //   184: putfield        gwf.d:Lpvh;
        //   187: aload_3        
        //   188: aload           4
        //   190: getfield        gwf.d:Lpvh;
        //   193: putfield        ubg.j:Lpvh;
        //   196: aload_3        
        //   197: invokevirtual   ubg.a:()V
        //   200: aload_1        
        //   201: getfield        gww.bU:Laujg;
        //   204: invokevirtual   aujg.bo:()I
        //   207: istore_2       
        //   208: aload_1        
        //   209: iload_2        
        //   210: putfield        gww.d:I
        //   213: aload_1        
        //   214: iload_2        
        //   215: sipush          500
        //   218: iadd           
        //   219: putfield        gww.e:I
        //   222: aload_1        
        //   223: aload_1        
        //   224: getfield        gww.bU:Laujg;
        //   227: invokevirtual   aujg.bn:()I
        //   230: putfield        gww.f:I
        //   233: aload_1        
        //   234: getfield        gww.h:Lbu;
        //   237: aload_1        
        //   238: getfield        gww.i:Lgwh;
        //   241: invokevirtual   br.nZ:()Landroid/content/res/Resources;
        //   244: ldc_w           2131102366
        //   247: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   250: invokestatic    gxs.a:(Lbu;I)V
        //   253: invokestatic    aeux.k:()V
        //   256: return         
        //   257: astore_3       
        //   258: invokestatic    aeux.k:()V
        //   261: goto            270
        //   264: astore_1       
        //   265: aload_3        
        //   266: aload_1        
        //   267: invokestatic    gxs.b:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   270: aload_3        
        //   271: athrow         
        //   272: astore_3       
        //   273: goto            107
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type  
        //  -----  -----  -----  -----  ------
        //  7      25     257    272    Any
        //  29     82     257    272    Any
        //  86     107    272    276    Lahca;
        //  86     107    257    272    Any
        //  107    149    257    272    Any
        //  149    187    257    272    Any
        //  187    253    257    272    Any
        //  258    261    264    270    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0107:
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
    
    protected final aiqj p() {
        return this.a().aY;
    }
    
    protected final wyw pF() {
        return this.a().j;
    }
    
    public final void pP(final Bundle bundle) {
        this.e.p();
        try {
            final gww a = this.a();
            bundle.putString("CURRENT_MUSIC_ID_KEY", a.bH);
            bundle.putBoolean("SHOW_GREEN_SCREEN_EDU_KEY", a.bv);
            final gvw ae = a.ae;
            if (ae != null) {
                bundle.putBoolean("ALIGN_MODE_ACTIVED_KEY", ae.e);
            }
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                gxs.b(t, t2);
            }
        }
    }
    
    protected final alhi sF() {
        final gww a = this.a();
        alhi alhi;
        if (a.q.a() == null) {
            zlm.b(zll.a, zlk.l, "[ShortsCreation][Android][Camera]Frontend id not available for logging");
            alhi = a.H;
        }
        else {
            final ahaz builder = ((ahbh)alhi.a).createBuilder();
            final ahaz builder2 = ((ahbh)alij.a).createBuilder();
            final ahaz builder3 = ((ahbh)alif.a).createBuilder();
            final String a2 = a.q.a();
            a2.getClass();
            builder3.copyOnWrite();
            final alif alif = (alif)builder3.instance;
            alif.b |= 0x1;
            alif.c = a2;
            final alif g = (alif)builder3.build();
            builder2.copyOnWrite();
            final alij alij = (alij)builder2.instance;
            g.getClass();
            alij.g = g;
            alij.b |= 0x20;
            final alij d = (alij)builder2.build();
            builder.copyOnWrite();
            final alhi alhi2 = (alhi)builder.instance;
            d.getClass();
            alhi2.D = d;
            alhi2.c |= 0x40000;
            a.H = (alhi)builder.build();
            alhi = a.H;
        }
        return alhi;
    }
    
    public final void sh(final aeup aeup, final boolean b) {
        this.e.j(aeup, b);
    }
}
