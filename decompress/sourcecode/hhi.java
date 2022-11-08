import android.view.View$OnLayoutChangeListener;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.m;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import android.view.WindowManager$LayoutParams;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.ChangeBounds;
import android.transition.TransitionSet;
import android.util.DisplayMetrics;
import android.content.Context;
import android.view.ViewConfiguration;
import java.io.IOException;
import android.graphics.Bitmap$CompressFormat;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import android.graphics.Bitmap;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import android.util.Property;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup$LayoutParams;
import android.view.Display;
import java.util.ArrayList;
import android.graphics.Point;
import android.view.WindowManager;
import android.view.View$OnTouchListener;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewPropertyAnimator;
import android.os.AsyncTask$Status;
import android.os.Bundle;
import android.animation.ObjectAnimator;
import com.google.android.libraries.youtube.edit.camera.CameraFocusOverlay;
import android.widget.TextView;
import android.support.constraint.ConstraintLayout;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import java.io.File;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.extensions.reel.util.ReelPresetTracker;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.RecordButtonView;
import android.os.CountDownTimer;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hhi extends hgs implements View$OnClickListener, uil, uix, hit, uih, wwu, uic
{
    private static final uqr aG;
    int a;
    public uyf aA;
    public uyi aB;
    public aagm aC;
    public arud aD;
    public avt aE;
    public aeby aF;
    private boolean aH;
    private int aI;
    private airb aJ;
    private CountDownTimer aK;
    private final unp aL;
    private boolean aM;
    private RecordButtonView aN;
    private View aO;
    private ImageView aP;
    private ViewGroup aQ;
    private ChooseFilterView aR;
    private ChooseFilterView aS;
    private View aT;
    private hgz aU;
    private hgz aV;
    private hgy aW;
    private ReelPresetTracker aX;
    private ImageView aY;
    private uip aZ;
    public uqq ae;
    public Executor af;
    public uje ag;
    public hjl ah;
    final asib ai;
    public boolean aj;
    public float ak;
    public boolean al;
    public File am;
    public CameraView an;
    public hiu ao;
    public boolean ap;
    public ProgressBar aq;
    public ImageView ar;
    public int as;
    public ImageView at;
    public FrameLayout au;
    public FrameLayout av;
    public ConstraintLayout aw;
    public FrameLayout ax;
    public TextView ay;
    public uql az;
    public hhg b;
    private ImageView ba;
    private uiw bb;
    private View bc;
    private View bd;
    private ImageView be;
    private CameraFocusOverlay bf;
    private upy bg;
    private ImageView bh;
    private ObjectAnimator bi;
    private ObjectAnimator bj;
    private ObjectAnimator bk;
    private int bl;
    private hhh bm;
    private aioe bn;
    private int bo;
    private final Runnable bp;
    public wwv c;
    public arhr d;
    public udl e;
    
    static {
        final afcr u = afcr.u((Object)uqj.a, (Object)uqj.b, (Object)uqj.c, (Object)uqj.d);
        if (u != null) {
            aG = new uqr(u);
            return;
        }
        throw new NullPointerException("Null albumTypeList");
    }
    
    public hhi() {
        this.ai = new asib();
        this.aL = unu.o();
        this.ak = 0.0f;
        this.al = true;
        this.aM = false;
        this.bo = 0;
        this.bp = (Runnable)new hcp(this, 7);
    }
    
    static final ChooseFilterView ba(final View view) {
        return (ChooseFilterView)view.findViewById(2131428192);
    }
    
    static final ChooseFilterView bb(final View view) {
        return (ChooseFilterView)view.findViewById(2131428194);
    }
    
    public static hhi bc(final int n, final int n2, final airb airb, final uoe uoe, final uos uos, final boolean b, final aioe aioe) {
        int n3 = n;
        if (n != 0) {
            n3 = 1;
        }
        agot.v(true, (Object)"startCameraSelection must be one of @StartCameraSelection values");
        final hhi hhi = new hhi();
        final Bundle bundle = new Bundle();
        bundle.putInt("VIDEO_TIME_LIMIT_MSECS", n2);
        bundle.putBoolean("MIRROR_FRONT_CAMERA", true);
        bundle.putInt("START_CAMERA_SELECTION", n3);
        bundle.putByteArray("navigation_endpoint", ((agxl)aioe).toByteArray());
        if (airb != null) {
            bundle.putByteArray("COMMENT_STICKER_RENDERER_KEY", ((agxl)airb).toByteArray());
        }
        bundle.putBoolean("SWIPE_TO_CAMERA_ENABLED", b);
        hhi.aS(uoe);
        hhi.aU(uos);
        ((br)hhi).ag(bundle);
        return hhi;
    }
    
    private final void bd() {
        final hhh bm = this.bm;
        if (bm != null && bm.getStatus() != AsyncTask$Status.FINISHED) {
            this.bm.cancel(true);
            this.bm = null;
        }
    }
    
    private final void be(final int n) {
        this.an.F(n);
    }
    
    private final void bf() {
        if (this.an.M()) {
            this.ba.setVisibility(0);
            return;
        }
        this.ba.setVisibility(8);
    }
    
    private final boolean bg(final apje apje) {
        if (apje.c.equals((Object)apje)) {
            final ReelPresetTracker ax = this.aX;
            if (ax != null && !ax.g) {
                return true;
            }
        }
        return false;
    }
    
    private final ViewPropertyAnimator bh(final boolean b) {
        this.bc.animate().cancel();
        float n;
        if (b) {
            n = 0.0f;
        }
        else {
            n = -((br)this).nZ().getDimension(2131168808);
        }
        return this.bc.animate().translationY(n).setDuration(250L);
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.K(layoutInflater, viewGroup, bundle);
        final int n = 0;
        final ViewGroup viewGroup2 = (ViewGroup)layoutInflater.inflate(2131625189, viewGroup, false);
        final bu od = ((br)this).od();
        int as;
        if (od == null) {
            as = this.as;
        }
        else {
            as = uji.d((Activity)od);
        }
        this.as = as;
        this.bf = (CameraFocusOverlay)viewGroup2.findViewById(2131430827);
        (this.an = (CameraView)viewGroup2.findViewById(2131430838)).h((uil)this);
        this.an.setOnTouchListener((View$OnTouchListener)new hjb(((br)this).nT(), (uix)this, (uin)this.an));
        final CameraView an = this.an;
        an.u = this.aH;
        an.x(5);
        this.an.s(this.as);
        this.aN = (RecordButtonView)viewGroup2.findViewById(2131430791);
        final hiu hiu = new hiu((hit)this, (View)this.aN, false, false);
        this.ao = hiu;
        this.aN.setOnTouchListener((View$OnTouchListener)hiu);
        this.aN.findViewById(2131430836).setContentDescription((CharSequence)((br)this).P(2132019385));
        this.aO = viewGroup2.findViewById(2131430825);
        this.aP = (ImageView)viewGroup2.findViewById(2131430832);
        this.aR = ba((View)viewGroup2);
        if (this.aE.H()) {
            ba((View)viewGroup2).g = true;
            ba((View)viewGroup2).d();
            bb((View)viewGroup2).d();
        }
        this.aS = bb((View)viewGroup2);
        this.aY = (ImageView)viewGroup2.findViewById(2131430826);
        this.aZ = (uip)new hha(((br)this).nT(), (uin)this.an, this.aY, this.c);
        this.ba = (ImageView)viewGroup2.findViewById(2131431055);
        this.bb = new uiw(((br)this).nT(), (uin)this.an, (View)this.ba, this.c, (alff)null);
        this.bf();
        final ProgressBar aq = (ProgressBar)viewGroup2.findViewById(2131430821);
        this.aq = aq;
        if (this.a <= 0) {
            aq.setVisibility(8);
        }
        final int a = this.a;
        final akak akak = null;
        CountDownTimer ak;
        if (a <= 0) {
            ak = null;
        }
        else {
            if (this.aK == null) {
                this.aK = (CountDownTimer)new hhe(this, (long)this.a);
            }
            ak = this.aK;
        }
        this.aK = ak;
        (this.ar = (ImageView)viewGroup2.findViewById(2131430828)).setOnClickListener((View$OnClickListener)this);
        this.bc = viewGroup2.findViewById(2131430830);
        this.bd = viewGroup2.findViewById(2131430820);
        (this.be = (ImageView)viewGroup2.findViewById(2131430822)).setOnClickListener((View$OnClickListener)this);
        this.c.l((wxz)new wws(wya.c(18043)));
        this.c.w((wxz)new wws(wya.c(18043)), (alff)null);
        if (this.ba.getVisibility() == 0) {
            this.c.l((wxz)new wws(wya.c(18045)));
            this.c.w((wxz)new wws(wya.c(18045)), (alff)null);
        }
        this.c.l((wxz)new wws(wya.c(36852)));
        this.c.w((wxz)new wws(wya.c(36852)), (alff)null);
        this.c.l((wxz)new wws(wya.c(22156)));
        this.c.w((wxz)new wws(wya.c(22156)), (alff)null);
        this.c.l((wxz)new wws(wya.c(52926)));
        this.c.w((wxz)new wws(wya.c(52926)), (alff)null);
        this.c.l((wxz)new wws(wya.c(53010)));
        this.c.w((wxz)new wws(wya.c(53010)), (alff)null);
        this.c.l((wxz)new wws(wya.c(18044)));
        this.c.w((wxz)new wws(wya.c(18044)), (alff)null);
        new hhf().execute((Object[])new hhi[] { this });
        ImageView at;
        if (this.aM) {
            at = (ImageView)viewGroup2.findViewById(2131429105);
        }
        else {
            at = (ImageView)viewGroup2.findViewById(2131430917);
        }
        (this.at = at).setOnClickListener((View$OnClickListener)this);
        (this.bh = (ImageView)viewGroup2.findViewById(2131427577)).setOnClickListener((View$OnClickListener)this);
        this.au = (FrameLayout)viewGroup2.findViewById(2131430919);
        if (this.aB.aT()) {
            this.au.setBackgroundColor(tmy.cn(((br)this).nT(), 2130970841));
        }
        this.av = (FrameLayout)viewGroup2.findViewById(2131430952);
        this.aw = (ConstraintLayout)viewGroup2.findViewById(2131427576);
        this.ax = (FrameLayout)viewGroup2.findViewById(2131430839);
        final WindowManager windowManager = (WindowManager)((br)this).nT().getSystemService("window");
        if (windowManager != null) {
            final Display defaultDisplay = windowManager.getDefaultDisplay();
            final Point point = new Point();
            defaultDisplay.getSize(point);
            final int y = point.y;
            this.bl = y;
            this.av.setTranslationY((float)y);
        }
        this.au.setVisibility(8);
        this.av.setVisibility(8);
        final ViewGroup viewGroup3 = (ViewGroup)viewGroup2.findViewById(2131428340);
        this.aQ = viewGroup3;
        final airb aj = this.aJ;
        if (aj != null) {
            final udl e = this.e;
            final hhc f = new hhc(this);
            viewGroup3.getClass();
            e.e = viewGroup3;
            e.f = (udk)f;
            final agza builder = ((agzi)aqvp.a).createBuilder();
            ajsq ajsq;
            if ((ajsq = aj.d) == null) {
                ajsq = ajsq.a;
            }
            final String string = abyh.b(ajsq).toString();
            builder.copyOnWrite();
            final aqvp aqvp = (aqvp)builder.instance;
            string.getClass();
            aqvp.b |= 0x2;
            aqvp.d = string;
            ajsq ajsq2;
            if ((ajsq2 = aj.g) == null) {
                ajsq2 = ajsq.a;
            }
            if (!aexs.f(abyh.b(ajsq2).toString())) {
                ajsq ajsq3;
                if ((ajsq3 = aj.g) == null) {
                    ajsq3 = ajsq.a;
                }
                final String string2 = abyh.b(ajsq3).toString();
                builder.copyOnWrite();
                final aqvp aqvp2 = (aqvp)builder.instance;
                string2.getClass();
                aqvp2.b |= 0x4;
                aqvp2.e = string2;
            }
            else {
                aorm aorm;
                if ((aorm = aj.c) == null) {
                    aorm = aorm.a;
                }
                final String string3 = actc.D(aorm).toString();
                builder.copyOnWrite();
                final aqvp aqvp3 = (aqvp)builder.instance;
                string3.getClass();
                aqvp3.b |= 0x8;
                aqvp3.f = string3;
                ajsq ajsq4;
                if ((ajsq4 = aj.e) == null) {
                    ajsq4 = ajsq.a;
                }
                final String string4 = abyh.b(ajsq4).toString();
                builder.copyOnWrite();
                final aqvp aqvp4 = (aqvp)builder.instance;
                string4.getClass();
                aqvp4.b |= 0x4;
                aqvp4.e = string4;
            }
            if ((aj.b & 0x8) != 0x0) {
                final ujr l = udl.l;
                apjc apjc;
                if ((apjc = apjc.b(aj.f)) == null) {
                    apjc = apjc.a;
                }
                final aqvq aqvq = (aqvq)((aexf)l).d((Object)apjc);
                builder.copyOnWrite();
                final aqvp aqvp5 = (aqvp)builder.instance;
                aqvp5.h = aqvq.f;
                aqvp5.b |= 0x20;
            }
            final ArrayList list = new ArrayList();
            list.add(aqvr.b);
            list.add(aqvr.c);
            final agza builder2 = ((agzi)aqvo.b).createBuilder();
            builder2.cy((Iterable)list);
            final aqvr a2 = udl.a;
            builder2.copyOnWrite();
            final aqvo aqvo = (aqvo)builder2.instance;
            aqvo.d = a2.d;
            aqvo.c |= 0x1;
            builder.copyOnWrite();
            final aqvp aqvp6 = (aqvp)builder.instance;
            final aqvo g = (aqvo)builder2.build();
            g.getClass();
            aqvp6.g = g;
            aqvp6.b |= 0x10;
            final aqxe j = aqxf.j();
            final agza builder3 = ((agzi)aqxd.a).createBuilder();
            builder3.copyOnWrite();
            final aqxd aqxd = (aqxd)builder3.instance;
            final aqvp d = (aqvp)builder.build();
            d.getClass();
            aqxd.d = d;
            aqxd.c = 4;
            ((agza)j).copyOnWrite();
            aqxf.r((aqxf)j.instance, (aqxd)builder3.build());
            e.g = (aqxf)((agza)j).build();
            e.b(udl.a);
            e.i = viewGroup3.findViewById(2131428341);
            e.j = viewGroup3.findViewById(2131428342);
            ((ViewGroup)viewGroup3.findViewById(2131428339)).addView(e.h);
            e.h.setOnTouchListener((View$OnTouchListener)e);
            final aqxd i = e.g.i();
            aqvp a3;
            if (i.c == 4) {
                a3 = (aqvp)i.d;
            }
            else {
                a3 = aqvp.a;
            }
            if ((a3.b & 0x8) != 0x0) {
                final aqxd k = e.g.i();
                aqvp a4;
                if (k.c == 4) {
                    a4 = (aqvp)k.d;
                }
                else {
                    a4 = aqvp.a;
                }
                e.b.h((ImageView)e.h.findViewById(2131427697), tmy.cH(a4.f), e.c);
            }
            else {
                ((ImageView)e.h.findViewById(2131427697)).setVisibility(8);
                e.k = (View$OnLayoutChangeListener)new jbw(e, 17);
                e.h.addOnLayoutChangeListener(e.k);
            }
        }
        this.aU = new hgz(this.aO, this.c, wya.c(10719));
        if (this.aE.H()) {
            this.aU.a = true;
        }
        this.aV = new hgz((View)this.aP, this.c, wya.c(56205));
        this.aT = viewGroup2.findViewById(2131428806);
        this.aW = new hgy(this.aR, this.aS, this.aL, this.bd, (View)this.aN, this.aQ.findViewById(2131428339), this.aO, this.aP, this.aT, this.c);
        final arud ad = this.aD;
        akak f2;
        if (ad != null) {
            f2 = ad.f();
        }
        else {
            f2 = null;
        }
        if (f2 != null) {
            apgj apgj;
            if ((apgj = f2.h) == null) {
                apgj = apgj.a;
            }
            if (apgj.i && this.aO != null && this.aR != null) {
                this.an.T();
                this.an.u(this.aL);
                this.aO.setOnClickListener((View$OnClickListener)this);
                this.aR.e((unz)((unu)this.aL).p(apje.b), (aum)this, this.af);
                this.aR.m(this.aU);
                final ImageView ap = this.aP;
                if (ap != null && this.aS != null) {
                    ap.setOnClickListener((View$OnClickListener)this);
                    final uob p3 = ((unu)this.aL).p(apje.c);
                    this.aS.e((unz)p3, (aum)this, this.af);
                    this.aS.m(this.aV);
                    final ReelPresetTracker ax = new ReelPresetTracker((aum)this, (unz)p3, this.aC, null);
                    ((auh)((br)this).X).b((aul)ax);
                    ((unz)p3).b((uny)new hjt(ax, 0));
                    ((unz)p3).a((unl)new hat(ax, 4));
                    final arud ad2 = this.aD;
                    akak f3 = akak;
                    if (ad2 != null) {
                        f3 = ad2.f();
                    }
                    boolean a5 = false;
                    Label_2387: {
                        if (f3 != null) {
                            apju apju;
                            if ((apju = f3.s) == null) {
                                apju = apju.a;
                            }
                            if (apju.d) {
                                a5 = true;
                                break Label_2387;
                            }
                        }
                        a5 = false;
                    }
                    ax.a = a5;
                    this.aX = ax;
                }
            }
        }
        uji.f(this.ax);
        final View viewById = viewGroup2.findViewById(2131427580);
        int visibility;
        if (!this.aM) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        viewById.setVisibility(visibility);
        final View viewById2 = viewGroup2.findViewById(2131430920);
        int visibility2;
        if (!this.aM) {
            visibility2 = n;
        }
        else {
            visibility2 = 8;
        }
        viewById2.setVisibility(visibility2);
        if (this.aM) {
            (this.ay = (TextView)viewGroup2.findViewById(2131431343)).setOnClickListener((View$OnClickListener)new hht(this, 1));
            this.ai.c(this.ae.a().aB((asix)new hep(this, 5)));
        }
        return (View)viewGroup2;
    }
    
    public final void W() {
        super.W();
        if (!this.ai.b) {
            this.ai.dispose();
        }
    }
    
    public final void Y() {
        super.Y();
        if (this.an.L()) {
            this.be(1);
            final hhg b = this.b;
            if (b != null) {
                ((hhl)b).od().getWindow().clearFlags(128);
            }
            this.bh(true).start();
            this.bc.setVisibility(0);
            this.be.setEnabled(true);
            this.aY.setEnabled(true);
            if (!this.aj) {
                this.ar.setVisibility(0);
            }
            this.aY.setVisibility(0);
            this.aU.c();
            this.aV.c();
            this.al = true;
            final RecordButtonView an = this.aN;
            an.clearAnimation();
            an.setContentDescription(an.getResources().getString(2132019382));
            tmy.aF((View)an.a, tmy.aE((int)an.getResources().getDimension(2131168786), (int)an.getResources().getDimension(2131168784)), (Class)ViewGroup$LayoutParams.class);
            tmy.aF((View)an.c, tmy.aE((int)an.getResources().getDimension(2131168823), (int)an.getResources().getDimension(2131168822)), (Class)ViewGroup$LayoutParams.class);
            hjp.d(an.a.getBackground(), 0);
            hjp.d(an.c.getProgressDrawable(), 0);
            final hgy aw = this.aW;
            aw.q = false;
            if (aw.d()) {
                aw.a(false);
            }
            else if (aw.a) {
                aw.e.setTranslationY(0.0f);
                aw.g.setTranslationY(0.0f);
                final View f = aw.f;
                if (f != null) {
                    f.setTranslationY(0.0f);
                }
            }
            final View k = aw.k;
            if (k != null) {
                final ChooseFilterView c = aw.c;
                if (c != null) {
                    c.h(k);
                }
                final ChooseFilterView d = aw.d;
                if (d != null) {
                    d.h(aw.k);
                }
            }
            this.bo = 0;
            this.bf();
            this.nL();
            if (this.a > 0) {
                final CountDownTimer ak = this.aK;
                if (ak != null) {
                    ak.cancel();
                }
                final ProgressBar aq = this.aq;
                if (aq != null) {
                    aq.setProgress(0);
                }
            }
        }
        this.an.D();
    }
    
    public final void a() {
    }
    
    public final ujh aK() {
        return this.ah.a();
    }
    
    final uni aL() {
        return this.aL.i();
    }
    
    public final void aM(final boolean b) {
        final ObjectAnimator bi = this.bi;
        if (bi != null && bi.isRunning()) {
            this.bi.end();
        }
        final ObjectAnimator bj = this.bj;
        if (bj != null && bj.isRunning()) {
            this.bj.end();
        }
        final FrameLayout au = this.au;
        final Property alpha = View.ALPHA;
        final float n = 0.0f;
        float n2;
        if (!b) {
            n2 = 0.0f;
        }
        else {
            n2 = 1.0f;
        }
        (this.bi = ObjectAnimator.ofFloat((Object)au, alpha, new float[] { n2 }).setDuration(250L)).addListener((Animator$AnimatorListener)new hhd(this, b, 1));
        final FrameLayout av = this.av;
        final Property translation_Y = View.TRANSLATION_Y;
        float n3;
        if (b) {
            n3 = n;
        }
        else {
            n3 = (float)this.bl;
        }
        this.bj = ObjectAnimator.ofFloat((Object)av, translation_Y, new float[] { n3 }).setDuration(250L);
        this.bi.start();
        this.bj.start();
    }
    
    public final void aN(final RecordingInfo recordingInfo, final boolean b) {
        if (recordingInfo != null && this.b != null) {
            uji.g((View)this.aN, 2132017364);
            final hhl hhl = (hhl)this.b;
            hhl.od().getWindow().clearFlags(128);
            hhl.d.a(recordingInfo, (int)((b ^ true) ? 1 : 0));
        }
    }
    
    public final void aO(Bitmap tempFile, final boolean b) {
        if (((br)this).od() == null) {
            trn.l("editPhoto called after Activity destroyed.");
            return;
        }
        final Bitmap d = uji.D(tempFile);
        final File a = this.aK().a;
        try {
            tempFile = (Bitmap)File.createTempFile("REEL_CAMERA_FRAGMENT_TEMP_FILE_NAME_BASE", ".jpeg", a);
            try {
                final BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(((File)tempFile).toString()));
                d.compress(Bitmap$CompressFormat.JPEG, 92, (OutputStream)bufferedOutputStream);
                bufferedOutputStream.close();
            }
            catch (final IOException ex) {}
        }
        catch (final IOException ex) {
            tempFile = null;
        }
        final IOException ex;
        trn.d("error writing image file", (Throwable)ex);
        tmy.bS(((br)this).nT(), 2132019373);
        final uni al = this.aL();
        final String string = ((File)tempFile).toString();
        final int width = d.getWidth();
        final int height = d.getHeight();
        String b2;
        if (b) {
            b2 = null;
        }
        else {
            b2 = al.b;
        }
        apje c;
        if (b) {
            c = null;
        }
        else {
            c = al.c;
        }
        ((br)this).od().runOnUiThread((Runnable)new hrw(this, new RecordingInfo(string, true, width, height, 5000L, true, b, b2, c, this.bg(al.c)), b, 1));
    }
    
    final void aP() {
        final int bo = this.bo;
        boolean b = true;
        if (bo != 1) {
            return;
        }
        this.bo = 2;
        final int max = Math.max(1000, ViewConfiguration.getLongPressTimeout());
        final uid h = this.an.h;
        long c;
        if (h != null) {
            c = h.c();
        }
        else {
            c = 0L;
        }
        if (this.an.L() && c >= max) {
            if (this.am == null) {
                b = false;
            }
            agot.D(b);
            this.be(0);
        }
        else {
            final CameraView an = this.an;
            if (an.o == null) {
                an.o = (uih)this;
            }
            if (an.L()) {
                this.be(1);
            }
        }
        this.bd();
        if (this.a > 0) {
            final CountDownTimer ak = this.aK;
            if (ak != null) {
                ak.onFinish();
                this.aK.cancel();
            }
            final ProgressBar aq = this.aq;
            if (aq != null) {
                aq.setProgress(0);
            }
        }
        this.c.s();
    }
    
    public final void aQ() {
        if (this.au.getVisibility() == 0) {
            this.aM(false);
            return;
        }
        if (this.aW.d()) {
            this.aW.a(false);
            return;
        }
        if (this.aX()) {
            this.aV(false);
            this.c.t((wxz)new wws(wya.c(121663)), (alff)null);
            return;
        }
        final hhg b = this.b;
        if (b != null) {
            ((hhl)b).aq.d();
            this.bd();
        }
    }
    
    public final void aS(final uoe uoe) {
        this.aL.l(uoe);
    }
    
    public final void aT(final hhg hhg) {
        this.b = hhg;
        final upy bg = this.bg;
        if (bg != null) {
            bg.af = (upx)hhg;
        }
    }
    
    public final void aU(final uos uos) {
        this.aL.m(uos);
    }
    
    public final void aV(final boolean b) {
        if (this.aY()) {
            final ObjectAnimator bk = this.bk;
            if (bk != null && bk.isRunning()) {
                this.bk.end();
            }
            final ConstraintLayout aw = this.aw;
            final Property translation_Y = View.TRANSLATION_Y;
            float n;
            if (b) {
                n = 0.0f;
            }
            else {
                n = (float)this.bl;
            }
            (this.bk = ObjectAnimator.ofFloat((Object)aw, translation_Y, new float[] { n }).setDuration(250L)).addListener((Animator$AnimatorListener)new hhd(this, b, 0));
            this.bk.start();
            return;
        }
        this.aw.setVisibility(8);
    }
    
    final void aW() {
        if (this.an.K()) {
            if (this.bo == 0) {
                this.c.J(3, (wxz)new wws(wya.c(18043)), (alff)null);
                this.c.t((wxz)new wws(wya.c(18044)), (alff)null);
                if (!uji.h()) {
                    uji.au((Context)((br)this).od(), 2132019374, this.aF);
                    return;
                }
                if (uji.e() >= 5242880L) {
                    if (this.an.P()) {
                        this.an.postDelayed(this.bp, ((ujf)this.d.a()).a());
                    }
                    else {
                        this.bp.run();
                    }
                    this.bo = 1;
                    return;
                }
                uji.au((Context)((br)this).od(), 2132019375, this.aF);
            }
        }
    }
    
    public final boolean aX() {
        return this.aw.getVisibility() == 0;
    }
    
    public final boolean aY() {
        return this.av.getVisibility() == 0 || this.aX();
    }
    
    public final void aa() {
        super.aa();
        final int ai = this.aI;
        if (ai != 0) {
            if (ai != 1) {
                if (ai != 2) {
                    throw new AssertionError(ai);
                }
                this.an.A(0);
            }
            else {
                this.an.A(1);
            }
        }
        else {
            this.an.z();
        }
        this.aI = 0;
        final Bundle m = ((br)this).m;
        if (m != null) {
            m.putInt("START_CAMERA_SELECTION", 0);
        }
    }
    
    public final void b() {
        final uim g = this.an.g();
        if (g != null) {
            final float n = g.b / (float)g.a;
            final DisplayMetrics displayMetrics = new DisplayMetrics();
            ((br)this).od().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int widthPixels = displayMetrics.widthPixels;
            int heightPixels = displayMetrics.heightPixels;
            final float n2 = (float)widthPixels;
            final float n3 = (float)heightPixels;
            if (n >= n2 / n3) {
                widthPixels = (int)(n3 * n);
            }
            else {
                heightPixels = (int)(n2 / n);
            }
            this.an.v(widthPixels, heightPixels);
            tmy.aF((View)this.bf, tmy.aE(widthPixels, heightPixels), (Class)ViewGroup$LayoutParams.class);
        }
        if (this.bm == null) {
            (this.bm = new hhh(this)).execute((Object[])new Void[0]);
        }
    }
    
    public final void d() {
        if (this.a > 0) {
            final CountDownTimer ak = this.aK;
            if (ak != null) {
                ak.start();
            }
        }
        this.be.setEnabled(false);
        this.aY.setEnabled(false);
        this.ar.setVisibility(4);
        this.aU.b();
        this.aV.b();
        this.aW.a(true);
        final hgy aw = this.aW;
        if (aw.k != null) {
            final ChooseFilterView c = aw.c;
            if (c != null) {
                c.h((View)null);
            }
            final ChooseFilterView d = aw.d;
            if (d != null) {
                d.h((View)null);
            }
            aw.k.setVisibility(8);
        }
        this.aY.setVisibility(4);
        this.bh(false).start();
        final RecordButtonView an = this.aN;
        TransitionManager.beginDelayedTransition((ViewGroup)an.b, (Transition)new TransitionSet().addTransition(new ChangeBounds().setDuration(200L)));
        tmy.aF((View)an.a, tmy.aE((int)an.getResources().getDimension(2131168817), (int)an.getResources().getDimension(2131168816)), (Class)ViewGroup$LayoutParams.class);
        this.aN.setContentDescription(((br)this).nZ().getString(2132019383));
        this.bf();
    }
    
    public final void g() {
        final WindowManager$LayoutParams attributes = ((br)this).od().getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        ((br)this).od().getWindow().setAttributes(attributes);
    }
    
    public final void h(final float n, final float n2) {
        final CameraView an = this.an;
        final CameraFocusOverlay bf = this.bf;
        bf.getClass();
        an.j(n, n2, (uij)new hhb(bf, 0));
    }
    
    public final wwv n() {
        return this.c;
    }
    
    public final void nC() {
        this.bb.e();
    }
    
    public final void nD() {
        this.al = false;
        final RecordButtonView an = this.aN;
        hjp.e(an.a.getBackground());
        hjp.e(an.c.getProgressDrawable());
        TransitionManager.beginDelayedTransition((ViewGroup)an.b, (Transition)new TransitionSet().addTransition(new ChangeBounds().setDuration(200L)));
        tmy.aF((View)an.c, tmy.aE((int)an.getResources().getDimension(2131168825), (int)an.getResources().getDimension(2131168824)), (Class)ViewGroup$LayoutParams.class);
        this.an.m();
        this.aW();
    }
    
    public final void nF() {
        final RecordButtonView an = this.aN;
        hjp.d(an.a.getBackground(), 200);
        hjp.d(an.c.getProgressDrawable(), 200);
        TransitionManager.beginDelayedTransition((ViewGroup)an.b, (Transition)new TransitionSet().addTransition(new ChangeBounds().setDuration(200L)));
        tmy.aF((View)an.a, tmy.aE((int)an.getResources().getDimension(2131168817), (int)an.getResources().getDimension(2131168816)), (Class)ViewGroup$LayoutParams.class);
        tmy.aF((View)an.c, tmy.aE((int)an.getResources().getDimension(2131168823), (int)an.getResources().getDimension(2131168822)), (Class)ViewGroup$LayoutParams.class);
        this.aP();
    }
    
    public final void nH() {
    }
    
    public final void nI(final float n) {
        this.an.i(n);
    }
    
    public final void nK(final float n) {
        this.an.q(n);
    }
    
    public final void nL() {
        final bu od = ((br)this).od();
        if (od == null) {
            return;
        }
        final WindowManager$LayoutParams attributes = od.getWindow().getAttributes();
        attributes.screenBrightness = -1.0f;
        od.getWindow().setAttributes(attributes);
    }
    
    public final void nm() {
        final uip az = this.aZ;
        az.a.p((uil)az);
        super.nm();
    }
    
    protected final wyb o() {
        return wya.b(36850);
    }
    
    public final void onClick(final View view) {
        if (view == this.be) {
            this.c.J(3, (wxz)new wws(wya.c(22156)), (alff)null);
            this.aW.a(false);
            this.aQ();
            return;
        }
        if (view == this.ar) {
            if (this.aM) {
                final uqq ae = this.ae;
                final uqr ag = hhi.aG;
                final asic h = ae.h;
                if (h != null && !h.tx()) {
                    asjg.b((AtomicReference)ae.h);
                }
                ae.h = ashp.F((Callable)new piw(ae, ag, 10)).Q(atio.b(ae.g)).L(atio.b(ae.f)).aa((asix)new uqp(ae, ag, 0), (asix)m.o);
            }
            final cl og = ((br)this).og();
            if ((this.bg = (upy)og.f("MEDIA_GRID_FRAGMENT_TAG")) == null) {
                this.bg = upy.r(3, true, this.aM);
                final ct i = og.i();
                i.r(2131430952, (br)this.bg, "MEDIA_GRID_FRAGMENT_TAG");
                i.a();
                og.ab();
                this.c.l((wxz)new wws(wya.c(121663)));
                this.c.w((wxz)new wws(wya.c(121663)), (alff)null);
            }
            this.bg.af = (upx)this.b;
            this.c.t((wxz)new wws(wya.c(121663)), (alff)null);
            this.aM(true);
            return;
        }
        if (view == this.at) {
            this.c.J(3, (wxz)new wws(wya.c(121663)), (alff)null);
            this.aM(false);
            return;
        }
        if (view == this.bh) {
            this.c.J(3, (wxz)new wws(wya.c(121667)), (alff)null);
            this.c.t((wxz)new wws(wya.c(121663)), (alff)null);
            this.aV(false);
            return;
        }
        final View ao = this.aO;
        if (ao == null || view != ao) {
            final ImageView ap = this.aP;
            if (ap != null && view == ap) {
                final ChooseFilterView as = this.aS;
                if (as != null && !as.f) {
                    this.aW.b(apje.c);
                    return;
                }
                this.aW.a(false);
            }
            return;
        }
        final ChooseFilterView ar = this.aR;
        if (ar != null && !ar.f) {
            this.aW.b(apje.b);
            return;
        }
        this.aW.a(false);
    }
    
    public final void oq(Bundle m) {
        super.oq(m);
        m = ((br)this).m;
        if (m != null) {
            this.a = m.getInt("VIDEO_TIME_LIMIT_MSECS");
            this.aH = m.getBoolean("MIRROR_FRONT_CAMERA");
            this.aI = m.getInt("START_CAMERA_SELECTION");
            m.getBoolean("SWIPE_TO_CAMERA_ENABLED");
            final byte[] byteArray = m.getByteArray("COMMENT_STICKER_RENDERER_KEY");
            if (byteArray != null) {
                try {
                    this.aJ = (airb)agzi.parseFrom((agzi)airb.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
                }
                catch (final ahab ahab) {
                    trn.d("Error parsing comment sticker renderer.", (Throwable)ahab);
                }
            }
            final byte[] byteArray2 = m.getByteArray("navigation_endpoint");
            if (byteArray2 != null) {
                try {
                    this.bn = (aioe)agzi.parseFrom((agzi)aioe.a, byteArray2, ExtensionRegistryLite.getGeneratedRegistry());
                }
                catch (final ahab ahab2) {}
            }
        }
        alvl alvl;
        if ((alvl = this.aA.b().e) == null) {
            alvl = alvl.a;
        }
        this.aM = alvl.bj;
    }
    
    protected final aioe p() {
        return this.bn;
    }
    
    public final void rZ(final int n) {
        if (n == 4) {
            this.aW.a(this.an.L());
        }
    }
    
    public final void sa() {
        if (!this.an.L()) {
            final float ak = this.ak;
            if (ak <= 0.0f || ak >= 1.0f) {
                this.aW.b(apje.b);
            }
        }
    }
    
    protected final alff sz() {
        return null;
    }
    
    public final void w(final qwu qwu, final int n) {
        RecordingInfo recordingInfo;
        if (qwu == null) {
            recordingInfo = null;
        }
        else {
            final uni al = this.aL();
            final String string = this.am.toString();
            final int a = qwu.a;
            final int b = qwu.b;
            final long c = qwu.c;
            final String b2 = al.b;
            final apje c2 = al.c;
            recordingInfo = new RecordingInfo(string, true, a, b, c, false, false, b2, c2, this.bg(c2));
        }
        if (n != 0) {
            final File am = this.am;
            if (am != null) {
                am.delete();
            }
            return;
        }
        this.aN(recordingInfo, false);
    }
}
