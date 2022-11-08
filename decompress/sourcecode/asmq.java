import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asmq implements Iterator
{
    final /* synthetic */ atjh a;
    private Object b;
    
    public asmq(final atjh a) {
        this.a = a;
    }
    
    @Override
    public final boolean hasNext() {
        final Object b = this.a.b;
        this.b = b;
        return !atht.g(b);
    }
    
    @Override
    public final Object next() {
        try {
            if (this.b == null) {
                this.b = this.a.b;
            }
            if (atht.g(this.b)) {
                throw new NoSuchElementException();
            }
            if (!atht.h(this.b)) {
                return this.b;
            }
            throw athp.b(atht.d(this.b));
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
