// 
// Decompiled by Procyon v0.6.0
// 

public enum atxv implements ahbl
{
    a("NONE", 0, -1), 
    b("MOBILE", 1, 0), 
    c("WIFI", 2, 1), 
    d("MOBILE_MMS", 3, 2), 
    e("MOBILE_SUPL", 4, 3), 
    f("MOBILE_DUN", 5, 4), 
    g("MOBILE_HIPRI", 6, 5), 
    h("WIMAX", 7, 6), 
    i("BLUETOOTH", 8, 7), 
    j("DUMMY", 9, 8), 
    k("ETHERNET", 10, 9), 
    l("MOBILE_FOTA", 11, 10), 
    m("MOBILE_IMS", 12, 11), 
    n("MOBILE_CBS", 13, 12), 
    o("WIFI_P2P", 14, 13), 
    p("MOBILE_IA", 15, 14), 
    q("MOBILE_EMERGENCY", 16, 15), 
    r("PROXY", 17, 16), 
    s("VPN", 18, 17);
    
    private static final atxv[] u;
    public final int t;
    
    private atxv(final String s, final int n, final int t) {
        this.t = t;
    }
    
    public static ahbn a() {
        return areg.i;
    }
    
    public static atxv b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 17: {
                return atxv.s;
            }
            case 16: {
                return atxv.r;
            }
            case 15: {
                return atxv.q;
            }
            case 14: {
                return atxv.p;
            }
            case 13: {
                return atxv.o;
            }
            case 12: {
                return atxv.n;
            }
            case 11: {
                return atxv.m;
            }
            case 10: {
                return atxv.l;
            }
            case 9: {
                return atxv.k;
            }
            case 8: {
                return atxv.j;
            }
            case 7: {
                return atxv.i;
            }
            case 6: {
                return atxv.h;
            }
            case 5: {
                return atxv.g;
            }
            case 4: {
                return atxv.f;
            }
            case 3: {
                return atxv.e;
            }
            case 2: {
                return atxv.d;
            }
            case 1: {
                return atxv.c;
            }
            case 0: {
                return atxv.b;
            }
            case -1: {
                return atxv.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.t;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.t);
    }
}
