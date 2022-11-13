import java.util.List;
import java.util.concurrent.Callable;
import com.google.protobuf.MessageLite;
import com.google.apps.tiktok.account.AccountId;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class eqv implements atke
{
    private final eqy a;
    private final int b;
    private final esu c;
    
    public eqv(final eqy a, final esu c, final int b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final Object a() {
        final int b = this.b;
        boolean b2 = true;
        switch (b) {
            default: {
                final atke gf = this.a.gF;
                final eg eg = (eg)this.c.e.a();
                final eqy a = this.a;
                final atke au = a.au;
                final Executor executor = (Executor)a.r.a();
                final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)this.a.r.a();
                final eqy a2 = this.a;
                return new uzs(gf, eg, au, executor, scheduledExecutorService, a2.P, a2.e, a2.ax, a2.cW, (byte[])null, (byte[])null, (byte[])null);
            }
            case 29: {
                final Context context = (Context)this.a.c.a();
                final AccountId accountId = (AccountId)this.c.c.a();
                final aekp aekp = new aekp(aezp.k((Object)this.c.b.zO()), aezp.k((Object)"youtube-direct"));
                final esu c = this.c;
                return new acxg(context, accountId, aekp, new vai((vaf)c.b.w.a(), (arwh)c.b.v.a(), (byte[])null, (byte[])null), (oby)this.a.e.a(), (Executor)this.a.r.a(), (Executor)this.a.g.a(), (byte[])null);
            }
            case 28: {
                return new aadx((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (eg)this.c.e.a(), (vai)this.c.h.a(), (zmw)this.a.cB.a(), (tjb)this.a.fL.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 27: {
                return new aadx((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (eg)this.c.e.a(), (vai)this.c.h.a(), (zmw)this.a.cB.a(), (tjb)this.a.fL.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 26: {
                return new vai((vaf)this.a.w.a(), (arwh)this.a.v.a(), (byte[])null, (byte[])null);
            }
            case 25: {
                return new aadx((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (eg)this.c.e.a(), (vai)this.c.h.a(), (zmw)this.a.cB.a(), (tjb)this.a.fL.a(), (byte[])null, (char[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 24: {
                return new adfs((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (eg)this.c.e.a(), (tjb)this.a.fL.a(), (vaf)this.a.w.a(), null, null, null, null, null, null, null, null);
            }
            case 23: {
                return new adfq((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (eg)this.c.e.a(), (tjb)this.a.dD.a(), null, null, null, null, null, null, null, null);
            }
            case 22: {
                return new adfs((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (eg)this.c.e.a(), (tjb)this.a.fL.a(), null, null, null, null, null, null, null, null);
            }
            case 21: {
                return new adfs((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (eg)this.c.e.a(), (tjb)this.a.fL.a(), (Executor)this.a.g.a(), null, null, null, null, null, null, null, null);
            }
            case 20: {
                return new adfq((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (eg)this.c.e.a(), (tjb)this.a.fL.a(), null, (byte[])null, null, null, (byte[])null, (byte[])null, null, null, null);
            }
            case 19: {
                return new aadx((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (eg)this.c.e.a(), (tjb)this.a.dD.a(), (vaf)this.a.w.a(), (Executor)this.a.r.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 18: {
                return new vvj((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (zmf)this.c.f.a(), (tjb)this.a.fL.a(), (tjm)this.a.P.a(), (tnn)this.a.ek.a(), this.a.fZ, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 17: {
                return new adfs((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (eg)this.c.e.a(), (tjb)this.a.fL.a(), (Executor)this.a.r.a(), null, null, null, null, null, null, null, null, null);
            }
            case 16: {
                return new adfq((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (eg)this.c.e.a(), (tjb)this.a.fL.a(), null, null, null, null, null, (byte[])null, (byte[])null, null, null, null);
            }
            case 15: {
                return new adfq((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (eg)this.c.e.a(), (tjb)this.a.fL.a(), null, null, null, null, null, (char[])null, null, null, null);
            }
            case 14: {
                return new adfq((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (eg)this.c.e.a(), (tjb)this.a.fL.a(), null, null, null, null, null, null, (char[])null, null, null, null);
            }
            case 13: {
                return new adfq((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (eg)this.c.e.a(), (tjb)this.a.fL.a(), null, null, null, null, null, null, null, null, null, null, null);
            }
            case 12: {
                return new adfq((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (eg)this.c.e.a(), (tjb)this.a.fL.a(), null, (char[])null, null, null, null, null, null, null, null);
            }
            case 11: {
                return new rmp((eg)this.c.e.a(), (zmf)this.a.aC.a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 10: {
                return new vrl((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (zmf)this.c.f.a(), (tjb)this.a.fL.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 9: {
                return new adfq((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (eg)this.c.e.a(), (tjb)this.a.fL.a(), null, null, null, null, (char[])null, null, null, null, null);
            }
            case 8: {
                return new vqx((aeea)this.a.eT.a(), this.a.ae(), (eg)this.c.e.a(), (vaf)this.a.w.a(), (vln)this.a.fK.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 7: {
                return new adfq((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (eg)this.c.e.a(), (tjb)this.a.fL.a(), null, null, null, null, null, (char[])null, null, null, null, null);
            }
            case 6: {
                return new adfq((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (tjb)this.a.fL.a(), (eg)this.c.e.a(), null, null, null, null, null, null, null, null);
            }
            case 5: {
                return new vkv((oby)this.a.e.a(), 2, (byte[])null);
            }
            case 4: {
                final vln vln = (vln)this.a.fK.a();
                final aeea aeea = (aeea)this.a.eT.a();
                final eg eg2 = (eg)this.c.e.a();
                final tjb tjb = (tjb)this.a.fL.a();
                final Executor executor2 = (Executor)this.a.r.a();
                return new adfq(vln, aeea, eg2, tjb, null, null, null, null, null, null, null, null, null, null, null, null);
            }
            case 3: {
                return new eg((AccountId)this.c.c.a(), (ahcq)this.a.aG.a(), (rif)this.a.aC.a(), (Executor)this.a.ay.a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 2: {
                final AccountId a3 = this.c.a;
                if (a3 == null) {
                    b2 = false;
                }
                adkp.R(b2, (Object)"Null propagated AccountId! Check that you have included one of the following modules:\n\t//java/com/google/apps/tiktok/account:module\n\t//java/com/google/apps/tiktok/account/testing:module");
                a3.getClass();
                return a3;
            }
            case 1: {
                final arcm a4 = aeqm.a();
                a4.c((MessageLite)fmp.a);
                a4.d = "main_offline_usage";
                final aeqm b3 = a4.b();
                final esu c2 = this.c;
                final ahdc ahdc = new ahdc(c2.x(), c2.b.q, (byte[])null, (byte[])null);
                final eg eg3 = (eg)this.a.aA.a();
                adkp.R(true, (Object)"LamsConfig in ProtoDataStoreConfig must be used together with @LamsSync annotation");
                afvs f;
                if ((f = b3.f) == null) {
                    f = (afvs)((atke)ahdc.b).a();
                }
                final qqr d = rhl.d(b3.a, f.rz(aeun.i((Callable)new zuj(ahdc, b3, 10, (byte[])null, (byte[])null))), b3.b, (Executor)f, b3.e, eg3);
                if (!b3.d.isEmpty()) {
                    d.c((aftz)qpy.b((List)b3.d, (Executor)f));
                }
                return d;
            }
            case 0: {
                return new fzw((qqr)this.c.d.a(), (Executor)this.a.r.a());
            }
        }
    }
}
