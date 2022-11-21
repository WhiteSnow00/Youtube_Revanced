import android.app.ForegroundServiceStartNotAllowedException;
import android.os.Build$VERSION;
import android.content.Intent;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.content.ServiceConnection;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aamk
{
    public final Context a;
    public final abkq b;
    public final abpl c;
    public twp d;
    public final atnb e;
    public final arna f;
    public boolean g;
    public boolean h;
    public int i;
    public abqs j;
    public final absv k;
    public final arzb l;
    public final adzx m;
    public final adzx n;
    private final atnb o;
    private final atnb p;
    private final arna q;
    private boolean r;
    private final ServiceConnection s;
    private final aunx t;
    private final agnl u;
    
    public aamk(final Context a, final atnb o, final abkq b, final atnb p16, final atnb e, final abpl c, final aunx t, final agnl u, final arzb l, final arna f, final arna q, final absv k, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.s = (ServiceConnection)new udw(this, 2);
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
        this.l = l;
        this.t = t;
        this.f = f;
        this.q = q;
        this.k = k;
        this.m = new adzx(this);
        this.n = new adzx(this);
        this.i = 1;
        this.g = false;
    }
    
    private final PlayerResponseModel k() {
        final Object a = this.u.a;
        final twp d = this.d;
        if (d != null && d.a() != null && a != null) {
            return ((abwn)a).o();
        }
        return null;
    }
    
    private final void l() {
        if (this.c.c()) {
            ((abod)this.f.a()).b(true);
        }
    }
    
    private final void m() {
        this.i = 2;
        this.b.m(true);
        this.b.k();
        final Object a = this.d.a();
        if (a != null) {
            ((abpq)a).d(true);
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
        final abqs j = this.j;
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
            ((abod)this.f.a()).h();
        }
    }
    
    public final void c(final zfd d, final abkn abkn, final boolean r) {
        synchronized (this) {
            this.b.n(abkn);
            final abkq b = this.b;
            b.h = false;
            this.i = 1;
            b.m(false);
            b.d = d;
            b.o();
            final Object a = this.d.a();
            if (a != null) {
                ((abpq)a).d(false);
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
            final boolean f = aamz.f(playerResponseModel);
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
                ((abod)this.f.a()).i(true);
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
                tut.l("Failed to start foreground priority player Service due to Android S+ restrictions");
                return;
            }
        }
        this.a.startForegroundService((Intent)this.o.a());
    }
    
    public final void g() {
        if (this.i == 3) {
            tut.l("About to stop background service while in a pending state.");
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
        return ((aamm)this.q.a()).a(this.k(), this.i);
    }
    
    public final arjd j() {
        synchronized (this) {
            this.b.h = true;
            final int i = this.i;
            aiaj j = null;
            arjd arjd = null;
            if (i == 1) {
                Label_0277: {
                    Label_0266: {
                        if (this.d.a() != null) {
                            if (this.p.a() != null) {
                                final Object a = this.u.a;
                                if (!((abmo)this.p.a()).k.a(abli.b)) {
                                    if (!((abmo)this.p.a()).k.a(abli.d, abli.e) || a == null || ((abwn)a).ac()) {
                                        break Label_0266;
                                    }
                                }
                                if (this.c.c()) {
                                    if (this.p.a() != null && ((abmo)this.p.a()).k == abli.b) {
                                        arjd = new arjd(1, (byte[])null, (byte[])null);
                                        break Label_0277;
                                    }
                                    final PlayerResponseModel k = this.k();
                                    if (!aamz.f(k)) {
                                        if (k != null) {
                                            if (k.y() != null) {
                                                j = aamr.i(k.y());
                                            }
                                        }
                                        arjd = new arjd(3, j);
                                        break Label_0277;
                                    }
                                    arjd = new arjd(2, (byte[])null, (byte[])null);
                                    break Label_0277;
                                }
                            }
                        }
                    }
                    arjd = new arjd(4, (byte[])null, (byte[])null);
                }
                final int n = arjd.a - 1;
                if (n == 0) {
                    this.i = 3;
                    this.t.f();
                    this.b();
                    return arjd;
                }
                if (n == 1) {
                    this.m();
                    this.t.f();
                    this.b();
                    return arjd;
                }
                if (n == 3) {
                    this.b.k();
                    return arjd;
                }
            }
            else if (i == 3) {
                arjd = new arjd(1, (byte[])null, (byte[])null);
            }
            else {
                arjd = new arjd(2, (byte[])null, (byte[])null);
            }
            return arjd;
        }
    }
}
