import java.util.Set;
import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class bbx extends affe
{
    private final Map a;
    
    public bbx(final Map a) {
        this.a = a;
    }
    
    @Override
    protected final Object a() {
        return this.a;
    }
    
    @Override
    protected final Map b() {
        return this.a;
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        return o != null && super.containsKey(o);
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        return agpx.ae(agpx.H(this.entrySet().iterator()), o);
    }
    
    @Override
    public final Set entrySet() {
        return agra.M(super.entrySet(), (afbk)bbw.b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && agpx.L(this, o);
    }
    
    @Override
    public final /* bridge */ Object get(final Object o) {
        if (o == null) {
            return null;
        }
        return super.get(o);
    }
    
    @Override
    public final int hashCode() {
        return agra.F(this.entrySet());
    }
    
    @Override
    public final boolean isEmpty() {
        final boolean empty = super.isEmpty();
        boolean b = true;
        if (!empty) {
            if (super.size() == 1) {
                if (!super.containsKey(null)) {
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
    
    @Override
    public final Set keySet() {
        return agra.M(super.keySet(), (afbk)bbw.a);
    }
    
    @Override
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
