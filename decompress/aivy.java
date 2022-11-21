// 
// Decompiled by Procyon v0.6.0
// 

public final class aivy
{
    public final aiwb a;
    
    public aivy(final aiwb a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aivy && ((ahcz)this.a).equals(((aivy)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
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
