import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gcu
{
    public final float a;
    public final Optional b;
    public final Optional c;
    
    public gcu() {
    }
    
    public gcu(final float a, final Optional b, final Optional c) {
        this.a = a;
        if (b == null) {
            throw new NullPointerException("Null startSource");
        }
        this.b = b;
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null endSource");
    }
    
    public static gcu a() {
        return b(1.0f, Optional.empty(), Optional.empty());
    }
    
    public static gcu b(final float n, final Optional optional, final Optional optional2) {
        return new gcu(n, optional, optional2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gcu) {
            final gcu gcu = (gcu)o;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(gcu.a) && this.b.equals((Object)gcu.b) && this.c.equals((Object)gcu.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final String string = this.b.toString();
        final String string2 = this.c.toString();
        final StringBuilder sb = new StringBuilder("RenderableTransitionAnimationFrame{progress=");
        sb.append(a);
        sb.append(", startSource=");
        sb.append(string);
        sb.append(", endSource=");
        sb.append(string2);
        sb.append("}");
        return sb.toString();
    }
}
