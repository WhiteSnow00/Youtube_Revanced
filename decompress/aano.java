// 
// Decompiled by Procyon v0.6.0
// 

final class aano extends aapg
{
    private final String a;
    
    public aano(final String a) {
        this.a = a;
    }
    
    @Override
    public String a() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof aapg && this.a.equals(((aapg)o).a()));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public String toString() {
        final String a = this.a;
        final StringBuilder sb = new StringBuilder("StaleConfigEvent{videoId=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
