// 
// Decompiled by Procyon v0.6.0
// 

public final class aujj extends aufc
{
    private static final long serialVersionUID = -3513011772763289092L;
    private final String e;
    private final int f;
    private final int g;
    
    public aujj(final String s, final String e, final int f, final int g) {
        super(s);
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final int a(final long n) {
        return this.f;
    }
    
    public final int b(final long n) {
        return this.f;
    }
    
    public final int c(final long n) {
        return this.g;
    }
    
    public final long e(final long n) {
        return n;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof aujj) {
            final aujj aujj = (aujj)o;
            if (super.c.equals(aujj.c) && this.g == aujj.g && this.f == aujj.f) {
                return true;
            }
        }
        return false;
    }
    
    public final long f(final long n) {
        return n;
    }
    
    public final String g(final long n) {
        return this.e;
    }
    
    public final int hashCode() {
        return super.c.hashCode() + this.g * 37 + this.f * 31;
    }
    
    public final boolean l() {
        return true;
    }
}
