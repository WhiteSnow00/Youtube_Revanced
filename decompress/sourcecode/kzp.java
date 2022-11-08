// 
// Decompiled by Procyon v0.6.0
// 

public final class kzp
{
    public final kzr a;
    public final boolean b;
    
    public kzp() {
    }
    
    public kzp(final kzr a, final boolean b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null inputSource");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof kzp) {
            final kzp kzp = (kzp)o;
            if (this.a.equals(kzp.a) && this.b == kzp.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int n;
        if (!this.b) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (hashCode ^ 0xF4243) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder("NextTransitionInputSource{inputSource=");
        sb.append(string);
        sb.append(", isActive=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
