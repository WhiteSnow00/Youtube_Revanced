import java.util.Iterator;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

final class afmb extends aeza
{
    final /* synthetic */ Deque a;
    final /* synthetic */ Deque b;
    
    public afmb(final Deque a, final Deque b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    protected final Object a() {
        Deque deque = this.a;
        while (true) {
            final Object j = alhb.J(deque);
            if (j != null) {
                final Iterator iterator = aety.f(j).iterator();
                if (!iterator.hasNext()) {
                    return j;
                }
                this.a.addFirst(iterator);
                this.b.push(j);
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
