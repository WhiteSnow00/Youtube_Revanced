// 
// Decompiled by Procyon v0.6.0
// 

public enum ahqr implements ahdd
{
    A("ADS_CLIENT_EVENT_TYPE_CANCEL_SLOT_FULFILLMENT_REQUESTED", 26, 26), 
    B("ADS_CLIENT_EVENT_TYPE_SLOT_FULFILLMENT_CANCELLED", 27, 27), 
    C("ADS_CLIENT_EVENT_TYPE_NON_TERMINAL_ABANDON", 28, 28), 
    D("ADS_CLIENT_EVENT_TYPE_PING_SEND_REQUESTED", 29, 38), 
    E("ADS_CLIENT_EVENT_TYPE_PING_SENT", 30, 39), 
    F("ADS_CLIENT_EVENT_TYPE_PING_DISPATCHED", 31, 49), 
    @Deprecated
    G("ADS_CLIENT_EVENT_TYPE_SKIP_LAYOUT_REQUESTED", 32, 5), 
    @Deprecated
    H("ADS_CLIENT_EVENT_TYPE_LAYOUT_SKIPPED", 33, 6), 
    @Deprecated
    I("ADS_CLIENT_EVENT_TYPE_LAYOUT_ABANDONED", 34, 7), 
    J("ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_NORMALLY", 35, 8), 
    K("ADS_CLIENT_EVENT_TYPE_NORMAL_EXIT_LAYOUT_REQUESTED", 36, 29), 
    L("ADS_CLIENT_EVENT_TYPE_SKIP_EXIT_LAYOUT_REQUESTED", 37, 30), 
    M("ADS_CLIENT_EVENT_TYPE_MUTE_EXIT_LAYOUT_REQUESTED", 38, 31), 
    N("ADS_CLIENT_EVENT_TYPE_ABANDON_EXIT_LAYOUT_REQUESTED", 39, 32), 
    O("ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_SKIP", 40, 33), 
    P("ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_MUTE", 41, 34), 
    Q("ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_ABANDON", 42, 35), 
    R("ADS_CLIENT_EVENT_TYPE_USER_INPUT_SUBMITTED_EXIT_LAYOUT_REQUESTED", 43, 36), 
    S("ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_USER_INPUT_SUBMITTED", 44, 37), 
    T("ADS_CLIENT_EVENT_TYPE_USER_CANCELLED_EXIT_LAYOUT_REQUESTED", 45, 40), 
    U("ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_USER_CANCELLED", 46, 41), 
    V("ADS_CLIENT_EVENT_TYPE_ABORTED_EXIT_LAYOUT_REQUESTED", 47, 44), 
    W("ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_ABORTED", 48, 45), 
    X("ADS_CLIENT_EVENT_TYPE_ERROR", 49, 48);
    
    private static final ahqr[] Z;
    
