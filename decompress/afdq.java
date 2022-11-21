import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class afdq extends AbstractCollection implements afjh
{
    private transient Set a;
    private transient Set b;
    
    public afdq() {
    }
    
    @Override
    public int a(final Object o, final int n) {
        throw null;
    }
    
    @Override
    public final boolean add(final Object o) {
        this.a(o, 1);
        return true;
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        collection.getClass();
        final boolean b = collection instanceof afjh;
        boolean b2 = false;
        if (b) {
            final afjh afjh = (afjh)collection;
            if (afjh instanceof afdm) {
                final afdm afdm = (afdm)afjh;
                if (afdm.isEmpty()) {
                    return b2;
                }
                for (int i = afdm.a.a(); i >= 0; i = afdm.a.e(i)) {
                    this.a(afdm.a.h(i), afdm.a.c(i));
                }
            }
            else {
                if (afjh.isEmpty()) {
                    return b2;
                }
                for (final afji afji : afjh.j()) {
                    this.a(afji.a, afji.a());
                }
            }
            b2 = true;
        }
        else if (!collection.isEmpty()) {
            return agpx.ad(this, collection.iterator());
        }
        return b2;
    }
    
    public abstract int c();
    
    @Override
    public final boolean contains(final Object o) {
        return this.b(o) > 0;
    }
    
    @Override
    public int d(final Object o, final int n) {
        throw null;
    }
    
    public abstract Iterator e();
    
    @Override
    public final boolean equals(final Object o) {
        return aewr.n(this, o);
    }
    
    public abstract Iterator f();
    
    @Override
    public boolean h(final Object o, final int n) {
        throw null;
    }
    
    @Override
    public final int hashCode() {
        return this.j().hashCode();
    }
    
    @Override
    public final Set i() {
        Object a;
        if ((a = this.a) == null) {
            a = new afjj(this);
            this.a = (Set)a;
        }
        return (Set)a;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.j().isEmpty();
    }
    
    @Override
    public final Set j() {
        Object b;
        if ((b = this.b) == null) {
            b = new afjk(this);
            this.b = (Set)b;
        }
        return (Set)b;
    }
    
    @Override
    public final boolean remove(final Object o) {
        return this.d(o, 1) > 0;
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        Object i = collection;
        if (collection instanceof afjh) {
            i = ((afjh)collection).i();
        }
        return this.i().removeAll((Collection)i);
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        collection.getClass();
        Object i = collection;
        if (collection instanceof afjh) {
            i = ((afjh)collection).i();
        }
        return this.i().retainAll((Collection)i);
    }
    
    @Override
    public final String toString() {
        return this.j().toString();
    }
}
