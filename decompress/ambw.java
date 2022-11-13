// 
// Decompiled by Procyon v0.6.0
// 

public final class ambw
{
    public final ambx a;
    
    public ambw(final ambx a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ambw && ((ahbh)this.a).equals((Object)((ambw)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("MarkersMetadataModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
