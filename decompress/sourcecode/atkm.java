import java.util.NoSuchElementException;
import java.util.ListIterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class atkm implements ListIterator, atnq
{
    private final atkn a;
    private int b;
    private int c;
    
    public atkm(final atkn a, final int b) {
        this.a = a;
        this.b = b;
        this.c = -1;
    }
    
    @Override
    public final void add(final Object o) {
        this.a.add(this.b++, o);
        this.c = -1;
    }
    
    @Override
    public final boolean hasNext() {
        return this.b < this.a.c;
    }
    
    @Override
    public final boolean hasPrevious() {
        return this.b > 0;
    }
    
    @Override
    public final Object next() {
        final int b = this.b;
        final atkn a = this.a;
        if (b < a.c) {
            this.b = b + 1;
            this.c = b;
            return a.a[a.b + b];
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final int nextIndex() {
        return this.b;
    }
    
    @Override
    public final Object previous() {
        int b = this.b;
        if (b > 0) {
            --b;
            this.b = b;
            this.c = b;
            final atkn a = this.a;
            return a.a[a.b + b];
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final int previousIndex() {
        return this.b - 1;
    }
    
    @Override
    public final void remove() {
        final int c = this.c;
        if (c != -1) {
            ((atkd)this.a).b(c);
            this.b = this.c;
            this.c = -1;
            return;
        }
        throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
    }
    
    @Override
    public final void set(final Object o) {
        final int c = this.c;
        if (c != -1) {
            this.a.set(c, o);
            return;
        }
        throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
    }
}
