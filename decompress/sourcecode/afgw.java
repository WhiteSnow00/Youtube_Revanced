import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afgw extends aeza
{
    final Iterator a;
    final /* synthetic */ afgx b;
    
    public afgw(final afgx b) {
        this.b = b;
        this.a = b.a.iterator();
    }
    
    @Override
    protected final Object a() {
        while (this.a.hasNext()) {
            final Object next = this.a.next();
            if (this.b.b.contains(next)) {
                return next;
            }
        }
        this.b();
        return null;
    }
}
