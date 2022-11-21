import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.List;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arkv extends AbstractList
{
    private static final arkw c;
    final List a;
    final Iterator b;
    
    static {
        c = arkw.d(arkv.class);
    }
    
    public arkv(final List a, final Iterator b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object get(final int n) {
        if (this.a.size() > n) {
            return this.a.get(n);
        }
        if (this.b.hasNext()) {
            this.a.add(this.b.next());
            return this.get(n);
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final Iterator iterator() {
        return new arku(this, 0);
    }
    
    @Override
    public final int size() {
        final arkw c = arkv.c;
        c.a("potentially expensive size() call");
        c.a("blowup running");
        while (this.b.hasNext()) {
            this.a.add(this.b.next());
        }
        return this.a.size();
    }
}
