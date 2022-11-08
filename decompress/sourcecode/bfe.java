// 
// Decompiled by Procyon v0.6.0
// 

final class bfe
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final ayx i;
    
    public bfe(final ayx i, final long a, final long b, final long c, final long d, final boolean b2, final boolean f, final boolean g, final boolean h) {
        dk.f(!h || f);
        dk.f(!g || f);
        dk.f(true);
        this.i = i;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = false;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final bfe a(final long n) {
        if (n == this.b) {
            return this;
        }
        return new bfe(this.i, this.a, n, this.c, this.d, false, this.f, this.g, this.h);
    }
    
    public final bfe b(final long n) {
        if (n == this.a) {
            return this;
        }
        return new bfe(this.i, n, this.b, this.c, this.d, false, this.f, this.g, this.h);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final bfe bfe = (bfe)o;
                if (this.a == bfe.a && this.b == bfe.b && this.c == bfe.c && this.d == bfe.d && this.f == bfe.f && this.g == bfe.g && this.h == bfe.h && baw.aa(this.i, bfe.i)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((((((this.i.hashCode() + 527) * 31 + (int)this.a) * 31 + (int)this.b) * 31 + (int)this.c) * 31 + (int)this.d) * 961 + (this.f ? 1 : 0)) * 31 + (this.g ? 1 : 0)) * 31 + (this.h ? 1 : 0);
    }
}
