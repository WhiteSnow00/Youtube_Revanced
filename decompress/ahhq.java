// 
// Decompiled by Procyon v0.6.0
// 

public enum ahhq implements ahdd
{
    A("EVENT_APP_AUTH_ACCESS_DENIED", 26, 56), 
    B("EVENT_APP_AUTH_UNSUPPORTED_RESPONSE_TYPE", 27, 57), 
    C("EVENT_APP_AUTH_INVALID_SCOPE", 28, 58), 
    D("EVENT_APP_AUTH_SERVER_ERROR", 29, 59), 
    E("EVENT_ADD_PHONE_ADD", 30, 60), 
    F("EVENT_ADD_PHONE_CANCEL", 31, 61), 
    G("EVENT_VERIFY_PHONE_VERIFY", 32, 70), 
    H("EVENT_VERIFY_PHONE_CANCEL", 33, 71), 
    I("EVENT_VERIFY_PHONE_FAIL_TRY_AGAIN", 34, 80), 
    J("EVENT_VERIFY_PHONE_FAIL_CLOSE", 35, 81), 
    K("EVENT_ERROR_OK", 36, 90), 
    L("EVENT_APP_FLIP_3P_APP_INSTALLED", 37, 100), 
    M("EVENT_APP_FLIP_3P_APP_NOT_INSTALLED", 38, 101), 
    N("EVENT_APP_FLIP_3P_APP_SUPPORTED", 39, 102), 
    O("EVENT_APP_FLIP_3P_APP_NOT_SUPPORTED", 40, 103), 
    P("EVENT_APP_FLIP_FLOW_SUCCESS", 41, 104), 
    Q("EVENT_APP_FLIP_FLOW_CANCELED", 42, 105), 
    R("EVENT_APP_FLIP_3P_ERROR_RECOVERABLE", 43, 106), 
    S("EVENT_APP_FLIP_3P_ERROR_UNRECOVERABLE", 44, 107), 
    T("EVENT_APP_FLIP_3P_CONSENT_REJECTED", 45, 108), 
    U("EVENT_LINKING_INFO_CONTINUE_LINKING", 46, 110), 
    V("EVENT_LINKING_INFO_CANCEL_LINKING", 47, 111), 
    W("EVENT_USAGE_NOTICE_ACCEPT_NOTICE", 48, 120), 
    X("EVENT_USAGE_NOTICE_CANCEL_LINKING", 49, 121), 
    Y("EVENT_APP_AUTH_TEMPORARILY_UNAVAILABLE", 50, 130), 
    Z("EVENT_APP_AUTH_NO_REDIRECT_STATE", 51, 131), 
    a("EVENT_UNKNOWN", 0, 0), 
    aa("EVENT_APP_AUTH_OTHER", 52, 132), 
    ab("EVENT_APP_AUTH_NULL_RESPONSE_URI", 53, 133), 
    ac("EVENT_APP_AUTH_SUCCESS", 54, 134), 
    ad("EVENT_APP_AUTH_RECEIVE_ACTIVITY_RESULT", 55, 135), 
    ae("EVENT_APP_AUTH_RECEIVE_NEW_INTENT", 56, 136), 
    af("EVENT_APP_AUTH_FRAGMENT_HANDLE_INTENT", 57, 137), 
    ag("EVENT_APP_FLIP_INVALID_REQUEST", 58, 140), 
    ah("EVENT_APP_FLIP_UNAUTHORIZED_CLIENT", 59, 141), 
    ai("EVENT_APP_FLIP_UNSUPPORTED_RESPONSE_TYPE", 60, 142), 
    aj("EVENT_APP_FLIP_INVALID_SCOPE", 61, 143), 
    ak("EVENT_APP_FLIP_SERVER_ERROR", 62, 144), 
    al("EVENT_APP_FLIP_TEMPORARILY_UNAVAILABLE", 63, 145), 
    am("EVENT_APP_FLIP_NO_REDIRECT_STATE", 64, 146), 
    an("EVENT_APP_FLIP_NULL_RESPONSE_URI", 65, 147), 
    ao("UNRECOGNIZED", 66, -1);
    
    private static final ahhq[] ap;
    
    b("EVENT_TRANSITION", 1, 1), 
    c("EVENT_NETWORK_ERROR", 2, 2), 
    d("EVENT_HTTP_CLIENT_ERROR", 3, 3), 
    e("EVENT_HTTP_SERVER_ERROR", 4, 4), 
    f("EVENT_MALFORMED_RESPONSE", 5, 5), 
    g("EVENT_FORM_VALIDATION_ERROR", 6, 6), 
    h("EVENT_SYSTEM_ACTION_USER_CANCEL", 7, 7), 
    i("EVENT_ACCOUNT_SELECTION_SELECT_ACCOUNT", 8, 20), 
    j("EVENT_ACCOUNT_SELECTION_USE_ANOTHER_ACCOUNT", 9, 21), 
    k("EVENT_ACCOUNT_SELECTION_CANCEL", 10, 22), 
    l("EVENT_ACCOUNT_SELECTION_CREATE_ACCOUNT", 11, 23), 
    m("EVENT_PROVIDER_CONSENT_LINK", 12, 30), 
    n("EVENT_PROVIDER_CONSENT_CANCEL", 13, 31), 
    o("EVENT_PROVIDER_CONSENT_LEARN_MORE", 14, 32), 
    p("EVENT_ACCOUNT_CREATION_CREATE_ACCOUNT", 15, 40), 
    q("EVENT_ACCOUNT_CREATION_CANCEL", 16, 41), 
    r("EVENT_ACCOUNT_CREATION_CHANGE_PHONE", 17, 42), 
    s("EVENT_ACCOUNT_CREATION_ADD_PHONE", 18, 43), 
    t("EVENT_ACCOUNT_CREATION_LEARN_MORE", 19, 44), 
    u("EVENT_APP_AUTH_DISMISS", 20, 50), 
    v("EVENT_APP_AUTH_NO_CUSTOM_TABS_SUPPORTED_BROWSER", 21, 51), 
    w("EVENT_APP_AUTH_BROWSER_WARM_UP_FAILED", 22, 52), 
    x("EVENT_APP_AUTH_NO_BROWSER_FOUND", 23, 53), 
    y("EVENT_APP_AUTH_INVALID_REQUEST", 24, 54), 
    z("EVENT_APP_AUTH_UNAUTHORIZED_CLIENT", 25, 55);
    
