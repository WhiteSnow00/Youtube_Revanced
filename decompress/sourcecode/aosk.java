// 
// Decompiled by Procyon v0.6.0
// 

public final class aosk
{
    public final vdo a;
    public final aosl b;
    
    public aosk(final aosl b, final vdo a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aosk && this.b.equals(((aosk)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("TimedSectionListDataModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
