import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afjd extends afjc implements SortedSet
{
    public afjd(final SortedSet set, final aezs aezs) {
        super((Set)set, aezs);
    }
    
    public final Comparator comparator() {
        return ((SortedSet)this.a).comparator();
    }
    
    public final Object first() {
        final Iterator iterator = this.a.iterator();
        final aezs b = this.b;
        iterator.getClass();
        b.getClass();
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (b.a(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }
    
    public final SortedSet headSet(final Object o) {
        return new afjd(((SortedSet)this.a).headSet(o), this.b);
    }
    
    public final Object last() {
        SortedSet<Object> headSet = (SortedSet<Object>)this.a;
        Object last;
        while (true) {
            last = headSet.last();
            if (this.b.a(last)) {
                break;
            }
            headSet = headSet.headSet(last);
        }
        return last;
    }
    
    public final SortedSet subSet(final Object o, final Object o2) {
        return new afjd(((SortedSet)this.a).subSet(o, o2), this.b);
    }
    
    public final SortedSet tailSet(final Object o) {
        return new afjd(((SortedSet)this.a).tailSet(o), this.b);
    }
}