    private final int aq;
    
    private ahhq(final String s, final int n, final int aq) {
        this.aq = aq;
    }
    
    public static ahhq a(final int n) {
        if (n == 70) {
            return ahhq.G;
        }
        if (n == 71) {
            return ahhq.H;
        }
        if (n == 80) {
            return ahhq.I;
        }
        if (n == 81) {
            return ahhq.J;
        }
        if (n == 110) {
            return ahhq.U;
        }
        if (n == 111) {
            return ahhq.V;
        }
        if (n == 120) {
            return ahhq.W;
        }
        if (n == 121) {
            return ahhq.X;
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
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
                                                    case 108: {
                                                        return ahhq.T;
                                                    }
                                                    case 107: {
                                                        return ahhq.S;
                                                    }
                                                    case 106: {
                                                        return ahhq.R;
                                                    }
                                                    case 105: {
                                                        return ahhq.Q;
                                                    }
                                                    case 104: {
                                                        return ahhq.P;
                                                    }
                                                    case 103: {
                                                        return ahhq.O;
                                                    }
                                                    case 102: {
                                                        return ahhq.N;
                                                    }
                                                    case 101: {
                                                        return ahhq.M;
                                                    }
                                                    case 100: {
                                                        return ahhq.L;
                                                    }
                                                }
                                                break;
                                            }
                                            case 147: {
                                                return ahhq.an;
                                            }
                                            case 146: {
                                                return ahhq.am;
                                            }
                                            case 145: {
                                                return ahhq.al;
                                            }
                                            case 144: {
                                                return ahhq.ak;
                                            }
                                            case 143: {
                                                return ahhq.aj;
                                            }
                                            case 142: {
                                                return ahhq.ai;
                                            }
                                            case 141: {
                                                return ahhq.ah;
                                            }
                                            case 140: {
                                                return ahhq.ag;
                                            }
                                            case 137: {
                                                return ahhq.af;
                                            }
                                            case 136: {
                                                return ahhq.ae;
                                            }
                                            case 135: {
                                                return ahhq.ad;
                                            }
                                            case 134: {
                                                return ahhq.ac;
                                            }
                                            case 133: {
                                                return ahhq.ab;
                                            }
                                            case 132: {
                                                return ahhq.aa;
                                            }
                                            case 131: {
                                                return ahhq.Z;
                                            }
                                            case 130: {
                                                return ahhq.Y;
                                            }
                                            case 90: {
                                                return ahhq.K;
                                            }
                                            case 61: {
                                                return ahhq.F;
                                            }
                                            case 60: {
                                                return ahhq.E;
                                            }
                                            case 59: {
                                                return ahhq.D;
                                            }
                                            case 58: {
                                                return ahhq.C;
                                            }
                                            case 57: {
                                                return ahhq.B;
                                            }
                                            case 56: {
                                                return ahhq.A;
                                            }
                                            case 55: {
                                                return ahhq.z;
                                            }
                                            case 54: {
                                                return ahhq.y;
                                            }
                                            case 53: {
                                                return ahhq.x;
                                            }
                                            case 52: {
                                                return ahhq.w;
                                            }
                                            case 51: {
                                                return ahhq.v;
                                            }
                                            case 50: {
                                                return ahhq.u;
                                            }
                                        }
                                        break;
                                    }
                                    case 44: {
                                        return ahhq.t;
                                    }
                                    case 43: {
                                        return ahhq.s;
                                    }
                                    case 42: {
                                        return ahhq.r;
                                    }
                                    case 41: {
                                        return ahhq.q;
                                    }
                                    case 40: {
                                        return ahhq.p;
                                    }
                                }
                                break;
                            }
                            case 32: {
                                return ahhq.o;
                            }
                            case 31: {
                                return ahhq.n;
                            }
                            case 30: {
                                return ahhq.m;
                            }
                        }
                        break;
                    }
                    case 23: {
                        return ahhq.l;
                    }
                    case 22: {
                        return ahhq.k;
                    }
                    case 21: {
                        return ahhq.j;
                    }
                    case 20: {
                        return ahhq.i;
                    }
                }
                break;
            }
            case 7: {
                return ahhq.h;
            }
            case 6: {
                return ahhq.g;
            }
            case 5: {
                return ahhq.f;
            }
            case 4: {
                return ahhq.e;
            }
            case 3: {
                return ahhq.d;
            }
            case 2: {
                return ahhq.c;
            }
            case 1: {
                return ahhq.b;
            }
            case 0: {
                return ahhq.a;
            }
        }
    }
    
    public final int getNumber() {
        if (this != ahhq.ao) {
            return this.aq;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
