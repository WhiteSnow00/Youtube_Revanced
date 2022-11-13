import java.util.Iterator;
import java.util.ConcurrentModificationException;
import java.util.Collection;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

class afbn extends AbstractCollection
{
    final Object a;
    Collection b;
    final afbn c;
    final Collection d;
    final afbq e;
    
    public afbn(final afbq e, final Object a, final Collection b, final afbn c) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        Collection b2;
        if (c == null) {
            b2 = null;
        }
        else {
            b2 = c.b;
        }
        this.d = b2;
    }
    
    final void a() {
        final afbn c = this.c;
        if (c != null) {
            c.a();
            return;
        }
        this.e.a.put(this.a, this.b);
    }
    
    @Override
    public final boolean add(final Object o) {
        this.b();
        final boolean empty = this.b.isEmpty();
        boolean add;
        final boolean b = add = this.b.add(o);
        if (b) {
            afbq.q(this.e);
            add = b;
            if (empty) {
                this.a();
                add = true;
            }
        }
        return add;
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        final int size = this.size();
        boolean addAll;
        final boolean b = addAll = this.b.addAll(collection);
        if (b) {
            afbq.s(this.e, this.b.size() - size);
            addAll = b;
            if (size == 0) {
                this.a();
                addAll = true;
            }
        }
        return addAll;
    }
    
    final void b() {
        final afbn c = this.c;
        if (c != null) {
            c.b();
            if (this.c.b != this.d) {
                throw new ConcurrentModificationException();
            }
        }
        else if (this.b.isEmpty()) {
            final Collection b = this.e.a.get(this.a);
            if (b != null) {
                this.b = b;
            }
        }
    }
    
    final void c() {
        final afbn c = this.c;
        if (c != null) {
            c.c();
            return;
        }
        if (this.b.isEmpty()) {
            this.e.a.remove(this.a);
        }
    }
    
    @Override
    public final void clear() {
        final int size = this.size();
        if (size == 0) {
            return;
        }
        this.b.clear();
        afbq.t(this.e, size);
        this.c();
    }
    
    @Override
    public final boolean contains(final Object o) {
        this.b();
        return this.b.contains(o);
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        this.b();
        return this.b.containsAll(collection);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        this.b();
        return this.b.equals(o);
    }
    
    @Override
    public final int hashCode() {
        this.b();
        return this.b.hashCode();
    }
    
    @Override
    public final Iterator iterator() {
        this.b();
        return new afbm(this);
    }
    
    @Override
    public final boolean remove(final Object o) {
        this.b();
        final boolean remove = this.b.remove(o);
        if (remove) {
            afbq.r(this.e);
            this.c();
        }
        return remove;
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        final int size = this.size();
        final boolean removeAll = this.b.removeAll(collection);
        if (removeAll) {
            afbq.s(this.e, this.b.size() - size);
            this.c();
        }
        return removeAll;
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        collection.getClass();
        final int size = this.size();
        final boolean retainAll = this.b.retainAll(collection);
        if (retainAll) {
            afbq.s(this.e, this.b.size() - size);
            this.c();
        }
        return retainAll;
    }
    
    @Override
    public final int size() {
        this.b();
        return this.b.size();
    }
    
    @Override
    public final String toString() {
        this.b();
        return this.b.toString();
    }
}
