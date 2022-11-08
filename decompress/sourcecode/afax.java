import java.util.Comparator;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afax extends afgb implements Serializable
{
    private static final long serialVersionUID = 0L;
    final Comparator a;
    
    public afax(final Comparator a) {
        a.getClass();
        this.a = a;
    }
    
    public final int compare(final Object o, final Object o2) {
        return this.a.compare(o, o2);
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof afax && this.a.equals(((afax)o).a));
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String toString() {
        return this.a.toString();
    }
}
