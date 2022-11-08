import java.util.Iterator;
import java.util.ListIterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class aezp extends aezn implements ListIterator
{
    final /* synthetic */ aezq d;
    
    public aezp(final aezq d) {
        this.d = d;
        super((aezo)d);
    }
    
    public aezp(final aezq d, final int n) {
        this.d = d;
        super((aezo)d, (Iterator)d.d().listIterator(n));
    }
    
    private final ListIterator b() {
        this.a();
        return (ListIterator)super.a;
    }
    
    public final void add(final Object o) {
        final boolean empty = this.d.isEmpty();
        this.b().add(o);
        aezr.q(this.d.f);
        if (empty) {
            this.d.a();
        }
    }
    
    public final boolean hasPrevious() {
        return this.b().hasPrevious();
    }
    
    public final int nextIndex() {
        return this.b().nextIndex();
    }
    
    public final Object previous() {
        return this.b().previous();
    }
    
    public final int previousIndex() {
        return this.b().previousIndex();
    }
    
    public final void set(final Object o) {
        this.b().set(o);
    }
}
