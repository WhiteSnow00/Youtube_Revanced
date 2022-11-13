// 
// Decompiled by Procyon v0.6.0
// 

public enum amer implements ahbl
{
    a("MDX_SESSION_CAST_EVENT_TYPE_UNKNOWN", 0, 0), 
    b("MDX_SESSION_CAST_EVENT_TYPE_CAST_CONTEXT_INITIALIZED", 1, 1), 
    c("MDX_SESSION_CAST_EVENT_TYPE_CAST_STARTING", 2, 2), 
    d("MDX_SESSION_CAST_EVENT_TYPE_SCREEN_APP_LAUNCHED", 3, 3), 
    e("MDX_SESSION_CAST_EVENT_TYPE_CAST_START_FAILED", 4, 4), 
    f("MDX_SESSION_CAST_EVENT_TYPE_RECONNECTING", 5, 5), 
    g("MDX_SESSION_CAST_EVENT_TYPE_RECONNECTED", 6, 6), 
    h("MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_FAILED", 7, 7), 
    i("MDX_SESSION_CAST_EVENT_TYPE_SUSPENDED", 8, 8), 
    j("MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_MISMATCH", 9, 9), 
    k("MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_SKIPPED", 10, 10), 
    l("MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_NOT_RECOVERY", 11, 11);
    
    private static final amer[] n;
    public final int m;
    
    private amer(final String s, final int n, final int m) {
        this.m = m;
    }
    
    public static ahbn a() {
        return alyw.r;
    }
    
    public static amer b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 11: {
                return amer.l;
            }
            case 10: {
                return amer.k;
            }
            case 9: {
                return amer.j;
            }
            case 8: {
                return amer.i;
            }
            case 7: {
                return amer.h;
            }
            case 6: {
                return amer.g;
            }
            case 5: {
                return amer.f;
            }
            case 4: {
                return amer.e;
            }
            case 3: {
                return amer.d;
            }
            case 2: {
                return amer.c;
            }
            case 1: {
                return amer.b;
            }
            case 0: {
                return amer.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.m;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.m);
    }
}
