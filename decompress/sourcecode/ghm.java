import android.content.res.Configuration;
import java.util.concurrent.atomic.AtomicReference;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ghm extends ghj implements fxn, fxm, ghf, abrw, gha, fjo
{
    public final Activity b;
    public final fxo c;
    public final ghl d;
    public final tnu e;
    public final abrx f;
    asic g;
    public final uyi h;
    public final zed i;
    private final fjp j;
    private final ghk k;
    private final wwv l;
    private final asgt m;
    private final boolean n;
    
    public ghm(final Activity b, final fxo c, final fjp j, final uyf uyf, final zed i, final ghl d, final tnu e, final ghk k, final abrx f, final wwv l, final kct kct, final uyi h, final lgl lgl, final mrm mrm, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(b, i, kct, mrm, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.b = b;
        this.c = c;
        this.i = i;
        this.d = d;
        this.e = e;
        this.f = f;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = (asgt)kct.a;
        this.h = h;
        this.n = lgl.a;
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        if (alvl.x) {
            i.e(1);
        }
    }
    
    private final void n(final fkk fkk, final boolean b) {
        if (!gej.h(fkk)) {
            return;
        }
        final int b2 = this.d.b();
        int n;
        if (b) {
            n = this.i.d(fkk, b2, super.a);
        }
        else {
            final zed i = this.i;
            final tpn a = super.a;
            agot.u(gej.h(fkk));
            if (!((sin)i.e).a && fkk.c() && !fkk.h()) {
                n = gej.i(b2, i.j(b2, a));
            }
            else {
                n = i.d(fkk, b2, a);
            }
        }
        this.h(n);
    }
    
    private final void q(final int n) {
        if (this.h.cH()) {
            return;
        }
        if (n != 1) {
            if (n != 2) {
                return;
            }
            this.k.b();
        }
        else {
            if (this.n) {
                this.k.d();
                return;
            }
            this.k.c();
        }
    }
    
    public final void a() {
        this.e.disable();
        final ghl d = this.d;
        d.e = null;
        d.b.removeCallbacks(d.c);
        if (!this.h.cH()) {
            this.j.n(this);
        }
        final asic g = this.g;
        if (g != null && !g.tx()) {
            athh.f((AtomicReference)this.g);
        }
    }
    
    public final void b() {
        if (this.h.cH()) {
            return;
        }
        this.n(this.j.j(), true);
    }
    
    public final void c() {
        this.e.enable();
        this.i();
        if (!this.h.cH()) {
            this.j.l(this);
        }
    }
    
    public final boolean d() {
        return this.l(false);
    }
    
    public final void e(final int n) {
        this.d.a.b.d(n);
    }
    
    public final void f(final int n, final int n2) {
        if (this.h.cH()) {
            return;
        }
        this.n(this.j.j(), false);
    }
    
    public final void g(int n) {
        if (this.h.cH()) {
            return;
        }
        final fkk j = this.j.j();
        if (!gej.h(j)) {
            return;
        }
        final zed i = this.i;
        agot.u(gej.h(j));
        final boolean f = gej.f(n);
        final int n2 = 1;
        agot.u(f || gej.e(n));
        if (!((sin)i.e).a && j.c() && j.b() && !i.i(n)) {
            n = n2;
        }
        else {
            n = 0;
        }
        this.q(n);
    }
    
    public final void h(final int n) {
        final ghl d = this.d;
        final Integer e = d.e;
        if (e != null && e == n) {
            return;
        }
        d.b.removeCallbacks(d.c);
        d.c(n);
    }
    
    public final void i() {
        final fkk j = this.j.j();
        final zed i = this.i;
        final int b = this.d.b();
        final tpn a = super.a;
        int n = 0;
        Label_0239: {
            if (!j.h() && !j.f()) {
                if (!j.e()) {
                    fkk fkk;
                    if (j == fkk.g) {
                        fkk = fkk.d;
                    }
                    else if (j == fkk.h) {
                        fkk = fkk.c;
                    }
                    else if (j == fkk.i) {
                        fkk = fkk.e;
                    }
                    else {
                        fkk = j;
                    }
                    if (fkk == fkk.d && !i.h(b, a)) {
                        n = 2;
                        break Label_0239;
                    }
                    if (fkk.b()) {
                        final boolean g = i.g(b);
                        final int n2 = 1;
                        if (!g) {
                            n = n2;
                            break Label_0239;
                        }
                        final fkk e = fkk.e;
                        int n3 = b;
                        if (fkk == e && (n3 = b) == 2) {
                            if (a instanceof tpq) {
                                n = n2;
                                break Label_0239;
                            }
                            n3 = 2;
                        }
                        if (i.a && fkk == e && n3 == 1 && !((sin)i.e).a) {
                            n = n2;
                            break Label_0239;
                        }
                    }
                }
            }
            n = 0;
        }
        if (!j.c() && n == 2) {
            this.l.J(3, (wxz)new wws(wya.c(54318)), (alff)null);
        }
        this.q(n);
        if (n == 0) {
            this.n(j, false);
        }
    }
    
    public final void j(final Configuration configuration) {
        if (this.h.cH()) {
            return;
        }
        final ghl d = this.d;
        d.d = true;
        d.j(configuration);
        if (super.a instanceof tpr) {
            this.i();
        }
        else {
            final asic g = this.g;
            if (g != null && !g.tx()) {
                athh.f((AtomicReference)this.g);
            }
            this.g = this.m.al((asix)new gag(this, 20));
        }
        this.d.d = false;
    }
    
    public final boolean k(final boolean b) {
        final zed i = this.i;
        int n;
        if (b) {
            n = this.d.a();
        }
        else {
            n = this.d.b();
        }
        return i.g(n);
    }
    
    public final boolean l(final boolean b) {
        final zed i = this.i;
        int n;
        if (b) {
            n = this.d.a();
        }
        else {
            n = this.d.b();
        }
        return i.h(n, super.a);
    }
    
    public final boolean m(final fkk fkk) {
        if (!gej.h(fkk)) {
            return false;
        }
        final zed i = this.i;
        final int b = this.d.b();
        final int d = i.d(fkk, b, super.a);
        if (d != 2 && d != 3) {
            if (d == 4 || d == 5) {
                if (!gej.e(b)) {
                    return true;
                }
            }
        }
        else if (!gej.f(b)) {
            return true;
        }
        return false;
    }
    
    public final void oK(final fkk fkk) {
        if (this.h.cH()) {
            return;
        }
        this.n(fkk, true);
    }
}
