// 
// Decompiled by Procyon v0.6.0
// 

public final class amdp
{
    private final amdt a;
    
    public amdp(final amdt a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amdp && ((ahcz)this.a).equals(((amdp)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
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
