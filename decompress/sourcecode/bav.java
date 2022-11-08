// 
// Decompiled by Procyon v0.6.0
// 

public final class bav
{
    private long a;
    private long b;
    private long c;
    private final ThreadLocal d;
    
    public bav(final long n) {
        this.d = new ThreadLocal();
        this.f(n);
    }
    
    public final long a(final long c) {
        monitorenter(this);
        if (c == -9223372036854775807L) {
            monitorexit(this);
            return -9223372036854775807L;
        }
        try {
            if (this.b == -9223372036854775807L) {
                long n;
                if ((n = this.a) == 9223372036854775806L) {
                    final Long n2 = this.d.get();
                    dk.d((Object)n2);
                    n = n2;
                }
                this.b = n - c;
                this.notifyAll();
            }
            this.c = c;
            final long b = this.b;
            monitorexit(this);
            return c + b;
        }
        finally {
            monitorexit(this);
        }
    }
    
    public final long b(long a) {
        monitorenter(this);
        if (a == -9223372036854775807L) {
            monitorexit(this);
            return -9223372036854775807L;
        }
        try {
            final long c = this.c;
            long n = a;
            if (c != -9223372036854775807L) {
                final long n2 = c * 90000L / 1000000L;
                final long n3 = (4294967296L + n2) / 8589934592L;
                final long n4 = (-1L + n3) * 8589934592L + a;
                a = (n = a + n3 * 8589934592L);
                if (Math.abs(n4 - n2) < Math.abs(a - n2)) {
                    n = n4;
                }
            }
            a = this.a(n * 1000000L / 90000L);
            return a;
        }
        finally {
            monitorexit(this);
        }
    }
    
    public final long c() {
        synchronized (this) {
            final long a = this.a;
            if (a != Long.MAX_VALUE && a != 9223372036854775806L) {
                return a;
            }
            return -9223372036854775807L;
        }
    }
    
    public final long d() {
        synchronized (this) {
            final long c = this.c;
            long c2;
            if (c != -9223372036854775807L) {
                c2 = c + this.b;
            }
            else {
                c2 = this.c();
            }
            return c2;
        }
    }
    
    public final long e() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final void f(long n) {
        synchronized (this) {
            this.a = n;
            if (n == Long.MAX_VALUE) {
                n = 0L;
            }
            else {
                n = -9223372036854775807L;
            }
            this.b = n;
            this.c = -9223372036854775807L;
        }
    }
}
