// 
// Decompiled by Procyon v0.6.0
// 

public enum ahfo implements agzm
{
    A("DID_RIGHT_SWIPE_TO_SWITCH_ACCOUNT_EVENT", 26, 26), 
    B("WILL_SELECT_NEW_DEFAULT_IDENTITY_EVENT", 27, 27), 
    C("DID_SELECT_NEW_DEFAULT_IDENTITY_EVENT", 28, 28), 
    D("DID_FINALIZE_NEW_DEFAULT_IDENTITY_EVENT", 29, 29), 
    E("DID_CONTINUE_WITHOUT_ACCOUNT_EVENT", 30, 30), 
    F("DID_CLOSE_CONTAINER_BY_CLICKING_SCRIM", 31, 31), 
    G("DID_TAP_TOP_RIGHT_ACCOUNT_PARTICLE_DISC_EVENT", 32, 32), 
    H("PRESENTED_NAV_ACCOUNT_HEADER_EVENT", 33, 33), 
    I("DISMISSED_NAV_ACCOUNT_HEADER_EVENT", 34, 34), 
    J("DID_TAP_ACCOUNT_PARTICLE_TO_OPEN_ACCOUNT_MENU_EVENT", 35, 35), 
    K("PRESENTED_COMPONENT_EVENT", 36, 36), 
    L("DISMISSED_COMPONENT_EVENT", 37, 37), 
    M("WILL_SWITCH_TO_PREVIOUS_ACCOUNT_EVENT", 38, 38), 
    N("WILL_SWITCH_TO_NEXT_ACCOUNT_EVENT", 39, 39), 
    O("WILL_SWITCH_TO_WORK_PROFILE_EVENT", 40, 40), 
    P("WILL_SWITCH_TO_PERSONAL_PROFILE_EVENT", 41, 41), 
    Q("DID_SELECT_CUSTOM_ITEM_EVENT", 42, 42), 
    R("DID_TAP_COLLAPSED_ACCOUT_MENU_HEADER", 43, 43), 
    S("DID_TAP_EXPANDED_ACCOUT_MENU_HEADER", 44, 44), 
    T("DID_TAP_ACCOUNT_SNACKBAR_TO_OPEN_ACCOUNT_MENU_EVENT", 45, 45), 
    U("DID_SELECT_COMMON_ITEM_EVENT", 46, 46), 
    V("DID_TAP_COMPONENT_EVENT", 47, 47), 
    W("ABSORBED_CRASH_EVENT", 48, 48), 
    X("LONG_PRESS_APD_START_EVENT", 49, 49), 
    Y("LONG_PRESS_APD_ABORT_EVENT", 50, 50), 
    Z("DID_CONTINUE_WITH_ACCOUNT_EVENT", 51, 51), 
    a("UNKNOWN_EVENT", 0, 0), 
    aa("DID_TAP_EDUCATION_APD_TOOLTIP_EVENT", 52, 52), 
    ab("DID_TAP_EDUCATION_APD_ANCHOR_VIEW_EVENT", 53, 53), 
    ac("DID_TAP_EDUCATION_APD_TOOLTIP_ACTION_BUTTON_EVENT", 54, 54), 
    ad("DID_TAP_DEACTIVATED_ACCOUNT_SWITCHING_INFO", 55, 55), 
    b("PRESENTED_ACCOUNT_MENU_EVENT", 1, 1), 
    c("DISMISSED_ACCOUNT_MENU_EVENT", 2, 2), 
    d("WILL_SWITCH_TO_A_DIFFERENT_ACCOUNT_EVENT", 3, 3), 
    e("SWITCHED_TO_A_DIFFERENT_ACCOUNT_EVENT", 4, 4), 
    f("WILL_TURN_ON_USE_WITHOUT_ACCOUNT_EVENT", 5, 5), 
    g("WILL_TURN_ON_INCOGNITO_EVENT", 6, 6), 
    h("TURNED_OFF_INCOGNITO_EVENT", 7, 7), 
    i("SELECTED_SAME_ACCOUNT_EVENT", 8, 8), 
    j("WILL_OPEN_MY_ACCOUNT_EVENT", 9, 9), 
    k("WILL_OPEN_USE_ANOTHER_ACCOUNT_EVENT", 10, 10), 
    l("WILL_OPEN_ACCOUNT_MANAGEMENT_EVENT", 11, 11), 
    m("WILL_REMOVE_ACCOUNT_FROM_DEVICE_EVENT", 12, 12), 
    n("WILL_TOGGLE_ACCOUNT_ON_EVENT", 13, 13), 
    o("WILL_TOGGLE_ACCOUNT_OFF_EVENT", 14, 14), 
    p("DID_REMOVE_ACCOUNT_FROM_DEVICE_EVENT", 15, 15), 
    q("DID_FAIL_REMOVE_ACCOUNT_FROM_DEVICE_EVENT", 16, 16), 
    r("WILL_OPEN_PRIVACY_POLICY_EVENT", 17, 17), 
    s("WILL_OPEN_TERMS_OF_SERVICE_EVENT", 18, 18), 
    t("WILL_SHOW_DIALOG_FOR_REMOVE_ACCOUNT_FROM_DEVICE_EVENT", 19, 19), 
    u("DID_CANCEL_REMOVE_ACCOUNT_FROM_DEVICE_DIALOG_EVENT", 20, 20), 
    v("WILL_OPEN_LICENSES_EVENT", 21, 21), 
    w("WILL_OPEN_DEFAULT_ACCOUNT_MENU_EVENT", 22, 22), 
    x("WILL_QUICK_SWITCH_TO_FIRST_ACCOUNT_EVENT", 23, 23), 
    y("WILL_QUICK_SWITCH_TO_SECOND_ACCOUNT_EVENT", 24, 24), 
    z("DID_LEFT_SWIPE_TO_SWITCH_ACCOUNT_EVENT", 25, 25);
    
