import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

class afcv extends afja
{
    final transient Map a;
    final afdi b;
    
    public afcv(final afdi b, final Map a) {
        this.b = b;
        this.a = a;
    }
    
    final Entry a(final Entry entry) {
        final Object key = entry.getKey();
        return agpx.I(key, this.b.d(key, (Collection)entry.getValue()));
    }
    
    @Override
    public final Set b() {
        return (Set)new afct(this);
    }
    
    @Override
    public final void clear() {
        final Map a = this.a;
        final afdi b = this.b;
        if (a == b.a) {
            b.m();
            return;
        }
        agpx.ac(new afcu(this));
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        final Map a = this.a;
        a.getClass();
        boolean containsKey;
        try {
            containsKey = a.containsKey(o);
        }
        catch (final ClassCastException | NullPointerException ex) {
            containsKey = false;
        }
        return containsKey;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || this.a.equals(o);
    }
    
    @Override
    public final /* bridge */ Object get(final Object o) {
        final Collection collection = (Collection)agpx.F(this.a, o);
        if (collection == null) {
            return null;
        }
        return this.b.d(o, collection);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public Set keySet() {
        return this.b.w();
    }
    
    @Override
    public final /* bridge */ Object remove(final Object o) {
        final Collection collection = this.a.remove(o);
        if (collection == null) {
            return null;
        }
        final Collection a = this.b.a();
        a.addAll(collection);
        afdi.t(this.b, collection.size());
        collection.clear();
        return a;
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
