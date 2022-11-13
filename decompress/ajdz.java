// 
// Decompiled by Procyon v0.6.0
// 

public enum ajdz implements ahbl
{
    A("DETAILED_NETWORK_TYPE_NR_NSA", 26, 126);
    
    private static final ajdz[] C;
    
    a("DETAILED_NETWORK_TYPE_UNKNOWN", 0, 0), 
    b("DETAILED_NETWORK_TYPE_EDGE", 1, 101), 
    c("DETAILED_NETWORK_TYPE_GPRS", 2, 102), 
    d("DETAILED_NETWORK_TYPE_1_X_RTT", 3, 103), 
    e("DETAILED_NETWORK_TYPE_CDMA", 4, 104), 
    f("DETAILED_NETWORK_TYPE_EVDO_0", 5, 105), 
    g("DETAILED_NETWORK_TYPE_EVDO_A", 6, 106), 
    h("DETAILED_NETWORK_TYPE_HSDPA", 7, 107), 
    i("DETAILED_NETWORK_TYPE_HSPA", 8, 108), 
    j("DETAILED_NETWORK_TYPE_HSUPA", 9, 109), 
    k("DETAILED_NETWORK_TYPE_IDEN", 10, 110), 
    l("DETAILED_NETWORK_TYPE_UMTS", 11, 111), 
    m("DETAILED_NETWORK_TYPE_EVDO_B", 12, 112), 
    n("DETAILED_NETWORK_TYPE_EHRPD", 13, 113), 
    o("DETAILED_NETWORK_TYPE_HSPAP", 14, 114), 
    p("DETAILED_NETWORK_TYPE_LTE", 15, 115), 
    q("DETAILED_NETWORK_TYPE_WIFI", 16, 116), 
    r("DETAILED_NETWORK_TYPE_BLUETOOTH", 17, 117), 
    s("DETAILED_NETWORK_TYPE_ETHERNET", 18, 118), 
    t("DETAILED_NETWORK_TYPE_WIMAX", 19, 119), 
    u("DETAILED_NETWORK_TYPE_MOBILE_UNKNOWN", 20, 120), 
    v("DETAILED_NETWORK_TYPE_NON_MOBILE_UNKNOWN", 21, 121), 
    w("DETAILED_NETWORK_TYPE_DISCONNECTED", 22, 122), 
    x("DETAILED_NETWORK_TYPE_APP_WIFI_HOTSPOT", 23, 123), 
    y("DETAILED_NETWORK_TYPE_INTERNAL_WIFI_IMPAIRED", 24, 124), 
    z("DETAILED_NETWORK_TYPE_NR_SA", 25, 125);
    
    public final int B;
    
    private ajdz(final String s, final int n, final int b) {
        this.B = b;
    }
    
    public static ahbn a() {
        return ajek.b;
    }
    
    public static ajdz b(final int n) {
        if (n == 0) {
            return ajdz.a;
        }
        switch (n) {
            default: {
                return null;
            }
            case 126: {
                return ajdz.A;
            }
            case 125: {
                return ajdz.z;
            }
            case 124: {
                return ajdz.y;
            }
            case 123: {
                return ajdz.x;
            }
            case 122: {
                return ajdz.w;
            }
            case 121: {
                return ajdz.v;
            }
            case 120: {
                return ajdz.u;
            }
            case 119: {
                return ajdz.t;
            }
            case 118: {
                return ajdz.s;
            }
            case 117: {
                return ajdz.r;
            }
            case 116: {
                return ajdz.q;
            }
            case 115: {
                return ajdz.p;
            }
            case 114: {
                return ajdz.o;
            }
            case 113: {
                return ajdz.n;
            }
            case 112: {
                return ajdz.m;
            }
            case 111: {
                return ajdz.l;
            }
            case 110: {
                return ajdz.k;
            }
            case 109: {
                return ajdz.j;
            }
            case 108: {
                return ajdz.i;
            }
            case 107: {
                return ajdz.h;
            }
            case 106: {
                return ajdz.g;
            }
            case 105: {
                return ajdz.f;
            }
            case 104: {
                return ajdz.e;
            }
            case 103: {
                return ajdz.d;
            }
            case 102: {
                return ajdz.c;
            }
            case 101: {
                return ajdz.b;
            }
        }
    }
    
    public final int getNumber() {
        return this.B;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.B);
    }
}
