// 
// Decompiled by Procyon v0.6.0
// 

public final class kzz
{
    public final int a;
    public final int b;
    public final int c;
    
    public kzz() {
    }
    
    public kzz(final int a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof kzz) {
            final kzz kzz = (kzz)o;
            if (this.a == kzz.a && this.b == kzz.b && this.c == kzz.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c;
        final StringBuilder sb = new StringBuilder("ResolveTransitionInfo{flingRelease=");
        sb.append(a);
        sb.append(", transitionAxis=");
        sb.append(b);
        sb.append(", delta=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
