import java.util.Set;
import java.util.Map;
import java.util.AbstractMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agzx extends AbstractMap
{
    public final agzu a;
    private final Map b;
    
    public agzx(final Map b, final agzu a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Set entrySet() {
        return new agzw(this, this.b.entrySet());
    }
    
    @Override
    public final Object get(Object value) {
        value = this.b.get(value);
        if (value == null) {
            return null;
        }
        return this.a.a(value);
    }
    
    @Override
    public final Object put(Object put, final Object o) {
        put = this.b.put(put, agzu.b(o));
        if (put == null) {
            return null;
        }
        return this.a.a(put);
    }
}
