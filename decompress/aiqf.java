// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqf
{
    public final aiov a;
    
    public aiqf(final aiov a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aiqf && ((ahcz)this.a).equals(((aiqf)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("AdminSelfieDataModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
