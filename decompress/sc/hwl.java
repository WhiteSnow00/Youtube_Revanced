import android.util.Pair;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.libraries.youtube.logging.interaction.ScreenLoggingLifecycleObserver;
import android.content.res.Configuration;
import java.io.IOException;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.l;
import j$.time.Instant;
import com.google.protos.youtube.api.innertube.ChipCloudRendererOuterClass;
import com.google.protos.youtube.api.innertube.EngagementPanelSectionListRendererOuterClass;
import java.util.concurrent.Callable;
import java.util.function.Supplier;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import java.util.HashSet;
import android.view.ContextThemeWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import android.view.ViewGroup$LayoutParams;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.youtube.app.common.rendering.SnappyRecyclerView;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.support.constraint.ConstraintLayout;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_TransformAlphaActionBarColor;
import android.app.Activity;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.Iterator;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import j$.util.stream.Stream$_CC;
import java.util.Collection;
import j$.util.Collection$_EL;
import com.google.protos.youtube.api.innertube.ContentPillRendererOuterClass;
import android.os.Build$VERSION;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import android.os.Bundle;
import java.util.ArrayList;
import android.view.ViewGroup;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.List;
import android.view.View$OnLayoutChangeListener;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.content.res.Resources;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.apps.youtube.app.mdx.tvsignin.MdxTvFoundForSignInListener;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.common.ui.navigation.PageMonitor;
import com.google.android.apps.youtube.app.common.ui.navigation.HomePageMonitor;
import com.google.android.libraries.youtube.commerce.red.entity.LayerableFilterEntityController;
import j$.util.Optional;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import java.util.Set;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import android.os.Handler;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;

// 
// Decompiled by Procyon v0.6.0
// 

public class hwl extends hwp implements kte, ktc, acrj, gdo, ktd, syv, hvk, wzv, tgg
{
    public static final int cU = 0;
    private static final afft cV;
    private static final afft cW;
    acir a;
    public ActionBarColor aA;
    public ActionBarColor aB;
    public ActionBarColor aC;
    public ActionBarColor aD;
    public boolean aE;
    public fzw aF;
    public boolean aG;
    public gkt aH;
    gkv aI;
    public vnu aJ;
    public hzc aK;
    public arkg aL;
    public acgs aM;
    public tqd aN;
    public oby aO;
    public atke aP;
    public tgd aQ;
    public acps aR;
    public zqt aS;
    public Handler aT;
    public atke aU;
    public zqs aV;
    public AppTabsBar aW;
    public ktn aX;
    public Set aY;
    public ksi aZ;
    protected kty ae;
    public gec af;
    public CharSequence ag;
    public BrowseResponseModel ah;
    public boolean ai;
    public boolean aj;
    public aiqj ak;
    public int al;
    public asir am;
    public tmx an;
    public boolean ao;
    protected long ap;
    public arkg aq;
    public jxc ar;
    public ActionBarColor as;
    public ffc b;
    public Optional bA;
    public atke bB;
    public ksb bC;
    public xao bD;
    public LayerableFilterEntityController bE;
    public jyk bF;
    public jzo bG;
    public oug bH;
    public acof bI;
    public adia bJ;
    public gkx bK;
    public uve bL;
    public kag bM;
    public arkg bN;
    public tua bO;
    public HomePageMonitor bP;
    public PageMonitor bQ;
    public toj bR;
    public tnu bS;
    public atke bT;
    public arkg bU;
    public accf bV;
    public hwm bW;
    public aiqj bX;
    public Optional bY;
    public boolean bZ;
    public vcy ba;
    public atke bb;
    public jxu bc;
    public tqn bd;
    public InlinePlaybackLifecycleController be;
    public acrr bf;
    public ActiveStateScrollSelectionController bg;
    public acrr bh;
    public kav bi;
    public kav bj;
    public MdxTvFoundForSignInListener bk;
    public hwn bl;
    public acwn bm;
    public ilm bn;
    public fmj bo;
    public wxx bp;
    public atke bq;
    public ScheduledExecutorService br;
    public Executor bs;
    public asid bt;
    public gdh bu;
    public gdh bv;
    public gdh bw;
    public gdn bx;
    public atke by;
    public atke bz;
    public Resources c;
    public aln cA;
    public aln cB;
    public e cC;
    public mcb cD;
    public mdp cE;
    public bhv cF;
    public aekp cG;
    public bx cH;
    public bx cI;
    public bx cJ;
    public fzw cK;
    public bx cL;
    public blu cM;
    public blu cN;
    public blu cO;
    public blu cP;
    public fzw cQ;
    public aeea cR;
    public aeea cS;
    public aeea cT;
    private hvm cX;
    private Context cY;
    private hwj cZ;
    public int ca;
    public int cb;
    public wyw cc;
    public vme cd;
    public final AtomicReference ce;
    public vaf cf;
    public feh cg;
    public vai ch;
    public vai ci;
    public vai cj;
    public vai ck;
    public vai cl;
    public vai cm;
    public vai cn;
    public vai co;
    public vai cp;
    public ktn cq;
    public blu cr;
    public arwh cs;
    public eg ct;
    public skt cu;
    public qcy cv;
    public e cw;
    public hzn cx;
    public e cy;
    public bhv cz;
    public Optional d;
    private final View$OnLayoutChangeListener dA;
    private final gab dB;
    private final vmd dC;
    private final atjz da;
    private final atjz db;
    private acpu dc;
    private Optional dd;
    private aorj de;
    private String df;
    private final List dg;
    private jug dh;
    private acrm di;
    private asir dj;
    private final asiq dk;
    private final List dl;
    private asir dm;
    private asir dn;
    private byte[] do;
    private boolean dp;
    private hwi dq;
    private boolean dr;
    private acle ds;
    private asir dt;
    private Set du;
    private xan dv;
    private long dw;
    private final AtomicBoolean dx;
    private ScheduledFuture dy;
    private ViewGroup dz;
    protected gac e;
    
    static {
        cV = afft.u((Object)"FEnotifications_inbox", (Object)"FEactivity", (Object)"FEhistory");
        cW = afft.t((Object)"FEpremium_member_hub", (Object)"FEconnections");
    }
    
    public hwl() {
        this.da = ((atjz)atjs.e()).bc();
        this.db = ((atjz)atjm.aW((Object)Optional.empty())).bc();
        this.d = Optional.empty();
        this.dd = Optional.empty();
        this.ak = aiqj.a;
        this.dg = new ArrayList();
        this.am = asfn.c();
        this.dk = new asiq();
        this.dl = new ArrayList();
        this.dm = asfn.c();
        this.dn = asfn.c();
        this.do = new byte[0];
        this.as = ezt.t(2130970845);
        this.aA = ezt.t(2130970910);
        this.aB = ezt.t(2130970924);
        this.aC = ezt.t(2130970926);
        this.aD = ezt.t(2130970864);
        this.aG = true;
        this.dx = new AtomicBoolean(false);
        this.bX = aiqj.a;
        this.bY = Optional.empty();
        this.ca = 0;
        this.cb = 0;
        this.dA = (View$OnLayoutChangeListener)new fti(this, 12);
        this.dB = (gab)new hwh(this, 1);
        this.ce = new AtomicReference((V)afeq.q());
        this.dC = (vmd)new hvw(this);
    }
    
    public static final ksw bT() {
        final ksv a = ksw.a();
        a.d(ezt.r(2131102282));
        a.e(ezt.r(2131102283));
        a.b(ezt.r(2131102384));
        a.f(ezt.r(2131102386));
        a.c(ezt.r(2131102282));
        return a.a();
    }
    
    public static final boolean bU(final BrowseResponseModel browseResponseModel) {
        return browseResponseModel != null && (boolean)browseResponseModel.h("browse_response_is_canned", (Object)false);
    }
    
    private static int bZ(final Bundle bundle, final String s, final Context context) {
        return (int)Optional.ofNullable((Object)bundle.getParcelable(s)).filter((Predicate)hoi.m).map((Function)hvo.a).map((Function)new hra(context, 4)).orElse((Object)0);
    }
    