    a("ADS_CLIENT_EVENT_TYPE_UNSPECIFIED", 0, 0), 
    @Deprecated
    b("ADS_CLIENT_EVENT_TYPE_ADPLACEMENTRENDERER_RECEIVED", 1, 1), 
    @Deprecated
    c("ADS_CLIENT_EVENT_TYPE_ADPLACEMENT_SCHEDULED", 2, 2), 
    d("ADS_CLIENT_EVENT_TYPE_ENTER_LAYOUT_REQUESTED", 3, 3), 
    e("ADS_CLIENT_EVENT_TYPE_LAYOUT_ENTERED", 4, 4), 
    f("ADS_CLIENT_EVENT_TYPE_SLOT_RECEIVED", 5, 42), 
    g("ADS_CLIENT_EVENT_TYPE_SCHEDULE_SLOT_REQUESTED", 6, 9), 
    h("ADS_CLIENT_EVENT_TYPE_SLOT_SCHEDULED", 7, 10), 
    i("ADS_CLIENT_EVENT_TYPE_FULFILL_SLOT_REQUESTED", 8, 11), 
    j("ADS_CLIENT_EVENT_TYPE_SLOT_FULFILLED_NON_EMPTY", 9, 12), 
    k("ADS_CLIENT_EVENT_TYPE_SLOT_FULFILLED_EMPTY", 10, 13), 
    l("ADS_CLIENT_EVENT_TYPE_LAYOUT_RECEIVED", 11, 43), 
    m("ADS_CLIENT_EVENT_TYPE_SCHEDULE_LAYOUT_REQUESTED", 12, 14), 
    n("ADS_CLIENT_EVENT_TYPE_LAYOUT_SCHEDULED", 13, 15), 
    o("ADS_CLIENT_EVENT_TYPE_UNSCHEDULE_LAYOUT_REQUESTED", 14, 47), 
    p("ADS_CLIENT_EVENT_TYPE_LAYOUT_UNSCHEDULED", 15, 46), 
    q("ADS_CLIENT_EVENT_TYPE_OPPORTUNITY_RECEIVED", 16, 16), 
    r("ADS_CLIENT_EVENT_TYPE_OPPORTUNITY_PROCESSED", 17, 17), 
    s("ADS_CLIENT_EVENT_TYPE_ENTER_SLOT_REQUESTED", 18, 18), 
    t("ADS_CLIENT_EVENT_TYPE_SLOT_ENTERED", 19, 19), 
    u("ADS_CLIENT_EVENT_TYPE_EXIT_SLOT_REQUESTED", 20, 20), 
    v("ADS_CLIENT_EVENT_TYPE_SLOT_EXITED", 21, 21), 
    w("ADS_CLIENT_EVENT_TYPE_UNSCHEDULE_SLOT_REQUESTED", 22, 22), 
    x("ADS_CLIENT_EVENT_TYPE_SLOT_UNSCHEDULED", 23, 23), 
    y("ADS_CLIENT_EVENT_TYPE_TRIGGER_ACTIVATED", 24, 24), 
    @Deprecated
    z("ADS_CLIENT_EVENT_TYPE_EXIT_LAYOUT_REQUESTED", 25, 25);
    
    public final int Y;
    
    private ahqr(final String s, final int n, final int y) {
        this.Y = y;
    }
    
    public static ahdf a() {
        return ahld.r;
    }
    
    public static ahqr b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 49: {
                return ahqr.F;
            }
            case 48: {
                return ahqr.X;
            }
            case 47: {
                return ahqr.o;
            }
            case 46: {
                return ahqr.p;
            }
            case 45: {
                return ahqr.W;
            }
            case 44: {
                return ahqr.V;
            }
            case 43: {
                return ahqr.l;
            }
            case 42: {
                return ahqr.f;
            }
            case 41: {
                return ahqr.U;
            }
            case 40: {
                return ahqr.T;
            }
            case 39: {
                return ahqr.E;
            }
            case 38: {
                return ahqr.D;
            }
            case 37: {
                return ahqr.S;
            }
            case 36: {
                return ahqr.R;
            }
            case 35: {
                return ahqr.Q;
            }
            case 34: {
                return ahqr.P;
            }
            case 33: {
                return ahqr.O;
            }
            case 32: {
                return ahqr.N;
            }
            case 31: {
                return ahqr.M;
            }
            case 30: {
                return ahqr.L;
            }
            case 29: {
                return ahqr.K;
            }
            case 28: {
                return ahqr.C;
            }
            case 27: {
                return ahqr.B;
            }
            case 26: {
                return ahqr.A;
            }
            case 25: {
                return ahqr.z;
            }
            case 24: {
                return ahqr.y;
            }
            case 23: {
                return ahqr.x;
            }
            case 22: {
                return ahqr.w;
            }
            case 21: {
                return ahqr.v;
            }
            case 20: {
                return ahqr.u;
            }
            case 19: {
                return ahqr.t;
            }
            case 18: {
                return ahqr.s;
            }
            case 17: {
                return ahqr.r;
            }
            case 16: {
                return ahqr.q;
            }
            case 15: {
                return ahqr.n;
            }
            case 14: {
                return ahqr.m;
            }
            case 13: {
                return ahqr.k;
            }
            case 12: {
                return ahqr.j;
            }
            case 11: {
                return ahqr.i;
            }
            case 10: {
                return ahqr.h;
            }
            case 9: {
                return ahqr.g;
            }
            case 8: {
                return ahqr.J;
            }
            case 7: {
                return ahqr.I;
            }
            case 6: {
                return ahqr.H;
            }
            case 5: {
                return ahqr.G;
            }
            case 4: {
                return ahqr.e;
            }
            case 3: {
                return ahqr.d;
            }
            case 2: {
                return ahqr.c;
            }
            case 1: {
                return ahqr.b;
            }
            case 0: {
                return ahqr.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.Y;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.Y);
    }
}
