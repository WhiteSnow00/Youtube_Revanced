import com.google.research.aimatter.drishti.DrishtiCache;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqub
{
    public final long a;
    public final DrishtiCache b;
    
    public aqub() {
    }
    
    public aqub(final long a, final DrishtiCache b) {
        this.a = a;
        this.b = b;
    }
    
    public static aqua a() {
        final aqua aqua = new aqua();
        aqua.b(0L);
        return aqua;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aqub) {
            final aqub aqub = (aqub)o;
            if (this.a == aqub.a) {
                final DrishtiCache b = this.b;
                final DrishtiCache b2 = aqub.b;
                if (b == null) {
                    if (b2 != null) {
                        return false;
                    }
                }
                else if (!b.equals(b2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final DrishtiCache b = this.b;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        return ((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("ExternalGraphComponents{parentGlContextHandle=");
        sb.append(a);
        sb.append(", drishtiCache=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
