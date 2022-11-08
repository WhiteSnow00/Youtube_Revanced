import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afgy extends aeza
{
    final Iterator a;
    final /* synthetic */ afgz b;
    
    public afgy(final afgz b) {
        this.b = b;
        this.a = b.a.iterator();
    }
    
    @Override
    protected final Object a() {
        while (this.a.hasNext()) {
            final Object next = this.a.next();
            if (!this.b.b.contains(next)) {
                return next;
            }
        }
        this.b();
        return null;
    }
}
