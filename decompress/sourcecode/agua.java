// 
// Decompiled by Procyon v0.6.0
// 

public enum agua implements agzm
{
    A("FETCHED_MULTI_USER_BADGE_COUNT", 26, 38), 
    B("SUCCEED_TO_UPDATE_THREAD_STATE", 27, 15), 
    C("SHOW_SKIPPED_DUE_TO_COUNTERFACTUAL", 28, 16), 
    D("LOCAL_NOTIFICATION_CREATED", 29, 17), 
    E("LOCAL_NOTIFICATION_UPDATED", 30, 22), 
    F("EXPIRED", 31, 18), 
    G("APP_BLOCK_STATE_CHANGED", 32, 24), 
    H("NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED", 33, 25), 
    I("NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED", 34, 26), 
    J("PERIODIC_LOG", 35, 27), 
    K("ACCOUNT_DATA_CLEANED", 36, 31), 
    L("NOTIFICATION_DATA_CLEANED", 37, 44), 
    M("TARGET_REGISTERED", 38, 32), 
    N("LOCATION_TARGET_REGISTERED", 39, 46), 
    O("VOIP_TARGET_REGISTERED", 40, 47), 
    P("CLICK_DURATION_CLICK_OPENED_APP", 41, 39), 
    Q("CLICK_DURATION_CLICK_WHILE_OPEN", 42, 40), 
    R("DSC_POSTPONED", 43, 48), 
    a("INTERACTION_TYPE_UNSPECIFIED", 0, 0), 
    b("ACTION_CLICK", 1, 1), 
    c("CLICKED", 2, 2), 
    d("DISMISSED", 3, 5), 
    e("DISMISSED_REMOTE", 4, 30), 
    f("DISMISSED_BY_API", 5, 35), 
    g("DISMISS_ALL", 6, 6), 
    h("ADDED_TO_STORAGE", 7, 34), 
    i("REPLACED_IN_STORAGE", 8, 36), 
    j("SHOWN", 9, 9), 
    k("SHOWN_REPLACED", 10, 28), 
    l("SHOWN_FORCED", 11, 29), 
    m("SHOWN_WITHOUT_IMAGE", 12, 10), 
    n("REMOVED_FROM_STORAGE", 13, 37), 
    o("REMOVED", 14, 41), 
    p("UNSHOWN", 15, 19), 
    q("DELIVERED_FCM_PUSH", 16, 33), 
    r("DELIVERED", 17, 11), 
    s("DELIVERED_SYNC_INSTRUCTION", 18, 12), 
    t("DELIVERED_FULL_SYNC_INSTRUCTION", 19, 13), 
    u("DELIVERED_UPDATE_THREAD_INSTRUCTION", 20, 23), 
    v("DELIVERED_REMOVE_STORAGE_INSTRUCTION", 21, 43), 
    w("DELIVERED_SILENT_NOTIFICATION", 22, 45), 
    x("FETCHED_THREADS_BY_ID", 23, 42), 
    y("FETCHED_LATEST_THREADS", 24, 20), 
    z("FETCHED_UPDATED_THREADS", 25, 21);
    
    public final int S;
    
    private agua(final String s, final int n, final int s2) {
        this.S = s2;
    }
    
    public static agua a(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 48: {
                return agua.R;
            }
            case 47: {
                return agua.O;
            }
            case 46: {
                return agua.N;
            }
            case 45: {
                return agua.w;
            }
            case 44: {
                return agua.L;
            }
            case 43: {
                return agua.v;
            }
            case 42: {
                return agua.x;
            }
            case 41: {
                return agua.o;
            }
            case 40: {
                return agua.Q;
            }
            case 39: {
                return agua.P;
            }
            case 38: {
                return agua.A;
            }
            case 37: {
                return agua.n;
            }
            case 36: {
                return agua.i;
            }
            case 35: {
                return agua.f;
            }
            case 34: {
                return agua.h;
            }
            case 33: {
                return agua.q;
            }
            case 32: {
                return agua.M;
            }
            case 31: {
                return agua.K;
            }
            case 30: {
                return agua.e;
            }
            case 29: {
                return agua.l;
            }
            case 28: {
                return agua.k;
            }
            case 27: {
                return agua.J;
            }
            case 26: {
                return agua.I;
            }
            case 25: {
                return agua.H;
            }
            case 24: {
                return agua.G;
            }
            case 23: {
                return agua.u;
            }
            case 22: {
                return agua.E;
            }
            case 21: {
                return agua.z;
            }
            case 20: {
                return agua.y;
            }
            case 19: {
                return agua.p;
            }
            case 18: {
                return agua.F;
            }
            case 17: {
                return agua.D;
            }
            case 16: {
                return agua.C;
            }
            case 15: {
                return agua.B;
            }
            case 13: {
                return agua.t;
            }
            case 12: {
                return agua.s;
            }
            case 11: {
                return agua.r;
            }
            case 10: {
                return agua.m;
            }
            case 9: {
                return agua.j;
            }
            case 6: {
                return agua.g;
            }
            case 5: {
                return agua.d;
            }
            case 2: {
                return agua.c;
            }
            case 1: {
                return agua.b;
            }
            case 0: {
                return agua.a;
            }
        }
    }
    
    public static agzo b() {
        return agte.n;
    }
    
    public final int getNumber() {
        return this.S;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.S);
    }
}
