import java.util.Observable;
import com.google.android.libraries.youtube.player.modality.PlaybackModalityState;
import java.util.Observer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abhq implements Observer, abhs
{
    public final abhr a;
    public final zbr b;
    public float c;
    public boolean d;
    public zbp e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public lpz q;
    public abic r;
    public abil s;
    public int t;
    final aamd u;
    private abhn v;
    
    public abhq(final abhr a, final aamd u, final byte[] array, final byte[] array2, final byte[] array3) {
        this.i = true;
        this.q = lpz.a;
        this.r = abic.a();
        this.s = abil.a;
        this.a = a;
        this.u = u;
        this.b = (zbr)new abhp(this);
        this.c = 1.0f;
        this.t = 1;
        this.i = true;
    }
    
    private final abid x() {
        if (this.g) {
            return abid.c;
        }
        if (this.f) {
            return abid.b;
        }
        if (this.m) {
            return abid.e;
        }
        return abid.a;
    }
    
    public final float a() {
        if (this.r.b()) {
            return 0.0f;
        }
        if (this.d) {
            return 0.1f;
        }
        return this.c;
    }
    
    public final zbq b() {
        final abhn v = this.v;
        if (v != null) {
            final abid a = abid.a;
            final int ordinal = this.x().ordinal();
            if (ordinal == 0) {
                return (zbq)v.a.a();
            }
            if (ordinal == 1) {
                return (zbq)v.d.a();
            }
            if (ordinal == 2) {
                return (zbq)v.b.a();
            }
            if (ordinal == 4) {
                return (zbq)v.c.a();
            }
        }
        return zbq.a;
    }
    
    public final aakn c() {
        final zbq b = this.b();
        final abid g = this.g();
        final abid x = this.x();
        final int c = b.c;
        final int d = b.d;
        final zbp e = this.e;
        return new aakn(g, x, c, d, e != null && e.w(), this.p);
    }
    
    public final aakn d() {
        return this.c();
    }
    
    public final PlaybackModalityState e() {
        return new PlaybackModalityState(this.f, this.g, this.j, this.k, this.l, this.m, this.n, this.p, this.h, this.r, this.s);
    }
    
    public final abic f() {
        return this.r;
    }
    
    public final abid g() {
        if (this.l) {
            return abid.h;
        }
        if (this.j) {
            return abid.d;
        }
        if (this.n) {
            return abid.f;
        }
        if (this.h) {
            return abid.g;
        }
        return this.x();
    }
    
    public final abil h() {
        return this.s;
    }
    
    public final void i() {
        ((aujp)this.a.h).tr((Object)this.c());
        this.b.notifyObservers();
    }
    
    public final void j() {
        ((aujp)this.a.g).tr((Object)new aalw(this.s, this.k));
    }
    
    public final void k() {
        this.n(null);
        this.e = null;
        ((aujp)this.u.a).tr((Object)abgy.a);
    }
    
    public final void l() {
        this.m(false);
    }
    
    public final void m(final boolean j) {
        if (j != this.j) {
            this.j = j;
            this.i();
        }
    }
    
    public final void n(final abhn v) {
        final abhn v2 = this.v;
        if (v2 != null) {
            v2.deleteObserver((Observer)this);
        }
        if ((this.v = v) != null) {
            v.addObserver((Observer)this);
        }
    }
    
    public final void o() {
        final Object a = this.u.a;
        abgy a2;
        if (this.s()) {
            a2 = abgy.a;
        }
        else {
            a2 = new abgy(this.e);
        }
        ((aujp)a).tr((Object)a2);
    }
    
    public final void p(final abic r) {
        if (!r.equals((Object)this.r)) {
            this.r = r;
        }
    }
    
    public final void q(final boolean n) {
        if (n != this.n) {
            this.n = n;
            this.i();
        }
    }
    
    public final void r(final boolean b) {
        if (b) {
            if (!this.k) {
                ((aujp)this.u.a).tr((Object)abgy.a);
                this.w(true);
            }
        }
        else if (this.k) {
            this.w(false);
            if (this.e != null) {
                this.o();
                return;
            }
            trn.b("Error: no UI elements available to display video");
        }
    }
    
    public final boolean s() {
        return this.k || this.j;
    }
    
    public final boolean t() {
        return this.g() == abid.e;
    }
    
    public final boolean u() {
        return this.x() == abid.a;
    }
    
    @Override
    public final void update(final Observable observable, final Object o) {
        if (observable == this.v && o instanceof Integer) {
            final abid x = this.x();
            final int intValue = (int)o;
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue == 3) {
                            if (x == abid.b) {
                                this.i();
                            }
                        }
                    }
                    else if (x == abid.e) {
                        this.i();
                    }
                }
                else if (x == abid.c) {
                    this.i();
                }
            }
            else if (x == abid.a) {
                this.i();
            }
        }
    }
    
    public final void v(final int t) {
        this.t = t;
        boolean b = true;
        if (t != 1) {
            if (t != 2) {
                b = false;
            }
            ((aujp)this.a.k).tr((Object)new aalh(b));
        }
    }
    
    final void w(final boolean k) {
        if (k != this.k) {
            this.k = k;
            this.i();
            this.j();
        }
    }
}
