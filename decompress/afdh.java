import java.util.ListIterator;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

class afdh extends afdf implements List
{
    final afdi f;
    
    public afdh(final afdi f, final Object o, final List list, final afdf afdf) {
        super(this.f = f, o, list, afdf);
    }
    
    @Override
    public final void add(final int n, final Object o) {
        this.b();
        final boolean empty = super.b.isEmpty();
        this.d().add(n, o);
        afdi.q(this.f);
        if (empty) {
            this.a();
        }
    }
    
    @Override
    public final boolean addAll(int size, final Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        final int size2 = this.size();
        boolean addAll;
        final boolean b = addAll = this.d().addAll(size, collection);
        if (b) {
            size = super.b.size();
            afdi.s(this.f, size - size2);
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
    
    @Override
    public final Object get(final int n) {
        this.b();
        return this.d().get(n);
    }
    
    @Override
    public final int indexOf(final Object o) {
        this.b();
        return this.d().indexOf(o);
    }
    
    @Override
    public final int lastIndexOf(final Object o) {
        this.b();
        return this.d().lastIndexOf(o);
    }
    
    @Override
    public final ListIterator listIterator() {
        this.b();
        return new afdg(this);
    }
    
    @Override
    public final ListIterator listIterator(final int n) {
        this.b();
        return new afdg(this, n);
    }
    
    @Override
    public final Object remove(final int n) {
        this.b();
        final Object remove = this.d().remove(n);
        afdi.r(this.f);
        this.c();
        return remove;
    }
    
    @Override
    public final Object set(final int n, final Object o) {
        this.b();
        return this.d().set(n, o);
    }
    
    @Override
    public final List subList(final int n, final int n2) {
        this.b();
        final afdi f = this.f;
        final Object a = super.a;
        final List subList = this.d().subList(n, n2);
        afdf c = super.c;
        if (c == null) {
            c = this;
        }
        return f.j(a, subList, c);
    }
}
