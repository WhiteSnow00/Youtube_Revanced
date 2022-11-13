// 
// Decompiled by Procyon v0.6.0
// 

public enum ajrb implements ahbl
{
    A("EXO_PLAYER_HOT_CONFIG_FEATURES_DO_NOT_ATTACH_PROOF_OF_ORIGIN_TOKENS_TO_SERVER_REQUESTS", 26, 76), 
    B("EXO_PLAYER_HOT_CONFIG_FEATURES_IGNORE_LEFTOVER_TRANSITION", 27, 84), 
    C("UNRECOGNIZED", 28, -1);
    
    private static final ajrb[] D;
    
    a("EXO_PLAYER_HOT_CONFIG_FEATURES_UNSPECIFIED", 0, 0), 
    b("EXO_PLAYER_HOT_CONFIG_FEATURES_DISABLE_EVENT_SUPPRESSION", 1, 11), 
    c("EXO_PLAYER_HOT_CONFIG_FEATURES_REPORT_PRE_AUDIO_TRACK_LATENCY", 2, 14), 
    d("EXO_PLAYER_HOT_CONFIG_FEATURES_PLAYER_DEBUG_LOGGING", 3, 18), 
    e("EXO_PLAYER_HOT_CONFIG_FEATURES_EOFEXCEPTION_IS_FATAL", 4, 20), 
    f("EXO_PLAYER_HOT_CONFIG_FEATURES_ENABLE_STUCK_MEDIA_CTMP_LOGGING", 5, 23), 
    g("EXO_PLAYER_HOT_CONFIG_FEATURES_LOG_VOLUME", 6, 26), 
    h("EXO_PLAYER_HOT_CONFIG_FEATURES_SEAMLESS_SFR_FALLBACK_WITH_ABR", 7, 27), 
    i("EXO_PLAYER_HOT_CONFIG_FEATURES_FILTER_DISPROPORTIONAL_FORMATS", 8, 28), 
    j("EXO_PLAYER_HOT_CONFIG_FEATURES_DISABLE_SURFACE_RELEASED_RETRY", 9, 33), 
    k("EXO_PLAYER_HOT_CONFIG_FEATURES_ENABLE_CACHE_NULL_CHUNK_INDEX", 10, 35), 
    l("EXO_PLAYER_HOT_CONFIG_FEATURES_USE_FRAMEWORK_PLAYER", 11, 37), 
    m("EXO_PLAYER_HOT_CONFIG_FEATURES_AV1_DEBUG_LOGGING", 12, 45), 
    n("EXO_PLAYER_HOT_CONFIG_FEATURES_ENABLE_CACHE_OPTIMIZATIONS", 13, 46), 
    o("EXO_PLAYER_HOT_CONFIG_FEATURES_ORDER_CACHED_FORMATS_BY_BITRATE", 14, 52), 
    p("EXO_PLAYER_HOT_CONFIG_FEATURES_IGNORE_PREWARMING_FOR_OFFLINE", 15, 54), 
    q("EXO_PLAYER_HOT_CONFIG_FEATURES_IGNORE_PREWARMED_DATASOURCE_CHAIN_FOR_OFFLINE", 16, 56), 
    r("EXO_PLAYER_HOT_CONFIG_FEATURES_LOG_SIMPLE_BITRATE_CAP_ABR_BW", 17, 59), 
    s("EXO_PLAYER_HOT_CONFIG_FEATURES_ASYNC_QUEUEING", 18, 61), 
    t("EXO_PLAYER_HOT_CONFIG_FEATURES_ASYNC_QUEUEING_FORCE_WORKAROUND", 19, 62), 
    u("EXO_PLAYER_HOT_CONFIG_FEATURES_ASYNC_QUEUEING_SYNCHRONIZED_INTERACTIONS", 20, 63), 
    v("EXO_PLAYER_HOT_CONFIG_FEATURES_HARD_RESET_RENDERERS", 21, 65), 
    w("EXO_PLAYER_HOT_CONFIG_FEATURES_REPORT_CODEC_DISCARD_REASON", 22, 67), 
    x("EXO_PLAYER_HOT_CONFIG_FEATURES_DEPRECATE_FORMATSTREAM_COMPARATOR", 23, 68), 
    y("EXO_PLAYER_HOT_CONFIG_FEATURES_CLIENT_FORMAT_SELECTION_FOR_OFFLINE", 24, 73), 
    z("EXO_PLAYER_HOT_CONFIG_FEATURES_RECOVERABLE_CODEC_EXCEPTION_RETRIES", 25, 74);
    
    private final int E;
    
    private ajrb(final String s, final int n, final int e) {
        this.E = e;
    }
    
    public static ahbn a() {
        return ajqf.m;
    }
    
    public static ajrb b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 84: {
                return ajrb.B;
            }
            case 76: {
                return ajrb.A;
            }
            case 74: {
                return ajrb.z;
            }
            case 73: {
                return ajrb.y;
            }
            case 68: {
                return ajrb.x;
            }
            case 67: {
                return ajrb.w;
            }
            case 65: {
                return ajrb.v;
            }
            case 63: {
                return ajrb.u;
            }
            case 62: {
                return ajrb.t;
            }
            case 61: {
                return ajrb.s;
            }
            case 59: {
                return ajrb.r;
            }
            case 56: {
                return ajrb.q;
            }
            case 54: {
                return ajrb.p;
            }
            case 52: {
                return ajrb.o;
            }
            case 46: {
                return ajrb.n;
            }
            case 45: {
                return ajrb.m;
            }
            case 37: {
                return ajrb.l;
            }
            case 35: {
                return ajrb.k;
            }
            case 33: {
                return ajrb.j;
            }
            case 28: {
                return ajrb.i;
            }
            case 27: {
                return ajrb.h;
            }
            case 26: {
                return ajrb.g;
            }
            case 23: {
                return ajrb.f;
            }
            case 20: {
                return ajrb.e;
            }
            case 18: {
                return ajrb.d;
            }
            case 14: {
                return ajrb.c;
            }
            case 11: {
                return ajrb.b;
            }
            case 0: {
                return ajrb.a;
            }
        }
    }
    
    public final int getNumber() {
        if (this != ajrb.C) {
            return this.E;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
