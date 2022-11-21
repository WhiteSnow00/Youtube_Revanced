import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afbb extends afbd
{
    final afbd a;
    
    public afbb(final afbd a, final afbd afbd) {
        this.a = a;
        super(afbd);
    }
    
    @Override
    public final void a(final Appendable appendable, final Iterator iterator) {
        iterator.getClass();
        while (true) {
            while (iterator.hasNext()) {
                final Object next = iterator.next();
                if (next != null) {
                    appendable.append(afbd.g(next));
                    while (iterator.hasNext()) {
                        final Object next2 = iterator.next();
                        if (next2 != null) {
                            appendable.append(this.a.b);
                            appendable.append(afbd.g(next2));
                        }
                    }
                    return;
                }
            }
            continue;
        }
    }
}
