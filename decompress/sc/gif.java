import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.apps.youtube.app.common.ui.pip.DefaultPipController;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import android.app.RemoteAction;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gif
{
    public boolean A;
    public boolean B;
    public final hzm C;
    public pvh D;
    private final Activity E;
    private final IntentFilter F;
    private final BroadcastReceiver G;
    private final gia H;
    private final boolean I;
    private final vaf J;
    public final gil a;
    public final aaon b;
    public final skc c;
    public final asiq d;
    public final Map e;
    public final gia f;
    public final gia g;
    public final gia h;
    public final gia i;
    public final gia j;
    public final gia k;
    public final gia l;
    public final gia m;
    public final gia n;
    public final gia o;
    public final ska p;
    public final wyw q;
    public final aaxx r;
    public final aaxv s;
    public aaol t;
    public aanw u;
    public say v;
    public afeq w;
    public boolean x;
    public boolean y;
    public boolean z;
    
    public gif(final Activity e, final hzm c, final gil a, final aaon b, final skc c2, final wyw q, final aaxx r, final vai vai, final vaf j, final byte[] array, final byte[] array2) {
        this.E = e;
        this.C = c;
        this.a = a;
        this.b = b;
        this.c = c2;
        this.q = q;
        this.r = r;
        this.J = j;
        this.I = vai.f(45365637L);
        this.d = new asiq();
        this.w = afeq.q();
        this.e = new HashMap();
        this.F = new IntentFilter();
        final gic b2 = gic.b;
        a.getClass();
        this.f = g(b2, new ght(a, 7), e);
        this.g = g(gic.g, new fsi(this, e, 6), e);
        this.h = g(gic.h, new ght(c, 8, null, null), e);
        this.i = g(gic.i, new ght(c, 9, null, null), e);
        this.j = g(gic.j, new ght(c, 10, null, null), e);
        this.k = g(gic.a, new ght(c, 2, null, null), e);
        this.l = g(gic.c, new ght(a, 3), e);
        this.m = g(gic.d, new ght(this, 4), e);
        this.n = g(gic.e, new ght(b, 5), e);
        final gic f = gic.f;
        b.getClass();
        this.o = g(f, new ght(b, 6), e);
        this.H = new gia((Context)e, 2131232704, 2132019126, 2132019126, "com.google.android.libraries.youtube.player.action.controller_notification_retry", null, null);
        this.G = new gid(this, q);
        this.p = (ska)new gie(this, 0);
        r.i(this.s = (aaxv)new kwz(this, 1));
    }
    
    private static gia g(final gig gig, final Runnable runnable, final Activity activity) {
        return gig.a((Context)activity, runnable);
    }
    
    private final gia h() {
        if (this.A && !this.I) {
            return this.g;
        }
        final RemoteAction a = this.f.a();
        final boolean a2 = this.a.a;
        boolean enabled = false;
        if (a2) {
            enabled = enabled;
            if (!this.z) {
                enabled = true;
            }
        }
        a.setEnabled(enabled);
        return this.f;
    }
    
    private final gia i() {
        if (this.B) {
            final aanw u = this.u;
            if (u != null) {
                final int a = u.a();
                if (a == 7) {
                    return this.j;
                }
                if (a == 8) {
                    return this.k;
                }
                if (u.f() || u.c()) {
                    return this.h;
                }
                if (this.u.e()) {
                    return this.i;
                }
            }
            gia gia;
            if (this.C.m().Y()) {
                gia = this.h;
            }
            else {
                gia = this.i;
            }
            return gia;
        }
        return this.H;
    }
    
    private final gia j() {
        if (this.z) {
            this.m.a().setEnabled(fal.x(this.v));
            return this.m;
        }
        this.l.a().setEnabled(this.a.b);
        return this.l;
    }
    
    public final afeq a() {
        return (afeq)Collection$_EL.stream((Collection)this.w).map((Function)ggb.p).collect(afci.a);
    }
    
    public final void b() {
        Collection$_EL.stream((Collection)this.w).map((Function)ggb.n).filter((Predicate)fqo.n).map((Function)ggb.o).forEach((Consumer)new gga(this, 10));
    }
    
    public final void c(final gia gia) {
        this.F.addAction(gia.a);
        this.e.put(gia.a, gia);
    }
    
    public final void d() {
        if (!this.x && this.E.isInPictureInPictureMode()) {
            this.E.registerReceiver(this.G, this.F);
            this.x = true;
            this.b();
        }
    }
    
    public final void e() {
        if (this.x) {
            this.E.unregisterReceiver(this.G);
            this.x = false;
            this.b();
        }
    }
    
    public final void f() {
        afeq w = null;
        Label_0305: {
            if (this.y) {
                w = afeq.s((Object)this.n, (Object)this.o);
            }
            else {
                ansd ansd;
                if ((ansd = this.J.b().A) == null) {
                    ansd = ansd.a;
                }
                if (ansd.g) {
                    final anbj anbj = null;
                    akwz y;
                    try {
                        final Object a = this.C.a;
                        a.getClass();
                        final abpq n = ((abpu)a).n();
                        n.getClass();
                        final abvx q = n.q();
                        q.getClass();
                        final PlayerResponseModel d = q.d();
                        d.getClass();
                        y = d.y();
                    }
                    catch (final NullPointerException ex) {
                        y = null;
                    }
                    anbj anbj2 = anbj;
                    if (y != null) {
                        akww akww;
                        if ((akww = y.h) == null) {
                            akww = akww.a;
                        }
                        anbi a2;
                        if (akww.b == 151635310) {
                            a2 = (anbi)akww.c;
                        }
                        else {
                            a2 = anbi.a;
                        }
                        anbj2 = anbj;
                        if ((a2.b & 0x8) != 0x0) {
                            akww akww2;
                            if ((akww2 = y.h) == null) {
                                akww2 = akww.a;
                            }
                            anbi a3;
                            if (akww2.b == 151635310) {
                                a3 = (anbi)akww2.c;
                            }
                            else {
                                a3 = anbi.a;
                            }
                            if ((anbj2 = a3.d) == null) {
                                anbj2 = anbj.a;
                            }
                        }
                    }
                    if (anbj2 != null && !anbj2.b) {
                        w = afeq.r((Object)this.i());
                        break Label_0305;
                    }
                }
                if (this.E.getResources().getConfiguration().getLayoutDirection() == 1) {
                    w = afeq.t((Object)this.j(), (Object)this.i(), (Object)this.h());
                }
                else {
                    w = afeq.t((Object)this.h(), (Object)this.i(), (Object)this.j());
                }
            }
        }
        if (this.x) {
            Collection$_EL.stream((Collection)this.w).filter((Predicate)new fqn(w, 7)).map((Function)ggb.n).filter((Predicate)fqo.n).map((Function)ggb.o).forEach((Consumer)new gga(this, 8));
            Collection$_EL.stream((Collection)w).filter((Predicate)new fqn(this, 8)).map((Function)ggb.n).filter((Predicate)fqo.n).map((Function)ggb.o).forEach((Consumer)new gga(this, 9));
        }
        this.w = w;
        final pvh d2 = this.D;
        if (d2 != null) {
            final DefaultPipController defaultPipController = (DefaultPipController)d2.a;
            defaultPipController.k((Function)new fnr(defaultPipController, 15));
        }
    }
}
