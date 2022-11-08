import java.util.SortedSet;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.NavigableMap;
import java.util.NavigableSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class aezj extends aezm implements NavigableSet
{
    final /* synthetic */ aezr b;
    
    public aezj(final aezr b, final NavigableMap navigableMap) {
        this.b = b;
        super(b, (SortedMap)navigableMap);
    }
    
    final NavigableMap a() {
        return (NavigableMap)super.b();
    }
    
    public final Object ceiling(final Object o) {
        return this.a().ceilingKey(o);
    }
    
    public final Iterator descendingIterator() {
        return this.descendingSet().iterator();
    }
    
    public final NavigableSet descendingSet() {
        return new aezj(this.b, this.a().descendingMap());
    }
    
    public final Object floor(final Object o) {
        return this.a().floorKey(o);
    }
    
    public final NavigableSet headSet(final Object o, final boolean b) {
        return new aezj(this.b, this.a().headMap(o, b));
    }
    
    public final Object higher(final Object o) {
        return this.a().higherKey(o);
    }
    
    public final Object lower(final Object o) {
        return this.a().lowerKey(o);
    }
    
    public final Object pollFirst() {
        return adwd.ax(((affh)this).iterator());
    }
    
    public final Object pollLast() {
        return adwd.ax(this.descendingIterator());
    }
    
    public final NavigableSet subSet(final Object o, final boolean b, final Object o2, final boolean b2) {
        return new aezj(this.b, this.a().subMap(o, b, o2, b2));
    }
    
    public final NavigableSet tailSet(final Object o, final boolean b) {
        return new aezj(this.b, this.a().tailMap(o, b));
    }
}
