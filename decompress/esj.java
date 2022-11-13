import android.content.pm.PackageManager;
import android.app.Application;
import android.content.ComponentName;
import java.io.IOException;
import com.google.android.apps.youtube.app.application.backup.YouTubeBackupAgent;
import java.util.concurrent.TimeUnit;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esj implements Runnable
{
    public final esm a;
    private final int b;
    
    public esj(final esm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                final heo heo = (heo)this.a.R.a();
                ((tgd)((atke)heo.c).a()).g(heo.a);
                return;
            }
            case 19: {
                this.a.d.i(4);
                return;
            }
            case 18: {
                this.a.aV.a();
                return;
            }
            case 17: {
                final esm a = this.a;
                final tnm tnm = new tnm((Context)a.h, (tnn)a.av.a(), (tgd)a.C.a());
                tnm.c = tnm.b.h();
                final IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
                intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
                intentFilter.addDataScheme("file");
                tnm.a.registerReceiver((BroadcastReceiver)tnm, intentFilter);
                return;
            }
            case 16: {
                final esm a2 = this.a;
                final Application h = a2.h;
                ((NotificationManager)((Context)h).getSystemService("notification")).deleteNotificationChannel("GenericNotifications");
                tfg.l((Context)h, "generic_notifications", ((Context)h).getString(2132017842), 2, false, true);
                alxp alxp;
                if ((alxp = a2.bP.b().e) == null) {
                    alxp = alxp.a;
                }
                if (alxp.w) {
                    ((vwa)a2.aC.a()).N();
                }
                final IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.LOCALE_CHANGED");
                a2.h.registerReceiver((BroadcastReceiver)new fky(), intentFilter2);
                return;
            }
            case 15: {
                final jqk jqk = (jqk)this.a.bt.a();
                jqk.f();
                teu.k(((tmx)jqk.a.a()).a(), jqk.c, (tes)jdb.j, (tet)new joq(jqk, 6));
                jqk.b.g((Object)jqk);
                return;
            }
            case 14: {
                final esm a3 = this.a;
                final aipx b = a3.bP.b();
                if (b != null) {
                    amsp amsp;
                    if ((amsp = b.u) == null) {
                        amsp = amsp.a;
                    }
                    if (amsp.c) {
                        final fkt fkt = (fkt)a3.aD.a();
                        final Application h2 = a3.h;
                        if (!fkt.b.getAndSet(true)) {
                            ((Context)h2).registerReceiver((BroadcastReceiver)fkt, new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
                            fkt.c.a(((asht)fkt.a).A().x(1000L, TimeUnit.MILLISECONDS).af(atjj.c()).aH((asjm)new fcx(fkt, 11)));
                        }
                    }
                }
                return;
            }
            case 13: {
                final esm a4 = this.a;
                if (YouTubeBackupAgent.g((vlq)a4.aw.a())) {
                    YouTubeBackupAgent.f((Context)a4.h);
                    a4.bM = YouTubeBackupAgent.a((Context)a4.h);
                }
                return;
            }
            case 12: {
                final flj flj = (flj)this.a.br.a();
                flj.a.g((Object)flj);
                return;
            }
            case 11: {
                final ieo ieo = (ieo)this.a.bq.a();
                ((tgd)ieo.b.a()).g((Object)ieo);
                return;
            }
            case 10: {
                final ieu ieu = (ieu)this.a.bp.a();
                ((tgd)ieu.b.a()).g((Object)ieu);
                if (ieu.f != null) {
                    ieu.j();
                }
                return;
            }
            case 9: {
                this.a.d.i(4);
                return;
            }
            case 8: {
                final adji adji = (adji)this.a.aE.a();
                if (!adji.b) {
                    synchronized (adji) {
                        if (!adji.b) {
                            final adkf a5 = adji.a;
                            if (!a5.k) {
                                synchronized (a5.h) {
                                    if (!a5.k) {
                                        a5.k = true;
                                        a5.b.g((Object)a5);
                                        a5.e.p(a5);
                                        a5.f.a((adpo)a5);
                                        a5.i = a5.c.c().d();
                                    }
                                }
                            }
                            adji.c.b();
                            adji.b = true;
                        }
                    }
                }
                return;
            }
            case 7: {
                final esm a6 = this.a;
                try {
                    final zlt zlt = (zlt)a6.bn.a();
                    ((tgd)a6.C.a()).g((Object)zlt);
                    ((fet)a6.I.a()).f();
                    zlt.b();
                }
                catch (final IOException ex) {
                    ttr.d("Failed to read offline browse from store", (Throwable)ex);
                }
            }
            case 6: {
                final adhr adhr = (adhr)this.a.J.a();
                ((tgd)adhr.a.a()).g((Object)adhr);
                return;
            }
            case 5: {
                final esm a7 = this.a;
                if (((vai)a7.bc.a()).bA()) {
                    final hyx hyx = (hyx)a7.bi.a();
                    long h3;
                    if ((h3 = ((vai)hyx.d).h(45362681L)) == 0L) {
                        h3 = 72000L;
                    }
                    final long h4 = ((vai)hyx.d).h(45362682L);
                    long n = 3600L;
                    if (h4 > 0L) {
                        if (h4 > 86400L) {
                            n = n;
                        }
                        else {
                            n = h4;
                        }
                    }
                    hyx.a(2, h3, n, ((vai)hyx.d).f(45368457L), ((vai)hyx.d).h(45372726L), ((vai)hyx.d).f(45363153L), ((vai)hyx.d).f(45363090L));
                }
                return;
            }
            case 4: {
                final esm a8 = this.a;
                if (((tjm)a8.au.a()).n()) {
                    final ComponentName componentName = new ComponentName((Context)a8.h, "com.google.android.youtube.ManageNetworkUsageActivity");
                    final PackageManager packageManager = a8.h.getPackageManager();
                    if (packageManager.getComponentEnabledSetting(componentName) != 1) {
                        packageManager.setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                return;
            }
            case 3: {
                final esm a9 = this.a;
                ((tgd)a9.C.a()).g((Object)a9.an.a());
                return;
            }
            case 2: {
                final esm a10 = this.a;
                final zlt zlt2 = (zlt)a10.bo.a();
                ((tgd)a10.C.a()).g((Object)zlt2);
                zlt2.b();
                return;
            }
            case 1: {
                this.a.f();
                return;
            }
            case 0: {
                final gvb gvb = (gvb)this.a.bE.a();
                ansd ansd;
                if ((ansd = ((vaf)gvb.d.a()).b().A) == null) {
                    ansd = ansd.a;
                }
                if (ansd.e) {
                    ((tgd)gvb.c.a()).g((Object)gvb);
                    gvb.a();
                }
            }
        }
    }
}
