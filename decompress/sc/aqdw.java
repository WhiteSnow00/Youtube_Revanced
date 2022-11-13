// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdw
{
    public final vfp a;
    public final aqee b;
    
    public aqdw(final aqee b, final vfp a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqdw && ((ahbh)this.b).equals((Object)((aqdw)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
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
