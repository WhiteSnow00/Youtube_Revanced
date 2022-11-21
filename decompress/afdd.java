import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

// 
// Decompiled by Procyon v0.6.0
// 

class afdd extends afcy implements SortedSet
{
    final afdi c;
    
    public afdd(final afdi c, final SortedMap sortedMap) {
        super(this.c = c, sortedMap);
    }
    
    public SortedMap b() {
        return (SortedMap)super.d;
    }
    
    @Override
    public final Comparator comparator() {
        return this.b().comparator();
    }
    
    @Override
    public final Object first() {
        return this.b().firstKey();
    }
    
    @Override
    public SortedSet headSet(final Object o) {
        return new afdd(this.c, this.b().headMap(o));
    }
    
    @Override
    public final Object last() {
        return this.b().lastKey();
    }
    
    @Override
    public SortedSet subSet(final Object o, final Object o2) {
        return new afdd(this.c, this.b().subMap(o, o2));
    }
    
    @Override
    public SortedSet tailSet(final Object o) {
        return new afdd(this.c, this.b().tailMap(o));
    }
}
