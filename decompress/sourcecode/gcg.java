// 
// Decompiled by Procyon v0.6.0
// 

public final class gcg
{
    public final float a;
    public final float b;
    
    public gcg() {
    }
    
    public gcg(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gcg) {
            final gcg gcg = (gcg)o;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(gcg.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(gcg.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (Float.floatToIntBits(this.a) ^ 0xF4243) * 1000003 ^ Float.floatToIntBits(this.b);
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final float b = this.b;
        final StringBuilder sb = new StringBuilder("CinematicColorSourceSizeMultiplier{heightMultiplier=");
        sb.append(a);
        sb.append(", widthMultiplier=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
