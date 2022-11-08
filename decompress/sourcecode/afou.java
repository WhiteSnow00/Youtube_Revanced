// 
// Decompiled by Procyon v0.6.0
// 

public enum afou implements agzm
{
    A("REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS", 26, 26), 
    B("REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS", 27, 27), 
    C("REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA", 28, 28), 
    D("LAUNCH_OPTION_ANDROID_RECEIVER_COMPATIBLE", 29, 29), 
    E("CAST_CONTEXT_SET_LAUNCH_CREDENTIALS_DATA", 30, 30), 
    F("START_DISCOVERY_AFTER_FIRST_TAP_ON_CAST_BUTTON", 31, 31), 
    G("CAST_UNAVAILABLE_BUTTON_VISIBLE", 32, 32), 
    H("CAST_DEFAULT_MEDIA_ROUTER_DIALOG", 33, 33), 
    I("CAST_CUSTOM_MEDIA_ROUTER_DIALOG", 34, 34), 
    J("CAST_OUTPUT_SWITCHER_ENABLED", 35, 35), 
    K("CAST_TRANSFER_TO_LOCAL_ENABLED", 36, 36), 
    L("CAST_BUTTON_IS_TRIGGERED_DEFAULT_CAST_DIALOG_FALSE", 37, 37), 
    M("CAST_BUTTON_DELEGATE", 38, 38), 
    N("CAST_BUTTON_DELEGATE_PRESENT_LNA_PERMISSION_CUSTOM_DIALOG", 39, 39), 
    O("CAST_BUTTON_DELEGATE_PRESENT_CAST_STATE_CUSTOM_DIALOG", 40, 40), 
    P("CAST_TRANSFER_TO_LOCAL_USED", 41, 41), 
    Q("MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_TO_STRING", 42, 42), 
    R("MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM", 43, 43), 
    S("HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_TO_STRING", 44, 44), 
    T("HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM", 45, 45), 
    U("HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_TO_STRING", 46, 46), 
    V("HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_STRING_TO_ENUM", 47, 47), 
    W("CAST_SLIDER_SET_AD_BLOCK_POSITIONS", 48, 48), 
    X("CAF_NOTIFICATION_SERVICE", 49, 49), 
    Y("HARDWARE_VOLUME_BUTTON_PRESS", 50, 50), 
    Z("CAST_SDK_DEFAULT_DEVICE_DIALOG", 51, 51), 
    a("DEVELOPER_FEATURE_FLAG_UNKNOWN", 0, 0), 
    aa("CAST_SDK_CUSTOM_DEVICE_DIALOG", 52, 52), 
    ab("PERSISTENT_CAST_BUTTON_DISCOVERY_DISABLED_WITH_CONFLICT_TYPES", 53, 53), 
    ac("CAST_DEVICE_DIALOG_FACTORY_INSTANTIATED", 54, 54), 
    b("CAF_CAST_BUTTON", 1, 1), 
    c("CAF_EXPANDED_CONTROLLER", 2, 2), 
    d("CAF_MINI_CONTROLLER", 3, 3), 
    e("CAF_CONTAINER_CONTROLLER", 4, 4), 
    f("CAST_CONTEXT", 5, 5), 
    g("IMAGE_CACHE", 6, 6), 
    h("IMAGE_PICKER", 7, 7), 
    i("AD_BREAK_PARSER", 8, 8), 
    j("UI_STYLE", 9, 9), 
    k("HARDWARE_VOLUME_BUTTON", 10, 10), 
    l("NON_CAST_DEVICE_PROVIDER", 11, 11), 
    m("PAUSE_CONTROLLER", 12, 12), 
    n("SEEK_CONTROLLER", 13, 13), 
    o("STREAM_VOLUME", 14, 14), 
    p("UI_MEDIA_CONTROLLER", 15, 15), 
    q("PLAYBACK_RATE_CONTROLLER", 16, 16), 
    r("PRECACHE", 17, 17), 
    s("INSTRUCTIONS_VIEW", 18, 18), 
    t("OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED", 19, 19), 
    u("OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION", 20, 20), 
    v("OPTION_DISABLE_DISCOVERY_AUTOSTART", 21, 21), 
    w("OPTION_DISABLE_ANALYTICS_LOGGING", 22, 22), 
    x("OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME", 23, 23), 
    y("CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT", 24, 24), 
    z("CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT", 25, 25);
    
    public final int ad;
    
    private afou(final String s, final int n, final int ad) {
        this.ad = ad;
    }
    
    public static afou a(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 54: {
                return afou.ac;
            }
            case 53: {
                return afou.ab;
            }
            case 52: {
                return afou.aa;
            }
            case 51: {
                return afou.Z;
            }
            case 50: {
                return afou.Y;
            }
            case 49: {
                return afou.X;
            }
            case 48: {
                return afou.W;
            }
            case 47: {
                return afou.V;
            }
            case 46: {
                return afou.U;
            }
            case 45: {
                return afou.T;
            }
            case 44: {
                return afou.S;
            }
            case 43: {
                return afou.R;
            }
            case 42: {
                return afou.Q;
            }
            case 41: {
                return afou.P;
            }
            case 40: {
                return afou.O;
            }
            case 39: {
                return afou.N;
            }
            case 38: {
                return afou.M;
            }
            case 37: {
                return afou.L;
            }
            case 36: {
                return afou.K;
            }
            case 35: {
                return afou.J;
            }
            case 34: {
                return afou.I;
            }
            case 33: {
                return afou.H;
            }
            case 32: {
                return afou.G;
            }
            case 31: {
                return afou.F;
            }
            case 30: {
                return afou.E;
            }
            case 29: {
                return afou.D;
            }
            case 28: {
                return afou.C;
            }
            case 27: {
                return afou.B;
            }
            case 26: {
                return afou.A;
            }
            case 25: {
                return afou.z;
            }
            case 24: {
                return afou.y;
            }
            case 23: {
                return afou.x;
            }
            case 22: {
                return afou.w;
            }
            case 21: {
                return afou.v;
            }
            case 20: {
                return afou.u;
            }
            case 19: {
                return afou.t;
            }
            case 18: {
                return afou.s;
            }
            case 17: {
                return afou.r;
            }
            case 16: {
                return afou.q;
            }
            case 15: {
                return afou.p;
            }
            case 14: {
                return afou.o;
            }
            case 13: {
                return afou.n;
            }
            case 12: {
                return afou.m;
            }
            case 11: {
                return afou.l;
            }
            case 10: {
                return afou.k;
            }
            case 9: {
                return afou.j;
            }
            case 8: {
                return afou.i;
            }
            case 7: {
                return afou.h;
            }
            case 6: {
                return afou.g;
            }
            case 5: {
                return afou.f;
            }
            case 4: {
                return afou.e;
            }
            case 3: {
                return afou.d;
            }
            case 2: {
                return afou.c;
            }
            case 1: {
                return afou.b;
            }
            case 0: {
                return afou.a;
            }
        }
    }
    
    public static agzo b() {
        return aeih.m;
    }
    
    public final int getNumber() {
        return this.ad;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.ad);
    }
}
