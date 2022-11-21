import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aclr extends ackt
{
    public final List a;
    
    public aclr() {
        this.a = new ArrayList();
    }
    
    private final void B(final int n, final acla acla, final boolean b) {
        tcl.l();
        final aclq aclq = new aclq(this, acla);
        aclq.a.qO((ackz)aclq);
        this.a.add(n, aclq);
        this.s();
        if (b && !aclq.a.isEmpty()) {
            this.x(aclq.b, aclq.a.a());
        }
    }
    
    public final int a() {
        if (this.a.isEmpty()) {
            return 0;
        }
        final List a = this.a;
        return ((aclq)a.get(a.size() - 1)).g();
    }
    
    public final long b(final int n) {
        final aclq l = this.l(n);
        if (l == null) {
            return 0L;
        }
        return l.a.b(l.f(n));
    }
    
    public final Object c(final int n) {
        final aclq l = this.l(n);
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
    
    public final int i(final acla acla) {
        if (acla != null && !this.a.isEmpty()) {
            for (int i = 0; i < this.a.size(); ++i) {
                if (((aclq)this.a.get(i)).a == acla) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public final boolean isEmpty() {
        return this.a() == 0;
    }
    
    public final int j(final acla acla) {
        for (final aclq aclq : this.a) {
            if (aclq.a == acla) {
                return aclq.b;
            }
        }
        return -1;
    }
    
    public final aclq k(final int n) {
        if (n >= 0 && n < this.a.size()) {
            return this.a.get(n);
        }
        return null;
    }
    
    public final aclq l(final int n) {
        if (n >= 0) {
            if (n < this.a()) {
                int n2 = this.a.size() - 1;
                int i = 0;
                while (i <= n2) {
                    final List a = this.a;
                    final int n3 = i + n2 >> 1;
                    final aclq aclq = a.get(n3);
                    if (n < aclq.b) {
                        n2 = n3 - 1;
                    }
                    else {
                        if (n < aclq.g()) {
                            return aclq;
                        }
                        i = n3 + 1;
                    }
                }
            }
        }
        return null;
    }
    
    public final void m(final acla acla) {
        this.n(-1, acla);
    }
    
    public final void n(final int n, final acla acla) {
        int size = n;
        if (n == -1) {
            size = this.a.size();
        }
        this.B(size, acla, true);
    }
    
    public final void o(final acla acla) {
        this.n(0, acla);
    }
    
    public final void ok(final aclz aclz, final int n) {
        super.ok(aclz, n);
        final aclq l = this.l(n);
        if (l != null) {
            l.a.ok(aclz, l.f(n));
        }
    }
    
    public final void p(final int n) {
        tcl.l();
        final aclq aclq = this.a.get(n);
        aclq.a.g((ackz)aclq);
        this.a.remove(n);
    }
    
    public final void q(final acla acla) {
        tcl.l();
        int size = this.a.size();
        aclq aclq;
        int n;
        do {
            n = size - 1;
            if (n < 0) {
                return;
            }
            aclq = (aclq)this.a.get(n);
            size = n;
        } while (aclq.a != acla);
        this.p(n);
        this.s();
        if (!aclq.a.isEmpty()) {
            this.y(aclq.b, aclq.a.a());
        }
    }
    
    public final void r(final acla acla, final acla acla2) {
        tcl.l();
        for (int i = 0; i < this.a.size(); ++i) {
            final aclq aclq = this.a.get(i);
            if (aclq.a == acla) {
                this.p(i);
                this.B(i, acla2, false);
                this.s();
                if (!aclq.a.isEmpty()) {
                    final aclq aclq2 = this.a.get(i);
                    final int a = aclq2.a.a();
                    final int a2 = aclq.a.a();
                    this.w(aclq.b, Math.min(a2, a));
                    if (a > a2) {
                        this.x(aclq.b + a2, a - a2);
                        return;
                    }
                    if (a2 > a) {
                        this.y(aclq2.b + a, a2 - a);
                    }
                }
                else {
                    final int a3 = this.a.get(i).a.a();
                    if (a3 > 0) {
                        this.x(aclq.b, a3);
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
            final aclq aclq = (aclq)iterator.next();
            aclq.b = g;
            g = aclq.g();
        }
    }
    
    public final void t() {
        tcl.l();
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
