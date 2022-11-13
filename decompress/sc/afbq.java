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

abstract class afbq extends afbx implements Serializable
{
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;
    
    protected afbq(final Map a) {
        adkp.H(a.isEmpty());
        this.a = a;
    }
    
    static void q(final afbq afbq) {
        ++afbq.b;
    }
    
    static void r(final afbq afbq) {
        --afbq.b;
    }
    
    static void s(final afbq afbq, final int n) {
        afbq.b += n;
    }
    
    static void t(final afbq afbq, final int n) {
        afbq.b -= n;
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
    
    public final Collection h() {
        return new afbw(this);
    }
    
    public final Iterator i() {
        return new afbe(this);
    }
    
    final List j(final Object o, final List list, final afbn afbn) {
        afbp afbp;
        if (list instanceof RandomAccess) {
            afbp = new afbj(this, o, list, afbn);
        }
        else {
            afbp = new afbp(this, o, list, afbn);
        }
        return (List)afbp;
    }
    
    public Map k() {
        return (Map)new afbd(this, this.a);
    }
    
    public Set l() {
        return (Set)new afbg(this, this.a);
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
            adkp.H(collection.isEmpty() ^ true);
            this.b += collection.size();
        }
    }
    
    public final boolean o(final Object o) {
        return this.a.containsKey(o);
    }
    
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
