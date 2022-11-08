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

public final class ghw
{
    public boolean A;
    public boolean B;
    public final hyq C;
    public qpt D;
    private final Activity E;
    private final IntentFilter F;
    private final BroadcastReceiver G;
    private final ghr H;
    private final boolean I;
    private final uyf J;
    public final gic a;
    public final aams b;
    public final shw c;
    public final asib d;
    public final Map e;
    public final ghr f;
    public final ghr g;
    public final ghr h;
    public final ghr i;
    public final ghr j;
    public final ghr k;
    public final ghr l;
    public final ghr m;
    public final ghr n;
    public final ghr o;
    public final shu p;
    public final wwv q;
    public final aawb r;
    public final aavz s;
    public aamq t;
    public aamc u;
    public ryt v;
    public afcr w;
    public boolean x;
    public boolean y;
    public boolean z;
    
    public ghw(final Activity e, final hyq c, final gic a, final aams b, final shw c2, final wwv q, final aawb r, final uyi uyi, final uyf j, final byte[] array, final byte[] array2) {
        this.E = e;
        this.C = c;
        this.a = a;
        this.b = b;
        this.c = c2;
        this.q = q;
        this.r = r;
        this.J = j;
        this.I = uyi.f(45365637L);
        this.d = new asib();
        this.w = afcr.q();
        this.e = new HashMap();
        this.F = new IntentFilter();
        final ght b2 = ght.b;
        a.getClass();
        this.f = g((ghx)b2, new ghh(a, 8), e);
        this.g = g((ghx)ght.g, new fsa(this, e, 6), e);
        this.h = g((ghx)ght.h, new ghh(c, 9, null, null), e);
        this.i = g((ghx)ght.i, new ghh(c, 10, null, null), e);
        this.j = g((ghx)ght.j, new ghh(c, 11, null, null), e);
        this.k = g((ghx)ght.a, new ghh(c, 3, null, null), e);
        this.l = g((ghx)ght.c, new ghh(a, 4), e);
        this.m = g((ghx)ght.d, new ghh(this, 5), e);
        this.n = g((ghx)ght.e, new ghh(b, 6), e);
        final ght f = ght.f;
        b.getClass();
        this.o = g((ghx)f, new ghh(b, 7), e);
        this.H = new ghr((Context)e, 2131232704, 2132019125, 2132019125, "com.google.android.libraries.youtube.player.action.controller_notification_retry", null, null);
        this.G = new ghu(this, q);
        this.p = (shu)new ghv(this, 0);
        r.i(this.s = (aavz)new kvx(this, 1));
    }
    
    private static ghr g(final ghx ghx, final Runnable runnable, final Activity activity) {
        return ghx.a((Context)activity, runnable);
    }
    
    private final ghr h() {
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
    
    private final ghr i() {
        if (this.B) {
            final aamc u = this.u;
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
            ghr ghr;
            if (this.C.m().Z()) {
                ghr = this.h;
            }
            else {
                ghr = this.i;
            }
            return ghr;
        }
        return this.H;
    }
    
    private final ghr j() {
        if (this.z) {
            this.m.a().setEnabled(fah.y(this.v));
            return this.m;
        }
        this.l.a().setEnabled(this.a.b);
        return this.l;
    }
    
    public final afcr a() {
        return (afcr)Collection$_EL.stream((Collection)this.w).map((Function)gfu.p).collect(afaj.a);
    }
    
    public final void b() {
        Collection$_EL.stream((Collection)this.w).map((Function)gfu.n).filter((Predicate)fqf.n).map((Function)gfu.o).forEach((Consumer)new gft(this, 10));
    }
    
    public final void c(final ghr ghr) {
        this.F.addAction(ghr.a);
        this.e.put(ghr.a, ghr);
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
        afcr w = null;
        Label_0308: {
            if (this.y) {
                w = afcr.s((Object)this.n, (Object)this.o);
            }
            else {
                anqa anqa;
                if ((anqa = this.J.b().A) == null) {
                    anqa = anqa.a;
                }
                if (anqa.g) {
                    final amzf amzf = null;
                    akuv y;
                    try {
                        final Object a = this.C.a;
                        a.getClass();
                        final abno o = ((abns)a).o();
                        o.getClass();
                        final abtt q = o.q();
                        q.getClass();
                        final PlayerResponseModel d = q.d();
                        d.getClass();
                        y = d.y();
                    }
                    catch (final NullPointerException ex) {
                        y = null;
                    }
                    amzf amzf2 = amzf;
                    if (y != null) {
                        akus akus;
                        if ((akus = y.h) == null) {
                            akus = akus.a;
                        }
                        amze a2;
                        if (akus.b == 151635310) {
                            a2 = (amze)akus.c;
                        }
                        else {
                            a2 = amze.a;
                        }
                        amzf2 = amzf;
                        if ((a2.b & 0x8) != 0x0) {
                            akus akus2;
                            if ((akus2 = y.h) == null) {
                                akus2 = akus.a;
                            }
                            amze a3;
                            if (akus2.b == 151635310) {
                                a3 = (amze)akus2.c;
                            }
                            else {
                                a3 = amze.a;
                            }
                            if ((amzf2 = a3.d) == null) {
                                amzf2 = amzf.a;
                            }
                        }
                    }
                    if (amzf2 != null && !amzf2.b) {
                        w = afcr.r((Object)this.i());
                        break Label_0308;
                    }
                }
                if (this.E.getResources().getConfiguration().getLayoutDirection() == 1) {
                    w = afcr.t((Object)this.j(), (Object)this.i(), (Object)this.h());
                }
                else {
                    w = afcr.t((Object)this.h(), (Object)this.i(), (Object)this.j());
                }
            }
        }
        if (this.x) {
            Collection$_EL.stream((Collection)this.w).filter((Predicate)new fqe(w, 7)).map((Function)gfu.n).filter((Predicate)fqf.n).map((Function)gfu.o).forEach((Consumer)new gft(this, 8));
            Collection$_EL.stream((Collection)w).filter((Predicate)new fqe(this, 8)).map((Function)gfu.n).filter((Predicate)fqf.n).map((Function)gfu.o).forEach((Consumer)new gft(this, 9));
        }
        this.w = w;
        final qpt d2 = this.D;
        if (d2 != null) {
            final DefaultPipController defaultPipController = (DefaultPipController)d2.a;
            defaultPipController.k(new Function[] { (Function)new fnm(defaultPipController, 15) });
        }
    }
}
