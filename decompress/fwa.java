// 
// Decompiled by Procyon v0.6.0
// 

public final class fwa
{
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    
    public fwa() {
    }
    
    public fwa(final String a, final String b, final int c, final long d, final long e, final boolean f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fwa) {
            final fwa fwa = (fwa)o;
            final String a = this.a;
            if (a == null) {
                if (fwa.a != null) {
                    return false;
                }
            }
            else if (!a.equals(fwa.a)) {
                return false;
            }
            final String b = this.b;
            if (b == null) {
                if (fwa.b != null) {
                    return false;
                }
            }
            else if (!b.equals(fwa.b)) {
                return false;
            }
            if (this.c == fwa.c && this.d == fwa.d && this.e == fwa.e && this.f == fwa.f) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        final int c = this.c;
        final long d = this.d;
        final long e = this.e;
        int n;
        if (!this.f) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ c) * 1000003 ^ (int)(d ^ d >>> 32)) * 1000003 ^ (int)(e ^ e >>> 32)) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final int c = this.c;
        final long d = this.d;
        final long e = this.e;
        final boolean f = this.f;
        final StringBuilder sb = new StringBuilder("RestoreContextInfo{videoId=");
        sb.append(a);
        sb.append(", playlistId=");
        sb.append(b);
        sb.append(", playlistIndex=");
        sb.append(c);
        sb.append(", videoStartTime=");
        sb.append(d);
        sb.append(", lastCrashTimestamp=");
        sb.append(e);
        sb.append(", lastTimeShown=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
