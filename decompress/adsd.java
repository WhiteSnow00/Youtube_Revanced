import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adsd
{
    public final String a;
    public final Duration b;
    public final double c;
    public final int d;
    
    public adsd() {
    }
    
    public adsd(final String a, final Duration b, final double c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static adsc a() {
        return new adsc();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adsd) {
            final adsd adsd = (adsd)o;
            if (this.a.equals(adsd.a) && this.b.equals((Object)adsd.b) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(adsd.c)) {
                final int d = this.d;
                final int d2 = adsd.d;
                if (d == 0) {
                    throw null;
                }
                if (d == d2) {
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
        final long doubleToLongBits = Double.doubleToLongBits(this.c);
        final long doubleToLongBits2 = Double.doubleToLongBits(this.c);
        final int d = this.d;
        if (d != 0) {
            return (((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ (int)(doubleToLongBits >>> 32 ^ doubleToLongBits2)) * 1000003 ^ d;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String value = String.valueOf(this.b);
        final double c = this.c;
        final int d = this.d;
        String s;
        if (d != 1) {
            if (d != 2) {
                if (d != 3) {
                    if (d != 4) {
                        s = "null";
                    }
                    else {
                        s = "ENDED";
                    }
                }
                else {
                    s = "PAUSE";
                }
            }
            else {
                s = "PLAY";
            }
        }
        else {
            s = "BUFFERING";
        }
        final StringBuilder sb = new StringBuilder("CoWatchingState{mediaId=");
        sb.append(a);
        sb.append(", mediaPlayoutPosition=");
        sb.append(value);
        sb.append(", mediaPlayoutRate=");
        sb.append(c);
        sb.append(", playbackState=");
        sb.append(s);
        sb.append("}");
        return sb.toString();
    }
}
