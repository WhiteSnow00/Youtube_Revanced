import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaot implements aaod
{
    private final Set a;
    
    public aaot(final aaod... array) {
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        for (int i = 0; i < 2; ++i) {
            this.a(array[i]);
        }
    }
    
    public final void a(final aaod aaod) {
        this.a.add(aaod);
    }
    
    @Override
    public final void mk() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aaod)iterator.next()).mk();
        }
    }
    
    @Override
    public final void n(final angg angg, final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aaod)iterator.next()).n(angg, b);
        }
    }
    
    @Override
    public final void o(final long n, final long n2) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aaod)iterator.next()).o(n, n2);
        }
    }
}
