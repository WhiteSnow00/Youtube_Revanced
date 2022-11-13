// 
// Decompiled by Procyon v0.6.0
// 

public final class ambp
{
    private final ambt a;
    
    public ambp(final ambt a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ambp && ((ahbh)this.a).equals((Object)((ambp)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("ActiveSectionInfoModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
