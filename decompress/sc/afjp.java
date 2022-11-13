import java.util.ListIterator;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class afjp extends afjo implements List
{
    private static final long serialVersionUID = 0L;
    
    public afjp(final List list, final Object o) {
        super((Collection)list, o);
    }
    
    public final /* bridge */ Collection a() {
        return this.b();
    }
    
    public final void add(final int n, final Object o) {
        synchronized (this.g) {
            this.b().add(n, o);
        }
    }
    
    public final boolean addAll(final int n, final Collection collection) {
        synchronized (this.g) {
            return this.b().addAll(n, collection);
        }
    }
    
    final List b() {
        return (List)super.a();
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        synchronized (this.g) {
            return this.b().equals(o);
        }
    }
    
    public final Object get(final int n) {
        synchronized (this.g) {
            return this.b().get(n);
        }
    }
    
    public final int hashCode() {
        synchronized (this.g) {
            return this.b().hashCode();
        }
    }
    
    public final int indexOf(final Object o) {
        synchronized (this.g) {
            return this.b().indexOf(o);
        }
    }
    
    public final int lastIndexOf(final Object o) {
        synchronized (this.g) {
            return this.b().lastIndexOf(o);
        }
    }
    
    public final ListIterator listIterator() {
        return this.b().listIterator();
    }
    
    public final ListIterator listIterator(final int n) {
        return this.b().listIterator(n);
    }
    
    public final Object remove(final int n) {
        synchronized (this.g) {
            return this.b().remove(n);
        }
    }
    
    public final Object set(final int n, Object set) {
        synchronized (this.g) {
            set = this.b().set(n, set);
            return set;
        }
    }
    
    public final List subList(final int n, final int n2) {
        synchronized (this.g) {
            return afnd.i((List)this.b().subList(n, n2), this.g);
        }
    }
}
