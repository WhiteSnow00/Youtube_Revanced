// 
// Decompiled by Procyon v0.6.0
// 

public final class aujc extends aufc
{
    private static final int e;
    private static final long serialVersionUID = 5472298452022250685L;
    private final aufc f;
    private final transient aujb[] g;
    
    static {
        Integer integer;
        try {
            integer = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        }
        catch (final SecurityException ex) {
            integer = null;
        }
        int n;
        if (integer == null) {
            n = 512;
        }
        else {
            int i = integer - 1;
            int n2 = 0;
            while (i > 0) {
                ++n2;
                i >>= 1;
            }
            n = 1 << n2;
        }
        e = n - 1;
    }
    
    public aujc(final aufc f) {
        super(f.c);
        this.g = new aujb[aujc.e + 1];
        this.f = f;
    }
    
    private final aujb o(long n) {
        final int n2 = (int)(n >> 32);
        final aujb[] g = this.g;
        final int n3 = aujc.e & n2;
        final aujb aujb = g[n3];
        if (aujb != null && (int)(aujb.a >> 32) == n2) {
            return aujb;
        }
        final long n4 = n & 0xFFFFFFFF00000000L;
        aujb aujb2 = new aujb(this.f, n4);
        n = n4;
        while (true) {
            final long e = this.f.e(n);
            if (e == n || e > (0xFFFFFFFFL | n4)) {
                break;
            }
            final aujb c = new aujb(this.f, e);
            aujb2.c = c;
            aujb2 = c;
            n = e;
        }
        return g[n3] = aujb2;
    }
    
    public final int a(final long n) {
        return this.o(n).a(n);
    }
    
    public final int c(final long n) {
        return this.o(n).b(n);
    }
    
    public final long e(final long n) {
        return this.f.e(n);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof aujc && this.f.equals((Object)((aujc)o).f));
    }
    
    public final long f(final long n) {
        return this.f.f(n);
    }
    
    public final String g(final long n) {
        return this.o(n).c(n);
    }
    
    public final int hashCode() {
        return this.f.hashCode();
    }
    
    public final boolean l() {
        return false;
    }
}
