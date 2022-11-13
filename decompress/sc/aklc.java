// 
// Decompiled by Procyon v0.6.0
// 

public enum aklc implements ahbl
{
    A("ANDROID_KIDS", 26, 18), 
    B("ANDROID_MUSIC", 27, 21), 
    C("ANDROID_TESTSUITE", 28, 30), 
    D("ANDROID_UNPLUGGED", 29, 29), 
    E("ANDROID_VR", 30, 28), 
    @Deprecated
    F("ANDROID_WITNESS", 31, 34), 
    @Deprecated
    G("ANDROID_SPORTS", 32, 36), 
    H("ANDROID_LITE", 33, 38), 
    I("IOS", 34, 5), 
    J("IOS_CREATOR", 35, 15), 
    K("IOS_PRODUCER", 36, 92), 
    @Deprecated
    L("IOS_DIRECTOR", 37, 40), 
    @Deprecated
    M("IOS_GAMING", 38, 25), 
    @Deprecated
    N("IOS_INSTANT", 39, 17), 
    O("IOS_KIDS", 40, 19), 
    P("IOS_LIVE_CREATION_EXTENSION", 41, 64), 
    Q("IOS_MESSAGES_EXTENSION", 42, 66), 
    R("IOS_MUSIC", 43, 26), 
    @Deprecated
    S("IOS_TABLOID", 44, 22), 
    T("IOS_UNPLUGGED", 45, 33), 
    U("IOS_UPTIME", 46, 68), 
    @Deprecated
    V("IOS_WITNESS", 47, 35), 
    W("IOS_PILOT_STUDIO", 48, 53), 
    @Deprecated
    X("IOS_SPORTS", 49, 37), 
    Y("IOS_EMBEDDED_PLAYER", 50, 39), 
    Z("TVHTML5", 51, 7), 
    a("UNKNOWN_INTERFACE", 0, 0), 
    aA("MEDIA_CONNECT_FRONTEND", 78, 95);
    
    private static final aklc[] aC;
    
    aa("TVHTML5_AUDIO", 52, 57), 
    @Deprecated
    ab("TVHTML5_CAST", 53, 43), 
    ac("TVHTML5_KIDS", 54, 59), 
    ad("TVHTML5_FOR_KIDS", 55, 93), 
    ae("ANDROID_TV_KIDS", 56, 74), 
    af("TVHTML5_SIMPLY", 57, 75), 
    ag("TVHTML5_SIMPLY_EMBEDDED_PLAYER", 58, 85), 
    ah("TVHTML5_UNPLUGGED", 59, 65), 
    ai("TVHTML5_YONGLE", 60, 80), 
    aj("TVLITE", 61, 8), 
    @Deprecated
    ak("TVANDROID", 62, 10), 
    al("TV_UNPLUGGED_CAST", 63, 58), 
    am("TV_UNPLUGGED_ANDROID", 64, 63), 
    an("TVHTML5_VR", 65, 72), 
    ao("ANDROID_TV", 66, 23), 
    @Deprecated
    ap("XBOX", 67, 11), 
    @Deprecated
    aq("XBOXONEGUIDE", 68, 13), 
    ar("CLIENTX", 69, 12), 
    as("TVAPPLE", 70, 16), 
    at("WEB_EMBEDDED_PLAYER", 71, 56), 
    au("WEB_MUSIC_ANALYTICS", 72, 31), 
    av("MUSIC_INTEGRATIONS", 73, 77), 
    aw("GOOGLE_ASSISTANT", 74, 84), 
    ax("WEB_INTERNAL_ANALYTICS", 75, 87), 
    ay("GOOGLE_MEDIA_ACTIONS", 76, 89), 
    az("GOOGLE_LIST_RECS", 77, 94), 
    b("WEB", 1, 1), 
    c("WEB_GAMING", 2, 32), 
    d("WEB_MUSIC", 3, 61), 
    e("WEB_REMIX", 4, 67), 
    f("WEB_MUSIC_EMBEDDED_PLAYER", 5, 86), 
    g("WEB_EXPERIMENTS", 6, 42), 
    h("WEB_HEROES", 7, 60), 
    i("WEB_CREATOR", 8, 62), 
    @Deprecated
    j("WEB_LIVE_STREAMING", 9, 73), 
    k("WEB_KIDS", 10, 76), 
    l("WEB_PARENT_TOOLS", 11, 88), 
    m("WEB_PHONE_VERIFICATION", 12, 90), 
    n("WEB_UNPLUGGED", 13, 41), 
    o("WEB_UNPLUGGED_ONBOARDING", 14, 69), 
    p("WEB_UNPLUGGED_OPS", 15, 70), 
    q("WEB_UNPLUGGED_PUBLIC", 16, 71), 
    r("MWEB", 17, 2), 
    s("MWEB_TIER_2", 18, 27), 
    t("ANDROID", 19, 3), 
    u("ANDROID_CASUAL", 20, 54), 
    v("ANDROID_CREATOR", 21, 14), 
    w("ANDROID_PRODUCER", 22, 91), 
    x("ANDROID_EMBEDDED_PLAYER", 23, 55), 
    @Deprecated
    y("ANDROID_GAMING", 24, 24), 
    @Deprecated
    z("ANDROID_INSTANT", 25, 20);
    
