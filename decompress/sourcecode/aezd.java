import java.util.Map;
import java.util.Collection;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class aezd implements Iterator
{
    final Iterator a;
    Collection b;
    final /* synthetic */ aeze c;
    
    public aezd(final aeze c) {
        this.c = c;
        this.a = c.a.entrySet().iterator();
    }
    
    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }
    
    @Override
    public final void remove() {
        agot.E(this.b != null, (Object)"no calls to next() since the last call to remove()");
        this.a.remove();
        aezr.t(this.c.b, this.b.size());
        this.b.clear();
        this.b = null;
    }
}
