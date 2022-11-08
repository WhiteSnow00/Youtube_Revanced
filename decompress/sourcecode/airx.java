// 
// Decompiled by Procyon v0.6.0
// 

public final class airx
{
    private final airz a;
    
    public airx(final airz a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof airx && ((agzi)this.a).equals(((airx)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.a).hashCode() ^ 0xF6181;
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