    public final int aB;
    
    private aklc(final String s, final int n, final int ab) {
        this.aB = ab;
    }
    
    public static ahbn a() {
        return akjo.h;
    }
    
    public static aklc b(final int n) {
        if (n == 0) {
            return aklc.a;
        }
        if (n == 1) {
            return aklc.b;
        }
        if (n == 2) {
            return aklc.r;
        }
        if (n == 3) {
            return aklc.t;
        }
        if (n == 5) {
            return aklc.I;
        }
        if (n == 80) {
            return aklc.ai;
        }
        if (n == 7) {
            return aklc.Z;
        }
        if (n == 8) {
            return aklc.aj;
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                return null;
                            }
                            case 95: {
                                return aklc.aA;
                            }
                            case 94: {
                                return aklc.az;
                            }
                            case 93: {
                                return aklc.ad;
                            }
                            case 92: {
                                return aklc.K;
                            }
                            case 91: {
                                return aklc.w;
                            }
                            case 90: {
                                return aklc.m;
                            }
                            case 89: {
                                return aklc.ay;
                            }
                            case 88: {
                                return aklc.l;
                            }
                            case 87: {
                                return aklc.ax;
                            }
                            case 86: {
                                return aklc.f;
                            }
                            case 85: {
                                return aklc.ag;
                            }
                            case 84: {
                                return aklc.aw;
                            }
                        }
                        break;
                    }
                    case 77: {
                        return aklc.av;
                    }
                    case 76: {
                        return aklc.k;
                    }
                    case 75: {
                        return aklc.af;
                    }
                    case 74: {
                        return aklc.ae;
                    }
                    case 73: {
                        return aklc.j;
                    }
                    case 72: {
                        return aklc.an;
                    }
                    case 71: {
                        return aklc.q;
                    }
                    case 70: {
                        return aklc.p;
                    }
                    case 69: {
                        return aklc.o;
                    }
                    case 68: {
                        return aklc.U;
                    }
                    case 67: {
                        return aklc.e;
                    }
                    case 66: {
                        return aklc.Q;
                    }
                    case 65: {
                        return aklc.ah;
                    }
                    case 64: {
                        return aklc.P;
                    }
                    case 63: {
                        return aklc.am;
                    }
                    case 62: {
                        return aklc.i;
                    }
                    case 61: {
                        return aklc.d;
                    }
                    case 60: {
                        return aklc.h;
                    }
                    case 59: {
                        return aklc.ac;
                    }
                    case 58: {
                        return aklc.al;
                    }
                    case 57: {
                        return aklc.aa;
                    }
                    case 56: {
                        return aklc.at;
                    }
                    case 55: {
                        return aklc.x;
                    }
                    case 54: {
                        return aklc.u;
                    }
                    case 53: {
                        return aklc.W;
                    }
                }
                break;
            }
            case 43: {
                return aklc.ab;
            }
            case 42: {
                return aklc.g;
            }
            case 41: {
                return aklc.n;
            }
            case 40: {
                return aklc.L;
            }
            case 39: {
                return aklc.Y;
            }
            case 38: {
                return aklc.H;
            }
            case 37: {
                return aklc.X;
            }
            case 36: {
                return aklc.G;
            }
            case 35: {
                return aklc.V;
            }
            case 34: {
                return aklc.F;
            }
            case 33: {
                return aklc.T;
            }
            case 32: {
                return aklc.c;
            }
            case 31: {
                return aklc.au;
            }
            case 30: {
                return aklc.C;
            }
            case 29: {
                return aklc.D;
            }
            case 28: {
                return aklc.E;
            }
            case 27: {
                return aklc.s;
            }
            case 26: {
                return aklc.R;
            }
            case 25: {
                return aklc.M;
            }
            case 24: {
                return aklc.y;
            }
            case 23: {
                return aklc.ao;
            }
            case 22: {
                return aklc.S;
            }
            case 21: {
                return aklc.B;
            }
            case 20: {
                return aklc.z;
            }
            case 19: {
                return aklc.O;
            }
            case 18: {
                return aklc.A;
            }
            case 17: {
                return aklc.N;
            }
            case 16: {
                return aklc.as;
            }
            case 15: {
                return aklc.J;
            }
            case 14: {
                return aklc.v;
            }
            case 13: {
                return aklc.aq;
            }
            case 12: {
                return aklc.ar;
            }
            case 11: {
                return aklc.ap;
            }
            case 10: {
                return aklc.ak;
            }
        }
    }
    
    public final int getNumber() {
        return this.aB;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.aB);
    }
}
