// 
// Decompiled by Procyon v0.6.0
// 

final class aqwv implements aqwl
{
    private final aqwl a;
    private final long b;
    private final long c;
    private long d;
    private long e;
    
    public aqwv(final aqwl a, final int n) {
        final boolean b = true;
        adkp.I(n > 0, (Object)"Chunk granularity must be greater than 0.");
        final long n2 = n;
        adkp.I(n2 < a.d(), (Object)"Chunk granularity must be smaller than the read ahead limit.");
        final long e = a.e();
        final long a2 = a.a();
        long e2;
        if (a2 < 0L) {
            while (a.i() && a.e() - a.c() < a.d()) {
                a.f(a.d());
            }
            e2 = a.e();
            a.h();
            a.f(e - a.c());
        }
        else {
            final long n3 = a.c() + a.d();
            e2 = a2;
            if (n3 > 0L) {
                e2 = a2;
                if (n3 < a2) {
                    e2 = n3;
                }
            }
        }
        final long c = (e2 - e) / n2 * n2;
        if (a.d() < Long.MAX_VALUE) {
            adkp.H(c <= a.d() - (a.e() - a.c()) && b);
        }
        this.a = a;
        this.b = a.e();
        this.c = c;
    }
    
    public final long a() {
        synchronized (this) {
            return this.c;
        }
    }
    
    public final int b(final byte[] array, int b, int n) {
        monitorenter(this);
        try {
            adkp.I(array.length - b >= n, (Object)"Cannot read into a buffer smaller than given length");
            n = (int)Math.min(n, this.c - this.d);
            if (this.b + this.d != this.a.e()) {
                this.a.h();
                for (long n2 = this.b - this.a.c() + this.d; n2 > 0L; n2 -= this.a.f(n2)) {}
            }
            b = this.a.b(array, b, n);
            this.d += b;
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final long c() {
        synchronized (this) {
            return this.e;
        }
    }
    
    public final void close() {
        synchronized (this) {
            this.a.close();
        }
    }
    
    public final long d() {
        monitorenter(this);
        monitorexit(this);
        return Long.MAX_VALUE;
    }
    
    public final long e() {
        synchronized (this) {
            return this.d;
        }
    }
    
    public final long f(long f) {
        monitorenter(this);
        try {
            final long min = Math.min(f, this.c - this.d);
            if (this.b + this.d != this.a.e()) {
                this.a.h();
                for (f = this.b - this.a.c() + this.d; f > 0L; f -= this.a.f(f)) {}
            }
            f = this.a.f(min);
            this.d += f;
            monitorexit(this);
            return f;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void g() {
        synchronized (this) {
            this.e = this.d;
        }
    }
    
    public final void h() {
        synchronized (this) {
            this.d = this.e;
        }
    }
    
    public final boolean i() {
        synchronized (this) {
            final long d = this.d;
            final long c = this.c;
            monitorexit(this);
            return d < c;
        }
    }
}
