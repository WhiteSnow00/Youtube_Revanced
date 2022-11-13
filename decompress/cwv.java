import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cwv implements cwy
{
    private final cwo a;
    private final cwo b;
    
    public cwv(final cwo a, final cwo b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final cvr a() {
        return (cvr)new cwc(this.a.a(), this.b.a());
    }
    
    @Override
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
    
    @Override
    public final boolean c() {
        return ((cwz)this.a).c() && ((cwz)this.b).c();
    }
}
