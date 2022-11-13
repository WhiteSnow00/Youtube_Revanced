import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager$UsageCallback;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.graphics.Rect;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.function.Consumer;
import android.os.RemoteException;
import java.util.concurrent.Executor;
import android.app.usage.NetworkStats$Bucket;
import j$.time.Instant;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import com.android.billingclient.api.SkuDetails;
import j$.util.Optional;
import com.google.android.apps.youtube.app.extensions.clips.ClipController;
import com.google.android.apps.youtube.app.extensions.accountlinking.PlayBilling;
import com.google.android.apps.youtube.app.extensions.accountlinking.AccountLinkingController;
import com.google.android.apps.youtube.app.datasaving.DefaultNetworkDataUsageMonitor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmf implements asjm
{
    public final Object a;
    private final int b;
    
    public gmf(final DefaultNetworkDataUsageMonitor a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gmf(final AccountLinkingController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gmf(final PlayBilling a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gmf(final ClipController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gmf(final gmi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gmf(final goy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gmf(final gpy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gmf(final gqr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gmf(final gra a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gmf(final spv a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(Object as) {
        final int b = this.b;
        final PlaybackStartDescriptor playbackStartDescriptor = null;
        final String s = null;
        long n = 0L;
        boolean b2 = false;
        switch (b) {
            default: {
                ((ClipController)this.a).p = (boolean)as;
                return;
            }
            case 19: {
                ((ClipController)this.a).o = (boolean)as;
                return;
            }
            case 18: {
                ((ClipController)this.a).x = (boolean)as;
                return;
            }
            case 17: {
                final Object a = this.a;
                final aans aans = (aans)as;
                if (aans.c() == abke.c && aans.b() != null) {
                    ((ClipController)a).i = aans.b().K();
                }
                return;
            }
            case 16: {
                final Object a2 = this.a;
                final Rect d = ((trn)as).a.d;
                ((gra)a2).c.set(d);
                ((afki)((afki)((afkg)gra.a).b()).j("com/google/android/apps/youtube/app/extensions/assistant/common/ui/AssistantUiUtils", "lambda$new$0", 61, "AssistantUiUtils.java")).t("#init onStarted() - insets: %s", (Object)d);
                return;
            }
            case 15: {
                final Object a3 = this.a;
                final aezp aezp = (aezp)as;
                if (aezp.h()) {
                    final akcw akcw = (akcw)aezp.c();
                    final aovv transactionIdStatus = akcw.getTransactionIdStatus();
                    if (transactionIdStatus == aovv.a) {
                        ((gqr)a3).f("Expected transaction id status to be initialized", "GET_TRANSACTION_ID_FAILURE");
                        return;
                    }
                    if (transactionIdStatus == aovv.c) {
                        ((gqr)a3).f("Error getting transaction id", "GET_TRANSACTION_ID_FAILURE");
                        return;
                    }
                    if (transactionIdStatus == aovv.d) {
                        final Optional of = Optional.of((Object)akcw.getTransactionId());
                        final gqr gqr = (gqr)a3;
                        gqr.g = of;
                        if ((long)gqr.g.get() <= 0L) {
                            gqr.f("Invalid transaction id", "GET_TRANSACTION_ID_FAILURE");
                            return;
                        }
                        gqr.e.b("GET_TRANSACTION_ID_SUCCESS");
                        try {
                            final SkuDetails skuDetails = new SkuDetails(akcw.getSkuDetailsJson());
                            gqr.c();
                            gqr.h = Optional.of((Object)akcw);
                            gqr.g(akcw, ancc.c);
                            gqr.d.execute(aeun.h((Runnable)new fsi(gqr, skuDetails, 15)));
                        }
                        catch (final JSONException ex) {
                            gqr.e("Unable to parse sku details from entity store", "GET_ENTITY_UNABLE_PARSE_SKU_DETAILS");
                        }
                    }
                }
                return;
            }
            case 14: {
                final Object a4 = this.a;
                final aaoa aaoa = (aaoa)as;
                ((PlayBilling)a4).h();
                return;
            }
            case 13: {
                final Object a5 = this.a;
                final skt b3 = (skt)as;
                final gpy gpy = (gpy)a5;
                gpy.b = b3;
                gpy.f();
                return;
            }
            case 12: {
                final Object a6 = this.a;
                final aaoa aaoa2 = (aaoa)as;
                ((AccountLinkingController)a6).j();
                return;
            }
            case 11: {
                final Object a7 = this.a;
                final abzl a8 = ((aany)as).a();
                final PlayerResponseModel c = a8.c();
                if (c == null) {
                    ttr.b("Video changed event does not have a PlayerResponse.");
                    return;
                }
                final ahiz b4 = c.b();
                if (b4 == null) {
                    return;
                }
                if ((b4.b & 0x1) != 0x0) {
                    final WeakReference c2 = new WeakReference(a8.aI());
                    final AccountLinkingController accountLinkingController = (AccountLinkingController)a7;
                    accountLinkingController.c = c2;
                    final vdq b5 = accountLinkingController.a.b();
                    final String c3 = b4.c;
                    accountLinkingController.b = ((vfp)b5).h(c3, false).af(asil.a()).aI((asjm)new gmf(accountLinkingController, 9), (asjm)gpg.e);
                    ((vfp)b5).f(c3).E(asil.a()).s((asjm)new gmf(accountLinkingController, 10)).p((asjg)new gcw(accountLinkingController, b4, 3)).ab();
                    return;
                }
                ttr.b("Account linking config does not have an entity key.");
                return;
            }
            case 10: {
                ((AccountLinkingController)this.a).k(((ahix)as).getLinked());
                return;
            }
            case 9: {
                final Object a9 = this.a;
                final vfn c4 = ((vft)as).c;
                if (!(c4 instanceof ahix)) {
                    ttr.b("Entity update does not have account link status.");
                    return;
                }
                ((AccountLinkingController)a9).k(((ahix)c4).getLinked());
                return;
            }
            case 8: {
                final Object a10 = this.a;
                final ahmg ahmg = (ahmg)as;
                if (ahmg == null) {
                    zlm.b(zll.b, zlk.a, "Ad player fullscreen state entity is null in onSuccess on exit");
                    return;
                }
                if (ahmg.getFullscreenForced()) {
                    final spv spv = (spv)a10;
                    if (((vai)spv.a).cK()) {
                        ((ghp)spv.d).l();
                        return;
                    }
                    ((kug)((atke)spv.g).a()).p(false);
                }
                return;
            }
            case 7: {
                ((goy)this.a).a = (boolean)as;
                return;
            }
            case 6: {
                final Object a11 = this.a;
                final boolean a12 = ((gmv)as).a;
                final DefaultNetworkDataUsageMonitor defaultNetworkDataUsageMonitor = (DefaultNetworkDataUsageMonitor)a11;
                final NetworkStatsManager$UsageCallback d2 = defaultNetworkDataUsageMonitor.d;
                if (d2 != null) {
                    defaultNetworkDataUsageMonitor.a.unregisterUsageCallback(d2);
                    defaultNetworkDataUsageMonitor.d = null;
                }
                if (!a12) {
                    final ashj e = defaultNetworkDataUsageMonitor.e;
                    if (e != null) {
                        e.c((Object)gmw.a);
                    }
                    return;
                }
                final ashj e2 = defaultNetworkDataUsageMonitor.e;
                if (e2 != null) {
                    e2.c((Object)gmw.b);
                }
                ahdy ahdy;
                if ((ahdy = ((jqf)defaultNetworkDataUsageMonitor.b.c()).u) == null) {
                    ahdy = ahdy.a;
                }
                as = (SecurityException)adyf.as(ahdy);
                final afsr a13 = afsr.a;
                final Instant now = Instant.now();
                try {
                    ((Instant)as).toEpochMilli();
                    now.toEpochMilli();
                    final NetworkStats querySummary = ((DefaultNetworkDataUsageMonitor)a11).a.querySummary(0, (String)null, ((Instant)as).toEpochMilli(), now.toEpochMilli());
                    if (querySummary == null) {
                        ttr.l("Failed to query network stats.");
                    }
                    else {
                        as = (SecurityException)new NetworkStats$Bucket();
                        long n2 = 0L;
                        while (querySummary.getNextBucket((NetworkStats$Bucket)as)) {
                            n += ((NetworkStats$Bucket)as).getRxBytes();
                            n2 += ((NetworkStats$Bucket)as).getTxBytes();
                        }
                        n += n2;
                    }
                    teu.k(aftq.e(defaultNetworkDataUsageMonitor.b.a(), aeun.a((aezf)new fmv(n, 6)), (Executor)afum.a), (Executor)afum.a, (tes)etj.t, (tet)new esc(defaultNetworkDataUsageMonitor, 11));
                    return;
                }
                catch (final SecurityException as) {}
                catch (final RemoteException ex2) {}
                throw gmf$$ExternalSyntheticBackport0.m("Could not get network stats", as);
            }
            case 5: {
                final Object a14 = this.a;
                final aanw aanw = (aanw)as;
                final gmi gmi = (gmi)a14;
                final boolean j = gmi.j;
                final boolean i = aanw.a() == 9 || aanw.a() == 10;
                gmi.j = i;
                if (i != j) {
                    String.format("isSeeking: %s", i);
                }
                final int m = gmi.m;
                int k;
                if (aanw.c()) {
                    k = 1;
                }
                else if (aanw.e()) {
                    k = 3;
                }
                else if (aanw.a() == 7) {
                    k = 4;
                }
                else {
                    k = 2;
                }
                gmi.m = k;
                final int a15 = aanw.a();
                gmi.h = a15;
                if (gmi.a.contains((Object)a15)) {
                    String.format("Invalid PlayerState: %s", gmi.h);
                    return;
                }
                if (m != gmi.m) {
                    if (gmi.i.i()) {
                        String.format("Old PlaybackState: %s, New PlaybackState: %s, Time: %s, PlayerState: %s", vdh.aU(m), vdh.aU(gmi.m), gmi.f, aanw.a());
                        final twj twj = (twj)a14;
                        if (twj.p && twj.q) {
                            twj.n.j().ifPresent((Consumer)new sux(twj, 20));
                        }
                    }
                }
                return;
            }
            case 4: {
                final Object a16 = this.a;
                final aani aani = (aani)as;
                final gmi gmi2 = (gmi)a16;
                if (gmi2.i.i()) {
                    final aiqj d3 = aani.d();
                    final PlayerResponseModel b6 = aani.b();
                    final WatchNextResponseModel a17 = aani.a();
                    String s2 = s;
                    if (d3 != null) {
                        s2 = abjr.e(d3);
                    }
                    String b7;
                    if (!aezr.f(s2)) {
                        b7 = s2;
                    }
                    else {
                        if (b6 != null) {
                            s2 = b6.K();
                        }
                        b7 = s2;
                        if (aezr.f(s2)) {
                            b7 = s2;
                            if (a17 != null) {
                                b7 = a17.b;
                            }
                        }
                    }
                    if (!aezr.f(b7) && !adkp.ae(gmi2.k, b7)) {
                        final abkb c5 = aani.c();
                        final boolean b8 = aani.b() != null;
                        final boolean b9 = aani.a() != null;
                        if (aani.d() != null) {
                            b2 = true;
                        }
                        String.format("SequencerStageEvent: \nStage: %s\nHas PR: %s\nHas WNR: %s\nHas Command: %s", c5, b8, b9, b2);
                        gmi2.h(b7);
                        gmi2.f = 0L;
                        as = (SecurityException)new gmg(gmi2, aani, 1);
                        ((twj)a16).m((atke)as);
                    }
                }
                return;
            }
            case 3: {
                final Object a18 = this.a;
                final aant aant = (aant)as;
                final gmi gmi3 = (gmi)a18;
                final long f = gmi3.f;
                gmi3.f = aant.e();
                if (gmi3.i.i()) {
                    if ((gmi3.j && gmi3.f != f) || Math.abs(gmi3.f - f) > 3000L) {
                        String.format("Seeking! Last position: %s, Current position: %s", f, gmi3.f);
                        final twj twj2 = (twj)a18;
                        if (twj2.p && twj2.q) {
                            twj2.o.tu((Object)true);
                        }
                    }
                }
                return;
            }
            case 2: {
                final Object a19 = this.a;
                final aamb aamb = (aamb)as;
                final gmi gmi4 = (gmi)a19;
                if (gmi4.l != aamb.a()) {
                    if (gmi4.i.i()) {
                        gmi4.l = aamb.a();
                        String.format("Playback rate changed: %s", aamb.a());
                        final twj twj3 = (twj)a19;
                        if (twj3.p && twj3.q) {
                            twj3.n.j().ifPresent((Consumer)new sux(twj3, 19));
                        }
                    }
                }
                return;
            }
            case 1: {
                final Object a20 = this.a;
                final aany aany = (aany)as;
                final gmi gmi5 = (gmi)a20;
                if (gmi5.i.i()) {
                    PlaybackStartDescriptor g;
                    if (aany == aany.a) {
                        g = playbackStartDescriptor;
                    }
                    else {
                        g = aany.a().g();
                    }
                    String.valueOf(g);
                    if (g != null) {
                        final String l = g.k();
                        if (!aezr.f(l) && !adkp.ae(gmi5.k, l)) {
                            gmi5.h(l);
                            gmi5.f = g.c();
                            int m2;
                            if (!g.w()) {
                                m2 = 2;
                            }
                            else {
                                m2 = 3;
                            }
                            gmi5.m = m2;
                            String.format("New video: %s, position: %s, paused: %s", g.k(), g.c(), g.w());
                            as = (SecurityException)new gmg(gmi5, g, 0);
                            ((twj)a20).m((atke)as);
                        }
                    }
                }
                return;
            }
            case 0: {
                final Object a21 = this.a;
                final fkr i2 = (fkr)as;
                final gmi gmi6 = (gmi)a21;
                if (gmi6.i != i2) {
                    gmi6.i = i2;
                    if (!i2.i()) {
                        gmi6.h(null);
                    }
                }
            }
        }
    }
}
