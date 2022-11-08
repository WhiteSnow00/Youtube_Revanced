// 
// Decompiled by Procyon v0.6.0
// 

public final class aosa
{
    public final vdo a;
    public final aosb b;
    
    public aosa(final aosb b, final vdo a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aosa && this.b.equals(((aosa)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("TimedMarkerDecorationModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
