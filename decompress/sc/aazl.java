// 
// Decompiled by Procyon v0.6.0
// 

final class aazl extends aazu
{
    private final long a;
    private final long b;
    private final int c;
    
    public aazl(final long a, final long b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public int a() {
        return this.c;
    }
    
    @Override
    public long b() {
        return this.b;
    }
    
    @Override
    public long c() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aazu) {
            final aazu aazu = (aazu)o;
            if (this.a == aazu.c() && this.b == aazu.b() && this.c == aazu.a()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long a = this.a;
        final long b = this.b;
        return this.c ^ (((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003;
    }
    
    @Override
    public String toString() {
        final long a = this.a;
        final long b = this.b;
        final int c = this.c;
        final StringBuilder sb = new StringBuilder("PlaybackLoopRepeatingEvent{startTimeMs=");
        sb.append(a);
        sb.append(", endTimeMs=");
        sb.append(b);
        sb.append(", loopCount=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
