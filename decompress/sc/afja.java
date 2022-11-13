import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afja extends afaz
{
    final Iterator a;
    final Iterator b;
    final afjb c;
    
    public afja(final afjb c, final Iterator a, final Iterator b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final Object a() {
        while (this.a.hasNext()) {
            final Object next = this.a.next();
            if (!this.c.b.contains(next)) {
                return next;
            }
        }
        while (this.b.hasNext()) {
            final Object next2 = this.b.next();
            if (!this.c.a.contains(next2)) {
                return next2;
            }
        }
        this.b();
        return null;
    }
}
