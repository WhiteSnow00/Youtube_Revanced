import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

final class agqn
{
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    
    public agqn(final double a, final double b, final double c, final double d) {
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
        if (!(o instanceof agqn)) {
            return false;
        }
        final agqn agqn = (agqn)o;
        return Math.abs(agqn.a - this.a) < 1.0E-13 && Math.abs(agqn.b - this.b) < 1.0E-13 && Math.abs(agqn.c - this.c) < 1.0E-13 && Math.abs(agqn.d - this.d) < 1.0E-13;
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
