// 
// Decompiled by Procyon v0.6.0
// 

public enum ahnj implements agzm
{
    A("TRIGGER_TYPE_CLOSE_REQUESTED", 26, 25), 
    B("TRIGGER_TYPE_TIME_RELATIVE_TO_LAYOUT_ENTER", 27, 26), 
    C("TRIGGER_TYPE_NOT_IN_MEDIA_TIME_RANGE", 28, 27), 
    D("TRIGGER_TYPE_SLOT_ID_FULFILLED_EMPTY", 29, 28), 
    E("TRIGGER_TYPE_SLOT_ID_FULFILLED_NON_EMPTY", 30, 29), 
    F("TRIGGER_TYPE_ON_OPPORTUNITY_TYPE_RECEIVED", 31, 30), 
    @Deprecated
    G("TRIGGER_TYPE_SLOT_TYPE_ENTER_REQUESTED", 32, 31), 
    H("TRIGGER_TYPE_LAYOUT_ID_ACTIVE_AND_SLOT_ID_HAS_EXITED", 33, 32), 
    I("TRIGGER_TYPE_PLAYBACK_MINIMIZED", 34, 33), 
    J("TRIGGER_TYPE_MEDIA_PAUSED", 35, 34), 
    K("TRIGGER_TYPE_MEDIA_RESUMED", 36, 35), 
    L("TRIGGER_TYPE_ON_DIFFERENT_SLOT_ID_ENTER_REQUESTED", 37, 36), 
    M("TRIGGER_TYPE_ON_ACTIVATE_EXTERNAL_PLAYBACK", 38, 37), 
    N("TRIGGER_TYPE_REEL_ITEM_SEQUENCE_ABANDONED", 39, 38), 
    O("TRIGGER_TYPE_ON_MEDIA_PLAYBACK_ERROR", 40, 39), 
    P("TRIGGER_TYPE_VISIT_ADVERTISER_LINK_CLICKED", 41, 40), 
    Q("TRIGGER_TYPE_MEDIA_FULLSCREEN_ENTERED", 42, 41), 
    R("TRIGGER_TYPE_MEDIA_FULLSCREEN_EXITED", 43, 42), 
    S("TRIGGER_TYPE_MEDIA_NON_TERMINAL_ABANDONED", 44, 43), 
    T("TRIGGER_TYPE_ACTIVE_VIEW_VIEWABLE_CRITERIA_SATISFIED", 45, 44), 
    U("TRIGGER_TYPE_ACTIVE_VIEW_MEASURABLE_CRITERIA_SATISFIED", 46, 45), 
    V("TRIGGER_TYPE_ACTIVE_VIEW_GROUPM_VIEWABLE_CRITERIA_SATISFIED", 47, 46), 
    W("TRIGGER_TYPE_ACTIVE_VIEW_AUDIO_AUDIBLE_CRITERIA_SATISFIED", 48, 58), 
    X("TRIGGER_TYPE_ACTIVE_VIEW_AUDIO_MEASURABLE_CRITERIA_SATISFIED", 49, 59), 
    Y("TRIGGER_TYPE_SEQUENCE_ITEM_IN_PLAYER_SPACE_AVAILABLE", 50, 47), 
    Z("TRIGGER_TYPE_SEQUENCE_ITEM_IN_PLAYER_SPACE_UNAVAILABLE", 51, 48), 
    a("TRIGGER_TYPE_UNSPECIFIED", 0, 0), 
    aa("TRIGGER_TYPE_LAYOUT_ID_ENTERED_AND_SLOT_FULFILLED", 52, 49), 
    ab("TRIGGER_TYPE_PROGRESS_PAST_MEDIA_TIME_WITH_OFFSET_RELATIVE_TO_LAYOUT_ENTER", 53, 50), 
    ac("TRIGGER_TYPE_SEEK_FORWARD_PAST_MEDIA_TIME_WITH_OFFSET_RELATIVE_TO_LAYOUT_ENTER", 54, 51), 
    ad("TRIGGER_TYPE_SEEK_BACKWARD_BEFORE_LAYOUT_ENTER_TIME", 55, 52), 
    @Deprecated
    ae("TRIGGER_TYPE_MEDIA_TIME_RANGE_ALLOW_REACTIVATION_WITHIN_RANGE", 56, 53), 
    af("TRIGGER_TYPE_IN_MEDIA_TIME_RANGE_AND_SLOT_FULFILLED_NON_EMPTY", 57, 54), 
    ag("TRIGGER_TYPE_SLOT_ID_UNSCHEDULED", 58, 55), 
    ah("TRIGGER_TYPE_MEDIA_PLAYBACK_STARTED", 59, 56), 
    ai("TRIGGER_TYPE_ON_PLAYBACK_DESTROYED", 60, 60), 
    aj("TRIGGER_TYPE_MEDIA_TIME_RANGE_ALLOW_REACTIVATION_ON_USER_CANCELLED", 61, 61), 
    ak("TRIGGER_TYPE_LAYOUT_ID_UNSCHEDULED", 62, 62), 
    @Deprecated
    b("TRIGGER_TYPE_ACTIVE_MEDIA_LAYOUT_ID", 1, 1), 
    c("TRIGGER_TYPE_MEDIA_TIME_RANGE", 2, 2), 
    d("TRIGGER_TYPE_SLOT_ID_SCHEDULED", 3, 3), 
    e("TRIGGER_TYPE_SLOT_ID_ENTERED", 4, 4), 
    f("TRIGGER_TYPE_CONTENT_VIDEO_ID_ENDED", 5, 5), 
    g("TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID", 6, 6), 
    h("TRIGGER_TYPE_LAYOUT_ID_EXITED", 7, 7), 
    i("TRIGGER_TYPE_ON_SLOT_CANCELLATION_REQUESTED", 8, 8), 
    j("TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED", 9, 9), 
    k("TRIGGER_TYPE_SKIP_REQUESTED", 10, 10), 
    l("TRIGGER_TYPE_SLOT_ID_EXITED", 11, 11), 
    @Deprecated
    m("TRIGGER_TYPE_ON_SUBSEQUENT_ACTIVE_MEDIA_LAYOUT_ID_AFTER_PROVIDED_LAYOUT_TRIGGER", 12, 12), 
    @Deprecated
    n("TRIGGER_TYPE_CONTENT_VIDEO_ID_READY", 13, 13), 
    @Deprecated
    o("TRIGGER_TYPE_ON_LOADED_DIFFERENT_VIDEO_ID_THAN_EXPECTED", 14, 14), 
    p("TRIGGER_TYPE_LAYOUT_ID_ENTERED", 15, 15), 
    q("TRIGGER_TYPE_BEFORE_CONTENT_VIDEO_ID_STARTED", 16, 16), 
    r("TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED", 17, 17), 
    s("TRIGGER_TYPE_ON_SLOT_SELF_ENTER_REQUESTED", 18, 18), 
    t("TRIGGER_TYPE_SLOT_ID_ENTER_REQUESTED", 19, 19), 
    u("TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON", 20, 20), 
    v("TRIGGER_TYPE_LIVE_STREAM_BREAK_STARTED", 21, 21), 
    w("TRIGGER_TYPE_SURVEY_SUBMITTED", 22, 22), 
    x("TRIGGER_TYPE_SURVEY_DISMISSED", 23, 57), 
    y("TRIGGER_TYPE_LIVE_STREAM_BREAK_ENDED", 24, 23), 
    z("TRIGGER_TYPE_LAYOUT_EXITED_FOR_OTHER_REASON", 25, 24);
    
