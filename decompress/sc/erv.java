import android.content.pm.ResolveInfo;
import j$.time.Duration;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import java.util.concurrent.Executor;
import android.content.Intent;
import android.content.Context;
import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class erv extends erx implements cmc
{
    private boolean t;
    
    static {
        final qfo a = qfo.a;
        if (a.c == 0L) {
            a.c = SystemClock.elapsedRealtime();
            a.l.a = true;
        }
    }
    
    public final cmd a() {
        if (this.t) {
            return (cmd)this.e.a();
        }
        if (((eru)agpc.am((Context)this, eru.class)).ah().m(tnu.ad)) {
            return tbh.p(this.getPackageName());
        }
        return tbh.p("");
    }
    
    protected abstract void d();
    
    @Override
    protected final void e() {
        this.d();
        super.onCreate();
    }
    
    public final void onCreate() {
        boolean b = false;
        if (((eru)agpc.am((Context)this, eru.class)).ah().m(tnu.aI)) {
            final String a = qkd.a((Context)this);
            b = (a == null || this.getPackageName().equals(a));
            this.t = b;
        }
        else {
            final String br = vdh.br((Context)this);
            Label_0187: {
                if (br != null) {
                    if (!this.getPackageName().equals(br)) {
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
                            if (processName.equals(br)) {
                                b = false;
                                break Label_0187;
                            }
                        }
                    }
                }
                b = true;
            }
            this.t = b;
        }
        if (!b) {
            final eru eru = (eru)agpc.am((Context)this, eru.class);
            eru.ao().o((Executor)eru.en());
            return;
        }
        if (super.c) {
            return;
        }
        super.c = true;
        final tor d = toj.d(0, super.a);
        final qfo a2 = qfo.a;
        if (qdt.l() && a2.c > 0L && a2.d == 0L) {
            a2.d = SystemClock.elapsedRealtime();
            a2.l.b = true;
            qdt.j((Runnable)new pxm(a2, 7));
            ((Application)this).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new qfm(a2, (Application)this));
        }
        final tor d2 = toj.d(18, super.a);
        this.e();
        d2.g();
        ((top)super.n.a()).a = Duration.ofMillis(super.b);
        toj.h(((top)super.n.a()).b(), super.a);
        final ewp ewp = (ewp)super.d.a();
        final toj a3 = ewp.a;
        a3.g(d);
        a3.g(d2);
        final toh j = ewp.j;
        final tnu tnu = (tnu)super.i.a();
        final boolean b2 = (tnu.e(tnu.B) & 0x800000L) != 0x0L;
        final boolean m = tnu.m(tnu.az);
        ashc ashc = ashc.f();
        if (!tnu.m(tnu.aj)) {
            ashc = ashc.C((asid)super.h.a());
        }
        final ttl k = toh.k(6);
        k.h("nll", (Runnable)new dmc((erx)this, 20), b2);
        k.g("etc", (Runnable)new erw(this, 1));
        final ttl l = toh.l(1, ashc);
        l.g("cfg", (Runnable)new erw(this, 0));
        l.g("ida", (Runnable)new erw(this, 2));
        l.h("ads", (Runnable)new erw(this, 3), m ^ true);
        l.g("sww", (Runnable)new tg(4));
        j.n(new ttl[] { k, l });
        ewp.i(0);
        ttr.k("YouTube");
        final esm esm = (esm)super.g.a();
        final long e = esm.i.e(tnu.B);
        final boolean i = esm.i.m(tnu.Z);
        final long e2 = esm.i.e(tnu.af);
        final boolean m2 = esm.i.m(tnu.ay);
        final boolean m3 = esm.i.m(tnu.ax);
        final boolean m4 = esm.i.m(tnu.az);
        final boolean m5 = esm.i.m(tnu.aB);
        final boolean m6 = esm.i.m(tnu.av);
        final boolean m7 = esm.i.m(tnu.aA);
        final boolean m8 = esm.i.m(tnu.aC);
        final boolean m9 = esm.i.m(tnu.aH);
        final ewp d3 = esm.d;
        final toh j2 = d3.j;
        final toh l2 = d3.l;
        final toh k2 = d3.k;
        final vlk a4 = esm.j.a();
        final ashc e3 = a4.i().e();
        final ashc h = a4.h().ar(1L).h();
        final ashc f = ashc.f();
        ashc c = h;
        ashc c2 = e3;
        ashc c3 = f;
        if (!esm.i.m(tnu.aj)) {
            c2 = e3.C(esm.b);
            c = h.C(esm.b);
            c3 = f.C(esm.b);
        }
        final boolean b3 = e2 == 0L;
        final ttl k3 = toh.k(6);
        k3.h("nll", (Runnable)new esh(esm, 16), (e & 0x800000L) == 0x0L);
        final tok e4 = esm.e;
        e4.getClass();
        k3.g("stc", (Runnable)new esf(e4, 5));
        final ttl l3 = toh.l(1, c2);
        l3.g("lgi", (Runnable)new esf(esm, 10));
        l3.g("gsc", (Runnable)new esf(esm, 19));
        l3.g("shm", (Runnable)new esh(esm, 9));
        final esf esf = new esf(esm, 4);
        final boolean b4 = m9 ^ true;
        l3.h("pl1", (Runnable)esf, b4);
        l3.h((String)null, (Runnable)new esj(esm, 9), b3);
        l3.h((String)null, (Runnable)new esj(esm, 19), b3);
        final ttl l4 = toh.l(0, c);
        l4.g("lhb", (Runnable)new ery(esm));
        final ttl l5 = toh.l(0, c2);
        l5.g("ins", (Runnable)new erw(esm, 18));
        l5.g("pws", (Runnable)new ese(esm, 6));
        l5.g("lsh", (Runnable)new ese(esm, 17));
        l5.g("dns", (Runnable)new ese(esm, 19));
        l5.g("phn", (Runnable)new ese(esm, 20));
        l5.g("r2s", (Runnable)new esf(esm, 1));
        l5.h((String)null, (Runnable)new esf(esm, 0), b3);
        l5.h((String)null, (Runnable)new esf(esm, 2), b3);
        j2.n(new ttl[] { k3, l3, l4, l5 });
        if (e2 != 0L) {
            j2.g();
        }
        final boolean b5 = (0x4L & e) != 0x0L;
        final ttl l6 = toh.l(1, c2);
        l6.h("mdi", (Runnable)new esf(esm, 3), m9);
        l6.h("pl1", (Runnable)new esf(esm, 4), m9);
        final ttl l7 = toh.l(1, c3);
        l7.h("reb", (Runnable)new ese(esm, 9), m4);
        l7.h("sti", (Runnable)new ese(esm, 10), m4);
        final ttl l8 = toh.l(1, c2);
        final ese ese = new ese(esm, 11);
        final boolean b6 = m4 || b5;
        final boolean b7 = (e & 0x8L) != 0x0L;
        l8.h("coi", (Runnable)ese, b6);
        l8.h("iti", (Runnable)new ese(esm, 12), m4 || b7);
        l8.h("nti", (Runnable)new ese(esm, 13), m4);
        l8.h("nvq", (Runnable)new ese(esm, 14), m4);
        l8.h("slc", (Runnable)new ese(esm, 16), m4);
        l8.g("pl2", (Runnable)new esf(esm, 6));
        l8.g("pl4", (Runnable)new esf(esm, 7));
        final ttl l9 = toh.l(0, c3);
        l9.g("lcs", (Runnable)new esf(esm, 8));
        l9.g("sw1", (Runnable)new esf(esm, 9));
        l9.g("sw2", (Runnable)new tg(5));
        l9.h("sdo", (Runnable)new esf(esm, 11), m3);
        l9.h("dbm", (Runnable)new esf(esm, 12), m3);
        final ttl l10 = toh.l(0, c2);
        l10.g("ifi", (Runnable)new esf(esm, 13));
        l10.g("ibf", (Runnable)new esf(esm, 14));
        l10.g("mds", (Runnable)new esf(esm, 15));
        l10.h("mdi", (Runnable)new esf(esm, 3), b4);
        l10.g("ppc", (Runnable)new esf(esm, 16));
        l10.g("plr", (Runnable)new esf(esm, 17));
        l10.g("sw3", (Runnable)new esf(esm, 18));
        l10.g("imc", (Runnable)new esf(esm, 20));
        l10.g("phl", (Runnable)new esh(esm, 1));
        l10.h("blk", (Runnable)new esh(esm, 0), esm.i.m(tnu.aa));
        l10.h("mfc", (Runnable)new esh(esm, 2), m6);
        l10.h("qry", (Runnable)new esh(esm, 3), i);
        l10.g("ocs", (Runnable)new esh(esm, 4));
        l10.g("oaf", (Runnable)new esh(esm, 5));
        l10.h("adw", (Runnable)new esh(esm, 6), m2 ^ true);
        l10.g("etn", (Runnable)new esh(esm, 7));
        l10.g("etf", (Runnable)new esh(esm, 8));
        l10.g("fcc", (Runnable)new esh(esm, 10));
        l10.g("ccd", (Runnable)new esh(esm, 11));
        l10.g("cnx", (Runnable)new esh(esm, 12));
        l10.g("upi", (Runnable)new esh(esm, 13));
        l10.g("dsi", (Runnable)new esh(esm, 14));
        l10.g("lrp", (Runnable)new esh(esm, 15));
        l10.g("bdc", (Runnable)new esh(esm, 17));
        l10.g("eti", (Runnable)new esh(esm, 18));
        l10.g("lis", (Runnable)new esh(esm, 19));
        l10.g("ecl", (Runnable)new esh(esm, 20));
        final ttl l11 = toh.l(0, (ashc)esm.bO);
        l11.g("clc", (Runnable)new coh(esm, c, 17));
        k2.n(new ttl[] { l6, l7, l8, l9, l10, l11 });
        final ttl l12 = toh.l(0, c3);
        l12.h("csc", (Runnable)new esj(esm, 1), m8);
        l12.h("mfc", (Runnable)new esh(esm, 2), m7);
        l12.g("itp", (Runnable)new esj(esm, 0));
        l12.g("sfs", (Runnable)new esj(esm, 2));
        l12.g("mdp", (Runnable)new esj(esm, 3));
        l12.g("nua", (Runnable)new esj(esm, 4));
        l12.g("fbt", (Runnable)new esj(esm, 6));
        l12.g("olb", (Runnable)new esj(esm, 7));
        l12.g("upf", (Runnable)new esj(esm, 8));
        l12.g("oes", (Runnable)new esj(esm, 10));
        l12.g("opi", (Runnable)new esj(esm, 11));
        l12.g("rcm", (Runnable)new esj(esm, 12));
        l12.g("bul", (Runnable)new esj(esm, 13));
        l12.g("nsr", (Runnable)new esk(esm));
        l12.g("ntr", (Runnable)new esj(esm, 14));
        l12.g("ntc", (Runnable)new esj(esm, 16));
        l12.g("dbg", (Runnable)new tg(6));
        l12.g("sdd", (Runnable)new esj(esm, 17));
        l12.g("sll", (Runnable)new esj(esm, 18));
        l12.g("dec", (Runnable)new esj(esm, 20));
        l12.g("eta", (Runnable)new esl(esm, 1));
        l12.g("dsn", (Runnable)new esl(esm, 0));
        l12.g("ncm", (Runnable)new esl(esm, 2));
        l12.g("lgn", (Runnable)new esl(esm, 3));
        l12.g("fbc", (Runnable)new erw(esm, 4));
        l12.g("fbl", (Runnable)new erw(esm, 5));
        l12.g("mem", (Runnable)new erw(esm, 6));
        l12.g("cmi", (Runnable)new erw(esm, 7));
        l12.g("ntf", (Runnable)new erw(esm, 8));
        l12.g("lns", (Runnable)new erw(esm, 9));
        l12.g("apw", (Runnable)new erw(esm, 10));
        l12.g("dpd", (Runnable)new erw(esm, 11));
        l12.g("snt", (Runnable)new erw(esm, 12));
        l12.g("sbt", (Runnable)new erw(esm, 14));
        l12.g("ocn", (Runnable)new erw(esm, 15));
        final esf esf2 = new esf(esm, 11);
        final boolean b8 = m3 ^ true;
        l12.h("sdo", (Runnable)esf2, b8);
        l12.h("dbm", (Runnable)new esf(esm, 12), b8);
        l12.g("dpc", (Runnable)new erw(esm, 16));
        l12.g("rpc", (Runnable)new erw(esm, 17));
        l12.g("sbp", (Runnable)new esj(esm, 5));
        l12.g("asl", (Runnable)new esj(esm, 15));
        l12.g("ouo", (Runnable)new esl(esm, 4));
        l12.g("emo", (Runnable)new erw(esm, 13));
        l12.g("dpg", (Runnable)new erw(esm, 20));
        l12.h("blk", (Runnable)new ese(esm, 0), esm.i.m(tnu.ae));
        l12.g("rcx", (Runnable)new ese(esm, 2));
        l12.h("oan", (Runnable)new ese(esm, 3), m5);
        l12.g("mba", (Runnable)new ese(esm, 4));
        l12.g("wdg", (Runnable)new ese(esm, 5));
        l2.n(new ttl[] { l12 });
        final ttl k4 = toh.k(6);
        k4.h("ads", (Runnable)new ese(esm, 7), m4);
        final ese ese2 = new ese(esm, 8);
        final boolean b9 = m4 ^ true;
        k4.h("ccr", (Runnable)ese2, b9);
        k4.h("reb", (Runnable)new ese(esm, 9), b9);
        k4.h("sti", (Runnable)new ese(esm, 10), b9);
        k4.h("coi", (Runnable)new ese(esm, 11), !m4 && !b5);
        k4.h("iti", (Runnable)new ese(esm, 12), !m4 && !b7);
        k4.h("nti", (Runnable)new ese(esm, 13), b9);
        k4.h("nvq", (Runnable)new ese(esm, 14), b9);
        k4.h("cpc", (Runnable)new ese(esm, 15), b9);
        k4.h("slc", (Runnable)new ese(esm, 16), b9);
        k4.g("all", (Runnable)new ese(esm, 18));
        k2.n(new ttl[] { k4 });
        if (e2 == 0L) {
            j2.g();
        }
        k2.g();
        l2.g();
        final fez fez = (fez)esm.ar.a();
        esm.h.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new fey(fez));
        fez.a.d((Object)new fhb());
        if (!esm.i.m(tnu.v)) {
            d.g();
            return;
        }
        throw null;
    }
}
