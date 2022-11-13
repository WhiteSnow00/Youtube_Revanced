import android.view.View$OnLayoutChangeListener;
import android.view.View;
import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.function.Function;
import java.util.Map;
import java.util.Collections;
import android.content.Context;
import com.google.android.apps.youtube.app.common.ui.tooltip.TooltipPlayerResponseMonitor;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBarConnectivityController;
import com.google.android.apps.youtube.app.common.ui.scrollselection.DefaultScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.pip.PipObserver;
import com.google.android.apps.youtube.app.common.ui.pip.DefaultPipController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ghy implements asjm
{
    public final Object a;
    private final int b;
    
    public ghy(final asiq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ghy(final DefaultPipController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ghy(final PipObserver a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ghy(final DefaultScrollSelectionController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ghy(final SlimStatusBarConnectivityController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ghy(final TooltipPlayerResponseMonitor a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ghy(final ghv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ghy(final gif a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ghy(final gim a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ghy(final gks a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ghy(final gmb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ghy(final hox a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        switch (this.b) {
            default: {
                final Object a = this.a;
                final Context context = (Context)o;
                ((hox)a).a = tpe.bq(context);
                tpe.bp(context);
                tpe.bo(context);
                return;
            }
            case 19: {
                final Object a2 = this.a;
                final fkr fkr = (fkr)o;
                final gmb gmb = (gmb)a2;
                gmb.b();
                gmb.f();
                return;
            }
            case 18: {
                final Object a3 = this.a;
                final aans aans = (aans)o;
                final PlayerResponseModel b = aans.b();
                akxi z;
                if (b != null) {
                    z = b.z();
                }
                else {
                    z = null;
                }
                if (aans.c() == abke.c) {
                    if (z != null) {
                        final String e = aans.e();
                        if (e == null || e.equals(((TooltipPlayerResponseMonitor)a3).b)) {
                            ((TooltipPlayerResponseMonitor)a3).j();
                        }
                        final TooltipPlayerResponseMonitor tooltipPlayerResponseMonitor = (TooltipPlayerResponseMonitor)a3;
                        tooltipPlayerResponseMonitor.b = e;
                        while (true) {
                            for (final akxe akxe : z.u) {
                                if ((akxe.b & 0x4) != 0x0) {
                                    aovi aovi;
                                    if ((aovi = akxe.e) == null) {
                                        aovi = aovi.a;
                                    }
                                    if (aovi != null) {
                                        tooltipPlayerResponseMonitor.a.e(aovi, (aezs)new yyl(tooltipPlayerResponseMonitor, e, 1));
                                        tooltipPlayerResponseMonitor.c = aovi.d;
                                        return;
                                    }
                                    tooltipPlayerResponseMonitor.c = null;
                                    return;
                                }
                            }
                            aovi aovi = null;
                            continue;
                        }
                    }
                }
                return;
            }
            case 17: {
                final Object a4 = this.a;
                final aosg aosg = (aosg)o;
                if ((0x2 & aosg.b) != 0x0) {
                    if (!Collections.unmodifiableMap((Map<?, ?>)aosg.d).isEmpty()) {
                        ((gks)a4).c(aosg);
                    }
                }
                return;
            }
            case 16: {
                final Object a5 = this.a;
                final aanw aanw = (aanw)o;
                final SlimStatusBarConnectivityController slimStatusBarConnectivityController = (SlimStatusBarConnectivityController)a5;
                if (slimStatusBarConnectivityController.b.j().c() && !slimStatusBarConnectivityController.a.o() && aanw.a() == 8) {
                    slimStatusBarConnectivityController.c.l(true);
                    final gkc c = slimStatusBarConnectivityController.c;
                    if (c.i == 0) {
                        c.l(true);
                        c.n(true, 500L);
                        return;
                    }
                    c.s(true, false, false, null);
                }
                return;
            }
            case 15: {
                final Object a6 = this.a;
                final Throwable t = (Throwable)o;
                ((DefaultScrollSelectionController)a6).q(null);
                return;
            }
            case 14: {
                ((asiq)this.a).c((asir)o);
                return;
            }
            case 13: {
                ((asiq)this.a).c((asir)o);
                return;
            }
            case 12: {
                ((gim)this.a).b = (gip)o;
                return;
            }
            case 11: {
                final Object a7 = this.a;
                if (o) {
                    final PipObserver pipObserver = (PipObserver)a7;
                    if (pipObserver.a.aX() != gik.a) {
                        pipObserver.a.tu((Object)gik.a);
                    }
                }
                else {
                    final PipObserver pipObserver2 = (PipObserver)a7;
                    if (pipObserver2.a.aX() == gik.a) {
                        pipObserver2.a.tu((Object)gik.b);
                    }
                }
                return;
            }
            case 10: {
                final Object a8 = this.a;
                final aans aans2 = (aans)o;
                final gif gif = (gif)a8;
                final boolean b2 = gif.B;
                gif.B = gim.e(aans2.b());
                final boolean z2 = gif.z;
                gif.z = aans2.c().a(new abke[] { abke.d, abke.e, abke.f });
                final boolean a9 = gif.A;
                boolean a10;
                if (aans2.b() != null) {
                    a10 = gim.b(aans2.b());
                }
                else {
                    a10 = gif.A;
                }
                gif.A = a10;
                if ((z2 != gif.z || a9 != a10 || b2 != gif.B) && !gif.y) {
                    gif.f();
                }
                return;
            }
            case 9: {
                final Object a11 = this.a;
                final aanw u = (aanw)o;
                final gif gif2 = (gif)a11;
                if (!adkp.ae(gif2.u, u)) {
                    gif2.u = u;
                    if (!gif2.y) {
                        gif2.f();
                    }
                }
                return;
            }
            case 8: {
                final Object a12 = this.a;
                final Boolean b3 = (Boolean)o;
                final gif gif3 = (gif)a12;
                if (!gif3.y && !gif3.z) {
                    gif3.f();
                }
                return;
            }
            case 7: {
                final Object a13 = this.a;
                final aani aani = (aani)o;
                final DefaultPipController defaultPipController = (DefaultPipController)a13;
                final abpq g = defaultPipController.g();
                if (defaultPipController.b.isInPictureInPictureMode() && !gim.e(aani.b())) {
                    g.aj(25);
                    if (defaultPipController.A.e) {
                        ((gij)defaultPipController.d.a()).a(g.p(), g.r(), g.i());
                    }
                }
                boolean u2;
                if (aani.b() != null) {
                    u2 = gim.b(aani.b());
                }
                else {
                    u2 = defaultPipController.u;
                }
                defaultPipController.u = u2;
                defaultPipController.r = aani.b();
                defaultPipController.k((Function)new fnr(defaultPipController, 12));
                return;
            }
            case 6: {
                final Object a14 = this.a;
                final gip a15 = (gip)o;
                final DefaultPipController defaultPipController2 = (DefaultPipController)a14;
                defaultPipController2.A = a15;
                defaultPipController2.k((Function)new fnr(defaultPipController2, 12));
                if (a15.c) {
                    defaultPipController2.k((Function)new fnr(defaultPipController2, 14));
                }
                final View m = defaultPipController2.m;
                if (m != null) {
                    final View$OnLayoutChangeListener o2 = defaultPipController2.o;
                    if (o2 != null) {
                        m.removeOnLayoutChangeListener(o2);
                    }
                }
                final gin z3 = defaultPipController2.z;
                if (z3 != null) {
                    final View a16 = z3.a();
                    if ((defaultPipController2.m = a16) != null) {
                        if (defaultPipController2.o == null) {
                            defaultPipController2.o = (View$OnLayoutChangeListener)new fti(defaultPipController2, 7);
                        }
                        a16.addOnLayoutChangeListener(defaultPipController2.o);
                    }
                }
                return;
            }
            case 5: {
                ((DefaultPipController)this.a).z = (gin)o;
                return;
            }
            case 4: {
                final Object a17 = this.a;
                final Boolean b4 = (Boolean)o;
                new StringBuilder("#registerListeners assistantQueryStatusChecker - isAssistQuerySubmitted: ").append(b4);
                final DefaultPipController defaultPipController3 = (DefaultPipController)a17;
                defaultPipController3.w.set(b4);
                defaultPipController3.k((Function)new fnr(defaultPipController3, 12));
                return;
            }
            case 3: {
                final Object a18 = this.a;
                final abty y = (abty)o;
                final DefaultPipController defaultPipController4 = (DefaultPipController)a18;
                final abtx l = defaultPipController4.l;
                if (l != null) {
                    final abty y2 = defaultPipController4.y;
                    if (y2 != null) {
                        y2.f(l);
                    }
                    (defaultPipController4.y = y).a(l);
                }
                return;
            }
            case 2: {
                final Object a19 = this.a;
                final aanw aanw2 = (aanw)o;
                final DefaultPipController defaultPipController5 = (DefaultPipController)a19;
                final boolean t2 = defaultPipController5.t;
                int t3;
                if (!aanw2.f() && !aanw2.c()) {
                    t3 = 0;
                }
                else {
                    t3 = 1;
                }
                defaultPipController5.t = (t3 != 0);
                if ((t2 ? 1 : 0) != t3) {
                    defaultPipController5.k((Function)new fnr(defaultPipController5, 12));
                }
                return;
            }
            case 1: {
                final Object a20 = this.a;
                final trs trs = (trs)o;
                ((ghv)a20).i();
                return;
            }
            case 0: {
                final Object a21 = this.a;
                final boolean booleanValue = (boolean)o;
                final DefaultPipController defaultPipController6 = (DefaultPipController)a21;
                if (defaultPipController6.x == booleanValue) {
                    return;
                }
                defaultPipController6.x = booleanValue;
                defaultPipController6.k((Function)new fnr(defaultPipController6, 12));
            }
        }
    }
}
