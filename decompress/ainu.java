// 
// Decompiled by Procyon v0.6.0
// 

public enum ainu implements ahdd
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
    
    private static final ainu[] p;
    public final int o;
    
    private ainu(final String s, final int n, final int o) {
        this.o = o;
    }
    
    public static ahdf a() {
        return aine.f;
    }
    
    public static ainu b(final int n) {
        if (n == 31) {
            return ainu.n;
        }
        switch (n) {
            default: {
                return null;
            }
            case 12: {
                return ainu.m;
            }
            case 11: {
                return ainu.l;
            }
            case 10: {
                return ainu.k;
            }
            case 9: {
                return ainu.j;
            }
            case 8: {
                return ainu.i;
            }
            case 7: {
                return ainu.h;
            }
            case 6: {
                return ainu.g;
            }
            case 5: {
                return ainu.f;
            }
            case 4: {
                return ainu.e;
            }
            case 3: {
                return ainu.d;
            }
            case 2: {
                return ainu.c;
            }
            case 1: {
                return ainu.b;
            }
            case 0: {
                return ainu.a;
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
