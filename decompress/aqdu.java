// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdu
{
    public final vfp a;
    public final aqea b;
    
    public aqdu(final aqea b, final vfp a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqdu && this.b.equals((Object)((aqdu)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("DecorationRunModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
