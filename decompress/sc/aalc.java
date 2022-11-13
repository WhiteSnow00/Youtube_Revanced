// 
// Decompiled by Procyon v0.6.0
// 

public final class aalc
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final tvn e;
    public final int f;
    public final boolean g;
    
    public aalc() {
    }
    
    public aalc(final boolean a, final boolean b, final boolean c, final int d, final tvn e, final int f, final boolean g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static aalb a() {
        final aalb aalb = new aalb();
        aalb.c = 2131233028;
        final byte e = aalb.e;
        aalb.b = true;
        aalb.a = true;
        aalb.e = (byte)(e | 0x1E);
        aalb.c(false);
        aalb.d((tvn)aala.a);
        aalb.d = 10;
        aalb.e |= 0x20;
        aalb.b();
        return aalb;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aalc) {
            final aalc aalc = (aalc)o;
            if (this.a == aalc.a && this.b == aalc.b && this.c == aalc.c && this.d == aalc.d && this.e.equals(aalc.e) && this.f == aalc.f && this.g == aalc.g) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final boolean a = this.a;
        int n = 1231;
        int n2;
        if (!a) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        int n3;
        if (!this.b) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        int n4;
        if (!this.c) {
            n4 = 1237;
        }
        else {
            n4 = 1231;
        }
        final int d = this.d;
        final int hashCode = this.e.hashCode();
        final int f = this.f;
        if (!this.g) {
            n = 1237;
        }
        return (((((((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ 0x4D5) * 1000003 ^ n4) * 1000003 ^ d) * 1000003 ^ hashCode) * 1000003 ^ f) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final int d = this.d;
        final String value = String.valueOf(this.e);
        final int f = this.f;
        final boolean g = this.g;
        final StringBuilder sb = new StringBuilder("PlayerModuleConfig{onesieEnabled=");
        sb.append(a);
        sb.append(", enableVss2StatsTracking=");
        sb.append(b);
        sb.append(", enableRawCcSupport=false, enableLegacyHeartbeatFlow=");
        sb.append(c);
        sb.append(", backgroundNotificationIconResourceId=");
        sb.append(d);
        sb.append(", referringAppProvider=");
        sb.append(value);
        sb.append(", maximumConsecutiveSkippedUnplayableVideos=");
        sb.append(f);
        sb.append(", enableVss2UserPresenceTracking=");
        sb.append(g);
        sb.append("}");
        return sb.toString();
    }
}
