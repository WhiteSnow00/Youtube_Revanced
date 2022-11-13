// 
// Decompiled by Procyon v0.6.0
// 

public final class amaf
{
    public final amah a;
    
    public amaf(final amah a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amaf && ((ahbh)this.a).equals((Object)((amaf)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("MainRecommendedVideoMetadataModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
