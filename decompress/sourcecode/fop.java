import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fop
{
    public final boolean a;
    public final afcr b;
    
    public fop() {
    }
    
    public fop(final boolean a, final afcr b) {
        this.a = a;
        this.b = b;
    }
    
    public static xfi a() {
        return new xfi();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fop) {
            final fop fop = (fop)o;
            if (this.a == fop.a && adwd.ar((List)this.b, fop.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (n ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("ElementsPlayerOverlaysContainer{removeAllElementsOverlays=");
        sb.append(a);
        sb.append(", playerOverlays=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
