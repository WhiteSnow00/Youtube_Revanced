import java.util.Comparator;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afen extends afjr implements Serializable
{
    private static final long serialVersionUID = 0L;
    final Comparator a;
    
    public afen(final Comparator a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        return this.a.compare(o, o2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof afen && this.a.equals(((afen)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
