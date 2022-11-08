// 
// Decompiled by Procyon v0.6.0
// 

public enum amcp implements agzm
{
    a("MDX_SESSION_SOURCE_UNKNOWN", 0, 0), 
    b("MDX_SESSION_SOURCE_ROUTE_BUTTON", 1, 1), 
    c("MDX_SESSION_SOURCE_SMART_REMOTE_MEALBAR", 2, 2), 
    d("MDX_SESSION_SOURCE_CONTENT_RECOMMENDATION_NOTIFICATION", 3, 3), 
    e("MDX_SESSION_SOURCE_MEMENTO_MEALBAR", 4, 4), 
    f("MDX_SESSION_SOURCE_LIVE_STREAM_MEALBAR", 5, 5), 
    g("MDX_SESSION_SOURCE_SMART_PAIRING_SELECT_DEVICE", 6, 6), 
    h("MDX_SESSION_SOURCE_TV_CODE", 7, 7), 
    i("MDX_SESSION_SOURCE_AUTOCONNECT", 8, 8), 
    j("MDX_SESSION_SOURCE_NITRATE_MEALBAR", 9, 9), 
    k("MDX_SESSION_SOURCE_AUTOCONNECT_COMMENTS", 10, 10), 
    l("MDX_SESSION_SOURCE_STREAM_TRANSFER", 11, 11), 
    m("MDX_SESSION_SOURCE_ALWAYS_AUTOCONNECT", 12, 12);
    
    public final int n;
    
    private amcp(final String s, final int n, final int n2) {
        this.n = n2;
    }
    
    public static agzo a() {
        return alyk.s;
    }
    
    public static amcp b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 12: {
                return amcp.m;
            }
            case 11: {
                return amcp.l;
            }
            case 10: {
                return amcp.k;
            }
            case 9: {
                return amcp.j;
            }
            case 8: {
                return amcp.i;
            }
            case 7: {
                return amcp.h;
            }
            case 6: {
                return amcp.g;
            }
            case 5: {
                return amcp.f;
            }
            case 4: {
                return amcp.e;
            }
            case 3: {
                return amcp.d;
            }
            case 2: {
                return amcp.c;
            }
            case 1: {
                return amcp.b;
            }
            case 0: {
                return amcp.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.n;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.n);
    }
}
