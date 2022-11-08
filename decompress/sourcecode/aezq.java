import java.util.ListIterator;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

class aezq extends aezo implements List
{
    final /* synthetic */ aezr f;
    
    public aezq(final aezr f, final Object o, final List list, final aezo aezo) {
        this.f = f;
        super(f, o, (Collection)list, aezo);
    }
    
    public final void add(final int n, final Object o) {
        this.b();
        final boolean empty = super.b.isEmpty();
        this.d().add(n, o);
        aezr.q(this.f);
        if (empty) {
            this.a();
        }
    }
    
    public final boolean addAll(int size, final Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        final int size2 = this.size();
        boolean addAll;
        final boolean b = addAll = this.d().addAll(size, collection);
        if (b) {
            size = super.b.size();
            aezr.s(this.f, size - size2);
            addAll = b;
            if (size2 == 0) {
                this.a();
                addAll = true;
            }
        }
        return addAll;
    }
    
    final List d() {
        return (List)super.b;
    }
    
    public final Object get(final int n) {
        this.b();
        return this.d().get(n);
    }
    
    public final int indexOf(final Object o) {
        this.b();
        return this.d().indexOf(o);
    }
    
    public final int lastIndexOf(final Object o) {
        this.b();
        return this.d().lastIndexOf(o);
    }
    
    public final ListIterator listIterator() {
        this.b();
        return new aezp(this);
    }
    
    public final ListIterator listIterator(final int n) {
        this.b();
        return new aezp(this, n);
    }
    
    public final Object remove(final int n) {
        this.b();
        final Object remove = this.d().remove(n);
        aezr.r(this.f);
        this.c();
        return remove;
    }
    
    public final Object set(final int n, final Object o) {
        this.b();
        return this.d().set(n, o);
    }
    
    public final List subList(final int n, final int n2) {
        this.b();
        final aezr f = this.f;
        final Object a = super.a;
        final List subList = this.d().subList(n, n2);
        aezo c = super.c;
        if (c == null) {
            c = this;
        }
        return f.j(a, subList, c);
    }
}
