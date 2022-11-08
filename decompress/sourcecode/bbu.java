import java.util.Set;
import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class bbu extends afbo
{
    private final Map a;
    
    public bbu(final Map a) {
        this.a = a;
    }
    
    protected final Map b() {
        return this.a;
    }
    
    public final boolean containsKey(final Object o) {
        return o != null && super.containsKey(o);
    }
    
    public final boolean containsValue(final Object o) {
        return adwd.aC(ajox.R((Iterator)((Map<Object, Object>)this).entrySet().iterator()), o);
    }
    
    public final Set entrySet() {
        return aesy.p(super.entrySet(), (aext)bbt.b);
    }
    
    public final boolean equals(final Object o) {
        return o != null && ajox.V((Map)this, o);
    }
    
    public final int hashCode() {
        return aesy.i(this.entrySet());
    }
    
    public final boolean isEmpty() {
        final boolean empty = super.isEmpty();
        boolean b = true;
        if (!empty) {
            if (super.size() == 1) {
                if (!super.containsKey((Object)null)) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public final Set keySet() {
        return aesy.p(super.keySet(), (aext)bbt.a);
    }
    
    public final int size() {
        return super.size() - (super.containsKey((Object)null) ? 1 : 0);
    }
}
