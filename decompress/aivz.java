// 
// Decompiled by Procyon v0.6.0
// 

public final class aivz
{
    public final aiwd a;
    
    public aivz(final aiwd a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aivz && ((ahcz)this.a).equals(((aivz)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
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
