import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

final class agou
{
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    
    public agou(final double a, final double b, final double c, final double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof agou)) {
            return false;
        }
        final agou agou = (agou)o;
        return Math.abs(agou.a - this.a) < 1.0E-13 && Math.abs(agou.b - this.b) < 1.0E-13 && Math.abs(agou.c - this.c) < 1.0E-13 && Math.abs(agou.d - this.d) < 1.0E-13;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { Math.round(this.a * 1.0E16), Math.round(this.b * 1.0E16), Math.round(this.c * 1.0E16), Math.round(this.d * 1.0E16) });
    }
    
    @Override
    public final String toString() {
        final double a = this.a;
        final double b = this.b;
        final double c = this.c;
        final double d = this.d;
        final StringBuilder sb = new StringBuilder("RgbColorInternal(r=");
        sb.append(a);
        sb.append(", g=");
        sb.append(b);
        sb.append(", b=");
        sb.append(c);
        sb.append(", alpha=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
}
