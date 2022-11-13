// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdt
{
    public final vfp a;
    public final aqdz b;
    
    public aqdt(final aqdz b, final vfp a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqdt && ((ahbh)this.b).equals((Object)((aqdt)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("CommandRunModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
