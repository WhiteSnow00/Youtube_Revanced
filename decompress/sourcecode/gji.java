// 
// Decompiled by Procyon v0.6.0
// 

public final class gji
{
    public final float a;
    public final float b;
    public final float c;
    
    public gji() {
    }
    
    public gji(final float a, final float b, final float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static gjh a() {
        final gjh gjh = new gjh();
        gjh.b = 0.1f;
        final byte c = gjh.c;
        gjh.a = 0.25f;
        gjh.c = (byte)(c | 0x6);
        gjh.b(0.25f);
        return gjh;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gji) {
            final gji gji = (gji)o;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(gji.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(gji.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(gji.c)) {
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
