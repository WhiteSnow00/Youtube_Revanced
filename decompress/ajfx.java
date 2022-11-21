// 
// Decompiled by Procyon v0.6.0
// 

public enum ajfx implements ahdd
{
    A("DETAILED_NETWORK_TYPE_NR_NSA", 26, 126);
    
    private static final ajfx[] C;
    
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
    
    private ajfx(final String s, final int n, final int b) {
        this.B = b;
    }
    
    public static ahdf a() {
        return ajgj.b;
    }
    
    public static ajfx b(final int n) {
        if (n == 0) {
            return ajfx.a;
        }
        switch (n) {
            default: {
                return null;
            }
            case 126: {
                return ajfx.A;
            }
            case 125: {
                return ajfx.z;
            }
            case 124: {
                return ajfx.y;
            }
            case 123: {
                return ajfx.x;
            }
            case 122: {
                return ajfx.w;
            }
            case 121: {
                return ajfx.v;
            }
            case 120: {
                return ajfx.u;
            }
            case 119: {
                return ajfx.t;
            }
            case 118: {
                return ajfx.s;
            }
            case 117: {
                return ajfx.r;
            }
            case 116: {
                return ajfx.q;
            }
            case 115: {
                return ajfx.p;
            }
            case 114: {
                return ajfx.o;
            }
            case 113: {
                return ajfx.n;
            }
            case 112: {
                return ajfx.m;
            }
            case 111: {
                return ajfx.l;
            }
            case 110: {
                return ajfx.k;
            }
            case 109: {
                return ajfx.j;
            }
            case 108: {
                return ajfx.i;
            }
            case 107: {
                return ajfx.h;
            }
            case 106: {
                return ajfx.g;
            }
            case 105: {
                return ajfx.f;
            }
            case 104: {
                return ajfx.e;
            }
            case 103: {
                return ajfx.d;
            }
            case 102: {
                return ajfx.c;
            }
            case 101: {
                return ajfx.b;
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
