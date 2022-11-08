// 
// Decompiled by Procyon v0.6.0
// 

final class jsz
{
    public final long a;
    public final int b;
    
    public jsz() {
    }
    
    public jsz(final long a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof jsz) {
            final jsz jsz = (jsz)o;
            if (this.a == jsz.a && this.b == jsz.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return this.b ^ ((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder("LoadStartedContext{startTimeNanos=");
        sb.append(a);
        sb.append(", loadNumber=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
