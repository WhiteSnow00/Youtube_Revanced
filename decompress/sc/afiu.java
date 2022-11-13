import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afiu extends afaz
{
    final Iterator a;
    final Iterator b;
    final afiv c;
    
    public afiu(final afiv c) {
        this.c = c;
        this.a = c.a.iterator();
        this.b = ((afjg)c.b).k();
    }
    
    protected final Object a() {
        if (!this.a.hasNext()) {
            Object next;
            do {
                final Iterator b = this.b;
                if (!b.hasNext()) {
                    this.b();
                    return null;
                }
                next = b.next();
            } while (this.c.a.contains(next));
            return next;
        }
        return this.a.next();
    }
}
