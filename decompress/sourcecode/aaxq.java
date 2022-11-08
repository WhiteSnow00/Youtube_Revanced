// 
// Decompiled by Procyon v0.6.0
// 

final class aaxq extends aaxz
{
    private final long a;
    private final long b;
    
    public aaxq(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public long a() {
        return this.b;
    }
    
    public long b() {
        return this.a;
    }
    
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aaxz) {
            final aaxz aaxz = (aaxz)o;
            if (this.a == aaxz.b() && this.b == aaxz.a()) {
                return true;
            }
        }
        return false;
    }
    
    public int hashCode() {
        final long a = this.a;
        final long b = this.b;
        return (int)(b ^ b >>> 32) ^ ((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003;
    }
    
    public String toString() {
        final long a = this.a;
        final long b = this.b;
        final StringBuilder sb = new StringBuilder("PlaybackLoopRunningEvent{startTimeMs=");
        sb.append(a);
        sb.append(", endTimeMs=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
