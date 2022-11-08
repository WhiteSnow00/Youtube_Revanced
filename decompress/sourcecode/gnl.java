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

public final class gnl implements vau
{
    public final Context a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    private final /* synthetic */ int i;
    
    public gnl(final Activity a, final vax f, final addp h, final vbq g, final tny b, final wwu e, final Executor c, final int i, final byte[] array) {
        this.i = i;
        this.a = (Context)a;
        this.h = h;
        this.f = f;
        this.g = g;
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = new svm();
    }
    
    public gnl(final Activity a, final xgc g, final zki e, final wwu h, final tny b, final vax f, final Executor c, final int i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.i = i;
        this.a = (Context)a;
        this.g = g;
        this.e = e;
        this.h = h;
        this.b = b;
        this.f = f;
        this.c = c;
        this.d = new svm();
    }
    
    public gnl(final Context a, final vax b, final fdw e, final cl d, final aafo g, final wwu f, final atjj c, final aeby h, final int i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
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
    
    public gnl(final Context a, final vup b, final vax d, final Executor c, final aceo e, final wwu f, final zki g, final syb h, final int i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
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
    
    public gnl(final bu d, final Context a, final Executor c, final Executor e, final vup f, final zki h, final vax b, final wwu g, final int i, final byte[] array) {
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
    
    public gnl(final hyc b, final vwb h, final fax d, final Activity a, final rmw g, final uyi c, final tdg e, final gem f, final int i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
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
    
    public final void mE(aioe aioe, final Map ah) {
        final int i = this.i;
        int n = 4;
        if (i == 0) {
            final GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand getPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand = (GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand)((agzd)aioe).rr((agyr)GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.getPdgBuyFlowCommand);
            final Object b = this.b;
            final zkh c = ((zki)this.g).c();
            final vup vup = (vup)b;
            final addp q = ((vru)agnj.J((Context)vup.a, (Class)vru.class, ((zjy)vup.b).a(c))).q();
            final vrt vrt = new vrt(q.c, ((eg)q.d).aq(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            vrt.a = getPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.b;
            tcp.l(((vkh)q.e).b((vjn)vrt, (Executor)afsl.a), (Executor)this.c, (tcn)new fcb(this, 7), (tco)new fct(this, aioe, ah, 4), afua.a);
            return;
        }
        if (i == 1) {
            ((vwb)this.h).p(tmy.M(ah, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag"), ahpu.c);
            final ahtf ahtf = (ahtf)((agzd)aioe).rr((agyr)AppStoreEndpointOuterClass.appStoreEndpoint);
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", tmy.M(ah, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag"));
            final aijk a = aijk.a;
            ((fax)this.d).a(aijk.c, (List)ahtf.h, hashMap);
            ((gem)this.f).g(4);
            final Context a2 = this.a;
            final String b2 = ahtf.b;
            final String c2 = ahtf.c;
            final String d = ahtf.d;
            final String e = ahtf.e;
            final boolean f = ahtf.f;
            final boolean j = ((rmw)this.g).j();
            ((uyi)this.c).bo();
            final boolean booleanValue = (boolean)((uyi)this.c).bo().aG();
            final List f2 = ((rmw)this.g).f();
            final Object e2 = this.e;
            final Object b3 = this.b;
            aioe.getClass();
            final hyc hyc = (hyc)b3;
            final vax vax = (vax)((atjj)hyc.c).a();
            vax.getClass();
            final fxo fxo = (fxo)((atjj)hyc.a).a();
            fxo.getClass();
            final gem gem = (gem)((atjj)hyc.b).a();
            gem.getClass();
            final fax fax = (fax)((atjj)hyc.d).a();
            fax.getClass();
            tab.j((Activity)a2, b2, c2, d, e, f, j, booleanValue, f2, (tdg)e2, (szw)new fca(aioe, vax, fxo, gem, fax));
            return;
        }
        if (i == 2) {
            if ((((OpenDialogCommandOuterClass$OpenDialogCommand)((agzd)aioe).rr((agyr)OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand)).b & 0x1) != 0x0) {
                anss anss;
                if ((anss = ((OpenDialogCommandOuterClass$OpenDialogCommand)((agzd)aioe).rr((agyr)OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand)).c) == null) {
                    anss = anss.a;
                }
                if (((agzd)anss).rs((agyr)amqe.a)) {
                    ((fdw)this.e).mE(aioe, ah);
                    return;
                }
                if (((agzd)anss).rs((agyr)FancyDismissibleDialogRendererOuterClass.fancyDismissibleDialogRenderer)) {
                    abyx.h(this.a, (ajpr)((agzd)anss).rr((agyr)FancyDismissibleDialogRendererOuterClass.fancyDismissibleDialogRenderer), (vax)this.b, (aeby)((atjj)this.c).a(), (Object)null, (aeby)this.h);
                    return;
                }
                if (((agzd)anss).rs((agyr)MultiMessageConfirmDialogRendererOuterClass.multiMessageConfirmDialogRenderer)) {
                    wjh wjh;
                    if ((wjh = (wjh)((cl)this.d).f("MultiMessageConfirmDialogFragment")) == null) {
                        wjh = new wjh();
                    }
                    final Object d2 = this.d;
                    final amiz ag = (amiz)((agzd)anss).rr((agyr)MultiMessageConfirmDialogRendererOuterClass.multiMessageConfirmDialogRenderer);
                    if (wjh.ar()) {
                        wjh.dismiss();
                    }
                    wjh.ag = ag;
                    wjh.ah = ah;
                    wjh.r((cl)d2, "MultiMessageConfirmDialogFragment");
                    return;
                }
                if (((agzd)anss).rs((agyr)UpsellDialogRendererOuterClass.upsellDialogRenderer)) {
                    ((aafo)this.g).a(((agzd)anss).rr((agyr)UpsellDialogRendererOuterClass.upsellDialogRenderer), ((wwu)this.f).n(), (Pair)null, (aagx)null);
                }
            }
            return;
        }
        if (i != 3) {
            if (i != 4) {
                final CommerceActionCommandOuterClass$CommerceActionCommand commerceActionCommandOuterClass$CommerceActionCommand = (CommerceActionCommandOuterClass$CommerceActionCommand)((agzd)aioe).rr((agyr)CommerceActionCommandOuterClass$CommerceActionCommand.commerceActionCommand);
                if (!commerceActionCommandOuterClass$CommerceActionCommand.h) {
                    ((svm)this.d).show(((Activity)this.a).getFragmentManager(), svm.a);
                }
                final addp addp = (addp)this.h;
                final vuy vuy = new vuy(addp.c, ((zki)addp.d).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                vuy.c = commerceActionCommandOuterClass$CommerceActionCommand.d;
                vuy.b = commerceActionCommandOuterClass$CommerceActionCommand.c;
                ((vii)vuy).j(aioe.c);
                final agzy e3 = commerceActionCommandOuterClass$CommerceActionCommand.e;
                final vbp b4 = ((vbq)this.g).b();
                for (final String s : e3) {
                    if (((vdo)b4).f(s).af() != null) {
                        final byte[] d3 = ((vdm)((vdo)b4).f(s).af()).d();
                        if (d3 == null) {
                            continue;
                        }
                        vuy.a.add(agyc.x(d3));
                    }
                }
                if ((commerceActionCommandOuterClass$CommerceActionCommand.b & 0x4) != 0x0) {
                    final Object f3 = this.f;
                    if ((aioe = commerceActionCommandOuterClass$CommerceActionCommand.f) == null) {
                        aioe = aioe.a;
                    }
                    ((vax)f3).a(aioe);
                }
                tcp.k(((vkh)((addp)this.h).e).b((vjn)vuy, (Executor)this.c), (Executor)this.c, (tcn)new etc(this, commerceActionCommandOuterClass$CommerceActionCommand, 10, (byte[])null), (tco)new jor(this, 20, (char[])null));
                return;
            }
            final Object g = this.g;
            final zkh c3 = ((zki)this.e).c();
            final xgc xgc = (xgc)g;
            final aaca m = ((vvr)agnj.J((Context)xgc.b, (Class)vvr.class, ((zjy)xgc.a).a(c3))).m();
            final YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand ypcGetCancellationFlowCommand$YPCGetCancellationFlowCommand = (YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand)((agzd)aioe).rr((agyr)YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.ypcGetCancellationFlowCommand);
            final vuz vuz = new vuz(m.c, ((eg)m.f).aq(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            ypcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.getClass();
            vuz.a = vuz.g(ypcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.b);
            ((vii)vuz).j(aioe.c);
            ((svm)this.d).show(((Activity)this.a).getFragmentManager(), svm.a);
            final afsl a3 = afsl.a;
            final ListenableFuture b5 = ((vkh)m.g).b((vjn)vuz, (Executor)a3);
            if (((uyi)m.d).B()) {
                vwh.t((zkz)m.e, b5, (Executor)a3, alku.cp);
            }
            tcp.k(b5, (Executor)this.c, (tcn)new htl(this, 18, (byte[])null), (tco)new jor(this, 18, (byte[])null));
        }
        else {
            agot.u(((agzd)aioe).rs((agyr)GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.getShortsSourceVideoCommand));
            final br e4 = ((bu)this.d).getSupportFragmentManager().e(2131430847);
            if (!(e4 instanceof gxl)) {
                trn.b("GetShortsSourceVideoCommandResolver: Invalid fragment");
                zjp.b(zjo.b, zjn.f, "[ShortsCreation][Android][Navigation]GetShortsSourceVideoCommandResolver: Invalid fragment");
                return;
            }
            final br c4 = ((gxl)e4).c();
            ((wwu)this.g).n().D((wxz)new wws(wya.c(123970)));
            final GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand getShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand = (GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand)((agzd)aioe).rr((agyr)GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.getShortsSourceVideoCommand);
            Label_0772: {
                if ((getShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.b & 0x4) != 0x0) {
                    aock aock;
                    if ((aock = getShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.e) == null) {
                        aock = aock.a;
                    }
                    if ((aock.b & 0x1) != 0x0) {
                        break Label_0772;
                    }
                    aock aock2;
                    if ((aock2 = getShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.e) == null) {
                        aock2 = aock.a;
                    }
                    if ((aock2.b & 0x2) != 0x0) {
                        n = 2;
                        break Label_0772;
                    }
                }
                n = 1;
            }
            tcp.n((aum)c4, ((vup)this.f).e(((zki)this.h).c()).k(aioe, (Executor)this.e, n), (trb)new gnx(this, 12, null), (trb)new gnx(this, 13, null));
        }
    }
}
