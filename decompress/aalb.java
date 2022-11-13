// 
// Decompiled by Procyon v0.6.0
// 

public final class aalb
{
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public byte e;
    private boolean f;
    private tvn g;
    private boolean h;
    
    public final aalc a() {
        if (this.e == 127) {
            final tvn g = this.g;
            if (g != null) {
                return new aalc(this.f, this.a, this.b, this.c, g, this.d, this.h);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if ((this.e & 0x1) == 0x0) {
            sb.append(" onesieEnabled");
        }
        if ((this.e & 0x2) == 0x0) {
            sb.append(" enableVss2StatsTracking");
        }
        if ((this.e & 0x4) == 0x0) {
            sb.append(" enableRawCcSupport");
        }
        if ((this.e & 0x8) == 0x0) {
            sb.append(" enableLegacyHeartbeatFlow");
        }
        if ((this.e & 0x10) == 0x0) {
            sb.append(" backgroundNotificationIconResourceId");
        }
        if (this.g == null) {
            sb.append(" referringAppProvider");
        }
        if ((this.e & 0x20) == 0x0) {
            sb.append(" maximumConsecutiveSkippedUnplayableVideos");
        }
        if ((this.e & 0x40) == 0x0) {
            sb.append(" enableVss2UserPresenceTracking");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b() {
        this.h = true;
        this.e |= 0x40;
    }
    
    public final void c(final boolean f) {
        this.f = f;
        this.e |= 0x1;
    }
    
    public final void d(final tvn g) {
        if (g != null) {
            this.g = g;
            return;
        }
        throw new NullPointerException("Null referringAppProvider");
    }
}
