// 
// Decompiled by Procyon v0.6.0
// 

public final class kzq
{
    public final int a;
    public final int b;
    
    public kzq() {
    }
    
    public kzq(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public static kzq a(final int n, final int n2) {
        return new kzq(n, n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof kzq) {
            final kzq kzq = (kzq)o;
            if (this.a == kzq.a && this.b == kzq.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a ^ 0xF4243) * 1000003 ^ this.b;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        String s;
        if (b != 1) {
            if (b != 2) {
                s = "WATCH_PANEL_OVERSCROLL";
            }
            else {
                s = "WATCH_LAYOUT_DRAG";
            }
        }
        else {
            s = "PLAYER_DRAG";
        }
        final StringBuilder sb = new StringBuilder("WatchTransitionRequest{direction=");
        sb.append(a);
        sb.append(", requestSource=");
        sb.append(s);
        sb.append("}");
        return sb.toString();
    }
}
