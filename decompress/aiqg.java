// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqg
{
    public final aiox a;
    
    public aiqg(final aiox a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aiqg && ((ahcz)this.a).equals(((aiqg)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("AnalyticsDataModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
