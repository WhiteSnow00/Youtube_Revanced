// 
// Decompiled by Procyon v0.6.0
// 

public enum ajqy implements ahbl
{
    a("EXO_PLAYER_CONFIG_FEATURES_UNSPECIFIED", 0, 0), 
    b("EXO_PLAYER_CONFIG_FEATURES_SORT_LIVE_FORMATS_BY_BANDWIDTH", 1, 3), 
    c("EXO_PLAYER_CONFIG_FEATURES_VERTICAL_TRANSCODE_BUGFIX", 2, 4), 
    d("EXO_PLAYER_CONFIG_FEATURES_DROPPED_FRAMES_CTMP_LOGGING", 3, 16), 
    e("EXO_PLAYER_CONFIG_FEATURES_RETRY_NET_NOCONTENT_WITH_DELAY", 4, 23), 
    f("EXO_PLAYER_CONFIG_FEATURES_REMOVE_EARLY_FETCH_FROM_PLAYER", 5, 33), 
    g("EXO_PLAYER_CONFIG_FEATURES_LOG_HTTP_HEADER_DECREASED", 6, 40), 
    h("EXO_PLAYER_CONFIG_FEATURES_USE_BUFFERED_DURATION_TO_DETECT_FULL_BUFFER", 7, 42), 
    i("EXO_PLAYER_CONFIG_FEATURES_USE_NEW_EXOPLAYER_PREPARE_API", 8, 43), 
    j("EXO_PLAYER_CONFIG_FEATURES_NATIVE_OFFLINE_STALECONFIG", 9, 47), 
    k("EXO_PLAYER_CONFIG_FEATURES_DEBUG_LOGGING_FOR_PACING", 10, 49), 
    l("UNRECOGNIZED", 11, -1);
    
    private static final ajqy[] m;
    private final int n;
    
    private ajqy(final String s, final int n, final int n2) {
        this.n = n2;
    }
    
    public static ahbn a() {
        return ajqf.k;
    }
    
    public static ajqy b(final int n) {
        if (n == 0) {
            return ajqy.a;
        }
        if (n == 16) {
            return ajqy.d;
        }
        if (n == 23) {
            return ajqy.e;
        }
        if (n == 33) {
            return ajqy.f;
        }
        if (n == 40) {
            return ajqy.g;
        }
        if (n == 47) {
            return ajqy.j;
        }
        if (n == 49) {
            return ajqy.k;
        }
        if (n == 3) {
            return ajqy.b;
        }
        if (n == 4) {
            return ajqy.c;
        }
        if (n == 42) {
            return ajqy.h;
        }
        if (n != 43) {
            return null;
        }
        return ajqy.i;
    }
    
    public final int getNumber() {
        if (this != ajqy.l) {
            return this.n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
