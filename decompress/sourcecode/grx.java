// 
// Decompiled by Procyon v0.6.0
// 

public final class grx
{
    public final boolean a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    
    public grx() {
    }
    
    public grx(final boolean a, final long b, final long c, final long d, final long e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static grx a() {
        return new grx(false, 0L, 0L, 0L, 0L);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof grx) {
            final grx grx = (grx)o;
            if (this.a == grx.a && this.b == grx.b && this.c == grx.c && this.d == grx.d && this.e == grx.e) {
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
        final long b = this.b;
        final long c = this.c;
        final long d = this.d;
        final long e = this.e;
        return ((((n ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003 ^ (int)(c >>> 32 ^ c)) * 1000003 ^ (int)(d >>> 32 ^ d)) * 1000003 ^ (int)(e >>> 32 ^ e);
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final long b = this.b;
        final long c = this.c;
        final long d = this.d;
        final long e = this.e;
        final StringBuilder sb = new StringBuilder("ClipsOverlayModel{isClip=");
        sb.append(a);
        sb.append(", currentTimeMs=");
        sb.append(b);
        sb.append(", clipStartTimeMs=");
        sb.append(c);
        sb.append(", clipEndTimeMs=");
        sb.append(d);
        sb.append(", bufferedTimeMs=");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
