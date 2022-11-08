// 
// Decompiled by Procyon v0.6.0
// 

public enum amso implements agzm
{
    a("OFFLINE_PLAYBACK_DISABLED_REASON_UNSPECIFIED", 0, 0), 
    b("OFFLINE_PLAYBACK_DISABLED_REASON_LICENSE_SERVICE_PURCHASE_NOT_FOUND", 1, 1), 
    c("OFFLINE_PLAYBACK_DISABLED_REASON_LICENSE_SERVICE_OFFLINING_NOT_ALLOWED", 2, 2), 
    d("OFFLINE_PLAYBACK_DISABLED_REASON_LICENSE_SERVICE_OFFLINE_EXPIRED", 3, 3), 
    e("OFFLINE_PLAYBACK_DISABLED_REASON_LICENSE_SERVICE_DEVICE_DEAUTHORIZED", 4, 4), 
    f("OFFLINE_PLAYBACK_DISABLED_REASON_LICENSE_SERVICE_BACKEND_ERROR", 5, 5), 
    g("OFFLINE_PLAYBACK_DISABLED_REASON_LICENSE_SERVICE_PURCHASE_EXPIRED", 6, 6), 
    h("OFFLINE_PLAYBACK_DISABLED_REASON_TOO_MANY_ACTIVE_DEVICES_PER_ENTITLEMENT", 7, 7);
    
    private final int j;
    
    private amso(final String s, final int n, final int j) {
        this.j = j;
    }
    
    public static agzo a() {
        return amsc.j;
    }
    
    public static amso b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 7: {
                return amso.h;
            }
            case 6: {
                return amso.g;
            }
            case 5: {
                return amso.f;
            }
            case 4: {
                return amso.e;
            }
            case 3: {
                return amso.d;
            }
            case 2: {
                return amso.c;
            }
            case 1: {
                return amso.b;
            }
            case 0: {
                return amso.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.j;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.j);
    }
}
