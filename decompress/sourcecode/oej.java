// 
// Decompiled by Procyon v0.6.0
// 

public final class oej
{
    public static final oej a;
    public final long b;
    public final long c;
    public final long d;
    
    static {
        a = a(0L, 0L, 0L);
    }
    
    public oej() {
    }
    
    public oej(final long b, final long c, final long d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static oej a(final long n, final long n2, final long n3) {
        return new oej(n, n2, n3);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof oej) {
            final oej oej = (oej)o;
            if (this.b == oej.b && this.c == oej.c && this.d == oej.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long b = this.b;
        final long c = this.c;
        final long d = this.d;
        return (int)(d >>> 32 ^ d) ^ (((int)(b ^ b >>> 32) ^ 0xF4243) * 1000003 ^ (int)(c ^ c >>> 32)) * 1000003;
    }
    
    @Override
    public final String toString() {
        final long b = this.b;
        final long c = this.c;
        final long d = this.d;
        final StringBuilder sb = new StringBuilder("SchedStat{cpuTimeNs=");
        sb.append(b);
        sb.append(", runDelayNs=");
        sb.append(c);
        sb.append(", runCount=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
