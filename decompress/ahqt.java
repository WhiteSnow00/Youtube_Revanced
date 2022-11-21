// 
// Decompiled by Procyon v0.6.0
// 

public enum ahqt implements ahdd
{
    A("LAYOUT_TYPE_WATCH_NEXT_RESPONSE", 26, 61), 
    B("LAYOUT_TYPE_DISPLAY_SQUARE_IMAGE", 27, 35), 
    C("LAYOUT_TYPE_DISPLAY_COMPACT_SQUARE_IMAGE", 28, 36), 
    D("LAYOUT_TYPE_DISPLAY_COMPACT_LANDSCAPE_IMAGE", 29, 37), 
    E("LAYOUT_TYPE_DISPLAY_FULL_WIDTH_SQUARE_IMAGE", 30, 38), 
    F("LAYOUT_TYPE_DISPLAY_FULL_WIDTH_PORTRAIT_IMAGE", 31, 93), 
    G("LAYOUT_TYPE_DISPLAY_LANDSCAPE_IMAGE_WIDE_BUTTON", 32, 39), 
    H("LAYOUT_TYPE_DISPLAY_LANDSCAPE_IMAGE", 33, 40), 
    I("LAYOUT_TYPE_DISPLAY_TEXT_BUTTONED_HEADERED", 34, 41), 
    J("LAYOUT_TYPE_DISPLAY_SQUARE_IMAGE_X_DISPLAY_TOP_LANDSCAPE_IMAGE", 35, 42), 
    K("LAYOUT_TYPE_DISPLAY_LANDSCAPE_IMAGE_WIDE_BUTTON_X_DISPLAY_TOP_LANDSCAPE_IMAGE", 36, 43), 
    L("LAYOUT_TYPE_DISPLAY_TOP_LANDSCAPE_IMAGE", 37, 44), 
    M("LAYOUT_TYPE_DISPLAY_TOP_LANDSCAPE_IMAGE_BUTTON", 38, 45), 
    N("LAYOUT_TYPE_CAROUSEL_FOOTERED", 39, 24), 
    O("LAYOUT_TYPE_CAROUSEL_FOOTERED_BUTTONED", 40, 27), 
    P("LAYOUT_TYPE_CAROUSEL_HEADERED", 41, 28), 
    Q("LAYOUT_TYPE_VIDEO_DISPLAY_FULL", 42, 29), 
    R("LAYOUT_TYPE_VIDEO_DISPLAY_FULL_HEADERED", 43, 75), 
    S("LAYOUT_TYPE_VIDEO_DISPLAY_FULL_BUTTONED", 44, 30), 
    T("LAYOUT_TYPE_VIDEO_DISPLAY_CAROUSEL_BUTTONED", 45, 89), 
    U("LAYOUT_TYPE_VIDEO_DISPLAY_FULL_TEXT_BUTTONED", 46, 31), 
    V("LAYOUT_TYPE_VIDEO_DISPLAY_INLINE_TEXT_BUTTONED", 47, 86), 
    W("LAYOUT_TYPE_VIDEO_DISPLAY_COMPACT", 48, 32), 
    X("LAYOUT_TYPE_VIDEO_DISPLAY_COMPACT_BUTTONED", 49, 91), 
    Y("LAYOUT_TYPE_VIDEO_DISPLAY_BILLBOARD", 50, 51), 
    Z("LAYOUT_TYPE_VIDEO_DISPLAY_BILLBOARD_COMPACT", 51, 52), 
    a("LAYOUT_TYPE_UNSPECIFIED", 0, 0), 
    aA("LAYOUT_TYPE_LANDSCAPE_RECTANGLE", 78, 59), 
    aB("LAYOUT_TYPE_LANDSCAPE_RECTANGLE_TWO_ROW", 79, 60), 
    aC("LAYOUT_TYPE_PANEL", 80, 72), 
    aD("LAYOUT_TYPE_PANEL_TEXT_ICON_IMAGE_TILES_BUTTON", 81, 84), 
    aE("LAYOUT_TYPE_PANEL_INLINE_CUSTOM_TAB_LAYOUT", 82, 92), 
    aF("LAYOUT_TYPE_COMPOSITE_CONCURRENT_VERTICAL_STACK", 83, 73), 
    aG("LAYOUT_TYPE_TEXT_BANNER_OVERLAY", 84, 74), 
    aH("LAYOUT_TYPE_CAROUSEL_CLICKABLE_FOOTERED", 85, 76), 
    aI("LAYOUT_TYPE_UNDERLAY_TEXT_ICON_BUTTON", 86, 81), 
    aJ("LAYOUT_TYPE_DISPLAY_COMPACT_LANDSCAPE_NO_BUTTON", 87, 82), 
    aK("LAYOUT_TYPE_TEXT_HEADER", 88, 83), 
    aL("LAYOUT_TYPE_DISPLAY_FULLSCREEN_IMAGE_BUTTON", 89, 85), 
    aM("LAYOUT_TYPE_VIDEO_INTERSTITIAL", 90, 87), 
    aN("LAYOUT_TYPE_EXTERNAL_OVERLAY_TEXT_ICON_BUTTONED", 91, 88), 
    aO("LAYOUT_TYPE_DEFERRED", 92, 90);
    
