import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afdy implements Iterator
{
    final afdz a;
    private int b;
    private int c;
    private int d;
    private int e;
    
    public afdy(final afdz a) {
        this.a = a;
        final afea b = a.b;
        this.b = b.e;
        this.c = -1;
        this.d = b.d;
        this.e = b.c;
    }
    
    private final void a() {
        if (this.a.b.d == this.d) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final boolean hasNext() {
        this.a();
        return this.b != -2 && this.e > 0;
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            final Object a = this.a.a(this.b);
            final int b = this.b;
            this.c = b;
            this.b = this.a.b.f[b];
            --this.e;
            return a;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        this.a();
        aefb.I(this.c != -1);
        final afea b = this.a.b;
        final int c = this.c;
        b.k(c, agpc.ah(b.a[c]));
        final int b2 = this.b;
        final afea b3 = this.a.b;
        if (b2 == b3.c) {
            this.b = this.c;
        }
        this.c = -1;
        this.d = b3.d;
    }
}
