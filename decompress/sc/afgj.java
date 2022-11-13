import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afgj extends afaz
{
    final Iterator a;
    final aezs b;
    
    public afgj(final Iterator a, final aezs b) {
        this.a = a;
        this.b = b;
    }
    
    protected final Object a() {
        while (this.a.hasNext()) {
            final Object next = this.a.next();
            if (this.b.a(next)) {
                return next;
            }
        }
        this.b();
        return null;
    }
}
