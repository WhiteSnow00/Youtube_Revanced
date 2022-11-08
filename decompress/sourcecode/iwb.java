// 
// Decompiled by Procyon v0.6.0
// 

public final class iwb
{
    public final iwg a;
    public final boolean b;
    
    public iwb() {
    }
    
    public iwb(final iwg a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public static iwb a(final iwg iwg, final boolean b) {
        return new iwb(iwg, b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof iwb) {
            final iwb iwb = (iwb)o;
            if (this.a.equals(iwb.a) && this.b == iwb.b) {
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
