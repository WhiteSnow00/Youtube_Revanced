// 
// Decompiled by Procyon v0.6.0
// 

public final class adzn
{
    public final int a;
    public final long b;
    
    public adzn() {
    }
    
    public adzn(final int a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adzn) {
            final adzn adzn = (adzn)o;
            if (this.a == adzn.a && this.b == adzn.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final long b = this.b;
        return (a ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32);
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final long b = this.b;
        final StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append(a);
        sb.append(", eventTimestamp=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
