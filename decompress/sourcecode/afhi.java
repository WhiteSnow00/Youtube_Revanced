import java.util.Map;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class afhi extends afhr
{
    private static final long serialVersionUID = 0L;
    transient Set a;
    transient Collection b;
    
    public afhi(final Map map, final Object o) {
        super(map, o);
    }
    
    public final boolean containsValue(final Object o) {
        return this.values().contains(o);
    }
    
    public final Set entrySet() {
        synchronized (this.g) {
            if (this.a == null) {
                this.a = (Set)new afhl((Set)this.a().entrySet(), this.g);
            }
            return this.a;
        }
    }
    
    public final Collection values() {
        synchronized (this.g) {
            if (this.b == null) {
                this.b = (Collection)new afhn(this.a().values(), this.g);
            }
            return this.b;
        }
    }
}
