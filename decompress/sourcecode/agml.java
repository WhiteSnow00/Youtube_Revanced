import java.util.Iterator;
import java.util.Set;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agml implements afks
{
    private static final afjp a;
    private final atjj b;
    
    static {
        a = (afjp)new agmk("", (Collection)afcr.q());
    }
    
    public agml(final atjj b) {
        this.b = b;
    }
    
    public final afjp a(final String s) {
        final Set set = (Set)((arje)this.b).a;
        final int size = set.size();
        if (size == 0) {
            return agml.a;
        }
        if (size != 1) {
            final afcm h = afcr.h(size);
            final Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                h.h(((afks)iterator.next()).a(s));
            }
            return (afjp)new agmk(s, (Collection)h.g());
        }
        return set.iterator().next().a(s);
    }
}
