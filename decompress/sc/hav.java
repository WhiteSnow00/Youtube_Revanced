import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hav
{
    public static final hav a;
    public final Uri b;
    public final long c;
    public final long d;
    
    static {
        a = a(null, 0L, 0L);
    }
    
    public hav() {
    }
    
    public hav(final Uri b, final long c, final long d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static hav a(final Uri uri, final long n, final long n2) {
        return new hav(uri, n, n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hav) {
            final hav hav = (hav)o;
            final Uri b = this.b;
            if (b == null) {
                if (hav.b != null) {
                    return false;
                }
            }
            else if (!b.equals((Object)hav.b)) {
                return false;
            }
            if (this.c == hav.c && this.d == hav.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Uri b = this.b;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        final long c = this.c;
        final long d = this.d;
        return ((hashCode ^ 0xF4243) * 1000003 ^ (int)(c ^ c >>> 32)) * 1000003 ^ (int)(d ^ d >>> 32);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final long c = this.c;
        final long d = this.d;
        final StringBuilder sb = new StringBuilder("GreenScreenPlayerState{uri=");
        sb.append(value);
        sb.append(", videoStartTimeStamp=");
        sb.append(c);
        sb.append(", videoEndTimeStamp=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
