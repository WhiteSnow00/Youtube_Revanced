import java.util.Map;
import java.util.Iterator;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

final class afcs extends AbstractCollection
{
    final afct a;
    
    public afcs(final afct a) {
        this.a = a;
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final Iterator iterator() {
        final afct a = this.a;
        final Map l = a.l();
        Object iterator;
        if (l != null) {
            iterator = l.values().iterator();
        }
        else {
            iterator = new afcn(a);
        }
        return (Iterator)iterator;
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
