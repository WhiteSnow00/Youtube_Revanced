// 
// Decompiled by Procyon v0.6.0
// 

final class afap extends afar
{
    final afar a;
    final afar b;
    
    public afap(final afar a, final afar b) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    @Override
    public final boolean b(final char c) {
        return this.a.b(c) || this.b.b(c);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CharMatcher.or(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
