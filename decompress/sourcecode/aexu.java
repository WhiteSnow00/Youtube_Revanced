import java.util.Iterator;
import java.util.List;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexu implements Serializable, aext
{
    private static final long serialVersionUID = 0L;
    private final List a;
    
    public aexu(final List a) {
        this.a = a;
    }
    
    public final boolean a(final Object o) {
        for (int i = 0; i < this.a.size(); ++i) {
            if (!((aext)this.a.get(i)).a(o)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aexu && this.a.equals(((aexu)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }
    
    @Override
    public final String toString() {
        final List a = this.a;
        final StringBuilder sb = new StringBuilder("Predicates.and(");
        final Iterator iterator = a.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (n == 0) {
                sb.append(',');
            }
            sb.append(next);
            n = 0;
        }
        sb.append(')');
        return sb.toString();
    }
}
