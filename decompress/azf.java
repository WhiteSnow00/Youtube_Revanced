// 
// Decompiled by Procyon v0.6.0
// 

public final class azf
{
    public final aye a;
    
    public azf(final aye a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof azf && this.a.equals(((azf)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
