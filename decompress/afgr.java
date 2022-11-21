import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class afgr extends aflu
{
    final aflu a;
    final afgu b;
    
    public afgr(final afgu b) {
        this.b = b;
        this.a = b.a.r().k();
    }
    
    public final boolean hasNext() {
        return this.a.hasNext();
    }
    
    public final Object next() {
        return ((Map.Entry)this.a.next()).getValue();
    }
}
