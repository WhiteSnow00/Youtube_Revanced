// 
// Decompiled by Procyon v0.6.0
// 

public enum atwy implements agzm
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
    
    public final int t;
    
    private atwy(final String s, final int n, final int t) {
        this.t = t;
    }
    
    public static agzo a() {
        return arbt.h;
    }
    
    public static atwy b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 17: {
                return atwy.s;
            }
            case 16: {
                return atwy.r;
            }
            case 15: {
                return atwy.q;
            }
            case 14: {
                return atwy.p;
            }
            case 13: {
                return atwy.o;
            }
            case 12: {
                return atwy.n;
            }
            case 11: {
                return atwy.m;
            }
            case 10: {
                return atwy.l;
            }
            case 9: {
                return atwy.k;
            }
            case 8: {
                return atwy.j;
            }
            case 7: {
                return atwy.i;
            }
            case 6: {
                return atwy.h;
            }
            case 5: {
                return atwy.g;
            }
            case 4: {
                return atwy.f;
            }
            case 3: {
                return atwy.e;
            }
            case 2: {
                return atwy.d;
            }
            case 1: {
                return atwy.c;
            }
            case 0: {
                return atwy.b;
            }
            case -1: {
                return atwy.a;
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
