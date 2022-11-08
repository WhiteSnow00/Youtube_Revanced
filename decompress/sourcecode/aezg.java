import java.util.Collection;
import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class aezg implements Iterator
{
    Map.Entry a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ aezh c;
    
    public aezg(final aezh c, final Iterator b) {
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
        agot.E(this.a != null, (Object)"no calls to next() since the last call to remove()");
        final Collection collection = this.a.getValue();
        this.b.remove();
        aezr.t(this.c.a, collection.size());
        collection.clear();
        this.a = null;
    }
}
