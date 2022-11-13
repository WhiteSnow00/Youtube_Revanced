import java.util.Iterator;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

final class afob extends afaz
{
    final Deque a;
    final Deque b;
    
    public afob(final Deque a, final Deque b) {
        this.a = a;
        this.b = b;
    }
    
    protected final Object a() {
        Deque deque = this.a;
        while (true) {
            final Object f = aeuz.f(deque);
            if (f != null) {
                final Iterator iterator = afpo.a(f).iterator();
                if (!iterator.hasNext()) {
                    return f;
                }
                this.a.addFirst(iterator);
                this.b.push(f);
                deque = this.a;
            }
            else {
                if (!this.b.isEmpty()) {
                    return this.b.pop();
                }
                this.b();
                return null;
            }
        }
    }
}
