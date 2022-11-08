import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.IdentityHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arrg
{
    public static final arrg a;
    private static final IdentityHashMap c;
    public final IdentityHashMap b;
    
    static {
        a = new arrg(c = new IdentityHashMap());
    }
    
    public arrg(final IdentityHashMap b) {
        this.b = b;
    }
    
    public static auls b() {
        return new auls(arrg.a);
    }
    
    public final Object a(final arrf arrf) {
        return this.b.get(arrf);
    }
    
    public final auls c() {
        return new auls(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final arrg arrg = (arrg)o;
        if (this.b.size() != arrg.b.size()) {
            return false;
        }
        for (final Map.Entry<Object, V> entry : this.b.entrySet()) {
            if (!arrg.b.containsKey(entry.getKey())) {
                return false;
            }
            if (!aeda.v(entry.getValue(), arrg.b.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final Iterator iterator = this.b.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)iterator.next();
            n += Arrays.hashCode(new Object[] { entry.getKey(), entry.getValue() });
        }
        return n;
    }
    
    @Override
    public final String toString() {
        return this.b.toString();
    }
}
