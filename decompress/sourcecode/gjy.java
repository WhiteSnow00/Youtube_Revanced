import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjy extends hw
{
    public final List a;
    public int b;
    public int c;
    public qpt d;
    private final nq e;
    private final gjw f;
    private final boolean g;
    
    public gjy(final nq e, final gjw f) {
        this.e = e;
        this.f = f;
        this.g = e.c;
        this.a = new ArrayList();
        e.v((hw)this);
        this.p();
    }
    
    private final long r(final int n) {
        long n2;
        if (this.g) {
            n2 = this.e.mR(n);
        }
        else {
            n2 = this.f.b(n);
        }
        return n2;
    }
    
    private final void s(final int n) {
        this.a.remove(n);
    }
    
    private final void t(int i, final int n) {
        while (i < this.a.size()) {
            final gjx gjx = this.a.get(i);
            gjx.b += n;
            ++i;
        }
    }
    
    private final void u(final int n, int max) {
        final int n2 = max + n - 1;
        final int i = this.i(n2);
        int v;
        if (i == this.a.size()) {
            if (this.a.isEmpty()) {
                max = n;
            }
            else {
                max = Math.max(n, ((gjx)this.a.get(i - 1)).b + 1);
            }
            v = (this.v(i, max, n2) ? 1 : 0);
            max = i - 1;
        }
        else {
            v = 0;
            max = i;
        }
        int n3 = v;
        if (max >= 0) {
            n3 = v;
            if (max < this.a.size()) {
                gjx gjx = this.a.get(max);
                boolean b2;
                while (true) {
                    final int b = gjx.b;
                    b2 = (v != 0);
                    if (b < n) {
                        break;
                    }
                    int n4 = v;
                    if (b <= n2) {
                        final int a = this.f.a(b);
                        Label_0211: {
                            if (fah.q(a)) {
                                this.s(max);
                            }
                            else {
                                if (a == gjx.a) {
                                    break Label_0211;
                                }
                                gjx.a = a;
                            }
                            v = 1;
                        }
                        n4 = v;
                        if (max > 0) {
                            n4 = (v | (this.v(max, Math.max(n, this.a.get(max - 1).b + 1), gjx.b - 1) ? 1 : 0));
                        }
                    }
                    b2 = (n4 != 0);
                    if (max <= 0) {
                        break;
                    }
                    --max;
                    gjx = this.a.get(max);
                    v = n4;
                }
                final int b3 = gjx.b;
                n3 = (b2 ? 1 : 0);
                if (n < b3) {
                    n3 = ((b2 | this.v(max, n, Math.min(n2, b3 - 1))) ? 1 : 0);
                }
            }
        }
        if (n3 != 0) {
            final qpt d = this.d;
            if (d != null) {
                d.M();
            }
        }
    }
    
    private final boolean v(final int n, final int n2, int i) {
        boolean b = false;
        while (i >= n2) {
            final int a = this.f.a(i);
            if (!fah.q(a)) {
                this.a.add(n, new gjx(a, i, this.r(i)));
                b = true;
            }
            --i;
        }
        return b;
    }
    
    public final void c() {
        this.o();
    }
    
    public final void d(final int n, final int n2) {
        this.u(n, n2);
    }
    
    public final void e(final int n, final int n2, final Object o) {
        this.u(n, n2);
    }
    
    public final void f(final int n, final int n2) {
        final int i = this.i(n);
        boolean b;
        if (i < this.a.size()) {
            this.t(i, n2);
            b = true;
        }
        else {
            b = false;
        }
        if (!this.v(i, n, n2 + n - 1)) {
            if (!b) {
                return;
            }
        }
        final qpt d = this.d;
        if (d != null) {
            d.M();
        }
    }
    
    public final void g(final int n, final int n2) {
        final int i = this.i(n);
        final int size = this.a.size();
        while (i < this.a.size()) {
            final int b = this.a.get(i).b;
            if (b < n || b >= n + n2) {
                break;
            }
            this.s(i);
        }
        if (i < size) {
            this.t(i, -n2);
            final qpt d = this.d;
            if (d != null) {
                d.M();
            }
        }
    }
    
    public final int i(int binarySearch) {
        binarySearch = Collections.binarySearch(this.a, new gjx(0, binarySearch, Long.MAX_VALUE));
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return -(binarySearch + 1);
    }
    
    final int j() {
        final int b = this.b;
        if (b == -1) {
            return 0;
        }
        return ((gjx)this.a.get(b)).a;
    }
    
    final int k() {
        if (!this.a.isEmpty()) {
            return this.a.get(0).b;
        }
        return -1;
    }
    
    final int l() {
        int b = this.b;
        if (b == -1) {
            if (!this.a.isEmpty()) {
                return this.a.get(0).a;
            }
            return 0;
        }
        else {
            if (++b < this.a.size()) {
                return ((gjx)this.a.get(b)).a;
            }
            return -1;
        }
    }
    
    final int m() {
        int b = this.b;
        if (b == -1) {
            return this.k();
        }
        if (++b < this.a.size()) {
            return ((gjx)this.a.get(b)).b;
        }
        return -1;
    }
    
    final long n() {
        final int b = this.b;
        if (b == -1) {
            return Long.MAX_VALUE;
        }
        return ((gjx)this.a.get(b)).c;
    }
    
    public final void o() {
        this.a.clear();
        for (int i = 0; i < this.e.a(); ++i) {
            final int a = this.f.a(i);
            if (!fah.q(a)) {
                this.a.add(new gjx(a, i, this.r(i)));
            }
        }
        final qpt d = this.d;
        if (d != null) {
            d.M();
        }
    }
    
    public final void p() {
        this.b = -1;
        this.c = -1;
    }
    
    final boolean q() {
        return !this.a.isEmpty();
    }
}