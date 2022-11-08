import java.util.NoSuchElementException;
import java.util.AbstractCollection;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arfl implements Iterator
{
    int a;
    final /* synthetic */ AbstractCollection b;
    private final /* synthetic */ int c;
    
    public arfl(final aflg b, final int c) {
        this.c = c;
        this.b = (AbstractCollection)b;
        this.a = 0;
    }
    
    public arfl(final arfm b, final int c) {
        this.c = c;
        this.b = b;
        this.a = 0;
    }
    
    @Override
    public final boolean hasNext() {
        if (this.c != 0) {
            return this.a < ((aflg)this.b).size();
        }
        return this.a < ((arfm)this.b).a.size() || ((arfm)this.b).b.hasNext();
    }
    
    @Override
    public final Object next() {
        if (this.c == 0) {
            Object o;
            if (this.a < ((arfm)this.b).a.size()) {
                o = ((arfm)this.b).a.get(this.a++);
            }
            else {
                final arfm arfm = (arfm)this.b;
                arfm.a.add(arfm.b.next());
                o = this.next();
            }
            return o;
        }
        final int a = this.a;
        if (a < ((aflg)this.b).size()) {
            final aflg aflg = (aflg)this.b;
            final Object o2 = aflg.b.b[aflg.b() + a];
            this.a = a + 1;
            return o2;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        if (this.c != 0) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }
}
