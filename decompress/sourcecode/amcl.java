// 
// Decompiled by Procyon v0.6.0
// 

public enum amcl implements agzm
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
    
    public final int j;
    
    private amcl(final String s, final int n, final int j) {
        this.j = j;
    }
    
    public static agzo a() {
        return alyk.m;
    }
    
    public static amcl b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 8: {
                return amcl.i;
            }
            case 7: {
                return amcl.h;
            }
            case 6: {
                return amcl.g;
            }
            case 5: {
                return amcl.f;
            }
            case 4: {
                return amcl.e;
            }
            case 3: {
                return amcl.d;
            }
            case 2: {
                return amcl.c;
            }
            case 1: {
                return amcl.b;
            }
            case 0: {
                return amcl.a;
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
