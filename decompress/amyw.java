// 
// Decompiled by Procyon v0.6.0
// 

public final class amyw
{
    public final vgx a;
    public final amza b;
    
    public amyw(final amza b, final vgx a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amyw && ((ahcz)this.b).equals(((amyw)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
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
