// 
// Decompiled by Procyon v0.6.0
// 

public final class gry implements abul
{
    private final long a;
    private final long b;
    private final long c;
    
    public gry() {
    }
    
    public gry(final long a, final long b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static gry e(final long n, final long n2, final long n3) {
        return new gry(n, n2, n3);
    }
    
    public final long a() {
        throw new UnsupportedOperationException();
    }
    
    public final long b() {
        throw new UnsupportedOperationException();
    }
    
    public final long c() {
        throw new UnsupportedOperationException();
    }
    
    public final long d() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gry) {
            final gry gry = (gry)o;
            if (this.a == gry.a && this.b == gry.b && this.c == gry.c) {
                return true;
            }
        }
        return false;
    }
    
    public final long f() {
        return this.c;
    }
    
    public final long g() {
        return this.a;
    }
    
    public final long h() {
        return this.b;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final long b = this.b;
        final long c = this.c;
        return (int)(c >>> 32 ^ c) ^ (((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final long b = this.b;
        final long c = this.c;
        final StringBuilder sb = new StringBuilder("VideoTimeInfoSnapshot{lastKnownPositionMillis=");
        sb.append(a);
        sb.append(", startPositionMillis=");
        sb.append(b);
        sb.append(", durationMillis=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
