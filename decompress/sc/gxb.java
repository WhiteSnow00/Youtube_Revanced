// 
// Decompiled by Procyon v0.6.0
// 

public final class gxb
{
    public final float a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    
    public gxb() {
    }
    
    public gxb(final float a, final String b, final String c, final int d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    static gxa a() {
        return new gxa();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gxb) {
            final gxb gxb = (gxb)o;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(gxb.a) && this.b.equals(gxb.b) && this.c.equals(gxb.c) && this.d == gxb.d && this.e.equals(gxb.e)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((Float.floatToIntBits(this.a) ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d) * 1000003 ^ this.e.hashCode();
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final String b = this.b;
        final String c = this.c;
        final int d = this.d;
        final String e = this.e;
        final StringBuilder sb = new StringBuilder("SpeedElement{speed=");
        sb.append(a);
        sb.append(", animationTitle=");
        sb.append(b);
        sb.append(", text=");
        sb.append(c);
        sb.append(", icon=");
        sb.append(d);
        sb.append(", contentDescription=");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
