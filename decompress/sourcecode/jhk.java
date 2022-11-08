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

public final class jhk extends jhp implements acvn, jgt
{
    public arhr a;
    public jhi aA;
    View aB;
    public View aC;
    jgv aD;
    acpi aE;
    tnw aF;
    public uyi aG;
    public uyi aH;
    public arud aI;
    public zhb aJ;
    public ljk aK;
    public pgf aL;
    public sin aM;
    public arcq aN;
    public hdv aO;
    public blt aP;
    public blt aQ;
    private String aR;
    private String aS;
    private String aT;
    private boolean aU;
    private boolean aV;
    private int aW;
    private int aX;
    private boolean aY;
    private final acvr aZ;
    public fze ae;
    public hzz af;
    public jgr ag;
    public wyo ah;
    public zki ai;
    public fwz aj;
    public jww ak;
    public Executor al;
    public tmp am;
    public gdu an;
    public String ao;
    public int ap;
    public TextView aq;
    public jlx ar;
    public jhh as;
    public arhr b;
    private String ba;
    private LoadingFrameLayout bb;
    private RecyclerView bc;
    private boolean bd;
    private qbo be;
    private qpt bf;
    public SearchRecentSuggestions c;
    public tdz d;
    public atjj e;
    
    public jhk() {
        this.bf = null;
        this.ap = -1;
        this.aZ = new acvr();
    }
    
    private final gdp aM() {
        final agza builder = aivu.a.createBuilder();
        final agzc agzc = (agzc)((agzi)akbf.a).createBuilder();
        final akbe as = akbe.aS;
        ((agza)agzc).copyOnWrite();
        final akbf akbf = (akbf)agzc.instance;
        akbf.c = as.sv;
        akbf.b |= 0x1;
        builder.copyOnWrite();
        final aivu aivu = (aivu)builder.instance;
        final akbf e = (akbf)((agza)agzc).build();
        e.getClass();
        aivu.e = e;
        aivu.b |= 0x1;
        final agza builder2 = ahgm.a.createBuilder();
        final String p = ((br)this).P(2132017444);
        builder2.copyOnWrite();
        final ahgm ahgm = (ahgm)builder2.instance;
        p.getClass();
        ahgm.b |= 0x2;
        ahgm.c = p;
        builder.copyOnWrite();
        final aivu aivu2 = (aivu)builder.instance;
        final ahgm f = (ahgm)builder2.build();
        f.getClass();
        aivu2.f = f;
        aivu2.b |= 0x8;
        return new gdp((aivu)builder.build());
    }
    
