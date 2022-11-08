// 
// Decompiled by Procyon v0.6.0
// 

public enum ahea implements agzm
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
    ao("UNRECOGNIZED", 66, -1), 
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
    
    private ahea(final String s, final int n, final int aq) {
        this.aq = aq;
    }
    
    public static ahea a(final int n) {
        if (n == 70) {
            return ahea.G;
        }
        if (n == 71) {
            return ahea.H;
        }
        if (n == 80) {
            return ahea.I;
        }
        if (n == 81) {
            return ahea.J;
        }
        if (n == 110) {
            return ahea.U;
        }
        if (n == 111) {
            return ahea.V;
        }
        if (n == 120) {
            return ahea.W;
        }
        if (n == 121) {
            return ahea.X;
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
                                                        return ahea.T;
                                                    }
                                                    case 107: {
                                                        return ahea.S;
                                                    }
                                                    case 106: {
                                                        return ahea.R;
                                                    }
                                                    case 105: {
                                                        return ahea.Q;
                                                    }
                                                    case 104: {
                                                        return ahea.P;
                                                    }
                                                    case 103: {
                                                        return ahea.O;
                                                    }
                                                    case 102: {
                                                        return ahea.N;
                                                    }
                                                    case 101: {
                                                        return ahea.M;
                                                    }
                                                    case 100: {
                                                        return ahea.L;
                                                    }
                                                }
                                                break;
                                            }
                                            case 147: {
                                                return ahea.an;
                                            }
                                            case 146: {
                                                return ahea.am;
                                            }
                                            case 145: {
                                                return ahea.al;
                                            }
                                            case 144: {
                                                return ahea.ak;
                                            }
                                            case 143: {
                                                return ahea.aj;
                                            }
                                            case 142: {
                                                return ahea.ai;
                                            }
                                            case 141: {
                                                return ahea.ah;
                                            }
                                            case 140: {
                                                return ahea.ag;
                                            }
                                            case 137: {
                                                return ahea.af;
                                            }
                                            case 136: {
                                                return ahea.ae;
                                            }
                                            case 135: {
                                                return ahea.ad;
                                            }
                                            case 134: {
                                                return ahea.ac;
                                            }
                                            case 133: {
                                                return ahea.ab;
                                            }
                                            case 132: {
                                                return ahea.aa;
                                            }
                                            case 131: {
                                                return ahea.Z;
                                            }
                                            case 130: {
                                                return ahea.Y;
                                            }
                                            case 90: {
                                                return ahea.K;
                                            }
                                            case 61: {
                                                return ahea.F;
                                            }
                                            case 60: {
                                                return ahea.E;
                                            }
                                            case 59: {
                                                return ahea.D;
                                            }
                                            case 58: {
                                                return ahea.C;
                                            }
                                            case 57: {
                                                return ahea.B;
                                            }
                                            case 56: {
                                                return ahea.A;
                                            }
                                            case 55: {
                                                return ahea.z;
                                            }
                                            case 54: {
                                                return ahea.y;
                                            }
                                            case 53: {
                                                return ahea.x;
                                            }
                                            case 52: {
                                                return ahea.w;
                                            }
                                            case 51: {
                                                return ahea.v;
                                            }
                                            case 50: {
                                                return ahea.u;
                                            }
                                        }
                                        break;
                                    }
                                    case 44: {
                                        return ahea.t;
                                    }
                                    case 43: {
                                        return ahea.s;
                                    }
                                    case 42: {
                                        return ahea.r;
                                    }
                                    case 41: {
                                        return ahea.q;
                                    }
                                    case 40: {
                                        return ahea.p;
                                    }
                                }
                                break;
                            }
                            case 32: {
                                return ahea.o;
                            }
                            case 31: {
                                return ahea.n;
                            }
                            case 30: {
                                return ahea.m;
                            }
                        }
                        break;
                    }
                    case 23: {
                        return ahea.l;
                    }
                    case 22: {
                        return ahea.k;
                    }
                    case 21: {
                        return ahea.j;
                    }
                    case 20: {
                        return ahea.i;
                    }
                }
                break;
            }
            case 7: {
                return ahea.h;
            }
            case 6: {
                return ahea.g;
            }
            case 5: {
                return ahea.f;
            }
            case 4: {
                return ahea.e;
            }
            case 3: {
                return ahea.d;
            }
            case 2: {
                return ahea.c;
            }
            case 1: {
                return ahea.b;
            }
            case 0: {
                return ahea.a;
            }
        }
    }
    
    public final int getNumber() {
        if (this != ahea.ao) {
            return this.aq;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
