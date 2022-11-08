// 
// Decompiled by Procyon v0.6.0
// 

public final class airw
{
    public final aisa a;
    
    public airw(final aisa a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof airw && ((agzi)this.a).equals(((airw)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("PlayBillingClientPayloadModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
