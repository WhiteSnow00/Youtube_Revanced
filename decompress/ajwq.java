// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwq
{
    public final vgx a;
    public final ajwt b;
    
    public ajwq(final ajwt b, final vgx a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajwq && ((ahcz)this.b).equals(((ajwq)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("FormattedStringSupportedAccessibilityDatasModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
