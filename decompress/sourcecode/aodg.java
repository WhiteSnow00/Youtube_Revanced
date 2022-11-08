// 
// Decompiled by Procyon v0.6.0
// 

public final class aodg
{
    private final aoij a;
    
    public aodg(final aoij a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aodg && ((agzi)this.a).equals(((aodg)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("StartToShortsClientPauseConfigModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
