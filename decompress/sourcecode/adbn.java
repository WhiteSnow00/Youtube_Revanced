import java.util.List;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

final class adbn extends AbstractList
{
    final List a;
    final int b;
    
    public adbn(final List a, final int b) {
        agot.u(b > 0);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }
    
    @Override
    public final int size() {
        final double n = this.a.size();
        final double n2 = this.b;
        Double.isNaN(n);
        Double.isNaN(n2);
        return (int)Math.ceil(n / n2);
    }
}
