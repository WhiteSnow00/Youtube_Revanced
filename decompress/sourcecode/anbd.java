// 
// Decompiled by Procyon v0.6.0
// 

public enum anbd implements agzm
{
    a("PLAYBACK_EXCEPTION_ERROR_REASON_UNKNOWN", 0, 0), 
    b("PLAYBACK_EXCEPTION_ERROR_REASON_VIDEO_ERROR", 1, 1), 
    c("PLAYBACK_EXCEPTION_ERROR_REASON_UNPLAYABLE", 2, 2), 
    d("PLAYBACK_EXCEPTION_ERROR_REASON_REQUEST_FAILED", 3, 3), 
    e("PLAYBACK_EXCEPTION_ERROR_REASON_USER_AGE_CHECK_FAILED", 4, 4), 
    f("PLAYBACK_EXCEPTION_ERROR_REASON_USER_CONTENT_CHECK_FAILED", 5, 5), 
    g("PLAYBACK_EXCEPTION_ERROR_REASON_LICENSE_SERVER_ERROR", 6, 6), 
    h("PLAYBACK_EXCEPTION_ERROR_REASON_LICENSE_SERVER_NET_ERROR", 7, 7), 
    i("PLAYBACK_EXCEPTION_ERROR_REASON_LICENSE_SERVER_CONCURRENT_PLAYBACK_ERROR", 8, 8), 
    j("PLAYBACK_EXCEPTION_ERROR_REASON_PLAYER_ERROR", 9, 9), 
    k("PLAYBACK_EXCEPTION_ERROR_REASON_NO_STREAMS", 10, 10), 
    l("PLAYBACK_EXCEPTION_ERROR_REASON_WATCH_NEXT_ERROR", 11, 11), 
    m("PLAYBACK_EXCEPTION_ERROR_REASON_UNPLAYABLE_IN_BACKGROUND", 12, 12), 
    n("PLAYBACK_EXCEPTION_ERROR_REASON_UNPLAYABLE_BY_APP_POLICY", 13, 13), 
    o("PLAYBACK_EXCEPTION_ERROR_REASON_PARTIAL_PLAYBACK_DATA_EXHAUSTED", 14, 14);
    
    public final int p;
    
    private anbd(final String s, final int n, final int p3) {
        this.p = p3;
    }
    
    public static agzo a() {
        return anaf.e;
    }
    
    public static anbd b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 14: {
                return anbd.o;
            }
            case 13: {
                return anbd.n;
            }
            case 12: {
                return anbd.m;
            }
            case 11: {
                return anbd.l;
            }
            case 10: {
                return anbd.k;
            }
            case 9: {
                return anbd.j;
            }
            case 8: {
                return anbd.i;
            }
            case 7: {
                return anbd.h;
            }
            case 6: {
                return anbd.g;
            }
            case 5: {
                return anbd.f;
            }
            case 4: {
                return anbd.e;
            }
            case 3: {
                return anbd.d;
            }
            case 2: {
                return anbd.c;
            }
            case 1: {
                return anbd.b;
            }
            case 0: {
                return anbd.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.p;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.p);
    }
}
