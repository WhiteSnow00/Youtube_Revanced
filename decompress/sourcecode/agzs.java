import java.util.List;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agzs extends AbstractList
{
    private final List a;
    private final agzr b;
    
    public agzs(final List a, final agzr b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object get(final int n) {
        return this.b.convert(this.a.get(n));
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
