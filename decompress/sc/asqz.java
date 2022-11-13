// 
// Decompiled by Procyon v0.6.0
// 

final class asqz extends asqy
{
    private static final long serialVersionUID = 644624475404284533L;
    final askl m;
    long n;
    
    public asqz(final askl m, final asic asic, final int n) {
        super(asic, n);
        this.m = m;
    }
    
    public final void d() {
        final askl m = this.m;
        final askt f = this.f;
        long k = this.k;
        long n = this.n;
        int addAndGet = 1;
        while (true) {
            final long value = this.d.get();
            while (k != value) {
                final boolean h = this.h;
                try {
                    final Object tw = f.tw();
                    final boolean b = tw == null;
                    if (this.l(h, b, (aukf)m)) {
                        return;
                    }
                    if (!b) {
                        long n2 = k;
                        if (m.d(tw)) {
                            n2 = k + 1L;
                        }
                        final long n3 = n + 1L;
                        k = n2;
                        n = n3;
                        if (n3 == this.c) {
                            this.e.e(n3);
                            n = 0L;
                            k = n2;
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
            if (k == value && this.l(this.h, f.i(), (aukf)m)) {
                return;
            }
            final int value2 = this.get();
            if (addAndGet == value2) {
                this.k = k;
                this.n = n;
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
        final askl m = this.m;
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
                    if (m.d(tw)) {
                        ++k;
                        continue;
                    }
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
            final long n = this.n + 1L;
            if (n == this.c) {
                this.n = 0L;
                this.e.e(n);
            }
            else {
                this.n = n;
            }
        }
        return tw;
    }
}
