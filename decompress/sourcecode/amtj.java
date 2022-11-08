// 
// Decompiled by Procyon v0.6.0
// 

public enum amtj implements agzm
{
    A("NO_AUDIO_STREAM", 26, 26), 
    B("TOO_MANY_FAILED_STREAM_VERIFICATIONS", 27, 27), 
    C("STREAM_VERIFICATION_FAILED", 28, 28), 
    D("RETRY_NOT_ALLOWED", 29, 29), 
    E("CANNOT_DOWNLOAD_STREAMS_FOR_OFFLINE_REFRESH", 30, 30), 
    F("YTB_ERROR", 31, 31), 
    G("OFFLINE_STREAM_URL_EXPIRED", 32, 32), 
    a("UNKNOWN_FAILURE_REASON", 0, 0), 
    b("CONNECTION_LOST", 1, 1), 
    c("LOW_STORAGE", 2, 2), 
    d("NO_FETCHED_DATA", 3, 3), 
    e("NO_RESPONSE", 4, 4), 
    f("NO_VIDEO_STREAM", 5, 5), 
    g("NOT_OFFLINABLE", 6, 6), 
    h("TOO_MANY_RETRIES", 7, 7), 
    @Deprecated
    i("OFFLINE_CONTENT_VALIDATION_ERROR", 8, 8), 
    @Deprecated
    j("OFFLINE_CONTENT_EXPIRED", 9, 9), 
    k("NOT_PLAYABLE", 10, 10), 
    l("NO_OFFLINE_STORAGE", 11, 11), 
    m("TRANSFER_PAUSED", 12, 12), 
    n("AD_FAILED_TO_GET_FORMAT_STREAM", 13, 13), 
    o("AD_NO_FORMAT_STREAMS_AVAILABLE", 14, 14), 
    p("AD_FAILED_UNKNOWN_REASON", 15, 15), 
    q("PLAYER_REQUEST_FAILURE", 16, 16), 
    r("OFFLINE_REQUEST_FAILURE", 17, 17), 
    s("OFFLINE_DATABASE_ERROR", 18, 18), 
    t("OFFLINE_DOWNLOAD_CONTROLLER_ERROR", 19, 19), 
    u("OFFLINE_VIDEO_NOT_FOUND_IN_DATABASE", 20, 20), 
    v("OFFLINE_DISK_ERROR", 21, 21), 
    w("OFFLINE_TRANSFER_INTERRUPTED", 22, 22), 
    x("OFFLINE_WIDEVINE_EXCEPTION", 23, 23), 
    y("OFFLINE_NETWORK_ERROR", 24, 24), 
    @Deprecated
    z("OFFLINE_TIME_WINDOW_EXCEEDED", 25, 25);
    
    public final int H;
    
    private amtj(final String s, final int n, final int h) {
        this.H = h;
    }
    
    public static agzo a() {
        return amsc.s;
    }
    
    public static amtj b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 32: {
                return amtj.G;
            }
            case 31: {
                return amtj.F;
            }
            case 30: {
                return amtj.E;
            }
            case 29: {
                return amtj.D;
            }
            case 28: {
                return amtj.C;
            }
            case 27: {
                return amtj.B;
            }
            case 26: {
                return amtj.A;
            }
            case 25: {
                return amtj.z;
            }
            case 24: {
                return amtj.y;
            }
            case 23: {
                return amtj.x;
            }
            case 22: {
                return amtj.w;
            }
            case 21: {
                return amtj.v;
            }
            case 20: {
                return amtj.u;
            }
            case 19: {
                return amtj.t;
            }
            case 18: {
                return amtj.s;
            }
            case 17: {
                return amtj.r;
            }
            case 16: {
                return amtj.q;
            }
            case 15: {
                return amtj.p;
            }
            case 14: {
                return amtj.o;
            }
            case 13: {
                return amtj.n;
            }
            case 12: {
                return amtj.m;
            }
            case 11: {
                return amtj.l;
            }
            case 10: {
                return amtj.k;
            }
            case 9: {
                return amtj.j;
            }
            case 8: {
                return amtj.i;
            }
            case 7: {
                return amtj.h;
            }
            case 6: {
                return amtj.g;
            }
            case 5: {
                return amtj.f;
            }
            case 4: {
                return amtj.e;
            }
            case 3: {
                return amtj.d;
            }
            case 2: {
                return amtj.c;
            }
            case 1: {
                return amtj.b;
            }
            case 0: {
                return amtj.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.H;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.H);
    }
}
