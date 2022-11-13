import java.util.Set;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;
import java.util.SortedMap;

// 
// Decompiled by Procyon v0.6.0
// 

class afbk extends afbd implements SortedMap
{
    SortedSet d;
    final afbq e;
    
    public afbk(final afbq e, final SortedMap sortedMap) {
        super(this.e = e, (Map)sortedMap);
    }
    
    public final Comparator comparator() {
        return this.h().comparator();
    }
    
    public final Object firstKey() {
        return this.h().firstKey();
    }
    
    public /* bridge */ Set g() {
        return this.i();
    }
    
    public SortedMap h() {
        return (SortedMap)this.a;
    }
    
    public SortedMap headMap(final Object o) {
        return new afbk(this.e, this.h().headMap(o));
    }
    
    public SortedSet i() {
        return (SortedSet)new afbl(this.e, this.h());
    }
    
    public SortedSet j() {
        SortedSet d;
        if ((d = this.d) == null) {
            d = this.i();
            this.d = d;
        }
        return d;
    }
    
    public /* bridge */ Set keySet() {
        return this.j();
    }
    
    public final Object lastKey() {
        return this.h().lastKey();
    }
    
    public SortedMap subMap(final Object o, final Object o2) {
        return new afbk(this.e, this.h().subMap(o, o2));
    }
    
    public SortedMap tailMap(final Object o) {
        return new afbk(this.e, this.h().tailMap(o));
    }
}
