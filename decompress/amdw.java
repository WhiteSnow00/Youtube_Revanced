// 
// Decompiled by Procyon v0.6.0
// 

public final class amdw
{
    public final amdx a;
    
    public amdw(final amdx a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amdw && ((ahcz)this.a).equals(((amdw)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
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
