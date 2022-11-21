import java.util.Set;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;
import java.util.SortedMap;

// 
// Decompiled by Procyon v0.6.0
// 

class afdc extends afcv implements SortedMap
{
    SortedSet d;
    final afdi e;
    
    public afdc(final afdi e, final SortedMap sortedMap) {
        super(this.e = e, sortedMap);
    }
    
    @Override
    public final Comparator comparator() {
        return this.h().comparator();
    }
    
    @Override
    public final Object firstKey() {
        return this.h().firstKey();
    }
    
    @Override
    public /* bridge */ Set g() {
        return this.i();
    }
    
    public SortedMap h() {
        return (SortedMap)this.a;
    }
    
    @Override
    public SortedMap headMap(final Object o) {
        return new afdc(this.e, this.h().headMap(o));
    }
    
    public SortedSet i() {
        return new afdd(this.e, this.h());
    }
    
    public SortedSet j() {
        SortedSet d;
        if ((d = this.d) == null) {
            d = this.i();
            this.d = d;
        }
        return d;
    }
    
    @Override
    public /* bridge */ Set keySet() {
        return this.j();
    }
    
    @Override
    public final Object lastKey() {
        return this.h().lastKey();
    }
    
    @Override
    public SortedMap subMap(final Object o, final Object o2) {
        return new afdc(this.e, this.h().subMap(o, o2));
    }
    
    @Override
    public SortedMap tailMap(final Object o) {
        return new afdc(this.e, this.h().tailMap(o));
    }
}
