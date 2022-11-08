import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.AbstractMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahbx extends AbstractMap
{
    public List a;
    public Map b;
    public boolean c;
    public Map d;
    private final int e;
    private volatile ahbw f;
    
    public ahbx(final int e) {
        this.e = e;
        this.a = Collections.emptyList();
        this.b = Collections.emptyMap();
        this.d = Collections.emptyMap();
    }
    
    static ahbx b(final int n) {
        return new ahbx(n);
    }
    
    private final int h(final Comparable comparable) {
        final int n = this.a.size() - 1;
        final int n2 = 0;
        int n3 = n;
        int i = n2;
        if (n >= 0) {
            final int compareTo = comparable.compareTo(this.a.get(n).a);
            if (compareTo > 0) {
                return -(n + 2);
            }
            if (compareTo == 0) {
                return n;
            }
            n3 = n;
            i = n2;
        }
        while (i <= n3) {
            final int n4 = (i + n3) / 2;
            final int compareTo2 = comparable.compareTo(this.a.get(n4).a);
            if (compareTo2 < 0) {
                n3 = n4 - 1;
            }
            else {
                if (compareTo2 <= 0) {
                    return n4;
                }
                i = n4 + 1;
            }
        }
        return -(i + 1);
    }
    
    private final SortedMap i() {
        this.g();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            final TreeMap b = new TreeMap();
            this.b = b;
            final TreeMap treeMap = b;
            this.d = b.descendingMap();
        }
        return (SortedMap)this.b;
    }
    
    public final int a() {
        return this.a.size();
    }
    
    public final Iterable c() {
        Iterable iterable;
        if (this.b.isEmpty()) {
            iterable = ahbt.b;
        }
        else {
            iterable = this.b.entrySet();
        }
        return iterable;
    }
    
    @Override
    public final void clear() {
        this.g();
        if (!this.a.isEmpty()) {
            this.a.clear();
        }
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        final Comparable comparable = (Comparable)o;
        return this.h(comparable) >= 0 || this.b.containsKey(comparable);
    }
    
    public final Object d(final Comparable comparable, final Object value) {
        this.g();
        final int h = this.h(comparable);
        if (h >= 0) {
            return ((ahbu)this.a.get(h)).setValue(value);
        }
        this.g();
        if (this.a.isEmpty() && !(this.a instanceof ArrayList)) {
            this.a = new ArrayList(this.e);
        }
        final int n = -(h + 1);
        if (n >= this.e) {
            return this.i().put(comparable, value);
        }
        final int size = this.a.size();
        final int e = this.e;
        if (size == e) {
            final ahbu ahbu = this.a.remove(e - 1);
            this.i().put(ahbu.a, ahbu.b);
        }
        this.a.add(n, new ahbu(this, comparable, value));
        return null;
    }
    
    public final Object e(final int n) {
        this.g();
        final Object b = this.a.remove(n).b;
        if (!this.b.isEmpty()) {
            final Iterator iterator = this.i().entrySet().iterator();
            final List a = this.a;
            final Map.Entry<Comparable, V> entry = (Map.Entry<Comparable, V>)iterator.next();
            a.add(new ahbu(this, entry.getKey(), entry.getValue()));
            iterator.remove();
        }
        return b;
    }
    
    @Override
    public final Set entrySet() {
        if (this.f == null) {
            this.f = new ahbw(this);
        }
        return this.f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ahbx)) {
            return super.equals(o);
        }
        final ahbx ahbx = (ahbx)o;
        final int size = this.size();
        if (size != ahbx.size()) {
            return false;
        }
        final int a = this.a();
        if (a == ahbx.a()) {
            for (int i = 0; i < a; ++i) {
                if (!this.f(i).equals(ahbx.f(i))) {
                    return false;
                }
            }
            return a == size || this.b.equals(ahbx.b);
        }
        return this.entrySet().equals(ahbx.entrySet());
    }
    
    public final Entry f(final int n) {
        return (Entry)this.a.get(n);
    }
    
    public final void g() {
        if (!this.c) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Object get(final Object o) {
        final Comparable comparable = (Comparable)o;
        final int h = this.h(comparable);
        if (h >= 0) {
            return ((ahbu)this.a.get(h)).b;
        }
        return this.b.get(comparable);
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a();
        int i = 0;
        int n = 0;
        while (i < a) {
            n += this.a.get(i).hashCode();
            ++i;
        }
        int n2 = n;
        if (this.b.size() > 0) {
            n2 = n + this.b.hashCode();
        }
        return n2;
    }
    
    @Override
    public final Object remove(final Object o) {
        this.g();
        final Comparable comparable = (Comparable)o;
        final int h = this.h(comparable);
        if (h >= 0) {
            return this.e(h);
        }
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.remove(comparable);
    }
    
    @Override
    public final int size() {
        return this.a.size() + this.b.size();
    }
}
