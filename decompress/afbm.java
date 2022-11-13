import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

class afbm implements Iterator
{
    final Iterator a;
    final Collection b;
    final afbn c;
    
    public afbm(final afbn c) {
        this.c = c;
        this.b = c.b;
        final Collection b = c.b;
        Iterator a;
        if (b instanceof List) {
            a = ((List)b).listIterator();
        }
        else {
            a = b.iterator();
        }
        this.a = a;
    }
    
    public afbm(final afbn c, final Iterator a) {
        this.c = c;
        this.b = c.b;
        this.a = a;
    }
    
    final void a() {
        this.c.b();
        if (this.c.b == this.b) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final boolean hasNext() {
        this.a();
        return this.a.hasNext();
    }
    
    @Override
    public final Object next() {
        this.a();
        return this.a.next();
    }
    
    @Override
    public final void remove() {
        this.a.remove();
        afbq.r(this.c.e);
        this.c.c();
    }
}
