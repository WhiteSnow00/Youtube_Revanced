// 
// Decompiled by Procyon v0.6.0
// 

final class asex extends arva
{
    long a;
    final asfe b;
    private final asfc c;
    
    public asex(final asfe b, final asfc c) {
        this.b = b;
        this.c = c;
    }
    
    public final void f(long n) {
        if (this.b.q.f != null) {
            return;
        }
        synchronized (this.b.l) {
            if (this.b.q.f == null) {
                final asfc c = this.c;
                if (!c.b) {
                    final long a = this.a + n;
                    this.a = a;
                    final asfe b = this.b;
                    n = b.t;
                    if (a > n) {
                        if (a > b.m) {
                            c.c = true;
                        }
                        else {
                            n = b.C.n(a - n);
                            final asfe b2 = this.b;
                            b2.t = this.a;
                            if (n > b2.n) {
                                this.c.c = true;
                            }
                        }
                        final asfc c2 = this.c;
                        Runnable q;
                        if (c2.c) {
                            q = this.b.q(c2);
                        }
                        else {
                            q = null;
                        }
                        monitorexit(this.b.l);
                        if (q != null) {
                            q.run();
                        }
                    }
                }
            }
        }
    }
}
