import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afgp implements Iterator
{
    public final Iterator a;
    public boolean b;
    public Object c;
    
    public afgp(final Iterator a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final boolean hasNext() {
        return this.b || this.a.hasNext();
    }
    
    @Override
    public final Object next() {
        if (!this.b) {
            return this.a.next();
        }
        final Object c = this.c;
        this.b = false;
        this.c = null;
        return c;
    }
    
    @Override
    public final void remove() {
        adkp.R(this.b ^ true, (Object)"Can't remove after you've peeked at next");
        this.a.remove();
    }
}
