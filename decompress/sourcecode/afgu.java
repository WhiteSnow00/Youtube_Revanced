import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afgu extends aeza
{
    final Iterator a;
    final Iterator b;
    final /* synthetic */ afgv c;
    
    public afgu(final afgv c) {
        this.c = c;
        this.a = c.a.iterator();
        this.b = (Iterator)((afhg)c.b).k();
    }
    
    @Override
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
