// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwr
{
    public final vgx a;
    public final ajwu b;
    
    public ajwr(final ajwu b, final vgx a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajwr && ((ahcz)this.b).equals(((ajwr)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("StringRunModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
