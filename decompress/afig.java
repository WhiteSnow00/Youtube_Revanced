import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afig implements Iterator
{
    public final Iterator a;
    public boolean b;
    public Object c;
    
    public afig(final Iterator a) {
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
        adme.U(this.b ^ true, "Can't remove after you've peeked at next");
        this.a.remove();
    }
}
