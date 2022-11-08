import com.google.android.libraries.youtube.player.ui.PlayerView;
import com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPauseLifecycleObserver;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import android.os.Parcelable;
import java.util.concurrent.Callable;
import android.view.ViewTreeObserver;
import android.graphics.Point;
import android.content.res.Configuration;
import java.util.Map;
import java.util.HashMap;
import android.content.res.Resources;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.ListAdapter;
import android.widget.FrameLayout;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import android.view.ContextThemeWrapper;
import java.util.function.Predicate;
import com.google.protos.youtube.api.innertube.TooltipRendererOuterClass;
import com.google.protos.youtube.api.innertube.AutoplayRendererOuterClass;
import com.google.protos.youtube.api.innertube.InnertubeGetReelItemWatchService;
import java.nio.ByteBuffer;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.support.v7.widget.AppCompatImageView;
import android.widget.LinearLayout;
import com.google.protos.youtube.api.innertube.ReelWatchSurveyRendererOuterClass;
import java.util.ListIterator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import j$.time.Instant;
import android.view.ViewConfiguration;
import android.view.View$OnClickListener;
import android.view.accessibility.AccessibilityManager;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelToReelList;
import android.text.TextUtils;
import java.util.Locale;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.function.Supplier;
import android.support.v7.widget.RecyclerView;
import android.content.Context;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.function.Function;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelMenuBottomSheetController$1;
import android.app.Activity;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.view.Window;
import android.view.View;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.HashSet;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelRecyclerView;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.os.Bundle;
import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelPlayerView;
import com.google.android.apps.youtube.app.common.ui.pip.observer.PipPlayerObserver;
import java.util.concurrent.atomic.AtomicBoolean;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelPlaybackErrorLogger;
import j$.util.Optional;
import java.util.Set;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hoa extends hkx implements hnk, hqi, hqj, hox, hoy, hqd, hpg, hrg, hqw, hmn, gui, guk, hoj, eul, hmh, hmg, hoc
{
    static final String a;
    static final String b;
    public zkw aA;
    public tny aB;
    public fno aC;
    public wwu aD;
    public aawb aE;
    public arhr aF;
    public Handler aG;
    public hpb aH;
    public hpc aI;
    public SubtitlesOverlayPresenter aJ;
    public abbo aK;
    public arhr aL;
    public arhr aM;
    public arhr aN;
    public arhr aO;
    public thh aP;
    public Set aQ;
    public tku aR;
    public toa aS;
    public acuj aT;
    public utk aU;
    public acup aV;
    public fjp aW;
    public Optional aX;
    public gau aY;
    public adfy aZ;
    public hlk ae;
    public hrf af;
    public ReelPlaybackErrorLogger ag;
    public hmo ah;
    public hql ai;
    public hmm aj;
    public hok ak;
    public hlx al;
    public hqa am;
    public hmq an;
    public hpd ao;
    public hms ap;
    public hlf aq;
    public abno ar;
    public abni as;
    public abns at;
    public oas au;
    public tdz av;
    public aceo aw;
    public hjp ax;
    public vax ay;
    public zki az;
    public final atje bA;
    public final Set bB;
    public aioe bC;
    public Optional bD;
    public Optional bE;
    public final AtomicBoolean bF;
    public final Object bG;
    public Optional bH;
    public boolean bI;
    public boolean bJ;
    public boolean bK;
    hnh bL;
    public Optional bM;
    Optional bN;
    public abit bO;
    public uyf bP;
    public uyi bQ;
    public uyi bR;
    public uyi bS;
    public abpj bT;
    public arud bU;
    public abcr bV;
    public hyr bW;
    public hyr bX;
    public hyr bY;
    public cca bZ;
    public hod ba;
    public asho bb;
    public fjz bc;
    public PipPlayerObserver bd;
    public abrx be;
    public Optional bf;
    public hqc bg;
    public ReelPlayerView bh;
    public Bundle bi;
    public String bj;
    long bk;
    public PlaybackStartDescriptor bl;
    public hnz bm;
    public boolean bn;
    public int bo;
    public boolean bp;
    public boolean bq;
    public int br;
    public long bs;
    public boolean bt;
    public hmt bu;
    public hob bv;
    public String bw;
    public final hny bx;
    final hnx by;
    public final atje bz;
    public final zbr c;
    public hyr ca;
    public ljk cb;
    public hyr cc;
    public acnx cd;
    public mrm ce;
    public fzo cf;
    public fzo cg;
    public fzo ch;
    public aeby ci;
    private ReelRecyclerView ck;
    private Optional cl;
    private boolean cm;
    private boolean cn;
    private boolean co;
    private final asib cp;
    private final atit cq;
    private final atje cr;
    private final atje cs;
    private aioe ct;
    private Optional cu;
    private long cv;
    private long cw;
    private boolean cx;
    private byte[] cy;
    public hmk d;
    public hlh e;
    
    static {
        a = String.valueOf(hni.class.getName()).concat("$ReelSequenceControllerStateKey");
        b = String.valueOf(hoa.class.getName()).concat("$ReelSequenceControllerStateKey");
    }
    
    public hoa() {
        this.c = (zbr)new hnu(this);
        this.bf = Optional.empty();
        this.bk = Long.MIN_VALUE;
        this.cl = Optional.empty();
        this.bo = 0;
        this.cm = false;
        this.cn = false;
        this.co = false;
        this.bp = false;
        this.bq = false;
        this.br = 0;
        this.bs = Long.MIN_VALUE;
        this.bt = false;
        this.bx = new hny(this);
        this.by = new hnx(this);
        this.cp = new asib();
        this.cq = atit.aa();
        this.cr = ((atje)atir.e()).aX();
        this.cs = ((atje)atir.e()).aX();
        this.bz = ((atje)atir.e()).aX();
        this.bA = ((atje)atir.e()).aX();
        this.bB = new HashSet();
        this.bD = Optional.empty();
        this.cu = Optional.empty();
        this.bE = Optional.empty();
        this.bF = new AtomicBoolean(false);
        this.bG = new Object();
        this.bH = Optional.empty();
        this.cx = true;
        this.cy = null;
        this.bM = Optional.empty();
        this.bN = Optional.empty();
    }
    
    public static hng aK(final Optional optional) {
        if (!optional.isPresent()) {
            return null;
        }
        return ((hml)optional.get()).g;
    }
    
    public static hoa aL(final Bundle bundle) {
        bundle.getParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor").getClass();
        final hoa hoa = new hoa();
        ((br)hoa).ag(bundle);
        return hoa;
    }
    
    static hqo aO(final Optional optional) {
        final hng ak = aK(optional);
        if (ak != null) {
            return ak.F();
        }
        return null;
    }
    
    private final int bL() {
        return gug.d(((br)this).m).orElse(-1);
    }
    
    private final void bM(final int n) {
        anqh anqh;
        if ((anqh = this.bU.f().u) == null) {
            anqh = anqh.a;
        }
        if (!anqh.j) {
            this.aE.o();
        }
        this.aP().J(3, (wxz)new wws(wya.c(n)), (alff)null);
        this.aj.b();
        if (((br)this).od() != null) {
            final hqo an = this.aN();
            if (an != null) {
                an.f().ifPresent((Consumer)gyc.l);
            }
        }
        this.cl.ifPresent((Consumer)new hnr(this, 6));
    }
    
    private final void bN() {
        final Iterator iterator = this.bB.iterator();
        while (iterator.hasNext()) {
            this.aT.g((String)iterator.next());
        }
    }
    
    private final void bO() {
        if (this.bt()) {
            return;
        }
        if (!this.cn) {
            this.bR(1);
            return;
        }
        if (((gko)this.aF.a()).a() == gkm.b) {
            this.bQ();
            return;
        }
        final bu od = ((br)this).od();
        od.getClass();
        final View decorView = od.getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 0x2000);
    }
    
    private final void bP(final int n, final Optional optional) {
        final hqo an = this.aN();
        if (an == null) {
            return;
        }
        an.t().g(((br)this).P(n), optional);
    }
    
    private final void bQ() {
        final bu od = ((br)this).od();
        od.getClass();
        final View decorView = od.getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & 0xFFFFDFFF);
    }
    
    private final void bR(final int n) {
        final bu od = ((br)this).od();
        od.getClass();
        final Window window = od.getWindow();
        if (n == 0) {
            window.addFlags(1024);
            return;
        }
        if (n != 1) {
            window.clearFlags(1024);
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            final bu od2 = ((br)this).od();
            od2.getClass();
            od2.getWindow().getDecorView().setSystemUiVisibility(1280);
            this.bQ();
            return;
        }
        window.clearFlags(-2080373760);
        final View o = ((br)this).O;
        o.getClass();
        o.setFitsSystemWindows(true);
    }
    
    private final void bS(final agyc c) {
        final aioe bc = this.bC;
        if (bc == null) {
            return;
        }
        if (c != null) {
            this.aP().t((wxz)new wws(c), (alff)null);
            final agzc agzc = (agzc)((agzi)this.bC).toBuilder();
            ((agza)agzc).copyOnWrite();
            final aioe aioe = (aioe)agzc.instance;
            aioe.b |= 0x1;
            aioe.c = c;
            this.bC = (aioe)((agza)agzc).build();
            return;
        }
        final agzc agzc2 = (agzc)((agzi)bc).toBuilder();
        ((agza)agzc2).copyOnWrite();
        final aioe aioe2 = (aioe)agzc2.instance;
        aioe2.b &= 0xFFFFFFFE;
        aioe2.c = aioe.a.c;
        this.bC = (aioe)((agza)agzc2).build();
    }
    
    private final boolean bT() {
        return this.bt() || this.aC.b == fnl.b;
    }
    
    private final boolean bU() {
        if (!this.bw()) {
            return false;
        }
        final abtt q = this.ar.q();
        if (q == null) {
            return false;
        }
        final PlayerResponseModel d = q.d();
        return d != null && aaja.p(d.y());
    }
    
    private static boolean bV(final PlaybackStartDescriptor playbackStartDescriptor) {
        return iba.N(iba.x(playbackStartDescriptor)) == 12;
    }
    
    private final boolean bW() {
        anqh anqh;
        if ((anqh = this.bU.f().u) == null) {
            anqh = anqh.a;
        }
        return anqh.i;
    }
    
    private final int bX(final boolean b, final boolean b2) {
        if (!this.bf.isPresent()) {
            return 1;
        }
        final anrb t = iba.T((akok)this.bf.get());
        anss anss;
        if (t != null && (t.b & 0x100) != 0x0) {
            if ((anss = t.p) == null) {
                anss = anss.a;
            }
        }
        else {
            anss = null;
        }
        final agyc r = iba.R(anss);
        if ((((akok)this.bf.get()).b & 0x8) != 0x0) {
            aioe aioe;
            if ((aioe = ((akok)this.bf.get()).f) == null) {
                aioe = aioe.a;
            }
            int n;
            if (!b) {
                n = 2;
            }
            else {
                n = 5;
            }
            this.bp(aioe, n, Optional.empty());
            if (b) {
                if (t != null && (t.b & 0x400) != 0x0) {
                    final ahvl i = iba.i(t);
                    if (i != null) {
                        this.bS(i.d);
                    }
                }
            }
            else if (r != null) {
                this.bS(r);
            }
            final abhx d = PlaybackStartDescriptor.d();
            d.f = b;
            d.e = b;
            d.a = this.bC;
            this.as.a(new abmp(abmo.e, d.a(), hrf.a((wyn)this.aj.a().orElse((Object)null), hrf.e(this.aQ()), false, (zbq)null)));
            final hqo an = this.aN();
            if (an != null) {
                an.t().h();
            }
            return 2;
        }
        if (b2) {
            int n2;
            if (!b) {
                n2 = this.bK(trg.z(r), true);
            }
            else {
                n2 = this.bK(trg.y(2), true);
            }
            return n2;
        }
        return 1;
    }
    
    private final int bY(final boolean b) {
        if (!this.bf.isPresent()) {
            return 1;
        }
        final anrb t = iba.T((akok)this.bf.get());
        anss anss;
        if (t != null && (t.b & 0x200) != 0x0) {
            if ((anss = t.q) == null) {
                anss = anss.a;
            }
        }
        else {
            anss = null;
        }
        final agyc r = iba.R(anss);
        if ((((akok)this.bf.get()).b & 0x10) != 0x0) {
            aioe aioe;
            if ((aioe = ((akok)this.bf.get()).g) == null) {
                aioe = aioe.a;
            }
            this.bp(aioe, 1, Optional.empty());
            if (r != null) {
                this.bS(r);
            }
            final abhx d = PlaybackStartDescriptor.d();
            d.a = this.bC;
            this.as.a(new abmp(abmo.e, d.a(), hrf.a((wyn)this.aj.a().orElse((Object)null), hrf.e(this.aQ()), false, (zbq)null)));
            final hqo an = this.aN();
            if (an != null) {
                an.t().h();
            }
            return 2;
        }
        if (b) {
            return this.ca(trg.z(r));
        }
        return 1;
    }
    
    private static final Optional bZ(final Optional optional) {
        if (optional.isPresent()) {
            anrg anrg;
            if ((anrg = ((anrb)optional.get()).m) == null) {
                anrg = anrg.a;
            }
            if ((anrg.b & 0x1) != 0x0) {
                anrg anrg2;
                if ((anrg2 = ((anrb)optional.get()).m) == null) {
                    anrg2 = anrg.a;
                }
                anrf anrf;
                if ((anrf = anrg2.c) == null) {
                    anrf = anrf.a;
                }
                return Optional.of((Object)anrf);
            }
        }
        return Optional.empty();
    }
    
    private final int ca(final trg j) {
        final hmk d = this.d;
        int b = d.B;
        if (b > 0) {
            d.h.g();
            d.J = j;
            d.q.a(true);
            --b;
            d.C = b;
            ((RecyclerView)d.q).aj(b);
            return 3;
        }
        this.ar.aa(0L);
        return 4;
    }
    
    public final void A(final String s) {
        final Optional at = this.aT();
        if (!at.isPresent() || !((String)at.get()).equals(s)) {
            tmy.x(((br)this).nT(), 2132019447, 0);
            return;
        }
        alcc alcc;
        if (this.aU().isPresent()) {
            if ((alcc = ((anrb)this.aU().get()).n) == null) {
                alcc = alcc.a;
            }
        }
        else if ((alcc = anrb.a.n) == null) {
            alcc = alcc.a;
        }
        if (this.az.t()) {
            this.br(alcc);
            return;
        }
        final zkw aa = this.aA;
        final bu od = ((br)this).od();
        od.getClass();
        aa.b((Activity)od, (byte[])null, (zku)new gmr(this, alcc, 2));
    }
    
    public final void B(final ameo ameo) {
        if (!this.E()) {
            hjp.a(zjo.b, zjn.x, "Attempted to open a reels bottom sheet menu for unsupported reel item.");
            return;
        }
        final agza builder = ((agzi)ameo).toBuilder();
        tcp.n(((br)this).mK(), this.aR.a(), (trb)hen.m, (trb)new fcy(this, builder, 15));
        ((br)this).od().getClass();
        final ameo ameo2 = (ameo)builder.build();
        final bu od = ((br)this).od();
        od.getClass();
        final hqk am = this.aM();
        if (am != null) {
            final hnp hnp = new hnp(this, 0);
            final tyh tyh = (tyh)this.aM.a();
            final pqq v = am.v;
            final Optional of = Optional.of((Object)hnp);
            if (tyh.e == null && !od.getSupportFragmentManager().Z()) {
                tyh.e = hlw.aN(ameo2, (acng)tyh.d, (wwu)tyh.a);
                final Object e = tyh.e;
                ((acqb)e).ag = (acqa)new hlv(tyh, of, (byte[])null, (byte[])null, (byte[])null);
                ((auh)((br)e).X).b((aul)new ReelMenuBottomSheetController$1(tyh, v, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
                ((hlw)tyh.e).r(od.getSupportFragmentManager(), (String)null);
            }
        }
    }
    
    public final void C() {
        final hnh bl = this.bL;
        if (bl != null) {
            bl.d();
        }
    }
    
    public final void D() {
        final abav b = this.bg.b;
        b.g();
        this.bg.h(b.n);
    }
    
    public final boolean E() {
        return (boolean)this.d.e().map((Function)hkc.p).orElse((Object)false);
    }
    
    public final boolean F() {
        return this.bs();
    }
    
    public final View K(LayoutInflater o, final ViewGroup viewGroup, final Bundle bundle) {
        this.aw.getClass();
        this.bZ.r((eul)this);
        final View inflate = ((LayoutInflater)o).inflate(2131625277, viewGroup, false);
        if (this.bg == null) {
            final abax abax = new abax(((br)this).nT());
            final abpj bt = this.bT;
            final bu od = ((br)this).od();
            od.getClass();
            final hqc hqc = new hqc(((br)this).nT(), (absb)abax, bt.G((Context)od, (abas)abax, this.at));
            abax.C = (abar)hqc;
            this.bg = hqc;
        }
        final ReelRecyclerView ck = (ReelRecyclerView)inflate.findViewById(2131431026);
        this.ck = ck;
        final View viewById = inflate.findViewById(2131431027);
        if ((ck.aa = viewById) != null) {
            viewById.setClickable(true);
            viewById.setLongClickable(true);
            iba.e(viewById, false);
        }
        this.ci.Y((RecyclerView)this.ck, this.aD.n());
        final Bundle bundle2 = (Bundle)Optional.ofNullable((Object)((br)this).m).orElseGet((Supplier)fde.j);
        bundle2.getClass();
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint x = iba.x((PlaybackStartDescriptor)bundle2.getParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor"));
        Optional cl;
        if (x != null && (x.b & 0x100) != 0x0) {
            aioe aioe;
            if ((aioe = x.j) == null) {
                aioe = aioe.a;
            }
            cl = Optional.of((Object)aioe);
        }
        else {
            cl = Optional.empty();
        }
        this.cl = cl;
        bundle2.getClass();
        if (bundle != null && bundle.containsKey("com.google.android.apps.youtube.PlaybackStartDescriptor")) {
            o = bundle.getParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor");
        }
        else {
            o = bundle2.getParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor");
        }
        o.getClass();
        final byte[] cy = this.cy;
        Object a = o;
        if (cy != null) {
            final agza builder = ((agzi)amob.a).createBuilder();
            try {
                ((agxk)builder).mergeFrom(cy, ExtensionRegistryLite.getGeneratedRegistry());
                final aioe b = ((PlaybackStartDescriptor)o).b;
                if (b == null) {
                    hjp.a(zjo.b, zjn.x, "Attempted to restore logging extension to descriptor with no command.");
                    a = o;
                }
                else {
                    final agzc agzc = (agzc)((agzi)b).toBuilder();
                    agzc.e((agyr)amoa.b, (Object)builder.build());
                    final aioe a2 = (aioe)((agza)agzc).build();
                    final abhx e = ((PlaybackStartDescriptor)o).e();
                    e.r = ((PlaybackStartDescriptor)o).c;
                    e.a = a2;
                    a = e.a();
                }
            }
            catch (final ahab ahab) {
                hjp.a(zjo.b, zjn.x, "Attempted to restore invalid logging extension.");
                a = o;
            }
        }
        this.bl = (PlaybackStartDescriptor)a;
        agot.D(((PlaybackStartDescriptor)a).k() != null || this.bl.i() != null);
        final aioe b2 = this.bl.b;
        b2.getClass();
        this.cr.tr((Object)b2);
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint x2 = iba.x(this.bl);
        x2.getClass();
        bundle2.getClass();
        this.bK = (bundle == null && bundle2.getBoolean("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.USE_CLIENT_TRIGGERED_GET_PLAYER_INITIAL_KEY"));
        final long long1 = bundle2.getLong("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY", this.au.c());
        final String string = bundle2.getString("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.LOAD_TYPE_KEY", "warm");
        bundle2.remove("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY");
        bundle2.remove("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.LOAD_TYPE_KEY");
        final int bl = this.bL();
        final Optional c = gug.c(bundle2);
        final anqh anqh = null;
        final Object orElse = c.orElse((Object)null);
        final guh a3 = guh.a;
        int n;
        if ((bl == 0 && orElse == a3) || this.aQ().I) {
            n = 2;
        }
        else {
            n = 1;
        }
        if (this.aj.a().isEmpty() || long1 != this.aj.e) {
            this.aj.j(0, n, x2, (wyn)null, long1, string);
        }
        this.aj.d("r_fa", this.cv);
        this.cv = 0L;
        this.aj.d("r_fc", this.cw);
        this.cw = 0L;
        final int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault());
        final hnz bm = this.bm;
        ReelToReelList a4 = null;
        Label_0783: {
            if (bm != null) {
                a4 = bm.a;
                if (a4 != null) {
                    break Label_0783;
                }
            }
            if (bundle != null) {
                a4 = (ReelToReelList)bundle.getParcelable("ReelToReelListBundleKey");
            }
            else {
                a4 = null;
            }
        }
        ReelToReelList list = a4;
        if (a4 == null) {
            list = a4;
            if (bundle2 != null) {
                final ReelToReelList list2 = (ReelToReelList)bundle2.getParcelable("ReelToReelListBundleKey");
                if ((list = list2) != null) {
                    list = list2;
                    if (layoutDirectionFromLocale == 1) {
                        list = new ReelToReelList((List)Collections.unmodifiableList((List<?>)adwd.ap(list2.a)), (List)Collections.unmodifiableList((List<?>)adwd.ap(list2.b)));
                    }
                }
            }
        }
        ReelToReelList list3 = null;
        Label_0878: {
            if (list != null) {
                list3 = list;
                if (!list.a.isEmpty()) {
                    break Label_0878;
                }
            }
            list3 = new ReelToReelList(b2);
        }
        final fzo ch = this.ch;
        final ArrayList list4 = new ArrayList<aioe>(list3.a.size());
        final Iterator iterator = list3.a.iterator();
        int n2 = 0;
    Label_0912:
        while (true) {
            n2 = 0;
            while (iterator.hasNext()) {
                final aioe aioe2 = (aioe)iterator.next();
                if (((agzd)aioe2).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint) && ((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)aioe2).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).l) {
                    list4.add(aioe2);
                }
                else {
                    final aioe q = ch.Q(aioe2);
                    list4.add(q);
                    if (n2 == 0 && q == aioe2) {
                        continue Label_0912;
                    }
                    n2 = 1;
                }
            }
            break;
        }
        ReelToReelList list5;
        if (n2 != 0) {
            list5 = new ReelToReelList((List)Collections.unmodifiableList((List<?>)list4), (List)Collections.unmodifiableList((List<?>)list3.b));
        }
        else {
            list5 = list3;
        }
        PlaybackStartDescriptor bl2;
        final PlaybackStartDescriptor playbackStartDescriptor = bl2 = this.bl;
        if (list3 != list5 && (bl2 = playbackStartDescriptor) != null) {
            final String i = playbackStartDescriptor.i();
            final List a5 = list5.a;
            int n4;
            final int n3 = n4 = -1;
            if (a5 != null) {
                n4 = n3;
                if (!aexs.f(i)) {
                    int n5 = 0;
                    while (true) {
                        n4 = n3;
                        if (n5 >= list5.a.size()) {
                            break;
                        }
                        if (((agzd)list5.a.get(n5)).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint) && i.equals(((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)list5.a.get(n5)).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).f)) {
                            n4 = n5;
                            break;
                        }
                        ++n5;
                    }
                }
            }
            bl2 = playbackStartDescriptor;
            if (n4 >= 0) {
                final ReelWatchEndpointOuterClass$ReelWatchEndpoint x3 = iba.x(playbackStartDescriptor);
                final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)list5.a.get(n4)).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                bl2 = playbackStartDescriptor;
                if (reelWatchEndpointOuterClass$ReelWatchEndpoint != null) {
                    bl2 = playbackStartDescriptor;
                    if (!((agzi)reelWatchEndpointOuterClass$ReelWatchEndpoint).equals(x3)) {
                        final aioe b3 = playbackStartDescriptor.b;
                        b3.getClass();
                        final agzc agzc2 = (agzc)((agzi)aioe.a).createBuilder();
                        agzc2.e((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint, (Object)reelWatchEndpointOuterClass$ReelWatchEndpoint);
                        if ((b3.b & 0x1) != 0x0) {
                            final agyc c2 = b3.c;
                            ((agza)agzc2).copyOnWrite();
                            final aioe aioe3 = (aioe)agzc2.instance;
                            c2.getClass();
                            aioe3.b |= 0x1;
                            aioe3.c = c2;
                        }
                        if (((agzd)b3).rs((agyr)amoa.b)) {
                            agzc2.e((agyr)amoa.b, (Object)((agzd)b3).rr((agyr)amoa.b));
                        }
                        final abhx d = PlaybackStartDescriptor.d();
                        d.a = (aioe)((agza)agzc2).build();
                        bl2 = d.a();
                    }
                }
            }
        }
        this.bl = bl2;
        final hnz bm2 = this.bm;
        if (bm2 != null) {
            final cya c3 = bm2.c;
            if (c3 != null) {
                final abcr bv = this.bV;
                final Object a6 = c3.a;
                if (bv.a) {
                    for (final String s : ((Map)a6).keySet()) {
                        final lwf lwf = (lwf)((Map)a6).get(s);
                        lwf lwf2;
                        if ((lwf2 = ((Map<K, lwf>)bv.b).get(s)) == null) {
                            lwf2 = new lwf((char[])null);
                            ((Map<String, lwf>)bv.b).put(s, lwf2);
                        }
                        lwf2.a = 0;
                        final int b4 = lwf.b;
                        lwf2.c = b4;
                        lwf2.b = b4;
                        lwf2.d = lwf.d;
                    }
                }
            }
        }
        this.cm = iba.M(iba.x(this.bl));
        this.cn = bV(this.bl);
        final PlaybackStartDescriptor bl3 = this.bl;
        this.co = (bV(bl3) || iba.E(iba.x(bl3)));
        final PlaybackStartDescriptor bl4 = this.bl;
        boolean boolean1 = false;
        Label_1702: {
            if (bundle != null && bundle.containsKey("UseRpcSequenceKey")) {
                boolean1 = bundle.getBoolean("UseRpcSequenceKey");
            }
            else {
                final ReelWatchEndpointOuterClass$ReelWatchEndpoint x4 = iba.x(bl4);
                if (x4 != null) {
                    final int bz = aqql.bZ(x4.n);
                    if (bz != 0) {
                        if (bz == 3) {
                            boolean1 = true;
                            break Label_1702;
                        }
                    }
                }
                boolean1 = false;
            }
        }
        final boolean c4 = iba.C(iba.v(iba.u(iba.x(this.bl))));
        final int b5 = x2.b;
        boolean bn = false;
        Label_1812: {
            Label_1809: {
                if (!this.cm) {
                    final akak f = this.bU.f();
                    anqh anqh2 = anqh;
                    if (f != null) {
                        anqh2 = anqh;
                        if ((f.b & 0x40000000) != 0x0 && (anqh2 = f.u) == null) {
                            anqh2 = anqh.a;
                        }
                    }
                    if (anqh2 == null || !anqh2.e) {
                        break Label_1809;
                    }
                }
                if (!c4 && (b5 & 0x80000) == 0x0) {
                    bn = true;
                    break Label_1812;
                }
            }
            bn = false;
        }
        this.bn = bn;
        int n6 = 2131625234;
        if (c4) {
            final hms ap = this.ap;
            final ViewGroup viewGroup2 = (ViewGroup)inflate.findViewById(2131430980);
            final ReelRecyclerView ck2 = this.ck;
            viewGroup2.getClass();
            ck2.getClass();
            ap.d = LayoutInflater.from(viewGroup2.getContext()).inflate(2131625234, viewGroup2, true);
            ap.e = (AccessibilityManager)ap.d.getContext().getSystemService("accessibility");
            ((RecyclerView)ck2).u((oa)new hmr(ap));
        }
        else if (bn) {
            final hmo ah = this.ah;
            final ViewGroup viewGroup3 = (ViewGroup)inflate.findViewById(2131430980);
            final boolean cm = this.cm;
            viewGroup3.getClass();
            final LayoutInflater from = LayoutInflater.from(viewGroup3.getContext());
            if (!cm) {
                n6 = 2131625233;
            }
            ah.d = from.inflate(n6, viewGroup3, true);
            iba.e(ah.d.findViewById(2131431097), true);
            ah.d.setOnClickListener((View$OnClickListener)ah);
            ah.f = (AccessibilityManager)ah.d.getContext().getSystemService("accessibility");
            this.ah.e = (hmn)this;
        }
        this.bh = (ReelPlayerView)inflate.findViewById(2131431087);
        final ViewGroup viewGroup4 = (ViewGroup)inflate.findViewById(2131430038);
        final absb a7 = this.bg.a;
        if (viewGroup4 != null && a7 != null) {
            viewGroup4.addView((View)a7);
        }
        if (this.bW()) {
            final hpb ah2 = this.aH;
            final hpc ai = this.aI;
            ah2.setPadding(ah2.a, ah2.b, ah2.c, ah2.d);
            ((abbi)ai).g(0.9f);
            ah2.addView((View)ai);
            ((absd)this.bh).c((absb)this.aH);
        }
        final boolean bt2 = this.bt();
        tmy.v(inflate.findViewById(2131431040), bt2);
        this.aV.g(inflate);
        final hmk d2 = this.d;
        final SubtitlesOverlayPresenter aj = this.aJ;
        final boolean cm2 = this.cm;
        final ReelRecyclerView ck3 = this.ck;
        final ReelPlayerView bh = this.bh;
        final qpt m = new qpt(this);
        d2.t = aj;
        d2.u = cm2;
        ck3.getClass();
        d2.q = ck3;
        bh.getClass();
        d2.F = bh;
        d2.M = m;
        d2.s = (hmg)this;
        final hmb c5 = d2.c;
        boolean b6 = false;
        Label_2313: {
            if (cm2) {
                final anqt anqt = (anqt)d2.d.a();
                if (anqt != null && (anqt.b & 0x1000) != 0x0 && anqt.j) {
                    b6 = true;
                    break Label_2313;
                }
            }
            b6 = false;
        }
        final hyc hyc = (hyc)((atjj)c5.a).a();
        final eg eg = (eg)((atjj)c5.b).a();
        final eg eg2 = (eg)((atjj)c5.c).a();
        final fzo fzo = (fzo)((atjj)c5.d).a();
        final arud arud = (arud)((atjj)c5.e).a();
        arud.getClass();
        final uyi uyi = (uyi)((atjj)c5.f).a();
        uyi.getClass();
        d2.p = new hma(hyc, eg, eg2, fzo, arud, uyi, (hqj)this, (hoy)this, d2, (hqi)this, boolean1, b6, bt2 ^ true, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        if (cm2) {
            d2.p.L(true);
        }
        ((RecyclerView)ck3).ac((nq)d2.p);
        ((RecyclerView)ck3).s = true;
        ((RecyclerView)ck3).G = ViewConfiguration.get(((RecyclerView)ck3).getContext()).getScaledPagingTouchSlop();
        ((RecyclerView)ck3).af((nw)(d2.r = new hme(d2, ck3.getContext())));
        ((nw)d2.r).aa(0);
        ((nw)d2.r).ba(true);
        ((nz)(d2.o = new hmj(d2))).e((RecyclerView)ck3);
        ((RecyclerView)ck3).aE(d2.I);
        final hmq f2 = d2.f;
        int n7;
        if (!cm2) {
            n7 = 4;
        }
        else {
            n7 = 8;
        }
        f2.i = n7 + 2;
        f2.m = d2.N;
        ((RecyclerView)ck3).u((oa)f2);
        ana.N((View)ck3, new akv());
        this.d.i(list5.a, list5.b);
        this.d.m.add(this);
        final bu od2 = ((br)this).od();
        od2.getClass();
        aeo.e((Activity)od2);
        this.am.d();
        if (this.bs()) {
            final hod ba = this.ba;
            ba.d = inflate.findViewById(2131431051);
            if (ba.d != null) {
                ba.e = (hoc)this;
            }
        }
        return inflate;
    }
    
    public final void V(final Activity activity) {
        final afqq a = afqq.a;
        this.cv = Instant.now().toEpochMilli();
        super.V(activity);
        acll.b(activity.getApplicationContext());
    }
    
    public final void Y() {
        final hqk am = this.aM();
        if (am != null) {
            am.c.d(true);
            am.g.g();
            final Optional f = am.f();
            if (am.n) {
                if (am.f().isPresent()) {
                    final bu od = ((br)this).od();
                    if (od != null && !od.isFinishing()) {
                        final hpt hpt = (hpt)am.f().get();
                        if (this.aQ().A) {
                            final ImageView e = hpt.e;
                            if ((e == null || e.getVisibility() != 0) && f.isPresent()) {
                                final hpt hpt2 = (hpt)f.get();
                                hpt2.a(((PlayerView)this.bh).d, Optional.empty());
                                hpt2.f();
                            }
                        }
                    }
                }
            }
        }
        if (this.bn) {
            this.ah.b();
        }
        if (this.ap.e()) {
            this.ap.b();
        }
        final hrf af = this.af;
        af.a.b();
        af.b();
        this.bW.o((hrg)this);
        final ListIterator listIterator = ((LinkedList)this.bX.a).listIterator();
        while (listIterator.hasNext()) {
            final hqw hqw = ((WeakReference<hqw>)listIterator.next()).get();
            if (hqw == this || hqw == null) {
                listIterator.remove();
            }
        }
        this.av.m((Object)this.aj);
        this.cp.b();
        this.av.m((Object)this.bg.b.t);
        this.av.m((Object)this.by);
        final bu od2 = ((br)this).od();
        od2.getClass();
        final boolean finishing = od2.isFinishing();
        if (this.bT() && (finishing || !this.bU())) {
            this.ar.a();
            this.ar.C(finishing);
        }
        this.aE.t(aave.a);
        this.aY.e(true);
        super.Y();
    }
    
    public final void a() {
        szc.f();
        this.bK(trg.y(4), true);
    }
    
    public final hqk aM() {
        final Optional e = this.d.e();
        if (e.isPresent()) {
            final hng g = ((hml)e.get()).g;
            if (g instanceof hnf) {
                return ((hnf)g).u;
            }
        }
        return null;
    }
    
    public final hqo aN() {
        return aO(this.d.e());
    }
    
    public final wwv aP() {
        return this.aD.n();
    }
    
    public final anqt aQ() {
        akak akak;
        if ((akak = this.bU.f()) == null) {
            akak = akak.a;
        }
        anqh anqh;
        if ((anqh = akak.u) == null) {
            anqh = anqh.a;
        }
        anqt anqt;
        if ((anqt = anqh.d) == null) {
            anqt = anqt.a;
        }
        return anqt;
    }
    
    public final anrr aS() {
        final Optional e = this.d.e();
        if (e.isPresent()) {
            final hml hml = (hml)e.get();
            if (hml.b) {
                anss anss;
                if ((anss = hml.b().q) == null) {
                    anss = anss.a;
                }
                return (anrr)((agzd)anss).rr((agyr)ReelWatchSurveyRendererOuterClass.reelWatchSurveyRenderer);
            }
        }
        return null;
    }
    
    public final Optional aT() {
        if (!this.bu()) {
            akve akve;
            if ((akve = ((akok)this.bf.orElseGet((Supplier)fde.k)).e) == null) {
                akve = akve.a;
            }
            akvk akvk;
            if ((akvk = akve.g) == null) {
                akvk = akvk.a;
            }
            return Optional.of((Object)akvk.c);
        }
        final aioe bc = this.bC;
        if (bc == null) {
            return Optional.empty();
        }
        return Optional.of((Object)((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)bc).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).e);
    }
    
    public final Optional aU() {
        if (this.bf.isPresent()) {
            anrc anrc;
            if ((anrc = ((akok)this.bf.get()).d) == null) {
                anrc = anrc.a;
            }
            if (anrc.b == 139970731) {
                anrc anrc2;
                if ((anrc2 = ((akok)this.bf.get()).d) == null) {
                    anrc2 = anrc.a;
                }
                anrb a;
                if (anrc2.b == 139970731) {
                    a = (anrb)anrc2.c;
                }
                else {
                    a = anrb.a;
                }
                return Optional.of((Object)a);
            }
        }
        return Optional.empty();
    }
    
    public final void aV() {
        final Context nt = ((br)this).nT();
        nt.getClass();
        tqt.c(nt, (View)this.bh, (CharSequence)((br)this).nT().getString(2132019351));
    }
    
    public final void aW() {
        final hle h = this.e.h;
        if (h != null && h.ar()) {
            h.dismiss();
        }
        this.ae.b();
    }
    
    public final void aX(int n) {
        this.bM(n);
        final bu od = ((br)this).od();
        if (od != null) {
            anqa anqa;
            if ((anqa = this.bP.b().A) == null) {
                anqa = anqa.a;
            }
            if (!anqa.b) {
                od.finishAfterTransition();
                if (!this.cm) {
                    n = 2130772087;
                }
                else {
                    n = 2130772089;
                }
                od.overridePendingTransition(0, n);
            }
            this.cq.tu();
        }
    }
    
    public final void aY(final hqk hqk) {
        hqk.f().ifPresent((Consumer)gyc.k);
        final Optional au = this.aU();
        if (au.isPresent() && (((anrb)au.get()).b & 0x10000000) != 0x0) {
            hqk.A((anrb)au.get(), true);
            return;
        }
        this.bJ();
        if (this.bB(false) == 1) {
            this.bq((Runnable)new hmi(this, 4));
        }
    }
    
    public final void aZ(final hom hom) {
        this.bN = Optional.of((Object)hom);
        final hod ba = this.ba;
        final boolean b = (boolean)Optional.ofNullable((Object)((br)this).m).map((Function)hns.h).orElse((Object)false) ^ true;
        final View d = ba.d;
        if (d != null) {
            if (hom == null) {
                iba.e(d, false);
            }
            else {
                final afcr b2 = hom.b;
                ba.f = hom.c;
                if (b2.isEmpty() && !b) {
                    iba.e(ba.d, false);
                }
                else {
                    final View d2 = ba.d;
                    Context context;
                    if (d2 == null) {
                        context = null;
                    }
                    else {
                        context = d2.getContext();
                    }
                    final View d3 = ba.d;
                    LinearLayout linearLayout;
                    if (d3 == null) {
                        linearLayout = null;
                    }
                    else {
                        linearLayout = (LinearLayout)d3.findViewById(2131430927);
                    }
                    if (linearLayout != null && context != null) {
                        if (b2.isEmpty()) {
                            iba.e((View)linearLayout, false);
                        }
                        else {
                            linearLayout.removeAllViews();
                            for (int c = ((afgh)b2).c, i = 0; i < c; ++i) {
                                final aibb aibb = ((List<aibb>)b2).get(i);
                                final AppCompatImageView appCompatImageView = new AppCompatImageView(context);
                                linearLayout.addView((View)appCompatImageView);
                                final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131168967);
                                appCompatImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                                appCompatImageView.setBackground(context.getDrawable(2131233088));
                                appCompatImageView.setImageTintList(tmy.cp(context, 2130970884));
                                if ((aibb.b & 0x20) != 0x0) {
                                    final acng b3 = ba.b;
                                    akbf akbf;
                                    if ((akbf = aibb.g) == null) {
                                        akbf = akbf.a;
                                    }
                                    akbe akbe;
                                    if ((akbe = akbe.b(akbf.c)) == null) {
                                        akbe = akbe.a;
                                    }
                                    appCompatImageView.setImageResource(b3.a(akbe));
                                }
                                if ((aibb.b & 0x100000) != 0x0) {
                                    ahgn ahgn;
                                    if ((ahgn = aibb.t) == null) {
                                        ahgn = ahgn.a;
                                    }
                                    ahgm ahgm;
                                    if ((ahgm = ahgn.c) == null) {
                                        ahgm = ahgm.a;
                                    }
                                    appCompatImageView.setContentDescription((CharSequence)ahgm.c);
                                }
                                if ((aibb.b & 0x10000) != 0x0) {
                                    appCompatImageView.setOnClickListener((View$OnClickListener)new gbw(ba, aibb, 17));
                                }
                                if ((aibb.b & 0x800000) != 0x0) {
                                    ba.a.n().l((wxz)new wws(aibb.w));
                                }
                            }
                            iba.e((View)linearLayout, true);
                        }
                    }
                    final View d4 = ba.d;
                    View viewById;
                    if (d4 == null) {
                        viewById = null;
                    }
                    else {
                        viewById = d4.findViewById(2131430812);
                    }
                    if (viewById != null) {
                        if (b) {
                            viewById.setOnClickListener((View$OnClickListener)new hht(ba, 13));
                            iba.e(viewById, true);
                        }
                        else {
                            iba.e(viewById, false);
                        }
                    }
                    final View d5 = ba.d;
                    Object o;
                    if (d5 == null) {
                        o = null;
                    }
                    else {
                        o = d5.findViewById(2131428445);
                    }
                    if (o != null) {
                        final anqy f = ba.f;
                        if (f != null && (f.b & 0x1) != 0x0) {
                            ajsq ajsq;
                            if ((ajsq = f.c) == null) {
                                ajsq = ajsq.a;
                            }
                            ((YouTubeTextView)o).setText((CharSequence)abyh.b(ajsq));
                        }
                        else {
                            ((YouTubeTextView)o).setText((CharSequence)null);
                            iba.e((View)o, false);
                        }
                    }
                    iba.e(ba.d, true);
                }
            }
        }
        this.ba.a(this.am.e());
    }
    
    public final void aa() {
        if (this.bA()) {
            this.aj.c("r_fr");
        }
        super.aa();
        this.bh.requestLayout();
        if (!this.bt()) {
            this.aC.e(fnl.b);
        }
        if (this.bA()) {
            this.aj.c("r_fcp");
        }
        this.cp.f(this.bx.lX(this.at));
        this.av.g((Object)this.by);
        if (this.bW()) {
            this.cp.f(this.aK.lX(this.at));
            this.cp.f(this.aJ.lX(this.at));
        }
        this.cp.f(this.bg.b.m.lX(this.at));
        this.cp.f(this.bg.b.s.lX(this.at));
        this.av.g((Object)this.bg.b.t);
        this.av.g((Object)this.aj);
        final asib cp = this.cp;
        final asgt y = this.at.w().p().Y((asjc)gkj.n);
        final hny bx = this.bx;
        bx.getClass();
        final asic al = y.al((asix)new hep(bx, 18));
        int n = 0;
        final Object d = this.at.q().d;
        final hny bx2 = this.bx;
        bx2.getClass();
        final asic am = ((asgt)d).am((asix)new hep(bx2, 19), (asix)hnn.a);
        asic asic;
        if (((uyi)this.at.cd().h).bx()) {
            final asgt r = this.at.R();
            final hny bx3 = this.bx;
            bx3.getClass();
            asic = r.am((asix)new hep(bx3, 20), (asix)hnn.a);
        }
        else {
            final asgt q = this.at.Q();
            final hny bx4 = this.bx;
            bx4.getClass();
            asic = q.am((asix)new hep(bx4, 20), (asix)hnn.a);
        }
        final asgt j = this.at.E().j(aajj.r((int)(((uyi)this.at.cd().g).f(45378403L) ? 1 : 0)));
        final hny bx5 = this.bx;
        bx5.getClass();
        cp.f(new asic[] { al, am, asic, j.am((asix)new hno(bx5), (asix)hnn.a) });
        this.bW.m((hrg)this);
        this.bX.p((hqw)this);
        final long bk = this.bk;
        if (bk != Long.MIN_VALUE) {
            this.d.t(bk, new qpt(this));
            this.bk = Long.MIN_VALUE;
        }
        else {
            final PlaybackStartDescriptor bl = this.bl;
            if (bl == null) {
                final long bs = this.bs;
                if (bs != Long.MIN_VALUE) {
                    this.d.t(bs, new qpt(this));
                }
            }
            else {
                final hmk d2 = this.d;
                final String k = bl.k();
                final String i = this.bl.i();
                String s;
                if ((s = k) == null) {
                    s = "";
                }
                String s2;
                if ((s2 = i) == null) {
                    s2 = "";
                }
                final Long[] array = { Long.MIN_VALUE };
                d2.p.K((trb)new eyc(array, s, s2, 7));
                final long longValue = array[0];
                this.bs = longValue;
                if (longValue != Long.MIN_VALUE) {
                    this.d.t(longValue, new qpt(this));
                }
            }
        }
        final hqo an = this.aN();
        if (an != null) {
            an.t().h();
        }
        if (this.co) {
            n = 2;
        }
        this.bR(n);
        final hnv hnv = new hnv(this);
        if (this.bA()) {
            this.aj.c("r_fgw");
        }
        this.bh.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)hnv);
        if (this.bh.getWidth() != 0 && this.bh.getHeight() != 0) {
            ((ViewTreeObserver$OnGlobalLayoutListener)hnv).onGlobalLayout();
        }
        this.aY.e(true);
    }
    
    public final asgn b() {
        return (asgn)this.cq;
    }
    
    public final boolean bA() {
        final arud bu = this.bU;
        anqt anqt;
        if (bu == null) {
            anqt = null;
        }
        else {
            anqh anqh;
            if ((anqh = bu.f().u) == null) {
                anqh = anqh.a;
            }
            if ((anqt = anqh.d) == null) {
                anqt = anqt.a;
            }
        }
        return anqt != null && anqt.r;
    }
    
    public final int bB(final boolean b) {
        if (!this.bf.isPresent()) {
            return 1;
        }
        final int bx = this.bX(false, false);
        int by;
        if ((by = bx) == 1) {
            by = bx;
            if (b) {
                by = this.bY(false);
            }
        }
        int n;
        if ((n = by) == 1) {
            if (this.d.A) {
                n = this.bK(trg.y(2), false);
            }
            else {
                n = this.ca(trg.y(2));
            }
        }
        return n;
    }
    
    public final int bC() {
        final boolean u = this.d.u;
        boolean l = true;
        if (u) {
            l = l;
            if (this.bf.isPresent()) {
                l = iba.L(iba.T((akok)this.bf.get()));
            }
        }
        return this.bX(false, l);
    }
    
    public final int bD() {
        final boolean u = this.d.u;
        boolean l = true;
        if (u) {
            l = l;
            if (this.bf.isPresent()) {
                final anrb t = iba.T((akok)this.bf.get());
                l = iba.L(t);
                if ((((akok)this.bf.get()).b & 0x10) == 0x0) {
                    if (iba.L(t)) {
                        this.ar.aa(0L);
                        return 4;
                    }
                }
            }
        }
        return this.bY(l);
    }
    
    public final void bE(final int a) {
        final hpb ah = this.aH;
        int n;
        int n2;
        int n3;
        int d;
        if (a - 1 != 2) {
            n = ah.a;
            n2 = ah.b;
            n3 = ah.c;
            d = ah.d;
        }
        else {
            n = ah.a;
            n2 = ah.b;
            n3 = ah.c;
            d = 0;
        }
        ah.setPadding(n, n2, n3, d);
        this.aI.a = a;
    }
    
    public final void bG() {
        this.bK(trg.y(0), true);
    }
    
    public final void bH() {
        this.ca(trg.y(0));
    }
    
    public final void bI(final String s) {
        final bu od = ((br)this).od();
        od.getClass();
        od.runOnUiThread((Runnable)new hhv(this, s, 4));
    }
    
    public final void bJ() {
        this.bP(2132019431, Optional.empty());
    }
    
    public final int bK(final trg trg, final boolean b) {
        Label_0424: {
            if (this.ar.r() != null) {
                if (this.bf.isPresent() && this.bC != null) {
                    if ((((akok)this.bf.get()).b & 0x10) == 0x0) {
                        if ((((akok)this.bf.get()).b & 0x8) == 0x0) {
                            this.ch.W(this.bC);
                            this.cg.O(this.bC);
                            break Label_0424;
                        }
                    }
                }
                if (this.bf.isPresent() && (((akok)this.bf.get()).b & 0x10) != 0x0) {
                    if ((((akok)this.bf.get()).b & 0x8) == 0x0) {
                        final Optional bz = bZ(this.aU());
                        if (bz.isPresent() && (((anrf)bz.get()).b & 0x1) != 0x0 && (((anrf)bz.get()).b & 0x2) != 0x0 && ((anrf)bz.get()).c == 2) {
                            final fzo ch = this.ch;
                            aioe aioe;
                            if ((aioe = ((akok)this.bf.get()).g) == null) {
                                aioe = aioe.a;
                            }
                            ch.W(aioe);
                            final fzo cg = this.cg;
                            aioe aioe2;
                            if ((aioe2 = ((akok)this.bf.get()).g) == null) {
                                aioe2 = aioe.a;
                            }
                            cg.O(aioe2);
                            break Label_0424;
                        }
                    }
                }
                final agza builder = ((agzi)ReelWatchEndpointOuterClass$ReelWatchEndpoint.a).createBuilder();
                final String r = this.ar.r();
                builder.copyOnWrite();
                final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)builder.instance;
                r.getClass();
                reelWatchEndpointOuterClass$ReelWatchEndpoint.b |= 0x10;
                reelWatchEndpointOuterClass$ReelWatchEndpoint.f = r;
                builder.copyOnWrite();
                final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)builder.instance;
                reelWatchEndpointOuterClass$ReelWatchEndpoint2.b |= 0x20;
                reelWatchEndpointOuterClass$ReelWatchEndpoint2.g = 1;
                final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint3 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)builder.build();
                final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
                agzc.e((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint, (Object)reelWatchEndpointOuterClass$ReelWatchEndpoint3);
                final aioe aioe3 = (aioe)((agza)agzc).build();
                this.ch.W(aioe3);
                this.cg.O(aioe3);
            }
        }
        final int s = this.d.s(trg);
        if (b && s == 1) {
            this.aV();
            if (!tqt.e(((br)this).nT())) {
                this.aX(37419);
                return 1;
            }
        }
        return s;
    }
    
    public final void ba(final PlayerResponseModel playerResponseModel) {
        if (playerResponseModel != null) {
            this.cu = Optional.of((Object)playerResponseModel);
        }
        if ((boolean)this.bQ.l(45365621L).aG() && !this.bt && !this.cu.isEmpty()) {
            final Optional cu = this.cu;
            final Optional bd = this.bD;
            if (!cu.isEmpty()) {
                if (!bd.isEmpty()) {
                    final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)bd.get()).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                    if (reelWatchEndpointOuterClass$ReelWatchEndpoint.e.equals(((PlayerResponseModel)cu.get()).K()) || (!reelWatchEndpointOuterClass$ReelWatchEndpoint.f.isEmpty() && reelWatchEndpointOuterClass$ReelWatchEndpoint.e.isEmpty())) {
                        this.bt = true;
                        this.aD.n().D((wxz)new wws(ByteBuffer.wrap(((PlayerResponseModel)this.cu.get()).Y()).array()));
                    }
                }
            }
        }
    }
    
    public final void bb() {
        synchronized (this.bG) {
            if ((this.bI || this.bJ) && (this.cx || !this.aQ().y) && this.bH.isPresent()) {
                this.aG.post((Runnable)this.bH.get());
                this.bH = Optional.empty();
            }
        }
    }
    
    public final void bc() {
        if (!this.as.b()) {
            this.bX(true, true);
            return;
        }
        if (this.aQ().l && this.bf.isPresent()) {
            if ((((akok)this.bf.get()).b & 0x8) == 0x0) {
                this.bK(trg.y(3), false);
            }
        }
    }
    
    public final void bd() {
        final bu od = ((br)this).od();
        od.getClass();
        od.onBackPressed();
    }
    
    public final void be() {
        final Optional au = this.aU();
        if (au.isPresent()) {
            anra anra;
            if ((anra = ((anrb)au.get()).k) == null) {
                anra = anra.a;
            }
            anqz anqz;
            if ((anqz = anra.c) == null) {
                anqz = anqz.a;
            }
            if ((anqz.b & 0x8) != 0x0) {
                anra anra2;
                if ((anra2 = ((anrb)au.get()).k) == null) {
                    anra2 = anra.a;
                }
                anqz anqz2;
                if ((anqz2 = anra2.c) == null) {
                    anqz2 = anqz.a;
                }
                if ((anqz2.b & 0x200) != 0x0) {
                    this.aP().J(3, (wxz)new wws(anqz2.h), (alff)null);
                }
                if (!this.bs()) {
                    final vax ay = this.ay;
                    aioe aioe;
                    if ((aioe = anqz2.e) == null) {
                        aioe = aioe.a;
                    }
                    ay.a(aioe);
                    return;
                }
                final hnh bl = this.bL;
                if (bl != null) {
                    bl.d();
                }
            }
        }
    }
    
    public final void bf() {
        final hpd ao = this.ao;
        final wwv n = ao.c.n();
        final ArrayList list = new ArrayList();
        list.add(hpd.c(93504));
        list.add(hpd.c(91958));
        list.add(hpd.c(91957));
        list.add(hpd.c(114670));
        list.add(hpd.c(91955));
        list.add(hpd.c(93502));
        list.add(hpd.c(91953));
        list.add(hpd.c(93500));
        list.add(hpd.c(91956));
        list.add(hpd.c(93503));
        list.add(hpd.c(91954));
        list.add(hpd.c(93501));
        if (ao.h && ao.g) {
            list.add(hpd.c(134942));
        }
        n.k((List)list);
        if (this.bn) {
            final hmo ah = this.ah;
            if (ah.h != null) {
                final int a = ah.a;
                if ((a & 0x1) == 0x0) {
                    ah.a = (a | 0x1);
                    ah.c.n().l((wxz)new wws(ah.h));
                    ah.d();
                }
            }
        }
    }
    
    public final void bg() {
        final Optional au = this.aU();
        if (au.isPresent() && (((anrb)au.get()).c & 0x8) != 0x0) {
            final anqw t = iba.t((anrb)au.get());
            t.getClass();
            final vax ay = this.ay;
            aioe aioe;
            if ((aioe = t.e) == null) {
                aioe = aioe.a;
            }
            ay.a(aioe);
            return;
        }
        if (au.isPresent() && (((anrb)au.get()).b & 0x10) != 0x0 && (((anrb)au.get()).b & 0x40) != 0x0) {
            amer amer;
            if ((amer = ((anrb)au.get()).l) == null) {
                amer = amer.a;
            }
            if ((amer.b & 0x1) != 0x0) {
                amer amer2;
                if ((amer2 = ((anrb)au.get()).l) == null) {
                    amer2 = amer.a;
                }
                ameo ameo;
                if ((ameo = amer2.c) == null) {
                    ameo = ameo.a;
                }
                this.B(ameo);
            }
        }
    }
    
    public final void bh(final boolean b) {
        if (this.bs()) {
            this.ba.a(b);
        }
    }
    
    public final void bi(final akkr akkr, final akks akks) {
        final int ce = aqql.ce(akks.c);
        if (ce != 0) {
            if (ce == 2) {
                final fzo ch = this.ch;
                final String d = akkr.d;
                synchronized (ch.b) {
                    ((Map<Object, Object>)ch.b).remove(d);
                    monitorexit(ch.b);
                    if (this.bB(true) == 1) {
                        this.aX(37419);
                    }
                }
            }
        }
    }
    
    public final void bj(final long bs, final akok akok, final boolean b) {
        if (akok == null) {
            return;
        }
        String s;
        if (!this.bu()) {
            akve akve;
            if ((akve = akok.e) == null) {
                akve = akve.a;
            }
            if ((akve.b & 0x8) != 0x0) {
                akve akve2;
                if ((akve2 = akok.e) == null) {
                    akve2 = akve.a;
                }
                akvk akvk;
                if ((akvk = akve2.g) == null) {
                    akvk = akvk.a;
                }
                s = akvk.c;
            }
            else {
                s = null;
            }
        }
        else {
            s = (String)this.aT().orElse((Object)"");
        }
        this.bs = bs;
        String s2 = s;
        if ((akok.b & 0x1000) != 0x0) {
            aioe ct;
            if ((ct = akok.k) == null) {
                ct = aioe.a;
            }
            this.ct = ct;
            this.bD = Optional.of((Object)ct);
            final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)this.ct).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            if (this.bu()) {
                s = reelWatchEndpointOuterClass$ReelWatchEndpoint.e;
            }
            final aioe ct2 = this.ct;
            this.bC = ct2;
            final hmk d = this.d;
            d.n(bs, ct2);
            if (bs == d.z && ((agzd)ct2).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                d.F.a = (iba.K((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)ct2).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) ^ true);
                d.F.b = hmk.r((anqt)d.d.a());
            }
            this.ch.U(this.ct);
            this.cr.tr((Object)this.ct);
            this.aj.f(s);
            if (iba.N(reelWatchEndpointOuterClass$ReelWatchEndpoint) != 1) {
                final hmm aj = this.aj;
                final int i = hmm.i(reelWatchEndpointOuterClass$ReelWatchEndpoint);
                synchronized (aj.a) {
                    if (aj.d != null) {
                        final int h = aj.h;
                        if (h == 0) {
                            throw null;
                        }
                        if (h != i) {
                            aj.h = i;
                            final agza builder = ((agzi)alkn.a).createBuilder();
                            builder.copyOnWrite();
                            final alkn alkn = (alkn)builder.instance;
                            alkn.f = i - 1;
                            alkn.b |= 0x8;
                            final alkn p3 = (alkn)builder.build();
                            final agza builder2 = ((agzi)alkg.a).createBuilder();
                            builder2.copyOnWrite();
                            final alkg alkg = (alkg)builder2.instance;
                            p3.getClass();
                            alkg.P = p3;
                            alkg.d |= 0x10;
                            aj.d.a((alkg)builder2.build());
                        }
                    }
                }
            }
            final hqo an = this.aN();
            s2 = s;
            if (this.am.e()) {
                s2 = s;
                if (an != null) {
                    an.f().ifPresent((Consumer)new hnr(reelWatchEndpointOuterClass$ReelWatchEndpoint, 3));
                    s2 = s;
                }
            }
        }
        final int cd = aqql.cd(akok.h);
        Label_0640: {
            if (cd != 0) {
                if (cd == 2) {
                    break Label_0640;
                }
            }
            synchronized (this.bG) {
                this.bJ = true;
            }
        }
        if ((akok.b & 0x2000) != 0x0) {
            final hnb b2 = this.d.b;
            final String l = akok.l;
            if (!b2.i && !aexs.f(l)) {
                b2.i = true;
                final hsb m = b2.m.m();
                m.a = l;
                b2.d(b2.f, m, 2, 1);
            }
        }
        final hmm aj2 = this.aj;
        synchronized (aj2.a) {
            long n2;
            if (aj2.d != null && aj2.h(s2)) {
                final long c = aj2.b.c();
                aj2.d.c("r_wrr");
                final agza builder3 = ((agzi)alkn.a).createBuilder();
                int n;
                if (b) {
                    n = 4;
                }
                else {
                    n = 2;
                }
                builder3.copyOnWrite();
                final alkn alkn2 = (alkn)builder3.instance;
                alkn2.d = n - 1;
                alkn2.b |= 0x2;
                final alkn p4 = (alkn)builder3.build();
                final boolean equals = "cold".equals(aj2.g);
                String g;
                if ((g = aj2.g) == null) {
                    g = "warm";
                }
                final agza builder4 = ((agzi)alkg.a).createBuilder();
                String j = g;
                if (b) {
                    j = g;
                    if (!equals) {
                        j = "hot";
                    }
                }
                builder4.copyOnWrite();
                final alkg alkg2 = (alkg)builder4.instance;
                alkg2.b |= 0x10;
                alkg2.i = j;
                builder4.copyOnWrite();
                final alkg alkg3 = (alkg)builder4.instance;
                p4.getClass();
                alkg3.P = p4;
                alkg3.d |= 0x10;
                aj2.d.a((alkg)builder4.build());
                final long e = aj2.e;
                monitorexit(aj2.a);
                n2 = c - e;
            }
            else {
                monitorexit(aj2.a);
                n2 = 0L;
            }
            Label_1150: {
                if (this.aQ().u) {
                    synchronized (this.bG) {
                        if (this.bH.isPresent()) {
                            zjp.h(zjo.a, zjn.x, "Last delayed ReelItemPlayback not processed during playback", 0.1);
                        }
                        this.bH = Optional.of((Object)new bsm(this, n2, bs, akok, 3));
                        this.bb();
                        break Label_1150;
                    }
                }
                final bu od = ((br)this).od();
                od.getClass();
                od.runOnUiThread((Runnable)new bsm(this, n2, bs, akok, 4));
            }
            this.cs.tr((Object)akok);
        }
    }
    
    public final void bk(final long n, final akok akok, final long n2) {
        this.aj.c("r_rips");
        this.bf = Optional.ofNullable((Object)akok);
        final wwv ap = this.aP();
        final akok akok2 = (akok)this.bf.get();
        akol akol = null;
        Label_0120: {
            if ((akok2.b & 0x10000) != 0x0) {
                anss anss;
                if ((anss = akok2.o) == null) {
                    anss = anss.a;
                }
                if (((agzd)anss).rs((agyr)InnertubeGetReelItemWatchService.reelWatchStatusRenderer)) {
                    anss anss2;
                    if ((anss2 = akok2.o) == null) {
                        anss2 = anss.a;
                    }
                    akol = (akol)((agzd)anss2).rr((agyr)InnertubeGetReelItemWatchService.reelWatchStatusRenderer);
                    break Label_0120;
                }
            }
            akol = null;
        }
        final Optional f = this.d.f(n);
        if (f.isPresent()) {
            final hml hml = (hml)f.get();
            if (hml.d != null) {
                if (this.bu()) {
                    ap.l((wxz)new wws(hml.d));
                }
                else {
                    ap.D((wxz)new wws(hml.d));
                }
            }
        }
        ap.l((wxz)new wws(akok.i));
        final anrb t = iba.T(akok);
        byte[] i = null;
        Label_0311: {
            if (t != null) {
                anss anss3;
                if ((anss3 = t.r) == null) {
                    anss3 = anss.a;
                }
                if (((agzd)anss3).rs((agyr)AutoplayRendererOuterClass.autoplayEndpointRenderer)) {
                    anss anss4;
                    if ((anss4 = t.r) == null) {
                        anss4 = anss.a;
                    }
                    i = ((ahvl)((agzd)anss4).rr((agyr)AutoplayRendererOuterClass.autoplayEndpointRenderer)).d.I();
                    break Label_0311;
                }
            }
            i = null;
        }
        if (i != null) {
            ap.t((wxz)new wws(i), (alff)null);
        }
        if (this.am.e()) {
            this.ar.a();
        }
        if (!((List)akok.n).isEmpty()) {
            this.aU.r();
            for (final ajnh ajnh : akok.n) {
                if (ajnh.b == 138681066) {
                    this.aU.o((ajnl)ajnh.c);
                }
            }
        }
        final hqo ao = aO(f);
        String e;
        if (f.isPresent()) {
            final hml hml2 = (hml)f.get();
            hml2.c(akok);
            e = hml2.b().e;
        }
        else {
            e = null;
        }
        if (ao == null) {
            return;
        }
        if (e != null) {
            this.bV.f(e, this.aU());
        }
        final boolean present = f.isPresent();
        final boolean b = false;
        if (present) {
            final hml hml3 = (hml)f.get();
            if (!this.bu()) {
                final hlf aq = this.aq;
                final aioe e2 = hml3.e;
                akve akve;
                if ((akve = akok.e) == null) {
                    akve = akve.a;
                }
                aq.g(e2, akve);
            }
            final boolean z = iba.z(hml3.b());
            final boolean b2 = this.bt() ^ true;
            this.bE(ao.r());
            ao.j(e, akok, hml3.a, true, z, b2, hml3.b());
            final View o = ((br)this).O;
            o.getClass();
            tmy.v(o.findViewById(2131431040), !b2 && ao.q());
        }
        final Optional au = this.aU();
        final hms ap2 = this.ap;
        final anre anre = (anre)au.map((Function)hns.d).orElse((Object)null);
        ap2.f = null;
        ap2.h = false;
        ap2.i = -1;
        ap2.a = 0;
        final boolean c = iba.C(anre);
        ap2.g = c;
        if (anre != null) {
            if (c) {
                if ((anre.b & 0x4) != 0x0) {
                    final hqe c2 = ap2.c;
                    anrd anrd;
                    if ((anrd = anre.e) == null) {
                        anrd = anrd.a;
                    }
                    c2.a(anrd);
                }
                ap2.i = anre.g;
                ap2.f = wya.c(109990);
                ap2.a |= 0x1;
                final wws wws = new wws(ap2.f);
                final agza builder = ((agzi)alfo.a).createBuilder();
                final int d = ap2.c.d();
                builder.copyOnWrite();
                final alfo alfo = (alfo)builder.instance;
                alfo.d = d - 1;
                alfo.b |= 0x2;
                final alfo s = (alfo)builder.build();
                final agza builder2 = ((agzi)alff.a).createBuilder();
                builder2.copyOnWrite();
                final alff alff = (alff)builder2.instance;
                s.getClass();
                alff.s = s;
                alff.c |= 0x1;
                final alff alff2 = (alff)builder2.build();
                final wwv n3 = ap2.b.n();
                n3.D((wxz)wws);
                n3.w((wxz)wws, alff2);
            }
        }
        if (this.bf.isPresent()) {
            Optional optional;
            if ((((akok)this.bf.get()).b & 0x10) != 0x0) {
                aioe aioe;
                if ((aioe = ((akok)this.bf.get()).g) == null) {
                    aioe = aioe.a;
                }
                optional = Optional.of((Object)aioe);
            }
            else {
                optional = Optional.empty();
            }
            this.bo(optional);
            Optional optional2;
            if ((((akok)this.bf.get()).b & 0x8) != 0x0) {
                aioe aioe2;
                if ((aioe2 = ((akok)this.bf.get()).f) == null) {
                    aioe2 = aioe.a;
                }
                optional2 = Optional.of((Object)aioe2);
            }
            else {
                optional2 = Optional.empty();
            }
            this.bo(optional2);
        }
        final boolean j = this.bg.i();
        final String s2 = "";
        if (j) {
            final Locale us = Locale.US;
            String r;
            if (this.ar.r() == null) {
                r = "";
            }
            else {
                r = this.ar.r();
            }
            trn.g(String.format(us, "Reels[%s / %s] Response Time: %d ms", r, this.aT().orElse((Object)""), n2));
        }
        final int h = akok.h;
        final int cd = aqql.cd(h);
        Label_1317: {
            if (cd != 0) {
                if (cd == 2) {
                    break Label_1317;
                }
            }
            final int cd2 = aqql.cd(h);
            if (cd2 != 0) {
                if (cd2 != 1) {
                    this.ag.g(4);
                }
            }
        }
        if (!iba.A(akok) && !this.bp) {
            if (akol != null) {
                if (this.bf.isPresent() && (akol.b & 0x1) != 0x0) {
                    final hqk am = this.aM();
                    if (am != null) {
                        am.a.e();
                    }
                    ajsq ajsq;
                    if ((ajsq = akol.c) == null) {
                        ajsq = ajsq.a;
                    }
                    final String string = abyh.b(ajsq).toString();
                    final Optional empty = Optional.empty();
                    final hqo an = this.aN();
                    if (an != null) {
                        an.t().g(string, empty);
                    }
                }
            }
            else if (!this.bx() && !this.bq) {
                if (this.bx.a.isPresent()) {
                    final hny bx = this.bx;
                    bx.a((aamc)bx.a.get());
                }
                else {
                    final Context nt = ((br)this).nT();
                    nt.getClass();
                    if (tqt.e(nt)) {
                        final Optional bf = this.bf;
                        if (bf.isPresent()) {
                            anrc anrc;
                            if ((anrc = ((akok)bf.get()).d) == null) {
                                anrc = anrc.a;
                            }
                            if (anrc.b == 139970731) {
                                anrc anrc2;
                                if ((anrc2 = ((akok)bf.get()).d) == null) {
                                    anrc2 = anrc.a;
                                }
                                anrb a;
                                if (anrc2.b == 139970731) {
                                    a = (anrb)anrc2.c;
                                }
                                else {
                                    a = anrb.a;
                                }
                                bZ(Optional.of((Object)a)).ifPresent((Consumer)new fuz(this, nt, 15));
                            }
                        }
                    }
                }
            }
            else {
                final int cd3 = aqql.cd(akok.h);
                boolean b3;
                if (cd3 == 0) {
                    b3 = b;
                }
                else {
                    b3 = b;
                    if (cd3 == 5) {
                        b3 = true;
                    }
                }
                if (!b3) {
                    this.bJ();
                }
                if (this.bB(b3) == 1) {
                    this.bq((Runnable)new hmi(this, 5));
                }
            }
        }
        else if (ao instanceof hqk) {
            this.aY((hqk)ao);
        }
        this.bN();
        if ((akok.b & 0x8000) != 0x0) {
            anss anss5;
            if ((anss5 = akok.m) == null) {
                anss5 = anss.a;
            }
            if (((agzd)anss5).rs((agyr)TooltipRendererOuterClass.tooltipRenderer)) {
                anss anss6;
                if ((anss6 = akok.m) == null) {
                    anss6 = anss.a;
                }
                final aotf aotf = (aotf)((agzd)anss6).rr((agyr)TooltipRendererOuterClass.tooltipRenderer);
                final String e3 = gkt.e(aotf);
                if (e3 != null) {
                    this.bB.add(e3);
                    this.aT.e(aotf, (aext)new eto(this, 6));
                    final hqk am2 = this.aM();
                    if (am2 != null) {
                        final acuj at = this.aT;
                        final hpm a2 = am2.a;
                        if (!e3.isEmpty()) {
                            final anqz b4 = a2.b();
                            String k;
                            if (b4 != null) {
                                aorm aorm;
                                if ((aorm = b4.g) == null) {
                                    aorm = aorm.a;
                                }
                                k = aorm.j;
                            }
                            else {
                                k = "";
                            }
                            if (!hpm.o(at, k, (View)a2.B, e3)) {
                                final allx a3 = a2.a(a2.H);
                                String q;
                                if (a3 != null) {
                                    q = a3.q;
                                }
                                else {
                                    q = "";
                                }
                                if (!hpm.o(at, q, (View)a2.w, e3)) {
                                    final anqv s3 = iba.s(a2.H);
                                    String l;
                                    if (s3 != null) {
                                        l = s3.i;
                                    }
                                    else {
                                        l = "";
                                    }
                                    if (!hpm.o(at, l, a2.z, e3)) {
                                        final aibb m = hpm.m(a2.H);
                                        String k2;
                                        if (m != null) {
                                            k2 = m.k;
                                        }
                                        else {
                                            k2 = "";
                                        }
                                        if (!hpm.o(at, k2, (View)a2.x, e3)) {
                                            final aokb c3 = a2.c(a2.H);
                                            String s4;
                                            if (c3 != null) {
                                                s4 = c3.s;
                                            }
                                            else {
                                                s4 = "";
                                            }
                                            if (!hpm.o(at, s4, (View)a2.y, e3)) {
                                                final aibb n4 = hpm.n(a2.H);
                                                String k3;
                                                if (n4 != null) {
                                                    k3 = n4.k;
                                                }
                                                else {
                                                    k3 = "";
                                                }
                                                if (!hpm.o(at, k3, (View)a2.E, e3)) {
                                                    final aibb s5 = hpm.s(a2.H);
                                                    String k4 = s2;
                                                    if (s5 != null) {
                                                        k4 = s5.k;
                                                    }
                                                    View view;
                                                    if (hpm.l(a2.H) != null) {
                                                        view = a2.r;
                                                    }
                                                    else {
                                                        view = a2.s;
                                                    }
                                                    hpm.o(at, k4, view, e3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.d.e().map((Function)hkc.u).filter((Predicate)hnm.c).map((Function)hns.c).ifPresent((Consumer)new hnr(this, 5));
        this.aj.c("r_ripe");
        if (f.isPresent() && !((hml)f.get()).b && iba.H(((hml)f.get()).e)) {
            final atje ba = this.bA;
            Optional optional3;
            if (!(optional3 = Optional.ofNullable((Object)akok).map((Function)hns.i).map((Function)hkc.k).map((Function)hkc.l).filter((Predicate)hnm.b).map((Function)hkc.m).filter((Predicate)hnm.a).map((Function)hkc.n)).isPresent()) {
                optional3 = Optional.ofNullable((Object)akok).map((Function)hns.i).map((Function)hkc.k).map((Function)hkc.o).map((Function)hkc.i).filter((Predicate)fqf.u).map((Function)hkc.j);
            }
            ba.tr((Object)optional3);
            return;
        }
        this.bA.tr((Object)Optional.empty());
    }
    
    public final void bl(final long n, final aioe aioe, final akok akok, final int n2) {
        final Optional map = Optional.ofNullable((Object)akok).map((Function)hkc.r).map((Function)hkc.s).map((Function)hkc.t);
        if (map.isPresent()) {
            anrc anrc;
            if ((anrc = akok.d) == null) {
                anrc = anrc.a;
            }
            if (anrc.b == 139970731) {
                final abcr bv = this.bV;
                final String s = (String)map.get();
                anrc anrc2;
                if ((anrc2 = akok.d) == null) {
                    anrc2 = anrc.a;
                }
                anrb a;
                if (anrc2.b == 139970731) {
                    a = (anrb)anrc2.c;
                }
                else {
                    a = anrb.a;
                }
                bv.f(s, Optional.of((Object)a));
            }
        }
        final bu od = ((br)this).od();
        od.getClass();
        od.runOnUiThread((Runnable)new hnt(this, n2, akok, n, aioe));
    }
    
    public final void bm(final aioe aioe) {
        String e = null;
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint;
        if (aioe == null) {
            reelWatchEndpointOuterClass$ReelWatchEndpoint = null;
        }
        else {
            reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)aioe).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        }
        if (reelWatchEndpointOuterClass$ReelWatchEndpoint != null) {
            e = reelWatchEndpointOuterClass$ReelWatchEndpoint.e;
        }
        final hpd ao = this.ao;
        ao.f = this.d.u;
        ao.g = iba.I(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        this.ak.a(aioe);
        final hmm aj = this.aj;
        synchronized (aj.a) {
            if (aj.d != null && aj.h(e)) {
                aj.d.c("r_wrs");
            }
            monitorexit(aj.a);
            this.bE = Optional.empty();
        }
    }
    
    public final void bn(final aioe aioe, final akve akve, final int n) {
        final bu od = ((br)this).od();
        od.getClass();
        od.runOnUiThread((Runnable)new gka(this, n, aioe, akve, 2));
    }
    
    public final void bo(final Optional optional) {
        if (optional.isPresent() && ((agzd)optional.get()).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)optional.get()).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            final hqo an = this.aN();
            if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x80) != 0x0 && an != null) {
                an.f().ifPresent((Consumer)new hnr(reelWatchEndpointOuterClass$ReelWatchEndpoint, 2));
            }
        }
    }
    
    public final void bp(final aioe bc, final int n, final Optional optional) {
        this.bC = bc;
        this.bf = Optional.empty();
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)this.bC).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        String e;
        if (reelWatchEndpointOuterClass$ReelWatchEndpoint != null) {
            e = reelWatchEndpointOuterClass$ReelWatchEndpoint.e;
        }
        else {
            e = null;
        }
        this.aj.k(n, 4, reelWatchEndpointOuterClass$ReelWatchEndpoint, (wyn)optional.orElse((Object)null), 0L);
        this.bg.f(0L);
        this.bg.g(0L);
        final aioe bc2 = this.bC;
        if (bc2 != null && ((agzd)bc2).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)bc2).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            final hqo an = this.aN();
            if (an != null) {
                if ((reelWatchEndpointOuterClass$ReelWatchEndpoint2.b & 0x80) != 0x0) {
                    an.f().ifPresent((Consumer)new hnr(reelWatchEndpointOuterClass$ReelWatchEndpoint2, 0));
                }
                else {
                    an.f().ifPresent((Consumer)gyc.j);
                }
            }
        }
        if (reelWatchEndpointOuterClass$ReelWatchEndpoint != null) {
            this.d.n(this.d.d(), this.bC);
            this.ch.U(this.bC);
        }
        this.aj.g(e, 0L);
    }
    
    public final void bq(final Runnable runnable) {
        runnable.getClass();
        int n;
        if (!this.aP.o()) {
            n = 2132019429;
        }
        else {
            n = 2132019443;
        }
        final hqo an = this.aN();
        if (an == null) {
            return;
        }
        this.bP(n, Optional.of((Object)new hhv(an, runnable, 5)));
    }
    
    public final void br(final alcc alcc) {
        if (alcc.b == 113762946) {
            final agiy agiy = (agiy)this.aN.a();
            antf a;
            if (alcc.b == 113762946) {
                a = (antf)alcc.c;
            }
            else {
                a = antf.a;
            }
            agiy.d(a, this.aO.a());
            return;
        }
        final hqo an = this.aN();
        if (alcc.b == 66439850 && an instanceof hqk) {
            final hqk hqk = (hqk)an;
            final aejr aejr = (aejr)this.aL.a();
            final bu od = ((br)this).od();
            od.getClass();
            final View e = hqk.e;
            final pqq v = hqk.v;
            final anrb h = hqk.a.H;
            int bw;
            if (h == null || (bw = aqql.bW(h.t)) == 0) {
                bw = 1;
            }
            ameo a2;
            if (alcc.b == 66439850) {
                a2 = (ameo)alcc.c;
            }
            else {
                a2 = ameo.a;
            }
            final ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper((Context)od, 2132083493);
            final AtomicReference<nb> atomicReference = new AtomicReference<nb>();
            final hmx hmx = new hmx((acir)new achs(), (acip)new hmw(aejr, (Context)contextThemeWrapper, (acnh)new hmv(), (acni)new wsf((AtomicReference)atomicReference, 1), (byte[])null));
            ((acno)hmx).b((Class)amel.class);
            final achz x = ((aeby)aejr.c).X(hmx.a);
            final acjb acjb = new acjb();
            x.h((achk)acjb);
            ((tdv)acjb).addAll((Collection)a2.c);
            final int h2 = tmy.h((Context)contextThemeWrapper, (ListAdapter)x, (ViewGroup)new FrameLayout((Context)contextThemeWrapper));
            final float dimension = ((Context)contextThemeWrapper).getResources().getDimension(2131166974);
            final nb nb = new nb((Context)contextThemeWrapper);
            atomicReference.set(nb);
            int j;
            if (bw != 4) {
                j = 8388661;
            }
            else {
                j = 8388693;
            }
            nb.j = j;
            final Resources resources = ((Context)contextThemeWrapper).getResources();
            nb.r((int)tmy.f((Context)contextThemeWrapper, (float)h2, dimension));
            nb.g = -resources.getDimensionPixelOffset(2131169209);
            nb.j(-resources.getDimensionPixelOffset(2131169210));
            nb.z();
            nb.y();
            nb.e((ListAdapter)x);
            if (e != null) {
                nb.l = e;
            }
            aejr.b = ((hqa)aejr.a).a();
            v.c(false);
            nb.t((PopupWindow$OnDismissListener)new hmu(aejr, v, 0, (byte[])null, (byte[])null));
            nb.v();
        }
    }
    
    public final boolean bs() {
        return (boolean)Optional.ofNullable((Object)((br)this).m).map((Function)hkc.q).orElse((Object)false);
    }
    
    public final boolean bt() {
        return (boolean)Optional.ofNullable((Object)((br)this).m).map((Function)hns.b).orElse((Object)false);
    }
    
    public final boolean bu() {
        return this.aQ().B;
    }
    
    public final boolean bv() {
        anqa anqa;
        if ((anqa = this.bP.b().A) == null) {
            anqa = anqa.a;
        }
        return anqa.g;
    }
    
    public final boolean bw() {
        return this.aN() instanceof hoz && this.bv();
    }
    
    public final boolean bx() {
        final boolean present = this.bf.isPresent();
        boolean b2;
        final boolean b = b2 = false;
        if (present) {
            final int cd = aqql.cd(((akok)this.bf.get()).h);
            Label_0053: {
                if (cd == 0) {
                    break Label_0053;
                }
                if (cd != 4) {
                    break Label_0053;
                }
                b2 = true;
                return b2;
            }
            final int cd2 = aqql.cd(((akok)this.bf.get()).h);
            if (cd2 != 0) {
                if (cd2 == 3) {
                    return true;
                }
            }
            final int cd3 = aqql.cd(((akok)this.bf.get()).h);
            if (cd3 == 0) {
                b2 = b;
            }
            else {
                if (cd3 == 5) {
                    return true;
                }
                b2 = b;
            }
        }
        return b2;
    }
    
    public final boolean by(final long n) {
        final hmk d = this.d;
        final boolean q = d.q();
        boolean b = true;
        if (!q || d.b.h) {
            if (d.p.C(n) == d.p.z()) {
                b = false;
            }
        }
        return b;
    }
    
    public final boolean bz(final long n) {
        final hmk d = this.d;
        final boolean q = d.q();
        boolean b = true;
        if (!q || !d.b.c()) {
            if (d.p.C(n) == d.p.y()) {
                b = false;
            }
        }
        return b;
    }
    
    public final ashe c() {
        return (ashe)this.cr;
    }
    
    public final void d() {
        this.bO();
    }
    
    public final void h() {
    }
    
    public final boolean l() {
        if (this.aU.w()) {
            this.aU.k();
            return true;
        }
        if (this.ah.f()) {
            this.ah.b();
            return true;
        }
        if (this.ap.e()) {
            this.ap.b();
            return true;
        }
        if ((boolean)Optional.ofNullable((Object)((br)this).m).map((Function)hns.a).orElse((Object)false) && this.bt()) {
            ((br)this).oe().finish();
            return true;
        }
        this.bV.g();
        if (this.bL() == 0) {
            this.bM(22156);
            return false;
        }
        this.bO();
        return false;
    }
    
    public final void lP(final Context context) {
        final afqq a = afqq.a;
        this.cv = Instant.now().toEpochMilli();
        super.lP(context);
    }
    
    public final boolean m() {
        if (this.ah.f()) {
            this.ah.b();
            return false;
        }
        if (this.ap.e()) {
            this.ap.b();
            return false;
        }
        if (this.bL() == 0) {
            this.aX(22156);
            return false;
        }
        this.bO();
        this.bV.g();
        return true;
    }
    
    public final Object n() {
        final arud bu = this.bU;
        anqt anqt;
        if (bu == null) {
            anqt = null;
        }
        else {
            anqh anqh;
            if ((anqh = bu.f().u) == null) {
                anqh = anqh.a;
            }
            if ((anqt = anqh.d) == null) {
                anqt = anqt.a;
            }
        }
        if (anqt != null && anqt.w) {
            final ReelToReelList list = new ReelToReelList(this.d.g(), this.d.h());
            final abcr bv = this.bV;
            Object k = new HashMap();
            if (bv.a) {
                k = afcw.k((Map)bv.b);
            }
            return new hnz(list, new cya((Map)k), (byte[])null, (byte[])null, (byte[])null);
        }
        return null;
    }
    
    public final void nm() {
        final hmk d = this.d;
        d.K = null;
        d.L = null;
        final hma p = d.p;
        Object o = p.a;
        monitorenter(o);
        try {
            final Iterator iterator = p.a.iterator();
            while (iterator.hasNext()) {
                final hng g = ((hml)iterator.next()).g;
                if (g != null) {
                    g.G();
                }
            }
            p.a.clear();
            monitorexit(o);
            ((nq)p).rT();
            ((Map)this.bY.a).clear();
            if ((o = this.bU.f().A) == null) {
                o = ajpg.a;
            }
            final agza builder = ((agzi)ajph.a).createBuilder();
            builder.copyOnWrite();
            ajph.a((ajph)builder.instance);
            final ajph ajph = (ajph)builder.build();
            final ahas b = ((ajpg)o).b;
            final Long value = 45366409L;
            o = ajph;
            if (((Map)b).containsKey(value)) {
                o = ((Map)b).get(value);
            }
            if (((ajph)o).b == 1 && (boolean)((ajph)o).c) {
                this.aJ.r();
            }
            this.bZ.r((eul)null);
            Label_0295: {
                if (!this.bT() || this.ar.Z()) {
                    if (!this.aQ().K) {
                        break Label_0295;
                    }
                    final String bw = this.bw;
                    if (bw == null) {
                        break Label_0295;
                    }
                    o = this.ar.u.a;
                    if (o == null || !((abta)o).u().equals(bw)) {
                        break Label_0295;
                    }
                }
                this.ar.t();
            }
            o = this.ck;
            if (o != null) {
                this.ci.Z((RecyclerView)o);
            }
            this.bv.b(this.aP());
            this.bN();
            super.nm();
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    public final void no() {
        if (this.bA()) {
            this.aj.c("r_fs");
        }
        super.no();
    }
    
    public final void np() {
        if (this.bT() && this.bU()) {
            final bu od = ((br)this).od();
            od.getClass();
            final boolean finishing = od.isFinishing();
            this.ar.a();
            this.ar.C(finishing);
        }
        super.np();
    }
    
    public final void o(final Object o) {
        if (o instanceof hnz) {
            this.bm = (hnz)o;
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final hmq an = this.an;
        if (an.k != null) {
            final Point point = new Point();
            an.k.getDefaultDisplay().getSize(point);
            final int y = point.y;
            an.a = y;
            an.j = (int)(y * 0.1f);
        }
        final ReelPlayerView bh = this.bh;
        if (bh == null) {
            zjp.b(zjo.b, zjn.x, "null playerView in ReelWatchFragment#onConfigurationChanged");
            final bu od = ((br)this).od();
            if (od != null) {
                ((Activity)od).finish();
            }
            return;
        }
        final int width = bh.getWidth();
        final int height = this.bh.getHeight();
        final ViewTreeObserver viewTreeObserver = this.bh.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new hnw(this, width, height, viewTreeObserver));
    }
    
    public final void oq(final Bundle bundle) {
        this.cw = this.au.c();
        super.oq(bundle);
        this.ak.h((hoj)this);
        this.al.c((eul)this);
        this.bu = new hmt(this.cd, this.af, this.bU, this.ax, this.cc, this.aj, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.bv = this.cc.J(this.cd, this.af, this.bU, this.ax, this.aj);
        final afie k = ((afhg)this.aQ).k();
        while (((Iterator)k).hasNext()) {
            ((auh)((br)this).X).b((aul)((Iterator)k).next());
        }
        if (bundle != null) {
            this.bi = bundle.getBundle(hoa.a);
            this.bj = bundle.getString(hoa.b);
            this.bk = bundle.getLong("PagePositionKey", Long.MIN_VALUE);
        }
        this.ce.A((Callable)new guf(this, 14));
        if (this.bt()) {
            this.ce.A((Callable)new guf(this, 15));
            this.aX.ifPresent((Consumer)new hnr(this, 4));
            this.ce.A((Callable)new guf(this, 16));
        }
        if (this.bs()) {
            this.ce.A((Callable)new guf(this, 17));
        }
    }
    
    public final void p(final int n) {
        final Object bg = this.bG;
        monitorenter(bg);
        boolean cx;
        if (n == 0) {
            cx = true;
        }
        else {
            cx = false;
        }
        try {
            this.cx = cx;
            this.bb();
        }
        finally {
            monitorexit(bg);
        }
    }
    
    public final void pK(final Bundle bundle) {
        final boolean bt = this.bT();
        final anqt anqt = null;
        PlaybackServiceState n;
        if (bt) {
            n = this.ar.n(true);
        }
        else {
            n = null;
        }
        if (n != null) {
            final PlaybackStartDescriptor a = n.a;
            if (a != null) {
                if (this.ct != null && iba.G(a)) {
                    final abhx d = PlaybackStartDescriptor.d();
                    d.a = this.ct;
                    bundle.putParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor", (Parcelable)d.a());
                }
                else if (this.bR.l(45368083L).aG()) {
                    final abtt q = this.ar.q();
                    long c;
                    if (q != null) {
                        c = q.c();
                    }
                    else {
                        c = 0L;
                    }
                    final abhx e = n.a.e();
                    e.l = c;
                    bundle.putParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor", (Parcelable)e.a());
                }
                else {
                    bundle.putParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor", (Parcelable)n.a);
                }
            }
        }
        ReelToReelList list = null;
        Label_0303: {
            if (this.d.q()) {
                final arud bu = this.bU;
                anqt anqt2;
                if (bu == null) {
                    anqt2 = anqt;
                }
                else {
                    anqh anqh;
                    if ((anqh = bu.f().u) == null) {
                        anqh = anqh.a;
                    }
                    if ((anqt2 = anqh.d) == null) {
                        anqt2 = anqt.a;
                    }
                }
                if (anqt2 != null && anqt2.v) {
                    list = new ReelToReelList((List)afcr.q(), (List)afcr.q());
                    break Label_0303;
                }
            }
            list = new ReelToReelList(this.d.g(), this.d.h());
        }
        bundle.putParcelable("ReelToReelListBundleKey", (Parcelable)list);
        final String a2 = hoa.a;
        final hnb b = this.d.b;
        final Bundle bundle2 = new Bundle();
        bundle2.putBoolean("ReelSequenceController.IS_INITIALIZED_KEY", b.i);
        bundle2.putParcelable("ReelSequenceController.PENDING_PREV_CONTINUATION_KEY", (Parcelable)b.e);
        bundle2.putParcelable("ReelSequenceController.PENDING_NEXT_CONTINUATION_KEY", (Parcelable)b.f);
        bundle2.putBoolean("ReelSequenceController.END_OF_SEQUENCE_KEY", b.h);
        bundle.putBundle(a2, bundle2);
        bundle.putBoolean("UseRpcSequenceKey", this.d.q());
        bundle.putString(hoa.b, this.aD.n().i());
        final Optional e2 = this.d.e();
        if (e2.isPresent() && ((hml)e2.get()).e() && (boolean)this.bR.cs().aG()) {
            bundle.putLong("PagePositionKey", ((hml)e2.get()).a);
        }
    }
    
    public final void r(final hnh bl) {
        this.bL = bl;
    }
    
    public final void s(final byte[] cy) {
        this.cy = cy;
    }
    
    public final hlx t() {
        return this.al;
    }
    
    public final ReelPlayerView u() {
        return this.bh;
    }
    
    public final anqf v() {
        return (anqf)this.d.e().map((Function)hns.e).map((Function)hns.f).orElse((Object)anqf.a);
    }
    
    public final ashe w() {
        return (ashe)this.bA;
    }
    
    public final ashe x() {
        return ashe.Y((ashh)((ashe)this.cs).W((asjc)new gkj(14)), (ashh)((ashe)this.bz).W((asjc)new gkj(15)));
    }
    
    public final void y() {
        final hmk d = this.d;
        if (d != null) {
            final trg k = d.K;
            if (k != null) {
                final Object b = k.b;
                if (b != null && k.c != null) {
                    ((hqo)b).e().ifPresent((Consumer)gyc.f);
                }
            }
        }
        final hnz bm = this.bm;
        if (bm != null) {
            bm.b = false;
        }
        final hqk am = this.aM();
        if (am != null) {
            am.x();
        }
    }
    
    public final void z() {
        final wwv ap = this.aP();
        if (this.bM.isPresent()) {
            final abxj abxj = (abxj)this.bM.get();
            final PlaybackStartDescriptor g = abxj.g();
            if (g == null) {
                return;
            }
            final aioe b = g.b;
            if (b != null) {
                if (((agzd)b).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                    this.bv.b(ap);
                    final aioe a = this.bv.a(b);
                    this.bv.c(ap, a, (String)null, this.bw, true);
                    this.af.d(Optional.of((Object)this.d), a, this.bw, g.f);
                    this.bD = Optional.of((Object)a);
                    this.bt = false;
                    this.ba(abxj.c());
                    this.bM = Optional.empty();
                }
            }
        }
        else {
            if (!this.bD.isPresent()) {
                return;
            }
            final String i = ap.i();
            final aioe aioe = (aioe)this.bD.get();
            final agza u = iba.U(aioe);
            if (i != null) {
                u.copyOnWrite();
                final amob amob = (amob)u.instance;
                final amob a2 = amob.a;
                amob.b |= 0x1;
                amob.c = i;
            }
            final String bw = this.bw;
            if (bw != null) {
                u.copyOnWrite();
                final amob amob2 = (amob)u.instance;
                final amob a3 = amob.a;
                amob2.b |= 0x20;
                amob2.f = bw;
            }
            final agzc agzc = (agzc)((agzi)aioe).toBuilder();
            agzc.e((agyr)amoa.b, (Object)u.build());
            this.bv.c(ap, (aioe)((agza)agzc).build(), (String)null, this.bw, true);
            if (this.bs != Long.MIN_VALUE && this.bf.isPresent()) {
                this.bj(this.bs, (akok)this.bf.get(), true);
            }
            if (this.bN.isPresent()) {
                this.aZ((hom)this.bN.get());
            }
        }
    }
}
