// 
// Decompiled by Procyon v0.6.0
// 

public final class aesk
{
    public final aesl a;
    public final long b;
    
    public aesk() {
    }
    
    public aesk(final aesl a, final long b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null constraintType");
    }
    
    public static final arlz a() {
        return new arlz((char[])null);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aesk) {
            final aesk aesk = (aesk)o;
            if (this.a.equals(aesk.a) && this.b == aesk.b) {
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
        final String string = this.a.toString();
        final long b = this.b;
        final StringBuilder sb = new StringBuilder("SyncConstraint{constraintType=");
        sb.append(string);
        sb.append(", applicablePeriod=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
