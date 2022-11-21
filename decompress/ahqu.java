// 
// Decompiled by Procyon v0.6.0
// 

public enum ahqu implements ahdd
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
    ab("YT_REMOTE", 53, 53);
    
    private static final ahqu[] ad;
    
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
    
    private ahqu(final String s, final int n, final int ac) {
        this.ac = ac;
    }
    
    public static ahdf a() {
        return ahqv.b;
    }
    
    public static ahqu b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 53: {
                return ahqu.ab;
            }
            case 52: {
                return ahqu.aa;
            }
            case 51: {
                return ahqu.Z;
            }
            case 50: {
                return ahqu.Y;
            }
            case 49: {
                return ahqu.X;
            }
            case 48: {
                return ahqu.W;
            }
            case 47: {
                return ahqu.B;
            }
            case 46: {
                return ahqu.V;
            }
            case 45: {
                return ahqu.U;
            }
            case 44: {
                return ahqu.T;
            }
            case 43: {
                return ahqu.S;
            }
            case 42: {
                return ahqu.R;
            }
            case 41: {
                return ahqu.Q;
            }
            case 40: {
                return ahqu.P;
            }
            case 39: {
                return ahqu.O;
            }
            case 38: {
                return ahqu.N;
            }
            case 37: {
                return ahqu.M;
            }
            case 36: {
                return ahqu.L;
            }
            case 35: {
                return ahqu.K;
            }
            case 34: {
                return ahqu.J;
            }
            case 33: {
                return ahqu.I;
            }
            case 32: {
                return ahqu.H;
            }
            case 31: {
                return ahqu.G;
            }
            case 30: {
                return ahqu.F;
            }
            case 29: {
                return ahqu.E;
            }
            case 28: {
                return ahqu.D;
            }
            case 27: {
                return ahqu.C;
            }
            case 26: {
                return ahqu.A;
            }
            case 25: {
                return ahqu.z;
            }
            case 24: {
                return ahqu.y;
            }
            case 23: {
                return ahqu.x;
            }
            case 22: {
                return ahqu.w;
            }
            case 21: {
                return ahqu.v;
            }
            case 20: {
                return ahqu.u;
            }
            case 19: {
                return ahqu.t;
            }
            case 18: {
                return ahqu.s;
            }
            case 17: {
                return ahqu.r;
            }
            case 16: {
                return ahqu.q;
            }
            case 15: {
                return ahqu.p;
            }
            case 14: {
                return ahqu.o;
            }
            case 13: {
                return ahqu.n;
            }
            case 12: {
                return ahqu.m;
            }
            case 11: {
                return ahqu.l;
            }
            case 10: {
                return ahqu.k;
            }
            case 9: {
                return ahqu.j;
            }
            case 8: {
                return ahqu.i;
            }
            case 7: {
                return ahqu.h;
            }
            case 6: {
                return ahqu.g;
            }
            case 5: {
                return ahqu.f;
            }
            case 4: {
                return ahqu.e;
            }
            case 3: {
                return ahqu.d;
            }
            case 2: {
                return ahqu.c;
            }
            case 1: {
                return ahqu.b;
            }
            case 0: {
                return ahqu.a;
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
