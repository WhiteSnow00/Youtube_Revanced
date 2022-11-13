import android.view.MenuItem;
import android.content.res.Configuration;
import android.content.Intent;
import android.view.View$OnClickListener;
import android.view.View$OnTouchListener;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.search.OnlineSearchController;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import android.provider.SearchRecentSuggestions;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import android.widget.TextView;
import java.util.concurrent.Executor;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jim extends jir implements acxp, jhv
{
    public arkg a;
    public jik aA;
    View aB;
    public View aC;
    jhx aD;
    acrm aE;
    tqb aF;
    public vai aG;
    public vai aH;
    public lkm aI;
    public arwh aJ;
    public mam aK;
    public php aL;
    public skt aM;
    public arfe aN;
    public blu aO;
    public blu aP;
    public ziy aQ;
    private String aR;
    private String aS;
    private String aT;
    private boolean aU;
    private boolean aV;
    private int aW;
    private int aX;
    private boolean aY;
    private final acxt aZ;
    public fzm ae;
    public iaw af;
    public jht ag;
    public xao ah;
    public zmf ai;
    public fxh aj;
    public jxy ak;
    public Executor al;
    public tov am;
    public gec an;
    public String ao;
    public int ap;
    public TextView aq;
    public jna ar;
    public jij as;
    public arkg b;
    private String ba;
    private LoadingFrameLayout bb;
    private RecyclerView bc;
    private boolean bd;
    private qcy be;
    private pvh bf;
    public SearchRecentSuggestions c;
    public tgd d;
    public atke e;
    
    public jim() {
        this.bf = null;
        this.ap = -1;
        this.aZ = new acxt();
    }
    
    private final gdx aM() {
        final ahaz builder = ((ahbh)aixz.a).createBuilder();
        final ahbb ahbb = (ahbb)((ahbh)akdi.a).createBuilder();
        final akdh as = akdh.aS;
        ((ahaz)ahbb).copyOnWrite();
        final akdi akdi = (akdi)ahbb.instance;
        akdi.c = as.sy;
        akdi.b |= 0x1;
        builder.copyOnWrite();
        final aixz aixz = (aixz)builder.instance;
        final akdi e = (akdi)((ahaz)ahbb).build();
        e.getClass();
        aixz.e = e;
        aixz.b |= 0x1;
        final ahaz builder2 = ahik.a.createBuilder();
        final String p = ((br)this).P(2132017444);
        builder2.copyOnWrite();
        final ahik ahik = (ahik)builder2.instance;
        p.getClass();
        ahik.b |= 0x2;
        ahik.c = p;
        builder.copyOnWrite();
        final aixz aixz2 = (aixz)builder.instance;
        final ahik f = (ahik)builder2.build();
        f.getClass();
        aixz2.f = f;
        aixz2.b |= 0x8;
        return new gdx((aixz)builder.build());
    }
    
    private final tqb aN() {
        if (this.aF == null) {
            final bu od = ((br)this).od();
            if (od != null && od instanceof faq) {
                this.aF = ((faq)od).d();
            }
        }
        return this.aF;
    }
    
    private final void aO() {
        this.aD.f(this.ao, this.aZ);
        if (this.bu()) {
            final bu od = ((br)this).od();
            if (od != null) {
                od.setRequestedOrientation(1);
            }
        }
    }
    
    private final boolean aP() {
        return this.aD.h();
    }
    
    private final boolean br() {
        return !((String)this.aG.ce().j().af()).isEmpty();
    }
    
    private final boolean bs() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asjv.b((AtomicReference)this.aG.l(45362319L).aC(false).aa((asjm)new jdq(atomicBoolean, 9)));
        return atomicBoolean.get() && this.aU && !this.ba.isEmpty();
    }
    
    private final boolean bt() {
        return "behavior_based".equals(this.aG.ce().j().af()) || "behavior_based_with_suggest".equals(this.aG.ce().j().af());
    }
    
    private final boolean bu() {
        if (!this.aG.f(45367444L)) {
            return false;
        }
        final boolean b = this.s() || this.aZ.a;
        final boolean b2 = this.aP() || this.aZ.b;
        return b && b2;
    }
    
    public static void p(final Throwable t) {
        ttr.d("Error occurred getting HistoryPausedState", t);
    }
    
    public final View K(LayoutInflater from, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = from.inflate(2131625325, viewGroup, false);
        this.aB = inflate;
        (this.bb = (LoadingFrameLayout)inflate.findViewById(2131429675)).f((acxp)this);
        this.bc = (RecyclerView)this.bb.findViewById(2131431186);
        this.bf = new pvh(this);
        this.aY = false;
        final Bundle m = ((br)this).m;
        Bundle bundle2;
        if (bundle == null) {
            bundle2 = m;
        }
        else {
            bundle2 = bundle;
        }
        if (bundle2 != m && m != null && m.containsKey("navigation_endpoint_interaction_logging_extension")) {
            bundle2.putByteArray("navigation_endpoint_interaction_logging_extension", m.getByteArray("navigation_endpoint_interaction_logging_extension"));
        }
        if (m != null && m.containsKey("search_cache_key")) {
            this.aR = m.getString("search_cache_key");
        }
        this.as = new jij(this);
        this.aA = new jik(this, (Context)this.at, this.aN, (byte[])null, (byte[])null);
        if (this.aD == null) {
            if (this.aM.a) {
                final lkm ai = this.aI;
                final RecyclerView bc = this.bc;
                final LoadingFrameLayout bb = this.bb;
                final bu od = ((br)this).od();
                final wyw pf = ((ggq)this).pF();
                final acrm ae = this.aE;
                final Object j = ai.j;
                final abnl abnl = (abnl)((atke)ai.h).a();
                final aeea aeea = (aeea)((atke)ai.i).a();
                aeea.getClass();
                final Object d = ai.d;
                final aeea aeea2 = (aeea)((atke)ai.g).a();
                final Executor executor = (Executor)ai.a.a();
                executor.getClass();
                final tqd tqd = (tqd)((atke)ai.e).a();
                tqd.getClass();
                final vaf vaf = (vaf)((atke)ai.l).a();
                vaf.getClass();
                final arwh arwh = (arwh)((atke)ai.c).a();
                arwh.getClass();
                final Object b = ai.b;
                final kle kle = (kle)((atke)ai.f).a();
                final ilf ilf = (ilf)((atke)ai.k).a();
                bc.getClass();
                bb.getClass();
                od.getClass();
                pf.getClass();
                this.aD = new jhn((atke)j, abnl, aeea, (atke)d, aeea2, executor, tqd, vaf, arwh, (atke)b, kle, ilf, bc, bb, (Activity)od, pf, bundle2, ae, null, null, null, null, null, null, null);
            }
            else {
                final jht ag = this.ag;
                final RecyclerView bc2 = this.bc;
                final LoadingFrameLayout bb2 = this.bb;
                final bu od2 = ((br)this).od();
                final wyw pf2 = ((ggq)this).pF();
                final jij as = this.as;
                final jik aa = this.aA;
                final pvh bf = this.bf;
                final acrm ae2 = this.aE;
                ag.a.a().getClass();
                final atke b2 = ag.b;
                final atke c = ag.c;
                final kav kav = (kav)ag.d.a();
                final lff lff = (lff)ag.e.a();
                final e e = (e)ag.f.a();
                final lkx lkx = (lkx)ag.g.a();
                ag.h.a().getClass();
                final vvf vvf = (vvf)ag.i.a();
                vvf.getClass();
                final gbo gbo = (gbo)ag.j.a();
                final MealbarPromoController mealbarPromoController = (MealbarPromoController)ag.k.a();
                final acwn acwn = (acwn)ag.l.a();
                final acyi acyi = (acyi)ag.m.a();
                acyi.getClass();
                final acyl acyl = (acyl)ag.n.a();
                acyl.getClass();
                final tgd tgd = (tgd)ag.o.a();
                tgd.getClass();
                final tqd tqd2 = (tqd)ag.p.a();
                tqd2.getClass();
                final fzm fzm = (fzm)ag.q.a();
                final blu blu = (blu)ag.r.a();
                blu.getClass();
                final vaf vaf2 = (vaf)ag.s.a();
                vaf2.getClass();
                final arwh arwh2 = (arwh)ag.t.a();
                arwh2.getClass();
                final arkg b3 = ((arlw)ag.u).b();
                b3.getClass();
                final acgs acgs = (acgs)ag.v.a();
                acgs.getClass();
                final aeea aeea3 = (aeea)ag.w.a();
                aeea3.getClass();
                final xao xao = (xao)ag.x.a();
                xao.getClass();
                final jln jln = (jln)ag.y.a();
                jln.getClass();
                final oug oug = (oug)ag.z.a();
                oug.getClass();
                final vcy vcy = (vcy)ag.A.a();
                vcy.getClass();
                final adia adia = (adia)ag.B.a();
                adia.getClass();
                final qcy qcy = (qcy)ag.C.a();
                final aeea aeea4 = (aeea)ag.D.a();
                final atke e2 = ag.E;
                final uve uve = (uve)ag.F.a();
                final vai vai = (vai)ag.G.a();
                final vai vai2 = (vai)ag.H.a();
                vai2.getClass();
                final cya cya = (cya)ag.I.a();
                cya.getClass();
                bc2.getClass();
                bb2.getClass();
                od2.getClass();
                pf2.getClass();
                final aujg aujg = (aujg)ag.J.a();
                final acof acof = (acof)ag.K.a();
                final tnu tnu = (tnu)ag.L.a();
                tnu.getClass();
                final vai vai3 = (vai)ag.M.a();
                vai3.getClass();
                final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e e3 = (com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e)ag.N.a();
                e3.getClass();
                final OnlineSearchController ad = new OnlineSearchController(c, kav, lff, e, lkx, vvf, gbo, mealbarPromoController, acwn, acyi, acyl, tgd, tqd2, fzm, blu, vaf2, arwh2, b3, acgs, aeea3, xao, jln, oug, vcy, adia, qcy, aeea4, e2, uve, vai, vai2, cya, bc2, bb2, (Activity)od2, pf2, as, aa, bf, bundle2, ae2, aujg, acof, tnu, vai3, e3, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                this.aD = (jhx)ad;
                ((aui)((br)this).X).b((aum)ad);
            }
        }
        if (this.ao == null && bundle2 != null) {
            final String string = bundle2.getString("search_query");
            final boolean boolean1 = bundle2.getBoolean("search_filter_chip_clicked");
            final String trim = aezr.e(string).trim();
            this.ao = trim;
            this.aU = boolean1;
            if (!TextUtils.isEmpty((CharSequence)trim)) {
                if (this.aq != null) {
                    if (this.bs()) {
                        this.aq.setText((CharSequence)this.ba);
                    }
                    else {
                        this.aq.setText((CharSequence)this.ao);
                    }
                }
                final fzm ae3 = this.ae;
                if (ae3 != null) {
                    ae3.e(this.ao);
                }
                if (this.aO.r() && !this.ai.c().g()) {
                    final abll abll = (abll)this.e.a();
                    final vrb e4 = abll.e();
                    ((vkk)e4).i();
                    teu.k(abll.f(e4), this.al, (tes)jdb.d, (tet)new hgd(this, 17));
                }
                if (((br)this).aw()) {
                    this.aO();
                }
                else {
                    this.bd = true;
                }
            }
            this.aV = bundle2.getBoolean("search_filter_chip_applied");
            this.aW = bundle2.getInt("search_filter_chip_count");
            this.aX = bundle2.getInt("search_chip_bar_selected_position");
            this.ba = bundle2.getString("search_original_chip_query");
            this.aZ.a = bundle2.getBoolean("is_shorts_context");
            this.aZ.b = bundle2.getBoolean("is_shorts_chip_selected");
        }
        this.aY = bundle2.getBoolean("from_voice_search");
        final aiqj au = ((ggq)this).aU();
        if (au != null && ((ahbc)au).ry((ahaq)SearchEndpointOuterClass.searchEndpoint)) {
            final anxf anxf = (anxf)((ahbc)au).rx((ahaq)SearchEndpointOuterClass.searchEndpoint);
            this.aS = anxf.d;
            this.aT = anxf.f;
        }
        this.be = this.aP.z(this.aS, this.aT);
        final boolean b4 = this.s() || this.aZ.a;
        final boolean b5 = this.aP() || this.aZ.b;
        final acxs a = acxt.a();
        a.c(b4);
        a.b(b5);
        this.ar = this.aL.y((br)this, this.be, this.aS, ((ggq)this).pF(), a.a());
        from = LayoutInflater.from(this.at.getSupportActionBar().b());
        final View a2 = this.ak.a(from);
        this.aC = a2;
        this.aq = (TextView)a2.findViewById(2131431305);
        if (this.bs()) {
            this.aq.setText((CharSequence)this.ba);
        }
        else {
            this.aq.setText((CharSequence)this.ao);
        }
        if (fbu.av(this.az)) {
            this.aq.setOnTouchListener((View$OnTouchListener)new gcf(this, 8));
            this.aq.setOnClickListener((View$OnClickListener)new jgx(this, 7));
        }
        else {
            this.aq.setOnClickListener((View$OnClickListener)new jgx(this, 8));
        }
        a2.findViewById(2131431289).setOnClickListener((View$OnClickListener)new jgx(this, 9));
        final View viewById = a2.findViewById(2131432394);
        if (viewById != null && this.ar.e()) {
            viewById.setOnClickListener((View$OnClickListener)new jgx(this, 10));
        }
        if ("serp".equals(this.aG.ce().j().af())) {
            this.an.g((gdz)this.aM(), ((ggq)this).pF());
            ((ggq)this).pF().l((wzz)new wyt(xaa.c(158544)));
        }
        return this.aB;
    }
    
    public final void U(int n, final int n2, final Intent intent) {
        final int n3 = 1000;
        int n4 = n;
        if (n == 1000) {
            if (n2 == -1) {
                this.aY = true;
                this.ar.b(intent);
                if (this.bt()) {
                    this.an.g((gdz)this.aM(), ((ggq)this).pF());
                }
                return;
            }
            n4 = 1000;
        }
        if (n4 == 1000) {
            n = n3;
            if (n2 == 1) {
                n = n3;
                if (fbu.aP(this.aJ)) {
                    this.aY = true;
                    if (this.bt()) {
                        this.an.g((gdz)this.aM(), ((ggq)this).pF());
                    }
                    this.aD.c(intent.getStringExtra("AssistantCsn"), ((ggq)this).pF().i());
                    n = n3;
                }
            }
        }
        else {
            n = n4;
        }
        this.ah.i(almx.K, "");
        super.U(n, n2, intent);
    }
    
    public final void Y() {
        super.Y();
        this.d.d((Object)new fie());
        this.am.d(false);
    }
    
    public final void Z(final int n, final String[] array, final int[] array2) {
        this.ar.a(n, array, array2);
    }
    
    public final aiqj aU() {
        final aiqj i = this.aD.I;
        if (i != null) {
            return i;
        }
        return aiqj.a;
    }
    
    public final void aa() {
        super.aa();
        this.al.execute((Runnable)new jfu(this, 6));
        if (this.br() && !"suggest".equals(this.aG.ce().j().af())) {
            this.an.h();
        }
        if (this.bt() && !this.aY) {
            this.an.c(false);
        }
    }
    
    public final Object bc() {
        final jil jil = new jil();
        jil.a = null;
        final jhx ad = this.aD;
        if (ad != null) {
            jil.b = ad.qA();
        }
        return jil;
    }
    
    public final String bd() {
        return this.aD.O;
    }
    
    public final void bi(Object a) {
        if (!(a instanceof jil)) {
            return;
        }
        final jil jil = (jil)a;
        a = jil.a;
        this.aE = jil.b;
    }
    
    public final void c() {
        this.aO();
    }
    
    public final gae mG() {
        if (this.au == null) {
            final gad b = this.aw.b();
            final jhx ad = this.aD;
            if (ad instanceof OnlineSearchController && ((OnlineSearchController)ad).s != null) {
                final boolean au = this.aU;
                boolean b2 = false;
                if (au) {
                    b2 = b2;
                    if (this.aV) {
                        b2 = true;
                    }
                }
                final RecyclerView bc = this.bc;
                if (bc == null) {
                    throw new NullPointerException("Null resultsRecyclerView");
                }
                b.c = new fzz(b2, bc);
            }
            b.n((aezf)new igr(this, 13));
            this.au = b.a();
        }
        return this.au;
    }
    
    public final void nm() {
        super.nm();
        this.aD.a();
    }
    
    public final void no() {
        super.no();
        this.aj.c();
        this.ae.e(this.ao);
        if (this.bd) {
            this.aO();
        }
        this.bd = false;
        this.aD.P = (jhv)this;
        if (((br)this).ar()) {
            ((br)this).G().O(jhy.ae, (aun)this, (cp)new jii(this));
        }
    }
    
    public final void np() {
        super.np();
        if (this.bu()) {
            final bu od = ((br)this).od();
            if (od != null) {
                od.setRequestedOrientation(-1);
            }
        }
        this.aD.P = null;
        this.ae.e("");
        if (this.br()) {
            this.an.c(false);
        }
    }
    
    public final acxt o() {
        final acxs a = acxt.a();
        a.c(this.s());
        a.b(this.aP());
        return a.a();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.aD.d(configuration);
        this.al.execute((Runnable)new jfu(this, 6));
    }
    
    public final void pP(final Bundle bundle) {
        bundle.putString("search_cache_key", this.aR);
        bundle.putString("search_query", this.ao);
        bundle.putBoolean("search_filter_chip_applied", this.aV);
        bundle.putBoolean("search_filter_chip_clicked", this.aU);
        bundle.putInt("search_filter_chip_count", this.aW);
        bundle.putString("search_original_chip_query", this.ba);
        bundle.putInt("search_chip_bar_selected_position", this.aX);
        bundle.putBoolean("from_voice_search", this.aY);
        final jhx ad = this.aD;
        if (ad != null) {
            ad.m(bundle);
        }
    }
    
    public final void q() {
        final jhx ad = this.aD;
        if (ad.K != null) {
            final jij as = this.as;
            if (as != null && as.a != null) {
                if (((br)this).ar()) {
                    if (!ad.r().isEmpty()) {
                        final jij as2 = this.as;
                        final MenuItem a = as2.a;
                        as2.a(this.aN(), ((br)this).nZ().getColor(2131102396));
                        return;
                    }
                    final jij as3 = this.as;
                    final MenuItem a2 = as3.a;
                    final tqb an = this.aN();
                    final Context nt = ((br)this).nT();
                    nt.getClass();
                    as3.a(an, ezt.t(2130970924).mt(nt));
                }
            }
        }
    }
    
    public final void r() {
        final aohl k = this.aD.K;
        if (k != null && k.b.size() > 0 && ((br)this).ar()) {
            jhy.aM(((br)this).G(), this.aD.K, this.aQ, this.aH);
        }
    }
    
    public final boolean s() {
        final akyz j = this.aD.J;
        return j != null && (j.b & 0x200000) != 0x0 && j.o;
    }
}
