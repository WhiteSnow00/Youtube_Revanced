// 
// Decompiled by Procyon v0.6.0
// 

public final class ayz
{
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    
    public ayz(final ayz ayz) {
        this.a = ayz.a;
        this.b = ayz.b;
        this.c = ayz.c;
        this.d = ayz.d;
        this.e = ayz.e;
    }
    
    public ayz(final Object o) {
        this(o, -1L);
    }
    
    public ayz(final Object o, final int n, final int n2, final long n3) {
        this(o, n, n2, n3, -1);
    }
    
    public ayz(final Object a, final int b, final int c, final long d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public ayz(final Object o, final long n) {
        this(o, -1, -1, n, -1);
    }
    
    public ayz(final Object o, final long n, final int n2) {
        this(o, -1, -1, n, n2);
    }
    
    public final boolean a() {
        return this.b != -1;
    }
    
    public final ayz b(final Object o) {
        ayz ayz;
        if (!this.a.equals(o)) {
            ayz = new ayz(o, this.b, this.c, this.d, this.e);
        }
        else {
            ayz = this;
        }
        return new ayz(ayz);
    }
    
    public final ayz c(final long n) {
        ayz ayz;
        if (this.d != n) {
            ayz = new ayz(this.a, this.b, this.c, n, this.e);
        }
        else {
            ayz = this;
        }
        return new ayz(ayz);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ayz)) {
            return false;
        }
        final ayz ayz = (ayz)o;
        return this.a.equals(ayz.a) && this.b == ayz.b && this.c == ayz.c && this.d == ayz.d && this.e == ayz.e;
    }
    
    @Override
    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31 + this.b) * 31 + this.c) * 31 + (int)this.d) * 31 + this.e;
    }
}
