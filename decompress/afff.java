import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afff extends affg implements Entry
{
    protected afff() {
    }
    
    @Override
    protected /* bridge */ Object a() {
        throw null;
    }
    
    protected abstract Entry b();
    
    @Override
    public final boolean equals(final Object o) {
        return this.b().equals(o);
    }
    
    @Override
    public final Object getKey() {
        return this.b().getKey();
    }
    
    @Override
    public Object getValue() {
        return this.b().getValue();
    }
    
    @Override
    public final int hashCode() {
        return this.b().hashCode();
    }
    
    @Override
    public final Object setValue(final Object value) {
        return this.b().setValue(value);
    }
}
