// 
// Decompiled by Procyon v0.6.0
// 

public final class abgb extends abfm
{
    private final abga a;
    private final int[] b;
    private abfw c;
    
    public abgb() {
        this.a = new abga(this);
        final int[] b = abfw.b;
        this.b = new int[3];
    }
    
    public final int a(int n, final int n2) {
        synchronized (this) {
            n = this.b[n];
            return n + n2;
        }
    }
    
    public final void b(final abfw c) {
        synchronized (this) {
            final abfw c2 = this.c;
            if (c2 == c) {
                return;
            }
            if (c2 != null) {
                c2.v((abfs)this.a);
                final int size = this.size();
                if (size > 0) {
                    this.a.e(0, size);
                }
            }
            this.c = c;
            this.c();
            if (this.c != null) {
                final int size2 = this.size();
                if (size2 > 0) {
                    this.a.d(0, size2);
                }
                this.c.k((abfs)this.a);
            }
        }
    }
    
    public final void c() {
        monitorenter(this);
        try {
            final int[] b = abfw.b;
            int i = 0;
            int n = 0;
            while (i < 2) {
                final int n2 = b[i];
                final abfw c = this.c;
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
    
    public final /* bridge */ Object remove(final int n) {
        throw new UnsupportedOperationException();
    }
    
    public final int size() {
        synchronized (this) {
            final int[] b = this.b;
            final int[] b2 = abfw.b;
            return b[2];
        }
    }
}
