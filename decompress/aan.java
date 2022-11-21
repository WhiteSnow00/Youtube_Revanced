// 
// Decompiled by Procyon v0.6.0
// 

public final class aan
{
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    
    public aan() {
    }
    
    public aan(final float b, final float c, final float d) {
        this.a = 1.0f;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aan) {
            final aan aan = (aan)o;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(aan.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(aan.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(aan.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(aan.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) ^ 0xF4243) * 1000003 ^ Float.floatToIntBits(this.b)) * 1000003 ^ Float.floatToIntBits(this.c)) * 1000003 ^ Float.floatToIntBits(this.d);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ImmutableZoomState{zoomRatio=");
        sb.append(this.a);
        sb.append(", maxZoomRatio=");
        sb.append(this.b);
        sb.append(", minZoomRatio=");
        sb.append(this.c);
        sb.append(", linearZoom=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
