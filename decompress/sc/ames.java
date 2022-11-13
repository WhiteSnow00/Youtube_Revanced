// 
// Decompiled by Procyon v0.6.0
// 

public enum ames implements ahbl
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
    P("MDX_SESSION_DISCONNECT_REASON_GENERAL_CAST_SDK_DISCONNECT", 41, 42);
    
    private static final ames[] R;
    
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
    
    private ames(final String s, final int n, final int q) {
        this.Q = q;
    }
    
    public static ahbn a() {
        return alyw.s;
    }
    
    public static ames b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 42: {
                return ames.P;
            }
            case 41: {
                return ames.O;
            }
            case 39: {
                return ames.N;
            }
            case 38: {
                return ames.M;
            }
            case 37: {
                return ames.L;
            }
            case 36: {
                return ames.K;
            }
            case 35: {
                return ames.J;
            }
            case 34: {
                return ames.I;
            }
            case 33: {
                return ames.H;
            }
            case 32: {
                return ames.G;
            }
            case 31: {
                return ames.F;
            }
            case 30: {
                return ames.E;
            }
            case 29: {
                return ames.D;
            }
            case 28: {
                return ames.C;
            }
            case 27: {
                return ames.B;
            }
            case 26: {
                return ames.A;
            }
            case 25: {
                return ames.z;
            }
            case 24: {
                return ames.y;
            }
            case 23: {
                return ames.x;
            }
            case 22: {
                return ames.w;
            }
            case 21: {
                return ames.v;
            }
            case 20: {
                return ames.u;
            }
            case 19: {
                return ames.t;
            }
            case 18: {
                return ames.s;
            }
            case 17: {
                return ames.r;
            }
            case 16: {
                return ames.q;
            }
            case 15: {
                return ames.p;
            }
            case 14: {
                return ames.o;
            }
            case 13: {
                return ames.n;
            }
            case 12: {
                return ames.m;
            }
            case 11: {
                return ames.l;
            }
            case 10: {
                return ames.k;
            }
            case 9: {
                return ames.j;
            }
            case 8: {
                return ames.i;
            }
            case 7: {
                return ames.h;
            }
            case 6: {
                return ames.g;
            }
            case 5: {
                return ames.f;
            }
            case 4: {
                return ames.e;
            }
            case 3: {
                return ames.d;
            }
            case 2: {
                return ames.c;
            }
            case 1: {
                return ames.b;
            }
            case 0: {
                return ames.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.Q;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.Q);
    }
}
