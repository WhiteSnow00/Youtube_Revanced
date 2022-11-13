// 
// Decompiled by Procyon v0.6.0
// 

public final class abgf extends abfm
{
    private final int a;
    private final abge b;
    private abfw c;
    
    public abgf(final int a) {
        this.a = a;
        this.b = new abge(a);
    }
    
    public final void a(final abfw c) {
        synchronized (this) {
            final abfw c2 = this.c;
            if (c2 == c) {
                return;
            }
            if (c2 != null) {
                c2.v((abfs)this.b);
                final int size = this.size();
                if (size > 0) {
                    this.b.c(this.a, 0, size);
                }
            }
            if ((this.c = c) != null) {
                if (this.size() > 0) {
                    this.b.a(this.a, 0, this.size());
                }
                this.c.k((abfs)this.b);
            }
        }
    }
    
    public final fqq b(final int n) {
        synchronized (this) {
            final abfw c = this.c;
            if (c == null) {
                return null;
            }
            final fqq c2 = c.C(this.a, n);
            this.c.u(this.a, n, 1);
            return c2;
        }
    }
    
    public final void h(final int n, final int n2) {
        synchronized (this) {
            final abfw c = this.c;
            if (c == null) {
                return;
            }
            final int a = this.a;
            c.r(a, n, a, n2);
        }
    }
    
    public final void i(final int n, final int n2) {
        synchronized (this) {
            throw null;
        }
    }
    
    public final /* bridge */ Object remove(final int n) {
        return this.b(n);
    }
    
    public final int size() {
        synchronized (this) {
            final abfw c = this.c;
            if (c != null) {
                return c.i(this.a);
            }
            return 0;
        }
    }
}
