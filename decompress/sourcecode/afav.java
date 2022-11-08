import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afav implements Iterator
{
    int a;
    int b;
    int c;
    final /* synthetic */ afaw d;
    
    public afav(final afaw d) {
        this.d = d;
        this.a = d.b;
        this.b = d.a();
        this.c = -1;
    }
    
    private final void a() {
        if (this.d.b == this.a) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final boolean hasNext() {
        return this.b >= 0;
    }
    
    @Override
    public final Object next() {
        this.a();
        if (this.hasNext()) {
            final int b = this.b;
            this.c = b;
            final Object c = this.d.c(b);
            this.b = this.d.b(this.b);
            return c;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        this.a();
        ahbz.ax(this.c >= 0);
        this.a += 32;
        final afaw d = this.d;
        d.remove(d.c(this.c));
        --this.b;
        this.c = -1;
    }
}
