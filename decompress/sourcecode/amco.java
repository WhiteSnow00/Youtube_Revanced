// 
// Decompiled by Procyon v0.6.0
// 

public enum amco implements agzm
{
    A("MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE", 26, 26), 
    B("MDX_SESSION_DISCONNECT_REASON_UNMATCHING_THEME", 27, 27), 
    C("MDX_SESSION_DISCONNECT_REASON_RECEIVER_DEAD_AFTER_RECEIVER_PING", 28, 28), 
    D("MDX_SESSION_DISCONNECT_REASON_KIDS_ON_CAST_ICON_VISIBILITY_HIDDEN", 29, 29), 
    E("MDX_SESSION_DISCONNECT_REASON_DIAL_CLOUD_SCREEN_FOR_PAIRING_CODE_NOT_FOUND", 30, 30), 
    F("MDX_SESSION_DISCONNECT_REASON_DIAL_RECOVERY_SMOOTH_PAIRING_SCREEN_NOT_ONLINE", 31, 31), 
    G("MDX_SESSION_DISCONNECT_REASON_DIAL_RECOVERY_WAKE_ON_LAN_STARTED", 32, 32), 
    H("MDX_SESSION_DISCONNECT_REASON_CLOUD_CHANNEL_NETWORK_ERROR", 33, 33), 
    I("MDX_SESSION_DISCONNECT_REASON_WEB_SOCKET_NETWORK_ERROR", 34, 34), 
    J("MDX_SESSION_DISCONNECT_REASON_CAST_SDK_NETWORK_ERROR", 35, 35), 
    K("MDX_SESSION_DISCONNECT_REASON_DIAL_LAUNCH_NETWORK_ERROR", 36, 36), 
    L("MDX_SESSION_DISCONNECT_REASON_NETWORK_CHANGED_ON_REACHABILITY_UPDATE", 37, 37), 
    M("MDX_SESSION_DISCONNECT_REASON_CAST_DISCONNECT_TIMEOUT", 38, 38), 
    N("MDX_SESSION_DISCONNECT_REASON_APP_LAUNCH_CAST_INIT_TIMEOUT", 39, 39), 
    O("MDX_SESSION_DISCONNECT_REASON_CAST_SESSION_START_FAILED_ERROR", 40, 41), 
    P("MDX_SESSION_DISCONNECT_REASON_GENERAL_CAST_SDK_DISCONNECT", 41, 42), 
    a("MDX_SESSION_DISCONNECT_REASON_UNKNOWN", 0, 0), 
    b("MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER", 1, 1), 
    c("MDX_SESSION_DISCONNECT_REASON_ROUTE_UNSELECTED", 2, 2), 
    d("MDX_SESSION_DISCONNECT_REASON_INCOGNITO", 3, 3), 
    e("MDX_SESSION_DISCONNECT_REASON_NETWORK", 4, 4), 
    f("MDX_SESSION_DISCONNECT_REASON_USER_CHANGED", 5, 5), 
    g("MDX_SESSION_DISCONNECT_REASON_SCREEN_APP_STOPPED", 6, 6), 
    h("MDX_SESSION_DISCONNECT_REASON_CONNECTION_TIMEOUT", 7, 7), 
    i("MDX_SESSION_DISCONNECT_REASON_CLOUD_SCREEN_NOT_FOUND", 8, 8), 
    j("MDX_SESSION_DISCONNECT_REASON_CLOUD_NO_LOUNGE_TOKEN", 9, 9), 
    k("MDX_SESSION_DISCONNECT_REASON_DIAL_MISSING_URL", 10, 10), 
    l("MDX_SESSION_DISCONNECT_REASON_DIAL_WAKE_ON_LAN_FAILED", 11, 11), 
    m("MDX_SESSION_DISCONNECT_REASON_DIAL_SERVER_ERROR", 12, 12), 
    n("MDX_SESSION_DISCONNECT_REASON_DIAL_CLIENT_ERROR", 13, 13), 
    o("MDX_SESSION_DISCONNECT_REASON_NETWORK_CHANGED", 14, 14), 
    p("MDX_SESSION_DISCONNECT_REASON_LOUNGE_TOKEN_REQUEST_FAILED", 15, 15), 
    q("MDX_SESSION_DISCONNECT_REASON_MDX_STOPPED", 16, 16), 
    r("MDX_SESSION_DISCONNECT_REASON_BROWSER_CHANNEL_ERROR", 17, 17), 
    s("MDX_SESSION_DISCONNECT_REASON_RECONNECT_REQUEST_FAILED", 18, 18), 
    t("MDX_SESSION_DISCONNECT_REASON_CAST_SDK_DISCONNECTED", 19, 19), 
    u("MDX_SESSION_DISCONNECT_REASON_LOUNGE_TOKEN_UNAUTHORIZED", 20, 20), 
    v("MDX_SESSION_DISCONNECT_REASON_APP_TERMINATED", 21, 21), 
    w("MDX_SESSION_DISCONNECT_REASON_MULTI_USER_NOT_ALLOWED", 22, 22), 
    x("MDX_SESSION_DISCONNECT_REASON_DIAL_SCREEN_UNAVAILABLE", 23, 23), 
    y("MDX_SESSION_DISCONNECT_REASON_CAST_AUTHENTICATION_FAILURE", 24, 24), 
    z("MDX_SESSION_DISCONNECT_REASON_CAST_SDK_CANCELLED", 25, 25);
    
    public final int Q;
    
    private amco(final String s, final int n, final int q) {
        this.Q = q;
    }
    
    public static agzo a() {
        return alyk.r;
    }
    
    public static amco b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 42: {
                return amco.P;
            }
            case 41: {
                return amco.O;
            }
            case 39: {
                return amco.N;
            }
            case 38: {
                return amco.M;
            }
            case 37: {
                return amco.L;
            }
            case 36: {
                return amco.K;
            }
            case 35: {
                return amco.J;
            }
            case 34: {
                return amco.I;
            }
            case 33: {
                return amco.H;
            }
            case 32: {
                return amco.G;
            }
            case 31: {
                return amco.F;
            }
            case 30: {
                return amco.E;
            }
            case 29: {
                return amco.D;
            }
            case 28: {
                return amco.C;
            }
            case 27: {
                return amco.B;
            }
            case 26: {
                return amco.A;
            }
            case 25: {
                return amco.z;
            }
            case 24: {
                return amco.y;
            }
            case 23: {
                return amco.x;
            }
            case 22: {
                return amco.w;
            }
            case 21: {
                return amco.v;
            }
            case 20: {
                return amco.u;
            }
            case 19: {
                return amco.t;
            }
            case 18: {
                return amco.s;
            }
            case 17: {
                return amco.r;
            }
            case 16: {
                return amco.q;
            }
            case 15: {
                return amco.p;
            }
            case 14: {
                return amco.o;
            }
            case 13: {
                return amco.n;
            }
            case 12: {
                return amco.m;
            }
            case 11: {
                return amco.l;
            }
            case 10: {
                return amco.k;
            }
            case 9: {
                return amco.j;
            }
            case 8: {
                return amco.i;
            }
            case 7: {
                return amco.h;
            }
            case 6: {
                return amco.g;
            }
            case 5: {
                return amco.f;
            }
            case 4: {
                return amco.e;
            }
            case 3: {
                return amco.d;
            }
            case 2: {
                return amco.c;
            }
            case 1: {
                return amco.b;
            }
            case 0: {
                return amco.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.Q;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.Q);
    }
}
