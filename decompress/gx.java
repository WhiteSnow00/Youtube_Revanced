// 
// Decompiled by Procyon v0.6.0
// 

public final class gx implements hd
{
    final hd a;
    int b;
    int c;
    int d;
    
    public gx(final hd a) {
        this.b = 0;
        this.c = -1;
        this.d = -1;
        this.a = a;
    }
    
    public final void a(final int c, final int d) {
        if (this.b == 1) {
            final int c2 = this.c;
            if (c >= c2) {
                final int d2 = this.d;
                if (c <= c2 + d2) {
                    this.d = d2 + d;
                    this.c = Math.min(c, c2);
                    return;
                }
            }
        }
        this.e();
        this.c = c;
        this.d = d;
        this.b = 1;
    }
    
    public final void b(final int n, final int n2) {
        this.e();
        this.a.b(n, n2);
    }
    
    public final void c(final int n, final int d) {
        if (this.b == 2) {
            final int c = this.c;
            if (c >= n && c <= n + d) {
                this.d += d;
                this.c = n;
                return;
            }
        }
        this.e();
        this.c = n;
        this.d = d;
        this.b = 2;
    }
    
    public final void d(final int c, final int d) {
        if (this.b == 3) {
            final int c2 = this.c;
            final int n = this.d + c2;
            if (c <= n) {
                final int n2 = c + d;
                if (n2 >= c2) {
                    this.c = Math.min(c, c2);
                    this.d = Math.max(n, n2) - this.c;
                    return;
                }
            }
        }
        this.e();
        this.c = c;
        this.d = d;
        this.b = 3;
    }
    
    public final void e() {
        final int b = this.b;
        if (b == 0) {
            return;
        }
        if (b != 1) {
            if (b != 2) {
                this.a.d(this.c, this.d);
            }
            else {
                this.a.c(this.c, this.d);
            }
        }
        else {
            this.a.a(this.c, this.d);
        }
        this.b = 0;
    }
}
