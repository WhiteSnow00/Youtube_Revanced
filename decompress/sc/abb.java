import java.util.Iterator;
import java.util.AbstractSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class abb extends AbstractSet
{
    final abh a;
    
    public abb(final abh a) {
        this.a = a;
    }
    
    @Override
    public final Iterator iterator() {
        return (Iterator)new abe(this.a);
    }
    
    @Override
    public final int size() {
        return this.a.d;
    }
}
