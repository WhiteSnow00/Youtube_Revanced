import java.util.Collection;
import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afcx implements Iterator
{
    Map.Entry a;
    final Iterator b;
    final afcy c;
    
    public afcx(final afcy c, final Iterator b) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }
    
    @Override
    public final Object next() {
        final Map.Entry<Object, V> a = this.b.next();
        this.a = (Map.Entry)a;
        return a.getKey();
    }
    
    @Override
    public final void remove() {
        adme.U(this.a != null, "no calls to next() since the last call to remove()");
        final Collection collection = this.a.getValue();
        this.b.remove();
        afdi.t(this.c.a, collection.size());
        collection.clear();
        this.a = null;
    }
}
