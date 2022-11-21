import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agql
{
    public final double a;
    public final double b;
    public final double c;
    
    public agql(final double a, final double b, final double c) {
        if (a < 0.0 || a > 360.0) {
            final StringBuilder sb = new StringBuilder("Invalid hue value ");
            sb.append(a);
            throw new IllegalArgumentException(sb.toString());
        }
        if (b < 0.0 || b > 1.0) {
            final StringBuilder sb2 = new StringBuilder("Invalid saturation value ");
            sb2.append(b);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (c >= 0.0 && c <= 1.0) {
            this.a = a;
            this.b = b;
            this.c = c;
            return;
        }
        final StringBuilder sb3 = new StringBuilder("Invalid brightness value ");
        sb3.append(c);
        throw new IllegalArgumentException(sb3.toString());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof agql)) {
            return false;
        }
        final agql agql = (agql)o;
        return Math.abs(agql.a - this.a) < 1.0E-10 && Math.abs(agql.b - this.b) < 1.0E-10 && Math.abs(agql.c - this.c) < 1.0E-10;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { Math.round(this.a / 1.0E-10 / 100.0), Math.round(this.b / 1.0E-10 / 100.0), Math.round(this.c / 1.0E-10 / 100.0) });
    }
    
    @Override
    public final String toString() {
        final double a = this.a;
        final double b = this.b;
        final double c = this.c;
        final StringBuilder sb = new StringBuilder("HsbColor (h=");
        sb.append(a);
        sb.append(", s=");
        sb.append(b);
        sb.append(", b=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
