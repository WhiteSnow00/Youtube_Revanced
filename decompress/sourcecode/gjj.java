import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjj
{
    public final String a;
    public final float b;
    public final Optional c;
    public final Optional d;
    
    public gjj() {
    }
    
    public gjj(final String a, final float b, final Optional c, final Optional d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static gjf a() {
        final gjf gjf = new gjf(null);
        gjf.c = Optional.empty();
        return gjf;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gjj) {
            final gjj gjj = (gjj)o;
            if (this.a.equals(gjj.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(gjj.b) && this.c.equals((Object)gjj.c) && this.d.equals((Object)gjj.d)) {
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
