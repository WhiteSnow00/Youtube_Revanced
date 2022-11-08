// 
// Decompiled by Procyon v0.6.0
// 

public final class fvs
{
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    
    public fvs() {
    }
    
    public fvs(final String a, final String b, final int c, final long d, final long e, final boolean f) {
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
        if (o instanceof fvs) {
            final fvs fvs = (fvs)o;
            final String a = this.a;
            if (a == null) {
                if (fvs.a != null) {
                    return false;
                }
            }
            else if (!a.equals(fvs.a)) {
                return false;
            }
            final String b = this.b;
            if (b == null) {
                if (fvs.b != null) {
                    return false;
                }
            }
            else if (!b.equals(fvs.b)) {
                return false;
            }
            if (this.c == fvs.c && this.d == fvs.d && this.e == fvs.e && this.f == fvs.f) {
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
        final int n = (int)(d ^ d >>> 32);
        final int n2 = (int)(e >>> 32 ^ e);
        int n3;
        if (!this.f) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        return (((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ c) * 1000003 ^ n) * 1000003 ^ n2) * 1000003 ^ n3;
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
