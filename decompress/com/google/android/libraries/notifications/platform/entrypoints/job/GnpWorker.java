// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.notifications.platform.entrypoints.job;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.CoroutineWorker;

public final class GnpWorker extends CoroutineWorker
{
    public phy g;
    private final WorkerParameters h;
    
    public GnpWorker(final Context context, final WorkerParameters h) {
        context.getClass();
        h.getClass();
        super(context, h);
        this.h = h;
    }
    
    @Override
    public final Object c(final atld atld) {
        Object g = super.c;
        final pqu a = pqt.a;
        final Context applicationContext = ((Context)g).getApplicationContext();
        try {
            qge.f((Context)g);
        }
        catch (final IllegalStateException ex) {
            pqw.j("Gnp", "PhenotypeContext.setContext was called more than once", new Object[0]);
        }
        final pqu a2 = pqt.a;
        Label_0072: {
            if (applicationContext instanceof eom) {
                final pqu pqu = (pqu)((eom)applicationContext).a();
                break Label_0072;
            }
            try {
                final pqu pqu = (pqu)ahbz.az((Context)g, pqu.class);
                final atjj atjj = pqu.dp().get(GnpWorker.class);
                if (atjj != null) {
                    final Object a3 = atjj.a();
                    a3.getClass();
                    g = ((eqv)((cya)a3).a).a.S.a();
                    this.g = (phy)g;
                    phy phy;
                    if ((phy = (phy)g) == null) {
                        atnh.b("gnpWorkerHandler");
                        phy = null;
                    }
                    g = this.h;
                    final cmh b = ((WorkerParameters)g).b;
                    b.getClass();
                    return phy.a(b, ((WorkerParameters)g).d, atld);
                }
                pqw.h("GnpWorker", "Failed to inject dependencies.", new Object[0]);
                return ckx.a();
            }
            catch (final IllegalStateException ex2) {
                pqw.k("Gnp", "Couldn't fetch TikTok entry point, ignore if not a TikTok app", new Object[0]);
                throw new NullPointerException("Unable to get GnpComponent from host app: ".concat(String.valueOf(((Context)g).getPackageName())));
            }
        }
    }
}
