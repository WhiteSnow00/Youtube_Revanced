// 
// Decompiled by Procyon v0.6.0
// 

public final class aiwa
{
    private final aiwc a;
    
    public aiwa(final aiwc a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aiwa && ((ahcz)this.a).equals(((aiwa)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("PurchaseModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
