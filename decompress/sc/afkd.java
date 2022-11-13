import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.NavigableMap;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afkd extends afbz implements Serializable
{
    final NavigableMap a;
    private transient Set b;
    
    private afkd(final NavigableMap a) {
        this.a = a;
    }
    
    public static afkd d() {
        return new afkd(new TreeMap());
    }
    
    private final void e(final afid afid) {
        if (afid.m()) {
            this.a.remove(afid.b);
            return;
        }
        this.a.put(afid.b, afid);
    }
    
    public final void a(final afid afid) {
        if (afid.m()) {
            return;
        }
        final afde b = afid.b;
        final afde c = afid.c;
        final Map.Entry<afde, Object> lowerEntry = this.a.lowerEntry(b);
        afde b2 = b;
        afde c2 = c;
        if (lowerEntry != null) {
            final afid afid2 = lowerEntry.getValue();
            b2 = b;
            c2 = c;
            if (afid2.c.a(b) >= 0) {
                c2 = c;
                if (afid2.c.a(c) >= 0) {
                    c2 = afid2.c;
                }
                b2 = afid2.b;
            }
        }
        final Map.Entry<afde, Object> floorEntry = this.a.floorEntry(c2);
        afde c3 = c2;
        if (floorEntry != null) {
            final afid afid3 = floorEntry.getValue();
            c3 = c2;
            if (afid3.c.a(c2) >= 0) {
                c3 = afid3.c;
            }
        }
        this.a.subMap(b2, c3).clear();
        this.e(afid.f(b2, c3));
    }
    
    public final void b(final afid afid) {
        afid.getClass();
        if (afid.m()) {
            return;
        }
        final Map.Entry<afde, afid> lowerEntry = this.a.lowerEntry(afid.b);
        if (lowerEntry != null) {
            final afid afid2 = lowerEntry.getValue();
            if (afid2.c.a(afid.b) >= 0) {
                if (afid.k() && afid2.c.a(afid.c) >= 0) {
                    this.e(afid.f(afid.c, afid2.c));
                }
                this.e(afid.f(afid2.b, afid.b));
            }
        }
        final Map.Entry<afde, afid> floorEntry = this.a.floorEntry(afid.c);
        if (floorEntry != null) {
            final afid afid3 = floorEntry.getValue();
            if (afid.k() && afid3.c.a(afid.c) >= 0) {
                this.e(afid.f(afid.c, afid3.c));
            }
        }
        this.a.subMap(afid.b, afid.c).clear();
    }
    
    public final Set c() {
        Set b;
        if ((b = this.b) == null) {
            b = new afkc(this.a.values());
            this.b = b;
        }
        return b;
    }
}
