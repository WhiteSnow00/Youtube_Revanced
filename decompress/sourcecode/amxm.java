// 
// Decompiled by Procyon v0.6.0
// 

public enum amxm implements agzm
{
    a("INVALID", 0, 0), 
    b("ADDRESS_BOOK", 1, 1), 
    c("NOTIFICATIONS", 2, 2), 
    d("SEND_SMS", 3, 3), 
    e("FINE_LOCATION", 4, 4), 
    f("GET_ACCOUNTS", 5, 5), 
    g("IOS_FINE_LOCATION_WHEN_IN_USE", 6, 6), 
    h("IOS_FINE_LOCATION_ALWAYS_ON", 7, 7), 
    i("WRITE_EXTERNAL_STORAGE", 8, 8), 
    j("READ_MEDIA_AUDIO", 9, 9), 
    k("ANDROID_CAMERA", 10, 10), 
    l("IOS_CAMERA", 11, 11);
    
    public final int m;
    
    private amxm(final String s, final int n, final int m) {
        this.m = m;
    }
    
    public static agzo a() {
        return amtt.n;
    }
    
    public static amxm b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 11: {
                return amxm.l;
            }
            case 10: {
                return amxm.k;
            }
            case 9: {
                return amxm.j;
            }
            case 8: {
                return amxm.i;
            }
            case 7: {
                return amxm.h;
            }
            case 6: {
                return amxm.g;
            }
            case 5: {
                return amxm.f;
            }
            case 4: {
                return amxm.e;
            }
            case 3: {
                return amxm.d;
            }
            case 2: {
                return amxm.c;
            }
            case 1: {
                return amxm.b;
            }
            case 0: {
                return amxm.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.m;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.m);
    }
}
