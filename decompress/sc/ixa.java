// 
// Decompiled by Procyon v0.6.0
// 

public final class ixa
{
    public final ixf a;
    public final boolean b;
    
    public ixa() {
    }
    
    public ixa(final ixf a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public static ixa a(final ixf ixf, final boolean b) {
        return new ixa(ixf, b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ixa) {
            final ixa ixa = (ixa)o;
            if (this.a.equals(ixa.a) && this.b == ixa.b) {
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
        final StringBuilder sb = new StringBuilder("ResultState{midUiModel=");
        sb.append(string);
        sb.append(", shouldAnimate=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}