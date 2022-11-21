// 
// Decompiled by Procyon v0.6.0
// 

public final class amcf
{
    public final amch a;
    
    public amcf(final amch a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amcf && ((ahcz)this.a).equals(((amcf)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
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
