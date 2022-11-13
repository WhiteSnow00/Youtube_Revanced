import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bjm
{
    public final long a;
    public final long b;
    private final String c;
    private int d;
    
    public bjm(final String s, final long a, final long b) {
        String c = s;
        if (s == null) {
            c = "";
        }
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final Uri a(final String s) {
        return dl.n(s, this.c);
    }
    
    public final bjm b(final bjm bjm, final String s) {
        final String c = this.c(s);
        if (bjm != null) {
            if (c.equals(bjm.c(s))) {
                final long b = this.b;
                long n = -1L;
                if (b != -1L) {
                    final long a = this.a;
                    if (a + b == bjm.a) {
                        final long b2 = bjm.b;
                        if (b2 != -1L) {
                            n = b + b2;
                        }
                        return new bjm(c, a, n);
                    }
                }
                final long b3 = bjm.b;
                if (b3 != -1L) {
                    final long a2 = bjm.a;
                    if (a2 + b3 == this.a) {
                        if (b != -1L) {
                            n = b3 + b;
                        }
                        return new bjm(c, a2, n);
                    }
                }
            }
        }
        return null;
    }
    
    public final String c(final String s) {
        return dl.o(s, this.c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final bjm bjm = (bjm)o;
                if (this.a == bjm.a && this.b == bjm.b && this.c.equals(bjm.c)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int d = this.d;
        if (d == 0) {
            return this.d = (((int)this.a + 527) * 31 + (int)this.b) * 31 + this.c.hashCode();
        }
        return d;
    }
    
    @Override
    public final String toString() {
        final String c = this.c;
        final long a = this.a;
        final long b = this.b;
        final StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(c);
        sb.append(", start=");
        sb.append(a);
        sb.append(", length=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
