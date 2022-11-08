import java.util.Set;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;
import java.util.SortedMap;

// 
// Decompiled by Procyon v0.6.0
// 

class aezl extends aeze implements SortedMap
{
    SortedSet d;
    final /* synthetic */ aezr e;
    
    public aezl(final aezr e, final SortedMap sortedMap) {
        this.e = e;
        super(e, sortedMap);
    }
    
    @Override
    public final Comparator comparator() {
        return this.h().comparator();
    }
    
    @Override
    public final Object firstKey() {
        return this.h().firstKey();
    }
    
    public SortedMap h() {
        return (SortedMap)this.a;
    }
    
    @Override
    public SortedMap headMap(final Object o) {
        return new aezl(this.e, this.h().headMap(o));
    }
    
    public SortedSet i() {
        return (SortedSet)new aezm(this.e, this.h());
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
    public final Object lastKey() {
        return this.h().lastKey();
    }
    
    @Override
    public SortedMap subMap(final Object o, final Object o2) {
        return new aezl(this.e, this.h().subMap(o, o2));
    }
    
    @Override
    public SortedMap tailMap(final Object o) {
        return new aezl(this.e, this.h().tailMap(o));
    }
}
