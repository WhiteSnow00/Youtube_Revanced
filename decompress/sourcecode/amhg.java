// 
// Decompiled by Procyon v0.6.0
// 

public enum amhg implements agzm
{
    a("MOBILE_CONNECTION_TYPE_UNKNOWN", 0, 0), 
    b("MOBILE_CONNECTION_TYPE_OTHER", 1, 1), 
    c("MOBILE_CONNECTION_TYPE_OFFLINE", 2, 2), 
    d("MOBILE_CONNECTION_TYPE_WIFI", 3, 3), 
    e("MOBILE_CONNECTION_TYPE_CELLULAR_2G", 4, 4), 
    f("MOBILE_CONNECTION_TYPE_CELLULAR_3G", 5, 5), 
    g("MOBILE_CONNECTION_TYPE_CELLULAR_4G", 6, 6), 
    h("MOBILE_CONNECTION_TYPE_CELLULAR_UNKNOWN", 7, 7), 
    i("MOBILE_CONNECTION_TYPE_DISCO", 8, 8), 
    j("MOBILE_CONNECTION_TYPE_CELLULAR_5G", 9, 9), 
    k("MOBILE_CONNECTION_TYPE_WIFI_METERED", 10, 10), 
    l("MOBILE_CONNECTION_TYPE_CELLULAR_5G_SA", 11, 11), 
    m("MOBILE_CONNECTION_TYPE_CELLULAR_5G_NSA", 12, 12);
    
    public final int n;
    
    private amhg(final String s, final int n, final int n2) {
        this.n = n2;
    }
    
    public static agzo a() {
        return amcq.p;
    }
    
    public static amhg b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 12: {
                return amhg.m;
            }
            case 11: {
                return amhg.l;
            }
            case 10: {
                return amhg.k;
            }
            case 9: {
                return amhg.j;
            }
            case 8: {
                return amhg.i;
            }
            case 7: {
                return amhg.h;
            }
            case 6: {
                return amhg.g;
            }
            case 5: {
                return amhg.f;
            }
            case 4: {
                return amhg.e;
            }
            case 3: {
                return amhg.d;
            }
            case 2: {
                return amhg.c;
            }
            case 1: {
                return amhg.b;
            }
            case 0: {
                return amhg.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.n;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.n);
    }
}
