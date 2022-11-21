// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxc
{
    public final vgx a;
    public final ajxd b;
    
    public ajxc(final ajxd b, final vgx a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajxc && ((ahcz)this.b).equals(((ajxc)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("FormfillFieldResultModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
