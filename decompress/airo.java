// 
// Decompiled by Procyon v0.6.0
// 

public enum airo implements ahdd
{
    A("CODEC_INIT_REASON_SET_OUTPUT_SURFACE_FAILED", 26, 26), 
    B("CODEC_INIT_REASON_INITIALIZATION_DATA", 27, 27), 
    C("CODEC_INIT_REASON_HDR", 28, 28), 
    D("CODEC_INIT_REASON_COLOR_TRANSFER", 29, 29), 
    E("CODEC_INIT_REASON_SURFACE", 30, 30), 
    F("CODEC_INIT_REASON_REUSE_INIT_WHILE_ON_BACKGROUND", 31, 33), 
    G("UNRECOGNIZED", 32, -1);
    
    private static final airo[] H;
    
    a("CODEC_INIT_REASON_UNKNOWN", 0, 0), 
    b("CODEC_INIT_REASON_ROTATION_DEGREE", 1, 1), 
    c("CODEC_INIT_REASON_COLOR_INFO", 2, 2), 
    d("CODEC_INIT_REASON_MIME_TYPE", 3, 3), 
    e("CODEC_INIT_REASON_DIMENSIONS", 4, 4), 
    f("CODEC_INIT_REASON_CODEC_OPERATING_RATE", 5, 5), 
    g("CODEC_INIT_REASON_MAX_WIDTH", 6, 6), 
    h("CODEC_INIT_REASON_MAX_HEIGHT", 7, 7), 
    i("CODEC_INIT_REASON_FORMAT_MAX_INPUT_SIZE", 8, 31), 
    j("CODEC_INIT_REASON_FIRST_PLAYBACK", 9, 9), 
    k("CODEC_INIT_REASON_ABRUPT_SPLICING", 10, 10), 
    l("CODEC_INIT_REASON_BACKGROUND", 11, 11), 
    m("CODEC_INIT_REASON_PREWARM", 12, 12), 
    n("CODEC_INIT_REASON_TRACK_RENDERER_TYPE_SWITCH", 13, 13), 
    o("CODEC_INIT_REASON_RESELECT_STREAMS", 14, 14), 
    p("CODEC_INIT_REASON_DETACH_MEDIA_VIEW", 15, 15), 
    q("CODEC_INIT_REASON_NULL_MEDIA_VIEW_SWITCH", 16, 16), 
    r("CODEC_INIT_REASON_PLAYER_SWITCH", 17, 17), 
    s("CODEC_INIT_REASON_PLAYER_RESET", 18, 18), 
    t("CODEC_INIT_REASON_EXOPLAYER_OVERRIDE", 19, 19), 
    u("CODEC_INIT_REASON_DRM_HD", 20, 20), 
    v("CODEC_INIT_REASON_DRM_STOPPED", 21, 21), 
    w("CODEC_INIT_REASON_STOP", 22, 22), 
    x("CODEC_INIT_REASON_CODEC_NAME", 23, 23), 
    y("CODEC_INIT_REASON_REUSE_DISABLED", 24, 24), 
    z("CODEC_INIT_REASON_CONFIGURE_FAILED", 25, 25);
    
    private final int I;
    
    private airo(final String s, final int n, final int i) {
        this.I = i;
    }
    
    public static ahdf a() {
        return aine.l;
    }
    
    public static airo b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 33: {
                return airo.F;
            }
            case 31: {
                return airo.i;
            }
            case 30: {
                return airo.E;
            }
            case 29: {
                return airo.D;
            }
            case 28: {
                return airo.C;
            }
            case 27: {
                return airo.B;
            }
            case 26: {
                return airo.A;
            }
            case 25: {
                return airo.z;
            }
            case 24: {
                return airo.y;
            }
            case 23: {
                return airo.x;
            }
            case 22: {
                return airo.w;
            }
            case 21: {
                return airo.v;
            }
            case 20: {
                return airo.u;
            }
            case 19: {
                return airo.t;
            }
            case 18: {
                return airo.s;
            }
            case 17: {
                return airo.r;
            }
            case 16: {
                return airo.q;
            }
            case 15: {
                return airo.p;
            }
            case 14: {
                return airo.o;
            }
            case 13: {
                return airo.n;
            }
            case 12: {
                return airo.m;
            }
            case 11: {
                return airo.l;
            }
            case 10: {
                return airo.k;
            }
            case 9: {
                return airo.j;
            }
            case 7: {
                return airo.h;
            }
            case 6: {
                return airo.g;
            }
            case 5: {
                return airo.f;
            }
            case 4: {
                return airo.e;
            }
            case 3: {
                return airo.d;
            }
            case 2: {
                return airo.c;
            }
            case 1: {
                return airo.b;
            }
            case 0: {
                return airo.a;
            }
        }
    }
    
    public final int getNumber() {
        if (this != airo.G) {
            return this.I;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
