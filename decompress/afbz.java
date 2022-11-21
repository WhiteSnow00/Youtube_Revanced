import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afbz implements Iterable
{
    final CharSequence a;
    final afcb b;
    
    public afbz(final afcb b, final CharSequence a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Iterator iterator() {
        return this.b.g(this.a);
    }
    
    @Override
    public final String toString() {
        final afbd b = afbd.b(", ");
        final StringBuilder sb = new StringBuilder();
        sb.append('[');
        b.f(sb, this.iterator());
        sb.append(']');
        return sb.toString();
    }
}
