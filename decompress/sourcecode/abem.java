// 
// Decompiled by Procyon v0.6.0
// 

public final class abem extends abdt
{
    private final int a;
    private final abel b;
    private abed c;
    
    public abem(final int a) {
        this.a = a;
        this.b = new abel(a);
    }
    
    public final int a() {
        synchronized (this) {
            final abed c = this.c;
            if (c != null) {
                return c.i(this.a);
            }
            return 0;
        }
    }
    
    public final void b(final abed c) {
        synchronized (this) {
            final abed c2 = this.c;
            if (c2 == c) {
                return;
            }
            if (c2 != null) {
                c2.v((abdz)this.b);
                final int a = this.a();
                if (a > 0) {
                    this.b.c(this.a, 0, a);
                }
            }
            if ((this.c = c) != null) {
                if (this.a() > 0) {
                    this.b.a(this.a, 0, this.a());
                }
                this.c.k((abdz)this.b);
            }
        }
    }
    
    public final fqh c(final int n) {
        synchronized (this) {
            final abed c = this.c;
            if (c == null) {
                return null;
            }
            final fqh c2 = c.C(this.a, n);
            this.c.u(this.a, n, 1);
            return c2;
        }
    }
    
    public final void h(final int n, final int n2) {
        synchronized (this) {
            final abed c = this.c;
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
}
