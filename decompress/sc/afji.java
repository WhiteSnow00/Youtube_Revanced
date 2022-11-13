import java.util.Map;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class afji extends afjr
{
    private static final long serialVersionUID = 0L;
    transient Set a;
    transient Collection b;
    
    public afji(final Map map, final Object o) {
        super(map, o);
    }
    
    public final boolean containsValue(final Object o) {
        return this.values().contains(o);
    }
    
    public final Set entrySet() {
        synchronized (this.g) {
            if (this.a == null) {
                this.a = (Set)new afjl((Set)this.a().entrySet(), this.g);
            }
            return this.a;
        }
    }
    
    public final /* bridge */ Object get(final Object o) {
        synchronized (this.g) {
            final Collection collection = (Collection)super.get(o);
            Object h;
            if (collection == null) {
                h = null;
            }
            else {
                h = afnd.h(collection, this.g);
            }
            return h;
        }
    }
    
    public final Collection values() {
        synchronized (this.g) {
            if (this.b == null) {
                this.b = (Collection)new afjn(this.a().values(), this.g);
            }
            return this.b;
        }
    }
}
