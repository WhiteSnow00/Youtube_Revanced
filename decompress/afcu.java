import java.util.Map;
import java.util.Collection;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afcu implements Iterator
{
    final Iterator a;
    Collection b;
    final afcv c;
    
    public afcu(final afcv c) {
        this.c = c;
        this.a = c.a.entrySet().iterator();
    }
    
    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }
    
    @Override
    public final /* bridge */ Object next() {
        final Map.Entry<K, Collection> entry = this.a.next();
        this.b = entry.getValue();
        return this.c.a((Map.Entry)entry);
    }
    
    @Override
    public final void remove() {
        adme.U(this.b != null, "no calls to next() since the last call to remove()");
        this.a.remove();
        afdi.t(this.c.b, this.b.size());
        this.b.clear();
        this.b = null;
    }
}
