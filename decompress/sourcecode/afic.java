import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class afic extends afbn implements Set
{
    final Collection a;
    
    public afic(final Collection a) {
        this.a = a;
    }
    
    protected final Collection c() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        return aesy.s((Set)this, o);
    }
    
    public final int hashCode() {
        return aesy.i((Set)this);
    }
}
