import java.util.Iterator;
import java.util.Set;
import java.util.AbstractSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class agzw extends AbstractSet
{
    final /* synthetic */ agzx a;
    private final Set b;
    
    public agzw(final agzx a, final Set b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Iterator iterator() {
        return (Iterator)new xhn(this.a, (Iterator)this.b.iterator(), 2);
    }
    
    @Override
    public final int size() {
        return this.b.size();
    }
}
