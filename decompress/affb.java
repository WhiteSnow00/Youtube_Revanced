import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class affb extends affc
{
    final Iterable[] a;
    
    public affb(final Iterable[] a) {
        this.a = a;
    }
    
    @Override
    public final Iterator iterator() {
        return agpx.aa((Iterator)new affa(this));
    }
}
