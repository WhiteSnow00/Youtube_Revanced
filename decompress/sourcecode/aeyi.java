import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeyi implements Iterable
{
    final /* synthetic */ CharSequence a;
    final /* synthetic */ aeyk b;
    
    public aeyi(final aeyk b, final CharSequence a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Iterator iterator() {
        return this.b.g(this.a);
    }
    
    @Override
    public final String toString() {
        final aexm b = aexm.b(", ");
        final StringBuilder sb = new StringBuilder();
        sb.append('[');
        b.f(sb, this.iterator());
        sb.append(']');
        return sb.toString();
    }
}
