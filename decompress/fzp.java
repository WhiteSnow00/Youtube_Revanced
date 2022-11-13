// 
// Decompiled by Procyon v0.6.0
// 

public final class fzp
{
    public final float a;
    public final float b;
    public final int c;
    
    public fzp() {
    }
    
    public fzp(final int c, final float a, final float b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static fzo a() {
        final fzo fzo = new fzo();
        fzo.a = 1;
        fzo.c(0.0f);
        fzo.b(0.0f);
        return fzo;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof fzp)) {
            return false;
        }
        final fzp fzp = (fzp)o;
        final int c = this.c;
        final int c2 = fzp.c;
        if (c != 0) {
            return c == c2 && Float.floatToIntBits(this.a) == Float.floatToIntBits(fzp.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(fzp.b);
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int c = this.c;
        if (c != 0) {
            return ((c ^ 0xF4243) * 1000003 ^ Float.floatToIntBits(this.a)) * 1000003 ^ Float.floatToIntBits(this.b);
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final int c = this.c;
        String s;
        if (c != 1) {
            if (c != 2) {
                if (c != 3) {
                    s = "null";
                }
                else {
                    s = "FADE";
                }
            }
            else {
                s = "STANDARD";
            }
        }
        else {
            s = "NONE";
        }
        final float a = this.a;
        final float b = this.b;
        final StringBuilder sb = new StringBuilder("CollapseBehavior{collapseMode=");
        sb.append(s);
        sb.append(", fadeOffsetPercentStart=");
        sb.append(a);
        sb.append(", fadeOffsetPercentEnd=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
