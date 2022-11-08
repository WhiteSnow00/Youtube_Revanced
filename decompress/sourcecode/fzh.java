// 
// Decompiled by Procyon v0.6.0
// 

public final class fzh
{
    public final float a;
    public final float b;
    public final int c;
    
    public fzh() {
    }
    
    public fzh(final int c, final float a, final float b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static fzg a() {
        final fzg fzg = new fzg();
        fzg.a = 1;
        fzg.c(0.0f);
        fzg.b(0.0f);
        return fzg;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof fzh)) {
            return false;
        }
        final fzh fzh = (fzh)o;
        final int c = this.c;
        final int c2 = fzh.c;
        if (c != 0) {
            return c == c2 && Float.floatToIntBits(this.a) == Float.floatToIntBits(fzh.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(fzh.b);
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
