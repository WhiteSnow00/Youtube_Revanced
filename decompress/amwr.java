// 
// Decompiled by Procyon v0.6.0
// 

public final class amwr
{
    public final vfp a;
    public final amwv b;
    
    public amwr(final amwv b, final vfp a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amwr && ((ahbh)this.b).equals((Object)((amwr)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("CommandWrapperModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
