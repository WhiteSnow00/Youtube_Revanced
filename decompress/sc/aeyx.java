// 
// Decompiled by Procyon v0.6.0
// 

final class aeyx extends aeyz
{
    final aeyz a;
    final aeyz b;
    
    public aeyx(final aeyz a, final aeyz b) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public final boolean b(final char c) {
        return this.a.b(c) || this.b.b(c);
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CharMatcher.or(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
