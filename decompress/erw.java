import java.util.List;
import android.content.pm.PackageInfo;
import java.util.Iterator;
import java.util.logging.Logger;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import android.os.SystemClock;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.function.Consumer;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build$VERSION;
import java.util.concurrent.Executor;
import android.content.Context;
import android.os.Handler;
import android.os.Bundle;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;

// 
// Decompiled by Procyon v0.6.0
// 

public final class erw implements Runnable
{
    public final Object a;
    private final int b;
    
    public erw(final erx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public erw(final esm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int b = this.b;
        boolean b2 = false;
        switch (b) {
            default: {
                final esm esm = (esm)this.a;
                final Iterator<Object> iterator = ((List<Object>)((vai)esm.be.a()).c(45372544L, new byte[0]).b).iterator();
                while (iterator.hasNext()) {
                    ((IntersectionEngine)esm.bJ.a()).setEnableProminenceForGroup(iterator.next(), false);
                }
                return;
            }
            case 19: {
                ((esm)this.a).h(true);
                return;
            }
            case 18: {
                ((esm)this.a).d.i(1);
                return;
            }
            case 17: {
                ((vkf)((esm)this.a).aU.a()).g();
                return;
            }
            case 16: {
                ((esm)this.a).aQ.a();
                return;
            }
            case 15: {
                final aacf aacf = (aacf)((esm)this.a).W.a();
                final aabx aabx = (aabx)((aacg)((atke)aacf.c).a()).b.a();
                aabx.i.submit((Runnable)new ztz(aabx, 12));
                aabx.d();
                aabx.j.g((Object)aabx);
                final acid acid = (acid)((aezv)aacf.d).a;
                if (((vai)acid.c).f(45353564L)) {
                    aale.o((ashi)acid.a, (aezf)zxl.l).P((asid)acid.b).an((asjm)new zim(acid, 16, (byte[])null, (byte[])null, (byte[])null), (asjm)uyl.p);
                }
                return;
            }
            case 14: {
                final esm esm2 = (esm)this.a;
                ((vpw)esm2.N.a()).b();
                final tcq tcq = (tcq)esm2.at.a();
                ahiq ahiq;
                if ((ahiq = esm2.j.b().b().h) == null) {
                    ahiq = ahiq.a;
                }
                if (ahiq.f) {
                    tcq.d("AccountsRemovedTask", 0L, true, 0, false, (Bundle)null, (ypi)null, false);
                }
                tcq.d("IdentityStoreBackfillTask", 0L, true, 0, false, (Bundle)null, (ypi)null, false);
                return;
            }
            case 13: {
                final esm esm3 = (esm)this.a;
                if (((vai)esm3.bf.a()).G()) {
                    oht.b((Context)esm3.h, (Handler)esm3.bh.a());
                }
                return;
            }
            case 12: {
                final esm esm4 = (esm)this.a;
                final arwh c = esm4.j.c();
                zqk.d(c, (tcq)esm4.at.a(), esm4.g, 0, false);
                c.h().af(atjj.b((Executor)((atke)new esd(esm4, 5)).a())).Z((asjr)zhp.e).A().aH((asjm)new zim((tcq)esm4.at.a(), 4));
                return;
            }
            case 11: {
                ((flv)((esm)this.a).S.a()).f();
                return;
            }
            case 10: {
                ((acaq)((esm)this.a).p.a()).a();
                return;
            }
            case 9: {
                final esm esm5 = (esm)this.a;
                if (fbu.af(esm5.bP)) {
                    final gtx gtx = (gtx)esm5.aG.a();
                    if (!gtx.a()) {
                        final long c2 = gtx.d.c();
                        final long long1 = gtx.c.getLong("lens_last_check_time", 0L);
                        if (long1 <= 0L || c2 - long1 >= gtx.a) {
                            final Context b3 = gtx.b;
                            long longVersionCode;
                            try {
                                final PackageInfo packageInfo = b3.getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 0);
                                if (Build$VERSION.SDK_INT >= 28) {
                                    longVersionCode = packageInfo.getLongVersionCode();
                                }
                                else {
                                    longVersionCode = packageInfo.versionCode;
                                }
                            }
                            catch (final PackageManager$NameNotFoundException ex) {
                                longVersionCode = -1L;
                            }
                            if (longVersionCode >= 301130682L) {
                                b2 = true;
                            }
                            gtx.c.edit().putBoolean("lens_available", b2).putLong("lens_last_check_time", c2).apply();
                        }
                    }
                }
                return;
            }
            case 8: {
                final aacf aacf2 = (aacf)((esm)this.a).aF.a();
                aacf2.g(2);
                amsp amsp;
                if ((amsp = ((vaf)aacf2.b).b().u) == null) {
                    amsp = amsp.a;
                }
                if (!amsp.d) {
                    return;
                }
                ((zaz)aacf2.a).s().ifPresent((Consumer)new ynq(aacf2, 6, (byte[])null, (byte[])null));
                return;
            }
            case 7: {
                ((swt)((esm)this.a).bG.a()).a();
                return;
            }
            case 6: {
                final esm esm6 = (esm)this.a;
                ((erx)esm6.h).f(esm6.o);
                return;
            }
            case 5: {
                final vad vad = (vad)((esm)this.a).as.a();
                if (vad.b) {
                    return;
                }
                Label_1191: {
                    if ((int)vad.a.a() >= 16200000) {
                        final aipx b4 = ((vaf)vad.e).b();
                        if (b4 != null) {
                            ajsz ajsz;
                            if ((ajsz = b4.w) == null) {
                                ajsz = ajsz.a;
                            }
                            if (ajsz.b) {
                                ((FirebaseAnalytics)((arkg)vad.d).a()).a(true);
                                vad.c = true;
                                ttr.g("FirebaseAnalytics initialization successful");
                                break Label_1191;
                            }
                        }
                    }
                    ((FirebaseAnalytics)((arkg)vad.d).a()).a(false);
                }
                vad.b = true;
                return;
            }
            case 4: {
                ((zqo)((adet)((esm)this.a).X.a()).a).a(feg.a());
                return;
            }
            case 3: {
                final Object a = this.a;
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final erx erx = (erx)a;
                ((rzz)erx.k.a()).f();
                ((ewp)erx.d.a()).j();
                final tgd tgd = (tgd)erx.q.a();
                tgd.d((Object)new sbl(elapsedRealtime));
                tgd.d((Object)new sbk());
                return;
            }
            case 2: {
                final erx erx2 = (erx)this.a;
                final zme c3 = ((zmf)erx2.l.a()).c();
                if (c3 instanceof AccountIdentity && !c3.z()) {
                    ((rhx)erx2.m.a()).g((AccountIdentity)c3);
                }
                return;
            }
            case 1: {
                final adgj adgj = (adgj)((erx)this.a).j.a();
                final tos tos = (tos)((adiz)adgj.j).e;
                final int v = tos.v;
                if (v == 1) {
                    final adiz adiz = (adiz)adgj.a.a();
                    if (adiz.a > 0L) {
                        ((Thread)adiz.e).start();
                    }
                }
                else if (v == 2) {
                    final adiq adiq = (adiq)adgj.b.a();
                    final int a2 = adid.a;
                    adiq.e.post((Runnable)new adap(adiq, 11));
                    adiq.i.schedule(new adio(adiq), adiq.a + 50L, TimeUnit.MILLISECONDS);
                }
                else if (v == 3) {
                    final adis adis = (adis)adgj.c.a();
                    final int a3 = adid.a;
                    adis.d.post((Runnable)new adap(adis, 12));
                    adis.f.start();
                }
                else if (v == 4) {
                    final adiw adiw = (adiw)adgj.d.a();
                    final int a4 = adid.a;
                    adiw.f.post((Runnable)new adap(adiw, 13));
                    adiw.j.schedule(new adiu(adiw), adiw.b + 50L, TimeUnit.MILLISECONDS);
                    adiw.j.schedule((Runnable)new adap(adiw, 14), adiw.a + 50L, TimeUnit.MILLISECONDS);
                }
                if (tos.x == 1) {
                    ((adix)adgj.e.a()).a();
                }
                if (tos.w == 1) {
                    ((aekp)adgj.f.a()).n();
                }
                if (tos.y) {
                    Logger.getLogger("ErrorLoggingExecutor").addHandler((java.util.logging.Handler)new adgi(adgj));
                }
                final adkp adkp = (adkp)adgj.i.a();
                return;
            }
            case 0: {
                final erx erx3 = (erx)this.a;
                ((vlk)erx3.p.a()).p(((ewp)erx3.d.a()).a.f(), (tnx)erx3.o.a());
            }
        }
    }
}
