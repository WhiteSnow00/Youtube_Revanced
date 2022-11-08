// 
// Decompiled by Procyon v0.6.0
// 

final class ezc extends ezr
{
    private final aexq a;
    
    public ezc(final aexq a) {
        this.a = a;
    }
    
    @Override
    public aexq a() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof ezr && this.a.equals((Object)((ezr)o).a()));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("ChannelListSelectionChangeEvent{selectedChannelIndex=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
