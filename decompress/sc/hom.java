import java.util.Map;
import java.util.Iterator;
import com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPlayerProgressPresenter;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelWatchPagerViewPager;
import android.view.ViewGroup;
import android.os.SystemClock;
import android.view.View;
import java.util.function.Consumer;
import java.util.List;
import java.util.ArrayList;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelObscuredPlaybackSuspender;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hom implements asjm
{
    public final Object a;
    private final int b;
    
    public hom(final asiq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hom(final ReelObscuredPlaybackSuspender a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hom(final hou a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hom(final how a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hom(final hpe a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hom(final hpo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hom(final hpq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hom(final hpy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hom(final hqh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hom(final hqo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hom(final hqv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hom(final hsg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hom(final AtomicBoolean a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(Object o) {
        final int b = this.b;
        final boolean b2 = true;
        final boolean b3 = false;
        switch (b) {
            default: {
                final Object a = this.a;
                final Optional optional = (Optional)o;
                if (optional.isEmpty()) {
                    return;
                }
                final hsg hsg = (hsg)a;
                final String b4 = ((vkk)hsg.b).b();
                final PlayerResponseModel c = (PlayerResponseModel)optional.get();
                o = hsg.d;
                monitorenter(o);
                try {
                    if (((hsg)a).g) {
                        monitorexit(o);
                    }
                    else {
                        final auce auce = (auce)((hsg)a).d.get((Object)b4);
                        if (auce != null) {
                            auce.c = c;
                            ((hsg)a).d.put((Object)b4, (Object)auce);
                        }
                        monitorexit(o);
                    }
                    o = hsg.c.iterator();
                    while (((Iterator)o).hasNext()) {
                        ((Iterator<zpf>)o).next().mX((Object)optional.get());
                    }
                    return;
                }
                finally {
                    monitorexit(o);
                    while (true) {}
                }
                break;
            }
            case 19: {
                final Object a2 = this.a;
                if (o) {
                    ((ReelObscuredPlaybackSuspender)a2).g();
                    return;
                }
                final ReelObscuredPlaybackSuspender reelObscuredPlaybackSuspender = (ReelObscuredPlaybackSuspender)a2;
                if (reelObscuredPlaybackSuspender.b == 0) {
                    reelObscuredPlaybackSuspender.b = reelObscuredPlaybackSuspender.a.a();
                }
                return;
            }
            case 18: {
                ((hqv)this.a).a = (boolean)o;
                return;
            }
            case 17: {
                ((hqo)this.a).j = (boolean)o;
                return;
            }
            case 16: {
                ((hqh)this.a).a.b();
                return;
            }
            case 15: {
                ((hqh)this.a).O = (boolean)o;
                return;
            }
            case 14: {
                ((hqh)this.a).a.b();
                return;
            }
            case 13: {
                ((hpy)this.a).h = (boolean)o;
                return;
            }
            case 12: {
                ((asiq)this.a).c((asir)o);
                return;
            }
            case 11: {
                ((hpq)this.a).a = (boolean)o;
                return;
            }
            case 10: {
                final Object a3 = this.a;
                final int intValue = (int)o;
                final hpo hpo = (hpo)a3;
                final atjz c2 = hpo.c;
                gai gai;
                if (intValue == 0) {
                    final adqw a4 = gai.a();
                    a4.j(gak.b);
                    a4.i(gaj.b);
                    a4.h(false);
                    gai = a4.f();
                }
                else {
                    final adqw a5 = gai.a();
                    a5.j(gak.a);
                    a5.i(gaj.a);
                    a5.h(false);
                    gai = a5.f();
                }
                c2.tu((Object)gai);
                hpo.d = intValue;
                ((fzf)hpo.ae.a()).l();
                return;
            }
            case 9: {
                final Object a6 = this.a;
                final hpj hpj = (hpj)o;
                final hpo hpo2 = (hpo)a6;
                hpo2.al.o(hpj.c);
                final afeq b5 = hpj.b;
                final affr i = afft.i();
                final afkf d = b5.D();
                while (((Iterator)d).hasNext()) {
                    final aicz aicz = (aicz)((Iterator)d).next();
                    final int b6 = aicz.b;
                    if ((b6 & 0x20) != 0x0 && (b6 & 0x10000) != 0x0) {
                        i.h((Object)hpo2.an.c(hpo2.e.pF(), aicz, (List)new ArrayList()));
                    }
                }
                hpo2.a = i.g();
                hpo2.b = Optional.of((Object)hpj.a);
                ((fzf)hpo2.ae.a()).l();
                return;
            }
            case 8: {
                final Object a7 = this.a;
                final Optional ae = (Optional)o;
                final hpe hpe = (hpe)a7;
                hpe.ae = ae;
                final ReelWatchPagerViewPager e = hpe.e;
                if (e != null) {
                    boolean h = b2;
                    if (!ae.isPresent()) {
                        h = (hpe.aP() && b2);
                    }
                    e.h = h;
                }
                if (hpe.ag == null && hpe.aP()) {
                    hpe.aM();
                }
                return;
            }
            case 7: {
                final Object a8 = this.a;
                final abkh abkh = (abkh)o;
                final hou hou = (hou)a8;
                final hri an = hou.b.aN();
                if (abkh.a() && an != null) {
                    an.f().ifPresent((Consumer)gyr.o);
                }
                synchronized (hou.b.bF) {
                    final how b7 = ((hou)a8).b;
                    b7.bI = true;
                    b7.bb();
                }
            }
            case 6: {
                ((hou)this.a).a((aanw)o);
                return;
            }
            case 5: {
                final Object a9 = this.a;
                final aant aant = (aant)o;
                final hou hou2 = (hou)a9;
                if (hou2.b.bR.cq()) {
                    ((fos)hou2.b.bg).pp(aant.e(), aant.b(), aant.h(), aant.f(), 0L);
                }
                final hrf am = hou2.b.aM();
                if (am != null && hou2.b.bd.isPresent()) {
                    final boolean o2 = hou2.b.d.o();
                    final boolean b8 = (((akqn)hou2.b.bd.get()).b & 0x8) != 0x0;
                    if (am.o && !am.p && aant.f() >= 15000L) {
                        am.p = true;
                        am.q = false;
                        hrf.w((View)am.c, 1.0f, 200L, 0L);
                    }
                    final ReelPlayerProgressPresenter c3 = am.c;
                    c3.c = aant.e();
                    c3.a = aant.f();
                    if (aant.j()) {
                        c3.b = SystemClock.elapsedRealtime();
                    }
                    c3.c();
                    final Optional at = hou2.b.aT();
                    if (at.isPresent()) {
                        final abem bw = hou2.b.bW;
                        final String s = (String)at.get();
                        if (bw.a) {
                            final int n = (int)aant.e();
                            final int n2 = (int)aant.f();
                            if (((Map)bw.b).containsKey(s)) {
                                final int n3 = n2 / 1000;
                                final int n4 = n / 1000;
                                final lxk lxk = ((Map<K, lxk>)bw.b).get(s);
                                lxk.b = lxk.c + n4 + lxk.a * n3;
                                bw.h(s);
                            }
                        }
                    }
                    if (!hou2.b.ao.d()) {
                        final hqp j = am.j;
                        int n5 = b3 ? 1 : 0;
                        if (b8 ^ true) {
                            n5 = (b3 ? 1 : 0);
                            if (!o2) {
                                n5 = 1;
                            }
                        }
                        if (n5 != 0) {
                            final long n6 = aant.f() - aant.e();
                            if (n6 >= 0L) {
                                final hqh hqh = (hqh)j;
                                if (n6 < hqh.C && !hnu.g(hqh.d) && hqh.b.b()) {
                                    if (!hqh.D) {
                                        hqh.D = true;
                                        hqh.b.c();
                                    }
                                    hnu.f(hqh.d, true);
                                    if (hqh.I != null) {
                                        hqh.h.pF().t((wzz)new wyt(hqh.I), (alhi)null);
                                        hqh.I = null;
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 4: {
                final Object a10 = this.a;
                if (o) {
                    final how how = (how)a10;
                    if (how.bv()) {
                        how.bc.d();
                    }
                }
                else {
                    final how how2 = (how)a10;
                    how2.aW();
                    if (how2.bv()) {
                        how2.bc.c();
                    }
                }
                return;
            }
            case 3: {
                ((AtomicBoolean)this.a).set((boolean)o);
                return;
            }
            case 2: {
                final Object a11 = this.a;
                final gir gir = (gir)o;
                final how how3 = (how)a11;
                if (how3.bw()) {
                    final hri an2 = how3.aN();
                    if (an2 != null) {
                        final rlv a12 = rlv.a;
                        final gir a13 = gir.a;
                        final int ordinal = gir.ordinal();
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                an2.o(true);
                            }
                        }
                        else {
                            an2.o(false);
                        }
                        how3.aq.J(gir.equals(gir.b));
                    }
                }
                return;
            }
            case 1: {
                final Object a14 = this.a;
                final int top = ((trn)o).a.a.top;
                final how how4 = (how)a14;
                how4.bq = top;
                if (how4.bs() && tpe.bR(how4.nY())) {
                    ansk ansk;
                    if ((ansk = how4.bV.f().u) == null) {
                        ansk = ansk.a;
                    }
                    answ answ;
                    if ((answ = ansk.d) == null) {
                        answ = answ.a;
                    }
                    if (answ.t) {
                        final ViewGroup viewGroup = (ViewGroup)((br)a14).O;
                        if (viewGroup != null) {
                            viewGroup.setPadding(0, how4.bq, 0, 0);
                        }
                    }
                }
                return;
            }
            case 0: {
                final Object a15 = this.a;
                if (((fkr)o).l()) {
                    ((how)a15).aW();
                }
            }
        }
    }
}
