import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afiw extends afaz
{
    final Iterator a;
    final afix b;
    
    public afiw(final afix b) {
        this.b = b;
        this.a = b.a.iterator();
    }
    
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
