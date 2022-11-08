import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahaf implements Iterator
{
    private final Iterator a;
    
    public ahaf(final Iterator a) {
        this.a = a;
    }
    
    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }
    
    @Override
    public final void remove() {
        this.a.remove();
    }
}
