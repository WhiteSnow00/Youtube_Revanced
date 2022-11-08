// 
// Decompiled by Procyon v0.6.0
// 

public final class gck
{
    public final float a;
    public final int b;
    
    public gck() {
    }
    
    public gck(final float a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gck) {
            final gck gck = (gck)o;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(gck.a) && this.b == gck.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (Float.floatToIntBits(this.a) ^ 0xF4243) * 1000003 ^ this.b;
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder("CinematicGradientColor{percentageFromTop=");
        sb.append(a);
        sb.append(", color=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
