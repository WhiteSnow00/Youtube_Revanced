// 
// Decompiled by Procyon v0.6.0
// 

public final class jax
{
    public final int a;
    public final int b;
    
    public jax() {
    }
    
    public jax(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public static jax a(final int n, final int n2) {
        return new jax(n, n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof jax) {
            final jax jax = (jax)o;
            if (this.a == jax.a && this.b == jax.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a ^ 0xF4243) * 1000003 ^ this.b;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder("FilmStripOffset{index=");
        sb.append(a);
        sb.append(", itemOffsetPx=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
