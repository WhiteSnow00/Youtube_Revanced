import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class affb extends afeq
{
    final afeq a;
    
    public affb(final afeq a) {
        this.a = a;
    }
    
    public final Object get(final int n) {
        return ((Map.Entry)this.a.get(n)).getValue();
    }
    
    public final boolean l() {
        return true;
    }
    
    public final int size() {
        return this.a.size();
    }
}
