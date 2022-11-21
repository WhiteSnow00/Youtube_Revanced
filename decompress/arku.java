import java.util.NoSuchElementException;
import java.util.AbstractCollection;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arku implements Iterator
{
    int a;
    final AbstractCollection b;
    private final int c;
    
    public arku(final afow b, final int c) {
        this.c = c;
        this.b = (AbstractCollection)b;
        this.a = 0;
    }
    
    public arku(final arkv b, final int c) {
        this.c = c;
        this.b = b;
        this.a = 0;
    }
    
    @Override
    public final boolean hasNext() {
        if (this.c != 0) {
            return this.a < ((afow)this.b).size();
        }
        return this.a < ((arkv)this.b).a.size() || ((arkv)this.b).b.hasNext();
    }
    
    @Override
    public final Object next() {
        if (this.c == 0) {
            Object o;
            if (this.a < ((arkv)this.b).a.size()) {
                o = ((arkv)this.b).a.get(this.a++);
            }
            else {
                final arkv arkv = (arkv)this.b;
                arkv.a.add(arkv.b.next());
                o = this.next();
            }
            return o;
        }
        final int a = this.a;
        if (a < ((afow)this.b).size()) {
            final afow afow = (afow)this.b;
            final Object o2 = afow.b.b[afow.b() + a];
            this.a = a + 1;
            return o2;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        if (this.c != 0) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }
}
