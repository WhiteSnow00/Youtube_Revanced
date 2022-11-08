// 
// Decompiled by Procyon v0.6.0
// 

public final class ouj
{
    public final float a;
    public final float b;
    
    public ouj() {
    }
    
    public ouj(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    public static ouj a(final float n, final float n2) {
        return new ouj(n, n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ouj) {
            final ouj ouj = (ouj)o;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(ouj.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(ouj.b)) {
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
        final StringBuilder sb = new StringBuilder("TouchLocation{x=");
        sb.append(a);
        sb.append(", y=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
