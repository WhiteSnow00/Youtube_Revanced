// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aufs implements aufo
{
    protected aufs() {
    }
    
    public final aufm e() {
        return new aufm(this.d());
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof aufo && this.d() == ((aufo)o).d());
    }
    
    @Override
    public final int hashCode() {
        final long d = this.d();
        return (int)(d ^ d >>> 32);
    }
    
    @Override
    public final String toString() {
        final long d = this.d();
        final StringBuffer sb = new StringBuffer();
        sb.append("PT");
        auik.h(sb, d);
        while (true) {
            final int length = sb.length();
            int n;
            if (d < 0L) {
                n = 7;
            }
            else {
                n = 6;
            }
            if (length >= n) {
                break;
            }
            int n2;
            if (d < 0L) {
                n2 = 3;
            }
            else {
                n2 = 2;
            }
            sb.insert(n2, "0");
        }
        if (d / 1000L * 1000L == d) {
            sb.setLength(sb.length() - 3);
        }
        else {
            sb.insert(sb.length() - 3, ".");
        }
        sb.append('S');
        return sb.toString();
    }
}
