import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acib extends achd
{
    public final List a;
    
    public acib() {
        this.a = new ArrayList();
    }
    
    private final void B(final int n, final achk achk, final boolean b) {
        szc.f();
        final acia acia = new acia(this, achk);
        acia.a.qK((achj)acia);
        this.a.add(n, acia);
        this.s();
        if (b && !acia.a.isEmpty()) {
            this.x(acia.b, acia.a.a());
        }
    }
    
    public final int a() {
        if (this.a.isEmpty()) {
            return 0;
        }
        final List a = this.a;
        return ((acia)a.get(a.size() - 1)).g();
    }
    
    public final long b(final int n) {
        final acia l = this.l(n);
        if (l == null) {
            return 0L;
        }
        return l.a.b(l.f(n));
    }
    
    public final Object c(final int n) {
        final acia l = this.l(n);
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
    
    public final int i(final achk achk) {
        if (achk != null && !this.a.isEmpty()) {
            for (int i = 0; i < this.a.size(); ++i) {
                if (((acia)this.a.get(i)).a == achk) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public final boolean isEmpty() {
        return this.a() == 0;
    }
    
    public final int j(final achk achk) {
        for (final acia acia : this.a) {
            if (acia.a == achk) {
                return acia.b;
            }
        }
        return -1;
    }
    
    public final acia k(final int n) {
        if (n >= 0 && n < this.a.size()) {
            return this.a.get(n);
        }
        return null;
    }
    
    public final acia l(final int n) {
        if (n >= 0) {
            if (n < this.a()) {
                int n2 = this.a.size() - 1;
                int i = 0;
                while (i <= n2) {
                    final int n3 = i + n2 >> 1;
                    final acia acia = this.a.get(n3);
                    if (n < acia.b) {
                        n2 = n3 - 1;
                    }
                    else {
                        if (n < acia.g()) {
                            return acia;
                        }
                        i = n3 + 1;
                    }
                }
            }
        }
        return null;
    }
    
    public final void m(final achk achk) {
        this.n(-1, achk);
    }
    
    public final void n(final int n, final achk achk) {
        int size = n;
        if (n == -1) {
            size = this.a.size();
        }
        this.B(size, achk, true);
    }
    
    public final void o(final achk achk) {
        this.n(0, achk);
    }
    
    public final void oo(final acij acij, final int n) {
        super.oo(acij, n);
        final acia l = this.l(n);
        if (l != null) {
            l.a.oo(acij, l.f(n));
        }
    }
    
    public final void p(final int n) {
        szc.f();
        final acia acia = this.a.get(n);
        acia.a.g((achj)acia);
        this.a.remove(n);
    }
    
    public final void q(final achk achk) {
        szc.f();
        int size = this.a.size();
        acia acia;
        int n;
        do {
            n = size - 1;
            if (n < 0) {
                return;
            }
            acia = (acia)this.a.get(n);
            size = n;
        } while (acia.a != achk);
        this.p(n);
        this.s();
        if (!acia.a.isEmpty()) {
            this.y(acia.b, acia.a.a());
        }
    }
    
    public final void r(final achk achk, final achk achk2) {
        szc.f();
        for (int i = 0; i < this.a.size(); ++i) {
            final acia acia = this.a.get(i);
            if (acia.a == achk) {
                this.p(i);
                this.B(i, achk2, false);
                this.s();
                if (!acia.a.isEmpty()) {
                    final acia acia2 = this.a.get(i);
                    final int a = acia2.a.a();
                    final int a2 = acia.a.a();
                    this.w(acia.b, Math.min(a2, a));
                    if (a > a2) {
                        this.x(acia.b + a2, a - a2);
                        return;
                    }
                    if (a2 > a) {
                        this.y(acia2.b + a, a2 - a);
                    }
                }
                else {
                    final int a3 = this.a.get(i).a.a();
                    if (a3 > 0) {
                        this.x(acia.b, a3);
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
            final acia acia = (acia)iterator.next();
            acia.b = g;
            g = acia.g();
        }
    }
    
    public final void t() {
        szc.f();
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
