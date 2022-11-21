import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class afgs extends afgh
{
    final afgh a;
    
    public afgs(final afgh a) {
        this.a = a;
    }
    
    @Override
    public final Object get(final int n) {
        return this.a.get(n).getValue();
    }
    
    @Override
    public final boolean l() {
        return true;
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
