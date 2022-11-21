import java.util.Collection;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class affe extends affg implements Map
{
    protected affe() {
    }
    
    @Override
    protected /* bridge */ Object a() {
        throw null;
    }
    
    protected abstract Map b();
    
    @Override
    public final void clear() {
        this.b().clear();
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return this.b().containsKey(o);
    }
    
    @Override
    public boolean containsValue(final Object o) {
        return this.b().containsValue(o);
    }
    
    @Override
    public Set entrySet() {
        return this.b().entrySet();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || this.b().equals(o);
    }
    
    @Override
    public Object get(final Object o) {
        return this.b().get(o);
    }
    
    @Override
    public int hashCode() {
        return this.b().hashCode();
    }
    
    @Override
    public boolean isEmpty() {
        return this.b().isEmpty();
    }
    
    @Override
    public Set keySet() {
        return this.b().keySet();
    }
    
    @Override
    public final Object put(final Object o, final Object o2) {
        return this.b().put(o, o2);
    }
    
    @Override
    public final void putAll(final Map map) {
        this.b().putAll(map);
    }
    
    @Override
    public final Object remove(final Object o) {
        return this.b().remove(o);
    }
    
    @Override
    public int size() {
        return this.b().size();
    }
    
    @Override
    public final Collection values() {
        return this.b().values();
    }
}
