import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjr
{
    public final String a;
    public final float b;
    public final Optional c;
    public final Optional d;
    
    public gjr() {
    }
    
    public gjr(final String a, final float b, final Optional c, final Optional d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static gjn a() {
        final gjn gjn = new gjn(null);
        gjn.c = Optional.empty();
        return gjn;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gjr) {
            final gjr gjr = (gjr)o;
            if (this.a.equals(gjr.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(gjr.b) && this.c.equals((Object)gjr.c) && this.d.equals((Object)gjr.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ Float.floatToIntBits(this.b)) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final float b = this.b;
        final String value = String.valueOf(this.c);
        final String value2 = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder("ScrollSelectionParameters{tag=");
        sb.append(a);
        sb.append(", visibilityPercentSelectionThreshold=");
        sb.append(b);
        sb.append(", selectionByVisibilityDeltaParams=");
        sb.append(value);
        sb.append(", selectionBySelectableRegionParams=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
