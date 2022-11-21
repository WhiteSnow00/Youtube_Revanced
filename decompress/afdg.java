import java.util.Iterator;
import java.util.ListIterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afdg extends afde implements ListIterator
{
    final afdh d;
    
    public afdg(final afdh d) {
        super(this.d = d);
    }
    
    public afdg(final afdh d, final int n) {
        super(this.d = d, d.d().listIterator(n));
    }
    
    private final ListIterator b() {
        this.a();
        return (ListIterator)super.a;
    }
    
    @Override
    public final void add(final Object o) {
        final boolean empty = this.d.isEmpty();
        this.b().add(o);
        afdi.q(this.d.f);
        if (empty) {
            this.d.a();
        }
    }
    
    @Override
    public final boolean hasPrevious() {
        return this.b().hasPrevious();
    }
    
    @Override
    public final int nextIndex() {
        return this.b().nextIndex();
    }
    
    @Override
    public final Object previous() {
        return this.b().previous();
    }
    
    @Override
    public final int previousIndex() {
        return this.b().previousIndex();
    }
    
    @Override
    public final void set(final Object o) {
        this.b().set(o);
    }
}
