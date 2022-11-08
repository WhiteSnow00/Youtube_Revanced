// 
// Decompiled by Procyon v0.6.0
// 

public enum lpq implements agzm
{
    A("USTREAMER_SELECTED_MEDIA_STREAM", 26, 38), 
    a("UNKNOWN", 0, 0), 
    b("ONESIE_HEADER", 1, 10), 
    c("ONESIE_DATA", 2, 11), 
    d("ONESIE_ENCRYPTED_MEDIA", 3, 12), 
    e("MEDIA_HEADER", 4, 20), 
    f("MEDIA", 5, 21), 
    g("MEDIA_END", 6, 22), 
    h("LIVE_METADATA", 7, 31), 
    i("HOSTNAME_CHANGE_HINT_DEPRECATED", 8, 32), 
    j("LIVE_METADATA_PROMISE", 9, 33), 
    k("LIVE_METADATA_PROMISE_CANCELLATION", 10, 34), 
    l("NEXT_REQUEST_POLICY", 11, 35), 
    m("FORMAT_SELECTION_CONFIG", 12, 37), 
    n("FORMAT_INITIALIZATION_METADATA", 13, 42), 
    o("SABR_REDIRECT", 14, 43), 
    p("SABR_ERROR", 15, 44), 
    q("SABR_SEEK", 16, 45), 
    r("RELOAD_PLAYER_RESPONSE", 17, 46), 
    s("PLAYBACK_START_POLICY", 18, 47), 
    t("ALLOWED_CACHED_FORMATS", 19, 48), 
    u("START_BW_SAMPLING_HINT", 20, 49), 
    v("PAUSE_BW_SAMPLING_HINT", 21, 50), 
    w("SELECTABLE_FORMATS", 22, 51), 
    x("REQUEST_IDENTIFIER", 23, 52), 
    y("REQUEST_CANCELLATION_POLICY", 24, 53), 
    z("USTREAMER_VIDEO_AND_FORMAT_METADATA", 25, 36);
    
    public final int B;
    
    private lpq(final String s, final int n, final int b) {
        this.B = b;
    }
    
    public static lpq a(final int n) {
        if (n == 0) {
            return lpq.a;
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                switch (n) {
                                    default: {
                                        return null;
                                    }
                                    case 53: {
                                        return lpq.y;
                                    }
                                    case 52: {
                                        return lpq.x;
                                    }
                                    case 51: {
                                        return lpq.w;
                                    }
                                    case 50: {
                                        return lpq.v;
                                    }
                                    case 49: {
                                        return lpq.u;
                                    }
                                    case 48: {
                                        return lpq.t;
                                    }
                                    case 47: {
                                        return lpq.s;
                                    }
                                    case 46: {
                                        return lpq.r;
                                    }
                                    case 45: {
                                        return lpq.q;
                                    }
                                    case 44: {
                                        return lpq.p;
                                    }
                                    case 43: {
                                        return lpq.o;
                                    }
                                    case 42: {
                                        return lpq.n;
                                    }
                                }
                                break;
                            }
                            case 38: {
                                return lpq.A;
                            }
                            case 37: {
                                return lpq.m;
                            }
                            case 36: {
                                return lpq.z;
                            }
                            case 35: {
                                return lpq.l;
                            }
                            case 34: {
                                return lpq.k;
                            }
                            case 33: {
                                return lpq.j;
                            }
                            case 32: {
                                return lpq.i;
                            }
                            case 31: {
                                return lpq.h;
                            }
                        }
                        break;
                    }
                    case 22: {
                        return lpq.g;
                    }
                    case 21: {
                        return lpq.f;
                    }
                    case 20: {
                        return lpq.e;
                    }
                }
                break;
            }
            case 12: {
                return lpq.d;
            }
            case 11: {
                return lpq.c;
            }
            case 10: {
                return lpq.b;
            }
        }
    }
    
    public final int getNumber() {
        return this.B;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.B);
    }
}
