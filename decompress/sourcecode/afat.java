import java.util.Map;
import java.util.Iterator;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

final class afat extends AbstractCollection
{
    final /* synthetic */ afau a;
    
    public afat(final afau a) {
        this.a = a;
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final Iterator iterator() {
        final afau a = this.a;
        final Map l = a.l();
        Object iterator;
        if (l != null) {
            iterator = l.values().iterator();
        }
        else {
            iterator = new afao(a);
        }
        return (Iterator)iterator;
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
