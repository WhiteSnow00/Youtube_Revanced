// 
// Decompiled by Procyon v0.6.0
// 

final class ezg extends ezv
{
    private final aezp a;
    
    public ezg(final aezp a) {
        this.a = a;
    }
    
    public aezp a() {
        return this.a;
    }
    
    public boolean equals(final Object o) {
        return o == this || (o instanceof ezv && this.a.equals((Object)((ezv)o).a()));
    }
    
    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    public String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("ChannelListSelectionChangeEvent{selectedChannelIndex=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