    public final int ae;
    
    private ahfo(final String s, final int n, final int ae) {
        this.ae = ae;
    }
    
    public static agzo a() {
        return ahec.g;
    }
    
    public static ahfo b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 55: {
                return ahfo.ad;
            }
            case 54: {
                return ahfo.ac;
            }
            case 53: {
                return ahfo.ab;
            }
            case 52: {
                return ahfo.aa;
            }
            case 51: {
                return ahfo.Z;
            }
            case 50: {
                return ahfo.Y;
            }
            case 49: {
                return ahfo.X;
            }
            case 48: {
                return ahfo.W;
            }
            case 47: {
                return ahfo.V;
            }
            case 46: {
                return ahfo.U;
            }
            case 45: {
                return ahfo.T;
            }
            case 44: {
                return ahfo.S;
            }
            case 43: {
                return ahfo.R;
            }
            case 42: {
                return ahfo.Q;
            }
            case 41: {
                return ahfo.P;
            }
            case 40: {
                return ahfo.O;
            }
            case 39: {
                return ahfo.N;
            }
            case 38: {
                return ahfo.M;
            }
            case 37: {
                return ahfo.L;
            }
            case 36: {
                return ahfo.K;
            }
            case 35: {
                return ahfo.J;
            }
            case 34: {
                return ahfo.I;
            }
            case 33: {
                return ahfo.H;
            }
            case 32: {
                return ahfo.G;
            }
            case 31: {
                return ahfo.F;
            }
            case 30: {
                return ahfo.E;
            }
            case 29: {
                return ahfo.D;
            }
            case 28: {
                return ahfo.C;
            }
            case 27: {
                return ahfo.B;
            }
            case 26: {
                return ahfo.A;
            }
            case 25: {
                return ahfo.z;
            }
            case 24: {
                return ahfo.y;
            }
            case 23: {
                return ahfo.x;
            }
            case 22: {
                return ahfo.w;
            }
            case 21: {
                return ahfo.v;
            }
            case 20: {
                return ahfo.u;
            }
            case 19: {
                return ahfo.t;
            }
            case 18: {
                return ahfo.s;
            }
            case 17: {
                return ahfo.r;
            }
            case 16: {
                return ahfo.q;
            }
            case 15: {
                return ahfo.p;
            }
            case 14: {
                return ahfo.o;
            }
            case 13: {
                return ahfo.n;
            }
            case 12: {
                return ahfo.m;
            }
            case 11: {
                return ahfo.l;
            }
            case 10: {
                return ahfo.k;
            }
            case 9: {
                return ahfo.j;
            }
            case 8: {
                return ahfo.i;
            }
            case 7: {
                return ahfo.h;
            }
            case 6: {
                return ahfo.g;
            }
            case 5: {
                return ahfo.f;
            }
            case 4: {
                return ahfo.e;
            }
            case 3: {
                return ahfo.d;
            }
            case 2: {
                return ahfo.c;
            }
            case 1: {
                return ahfo.b;
            }
            case 0: {
                return ahfo.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.ae;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.ae);
    }
}