    private final tnw aN() {
        if (this.aF == null) {
            final bu od = ((br)this).od();
            if (od != null && od instanceof fam) {
                this.aF = ((fam)od).d();
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
        return !((String)this.aG.cd().j().af()).isEmpty();
    }
    
    private final boolean bs() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asjg.b((AtomicReference)this.aG.l(45362319L).aw((Object)false).Z((asix)new jcp(atomicBoolean, 7)));
        return atomicBoolean.get() && this.aU && !this.ba.isEmpty();
    }
    
    private final boolean bt() {
        return "behavior_based".equals(this.aG.cd().j().af()) || "behavior_based_with_suggest".equals(this.aG.cd().j().af());
    }
    
    private final boolean bu() {
        if (!this.aG.f(45367444L)) {
            return false;
        }
        final boolean b = this.s() || this.aZ.a;
        final boolean b2 = this.aP() || this.aZ.b;
        return b && b2;
    }
    
    public final View K(LayoutInflater from, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = from.inflate(2131625320, viewGroup, false);
        this.aB = inflate;
        (this.bb = (LoadingFrameLayout)inflate.findViewById(2131429675)).f((acvn)this);
        this.bc = (RecyclerView)this.bb.findViewById(2131431183);
        this.bf = new qpt(this);
        this.aY = false;
        final Bundle m = ((br)this).m;
        Bundle bundle2;
        if (bundle != null) {
            bundle2 = bundle;
        }
        else {
            bundle2 = m;
        }
        if (bundle2 != m && m != null && m.containsKey("navigation_endpoint_interaction_logging_extension")) {
            bundle2.putByteArray("navigation_endpoint_interaction_logging_extension", m.getByteArray("navigation_endpoint_interaction_logging_extension"));
        }
        if (m != null && m.containsKey("search_cache_key")) {
            this.aR = m.getString("search_cache_key");
        }
        this.as = new jhh(this);
        this.aA = new jhi(this, (Context)this.at, this.aN, (byte[])null, (byte[])null);
        if (this.aD == null) {
            if (this.aM.a) {
                final ljk ak = this.aK;
                final RecyclerView bc = this.bc;
                final LoadingFrameLayout bb = this.bb;
                final bu od = ((br)this).od();
                final wwv n = ((ggh)this).n();
                final acpi ae = this.aE;
                final Object j = ak.j;
                final abll abll = (abll)((atjj)ak.h).a();
                final adcr adcr = (adcr)((atjj)ak.i).a();
                adcr.getClass();
                final Object d = ak.d;
                final aeby aeby = (aeby)((atjj)ak.g).a();
                final Executor executor = (Executor)ak.a.a();
                executor.getClass();
                final tny tny = (tny)((atjj)ak.l).a();
                tny.getClass();
                final uyf uyf = (uyf)((atjj)ak.e).a();
                uyf.getClass();
                final arud arud = (arud)((atjj)ak.c).a();
                arud.getClass();
                final Object b = ak.b;
                final kkd kkd = (kkd)((atjj)ak.f).a();
                final ikh ikh = (ikh)((atjj)ak.k).a();
                bc.getClass();
                bb.getClass();
                od.getClass();
                n.getClass();
                this.aD = (jgv)new jgl((atjj)j, abll, adcr, (atjj)d, aeby, executor, tny, uyf, arud, (atjj)b, kkd, ikh, bc, bb, (Activity)od, n, bundle2, ae, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            else {
                final jgr ag = this.ag;
                final RecyclerView bc2 = this.bc;
                final LoadingFrameLayout bb2 = this.bb;
                final bu od2 = ((br)this).od();
                final wwv n2 = ((ggh)this).n();
                final jhh as = this.as;
                final jhi aa = this.aA;
                final qpt bf = this.bf;
                final acpi ae2 = this.aE;
                ag.a.a().getClass();
                final atjj b2 = ag.b;
                final atjj c = ag.c;
                final jzu jzu = (jzu)ag.d.a();
                final kzl kzl = (kzl)ag.e.a();
                final e e = (e)ag.f.a();
                final lht lht = (lht)ag.g.a();
                ag.h.a().getClass();
                final vte vte = (vte)ag.i.a();
                vte.getClass();
                final gbg gbg = (gbg)ag.j.a();
                final MealbarPromoController mealbarPromoController = (MealbarPromoController)ag.k.a();
                final acuj acuj = (acuj)ag.l.a();
                final acwg acwg = (acwg)ag.m.a();
                acwg.getClass();
                final acwj acwj = (acwj)ag.n.a();
                acwj.getClass();
                final tdz tdz = (tdz)ag.o.a();
                tdz.getClass();
                final tny tny2 = (tny)ag.p.a();
                tny2.getClass();
                final fze fze = (fze)ag.q.a();
                final blt blt = (blt)ag.r.a();
                blt.getClass();
                final uyf uyf2 = (uyf)ag.s.a();
                uyf2.getClass();
                final arud arud2 = (arud)ag.t.a();
                arud2.getClass();
                final arhr b3 = ((arjh)ag.u).b();
                b3.getClass();
                final aceo aceo = (aceo)ag.v.a();
                aceo.getClass();
                final adcr adcr2 = (adcr)ag.w.a();
                adcr2.getClass();
                final wyo wyo = (wyo)ag.x.a();
                wyo.getClass();
                final jkl jkl = (jkl)ag.y.a();
                jkl.getClass();
                final osx osx = (osx)ag.z.a();
                osx.getClass();
                final vax vax = (vax)ag.A.a();
                vax.getClass();
                final adfy adfy = (adfy)ag.B.a();
                adfy.getClass();
                final qbo qbo = (qbo)ag.C.a();
                final aeby aeby2 = (aeby)ag.D.a();
                final atjj e2 = ag.E;
                final utk utk = (utk)ag.F.a();
                final uyi uyi = (uyi)ag.G.a();
                final uyi uyi2 = (uyi)ag.H.a();
                uyi2.getClass();
                final cxz cxz = (cxz)ag.I.a();
                cxz.getClass();
                bc2.getClass();
                bb2.getClass();
                od2.getClass();
                n2.getClass();
                final auip auip = (auip)ag.J.a();
                final acmc acmc = (acmc)ag.K.a();
                final tlq tlq = (tlq)ag.L.a();
                tlq.getClass();
                final arhr b4 = ((arjh)ag.M).b();
                b4.getClass();
                final uyi uyi3 = (uyi)ag.N.a();
                uyi3.getClass();
                final uyi uyi4 = (uyi)ag.O.a();
                uyi4.getClass();
                final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e e3 = (com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e)ag.P.a();
                e3.getClass();
                final OnlineSearchController ad = new OnlineSearchController(c, jzu, kzl, e, lht, vte, gbg, mealbarPromoController, acuj, acwg, acwj, tdz, tny2, fze, blt, uyf2, arud2, b3, aceo, adcr2, wyo, jkl, osx, vax, adfy, qbo, aeby2, e2, utk, uyi, uyi2, cxz, bc2, bb2, (Activity)od2, n2, as, aa, bf, bundle2, ae2, auip, acmc, tlq, b4, uyi3, uyi4, e3, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                this.aD = (jgv)ad;
                ((auh)((br)this).X).b((aul)ad);
            }
        }
        if (this.ao == null) {
            final Bundle bundle3 = bundle2;
            if (bundle3 != null) {
                final String string = bundle3.getString("search_query");
                final boolean boolean1 = bundle3.getBoolean("search_filter_chip_clicked");
                final String trim = aexs.e(string).trim();
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
                    final fze ae3 = this.ae;
                    if (ae3 != null) {
                        ae3.e(this.ao);
                    }
                    if (this.aP.r() && !this.ai.c().g()) {
                        final abjm abjm = (abjm)this.e.a();
                        final voz e4 = abjm.e();
                        ((vii)e4).i();
                        tcp.k(abjm.f(e4), this.al, (tcn)jbz.d, (tco)new hfi(this, 17));
                    }
                    if (((br)this).aw()) {
                        this.aO();
                    }
                    else {
                        this.bd = true;
                    }
                }
                this.aV = bundle3.getBoolean("search_filter_chip_applied");
                this.aW = bundle3.getInt("search_filter_chip_count");
                this.aX = bundle3.getInt("search_chip_bar_selected_position");
                this.ba = bundle3.getString("search_original_chip_query");
                this.aZ.a = bundle3.getBoolean("is_shorts_context");
                this.aZ.b = bundle3.getBoolean("is_shorts_chip_selected");
            }
        }
        this.aY = bundle2.getBoolean("from_voice_search");
        final aioe au = ((ggh)this).aU();
        if (au != null && ((agzd)au).rs((agyr)SearchEndpointOuterClass.searchEndpoint)) {
            final anvb anvb = (anvb)((agzd)au).rr((agyr)SearchEndpointOuterClass.searchEndpoint);
            this.aS = anvb.d;
            this.aT = anvb.f;
        }
        this.be = this.aQ.z(this.aS, this.aT);
        final boolean b5 = this.s() || this.aZ.a;
        final boolean b6 = this.aP() || this.aZ.b;
        final acvq a = acvr.a();
        a.c(b5);
        a.b(b6);
        this.ar = this.aL.y((br)this, this.be, this.aS, ((ggh)this).n(), a.a());
        from = LayoutInflater.from(this.at.getSupportActionBar().b());
        final View a2 = this.ak.a(from);
        this.aC = a2;
        this.aq = (TextView)a2.findViewById(2131431302);
        if (this.bs()) {
            this.aq.setText((CharSequence)this.ba);
        }
        else {
            this.aq.setText((CharSequence)this.ao);
        }
        if (gkt.T(this.az)) {
            this.aq.setOnTouchListener((View$OnTouchListener)new gby(this, 8));
            this.aq.setOnClickListener((View$OnClickListener)new jfv(this, 7));
        }
        else {
            this.aq.setOnClickListener((View$OnClickListener)new jfv(this, 8));
        }
        a2.findViewById(2131431286).setOnClickListener((View$OnClickListener)new jfv(this, 9));
        final View viewById = a2.findViewById(2131432391);
        if (viewById != null && this.ar.e()) {
            viewById.setOnClickListener((View$OnClickListener)new jfv(this, 10));
        }
        if ("serp".equals(this.aG.cd().j().af())) {
            this.an.g((gdr)this.aM(), ((ggh)this).n());
            ((ggh)this).n().l((wxz)new wws(wya.c(158544)));
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
                    this.an.g((gdr)this.aM(), ((ggh)this).n());
                }
                return;
            }
            n4 = 1000;
        }
        if (n4 == 1000) {
            n = n3;
            if (n2 == 1) {
                n = n3;
                if (gkt.ax(this.aI)) {
                    this.aY = true;
                    if (this.bt()) {
                        this.an.g((gdr)this.aM(), ((ggh)this).n());
                    }
                    this.aD.c(intent.getStringExtra("AssistantCsn"), ((ggh)this).n().i());
                    n = n3;
                }
            }
        }
        else {
            n = n4;
        }
        this.ah.i(alku.K, "");
        super.U(n, n2, intent);
    }
    
    public final void Y() {
        super.Y();
        this.d.d((Object)new fhx());
        this.am.b(false);
    }
    
    public final void Z(final int n, final String[] array, final int[] array2) {
        this.ar.a(n, array, array2);
    }
    
    public final aioe aU() {
        final aioe i = this.aD.I;
        if (i != null) {
            return i;
        }
        return aioe.a;
    }
    
    public final void aa() {
        super.aa();
        this.al.execute((Runnable)new jcd(this, 8));
        if (this.br() && !"suggest".equals(this.aG.cd().j().af())) {
            this.an.h();
        }
        if (this.bt() && !this.aY) {
            this.an.c(false);
        }
    }
    
    public final Object bc() {
        final jhj jhj = new jhj();
        jhj.a = null;
        final jgv ad = this.aD;
        if (ad != null) {
            jhj.b = ad.qv();
        }
        return jhj;
    }
    
    public final String bd() {
        return this.aD.O;
    }
    
    public final void bi(Object a) {
        if (!(a instanceof jhj)) {
            return;
        }
        final jhj jhj = (jhj)a;
        a = jhj.a;
        this.aE = jhj.b;
    }
    
    public final void c() {
        this.aO();
    }
    
    public final fzw mG() {
        if (this.au == null) {
            final fzv b = this.aw.b();
            final jgv ad = this.aD;
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
                b.c = new fzr(b2, bc);
            }
            b.n((aexg)new ift(this, 12));
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
        this.aD.P = (jgt)this;
        if (((br)this).ar()) {
            ((br)this).G().O(jgw.ae, (aum)this, (cp)new jhg(this));
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
    
    public final acvr o() {
        final acvq a = acvr.a();
        a.c(this.s());
        a.b(this.aP());
        return a.a();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.aD.d(configuration);
        this.al.execute((Runnable)new jcd(this, 8));
    }
    
    public final void pK(final Bundle bundle) {
        bundle.putString("search_cache_key", this.aR);
        bundle.putString("search_query", this.ao);
        bundle.putBoolean("search_filter_chip_applied", this.aV);
        bundle.putBoolean("search_filter_chip_clicked", this.aU);
        bundle.putInt("search_filter_chip_count", this.aW);
        bundle.putString("search_original_chip_query", this.ba);
        bundle.putInt("search_chip_bar_selected_position", this.aX);
        bundle.putBoolean("from_voice_search", this.aY);
        final jgv ad = this.aD;
        if (ad != null) {
            ad.m(bundle);
        }
    }
    
    public final void q() {
        final jgv ad = this.aD;
        if (ad.K != null) {
            final jhh as = this.as;
            if (as != null && as.a != null) {
                if (((br)this).ar()) {
                    if (!ad.r().isEmpty()) {
                        final jhh as2 = this.as;
                        final MenuItem a = as2.a;
                        as2.a(this.aN(), ((br)this).nZ().getColor(2131102368));
                        return;
                    }
                    final jhh as3 = this.as;
                    final MenuItem a2 = as3.a;
                    final tnw an = this.aN();
                    final Context nt = ((br)this).nT();
                    nt.getClass();
                    as3.a(an, ezp.t(2130970924).mt(nt));
                }
            }
        }
    }
    
    public final void r() {
        final aofi k = this.aD.K;
        if (k != null && k.b.size() > 0 && ((br)this).ar()) {
            jgw.aM(((br)this).G(), this.aD.K, this.aJ, this.aH);
        }
    }
    
    public final boolean s() {
        final akww j = this.aD.J;
        return j != null && (j.b & 0x200000) != 0x0 && j.o;
    }
}
