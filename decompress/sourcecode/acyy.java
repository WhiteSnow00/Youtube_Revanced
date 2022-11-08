import java.util.List;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

final class acyy extends AbstractList
{
    final List a;
    final int b;
    
    public acyy(final List a, final int b) {
        agot.u(b > 0);
        this.a = a;
        this.b = b;
    }
    
    public final List a(int n) {
        if (n >= 0 && n < this.size()) {
            final int b = this.b;
            n *= b;
            return this.a.subList(n, Math.min(b + n, this.a.size()));
        }
        throw new IndexOutOfBoundsException();
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
