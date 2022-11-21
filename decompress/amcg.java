// 
// Decompiled by Procyon v0.6.0
// 

public final class amcg
{
    public final amci a;
    
    public amcg(final amci a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amcg && ((ahcz)this.a).equals(((amcg)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("MainVideoAdditionalMetadataModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
