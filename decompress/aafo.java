// 
// Decompiled by Procyon v0.6.0
// 

public final class aafo
{
    public final String a;
    public final long b;
    
    public aafo() {
    }
    
    public aafo(final String a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aafo) {
            final aafo aafo = (aafo)o;
            if (this.a.equals(aafo.a) && this.b == aafo.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        return (hashCode ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final long b = this.b;
        final StringBuilder sb = new StringBuilder("VideoLastUpdatedPair{videoId=");
        sb.append(a);
        sb.append(", lastUpdatedTimestampMs=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