    private final ksp cA(final BrowseResponseModel browseResponseModel) {
        akhu akhu;
        if ((akhu = browseResponseModel.a.d) == null) {
            akhu = akhu.a;
        }
        if ((browseResponseModel.a.b & 0x2) != 0x0) {
            final int b = akhu.b;
            if (b == 46407682) {
                final qcy cv = this.cv;
                final wyw pf = ((ggq)this).pF();
                aidt a;
                if (akhu.b == 46407682) {
                    a = (aidt)akhu.c;
                }
                else {
                    a = aidt.a;
                }
                final vcy vcy = (vcy)((atke)cv.e).a();
                vcy.getClass();
                final lmo lmo = (lmo)((atke)cv.a).a();
                lmo.getClass();
                final heo heo = (heo)((atke)cv.b).a();
                final adpp adpp = (adpp)((atke)cv.c).a();
                adpp.getClass();
                final Executor executor = (Executor)((atke)cv.d).a();
                executor.getClass();
                final eg eg = (eg)((atke)cv.f).a();
                eg.getClass();
                final Context context = (Context)((atke)cv.g).a();
                context.getClass();
                pf.getClass();
                browseResponseModel.getClass();
                a.getClass();
                return (ksp)new ksx(vcy, lmo, heo, adpp, executor, eg, context, pf, browseResponseModel, a, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            if (b == 50236216) {
                final blu cn = this.cN;
                final wyw pf2 = ((ggq)this).pF();
                final vcy vcy2 = (vcy)((atke)cn.e).a();
                vcy2.getClass();
                final tgd tgd = (tgd)((atke)cn.c).a();
                tgd.getClass();
                final arfe arfe = (arfe)((atke)cn.a).a();
                arfe.getClass();
                final lmo lmo2 = (lmo)((atke)cn.d).a();
                lmo2.getClass();
                final heo heo2 = (heo)((atke)cn.b).a();
                pf2.getClass();
                browseResponseModel.getClass();
                return (ksp)new kth(vcy2, tgd, arfe, lmo2, heo2, pf2, browseResponseModel, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            if (b == 156098381) {
                final blu cm = this.cM;
                final wyw pf3 = ((ggq)this).pF();
                final vcy vcy3 = (vcy)((atke)cm.e).a();
                vcy3.getClass();
                final tgd tgd2 = (tgd)((atke)cm.c).a();
                tgd2.getClass();
                final arfe arfe2 = (arfe)((atke)cm.a).a();
                arfe2.getClass();
                final lmo lmo3 = (lmo)((atke)cm.d).a();
                lmo3.getClass();
                final heo heo3 = (heo)((atke)cm.b).a();
                pf3.getClass();
                browseResponseModel.getClass();
                return (ksp)new ktz(vcy3, tgd2, arfe2, lmo3, heo3, pf3, browseResponseModel, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            if (b == 53272665) {
                return (ksp)this.aX.a((anio)akhu.c, browseResponseModel);
            }
            if (b == 101397128) {
                final e cy = this.cy;
                final wyw pf4 = ((ggq)this).pF();
                aohq a2;
                if (akhu.b == 101397128) {
                    a2 = (aohq)akhu.c;
                }
                else {
                    a2 = aohq.a;
                }
                final vcy vcy4 = (vcy)((atke)cy.d).a();
                vcy4.getClass();
                final lmo lmo4 = (lmo)((atke)cy.a).a();
                lmo4.getClass();
                final heo heo4 = (heo)((atke)cy.c).a();
                final Context context2 = (Context)((atke)cy.b).a();
                context2.getClass();
                pf4.getClass();
                browseResponseModel.getClass();
                a2.getClass();
                return (ksp)new ktq(vcy4, lmo4, heo4, context2, pf4, browseResponseModel, a2, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            if (b == 102883021) {
                final blu co = this.cO;
                final wyw pf5 = ((ggq)this).pF();
                final vcy vcy5 = (vcy)((atke)co.e).a();
                vcy5.getClass();
                final arfe arfe3 = (arfe)((atke)co.a).a();
                arfe3.getClass();
                final tgd tgd3 = (tgd)((atke)co.c).a();
                tgd3.getClass();
                final lmo lmo5 = (lmo)((atke)co.d).a();
                lmo5.getClass();
                final heo heo5 = (heo)((atke)co.b).a();
                pf5.getClass();
                browseResponseModel.getClass();
                return (ksp)new ktb(vcy5, arfe3, tgd3, lmo5, heo5, pf5, browseResponseModel, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            if (b == 155144651) {
                final akdd akdd = (akdd)akhu.c;
                akdd.getClass();
                return (ksp)new kta((Object)akdd);
            }
            if (b == 155554693) {
                final bx ch = this.cH;
                final aoxj aoxj = (aoxj)akhu.c;
                final jxu jxu = (jxu)((atke)ch.a).a();
                jxu.getClass();
                aoxj.getClass();
                return (ksp)new kts(jxu, aoxj);
            }
            if (b == 126869174) {
                final aoma aoma = (aoma)akhu.c;
                aoma.getClass();
                return (ksp)new ktr(aoma);
            }
            if (b == 217771576) {
                final aiun aiun = (aiun)akhu.c;
                aiun.getClass();
                return (ksp)new ksz(aiun);
            }
            if (b == 188799247) {
                final bx ci = this.cI;
                final alix alix = (alix)akhu.c;
                final jxu jxu2 = (jxu)((atke)ci.a).a();
                jxu2.getClass();
                alix.getClass();
                return (ksp)new kti(jxu2, alix);
            }
            if (b == 361905772) {
                final ktn cq = this.cq;
                final wyw pf6 = ((ggq)this).pF();
                aiih a3;
                if (akhu.b == 361905772) {
                    a3 = (aiih)akhu.c;
                }
                else {
                    a3 = aiih.a;
                }
                final vcy vcy6 = (vcy)((atke)cq.h).a();
                vcy6.getClass();
                final lmo lmo6 = (lmo)((atke)cq.b).a();
                lmo6.getClass();
                final heo heo6 = (heo)((atke)cq.e).a();
                final adpp adpp2 = (adpp)((atke)cq.f).a();
                adpp2.getClass();
                final Executor executor2 = (Executor)((atke)cq.c).a();
                executor2.getClass();
                final eg eg2 = (eg)((atke)cq.g).a();
                eg2.getClass();
                ((atke)cq.d).a().getClass();
                final Context context3 = (Context)((atke)cq.i).a();
                context3.getClass();
                final vai vai = (vai)((atke)cq.a).a();
                pf6.getClass();
                browseResponseModel.getClass();
                a3.getClass();
                return (ksp)new ktg(vcy6, lmo6, heo6, adpp2, executor2, eg2, context3, vai, pf6, browseResponseModel, a3, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            if (b == 338099421) {
                final anst anst = (anst)akhu.c;
                anst.getClass();
                return (ksp)new ktp(anst);
            }
            if (b == 423195318) {
                final blu cp = this.cP;
                final wyw pf7 = ((ggq)this).pF();
                aiqc a4;
                if (akhu.b == 423195318) {
                    a4 = (aiqc)akhu.c;
                }
                else {
                    a4 = aiqc.a;
                }
                final vcy vcy7 = (vcy)((atke)cp.a).a();
                vcy7.getClass();
                final lmo lmo7 = (lmo)((atke)cp.d).a();
                lmo7.getClass();
                final heo heo7 = (heo)((atke)cp.b).a();
                final accf accf = (accf)((atke)cp.c).a();
                accf.getClass();
                final Context context4 = (Context)((atke)cp.e).a();
                context4.getClass();
                pf7.getClass();
                browseResponseModel.getClass();
                a4.getClass();
                return (ksp)new ksy(vcy7, lmo7, heo7, accf, context4, pf7, browseResponseModel, a4, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
        }
        return null;
    }
    
    private final void cB(final ksp ksp) {
        this.dd.ifPresent((Consumer)hvn.g);
        (this.dd = Optional.ofNullable((Object)ksp)).ifPresent((Consumer)new hvr(this, 9));
    }
    
    private final void cC(final ksp ksp) {
        if (ksp != null) {
            this.ag = ksp.d();
            this.ai = ksp.j();
            this.aj = ksp.i();
        }
        else {
            this.ag = null;
            this.ai = false;
            this.aj = false;
        }
        if (Build$VERSION.SDK_INT >= 28) {
            Optional.ofNullable((Object)((br)this).O).ifPresent((Consumer)new hvr(this, 7));
        }
    }
    
    private static ksw ca(final alnx alnx) {
        final ksv a = ksw.a();
        a.d(ezt.s(alnx.e));
        a.e(ezt.s(alnx.f));
        a.b(ezt.s(alnx.b));
        a.f(ezt.s(alnx.c));
        a.c(ezt.s(alnx.e));
        return a.a();
    }
    
    private final ksw cb() {
        final ksv a = ksw.a();
        a.d(this.aw.m);
        a.e(this.aw.o);
        a.b(this.aw.j);
        a.f(this.aw.k);
        a.c(this.aw.a.d);
        return a.a();
    }
    
    private final vgu cc() {
        final aorj h = this.ae.h();
        if (h != null) {
            aorf aorf;
            if ((aorf = h.k) == null) {
                aorf = aorf.a;
            }
            if ((aorf.b & 0x1) != 0x0) {
                aorf aorf2;
                if ((aorf2 = h.k) == null) {
                    aorf2 = aorf.a;
                }
                anyv anyv;
                if ((anyv = aorf2.c) == null) {
                    anyv = anyv.a;
                }
                return new vgu(anyv);
            }
        }
        return null;
    }
    
    private final xab cd() {
        final String f = vxg.f(this.aL());
        if (f == null) {
            return xaa.b(6827);
        }
        alxw alxw;
        if ((alxw = this.cs.f().e) == null) {
            alxw = alxw.a;
        }
        if (alxw.as && this.cw()) {
            return xaa.b(3854);
        }
        int n = 0;
        Label_0098: {
            if (f.hashCode() == 714505897) {
                if (f.equals("FEred_originals_home")) {
                    n = 0;
                    break Label_0098;
                }
            }
            n = -1;
        }
        if (n != 0) {
            return xaa.b(6827);
        }
        return xaa.b(34388);
    }
    
    private static Optional ce(final BrowseResponseModel browseResponseModel) {
        if (browseResponseModel == null) {
            return Optional.empty();
        }
        final akhz a = browseResponseModel.a;
        if ((a.b & 0x1000000) == 0x0) {
            return Optional.empty();
        }
        anuv anuv;
        if ((anuv = a.v) == null) {
            anuv = anuv.a;
        }
        if (!anuv.ry((ahaq)ContentPillRendererOuterClass.contentPillRenderer)) {
            return Optional.empty();
        }
        return Optional.of((Object)anuv.rx((ahaq)ContentPillRendererOuterClass.contentPillRenderer));
    }
    
    private static Optional cf(final BrowseResponseModel browseResponseModel) {
        if (browseResponseModel == null) {
            return Optional.empty();
        }
        final akhz a = browseResponseModel.a;
        if ((a.b & 0x8) == 0x0) {
            return Optional.empty();
        }
        anuv anuv;
        if ((anuv = a.e) == null) {
            anuv = anuv.a;
        }
        if (!anuv.ry((ahaq)ContentPillRendererOuterClass.contentPillRenderer)) {
            return Optional.empty();
        }
        return Optional.of((Object)anuv.rx((ahaq)ContentPillRendererOuterClass.contentPillRenderer));
    }
    
    private final Object cg() {
        return this.dd.map((Function)hvv.f).orElse((Object)null);
    }
    
    private final void ch() {
        final jyk bf = this.bF;
        if (bf != null) {
            bf.h();
        }
        this.dk.b();
        final asir dj = this.dj;
        if (dj != null) {
            dj.dispose();
        }
        this.bG.f();
        final acqv b = this.ae.b();
        if (b != null) {
            ((acns)b).i();
        }
    }
    
    private final void ci(final hwf hwf) {
        final BrowseResponseModel b = hwf.b;
        this.ah = b;
        final ksp ca = this.cA(b);
        this.cB(ca);
        this.cC(ca);
        this.ct();
        final vgu f = b.f();
        if (!b.g().isEmpty()) {
            this.cu((List)Collection$_EL.stream((Collection)b.g()).map((Function)hvv.c).collect(afci.a), this.cg(), -1);
        }
        else if (f != null) {
            final ahaz builder = ((ahbh)aorf.a).createBuilder();
            final anyv a = f.a;
            builder.copyOnWrite();
            final aorf aorf = (aorf)builder.instance;
            aorf.c = a;
            aorf.b |= 0x1;
            final aorf k = (aorf)builder.build();
            final ahaz builder2 = ((ahbh)aorj.a).createBuilder();
            builder2.copyOnWrite();
            final aorj aorj = (aorj)builder2.instance;
            k.getClass();
            aorj.k = k;
            aorj.b |= 0x2000;
            this.cu((List)Stream$_CC.of((Object)new zxn((aorj)builder2.build())).map((Function)hvv.e).collect(afci.a), null, -1);
        }
        this.bB();
        this.cq();
        this.co(false, hwm.a(b.a).map((Function)hvv.g), bU(b));
        this.cp(false);
        this.cn();
        final Optional cf = cf(this.ah);
        if (cf.isPresent()) {
            this.bw.i(this.bw.j((aiyd)cf.get()), false);
        }
        this.d.ifPresent((Consumer)hvn.a);
        final TimeUnit seconds = TimeUnit.SECONDS;
        akli akli;
        if ((akli = b.a.c) == null) {
            akli = akli.a;
        }
        long n2;
        final long n = n2 = seconds.toMillis(akli.e);
        Label_0517: {
            if (fbu.K(this.cf) != 0) {
                if (!TextUtils.equals((CharSequence)vxg.f(this.aL()), (CharSequence)"FEwhat_to_watch") || (boolean)b.h("browse_response_is_canned", (Object)false)) {
                    if (!fwc.m(vxg.f(hwf.a))) {
                        n2 = n;
                        break Label_0517;
                    }
                }
                final aiqj a2 = hwf.a;
                n2 = n;
                if (!TextUtils.equals((CharSequence)vxg.f(a2), (CharSequence)"FEmemberships_and_purchases")) {
                    if (TextUtils.equals((CharSequence)vxg.f(a2), (CharSequence)"FEmembership_detail")) {
                        n2 = n;
                    }
                    else {
                        n2 = TimeUnit.SECONDS.toMillis(fbu.K(this.cf));
                    }
                }
            }
        }
        long n3 = n2;
        if (b.h("browse_response_is_preloaded", (Object)false)) {
            n3 = n2;
            if (TextUtils.equals((CharSequence)vxg.f(hwf.a), (CharSequence)"FEwhat_to_watch")) {
                final long millis = TimeUnit.SECONDS.toMillis(this.ch.h(45363701L));
                n3 = n2;
                if (millis > 0L) {
                    n3 = n2;
                    if (millis < n2) {
                        n3 = millis;
                    }
                }
            }
        }
        this.ap = n3 + this.aO.d();
        aiqj bx;
        if ((bx = b.a.q) == null) {
            bx = aiqj.a;
        }
        this.bX = bx;
        final akhz a3 = b.a;
        Optional by;
        if ((a3.b & 0x100000) != 0x0) {
            aiqj aiqj;
            if ((aiqj = a3.r) == null) {
                aiqj = aiqj.a;
            }
            by = Optional.of((Object)aiqj);
        }
        else {
            by = Optional.empty();
        }
        this.bY = by;
        this.dx.set(true);
        if (this.ap > 0L) {
            this.cs();
        }
        if (this.cw() && this.bY.isPresent()) {
            final gdn bx2 = this.bx;
            if (bx2 != null && this.at != null) {
                bx2.a((aiqj)this.bY.get(), (acqv)this.r(), this.ba, this.bu, ((br)this).nT(), tpe.bb(((br)this).nY()));
            }
        }
        this.bC((List)b.a.w);
        this.cg.a(b.a);
        this.ce.set(b.a.z);
    }
    
    private final void cj(final aiqj aiqj, final boolean b, final boolean b2) {
        aiqj.getClass();
        if (((br)this).O == null) {
            return;
        }
        final atjz da = this.da;
        final vns e = this.aJ.e();
        final atke by = this.by;
        final atke bz = this.bz;
        final arwh cs = this.cs;
        Optional optional;
        if ((this.bS.e(tnu.am) & 0x1L) != 0x0L) {
            optional = Optional.of((Object)tlu.d);
        }
        else {
            optional = Optional.empty();
        }
        hzc.r(e, aiqj, b, by, bz, cs, optional);
        final InteractionLoggingScreen a = ((ggq)this).pF().a();
        if (this.cj.O() && a != null) {
            ((vkk)e).m(a.a);
        }
        final ahbb ahbb = (ahbb)((ahbh)aiqj).toBuilder();
        final ahbf browseEndpoint = BrowseEndpointOuterClass.browseEndpoint;
        final ahaz builder = ((ahbh)((ahbc)aiqj).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint)).toBuilder();
        builder.copyOnWrite();
        final aicj aicj = (aicj)builder.instance;
        aicj.h = null;
        aicj.b &= 0xFFFFFFBF;
        ahbb.e((ahaq)browseEndpoint, (Object)builder.build());
        da.tu((Object)new hwd(e, (aiqj)((ahaz)ahbb).build(), b2));
    }
    
    private final void ck() {
        ((ggq)this).pF().l((wzz)new wyt(xaa.c(22156)));
        final jxc ar = this.ar;
        fzx a;
        if (ar == null) {
            a = null;
        }
        else {
            a = ar.a();
        }
        if (a != null) {
            Optional.ofNullable((Object)((ggq)this).pF().a()).map((Function)hvo.q).ifPresent((Consumer)new hvr(a, 8));
            a.g();
        }
        ((ggq)this).pF().l((wzz)new wyt(xaa.c(10349)));
        final akrh a2 = ((llb)this.bB.a()).d().a;
        if (a2 != null && (a2.b & 0x10) != 0x0) {
            ((ggq)this).pF().D((wzz)new wyt(a2.e.I()));
            if (a2.d.size() != 0) {
                for (final akri akri : a2.d) {
                    amkk a3;
                    if (akri.b == 123267149) {
                        a3 = (amkk)akri.c;
                    }
                    else {
                        a3 = amkk.a;
                    }
                    if ((a3.b & 0x4) != 0x0) {
                        final wyw pf = ((ggq)this).pF();
                        amkk a4;
                        if (akri.b == 123267149) {
                            a4 = (amkk)akri.c;
                        }
                        else {
                            a4 = amkk.a;
                        }
                        pf.t((wzz)new wyt(a4.c), (alhi)null);
                    }
                    anbr a5;
                    if (akri.b == 117866661) {
                        a5 = (anbr)akri.c;
                    }
                    else {
                        a5 = anbr.a;
                    }
                    Collection$_EL.stream((Collection)a5.b).map((Function)hvo.u).filter((Predicate)hoi.p).map((Function)hvv.b).map((Function)hvv.a).forEach((Consumer)new hvr(this, 11));
                }
            }
        }
        this.cc = ((ggq)this).pF();
    }
    
    private final void cl(final BrowseResponseModel browseResponseModel) {
        if (browseResponseModel != null && (boolean)browseResponseModel.h("browse_response_is_offline", (Object)false) && this.cw()) {
            final xab b = xaa.b(138480);
            aiqj f;
            if (this.cj.R()) {
                f = ((ggq)this).pF().f(this.ak);
            }
            else {
                f = null;
            }
            ((ggq)this).pF().c(b, wzr.a, f, (alhi)null, (alhi)null);
            this.ck();
            return;
        }
        if (!this.cj.Q()) {
            this.bt();
        }
    }
    
    private final void cm() {
        Optional.ofNullable((Object)this.dy).ifPresent((Consumer)hvn.h);
        this.dy = null;
    }
    
    private final void cn() {
        final Optional ce = ce(this.ah);
        if (ce.isPresent()) {
            this.bv.i(this.bv.j((aiyd)ce.get()), false);
        }
    }
    
    private final void co(final boolean b, final Optional optional, final boolean b2) {
        final kau r = this.r();
        final frk q = this.q();
        acrm s;
        final acrm acrm = s = null;
        if (b) {
            final hwj cz = this.cZ;
            s = acrm;
            if (cz != null) {
                s = cz.s;
            }
        }
        final vgu cc = this.cc();
        final jyk bf = this.bF;
        if (cc != null && bf != null && q != null && r != null) {
            if (this.bN((acqv)r, q)) {
                final wyw pf = ((ggq)this).pF();
                final fzf fzf = (fzf)this.aq.a();
                wyw k;
                if ((k = pf) == null) {
                    k = wyw.k;
                }
                final String f = vxg.f(this.aL());
                fzf.getClass();
                boolean b3;
                if (s != null) {
                    b3 = bf.q(s, (acrh)r, k);
                }
                else {
                    b3 = bf.l(cc, (acrh)r, k);
                }
                if (!b3) {
                    fzf.j();
                    if (jzg.f(f) || jzg.e(f)) {
                        jzg.b(fzf, bf, (acqv)r, q, k, f);
                    }
                }
                else {
                    final fzs a = jzg.a(bf, (acqv)r, q);
                    a.a = f;
                    a.f((boolean)optional.map((Function)new hra(bf, 20)).orElse((Object)false));
                    a.d(b2);
                    fzf.p(a.a());
                    if (!"FEhashtag".equals(f)) {
                        jzg.b(fzf, bf, (acqv)r, q, k, f);
                    }
                }
            }
        }
    }
    
    private final void cp(final boolean b) {
        final kau r = this.r();
        final frk q = this.q();
        if (r != null) {
            if (q != null) {
                final wyw s = this.s();
                this.dk.b();
                this.dk.c(((asht)q.c).K((asjs)hus.i).aH(new hsf(this, 11)));
                this.dk.c(this.bG.c().aH(new hsf(this, 12)));
                ((acns)r).z((acrg)new hwb(this, (acqv)r));
                final vgu cc = this.cc();
                final boolean i = this.bG.i();
                final acrm acrm = (acrm)Optional.ofNullable((Object)this.cZ).map((Function)hvo.n).orElse((Object)null);
                if (b) {
                    if (acrm != null) {
                        this.bG.m(acrm, (acrh)r, s);
                    }
                }
                else if (cc != null && (jzg.h(cc) || jzg.i(cc))) {
                    this.bG.l(cc, (acrh)r, s);
                }
                if (i != this.bG.i()) {
                    this.bB();
                }
            }
        }
    }
    
    private final void cq() {
        final aorj h = this.ae.h();
        if (this.ae != null && h != null) {
            final mcb cd = this.cD;
            aorh aorh;
            if ((aorh = h.i) == null) {
                aorh = aorh.a;
            }
            final int b = aorh.b;
            final String s = null;
            if ((b & 0x40) != 0x0) {
                aorh aorh2;
                if ((aorh2 = h.i) == null) {
                    aorh2 = aorh.a;
                }
                aorc aorc;
                if ((aorc = aorh2.e) == null) {
                    aorc = aorc.a;
                }
                anuv anuv;
                if ((anuv = aorc.c) == null) {
                    anuv = anuv.a;
                }
                final ajmo ajmo = (ajmo)anuv.rx((ahaq)ElementRendererOuterClass.elementRenderer);
                if (ajmo == null) {
                    throw new NullPointerException("Null elementRenderer");
                }
                String d;
                if ((aorc.b & 0x2) != 0x0) {
                    d = aorc.d;
                    ((atjm)cd.a).tu((Object)Optional.of((Object)d));
                }
                else {
                    ((atjm)cd.a).tu((Object)Optional.empty());
                    d = s;
                }
                cd.c = new gaa(ajmo, d);
                this.bB();
                if (this.dt == null) {
                    final mcb cd2 = this.cD;
                    this.dt = ((asht)cd2.a).aq((asjr)new jbe(cd2, 20, null, null, null)).aH(new hsf(this, 14));
                }
            }
            else {
                cd.c = null;
                ((atjm)cd.a).tu((Object)Optional.empty());
            }
        }
    }
    
    private final void cr(Bundle builder) {
        Bundle m;
        if (builder != null) {
            m = builder;
        }
        else {
            m = ((br)this).m;
        }
        Object c = vdb.c((byte[])Optional.ofNullable((Object)m).map((Function)hvo.e).orElse((Object)null));
        Label_0133: {
            if (builder == null) {
                builder = (Bundle)c;
                if (!((amqg)((ahbc)c).rx((ahaq)amqf.b)).c.isEmpty()) {
                    break Label_0133;
                }
            }
            final byte[] array = (byte[])Optional.ofNullable((Object)((br)this).m).map((Function)hvo.i).orElse((Object)null);
            builder = (Bundle)c;
            if (array == null) {
                break Label_0133;
            }
            builder = (Bundle)((ahbh)amqg.a).createBuilder();
            while (true) {
                try {
                    ((agzj)builder).mergeFrom(array, ExtensionRegistryLite.getGeneratedRegistry());
                    c = ((ahbh)c).toBuilder();
                    ((ahbb)c).e((ahaq)amqf.b, (Object)((ahaz)builder).build());
                    builder = (Bundle)((ahaz)c).build();
                    this.bI((aiqj)builder);
                }
                catch (final ahca ahca) {
                    continue;
                }
                break;
            }
        }
    }
    
    private final void cs() {
        if (!TextUtils.equals((CharSequence)vxg.f(this.aL()), (CharSequence)"FEwhat_to_watch")) {
            return;
        }
        this.cm();
        long n = this.ap - this.aO.d();
        final ScheduledExecutorService br = this.br;
        final hol hol = new hol(this, 20);
        if (n <= 0L) {
            n = 0L;
        }
        this.dy = br.schedule((Runnable)hol, n, TimeUnit.MILLISECONDS);
    }
    
    private final void ct() {
        final Object cg = this.cg();
        final BrowseResponseModel ah = this.ah;
        if (cg instanceof aidt) {
            final aidt aidt = (aidt)cg;
            aidr aidr;
            if ((aidr = aidt.u) == null) {
                aidr = aidr.a;
            }
            amgs a;
            if (aidr.b == 66439850) {
                a = (amgs)aidr.c;
            }
            else {
                a = amgs.a;
            }
            if (a.c.size() > 0) {
                aidr aidr2;
                if ((aidr2 = aidt.u) == null) {
                    aidr2 = aidr.a;
                }
                amgs a2;
                if (aidr2.b == 66439850) {
                    a2 = (amgs)aidr2.c;
                }
                else {
                    a2 = amgs.a;
                }
                if ((((amgp)a2.c.get(0)).b & 0x1) != 0x0 && !this.dr) {
                    final jxu bc = this.bc;
                    aidr aidr3;
                    if ((aidr3 = aidt.u) == null) {
                        aidr3 = aidr.a;
                    }
                    amgs a3;
                    if (aidr3.b == 66439850) {
                        a3 = (amgs)aidr3.c;
                    }
                    else {
                        a3 = amgs.a;
                    }
                    bc.c(a3);
                    this.dr = true;
                }
            }
            final fa at = this.at;
            aido aido;
            if ((aido = aidt.h) == null) {
                aido = aido.a;
            }
            if (aido.b == 131084815) {
                aido aido2;
                if ((aido2 = aidt.h) == null) {
                    aido2 = aido.a;
                }
                alnx a4;
                if (aido2.b == 131084815) {
                    a4 = (alnx)aido2.c;
                }
                else {
                    a4 = alnx.a;
                }
                this.bH(ca(a4));
                return;
            }
            aotp aotp;
            if ((aotp = aidt.i) == null) {
                aotp = aotp.a;
            }
            if (aald.S(aotp) && at != null) {
                if (this.dq == null) {
                    this.dq = new hwi(this);
                }
                final acgs am = this.aM;
                aotp aotp2;
                if ((aotp2 = aidt.i) == null) {
                    aotp2 = aotp.a;
                }
                am.k(aald.M(aotp2), (tcc)tca.c((Activity)at, (tcc)this.dq));
                return;
            }
            this.bH(bT());
        }
        else {
            if (ah != null) {
                akhu akhu;
                if ((akhu = ah.a.d) == null) {
                    akhu = akhu.a;
                }
                if (akhu.b == 361905772) {
                    akhu akhu2;
                    if ((akhu2 = ah.a.d) == null) {
                        akhu2 = akhu.a;
                    }
                    aiih a5;
                    if (akhu2.b == 361905772) {
                        a5 = (aiih)akhu2.c;
                    }
                    else {
                        a5 = aiih.a;
                    }
                    aiig aiig;
                    if ((aiig = a5.g) == null) {
                        aiig = aiig.a;
                    }
                    amgs a6;
                    if (aiig.b == 66439850) {
                        a6 = (amgs)aiig.c;
                    }
                    else {
                        a6 = amgs.a;
                    }
                    if (a6.c.size() > 0 && (((amgp)a6.c.get(0)).b & 0x1) != 0x0 && !this.dr) {
                        this.bc.c(a6);
                        this.dr = true;
                    }
                    this.bH(this.cb());
                    return;
                }
            }
            if (ah != null) {
                akhu akhu3;
                if ((akhu3 = ah.a.d) == null) {
                    akhu3 = akhu.a;
                }
                if (akhu3.b == 423195318) {
                    akhu akhu4;
                    if ((akhu4 = ah.a.d) == null) {
                        akhu4 = akhu.a;
                    }
                    aiqc a7;
                    if (akhu4.b == 423195318) {
                        a7 = (aiqc)akhu4.c;
                    }
                    else {
                        a7 = aiqc.a;
                    }
                    final ksv a8 = ksw.a();
                    a8.d(ezt.s(a7.i));
                    a8.e(this.aw.o);
                    a8.b(ezt.s(a7.g & 0xFFFFFF));
                    a8.f(ezt.s(a7.h));
                    a8.c(ezt.s(a7.i));
                    this.bH(a8.a());
                    return;
                }
            }
            if (cg instanceof ajsp) {
                amgv amgv;
                if ((amgv = ((ajsp)cg).d) == null) {
                    amgv = amgv.a;
                }
                amgs amgs;
                if ((amgs = amgv.c) == null) {
                    amgs = amgs.a;
                }
                if (amgs.c.size() > 0 && (((amgp)amgs.c.get(0)).b & 0x1) != 0x0 && !this.dr) {
                    this.bc.c(amgs);
                    this.dr = true;
                }
                this.bH(this.cb());
                return;
            }
            ksw ksw;
            if (cg instanceof anio) {
                final anio anio = (anio)cg;
                if ((anio.b & 0x100) != 0x0) {
                    alnx alnx;
                    if ((alnx = anio.l) == null) {
                        alnx = alnx.a;
                    }
                    ksw = ca(alnx);
                }
                else {
                    ksw = this.cb();
                }
            }
            else if (cg instanceof aoxj) {
                final aoxj aoxj = (aoxj)cg;
                if (this.bW() == 3) {
                    final ksv a9 = ksw.a();
                    a9.d(this.aw.m);
                    a9.e(this.aw.o);
                    final ActionBarColor j = this.aw.j;
                    j.getClass();
                    adkp.K(true, "alpha value must be between 0 and 255 inclusive, was %s", 179);
                    a9.b((ActionBarColor)new AutoValue_ActionBarColor_TransformAlphaActionBarColor(j, 179));
                    a9.f(this.aw.k);
                    a9.c(this.aw.m);
                    ksw = a9.a();
                }
                else {
                    final ksv a10 = ksw.a();
                    a10.d(ezt.s(aoxj.e));
                    a10.e(ezt.s(aoxj.f));
                    a10.b(ezt.s(aoxj.c));
                    a10.f(ezt.s(aoxj.d));
                    a10.c(ezt.s(aoxj.e));
                    ksw = a10.a();
                }
            }
            else if (cg instanceof apnm) {
                final ksv a11 = ksw.a();
                a11.d(ezt.t(2130970924));
                a11.e(ezt.t(2130970926));
                a11.b(ezt.t(2130970845));
                a11.f(ezt.t(2130970865));
                a11.c(ezt.t(2130970864));
                ksw = a11.a();
            }
            else {
                ksw = this.cb();
            }
            this.bH(ksw);
        }
    }
    
    private final void cu(final List list, final Object o, int i) {
        hwl hwl = this;
        int n = i;
        int n2;
        if (o != null && !(o instanceof ajsp) && !(o instanceof aohq) && !(o instanceof aoxj) && !(o instanceof akdd) && !this.cy()) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        ((fzf)hwl.aq.a()).h();
        hwl.ae.k();
        final int cr = tpe.cr(((br)this).nT(), 2130970924);
        final int cr2 = tpe.cr(((br)this).nT(), 2130970925);
        hwl.dg.clear();
        final ArrayList list2 = new ArrayList();
        if (list.size() > 1) {
            ((br)this).H().inflate(2131624109, (ViewGroup)hwl.d.get(), true);
            final RtlAwareViewPager rtlAwareViewPager = (RtlAwareViewPager)((SpecificNetworkErrorViewLoadingFrameLayout)hwl.d.get()).findViewById(2131432369);
            final aln cb = hwl.cB;
            final arkg b = ((arlw)cb.b).b();
            b.getClass();
            final arkg b2 = ((arlw)cb.c).b();
            b2.getClass();
            final arkg b3 = ((arlw)cb.a).b();
            b3.getClass();
            rtlAwareViewPager.getClass();
            hwl.e = (gac)new jve(b, b2, b3, rtlAwareViewPager);
        }
        else {
            final aln ca = hwl.cA;
            final ViewGroup viewGroup = (ViewGroup)hwl.d.get();
            final arkg b4 = ((arlw)ca.b).b();
            b4.getClass();
            final AppTabsBar appTabsBar = (AppTabsBar)((atke)ca.c).a();
            appTabsBar.getClass();
            final ConstraintLayout constraintLayout = (ConstraintLayout)((atke)ca.a).a();
            constraintLayout.getClass();
            hwl.e = (gac)new jwn(b4, appTabsBar, constraintLayout, viewGroup);
        }
        this.bD();
        int n3 = n2;
        int j = 0;
        int n4 = 0;
        while (j < list.size()) {
            final zxn zxn = (zxn)list.get(j).a;
            final aorj aorj = (aorj)zxn.b;
            aorf aorf;
            if ((aorf = aorj.k) == null) {
                aorf = aorf.a;
            }
            final int b5 = aorf.b;
            final int n5 = b5 & 0x1;
            if (n5 != 0 && (b5 & 0x1000000) != 0x0) {
                throw new IllegalArgumentException("TabRenderer.content contains multiple renderers.");
            }
            if (n5 == 0) {
                if ((b5 & 0x1000000) == 0x0) {
                    throw new IllegalArgumentException("TabRenderer.content is missing a renderer.");
                }
            }
            if ((b5 & 0x1000000) != 0x0) {
                ajmo ajmo;
                if ((ajmo = aorf.d) == null) {
                    ajmo = ajmo.a;
                }
                final wyw pf = ((ggq)this).pF();
                final Context nt = ((br)this).nT();
                final ouj a = ouk.a(((omw)hwl.bU.a()).a);
                a.d = (oup)hwl.cG.M(pf, ajmo);
                final ohr ohr = new ohr(nt, a.a());
                ohr.b = acdg.I(pf);
                ohr.a(hwl.bV.d(ajmo).c);
                list2.add(new e(aorj, (View)ohr, (acqv)null, (jwd)null));
            }
            else {
                final vgu e = zxn.e();
                if (e != null) {
                    final anyv a2 = e.a;
                    final LayoutInflater from = LayoutInflater.from(((br)this).nY());
                    aorg aorg;
                    if ((aorg = aorj.j) == null) {
                        aorg = aorg.a;
                    }
                    Object o2;
                    if ((aorg.b & 0x1) != 0x0) {
                        final View inflate = from.inflate(2131625343, (ViewGroup)null);
                        final TextView textView = (TextView)inflate.findViewById(2131429064);
                        aorg aorg2;
                        if ((aorg2 = aorj.j) == null) {
                            aorg2 = aorg.a;
                        }
                        alww alww;
                        if ((alww = aorg2.c) == null) {
                            alww = alww.a;
                        }
                        ajut ajut;
                        if ((ajut = alww.b) == null) {
                            ajut = ajut.a;
                        }
                        textView.setText((CharSequence)acak.b(ajut));
                        o2 = inflate;
                    }
                    else if (a2.i) {
                        final View inflate2 = from.inflate(2131625341, (ViewGroup)null);
                        final View viewById = inflate2.findViewById(2131431333);
                        o2 = inflate2;
                        if (viewById != null) {
                            viewById.setEnabled(false);
                            o2 = inflate2;
                        }
                    }
                    else if (cf(hwl.ah).isPresent()) {
                        o2 = from.inflate(2131625342, (ViewGroup)null);
                        hwl.bw.c((FrameLayout)((View)o2).findViewById(2131429067), acrh.Zc, (gdo)null, ((ggq)this).pF());
                    }
                    else if (ce(hwl.ah).isPresent()) {
                        o2 = from.inflate(2131625342, (ViewGroup)null);
                        hwl.bv.c((FrameLayout)((View)o2).findViewById(2131428978), acrh.Zc, (gdo)null, ((ggq)this).pF());
                    }
                    else {
                        o2 = from.inflate(2131625337, (ViewGroup)null);
                    }
                    final RecyclerView b6 = (RecyclerView)((View)o2).findViewById(2131431186);
                    if (b6 instanceof SnappyRecyclerView) {
                        final SnappyRecyclerView snappyRecyclerView = (SnappyRecyclerView)b6;
                        final arkg bn = hwl.bN;
                        if (Build$VERSION.SDK_INT > 30) {
                            if (bn != null && bn.a() != null) {
                                snappyRecyclerView.U = (hx)new frg(((heo)bn.a()).y(1), ((heo)bn.a()).y(3));
                                snappyRecyclerView.L();
                            }
                        }
                    }
                    final int ca2 = hwl.ca;
                    final int cb2 = hwl.cb;
                    int n6 = ca2;
                    if (this.cz()) {
                        final double n7 = tpe.bd(((br)this).nY());
                        Double.isNaN(n7);
                        final int n8 = (int)(n7 * 0.175);
                        b6.setPadding(n8, 0, n8, 0);
                        n6 = ca2 - (n8 + n8);
                    }
                    if (b6.getWidth() == 0 && hwl.ca > 0 && hwl.cb > 0) {
                        b6.setRight(n6 + b6.getLeft());
                        b6.setBottom(cb2 + b6.getTop());
                    }
                    hwl.bu.f((View)b6);
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout)((View)o2).findViewById(2131431333);
                    if (swipeRefreshLayout == null) {
                        swipeRefreshLayout = new SwipeRefreshLayout(((br)this).nY());
                        swipeRefreshLayout.addView((View)o2, new ViewGroup$LayoutParams(-1, -1));
                        o2 = swipeRefreshLayout;
                    }
                    swipeRefreshLayout.i(new int[] { cr });
                    swipeRefreshLayout.j(cr2);
                    final aezq a3 = aezq.a((Object)hwl.cz.v(swipeRefreshLayout), o2);
                    final frk frk = (frk)a3.a;
                    final View view = (View)a3.b;
                    final Optional optional = (Optional)list.get(j).b;
                    final PaneDescriptor b7 = PaneDescriptor.b((ggq)this);
                    kav kav;
                    if (this.bR()) {
                        kav = hwl.bj;
                    }
                    else {
                        kav = hwl.bi;
                    }
                    final acrm acrm = (acrm)optional.orElse((Object)null);
                    final wyw pf2 = ((ggq)this).pF();
                    final hvm cx = hwl.cX;
                    final acpu dc = hwl.dc;
                    int n9;
                    if (!hwl.cV.contains((Object)((aorj)zxn.b).c)) {
                        n9 = 1;
                    }
                    else {
                        n9 = 3;
                    }
                    final String f = vxg.f(b7.f());
                    acdy acdy;
                    if ("FEwhat_to_watch".equals(f)) {
                        acdy = acdy.b;
                    }
                    else if (f != null && f.startsWith("UC")) {
                        acdy = acdy.c;
                    }
                    else {
                        acdy = acdy.a;
                    }
                    final oug bh = hwl.bH;
                    final acee a4 = acef.a();
                    a4.b(hwl.bC.j());
                    final acef a5 = a4.a();
                    final ActiveStateScrollSelectionController bg = hwl.bg;
                    final Context context = (Context)kav.a.a();
                    context.getClass();
                    final acqg acqg = (acqg)kav.b.a();
                    acqg.getClass();
                    final tgd tgd = (tgd)kav.c.a();
                    tgd.getClass();
                    final tqd tqd = (tqd)kav.d.a();
                    tqd.getClass();
                    final acps acps = (acps)kav.e.a();
                    acps.getClass();
                    final InlinePlaybackController inlinePlaybackController = (InlinePlaybackController)kav.f.a();
                    inlinePlaybackController.getClass();
                    final lkx lkx = (lkx)kav.x.a();
                    final aels aels = (aels)kav.g.a();
                    aels.getClass();
                    final aeea aeea = (aeea)kav.h.a();
                    aeea.getClass();
                    kav.i.a().getClass();
                    final arwh arwh = (arwh)kav.j.a();
                    arwh.getClass();
                    final omw omw = (omw)kav.k.a();
                    omw.getClass();
                    kav.l.a().getClass();
                    final acdp acdp = (acdp)kav.m.a();
                    acdp.getClass();
                    final vai vai = (vai)kav.n.a();
                    vai.getClass();
                    final atke o3 = kav.o;
                    final aeea aeea2 = (aeea)kav.p.a();
                    aeea2.getClass();
                    final ashi ashi = (ashi)kav.q.a();
                    ashi.getClass();
                    final etu etu = (etu)kav.r.a();
                    etu.getClass();
                    final gjl gjl = (gjl)kav.s.a();
                    gjl.getClass();
                    final IntersectionEngine intersectionEngine = (IntersectionEngine)kav.t.a();
                    intersectionEngine.getClass();
                    final cya cya = (cya)kav.u.a();
                    cya.getClass();
                    final vai vai2 = (vai)kav.v.a();
                    vai2.getClass();
                    pf2.getClass();
                    ((View)b6).getClass();
                    cx.getClass();
                    dc.getClass();
                    frk.getClass();
                    acdy.getClass();
                    bh.getClass();
                    final kau kau = new kau(context, acqg, tgd, tqd, acps, inlinePlaybackController, lkx, aels, aeea, arwh, omw, acdp, vai, o3, aeea2, ashi, etu, gjl, intersectionEngine, cya, vai2, acrm, pf2, b6, (vmj)cx, dc, (acrj)this, (acqx)frk, n9, acdy, bh, a5, bg, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                    ((acov)kau).G = (acop)new hwg(this, 0);
                    ((acov)kau).H = (acoq)new jho(this, 1);
                    if (((acov)kau).D != null) {
                        final ahaz builder = ((ahbh)alhi.a).createBuilder();
                        final ahaz builder2 = ((ahbh)alik.a).createBuilder();
                        builder2.copyOnWrite();
                        final alik alik = (alik)builder2.instance;
                        alik.b |= 0x1;
                        alik.c = true;
                        final alik e2 = (alik)builder2.build();
                        builder.copyOnWrite();
                        final alhi alhi = (alhi)builder.instance;
                        e2.getClass();
                        alhi.E = e2;
                        alhi.c |= 0x200000;
                        ((acov)kau).ag(((acov)kau).D, (aiqj)null, (ttg)xpx.o, ((acov)kau).Y(), acoo.a(), (alhi)builder.build());
                        ((acov)kau).D = null;
                    }
                    if (this.cQ.ax(b7)) {
                        ((gjy)kau).a = (ackp)new gjx((gjy)kau);
                        ((ackz)((acns)kau).g).th(((gjy)kau).a);
                        final HomePageMonitor bp = this.bP;
                        if (bp.b.f(45358181L) && !bp.b.bt()) {
                            ((acrh)kau).z((acrg)new ggh(bp));
                        }
                        final PageMonitor bq = this.bQ;
                        if (bq.b.bt()) {
                            ((acrh)kau).z((acrg)new ggl(bq));
                        }
                    }
                    fmy.f((acrh)kau);
                    if (frk != null) {
                        frk.d((acqv)kau);
                        this.dg.add(frk);
                    }
                    ((acns)kau).z((acrg)new hvy(this, kau));
                    ((acns)kau).z((acrg)new zqx((acns)kau, this.aS));
                    b6.aE((iw)new hvz(this));
                    this.ds = new acle();
                    if (((ggq)this).bk()) {
                        this.dd.map((Function)hvo.r).ifPresent((Consumer)new hvr(this, 10));
                    }
                    int n10;
                    if (n3 != 0 && o != null) {
                        this.ds.add(o);
                        n10 = 0;
                    }
                    else {
                        n10 = n3;
                    }
                    aorh aorh;
                    if ((aorh = aorj.i) == null) {
                        aorh = aorh.a;
                    }
                    if ((aorh.b & 0x1) != 0x0) {
                        final acle ds = this.ds;
                        aorh aorh2;
                        if ((aorh2 = aorj.i) == null) {
                            aorh2 = aorh.a;
                        }
                        ahjz ahjz;
                        if ((ahjz = aorh2.c) == null) {
                            ahjz = ahjz.a;
                        }
                        ds.add((Object)ahjz);
                    }
                    else {
                        final aorh k = aorj.i;
                        aorh a6;
                        if (k == null) {
                            a6 = aorh.a;
                        }
                        else {
                            a6 = k;
                        }
                        if ((a6.b & 0x4) != 0x0) {
                            final acle ds2 = this.ds;
                            aorh a7;
                            if ((a7 = k) == null) {
                                a7 = aorh.a;
                            }
                            aohd aohd;
                            if ((aohd = a7.d) == null) {
                                aohd = aohd.a;
                            }
                            ds2.add((Object)aohd);
                        }
                    }
                    ((acns)kau).M((acjn)this.ds);
                    final int n11 = i;
                    if (n11 == -1 && optional.isEmpty()) {
                        if (aorj.f) {
                            n4 = j;
                        }
                        ((acns)kau).P(e);
                    }
                    this.bz((acrh)kau);
                    final anyv a8 = e.a;
                    Object o4;
                    if (!a8.i) {
                        o4 = null;
                    }
                    else {
                        if (tpe.bq(((br)this).nY())) {
                            o4 = new jww((ViewGroup)view, (acqv)kau, this.cS, this.aR, (vmj)this.aJ, this.aQ, this.aN, ((ggq)this).pF(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                        }
                        else {
                            o4 = new jua((ViewGroup)view, (acqv)kau, this.cS, this.aR, (vmj)this.aJ, this.aQ, this.aN, ((ggq)this).pF(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                        }
                        anyn a9;
                        if ((a8.c & 0x4) != 0x0) {
                            anys anys;
                            if ((anys = a8.h) == null) {
                                anys = anys.a;
                            }
                            if (anys.b == 105924295) {
                                a9 = (anyn)anys.c;
                            }
                            else {
                                a9 = anyn.a;
                            }
                        }
                        else {
                            a9 = null;
                        }
                        if (a9 != null) {
                            ((jwd)o4).q(a9);
                        }
                        ((acns)kau).z((acrg)new hwa((jwd)o4));
                    }
                    final tsu tsu = new tsu();
                    tsu.a(b6);
                    ((acns)kau).w((ackn)new ackl((Object)tsu));
                    final jti jti = new jti();
                    jti.j(((acqv)kau).N, ((acns)kau).g);
                    khl.z(jti, this.aQ);
                    ((acns)kau).w(jti.c());
                    new jtd().a(jti);
                    final jvu jvu = new jvu();
                    final RecyclerView b8 = jvu.b;
                    if (b8 != null) {
                        b8.Y(jvu.b());
                        jvu.b.X(jvu.a());
                    }
                    jvu.b = b6;
                    final RecyclerView b9 = jvu.b;
                    if (b9 != null) {
                        b9.u(jvu.b());
                        jvu.b.t(jvu.a());
                    }
                    jvu.d = vxg.f(((ggq)this).aU());
                    if (jvu.c == null) {
                        jvu.c = (ackn)new faw(jvu, 15);
                    }
                    ((acns)kau).w(jvu.c);
                    if (((ggq)this).bm()) {
                        final acrm di = this.di;
                        if (di == null) {
                            final bx cl = this.cL;
                            final boolean booleanValue = (boolean)Optional.ofNullable((Object)((br)this).m).map((Function)hvo.s).orElse((Object)false);
                            final aeea aeea3 = (aeea)((atke)cl.a).a();
                            aeea3.getClass();
                            this.dh = new jug(aeea3, booleanValue, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                        }
                        else {
                            final aeea aeea4 = (aeea)((atke)this.cL.a).a();
                            aeea4.getClass();
                            this.dh = new jug(aeea4, di, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                        }
                        this.dh.e = ((ggq)this).bn();
                        final jug dh = this.dh;
                        if (dh.c == null) {
                            dh.c = (ackn)new faw(dh, 13);
                        }
                        ((acns)kau).w(dh.c);
                    }
                    else {
                        this.dh = null;
                    }
                    ((acns)kau).w((ackn)new faw(this, 3));
                    b6.ae((nt)this.bq.a());
                    list2.add(new e(aorj, view, (acqv)kau, (jwd)o4));
                    final int n12 = n10;
                    hwl = this;
                    n = n11;
                    n3 = n12;
                }
            }
            ++j;
        }
        if ((i = n) == -1) {
            i = n4;
        }
        hwl.ae.m(hwl.e, (List)list2, i);
        if (((toy)hwl.aW).j() > 1) {
            this.bB();
        }
        hwl.de = hwl.ae.h();
        hwl.aZ.c(hwl.ae.h());
        final ksi az = hwl.aZ;
        final List list3 = (List)Collection$_EL.stream((Collection)list).map((Function)hvo.t).collect(afci.a);
        final AppTabsBar aw = hwl.aW;
        if (list3 != null && aw != null) {
            Object b10;
            aiqj aiqj;
            for (i = 0; i < list3.size(); ++i) {
                b10 = list3.get(i).b;
                if (b10 != null) {
                    if ((aiqj = ((aorj)b10).d) == null) {
                        aiqj = aiqj.a;
                    }
                    if (az.d != null && ksi.d(aiqj, "FEsubscriptions")) {
                        az.d.a = ((toy)aw).k(i);
                    }
                    else if (az.e != null && ksi.d(aiqj, "FEaccount")) {
                        az.e.a = ((toy)aw).k(i);
                    }
                    else if (az.h != null && ksi.d(aiqj, "FEtrending")) {
                        az.h.a = ((toy)aw).k(i);
                    }
                }
            }
            az.a.c();
        }
        final kau r = this.r();
        if (r != null) {
            ((fzf)hwl.aq.a()).n(((acqv)r).N);
        }
        hwl.db.tu((Object)Optional.ofNullable((Object)r));
    }
    
    private final boolean cv() {
        if (jzg.A(this.cn, this.cm)) {
            final ListenableFuture a = this.an.a();
            if (a.isDone()) {
                try {
                    final jqf jqf = (jqf)afwm.u((Future)a);
                    final vai cn = this.cn;
                    final vai cm = this.cm;
                    jqe jqe;
                    if ((jqe = jqe.a(jqf.m)) == null) {
                        jqe = jqe.a;
                    }
                    return jzg.B(cn, cm, jqe);
                }
                catch (final Exception ex) {
                    ttr.f("BrowseFragment", "Something went wrong while getting data saving settings", (Throwable)ex);
                }
            }
        }
        return false;
    }
    
    private final boolean cw() {
        return adkp.ae((Object)vxg.f(this.aL()), (Object)"FEwhat_to_watch");
    }
    
    private final boolean cx() {
        return !((tjm)this.bz.a()).p() && TextUtils.equals((CharSequence)vxg.f(this.aL()), (CharSequence)"FEwhat_to_watch");
    }
    
    private final boolean cy() {
        return (boolean)this.dd.map((Function)hvo.b).orElse((Object)false);
    }
    
    private final boolean cz() {
        return tpe.bq(((br)this).nY()) && fbu.ah(this.cf) && this.cw();
    }
    
    public View K(LayoutInflater cloneInContext, final ViewGroup dz, final Bundle bundle) {
        if (this.cj.P()) {
            final tua bo = this.bO;
            final int hashCode = this.hashCode();
            final StringBuilder sb = new StringBuilder("BrowseFragment#onCreateView (");
            sb.append(hashCode);
            sb.append(")");
            bo.a(sb.toString(), new Exception());
        }
        this.c = ((br)this).nZ();
        if (!this.cj.Q()) {
            this.cr(bundle);
        }
        else {
            this.ck();
        }
        final jyk bf = this.bF;
        if (bf != null) {
            ((Set<jyk>)this.cJ.a).add(bf);
        }
        if (this.bR()) {
            final boolean b = this.co.aU() && this.co.aV();
            final Context nt = ((br)this).nT();
            int n;
            if (!b) {
                n = 2132084272;
            }
            else {
                n = 2132084273;
            }
            final ContextThemeWrapper cy = new ContextThemeWrapper(nt, n);
            this.cY = (Context)cy;
            cloneInContext = cloneInContext.cloneInContext((Context)cy);
        }
        this.aI = this.bK.a();
        if (dz != null) {
            this.dz = dz;
            this.ca = dz.getWidth();
            this.cb = dz.getHeight();
            dz.addOnLayoutChangeListener(this.dA);
        }
        this.d = Optional.of((Object)cloneInContext.inflate(2131624108, dz, false));
        if (this.ck.X()) {
            this.d.ifPresent((Consumer)new hoa(this, 19));
        }
        if (this.ci.bV()) {
            this.d.ifPresent((Consumer)new hvr(this, 1));
        }
        final gdh bu = this.bu;
        FrameLayout frameLayout;
        if (fbu.Z(this.az) && dz != null) {
            frameLayout = (FrameLayout)dz;
        }
        else {
            frameLayout = (FrameLayout)this.d.get();
        }
        bu.c(frameLayout, (acrj)this, (gdo)this, ((ggq)this).pF());
        final long dw = this.dw;
        if (dw > 0L) {
            ((tgd)this.ct.d).d((Object)new fhj(dw));
            this.dw = 0L;
        }
        final HashSet du = new HashSet();
        this.du = du;
        final hwn bl = this.bl;
        final Context context = (Context)bl.a.a();
        context.getClass();
        final tqd tqd = (tqd)bl.b.a();
        tqd.getClass();
        final ksi ksi = (ksi)bl.c.a();
        ksi.getClass();
        final gbo gbo = (gbo)bl.d.a();
        gbo.getClass();
        final MealbarPromoController mealbarPromoController = (MealbarPromoController)bl.e.a();
        mealbarPromoController.getClass();
        final wyv wyv = (wyv)bl.f.a();
        wyv.getClass();
        final acwn acwn = (acwn)bl.g.a();
        acwn.getClass();
        bl.h.a().getClass();
        final vcy vcy = (vcy)bl.i.a();
        vcy.getClass();
        final glf glf = (glf)bl.j.a();
        glf.getClass();
        final fjt fjt = (fjt)bl.k.a();
        fjt.getClass();
        final kuf kuf = (kuf)bl.l.a();
        kuf.getClass();
        final tbh tbh = (tbh)bl.m.a();
        tbh.getClass();
        final actt actt = (actt)bl.n.a();
        actt.getClass();
        final aeea aeea = (aeea)bl.o.a();
        aeea.getClass();
        this.bW = new hwm(context, tqd, ksi, gbo, mealbarPromoController, wyv, acwn, vcy, glf, fjt, (Set)du, kuf, tbh, actt, aeea, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        final vnu aj = this.aJ;
        final pvh pvh = new pvh(this);
        final atke by = this.by;
        final arwh cs = this.cs;
        final atke bz = this.bz;
        final aezp j = aezp.j((Object)this.bA.orElse((Object)null));
        final wyw pf = ((ggq)this).pF();
        final vai cj = this.cj;
        Optional optional;
        if ((this.bS.e(tnu.am) & 0x2L) != 0x0L) {
            optional = Optional.of((Object)tlu.d);
        }
        else {
            optional = Optional.empty();
        }
        this.cX = new hvm(aj, pvh, by, cs, bz, j, pf, cj, optional, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.bL.r();
        this.dl.clear();
        ((SpecificNetworkErrorViewLoadingFrameLayout)this.d.get()).h(new pvh(this));
        acrr acrr;
        if (this.bR()) {
            acrr = this.bh;
        }
        else {
            acrr = this.bf;
        }
        this.dc = (acpu)acrr.a((vmj)this.cX, ((ggq)this).pF());
        this.ai = ((fzf)this.aq.a()).s();
        int n2 = ((fzf)this.aq.a()).d();
        int n3 = ((fzf)this.aq.a()).e();
        int n4 = this.c.getColor(2131102282);
        int n5 = this.c.getColor(2131102283);
        if (this.bR()) {
            n2 = tpe.cr(((br)this).nY(), 2130970845);
            n3 = tpe.cr(((br)this).nY(), 2130970910);
            n4 = tpe.cr(((br)this).nY(), 2130970924);
            n5 = tpe.cr(((br)this).nY(), 2130970926);
        }
        final fa at = this.at;
        int bz2 = n2;
        int bz3 = n3;
        int bz4 = n4;
        int bz5 = n5;
        if (bundle != null) {
            bz2 = n2;
            bz3 = n3;
            bz4 = n4;
            bz5 = n5;
            if (at != null) {
                bz2 = bZ(bundle, "instance_action_bar_color", (Context)at);
                bz3 = bZ(bundle, "instance_status_bar_color", (Context)at);
                bz4 = bZ(bundle, "instance_activated_text_color", (Context)at);
                bz5 = bZ(bundle, "instance_secondary_text_color", (Context)at);
            }
        }
        this.as = ezt.s(bz2);
        this.aA = ezt.s(bz3);
        this.aB = ezt.s(bz4);
        this.aC = ezt.s(bz5);
        this.aD = this.aw.a.d;
        this.ae = this.cw.b(((ggq)this).pF(), ((br)this).P(2132019929));
        final asht aq = ((asht)this.da).G(new hsf(this, 8)).aq((asjr)new gdc(this, 19));
        aoqn aoqn;
        if ((aoqn = this.cf.b().s) == null) {
            aoqn = aoqn.a;
        }
        ahub ahub;
        if ((ahub = aoqn.g) == null) {
            ahub = ahub.a;
        }
        asht af = aq;
        if (ahub.m) {
            af = aq.af(this.bt);
        }
        this.dm = af.aH(new hsf(this, 13));
        final hwj cz = this.cZ;
        Label_2042: {
            if (cz != null && !cz.a.isEmpty() && !this.bO(true)) {
                final hwj cz2 = this.cZ;
                if (!jzg.A(this.cn, this.cm) || !this.cv() || cz2.o) {
                    this.cl(this.cZ.d);
                    this.do = this.cZ.c;
                    ((ggq)this).pF().D((wzz)new wyt(this.do));
                    final BrowseResponseModel d = this.cZ.d;
                    ksp ca;
                    if ((this.ah = d) != null) {
                        ca = this.cA(d);
                    }
                    else {
                        ca = null;
                    }
                    if (ca != null) {
                        this.cB(ca);
                    }
                    this.cC(ca);
                    final hwj cz3 = this.cZ;
                    this.ag = cz3.e;
                    this.di = cz3.r;
                    this.cu((List)cz3.a, this.cg(), this.cZ.b);
                    final acqv b2 = this.ae.b();
                    if (b2 != null) {
                        ((acrh)b2).d();
                    }
                    ((SpecificNetworkErrorViewLoadingFrameLayout)this.d.get()).e();
                    final hwj cz4 = this.cZ;
                    this.ai = cz4.f;
                    this.aj = cz4.g;
                    this.ap = cz4.h;
                    this.dp = cz4.n;
                    this.bX = cz4.p;
                    this.bY = cz4.q;
                    this.as = (ActionBarColor)Optional.ofNullable((Object)cz4.i).orElseGet((Supplier)fdi.o);
                    this.aA = (ActionBarColor)Optional.ofNullable((Object)this.cZ.j).orElseGet((Supplier)fdi.p);
                    this.aB = (ActionBarColor)Optional.ofNullable((Object)this.cZ.k).orElseGet((Supplier)fdi.q);
                    this.aC = (ActionBarColor)Optional.ofNullable((Object)this.cZ.l).orElseGet((Supplier)fdi.r);
                    this.aD = (ActionBarColor)Optional.ofNullable((Object)this.cZ.m).orElseGet((Supplier)fdi.s);
                    this.ct();
                    this.ao = false;
                    this.dx.set(true);
                    this.bC.g((aiqj)Optional.ofNullable((Object)this.ah).map((Function)hvo.f).filter((Predicate)hoi.n).map((Function)hvo.g).orElse((Object)null));
                    this.cq();
                    this.co(true, Optional.empty(), bU(this.ah));
                    this.cp(true);
                    this.cn();
                    final asir dj = this.dj;
                    if (dj != null) {
                        dj.dispose();
                    }
                    this.dj = (asir)Optional.ofNullable((Object)this.q()).map((Function)new hra(this, 5)).orElse((Object)asfn.c());
                    if (this.cw() && this.bY.isPresent()) {
                        Optional.ofNullable((Object)this.bx).ifPresent((Consumer)new hoa(this, 20));
                    }
                    final kag bm = this.bM;
                    if (bm != null) {
                        bm.b((List)this.cZ.u);
                    }
                    this.bC((List)this.cZ.v);
                    if (Build$VERSION.SDK_INT >= 28) {
                        ((SpecificNetworkErrorViewLoadingFrameLayout)this.d.get()).setAccessibilityPaneTitle(this.ag);
                    }
                    final BrowseResponseModel ah = this.ah;
                    if (ah != null) {
                        this.cg.a(ah.a);
                    }
                    break Label_2042;
                }
            }
            this.ao = true;
        }
        if (!((ahbc)this.ak).ry((ahaq)BrowseEndpointOuterClass.browseEndpoint)) {
            ttr.b("Browse Fragment was given a navigation endpoint without browse data.");
        }
        if (Build$VERSION.SDK_INT < 28) {
            Optional.ofNullable((Object)((br)this).od()).map((Function)hvo.c).map((Function)hvo.d).ifPresent((Consumer)hvn.d);
        }
        if (bundle != null) {
            final gkv a = this.bK.a();
            if (a != gkv.a(bundle.getInt("PREVIOUS_THEME", -1)).e((Object)a)) {
                this.ao = false;
                alxp alxp;
                if ((alxp = this.cf.b().e) == null) {
                    alxp = alxp.a;
                }
                if (alxp.ae) {
                    this.aH.e(a.d);
                }
            }
        }
        if (bundle != null && bundle.containsKey("instance_app_bar_state")) {
            ((fzf)this.aq.a()).k(bundle.getParcelable("instance_app_bar_state"));
        }
        return (View)this.d.get();
    }
    
    public final void W() {
        super.W();
        final Iterator iterator = this.dg.iterator();
        while (iterator.hasNext()) {
            ((frk)iterator.next()).b();
        }
        this.bG.e();
    }
    
    public final wzr aK() {
        return wzr.a;
    }
    
    protected final aiqj aL() {
        if (this.bQ()) {
            final aorj h = this.ae.h();
            if (h != null && (h.b & 0x2) != 0x0 && !((ahbh)h).equals((Object)this.de)) {
                aiqj aiqj;
                if ((aiqj = h.d) == null) {
                    aiqj = aiqj.a;
                }
                return aiqj;
            }
        }
        return this.ak;
    }
    
    public final alhi aM() {
        return xmm.ae(this.ak, aliu.a);
    }
    
    public final alhi aN() {
        return xmm.ae(this.ak, aliu.b);
    }
    
    public final void aO(final hwf hwf) {
        monitorenter(this);
        try {
            this.by(hwf);
            if (hwf.b.j()) {
                this.d.ifPresent((Consumer)hvn.c);
            }
            else {
                this.ci(hwf);
            }
            final boolean c = hwf.c;
            final aiqj aiqj = null;
            if (c && !hwf.b.j()) {
                this.bL();
                final gac e = this.e;
                if (e != null) {
                    e.f(this.dB);
                }
                if (this.r() != null) {
                    alxp alxp;
                    if ((alxp = this.cf.b().e) == null) {
                        alxp = alxp.a;
                    }
                    if (alxp.i) {
                        alxp alxp2;
                        if ((alxp2 = this.cf.b().e) == null) {
                            alxp2 = alxp.a;
                        }
                        final int j = alxp2.j;
                        final int l = fbu.L(this.cf);
                        final String f = vxg.f(this.aL());
                        int n2 = 0;
                        Label_0344: {
                            if (f != null) {
                                int n = 0;
                                Label_0305: {
                                    switch (f.hashCode()) {
                                        case 1038153415: {
                                            if (f.equals("FEwhat_to_watch")) {
                                                n = 0;
                                                break Label_0305;
                                            }
                                            break;
                                        }
                                        case 1012886772: {
                                            if (f.equals("FEexplore")) {
                                                n = 1;
                                                break Label_0305;
                                            }
                                            break;
                                        }
                                        case 363605732: {
                                            if (f.equals("FEtrending")) {
                                                n = 2;
                                                break Label_0305;
                                            }
                                            break;
                                        }
                                        case -381996905: {
                                            if (f.equals("FEsubscriptions")) {
                                                n = 3;
                                                break Label_0305;
                                            }
                                            break;
                                        }
                                    }
                                    n = -1;
                                }
                                if (n == 0) {
                                    n2 = 1;
                                    break Label_0344;
                                }
                                if (n == 1) {
                                    n2 = 3;
                                    break Label_0344;
                                }
                                if (n == 2) {
                                    n2 = 4;
                                    break Label_0344;
                                }
                                if (n == 3) {
                                    n2 = 5;
                                    break Label_0344;
                                }
                            }
                            n2 = 0;
                        }
                        alxp alxp3;
                        if ((alxp3 = this.cf.b().e) == null) {
                            alxp3 = alxp.a;
                        }
                        this.a = acir.b(this.aQ, this.aM, this.cR, n2, j, l, alxp3.af, this.bD, fbu.U(this.cf), fbu.V(this.cf), this.bJ);
                        if (this.cp.f(45376606L) && j > 0) {
                            final View o = ((br)this).O;
                            RecyclerView b;
                            if (o != null) {
                                b = (RecyclerView)o.findViewById(2131431186);
                            }
                            else {
                                b = null;
                            }
                            if (b != null) {
                                final ffc b2 = new ffc(this.aQ, this.bR, b);
                                if (!b2.a) {
                                    b2.a = true;
                                    b.aE((iw)b2);
                                    b2.b = b;
                                }
                                this.b = b2;
                                final frk q = this.q();
                                if (q != null) {
                                    this.am = ((asht)q.c).K((asjs)hus.i).aH(new hsf(this, 10));
                                }
                            }
                        }
                        this.e.c(this.dB);
                    }
                }
                if (!hwf.b()) {
                    final eg ct = this.ct;
                    ((toj)ct.b).s(17);
                    ((ffe)ct.c).b("ol");
                    ((tgd)ct.d).d((Object)new fhi());
                    final xan dv = this.dv;
                    if (dv != null) {
                        String s;
                        if (!hwf.e) {
                            s = "ol";
                        }
                        else {
                            s = "br_lrpr";
                        }
                        dv.c(s);
                    }
                }
            }
            final akhz a = hwf.b.a;
            final kag bm = this.bM;
            final vgu cc = this.cc();
            if (bm != null && cc != null) {
                bm.a((List)a.w, cc.a);
            }
            final ksb bc = this.bC;
            aiqj aiqj2 = aiqj;
            if ((a.b & 0x40000) != 0x0 && (aiqj2 = a.p) == null) {
                aiqj2 = aiqj.a;
            }
            bc.g(aiqj2);
            this.bW.b(a);
            akli akli;
            if ((akli = a.c) == null) {
                akli = akli.a;
            }
            this.df = hxw.e(akli);
            this.ao = hwf.d;
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void aP(final boolean b) {
        this.af.c(b);
    }
    
    public final gae aT(final gae gae) {
        return (gae)asie.I(gae).J((asjr)new gdc(this, 20)).J((asjr)new hvs(this, 1)).J((asjr)new hvs(this, 0)).ac();
    }
    
    public final asht aW() {
        return ((asht)this.db).Z((asjr)huy.l);
    }
    
    public final asht aX() {
        return asht.T((Callable)new hvu(this, 2));
    }
    
    public final asht aZ() {
        return asht.T((Callable)new hvu(this, 0));
    }
    
    public final void aa() {
        ((tgd)this.ct.d).d((Object)new fhk());
        this.bR.o(15);
        super.aa();
        this.bR.j(15);
    }
    
    public final void b(final boolean b) {
        Optional.ofNullable((Object)this.bx).ifPresent((Consumer)new iyg(b, 1));
    }
    
    public final void bA() {
        if (this.cx()) {
            this.d.ifPresent((Consumer)new hvr(this, 5));
        }
    }
    
    public final void bB() {
        this.au = null;
        ((fzf)this.aq.a()).l();
    }
    
    public final void bC(final List list) {
        for (final anuv anuv : list) {
            if (anuv.ry((ahaq)EngagementPanelSectionListRendererOuterClass.engagementPanelSectionListRenderer)) {
                this.bL.o((ajpq)anuv.rx((ahaq)EngagementPanelSectionListRendererOuterClass.engagementPanelSectionListRenderer));
                this.dl.add(anuv);
            }
        }
    }
    
    protected void bD() {
        this.e.c((gab)new hwh(this, 0));
    }
    
    public final void bE(final Object o, final Object o2) {
        final acle ds = this.ds;
        if (ds != null) {
            ds.o(o, o2);
        }
    }
    
    public final void bF(final boolean b, final boolean b2) {
        if (b) {
            this.dp = this.cT.cd();
            final ksi az = this.aZ;
            final fxb d = az.d;
            if (d != null) {
                d.a = null;
            }
            final fxb e = az.e;
            if (e != null) {
                e.a = null;
            }
            final fxb f = az.f;
            if (f != null) {
                f.a = null;
            }
            final fxb g = az.g;
            if (g != null) {
                g.a = null;
            }
            final fxb h = az.h;
            if (h != null) {
                h.a = null;
            }
            az.b.a((View)null);
            final gle c = az.c;
            if (c != null) {
                c.a((aljh)null);
            }
            final Iterator iterator = this.du.iterator();
            while (iterator.hasNext()) {
                this.bm.g((String)iterator.next());
            }
            this.du.clear();
        }
        this.aE = false;
        this.dr = false;
        this.ae.k();
        ((fzf)this.aq.a()).h();
        final jyk bf = this.bF;
        if (bf != null) {
            bf.h();
        }
        this.dk.b();
        final asir dj = this.dj;
        if (dj != null) {
            dj.dispose();
        }
        this.bG.f();
        final gec af = this.af;
        af.e();
        af.b();
        final fzw m = af.m;
        ((List)m.b).clear();
        ((List)m.a).clear();
        af.d = null;
        af.e = null;
        Optional.ofNullable((Object)af.h).ifPresent((Consumer)fwj.m);
        Optional.ofNullable((Object)af.i).ifPresent((Consumer)fwj.n);
        final Iterator iterator2 = this.dg.iterator();
        while (iterator2.hasNext()) {
            ((frk)iterator2.next()).b();
        }
        this.dg.clear();
        this.bB();
        final boolean b3 = this.cw() && b && this.cm.bJ();
        final boolean cx = this.cx();
        Label_1684: {
            if (!cx || this.cm.f(45371570L)) {
                if (b3) {
                    final boolean f2 = this.cm.f(45377147L);
                    final ahaz builder = ((ahbh)anyv.a).createBuilder();
                    final ahbb ahbb = (ahbb)((ahbh)alke.a).createBuilder();
                    final ahaz builder2 = ((ahbh)anyp.a).createBuilder();
                    final anyq f3 = anyq.f;
                    builder2.copyOnWrite();
                    final anyp anyp = (anyp)builder2.instance;
                    anyp.c = f3.g;
                    anyp.b |= 0x1;
                    final anyp ak = (anyp)builder2.build();
                    for (int i = 0; i < 5; ++i) {
                        final ahaz builder3 = ((ahbh)alkh.a).createBuilder();
                        builder3.copyOnWrite();
                        final alkh alkh = (alkh)builder3.instance;
                        ak.getClass();
                        alkh.ak = ak;
                        alkh.h |= 0x4000;
                        ahbb.l((alkh)builder3.build());
                    }
                    final ahaz builder4 = ((ahbh)anyy.a).createBuilder();
                    final alke j = (alke)((ahaz)ahbb).build();
                    builder4.copyOnWrite();
                    final anyy anyy = (anyy)builder4.instance;
                    j.getClass();
                    anyy.j = j;
                    anyy.b |= 0x10;
                    builder.bB((anyy)builder4.build());
                    if (!f2) {
                        final ahaz builder5 = ((ahbh)ajsn.a).createBuilder();
                        final ahaz builder6 = ((ahbh)aikr.a).createBuilder();
                        final ahaz builder7 = ((ahbh)aikt.a).createBuilder();
                        final aiks k = aiks.i;
                        builder7.copyOnWrite();
                        final aikt aikt = (aikt)builder7.instance;
                        aikt.c = k.s;
                        aikt.b |= 0x1;
                        builder6.copyOnWrite();
                        final aikr aikr = (aikr)builder6.instance;
                        final aikt e2 = (aikt)builder7.build();
                        e2.getClass();
                        aikr.e = e2;
                        aikr.b |= 0x1;
                        builder6.copyOnWrite();
                        final aikr aikr2 = (aikr)builder6.instance;
                        aikr2.b |= 0x100;
                        aikr2.i = false;
                        final aikr aikr3 = (aikr)builder6.build();
                        final ahbb ahbb2 = (ahbb)((ahbh)anuv.a).createBuilder();
                        ahbb2.e((ahaq)ChipCloudRendererOuterClass.chipCloudChipRenderer, (Object)aikr3);
                        final anuv anuv = (anuv)((ahaz)ahbb2).build();
                        for (int l = 0; l < 4; ++l) {
                            builder5.copyOnWrite();
                            final ajsn ajsn = (ajsn)builder5.instance;
                            anuv.getClass();
                            ajsn.a();
                            ajsn.c.add((Object)anuv);
                        }
                        final ahaz builder8 = ((ahbh)anyu.a).createBuilder();
                        final ajsn c2 = (ajsn)builder5.build();
                        builder8.copyOnWrite();
                        final anyu anyu = (anyu)builder8.instance;
                        c2.getClass();
                        anyu.c = c2;
                        anyu.b = 213380311;
                        final anyu g2 = (anyu)builder8.build();
                        builder.copyOnWrite();
                        final anyv anyv = (anyv)builder.instance;
                        g2.getClass();
                        anyv.g = g2;
                        anyv.c |= 0x2;
                    }
                    final anyv c3 = (anyv)builder.build();
                    final ahaz builder9 = ((ahbh)akii.a).createBuilder();
                    final ahaz builder10 = ((ahbh)akic.a).createBuilder();
                    final ahaz builder11 = ((ahbh)aorj.a).createBuilder();
                    final ahaz builder12 = ((ahbh)aorf.a).createBuilder();
                    builder12.copyOnWrite();
                    final aorf aorf = (aorf)builder12.instance;
                    c3.getClass();
                    aorf.c = c3;
                    aorf.b |= 0x1;
                    final aorf k2 = (aorf)builder12.build();
                    builder11.copyOnWrite();
                    final aorj aorj = (aorj)builder11.instance;
                    k2.getClass();
                    aorj.k = k2;
                    aorj.b |= 0x2000;
                    final aorj c4 = (aorj)builder11.build();
                    builder10.copyOnWrite();
                    final akic akic = (akic)builder10.instance;
                    c4.getClass();
                    akic.c = c4;
                    akic.b = 58174010;
                    builder9.aQ((akic)builder10.build());
                    final akii c5 = (akii)builder9.build();
                    final ahbb ahbb3 = (ahbb)((ahbh)akhz.a).createBuilder();
                    final ahaz builder13 = ((ahbh)akia.a).createBuilder();
                    builder13.copyOnWrite();
                    final akia akia = (akia)builder13.instance;
                    c5.getClass();
                    akia.c = c5;
                    akia.b = 58173949;
                    final akia f4 = (akia)builder13.build();
                    ((ahaz)ahbb3).copyOnWrite();
                    final akhz akhz = (akhz)ahbb3.instance;
                    f4.getClass();
                    akhz.f = f4;
                    akhz.b |= 0x40;
                    final ahaz builder14 = ((ahbh)akhu.a).createBuilder();
                    final ajsp a = ajsp.a;
                    builder14.copyOnWrite();
                    final akhu akhu = (akhu)builder14.instance;
                    a.getClass();
                    akhu.c = a;
                    akhu.b = 50236216;
                    final akhu d2 = (akhu)builder14.build();
                    ((ahaz)ahbb3).copyOnWrite();
                    final akhz akhz2 = (akhz)ahbb3.instance;
                    d2.getClass();
                    akhz2.d = d2;
                    akhz2.b |= 0x2;
                    final ahbb ahbb4 = (ahbb)((ahbh)akli.a).createBuilder();
                    ((ahaz)ahbb4).copyOnWrite();
                    final akli akli = (akli)ahbb4.instance;
                    akli.b |= 0x8;
                    akli.e = 0;
                    ((ahaz)ahbb3).copyOnWrite();
                    final akhz akhz3 = (akhz)ahbb3.instance;
                    final akli c6 = (akli)((ahaz)ahbb4).build();
                    c6.getClass();
                    akhz3.c = c6;
                    akhz3.b |= 0x1;
                    final BrowseResponseModel ah = new BrowseResponseModel((akhz)((ahaz)ahbb3).build());
                    ah.i("browse_response_is_canned", (Object)true);
                    this.ah = ah;
                    final hwe a2 = hwf.a();
                    final BrowseResponseModel ah2 = this.ah;
                    ah2.getClass();
                    a2.b(ah2);
                    a2.c(this.aL());
                    a2.e(false);
                    a2.f(false);
                    a2.d(false);
                    final hwf a3 = a2.a();
                    this.bZ = false;
                    this.ci(a3);
                    break Label_1684;
                }
            }
            ((SpecificNetworkErrorViewLoadingFrameLayout)this.d.get()).f(false);
        }
        if (b2 && cx) {
            teu.k(this.cr.b(), this.bs, (tes)new hug(this, 2), (tet)new hgd(this, 4));
        }
    }
    
    public final void bG(final akhz akhz) {
        final vcy ba = this.ba;
        final afel d = afeq.d();
        d.j((Iterable)akhz.n);
        d.j((Iterable)akhz.o);
        ba.b((List)d.g());
    }
    
    public final void bH(final ksw ksw) {
        this.as = ezt.s(ksw.c.mt(((br)this).nY()));
        this.aA = ezt.s(ksw.d.mt(((br)this).nY()));
        this.aD = ezt.s(ksw.e.mt(((br)this).nY()));
        this.aB = ezt.s(ksw.a.mt(((br)this).nY()));
        this.aC = ezt.s(ksw.b.mt(((br)this).nY()));
        this.bB();
    }
    
    public final void bI(final aiqj ak) {
        ak.getClass();
        this.ak = ak;
    }
    
    public final void bJ() {
        if (((br)this).aw()) {
            final gec af = this.af;
            final Optional map = this.dd.filter((Predicate)hoi.o).map((Function)hvo.o).map((Function)hvo.p);
            final gdz gdz = null;
            Object o = map.orElse((Object)null);
            if (o == null) {
                final kau r = this.r();
                o = gdz;
                if (r != null) {
                    final aixz c = r.c;
                    if (c == null) {
                        o = gdz;
                    }
                    else {
                        o = new gdx(c);
                    }
                }
            }
            af.g((gdz)o, ((ggq)this).pF());
        }
    }
    
    protected final void bK() {
        final SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout = (SpecificNetworkErrorViewLoadingFrameLayout)this.d.get();
        specificNetworkErrorViewLoadingFrameLayout.f = this.cc;
        specificNetworkErrorViewLoadingFrameLayout.g(5);
    }
    
    public final void bL() {
        final ffc b = this.b;
        if (b != null) {
            b.d();
        }
        this.b = null;
        this.am.dispose();
        Optional.ofNullable((Object)this.a).ifPresent((Consumer)hvn.i);
        this.a = null;
    }
    
    public final void bM() {
        if (((br)this).od() == null) {
            return;
        }
        this.bI.b();
    }
    
    public final boolean bN(final acqv acqv, final frk frk) {
        if (this.bF == null || acqv == null || frk == null) {
            return false;
        }
        if (this.ae.j().size() != 1) {
            this.ae.j().size();
            return false;
        }
        return true;
    }
    
    final boolean bO(final boolean b) {
        boolean b2 = false;
        Label_0088: {
            if (b) {
                final hwj cz = this.cZ;
                if (cz != null && this.bS((Collection)Collection$_EL.stream((Collection)this.cd.b.entrySet()).filter((Predicate)new law(cz.w, 14)).map((Function)tms.p).collect(afci.a))) {
                    b2 = true;
                    break Label_0088;
                }
            }
            b2 = false;
        }
        final aiqj ak = this.ak;
        if ((!TextUtils.equals((CharSequence)vxg.f(ak), (CharSequence)"FEactivity") || this.aV.a("FEactivity") <= 0) && !TextUtils.equals((CharSequence)vxg.f(ak), (CharSequence)"FEmy_videos") && (ak == null || (((aicj)((ahbc)ak).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint)).b & 0x40) == 0x0)) {
            if (this.ap != 0L && fbu.K(this.cf) != 0) {
                if (TextUtils.equals((CharSequence)vxg.f(this.aL()), (CharSequence)"FEwhat_to_watch")) {
                    if (this.aO.d() > this.ap) {
                        return true;
                    }
                }
            }
            if (!b2) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean bP() {
        if (this.cm.bJ()) {
            final BrowseResponseModel ah = this.ah;
            if (ah != null && (boolean)ah.h("browse_response_is_canned", (Object)false)) {
                return true;
            }
        }
        return false;
    }
    
    protected boolean bQ() {
        return this.ae != null && !TextUtils.equals((CharSequence)"FEactivity", (CharSequence)vxg.f(this.ak));
    }
    
    public final boolean bR() {
        return this.bW() == 4;
    }
    
    public final boolean bS(final Collection collection) {
        return !collection.isEmpty() && Collection$_EL.stream((Collection)this.ce.get()).filter((Predicate)new fqn(collection, 13)).findFirst().isPresent();
    }
    
    protected final void bV() {
        final Iterator iterator = this.dg.iterator();
        while (iterator.hasNext()) {
            ((frk)iterator.next()).sb(1);
        }
    }
    
    final int bW() {
        return iaj.d(this.aL(), this.cs);
    }
    
    public final CharSequence bb() {
        return this.ag;
    }
    
    public final Object bc() {
        if (this.ao) {
            return null;
        }
        final afeq afeq = (afeq)Collection$_EL.stream((Collection)Optional.ofNullable((Object)this.ae).map((Function)hvo.h).orElse((Object)afeq.q())).map((Function)hvo.j).collect(afci.a);
        final gac e = this.e;
        int a;
        if (e != null) {
            a = e.a();
        }
        else {
            a = 0;
        }
        return new hwj(afeq, a, this.do, this.ah, this.ag, this.ai, this.aj, this.ap, this.as, this.aA, this.aB, this.aC, this.aD, this.dp, this.cv(), this.bX, this.bY, (acrm)Optional.ofNullable((Object)this.dh).map((Function)hvo.k).orElse((Object)null), (acrm)Optional.ofNullable((Object)this.bF).map((Function)hvo.l).orElse((Object)null), this.bG.b(), (afeq)Optional.ofNullable((Object)this.bM).map((Function)hvo.m).orElse((Object)afeq.q()), afeq.o((Collection)this.dl), afeq.o((Collection)this.ce.get()), Instant.ofEpochMilli(this.aO.c()));
    }
    
    public final String bd() {
        return this.df;
    }
    
    public final void be(final int n) {
        new msr(((br)this).getLifecycle()).N().K((asjs)hus.h).Z((asjr)new gdc(this, 18)).K((asjs)hus.j).Z((asjr)huy.g).aH((asjm)new l(n, 1));
    }
    
    public final void bf() {
        if (this.cw()) {
            final jyk bf = this.bF;
            if (bf != null) {
                bf.p();
            }
        }
    }
    
    public final void bg() {
        this.br(true);
    }
    
    public final void bh() {
        final gac e = this.e;
        if (e != null) {
            e.g();
        }
    }
    
    public final void bi(final Object o) {
        if (!(o instanceof hwj)) {
            return;
        }
        this.cZ = (hwj)o;
    }
    
    public final void bj(final boolean ag) {
        this.aG = ag;
        if (((ggq)this).bk()) {
            final acle ds = this.ds;
            if (ds != null) {
                final fzw af = this.aF;
                if (af != null) {
                    if (!this.aG) {
                        ds.remove((Object)af);
                        return;
                    }
                    if (!((tfz)ds).contains((Object)af)) {
                        ((tfz)this.ds).add(0, (Object)this.aF);
                    }
                }
            }
        }
    }
    
    public final boolean bp() {
        final gac e = this.e;
        if (e != null && e.i()) {
            if (this.ch.bC()) {
                this.e.e();
            }
            else {
                this.e.h();
            }
            if (this.ch.f(45359224L)) {
                Optional.ofNullable((Object)this.q()).ifPresent((Consumer)hvn.f);
            }
            return true;
        }
        return false;
    }
    
    public final boolean bq() {
        final hwm bw = this.bW;
        if (((szk)bw.k).d()) {
            ((szk)bw.k).a();
            return true;
        }
        if (this.bL.w()) {
            this.bL.k();
            return true;
        }
        final jyk bf = this.bF;
        if (bf != null && bf.p()) {
            return true;
        }
        if (this.bG.j()) {
            return true;
        }
        final jwd jwd = (jwd)this.ae.i((Function)ksr.g);
        if (jwd != null) {
            if (jwd.f) {
                final ahaz h = jwd.h;
                if (h != null && jwd.g) {
                    jwd.t(h);
                    return true;
                }
            }
        }
        return false;
    }
    
    public final void br(final boolean b) {
        this.cj(this.ak, b, true);
    }
    
    final void bs(final boolean b, final boolean b2, final long n) {
        final String f = vxg.f(this.aL());
        int n2 = 5;
        int n3 = 0;
        Label_0229: {
            if (f != null) {
                final int hashCode = f.hashCode();
                n3 = 3;
                int n4 = 0;
                Label_0175: {
                    switch (hashCode) {
                        case 1038153415: {
                            if (f.equals("FEwhat_to_watch")) {
                                n4 = 0;
                                break Label_0175;
                            }
                            break;
                        }
                        case 1012886772: {
                            if (f.equals("FEexplore")) {
                                n4 = 4;
                                break Label_0175;
                            }
                            break;
                        }
                        case 363605732: {
                            if (f.equals("FEtrending")) {
                                n4 = 1;
                                break Label_0175;
                            }
                            break;
                        }
                        case -381996905: {
                            if (f.equals("FEsubscriptions")) {
                                n4 = 2;
                                break Label_0175;
                            }
                            break;
                        }
                        case -1806723300: {
                            if (f.equals("FElibrary")) {
                                n4 = 3;
                                break Label_0175;
                            }
                            break;
                        }
                    }
                    n4 = -1;
                }
                if (n4 == 0) {
                    n3 = 2;
                    break Label_0229;
                }
                if (n4 == 1) {
                    break Label_0229;
                }
                if (n4 == 2) {
                    n3 = 4;
                    break Label_0229;
                }
                if (n4 == 3) {
                    n3 = 5;
                    break Label_0229;
                }
                if (n4 == 4) {
                    n3 = 6;
                    break Label_0229;
                }
            }
            n3 = 1;
        }
        if (n3 == 1) {
            return;
        }
        int n5 = 0;
        Label_0300: {
            Label_0297: {
                if (b2) {
                    if (this.ap == 0L) {
                        n5 = 1;
                        n2 = 2;
                        break Label_0300;
                    }
                    if (b) {
                        n5 = 1;
                        n2 = 4;
                        break Label_0300;
                    }
                    if (this.ao) {
                        n5 = 1;
                        break Label_0300;
                    }
                }
                else if (!b) {
                    n5 = 2;
                    break Label_0297;
                }
                n5 = 1;
            }
            n2 = 1;
        }
        final ahaz builder = ((ahbh)alxo.a).createBuilder();
        builder.copyOnWrite();
        final alxo alxo = (alxo)builder.instance;
        alxo.c = n3 - 1;
        alxo.b |= 0x1;
        final alxn c = alxn.c;
        builder.copyOnWrite();
        final alxo alxo2 = (alxo)builder.instance;
        alxo2.d = c.getNumber();
        alxo2.b |= 0x2;
        builder.copyOnWrite();
        final alxo alxo3 = (alxo)builder.instance;
        alxo3.e = n2 - 1;
        alxo3.b |= 0x4;
        builder.copyOnWrite();
        final alxo alxo4 = (alxo)builder.instance;
        alxo4.f = n5 - 1;
        alxo4.b |= 0x8;
        final int g = (int)TimeUnit.MILLISECONDS.toMinutes(n);
        builder.copyOnWrite();
        final alxo alxo5 = (alxo)builder.instance;
        alxo5.b |= 0x10;
        alxo5.g = g;
        final aknr d = aknt.d();
        ((ahaz)d).copyOnWrite();
        aknt.aW((aknt)d.instance, (alxo)builder.build());
        this.bp.d((aknt)((ahaz)d).build());
    }
    
    public final void bt() {
        final aiqj ak = this.ak;
        aiqj f;
        if (this.cj.R()) {
            f = ((ggq)this).pF().f(this.ak);
        }
        else {
            f = ak;
        }
        ((ggq)this).pF().c(this.cd(), wzr.a, f, xmm.ae(ak, aliu.b), xmm.ae(ak, aliu.a));
        this.ck();
    }
    
    public final void bu() {
        this.ch();
    }
    
    public final void bv() {
        this.br(true);
    }
    
    protected void bw(final dbj dbj) {
        if (!this.cj.Q()) {
            this.bt();
        }
        String s;
        if (!this.bZ) {
            final ttl a = this.aN.a((Throwable)dbj);
            if (dbj instanceof dba) {
                this.bK();
            }
            else {
                final boolean b = dbj instanceof dav;
                int n = 2131232701;
                if (b) {
                    if (((dav)dbj).getCause() instanceof IOException) {
                        this.bK();
                    }
                    else {
                        final SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout = (SpecificNetworkErrorViewLoadingFrameLayout)this.d.get();
                        final String string = this.c.getString(2132017515);
                        final fka c = specificNetworkErrorViewLoadingFrameLayout.c;
                        c.getClass();
                        c.e((CharSequence)string);
                        specificNetworkErrorViewLoadingFrameLayout.c.c(2131232701);
                        specificNetworkErrorViewLoadingFrameLayout.c.d(false);
                        specificNetworkErrorViewLoadingFrameLayout.c.b(true);
                        specificNetworkErrorViewLoadingFrameLayout.g(3);
                    }
                }
                else {
                    if (1 == a.a) {
                        n = 2131232669;
                    }
                    final SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout2 = (SpecificNetworkErrorViewLoadingFrameLayout)this.d.get();
                    final Object b2 = a.b;
                    final fka c2 = specificNetworkErrorViewLoadingFrameLayout2.c;
                    c2.getClass();
                    c2.e((CharSequence)b2);
                    specificNetworkErrorViewLoadingFrameLayout2.c.d(true);
                    specificNetworkErrorViewLoadingFrameLayout2.c.b(false);
                    specificNetworkErrorViewLoadingFrameLayout2.c.c(n);
                    specificNetworkErrorViewLoadingFrameLayout2.g(3);
                }
            }
            if (this.bP() && this.cm.f(45383337L)) {
                final jyk bf = this.bF;
                if (bf != null) {
                    bf.h();
                }
            }
            hxw.a(((ggq)this).pF(), (String)a.c);
            s = "Logged VE for an initial request failure.";
        }
        else {
            s = "Initial request failed.";
        }
        this.ct.x();
        final String value = String.valueOf(dbj);
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(" Error: ");
        sb.append(value);
        this.bO.a(sb.toString(), (Exception)null);
    }
    
    public void bx() {
        this.bF(true, true);
        final AtomicBoolean dx = this.dx;
        boolean b = false;
        dx.set(false);
        this.bM();
        final eg ct = this.ct;
        ((toj)ct.b).p(12);
        ((ffe)ct.c).b("br_s");
        ((tgd)ct.d).d((Object)new fhr());
        final aiqj ak = this.ak;
        xan dv;
        if (ak != null && ((ahbc)ak).ry((ahaq)BrowseEndpointOuterClass.browseEndpoint) && ((aicj)((ahbc)ak).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint)).c.startsWith("VL")) {
            dv = this.bD.b(almx.E);
        }
        else if (this.cQ.az(PaneDescriptor.b((ggq)this))) {
            dv = this.bD.b(almx.w);
        }
        else {
            dv = null;
        }
        if (dv != null) {
            dv.c("br_s");
        }
        this.dv = dv;
        if (this.aO.d() > this.ap) {
            b = true;
        }
        this.bs(b, true, 0L);
    }
    
    protected void by(final hwf hwf) {
        final boolean e = hwf.e;
        this.bZ = e;
        if (hwf.c) {
            if (!e) {
                final BrowseResponseModel b = hwf.b;
                this.cl(b);
                this.do = (byte[])Optional.ofNullable((Object)b.d()).orElse((Object)new byte[0]);
                this.cF.G(((ggq)this).pF(), b.a);
            }
            if (hwf.b()) {
                this.ct.x();
            }
            else {
                final eg ct = this.ct;
                ((toj)ct.b).j(12);
                final Object c = ct.c;
                String s = "br_r";
                ((ffe)c).b("br_r");
                ((tgd)ct.d).d((Object)new fhm());
                final xan dv = this.dv;
                if (dv != null) {
                    if (hwf.e) {
                        s = "br_lrr";
                    }
                    dv.c(s);
                }
            }
        }
        this.bF(false, true);
        this.bG(hwf.b.a);
    }
    
    protected void bz(final acrh acrh) {
    }
    
    public void h() {
        if (this.o() != 5 && !this.bZ) {
            return;
        }
        this.om();
    }
    
    public final void lQ() {
        final gac e = this.e;
        if (e != null) {
            e.h();
        }
    }
    
    public final gae mG() {
        final gae au = this.au;
        if (au == null) {
            final jxc ar = this.ar;
            if (ar != null) {
                final gae c = ar.c();
                afft afft2;
                final afft afft = afft2 = c.a.c;
                if (this.dd.isPresent()) {
                    afft2 = ((ksp)this.dd.get()).b(afft);
                }
                afft g = afft2;
                if (this.aE) {
                    final affr i = afft.i();
                    i.h(this.bb.a());
                    i.j((Iterable)afft2);
                    g = i.g();
                }
                final String f = vxg.f(this.ak);
                Object a = g;
                Label_0156: {
                    if (f != null) {
                        if (!f.equals("FEartist_analytics_screen") && !f.equals("FEanalytics_screen")) {
                            a = g;
                            if (!f.equals("FEsfv_analytics_screen")) {
                                break Label_0156;
                            }
                        }
                        a = afiq.a;
                    }
                }
                Object g2 = a;
                if (this.dr) {
                    final affr j = afft.i();
                    j.j((Iterable)this.bc.b());
                    j.j((Iterable)a);
                    g2 = j.g();
                }
                Object o = g2;
                if (hwl.cW.contains((Object)vxg.f(this.ak))) {
                    o = afiq.a;
                }
                final boolean cy = this.cy();
                Object f2 = null;
                if (cy) {
                    f2 = f2;
                    if (this.dd.isPresent()) {
                        f2 = ((ksp)this.dd.get()).f();
                    }
                }
                Label_0363: {
                    if (fwc.m(vxg.f(this.ak))) {
                        final fzw ck = this.cK;
                        final BrowseResponseModel ah = this.ah;
                        if (ah != null) {
                            final akhz a2 = ah.a;
                            if ((a2.b & 0x2) != 0x0) {
                                akhu akhu;
                                if ((akhu = a2.d) == null) {
                                    akhu = akhu.a;
                                }
                                if (akhu.b == 338099421) {
                                    o = afft.s((Object)new ktj(ck, (anst)akhu.c, 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
                                    break Label_0363;
                                }
                                o = afiq.a;
                                break Label_0363;
                            }
                        }
                        o = afiq.a;
                    }
                }
                fzp fzp;
                if (this.dd.isPresent()) {
                    fzp = ((ksp)this.dd.get()).a();
                }
                else {
                    fzp = fzp.a().a();
                }
                return (gae)asie.I(c).J((asjr)new fdo(this, (afft)o, 18)).J((asjr)new gdc(this, 20)).J((asjr)new hvs(this, 1)).J((asjr)new flo(this, f2, fzp, 5)).ac();
            }
        }
        au.getClass();
        return au;
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        final Class[] array = null;
        Class[] array2 = null;
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            case 6: {
                if (((acon)o).b()) {
                    array2 = array;
                    break;
                }
                ((fzf)this.aq.a()).q();
                return null;
            }
            case 5: {
                final vul vul = (vul)o;
                array2 = array;
                if ((0x4 & vul.b.b) == 0x0) {
                    break;
                }
                final Object cg = this.cg();
                akxt akxt;
                if ((akxt = vul.b.d) == null) {
                    akxt = akxt.a;
                }
                anio a;
                if (akxt.b == 53272665) {
                    akxt akxt2;
                    if ((akxt2 = vul.b.d) == null) {
                        akxt2 = akxt.a;
                    }
                    if (akxt2.b == 53272665) {
                        a = (anio)akxt2.c;
                    }
                    else {
                        a = anio.a;
                    }
                }
                else {
                    a = null;
                }
                array2 = array;
                if (a == null) {
                    break;
                }
                final BrowseResponseModel ah = this.ah;
                if (ah == null) {
                    array2 = array;
                    break;
                }
                this.cB((ksp)this.aX.a(a, ah));
                if (cg != null) {
                    this.bE(cg, a);
                }
                this.bB();
                array2 = array;
                break;
            }
            case 4: {
                final szl szl = (szl)o;
                this.br(true);
                array2 = array;
                break;
            }
            case 3: {
                final jvv jvv = (jvv)o;
                final String f = vxg.f(((ggq)this).aU());
                array2 = array;
                if (f == null) {
                    break;
                }
                if (!f.equals(jvv.a())) {
                    array2 = array;
                    break;
                }
                final aiqj au = ((ggq)this).aU();
                final ahaz builder = ((ahbh)((ahbc)au).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint)).toBuilder();
                final String b = jvv.b();
                builder.copyOnWrite();
                final aicj aicj = (aicj)builder.instance;
                b.getClass();
                aicj.b |= 0x8;
                aicj.e = b;
                final aicj aicj2 = (aicj)builder.build();
                final ahbb ahbb = (ahbb)((ahbh)au).toBuilder();
                ahbb.e((ahaq)BrowseEndpointOuterClass.browseEndpoint, (Object)aicj2);
                final aiqj aiqj = (aiqj)((ahaz)ahbb).build();
                PaneDescriptor.b((ggq)this).l(aiqj);
                this.cj(aiqj, true, true);
                return null;
            }
            case 2: {
                final hyu hyu = (hyu)o;
                array2 = array;
                if (hyu.c().h()) {
                    final jxu bc = this.bc;
                    final amgq c = (amgq)hyu.c().c();
                    final amgs c2 = bc.c;
                    if (c2 != null && c2.c.size() > 0) {
                        final ahaz builder2 = ((ahbh)bc.c).toBuilder();
                        final ahaz builder3 = ((ahbh)amgp.a).createBuilder();
                        builder3.copyOnWrite();
                        final amgp amgp = (amgp)builder3.instance;
                        amgp.c = c;
                        amgp.b |= 0x1;
                        builder2.br(0, builder3);
                        bc.c((amgs)builder2.build());
                    }
                    this.bB();
                    this.br(true);
                    array2 = array;
                    break;
                }
                break;
            }
            case 1: {
                final glj glj = (glj)o;
                this.br(true);
                array2 = array;
                break;
            }
            case 0: {
                final gli gli = (gli)o;
                this.ao = true;
                array2 = array;
                break;
            }
            case -1: {
                array2 = new Class[] { gli.class, glj.class, hyu.class, jvv.class, szl.class, vul.class, acon.class };
                break;
            }
        }
        return array2;
    }
    
    public Context nT() {
        final Context cy = this.cY;
        if (cy != null) {
            return cy;
        }
        return super.nT();
    }
    
    public final void nm() {
        super.nm();
        final ViewGroup dz = this.dz;
        if (dz != null) {
            dz.removeOnLayoutChangeListener(this.dA);
            this.dz = null;
        }
        this.d = Optional.empty();
        this.dm.dispose();
        ((fjo)this.aK).j();
        final gdn bx = this.bx;
        if (bx != null) {
            final RecyclerView c = bx.c;
            if (c != null) {
                final iw d = bx.d;
                if (d != null) {
                    c.aH(d);
                }
            }
            bx.d = null;
            bx.c = null;
        }
        if (!this.cl.bg()) {
            this.bu.d();
        }
        final jyk bf = this.bF;
        if (bf != null) {
            bf.i();
            ((Set)this.cJ.a).remove(this.bF);
        }
        this.am.dispose();
        this.dk.b();
        final asir dj = this.dj;
        if (dj != null) {
            dj.dispose();
        }
        this.bG.f();
        final kty ae = this.ae;
        if (ae != null) {
            ae.sa();
        }
        final asir dt = this.dt;
        if (dt != null) {
            asjv.b((AtomicReference)dt);
            this.dt = null;
        }
        if (jzg.A(this.cn, this.cm)) {
            this.dn.dispose();
        }
    }
    
    public final void no() {
        ((tgd)this.ct.d).d((Object)new fhl());
        super.no();
        if (this.cj.P()) {
            final tua bo = this.bO;
            final int hashCode = this.hashCode();
            final StringBuilder sb = new StringBuilder("BrowseFragment#onStart (");
            sb.append(hashCode);
            sb.append(")");
            bo.a(sb.toString(), new Exception());
        }
        this.aQ.g(this.aP.a());
        this.aQ.g((Object)this.bn);
        this.aQ.g((Object)this.bo);
        final long d = this.aO.d();
        final long ap = this.ap;
        if (!this.ao && d <= ap && this.dp == this.cT.cd()) {
            this.bs(false, false, this.ap - d);
            if (this.dx.get()) {
                this.cs();
            }
        }
        else {
            this.cj(this.ak, this.bO(false), false);
        }
        this.aQ.h((Object)this, (Class)hwl.class);
        this.dd.ifPresent((Consumer)hvn.e);
        final kty ae = this.ae;
        if (ae != null) {
            ae.n();
        }
        this.al = 0;
        this.aT.postDelayed((Runnable)new hvt(this, 0), 500L);
        this.aQ.g((Object)this.bk);
        this.bJ();
        this.cE.L((syv)this);
        final Optional ofNullable = Optional.ofNullable((Object)vxg.f(this.aL()));
        final LayerableFilterEntityController be = this.bE;
        be.getClass();
        ofNullable.ifPresent((Consumer)new hvr(be, 6));
        this.cd.a(this.dC);
        if (jzg.A(this.cn, this.cm)) {
            this.dn.dispose();
            this.dn = this.an.d().L((asjr)huy.k).p().P(this.bt).T((asji)new gcv(this, 4)).al();
        }
    }
    
    public final void np() {
        super.np();
        if (this.cj.P()) {
            final tua bo = this.bO;
            final int hashCode = this.hashCode();
            final StringBuilder sb = new StringBuilder("BrowseFragment#onStop (");
            sb.append(hashCode);
            sb.append(")");
            bo.a(sb.toString(), new Exception());
        }
        this.cm();
        this.aQ.m((Object)this);
        this.dd.ifPresent((Consumer)hvn.g);
        final kty ae = this.ae;
        if (ae != null) {
            final zqs b = ae.b;
            tbi.f();
            b.b.remove(ae);
            final acqv b2 = ae.b();
            if (b2 != null) {
                ((acns)b2).F();
            }
        }
        this.bL();
        final gac e = this.e;
        if (e != null) {
            e.f(this.dB);
        }
        final hwi dq = this.dq;
        if (dq != null) {
            dq.c();
        }
        this.aQ.m((Object)this.bk);
        this.bI(this.aL());
        this.aQ.m(this.aP.a());
        this.aQ.m((Object)this.bn);
        this.aQ.m((Object)this.bo);
        final gec af = this.af;
        Object parent = null;
        af.f((gdz)null);
        this.cE.M((syv)this);
        this.cd.a.remove(this.dC);
        if (this.cl.bg()) {
            final View o = ((br)this).O;
            if (o != null) {
                parent = o.getParent();
            }
            final FrameLayout frameLayout = (FrameLayout)parent;
            FrameLayout frameLayout2;
            if (!fbu.Z(this.az) || (frameLayout2 = frameLayout) == null) {
                frameLayout2 = (FrameLayout)this.d.get();
            }
            this.bu.e(frameLayout2);
        }
    }
    
    final int o() {
        return (int)this.d.map((Function)hvv.d).orElse((Object)0);
    }
    
    public void om() {
        if (((br)this).O == null) {
            return;
        }
        this.ch();
        this.bV();
        this.aT.post((Runnable)new hol(this, 19));
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final gac e = this.e;
        if (e != null) {
            e.j();
        }
        final kty ae = this.ae;
        if (ae != null) {
            for (final e e2 : ae.a) {
                final Object a = e2.a;
                if (a != null) {
                    ((acns)a).G(configuration);
                }
                final Object b = e2.b;
                if (b != null) {
                    final jwd jwd = (jwd)b;
                    if (!jwd.f) {
                        continue;
                    }
                    jwd.s(configuration.orientation);
                }
            }
        }
        final ffc b2 = this.b;
        if (b2 != null && b2.a) {
            b2.c.s(35);
            b2.d.d((Object)new fil());
            b2.d();
        }
        if (this.o() == 5 || this.o() == 6) {
            this.d.ifPresent((Consumer)new hvr(this, 3));
        }
        if (this.cz()) {
            final View o = ((br)this).O;
            RecyclerView recyclerView;
            if (o != null) {
                recyclerView = (RecyclerView)o.findViewById(2131431186);
            }
            else {
                recyclerView = null;
            }
            if (recyclerView != null) {
                final double n = tpe.bd(((br)this).nY());
                Double.isNaN(n);
                final int n2 = (int)(n * 0.175);
                recyclerView.setPadding(n2, 0, n2, 0);
            }
        }
        if (this.cw()) {
            Optional.ofNullable((Object)this.bx).ifPresent((Consumer)new hvr(this, 4));
        }
    }
    
    public final void oq(final Bundle bundle) {
        if (this.cj.Q()) {
            this.cr(bundle);
            ((br)this).getLifecycle().b((aum)new ScreenLoggingLifecycleObserver((wzv)this));
        }
        this.dw = SystemClock.elapsedRealtime();
        super.oq(bundle);
        if (this.cj.P()) {
            final tua bo = this.bO;
            final int hashCode = this.hashCode();
            final StringBuilder sb = new StringBuilder("BrowseFragment#onCreate (");
            sb.append(hashCode);
            sb.append(")");
            bo.a(sb.toString(), new Exception());
        }
        this.bR.o(14);
        final afke k = ((afjg)this.aY).k();
        while (k.hasNext()) {
            ((br)this).getLifecycle().b((aum)k.next());
        }
        this.bR.j(14);
    }
    
    public final int p() {
        return this.cd().a;
    }
    
    public void pP(final Bundle bundle) {
        bundle.putByteArray("navigation_endpoint", ((agzk)this.aL()).toByteArray());
        bundle.putParcelable("instance_action_bar_color", (Parcelable)this.as);
        bundle.putParcelable("instance_status_bar_color", (Parcelable)this.aA);
        bundle.putParcelable("instance_activated_text_color", (Parcelable)this.aB);
        bundle.putParcelable("instance_secondary_text_color", (Parcelable)this.aC);
        bundle.putInt("PREVIOUS_THEME", this.aI.c);
        bundle.putParcelable("instance_app_bar_state", ((fzf)this.aq.a()).g());
    }
    
    public final boolean pS() {
        return true;
    }
    
    public final frk q() {
        final kty ae = this.ae;
        if (ae != null) {
            final int a = ae.a();
            if (a >= 0 && a < this.dg.size()) {
                return (frk)this.dg.get(a);
            }
        }
        return null;
    }
    
    public final void qB() {
        this.br(true);
    }
    
    public final void qC() {
        this.br(true);
    }
    
    public final void qD(final alfg alfg) {
        if (alfg != null) {
            final hwm bw = this.bW;
            if ((alfg.b & 0x2) != 0x0) {
                aley aley;
                if ((aley = alfg.d) == null) {
                    aley = aley.a;
                }
                ajvp a;
                if (aley.b == 162801955) {
                    a = (ajvp)aley.c;
                }
                else {
                    a = ajvp.a;
                }
                if (bw.c(a)) {
                    return;
                }
            }
            aley aley2;
            if ((aley2 = alfg.d) == null) {
                aley2 = aley.a;
            }
            aljh a2;
            if (aley2.b == 86135402) {
                aley aley3;
                if ((aley3 = alfg.d) == null) {
                    aley3 = aley.a;
                }
                if (aley3.b == 86135402) {
                    a2 = (aljh)aley3.c;
                }
                else {
                    a2 = aljh.a;
                }
            }
            else {
                a2 = null;
            }
            if (a2 != null) {
                if ((alfg.b & 0x10) != 0x0) {
                    ((wyv)bw.f).pF().D((wzz)new wyt(alfg.g.I()));
                }
                ((szk)bw.k).b((Object)a2, new Pair((Object)"overlay_controller_param", (Object)new ezm(this, 10)));
                return;
            }
            final aley d = alfg.d;
            aley a3;
            if (d == null) {
                a3 = aley.a;
            }
            else {
                a3 = d;
            }
            Object b;
            if (a3.b == 62441981) {
                aley a4;
                if ((a4 = d) == null) {
                    a4 = aley.a;
                }
                apxj a5;
                if (a4.b == 62441981) {
                    a5 = (apxj)a4.c;
                }
                else {
                    a5 = apxj.a;
                }
                ajut ajut;
                if ((a5.b & 0x1) != 0x0) {
                    aley aley4;
                    if ((aley4 = alfg.d) == null) {
                        aley4 = aley.a;
                    }
                    apxj a6;
                    if (aley4.b == 62441981) {
                        a6 = (apxj)aley4.c;
                    }
                    else {
                        a6 = apxj.a;
                    }
                    if ((ajut = a6.c) == null) {
                        ajut = ajut.a;
                    }
                }
                else {
                    ajut = null;
                }
                b = acak.b(ajut);
            }
            else {
                b = null;
            }
            if (!TextUtils.isEmpty((CharSequence)b)) {
                ((tqd)bw.b).d(b.toString());
            }
            final aley d2 = alfg.d;
            aley a7;
            if (d2 == null) {
                a7 = aley.a;
            }
            else {
                a7 = d2;
            }
            apai a9;
            if (a7.b == 127387931) {
                aley a8;
                if ((a8 = d2) == null) {
                    a8 = aley.a;
                }
                if (a8.b == 127387931) {
                    a9 = (apai)a8.c;
                }
                else {
                    a9 = apai.a;
                }
            }
            else {
                a9 = null;
            }
            if (a9 != null) {
                ((wyv)bw.f).pF().D((wzz)new wyt(alfg.g.I()));
                final Object n = bw.n;
                tbh.u(a9).rJ(((br)this).z, (String)null);
                return;
            }
        }
        this.br(true);
    }
    
    public final kau r() {
        if (this.e != null) {
            final kty ae = this.ae;
            if (ae != null) {
                return (kau)ae.b();
            }
        }
        return null;
    }
    
    public final wyw s() {
        return (wyw)Optional.ofNullable((Object)((ggq)this).pF()).orElse((Object)wyw.k);
    }
}
