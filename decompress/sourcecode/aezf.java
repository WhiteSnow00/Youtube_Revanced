import java.util.Map;
import java.util.Collection;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class aezf implements Iterator
{
    final Iterator a;
    Collection b;
    Iterator c;
    final /* synthetic */ aezr d;
    
    public aezf(final aezr d) {
        this.d = d;
        this.a = d.a.entrySet().iterator();
        this.b = null;
        this.c = (Iterator)afep.a;
    }
    
    @Override
    public final boolean hasNext() {
        return this.a.hasNext() || this.c.hasNext();
    }
    
    @Override
    public final Object next() {
        if (!this.c.hasNext()) {
            final Map.Entry<K, Collection> entry = this.a.next();
            entry.getKey();
            final Collection b = entry.getValue();
            this.b = b;
            this.c = b.iterator();
        }
        return this.c.next();
    }
    
    @Override
    public final void remove() {
        this.c.remove();
        final Collection b = this.b;
        b.getClass();
        if (b.isEmpty()) {
            this.a.remove();
        }
        aezr.r(this.d);
    }
}
