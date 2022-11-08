import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class afaq implements Iterator
{
    int b;
    int c;
    int d;
    final /* synthetic */ afau e;
    
    public afaq(final afau e) {
        this.e = e;
        this.b = e.e;
        this.c = e.a();
        this.d = -1;
    }
    
    private final void b() {
        if (this.e.e == this.b) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    public abstract Object a(final int p0);
    
    @Override
    public final boolean hasNext() {
        return this.c >= 0;
    }
    
    @Override
    public final Object next() {
        this.b();
        if (this.hasNext()) {
            final int c = this.c;
            this.d = c;
            final Object a = this.a(c);
            this.c = this.e.b(this.c);
            return a;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        this.b();
        ahbz.ax(this.d >= 0);
        this.b += 32;
        final afau e = this.e;
        e.remove(e.g(this.d));
        --this.c;
        this.d = -1;
    }
}
