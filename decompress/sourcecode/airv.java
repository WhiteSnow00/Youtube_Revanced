// 
// Decompiled by Procyon v0.6.0
// 

public final class airv
{
    public final airy a;
    
    public airv(final airy a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof airv && ((agzi)this.a).equals(((airv)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("CommerceAcquisitionClientPayloadModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
