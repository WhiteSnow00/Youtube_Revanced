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
import java.util.Set;
import android.os.Process;
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

public final class esj
{
    atjj A;
    atjj B;
    atjj C;
    atjj D;
    atjj E;
    atjj F;
    atjj G;
    atjj H;
    atjj I;
    atjj J;
    atjj K;
    atjj L;
    atjj M;
    atjj N;
    atjj O;
    public atjj P;
    atjj Q;
    atjj R;
    atjj S;
    atjj T;
    atjj U;
    atjj V;
    atjj W;
    atjj X;
    atjj Y;
    atjj Z;
    ScheduledExecutorService a;
    atjj aA;
    atjj aB;
    atjj aC;
    atjj aD;
    atjj aE;
    atjj aF;
    atjj aG;
    atjj aH;
    atjj aI;
    atjj aJ;
    atjj aK;
    atjj aL;
    atjj aM;
    atjj aN;
    atjj aO;
    atjj aP;
    atjj aQ;
    atjj aR;
    atjj aS;
    atjj aT;
    atjj aU;
    atjj aV;
    atjj aW;
    atjj aX;
    atjj aY;
    atjj aZ;
    atjj aa;
    atjj ab;
    atjj ac;
    atjj ad;
    atjj ae;
    atjj af;
    atjj ag;
    atjj ah;
    atjj ai;
    atjj aj;
    atjj ak;
    atjj al;
    atjj am;
    atjj an;
    atjj ao;
    atjj ap;
    atjj aq;
    atjj ar;
    atjj as;
    atjj at;
    atjj au;
    atjj av;
    atjj aw;
    atjj ax;
    atjj ay;
    atjj az;
    public asho b;
    arhr bA;
    arhr bB;
    arhr bC;
    arhr bD;
    arhr bE;
    arhr bF;
    arhr bG;
    arhr bH;
    arhr bI;
    arhr bJ;
    arhr bK;
    arhr bL;
    atjj bM;
    arhr bN;
    public FileObserver bO;
    public final atjd bP;
    public final atit bQ;
    uyf bR;
    private tdc bS;
    atjj ba;
    atjj bb;
    atjj bc;
    atjj bd;
    atjj be;
    atjj bf;
    atjj bg;
    atjj bh;
    atjj bi;
    atjj bj;
    atjj bk;
    atjj bl;
    atjj bm;
    atjj bn;
    atjj bo;
    atjj bp;
    atjj bq;
    atjj br;
    atjj bs;
    atjj bt;
    atjj bu;
    atjj bv;
    atjj bw;
    arhr bx;
    arhr by;
    arhr bz;
    SharedPreferences c;
    public ewl d;
    tme e;
    tmj f;
    oas g;
    Application h;
    public tlq i;
    uxc j;
    tlt k;
    ListenableFuture l;
    atjj m;
    atjj n;
    atjj o;
    atjj p;
    atjj q;
    atjj r;
    atjj s;
    atjj t;
    atjj u;
    atjj v;
    atjj w;
    atjj x;
    atjj y;
    atjj z;
    
    public esj() {
        this.bP = atjd.af();
        this.bQ = atit.aa();
    }
    
    private final void j(final tdz tdz, final long n, final tac tac) {
        if (n > 0L) {
            final tdc tdc = (tdc)tac.a((Object)n);
            if (this.i.m(tlq.ab)) {
                tdz.d((Object)tdc);
                return;
            }
            tdz.f((Object)tdc);
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
        final vjf a = this.j.a();
        final tdz tdz = (tdz)this.C.a();
        this.j(tdz, a.g.d, (tac)ery.b);
        this.j(tdz, a.f.d, (tac)ery.a);
        this.j(tdz, a.e.d, (tac)ery.c);
    }
    
    public final void b(final boolean b, final Throwable t) {
        final int n = 0;
        wzo[] array = new wzo[0];
        if (((uyi)this.bf.a()).f(45367223L)) {
            array = new wzo[] { (wzo)this.bm.a() };
        }
        tmd.b.g();
        final wyo wyo = (wyo)this.q.a();
        final tmd a = this.d.a;
        final tmj f = this.f;
        this.e.a(tme.a);
        String i;
        if (!b) {
            i = "cold";
        }
        else {
            i = "frozenFirstInstall";
        }
        final String[] a2 = wzr.a;
        if (tmd.m()) {
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
                final long a3 = afqo.a(f.c());
                final List c = a.c;
                final ArrayList list = new ArrayList(Arrays.asList(array));
                if (tmd.n(4096)) {
                    list.add((Object)new wzq(wyo));
                }
                final wzp wzp = new wzp((Iterable)list);
                ((wzo)wzp).b();
                ((wzo)wzp).e(plus.toMillis());
                final agza builder = ((agzi)alkg.a).createBuilder();
                builder.copyOnWrite();
                final alkg alkg = (alkg)builder.instance;
                alkg.b |= 0x10;
                alkg.i = i;
                final int availableProcessors = Runtime.getRuntime().availableProcessors();
                builder.copyOnWrite();
                final alkg alkg2 = (alkg)builder.instance;
                alkg2.c |= 0x200;
                alkg2.F = availableProcessors;
                final String sdk = Build$VERSION.SDK;
                builder.copyOnWrite();
                final alkg alkg3 = (alkg)builder.instance;
                sdk.getClass();
                alkg3.c |= 0x400;
                alkg3.G = sdk;
                if (t != null) {
                    builder.copyOnWrite();
                    final alkg alkg4 = (alkg)builder.instance;
                    alkg4.I = 1;
                    alkg4.c |= 0x8000;
                    zjp.c(zjo.b, zjn.r, "SS wait for schedulers", t);
                }
                ((wzo)wzp).c((alkg)builder.build());
                final ArrayList list2 = new ArrayList(256);
                for (final tmb tmb : c) {
                    final tlz[] a4 = tmb.a;
                    for (int j = 0; j < 2; ++j) {
                        a4[j].c((List)list2);
                    }
                    final Iterator iterator2 = tmb.b.iterator();
                    while (iterator2.hasNext()) {
                        zjp.c(zjo.b, zjn.r, "SS non fatal error", (Throwable)iterator2.next());
                    }
                }
                final HashSet set = new HashSet();
                final tdb k = a.j;
                for (int size = list2.size(), l = n; l < size; ++l) {
                    final String c2 = ((tml)list2.get(l)).c();
                    if (!c2.equals("null")) {
                        set.add(c2);
                    }
                }
                final aukm aukm = new aukm((byte[])null, (byte[])null, (byte[])null);
                final tml b4 = tmd.b;
                wzr.c(b4, aukm, 0, new aeda(), (Map)new HashMap(), (affr)afcc.k());
                wzr.b(b4, (wzo)wzp, a3);
                ((wzo)wzp).a();
            }
        }
        final tmd a5 = this.d.a;
        final tmi g = a5.g;
        final Iterator iterator3 = tck.a.iterator();
        while (iterator3.hasNext()) {
            ((List)((tck)iterator3.next()).b.a).remove(g);
        }
        final tmi g2 = a5.g;
        final Iterator iterator4 = tcj.a.iterator();
        if (!iterator4.hasNext()) {
            final kju m = a5.i;
            if (m != null) {
                m.a();
            }
            if (!this.i.m(tlq.aB)) {
                this.f();
            }
            return;
        }
        final tcj tcj = (tcj)iterator4.next();
        throw null;
    }
    
