import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class afkc extends afdm implements Set
{
    final Collection a;
    
    public afkc(final Collection a) {
        this.a = a;
    }
    
    protected final Object a() {
        return this.a;
    }
    
    protected final Collection c() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        return agqs.ak(this, o);
    }
    
    public final int hashCode() {
        return agqs.aa(this);
    }
}
