import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agzv implements Entry
{
    final /* synthetic */ agzx a;
    private final Entry b;
    
    public agzv(final agzx a, final Entry b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof Entry && this.getKey().equals(((Entry)o).getKey()) && this.getValue().equals(this.getValue()));
    }
    
    @Override
    public final Object getKey() {
        return this.b.getKey();
    }
    
    @Override
    public final Object getValue() {
        return this.a.a.a(this.b.getValue());
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public final Object setValue(Object setValue) {
        setValue = this.b.setValue(agzu.b(setValue));
        if (setValue == null) {
            return null;
        }
        return this.a.a.a(setValue);
    }
}
