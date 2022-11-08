// 
// Decompiled by Procyon v0.6.0
// 

public enum ahnf implements agzm
{
    A("MIDROLL_POS_SEC", 26, 26), 
    B("MIDROLL_POS_MS", 27, 47), 
    C("SLOT_POSITION", 28, 27), 
    D("BISCOTTI_ID", 29, 28), 
    E("REQUEST_TIME", 30, 29), 
    F("FLASH_VERSION", 31, 30), 
    G("IFRAME_STATE", 32, 31), 
    H("COMPANION_AD_TYPE", 33, 32), 
    I("USER_TIME_ZONE_OFFSET", 34, 33), 
    J("USER_HISTORY_LENGTH", 35, 34), 
    K("USER_BROWSER_ENABLED_JAVA", 36, 35), 
    L("USER_SCREEN_HEIGHT", 37, 36), 
    M("USER_SCREEN_WIDTH", 38, 37), 
    N("USER_SCREEN_AVAILABLE_HEIGHT", 39, 38), 
    O("USER_SCREEN_AVAILABLE_WIDTH", 40, 39), 
    P("USER_SCREEN_COLOR_DEPTH", 41, 40), 
    Q("USER_BROWSER_NUM_PLUGINS", 42, 41), 
    R("USER_BROWSER_NUM_MIME_TYPES", 43, 42), 
    S("BREAK_TYPE", 44, 43), 
    T("LIVE_TARGETING_CONTEXT", 45, 44), 
    U("AUTONAV_STATE", 46, 45), 
    V("AD_BREAK_LENGTH", 47, 46), 
    W("ACTIVE_VIEW", 48, 48), 
    X("GOOGLE_VIEWABILITY", 49, 49), 
    Y("THIRD_PARTY_VIEWABILITY", 50, 50), 
    Z("DRIFT_FROM_HEAD_MS", 51, 51), 
    a("CONNECTIVITY", 0, 0), 
    aa("LIVE_INDEX", 52, 52), 
    ab("YT_REMOTE", 53, 53), 
    b("CLIENT_PLAYBACK_NONCE_KEY", 1, 1), 
    c("LAST_USER_INTERACTION_MS", 2, 2), 
    d("CONTENT_CURRENT_TIME_MS", 3, 3), 
    e("PLAYER_HEIGHT", 4, 4), 
    f("PLAYER_WIDTH", 5, 5), 
    g("REQUEST_WALL_TIME_MS", 6, 6), 
    h("SDK_VERSION", 7, 7), 
    i("PLAYER_VISIBILITY", 8, 8), 
    j("VOLUME", 9, 9), 
    k("CLIENT_WALLTIME_MS", 10, 10), 
    l("AD_CLIENT_PLAYBACK_NONCE_KEY", 11, 11), 
    m("AD_CURRENT_TIME_MS", 12, 12), 
    n("VSS_AD_CLIENT_PLAYBACK_NONCE_KEY", 13, 13), 
    o("AD_TIME_ON_SCREEN", 14, 14), 
    p("AD_WATCH_TIME", 15, 15), 
    q("AD_INTERACTION_X", 16, 16), 
    r("AD_INTERACTION_Y", 17, 17), 
    s("AD_DISALLOWED_REASONS", 18, 18), 
    t("BLOCKING_ERROR", 19, 19), 
    u("ERROR_MESSAGE", 20, 20), 
    v("IMA_ERROR_CODE", 21, 21), 
    w("INTERNAL_ID", 22, 22), 
    x("YT_ERROR_CODE", 23, 23), 
    y("TIME_SINCE_LAST_AD_SEC", 24, 24), 
    z("AD_BLOCK", 25, 25);
    
    public final int ac;
    
    private ahnf(final String s, final int n, final int ac) {
        this.ac = ac;
    }
    
    public static agzo a() {
        return ahng.b;
    }
    
    public static ahnf b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 53: {
                return ahnf.ab;
            }
            case 52: {
                return ahnf.aa;
            }
            case 51: {
                return ahnf.Z;
            }
            case 50: {
                return ahnf.Y;
            }
            case 49: {
                return ahnf.X;
            }
            case 48: {
                return ahnf.W;
            }
            case 47: {
                return ahnf.B;
            }
            case 46: {
                return ahnf.V;
            }
            case 45: {
                return ahnf.U;
            }
            case 44: {
                return ahnf.T;
            }
            case 43: {
                return ahnf.S;
            }
            case 42: {
                return ahnf.R;
            }
            case 41: {
                return ahnf.Q;
            }
            case 40: {
                return ahnf.P;
            }
            case 39: {
                return ahnf.O;
            }
            case 38: {
                return ahnf.N;
            }
            case 37: {
                return ahnf.M;
            }
            case 36: {
                return ahnf.L;
            }
            case 35: {
                return ahnf.K;
            }
            case 34: {
                return ahnf.J;
            }
            case 33: {
                return ahnf.I;
            }
            case 32: {
                return ahnf.H;
            }
            case 31: {
                return ahnf.G;
            }
            case 30: {
                return ahnf.F;
            }
            case 29: {
                return ahnf.E;
            }
            case 28: {
                return ahnf.D;
            }
            case 27: {
                return ahnf.C;
            }
            case 26: {
                return ahnf.A;
            }
            case 25: {
                return ahnf.z;
            }
            case 24: {
                return ahnf.y;
            }
            case 23: {
                return ahnf.x;
            }
            case 22: {
                return ahnf.w;
            }
            case 21: {
                return ahnf.v;
            }
            case 20: {
                return ahnf.u;
            }
            case 19: {
                return ahnf.t;
            }
            case 18: {
                return ahnf.s;
            }
            case 17: {
                return ahnf.r;
            }
            case 16: {
                return ahnf.q;
            }
            case 15: {
                return ahnf.p;
            }
            case 14: {
                return ahnf.o;
            }
            case 13: {
                return ahnf.n;
            }
            case 12: {
                return ahnf.m;
            }
            case 11: {
                return ahnf.l;
            }
            case 10: {
                return ahnf.k;
            }
            case 9: {
                return ahnf.j;
            }
            case 8: {
                return ahnf.i;
            }
            case 7: {
                return ahnf.h;
            }
            case 6: {
                return ahnf.g;
            }
            case 5: {
                return ahnf.f;
            }
            case 4: {
                return ahnf.e;
            }
            case 3: {
                return ahnf.d;
            }
            case 2: {
                return ahnf.c;
            }
            case 1: {
                return ahnf.b;
            }
            case 0: {
                return ahnf.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.ac;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.ac);
    }
}
