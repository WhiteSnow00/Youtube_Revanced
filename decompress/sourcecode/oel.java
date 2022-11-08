// 
// Decompiled by Procyon v0.6.0
// 

public final class oel
{
    public final String a;
    public final int b;
    public final boolean c;
    
    public oel() {
    }
    
    public oel(final String a, final int b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static oel a(final String s, final int n, final boolean b) {
        return new oel(s, n, b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof oel) {
            final oel oel = (oel)o;
            if (this.a.equals(oel.a) && this.b == oel.b && this.c == oel.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b;
        int n = 1231;
        if (!this.c) {
            n = 1237;
        }
        return (((((hashCode ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ Integer.MAX_VALUE) * 1000003 ^ Integer.MAX_VALUE) * 1000003 ^ 0x4CF) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final int b = this.b;
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder("ThreadPoolConfig{name=");
        sb.append(a);
        sb.append(", numThreads=");
        sb.append(b);
        sb.append(", maxThreadSize=2147483647, maxQueueSize=2147483647, enableStats=true, enabledMetrics=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
