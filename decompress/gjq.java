// 
// Decompiled by Procyon v0.6.0
// 

public final class gjq
{
    public final float a;
    public final float b;
    public final float c;
    
    public gjq() {
    }
    
    public gjq(final float a, final float b, final float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static gjp a() {
        final gjp gjp = new gjp();
        gjp.b = 0.1f;
        final byte c = gjp.c;
        gjp.a = 0.25f;
        gjp.c = (byte)(c | 0x6);
        gjp.b(0.25f);
        return gjp;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gjq) {
            final gjq gjq = (gjq)o;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(gjq.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(gjq.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(gjq.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) ^ 0xF4243) * 1000003 ^ Float.floatToIntBits(this.b)) * 1000003 ^ Float.floatToIntBits(this.c);
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final float b = this.b;
        final float c = this.c;
        final StringBuilder sb = new StringBuilder("SelectionByVisibilityDeltaParams{postSelectionVisibilityPercentBoost=");
        sb.append(a);
        sb.append(", firstItemVisibilityPercentBoost=");
        sb.append(b);
        sb.append(", deltaThreshold=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
