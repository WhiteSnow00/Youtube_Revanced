// 
// Decompiled by Procyon v0.6.0
// 

public enum amep implements ahbl
{
    a("MDX_NOTIFICATION_GEL_ACTION_UNKNOWN", 0, 0), 
    b("MDX_NOTIFICATION_GEL_ACTION_CLICKED", 1, 1), 
    c("MDX_NOTIFICATION_GEL_ACTION_NAVIGATED_TO_WATCH", 2, 2), 
    d("MDX_NOTIFICATION_GEL_ACTION_USER_CANCELLED", 3, 3), 
    e("MDX_NOTIFICATION_GEL_ACTION_CONNECTION_STARTED", 4, 4), 
    f("MDX_NOTIFICATION_GEL_ACTION_REVOKED_TTL", 5, 5), 
    g("MDX_NOTIFICATION_GEL_ACTION_REVOKED_DEVICE_NOT_FOUND", 6, 6), 
    h("MDX_NOTIFICATION_GEL_ACTION_REVOKED_STARTED_CASTING", 7, 7), 
    i("MDX_NOTIFICATION_GEL_ACTION_REVOKED_SIGNED_OUT", 8, 8);
    
    private static final amep[] k;
    public final int j;
    
    private amep(final String s, final int n, final int j) {
        this.j = j;
    }
    
    public static ahbn a() {
        return alyw.n;
    }
    
    public static amep b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 8: {
                return amep.i;
            }
            case 7: {
                return amep.h;
            }
            case 6: {
                return amep.g;
            }
            case 5: {
                return amep.f;
            }
            case 4: {
                return amep.e;
            }
            case 3: {
                return amep.d;
            }
            case 2: {
                return amep.c;
            }
            case 1: {
                return amep.b;
            }
            case 0: {
                return amep.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.j;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.j);
    }
}
