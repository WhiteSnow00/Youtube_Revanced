import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afiy extends afaz
{
    final Iterator a;
    final afiz b;
    
    public afiy(final afiz b) {
        this.b = b;
        this.a = b.a.iterator();
    }
    
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
