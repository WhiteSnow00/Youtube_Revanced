// 
// Decompiled by Procyon v0.6.0
// 

public final class iuw
{
    public final boolean a;
    public final boolean b;
    
    public iuw() {
    }
    
    public iuw(final boolean a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public static iuw a() {
        final acxs acxs = new acxs();
        acxs.g(true);
        acxs.c |= 0x2;
        acxs.h(true);
        return acxs.f();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof iuw) {
            final iuw iuw = (iuw)o;
            if (this.a == iuw.a && this.b == iuw.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final boolean a = this.a;
        int n = 1231;
        int n2;
        if (!a) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (!this.b) {
            n = 1237;
        }
        return ((n2 ^ 0xF4243) * 1000003 ^ 0x4D5) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder("ControlsVisibilityModel{isControlsOverlayVisible=");
        sb.append(a);
        sb.append(", isChangeAnimated=false, shouldCancelHiding=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
