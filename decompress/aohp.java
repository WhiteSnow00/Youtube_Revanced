// 
// Decompiled by Procyon v0.6.0
// 

public final class aohp
{
    private final aomw a;
    
    public aohp(final aomw a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aohp && ((ahcz)this.a).equals(((aohp)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
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
