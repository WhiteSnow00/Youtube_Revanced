import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class aezz extends AbstractCollection implements affr
{
    private transient Set a;
    private transient Set b;
    
    public aezz() {
    }
    
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
        final boolean b = collection instanceof affr;
        boolean b2 = false;
        if (b) {
            final affr affr = (affr)collection;
            if (affr instanceof aezv) {
                final aezv aezv = (aezv)affr;
                if (aezv.isEmpty()) {
                    return b2;
                }
                for (int i = aezv.a.a(); i >= 0; i = aezv.a.e(i)) {
                    ((affr)this).a(aezv.a.h(i), aezv.a.c(i));
                }
            }
            else {
                if (affr.isEmpty()) {
                    return b2;
                }
                for (final affs affs : affr.j()) {
                    ((affr)this).a(affs.a, affs.a());
                }
            }
            b2 = true;
        }
        else if (!collection.isEmpty()) {
            return adwd.aB((Collection)this, (Iterator)collection.iterator());
        }
        return b2;
    }
    
    public abstract int c();
    
    @Override
    public final boolean contains(final Object o) {
        return this.b(o) > 0;
    }
    
    public int d(final Object o, final int n) {
        throw null;
    }
    
    public abstract Iterator e();
    
    public final boolean equals(final Object o) {
        return ajox.M((affr)this, o);
    }
    
    public abstract Iterator f();
    
    public boolean h(final Object o, final int n) {
        throw null;
    }
    
    public final int hashCode() {
        return this.j().hashCode();
    }
    
    public final Set i() {
        Object a;
        if ((a = this.a) == null) {
            a = new afft(this);
            this.a = (Set)a;
        }
        return (Set)a;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.j().isEmpty();
    }
    
    public final Set j() {
        Object b;
        if ((b = this.b) == null) {
            b = new affu(this);
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
        Collection i = collection;
        if (collection instanceof affr) {
            i = ((affr)collection).i();
        }
        return ((affr)this).i().removeAll(i);
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        collection.getClass();
        Collection i = collection;
        if (collection instanceof affr) {
            i = ((affr)collection).i();
        }
        return ((affr)this).i().retainAll(i);
    }
    
    @Override
    public final String toString() {
        return this.j().toString();
    }
}
