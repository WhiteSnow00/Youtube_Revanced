import java.util.Iterator;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

class aezh extends affh
{
    final /* synthetic */ aezr a;
    
    public aezh(final aezr a, final Map map) {
        this.a = a;
        super(map);
    }
    
    public final void clear() {
        adwd.aA(this.iterator());
    }
    
    public final boolean containsAll(final Collection collection) {
        return super.d.keySet().containsAll(collection);
    }
    
    public final boolean equals(final Object o) {
        return this == o || super.d.keySet().equals(o);
    }
    
    public final int hashCode() {
        return super.d.keySet().hashCode();
    }
    
    public final Iterator iterator() {
        return (Iterator)new aezg(this, (Iterator)super.d.entrySet().iterator());
    }
    
    public final boolean remove(final Object o) {
        final Collection collection = super.d.remove(o);
        if (collection != null) {
            final int size = collection.size();
            collection.clear();
            aezr.t(this.a, size);
            if (size > 0) {
                return true;
            }
        }
        return false;
    }
}
