// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.ac;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.j;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.l;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.g;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.aa;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.c;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.a;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.d;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.t;
import java.util.concurrent.Executor;
import android.util.Pair;
import android.app.Activity;
import android.accounts.Account;
import java.io.File;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import java.util.List;
import java.util.concurrent.Callable;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService;

public final class e implements asjr
{
    public final Object a;
    private final int b;
    
    public e(final ashi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final atio a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final atke a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final IApiPlayerFactoryService a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final IEmbedFragmentServiceFactoryService a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final Callable a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final lmo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final oey a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final okt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final smt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final suq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final tht a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final ttd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object a(final Object o) {
        final int b = this.b;
        boolean b2 = false;
        final Object a;
        switch (b) {
            default: {
                a = this.a;
                if (o == uvp.a) {
                    return ashi.z();
                }
                break;
            }
            case 19: {
                final Object a2 = this.a;
                final List list = (List)o;
                final tqt a3 = usf.a();
                a3.h(use.d);
                a3.d = aezp.k((Object)list.get(0));
                final atio atio = (atio)a2;
                a3.e = aezp.k(atio.a);
                a3.j(new File((String)atio.a).getName());
                a3.i(list.size());
                return a3.g();
            }
            case 18: {
                return ashn.y((Callable)new pak((ttd)this.a, (Long)o, 13));
            }
            case 17: {
                final Object a4 = this.a;
                final trs trs = (trs)o;
                asht asht;
                if (trs instanceof trw) {
                    asht = ((trt)((atke)a4).a()).a();
                }
                else {
                    asht = asht.X((Object)trs);
                }
                return asht;
            }
            case 16: {
                final Object a5 = this.a;
                Object i;
                if (o) {
                    i = ((Callable<ashw>)a5).call();
                }
                else {
                    i = asht.I();
                }
                return i;
            }
            case 15: {
                if (((tht)o).ordinal() >= ((tht)this.a).ordinal()) {
                    b2 = true;
                }
                return b2;
            }
            case 14: {
                return ashc.u((asjg)new spx((suq)this.a, (aufm)o, 3));
            }
            case 13: {
                return ashc.u((asjg)new spx((suq)this.a, (aufm)o, 2));
            }
            case 12: {
                final Object a6 = this.a;
                final aezq aezq = (aezq)o;
                final smt smt = (smt)a6;
                return zmb.a((Activity)smt.od(), (Account)aezq.b, (String)aezq.a).L(atjj.b(smt.ah)).E(atjj.b(smt.ai)).K((Object)aezq.a);
            }
            case 11: {
                final Object a7 = this.a;
                final Account account = (Account)o;
                tvb.n((String)a7);
                return aezq.a(a7, (Object)account);
            }
            case 10: {
                return Pair.create(this.a, (Object)o);
            }
            case 9: {
                return Pair.create(this.a, (Object)o);
            }
            case 8: {
                return Pair.create(this.a, (Object)o);
            }
            case 7: {
                return ((okt)this.a).a.a("/system/template/".concat(String.valueOf(o)));
            }
            case 6: {
                final Object a8 = this.a;
                final Callable callable = (Callable)o;
                return atjj.b((Executor)((oey)a8).b);
            }
            case 5: {
                final Object a9 = this.a;
                final Callable callable2 = (Callable)o;
                return atjj.b((Executor)occ.t(((oey)a9).a));
            }
            case 4: {
                final Object a10 = this.a;
                final Callable callable3 = (Callable)o;
                return atjj.b((Executor)((oey)a10).b);
            }
            case 3: {
                final Object a11 = this.a;
                final Callable callable4 = (Callable)o;
                return atjj.b((Executor)((oey)a11).a);
            }
            case 2: {
                final Object a12 = this.a;
                final t t = (t)o;
                final int t2 = com.google.android.apps.youtube.embeddedplayer.service.jar.client.t.t;
                try {
                    final j j = t.i;
                    j.getClass();
                    t.h = ((IEmbedFragmentServiceFactoryService)a12).a(j, t.f.a());
                    t.o = t.h.a();
                    final IEmbedFragmentService h = t.h;
                    t.j = (b)new d(h.d(), t.o);
                    t.d.post((Runnable)new a(t, 4));
                    if (h != null) {
                        com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.d.a().b(h.b());
                        c.a().b(h.b());
                        zlm.a((zlj)c.a().b);
                    }
                    return t;
                }
                catch (final RemoteException ex) {
                    throw atih.b((Throwable)ex);
                }
            }
            case 1: {
                final Object a13 = this.a;
                if (((ewg)o).a()) {
                    final lmo lmo = (lmo)a13;
                    final lmn lmn = new lmn((vaf)lmo.e, (acgs)((atke)lmo.h).a(), (aeea)((atke)lmo.g).a(), (atjo)lmo.a, (byte[])null, (byte[])null);
                    final acgs acgs = (acgs)((atke)lmo.h).a();
                    final aeea aeea = (aeea)((atke)lmo.g).a();
                    acgs.c((acgr)lmn);
                    aeea.T((acgr)lmn);
                }
                else {
                    ((atjo)((lmo)a13).a).tx();
                }
                return ashc.f();
            }
            case 0: {
                final Object a14 = this.a;
                final h h2 = (h)o;
                final int k = h.i;
                try {
                    final ac a15 = h2.a;
                    a15.c(Tick.c);
                    a15.d = ((IApiPlayerFactoryService)a14).a(new aa(a15), (com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c)a15.C, (f)a15.D, (l)null, (com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c)a15.E, (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c)a15.F, (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c)a15.G, (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c)a15.H, (com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f)a15.I, (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c)a15.J, (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c)a15.K, (com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c)a15.L, (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c)a15.M, (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f)a15.N, (com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c)a15.O, (com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f)a15.P, false);
                    a15.i = (b)new com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.c(a15.d.d());
                    a15.e = a15.d.e();
                    com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.a(a15.f = a15.d.a());
                    com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.d.a().b(a15.d.b());
                    c.a().b(a15.d.b());
                    zlm.a((zlj)c.a().b);
                    a15.m.post((Runnable)new a(a15, 7));
                    a15.c = (vcy)new lpt(a15.d, 2);
                    a15.y.ts((Object)a15.c);
                    a15.c(Tick.d);
                    a15.f.a();
                    return h2;
                }
                catch (final RemoteException ex2) {
                    throw atih.b((Throwable)ex2);
                }
                break;
            }
        }
        return a;
    }
}
