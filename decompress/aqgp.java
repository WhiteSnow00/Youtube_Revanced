// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgp
{
    public final aqgx a;
    
    public aqgp(final aqgx a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqgp && this.a.equals(((aqgp)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("IosDynamicFontSpecModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
