import com.google.android.libraries.youtube.creation.trim.ShortsVideoTrimView2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdk
{
    public final heo a;
    public final ShortsVideoTrimView2 b;
    public final rbi c;
    public final int d;
    public final urf e;
    public final boolean f;
    public final int g;
    
    public hdk() {
    }
    
    public hdk(final heo a, final ShortsVideoTrimView2 b, final rbi c, final int d, final urf e, final int g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = true;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hdk) {
            final hdk hdk = (hdk)o;
            if (this.a.equals(hdk.a) && this.b.equals(hdk.b) && this.c.equals(hdk.c) && this.d == hdk.d && this.e.equals(hdk.e) && this.f == hdk.f) {
                final int g = this.g;
                final int g2 = hdk.g;
                if (g == 0) {
                    throw null;
                }
                if (g == g2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
        final int d = this.d;
        final int hashCode4 = this.e.hashCode();
        int n;
        if (!this.f) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        final int g = this.g;
        aqql.an(g);
        return ((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ d) * 1000003 ^ hashCode4) * 1000003 ^ n) * 1000003 ^ g;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final int d = this.d;
        final String value4 = String.valueOf(this.e);
        final boolean f = this.f;
        final int g = this.g;
        String am;
        if (g != 0) {
            am = aqql.am(g);
        }
        else {
            am = "null";
        }
        final StringBuilder sb = new StringBuilder("DefaultShortsTrimUiData{videoTrimController=");
        sb.append(value);
        sb.append(", videoTrimView=");
        sb.append(value2);
        sb.append(", videoControllerView=");
        sb.append(value3);
        sb.append(", maxVideoDurationSec=");
        sb.append(d);
        sb.append(", videoViewManager=");
        sb.append(value4);
        sb.append(", isPannableCropEnabled=");
        sb.append(f);
        sb.append(", trimContext=");
        sb.append(am);
        sb.append("}");
        return sb.toString();
    }
}
