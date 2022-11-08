// 
// Decompiled by Procyon v0.6.0
// 

public final class fez
{
    public final String a;
    public final long b;
    
    public fez() {
    }
    
    public fez(final String a, final long b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null name");
    }
    
    public static fez a(final String s, final long n) {
        return new fez(s, n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fez) {
            final fez fez = (fez)o;
            if (this.a.equals(fez.a) && this.b == fez.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        return (hashCode ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final long b = this.b;
        final StringBuilder sb = new StringBuilder("Tick{name=");
        sb.append(a);
        sb.append(", timestampMillis=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
