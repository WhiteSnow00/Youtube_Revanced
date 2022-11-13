// 
// Decompiled by Procyon v0.6.0
// 

public enum ajtz implements ahbl
{
    A("FLOW_TYPE_MDX_STREAM_TRANSFER", 26, 26), 
    B("FLOW_TYPE_PDG_BUY_FLOW", 27, 27), 
    C("FLOW_TYPE_YPC_PURCHASE", 28, 28), 
    D("FLOW_TYPE_LIVE_STREAMING_CONFERENCE", 29, 29), 
    E("FLOW_TYPE_ACTION_SHEET", 30, 30), 
    F("FLOW_TYPE_WEB_VIEW", 31, 31), 
    G("FLOW_TYPE_CREATOR_VIDEO_SUGGESTIONS", 32, 32), 
    H("FLOW_TYPE_YTV_INBOARDING", 33, 33);
    
    private static final ajtz[] J;
    
    a("FLOW_TYPE_UNKNOWN", 0, 0), 
    b("FLOW_TYPE_NOTAIRE", 1, 1), 
    c("FLOW_TYPE_OFFLINE_TRANSFER_STATUS_CHANGED", 2, 2), 
    d("FLOW_TYPE_OFFLINE_ORCHESTRATION", 3, 3), 
    e("FLOW_TYPE_PLAYBACK_QUEUE", 4, 4), 
    f("FLOW_TYPE_OFFLINE_TRANSFER_SERVICE", 5, 5), 
    g("FLOW_TYPE_IN_APP_UPDATE", 6, 6), 
    h("FLOW_TYPE_SHORTS_CREATION", 7, 7), 
    i("FLOW_TYPE_MDX_CONNECTION", 8, 8), 
    j("FLOW_TYPE_CHIME_REGISTRATION", 9, 9), 
    k("FLOW_TYPE_MDX_RECEIVER_CONNECTION", 10, 10), 
    l("FLOW_TYPE_PREMIUM_MULTI_STEP_PURCHASE", 11, 11), 
    m("FLOW_TYPE_PARENT_TOOLS_ONBOARDING", 12, 12), 
    n("FLOW_TYPE_LIVE_STREAMING", 13, 13), 
    o("FLOW_TYPE_HASHTAG_SUGGESTIONS", 14, 14), 
    p("FLOW_TYPE_KIDS_ONBOARDING", 15, 15), 
    q("FLOW_TYPE_TOU_APPEAL", 16, 16), 
    r("FLOW_TYPE_DRAG_AND_DROP", 17, 17), 
    s("FLOW_TYPE_FEATURE_ENABLEMENT", 18, 18), 
    t("FLOW_TYPE_SOCIAL_SUGGESTIONS", 19, 19), 
    u("FLOW_TYPE_LIVE_STREAMING_ADS_INSERTION", 20, 20), 
    v("FLOW_TYPE_IAP", 21, 21), 
    w("FLOW_TYPE_SHOPPING_CHECKOUT", 22, 22), 
    x("FLOW_TYPE_YPC_CANCELLATION", 23, 23), 
    y("FLOW_TYPE_YPC_BROWSE_OFFERS", 24, 24), 
    z("FLOW_TYPE_UNPLUGGED_EPG_SORT", 25, 25);
    
    public final int I;
    
    private ajtz(final String s, final int n, final int i) {
        this.I = i;
    }
    
    public static ahbn a() {
        return ajty.c;
    }
    
    public static ajtz b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 33: {
                return ajtz.H;
            }
            case 32: {
                return ajtz.G;
            }
            case 31: {
                return ajtz.F;
            }
            case 30: {
                return ajtz.E;
            }
            case 29: {
                return ajtz.D;
            }
            case 28: {
                return ajtz.C;
            }
            case 27: {
                return ajtz.B;
            }
            case 26: {
                return ajtz.A;
            }
            case 25: {
                return ajtz.z;
            }
            case 24: {
                return ajtz.y;
            }
            case 23: {
                return ajtz.x;
            }
            case 22: {
                return ajtz.w;
            }
            case 21: {
                return ajtz.v;
            }
            case 20: {
                return ajtz.u;
            }
            case 19: {
                return ajtz.t;
            }
            case 18: {
                return ajtz.s;
            }
            case 17: {
                return ajtz.r;
            }
            case 16: {
                return ajtz.q;
            }
            case 15: {
                return ajtz.p;
            }
            case 14: {
                return ajtz.o;
            }
            case 13: {
                return ajtz.n;
            }
            case 12: {
                return ajtz.m;
            }
            case 11: {
                return ajtz.l;
            }
            case 10: {
                return ajtz.k;
            }
            case 9: {
                return ajtz.j;
            }
            case 8: {
                return ajtz.i;
            }
            case 7: {
                return ajtz.h;
            }
            case 6: {
                return ajtz.g;
            }
            case 5: {
                return ajtz.f;
            }
            case 4: {
                return ajtz.e;
            }
            case 3: {
                return ajtz.d;
            }
            case 2: {
                return ajtz.c;
            }
            case 1: {
                return ajtz.b;
            }
            case 0: {
                return ajtz.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.I;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.I);
    }
}
