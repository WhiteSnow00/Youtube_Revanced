import java.util.ListIterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class aheb implements ListIterator
{
    final ListIterator a;
    final int b;
    final ahec c;
    
    public aheb(final ahec c, final int b) {
        this.c = c;
        this.b = b;
        this.a = c.a.listIterator(b);
    }
    
    @Override
    public final /* bridge */ void add(final Object o) {
        final String s = (String)o;
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }
    
    @Override
    public final boolean hasPrevious() {
        return this.a.hasPrevious();
    }
    
    @Override
    public final /* bridge */ Object next() {
        return this.a.next();
    }
    
    @Override
    public final int nextIndex() {
        return this.a.nextIndex();
    }
    
    @Override
    public final /* bridge */ Object previous() {
        return this.a.previous();
    }
    
    @Override
    public final int previousIndex() {
        return this.a.previousIndex();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final /* bridge */ void set(final Object o) {
        final String s = (String)o;
        throw new UnsupportedOperationException();
    }
}
