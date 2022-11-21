import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class audz implements Iterator
{
    final auea a;
    private final int b;
    private int c;
    private boolean d;
    
    public audz(final auea a) {
        this.a = a;
        ++a.b;
        this.b = a.a.size();
    }
    
    private final void a() {
        if (!this.d) {
            this.d = true;
            final auea a = this.a;
            if (--a.b <= 0) {
                if (a.c) {
                    a.c = false;
                    int size = a.a.size();
                    while (--size >= 0) {
                        if (a.a.get(size) == null) {
                            a.a.remove(size);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public final boolean hasNext() {
        int c;
        for (c = this.c; c < this.b && this.a.a(c) == null; ++c) {}
        if (c < this.b) {
            return true;
        }
        this.a();
        return false;
    }
    
    @Override
    public final Object next() {
        while (true) {
            final int c = this.c;
            if (c >= this.b || this.a.a(c) != null) {
                break;
            }
            ++this.c;
        }
        final int c2 = this.c;
        if (c2 < this.b) {
            final auea a = this.a;
            this.c = c2 + 1;
            return a.a(c2);
        }
        this.a();
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
