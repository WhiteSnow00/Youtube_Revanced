// 
// Decompiled by Procyon v0.6.0
// 

public final class abei extends abdt
{
    private final abeh a;
    private final int[] b;
    private abed c;
    
    public abei() {
        this.a = new abeh(this);
        final int[] b = abed.b;
        this.b = new int[3];
    }
    
    public final int a() {
        synchronized (this) {
            final int[] b = this.b;
            final int[] b2 = abed.b;
            return b[2];
        }
    }
    
    public final int b(int n, final int n2) {
        synchronized (this) {
            n = this.b[n];
            return n + n2;
        }
    }
    
    public final void c(final abed c) {
        synchronized (this) {
            final abed c2 = this.c;
            if (c2 == c) {
                return;
            }
            if (c2 != null) {
                c2.v((abdz)this.a);
                final int a = this.a();
                if (a > 0) {
                    this.a.e(0, a);
                }
            }
            this.c = c;
            this.d();
            if (this.c != null) {
                final int a2 = this.a();
                if (a2 > 0) {
                    this.a.d(0, a2);
                }
                this.c.k((abdz)this.a);
            }
        }
    }
    
    public final void d() {
        monitorenter(this);
        try {
            final int[] b = abed.b;
            int i = 0;
            int n = 0;
            while (i < 2) {
                final int n2 = b[i];
                final abed c = this.c;
                int j;
                if (c != null) {
                    j = c.i(n2);
                }
                else {
                    j = 0;
                }
                n += j;
                this.b[n2 + 1] = n;
                ++i;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void h(final int n, final int n2) {
        throw new UnsupportedOperationException();
    }
    
    public final void i(final int n, final int n2) {
        throw null;
    }
}
