import android.content.res.Configuration;
import java.util.concurrent.atomic.AtomicReference;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ghv extends ghr implements fxv, fxu, gho, abtx, ghj, fju
{
    public final Activity b;
    public final fxw c;
    public final ghu d;
    public final tpz e;
    public final abty f;
    asir g;
    public final vai h;
    public final zfw i;
    private final fjv j;
    private final ghs k;
    private final wyw l;
    private final ashi m;
    private final boolean n;
    
    public ghv(final Activity b, final fxw c, final fjv j, final vaf vaf, final zfw i, final ghu d, final tpz e, final ghs k, final abty f, final wyw l, final jki jki, final vai h, final lhm lhm, final msr msr, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(b, i, jki, msr, null, null, null, null);
        this.b = b;
        this.c = c;
        this.i = i;
        this.d = d;
        this.e = e;
        this.f = f;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = (ashi)jki.b;
        this.h = h;
        this.n = lhm.a;
        alxp alxp;
        if ((alxp = vaf.b().e) == null) {
            alxp = alxp.a;
        }
        if (alxp.x) {
            i.e(1);
        }
    }
    
    private final void p(final fkr fkr, final boolean b) {
        if (!ger.h(fkr)) {
            return;
        }
        final int b2 = this.d.b();
        int n;
        if (b) {
            n = this.i.d(fkr, b2, super.a);
        }
        else {
            final zfw i = this.i;
            final trs a = super.a;
            adkp.H(ger.h(fkr));
            if (!((skt)i.e).a && fkr.c() && !fkr.h()) {
                n = ger.i(b2, i.j(b2, a));
            }
            else {
                n = i.d(fkr, b2, a);
            }
        }
        this.h(n);
    }
    
    private final void q(final int n) {
        if (this.h.cK()) {
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
    
    @Override
    public final void a() {
        this.e.disable();
        final ghu d = this.d;
        d.e = null;
        d.b.removeCallbacks(d.c);
        if (!this.h.cK()) {
            this.j.n(this);
        }
        final asir g = this.g;
        if (g != null && !g.tA()) {
            athz.f((AtomicReference)this.g);
        }
    }
    
    @Override
    public final void b() {
        if (this.h.cK()) {
            return;
        }
        this.p(this.j.j(), true);
    }
    
    @Override
    public final void c() {
        this.e.enable();
        this.i();
        if (!this.h.cK()) {
            this.j.l(this);
        }
    }
    
    @Override
    public final boolean d() {
        return this.l(false);
    }
    
    public final void e(final int n) {
        this.d.a.b.d(n);
    }
    
    public final void f(final int n, final int n2) {
        if (this.h.cK()) {
            return;
        }
        this.p(this.j.j(), false);
    }
    
    public final void g(int n) {
        if (this.h.cK()) {
            return;
        }
        final fkr j = this.j.j();
        if (!ger.h(j)) {
            return;
        }
        final zfw i = this.i;
        adkp.H(ger.h(j));
        final boolean f = ger.f(n);
        final int n2 = 1;
        adkp.H(f || ger.e(n));
        if (!((skt)i.e).a && j.c() && j.b() && !i.i(n)) {
            n = n2;
        }
        else {
            n = 0;
        }
        this.q(n);
    }
    
    public final void h(final int n) {
        final ghu d = this.d;
        final Integer e = d.e;
        if (e != null && e == n) {
            return;
        }
        d.b.removeCallbacks(d.c);
        d.c(n);
    }
    
    public final void i() {
        final fkr j = this.j.j();
        final zfw i = this.i;
        final int b = this.d.b();
        final trs a = super.a;
        int n = 0;
        Label_0239: {
            if (!j.h() && !j.f()) {
                if (!j.e()) {
                    fkr fkr;
                    if (j == fkr.g) {
                        fkr = fkr.d;
                    }
                    else if (j == fkr.h) {
                        fkr = fkr.c;
                    }
                    else if (j == fkr.i) {
                        fkr = fkr.e;
                    }
                    else {
                        fkr = j;
                    }
                    if (fkr == fkr.d && !i.h(b, a)) {
                        n = 2;
                        break Label_0239;
                    }
                    if (fkr.b()) {
                        final boolean g = i.g(b);
                        final int n2 = 1;
                        if (!g) {
                            n = n2;
                            break Label_0239;
                        }
                        final fkr e = fkr.e;
                        int n3 = b;
                        if (fkr == e && (n3 = b) == 2) {
                            if (a instanceof trv) {
                                n = n2;
                                break Label_0239;
                            }
                            n3 = 2;
                        }
                        if (i.a && fkr == e && n3 == 1 && !((skt)i.e).a) {
                            n = n2;
                            break Label_0239;
                        }
                    }
                }
            }
            n = 0;
        }
        if (!j.c() && n == 2) {
            this.l.J(3, (wzz)new wyt(xaa.c(54318)), (alhi)null);
        }
        this.q(n);
        if (n == 0) {
            this.p(j, false);
        }
    }
    
    @Override
    public final void j(final Configuration configuration) {
        if (this.h.cK()) {
            return;
        }
        final ghu d = this.d;
        d.d = true;
        d.j(configuration);
        if (super.a instanceof trw) {
            this.i();
        }
        else {
            final asir g = this.g;
            if (g != null && !g.tA()) {
                athz.f((AtomicReference)this.g);
            }
            this.g = this.m.am((asjm)new ghy(this, 1));
        }
        this.d.d = false;
    }
    
    public final boolean k(final boolean b) {
        final zfw i = this.i;
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
        final zfw i = this.i;
        int n;
        if (b) {
            n = this.d.a();
        }
        else {
            n = this.d.b();
        }
        return i.h(n, super.a);
    }
    
    public final boolean m(final fkr fkr) {
        if (!ger.h(fkr)) {
            return false;
        }
        final zfw i = this.i;
        final int b = this.d.b();
        final int d = i.d(fkr, b, super.a);
        if (d != 2 && d != 3) {
            if (d == 4 || d == 5) {
                if (!ger.e(b)) {
                    return true;
                }
            }
        }
        else if (!ger.f(b)) {
            return true;
        }
        return false;
    }
    
    public final void n(final fkr fkr) {
        if (this.h.cK()) {
            return;
        }
        this.p(fkr, true);
    }
    
    public final void oK(final fkr fkr, final fkr fkr2) {
        fal.b((fju)this, fkr2);
    }
}
