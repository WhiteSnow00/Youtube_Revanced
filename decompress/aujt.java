// 
// Decompiled by Procyon v0.6.0
// 

public final class aujt extends auft
{
    private static final int e;
    private static final long serialVersionUID = 5472298452022250685L;
    private final auft f;
    private final transient aujs[] g;
    
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
            int i;
            int n2;
            for (i = integer - 1, n2 = 0; i > 0; i >>= 1, ++n2) {}
            n = 1 << n2;
        }
        e = n - 1;
    }
    
    public aujt(final auft f) {
        super(f.c);
        this.g = new aujs[aujt.e + 1];
        this.f = f;
    }
    
    private final aujs o(long n) {
        final aujs[] g = this.g;
        final int n2 = (int)(n >> 32);
        final int n3 = aujt.e & n2;
        final aujs aujs = g[n3];
        if (aujs != null && (int)(aujs.a >> 32) == n2) {
            return aujs;
        }
        final long n4 = n & 0xFFFFFFFF00000000L;
        final aujs aujs2 = new aujs(this.f, n4);
        n = n4;
        aujs aujs3 = aujs2;
        while (true) {
            final long e = this.f.e(n);
            if (e == n || e > (0xFFFFFFFFL | n4)) {
                break;
            }
            final aujs c = new aujs(this.f, e);
            aujs3.c = c;
            aujs3 = c;
            n = e;
        }
        return g[n3] = aujs2;
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
        return this == o || (o instanceof aujt && this.f.equals((Object)((aujt)o).f));
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
