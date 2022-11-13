import java.util.Iterator;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class afbb extends afhe
{
    final afbd a;
    
    public afbb(final afbd a) {
        this.a = a;
    }
    
    public final Map a() {
        return (Map)this.a;
    }
    
    public final boolean contains(final Object o) {
        return aefb.G((Collection)this.a.a.entrySet(), o);
    }
    
    public final Iterator iterator() {
        return new afbc(this.a);
    }
    
    public final boolean remove(Object remove) {
        if (!this.contains(remove)) {
            return false;
        }
        final Map.Entry entry = (Map.Entry)remove;
        entry.getClass();
        final afbq b = this.a.b;
        final Object key = entry.getKey();
        final Map a = b.a;
        a.getClass();
        try {
            remove = a.remove(key);
        }
        catch (final ClassCastException | NullPointerException ex) {
            remove = null;
        }
        final Collection collection = (Collection)remove;
        if (collection != null) {
            final int size = collection.size();
            collection.clear();
            b.b -= size;
        }
        return true;
    }
}
