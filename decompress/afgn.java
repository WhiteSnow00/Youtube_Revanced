import java.util.NoSuchElementException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afgn implements Iterator
{
    private Iterator a;
    private Iterator b;
    private Iterator c;
    private Deque d;
    
    public afgn(final Iterator c) {
        this.b = (Iterator)afgm.a;
        this.c = c;
    }
    
    @Override
    public final boolean hasNext() {
        while (true) {
            final Iterator b = this.b;
            b.getClass();
            if (b.hasNext()) {
                return true;
            }
            Iterator c2;
            while (true) {
                final Iterator c = this.c;
                if (c != null && c.hasNext()) {
                    c2 = this.c;
                    break;
                }
                final Deque d = this.d;
                if (d == null || d.isEmpty()) {
                    c2 = null;
                    break;
                }
                this.c = this.d.removeFirst();
            }
            this.c = c2;
            if (c2 == null) {
                return false;
            }
            final Iterator b2 = c2.next();
            this.b = b2;
            if (!(b2 instanceof afgn)) {
                continue;
            }
            final afgn afgn = (afgn)b2;
            this.b = afgn.b;
            if (this.d == null) {
                this.d = new ArrayDeque();
            }
            this.d.addFirst(this.c);
            if (afgn.d != null) {
                while (!afgn.d.isEmpty()) {
                    this.d.addFirst(afgn.d.removeLast());
                }
            }
            this.c = afgn.c;
        }
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            final Iterator b = this.b;
            this.a = b;
            return b.next();
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        final Iterator a = this.a;
        if (a != null) {
            a.remove();
            this.a = null;
            return;
        }
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
