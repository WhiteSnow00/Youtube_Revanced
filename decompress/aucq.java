// 
// Decompiled by Procyon v0.6.0
// 

public final class aucq
{
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public aucq f;
    public aucq g;
    
    public aucq() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
    
    public aucq(final byte[] a, final int b, final int c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = false;
    }
    
    public final aucq a() {
        final aucq f = this.f;
        aucq aucq;
        if (f != this) {
            aucq = f;
        }
        else {
            aucq = null;
        }
        final aucq g = this.g;
        g.getClass();
        g.f = f;
        final aucq f2 = this.f;
        f2.getClass();
        f2.g = g;
        this.f = null;
        this.g = null;
        return aucq;
    }
    
    public final aucq b() {
        this.d = true;
        return new aucq(this.a, this.b, this.c, true);
    }
    
    public final void c(final aucq aucq, final int n) {
        if (aucq.e) {
            final int c = aucq.c;
            final int n2 = c + n;
            int c2 = c;
            if (n2 > 8192) {
                if (aucq.d) {
                    throw new IllegalArgumentException();
                }
                final int b = aucq.b;
                if (n2 - b > 8192) {
                    throw new IllegalArgumentException();
                }
                final byte[] a = aucq.a;
                atyb.m(a, a, b, c);
                c2 = aucq.c - aucq.b;
                aucq.c = c2;
                aucq.b = 0;
            }
            final byte[] a2 = this.a;
            final byte[] a3 = aucq.a;
            final int b2 = this.b;
            atyb.j(a2, a3, c2, b2, b2 + n);
            aucq.c += n;
            this.b += n;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }
    
    public final void d(final aucq aucq) {
        aucq.g = this;
        aucq.f = this.f;
        final aucq f = this.f;
        f.getClass();
        f.g = aucq;
        this.f = aucq;
    }
}
