import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acke extends acjg
{
    public final List a;
    
    public acke() {
        this.a = new ArrayList();
    }
    
    private final void B(final int n, final acjn acjn, final boolean b) {
        tbi.f();
        final ackd ackd = new ackd(this, acjn);
        ackd.a.qP((acjm)ackd);
        this.a.add(n, ackd);
        this.s();
        if (b && !ackd.a.isEmpty()) {
            this.x(ackd.b, ackd.a.a());
        }
    }
    
    public final int a() {
        if (this.a.isEmpty()) {
            return 0;
        }
        final List a = this.a;
        return ((ackd)a.get(a.size() - 1)).g();
    }
    
    public final long b(final int n) {
        final ackd l = this.l(n);
        if (l == null) {
            return 0L;
        }
        return l.a.b(l.f(n));
    }
    
    public final Object c(final int n) {
        final ackd l = this.l(n);
        if (l == null) {
            return null;
        }
        return l.a.c(l.f(n));
    }
    
    public final boolean contains(final Object o) {
        throw null;
    }
    
    public final int h() {
        return this.a.size();
    }
    
    public final int i(final acjn acjn) {
        if (acjn != null && !this.a.isEmpty()) {
            for (int i = 0; i < this.a.size(); ++i) {
                if (((ackd)this.a.get(i)).a == acjn) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public final boolean isEmpty() {
        return this.a() == 0;
    }
    
    public final int j(final acjn acjn) {
        for (final ackd ackd : this.a) {
            if (ackd.a == acjn) {
                return ackd.b;
            }
        }
        return -1;
    }
    
    public final ackd k(final int n) {
        if (n >= 0 && n < this.a.size()) {
            return this.a.get(n);
        }
        return null;
    }
    
    public final ackd l(final int n) {
        if (n >= 0) {
            if (n < this.a()) {
                int n2 = this.a.size() - 1;
                int i = 0;
                while (i <= n2) {
                    final List a = this.a;
                    final int n3 = i + n2 >> 1;
                    final ackd ackd = a.get(n3);
                    if (n < ackd.b) {
                        n2 = n3 - 1;
                    }
                    else {
                        if (n < ackd.g()) {
                            return ackd;
                        }
                        i = n3 + 1;
                    }
                }
            }
        }
        return null;
    }
    
    public final void m(final acjn acjn) {
        this.n(-1, acjn);
    }
    
    public final void n(final int n, final acjn acjn) {
        int size = n;
        if (n == -1) {
            size = this.a.size();
        }
        this.B(size, acjn, true);
    }
    
    public final void o(final acjn acjn) {
        this.n(0, acjn);
    }
    
    public final void oo(final ackm ackm, final int n) {
        super.oo(ackm, n);
        final ackd l = this.l(n);
        if (l != null) {
            l.a.oo(ackm, l.f(n));
        }
    }
    
    public final void p(final int n) {
        tbi.f();
        final ackd ackd = this.a.get(n);
        ackd.a.g((acjm)ackd);
        this.a.remove(n);
    }
    
    public final void q(final acjn acjn) {
        tbi.f();
        int size = this.a.size();
        ackd ackd;
        int n;
        do {
            n = size - 1;
            if (n < 0) {
                return;
            }
            ackd = (ackd)this.a.get(n);
            size = n;
        } while (ackd.a != acjn);
        this.p(n);
        this.s();
        if (!ackd.a.isEmpty()) {
            this.y(ackd.b, ackd.a.a());
        }
    }
    
    public final void r(final acjn acjn, final acjn acjn2) {
        tbi.f();
        for (int i = 0; i < this.a.size(); ++i) {
            final ackd ackd = this.a.get(i);
            if (ackd.a == acjn) {
                this.p(i);
                this.B(i, acjn2, false);
                this.s();
                if (!ackd.a.isEmpty()) {
                    final ackd ackd2 = this.a.get(i);
                    final int a = ackd2.a.a();
                    final int a2 = ackd.a.a();
                    this.w(ackd.b, Math.min(a2, a));
                    if (a > a2) {
                        this.x(ackd.b + a2, a - a2);
                        return;
                    }
                    if (a2 > a) {
                        this.y(ackd2.b + a, a2 - a);
                    }
                }
                else {
                    final int a3 = this.a.get(i).a.a();
                    if (a3 > 0) {
                        this.x(ackd.b, a3);
                    }
                }
                return;
            }
        }
    }
    
    public final void s() {
        final Iterator iterator = this.a.iterator();
        int g = 0;
        while (iterator.hasNext()) {
            final ackd ackd = (ackd)iterator.next();
            ackd.b = g;
            g = ackd.g();
        }
    }
    
    public final void t() {
        tbi.f();
        if (this.a.isEmpty()) {
            return;
        }
        final int a = this.a();
        int size = this.a.size();
        while (--size >= 0) {
            this.p(size);
        }
        if (a > 0) {
            this.y(0, a);
        }
    }
}
