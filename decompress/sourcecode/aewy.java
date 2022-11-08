// 
// Decompiled by Procyon v0.6.0
// 

final class aewy extends aexa
{
    final aexa a;
    final aexa b;
    
    public aewy(final aexa a, final aexa b) {
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
