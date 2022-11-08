import java.util.Iterator;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ked implements acme
{
    private final Set a;
    
    public ked(final Set set) {
        this.a = (Set)afdu.p((Collection)set);
    }
    
    @Override
    public final Object a(final Object o) {
        final Iterator iterator = this.a.iterator();
        Object o2 = o;
        Object a;
        do {
            a = o2;
            if (!iterator.hasNext()) {
                break;
            }
            a = ((acme)iterator.next()).a(o2);
        } while ((o2 = a) == o);
        return a;
    }
}
