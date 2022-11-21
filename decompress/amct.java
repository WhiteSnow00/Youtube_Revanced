// 
// Decompiled by Procyon v0.6.0
// 

public final class amct
{
    public final amcu a;
    
    public amct(final amcu a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amct && ((ahcz)this.a).equals(((amct)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("MainVideoUserStateMetadataModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
