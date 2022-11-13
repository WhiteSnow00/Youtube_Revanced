// 
// Decompiled by Procyon v0.6.0
// 

final class aazm extends aazv
{
    private final long a;
    private final long b;
    
    public aazm(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public long a() {
        return this.b;
    }
    
    @Override
    public long b() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aazv) {
            final aazv aazv = (aazv)o;
            if (this.a == aazv.b() && this.b == aazv.a()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long a = this.a;
        final long b = this.b;
        return (int)(b ^ b >>> 32) ^ ((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003;
    }
    
    @Override
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
