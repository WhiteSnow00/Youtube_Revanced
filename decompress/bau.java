// 
// Decompiled by Procyon v0.6.0
// 

public final class bau
{
    public static final bau a;
    public final int b;
    public final int c;
    
    static {
        a = new bau(-1, -1);
    }
    
    public bau(final int b, final int c) {
        final boolean b2 = false;
        boolean b3 = false;
        Label_0033: {
            if (b != -1) {
                b3 = b2;
                if (b < 0) {
                    break Label_0033;
                }
            }
            if (c != -1) {
                b3 = b2;
                if (c < 0) {
                    break Label_0033;
                }
            }
            b3 = true;
        }
        bad.d(b3);
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (o instanceof bau) {
            final bau bau = (bau)o;
            if (this.b == bau.b && this.c == bau.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int c = this.c;
        final int b = this.b;
        return c ^ (b >>> 16 | b << 16);
    }
    
    @Override
    public final String toString() {
        final int b = this.b;
        final int c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append("x");
        sb.append(c);
        return sb.toString();
    }
}
