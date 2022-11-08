import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class aexk extends aexm
{
    final /* synthetic */ aexm a;
    
    public aexk(final aexm a, final aexm aexm) {
        this.a = a;
        super(aexm);
    }
    
    public final void a(final Appendable appendable, final Iterator iterator) {
        iterator.getClass();
        while (true) {
            while (iterator.hasNext()) {
                final Object next = iterator.next();
                if (next != null) {
                    appendable.append(aexm.g(next));
                    while (iterator.hasNext()) {
                        final Object next2 = iterator.next();
                        if (next2 != null) {
                            appendable.append(this.a.b);
                            appendable.append(aexm.g(next2));
                        }
                    }
                    return;
                }
            }
            continue;
        }
    }
}
