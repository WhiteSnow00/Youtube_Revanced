// 
// Decompiled by Procyon v0.6.0
// 

public final class adjn
{
    public static final adjn a;
    public final float b;
    public final int c;
    
    static {
        a = a(0.0f, 0);
    }
    
    public adjn() {
    }
    
    public adjn(final float b, final int c) {
        this.b = b;
        this.c = c;
    }
    
    public static adjn a(final float n, final int n2) {
        return new adjn(n, n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adjn) {
            final adjn adjn = (adjn)o;
            if (Float.floatToIntBits(this.b) == Float.floatToIntBits(adjn.b) && this.c == adjn.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (Float.floatToIntBits(this.b) ^ 0xF4243) * 1000003 ^ this.c;
    }
    
    @Override
    public final String toString() {
        final float b = this.b;
        final int c = this.c;
        final StringBuilder sb = new StringBuilder("PollingTime{pollingWeight=");
        sb.append(b);
        sb.append(", pollingTimeMs=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
