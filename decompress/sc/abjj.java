import java.util.Observable;
import com.google.android.libraries.youtube.player.modality.PlaybackModalityState;
import java.util.Observer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abjj implements Observer, abjk
{
    public final zdk a;
    public float b;
    public boolean c;
    public zdi d;
    public boolean e;
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
    public lrd p;
    public abju q;
    public abkd r;
    public int s;
    public final ablw t;
    final aanx u;
    private abjg v;
    
    public abjj(final ablw t, final aanx u, final byte[] array, final byte[] array2, final byte[] array3) {
        this.h = true;
        this.p = lrd.a;
        this.q = abju.a();
        this.r = abkd.a;
        this.t = t;
        this.u = u;
        this.a = (zdk)new abji(this);
        this.b = 1.0f;
        this.s = 1;
        this.h = true;
    }
    
    private final abjv x() {
        if (this.f) {
            return abjv.c;
        }
        if (this.e) {
            return abjv.b;
        }
        if (this.l) {
            return abjv.e;
        }
        return abjv.a;
    }
    
    public final float a() {
        if (this.q.b()) {
            return 0.0f;
        }
        if (this.c) {
            return 0.1f;
        }
        return this.b;
    }
    
    public final zdj b() {
        final abjg v = this.v;
        if (v != null) {
            final abjv a = abjv.a;
            final int ordinal = this.x().ordinal();
            if (ordinal == 0) {
                return (zdj)v.a.a();
            }
            if (ordinal == 1) {
                return (zdj)v.d.a();
            }
            if (ordinal == 2) {
                return (zdj)v.b.a();
            }
            if (ordinal == 4) {
                return (zdj)v.c.a();
            }
        }
        return zdj.a;
    }
    
    public final aamh c() {
        final zdj b = this.b();
        final abjv g = this.g();
        final abjv x = this.x();
        final int c = b.c;
        final int d = b.d;
        final zdi d2 = this.d;
        return new aamh(g, x, c, d, d2 != null && d2.w(), this.o);
    }
    
    public final aamh d() {
        return this.c();
    }
    
    public final PlaybackModalityState e() {
        return new PlaybackModalityState(this.e, this.f, this.i, this.j, this.k, this.l, this.m, this.o, this.g, this.q, this.r);
    }
    
    public final abju f() {
        return this.q;
    }
    
    public final abjv g() {
        if (this.k) {
            return abjv.h;
        }
        if (this.i) {
            return abjv.d;
        }
        if (this.m) {
            return abjv.f;
        }
        if (this.g) {
            return abjv.g;
        }
        return this.x();
    }
    
    public final abkd h() {
        return this.r;
    }
    
    public final void i() {
        ((aukf)this.t.f).tu((Object)this.c());
        this.a.notifyObservers();
    }
    
    public final void j() {
        ((aukf)this.t.e).tu((Object)new aanq(this.r, this.j));
    }
    
    public final void k() {
        this.n(null);
        this.d = null;
        ((aukf)this.u.a).tu((Object)abir.a);
    }
    
    public final void l() {
        this.m(false);
    }
    
    public final void m(final boolean i) {
        if (i != this.i) {
            this.i = i;
            this.i();
        }
    }
    
    public final void n(final abjg v) {
        final abjg v2 = this.v;
        if (v2 != null) {
            v2.deleteObserver((Observer)this);
        }
        if ((this.v = v) != null) {
            v.addObserver((Observer)this);
        }
    }
    
    public final void o() {
        final Object a = this.u.a;
        abir a2;
        if (this.s()) {
            a2 = abir.a;
        }
        else {
            a2 = new abir(this.d);
        }
        ((aukf)a).tu((Object)a2);
    }
    
    public final void p(final abju q) {
        if (!q.equals((Object)this.q)) {
            this.q = q;
        }
    }
    
    public final void q(final boolean m) {
        if (m != this.m) {
            this.m = m;
            this.i();
        }
    }
    
    public final void r(final boolean b) {
        if (b) {
            if (!this.j) {
                ((aukf)this.u.a).tu((Object)abir.a);
                this.w(true);
            }
        }
        else if (this.j) {
            this.w(false);
            if (this.d != null) {
                this.o();
                return;
            }
            ttr.b("Error: no UI elements available to display video");
        }
    }
    
    public final boolean s() {
        return this.j || this.i;
    }
    
    public final boolean t() {
        return this.g() == abjv.e;
    }
    
    public final boolean u() {
        return this.x() == abjv.a;
    }
    
    @Override
    public final void update(final Observable observable, final Object o) {
        if (observable == this.v && o instanceof Integer) {
            final abjv x = this.x();
            final int intValue = (int)o;
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue == 3) {
                            if (x == abjv.b) {
                                this.i();
                            }
                        }
                    }
                    else if (x == abjv.e) {
                        this.i();
                    }
                }
                else if (x == abjv.c) {
                    this.i();
                }
            }
            else if (x == abjv.a) {
                this.i();
            }
        }
    }
    
    public final void v(final int s) {
        this.s = s;
        boolean b = true;
        if (s != 1) {
            if (s != 2) {
                b = false;
            }
            ((aukf)this.t.g).tu((Object)new aanb(b));
        }
    }
    
    final void w(final boolean j) {
        if (j != this.j) {
            this.j = j;
            this.i();
            this.j();
        }
    }
}
