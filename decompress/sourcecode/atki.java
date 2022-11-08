import java.util.Collection;
import java.util.Set;
import java.io.Serializable;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atki implements Map, Serializable, atnq
{
    public static final atki a;
    private static final long serialVersionUID = 8246714829545688274L;
    
    static {
        a = new atki();
    }
    
    private atki() {
    }
    
    private final Object readResolve() {
        return atki.a;
    }
    
    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        return false;
    }
    
    @Override
    public final /* bridge */ boolean containsValue(final Object o) {
        if (!(o instanceof Void)) {
            return false;
        }
        o.getClass();
        return false;
    }
    
    @Override
    public final Set entrySet() {
        return atkj.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof Map && ((Map)o).isEmpty();
    }
    
    @Override
    public final int hashCode() {
        return 0;
    }
    
    @Override
    public final boolean isEmpty() {
        return true;
    }
    
    @Override
    public final Set keySet() {
        return atkj.a;
    }
    
    @Override
    public final void putAll(final Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ int size() {
        return 0;
    }
    
    @Override
    public final String toString() {
        return "{}";
    }
    
    @Override
    public final Collection values() {
        return atkh.a;
    }
}
