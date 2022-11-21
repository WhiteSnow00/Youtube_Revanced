// 
// Decompiled by Procyon v0.6.0
// 

public final class acmz
{
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    
    public acmz() {
    }
    
    public acmz(final long a, final int b, final int c, final int d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof acmz) {
            final acmz acmz = (acmz)o;
            if (this.a == acmz.a && this.b == acmz.b && this.c == acmz.c && this.d == acmz.d && this.e == acmz.e) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.e ^ (((((int)this.a ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final int b = this.b;
        final int c = this.c;
        final int d = this.d;
        final int e = this.e;
        final StringBuilder sb = new StringBuilder("MoveAgainParameters{duration=");
        sb.append(a);
        sb.append(", fromX=");
        sb.append(b);
        sb.append(", fromY=");
        sb.append(c);
        sb.append(", toX=");
        sb.append(d);
        sb.append(", toY=");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
