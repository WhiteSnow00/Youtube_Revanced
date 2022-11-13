// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsv
{
    public final aqsw a;
    
    public aqsv(final aqsw a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqsv && this.a.equals((Object)((aqsv)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("VisibilityCriteriaModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
