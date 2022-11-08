// 
// Decompiled by Procyon v0.6.0
// 

final class aaxp extends aaxy
{
    private final long a;
    private final long b;
    private final int c;
    
    public aaxp(final long a, final long b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int a() {
        return this.c;
    }
    
    public long b() {
        return this.b;
    }
    
    public long c() {
        return this.a;
    }
    
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aaxy) {
            final aaxy aaxy = (aaxy)o;
            if (this.a == aaxy.c() && this.b == aaxy.b() && this.c == aaxy.a()) {
                return true;
            }
        }
        return false;
    }
    
    public int hashCode() {
        final long a = this.a;
        final long b = this.b;
        return this.c ^ (((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003;
    }
    
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
