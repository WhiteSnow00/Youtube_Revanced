import java.util.Set;
import java.util.RandomAccess;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class aezr extends aezy implements Serializable
{
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;
    
    protected aezr(final Map a) {
        agot.u(a.isEmpty());
        this.a = a;
    }
    
    public abstract Collection a();
    
    public Collection b() {
        throw null;
    }
    
    public Collection c(final Collection collection) {
        throw null;
    }
    
    public Collection d(final Object o, final Collection collection) {
        throw null;
    }
    
    public final int g() {
        return this.b;
    }
    
    @Override
    public final Collection h() {
        return (Collection)new aezx((aezy)this);
    }
    
    @Override
    public final Iterator i() {
        return (Iterator)new aezf(this);
    }
    
    final List j(final Object o, final List list, final aezo aezo) {
        aezq aezq;
        if (list instanceof RandomAccess) {
            aezq = new aezk(this, o, list, aezo);
        }
        else {
            aezq = new aezq(this, o, list, aezo);
        }
        return aezq;
    }
    
    @Override
    public Map k() {
        return (Map)new aeze(this, this.a);
    }
    
    @Override
    public Set l() {
        return (Set)new aezh(this, this.a);
    }
    
    public final void m() {
        final Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            ((Collection)iterator.next()).clear();
        }
        this.a.clear();
        this.b = 0;
    }
    
    final void n(final Map a) {
        this.a = a;
        this.b = 0;
        for (final Collection collection : a.values()) {
            agot.u(collection.isEmpty() ^ true);
            this.b += collection.size();
        }
    }
    
    public final boolean o(final Object o) {
        return this.a.containsKey(o);
    }
    
    @Override
    public final boolean p(final Object o, final Object o2) {
        final Collection collection = this.a.get(o);
        if (collection == null) {
            final Collection a = this.a();
            if (a.add(o2)) {
                ++this.b;
                this.a.put(o, a);
                return true;
            }
            throw new AssertionError((Object)"New Collection violated the Collection spec");
        }
        else {
            if (collection.add(o2)) {
                ++this.b;
                return true;
            }
            return false;
        }
    }
}
