import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

class aeze extends affk
{
    final transient Map a;
    final /* synthetic */ aezr b;
    
    public aeze(final aezr b, final Map a) {
        this.b = b;
        this.a = a;
    }
    
    final Map.Entry a(final Map.Entry entry) {
        final Object key = entry.getKey();
        return ajox.S(key, (Object)this.b.d(key, (Collection)entry.getValue()));
    }
    
    public final Set b() {
        return (Set)new aezc(this);
    }
    
    public final void clear() {
        final Map a = this.a;
        final aezr b = this.b;
        if (a == b.a) {
            b.m();
            return;
        }
        adwd.aA((Iterator)new aezd(this));
    }
    
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
    
    public final boolean equals(final Object o) {
        return this == o || this.a.equals(o);
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public Set keySet() {
        return this.b.w();
    }
    
    public final int size() {
        return this.a.size();
    }
    
    public final String toString() {
        return this.a.toString();
    }
}
