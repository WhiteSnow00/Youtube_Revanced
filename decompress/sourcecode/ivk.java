// 
// Decompiled by Procyon v0.6.0
// 

public final class ivk
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    
    public ivk() {
    }
    
    public ivk(final long a, final long b, final long c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static ivk a(final long n, final long n2, final long n3, final long n4) {
        return new ivk(n, n2, n3, n4);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ivk) {
            final ivk ivk = (ivk)o;
            if (this.a == ivk.a && this.b == ivk.b && this.c == ivk.c && this.d == ivk.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final long b = this.b;
        final long c = this.c;
        final long d = this.d;
        return (int)(d >>> 32 ^ d) ^ ((((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003 ^ (int)(c >>> 32 ^ c)) * 1000003;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final long b = this.b;
        final long c = this.c;
        final long d = this.d;
        final StringBuilder sb = new StringBuilder("VideoTimes{currentTimeMillis=");
        sb.append(a);
        sb.append(", earliestSeekTimeMillis=");
        sb.append(b);
        sb.append(", totalTimeMillis=");
        sb.append(c);
        sb.append(", bufferedTimeMillis=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
