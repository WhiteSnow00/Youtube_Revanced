import java.util.SortedSet;
import java.util.Set;
import java.util.NavigableSet;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.NavigableMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class afcz extends afdc implements NavigableMap
{
    final afdi c;
    
    public afcz(final afdi c, final NavigableMap navigableMap) {
        super(this.c = c, navigableMap);
    }
    
    final Entry c(final Iterator iterator) {
        if (!iterator.hasNext()) {
            return null;
        }
        final Map.Entry<K, Collection> entry = iterator.next();
        final Collection a = this.c.a();
        a.addAll(entry.getValue());
        iterator.remove();
        return agpx.I(entry.getKey(), Collections.unmodifiableList((List<?>)a));
    }
    
    @Override
    public final Entry ceilingEntry(final Object o) {
        final Map.Entry<Object, Object> ceilingEntry = this.d().ceilingEntry(o);
        if (ceilingEntry == null) {
            return null;
        }
        return this.a((Entry)ceilingEntry);
    }
    
    @Override
    public final Object ceilingKey(final Object o) {
        return this.d().ceilingKey(o);
    }
    
    final NavigableMap d() {
        return (NavigableMap)super.h();
    }
    
    @Override
    public final NavigableSet descendingKeySet() {
        return ((afcz)this.descendingMap()).f();
    }
    
    @Override
    public final NavigableMap descendingMap() {
        return new afcz(this.c, this.d().descendingMap());
    }
    
    final NavigableSet e() {
        return (NavigableSet)new afda(this.c, this.d());
    }
    
    public final NavigableSet f() {
        return (NavigableSet)super.j();
    }
    
    @Override
    public final Entry firstEntry() {
        final Map.Entry firstEntry = this.d().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return this.a((Entry)firstEntry);
    }
    
    @Override
    public final Entry floorEntry(final Object o) {
        final Map.Entry<Object, Object> floorEntry = this.d().floorEntry(o);
        if (floorEntry == null) {
            return null;
        }
        return this.a((Entry)floorEntry);
    }
    
    @Override
    public final Object floorKey(final Object o) {
        return this.d().floorKey(o);
    }
    
    @Override
    public final /* bridge */ Set g() {
        return this.e();
    }
    
    @Override
    public final /* bridge */ SortedMap h() {
        return this.d();
    }
    
    @Override
    public final NavigableMap headMap(final Object o, final boolean b) {
        return new afcz(this.c, this.d().headMap(o, b));
    }
    
    @Override
    public final /* bridge */ SortedMap headMap(final Object o) {
        return this.headMap(o, false);
    }
    
    @Override
    public final Entry higherEntry(final Object o) {
        final Map.Entry<Object, Object> higherEntry = this.d().higherEntry(o);
        if (higherEntry == null) {
            return null;
        }
        return this.a((Entry)higherEntry);
    }
    
    @Override
    public final Object higherKey(final Object o) {
        return this.d().higherKey(o);
    }
    
    @Override
    public final /* bridge */ SortedSet i() {
        return this.e();
    }
    
    @Override
    public final /* bridge */ SortedSet j() {
        return this.f();
    }
    
    @Override
    public final /* bridge */ Set keySet() {
        return this.f();
    }
    
    @Override
    public final Entry lastEntry() {
        final Map.Entry lastEntry = this.d().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return this.a((Entry)lastEntry);
    }
    
    @Override
    public final Entry lowerEntry(final Object o) {
        final Map.Entry<Object, Object> lowerEntry = this.d().lowerEntry(o);
        if (lowerEntry == null) {
            return null;
        }
        return this.a((Entry)lowerEntry);
    }
    
    @Override
    public final Object lowerKey(final Object o) {
        return this.d().lowerKey(o);
    }
    
    @Override
    public final NavigableSet navigableKeySet() {
        return this.f();
    }
    
    @Override
    public final Entry pollFirstEntry() {
        return this.c(this.entrySet().iterator());
    }
    
    @Override
    public final Entry pollLastEntry() {
        return this.c(this.descendingMap().entrySet().iterator());
    }
    
    @Override
    public final NavigableMap subMap(final Object o, final boolean b, final Object o2, final boolean b2) {
        return new afcz(this.c, this.d().subMap(o, b, o2, b2));
    }
    
    @Override
    public final /* bridge */ SortedMap subMap(final Object o, final Object o2) {
        return this.subMap(o, true, o2, false);
    }
    
    @Override
    public final NavigableMap tailMap(final Object o, final boolean b) {
        return new afcz(this.c, this.d().tailMap(o, b));
    }
    
    @Override
    public final /* bridge */ SortedMap tailMap(final Object o) {
        return this.tailMap(o, true);
    }
}
