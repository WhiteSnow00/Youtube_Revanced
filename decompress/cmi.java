import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cmi
{
    public static final cmi a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final Set h;
    public final int i;
    
    static {
        a = new cmi(null);
    }
    
    public cmi() {
        this(null);
    }
    
    public cmi(final int i, final boolean b, final boolean c, final boolean d, final boolean e, final long f, final long g, final Set h) {
        h.getClass();
        this.i = i;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public cmi(final byte[] array) {
        this(1, false, false, false, false, -1L, -1L, (Set)atob.a);
    }
    
    public final boolean a() {
        return !this.h.isEmpty();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && atqz.c(this.getClass(), o.getClass())) {
            final cmi cmi = (cmi)o;
            return this.b == cmi.b && this.c == cmi.c && this.d == cmi.d && this.e == cmi.e && this.f == cmi.f && this.g == cmi.g && this.i == cmi.i && atqz.c(this.h, cmi.h);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int i = this.i;
        final int b = this.b ? 1 : 0;
        final int c = this.c ? 1 : 0;
        final int d = this.d ? 1 : 0;
        final int e = this.e ? 1 : 0;
        final long f = this.f;
        final long g = this.g;
        return ((((((i * 31 + b) * 31 + c) * 31 + d) * 31 + e) * 31 + (int)(f ^ f >>> 32)) * 31 + (int)(g ^ g >>> 32)) * 31 + this.h.hashCode();
    }
}
