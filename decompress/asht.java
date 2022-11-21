// 
// Decompiled by Procyon v0.6.0
// 

final class asht extends arxu
{
    long a;
    final asia b;
    private final ashy c;
    
    public asht(final asia b, final ashy c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void h(long n) {
        if (this.b.q.f != null) {
            return;
        }
        synchronized (this.b.l) {
            if (this.b.q.f == null) {
                final ashy c = this.c;
                if (!c.b) {
                    final long a = this.a + n;
                    this.a = a;
                    final asia b = this.b;
                    n = b.t;
                    if (a > n) {
                        if (a > b.m) {
                            c.c = true;
                        }
                        else {
                            n = b.C.O(a - n);
                            final asia b2 = this.b;
                            b2.t = this.a;
                            if (n > b2.n) {
                                this.c.c = true;
                            }
                        }
                        final ashy c2 = this.c;
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
