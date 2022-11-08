import java.util.NoSuchElementException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.ListIterator;

// 
// Decompiled by Procyon v0.6.0
// 

public class gfz implements ListIterator
{
    public final Deque a;
    public final Deque b;
    public Object c;
    
    public gfz() {
        this.a = new ArrayDeque();
        this.b = new ArrayDeque();
        this.a();
    }
    
    public final void a() {
        this.c();
        this.b();
        this.c = null;
    }
    
    @Override
    public final void add(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    public final void b() {
        this.b.clear();
    }
    
    public final void c() {
        this.a.clear();
    }
    
    public final boolean d() {
        return this.c == null;
    }
    
    @Override
    public final boolean hasNext() {
        return !this.d() && !this.b.isEmpty();
    }
    
    @Override
    public final boolean hasPrevious() {
        return !this.d() && !this.a.isEmpty();
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            this.a.offerFirst(this.c);
            return this.c = this.b.pollFirst();
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final int nextIndex() {
        if (this.d()) {
            return -1;
        }
        return this.a.size() + 1;
    }
    
    @Override
    public final Object previous() {
        if (this.hasPrevious()) {
            this.b.offerFirst(this.c);
            return this.c = this.a.pollFirst();
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final int previousIndex() {
        if (this.d()) {
            return -1;
        }
        return this.a.size() - 1;
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final void set(final Object c) {
        if (!this.d() && c != null) {
            this.c = c;
            return;
        }
        throw new IllegalStateException();
    }
}
