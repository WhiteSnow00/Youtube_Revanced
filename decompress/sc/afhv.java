import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afhv implements Iterator
{
    private final afhr a;
    private final Iterator b;
    private int c;
    private int d;
    private boolean e;
    private afhs f;
    
    public afhv(final afhr a, final Iterator b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean hasNext() {
        return this.c > 0 || this.b.hasNext();
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            int d;
            if ((d = this.c) == 0) {
                final afhs f = this.b.next();
                this.f = f;
                d = f.a();
                this.d = d;
            }
            this.c = d - 1;
            this.e = true;
            final afhs f2 = this.f;
            f2.getClass();
            return f2.a;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        aefb.I(this.e);
        if (this.d == 1) {
            this.b.remove();
        }
        else {
            final afhr a = this.a;
            final afhs f = this.f;
            f.getClass();
            a.remove(f.a);
        }
        --this.d;
        this.e = false;
    }
}
