// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgq
{
    public final vgx a;
    public final aqgy b;
    
    public aqgq(final aqgy b, final vgx a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqgq && ((ahcz)this.b).equals(((aqgq)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("StyleRunModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
