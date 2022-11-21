import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adso
{
    public static final afma a;
    static final adso b;
    public final boolean c;
    public final Duration d;
    public final Duration e;
    public final boolean f;
    
    static {
        a = afma.m("com/google/android/livesharing/internal/ClientConfigInfo");
        b = a().a();
    }
    
    public adso() {
    }
    
    public adso(final boolean c, final Duration d, final Duration e, final boolean f) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static adsn a() {
        final adsn adsn = new adsn();
        adsn.c(false);
        adsn.d(Duration.ofSeconds(1L));
        adsn.e(Duration.ofMillis(200L));
        adsn.b(false);
        return adsn;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adso) {
            final adso adso = (adso)o;
            if (this.c == adso.c && this.d.equals((Object)adso.d) && this.e.equals((Object)adso.e) && this.f == adso.f) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final boolean c = this.c;
        int n = 1237;
        int n2;
        if (!c) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        final int hashCode = this.d.hashCode();
        final int hashCode2 = this.e.hashCode();
        if (this.f) {
            n = 1231;
        }
        return (((n2 ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ hashCode2) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final boolean c = this.c;
        final String value = String.valueOf(this.d);
        final String value2 = String.valueOf(this.e);
        final boolean f = this.f;
        final StringBuilder sb = new StringBuilder("ClientConfigInfo{disableHeartbeating=");
        sb.append(c);
        sb.append(", heartbeatFrequency=");
        sb.append(value);
        sb.append(", seekDeterminationThreshold=");
        sb.append(value2);
        sb.append(", alwaysOverride=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
