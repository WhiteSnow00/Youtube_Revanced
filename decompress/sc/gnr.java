import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand;
import com.google.protos.youtube.api.innertube.YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand;
import com.google.protos.youtube.api.innertube.CommerceActionCommandOuterClass$CommerceActionCommand;
import android.util.Pair;
import com.google.protos.youtube.api.innertube.UpsellDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.MultiMessageConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.FancyDismissibleDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.OpenDialogCommandOuterClass$OpenDialogCommand;
import java.util.List;
import java.util.HashMap;
import com.google.protos.youtube.api.innertube.AppStoreEndpointOuterClass;
import com.google.protos.youtube.api.innertube.GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand;
import java.util.Map;
import java.util.concurrent.Executor;
import android.app.Activity;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnr implements vcv
{
    public final Context a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    private final int i;
    
    public gnr(final Activity a, final vcy f, final adfq h, final vdr g, final tqd b, final wyv e, final Executor c, final int i, final byte[] array) {
        this.i = i;
        this.a = (Context)a;
        this.h = h;
        this.f = f;
        this.g = g;
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = new sxr();
    }
    
    public gnr(final Activity a, final xib g, final zmf e, final wyv h, final tqd b, final vcy f, final Executor c, final int i, final byte[] array, final byte[] array2, final byte[] array3) {
        this.i = i;
        this.a = (Context)a;
        this.g = g;
        this.e = e;
        this.h = h;
        this.b = b;
        this.f = f;
        this.c = c;
        this.d = new sxr();
    }
    
    public gnr(final Context a, final vcy b, final fec e, final cl d, final aahh g, final wyv f, final atke c, final aeea h, final int i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.i = i;
        this.a = a;
        this.b = b;
        this.e = e;
        this.d = d;
        this.g = g;
        this.f = f;
        this.c = c;
        this.h = h;
    }
    
    public gnr(final Context a, final vwa b, final vcy d, final Executor c, final acgs e, final wyv f, final zmf g, final tag h, final int i, final byte[] array, final byte[] array2) {
        this.i = i;
        this.a = a;
        this.b = b;
        this.c = c;
        d.getClass();
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public gnr(final bu d, final Context a, final Executor c, final Executor e, final vwa f, final zmf h, final vcy b, final wyv g, final int i, final byte[] array) {
        this.i = i;
        this.d = d;
        this.a = a;
        this.c = c;
        this.e = e;
        this.f = f;
        this.h = h;
        this.b = b;
        this.g = g;
    }
    
    public gnr(final hyx b, final vgy h, final fbb d, final Activity a, final rpa g, final vai c, final vwa e, final geu f, final int i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.i = i;
        this.b = b;
        h.getClass();
        this.h = h;
        d.getClass();
        this.d = d;
        a.getClass();
        this.a = (Context)a;
        g.getClass();
        this.g = g;
        c.getClass();
        this.c = c;
        this.e = e;
        this.f = f;
    }
    
    public final void mE(aiqj aiqj, final Map ah) {
        final int i = this.i;
        int n = 4;
        if (i == 0) {
            final GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand getPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand = (GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand)((ahbc)aiqj).rx((ahaq)GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.getPdgBuyFlowCommand);
            final Object b = this.b;
            final zme c = ((zmf)this.g).c();
            final vwa vwa = (vwa)b;
            final adfq q = ((vtx)aefb.O((Context)vwa.a, (Class)vtx.class, ((zlv)vwa.b).a(c))).q();
            final vtw vtw = new vtw(q.c, ((eg)q.d).ab(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            vtw.a = getPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.b;
            teu.l(((vml)q.e).b((vls)vtw, (Executor)afum.a), (Executor)this.c, (tes)new fcf(this, 7), (tet)new fcy(this, aiqj, ah, 4), afwb.a);
            return;
        }
        if (i == 1) {
            ((vgy)this.h).o(tpe.M(ah, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag"), ahrs.c);
            final ahvd ahvd = (ahvd)((ahbc)aiqj).rx((ahaq)AppStoreEndpointOuterClass.appStoreEndpoint);
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", tpe.M(ah, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag"));
            final aili a = aili.a;
            ((fbb)this.d).a(aili.c, (List)ahvd.h, (Map)hashMap);
            ((geu)this.f).g(4);
            final Context a2 = this.a;
            final String b2 = ahvd.b;
            final String c2 = ahvd.c;
            final String d = ahvd.d;
            final String e = ahvd.e;
            final boolean f = ahvd.f;
            final boolean j = ((rpa)this.g).j();
            ((vai)this.c).bo();
            final boolean booleanValue = (boolean)((vai)this.c).bo().aM();
            final List f2 = ((rpa)this.g).f();
            final Object e2 = this.e;
            final Object b3 = this.b;
            aiqj.getClass();
            final hyx hyx = (hyx)b3;
            final vcy vcy = (vcy)((atke)hyx.c).a();
            vcy.getClass();
            final fxw fxw = (fxw)((atke)hyx.a).a();
            fxw.getClass();
            final geu geu = (geu)((atke)hyx.b).a();
            geu.getClass();
            final fbb fbb = (fbb)((atke)hyx.d).a();
            fbb.getClass();
            tcg.j((Activity)a2, b2, c2, d, e, f, j, booleanValue, f2, (vwa)e2, (tcb)new fce(aiqj, vcy, fxw, geu, fbb));
            return;
        }
        if (i == 2) {
            if ((((OpenDialogCommandOuterClass$OpenDialogCommand)((ahbc)aiqj).rx((ahaq)OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand)).b & 0x1) != 0x0) {
                anuv anuv;
                if ((anuv = ((OpenDialogCommandOuterClass$OpenDialogCommand)((ahbc)aiqj).rx((ahaq)OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand)).c) == null) {
                    anuv = anuv.a;
                }
                if (((ahbc)anuv).ry((ahaq)amsi.a)) {
                    ((fec)this.e).mE(aiqj, ah);
                    return;
                }
                if (((ahbc)anuv).ry((ahaq)FancyDismissibleDialogRendererOuterClass.fancyDismissibleDialogRenderer)) {
                    acaz.h(this.a, (ajrv)((ahbc)anuv).rx((ahaq)FancyDismissibleDialogRendererOuterClass.fancyDismissibleDialogRenderer), (vcy)this.b, (aeea)((atke)this.c).a(), (Object)null, (aeea)this.h);
                    return;
                }
                if (((ahbc)anuv).ry((ahaq)MultiMessageConfirmDialogRendererOuterClass.multiMessageConfirmDialogRenderer)) {
                    wlh wlh;
                    if ((wlh = (wlh)((cl)this.d).f("MultiMessageConfirmDialogFragment")) == null) {
                        wlh = new wlh();
                    }
                    final Object d2 = this.d;
                    final amld ag = (amld)((ahbc)anuv).rx((ahaq)MultiMessageConfirmDialogRendererOuterClass.multiMessageConfirmDialogRenderer);
                    if (wlh.ar()) {
                        wlh.dismiss();
                    }
                    wlh.ag = ag;
                    wlh.ah = ah;
                    wlh.r((cl)d2, "MultiMessageConfirmDialogFragment");
                    return;
                }
                if (((ahbc)anuv).ry((ahaq)UpsellDialogRendererOuterClass.upsellDialogRenderer)) {
                    ((aahh)this.g).a(((ahbc)anuv).rx((ahaq)UpsellDialogRendererOuterClass.upsellDialogRenderer), ((wyv)this.f).pF(), (Pair)null, (aaiq)null);
                }
            }
            return;
        }
        if (i != 3) {
            if (i != 4) {
                final CommerceActionCommandOuterClass$CommerceActionCommand commerceActionCommandOuterClass$CommerceActionCommand = (CommerceActionCommandOuterClass$CommerceActionCommand)((ahbc)aiqj).rx((ahaq)CommerceActionCommandOuterClass$CommerceActionCommand.commerceActionCommand);
                if (!commerceActionCommandOuterClass$CommerceActionCommand.h) {
                    ((sxr)this.d).show(((Activity)this.a).getFragmentManager(), sxr.a);
                }
                final adfq adfq = (adfq)this.h;
                final vwy vwy = new vwy(adfq.c, ((zmf)adfq.d).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                vwy.c = commerceActionCommandOuterClass$CommerceActionCommand.d;
                vwy.b = commerceActionCommandOuterClass$CommerceActionCommand.c;
                ((vkk)vwy).j(aiqj.c);
                final ahbx e3 = commerceActionCommandOuterClass$CommerceActionCommand.e;
                final vdq b4 = ((vdr)this.g).b();
                for (final String s : e3) {
                    if (((vfp)b4).f(s).af() != null) {
                        final byte[] d3 = ((vfn)((vfp)b4).f(s).af()).d();
                        if (d3 == null) {
                            continue;
                        }
                        vwy.a.add(ahab.x(d3));
                    }
                }
                if ((commerceActionCommandOuterClass$CommerceActionCommand.b & 0x4) != 0x0) {
                    final Object f3 = this.f;
                    if ((aiqj = commerceActionCommandOuterClass$CommerceActionCommand.f) == null) {
                        aiqj = aiqj.a;
                    }
                    ((vcy)f3).a(aiqj);
                }
                teu.k(((vml)((adfq)this.h).e).b((vls)vwy, (Executor)this.c), (Executor)this.c, (tes)new etf(this, commerceActionCommandOuterClass$CommerceActionCommand, 11, null), (tet)new tws(this, 1, (byte[])null));
                return;
            }
            final Object g = this.g;
            final zme c3 = ((zmf)this.e).c();
            final xib xib = (xib)g;
            final aadx m = ((vxs)aefb.O((Context)xib.b, (Class)vxs.class, ((zlv)xib.a).a(c3))).m();
            final YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand ypcGetCancellationFlowCommand$YPCGetCancellationFlowCommand = (YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand)((ahbc)aiqj).rx((ahaq)YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.ypcGetCancellationFlowCommand);
            final vwz vwz = new vwz(m.c, ((eg)m.f).ab(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            ypcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.getClass();
            vwz.a = vwz.g(ypcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.b);
            ((vkk)vwz).j(aiqj.c);
            ((sxr)this.d).show(((Activity)this.a).getFragmentManager(), sxr.a);
            final afum a3 = afum.a;
            final ListenableFuture b5 = ((vml)m.g).b((vls)vwz, (Executor)a3);
            if (((vai)m.d).C()) {
                vxg.a((zmw)m.e, b5, (Executor)a3, almx.cp);
            }
            teu.k(b5, (Executor)this.c, (tes)new hug(this, 19, (byte[])null), (tet)new joq(this, 19, (byte[])null));
        }
        else {
            adkp.H(((ahbc)aiqj).ry((ahaq)GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.getShortsSourceVideoCommand));
            final br e4 = ((bu)this.d).getSupportFragmentManager().e(2131430850);
            if (!(e4 instanceof gxz)) {
                ttr.b("GetShortsSourceVideoCommandResolver: Invalid fragment");
                zlm.b(zll.b, zlk.f, "[ShortsCreation][Android][Navigation]GetShortsSourceVideoCommandResolver: Invalid fragment");
                return;
            }
            final br c4 = ((gxz)e4).c();
            ((wyv)this.g).pF().D((wzz)new wyt(xaa.c(123970)));
            final GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand getShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand = (GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand)((ahbc)aiqj).rx((ahaq)GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.getShortsSourceVideoCommand);
            Label_0774: {
                if ((getShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.b & 0x4) != 0x0) {
                    aoem aoem;
                    if ((aoem = getShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.e) == null) {
                        aoem = aoem.a;
                    }
                    if ((aoem.b & 0x1) != 0x0) {
                        break Label_0774;
                    }
                    aoem aoem2;
                    if ((aoem2 = getShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.e) == null) {
                        aoem2 = aoem.a;
                    }
                    if ((aoem2.b & 0x2) != 0x0) {
                        n = 2;
                        break Label_0774;
                    }
                }
                n = 1;
            }
            teu.n((aun)c4, ((vwa)this.f).i(((zmf)this.h).c()).k(aiqj, (Executor)this.e, n), (ttg)new goe(this, 12, null), (ttg)new goe(this, 13, null));
        }
    }
}
