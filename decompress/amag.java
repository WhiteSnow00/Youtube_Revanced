// 
// Decompiled by Procyon v0.6.0
// 

public final class amag
{
    public final amai a;
    
    public amag(final amai a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amag && ((ahbh)this.a).equals((Object)((amag)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.a).hashCode() ^ 0xF6181;
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
