import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afzs
{
    public static final afzs a;
    public final Map b;
    
    static {
        a = new afzs(Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>()));
    }
    
    public afzs(final Map b) {
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof afzs && this.b.equals(((afzs)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.b.toString();
    }
}
