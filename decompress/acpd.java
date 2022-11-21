import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acpd implements acmc, thj
{
    public final acrr a;
    public acrp b;
    public final acrr c;
    public acrp d;
    final acpf e;
    
    public acpd(final acpf e, final acrr a, final acrr c) {
        this.e = e;
        this.a = a;
        this.c = c;
    }
    
    private final acrp i(final acqf acqf) {
        final acpf e = this.e;
        return aamz.u(acqf, e.I, (View$OnClickListener)e, (acrq)e);
    }
    
    private final void j() {
        final acrr c = this.c;
        if (c == null) {
            return;
        }
        this.d = null;
        this.e.f.q(c);
    }
    
    private static final boolean k(final acqf acqf, final acbj acbj) {
        if (acqf instanceof acpz) {
            return ((acpz)acqf).a() == acbj;
        }
        if (acqf instanceof acqe) {
            final acqe acqe = (acqe)acqf;
            return acqe.b().h() && ((acbk)acqe.b().c()).a() == acbj;
        }
        if (acqf instanceof acqd) {
            final acbk b = ((acqd)acqf).b();
            if (b != null && b.a() == acbj) {
                return true;
            }
        }
        return false;
    }
    
    public final void a(final acbk acbk) {
        if (this.a == null) {
            return;
        }
        amls amls;
        if ((amls = this.e.v.f().f) == null) {
            amls = amls.a;
        }
        final boolean f = amls.f;
        boolean b = false;
        boolean b2 = false;
        Label_0203: {
            Label_0201: {
                if (f) {
                    if (this.b != null) {
                        break Label_0201;
                    }
                    if (acbk == null) {
                        if (this.e.al(acbj.b)) {
                            break Label_0201;
                        }
                    }
                    else if (((acbm)acbk).b == acbj.b) {
                        break Label_0201;
                    }
                    if (this.e.h.isEmpty() && ((acbk != null) ? (((acbm)acbk).b == acbj.d) : this.e.al(acbj.d))) {
                        break Label_0201;
                    }
                }
                else {
                    if (this.b != null || this.e.al(acbj.b)) {
                        break Label_0201;
                    }
                    if (this.e.h.isEmpty() && this.e.al(acbj.d)) {
                        break Label_0201;
                    }
                }
                b2 = false;
                break Label_0203;
            }
            b2 = true;
        }
        if (this.e.f.i(this.a) != -1) {
            b = true;
        }
        if (b2 != b) {
            if (b2) {
                final acpf e = this.e;
                e.f.n(e.q(), this.a);
                if (this.e.al(acbj.b)) {
                    if (this.b == null) {
                        this.b = this.i(acqe.a());
                    }
                    this.d(this.b.a);
                }
            }
            else {
                this.e.f.q(this.a);
            }
        }
    }
    
    public final void b() {
        final acrr a = this.a;
        if (a == null) {
            return;
        }
        if (this.b == null) {
            a.q(this.b = this.i(acqe.a()));
        }
        final acpf e = this.e;
        e.f.n(e.q(), this.a);
    }
    
    public final void c() {
        final acrr a = this.a;
        if (a == null) {
            return;
        }
        this.b = null;
        this.e.f.q(a);
    }
    
    public final void d(final acqf acqf) {
        final acrr a = this.a;
        if (a == null) {
            return;
        }
        final acrp b = this.b;
        if (b == null) {
            this.b = this.i(acqf);
        }
        else if (b.a != acqf) {
            this.b = b.a(acqf);
        }
        if (acqf instanceof acpz) {
            if (this.e.al(acbj.b)) {
                final acrp a2 = this.b.a((acqf)acqe.a());
                this.b = a2;
                this.a.q(a2);
                if (this.e.f.i(this.a) == -1) {
                    this.b();
                }
            }
            else {
                this.a.q(null);
                if (this.e.f.i(this.a) != -1) {
                    this.c();
                }
            }
            return;
        }
        a.q(this.b);
    }
    
    public final void f(final acqf acqf) {
        final acrr c = this.c;
        if (c == null) {
            return;
        }
        final acrp d = this.d;
        acrp d2;
        if (d == null) {
            d2 = this.i(acqf);
        }
        else {
            d2 = d;
            if (d.a != acqf) {
                d2 = d.a(acqf);
            }
        }
        this.d = d2;
        if (acqf instanceof acpz) {
            if (this.e.al(acbj.c)) {
                final acrp a = d2.a((acqf)acqe.a());
                this.d = a;
                this.c.q(a);
                if (this.e.f.i(this.c) == -1) {
                    final acrr c2 = this.c;
                    if (c2 != null) {
                        if (this.d == null) {
                            c2.q(this.d = this.i(acqe.a()));
                        }
                        final acpf e = this.e;
                        final aclr f = e.f;
                        final acrr c3 = e.j.c;
                        int i;
                        if (c3 != null) {
                            i = f.i(c3);
                        }
                        else {
                            i = -1;
                        }
                        final acla m = e.m;
                        int j;
                        if (m != null) {
                            j = e.f.i(m);
                        }
                        else {
                            j = 0;
                        }
                        int n = i;
                        if (i == -1) {
                            n = j;
                        }
                        f.n(n, this.c);
                    }
                }
            }
            else {
                this.c.q(null);
                if (this.e.f.i(this.c) != -1) {
                    this.j();
                }
            }
            return;
        }
        c.q(d2);
    }
    
    public final void g(final Object o, final Object o2) {
        this.h();
        if (o != null) {
            this.e.i.i((Object)this, o);
            if (o2 != null && o2 != o) {
                this.e.i.i((Object)this, o2);
            }
            return;
        }
        this.e.i.g((Object)this);
    }
    
    public final void h() {
        this.e.i.m((Object)this);
    }
    
    public final Class[] mr(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        final StringBuilder sb = new StringBuilder("unsupported op code: ");
                        sb.append(n);
                        throw new IllegalStateException(sb.toString());
                    }
                    final acqe acqe = (acqe)o;
                    if (this.e.k(acqe)) {
                        if (this.c != null && k(acqe, acbj.c)) {
                            this.j();
                        }
                        else {
                            this.d(acqe);
                        }
                    }
                }
                else {
                    final acqd acqd = (acqd)o;
                    this.e.S();
                    if (this.c != null && k(acqd, acbj.c)) {
                        this.f(acqd);
                    }
                    else {
                        this.d(acqd);
                    }
                }
            }
            else {
                final acpz acpz = (acpz)o;
                this.e.S();
                if (this.c == null || !k(acpz, acbj.c)) {
                    this.d(acpz);
                }
                if (!k(acpz, acbj.b)) {
                    this.f(acpz);
                    return null;
                }
            }
        }
        else {
            array = new Class[] { acpz.class, acqd.class, acqe.class };
        }
        return array;
    }
    
    @Override
    public final void r(final acmb acmb, final Object o) {
        if (o == this.b) {
            this.e.E();
            return;
        }
        final acrp d = this.d;
        if (o == d && d != null) {
            final acpf e = this.e;
            final acbk x = e.X(acbj.c);
            if (e.q != x) {
                e.lL(acbj.c);
                e.q = x;
            }
        }
    }
}
