import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.android.apps.youtube.app.extensions.appindexing.WatchVideoIndexer;
import java.io.File;
import java.util.concurrent.Executor;
import android.content.Context;
import android.os.MessageQueue;
import android.os.MessageQueue$IdleHandler;
import android.os.Looper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.io.Serializable;
import android.app.Application$ActivityLifecycleCallbacks;
import java.util.Iterator;
import j$.time.Duration;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import android.os.Build$VERSION;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import com.google.common.util.concurrent.ListenableFuture;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.FileObserver;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esm
{
    atke A;
    atke B;
    atke C;
    atke D;
    atke E;
    atke F;
    atke G;
    atke H;
    atke I;
    atke J;
    atke K;
    atke L;
    atke M;
    atke N;
    public atke O;
    atke P;
    atke Q;
    atke R;
    atke S;
    atke T;
    atke U;
    atke V;
    atke W;
    atke X;
    atke Y;
    atke Z;
    ScheduledExecutorService a;
    atke aA;
    atke aB;
    atke aC;
    atke aD;
    atke aE;
    atke aF;
    atke aG;
    atke aH;
    atke aI;
    atke aJ;
    atke aK;
    atke aL;
    atke aM;
    atke aN;
    atke aO;
    atke aP;
    atke aQ;
    atke aR;
    atke aS;
    atke aT;
    atke aU;
    atke aV;
    atke aW;
    atke aX;
    atke aY;
    atke aZ;
    atke aa;
    atke ab;
    atke ac;
    atke ad;
    atke ae;
    atke af;
    atke ag;
    atke ah;
    atke ai;
    atke aj;
    atke ak;
    atke al;
    atke am;
    atke an;
    atke ao;
    atke ap;
    atke aq;
    atke ar;
    atke as;
    atke at;
    atke au;
    atke av;
    atke aw;
    atke ax;
    atke ay;
    atke az;
    public asid b;
    arkg bA;
    arkg bB;
    arkg bC;
    arkg bD;
    arkg bE;
    arkg bF;
    arkg bG;
    arkg bH;
    arkg bI;
    arkg bJ;
    atke bK;
    arkg bL;
    public FileObserver bM;
    public final atjy bN;
    public final atjo bO;
    vaf bP;
    atke ba;
    atke bb;
    atke bc;
    atke bd;
    atke be;
    atke bf;
    atke bg;
    atke bh;
    atke bi;
    atke bj;
    atke bk;
    atke bl;
    atke bm;
    atke bn;
    atke bo;
    atke bp;
    atke bq;
    atke br;
    atke bs;
    atke bt;
    atke bu;
    arkg bv;
    arkg bw;
    arkg bx;
    arkg by;
    arkg bz;
    SharedPreferences c;
    public ewp d;
    tok e;
    top f;
    oby g;
    Application h;
    public tnu i;
    uyz j;
    tnx k;
    ListenableFuture l;
    atke m;
    atke n;
    atke o;
    atke p;
    atke q;
    atke r;
    atke s;
    atke t;
    atke u;
    atke v;
    atke w;
    atke x;
    atke y;
    atke z;
    
    public esm() {
        this.bN = atjy.ag();
        this.bO = atjo.aa();
    }
    
    public static void i() {
        zlm.b(zll.a, zlk.r, "isAppUpdateLegacyFuture failed.");
    }
    
    private final void j(final tgd tgd, final long n, final tch tch) {
        if (n > 0L) {
            final tfh tfh = (tfh)tch.a((Object)n);
            if (this.i.m(tnu.ab)) {
                tgd.d((Object)tfh);
                return;
            }
            tgd.f((Object)tfh);
        }
    }
    
    private final int k(final int n) {
        switch (this.e.a(n)) {
            default: {
                return 1;
            }
            case 8: {
                return 12;
            }
            case 7: {
                return 11;
            }
            case 6: {
                return 6;
            }
            case 5: {
                return 5;
            }
            case 4: {
                return 4;
            }
            case 3: {
                return 3;
            }
            case 2: {
                return 2;
            }
            case 1: {
                return 10;
            }
        }
    }
    
    public final void a() {
        final vlk a = this.j.a();
        final tgd tgd = (tgd)this.C.a();
        this.j(tgd, a.g.d, (tch)esb.b);
        this.j(tgd, a.f.d, (tch)esb.a);
        this.j(tgd, a.e.d, (tch)esb.c);
    }
    
    public final void b(final boolean b, final Throwable t) {
        final int n = 0;
        xbo[] array = new xbo[0];
        if (((vai)this.bd.a()).f(45367223L)) {
            array = new xbo[] { (xbo)this.bk.a() };
        }
        toj.b.g();
        final xao xao = (xao)this.q.a();
        final toj a = this.d.a;
        final top f = this.f;
        this.e.a(tok.a);
        String i;
        if (!b) {
            i = "cold";
        }
        else {
            i = "frozenFirstInstall";
        }
        final String[] a2 = xbr.a;
        if (toj.m()) {
            final Duration b2 = f.b();
            Duration plus;
            if (b2 == null) {
                plus = null;
            }
            else {
                plus = b2.plus(f.c());
            }
            final Duration b3 = f.b();
            if (plus != null && b3 != null) {
                final long a3 = afsp.a(f.c());
                final List c = a.c;
                final ArrayList list = new ArrayList(Arrays.asList(array));
                if (toj.n(4096)) {
                    list.add((Object)new xbq(xao));
                }
                final xbp xbp = new xbp((Iterable)list);
                ((xbo)xbp).b();
                ((xbo)xbp).e(plus.toMillis());
                final ahaz builder = ((ahbh)almj.a).createBuilder();
                builder.copyOnWrite();
                final almj almj = (almj)builder.instance;
                almj.b |= 0x10;
                almj.i = i;
                final int availableProcessors = Runtime.getRuntime().availableProcessors();
                builder.copyOnWrite();
                final almj almj2 = (almj)builder.instance;
                almj2.c |= 0x200;
                almj2.F = availableProcessors;
                final String sdk = Build$VERSION.SDK;
                builder.copyOnWrite();
                final almj almj3 = (almj)builder.instance;
                sdk.getClass();
                almj3.c |= 0x400;
                almj3.G = sdk;
                if (t != null) {
                    builder.copyOnWrite();
                    final almj almj4 = (almj)builder.instance;
                    almj4.I = 1;
                    almj4.c |= 0x8000;
                    zlm.c(zll.b, zlk.r, "SS wait for schedulers", t);
                }
                ((xbo)xbp).c((almj)builder.build());
                final ArrayList list2 = new ArrayList(256);
                for (final toh toh : c) {
                    final tof[] a4 = toh.a;
                    for (int j = 0; j < 2; ++j) {
                        a4[j].c((List)list2);
                    }
                    final Iterator iterator2 = toh.b.iterator();
                    while (iterator2.hasNext()) {
                        zlm.c(zll.b, zlk.r, "SS non fatal error", (Throwable)iterator2.next());
                    }
                }
                final HashSet set = new HashSet();
                final tfg k = a.j;
                for (int size = list2.size(), l = n; l < size; ++l) {
                    final String c2 = ((tor)list2.get(l)).c();
                    if (!c2.equals("null")) {
                        set.add(c2);
                    }
                }
                final aulc aulc = new aulc((byte[])null, (byte[])null, (byte[])null);
                final tor b4 = toj.b;
                xbr.c(b4, aulc, 0, new aevy(), (Map)new HashMap(), (afhr)afeb.k());
                xbr.b(b4, (xbo)xbp, a3);
                ((xbo)xbp).a();
            }
        }
        final toj a5 = this.d.a;
        final too g = a5.g;
        final Iterator iterator3 = tep.a.iterator();
        while (iterator3.hasNext()) {
            ((List)((tep)iterator3.next()).b.a).remove(g);
        }
        final too g2 = a5.g;
        final Iterator iterator4 = teo.a.iterator();
        if (!iterator4.hasNext()) {
            final kkv m = a5.i;
            if (m != null) {
                m.a();
            }
            if (!this.i.m(tnu.aC)) {
                this.f();
            }
            return;
        }
        final teo teo = (teo)iterator4.next();
        throw null;
    }
    
    public final void c() {
        tbi.f();
        final fzw fzw = new fzw((xbd)this.O.a(), (tgd)this.C.a());
        ((xbd)fzw.a).j((Class)fhz.class, "proc_k");
        ((xbd)fzw.a).d((Class)fgp.class, (xaz)new fgj(0)).c((Class)fgr.class);
        ((xbd)fzw.a).m((Class)fgm.class, (Class)fgq.class, (xaz)new fgj(1));
        ((xbd)fzw.a).j((Class)fgp.class, "f_unknown");
        ((xbd)fzw.a).j((Class)fgm.class, "f_proc");
        ((xbd)fzw.a).i((Class)fgp.class, (xba)new fgx(1));
        final abjk abjk = (abjk)this.aY.a();
        final zbh zbh = (zbh)this.V.a();
        final tnu i = this.i;
        abjk.getClass();
        zbh.getClass();
        i.getClass();
        final fgz fgz = new fgz();
        final boolean m = i.m(tnu.G);
        Serializable s;
        if (m) {
            s = aciv.class;
        }
        else {
            s = fhi.class;
        }
        final xbb e = ((xbd)fzw.a).e((Class)fgk.class, (Class)fgq.class, (xaz)new fgj(2), true);
        e.b((Class)fhc.class);
        e.c((Class)fhh.class);
        e.c((Class)s);
        if (i.m(tnu.H)) {
            e.c((Class)fhe.class);
        }
        final sag sag = new sag(abjk, zbh, (afaq)fgz, 3, (short[])null);
        final xbb e2 = ((xbd)fzw.a).e((Class)fgs.class, (Class)fgq.class, (xaz)sag, true);
        e2.b((Class)fhd.class);
        e2.c((Class)aamq.class);
        e2.c((Class)aamr.class);
        e2.c((Class)aamn.class);
        e2.c((Class)aamw.class);
        e2.c((Class)abkh.class);
        e2.c((Class)aamm.class);
        final xbb e3 = ((xbd)fzw.a).e((Class)fgn.class, (Class)fgl.class, (xaz)new fgj(4), true);
        e3.b((Class)fie.class);
        e3.b((Class)fic.class);
        e3.c((Class)fii.class);
        final xbb f = ((xbd)fzw.a).f((Class)fik.class, (xaz)sag, (aezs)new fgw(fzw, (byte[])null, (byte[])null));
        f.c((Class)aamq.class);
        f.c((Class)aamr.class);
        f.c((Class)aamn.class);
        f.c((Class)fik.class);
        f.c((Class)aamw.class);
        f.c((Class)abkh.class);
        f.c((Class)aamm.class);
        final xbb d = ((xbd)fzw.a).d((Class)fhm.class, (xaz)new ffn(1));
        d.c((Class)fhn.class);
        d.c((Class)fho.class);
        d.c((Class)fhq.class);
        d.c((Class)fhp.class);
        d.c((Class)fhr.class);
        d.c((Class)fhx.class);
        if (!m) {
            ((xbd)fzw.a).e((Class)aciw.class, (Class)fgl.class, (xaz)new ffn(5), false).c((Class)aciv.class);
        }
        ((xbd)fzw.a).e((Class)aciu.class, (Class)fgo.class, (xaz)new ffn(6), false).c((Class)acit.class);
        final xbb d2 = ((xbd)fzw.a).d((Class)aamw.class, (xaz)sag);
        d2.c((Class)aamq.class);
        d2.c((Class)aamr.class);
        d2.c((Class)aamn.class);
        d2.c((Class)fik.class);
        d2.c((Class)aamw.class);
        d2.c((Class)abkh.class);
        d2.c((Class)aamm.class);
        final xbb d3 = ((xbd)fzw.a).d((Class)sax.class, (xaz)new sag(abjk, zbh, (afaq)fgz, 1, (byte[])null));
        d3.c((Class)aamq.class);
        d3.c((Class)aamr.class);
        d3.c((Class)aamn.class);
        d3.b((Class)fik.class);
        d3.b((Class)aamw.class);
        d3.b((Class)abkh.class);
        d3.b((Class)aamm.class);
        final xbb d4 = ((xbd)fzw.a).d((Class)sbc.class, (xaz)new sag(abjk, zbh, (afaq)fgz, 2, (char[])null));
        d4.c((Class)aamq.class);
        d4.c((Class)aamr.class);
        d4.c((Class)aamn.class);
        d4.b((Class)sbb.class);
        d4.b((Class)fik.class);
        d4.b((Class)aamw.class);
        d4.b((Class)abkh.class);
        d4.b((Class)aamm.class);
        final xbb d5 = ((xbd)fzw.a).d((Class)sbo.class, (xaz)new sag(abjk, zbh, (afaq)fgz, 0));
        d5.c((Class)aamq.class);
        d5.c((Class)aamr.class);
        d5.c((Class)aamn.class);
        d5.b((Class)fik.class);
        d5.b((Class)aamw.class);
        d5.b((Class)abkh.class);
        d5.b((Class)aamm.class);
        final xbb d6 = ((xbd)fzw.a).d((Class)sbw.class, (xaz)new aalk("va"));
        d6.c((Class)sbc.class);
        d6.b((Class)sbb.class);
        d6.b((Class)fik.class);
        final xbb d7 = ((xbd)fzw.a).d((Class)sbn.class, (xaz)new aalk("av"));
        d7.c((Class)sbm.class);
        d7.b((Class)fik.class);
        d7.b((Class)aamw.class);
        d7.b((Class)abkh.class);
        d7.b((Class)aamm.class);
        final xbb d8 = ((xbd)fzw.a).d((Class)ffj.class, (xaz)new ffn(0));
        d8.c((Class)aamq.class);
        d8.c((Class)aamr.class);
        d8.b((Class)abkh.class);
        d8.b((Class)ffi.class);
        d8.b((Class)ffj.class);
        ((xbd)fzw.a).j((Class)fgk.class, "f_home");
        ((xbd)fzw.a).j((Class)fgs.class, "f_watch");
        ((xbd)fzw.a).j((Class)fgn.class, "f_search");
        ((xbd)fzw.a).j((Class)fgr.class, "f_unknown_e");
        ((xbd)fzw.a).j((Class)fhb.class, "app_l");
        ((xbd)fzw.a).j((Class)fhc.class, "ol_i");
        ((xbd)fzw.a).j((Class)fhd.class, "pl_int");
        ((xbd)fzw.a).j((Class)fha.class, "cfg_a");
        ((xbd)fzw.a).j((Class)fhs.class, "cfg_c");
        ((xbd)fzw.a).j((Class)fhw.class, "cfg_h");
        ((xbd)fzw.a).i((Class)fhg.class, (xba)fgv.b);
        ((xbd)fzw.a).j((Class)fhg.class, "bres");
        ((xbd)fzw.a).j((Class)fhf.class, "brer");
        ((xbd)fzw.a).j((Class)vav.class, "brns");
        ((xbd)fzw.a).j((Class)vau.class, "brnr");
        ((xbd)fzw.a).j((Class)vat.class, "brps");
        ((xbd)fzw.a).j((Class)vas.class, "brpe");
        ((xbd)fzw.a).j((Class)fhh.class, "br_e");
        ((xbd)fzw.a).j((Class)fhr.class, "br_s");
        ((xbd)fzw.a).j((Class)fhm.class, "br_r");
        ((xbd)fzw.a).j((Class)fhi.class, "ol");
        ((xbd)fzw.a).j((Class)fhe.class, "aa");
        ((xbd)fzw.a).j((Class)fio.class, "ui_l");
        ((xbd)fzw.a).j((Class)fik.class, "pl_int");
        ((xbd)fzw.a).j((Class)fib.class, "rurl_s");
        ((xbd)fzw.a).j((Class)fia.class, "rurl_r");
        ((xbd)fzw.a).j((Class)vbb.class, "rurlps");
        ((xbd)fzw.a).j((Class)vba.class, "rurlpe");
        ((xbd)fzw.a).j((Class)fhn.class, "br_ld");
        ((xbd)fzw.a).j((Class)fho.class, "brr_e");
        ((xbd)fzw.a).j((Class)fhq.class, "brr_i");
        ((xbd)fzw.a).j((Class)fhp.class, "brr_ius");
        ((xbd)fzw.a).j((Class)fhx.class, "ne_r");
        ((xbd)fzw.a).j((Class)fij.class, "sr_ui");
        ((xbd)fzw.a).j((Class)fig.class, "sr_pa");
        ((xbd)fzw.a).j((Class)fih.class, "sr_s");
        ((xbd)fzw.a).j((Class)fif.class, "sr_r");
        ((xbd)fzw.a).j((Class)fic.class, "sr_e");
        ((xbd)fzw.a).j((Class)fie.class, "sf_i");
        ((xbd)fzw.a).j((Class)fii.class, "sr_p");
        ((xbd)fzw.a).j((Class)vbd.class, "ssns");
        ((xbd)fzw.a).j((Class)vbc.class, "ssnr");
        ((xbd)fzw.a).j((Class)fhv.class, "gu_s");
        ((xbd)fzw.a).j((Class)fhu.class, "gu_r");
        ((xbd)fzw.a).j((Class)fht.class, "gu_e");
        final Object a = fzw.a;
        ((xbd)a).j((Class)aciw.class, "thmon_s");
        ((xbd)a).j((Class)aciv.class, "thmon_e");
        ((xbd)a).j((Class)aciu.class, "thmon_s");
        ((xbd)a).j((Class)acit.class, "thmon_e");
        ((xbd)a).k((Class)acja.class, (xbc)new aciq(0));
        ((xbd)a).k((Class)aciz.class, (xbc)new aciq(0));
        ((xbd)a).k((Class)aciy.class, (xbc)new aciq(0));
        ((xbd)a).k((Class)acix.class, (xbc)new aciq(0));
        ((xbd)a).i((Class)acja.class, (xba)fgv.s);
        ((xbd)fzw.a).j((Class)fim.class, "th0_sc");
        ((xbd)fzw.a).j((Class)fil.class, "th0_cc");
        ((xbd)fzw.a).j((Class)fin.class, "th0_sr");
        ((xbd)fzw.a).j((Class)fiq.class, "uiwwa_c");
        ((xbd)fzw.a).j((Class)fiu.class, "uiwwa_s");
        ((xbd)fzw.a).j((Class)fit.class, "uiwwa_r");
        ((xbd)fzw.a).j((Class)fir.class, "uiwwa_pr");
        ((xbd)fzw.a).j((Class)fis.class, "uiwwa_e");
        ((xbd)fzw.a).j((Class)fip.class, "uiwwa_oac");
        ((xbd)fzw.a).j((Class)fiw.class, "uiwwa_rfs");
        ((xbd)fzw.a).j((Class)fiv.class, "uiwwa_rfe");
        ((xbd)fzw.a).j((Class)fhj.class, "uibf_c");
        ((xbd)fzw.a).j((Class)fhl.class, "uibf_s");
        ((xbd)fzw.a).j((Class)fhk.class, "uibf_r");
        ((xbd)fzw.a).j((Class)fhy.class, "uipb_gld");
        ((xbd)fzw.a).j((Class)fid.class, "uisf_r");
        ((xbd)fzw.a).j((Class)ffm.class, "im_d");
        ((xbd)fzw.a).j((Class)ffm.class, "im_s");
        ((xbd)fzw.a).j((Class)ffl.class, "im_po");
        ((xbd)fzw.a).j((Class)ffk.class, "im_pl");
        ((xbd)fzw.a).j((Class)ffj.class, "im_vs");
        ((xbd)fzw.a).j((Class)ffv.class, "js_is");
        ((xbd)fzw.a).j((Class)ffp.class, "js_if");
        ((xbd)fzw.a).j((Class)ffu.class, "js_ebs");
        ((xbd)fzw.a).j((Class)fft.class, "js_ebf");
        ((xbd)fzw.a).j((Class)ffs.class, "js_ebc");
        ((xbd)fzw.a).j((Class)ffr.class, "js_eas");
        ((xbd)fzw.a).j((Class)ffq.class, "js_eaf");
        ((xbd)fzw.a).i((Class)vjq.class, (xba)new fgx(0));
        ((tgd)fzw.b).a((Object)fzw, (Class)vjq.class, (tge)fgz);
        ((xbd)fzw.a).i((Class)fgr.class, (xba)new fgx(2));
        ((xbd)fzw.a).i((Class)wzj.class, (xba)fgv.a);
        final Object a2 = fzw.a;
        ((xbd)a2).j((Class)aamo.class, "pl_i");
        ((xbd)a2).j((Class)aamp.class, "pl_r");
        ((xbd)a2).j((Class)aamu.class, "ps_s");
        ((xbd)a2).j((Class)aamt.class, "ps_r");
        ((xbd)a2).j((Class)vaz.class, "psns");
        ((xbd)a2).j((Class)vay.class, "psnr");
        ((xbd)a2).j((Class)vax.class, "psps");
        ((xbd)a2).j((Class)vaw.class, "pspe");
        ((xbd)a2).j((Class)aana.class, "wn_s");
        ((xbd)a2).j((Class)aamz.class, "wn_r");
        ((xbd)a2).j((Class)vbf.class, "wnps");
        ((xbd)a2).j((Class)vbe.class, "wnpe");
        ((xbd)a2).j((Class)aami.class, "pl_efa");
        ((xbd)a2).j((Class)aamj.class, "pl_efh");
        ((xbd)a2).j((Class)aamy.class, "sw_s");
        ((xbd)a2).j((Class)aamx.class, "sw_r");
        ((xbd)a2).j((Class)aamk.class, "pc");
        ((xbd)a2).j((Class)aamv.class, "pl_s");
        ((xbd)a2).j((Class)aams.class, "pl_c");
        ((xbd)a2).j((Class)aamq.class, "pbs");
        ((xbd)a2).j((Class)aaml.class, "pbi");
        ((xbd)a2).j((Class)aamr.class, "pbu");
        ((xbd)a2).j((Class)aamn.class, "pbp");
        ((xbd)a2).j((Class)aamw.class, "pl_int");
        ((xbd)a2).j((Class)abkh.class, "pl_ex");
        ((xbd)a2).j((Class)aamm.class, "pl_int");
        ((xbd)a2).i((Class)aamt.class, (xba)fgv.l);
        ((xbd)a2).k((Class)aans.class, (xbc)aali.a);
        ((xbd)a2).i((Class)aans.class, (xba)fgv.m);
        ((xbd)a2).i((Class)abkh.class, (xba)fgv.n);
        ((xbd)a2).i((Class)abiv.class, (xba)fgv.o);
        ((xbd)a2).i((Class)ypj.class, (xba)fgv.p);
        ((xbd)a2).i((Class)aamv.class, (xba)fgv.q);
        ((xbd)a2).i((Class)aamq.class, (xba)fgv.r);
        zdf.a(a2);
        ycc.a((xbd)a2);
        final Object a3 = fzw.a;
        ((xbd)a3).j((Class)sbh.class, "ab_s");
        ((xbd)a3).j((Class)sbg.class, "ab_r");
        ((xbd)a3).j((Class)sbj.class, "ad_bl");
        ((xbd)a3).j((Class)sbb.class, "ad_ba");
        ((xbd)a3).j((Class)sbe.class, "msti");
        ((xbd)a3).j((Class)sbd.class, "mstr");
        ((xbd)a3).j((Class)sbf.class, "ad_bp");
        ((xbd)a3).j((Class)sbl.class, "ads_s");
        ((xbd)a3).j((Class)sbk.class, "ads_e");
        ((xbd)a3).j((Class)sbc.class, "ab_cre");
        ((xbd)a3).j((Class)sbm.class, "ad_pre");
        ((xbd)a3).j((Class)sby.class, "pacf_ss");
        ((xbd)a3).j((Class)sbx.class, "pacf_sb");
        ((xbd)a3).j((Class)sbz.class, "pacf_ssc");
        ((xbd)a3).j((Class)sbq.class, "pacf_ls");
        ((xbd)a3).j((Class)sbp.class, "pacf_lb");
        ((xbd)a3).j((Class)sbr.class, "pacf_lsc");
        ((xbd)a3).j((Class)sca.class, "ad_vr");
        ((xbd)a3).j((Class)sbv.class, "pb_s");
        ((xbd)a3).j((Class)sbt.class, "pb_c");
        ((xbd)a3).j((Class)sbs.class, "pb_ca");
        ((xbd)a3).j((Class)sbu.class, "pb_f");
        ((xbd)a3).k((Class)scd.class, (xbc)new aciq(1));
        ((xbd)a3).i((Class)scd.class, (xba)new fgx(3));
        ((xbd)a3).i((Class)sba.class, (xba)new fgx(4));
        ((xbd)a3).i((Class)aans.class, (xba)fgv.c);
        ((xbd)a3).i((Class)aaml.class, (xba)fgv.d);
        ((xbd)a3).i((Class)sbi.class, (xba)new fgx(5));
        ((xbd)a3).i((Class)sbn.class, (xba)new fgx(6));
        ((xbd)a3).i((Class)sax.class, (xba)new fgx(7));
        ((xbd)a3).i((Class)sbv.class, (xba)new fgx(8));
        ((xbd)a3).i((Class)sbt.class, (xba)new fgx(9));
        ((xbd)a3).i((Class)sbu.class, (xba)new fgx(10));
        final skt skt = new skt((xbd)fzw.a);
        if (!skt.a) {
            final xbb f2 = ((xbd)skt.b).f((Class)fgh.class, (xaz)new ffn(2), (aezs)new ffw(skt, (byte[])null, (byte[])null));
            f2.c((Class)ffx.class);
            f2.c((Class)ffy.class);
            f2.b((Class)fgf.class);
            f2.b((Class)ffz.class);
            f2.b((Class)fgg.class);
            ((xbd)skt.b).j((Class)fgh.class, "ytro_s");
            ((xbd)skt.b).j((Class)fga.class, "purb_c");
            ((xbd)skt.b).j((Class)fge.class, "walti_s");
            ((xbd)skt.b).j((Class)fgb.class, "walnt_s");
            ((xbd)skt.b).j((Class)fgc.class, "walpt_s");
            ((xbd)skt.b).j((Class)fgd.class, "wali_s");
            ((xbd)skt.b).j((Class)ffx.class, "wali_c");
            ((xbd)skt.b).j((Class)ffz.class, "waltr_f");
            ((xbd)skt.b).j((Class)fgf.class, "waltr_s");
            ((xbd)skt.b).j((Class)ffy.class, "waltr_c");
            ((xbd)skt.b).j((Class)fgg.class, "ytrmsp_s");
            skt.a = true;
        }
        final Object a4 = fzw.a;
        ((xbd)a4).j((Class)abfj.class, "pft_i");
        ((xbd)a4).j((Class)abfi.class, "pbf_c");
        this.h.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new fgy(fzw, this.n, null, null));
    }
    
    public final void d() {
        tbi.f();
        boolean booleanValue;
        try {
            booleanValue = (boolean)this.l.get(500L, TimeUnit.MILLISECONDS);
        }
        catch (final ExecutionException | TimeoutException | InterruptedException ex) {
            booleanValue = false;
        }
        final long millis = this.f.a().toMillis();
        final top f = this.f;
        final long millis2 = f.a().plus(f.c()).toMillis();
        final fez fez = (fez)this.ar.a();
        final boolean booleanValue2 = (boolean)this.bm.a();
        tbi.f();
        fez.d = millis2;
        fez.c = booleanValue;
        fez.a.f((Object)new fgp(millis, booleanValue, booleanValue2));
        fez.b.s(20);
        final Duration b = this.f.b();
        long a = millis2;
        if (((vai)this.bg.a()).l(45373804L).aM()) {
            a = millis2;
            if (b != null) {
                a = this.g.c() - TimeUnit.NANOSECONDS.toMillis(this.g.e()) + b.toMillis();
            }
        }
        ((hny)this.bl.a()).a = a;
        if (b != null) {
            ((tgd)this.C.a()).f((Object)new fhz(b.toMillis()));
        }
        if (!this.i.m(tnu.ab)) {
            this.a();
        }
        final kfq kfq = (kfq)this.n.a();
        tbi.f();
        final MessageQueue myQueue = Looper.myQueue();
        myQueue.removeIdleHandler((MessageQueue$IdleHandler)kfq.c);
        myQueue.addIdleHandler((MessageQueue$IdleHandler)kfq.c);
        kfq.a = false;
        this.bO.tx();
    }
    
    public final void e(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        esm.af:Latke;
        //     4: invokeinterface atke.a:()Ljava/lang/Object;
        //     9: checkcast       Ladgk;
        //    12: astore          6
        //    14: aload_0        
        //    15: getfield        esm.az:Latke;
        //    18: astore          7
        //    20: aload           6
        //    22: getfield        adgk.d:Ljava/lang/Object;
        //    25: checkcast       Ladgj;
        //    28: astore          5
        //    30: aload           5
        //    32: getfield        adgj.j:Ljava/lang/Object;
        //    35: checkcast       Ladiz;
        //    38: getfield        adiz.e:Ljava/lang/Object;
        //    41: astore          8
        //    43: iconst_0       
        //    44: istore_2       
        //    45: iload_1        
        //    46: ifeq            1045
        //    49: aload           8
        //    51: checkcast       Ltos;
        //    54: astore          8
        //    56: aload           8
        //    58: getfield        tos.v:I
        //    61: istore_2       
        //    62: iload_2        
        //    63: iconst_2       
        //    64: if_icmpne       83
        //    67: aload           5
        //    69: invokevirtual   adgj.a:()Ladiq;
        //    72: getfield        adiq.h:Ladiz;
        //    75: aload           7
        //    77: invokestatic    adig.b:(Ladiz;Latke;)V
        //    80: goto            389
        //    83: iload_2        
        //    84: iconst_1       
        //    85: if_icmpne       107
        //    88: aload           5
        //    90: invokevirtual   adgj.d:()Ladiz;
        //    93: getfield        adiz.f:Ljava/lang/Object;
        //    96: checkcast       Ladiz;
        //    99: aload           7
        //   101: invokestatic    adig.b:(Ladiz;Latke;)V
        //   104: goto            389
        //   107: iload_2        
        //   108: iconst_3       
        //   109: if_icmpne       251
        //   112: aload           5
        //   114: invokevirtual   adgj.b:()Ladis;
        //   117: getfield        adis.c:Ladih;
        //   120: astore          9
        //   122: getstatic       adid.a:I
        //   125: istore_2       
        //   126: aload           9
        //   128: getfield        adih.a:Ladiz;
        //   131: invokestatic    adkp.B:(Ladiz;)Ljava/util/List;
        //   134: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   139: astore          5
        //   141: aload           5
        //   143: invokeinterface java/util/Iterator.hasNext:()Z
        //   148: ifeq            389
        //   151: aload           5
        //   153: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   158: checkcast       Ljava/io/File;
        //   161: astore          10
        //   163: aload           10
        //   165: invokestatic    adkp.x:(Ljava/io/File;)Lahuk;
        //   168: astore          12
        //   170: aload           12
        //   172: ifnull          243
        //   175: aload           12
        //   177: getfield        ahuk.c:Z
        //   180: ifne            243
        //   183: aload           12
        //   185: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   188: pop            
        //   189: invokestatic    aknt.d:()Laknr;
        //   192: astore          11
        //   194: aload           11
        //   196: invokevirtual   ahaz.copyOnWrite:()V
        //   199: aload           11
        //   201: getfield        aknr.instance:Lahbh;
        //   204: checkcast       Laknt;
        //   207: aload           12
        //   209: invokestatic    aknt.bk:(Laknt;Lahuk;)V
        //   212: aload           11
        //   214: invokevirtual   ahaz.build:()Lahbh;
        //   217: checkcast       Laknt;
        //   220: astore          11
        //   222: aload           9
        //   224: getfield        adih.b:Latke;
        //   227: invokeinterface atke.a:()Ljava/lang/Object;
        //   232: checkcast       Lwxx;
        //   235: aload           11
        //   237: invokeinterface wxx.d:(Laknt;)Z
        //   242: pop            
        //   243: aload           10
        //   245: invokestatic    adkp.r:(Ljava/io/File;)V
        //   248: goto            141
        //   251: iload_2        
        //   252: iconst_4       
        //   253: if_icmpne       389
        //   256: aload           5
        //   258: getfield        adgj.d:Latke;
        //   261: invokeinterface atke.a:()Ljava/lang/Object;
        //   266: checkcast       Ladiw;
        //   269: getfield        adiw.i:Ladiz;
        //   272: astore          5
        //   274: getstatic       adid.a:I
        //   277: istore_2       
        //   278: aload           5
        //   280: invokestatic    adkp.B:(Ladiz;)Ljava/util/List;
        //   283: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   288: astore          9
        //   290: aload           9
        //   292: invokeinterface java/util/Iterator.hasNext:()Z
        //   297: ifeq            389
        //   300: aload           9
        //   302: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   307: checkcast       Ljava/io/File;
        //   310: astore          5
        //   312: aload           5
        //   314: invokestatic    adkp.x:(Ljava/io/File;)Lahuk;
        //   317: astore          11
        //   319: aload           11
        //   321: ifnull          381
        //   324: aload           11
        //   326: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   329: pop            
        //   330: invokestatic    aknt.d:()Laknr;
        //   333: astore          10
        //   335: aload           10
        //   337: invokevirtual   ahaz.copyOnWrite:()V
        //   340: aload           10
        //   342: getfield        aknr.instance:Lahbh;
        //   345: checkcast       Laknt;
        //   348: aload           11
        //   350: invokestatic    aknt.bk:(Laknt;Lahuk;)V
        //   353: aload           10
        //   355: invokevirtual   ahaz.build:()Lahbh;
        //   358: checkcast       Laknt;
        //   361: astore          10
        //   363: aload           7
        //   365: invokeinterface atke.a:()Ljava/lang/Object;
        //   370: checkcast       Lwxx;
        //   373: aload           10
        //   375: invokeinterface wxx.d:(Laknt;)Z
        //   380: pop            
        //   381: aload           5
        //   383: invokestatic    adkp.r:(Ljava/io/File;)V
        //   386: goto            290
        //   389: aload           8
        //   391: getfield        tos.w:I
        //   394: iconst_1       
        //   395: if_icmpne       710
        //   398: aload           6
        //   400: getfield        adgk.d:Ljava/lang/Object;
        //   403: checkcast       Ladgj;
        //   406: getfield        adgj.f:Latke;
        //   409: invokeinterface atke.a:()Ljava/lang/Object;
        //   414: checkcast       Laekp;
        //   417: astore          10
        //   419: aload           10
        //   421: getfield        aekp.a:Ljava/lang/Object;
        //   424: invokeinterface atke.a:()Ljava/lang/Object;
        //   429: checkcast       Lcom/google/android/libraries/youtube/systemhealth/termination/NativeCrashDetectorUtil;
        //   432: astore          5
        //   434: aload           10
        //   436: getfield        aekp.b:Ljava/lang/Object;
        //   439: checkcast       Ladiz;
        //   442: getfield        adiz.c:Ljava/lang/Object;
        //   445: checkcast       Landroid/content/Context;
        //   448: invokestatic    com/google/android/libraries/youtube/systemhealth/termination/NativeCrashDetectorUtil.b:(Landroid/content/Context;)Ljava/io/File;
        //   451: astore          9
        //   453: aload           9
        //   455: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //   458: astore          5
        //   460: goto            494
        //   463: astore          5
        //   465: getstatic       zll.a:Lzll;
        //   468: getstatic       zlk.A:Lzlk;
        //   471: ldc_w           "!list '%s'"
        //   474: iconst_1       
        //   475: anewarray       Ljava/lang/Object;
        //   478: dup            
        //   479: iconst_0       
        //   480: aload           9
        //   482: aastore        
        //   483: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   486: aload           5
        //   488: invokestatic    zlm.c:(Lzll;Lzlk;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   491: aconst_null    
        //   492: astore          5
        //   494: aload           5
        //   496: ifnonnull       502
        //   499: goto            710
        //   502: aload           7
        //   504: invokeinterface atke.a:()Ljava/lang/Object;
        //   509: checkcast       Lwxx;
        //   512: astore          9
        //   514: aload           10
        //   516: getfield        aekp.b:Ljava/lang/Object;
        //   519: checkcast       Ladiz;
        //   522: getfield        adiz.a:J
        //   525: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   528: astore          10
        //   530: iconst_0       
        //   531: istore_2       
        //   532: iload_2        
        //   533: aload           5
        //   535: arraylength    
        //   536: if_icmpge       710
        //   539: aload           5
        //   541: iload_2        
        //   542: aaload         
        //   543: astore          11
        //   545: aload           11
        //   547: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   550: aload           10
        //   552: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   555: ifeq            561
        //   558: goto            704
        //   561: aload           11
        //   563: invokevirtual   java/io/File.isDirectory:()Z
        //   566: ifeq            578
        //   569: aload           11
        //   571: invokestatic    vdh.bf:(Ljava/io/File;)Z
        //   574: pop            
        //   575: goto            704
        //   578: aload           11
        //   580: invokevirtual   java/io/File.delete:()Z
        //   583: ifeq            680
        //   586: getstatic       ahur.a:Lahur;
        //   589: invokevirtual   ahbh.createBuilder:()Lahaz;
        //   592: astore          12
        //   594: aload           12
        //   596: invokevirtual   ahaz.copyOnWrite:()V
        //   599: aload           12
        //   601: getfield        ahaz.instance:Lahbh;
        //   604: checkcast       Lahur;
        //   607: astore          11
        //   609: aload           11
        //   611: bipush          10
        //   613: putfield        ahur.c:I
        //   616: aload           11
        //   618: aload           11
        //   620: getfield        ahur.b:I
        //   623: iconst_1       
        //   624: ior            
        //   625: putfield        ahur.b:I
        //   628: aload           12
        //   630: invokevirtual   ahaz.build:()Lahbh;
        //   633: checkcast       Lahur;
        //   636: astore          12
        //   638: invokestatic    aknt.d:()Laknr;
        //   641: astore          11
        //   643: aload           11
        //   645: invokevirtual   ahaz.copyOnWrite:()V
        //   648: aload           11
        //   650: getfield        aknr.instance:Lahbh;
        //   653: checkcast       Laknt;
        //   656: aload           12
        //   658: invokestatic    aknt.af:(Laknt;Lahur;)V
        //   661: aload           9
        //   663: aload           11
        //   665: invokevirtual   ahaz.build:()Lahbh;
        //   668: checkcast       Laknt;
        //   671: invokeinterface wxx.d:(Laknt;)Z
        //   676: pop            
        //   677: goto            704
        //   680: getstatic       zll.a:Lzll;
        //   683: getstatic       zlk.A:Lzlk;
        //   686: ldc_w           "!del '%s'"
        //   689: iconst_1       
        //   690: anewarray       Ljava/lang/Object;
        //   693: dup            
        //   694: iconst_0       
        //   695: aload           11
        //   697: aastore        
        //   698: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   701: invokestatic    zlm.b:(Lzll;Lzlk;Ljava/lang/String;)V
        //   704: iinc            2, 1
        //   707: goto            532
        //   710: aload           8
        //   712: getfield        tos.x:I
        //   715: iconst_1       
        //   716: if_icmpne       735
        //   719: aload           6
        //   721: getfield        adgk.d:Ljava/lang/Object;
        //   724: checkcast       Ladgj;
        //   727: invokevirtual   adgj.c:()Ladix;
        //   730: aload           7
        //   732: invokevirtual   adix.b:(Latke;)V
        //   735: aload           8
        //   737: getfield        tos.y:Z
        //   740: ifeq            1349
        //   743: aload           6
        //   745: getfield        adgk.d:Ljava/lang/Object;
        //   748: checkcast       Ladgj;
        //   751: getfield        adgj.g:Latke;
        //   754: invokeinterface atke.a:()Ljava/lang/Object;
        //   759: checkcast       Laekp;
        //   762: getfield        aekp.b:Ljava/lang/Object;
        //   765: astore          5
        //   767: getstatic       adjb.d:Ladjb;
        //   770: astore          6
        //   772: aload           5
        //   774: checkcast       Ladiz;
        //   777: aload           6
        //   779: iconst_0       
        //   780: invokestatic    adkp.v:(Ladiz;Ladjb;Z)Ljava/util/List;
        //   783: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   788: astore          8
        //   790: aload           8
        //   792: invokeinterface java/util/Iterator.hasNext:()Z
        //   797: ifeq            1349
        //   800: aload           8
        //   802: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   807: checkcast       Ljava/io/File;
        //   810: astore          9
        //   812: new             Ljava/io/FileInputStream;
        //   815: astore          6
        //   817: aload           6
        //   819: aload           9
        //   821: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   824: invokestatic    com/google/protobuf/ExtensionRegistryLite.getGeneratedRegistry:()Lcom/google/protobuf/ExtensionRegistryLite;
        //   827: astore          5
        //   829: getstatic       ahur.a:Lahur;
        //   832: aload           6
        //   834: aload           5
        //   836: invokestatic    ahbh.parseFrom:(Lahbh;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lahbh;
        //   839: checkcast       Lahur;
        //   842: astore          5
        //   844: aload           6
        //   846: invokevirtual   java/io/InputStream.close:()V
        //   849: goto            926
        //   852: astore          5
        //   854: aload           6
        //   856: invokevirtual   java/io/InputStream.close:()V
        //   859: goto            898
        //   862: astore          6
        //   864: ldc_w           Ljava/lang/Throwable;.class
        //   867: ldc_w           "addSuppressed"
        //   870: iconst_1       
        //   871: anewarray       Ljava/lang/Class;
        //   874: dup            
        //   875: iconst_0       
        //   876: ldc_w           Ljava/lang/Throwable;.class
        //   879: aastore        
        //   880: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   883: aload           5
        //   885: iconst_1       
        //   886: anewarray       Ljava/lang/Object;
        //   889: dup            
        //   890: iconst_0       
        //   891: aload           6
        //   893: aastore        
        //   894: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   897: pop            
        //   898: aload           5
        //   900: athrow         
        //   901: astore          5
        //   903: ldc_w           "BackgroundThreadUncaughtExceptionJournalV2 !read '%s'"
        //   906: iconst_1       
        //   907: anewarray       Ljava/lang/Object;
        //   910: dup            
        //   911: iconst_0       
        //   912: aload           9
        //   914: aastore        
        //   915: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   918: aload           5
        //   920: invokestatic    adkp.s:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   923: aconst_null    
        //   924: astore          5
        //   926: aload           5
        //   928: ifnull          1037
        //   931: aload           5
        //   933: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   936: pop            
        //   937: invokestatic    aknt.d:()Laknr;
        //   940: astore          6
        //   942: aload           6
        //   944: invokevirtual   ahaz.copyOnWrite:()V
        //   947: aload           6
        //   949: getfield        aknr.instance:Lahbh;
        //   952: checkcast       Laknt;
        //   955: aload           5
        //   957: invokestatic    aknt.af:(Laknt;Lahur;)V
        //   960: aload           6
        //   962: invokevirtual   ahaz.build:()Lahbh;
        //   965: checkcast       Laknt;
        //   968: astore          10
        //   970: aload           5
        //   972: getfield        ahur.e:Laoqk;
        //   975: astore          6
        //   977: aload           6
        //   979: astore          5
        //   981: aload           6
        //   983: ifnonnull       991
        //   986: getstatic       aoqk.a:Laoqk;
        //   989: astore          5
        //   991: aload           5
        //   993: getfield        aoqk.g:Laoqe;
        //   996: astore          6
        //   998: aload           6
        //  1000: astore          5
        //  1002: aload           6
        //  1004: ifnonnull       1012
        //  1007: getstatic       aoqe.a:Laoqe;
        //  1010: astore          5
        //  1012: aload           5
        //  1014: getfield        aoqe.e:J
        //  1017: lstore_3       
        //  1018: aload           7
        //  1020: invokeinterface atke.a:()Ljava/lang/Object;
        //  1025: checkcast       Lwxx;
        //  1028: aload           10
        //  1030: lload_3        
        //  1031: invokeinterface wxx.e:(Laknt;J)Z
        //  1036: pop            
        //  1037: aload           9
        //  1039: invokestatic    adkp.r:(Ljava/io/File;)V
        //  1042: goto            790
        //  1045: aload           8
        //  1047: checkcast       Ltos;
        //  1050: getfield        tos.w:I
        //  1053: ifne            1349
        //  1056: aload           6
        //  1058: getfield        adgk.f:Ljava/lang/Object;
        //  1061: invokeinterface atke.a:()Ljava/lang/Object;
        //  1066: checkcast       Lahcq;
        //  1069: astore          7
        //  1071: aload           7
        //  1073: getfield        ahcq.b:Ljava/lang/Object;
        //  1076: checkcast       Ladjh;
        //  1079: invokevirtual   adjh.b:()Laora;
        //  1082: getfield        aora.k:Laoqy;
        //  1085: astore          6
        //  1087: aload           6
        //  1089: astore          5
        //  1091: aload           6
        //  1093: ifnonnull       1101
        //  1096: getstatic       aoqy.a:Laoqy;
        //  1099: astore          5
        //  1101: aload           5
        //  1103: getfield        aoqy.b:Z
        //  1106: ifeq            1349
        //  1109: aload           7
        //  1111: getfield        ahcq.a:Ljava/lang/Object;
        //  1114: checkcast       Landroid/content/Context;
        //  1117: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //  1120: astore          5
        //  1122: getstatic       java/io/File.separator:Ljava/lang/String;
        //  1125: astore          6
        //  1127: new             Ljava/lang/StringBuilder;
        //  1130: dup            
        //  1131: ldc_w           "systemhealth"
        //  1134: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1137: astore          8
        //  1139: aload           8
        //  1141: aload           6
        //  1143: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1146: pop            
        //  1147: aload           8
        //  1149: ldc_w           "nativecrash"
        //  1152: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1155: pop            
        //  1156: new             Ljava/io/File;
        //  1159: dup            
        //  1160: aload           5
        //  1162: aload           8
        //  1164: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1167: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //  1170: astore          5
        //  1172: aload           5
        //  1174: invokevirtual   java/io/File.exists:()Z
        //  1177: ifeq            1349
        //  1180: aload           5
        //  1182: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //  1185: astore          5
        //  1187: aload           5
        //  1189: ifnull          1349
        //  1192: iload_2        
        //  1193: aload           5
        //  1195: arraylength    
        //  1196: if_icmpge       1349
        //  1199: aload           5
        //  1201: iload_2        
        //  1202: aaload         
        //  1203: astore          6
        //  1205: aload           6
        //  1207: invokevirtual   java/io/File.isDirectory:()Z
        //  1210: ifeq            1222
        //  1213: aload           6
        //  1215: invokestatic    vdh.bf:(Ljava/io/File;)Z
        //  1218: pop            
        //  1219: goto            1343
        //  1222: aload           6
        //  1224: invokevirtual   java/io/File.delete:()Z
        //  1227: ifeq            1331
        //  1230: getstatic       ahur.a:Lahur;
        //  1233: invokevirtual   ahbh.createBuilder:()Lahaz;
        //  1236: astore          6
        //  1238: aload           6
        //  1240: invokevirtual   ahaz.copyOnWrite:()V
        //  1243: aload           6
        //  1245: getfield        ahaz.instance:Lahbh;
        //  1248: checkcast       Lahur;
        //  1251: astore          8
        //  1253: aload           8
        //  1255: bipush          10
        //  1257: putfield        ahur.c:I
        //  1260: aload           8
        //  1262: aload           8
        //  1264: getfield        ahur.b:I
        //  1267: iconst_1       
        //  1268: ior            
        //  1269: putfield        ahur.b:I
        //  1272: aload           6
        //  1274: invokevirtual   ahaz.build:()Lahbh;
        //  1277: checkcast       Lahur;
        //  1280: astore          8
        //  1282: aload           7
        //  1284: getfield        ahcq.c:Ljava/lang/Object;
        //  1287: astore          9
        //  1289: invokestatic    aknt.d:()Laknr;
        //  1292: astore          6
        //  1294: aload           6
        //  1296: invokevirtual   ahaz.copyOnWrite:()V
        //  1299: aload           6
        //  1301: getfield        aknr.instance:Lahbh;
        //  1304: checkcast       Laknt;
        //  1307: aload           8
        //  1309: invokestatic    aknt.af:(Laknt;Lahur;)V
        //  1312: aload           9
        //  1314: aload           6
        //  1316: invokevirtual   ahaz.build:()Lahbh;
        //  1319: checkcast       Laknt;
        //  1322: invokeinterface wxx.d:(Laknt;)Z
        //  1327: pop            
        //  1328: goto            1343
        //  1331: getstatic       zll.a:Lzll;
        //  1334: getstatic       zlk.A:Lzlk;
        //  1337: ldc_w           "Unable to delete native crash dumps."
        //  1340: invokestatic    zlm.b:(Lzll;Lzlk;Ljava/lang/String;)V
        //  1343: iinc            2, 1
        //  1346: goto            1192
        //  1349: return         
        //  1350: astore          6
        //  1352: goto            898
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  453    460    463    494    Ljava/lang/SecurityException;
        //  812    824    901    926    Ljava/lang/Exception;
        //  824    844    852    901    Any
        //  844    849    901    926    Ljava/lang/Exception;
        //  854    859    862    898    Any
        //  864    898    1350   1355   Ljava/lang/Exception;
        //  898    901    901    926    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0898:
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
    
    public final void f() {
        if ((this.i.b(tnu.ac) & 0x4) != 0x0) {
            teu.k(afwm.n(tum.c((Context)this.h, (tmx)this.m.a())), (Executor)this.a, (tes)etj.b, (tet)new esc(this, 2));
            return;
        }
        this.g(null);
    }
    
    public final void g(final Boolean b) {
        final ahaz builder = ((ahbh)aipy.a).createBuilder();
        final int k = this.k(tok.b);
        builder.copyOnWrite();
        final aipy aipy = (aipy)builder.instance;
        aipy.e = k - 1;
        final int b2 = aipy.b;
        int n = 4;
        aipy.b = (b2 | 0x4);
        final int i = this.k(tok.a);
        builder.copyOnWrite();
        final aipy aipy2 = (aipy)builder.instance;
        aipy2.d = i - 1;
        aipy2.b |= 0x2;
        final int a = this.e.a(tok.c);
        if (a != 1) {
            if (a != 3) {
                if (a != 4) {
                    n = 1;
                }
            }
            else {
                n = 3;
            }
        }
        else {
            n = 2;
        }
        builder.copyOnWrite();
        final aipy aipy3 = (aipy)builder.instance;
        aipy3.c = n - 1;
        aipy3.b |= 0x1;
        final boolean c = this.k.c();
        builder.copyOnWrite();
        final aipy aipy4 = (aipy)builder.instance;
        aipy4.b |= 0x8;
        aipy4.f = c;
        final boolean d = this.k.d();
        builder.copyOnWrite();
        final aipy aipy5 = (aipy)builder.instance;
        aipy5.b |= 0x10;
        aipy5.g = d;
        final int a2 = this.k.a();
        builder.copyOnWrite();
        final aipy aipy6 = (aipy)builder.instance;
        aipy6.b |= 0x40;
        aipy6.i = a2;
        final int b3 = this.k.b();
        builder.copyOnWrite();
        final aipy aipy7 = (aipy)builder.instance;
        aipy7.b |= 0x20;
        aipy7.h = b3;
        if (b != null) {
            final boolean booleanValue = b;
            builder.copyOnWrite();
            final aipy aipy8 = (aipy)builder.instance;
            aipy8.b |= 0x80;
            aipy8.j = booleanValue;
        }
        final aknr d2 = aknt.d();
        ((ahaz)d2).copyOnWrite();
        aknt.av((aknt)d2.instance, (aipy)builder.build());
        ((wxx)this.az.a()).d((aknt)((ahaz)d2).build());
    }
    
    public final void h(final boolean b) {
        if (b) {
            final File[] listFiles = ((File)this.aX.a()).listFiles();
            if (listFiles != null) {
                for (int i = 0; i < listFiles.length; ++i) {
                    listFiles[i].delete();
                }
            }
        }
        ((aczb)this.bx.a()).d();
        ((adgc)this.by.a()).c();
        ((aczb)this.bz.a()).d();
        final WatchVideoIndexer watchVideoIndexer = (WatchVideoIndexer)this.bA.a();
        if (watchVideoIndexer.d.aa()) {
            watchVideoIndexer.a.W(new MutateRequest(4, null, null, null, null, null, null));
        }
        if (((vai)this.bc.a()).bA()) {
            ((adhu)this.bF.a()).e("PREFETCHED_HOME_RESPONSE_KEY");
        }
    }
}
