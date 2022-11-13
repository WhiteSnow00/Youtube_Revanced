import java.util.Iterator;
import android.net.Uri;
import android.util.Log;
import android.content.Context;
import com.google.android.libraries.youtube.systemhealth.termination.NativeCrashDetectorUtil;
import java.util.Map;
import java.io.IOException;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.io.File;
import java.util.Locale;
import java.util.function.Consumer;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import android.content.ComponentCallbacks;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esh implements Runnable
{
    public final esm a;
    private final int b;
    
    public esh(final esm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int b = this.b;
        final File file = null;
        final int n = 0;
        switch (b) {
            default: {
                final esm a = this.a;
                final zlo zlo = (zlo)a.D.a();
                zlm.a((zlj)zlo);
                ((tgd)a.C.a()).g(a.E.a());
                alxp alxp;
                if ((alxp = a.bP.b().e) == null) {
                    alxp = alxp.a;
                }
                if (alxp.B) {
                    final wxs wxs = (wxs)a.bv.a();
                    zlo.l(wxs.a((zis)a.bw.a()));
                    zlo.j();
                    Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new wxr(wxs, Thread.getDefaultUncaughtExceptionHandler(), 0));
                    teu.i(aftq.e(((tmx)wxs.c.a()).a(), (aezf)new wpw(8), (Executor)a.a), (tet)new wxq(wxs, 0));
                }
                return;
            }
            case 19: {
                ((addw)this.a.ae.a()).b();
                return;
            }
            case 18: {
                final adgk adgk = (adgk)this.a.af.a();
                final adgj adgj = (adgj)adgk.d;
                final tos tos = (tos)((adiz)adgj.j).e;
                final int v = tos.v;
                if (v == 2) {
                    final adiq a2 = adgj.a();
                    final int a3 = adid.a;
                    final adip adip = new adip();
                    a2.f.set(adip);
                    final Application application = (Application)a2.h.c;
                    application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)adip);
                    application.registerComponentCallbacks((ComponentCallbacks)adip);
                    ((tnz)a2.h.f).c();
                }
                else if (v == 1) {
                    final adiz d = adgj.d();
                    ((AtomicReference)d.b).set(((atke)adgk.g).a());
                    ((tnz)((adiz)d.f).f).c();
                }
                else if (v == 3) {
                    adgj.b();
                    final int a4 = adid.a;
                }
                if (tos.x == 1) {
                    ((adgj)adgk.d).c();
                }
                final aekp aekp = (aekp)((adgj)adgk.d).h.a();
                final adhw w = ((aujg)((atke)aekp.b).a()).w(ajfj.b);
                if (w.d) {
                    final adet adet = (adet)((atke)aekp.a).a();
                    w.c();
                    ((asht)((tok)((atke)adet.a).a()).m).Z((asjr)ablr.k).K((asjs)aada.r).Z((asjr)ablr.l).au(300L, TimeUnit.SECONDS, asht.I(), atjj.a()).aC(false).ab((asjm)new acpc(w, 5), (asjm)new acpc(w, 6));
                }
                ((Optional)adgk.h).ifPresent((Consumer)new aaxy(adgk, 19));
                return;
            }
            case 17: {
                final esm a5 = this.a;
                if (fbu.ag(a5.bP)) {
                    ((adhu)a5.bF.a()).f();
                }
                return;
            }
            case 16: {
                agse.d(new esg(this.a, 0));
                return;
            }
            case 15: {
                final esm a6 = this.a;
                alxp alxp2;
                if ((alxp2 = a6.bP.b().e) == null) {
                    alxp2 = alxp.a;
                }
                if (alxp2.aq) {
                    final eg eg = (eg)a6.bD.a();
                    ((vdr)eg.d).b().a((Class)aoli.class).j().E(atjj.b((Executor)eg.c)).ac((asjm)new gsa(eg, 10, (byte[])null, (byte[])null, (byte[])null));
                }
                return;
            }
            case 14: {
                ((wxx)this.a.az.a()).a();
                return;
            }
            case 13: {
                final esm a7 = this.a;
                teu.i(a7.l, (tet)new esc(a7, 1));
                return;
            }
            case 12: {
                final esm a8 = this.a;
                final tip tip = (tip)a8.aO.a();
                final Uri[] b2 = tip.b;
                if (b2 != null && b2.length > 0) {
                    final aujg aujg = (aujg)a8.M.a();
                    for (final Uri uri : tip.b) {
                        tbi.e();
                        if (((tjm)((atke)aujg.b).a()).o()) {
                            final long c = ((oby)((atke)aujg.c).a()).c();
                            String.format(Locale.US, "Prewarm %s", uri);
                            final znn znn = new znn(aujg, uri.toString(), tlu.d, (dbe)new zlq(2), c, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                            ((tlv)znn).g = false;
                            ((tjb)((atke)aujg.a).a()).a((tlv)znn);
                        }
                    }
                }
                return;
            }
            case 11: {
                final esm a9 = this.a;
                teu.i(a9.l, (tet)new esc(a9, 0));
                return;
            }
            case 10: {
                final esm a10 = this.a;
                if (a10.k.e()) {
                    final File file2 = (File)a10.aX.a();
                    if (file2 != null) {
                        if (file2.exists()) {
                            try {
                                if (!file2.isDirectory()) {
                                    tpe.aS(new File[] { file2 });
                                }
                                else {
                                    File file3 = new File(file2.getParentFile(), "_cleanup_mv0");
                                    int n2 = 0;
                                    while (file3.exists()) {
                                        final File parentFile = file2.getParentFile();
                                        ++n2;
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append("_cleanup_mv");
                                        sb.append(n2);
                                        file3 = new File(parentFile, sb.toString());
                                    }
                                    if (!file3.mkdir()) {
                                        file3 = file;
                                    }
                                    if (file3 != null) {
                                        final ArrayList<String> list = new ArrayList<String>();
                                        final File[] listFiles = file2.listFiles();
                                        for (int length2 = listFiles.length, j = n; j < length2; ++j) {
                                            list.add(listFiles[j].getAbsolutePath());
                                        }
                                        try {
                                            final ArrayList list2 = new ArrayList();
                                            list2.add("mv");
                                            list2.addAll(list);
                                            list2.add(file3.getAbsolutePath());
                                            tpe.aU((List)list2);
                                        }
                                        catch (final IOException | InterruptedException ex) {
                                            ttr.b("Could not move the root to the temp location");
                                        }
                                        tpe.aT(file3.getParentFile());
                                    }
                                }
                            }
                            finally {
                                tpe.aT(file2.getParentFile());
                            }
                        }
                    }
                }
                return;
            }
            case 9: {
                final esm a11 = this.a;
                final adgk adgk2 = (adgk)a11.af.a();
                final atke ah = a11.aH;
                ah.getClass();
                adgk2.a("system_health_cap_primes", (atke)new esd(ah, 0));
                esd esd;
                if (a11.i.e(tnu.J) == 3L) {
                    final atke ab = a11.aB;
                    ab.getClass();
                    esd = new esd(ab, 0);
                }
                else {
                    final atke aa = a11.aA;
                    aa.getClass();
                    esd = new esd(aa, 0);
                }
                adgk2.a("system_health_delayed_event_metrics", (atke)esd);
                final arkg bb = a11.bB;
                bb.getClass();
                adgk2.a("system_health_capturer_battery", (atke)new esd(bb, 2));
                adgk2.b("system_health_tx_gel", (atke)new esd(a11, 3));
                adgk2.b("system_health_tx_disk", (atke)new esd(a11, 4));
                final adkp adkp = (adkp)a11.aI.a();
                adgk2.b = true;
                final aora b4 = ((adjh)adgk2.c).b();
                if (b4.c) {
                    final Object o = adgk2.a.a();
                    for (final Map.Entry<String, V> entry : ((afes)adgk2.i).c().r()) {
                        final String s = entry.getKey();
                        final adje adje = (adje)((atke)entry.getValue()).a();
                        final aujg aujg2 = (aujg)((adht)o).e.a();
                        synchronized (aujg2.a) {
                            ((Map<String, adje>)aujg2.b).put(s, adje);
                            continue;
                        }
                        break;
                    }
                    for (final Map.Entry<String, V> entry2 : ((afes)adgk2.j).c().r()) {
                        final String s2 = entry2.getKey();
                        final adha adha = (adha)((atke)entry2.getValue()).a();
                        final adhu adhu = (adhu)((adht)o).d.a();
                        synchronized (adhu.a) {
                            ((Map<String, adha>)adhu.f).put(s2, adha);
                            continue;
                        }
                        break;
                    }
                    ((adht)o).a(b4);
                }
                final tos tos2 = (tos)((adiz)((adgj)adgk2.d).j).e;
                if (tos2.v == 0) {
                    final adik adik = (adik)((atke)adgk2.e).a();
                    if (adik.a > 0L) {
                        ((Thread)adik.e).start();
                    }
                }
                if (tos2.w == 0) {
                    final ahcq ahcq = (ahcq)((atke)adgk2.f).a();
                    aoqy aoqy;
                    if ((aoqy = ((adjh)ahcq.b).b().k) == null) {
                        aoqy = aoqy.a;
                    }
                    if (aoqy.b) {
                        aoqy aoqy2;
                        if ((aoqy2 = ((adjh)ahcq.b).b().k) == null) {
                            aoqy2 = aoqy.a;
                        }
                        ((NativeCrashDetectorUtil)((atke)ahcq.d).a()).a((Context)ahcq.a, 0L, aoqy2.e);
                    }
                }
                return;
            }
            case 8: {
                final ihm ihm = (ihm)this.a.Q.a();
                ((asid)ihm.a.a()).f((Runnable)new hvt(ihm, 17));
                return;
            }
            case 7: {
                this.a.e(false);
                return;
            }
            case 6: {
                final Application h = this.a.h;
                synchronized (eid.c) {
                    if (eid.d == null) {
                        try {
                            eid.d = new eid((Context)h, eid.a, eid.b, new elx((Context)h), (byte[])null);
                        }
                        catch (final Exception ex2) {
                            Log.e("GoogleConversionReporter", "Error starting automated usage thread", (Throwable)ex2);
                        }
                    }
                    monitorexit(eid.c);
                    final eid d2 = eid.d;
                    final Object e = d2.e;
                    synchronized (eid.c) {
                        d2.f.add("1001680686");
                        d2.g.remove("1001680686");
                    }
                }
            }
            case 5: {
                final ifm ifm = (ifm)this.a.P.a();
                final lgj e2 = ifm.e;
                e2.e = ((vef)e2.g).b().g((Class)amac.class).af(atjj.b((Executor)e2.c)).K((asjs)hus.q).Z((asjr)hzh.u).l(amac.class).aI(new igm(e2, null), (asjm)new iad(e2, 18, (byte[])null));
                ifm.f.a();
                ((idm)ifm.c.a()).a();
                ifm.g.D().R().az().p().an((asjm)new iad(ifm, 17), (asjm)hot.j);
                ifm.i = new pvh(ifm);
                ifm.a.g((Object)ifm);
                return;
            }
            case 4: {
                final aacf aacf = (aacf)this.a.W.a();
                ((aabo)((atke)aacf.b).a()).f();
                final aacg aacg = (aacg)((atke)aacf.c).a();
                if (!aacg.h) {
                    aacg.e.g((Object)aacg);
                    final ashi ashi = (ashi)aacg.d.a();
                    final asha b5 = asha.b;
                    askk.b((Object)b5, "overflowStrategy is null");
                    final asrf asrf = new asrf(ashi, b5);
                    final asjr k = atqx.j;
                    ((ashi)asrf).p().P(atjj.b((Executor)aacg.f)).am((asjm)new zim(aacg, 14));
                    aacg.c();
                    aacg.h = true;
                }
                final aujg aujg3 = (aujg)((atke)aacf.a).a();
                new asiq().c(aale.o((ashi)aujg3.c, (aezf)zxl.j).am((asjm)new zim(aujg3, 15, (byte[])null, (byte[])null, (byte[])null, (byte[])null)));
                return;
            }
            case 3: {
                this.a.bj.a();
                return;
            }
            case 2: {
                ((yvl)this.a.aS.a()).g();
                return;
            }
            case 1: {
                final adhv adhv = (adhv)this.a.K.a();
                if (adhv.b()) {
                    ((tgd)adhv.b.a()).a((Object)adhv, (Class)vju.class, (tge)adhv);
                }
                return;
            }
            case 0: {
                ((snf)this.a.aR.a()).c();
            }
        }
    }
}
