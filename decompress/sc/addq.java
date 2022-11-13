import java.util.List;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

final class addq extends AbstractList
{
    final List a;
    final int b;
    
    public addq(final List a, final int b) {
        adkp.H(b > 0);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final /* bridge */ Object get(int n) {
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
