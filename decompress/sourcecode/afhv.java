import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public class afhv extends afho implements Set
{
    private static final long serialVersionUID = 0L;
    
    public afhv(final Set set, final Object o) {
        super((Collection)set, o);
    }
    
    public Set b() {
        return (Set)super.a();
    }
    
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        synchronized (this.g) {
            return this.b().equals(o);
        }
    }
    
    public final int hashCode() {
        synchronized (this.g) {
            return this.b().hashCode();
        }
    }
}