    private static final ahqt[] aQ;
    
    aa("LAYOUT_TYPE_VIDEO_DISPLAY_BILLBOARD_VIDEO_WALL_BUTTONED", 52, 62), 
    ab("LAYOUT_TYPE_VIDEO_DISPLAY_BILLBOARD_EXPANDABLE_VIDEO_TILES_BUTTONED", 53, 70), 
    ac("LAYOUT_TYPE_VIDEO_DISPLAY_BILLBOARD_IMAGE_BUTTONED", 54, 63), 
    ad("LAYOUT_TYPE_VIDEO_DISPLAY_BILLBOARD_EXPANDABLE_VIDEO_TILES_IMAGE_BUTTONED", 55, 64), 
    ae("LAYOUT_TYPE_VIDEO_DISPLAY_BILLBOARD_BUTTONED", 56, 65), 
    af("LAYOUT_TYPE_VIDEO_DISPLAY_BILLBOARD_VIDEO_WALL", 57, 66), 
    ag("LAYOUT_TYPE_VIDEO_DISPLAY_BILLBOARD_EXPANDABLE_VIDEO_TILES", 58, 71), 
    ah("LAYOUT_TYPE_VIDEO_DISPLAY_BILLBOARD_IMAGE", 59, 67), 
    ai("LAYOUT_TYPE_VIDEO_DISPLAY_BILLBOARD_EXPANDABLE_VIDEO_TILES_IMAGE", 60, 68), 
    aj("LAYOUT_TYPE_VIDEO_DISPLAY_BILLBOARD_TEXT", 61, 69), 
    ak("LAYOUT_TYPE_VIDEO_INTERSTITIAL_BUTTONED_LEFT", 62, 33), 
    al("LAYOUT_TYPE_DISPLAY_TEXT", 63, 46), 
    am("LAYOUT_TYPE_DISPLAY_TEXT_BUTTONED", 64, 47), 
    an("LAYOUT_TYPE_SURVEY_OVERLAY_HORIZONTAL", 65, 49), 
    ao("LAYOUT_TYPE_SURVEY_OVERLAY_VERTICAL", 66, 50), 
    ap("LAYOUT_TYPE_SURVEY_OVERLAY_VERTICAL_WITH_THUMBNAILS", 67, 94), 
    aq("LAYOUT_TYPE_PLAYER_OVERLAY_SEQUENTIAL_QUESTIONS", 68, 77), 
    ar("LAYOUT_TYPE_OVERLAY_BANNER_TEXT", 69, 78), 
    as("LAYOUT_TYPE_OVERLAY_BANNER_IMAGE", 70, 79), 
    at("LAYOUT_TYPE_OVERLAY_BANNER_TEXT_IMAGE", 71, 80), 
    au("LAYOUT_TYPE_HORIZONTAL_SMILEY_SINGLE_SELECT", 72, 53), 
    av("LAYOUT_TYPE_VERTICAL_SMILEY_SINGLE_SELECT", 73, 54), 
    aw("LAYOUT_TYPE_VERTICAL_TEXT_SINGLE_SELECT", 74, 55), 
    ax("LAYOUT_TYPE_VERTICAL_TEXT_MULTI_SELECT", 75, 56), 
    ay("LAYOUT_TYPE_REELS_PLAYER_OVERLAY", 76, 57), 
    az("LAYOUT_TYPE_VIDEO_AD_CONTAINER", 77, 58), 
    b("LAYOUT_TYPE_MEDIA", 1, 1), 
    c("LAYOUT_TYPE_MEDIA_BREAK", 2, 2), 
    @Deprecated
    d("LAYOUT_TYPE_COMPANION_AND_IMMERSIVE", 3, 3), 
    e("LAYOUT_TYPE_FORECASTING", 4, 4), 
    f("LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY", 5, 5), 
    g("LAYOUT_TYPE_FULLSCREEN_COMPANION", 6, 6), 
    h("LAYOUT_TYPE_COMPANION_WITH_ACTION_BUTTON", 7, 7), 
    i("LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY_LIGHTWEIGHT", 8, 8), 
    j("LAYOUT_TYPE_AD_MEDIA_CONTROLS_BAR", 9, 9), 
    k("LAYOUT_TYPE_AD_MEDIA_CONTROLS_BAR_EXPANDABLE", 10, 10), 
    l("LAYOUT_TYPE_DISCOVERY_PLAYBACK_TRACKER", 11, 11), 
    m("LAYOUT_TYPE_COMPANION", 12, 12), 
    n("LAYOUT_TYPE_COMPANION_WITH_IMAGE", 13, 13), 
    @Deprecated
    o("LAYOUT_TYPE_IMMERSIVE", 14, 14), 
    p("LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES", 15, 15), 
    q("LAYOUT_TYPE_AD_INFO_OVERLAY", 16, 16), 
    r("LAYOUT_TYPE_SURVEY", 17, 17), 
    @Deprecated
    s("LAYOUT_TYPE_ENDCAP", 18, 18), 
    t("LAYOUT_TYPE_COMPANION_WITH_SHOPPING", 19, 19), 
    u("LAYOUT_TYPE_IN_VIDEO_TEXT_OVERLAY", 20, 20), 
    v("LAYOUT_TYPE_IN_VIDEO_ENHANCED_TEXT_OVERLAY", 21, 21), 
    w("LAYOUT_TYPE_IN_VIDEO_IMAGE_OVERLAY", 22, 22), 
    x("LAYOUT_TYPE_AD_BREAK_RESPONSE", 23, 23), 
    y("LAYOUT_TYPE_THROTTLED_AD_BREAK_RESPONSE", 24, 25), 
    z("LAYOUT_TYPE_SLIDING_TEXT_PLAYER_OVERLAY", 25, 26);
    
