import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abla
{
    public static final abla a;
    public final xbt b;
    public final boolean c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final zfe h;
    public final Optional i;
    public final Optional j;
    
    static {
        a = a().a();
    }
    
    public abla() {
    }
    
    public abla(final xbt b, final boolean c, final int d, final int e, final boolean f, final boolean g, final zfe h, final Optional i, final Optional j) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public static abkz a() {
        final abkz abkz = new abkz(null);
        abkz.d(false);
        abkz.f(-1);
        abkz.e();
        abkz.c(false);
        abkz.b(false);
        return abkz;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof abla) {
            final abla abla = (abla)o;
            final xbt b = this.b;
            if (b == null) {
                if (abla.b != null) {
                    return false;
                }
            }
            else if (!b.equals(abla.b)) {
                return false;
            }
            if (this.c == abla.c && this.d == abla.d && this.e == abla.e && this.f == abla.f && this.g == abla.g) {
                final zfe h = this.h;
                if (h == null) {
                    if (abla.h != null) {
                        return false;
                    }
                }
                else if (!h.equals((Object)abla.h)) {
                    return false;
                }
                if (this.i.equals((Object)abla.i) && this.j.equals((Object)abla.j)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final xbt b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final boolean c = this.c;
        int n = 1237;
        int n2;
        if (!c) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        final int d = this.d;
        final int e = this.e;
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
        final zfe h = this.h;
        if (h != null) {
            hashCode = h.hashCode();
        }
        return ((((((((hashCode2 ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ d) * 1000003 ^ e) * 1000003 ^ n3) * 1000003 ^ n) * 1000003 ^ hashCode) * 1000003 ^ this.i.hashCode()) * 1000003 ^ this.j.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final boolean c = this.c;
        final int d = this.d;
        final int e = this.e;
        final boolean f = this.f;
        final boolean g = this.g;
        final String value2 = String.valueOf(this.h);
        final String value3 = String.valueOf(this.i);
        final String value4 = String.valueOf(this.j);
        final StringBuilder sb = new StringBuilder("PlaybackStartParameters{latencyActionLogger=");
        sb.append(value);
        sb.append(", shouldUseQueuedVideoForNavigation=");
        sb.append(c);
        sb.append(", watchNextResponseProcessingDelay=");
        sb.append(d);
        sb.append(", watchNextResponseParsingDelay=");
        sb.append(e);
        sb.append(", shouldPauseOnLastFrame=");
        sb.append(f);
        sb.append(", mediaSessionDisabled=");
        sb.append(g);
        sb.append(", expectedViewport=");
        sb.append(value2);
        sb.append(", initialPlaybackVideoQuality=");
        sb.append(value3);
        sb.append(", initialPlaybackVideoQualityFixedResolution=");
        sb.append(value4);
        sb.append("}");
        return sb.toString();
    }
}
