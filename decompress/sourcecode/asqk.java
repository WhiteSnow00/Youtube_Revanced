// 
// Decompiled by Procyon v0.6.0
// 

final class asqk extends asqj
{
    private static final long serialVersionUID = 644624475404284533L;
    final asjw m;
    long n;
    
    public asqk(final asjw m, final ashn ashn, final int n) {
        super(ashn, n);
        this.m = m;
    }
    
    public final void d() {
        final asjw m = this.m;
        final aske f = this.f;
        long k = this.k;
        long n = this.n;
        int addAndGet = 1;
        while (true) {
            final long value = this.d.get();
            while (k != value) {
                final boolean h = this.h;
                try {
                    final Object tt = f.tt();
                    final boolean b = tt == null;
                    if (this.l(h, b, (aujp)m)) {
                        return;
                    }
                    if (!b) {
                        long n2 = k;
                        if (m.d(tt)) {
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
                    asey.d(t);
                    this.g = true;
                    this.e.tq();
                    f.c();
                    m.b(t);
                    this.a.dispose();
                    return;
                }
                break;
            }
            if (k == value && this.l(this.h, f.i(), (aujp)m)) {
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
    
    public final void f(final aujq e) {
        if (athh.i(this.e, e)) {
            this.e = e;
            if (e instanceof askb) {
                final askb askb = (askb)e;
                final int ts = askb.ts(7);
                if (ts == 1) {
                    this.j = 1;
                    this.f = (aske)askb;
                    this.h = true;
                    this.m.f((aujq)this);
                    return;
                }
                if (ts == 2) {
                    this.j = 2;
                    this.f = (aske)askb;
                    this.m.f((aujq)this);
                    e.e((long)this.b);
                    return;
                }
            }
            this.f = (aske)new atfo(this.b);
            this.m.f((aujq)this);
            e.e((long)this.b);
        }
    }
    
    public final void g() {
        int addAndGet = 1;
        while (!this.g) {
            final boolean h = this.h;
            this.m.tr((Object)null);
            if (h) {
                this.g = true;
                final Throwable i = this.i;
                if (i != null) {
                    this.m.b(i);
                }
                else {
                    this.m.tu();
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
        final asjw m = this.m;
        final aske f = this.f;
        long k = this.k;
        int addAndGet = 1;
        while (true) {
            while (k != this.d.get()) {
                try {
                    final Object tt = f.tt();
                    if (this.g) {
                        return;
                    }
                    if (tt == null) {
                        this.g = true;
                        m.tu();
                        this.a.dispose();
                        return;
                    }
                    if (m.d(tt)) {
                        ++k;
                        continue;
                    }
                    continue;
                }
                finally {
                    asey.d((Throwable)f);
                    this.g = true;
                    this.e.tq();
                    m.b((Throwable)f);
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
                m.tu();
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
    
    public final Object tt() {
        final Object tt = this.f.tt();
        if (tt != null && this.j != 1) {
            final long n = this.n + 1L;
            if (n == this.c) {
                this.n = 0L;
                this.e.e(n);
            }
            else {
                this.n = n;
            }
        }
        return tt;
    }
}
