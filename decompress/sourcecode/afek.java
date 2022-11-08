import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afek extends aeza
{
    final /* synthetic */ Iterator a;
    final /* synthetic */ aext b;
    
    public afek(final Iterator a, final aext b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
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
