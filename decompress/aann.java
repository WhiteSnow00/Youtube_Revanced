// 
// Decompiled by Procyon v0.6.0
// 

final class aann extends aanu
{
    private final String a;
    
    public aann(final String a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null videoId");
    }
    
    @Override
    public String a() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof aanu && this.a.equals(((aanu)o).a()));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public String toString() {
        final String a = this.a;
        final StringBuilder sb = new StringBuilder("OfflineDrmSessionExpirationUpdateEvent{videoId=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
