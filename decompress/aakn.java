import android.app.ForegroundServiceStartNotAllowedException;
import android.os.Build$VERSION;
import android.content.Intent;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.content.ServiceConnection;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aakn
{
    public final Context a;
    public final abjj b;
    public final aboe c;
    public tvn d;
    public final atke e;
    public final arkg f;
    public boolean g;
    public boolean h;
    public int i;
    public abpn j;
    public final arwh k;
    public final abrj l;
    public final xra m;
    public final xra n;
    private final atke o;
    private final atke p;
    private final arkg q;
    private boolean r;
    private final ServiceConnection s;
    private final aulc t;
    private final aglu u;
    
    public aakn(final Context a, final atke o, final abjj b, final atke p16, final atke e, final aboe c, final aulc t, final aglu u, final arwh k, final arkg f, final arkg q, final abrj l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.s = (ServiceConnection)new ucr(this, 2);
        a.getClass();
        this.a = a;
        o.getClass();
        this.o = o;
        b.getClass();
        this.b = b;
        this.p = p16;
        this.e = e;
        c.getClass();
        this.c = c;
        this.u = u;
        this.k = k;
        this.t = t;
        this.f = f;
        this.q = q;
        this.l = l;
        this.m = new xra(this);
        this.n = new xra(this);
        this.i = 1;
        this.g = false;
    }
    
    private final PlayerResponseModel k() {
        final Object a = this.u.a;
        final tvn d = this.d;
        if (d != null && d.a() != null && a != null) {
            return ((abvb)a).o();
        }
        return null;
    }
    
    private final void l() {
        if (this.c.c()) {
            ((abmw)this.f.a()).b(true);
        }
    }
    
    private final void m() {
        this.i = 2;
        this.b.m(true);
        this.b.k();
        final Object a = this.d.a();
        if (a != null) {
            ((aboj)a).d(true);
        }
    }
    
    private final boolean n() {
        final boolean i = this.i();
        boolean b = false;
        if (i) {
            if (!this.b.h) {
                if (this.r) {
                    return true;
                }
                b = b;
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    public final void a() {
        this.i = 1;
        this.l();
        final abpn j = this.j;
        if (j != null) {
            if (j.b) {
                j.c.u(j.a);
            }
            j.c.k = null;
        }
    }
    
    public final void b() {
        if (this.n()) {
            this.e();
            ((abmw)this.f.a()).h();
        }
    }
    
    public final void c(final zdi d, final abjg abjg, final boolean r) {
        synchronized (this) {
            this.b.n(abjg);
            final abjj b = this.b;
            b.h = false;
            this.i = 1;
            b.m(false);
            b.d = d;
            b.o();
            final Object a = this.d.a();
            if (a != null) {
                ((aboj)a).d(false);
            }
            if (!(this.r = r)) {
                this.l();
            }
        }
    }
    
    public final void d(final PlayerResponseModel playerResponseModel) {
        synchronized (this) {
            if (this.b.k) {
                return;
            }
            final boolean f = aald.f(playerResponseModel);
            if (this.i == 3) {
                if (f) {
                    this.m();
                    return;
                }
                this.a();
            }
            else if (f) {
                return;
            }
            this.l();
        }
    }
    
    public final void e() {
        if (this.g) {
            if (this.n() && this.h && this.b.h) {
                this.f();
                ((abmw)this.f.a()).i(true);
            }
            return;
        }
        this.a.bindService((Intent)this.o.a(), this.s, 1);
        this.g = true;
    }
    
    public final void f() {
        if (Build$VERSION.SDK_INT >= 31) {
            try {
                this.a.startForegroundService((Intent)this.o.a());
                return;
            }
            catch (final ForegroundServiceStartNotAllowedException ex) {
                ttr.l("Failed to start foreground priority player Service due to Android S+ restrictions");
                return;
            }
        }
        this.a.startForegroundService((Intent)this.o.a());
    }
    
    public final void g() {
        if (this.i == 3) {
            ttr.l("About to stop background service while in a pending state.");
        }
        this.i = 1;
        this.l();
        this.h();
        this.b.l();
        this.h = false;
    }
    
    public final void h() {
        if (!this.g) {
            return;
        }
        this.a.stopService((Intent)this.o.a());
        this.a.unbindService(this.s);
        this.g = false;
    }
    
    public final boolean i() {
        return ((aakq)this.q.a()).a(this.k(), this.i);
    }
    
    public final argj j() {
        synchronized (this) {
            this.b.h = true;
            final int i = this.i;
            ahyq j = null;
            argj argj = null;
            if (i == 1) {
                Label_0277: {
                    Label_0266: {
                        if (this.d.a() != null) {
                            if (this.p.a() != null) {
                                final Object a = this.u.a;
                                if (!((ablh)this.p.a()).k.a(new abkb[] { abkb.b })) {
                                    if (!((ablh)this.p.a()).k.a(new abkb[] { abkb.d, abkb.e }) || a == null || ((abvb)a).ac()) {
                                        break Label_0266;
                                    }
                                }
                                if (this.c.c()) {
                                    if (this.p.a() != null && ((ablh)this.p.a()).k == abkb.b) {
                                        argj = new argj(1, (byte[])null, (byte[])null);
                                        break Label_0277;
                                    }
                                    final PlayerResponseModel k = this.k();
                                    if (!aald.f(k)) {
                                        if (k != null) {
                                            if (k.y() != null) {
                                                j = aakv.i(k.y());
                                            }
                                        }
                                        argj = new argj(3, j);
                                        break Label_0277;
                                    }
                                    argj = new argj(2, (byte[])null, (byte[])null);
                                    break Label_0277;
                                }
                            }
                        }
                    }
                    argj = new argj(4, (byte[])null, (byte[])null);
                }
                final int n = argj.a - 1;
                if (n == 0) {
                    this.i = 3;
                    this.t.f();
                    this.b();
                    return argj;
                }
                if (n == 1) {
                    this.m();
                    this.t.f();
                    this.b();
                    return argj;
                }
                if (n == 3) {
                    this.b.k();
                    return argj;
                }
            }
            else if (i == 3) {
                argj = new argj(1, (byte[])null, (byte[])null);
            }
            else {
                argj = new argj(2, (byte[])null, (byte[])null);
            }
            return argj;
        }
    }
}
