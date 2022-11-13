import java.util.Map;
import java.util.TreeMap;
import java.util.NavigableMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afkb
{
    public final NavigableMap a;
    
    private afkb() {
        this.a = new TreeMap();
    }
    
    public static afkb a() {
        return new afkb();
    }
    
    private final void f(final afde afde, final afde afde2, final Object o) {
        this.a.put(afde, new afka(afid.f(afde, afde2), o));
    }
    
    public final Object b(final Comparable comparable) {
        final Map.Entry<afde, afka> floorEntry = this.a.floorEntry(afde.f(comparable));
        Map.Entry<K, Object> entry;
        if (floorEntry != null && floorEntry.getValue().a.i(comparable)) {
            entry = (Map.Entry<K, Object>)floorEntry.getValue();
        }
        else {
            entry = null;
        }
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }
    
    public final Map c() {
        return (Map)new afjz(this, (Iterable)this.a.values());
    }
    
    public final void d() {
        this.a.clear();
    }
    
    public final void e(final afid afid, final Object o) {
        if (!afid.m()) {
            o.getClass();
            if (!afid.m()) {
                final Map.Entry<afde, afka> lowerEntry = this.a.lowerEntry(afid.b);
                if (lowerEntry != null) {
                    final afka afka = lowerEntry.getValue();
                    if (afka.a().a(afid.b) > 0) {
                        if (afka.a().a(afid.c) > 0) {
                            this.f(afid.c, afka.a(), lowerEntry.getValue().b);
                        }
                        this.f(afka.a.b, afid.b, lowerEntry.getValue().b);
                    }
                }
                final Map.Entry<afde, afka> lowerEntry2 = this.a.lowerEntry(afid.c);
                if (lowerEntry2 != null) {
                    final afka afka2 = lowerEntry2.getValue();
                    if (afka2.a().a(afid.c) > 0) {
                        this.f(afid.c, afka2.a(), lowerEntry2.getValue().b);
                    }
                }
                this.a.subMap(afid.b, afid.c).clear();
            }
            this.a.put(afid.b, new afka(afid, o));
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof afkb && this.c().equals(((afkb)o).c());
    }
    
    @Override
    public final int hashCode() {
        return this.c().hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a.values().toString();
    }
}
