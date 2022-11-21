import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aesj
{
    public final long a;
    public final long b;
    public final Map c;
    
    public aesj() {
    }
    
    public aesj(final long a, final long b, final Map c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static final aesi a() {
        return new aesi();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aesj) {
            final aesj aesj = (aesj)o;
            if (this.a == aesj.a && this.b == aesj.b && agpx.L(this.c, aesj.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final long b = this.b;
        return (((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final long b = this.b;
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("SyncConfig{minSyncInterval=");
        sb.append(a);
        sb.append(", timeout=");
        sb.append(b);
        sb.append(", constraints=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
