import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.util.Pair;
import java.util.List;
import java.util.function.Consumer;
import j$.util.Optional;
import com.google.android.apps.youtube.app.common.ui.orientation.PlayerEnterExitFullscreenControllerImpl;
import com.google.android.apps.youtube.app.common.ui.orientation.OrientationInfoLoggingController;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneFragmentOrientationLocker;
import com.google.android.apps.youtube.app.common.ui.navigation.PageMonitor;
import com.google.android.apps.youtube.app.common.ui.navigation.HomePageMonitor;
import com.google.android.apps.youtube.app.common.ui.inline.LoopController;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import com.google.android.apps.youtube.app.common.ui.bottomui.DefaultHatsController;
import android.animation.ValueAnimator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gao implements asjm
{
    public final Object a;
    private final int b;
    
    public gao(final ValueAnimator a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gao(final DefaultHatsController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gao(final MealbarPromoController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gao(final LoopController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gao(final HomePageMonitor a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gao(final PageMonitor a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gao(final PaneFragmentOrientationLocker a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gao(final OrientationInfoLoggingController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gao(final PlayerEnterExitFullscreenControllerImpl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gao(final gap a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gao(final get a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gao(final gfe a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gao(final ghm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gao(final ghr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(Object o) {
        final int b = this.b;
        final boolean b2 = false;
        final int n = 0;
        final boolean b3 = false;
        final int n2 = 0;
        int n3 = 1;
        final int n4 = 1;
        switch (b) {
            default: {
                ((ghr)this.a).a = (trs)o;
                return;
            }
            case 19: {
                final Object a = this.a;
                final trs trs = (trs)o;
                final PlayerEnterExitFullscreenControllerImpl playerEnterExitFullscreenControllerImpl = (PlayerEnterExitFullscreenControllerImpl)a;
                if (playerEnterExitFullscreenControllerImpl.b == null) {
                    playerEnterExitFullscreenControllerImpl.f = trs;
                    return;
                }
                if (trs instanceof trv && playerEnterExitFullscreenControllerImpl.c.j() == fkr.e) {
                    playerEnterExitFullscreenControllerImpl.b.c();
                }
                playerEnterExitFullscreenControllerImpl.f = trs;
                return;
            }
            case 18: {
                final Object a2 = this.a;
                int intValue = (int)o;
                final PlayerEnterExitFullscreenControllerImpl playerEnterExitFullscreenControllerImpl2 = (PlayerEnterExitFullscreenControllerImpl)a2;
                final liq b4 = playerEnterExitFullscreenControllerImpl2.b;
                if (b4 == null) {
                    playerEnterExitFullscreenControllerImpl2.e = intValue;
                    return;
                }
                final int e = playerEnterExitFullscreenControllerImpl2.e;
                if (e == 1) {
                    if (intValue == 0) {
                        b4.b();
                        intValue = n2;
                    }
                }
                else if (e == 2 && intValue == 0) {
                    intValue = n2;
                    if (playerEnterExitFullscreenControllerImpl2.c.j() == fkr.e) {
                        playerEnterExitFullscreenControllerImpl2.b.c();
                        intValue = n2;
                    }
                }
                playerEnterExitFullscreenControllerImpl2.e = intValue;
                return;
            }
            case 17: {
                ((PlayerEnterExitFullscreenControllerImpl)this.a).q((boolean)o);
                return;
            }
            case 16: {
                final Object a3 = this.a;
                final ghn ghn = (ghn)o;
                final ajel a4 = ghn.a;
                final ajel b5 = ghn.b;
                final ahaz builder = ((ahbh)aliy.a).createBuilder();
                builder.copyOnWrite();
                final aliy aliy = (aliy)builder.instance;
                aliy.c = a4.h;
                aliy.b |= 0x1;
                builder.copyOnWrite();
                final aliy aliy2 = (aliy)builder.instance;
                aliy2.d = b5.h;
                aliy2.b |= 0x2;
                final aliy aliy3 = (aliy)builder.build();
                final aknr d = aknt.d();
                ((ahaz)d).copyOnWrite();
                aknt.aV((aknt)d.instance, aliy3);
                ((wxx)((OrientationInfoLoggingController)a3).a.a()).d((aknt)((ahaz)d).build());
                return;
            }
            case 15: {
                final Object a5 = this.a;
                final Integer n5 = (Integer)o;
                ((ghm)a5).b = true;
                return;
            }
            case 14: {
                final Object a6 = this.a;
                final Optional optional = (Optional)o;
                final PaneFragmentOrientationLocker paneFragmentOrientationLocker = (PaneFragmentOrientationLocker)a6;
                paneFragmentOrientationLocker.j();
                optional.ifPresent((Consumer)new gga(paneFragmentOrientationLocker, 7));
                return;
            }
            case 13: {
                PageMonitor.g(((PageMonitor)this.a).a, ((List)o).get(0));
                return;
            }
            case 12: {
                final Object a7 = this.a;
                final List list = (List)o;
                HomePageMonitor.g(((HomePageMonitor)a7).a);
                return;
            }
            case 11: {
                final Object a8 = this.a;
                final aanc aanc = (aanc)o;
                final LoopController loopController = (LoopController)a8;
                final aipg b6 = loopController.b;
                if (b6 != null) {
                    final int dh = aqsx.dH(b6.c);
                    if (dh != 0) {
                        if (dh == 3) {
                            loopController.c = true;
                            ((aazo)loopController.a.a()).b(b6.e, b6.f);
                        }
                    }
                }
                return;
            }
            case 10: {
                final Object a9 = this.a;
                final abke c = ((aans)o).c();
                boolean a10 = b2;
                if (!c.h()) {
                    a10 = b2;
                    if (c.c(abke.g)) {
                        a10 = b2;
                        if (c != abke.j) {
                            a10 = true;
                        }
                    }
                }
                final gfe gfe = (gfe)a9;
                if (gfe.a == a10) {
                    return;
                }
                gfe.a = a10;
                gfe.b();
                return;
            }
            case 9: {
                final Object a11 = this.a;
                ((Integer)o).intValue();
                final get get = (get)a11;
                final int a12 = get.a();
                final boolean r = get.b.r();
                final boolean o2 = get.b.o();
                final boolean d2 = get.d;
                final boolean e2 = get.e;
                get.d = r;
                get.e = o2;
                Label_0924: {
                    if (a12 == 1) {
                        if (d2 != get.d) {
                            break Label_0924;
                        }
                        n3 = n4;
                    }
                    else {
                        n3 = a12;
                    }
                    if (n3 != 2 || e2 == get.e) {
                        return;
                    }
                }
                get.b(get.f(n3));
                get.d(n3);
                return;
            }
            case 8: {
                final Object a13 = this.a;
                final fqx fqx = (fqx)o;
                if ((fqx.b & 0x4) != 0x0) {
                    final int e3 = fqx.e;
                    final get get2 = (get)a13;
                    if (e3 != get2.c.get()) {
                        final boolean f = get2.f(get2.c.getAndSet(fqx.e));
                        final boolean f2 = get2.f(fqx.e);
                        if (f != f2) {
                            get2.b(f2);
                        }
                        get2.d(fqx.e);
                    }
                }
                return;
            }
            case 7: {
                final Object a14 = this.a;
                final aukg aukg = (aukg)o;
                ((ValueAnimator)a14).start();
                return;
            }
            case 6: {
                final Object a15 = this.a;
                final fkr e4 = (fkr)o;
                final MealbarPromoController mealbarPromoController = (MealbarPromoController)a15;
                if (mealbarPromoController.e == fkr.l) {
                    final amfo d3 = mealbarPromoController.d;
                    mealbarPromoController.d = null;
                    mealbarPromoController.l(d3, mealbarPromoController.a);
                }
                mealbarPromoController.e = e4;
                return;
            }
            case 5: {
                final Object a16 = this.a;
                final aans aans = (aans)o;
                final MealbarPromoController mealbarPromoController2 = (MealbarPromoController)a16;
                final hhg g = mealbarPromoController2.g;
                final PlayerResponseModel b7 = aans.b();
                Label_1271: {
                    if (b7 != null) {
                        final akxe[] ac = b7.ac();
                        int i = 0;
                        while (true) {
                            while (i < ac.length) {
                                final akxe akxe = ac[i];
                                if ((akxe.b & 0x1) != 0x0) {
                                    amfo amfo;
                                    if ((amfo = akxe.c) == null) {
                                        amfo = amfo.a;
                                    }
                                    final boolean b8 = g.g(amfo);
                                    if (b8) {
                                        o = mealbarPromoController2.g.a;
                                        mealbarPromoController2.k((amfo)o, mealbarPromoController2.a);
                                        return;
                                    }
                                    break Label_1271;
                                }
                                else {
                                    ++i;
                                }
                            }
                            final boolean b8 = g.g((amfo)null);
                            continue;
                        }
                    }
                }
                final hhg g2 = mealbarPromoController2.g;
                final PlayerResponseModel b9 = aans.b();
                if (b9 != null) {
                    final akxe[] ac2 = b9.ac();
                    final int length = ac2.length;
                    int j = n;
                    while (true) {
                        while (j < length) {
                            final akxe akxe2 = ac2[j];
                            if ((akxe2.b & 0x8) != 0x0) {
                                aiqm aiqm;
                                if ((aiqm = akxe2.f) == null) {
                                    aiqm = aiqm.a;
                                }
                                final boolean b10 = g2.f(aiqm);
                                if (!b10) {
                                    return;
                                }
                                o = mealbarPromoController2.g.b;
                                if (o == null) {
                                    mealbarPromoController2.i.h();
                                    return;
                                }
                                final aiqm aiqm2 = (aiqm)o;
                                if ((aiqm2.b & 0x8) == 0x0) {
                                    return;
                                }
                                mealbarPromoController2.f.c((aiqm)null);
                                mealbarPromoController2.i.h();
                                apss apss;
                                if ((apss = aiqm2.e) == null) {
                                    apss = apss.a;
                                }
                                final int ac3 = aqsx.ac(apss.b);
                                if (ac3 != 0) {
                                    if (ac3 == 4) {
                                        mealbarPromoController2.i.g(aiqm2);
                                        return;
                                    }
                                }
                                apss apss2;
                                if ((apss2 = aiqm2.e) == null) {
                                    apss2 = apss.a;
                                }
                                final int ac4 = aqsx.ac(apss2.b);
                                if (ac4 != 0 && ac4 == 3) {
                                    mealbarPromoController2.f.c(aiqm2);
                                }
                                return;
                            }
                            else {
                                ++j;
                            }
                        }
                        final boolean b10 = g2.f((aiqm)null);
                        continue;
                    }
                }
                return;
            }
            case 4: {
                final Object a17 = this.a;
                final aanf e5 = (aanf)o;
                final DefaultHatsController defaultHatsController = (DefaultHatsController)a17;
                if (defaultHatsController.b == null) {
                    defaultHatsController.e = e5;
                    return;
                }
                final saz a18 = saz.a;
                final abka a19 = abka.a;
                final int ordinal = e5.b().ordinal();
                if (ordinal != 5) {
                    if (ordinal == 7) {
                        final gcb b11 = defaultHatsController.b;
                        b11.getClass();
                        aopj aopj;
                        if ((aopj = b11.c.c) == null) {
                            aopj = aopj.a;
                        }
                        for (final aoos aoos : aopj.l) {
                            if (aoos.b == 1) {
                                aoou aoou;
                                if ((aoou = aoou.b(((aoor)aoos.c).b)) == null) {
                                    aoou = aoou.a;
                                }
                                if (aoou == aoou.h) {
                                    final gcb b12 = defaultHatsController.b;
                                    b12.getClass();
                                    defaultHatsController.p(b12.d(e5.d()));
                                    return;
                                }
                                continue;
                            }
                        }
                    }
                }
                else {
                    final gcb b13 = defaultHatsController.b;
                    b13.getClass();
                    if (DefaultHatsController.s(b13.c)) {
                        final gcb b14 = defaultHatsController.b;
                        b14.getClass();
                        defaultHatsController.p(b14.d(e5.d()));
                    }
                }
                return;
            }
            case 3: {
                final Object a20 = this.a;
                final Pair pair = (Pair)o;
                final DefaultHatsController defaultHatsController2 = (DefaultHatsController)a20;
                if (defaultHatsController2.b != null) {
                    final PlayerResponseModel c2 = ((abzl)pair.first).c();
                    int n6 = b3 ? 1 : 0;
                    if (c2 != null) {
                        n6 = (b3 ? 1 : 0);
                        if (c2.T()) {
                            n6 = 1;
                        }
                    }
                    final aant d4 = (aant)pair.second;
                    final aant d5 = defaultHatsController2.d;
                    if (d5 != null) {
                        final String k = d5.i();
                        if (k != null && k.equals(d4.i())) {
                            final long n7 = d4.g() - d5.g();
                            if (n7 > 0L && n7 < 5000L) {
                                defaultHatsController2.f += n7;
                            }
                        }
                    }
                    else {
                        defaultHatsController2.f = 0L;
                    }
                    defaultHatsController2.d = d4;
                    final gcb b15 = defaultHatsController2.b;
                    b15.getClass();
                    final aopo c3 = b15.c;
                    final float n8 = (float)d4.f();
                    aopj aopj2;
                    if ((aopj2 = c3.c) == null) {
                        aopj2 = aopj.a;
                    }
                    final Iterator<Object> iterator2 = ((List<Object>)aopj2.l).iterator();
                    float min = Float.MAX_VALUE;
                    while (iterator2.hasNext()) {
                        final aoos aoos2 = iterator2.next();
                        if (aoos2.b == 2) {
                            final int b16 = ((aoot)aoos2.c).b;
                            float min2 = min;
                            if (b16 > 0) {
                                min2 = Math.min((float)b16, min);
                            }
                            aoot a21;
                            if (aoos2.b == 2) {
                                a21 = (aoot)aoos2.c;
                            }
                            else {
                                a21 = aoot.a;
                            }
                            final float c4 = a21.c;
                            min = min2;
                            if (n6 != 0) {
                                continue;
                            }
                            min = min2;
                            if (c4 <= 0.0f) {
                                continue;
                            }
                            final float n9 = n8 / 1000.0f;
                            min = min2;
                            if (n9 <= 0.0f) {
                                continue;
                            }
                            min = Math.min(c4 * n9, min2);
                        }
                    }
                    float n10 = min;
                    if (min >= Float.MAX_VALUE) {
                        n10 = 0.0f;
                    }
                    if (n10 > 0.0f && defaultHatsController2.f / 1000.0f > n10) {
                        final gcb b17 = defaultHatsController2.b;
                        b17.getClass();
                        defaultHatsController2.p(b17.d(d4.i()));
                    }
                }
                return;
            }
            case 2: {
                final Object a22 = this.a;
                final ggq ggq = (ggq)o;
                ((gap)a22).e.x(fxz.f, 0);
                return;
            }
            case 1: {
                final Object a23 = this.a;
                final Boolean b18 = (Boolean)o;
                ((gap)a23).e(true);
                return;
            }
            case 0: {
                final Object a24 = this.a;
                final Integer n11 = (Integer)o;
                final gap gap = (gap)a24;
                gap.j(gap.a());
            }
        }
    }
}