    public final int al;
    
    private ahnj(final String s, final int n, final int al) {
        this.al = al;
    }
    
    public static agzo a() {
        return ahng.e;
    }
    
    public static ahnj b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 62: {
                return ahnj.ak;
            }
            case 61: {
                return ahnj.aj;
            }
            case 60: {
                return ahnj.ai;
            }
            case 59: {
                return ahnj.X;
            }
            case 58: {
                return ahnj.W;
            }
            case 57: {
                return ahnj.x;
            }
            case 56: {
                return ahnj.ah;
            }
            case 55: {
                return ahnj.ag;
            }
            case 54: {
                return ahnj.af;
            }
            case 53: {
                return ahnj.ae;
            }
            case 52: {
                return ahnj.ad;
            }
            case 51: {
                return ahnj.ac;
            }
            case 50: {
                return ahnj.ab;
            }
            case 49: {
                return ahnj.aa;
            }
            case 48: {
                return ahnj.Z;
            }
            case 47: {
                return ahnj.Y;
            }
            case 46: {
                return ahnj.V;
            }
            case 45: {
                return ahnj.U;
            }
            case 44: {
                return ahnj.T;
            }
            case 43: {
                return ahnj.S;
            }
            case 42: {
                return ahnj.R;
            }
            case 41: {
                return ahnj.Q;
            }
            case 40: {
                return ahnj.P;
            }
            case 39: {
                return ahnj.O;
            }
            case 38: {
                return ahnj.N;
            }
            case 37: {
                return ahnj.M;
            }
            case 36: {
                return ahnj.L;
            }
            case 35: {
                return ahnj.K;
            }
            case 34: {
                return ahnj.J;
            }
            case 33: {
                return ahnj.I;
            }
            case 32: {
                return ahnj.H;
            }
            case 31: {
                return ahnj.G;
            }
            case 30: {
                return ahnj.F;
            }
            case 29: {
                return ahnj.E;
            }
            case 28: {
                return ahnj.D;
            }
            case 27: {
                return ahnj.C;
            }
            case 26: {
                return ahnj.B;
            }
            case 25: {
                return ahnj.A;
            }
            case 24: {
                return ahnj.z;
            }
            case 23: {
                return ahnj.y;
            }
            case 22: {
                return ahnj.w;
            }
            case 21: {
                return ahnj.v;
            }
            case 20: {
                return ahnj.u;
            }
            case 19: {
                return ahnj.t;
            }
            case 18: {
                return ahnj.s;
            }
            case 17: {
                return ahnj.r;
            }
            case 16: {
                return ahnj.q;
            }
            case 15: {
                return ahnj.p;
            }
            case 14: {
                return ahnj.o;
            }
            case 13: {
                return ahnj.n;
            }
            case 12: {
                return ahnj.m;
            }
            case 11: {
                return ahnj.l;
            }
            case 10: {
                return ahnj.k;
            }
            case 9: {
                return ahnj.j;
            }
            case 8: {
                return ahnj.i;
            }
            case 7: {
                return ahnj.h;
            }
            case 6: {
                return ahnj.g;
            }
            case 5: {
                return ahnj.f;
            }
            case 4: {
                return ahnj.e;
            }
            case 3: {
                return ahnj.d;
            }
            case 2: {
                return ahnj.c;
            }
            case 1: {
                return ahnj.b;
            }
            case 0: {
                return ahnj.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.al;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.al);
    }
}
