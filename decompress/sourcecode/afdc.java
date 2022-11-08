import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class afdc extends afcr
{
    final /* synthetic */ afcr a;
    
    public afdc(final afcr a) {
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
