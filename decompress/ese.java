import java.util.List;
import com.google.android.libraries.elements.interfaces.JSController;
import java.util.Iterator;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import java.util.concurrent.Executor;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ese implements Runnable
{
    public final esm a;
    private final int b;
    
    public ese(final esm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                final esm a = this.a;
                if (!a.i.m(tnu.aF)) {
                    final rzv rzv = (rzv)a.aK.a();
                    qhz.e((Context)rzv.a);
                    qho.f((Context)rzv.a);
                    rzv.k(rzv.j());
                    ((Context)rzv.a).registerReceiver((BroadcastReceiver)new rjd(rzv, (byte[])null, (byte[])null, (byte[])null), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                    return;
                }
                break;
            }
            case 19: {
                final esm a2 = this.a;
                amie amie;
                if ((amie = a2.bP.b().i) == null) {
                    amie = amie.a;
                }
                ahss ahss;
                if ((ahss = amie.p) == null) {
                    ahss = ahss.a;
                }
                if (ahss.b && ahss.c.size() != 0) {
                    final msr msr = (msr)a2.aL.a();
                    final Iterator<Object> iterator = ((List<Object>)ahss.c).iterator();
                    while (iterator.hasNext()) {
                        msr.J((String)iterator.next());
                    }
                }
                return;
            }
            case 18: {
                ((tne)this.a.bb.a()).a();
                return;
            }
            case 17: {
                final adho defaultUncaughtExceptionHandler = (adho)this.a.aM.a();
                defaultUncaughtExceptionHandler.b = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)defaultUncaughtExceptionHandler);
                return;
            }
            case 16: {
                aoqn aoqn;
                if ((aoqn = this.a.bP.b().s) == null) {
                    aoqn = aoqn.a;
                }
                tpe.a = aoqn.e;
                return;
            }
            case 15: {
                this.a.d();
                return;
            }
            case 14: {
                ((tjb)this.a.bI.a()).c();
                return;
            }
            case 13: {
                final esm a3 = this.a;
                if (a3.i.e(tnu.J) != 3L) {
                    ((tcl)a3.Y.a()).b();
                }
                return;
            }
            case 12: {
                ((tcl)this.a.ai.a()).b();
                return;
            }
            case 11: {
                ((tcl)this.a.ag.a()).b();
                return;
            }
            case 10: {
                ((tcl)this.a.ah.a()).b();
                return;
            }
            case 9: {
                final esm a4 = this.a;
                final tgd tgd = (tgd)a4.C.a();
                tgd.a((Object)a4, (Class)zms.class, (tge)new esi(a4, 1));
                tgd.a((Object)a4, (Class)zmu.class, (tge)new esi(a4, 0));
                return;
            }
            case 8: {
                this.a.c();
                return;
            }
            case 7: {
                final esm a5 = this.a;
                final long d = a5.g.d();
                ((rzz)a5.ab.a()).f();
                a5.d.j();
                a5.c();
                a5.d();
                final tgd tgd2 = (tgd)a5.C.a();
                tgd2.d((Object)new sbl(d));
                tgd2.d((Object)new sbk());
                return;
            }
            case 6: {
                final esm a6 = this.a;
                a6.w.a();
                a6.x.a();
                a6.y.a();
                a6.z.a();
                a6.A.a();
                a6.B.a();
                a6.v.a();
                return;
            }
            case 5: {
                final esm a7 = this.a;
                if (a7.i.m(tnu.aG)) {
                    final mam mam = (mam)a7.bL.a();
                    if (((vai)mam.a).f(45382470L)) {
                        ((mam)mam.b).D();
                    }
                    else {
                        ((mam)mam.b).C();
                    }
                    if (((vai)mam.a).f(45379849L)) {
                        ((mam)mam.c).D();
                        return;
                    }
                    ((mam)mam.c).C();
                }
                return;
            }
            case 4: {
                this.a.bK.a();
                return;
            }
            case 3: {
                final idm idm = (idm)((ifm)this.a.P.a()).c.a();
                final fmr fmr = (fmr)idm.c.a();
                fmr.h = fmr.d(idm.b);
                return;
            }
            case 2: {
                final fwb fwb = (fwb)this.a.bs.a();
                if (fwb.c) {
                    ((Executor)fwb.b.a()).execute((Runnable)new eym(fwb, 12));
                }
                return;
            }
            case 1: {
                this.a.h(false);
                return;
            }
            case 0: {
                final JSController controller = ((JSEnvironment)this.a.aT.a()).getController();
                if (controller != null) {
                    controller.prewarmExecutor();
                    break;
                }
                break;
            }
        }
    }
}
