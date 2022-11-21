import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asqb implements Iterator
{
    final atmz a;
    private Object b;
    
    public asqb(final atmz a) {
        this.a = a;
    }
    
    @Override
    public final boolean hasNext() {
        final Object b = this.a.b;
        this.b = b;
        return !atli.g(b);
    }
    
    @Override
    public final Object next() {
        try {
            if (this.b == null) {
                this.b = this.a.b;
            }
            if (atli.g(this.b)) {
                throw new NoSuchElementException();
            }
            if (!atli.h(this.b)) {
                return this.b;
            }
            throw atle.b(atli.d(this.b));
        }
        finally {
            this.b = null;
        }
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Read only iterator");
    }
}
