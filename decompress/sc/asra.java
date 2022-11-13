// 
// Decompiled by Procyon v0.6.0
// 

final class asra extends asqy implements ashl
{
    private static final long serialVersionUID = -4547113800637756442L;
    final aukf m;
    
    public asra(final aukf m, final asic asic, final int n) {
        super(asic, n);
        this.m = m;
    }
    
    public final void d() {
        final aukf m = this.m;
        final askt f = this.f;
        long k = this.k;
        int addAndGet = 1;
        while (true) {
            long value = this.d.get();
            while (k != value) {
                final boolean h = this.h;
                try {
                    final Object tw = f.tw();
                    final boolean b = tw == null;
                    if (this.l(h, b, m)) {
                        return;
                    }
                    if (!b) {
                        m.tu(tw);
                        final long n = ++k;
                        if (n == this.c) {
                            long addAndGet2 = value;
                            if (value != Long.MAX_VALUE) {
                                addAndGet2 = this.d.addAndGet(-n);
                            }
                            this.e.e(n);
                            k = 0L;
                            value = addAndGet2;
                            continue;
                        }
                        continue;
                    }
                }
                finally {
                    final Throwable t;
                    asgz.c(t);
                    this.g = true;
                    this.e.tt();
                    f.c();
                    m.b(t);
                    this.a.dispose();
                    return;
                }
                break;
            }
            if (k == value && this.l(this.h, f.i(), m)) {
                return;
            }
            final int value2 = this.get();
            if (addAndGet == value2) {
                this.k = k;
                addAndGet = this.addAndGet(-addAndGet);
                if (addAndGet != 0) {
                    continue;
                }
            }
            else {
                addAndGet = value2;
            }
        }
    }
    
    public final void f(final aukg e) {
        if (athz.i(this.e, e)) {
            this.e = e;
            if (e instanceof askq) {
                final askq askq = (askq)e;
                final int tv = askq.tv(7);
                if (tv == 1) {
                    this.j = 1;
                    this.f = (askt)askq;
                    this.h = true;
                    this.m.f((aukg)this);
                    return;
                }
                if (tv == 2) {
                    this.j = 2;
                    this.f = (askt)askq;
                    this.m.f((aukg)this);
                    e.e((long)this.b);
                    return;
                }
            }
            this.f = (askt)new atgg(this.b);
            this.m.f((aukg)this);
            e.e((long)this.b);
        }
    }
    
    public final void g() {
        int addAndGet = 1;
        while (!this.g) {
            final boolean h = this.h;
            this.m.tu((Object)null);
            if (h) {
                this.g = true;
                final Throwable i = this.i;
                if (i != null) {
                    this.m.b(i);
                }
                else {
                    this.m.tx();
                }
                this.a.dispose();
                return;
            }
            if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                return;
            }
        }
    }
    
    public final void h() {
        final aukf m = this.m;
        final askt f = this.f;
        long k = this.k;
        int addAndGet = 1;
        while (true) {
            while (k != this.d.get()) {
                try {
                    final Object tw = f.tw();
                    if (this.g) {
                        return;
                    }
                    if (tw == null) {
                        this.g = true;
                        m.tx();
                        this.a.dispose();
                        return;
                    }
                    m.tu(tw);
                    ++k;
                    continue;
                }
                finally {
                    final Throwable t;
                    asgz.c(t);
                    this.g = true;
                    this.e.tt();
                    m.b(t);
                    this.a.dispose();
                    return;
                }
                break;
            }
            if (this.g) {
                return;
            }
            if (f.i()) {
                this.g = true;
                m.tx();
                this.a.dispose();
                return;
            }
            final int value = this.get();
            if (addAndGet == value) {
                this.k = k;
                addAndGet = this.addAndGet(-addAndGet);
                if (addAndGet != 0) {
                    continue;
                }
            }
            else {
                addAndGet = value;
            }
        }
    }
    
    public final Object tw() {
        final Object tw = this.f.tw();
        if (tw != null && this.j != 1) {
            final long k = this.k + 1L;
            if (k == this.c) {
                this.k = 0L;
                this.e.e(k);
            }
            else {
                this.k = k;
            }
        }
        return tw;
    }
}
