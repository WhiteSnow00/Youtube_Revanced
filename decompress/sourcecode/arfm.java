import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.List;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arfm extends AbstractList
{
    private static final arfn c;
    final List a;
    final Iterator b;
    
    static {
        c = arfn.d(arfm.class);
    }
    
    public arfm(final List a, final Iterator b) {
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
        return new arfl(this, 0);
    }
    
    @Override
    public final int size() {
        final arfn c = arfm.c;
        c.a("potentially expensive size() call");
        c.a("blowup running");
        while (this.b.hasNext()) {
            this.a.add(this.b.next());
        }
        return this.a.size();
    }
}
