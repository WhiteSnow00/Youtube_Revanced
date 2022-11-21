// 
// Decompiled by Procyon v0.6.0
// 

public final class aamy
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final twp e;
    public final int f;
    public final boolean g;
    
    public aamy() {
    }
    
    public aamy(final boolean a, final boolean b, final boolean c, final int d, final twp e, final int f, final boolean g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static aamx a() {
        final aamx aamx = new aamx();
        aamx.c = 2131233028;
        final byte e = aamx.e;
        aamx.b = true;
        aamx.a = true;
        aamx.e = (byte)(e | 0x1E);
        aamx.c(false);
        aamx.d((twp)aamw.a);
        aamx.d = 10;
        aamx.e |= 0x20;
        aamx.b();
        return aamx;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aamy) {
            final aamy aamy = (aamy)o;
            if (this.a == aamy.a && this.b == aamy.b && this.c == aamy.c && this.d == aamy.d && this.e.equals(aamy.e) && this.f == aamy.f && this.g == aamy.g) {
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
