import java.util.Iterator;
import java.util.Set;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoj implements afms
{
    private static final aflp a;
    private final atke b;
    
    static {
        a = (aflp)new agoi("", (Collection)afeq.q());
    }
    
    public agoj(final atke b) {
        this.b = b;
    }
    
    public final aflp a(final String s) {
        final Set set = (Set)((arlt)this.b).a;
        final int size = set.size();
        if (size == 0) {
            return agoj.a;
        }
        if (size != 1) {
            final afel h = afeq.h(size);
            final Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                h.h(((afms)iterator.next()).a(s));
            }
            return (aflp)new agoi(s, (Collection)h.g());
        }
        return set.iterator().next().a(s);
    }
}
