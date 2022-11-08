import java.util.List;
import java.util.concurrent.Callable;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;
import com.google.apps.tiktok.account.AccountId;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class eqs implements atjj
{
    private final eqv a;
    private final int b;
    private final esr c;
    
    public eqs(final eqv a, final esr c, final int b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final Object a() {
        final int b = this.b;
        boolean b2 = true;
        switch (b) {
            default: {
                final Context context = (Context)this.a.c.a();
                final AccountId accountId = (AccountId)this.c.c.a();
                final aeim aeim = new aeim(aexq.k(this.c.b.zM()), aexq.k("youtube-direct"));
                final esr c = this.c;
                return new acvd(context, accountId, aeim, new uyi((uyf)c.b.w.a(), (arud)c.b.v.a(), (byte[])null, (byte[])null), (oas)this.a.e.a(), (Executor)this.a.r.a(), (Executor)this.a.g.a(), (byte[])null);
            }
            case 29: {
                return new aaca((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (eg)this.c.e.a(), (uyi)this.c.h.a(), (zkz)this.a.cB.a(), (tgw)this.a.fI.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 28: {
                return new aaca((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (eg)this.c.e.a(), (uyi)this.c.h.a(), (zkz)this.a.cB.a(), (tgw)this.a.fI.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 27: {
                return new uyi((uyf)this.a.w.a(), (arud)this.a.v.a(), (byte[])null, (byte[])null);
            }
            case 26: {
                return new aaca((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (eg)this.c.e.a(), (uyi)this.c.h.a(), (zkz)this.a.cB.a(), (tgw)this.a.fI.a(), (byte[])null, (char[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 25: {
                return new addr((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (eg)this.c.e.a(), (tgw)this.a.fI.a(), (uyf)this.a.w.a(), null, null, null, null, null, null);
            }
            case 24: {
                return new addp((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (eg)this.c.e.a(), (tgw)this.a.dC.a(), null, null, null, null, null, null);
            }
            case 23: {
                return new addr((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (eg)this.c.e.a(), (tgw)this.a.fI.a(), null, null, null, null, null, null);
            }
            case 22: {
                return new addr((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (eg)this.c.e.a(), (tgw)this.a.fI.a(), (Executor)this.a.g.a(), null, null, null, null, null, null);
            }
            case 21: {
                return new addp((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (eg)this.c.e.a(), (tgw)this.a.fI.a(), null, (byte[])null, null, (byte[])null, (byte[])null, null, null);
            }
            case 20: {
                return new aaca((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (eg)this.c.e.a(), (tgw)this.a.dC.a(), (uyf)this.a.w.a(), (Executor)this.a.r.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 19: {
                return new vti((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (zki)this.c.f.a(), (tgw)this.a.fI.a(), (thh)this.a.P.a(), (tlk)this.a.ei.a(), this.a.fW, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 18: {
                return new addr((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (eg)this.c.e.a(), (tgw)this.a.fI.a(), (Executor)this.a.r.a(), null, null, null, null, null, null, null);
            }
            case 17: {
                return new addp((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (eg)this.c.e.a(), (tgw)this.a.fI.a(), null, null, null, null, (byte[])null, (byte[])null, null, null);
            }
            case 16: {
                return new addp((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (eg)this.c.e.a(), (tgw)this.a.fI.a(), null, null, null, null, (char[])null, null, null);
            }
            case 15: {
                return new addp((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (eg)this.c.e.a(), (tgw)this.a.fI.a(), null, null, null, null, null, (char[])null, null, null);
            }
            case 14: {
                return new addp((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (eg)this.c.e.a(), (tgw)this.a.fI.a(), null, null, null, null, null, null, null, null, null);
            }
            case 13: {
                return new addp((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (eg)this.c.e.a(), (tgw)this.a.fI.a(), null, (char[])null, null, null, null, null, null);
            }
            case 12: {
                return new rkm((eg)this.c.e.a(), (zki)this.a.aC.a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 11: {
                return new vpj((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (zki)this.c.f.a(), (tgw)this.a.fI.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 10: {
                return new addp((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (eg)this.c.e.a(), (tgw)this.a.fI.a(), null, null, null, (char[])null, null, null, null);
            }
            case 9: {
                return new vou((adcr)this.a.eQ.a(), this.a.ad(), (eg)this.c.e.a(), (uyf)this.a.w.a(), (vjh)this.a.fH.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 8: {
                return new addp((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (eg)this.c.e.a(), (tgw)this.a.fI.a(), null, null, null, null, (char[])null, null, null, null);
            }
            case 7: {
                return new addp((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (tgw)this.a.fI.a(), (eg)this.c.e.a(), null, null, null, null, null, null);
            }
            case 6: {
                return new vir((oas)this.a.e.a(), 2, (byte[])null);
            }
            case 5: {
                final vjh vjh = (vjh)this.a.fH.a();
                final adcr adcr = (adcr)this.a.eQ.a();
                final eg eg = (eg)this.c.e.a();
                final tgw tgw = (tgw)this.a.fI.a();
                final Executor executor = (Executor)this.a.r.a();
                return new addp(vjh, adcr, eg, tgw, null, null, null, null, null, null, null, null, null, null);
            }
            case 4: {
                return new eg((AccountId)this.c.c.a(), (ahar)this.a.aG.a(), (rgb)this.a.aC.a(), (Executor)this.a.ay.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 3: {
                return eov.d(this.a.a.E());
            }
            case 2: {
                final AccountId a = this.c.a;
                if (a == null) {
                    b2 = false;
                }
                agot.E(b2, (Object)"Null propagated AccountId! Check that you have included one of the following modules:\n\t//java/com/google/apps/tiktok/account:module\n\t//java/com/google/apps/tiktok/account/testing:module");
                a.getClass();
                return a;
            }
            case 1: {
                final aqzy a2 = aeom.a();
                a2.c((MessageLite)fmj.a);
                a2.d = "main_offline_usage";
                final aeom b3 = a2.b();
                final esr c2 = this.c;
                final ahbd ahbd = new ahbd(c2.x(), c2.b.q, null, null, null);
                final eg eg2 = (eg)this.a.aA.a();
                agot.E(true, (Object)"LamsConfig in ProtoDataStoreConfig must be used together with @LamsSync annotation");
                aftr f;
                if ((f = b3.f) == null) {
                    f = (aftr)((atjj)ahbd.b).a();
                }
                final aagm u = qaw.u(b3.a, f.rt(aesm.i((Callable)new aejg(ahbd, b3, 3, (byte[])null, (byte[])null))), b3.b, (Executor)f, b3.e, eg2);
                if (!b3.d.isEmpty()) {
                    u.d((afry)qop.b((List)b3.d, (Executor)f));
                }
                return u;
            }
            case 0: {
                return new fzo((aagm)this.c.d.a(), (Executor)this.a.r.a(), (byte[])null);
            }
        }
    }
}
