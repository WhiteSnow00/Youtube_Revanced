// 
// Decompiled by Procyon v0.6.0
// 

public final class agnf
{
    public final String a;
    private final long b;
    private final long c;
    
    public agnf() {
    }
    
    public agnf(final String a, final long b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof agnf) {
            final agnf agnf = (agnf)o;
            if (this.a.equals(agnf.a) && this.b == agnf.b && this.c == agnf.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        final long c = this.c;
        return ((hashCode ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003 ^ (int)(c ^ c >>> 32);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final long b = this.b;
        final long c = this.c;
        final StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(b);
        sb.append(", tokenCreationTimestamp=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
