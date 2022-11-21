import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afjl implements Iterator
{
    private final afjh a;
    private final Iterator b;
    private int c;
    private int d;
    private boolean e;
    private afji f;
    
    public afjl(final afjh a, final Iterator b) {
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
                final afji f = this.b.next();
                this.f = f;
                d = f.a();
                this.d = d;
            }
            this.c = d - 1;
            this.e = true;
            final afji f2 = this.f;
            f2.getClass();
            return f2.a;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        adzw.G(this.e);
        if (this.d == 1) {
            this.b.remove();
        }
        else {
            final afjh a = this.a;
            final afji f = this.f;
            f.getClass();
            a.remove(f.a);
        }
        --this.d;
        this.e = false;
    }
}
