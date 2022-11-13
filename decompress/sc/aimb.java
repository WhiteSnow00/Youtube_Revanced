// 
// Decompiled by Procyon v0.6.0
// 

public enum aimb implements ahbl
{
    a("CONN_DEFAULT", 0, 0), 
    b("CONN_UNKNOWN", 1, 1), 
    c("CONN_NONE", 2, 2), 
    d("CONN_WIFI", 3, 3), 
    e("CONN_CELLULAR_2G", 4, 4), 
    f("CONN_CELLULAR_3G", 5, 5), 
    g("CONN_CELLULAR_4G", 6, 6), 
    h("CONN_CELLULAR_UNKNOWN", 7, 7), 
    i("CONN_DISCO", 8, 8), 
    j("CONN_CELLULAR_5G", 9, 9), 
    k("CONN_WIFI_METERED", 10, 10), 
    l("CONN_CELLULAR_5G_SA", 11, 11), 
    m("CONN_CELLULAR_5G_NSA", 12, 12), 
    n("CONN_INVALID", 13, 31);
    
    private static final aimb[] p;
    public final int o;
    
    private aimb(final String s, final int n, final int o) {
        this.o = o;
    }
    
    public static ahbn a() {
        return aill.f;
    }
    
    public static aimb b(final int n) {
        if (n == 31) {
            return aimb.n;
        }
        switch (n) {
            default: {
                return null;
            }
            case 12: {
                return aimb.m;
            }
            case 11: {
                return aimb.l;
            }
            case 10: {
                return aimb.k;
            }
            case 9: {
                return aimb.j;
            }
            case 8: {
                return aimb.i;
            }
            case 7: {
                return aimb.h;
            }
            case 6: {
                return aimb.g;
            }
            case 5: {
                return aimb.f;
            }
            case 4: {
                return aimb.e;
            }
            case 3: {
                return aimb.d;
            }
            case 2: {
                return aimb.c;
            }
            case 1: {
                return aimb.b;
            }
            case 0: {
                return aimb.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.o;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.o);
    }
}
