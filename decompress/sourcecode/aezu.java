import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class aezu implements Iterator
{
    int b;
    int c;
    int d;
    final /* synthetic */ aezv e;
    
    public aezu(final aezv e) {
        this.e = e;
        this.b = e.a.a();
        this.c = -1;
        this.d = e.a.d;
    }
    
    private final void b() {
        if (this.e.a.d == this.d) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    public abstract Object a(final int p0);
    
    @Override
    public final boolean hasNext() {
        this.b();
        return this.b >= 0;
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            final Object a = this.a(this.b);
            final int b = this.b;
            this.c = b;
            this.b = this.e.a.e(b);
            return a;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        this.b();
        ahbz.ax(this.c != -1);
        final aezv e = this.e;
        e.b -= e.a.g(this.c);
        --this.b;
        this.c = -1;
        this.d = this.e.a.d;
    }
}
