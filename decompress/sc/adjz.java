import j$.util.Optional;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjz
{
    public final String a;
    public final String b;
    public final String c;
    public final Uri d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final Optional h;
    
    public adjz() {
    }
    
    public adjz(final String a, final String b, final String c, final Uri d, final boolean e, final boolean f, final boolean g, final Optional h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static adjy a() {
        final adjy adjy = new adjy((byte[])null);
        adjy.b(false);
        adjy.c(false);
        adjy.f(false);
        adjy.b = Optional.empty();
        return adjy;
    }
    
    public final adjy b() {
        return new adjy(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adjz) {
            final adjz adjz = (adjz)o;
            if (this.a.equals(adjz.a) && this.b.equals(adjz.b) && this.c.equals(adjz.c)) {
                final Uri d = this.d;
                if (d == null) {
                    if (adjz.d != null) {
                        return false;
                    }
                }
                else if (!d.equals((Object)adjz.d)) {
                    return false;
                }
                if (this.e == adjz.e && this.f == adjz.f && this.g == adjz.g && this.h.equals((Object)adjz.h)) {
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
        final Uri d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final boolean e = this.e;
        int n = 1237;
        int n2;
        if (!e) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        int n3;
        if (!this.f) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        if (this.g) {
            n = 1231;
        }
        return (((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ n) * 1000003 ^ this.h.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String value = String.valueOf(this.d);
        final boolean e = this.e;
        final boolean f = this.f;
        final boolean g = this.g;
        final String value2 = String.valueOf(this.h);
        final StringBuilder sb = new StringBuilder("Upload{frontendUploadId=");
        sb.append(a);
        sb.append(", workingDir=");
        sb.append(b);
        sb.append(", storageDir=");
        sb.append(c);
        sb.append(", sourceUri=");
        sb.append(value);
        sb.append(", confirmed=");
        sb.append(e);
        sb.append(", creationFailed=");
        sb.append(f);
        sb.append(", unconfirmedFlowFailed=");
        sb.append(g);
        sb.append(", customThumbnailPath=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