    public final int aP;
    
    private ahqt(final String s, final int n, final int ap) {
        this.aP = ap;
    }
    
    public static ahdf a() {
        return ahld.u;
    }
    
    public static ahqt b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 94: {
                return ahqt.ap;
            }
            case 93: {
                return ahqt.F;
            }
            case 92: {
                return ahqt.aE;
            }
            case 91: {
                return ahqt.X;
            }
            case 90: {
                return ahqt.aO;
            }
            case 89: {
                return ahqt.T;
            }
            case 88: {
                return ahqt.aN;
            }
            case 87: {
                return ahqt.aM;
            }
            case 86: {
                return ahqt.V;
            }
            case 85: {
                return ahqt.aL;
            }
            case 84: {
                return ahqt.aD;
            }
            case 83: {
                return ahqt.aK;
            }
            case 82: {
                return ahqt.aJ;
            }
            case 81: {
                return ahqt.aI;
            }
            case 80: {
                return ahqt.at;
            }
            case 79: {
                return ahqt.as;
            }
            case 78: {
                return ahqt.ar;
            }
            case 77: {
                return ahqt.aq;
            }
            case 76: {
                return ahqt.aH;
            }
            case 75: {
                return ahqt.R;
            }
            case 74: {
                return ahqt.aG;
            }
            case 73: {
                return ahqt.aF;
            }
            case 72: {
                return ahqt.aC;
            }
            case 71: {
                return ahqt.ag;
            }
            case 70: {
                return ahqt.ab;
            }
            case 69: {
                return ahqt.aj;
            }
            case 68: {
                return ahqt.ai;
            }
            case 67: {
                return ahqt.ah;
            }
            case 66: {
                return ahqt.af;
            }
            case 65: {
                return ahqt.ae;
            }
            case 64: {
                return ahqt.ad;
            }
            case 63: {
                return ahqt.ac;
            }
            case 62: {
                return ahqt.aa;
            }
            case 61: {
                return ahqt.A;
            }
            case 60: {
                return ahqt.aB;
            }
            case 59: {
                return ahqt.aA;
            }
            case 58: {
                return ahqt.az;
            }
            case 57: {
                return ahqt.ay;
            }
            case 56: {
                return ahqt.ax;
            }
            case 55: {
                return ahqt.aw;
            }
            case 54: {
                return ahqt.av;
            }
            case 53: {
                return ahqt.au;
            }
            case 52: {
                return ahqt.Z;
            }
            case 51: {
                return ahqt.Y;
            }
            case 50: {
                return ahqt.ao;
            }
            case 49: {
                return ahqt.an;
            }
            case 47: {
                return ahqt.am;
            }
            case 46: {
                return ahqt.al;
            }
            case 45: {
                return ahqt.M;
            }
            case 44: {
                return ahqt.L;
            }
            case 43: {
                return ahqt.K;
            }
            case 42: {
                return ahqt.J;
            }
            case 41: {
                return ahqt.I;
            }
            case 40: {
                return ahqt.H;
            }
            case 39: {
                return ahqt.G;
            }
            case 38: {
                return ahqt.E;
            }
            case 37: {
                return ahqt.D;
            }
            case 36: {
                return ahqt.C;
            }
            case 35: {
                return ahqt.B;
            }
            case 33: {
                return ahqt.ak;
            }
            case 32: {
                return ahqt.W;
            }
            case 31: {
                return ahqt.U;
            }
            case 30: {
                return ahqt.S;
            }
            case 29: {
                return ahqt.Q;
            }
            case 28: {
                return ahqt.P;
            }
            case 27: {
                return ahqt.O;
            }
            case 26: {
                return ahqt.z;
            }
            case 25: {
                return ahqt.y;
            }
            case 24: {
                return ahqt.N;
            }
            case 23: {
                return ahqt.x;
            }
            case 22: {
                return ahqt.w;
            }
            case 21: {
                return ahqt.v;
            }
            case 20: {
                return ahqt.u;
            }
            case 19: {
                return ahqt.t;
            }
            case 18: {
                return ahqt.s;
            }
            case 17: {
                return ahqt.r;
            }
            case 16: {
                return ahqt.q;
            }
            case 15: {
                return ahqt.p;
            }
            case 14: {
                return ahqt.o;
            }
            case 13: {
                return ahqt.n;
            }
            case 12: {
                return ahqt.m;
            }
            case 11: {
                return ahqt.l;
            }
            case 10: {
                return ahqt.k;
            }
            case 9: {
                return ahqt.j;
            }
            case 8: {
                return ahqt.i;
            }
            case 7: {
                return ahqt.h;
            }
            case 6: {
                return ahqt.g;
            }
            case 5: {
                return ahqt.f;
            }
            case 4: {
                return ahqt.e;
            }
            case 3: {
                return ahqt.d;
            }
            case 2: {
                return ahqt.c;
            }
            case 1: {
                return ahqt.b;
            }
            case 0: {
                return ahqt.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.aP;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.aP);
    }
}
