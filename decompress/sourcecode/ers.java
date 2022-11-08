import java.util.concurrent.ScheduledExecutorService;
import android.content.pm.ResolveInfo;
import j$.time.Duration;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import android.content.Intent;
import android.content.Context;
import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ers extends eru implements cmb
{
    private boolean t;
    
    static {
        final qee a = qee.a;
        if (a.c == 0L) {
            a.c = SystemClock.elapsedRealtime();
            a.l.a = true;
        }
    }
    
    public final cmc a() {
        if (!this.t) {
            return (cmc)this.e.a();
        }
        if (((err)ahbz.az((Context)this, (Class)err.class)).ag().m(tlq.ad)) {
            return szb.p(this.getPackageName());
        }
        return szb.p("");
    }
    
    protected abstract void d();
    
    protected final void e() {
        this.d();
        super.onCreate();
    }
    
    public final void onCreate() {
        final String ai = uji.ai((Context)this);
        boolean b = false;
        Label_0101: {
            if (ai != null) {
                if (!this.getPackageName().equals(ai)) {
                    final Intent intent = new Intent("com.google.android.youtube.api.service.START");
                    intent.setPackage(this.getApplicationInfo().packageName);
                    final ResolveInfo resolveService = this.getPackageManager().resolveService(intent, 0);
                    String processName;
                    if (resolveService != null && resolveService.serviceInfo != null) {
                        processName = resolveService.serviceInfo.processName;
                    }
                    else {
                        processName = null;
                    }
                    if (processName != null) {
                        if (processName.equals(ai)) {
                            b = false;
                            break Label_0101;
                        }
                    }
                }
            }
            b = true;
        }
        if (this.t = (b ^ true)) {
            final err err = (err)ahbz.az((Context)this, (Class)err.class);
            final vjf an = err.an();
            final ScheduledExecutorService er = err.er();
            an.o((Executor)er);
            er.schedule((Runnable)new dmb(this, 20), 15L, TimeUnit.SECONDS);
            return;
        }
        if (super.c) {
            return;
        }
        super.c = true;
        final tml d = tmd.d(0, super.a);
        final qee a = qee.a;
        if (qcj.w() && a.c > 0L && a.d == 0L) {
            a.d = SystemClock.elapsedRealtime();
            a.l.b = true;
            qcj.u((Runnable)new pvx(a, 9));
            ((Application)this).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new qec(a, (Application)this));
        }
        final tml d2 = tmd.d(18, super.a);
        this.e();
        d2.g();
        ((tmj)super.n.a()).a = Duration.ofMillis(super.b);
        tmd.h(((tmj)super.n.a()).b(), super.a);
        final ewl ewl = (ewl)super.d.a();
        final tmd a2 = ewl.a;
        a2.g(d);
        a2.g(d2);
        final tmb j = ewl.j;
        final tlq tlq = (tlq)super.i.a();
        final boolean b2 = (tlq.e(tlq.B) & 0x800000L) != 0x0L;
        final boolean m = tlq.m(tlq.ay);
        asgn asgn = asgn.f();
        if (!tlq.m(tlq.aj)) {
            asgn = asgn.C((asho)super.h.a());
        }
        final trg k = tmb.k(6);
        k.h("nll", (Runnable)new ert((eru)this, 1), b2);
        k.g("etc", (Runnable)new ert((eru)this, 0));
        final trg l = tmb.l(1, asgn);
        l.g("cfg", (Runnable)new ert((eru)this, 2));
        l.g("ida", (Runnable)new ert((eru)this, 3));
        l.h("ads", (Runnable)new ert((eru)this, 4), m ^ true);
        l.g("sww", (Runnable)new tg(4));
        j.n(new trg[] { k, l });
        ewl.i(0);
        trn.k("YouTube");
        final esj esj = (esj)super.g.a();
        final long e = esj.i.e(tlq.B);
        final boolean i = esj.i.m(tlq.Z);
        final long e2 = esj.i.e(tlq.af);
        final boolean b3 = e2 == 0L;
        final boolean m2 = esj.i.m(tlq.ax);
        final boolean m3 = esj.i.m(tlq.aw);
        final boolean m4 = esj.i.m(tlq.ay);
        final boolean m5 = esj.i.m(tlq.aA);
        final boolean m6 = esj.i.m(tlq.au);
        final boolean m7 = esj.i.m(tlq.az);
        final boolean m8 = esj.i.m(tlq.aB);
        final ewl d3 = esj.d;
        final tmb j2 = d3.j;
        final tmb l2 = d3.l;
        final tmb k2 = d3.k;
        final vjf a3 = esj.j.a();
        final asgn e3 = a3.i().e();
        final asgn h = a3.h().al(1L).h();
        final asgn f = asgn.f();
        asgn c = h;
        asgn c2 = f;
        asgn c3 = e3;
        if (!esj.i.m(tlq.aj)) {
            c3 = e3.C(esj.b);
            c = h.C(esj.b);
            c2 = f.C(esj.b);
        }
        final trg k3 = tmb.k(6);
        k3.h("nll", (Runnable)new ese(esj, 17), (e & 0x800000L) == 0x0L);
        final tme e4 = esj.e;
        e4.getClass();
        k3.g("stc", (Runnable)new esc(e4, 2));
        final trg l3 = tmb.l(1, c3);
        l3.g("lgi", (Runnable)new esc(esj, 8));
        l3.g("gsc", (Runnable)new esc(esj, 19));
        l3.g("shm", (Runnable)new ese(esj, 9));
        l3.g("pl1", (Runnable)new ese(esj, 20));
        l3.h((String)null, (Runnable)new esg(esj, 10), b3);
        l3.h((String)null, (Runnable)new esg(esj, 20), b3);
        final trg l4 = tmb.l(0, c);
        l4.g("lhb", (Runnable)new erv(esj));
        final trg l5 = tmb.l(0, c3);
        l5.g("ins", (Runnable)new ert(esj, 19));
        l5.g("pws", (Runnable)new esa(esj, 7));
        l5.g("lsh", (Runnable)new esa(esj, 17));
        l5.g("dns", (Runnable)new esa(esj, 18));
        l5.g("phn", (Runnable)new esa(esj, 19));
        l5.g("r2s", (Runnable)new esa(esj, 20));
        l5.h((String)null, (Runnable)new esc(esj, 1), b3);
        l5.h((String)null, (Runnable)new esc(esj, 0), b3);
        j2.n(new trg[] { k3, l3, l4, l5 });
        if (e2 != 0L) {
            j2.g();
        }
        final trg l6 = tmb.l(1, c2);
        l6.h("reb", (Runnable)new esa(esj, 8), m4);
        l6.h("sti", (Runnable)new esa(esj, 9), m4);
        final trg l7 = tmb.l(1, c3);
        l7.h("coi", (Runnable)new esa(esj, 10), m4);
        l7.h("iti", (Runnable)new esa(esj, 11), m4);
        l7.h("nti", (Runnable)new esa(esj, 12), m4);
        l7.h("nvq", (Runnable)new esa(esj, 13), m4);
        l7.h("slc", (Runnable)new esa(esj, 15), m4);
        l7.g("pl2", (Runnable)new esc(esj, 3));
        l7.g("pl4", (Runnable)new esc(esj, 4));
        final trg l8 = tmb.l(0, c2);
        l8.g("lcs", (Runnable)new esc(esj, 5));
        l8.g("sw1", (Runnable)new esc(esj, 6));
        l8.g("sw2", (Runnable)new tg(5));
        l8.h("sdo", (Runnable)new esc(esj, 7), m3);
        l8.h("dbm", (Runnable)new esc(esj, 9), m3);
        final trg l9 = tmb.l(0, c3);
        l9.g("ifi", (Runnable)new esc(esj, 10));
        l9.g("ibf", (Runnable)new esc(esj, 11));
        l9.g("mds", (Runnable)new esc(esj, 12));
        l9.g("mdi", (Runnable)new esc(esj, 13));
        l9.g("ppc", (Runnable)new esc(esj, 14));
        l9.g("plr", (Runnable)new esc(esj, 15));
        l9.g("sw3", (Runnable)new esc(esj, 16));
        l9.g("imc", (Runnable)new esc(esj, 17));
        l9.g("phl", (Runnable)new esc(esj, 18));
        l9.h("blk", (Runnable)new esc(esj, 20), esj.i.m(tlq.aa));
        l9.h("mfc", (Runnable)new ese(esj, 1), m6);
        l9.h("qry", (Runnable)new ese(esj, 0), i);
        l9.g("ocs", (Runnable)new ese(esj, 2));
        l9.g("oaf", (Runnable)new ese(esj, 3));
        l9.h("adw", (Runnable)new ese(esj, 4), m2 ^ true);
        l9.g("etn", (Runnable)new ese(esj, 5));
        l9.g("etf", (Runnable)new ese(esj, 6));
        l9.g("fcc", (Runnable)new ese(esj, 7));
        l9.g("ccd", (Runnable)new ese(esj, 8));
        l9.g("cnx", (Runnable)new ese(esj, 10));
        l9.g("upi", (Runnable)new ese(esj, 11));
        l9.g("dsi", (Runnable)new ese(esj, 12));
        l9.g("lrp", (Runnable)new ese(esj, 13));
        l9.g("bdc", (Runnable)new ese(esj, 14));
        l9.g("eti", (Runnable)new ese(esj, 15));
        l9.g("lis", (Runnable)new ese(esj, 16));
        l9.g("ecl", (Runnable)new ese(esj, 18));
        final trg l10 = tmb.l(0, (asgn)esj.bQ);
        l10.g("clc", (Runnable)new cog(esj, c, 17));
        k2.n(new trg[] { l6, l7, l8, l9, l10 });
        final trg l11 = tmb.l(0, c2);
        l11.h("csc", (Runnable)new ese(esj, 19), m8);
        l11.h("mfc", (Runnable)new ese(esj, 1), m7);
        l11.g("itp", (Runnable)new esg(esj, 1));
        l11.g("sfs", (Runnable)new esg(esj, 0));
        l11.g("mdp", (Runnable)new esg(esj, 2));
        l11.g("nua", (Runnable)new esg(esj, 3));
        l11.g("fbt", (Runnable)new esg(esj, 4));
        l11.g("olb", (Runnable)new esg(esj, 5));
        l11.g("upf", (Runnable)new esg(esj, 7));
        l11.g("oes", (Runnable)new esg(esj, 8));
        l11.g("opi", (Runnable)new esg(esj, 9));
        l11.g("rcm", (Runnable)new esg(esj, 11));
        l11.g("bul", (Runnable)new esg(esj, 12));
        l11.g("nsr", (Runnable)new esh(esj));
        l11.g("ntr", (Runnable)new esg(esj, 13));
        l11.g("ntc", (Runnable)new esg(esj, 14));
        l11.g("dbg", (Runnable)new tg(6));
        l11.g("sdd", (Runnable)new esg(esj, 16));
        l11.g("sll", (Runnable)new esg(esj, 17));
        l11.g("dec", (Runnable)new esg(esj, 18));
        l11.g("eta", (Runnable)new esg(esj, 19));
        l11.g("dsn", (Runnable)new esi(esj, 1));
        l11.g("ncm", (Runnable)new esi(esj, 0));
        l11.g("lgn", (Runnable)new esi(esj, 2));
        l11.g("fbc", (Runnable)new esi(esj, 3));
        l11.g("fbl", (Runnable)new esi(esj, 4));
        l11.g("mem", (Runnable)new ert(esj, 5));
        l11.g("cmi", (Runnable)new ert(esj, 6));
        l11.g("ntf", (Runnable)new ert(esj, 7));
        l11.g("lns", (Runnable)new ert(esj, 8));
        l11.g("apw", (Runnable)new ert(esj, 9));
        l11.g("dpd", (Runnable)new ert(esj, 10));
        l11.g("snt", (Runnable)new ert(esj, 11));
        l11.g("sbt", (Runnable)new ert(esj, 12));
        l11.g("ocn", (Runnable)new ert(esj, 13));
        final esc esc = new esc(esj, 7);
        final boolean b4 = m3 ^ true;
        l11.h("sdo", (Runnable)esc, b4);
        l11.h("dbm", (Runnable)new esc(esj, 9), b4);
        l11.g("dpc", (Runnable)new ert(esj, 15));
        l11.g("rpc", (Runnable)new ert(esj, 16));
        l11.g("sbp", (Runnable)new ert(esj, 17));
        l11.g("asl", (Runnable)new ert(esj, 18));
        l11.g("ouo", (Runnable)new esg(esj, 6));
        l11.g("emo", (Runnable)new esg(esj, 15));
        l11.g("dpg", (Runnable)new esi(esj, 5));
        l11.h("blk", (Runnable)new ert(esj, 14), esj.i.m(tlq.ae));
        l11.g("rcx", (Runnable)new esa(esj, 1));
        l11.h("oan", (Runnable)new esa(esj, 2), m5);
        l11.g("mba", (Runnable)new esa(esj, 3));
        l11.g("wdg", (Runnable)new esa(esj, 4));
        l2.n(new trg[] { l11 });
        final trg k4 = tmb.k(6);
        k4.h("ads", (Runnable)new esa(esj, 5), m4);
        final esa esa = new esa(esj, 6);
        final boolean b5 = true ^ m4;
        k4.h("ccr", (Runnable)esa, b5);
        k4.h("reb", (Runnable)new esa(esj, 8), b5);
        k4.h("sti", (Runnable)new esa(esj, 9), b5);
        k4.h("coi", (Runnable)new esa(esj, 10), b5);
        k4.h("iti", (Runnable)new esa(esj, 11), b5);
        k4.h("nti", (Runnable)new esa(esj, 12), b5);
        k4.h("nvq", (Runnable)new esa(esj, 13), b5);
        k4.h("cpc", (Runnable)new esa(esj, 14), b5);
        k4.h("slc", (Runnable)new esa(esj, 15), b5);
        k4.g("all", (Runnable)new esa(esj, 16));
        k2.n(new trg[] { k4 });
        if (e2 == 0L) {
            j2.g();
        }
        k2.g();
        l2.g();
        final fes fes = (fes)esj.as.a();
        esj.h.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new fer(fes));
        fes.a.d((Object)new fgv());
        if (!esj.i.m(tlq.v)) {
            d.g();
            return;
        }
        throw null;
    }
}
