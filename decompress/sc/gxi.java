// 
// Decompiled by Procyon v0.6.0
// 

public final class gxi
{
    public final int a;
    public final String b;
    public final String c;
    
    public gxi() {
    }
    
    public gxi(final int a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gxi) {
            final gxi gxi = (gxi)o;
            if (this.a == gxi.a && this.b.equals(gxi.b) && this.c.equals(gxi.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String b = this.b;
        final String c = this.c;
        final StringBuilder sb = new StringBuilder("CountdownDurationSegment{countdownDurationMs=");
        sb.append(a);
        sb.append(", text=");
        sb.append(b);
        sb.append(", contentDescription=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