    public final void c() {
        szc.f();
        final fzo fzo = new fzo((wzd)this.P.a(), (tdz)this.C.a());
        ((wzd)fzo.a).d((Class)fgj.class, (wyz)new fgd(0)).c((Class)fgl.class);
        ((wzd)fzo.a).m((Class)fgg.class, (Class)fgk.class, (wyz)new fgd(1));
        ((wzd)fzo.a).j((Class)fgj.class, "f_unknown");
        ((wzd)fzo.a).j((Class)fgg.class, "f_proc");
        ((wzd)fzo.a).i((Class)fgj.class, (wza)new fgr(1));
        final abhs abhs = (abhs)this.aZ.a();
        final yzo yzo = (yzo)this.W.a();
        final tlq i = this.i;
        abhs.getClass();
        yzo.getClass();
        i.getClass();
        final fgt fgt = new fgt();
        final boolean m = i.m(tlq.G);
        Serializable s;
        if (m) {
            s = acgs.class;
        }
        else {
            s = fhc.class;
        }
        final wzb e = ((wzd)fzo.a).e((Class)fge.class, (Class)fgk.class, (wyz)new fgd(2), true);
        e.b((Class)fgw.class);
        e.c((Class)fhb.class);
        e.c((Class)s);
        if (i.m(tlq.H)) {
            e.c((Class)fgy.class);
        }
        final ryc ryc = new ryc(abhs, yzo, (aeyr)fgt, 3, (short[])null);
        final wzb e2 = ((wzd)fzo.a).e((Class)fgm.class, (Class)fgk.class, (wyz)ryc, true);
        e2.b((Class)fgx.class);
        e2.c((Class)aakw.class);
        e2.c((Class)aakx.class);
        e2.c((Class)aakt.class);
        e2.c((Class)aalc.class);
        e2.c((Class)abip.class);
        e2.c((Class)aaks.class);
        final wzb e3 = ((wzd)fzo.a).e((Class)fgh.class, (Class)fgf.class, (wyz)new fgd(4), true);
        e3.b((Class)fhx.class);
        e3.b((Class)fhv.class);
        e3.c((Class)fib.class);
        final wzb f = ((wzd)fzo.a).f((Class)fid.class, (wyz)ryc, (aext)new fgq(fzo, null, null));
        f.c((Class)aakw.class);
        f.c((Class)aakx.class);
        f.c((Class)aakt.class);
        f.c((Class)fid.class);
        f.c((Class)aalc.class);
        f.c((Class)abip.class);
        f.c((Class)aaks.class);
        final wzb d = ((wzd)fzo.a).d((Class)fhg.class, (wyz)new ffh(1));
        d.c((Class)fhh.class);
        d.c((Class)fhi.class);
        d.c((Class)fhk.class);
        d.c((Class)fhj.class);
        d.c((Class)fhl.class);
        d.c((Class)fhr.class);
        if (!m) {
            ((wzd)fzo.a).e((Class)acgt.class, (Class)fgf.class, (wyz)new ffh(5), false).c((Class)acgs.class);
        }
        ((wzd)fzo.a).e((Class)acgr.class, (Class)fgi.class, (wyz)new ffh(6), false).c((Class)acgq.class);
        final wzb d2 = ((wzd)fzo.a).d((Class)aalc.class, (wyz)ryc);
        d2.c((Class)aakw.class);
        d2.c((Class)aakx.class);
        d2.c((Class)aakt.class);
        d2.c((Class)fid.class);
        d2.c((Class)aalc.class);
        d2.c((Class)abip.class);
        d2.c((Class)aaks.class);
        final wzb d3 = ((wzd)fzo.a).d((Class)rys.class, (wyz)new ryc(abhs, yzo, (aeyr)fgt, 1, (byte[])null));
        d3.c((Class)aakw.class);
        d3.c((Class)aakx.class);
        d3.c((Class)aakt.class);
        d3.b((Class)fid.class);
        d3.b((Class)aalc.class);
        d3.b((Class)abip.class);
        d3.b((Class)aaks.class);
        final wzb d4 = ((wzd)fzo.a).d((Class)ryx.class, (wyz)new ryc(abhs, yzo, (aeyr)fgt, 2, (char[])null));
        d4.c((Class)aakw.class);
        d4.c((Class)aakx.class);
        d4.c((Class)aakt.class);
        d4.b((Class)ryw.class);
        d4.b((Class)fid.class);
        d4.b((Class)aalc.class);
        d4.b((Class)abip.class);
        d4.b((Class)aaks.class);
        final wzb d5 = ((wzd)fzo.a).d((Class)rzj.class, (wyz)new ryc(abhs, yzo, (aeyr)fgt, 0));
        d5.c((Class)aakw.class);
        d5.c((Class)aakx.class);
        d5.c((Class)aakt.class);
        d5.b((Class)fid.class);
        d5.b((Class)aalc.class);
        d5.b((Class)abip.class);
        d5.b((Class)aaks.class);
        final wzb d6 = ((wzd)fzo.a).d((Class)rzr.class, (wyz)new aajq("va"));
        d6.c((Class)ryx.class);
        d6.b((Class)ryw.class);
        d6.b((Class)fid.class);
        final wzb d7 = ((wzd)fzo.a).d((Class)rzi.class, (wyz)new aajq("av"));
        d7.c((Class)rzh.class);
        d7.b((Class)fid.class);
        d7.b((Class)aalc.class);
        d7.b((Class)abip.class);
        d7.b((Class)aaks.class);
        final wzb d8 = ((wzd)fzo.a).d((Class)ffc.class, (wyz)new ffh(0));
        d8.c((Class)aakw.class);
        d8.c((Class)aakx.class);
        d8.b((Class)abip.class);
        d8.b((Class)ffb.class);
        d8.b((Class)ffc.class);
        ((wzd)fzo.a).j((Class)fge.class, "f_home");
        ((wzd)fzo.a).j((Class)fgm.class, "f_watch");
        ((wzd)fzo.a).j((Class)fgh.class, "f_search");
        ((wzd)fzo.a).j((Class)fgl.class, "f_unknown_e");
        ((wzd)fzo.a).j((Class)fgv.class, "app_l");
        ((wzd)fzo.a).j((Class)fgw.class, "ol_i");
        ((wzd)fzo.a).j((Class)fgx.class, "pl_int");
        ((wzd)fzo.a).j((Class)fgu.class, "cfg_a");
        ((wzd)fzo.a).j((Class)fhm.class, "cfg_c");
        ((wzd)fzo.a).j((Class)fhq.class, "cfg_h");
        ((wzd)fzo.a).i((Class)fha.class, (wza)fgp.b);
        ((wzd)fzo.a).j((Class)fha.class, "bres");
        ((wzd)fzo.a).j((Class)fgz.class, "brer");
        ((wzd)fzo.a).j((Class)uyv.class, "brns");
        ((wzd)fzo.a).j((Class)uyu.class, "brnr");
        ((wzd)fzo.a).j((Class)uyt.class, "brps");
        ((wzd)fzo.a).j((Class)uys.class, "brpe");
        ((wzd)fzo.a).j((Class)fhb.class, "br_e");
        ((wzd)fzo.a).j((Class)fhl.class, "br_s");
        ((wzd)fzo.a).j((Class)fhg.class, "br_r");
        ((wzd)fzo.a).j((Class)fhc.class, "ol");
        ((wzd)fzo.a).j((Class)fgy.class, "aa");
        ((wzd)fzo.a).j((Class)fih.class, "ui_l");
        ((wzd)fzo.a).j((Class)fid.class, "pl_int");
        ((wzd)fzo.a).j((Class)fhu.class, "rurl_s");
        ((wzd)fzo.a).j((Class)fht.class, "rurl_r");
        ((wzd)fzo.a).j((Class)uzb.class, "rurlps");
        ((wzd)fzo.a).j((Class)uza.class, "rurlpe");
        ((wzd)fzo.a).j((Class)fhh.class, "br_ld");
        ((wzd)fzo.a).j((Class)fhi.class, "brr_e");
        ((wzd)fzo.a).j((Class)fhk.class, "brr_i");
        ((wzd)fzo.a).j((Class)fhj.class, "brr_ius");
        ((wzd)fzo.a).j((Class)fhr.class, "ne_r");
        ((wzd)fzo.a).j((Class)fic.class, "sr_ui");
        ((wzd)fzo.a).j((Class)fhz.class, "sr_pa");
        ((wzd)fzo.a).j((Class)fia.class, "sr_s");
        ((wzd)fzo.a).j((Class)fhy.class, "sr_r");
        ((wzd)fzo.a).j((Class)fhv.class, "sr_e");
        ((wzd)fzo.a).j((Class)fhx.class, "sf_i");
        ((wzd)fzo.a).j((Class)fib.class, "sr_p");
        ((wzd)fzo.a).j((Class)uzd.class, "ssns");
        ((wzd)fzo.a).j((Class)uzc.class, "ssnr");
        ((wzd)fzo.a).j((Class)fhp.class, "gu_s");
        ((wzd)fzo.a).j((Class)fho.class, "gu_r");
        ((wzd)fzo.a).j((Class)fhn.class, "gu_e");
        final Object a = fzo.a;
        ((wzd)a).j((Class)acgt.class, "thmon_s");
        ((wzd)a).j((Class)acgs.class, "thmon_e");
        ((wzd)a).j((Class)acgr.class, "thmon_s");
        ((wzd)a).j((Class)acgq.class, "thmon_e");
        ((wzd)a).k((Class)acgx.class, (wzc)new acgn(0));
        ((wzd)a).k((Class)acgw.class, (wzc)new acgn(0));
        ((wzd)a).k((Class)acgv.class, (wzc)new acgn(0));
        ((wzd)a).k((Class)acgu.class, (wzc)new acgn(0));
        ((wzd)a).i((Class)acgx.class, (wza)fgp.s);
        ((wzd)fzo.a).j((Class)fif.class, "th0_sc");
        ((wzd)fzo.a).j((Class)fie.class, "th0_cc");
        ((wzd)fzo.a).j((Class)fig.class, "th0_sr");
        ((wzd)fzo.a).j((Class)fij.class, "uiwwa_c");
        ((wzd)fzo.a).j((Class)fin.class, "uiwwa_s");
        ((wzd)fzo.a).j((Class)fim.class, "uiwwa_r");
        ((wzd)fzo.a).j((Class)fik.class, "uiwwa_pr");
        ((wzd)fzo.a).j((Class)fil.class, "uiwwa_e");
        ((wzd)fzo.a).j((Class)fii.class, "uiwwa_oac");
        ((wzd)fzo.a).j((Class)fip.class, "uiwwa_rfs");
        ((wzd)fzo.a).j((Class)fio.class, "uiwwa_rfe");
        ((wzd)fzo.a).j((Class)fhd.class, "uibf_c");
        ((wzd)fzo.a).j((Class)fhf.class, "uibf_s");
        ((wzd)fzo.a).j((Class)fhe.class, "uibf_r");
        ((wzd)fzo.a).j((Class)fhs.class, "uipb_gld");
        ((wzd)fzo.a).j((Class)fhw.class, "uisf_r");
        ((wzd)fzo.a).j((Class)fff.class, "im_d");
        ((wzd)fzo.a).j((Class)fff.class, "im_s");
        ((wzd)fzo.a).j((Class)ffe.class, "im_po");
        ((wzd)fzo.a).j((Class)ffd.class, "im_pl");
        ((wzd)fzo.a).j((Class)ffc.class, "im_vs");
        ((wzd)fzo.a).j((Class)ffp.class, "js_is");
        ((wzd)fzo.a).j((Class)ffj.class, "js_if");
        ((wzd)fzo.a).j((Class)ffo.class, "js_ebs");
        ((wzd)fzo.a).j((Class)ffn.class, "js_ebf");
        ((wzd)fzo.a).j((Class)ffm.class, "js_ebc");
        ((wzd)fzo.a).j((Class)ffl.class, "js_eas");
        ((wzd)fzo.a).j((Class)ffk.class, "js_eaf");
        ((wzd)fzo.a).i((Class)vhq.class, (wza)new fgr(0));
        ((tdz)fzo.b).a((Object)fzo, (Class)vhq.class, (tea)fgt);
        ((wzd)fzo.a).i((Class)fgl.class, (wza)new fgr(2));
        ((wzd)fzo.a).i((Class)wxj.class, (wza)fgp.a);
        final Object a2 = fzo.a;
        ((wzd)a2).j((Class)aaku.class, "pl_i");
        ((wzd)a2).j((Class)aakv.class, "pl_r");
        ((wzd)a2).j((Class)aala.class, "ps_s");
        ((wzd)a2).j((Class)aakz.class, "ps_r");
        ((wzd)a2).j((Class)uyz.class, "psns");
        ((wzd)a2).j((Class)uyy.class, "psnr");
        ((wzd)a2).j((Class)uyx.class, "psps");
        ((wzd)a2).j((Class)uyw.class, "pspe");
        ((wzd)a2).j((Class)aalg.class, "wn_s");
        ((wzd)a2).j((Class)aalf.class, "wn_r");
        ((wzd)a2).j((Class)uzf.class, "wnps");
        ((wzd)a2).j((Class)uze.class, "wnpe");
        ((wzd)a2).j((Class)aako.class, "pl_efa");
        ((wzd)a2).j((Class)aakp.class, "pl_efh");
        ((wzd)a2).j((Class)aale.class, "sw_s");
        ((wzd)a2).j((Class)aald.class, "sw_r");
        ((wzd)a2).j((Class)aakq.class, "pc");
        ((wzd)a2).j((Class)aalb.class, "pl_s");
        ((wzd)a2).j((Class)aaky.class, "pl_c");
        ((wzd)a2).j((Class)aakw.class, "pbs");
        ((wzd)a2).j((Class)aakr.class, "pbi");
        ((wzd)a2).j((Class)aakx.class, "pbu");
        ((wzd)a2).j((Class)aakt.class, "pbp");
        ((wzd)a2).j((Class)aalc.class, "pl_int");
        ((wzd)a2).j((Class)abip.class, "pl_ex");
        ((wzd)a2).j((Class)aaks.class, "pl_int");
        ((wzd)a2).i((Class)aakz.class, (wza)fgp.l);
        ((wzd)a2).k((Class)aaly.class, (wzc)aajo.a);
        ((wzd)a2).i((Class)aaly.class, (wza)fgp.m);
        ((wzd)a2).i((Class)abip.class, (wza)fgp.n);
        ((wzd)a2).i((Class)abhc.class, (wza)fgp.o);
        ((wzd)a2).i((Class)ynk.class, (wza)fgp.p);
        ((wzd)a2).i((Class)aalb.class, (wza)fgp.q);
        ((wzd)a2).i((Class)aakw.class, (wza)fgp.r);
        zbm.a(a2);
        xyl.a((wzd)a2);
        final Object a3 = fzo.a;
        ((wzd)a3).j((Class)rzc.class, "ab_s");
        ((wzd)a3).j((Class)rzb.class, "ab_r");
        ((wzd)a3).j((Class)rze.class, "ad_bl");
        ((wzd)a3).j((Class)ryw.class, "ad_ba");
        ((wzd)a3).j((Class)ryz.class, "msti");
        ((wzd)a3).j((Class)ryy.class, "mstr");
        ((wzd)a3).j((Class)rza.class, "ad_bp");
        ((wzd)a3).j((Class)rzg.class, "ads_s");
        ((wzd)a3).j((Class)rzf.class, "ads_e");
        ((wzd)a3).j((Class)ryx.class, "ab_cre");
        ((wzd)a3).j((Class)rzh.class, "ad_pre");
        ((wzd)a3).j((Class)rzt.class, "pacf_ss");
        ((wzd)a3).j((Class)rzs.class, "pacf_sb");
        ((wzd)a3).j((Class)rzu.class, "pacf_ssc");
        ((wzd)a3).j((Class)rzl.class, "pacf_ls");
        ((wzd)a3).j((Class)rzk.class, "pacf_lb");
        ((wzd)a3).j((Class)rzm.class, "pacf_lsc");
        ((wzd)a3).j((Class)rzv.class, "ad_vr");
        ((wzd)a3).j((Class)rzq.class, "pb_s");
        ((wzd)a3).j((Class)rzo.class, "pb_c");
        ((wzd)a3).j((Class)rzn.class, "pb_ca");
        ((wzd)a3).j((Class)rzp.class, "pb_f");
        ((wzd)a3).k((Class)rzy.class, (wzc)new acgn(1));
        ((wzd)a3).i((Class)rzy.class, (wza)new fgr(3));
        ((wzd)a3).i((Class)ryv.class, (wza)new fgr(4));
        ((wzd)a3).i((Class)aaly.class, (wza)fgp.c);
        ((wzd)a3).i((Class)aakr.class, (wza)fgp.d);
        ((wzd)a3).i((Class)rzd.class, (wza)new fgr(5));
        ((wzd)a3).i((Class)rzi.class, (wza)new fgr(6));
        ((wzd)a3).i((Class)rys.class, (wza)new fgr(7));
        ((wzd)a3).i((Class)rzq.class, (wza)new fgr(8));
        ((wzd)a3).i((Class)rzo.class, (wza)new fgr(9));
        ((wzd)a3).i((Class)rzp.class, (wza)new fgr(10));
        final sin sin = new sin((wzd)fzo.a);
        if (!sin.a) {
            final wzb f2 = ((wzd)sin.b).f((Class)fgb.class, (wyz)new ffh(2), (aext)new ffq(sin, null, null));
            f2.c((Class)ffr.class);
            f2.c((Class)ffs.class);
            f2.b((Class)ffz.class);
            f2.b((Class)fft.class);
            f2.b((Class)fga.class);
            ((wzd)sin.b).j((Class)fgb.class, "ytro_s");
            ((wzd)sin.b).j((Class)ffu.class, "purb_c");
            ((wzd)sin.b).j((Class)ffy.class, "walti_s");
            ((wzd)sin.b).j((Class)ffv.class, "walnt_s");
            ((wzd)sin.b).j((Class)ffw.class, "walpt_s");
            ((wzd)sin.b).j((Class)ffx.class, "wali_s");
            ((wzd)sin.b).j((Class)ffr.class, "wali_c");
            ((wzd)sin.b).j((Class)fft.class, "waltr_f");
            ((wzd)sin.b).j((Class)ffz.class, "waltr_s");
            ((wzd)sin.b).j((Class)ffs.class, "waltr_c");
            ((wzd)sin.b).j((Class)fga.class, "ytrmsp_s");
            sin.a = true;
        }
        final Object a4 = fzo.a;
        ((wzd)a4).j((Class)abdo.class, "pft_i");
        ((wzd)a4).j((Class)abdn.class, "pbf_c");
        this.h.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new fgs(fzo, this.n, (byte[])null, (byte[])null));
    }
    
    public final void d() {
        szc.f();
        boolean booleanValue;
        try {
            booleanValue = (boolean)this.l.get(500L, TimeUnit.MILLISECONDS);
        }
        catch (final ExecutionException | TimeoutException | InterruptedException ex) {
            booleanValue = false;
        }
        final long millis = this.f.a().toMillis();
        final tmj f = this.f;
        long millis2 = f.a().plus(f.c()).toMillis();
        final fes fes = (fes)this.as.a();
        final boolean booleanValue2 = (boolean)this.bo.a();
        szc.f();
        fes.d = millis2;
        fes.c = booleanValue;
        fes.a.f((Object)new fgj(millis, booleanValue, booleanValue2));
        fes.b.s(20);
        if (((uyi)this.bi.a()).l(45373804L).aG()) {
            final tdc bs = this.bS;
            long n;
            if (bs == null) {
                n = Process.getStartElapsedRealtime();
            }
            else {
                n = ((tei)bs).h();
            }
            millis2 = n + (this.g.c() - TimeUnit.NANOSECONDS.toMillis(this.g.e()));
        }
        ((hnd)this.bn.a()).a = millis2;
        final tdz tdz = (tdz)this.C.a();
        final Set set = (Set)this.O.a();
        final boolean ak = ((uyi)this.bd.a()).aK();
        for (final bhu bhu : set) {
            ((wzd)this.P.a()).j((Class)fir.class, "proc_k");
            final Duration b = ((tmj)bhu.a).b();
            tdc bs2;
            if (b == null) {
                bs2 = null;
            }
            else {
                bs2 = new fir(b.toMillis());
            }
            this.bS = bs2;
            if (bs2 != null) {
                tdz.f((Object)bs2);
                if (!ak) {
                    break;
                }
                continue;
            }
        }
        if (!this.i.m(tlq.ab)) {
            this.a();
        }
        final kep kep = (kep)this.n.a();
        szc.f();
        final MessageQueue myQueue = Looper.myQueue();
        myQueue.removeIdleHandler((MessageQueue$IdleHandler)kep.c);
        myQueue.addIdleHandler((MessageQueue$IdleHandler)kep.c);
        kep.a = false;
        this.bQ.tu();
    }
    
    public final void e(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        esj.ag:Latjj;
        //     4: invokeinterface atjj.a:()Ljava/lang/Object;
        //     9: checkcast       Ladei;
        //    12: astore_2       
        //    13: aload_0        
        //    14: getfield        esj.aA:Latjj;
        //    17: astore_3       
        //    18: aload_2        
        //    19: getfield        adei.d:Ljava/lang/Object;
        //    22: checkcast       Ladeh;
        //    25: astore          4
        //    27: aload           4
        //    29: getfield        adeh.a:Ljava/lang/Object;
        //    32: checkcast       Ladgw;
        //    35: getfield        adgw.e:Ljava/lang/Object;
        //    38: astore          5
        //    40: iconst_0       
        //    41: istore          6
        //    43: iload_1        
        //    44: ifeq            1031
        //    47: aload           5
        //    49: checkcast       Ltmm;
        //    52: astore          5
        //    54: aload           5
        //    56: getfield        tmm.v:I
        //    59: istore          6
        //    61: iload           6
        //    63: iconst_2       
        //    64: if_icmpne       82
        //    67: aload           4
        //    69: invokevirtual   adeh.a:()Ladgo;
        //    72: getfield        adgo.h:Ladgw;
        //    75: aload_3        
        //    76: invokestatic    adge.b:(Ladgw;Latjj;)V
        //    79: goto            391
        //    82: iload           6
        //    84: iconst_1       
        //    85: if_icmpne       106
        //    88: aload           4
        //    90: invokevirtual   adeh.d:()Ladgw;
        //    93: getfield        adgw.f:Ljava/lang/Object;
        //    96: checkcast       Ladgw;
        //    99: aload_3        
        //   100: invokestatic    adge.b:(Ladgw;Latjj;)V
        //   103: goto            391
        //   106: iload           6
        //   108: iconst_3       
        //   109: if_icmpne       252
        //   112: aload           4
        //   114: invokevirtual   adeh.b:()Ladgq;
        //   117: getfield        adgq.c:Ladgf;
        //   120: astore          7
        //   122: getstatic       adgb.a:I
        //   125: istore          6
        //   127: aload           7
        //   129: getfield        adgf.a:Ladgw;
        //   132: invokestatic    adio.w:(Ladgw;)Ljava/util/List;
        //   135: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   140: astore          8
        //   142: aload           8
        //   144: invokeinterface java/util/Iterator.hasNext:()Z
        //   149: ifeq            391
        //   152: aload           8
        //   154: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   159: checkcast       Ljava/io/File;
        //   162: astore          4
        //   164: aload           4
        //   166: invokestatic    adio.s:(Ljava/io/File;)Lahsm;
        //   169: astore          9
        //   171: aload           9
        //   173: ifnull          244
        //   176: aload           9
        //   178: getfield        ahsm.c:Z
        //   181: ifne            244
        //   184: aload           9
        //   186: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   189: pop            
        //   190: invokestatic    aklq.d:()Laklo;
        //   193: astore          10
        //   195: aload           10
        //   197: invokevirtual   agza.copyOnWrite:()V
        //   200: aload           10
        //   202: getfield        aklo.instance:Lagzi;
        //   205: checkcast       Laklq;
        //   208: aload           9
        //   210: invokestatic    aklq.bj:(Laklq;Lahsm;)V
        //   213: aload           10
        //   215: invokevirtual   agza.build:()Lagzi;
        //   218: checkcast       Laklq;
        //   221: astore          10
        //   223: aload           7
        //   225: getfield        adgf.b:Latjj;
        //   228: invokeinterface atjj.a:()Ljava/lang/Object;
        //   233: checkcast       Lwvu;
        //   236: aload           10
        //   238: invokeinterface wvu.d:(Laklq;)Z
        //   243: pop            
        //   244: aload           4
        //   246: invokestatic    adio.m:(Ljava/io/File;)V
        //   249: goto            142
        //   252: iload           6
        //   254: iconst_4       
        //   255: if_icmpne       391
        //   258: aload           4
        //   260: getfield        adeh.e:Ljava/lang/Object;
        //   263: invokeinterface atjj.a:()Ljava/lang/Object;
        //   268: checkcast       Ladgt;
        //   271: getfield        adgt.i:Ladgw;
        //   274: astore          4
        //   276: getstatic       adgb.a:I
        //   279: istore          6
        //   281: aload           4
        //   283: invokestatic    adio.w:(Ladgw;)Ljava/util/List;
        //   286: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   291: astore          8
        //   293: aload           8
        //   295: invokeinterface java/util/Iterator.hasNext:()Z
        //   300: ifeq            391
        //   303: aload           8
        //   305: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   310: checkcast       Ljava/io/File;
        //   313: astore          4
        //   315: aload           4
        //   317: invokestatic    adio.s:(Ljava/io/File;)Lahsm;
        //   320: astore          7
        //   322: aload           7
        //   324: ifnull          383
        //   327: aload           7
        //   329: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   332: pop            
        //   333: invokestatic    aklq.d:()Laklo;
        //   336: astore          10
        //   338: aload           10
        //   340: invokevirtual   agza.copyOnWrite:()V
        //   343: aload           10
        //   345: getfield        aklo.instance:Lagzi;
        //   348: checkcast       Laklq;
        //   351: aload           7
        //   353: invokestatic    aklq.bj:(Laklq;Lahsm;)V
        //   356: aload           10
        //   358: invokevirtual   agza.build:()Lagzi;
        //   361: checkcast       Laklq;
        //   364: astore          7
        //   366: aload_3        
        //   367: invokeinterface atjj.a:()Ljava/lang/Object;
        //   372: checkcast       Lwvu;
        //   375: aload           7
        //   377: invokeinterface wvu.d:(Laklq;)Z
        //   382: pop            
        //   383: aload           4
        //   385: invokestatic    adio.m:(Ljava/io/File;)V
        //   388: goto            293
        //   391: aload           5
        //   393: getfield        tmm.w:I
        //   396: iconst_1       
        //   397: if_icmpne       717
        //   400: aload_2        
        //   401: getfield        adei.d:Ljava/lang/Object;
        //   404: checkcast       Ladeh;
        //   407: getfield        adeh.g:Ljava/lang/Object;
        //   410: invokeinterface atjj.a:()Ljava/lang/Object;
        //   415: checkcast       Laeim;
        //   418: astore          7
        //   420: aload           7
        //   422: getfield        aeim.a:Ljava/lang/Object;
        //   425: invokeinterface atjj.a:()Ljava/lang/Object;
        //   430: checkcast       Lcom/google/android/libraries/youtube/systemhealth/termination/NativeCrashDetectorUtil;
        //   433: astore          4
        //   435: aload           7
        //   437: getfield        aeim.b:Ljava/lang/Object;
        //   440: checkcast       Ladgw;
        //   443: getfield        adgw.c:Ljava/lang/Object;
        //   446: checkcast       Landroid/content/Context;
        //   449: invokestatic    com/google/android/libraries/youtube/systemhealth/termination/NativeCrashDetectorUtil.b:(Landroid/content/Context;)Ljava/io/File;
        //   452: astore          8
        //   454: aload           8
        //   456: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //   459: astore          4
        //   461: goto            495
        //   464: astore          4
        //   466: getstatic       zjo.a:Lzjo;
        //   469: getstatic       zjn.A:Lzjn;
        //   472: ldc_w           "!list '%s'"
        //   475: iconst_1       
        //   476: anewarray       Ljava/lang/Object;
        //   479: dup            
        //   480: iconst_0       
        //   481: aload           8
        //   483: aastore        
        //   484: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   487: aload           4
        //   489: invokestatic    zjp.c:(Lzjo;Lzjn;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   492: aconst_null    
        //   493: astore          4
        //   495: aload           4
        //   497: ifnonnull       503
        //   500: goto            717
        //   503: aload_3        
        //   504: invokeinterface atjj.a:()Ljava/lang/Object;
        //   509: checkcast       Lwvu;
        //   512: astore          8
        //   514: aload           7
        //   516: getfield        aeim.b:Ljava/lang/Object;
        //   519: checkcast       Ladgw;
        //   522: getfield        adgw.a:J
        //   525: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   528: astore          7
        //   530: aload           4
        //   532: arraylength    
        //   533: istore          11
        //   535: iconst_0       
        //   536: istore          6
        //   538: iload           6
        //   540: iload           11
        //   542: if_icmpge       717
        //   545: aload           4
        //   547: iload           6
        //   549: aaload         
        //   550: astore          10
        //   552: aload           10
        //   554: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   557: aload           7
        //   559: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   562: ifeq            568
        //   565: goto            711
        //   568: aload           10
        //   570: invokevirtual   java/io/File.isDirectory:()Z
        //   573: ifeq            585
        //   576: aload           10
        //   578: invokestatic    uji.W:(Ljava/io/File;)Z
        //   581: pop            
        //   582: goto            711
        //   585: aload           10
        //   587: invokevirtual   java/io/File.delete:()Z
        //   590: ifeq            687
        //   593: getstatic       ahst.a:Lahst;
        //   596: invokevirtual   agzi.createBuilder:()Lagza;
        //   599: astore          9
        //   601: aload           9
        //   603: invokevirtual   agza.copyOnWrite:()V
        //   606: aload           9
        //   608: getfield        agza.instance:Lagzi;
        //   611: checkcast       Lahst;
        //   614: astore          10
        //   616: aload           10
        //   618: bipush          10
        //   620: putfield        ahst.c:I
        //   623: aload           10
        //   625: aload           10
        //   627: getfield        ahst.b:I
        //   630: iconst_1       
        //   631: ior            
        //   632: putfield        ahst.b:I
        //   635: aload           9
        //   637: invokevirtual   agza.build:()Lagzi;
        //   640: checkcast       Lahst;
        //   643: astore          10
        //   645: invokestatic    aklq.d:()Laklo;
        //   648: astore          9
        //   650: aload           9
        //   652: invokevirtual   agza.copyOnWrite:()V
        //   655: aload           9
        //   657: getfield        aklo.instance:Lagzi;
        //   660: checkcast       Laklq;
        //   663: aload           10
        //   665: invokestatic    aklq.ae:(Laklq;Lahst;)V
        //   668: aload           8
        //   670: aload           9
        //   672: invokevirtual   agza.build:()Lagzi;
        //   675: checkcast       Laklq;
        //   678: invokeinterface wvu.d:(Laklq;)Z
        //   683: pop            
        //   684: goto            711
        //   687: getstatic       zjo.a:Lzjo;
        //   690: getstatic       zjn.A:Lzjn;
        //   693: ldc_w           "!del '%s'"
        //   696: iconst_1       
        //   697: anewarray       Ljava/lang/Object;
        //   700: dup            
        //   701: iconst_0       
        //   702: aload           10
        //   704: aastore        
        //   705: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   708: invokestatic    zjp.b:(Lzjo;Lzjn;Ljava/lang/String;)V
        //   711: iinc            6, 1
        //   714: goto            538
        //   717: aload           5
        //   719: getfield        tmm.x:I
        //   722: iconst_1       
        //   723: if_icmpne       740
        //   726: aload_2        
        //   727: getfield        adei.d:Ljava/lang/Object;
        //   730: checkcast       Ladeh;
        //   733: invokevirtual   adeh.c:()Ladgu;
        //   736: aload_3        
        //   737: invokevirtual   adgu.b:(Latjj;)V
        //   740: aload           5
        //   742: getfield        tmm.y:Z
        //   745: ifeq            1321
        //   748: aload_2        
        //   749: getfield        adei.d:Ljava/lang/Object;
        //   752: checkcast       Ladeh;
        //   755: getfield        adeh.h:Ljava/lang/Object;
        //   758: invokeinterface atjj.a:()Ljava/lang/Object;
        //   763: checkcast       Laeim;
        //   766: getfield        aeim.b:Ljava/lang/Object;
        //   769: astore          4
        //   771: getstatic       adgy.d:Ladgy;
        //   774: astore_2       
        //   775: aload           4
        //   777: checkcast       Ladgw;
        //   780: aload_2        
        //   781: iconst_0       
        //   782: invokestatic    adio.q:(Ladgw;Ladgy;Z)Ljava/util/List;
        //   785: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   790: astore          8
        //   792: aload           8
        //   794: invokeinterface java/util/Iterator.hasNext:()Z
        //   799: ifeq            1321
        //   802: aload           8
        //   804: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   809: checkcast       Ljava/io/File;
        //   812: astore          5
        //   814: new             Ljava/io/FileInputStream;
        //   817: astore_2       
        //   818: aload_2        
        //   819: aload           5
        //   821: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   824: invokestatic    com/google/protobuf/ExtensionRegistryLite.getGeneratedRegistry:()Lcom/google/protobuf/ExtensionRegistryLite;
        //   827: astore          4
        //   829: getstatic       ahst.a:Lahst;
        //   832: aload_2        
        //   833: aload           4
        //   835: invokestatic    agzi.parseFrom:(Lagzi;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lagzi;
        //   838: checkcast       Lahst;
        //   841: astore          4
        //   843: aload_2        
        //   844: invokevirtual   java/io/InputStream.close:()V
        //   847: goto            921
        //   850: astore          4
        //   852: aload_2        
        //   853: invokevirtual   java/io/InputStream.close:()V
        //   856: goto            893
        //   859: astore_2       
        //   860: ldc_w           Ljava/lang/Throwable;.class
        //   863: ldc_w           "addSuppressed"
        //   866: iconst_1       
        //   867: anewarray       Ljava/lang/Class;
        //   870: dup            
        //   871: iconst_0       
        //   872: ldc_w           Ljava/lang/Throwable;.class
        //   875: aastore        
        //   876: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   879: aload           4
        //   881: iconst_1       
        //   882: anewarray       Ljava/lang/Object;
        //   885: dup            
        //   886: iconst_0       
        //   887: aload_2        
        //   888: aastore        
        //   889: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   892: pop            
        //   893: aload           4
        //   895: athrow         
        //   896: astore          4
        //   898: ldc_w           "BackgroundThreadUncaughtExceptionJournalV2 !read '%s'"
        //   901: iconst_1       
        //   902: anewarray       Ljava/lang/Object;
        //   905: dup            
        //   906: iconst_0       
        //   907: aload           5
        //   909: aastore        
        //   910: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   913: aload           4
        //   915: invokestatic    adio.n:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   918: aconst_null    
        //   919: astore          4
        //   921: aload           4
        //   923: ifnull          1023
        //   926: aload           4
        //   928: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   931: pop            
        //   932: invokestatic    aklq.d:()Laklo;
        //   935: astore_2       
        //   936: aload_2        
        //   937: invokevirtual   agza.copyOnWrite:()V
        //   940: aload_2        
        //   941: getfield        aklo.instance:Lagzi;
        //   944: checkcast       Laklq;
        //   947: aload           4
        //   949: invokestatic    aklq.ae:(Laklq;Lahst;)V
        //   952: aload_2        
        //   953: invokevirtual   agza.build:()Lagzi;
        //   956: checkcast       Laklq;
        //   959: astore          7
        //   961: aload           4
        //   963: getfield        ahst.e:Laooh;
        //   966: astore_2       
        //   967: aload_2        
        //   968: astore          4
        //   970: aload_2        
        //   971: ifnonnull       979
        //   974: getstatic       aooh.a:Laooh;
        //   977: astore          4
        //   979: aload           4
        //   981: getfield        aooh.g:Laoob;
        //   984: astore_2       
        //   985: aload_2        
        //   986: astore          4
        //   988: aload_2        
        //   989: ifnonnull       997
        //   992: getstatic       aoob.a:Laoob;
        //   995: astore          4
        //   997: aload           4
        //   999: getfield        aoob.e:J
        //  1002: lstore          12
        //  1004: aload_3        
        //  1005: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1010: checkcast       Lwvu;
        //  1013: aload           7
        //  1015: lload           12
        //  1017: invokeinterface wvu.e:(Laklq;J)Z
        //  1022: pop            
        //  1023: aload           5
        //  1025: invokestatic    adio.m:(Ljava/io/File;)V
        //  1028: goto            792
        //  1031: aload           5
        //  1033: checkcast       Ltmm;
        //  1036: getfield        tmm.w:I
        //  1039: ifne            1321
        //  1042: aload_2        
        //  1043: getfield        adei.f:Ljava/lang/Object;
        //  1046: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1051: checkcast       Lacga;
        //  1054: astore_3       
        //  1055: aload_3        
        //  1056: getfield        acga.c:Ljava/lang/Object;
        //  1059: checkcast       Ladhe;
        //  1062: invokevirtual   adhe.b:()Laoox;
        //  1065: getfield        aoox.k:Laoov;
        //  1068: astore_2       
        //  1069: aload_2        
        //  1070: astore          4
        //  1072: aload_2        
        //  1073: ifnonnull       1081
        //  1076: getstatic       aoov.a:Laoov;
        //  1079: astore          4
        //  1081: aload           4
        //  1083: getfield        aoov.b:Z
        //  1086: ifeq            1321
        //  1089: aload_3        
        //  1090: getfield        acga.d:Ljava/lang/Object;
        //  1093: checkcast       Landroid/content/Context;
        //  1096: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //  1099: astore_2       
        //  1100: getstatic       java/io/File.separator:Ljava/lang/String;
        //  1103: astore          5
        //  1105: new             Ljava/lang/StringBuilder;
        //  1108: dup            
        //  1109: ldc_w           "systemhealth"
        //  1112: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1115: astore          4
        //  1117: aload           4
        //  1119: aload           5
        //  1121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1124: pop            
        //  1125: aload           4
        //  1127: ldc_w           "nativecrash"
        //  1130: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1133: pop            
        //  1134: new             Ljava/io/File;
        //  1137: dup            
        //  1138: aload_2        
        //  1139: aload           4
        //  1141: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1144: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //  1147: astore          4
        //  1149: aload           4
        //  1151: invokevirtual   java/io/File.exists:()Z
        //  1154: ifeq            1321
        //  1157: aload           4
        //  1159: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //  1162: astore          4
        //  1164: aload           4
        //  1166: ifnull          1321
        //  1169: aload           4
        //  1171: arraylength    
        //  1172: istore          11
        //  1174: iload           6
        //  1176: iload           11
        //  1178: if_icmpge       1321
        //  1181: aload           4
        //  1183: iload           6
        //  1185: aaload         
        //  1186: astore_2       
        //  1187: aload_2        
        //  1188: invokevirtual   java/io/File.isDirectory:()Z
        //  1191: ifeq            1202
        //  1194: aload_2        
        //  1195: invokestatic    uji.W:(Ljava/io/File;)Z
        //  1198: pop            
        //  1199: goto            1315
        //  1202: aload_2        
        //  1203: invokevirtual   java/io/File.delete:()Z
        //  1206: ifeq            1303
        //  1209: getstatic       ahst.a:Lahst;
        //  1212: invokevirtual   agzi.createBuilder:()Lagza;
        //  1215: astore          5
        //  1217: aload           5
        //  1219: invokevirtual   agza.copyOnWrite:()V
        //  1222: aload           5
        //  1224: getfield        agza.instance:Lagzi;
        //  1227: checkcast       Lahst;
        //  1230: astore_2       
        //  1231: aload_2        
        //  1232: bipush          10
        //  1234: putfield        ahst.c:I
        //  1237: aload_2        
        //  1238: aload_2        
        //  1239: getfield        ahst.b:I
        //  1242: iconst_1       
        //  1243: ior            
        //  1244: putfield        ahst.b:I
        //  1247: aload           5
        //  1249: invokevirtual   agza.build:()Lagzi;
        //  1252: checkcast       Lahst;
        //  1255: astore          5
        //  1257: aload_3        
        //  1258: getfield        acga.a:Ljava/lang/Object;
        //  1261: astore_2       
        //  1262: invokestatic    aklq.d:()Laklo;
        //  1265: astore          8
        //  1267: aload           8
        //  1269: invokevirtual   agza.copyOnWrite:()V
        //  1272: aload           8
        //  1274: getfield        aklo.instance:Lagzi;
        //  1277: checkcast       Laklq;
        //  1280: aload           5
        //  1282: invokestatic    aklq.ae:(Laklq;Lahst;)V
        //  1285: aload_2        
        //  1286: aload           8
        //  1288: invokevirtual   agza.build:()Lagzi;
        //  1291: checkcast       Laklq;
        //  1294: invokeinterface wvu.d:(Laklq;)Z
        //  1299: pop            
        //  1300: goto            1315
        //  1303: getstatic       zjo.a:Lzjo;
        //  1306: getstatic       zjn.A:Lzjn;
        //  1309: ldc_w           "Unable to delete native crash dumps."
        //  1312: invokestatic    zjp.b:(Lzjo;Lzjn;Ljava/lang/String;)V
        //  1315: iinc            6, 1
        //  1318: goto            1174
        //  1321: return         
        //  1322: astore_2       
        //  1323: goto            893
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  454    461    464    495    Ljava/lang/SecurityException;
        //  814    824    896    921    Ljava/lang/Exception;
        //  824    843    850    896    Any
        //  843    847    896    921    Ljava/lang/Exception;
        //  852    856    859    893    Any
        //  860    893    1322   1326   Ljava/lang/Exception;
        //  893    896    896    921    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0893:
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
        if ((this.i.b(tlq.ac) & 0x4) != 0x0) {
            tcp.k(afva.n(tsi.c((Context)this.h, (tku)this.m.a())), (Executor)this.a, (tcn)etg.b, (tco)new erz(this, 2));
            return;
        }
        this.g(null);
    }
    
    public final void g(final Boolean b) {
        final agza builder = ((agzi)aint.a).createBuilder();
        final int k = this.k(tme.b);
        builder.copyOnWrite();
        final aint aint = (aint)builder.instance;
        aint.e = k - 1;
        final int b2 = aint.b;
        int n = 4;
        aint.b = (b2 | 0x4);
        final int i = this.k(tme.a);
        builder.copyOnWrite();
        final aint aint2 = (aint)builder.instance;
        aint2.d = i - 1;
        aint2.b |= 0x2;
        final int a = this.e.a(tme.c);
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
        final aint aint3 = (aint)builder.instance;
        aint3.c = n - 1;
        aint3.b |= 0x1;
        final boolean c = this.k.c();
        builder.copyOnWrite();
        final aint aint4 = (aint)builder.instance;
        aint4.b |= 0x8;
        aint4.f = c;
        final boolean d = this.k.d();
        builder.copyOnWrite();
        final aint aint5 = (aint)builder.instance;
        aint5.b |= 0x10;
        aint5.g = d;
        final int a2 = this.k.a();
        builder.copyOnWrite();
        final aint aint6 = (aint)builder.instance;
        aint6.b |= 0x40;
        aint6.i = a2;
        final int b3 = this.k.b();
        builder.copyOnWrite();
        final aint aint7 = (aint)builder.instance;
        aint7.b |= 0x20;
        aint7.h = b3;
        if (b != null) {
            final boolean booleanValue = b;
            builder.copyOnWrite();
            final aint aint8 = (aint)builder.instance;
            aint8.b |= 0x80;
            aint8.j = booleanValue;
        }
        final aklo d2 = aklq.d();
        ((agza)d2).copyOnWrite();
        aklq.au((aklq)d2.instance, (aint)builder.build());
        ((wvu)this.aA.a()).d((aklq)((agza)d2).build());
    }
    
    public final void h(final boolean b) {
        if (b) {
            final File[] listFiles = ((File)this.aY.a()).listFiles();
            if (listFiles != null) {
                for (int length = listFiles.length, i = 0; i < length; ++i) {
                    listFiles[i].delete();
                }
            }
        }
        ((acwz)this.bz.a()).d();
        ((adea)this.bA.a()).c();
        ((acwz)this.bB.a()).d();
        final WatchVideoIndexer watchVideoIndexer = (WatchVideoIndexer)this.bC.a();
        if (watchVideoIndexer.d.aa()) {
            watchVideoIndexer.a.C(new MutateRequest(4, (Thing[])null, (String[])null, (String[])null, (ActionImpl)null, (String)null, (String)null));
        }
        if (((uyi)this.be.a()).bB()) {
            ((adfr)this.bH.a()).e("PREFETCHED_HOME_RESPONSE_KEY");
        }
    }
}
