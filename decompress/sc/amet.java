// 
// Decompiled by Procyon v0.6.0
// 

public enum amet implements ahbl
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
    
    private static final amet[] o;
    public final int n;
    
    private amet(final String s, final int n, final int n2) {
        this.n = n2;
    }
    
    public static ahbn a() {
        return alyw.t;
    }
    
    public static amet b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 12: {
                return amet.m;
            }
            case 11: {
                return amet.l;
            }
            case 10: {
                return amet.k;
            }
            case 9: {
                return amet.j;
            }
            case 8: {
                return amet.i;
            }
            case 7: {
                return amet.h;
            }
            case 6: {
                return amet.g;
            }
            case 5: {
                return amet.f;
            }
            case 4: {
                return amet.e;
            }
            case 3: {
                return amet.d;
            }
            case 2: {
                return amet.c;
            }
            case 1: {
                return amet.b;
            }
            case 0: {
                return amet.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.n;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.n);
    }
}
